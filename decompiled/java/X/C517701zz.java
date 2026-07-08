package X;

import android.graphics.Bitmap;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import java.io.File;

/* JADX INFO: renamed from: X.01zz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C517701zz implements InterfaceC1331910klR {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    public static final void onProgress$0(C517701zz c517701zz, float f) {
    }

    public static final void onProgress$1(C517701zz c517701zz, float f) {
    }

    @Override // X.InterfaceC1331910klR
    public final void LIZ(Bitmap bitmap) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, bitmap);
                break;
            case 1:
                LIZ$1(this, bitmap);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onCanceled() {
        switch (this.$t) {
            case 0:
                onCanceled$0(this);
                break;
            case 1:
                onCanceled$1(this);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onFailed(Throwable th) {
        switch (this.$t) {
            case 0:
                onFailed$0(this, th);
                break;
            case 1:
                onFailed$1(this, th);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onProgress(float f) {
        switch (this.$t) {
            case 0:
                onProgress$0(this, f);
                break;
            case 1:
                onProgress$1(this, f);
                break;
        }
    }

    public static final void onCanceled$0(C517701zz c517701zz) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c517701zz.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
    }

    public static final void onCanceled$1(C517701zz c517701zz) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c517701zz.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
    }

    public static final void LIZ$0(C517701zz c517701zz, Bitmap bitmap) {
        if (bitmap == null) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c517701zz.l0;
            C189200o6.m2constructorimpl(null);
            interfaceC20236714Gf.resumeWith(null);
            return;
        }
        C948503nH.LJ((LifecycleOwner) c517701zz.l1, C0PEM.LIZJ, new C474301sz((File) c517701zz.l2, (InterfaceC20236714Gf) c517701zz.l0, bitmap, null));
    }

    public static final void LIZ$1(C517701zz c517701zz, Bitmap bitmap) {
        if (bitmap == null) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c517701zz.l0;
            C189200o6.m2constructorimpl(null);
            interfaceC20236714Gf.resumeWith(null);
            return;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) c517701zz.l1), C0PEM.LIZJ, null, new C474101sx((File) c517701zz.l2, (InterfaceC20236714Gf) c517701zz.l0, bitmap, null), 2);
    }

    public static final void onFailed$0(C517701zz c517701zz, Throwable th) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c517701zz.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
    }

    public static final void onFailed$1(C517701zz c517701zz, Throwable th) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c517701zz.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
    }

    public C517701zz(C2252611DEt c2252611DEt, LifecycleOwner lifecycleOwner, C0VSJ c0vsj, int i) {
        this.$t = i;
        this.l0 = c2252611DEt;
        this.l1 = lifecycleOwner;
        this.l2 = c0vsj;
    }
}
