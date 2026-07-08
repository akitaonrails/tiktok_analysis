package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;

/* JADX INFO: renamed from: X.19LI, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19LI extends AbstractC1335900krs {
    public final int $t;
    public Object l0;

    public static final void Ad$0(C19LI c19li, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
    }

    public static final void Ad$1(C19LI c19li, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
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
            default:
                super.Ad(uri, view, c428600GrK, animatable);
                break;
        }
    }

    @Override // X.AbstractC1335900krs, X.InterfaceC427850Gq7
    public final void Bh(Uri uri, View view) {
        switch (this.$t) {
            case 2:
                Bh$0(this, uri, view);
                break;
            case 3:
                Bh$1(this, uri, view);
                break;
            default:
                super.Bh(uri, view);
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
            default:
                super.cm(uri, view, th);
                break;
        }
    }

    public C19LI(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void Bh$0(C19LI c19li, Uri uri, View view) {
        AbstractC1335900krs abstractC1335900krs = (AbstractC1335900krs) c19li.l0;
        if (abstractC1335900krs != null) {
            abstractC1335900krs.Bh(uri, view);
        }
    }

    public static final void Bh$1(C19LI c19li, Uri uri, View view) {
        AbstractC1335900krs abstractC1335900krs = (AbstractC1335900krs) c19li.l0;
        if (abstractC1335900krs != null) {
            abstractC1335900krs.Bh(uri, view);
        }
    }

    public static final void cm$0(C19LI c19li, Uri uri, View view, Throwable th) {
        C0H1U.LIZIZ((C427870Gq9) c19li.l0);
    }

    public static final void cm$1(C19LI c19li, Uri uri, View view, Throwable th) {
        C0H1U.LIZIZ((C427870Gq9) c19li.l0);
    }

    public static final void cm$2(C19LI c19li, Uri uri, View view, Throwable th) {
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("loadImg onFailed");
        AbstractC1335900krs abstractC1335900krs = (AbstractC1335900krs) c19li.l0;
        if (abstractC1335900krs != null) {
            abstractC1335900krs.cm(uri, view, th);
        }
    }

    public static final void cm$3(C19LI c19li, Uri uri, View view, Throwable th) {
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("loadImg onFailed");
        AbstractC1335900krs abstractC1335900krs = (AbstractC1335900krs) c19li.l0;
        if (abstractC1335900krs != null) {
            abstractC1335900krs.cm(uri, view, th);
        }
    }

    public static final void Ad$2(C19LI c19li, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("loadImg onComplete");
        AbstractC1335900krs abstractC1335900krs = (AbstractC1335900krs) c19li.l0;
        if (abstractC1335900krs != null) {
            abstractC1335900krs.Ad(uri, view, c428600GrK, animatable);
        }
    }

    public static final void Ad$3(C19LI c19li, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("loadImg onComplete");
        AbstractC1335900krs abstractC1335900krs = (AbstractC1335900krs) c19li.l0;
        if (abstractC1335900krs != null) {
            abstractC1335900krs.Ad(uri, view, c428600GrK, animatable);
        }
    }
}
