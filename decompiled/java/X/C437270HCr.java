package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0HCr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C437270HCr {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(352));

    public static void LIZ(String str) {
        C437560HDu c437560HDu = (C437560HDu) ((ISocialAvatarCreationStatusService) LIZ.getValue()).LIZ(str).getValue();
        if (!c437560HDu.LJFF && c437560HDu.LJ && c437560HDu.LIZ == EnumC437540HDs.SUCCESSFUL) {
            try {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C437230HCn(null), 3);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
