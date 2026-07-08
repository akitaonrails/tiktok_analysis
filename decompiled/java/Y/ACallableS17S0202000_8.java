package Y;

import X.C1C7U;
import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.vesdk.VEException;
import com.ss.android.vesdk.VEMediaParser;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes9.dex */
public class ACallableS17S0202000_8 implements Callable {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS17S0202000_8 aCallableS17S0202000_8) {
        C1C7U.LIZ("VideoImageMixedBaseAdapter$VideoImageMixedBaseViewHolder@805b.bindClippedVideoCoverData$1$3");
        Bitmap videoFrame = ((VEMediaParser) aCallableS17S0202000_8.l0).getVideoFrame(((TikTokMediaModel) aCallableS17S0202000_8.l1).startTime, aCallableS17S0202000_8.i2, aCallableS17S0202000_8.i3, false);
        C1C7U.LIZIZ("VideoImageMixedBaseAdapter$VideoImageMixedBaseViewHolder@805b.bindClippedVideoCoverData$1$3");
        return videoFrame;
    }

    public static final Object call$1(ACallableS17S0202000_8 aCallableS17S0202000_8) {
        Bitmap videoFrame;
        C1C7U.LIZ("VideoTemplateSlotMixedView$VideoTemplateSlotMixedAdapter@e4e2.VideoTemplateSlotMixedViewHolder$bindClippedVideoCoverData$1$3");
        try {
            videoFrame = ((VEMediaParser) aCallableS17S0202000_8.l0).getVideoFrame(((TikTokMediaModel) aCallableS17S0202000_8.l1).startTime, aCallableS17S0202000_8.i2, aCallableS17S0202000_8.i3, false);
        } catch (VEException e) {
            TryCatchGuardChecker.doCheck(e);
            videoFrame = null;
        }
        C1C7U.LIZIZ("VideoTemplateSlotMixedView$VideoTemplateSlotMixedAdapter@e4e2.VideoTemplateSlotMixedViewHolder$bindClippedVideoCoverData$1$3");
        return videoFrame;
    }

    public ACallableS17S0202000_8(VEMediaParser vEMediaParser, TikTokMediaModel tikTokMediaModel, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = vEMediaParser;
        this.l1 = tikTokMediaModel;
        this.i2 = i;
        this.i3 = i2;
    }
}
