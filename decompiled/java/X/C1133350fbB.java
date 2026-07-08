package X;

import Y.ARunnableS50S0300000_17;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftInteractivePreviewPreloadSettings;
import java.util.List;

/* JADX INFO: renamed from: X.0fbB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1133350fbB {
    public boolean LIZ;
    public boolean LIZIZ;

    public final void LIZ(int i, List<? extends GiftPage> list) {
        C1133360fbC c1133360fbC;
        if (LiveGiftInteractivePreviewPreloadSettings.INSTANCE.getEnabled()) {
            if (i == 17) {
                if (!this.LIZ) {
                    this.LIZ = true;
                    this.LIZIZ = true;
                    c1133360fbC = new C1133360fbC(0, -1);
                } else {
                    if (this.LIZIZ) {
                        return;
                    }
                    this.LIZIZ = true;
                    c1133360fbC = new C1133360fbC(8, -1);
                }
            } else {
                if (this.LIZ) {
                    return;
                }
                this.LIZ = true;
                c1133360fbC = new C1133360fbC(0, 8);
            }
            C473410IhP.LIZIZ(new ARunnableS50S0300000_17(this, list, c1133360fbC, 16));
        }
    }
}
