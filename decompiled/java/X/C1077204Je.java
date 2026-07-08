package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04Je, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1077204Je implements InterfaceC1331910klR {
    public final int $t;
    public Object l0;

    public static final void onCanceled$0(C1077204Je c1077204Je) {
    }

    public static final void onCanceled$1(C1077204Je c1077204Je) {
    }

    public static final void onFailed$0(C1077204Je c1077204Je, Throwable th) {
    }

    public static final void onFailed$1(C1077204Je c1077204Je, Throwable th) {
    }

    public static final void onProgress$0(C1077204Je c1077204Je, float f) {
    }

    public static final void onProgress$1(C1077204Je c1077204Je, float f) {
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

    public C1077204Je(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C1077204Je c1077204Je, Bitmap bitmap) {
        if (bitmap != null) {
            C950403na c950403na = (C950403na) c1077204Je.l0;
            int width = c950403na.getWidth();
            int height = c950403na.getHeight();
            if (width > 0 && height > 0) {
                bitmap = Bitmap.createBitmap(bitmap, 0, 0, Math.min(bitmap.getWidth(), width), Math.min(bitmap.getHeight(), height));
            }
            c950403na.setBackground(new BitmapDrawable(c950403na.getContext().getResources(), bitmap));
        }
    }

    public static final void LIZ$1(C1077204Je c1077204Je, Bitmap bitmap) {
        ((Function1) c1077204Je.l0).invoke(bitmap);
    }
}
