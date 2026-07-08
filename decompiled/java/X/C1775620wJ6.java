package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import com.bytedance.pipo.ttpay.recharge.qrcode.QrCodeFragment;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.MoveReminderViewHolder;
import kotlin.jvm.internal.AwS142S0110000_26;

/* JADX INFO: renamed from: X.0wJ6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1775620wJ6 extends AbstractC1335900krs {
    public final int $t;
    public Object l0;

    public static final void cm$0(C1775620wJ6 c1775620wJ6, Uri uri, View view, Throwable th) {
    }

    public static final void cm$2(C1775620wJ6 c1775620wJ6, Uri uri, View view, Throwable th) {
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

    public C1775620wJ6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void cm$1(C1775620wJ6 c1775620wJ6, Uri uri, View view, Throwable th) {
        DialogC1389620mGW dialogC1389620mGWWR = ((QrCodeFragment) c1775620wJ6.l0).WR();
        if (dialogC1389620mGWWR != null) {
            C0FNV.LIZ(dialogC1389620mGWWR);
        }
        C1389890mGx c1389890mGx = new C1389890mGx((QrCodeFragment) c1775620wJ6.l0);
        c1389890mGx.LJIIIZ(2131832569);
        c1389890mGx.LJIIJJI();
    }

    public static final void Ad$0(C1775620wJ6 c1775620wJ6, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        ((MoveReminderViewHolder) c1775620wJ6.l0).getClass();
    }

    public static final void Ad$1(C1775620wJ6 c1775620wJ6, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        AwS142S0110000_26 awS142S0110000_26 = ((QrCodeFragment) c1775620wJ6.l0).LLJLLL;
        if (awS142S0110000_26 != null) {
            awS142S0110000_26.invoke();
        }
        ((QrCodeFragment) c1775620wJ6.l0).LLJLLL = null;
    }

    public static final void Ad$2(C1775620wJ6 c1775620wJ6, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        ((C1766690w4h) c1775620wJ6.l0).setImageLoaded(true);
    }
}
