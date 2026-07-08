package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0j2i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1265740j2i extends AbstractC1335900krs {
    public final int $t;
    public Object l0;
    public Object l1;

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
        switch (this.$t) {
            case 0:
                super.Bh(uri, view);
                break;
            case 1:
                super.Bh(uri, view);
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
            default:
                super.cm(uri, view, th);
                break;
        }
    }

    public C1265740j2i(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void cm$0(C1265740j2i c1265740j2i, Uri uri, View view, Throwable th) {
        String message;
        Function2 function2 = (Function2) c1265740j2i.l0;
        Boolean bool = Boolean.FALSE;
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        function2.invoke(bool, message);
    }

    public static final void cm$1(C1265740j2i c1265740j2i, Uri uri, View view, Throwable th) {
        String message;
        Function2 function2 = (Function2) c1265740j2i.l0;
        Boolean bool = Boolean.FALSE;
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        function2.invoke(bool, message);
    }

    public static final void Ad$0(C1265740j2i c1265740j2i, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        ((Function2) c1265740j2i.l0).invoke(Boolean.TRUE, null);
        C1236570iHf c1236570iHf = (C1236570iHf) c1265740j2i.l1;
        c1236570iHf.setBackground(c1236570iHf.e0(true, c1236570iHf.LLILZ, c1236570iHf.LLILZIL));
    }

    public static final void Ad$1(C1265740j2i c1265740j2i, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        ((Function2) c1265740j2i.l0).invoke(Boolean.TRUE, null);
        ((C1261130ivH) c1265740j2i.l1).e0();
    }
}
