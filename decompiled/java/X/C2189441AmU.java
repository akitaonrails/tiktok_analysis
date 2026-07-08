package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.mediabox.bgplay.notification.BgPlayService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AmU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2189441AmU extends AbstractC468201s0 {
    public final int $t;
    public Object l0;

    public static final void onFailed$1(C2189441AmU c2189441AmU, Throwable th) {
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

    public C2189441AmU(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C2189441AmU c2189441AmU, Bitmap bitmap) {
        if (bitmap != null) {
            BgPlayService bgPlayService = (BgPlayService) c2189441AmU.l0;
            C1AS6 c1as6 = bgPlayService.LLILLJJLI;
            if (c1as6 != null && !bitmap.isRecycled()) {
                c1as6.LJ.coverBitmap = bitmap;
                c1as6.LIZIZ();
            }
            C2179591ARx c2179591ARx = bgPlayService.LLILLL;
            if (c2179591ARx != null) {
                c2179591ARx.LIZJ(bitmap);
                if (Unit.LIZ != null) {
                    return;
                }
            }
        }
        ((BgPlayService) c2189441AmU.l0).LIZIZ();
    }

    public static final void LIZ$1(C2189441AmU c2189441AmU, Bitmap bitmap) {
        if (bitmap != null) {
            ((Function1) c2189441AmU.l0).invoke(bitmap);
        }
    }

    public static final void onFailed$0(C2189441AmU c2189441AmU, Throwable th) {
        ((BgPlayService) c2189441AmU.l0).LIZIZ();
    }
}
