package X;

import android.graphics.Bitmap;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.poi.detail.guides.PoiDetailGuidesCell;

/* JADX INFO: renamed from: X.09qr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2499509qr extends AbstractC468201s0 {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1331910klR
    public final void LIZ(Bitmap bitmap) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, bitmap);
                break;
            case 1:
                LIZ$1(this, bitmap);
                break;
            default:
                super.LIZ(bitmap);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onFailed(Throwable th) {
        switch (this.$t) {
            case 0:
                onFailed$0(this, th);
                break;
            case 1:
                onFailed$1(this, th);
                break;
            default:
                super.onFailed(th);
                break;
        }
    }

    public C2499509qr(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C2499509qr c2499509qr, Bitmap bitmap) {
        if (bitmap == null) {
            PoiDetailGuidesCell poiDetailGuidesCell = (PoiDetailGuidesCell) c2499509qr.l0;
            C20627315nb c20627315nb = poiDetailGuidesCell.LLILZLL;
            if (c20627315nb != null) {
                c20627315nb.setLoading(false);
            }
            poiDetailGuidesCell.P5(-16777216);
            poiDetailGuidesCell.N5();
            return;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((PoiDetailGuidesCell) c2499509qr.l0), C0PEM.LIZJ, null, new C2439309h9(bitmap, (PoiDetailGuidesCell) c2499509qr.l0, null), 2);
    }

    public static final void LIZ$1(C2499509qr c2499509qr, Bitmap bitmap) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c2499509qr.l0;
        C189200o6.m2constructorimpl(bitmap);
        interfaceC1364105Vn.resumeWith(bitmap);
    }

    public static final void onFailed$0(C2499509qr c2499509qr, Throwable th) {
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load image fail, error msg=");
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C2188811AlT.LIZIZ(sbLIZ);
        C20627315nb c20627315nb = ((PoiDetailGuidesCell) c2499509qr.l0).LLILZLL;
        if (c20627315nb != null) {
            c20627315nb.setLoading(false);
        }
        ((PoiDetailGuidesCell) c2499509qr.l0).P5(-16777216);
        ((PoiDetailGuidesCell) c2499509qr.l0).N5();
    }

    public static final void onFailed$1(C2499509qr c2499509qr, Throwable th) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c2499509qr.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC1364105Vn.resumeWith(null);
    }
}
