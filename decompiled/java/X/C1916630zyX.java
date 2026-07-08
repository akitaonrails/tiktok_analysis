package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zyX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1916630zyX implements C0NR2 {
    public final Set<String> LIZ;

    @Override // X.C0NR2
    public final String LIZ(Bundle bundle) {
        return "RecoverAccountGatekeeperTask";
    }

    public C1916630zyX() {
        Set<String> setLJ = C093Y.LJ("UserUpdate", "WindowFocusChanged");
        this.LIZ = setLJ;
        if (C288670BTd.LIZ()) {
            setLJ.remove("WindowFocusChanged");
        }
    }

    @Override // X.C0NR2
    public final Set<String> LIZJ() {
        return this.LIZ;
    }

    @Override // X.C0NR2
    public final C0NR1 LIZIZ(Bundle bundle) {
        return new C0NR1() { // from class: X.0zyW
            @Override // X.C0NR1
            public final void LIZ() {
            }

            @Override // X.C0NR1
            public final int LIZJ() {
                return 1;
            }

            @Override // X.C0NR1
            public final Map<String, String> LIZLLL() {
                return null;
            }

            @Override // X.C0NR1
            public final String getTaskKey() {
                return "RecoverAccountGatekeeperTask";
            }

            @Override // X.C0NR1
            public final C0NRC category() {
                return C0NRC.BLOCKING;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
            @Override // X.C0NR1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(android.os.Bundle r5, X.C0NR0 r6) {
                /*
                    r4 = this;
                    android.app.Activity r3 = X.C2214201BlK.LJFF()
                    boolean r0 = r3 instanceof X.C19EG
                    if (r0 == 0) goto L31
                    X.19EG r3 = (X.C19EG) r3
                    if (r3 == 0) goto L16
                    com.ss.android.ugc.aweme.ILoginService r0 = X.C0XQ7.LIZJ()
                    boolean r0 = r0.isReactivePageShowing()
                    if (r0 != 0) goto L1b
                L16:
                    java.lang.Class<X.0zz5> r0 = X.C1916970zz5.class
                    com.bytedance.poplayer.core.PopupManager.LIZJ(r0)
                L1b:
                    boolean r0 = X.C294570Bgd.LIZ()
                    if (r0 == 0) goto L33
                    X.0zz5 r2 = new X.0zz5
                    r2.<init>(r3, r6)
                    X.06g5 r1 = new X.06g5
                    java.lang.String r0 = "pns_compliance_recover_account_trigger"
                    r1.<init>(r0)
                    com.bytedance.poplayer.core.PopupManager.LJIIZILJ(r2, r1)
                    return
                L31:
                    r3 = 0
                    goto L16
                L33:
                    X.0zz5 r1 = new X.0zz5
                    r1.<init>(r3, r6)
                    r0 = 1
                    com.bytedance.poplayer.core.PopupManager.LJIJI(r1, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1916620zyW.LIZIZ(android.os.Bundle, X.0NR0):void");
            }

            @Override // X.C0NR1
            public final boolean LJ(Bundle bundle2, String str) {
                boolean zIsUserCancelled;
                User user;
                if (!C288670BTd.LIZ()) {
                    if (!Intrinsics.LJFF(str, "WindowFocusChanged") || bundle2.getBoolean("has_focus")) {
                        Serializable serializable = bundle2.getSerializable("user");
                        if ((serializable instanceof User) && (user = (User) serializable) != null) {
                            zIsUserCancelled = user.isUserCancelled();
                        } else {
                            zIsUserCancelled = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().isUserCancelled();
                        }
                        if (!zIsUserCancelled) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
                return true;
            }
        };
    }
}
