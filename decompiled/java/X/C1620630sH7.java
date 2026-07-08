package X;

import Y.ARunnableS57S0300000_24;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.series.seriesdetail.assem.SeriesDetailVideoListAssem;
import com.ss.android.ugc.aweme.vibefeed.feed.component.InvitePanelAssem;

/* JADX INFO: renamed from: X.0sH7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1620630sH7 extends AbstractC468201s0 {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onFailed$0(C1620630sH7 c1620630sH7, Throwable th) {
    }

    @Override // X.InterfaceC1331910klR
    public final void LIZ(Bitmap bitmap) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, bitmap);
                break;
            case 1:
                LIZ$1(this, bitmap);
                break;
            case 2:
                LIZ$2(this, bitmap);
                break;
            case 3:
                LIZ$3(this, bitmap);
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
            case 2:
                onFailed$2(this, th);
                break;
            case 3:
                onFailed$3(this, th);
                break;
            default:
                super.onFailed(th);
                break;
        }
    }

    public static final void LIZ$0(C1620630sH7 c1620630sH7, Bitmap bitmap) {
        if (bitmap != null) {
            SeriesDetailVideoListAssem seriesDetailVideoListAssem = (SeriesDetailVideoListAssem) c1620630sH7.l0;
            C1722300uv6 c1722300uv6 = (C1722300uv6) c1620630sH7.l1;
            C1749280vcc c1749280vcc = seriesDetailVideoListAssem.LLJJ;
            if (c1749280vcc != null) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
                c1722300uv6.LIZJ = 0;
                c1722300uv6.LIZ = bitmapDrawable;
                c1749280vcc.setStatus(c1722300uv6);
            }
        }
    }

    public static final void LIZ$1(C1620630sH7 c1620630sH7, Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        C1260120ite.LIZIZ(new ARunnableS57S0300000_24((C1575900r6y) c1620630sH7.l0, bitmap, (Context) c1620630sH7.l1, 14));
    }

    public static final void LIZ$2(C1620630sH7 c1620630sH7, Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        C1260120ite.LIZIZ(new ARunnableS57S0300000_24((C1575900r6y) c1620630sH7.l0, bitmap, (Context) c1620630sH7.l1, 15));
    }

    public static final void LIZ$3(C1620630sH7 c1620630sH7, Bitmap bitmap) {
        ImageView imageView;
        if (bitmap != null && (imageView = ((InvitePanelAssem) c1620630sH7.l0).LLJJIII) != null) {
            imageView.setImageDrawable(new BitmapDrawable(((Context) c1620630sH7.l1).getResources(), bitmap));
        }
    }

    public static final void onFailed$1(C1620630sH7 c1620630sH7, Throwable th) {
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("introImageView onFailed: ");
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void onFailed$2(C1620630sH7 c1620630sH7, Throwable th) {
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("vibeFeedInviteMain onFailed: ");
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void onFailed$3(C1620630sH7 c1620630sH7, Throwable th) {
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("introImageView onFailed: ");
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1620630sH7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
