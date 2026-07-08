package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.api.StreakInlineMsgInfo;
import com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS32S1101000_2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.06Ap, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.inline.StreakInlineMsgInsertHelper$tryInsertContinueInlineMsg$1", f = "StreakInlineMsgInsertHelper.kt", l = {}, m = "invokeSuspend")
public final class C1564506Ap extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StreakData LL;
    public final /* synthetic */ StreakData LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1564506Ap(StreakData streakData, StreakData streakData2, InterfaceC1364105Vn<? super C1564506Ap> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = streakData;
        this.LLILLJJLI = streakData2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1564506Ap(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakInlineMsgInsertHelper@52a0.tryInsertContinueInlineMsg$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StreakData streakData = this.LL;
        StreakData streakData2 = this.LLILLJJLI;
        if (streakData2 != null && streakData.streak == streakData2.streak + 1 && Intrinsics.LJFF(C1566206Bg.LIZIZ(streakData), C1566206Bg.LIZIZ(streakData2))) {
            EnumC1579606Gk enumC1579606GkLJIIIIZZ = C1567806Bw.LJIIIIZZ(this.LL, false);
            if (enumC1579606GkLJIIIIZZ != EnumC1579606Gk.ACTIVE) {
                boolean z = C1590906Kt.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("InlineMsgHelper: triggerContinue: invalid streak status, status=");
                sbLIZ.append(enumC1579606GkLJIIIIZZ);
                C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("StreakInlineMsgInsertHelper@52a0.tryInsertContinueInlineMsg$1");
                return unit;
            }
            String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
            if (curUserId == null) {
                curUserId = "";
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("dm_repo_streak_");
            sbLIZ2.append(curUserId);
            Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ2));
            int i = repo.getInt("dm_continue_inline_msg_times", 0);
            if (i >= C06FS.LIZ().continueMsgMaxShowTimes) {
                C1590906Kt.LIZ("InlineMsgHelper: triggerContinue: reach max show times");
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("StreakInlineMsgInsertHelper@52a0.tryInsertContinueInlineMsg$1");
                return unit2;
            }
            String str = this.LL.convId;
            if (C123100dR.LIZ(str) && str != null) {
                C0Y8T c0y8tLJIL = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL(str);
                if (c0y8tLJIL == null) {
                    C1590906Kt.LIZ("InlineMsgHelper: triggerContinue: conversation == null");
                    Unit unit3 = Unit.LIZ;
                    C1C7U.LIZIZ("StreakInlineMsgInsertHelper@52a0.tryInsertContinueInlineMsg$1");
                    return unit3;
                }
                C1564306An c1564306An = C1564306An.LIZ;
                StreakData streakData3 = this.LL;
                c1564306An.getClass();
                repo.storeInt("dm_continue_inline_msg_times", i + 1);
                C06FO.LIZ.getClass();
                StreakInlineMsgInfo streakInlineMsgInfo = new StreakInlineMsgInfo(2, C06FO.LIZ(streakData3) * ((long) LSPassThroughRecordSizeConfig.DEFAULT), c0y8tLJIL.getLastMessageOrderIndex());
                StreakLocalExtHelper streakLocalExtHelper = StreakLocalExtHelper.LIZ;
                String conversationId = c0y8tLJIL.getConversationId();
                streakLocalExtHelper.getClass();
                StreakLocalExtHelper.LIZ(new AwS32S1101000_2(conversationId, 2, streakInlineMsgInfo, 1));
                Unit unit4 = Unit.LIZ;
                C1C7U.LIZIZ("StreakInlineMsgInsertHelper@52a0.tryInsertContinueInlineMsg$1");
                return unit4;
            }
            C1590906Kt.LIZJ("Streak: conv id is invalid");
            Unit unit5 = Unit.LIZ;
            C1C7U.LIZIZ("StreakInlineMsgInsertHelper@52a0.tryInsertContinueInlineMsg$1");
            return unit5;
        }
        C1590906Kt.LIZ("InlineMsgHelper: triggerContinue: is not continue event");
        Unit unit6 = Unit.LIZ;
        C1C7U.LIZIZ("StreakInlineMsgInsertHelper@52a0.tryInsertContinueInlineMsg$1");
        return unit6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
