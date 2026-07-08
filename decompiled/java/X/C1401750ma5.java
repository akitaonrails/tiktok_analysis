package X;

import Y.ARunnableS90S0200000_21;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.minis.page.main.fragment.ShareSheetPanelFragment;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ma5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1401750ma5 extends AbstractC1335900krs {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void cm$1(C1401750ma5 c1401750ma5, Uri uri, View view, Throwable th) {
    }

    public static final void cm$2(C1401750ma5 c1401750ma5, Uri uri, View view, Throwable th) {
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
            super.Bh(uri, view);
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
            default:
                super.cm(uri, view, th);
                break;
        }
    }

    public C1401750ma5(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void cm$0(C1401750ma5 c1401750ma5, Uri uri, View view, Throwable th) {
        String message;
        Function2 function2 = (Function2) c1401750ma5.l0;
        Boolean bool = Boolean.FALSE;
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        function2.invoke(bool, message);
    }

    public static final void Ad$0(C1401750ma5 c1401750ma5, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        ((Function2) c1401750ma5.l0).invoke(Boolean.TRUE, null);
        C427690Gpr.LJFF(((C1385130m9H) c1401750ma5.l1).getCoverImage(), 0.0f);
    }

    public static final void Ad$1(C1401750ma5 c1401750ma5, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        C427870Gq9 c427870Gq9 = (C427870Gq9) c1401750ma5.l0;
        if (c427870Gq9 != null) {
            HandlerHook.viewPost(c427870Gq9, new ARunnableS90S0200000_21((C1378910lzF) c1401750ma5.l1, c427870Gq9, 53));
        }
    }

    public static final void Ad$2(C1401750ma5 c1401750ma5, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        SmartImageView smartImageView = (SmartImageView) c1401750ma5.l0;
        if (smartImageView != null) {
            HandlerHook.viewPost(smartImageView, new ARunnableS90S0200000_21((ShareSheetPanelFragment) c1401750ma5.l1, smartImageView, 74));
        }
    }
}
