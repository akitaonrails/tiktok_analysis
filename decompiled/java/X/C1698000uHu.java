package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;

/* JADX INFO: renamed from: X.0uHu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698000uHu extends AbstractC1335900krs {
    public final int $t;
    public Object l0;

    public static final void cm$0(C1698000uHu c1698000uHu, Uri uri, View view, Throwable th) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        switch (this.$t) {
            case 0:
                Ad$0(this, uri, view, c428600GrK, animatable);
                break;
            case 1:
                Ad$1(this, uri, view, c428600GrK, animatable);
                break;
            default:
                super.Ad(uri, view, c428600GrK, animatable);
                break;
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void cm(Uri uri, View view, Throwable th) {
        switch (this.$t) {
            case 0:
                cm$0(this, uri, view, th);
                break;
            case 1:
                cm$1(this, uri, view, th);
                break;
            default:
                super.cm(uri, view, th);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1698000uHu(Object obj, C05P0<C1680770tq7> c05p0) {
        this.$t = c05p0;
        this.l0 = obj;
    }

    public static final void cm$1(C1698000uHu c1698000uHu, Uri uri, View view, Throwable th) {
        C1656570tD5 c1656570tD5 = (C1656570tD5) c1698000uHu.l0;
        c1656570tD5.q3(C1664590tQ1.LJII(c1656570tD5));
    }

    public static final void Ad$0(C1698000uHu c1698000uHu, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        if (c428600GrK != null) {
            int i = c428600GrK.LIZ;
            int i2 = c428600GrK.LIZIZ;
            if (i > 0 && i2 > 0) {
                ((C05P0) c1698000uHu.l0).setValue(new C1680770tq7((((long) Float.floatToRawIntBits(i2)) & 4294967295L) | (Float.floatToRawIntBits(i) << 32)));
            }
        }
    }

    public static final void Ad$1(C1698000uHu c1698000uHu, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        C1656570tD5 c1656570tD5 = (C1656570tD5) c1698000uHu.l0;
        c1656570tD5.q3(C1664590tQ1.LJII(c1656570tD5));
    }
}
