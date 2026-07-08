package Y;

import X.C19EG;
import X.C1C7U;
import X.C20431614x8;
import X.C2204931BRj;
import android.content.Intent;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;

/* JADX INFO: loaded from: classes29.dex */
public class ARunnableS3S0220000_28 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2 = true;
    public boolean z3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS3S0220000_28 aRunnableS3S0220000_28) {
        AuthorizeActivity authorizeActivity = (AuthorizeActivity) aRunnableS3S0220000_28.l0;
        Throwable th = (Throwable) aRunnableS3S0220000_28.l1;
        boolean z = aRunnableS3S0220000_28.z2;
        boolean z2 = aRunnableS3S0220000_28.z3;
        String str = AuthorizeActivity._pnsPageId;
        authorizeActivity.getClass();
        C1C7U.LIZ("AuthorizeActivity@bcc6.onFailure$1L");
        C20431614x8 c20431614x8 = C20431614x8.LIZ;
        Intent intent = authorizeActivity.getIntent();
        c20431614x8.getClass();
        C20431614x8.LJFF(authorizeActivity, th, z, z2, intent, authorizeActivity);
        authorizeActivity.finish();
        C1C7U.LIZIZ("AuthorizeActivity@bcc6.onFailure$1L");
    }

    public static final void run$1(ARunnableS3S0220000_28 aRunnableS3S0220000_28) {
        C2204931BRj c2204931BRj = (C2204931BRj) aRunnableS3S0220000_28.l0;
        Throwable th = (Throwable) aRunnableS3S0220000_28.l1;
        boolean z = aRunnableS3S0220000_28.z2;
        boolean z2 = aRunnableS3S0220000_28.z3;
        c2204931BRj.getClass();
        C1C7U.LIZ("AuthorizeProcessor@b443.onFailure$1L");
        if (c2204931BRj.LIZLLL()) {
            C1C7U.LIZIZ("AuthorizeProcessor@b443.onFailure$1L");
            return;
        }
        C20431614x8 c20431614x8 = C20431614x8.LIZ;
        C19EG fragmentActivity = c2204931BRj.LLJJJJJIL.getFragmentActivity();
        Intent parameter = c2204931BRj.LLJJJJJIL.getParameter();
        c20431614x8.getClass();
        C20431614x8.LJFF(fragmentActivity, th, z, z2, parameter, c2204931BRj);
        c2204931BRj.finish();
        C1C7U.LIZIZ("AuthorizeProcessor@b443.onFailure$1L");
    }

    public ARunnableS3S0220000_28(C2204931BRj c2204931BRj, Throwable th, boolean z, int i) {
        this.$t = i;
        this.l0 = c2204931BRj;
        this.l1 = th;
        this.z3 = z;
    }

    public ARunnableS3S0220000_28(AuthorizeActivity authorizeActivity, Throwable th, boolean z, int i) {
        this.$t = i;
        this.l0 = authorizeActivity;
        this.l1 = th;
        this.z3 = z;
    }
}
