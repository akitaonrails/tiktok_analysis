package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;

/* JADX INFO: renamed from: X.10k5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19331510k5 extends AbstractC1335900krs {
    public final int $t;
    public Object l0;

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

    public C19331510k5(InterfaceC1910160zo6 interfaceC1910160zo6, int i) {
        this.$t = i;
        this.l0 = interfaceC1910160zo6;
    }

    public static final void cm$0(C19331510k5 c19331510k5, Uri uri, View view, Throwable th) {
        InterfaceC1910160zo6 interfaceC1910160zo6 = (InterfaceC1910160zo6) c19331510k5.l0;
        if (interfaceC1910160zo6 != null) {
            interfaceC1910160zo6.onFailed(th);
        }
    }

    public static final void cm$1(C19331510k5 c19331510k5, Uri uri, View view, Throwable th) {
        InterfaceC1910160zo6 interfaceC1910160zo6 = (InterfaceC1910160zo6) c19331510k5.l0;
        if (interfaceC1910160zo6 != null) {
            interfaceC1910160zo6.onFailed(th);
        }
    }

    public static final void Ad$0(C19331510k5 c19331510k5, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        InterfaceC1910160zo6 interfaceC1910160zo6 = (InterfaceC1910160zo6) c19331510k5.l0;
        if (interfaceC1910160zo6 != null) {
            interfaceC1910160zo6.onComplete();
        }
    }

    public static final void Ad$1(C19331510k5 c19331510k5, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        InterfaceC1910160zo6 interfaceC1910160zo6 = (InterfaceC1910160zo6) c19331510k5.l0;
        if (interfaceC1910160zo6 != null) {
            interfaceC1910160zo6.onComplete();
        }
    }
}
