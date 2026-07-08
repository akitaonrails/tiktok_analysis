package X;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.10RS, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10RS {
    public static C10R5 LIZ() {
        if (!C10R5.LJIIIZ) {
            C10R5 c10r5LJJJJ = C19254610Um.LIZIZ.LJJJJ();
            C10R5.LJIIIZ = true;
            if (c10r5LJJJJ.LIZIZ() == 0) {
                c10r5LJJJJ = new C10R5() { // from class: X.10Rw
                    @Override // X.C10R5
                    public final int LIZIZ() {
                        return 0;
                    }

                    @Override // X.C10R5
                    public final int LIZJ() {
                        return 0;
                    }

                    @Override // X.C10R5
                    public final String LJ() {
                        return "";
                    }
                };
            }
            C10R5.LJIIIIZZ = c10r5LJJJJ;
        }
        C10R5 c10r5 = C10R5.LJIIIIZZ;
        if (c10r5 != null) {
            return c10r5;
        }
        C10R5 c10r5LJJJJ2 = C19254610Um.LIZIZ.LJJJJ();
        C10R5.LJIIIZ = true;
        return c10r5LJJJJ2.LIZIZ() == 0 ? new C10R5() { // from class: X.10Rw
            @Override // X.C10R5
            public final int LIZIZ() {
                return 0;
            }

            @Override // X.C10R5
            public final int LIZJ() {
                return 0;
            }

            @Override // X.C10R5
            public final String LJ() {
                return "";
            }
        } : c10r5LJJJJ2;
    }

    public static void LIZIZ(Intent intent) {
        String stringExtra;
        if (intent != null) {
            try {
                stringExtra = intent.getStringExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
        } else {
            stringExtra = null;
        }
        if (!TextUtils.isEmpty(stringExtra)) {
            TextUtils.equals(stringExtra, "HOME");
        }
    }
}
