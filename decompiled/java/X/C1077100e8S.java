package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;

/* JADX INFO: renamed from: X.0e8S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1077100e8S extends AbstractC1335900krs {
    public final int $t;

    public static final void Ad$0(C1077100e8S c1077100e8S, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
    }

    public static final void Ad$1(C1077100e8S c1077100e8S, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
    }

    public static final void Ad$3(C1077100e8S c1077100e8S, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
    }

    public static final void Ad$4(C1077100e8S c1077100e8S, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
    }

    public static final void cm$1(C1077100e8S c1077100e8S, Uri uri, View view, Throwable th) {
    }

    public static final void cm$3(C1077100e8S c1077100e8S, Uri uri, View view, Throwable th) {
    }

    public static final void cm$4(C1077100e8S c1077100e8S, Uri uri, View view, Throwable th) {
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
            case 2:
                Ad$2(this, uri, view, c428600GrK, animatable);
                break;
            case 3:
                Ad$3(this, uri, view, c428600GrK, animatable);
                break;
            case 4:
                Ad$4(this, uri, view, c428600GrK, animatable);
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
            case 2:
                cm$2(this, uri, view, th);
                break;
            case 3:
                cm$3(this, uri, view, th);
                break;
            case 4:
                cm$4(this, uri, view, th);
                break;
            default:
                super.cm(uri, view, th);
                break;
        }
    }

    public C1077100e8S(int i) {
        this.$t = i;
    }

    public static final void cm$0(C1077100e8S c1077100e8S, Uri uri, View view, Throwable th) {
        String message;
        if (th == null || (message = th.getMessage()) == null) {
            message = "";
        }
        C1022620cia.LJ("AutoAdIntroUtils", message);
    }

    public static final void cm$2(C1077100e8S c1077100e8S, Uri uri, View view, Throwable th) {
    }

    public static final void Ad$2(C1077100e8S c1077100e8S, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
    }
}
