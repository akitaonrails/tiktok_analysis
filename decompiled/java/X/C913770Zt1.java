package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.interraction.InteractionCardReusedUISlot;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.unified.UnifiedSimpleShareUISlot;

/* JADX INFO: renamed from: X.0Zt1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C913770Zt1 extends AbstractC1335900krs {
    public final int $t;
    public Object l0;

    public static final void Bh$1(C913770Zt1 c913770Zt1, Uri uri, View view) {
    }

    public static final void cm$1(C913770Zt1 c913770Zt1, Uri uri, View view, Throwable th) {
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
        switch (this.$t) {
            case 0:
                Bh$0(this, uri, view);
                break;
            case 1:
            default:
                super.Bh(uri, view);
                break;
            case 2:
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
            case 2:
                cm$2(this, uri, view, th);
                break;
            default:
                super.cm(uri, view, th);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C913770Zt1(Object obj, SessionListBaseVH<InterfaceC888500YtM, InterfaceC883640YlW> sessionListBaseVH) {
        this.$t = sessionListBaseVH;
        this.l0 = obj;
    }

    public static final void Bh$0(C913770Zt1 c913770Zt1, Uri uri, View view) {
        ((SessionListBaseVH) c913770Zt1.l0).LLJJJIL = C0Z71.LOADING;
    }

    public static final void cm$0(C913770Zt1 c913770Zt1, Uri uri, View view, Throwable th) {
        ((SessionListBaseVH) c913770Zt1.l0).LLJJJIL = C0Z71.FAILED;
        C1492305sn.LIZ().LJIIZILJ(System.currentTimeMillis(), false);
    }

    public static final void cm$2(C913770Zt1 c913770Zt1, Uri uri, View view, Throwable th) {
        C786410Ut5.LLLLLLZZ(((UnifiedSimpleShareUISlot) c913770Zt1.l0).up(), 0);
        C786410Ut5.LJLLLLLL(0, (View) ((UnifiedSimpleShareUISlot) c913770Zt1.l0).LLJZ.getValue());
        SmartImageView smartImageViewTp = ((UnifiedSimpleShareUISlot) c913770Zt1.l0).tp();
        if (smartImageViewTp != null) {
            C786410Ut5.LJLLLLLL(8, smartImageViewTp);
        }
    }

    public static final void Ad$0(C913770Zt1 c913770Zt1, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        ((SessionListBaseVH) c913770Zt1.l0).LLJJJIL = C0Z71.COMPLETE;
        C1492305sn.LIZ().LJIIZILJ(System.currentTimeMillis(), true);
    }

    public static final void Ad$1(C913770Zt1 c913770Zt1, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        C337180DJs.LIZ(((InteractionCardReusedUISlot) c913770Zt1.l0).Bp());
    }

    public static final void Ad$2(C913770Zt1 c913770Zt1, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        SmartImageView smartImageViewTp = ((UnifiedSimpleShareUISlot) c913770Zt1.l0).tp();
        if (smartImageViewTp != null) {
            C786410Ut5.u5(smartImageViewTp, 1.0f);
        }
        C786410Ut5.LLLLLLZZ(((UnifiedSimpleShareUISlot) c913770Zt1.l0).up(), 8);
        C786410Ut5.LJLLLLLL(8, (View) ((UnifiedSimpleShareUISlot) c913770Zt1.l0).LLJZ.getValue());
    }
}
