package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aicontent.aiself.AlbumAiSelfTaskViewModel;

/* JADX INFO: renamed from: X.0Mq7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C580730Mq7 extends AbstractC468201s0 {
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

    public C580730Mq7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C580730Mq7 c580730Mq7, Bitmap bitmap) {
        ((AlbumAiSelfTaskViewModel) c580730Mq7.l0).LL.setValue(bitmap);
    }

    public static final void LIZ$1(C580730Mq7 c580730Mq7, Bitmap bitmap) {
        C0MP6.LIZ(bitmap, (InterfaceC20236714Gf) c580730Mq7.l0);
    }

    public static final void onFailed$0(C580730Mq7 c580730Mq7, Throwable th) {
        ((AlbumAiSelfTaskViewModel) c580730Mq7.l0).LL.setValue(null);
    }

    public static final void onFailed$1(C580730Mq7 c580730Mq7, Throwable th) {
        C0MP6.LIZ(null, (InterfaceC20236714Gf) c580730Mq7.l0);
    }
}
