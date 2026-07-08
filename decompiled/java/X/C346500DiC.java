package X;

import android.graphics.Bitmap;
import com.bytedance.tux.input.TuxTextView;
import kotlin.Unit;
import kotlin.jvm.internal.AwS405S0200000_4;

/* JADX INFO: renamed from: X.0DiC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C346500DiC implements InterfaceC1331910klR {
    public final int $t;
    public Object l0;

    public static final void onCanceled$2(C346500DiC c346500DiC) {
    }

    public static final void onFailed$2(C346500DiC c346500DiC, Throwable th) {
    }

    public static final void onProgress$0(C346500DiC c346500DiC, float f) {
    }

    public static final void onProgress$1(C346500DiC c346500DiC, float f) {
    }

    public static final void onProgress$2(C346500DiC c346500DiC, float f) {
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
            case 2:
                LIZ$2(this, bitmap);
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
            case 2:
                onCanceled$2(this);
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
            case 2:
                onFailed$2(this, th);
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
            case 2:
                onProgress$2(this, f);
                break;
        }
    }

    public static final void onCanceled$0(C346500DiC c346500DiC) {
        ((C05XL) c346500DiC.l0).LJIIZILJ(Unit.LIZ);
    }

    public static final void onCanceled$1(C346500DiC c346500DiC) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c346500DiC.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
    }

    public C346500DiC(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C346500DiC c346500DiC, Bitmap bitmap) {
        ((C05XL) c346500DiC.l0).LJIIZILJ(Unit.LIZ);
    }

    public static final void LIZ$1(C346500DiC c346500DiC, Bitmap bitmap) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c346500DiC.l0;
        C189200o6.m2constructorimpl(bitmap);
        interfaceC20236714Gf.resumeWith(bitmap);
    }

    public static final void LIZ$2(C346500DiC c346500DiC, Bitmap bitmap) {
        C0CNO.LIZLLL(0L, new AwS405S0200000_4(c346500DiC, bitmap, (TuxTextView) c346500DiC.l0, 55));
    }

    public static final void onFailed$0(C346500DiC c346500DiC, Throwable th) {
        ((C05XL) c346500DiC.l0).LJIIZILJ(Unit.LIZ);
    }

    public static final void onFailed$1(C346500DiC c346500DiC, Throwable th) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c346500DiC.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
    }
}
