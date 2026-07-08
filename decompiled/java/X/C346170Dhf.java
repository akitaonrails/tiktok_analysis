package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;

/* JADX INFO: renamed from: X.0Dhf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C346170Dhf extends AbstractC1335900krs {
    public final int $t;

    public static final void Ad$0(C346170Dhf c346170Dhf, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
    }

    public static final void Ad$1(C346170Dhf c346170Dhf, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
    }

    public static final void cm$1(C346170Dhf c346170Dhf, Uri uri, View view, Throwable th) {
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

    public C346170Dhf(int i) {
        this.$t = i;
    }

    public static final void cm$0(C346170Dhf c346170Dhf, Uri uri, View view, Throwable th) {
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed to load AI self side task SA image: ");
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
