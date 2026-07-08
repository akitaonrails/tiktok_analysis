package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.066Q, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.inline.StreakInlineMsgInsertHelper$tryInsertStreakInteractionInlineMsg$1", f = "StreakInlineMsgInsertHelper.kt", l = {}, m = "invokeSuspend")
public final class C066Q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C066Q(int i, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C066Q(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        long jLongValue;
        Map<String, String> map;
        C1C7U.LIZ("StreakInlineMsgInsertHelper@52a0.tryInsertStreakInteractionInlineMsg$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1564806As.LIZIZ.getClass();
        C1575806Ey c1575806Ey = C1575806Ey.LIZJ;
        String str2 = this.LL;
        c1575806Ey.getClass();
        StreakData streakDataLJIIIIZZ = C1575806Ey.LJIIIIZZ(str2);
        C06C6 c06c6 = C06C6.LIZIZ;
        String str3 = this.LL;
        c06c6.getClass();
        StreakPetData streakPetDataLIZIZ = C06C6.LIZIZ(str3);
        C0Y8T c0y8tLJIL = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL(this.LL);
        if (c0y8tLJIL == null) {
            boolean z = C1590906Kt.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("InlineMsgHelper: tryInsertStreakInteractionInlineMsg: conversation == null, triggerReason=");
            sbLIZ.append(this.LLILLJJLI);
            C1590906Kt.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("StreakInlineMsgInsertHelper@52a0.tryInsertStreakInteractionInlineMsg$1");
            return unit;
        }
        C1564306An.LIZ.getClass();
        if (!c0y8tLJIL.isGroupChat()) {
            if (streakPetDataLIZIZ != null && (map = streakPetDataLIZIZ.experimentMap) != null) {
                str = map.get("content_based_interaction");
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "1")) {
                String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
                if (curUserId == null) {
                    curUserId = "";
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("dm_repo_streak_");
                sbLIZ2.append(curUserId);
                Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ2));
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("streak_interaction_guide_show_");
                sbLIZ3.append(c0y8tLJIL.getConversationId());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                if (!C1567806Bw.LIZLLL(streakDataLJIIIIZZ)) {
                    repo.storeBoolean(strLIZIZ, true);
                } else if (!repo.getBoolean(strLIZIZ, false)) {
                    repo.storeBoolean(strLIZIZ, true);
                    String string = UUID.randomUUID().toString();
                    C1684506ih c1684506ih = new C1684506ih();
                    c1684506ih.LIZLLL(56);
                    Long lLJIILIIL = C2095008Iq.LJIILIIL(curUserId);
                    if (lLJIILIIL != null) {
                        jLongValue = lLJIILIIL.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    c1684506ih.LIZLLL = Long.valueOf(jLongValue);
                    c1684506ih.LIZJ = string;
                    FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpiForReal(FakeMsgOperatorService.class);
                    if (fakeMsgOperatorService != null) {
                        fakeMsgOperatorService.LIZIZ(c0y8tLJIL.getConversationId(), c1684506ih, null, null, null);
                    }
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StreakInlineMsgInsertHelper@52a0.tryInsertStreakInteractionInlineMsg$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
