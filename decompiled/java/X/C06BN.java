package X;

import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS119S1200000_2;
import njp.a;

/* JADX INFO: renamed from: X.06BN, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.triggers.StreakUnlockAnimTrigger$onReceiveCmdMsg$3", f = "StreakUnlockAnimTrigger.kt", l = {}, m = "invokeSuspend")
public final class C06BN extends C09AX implements Function1<InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ StreakData LL;
    public final /* synthetic */ C06BD LLILLJJLI;
    public final /* synthetic */ EnumC1567006Bo LLILLL;
    public final /* synthetic */ C06BM LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ StreakData LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06BN(StreakData streakData, C06BD c06bd, EnumC1567006Bo enumC1567006Bo, C06BM c06bm, String str, StreakData streakData2, InterfaceC1364105Vn<? super C06BN> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = streakData;
        this.LLILLJJLI = c06bd;
        this.LLILLL = enumC1567006Bo;
        this.LLILZ = c06bm;
        this.LLILZIL = str;
        this.LLILZLL = streakData2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06BN(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC1579606Gk enumC1579606GkLJIIIIZZ;
        EnumC1579606Gk enumC1579606GkLJIIIIZZ2;
        C1C7U.LIZ("StreakUnlockAnimTrigger@8fc0.onReceiveCmdMsg$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LL.serverMsgId;
        if (str == null) {
            str = "default_uniqueId_value";
        }
        C06BT.FULL_ANIMATION.toString();
        C06BS.LIZJ(str, this.LLILLJJLI, this.LLILLL);
        C06BM c06bm = this.LLILZ;
        String str2 = this.LLILZIL;
        StreakData streakData = this.LLILZLL;
        StreakData streakData2 = this.LL;
        c06bm.getClass();
        boolean z = false;
        String str3 = null;
        if (!C06FS.LIZ().enableUnlockAnim) {
            if (streakData2 != null) {
                str3 = streakData2.serverMsgId;
            }
            C06BS.LIZ(str3, "enableUnlockAnim=false");
        } else {
            if (streakData != null) {
                enumC1579606GkLJIIIIZZ = C1567806Bw.LJIIIIZZ(streakData, true);
            } else {
                enumC1579606GkLJIIIIZZ = null;
            }
            if (streakData2 != null) {
                enumC1579606GkLJIIIIZZ2 = C1567806Bw.LJIIIIZZ(streakData2, true);
            } else {
                enumC1579606GkLJIIIIZZ2 = null;
            }
            EnumC1579606Gk enumC1579606Gk = EnumC1579606Gk.ACTIVE;
            if (enumC1579606GkLJIIIIZZ != enumC1579606Gk && enumC1579606GkLJIIIIZZ2 == enumC1579606Gk) {
                Integer num = streakData2.level;
                if (num != null && num.intValue() > 0) {
                    int i = streakData2.streak;
                    C1603606Pq.LIZ.getClass();
                    if (!C1603606Pq.LIZ().fakeMilestoneLevelArray.contains(Integer.valueOf(i))) {
                        C1590906Kt.LIZIZ("StreakTriggers: triggerUnlockAnimationWithoutStreakLevel: no fake milestone level matches");
                        C06BS.LIZ(streakData2.serverMsgId, "triggerUnlockAnimationWithoutStreakLevel: no fake milestone level matches");
                    } else {
                        boolean z2 = C1590906Kt.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("StreakTriggers: triggerUnlockAnimationWithoutStreakLevel: convId=");
                        sbLIZ.append(str2);
                        C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                        StreakLocalExtHelper streakLocalExtHelper = StreakLocalExtHelper.LIZ;
                        Integer numValueOf = Integer.valueOf(i);
                        streakLocalExtHelper.getClass();
                        StreakLocalExtHelper.LIZ(new AwS119S1200000_2(streakData2, numValueOf, str2, 3));
                        C06BS.LIZ(streakData2.serverMsgId, "triggerUnlockAnim success");
                        z = true;
                    }
                } else {
                    C1590906Kt.LIZIZ("StreakTriggers: triggerUnlockAnimationWithoutStreakLevel: not hit milestone exp");
                    C06BS.LIZ(streakData2.serverMsgId, "triggerUnlockAnimationWithoutStreakLevel: not hit milestone exp");
                }
            } else {
                boolean z3 = C1590906Kt.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("StreakTriggers: triggerUnlockAnimationWithoutStreakLevel: streak status is not expected, oldStreakStatus=");
                sbLIZ2.append(enumC1579606GkLJIIIIZZ);
                sbLIZ2.append(" newStreakStatus=");
                sbLIZ2.append(enumC1579606GkLJIIIIZZ2);
                C1590906Kt.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
                if (streakData2 != null) {
                    str3 = streakData2.serverMsgId;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("streak status is not expected, oldStreakStatus=");
                sbLIZ3.append(enumC1579606GkLJIIIIZZ);
                sbLIZ3.append(" newStreakStatus=");
                sbLIZ3.append(enumC1579606GkLJIIIIZZ2);
                C06BS.LIZ(str3, C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("StreakUnlockAnimTrigger@8fc0.onReceiveCmdMsg$3");
        return boolValueOf;
    }
}
