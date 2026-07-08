package X;

import android.content.Context;
import android.widget.Toast;
import com.bytedance.geckox.model.UpdatePackage;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: X.09qt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2499709qt extends AbstractC1552040qUU {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1552040qUU
    public final void LJFF(UpdatePackage updatePackage) {
        if (1 - this.$t != 0) {
            super.LJFF(updatePackage);
        } else {
            LJFF$0(this, updatePackage);
        }
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIJ(UpdatePackage updatePackage, Throwable th) {
        switch (this.$t) {
            case 0:
                LJIJ$0(this, updatePackage, th);
                break;
            case 1:
                LJIJ$1(this, updatePackage, th);
                break;
            default:
                super.LJIJ(updatePackage, th);
                break;
        }
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIL(long j, UpdatePackage updatePackage) {
        switch (this.$t) {
            case 0:
                LJIL$0(this, j, updatePackage);
                break;
            case 1:
                LJIL$1(this, j, updatePackage);
                break;
            default:
                super.LJIL(j, updatePackage);
                break;
        }
    }

    public C2499709qt(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJFF$0(C2499709qt c2499709qt, UpdatePackage updatePackage) {
        C786410Ut5.re(Toast.makeText((Context) c2499709qt.l0, "Gecko active resources successfully", 0));
    }

    public static final void LJIJ$0(C2499709qt c2499709qt, UpdatePackage updatePackage, Throwable th) {
        ((CountDownLatch) c2499709qt.l0).countDown();
    }

    public static final void LJIJ$1(C2499709qt c2499709qt, UpdatePackage updatePackage, Throwable th) {
        C786410Ut5.re(Toast.makeText((Context) c2499709qt.l0, "Gecko update resources failed", 0));
    }

    public static final void LJIL$0(C2499709qt c2499709qt, long j, UpdatePackage updatePackage) {
        ((CountDownLatch) c2499709qt.l0).countDown();
    }

    public static final void LJIL$1(C2499709qt c2499709qt, long j, UpdatePackage updatePackage) {
        C786410Ut5.re(Toast.makeText((Context) c2499709qt.l0, "Gecko update resources successfully", 0));
    }
}
