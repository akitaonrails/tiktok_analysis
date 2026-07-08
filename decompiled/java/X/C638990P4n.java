package X;

import Y.ARunnableS78S0200000_9;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionCellAssem;

/* JADX INFO: renamed from: X.0P4n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C638990P4n implements InterfaceC427850Gq7 {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void A3$0(C638990P4n c638990P4n, Uri uri, C428600GrK c428600GrK) {
    }

    public static final void A3$1(C638990P4n c638990P4n, Uri uri, C428600GrK c428600GrK) {
    }

    public static final void Ad$0(C638990P4n c638990P4n, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
    }

    public static final void Bh$0(C638990P4n c638990P4n, Uri uri, View view) {
    }

    public static final void Bh$1(C638990P4n c638990P4n, Uri uri, View view) {
    }

    public static final void e1$0(C638990P4n c638990P4n, Uri uri) {
    }

    public static final void e1$1(C638990P4n c638990P4n, Uri uri) {
    }

    public static final void lg$1(C638990P4n c638990P4n, Uri uri, Throwable th) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void A3(Uri uri, C428600GrK c428600GrK) {
        switch (this.$t) {
            case 0:
                A3$0(this, uri, c428600GrK);
                break;
            case 1:
                A3$1(this, uri, c428600GrK);
                break;
        }
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
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void Bh(Uri uri, View view) {
        switch (this.$t) {
            case 0:
                Bh$0(this, uri, view);
                break;
            case 1:
                Bh$1(this, uri, view);
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
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void e1(Uri uri) {
        switch (this.$t) {
            case 0:
                e1$0(this, uri);
                break;
            case 1:
                e1$1(this, uri);
                break;
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void lg(Uri uri, Throwable th) {
        switch (this.$t) {
            case 0:
                lg$0(this, uri, th);
                break;
            case 1:
                lg$1(this, uri, th);
                break;
        }
    }

    public C638990P4n(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void lg$0(C638990P4n c638990P4n, Uri uri, Throwable th) {
        ((SmartImageView) c638990P4n.l0).setImageDrawable((Drawable) ((AddYoursCollectionCellAssem) c638990P4n.l1).LLJZIJLIL.getValue());
    }

    public static final void cm$0(C638990P4n c638990P4n, Uri uri, View view, Throwable th) {
        ((SmartImageView) c638990P4n.l0).setImageDrawable((Drawable) ((AddYoursCollectionCellAssem) c638990P4n.l1).LLJZIJLIL.getValue());
    }

    public static final void cm$1(C638990P4n c638990P4n, Uri uri, View view, Throwable th) {
        ((InterfaceC589540NAi) c638990P4n.l1).LIZ(false);
    }

    public static final void Ad$1(C638990P4n c638990P4n, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS78S0200000_9((C658280Pru) c638990P4n.l0, (InterfaceC589540NAi) c638990P4n.l1, 77));
        }
    }
}
