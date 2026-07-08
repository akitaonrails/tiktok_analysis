package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0Mq6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C580720Mq6 extends AbstractC1335900krs {
    public final int $t;
    public Object l0;

    public static final void cm$0(C580720Mq6 c580720Mq6, Uri uri, View view, Throwable th) {
    }

    public static final void cm$1(C580720Mq6 c580720Mq6, Uri uri, View view, Throwable th) {
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

    @Override // X.AbstractC1335900krs, X.InterfaceC427850Gq7
    public final void Bh(Uri uri, View view) {
        if (this.$t != 0) {
            super.Bh(uri, view);
        } else {
            Bh$0(this, uri, view);
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

    public C580720Mq6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void Bh$0(C580720Mq6 c580720Mq6, Uri uri, View view) {
        super.Bh(uri, view);
        ((InterfaceC529900KqK) c580720Mq6.l0).LIZIZ();
    }

    public static final void Ad$0(C580720Mq6 c580720Mq6, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        ((InterfaceC529900KqK) c580720Mq6.l0).LIZ();
    }

    public static final void Ad$1(C580720Mq6 c580720Mq6, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        C01TT.LIZLLL(new AwS552S0100000_8((C0MRJ) c580720Mq6.l0, 684));
    }
}
