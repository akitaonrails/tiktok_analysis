package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.frequencycontrol.api.IFrequencyControlSyncService;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS108S1000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r74, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1575960r74 implements InterfaceC586170Myt {
    public static final C1575960r74 LL;
    public static Boolean LLILLJJLI;
    public static Boolean LLILLL;
    public static Boolean LLILZ;
    public static Keva LLILZIL;

    static {
        C1575960r74 c1575960r74 = new C1575960r74();
        LL = c1575960r74;
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null) {
            iAccountService.LJIILL(c1575960r74);
        }
    }

    public static boolean LIZLLL() {
        C844470XAv.LIZ.getClass();
        return Intrinsics.LJFF(C844470XAv.LJIILL, "local_test");
    }

    public static int LIZIZ(Context context) {
        int iLJIILJJIL = C12ES.LJIILJJIL(C14KQ.LJIIIIZZ(C1388190mED.LIZ(context)), context);
        if (1080 <= iLJIILJJIL) {
            if (iLJIILJJIL <= Integer.MAX_VALUE) {
                return 5;
            }
            return 3;
        }
        if (650 <= iLJIILJJIL && iLJIILJJIL < 1081) {
            return 4;
        }
        return 3;
    }

    public static final Keva LIZJ(String str) {
        Keva keva = LLILZIL;
        if (keva == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("repo_vibe_feed_");
            sbLIZ.append(str);
            Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
            LLILZIL = repo;
            return repo;
        }
        return keva;
    }

    public final void LJ(String str) {
        String strValueOf = String.valueOf(C1575440r6E.LIZ());
        Keva kevaLIZJ = LIZJ(strValueOf);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("action_bar_exposed_times_v2_");
        sbLIZ.append(str);
        kevaLIZJ.storeInt(C2188811AlT.LIZIZ(sbLIZ), 0);
        Keva kevaLIZJ2 = LIZJ(strValueOf);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("action_bar_exit_timestamp_");
        sbLIZ2.append(str);
        kevaLIZJ2.storeLong(C2188811AlT.LIZIZ(sbLIZ2), 0L);
    }

    public static String LIZ(String str, EnumC1576090r7H enumC1576090r7H) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(enumC1576090r7H.getTrackingName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJFF(String str, EnumC1576090r7H enumC1576090r7H) {
        Keva kevaLIZJ = LIZJ(String.valueOf(C1575440r6E.LIZ()));
        String strLIZ = LIZ(str, enumC1576090r7H);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cai_action_bar_exposed_times_");
        sbLIZ.append(strLIZ);
        kevaLIZJ.storeInt(C2188811AlT.LIZIZ(sbLIZ), 0);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("cai_action_bar_impression_days_");
        sbLIZ2.append(strLIZ);
        kevaLIZJ.storeInt(C2188811AlT.LIZIZ(sbLIZ2), 0);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("cai_action_bar_day_last_counted_");
        sbLIZ3.append(strLIZ);
        kevaLIZJ.storeLong(C2188811AlT.LIZIZ(sbLIZ3), 0L);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("cai_action_bar_reached_timestamp_");
        sbLIZ4.append(strLIZ);
        kevaLIZJ.storeLong(C2188811AlT.LIZIZ(sbLIZ4), 0L);
    }

    public static InterfaceC12999056v LJI(EnumC12986056i enumC12986056i, String str, String str2) {
        IFrequencyControlSyncService iFrequencyControlSyncService = (IFrequencyControlSyncService) PluggableExtentionKt.pluggableSpi$default(IFrequencyControlSyncService.class, false, false, false, 14, null);
        if (iFrequencyControlSyncService != null) {
            return iFrequencyControlSyncService.LIZ(enumC12986056i.getSceneName(), new C054M(str, new AwS108S1000000_24(str2, 8), AFwS213S0000000_24.get$arr$(472)));
        }
        return null;
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (!z) {
            return;
        }
        if (i != 2 && i != 3) {
            return;
        }
        LLILZIL = null;
        LLILLJJLI = null;
        LLILLL = null;
        LLILZ = null;
    }
}
