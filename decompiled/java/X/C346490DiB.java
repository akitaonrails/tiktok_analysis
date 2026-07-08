package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0DiB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C346490DiB implements InterfaceC1331910klR {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onCanceled$0(C346490DiB c346490DiB) {
    }

    public static final void onCanceled$1(C346490DiB c346490DiB) {
    }

    public static final void onFailed$0(C346490DiB c346490DiB, Throwable th) {
    }

    public static final void onFailed$1(C346490DiB c346490DiB, Throwable th) {
    }

    public static final void onProgress$0(C346490DiB c346490DiB, float f) {
    }

    public static final void onProgress$1(C346490DiB c346490DiB, float f) {
    }

    public static final void onProgress$2(C346490DiB c346490DiB, float f) {
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

    public static final void onCanceled$2(C346490DiB c346490DiB) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c346490DiB.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
    }

    public static final void LIZ$0(C346490DiB c346490DiB, Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(((TuxTextView) c346490DiB.l0).getContext().getResources(), bitmap);
        ((C2260881DeQ) c346490DiB.l1).getClass();
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
        ((C2260881DeQ) c346490DiB.l1).getClass();
        bitmapDrawable.setBounds(0, 0, iLIZIZ, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11)));
        TuxTextView tuxTextView = (TuxTextView) c346490DiB.l0;
        tuxTextView.setCompoundDrawables(bitmapDrawable, null, null, null);
        tuxTextView.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
    }

    public static final void LIZ$1(C346490DiB c346490DiB, Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(((TuxTextView) c346490DiB.l0).getContext().getResources(), bitmap);
        ((C1767350w5l) c346490DiB.l1).getClass();
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        ((C1767350w5l) c346490DiB.l1).getClass();
        bitmapDrawable.setBounds(0, 0, iLIZIZ, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        TuxTextView tuxTextView = (TuxTextView) c346490DiB.l0;
        tuxTextView.setCompoundDrawables(bitmapDrawable, null, null, null);
        tuxTextView.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
    }

    public static final void LIZ$2(C346490DiB c346490DiB, Bitmap bitmap) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c346490DiB.l0;
        C189200o6.m2constructorimpl(bitmap);
        interfaceC20236714Gf.resumeWith(bitmap);
    }

    public static final void onFailed$2(C346490DiB c346490DiB, Throwable th) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c346490DiB.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
    }

    public C346490DiB(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
