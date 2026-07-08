package Y;

import X.C0MH8;
import X.C0VSJ;
import X.C1403010mc7;
import X.C1428470nHB;
import X.C1434650nR9;
import X.C1440950nbJ;
import X.C1C7U;
import X.C2475309mx;
import X.C493401w4;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public class ACallableS47S0210000_8 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS47S0210000_8 aCallableS47S0210000_8) {
        Unit unit;
        int i;
        int i2;
        C1C7U.LIZ("ChooseCoverHelper@ec4.setVideoThumbImage$5$1");
        ((VideoPublishEditModel) aCallableS47S0210000_8.l0).generateVideoCoverPath(true, -2);
        String videoCoverPath = ((VideoPublishEditModel) aCallableS47S0210000_8.l0).getVideoCoverPath();
        if (videoCoverPath != null) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aCallableS47S0210000_8.l0;
            boolean z = aCallableS47S0210000_8.z2;
            Bitmap bitmap = (Bitmap) aCallableS47S0210000_8.l1;
            videoPublishEditModel.creativeModel.publishPreviewModel.firstFramePath = videoCoverPath;
            if (C493401w4.LIZ()) {
                C0MH8 c0mh8 = C0MH8.LIZ;
                if (z) {
                    i = 5;
                } else {
                    i = 3;
                }
                if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
                    i2 = 1001;
                } else {
                    i2 = LSPassThroughRecordSizeConfig.DEFAULT;
                }
                c0mh8.getClass();
                C0MH8.LJIJ(videoPublishEditModel, bitmap, i2, i, videoCoverPath, 100);
            } else {
                C2475309mx.LJFF(100, Bitmap.CompressFormat.PNG, bitmap, new C0VSJ(videoCoverPath));
            }
            C1440950nbJ.LIZJ(videoPublishEditModel, videoCoverPath);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("ChooseCoverHelper@ec4.setVideoThumbImage$5$1");
        return unit;
    }

    public static final Object call$1(ACallableS47S0210000_8 aCallableS47S0210000_8) {
        C1C7U.LIZ("MultiPublisherFactoryCallback@b09a.onError$1");
        C1403010mc7.LIZ.LJII().getPublishXService().reportPublishFailure((PublishModel) aCallableS47S0210000_8.l0, (C1434650nR9) aCallableS47S0210000_8.l1, aCallableS47S0210000_8.z2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiPublisherFactoryCallback@b09a.onError$1");
        return unit;
    }

    public static final Object call$2(ACallableS47S0210000_8 aCallableS47S0210000_8) {
        boolean zLJFF;
        int i;
        int i2;
        C1C7U.LIZ("ImageCoverHelperKt@2181.loadImageCover$5$1");
        if (C493401w4.LIZ()) {
            C0MH8 c0mh8 = C0MH8.LIZ;
            String videoCoverPath = ((VideoPublishEditModel) aCallableS47S0210000_8.l0).getVideoCoverPath();
            if (aCallableS47S0210000_8.z2) {
                i = 5;
            } else {
                i = 3;
            }
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aCallableS47S0210000_8.l0;
            Bitmap bitmap = (Bitmap) aCallableS47S0210000_8.l1;
            if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
                i2 = 1001;
            } else {
                i2 = LSPassThroughRecordSizeConfig.DEFAULT;
            }
            c0mh8.getClass();
            zLJFF = C0MH8.LJIJ(videoPublishEditModel, bitmap, i2, i, videoCoverPath, 100);
        } else {
            zLJFF = C2475309mx.LJFF(100, Bitmap.CompressFormat.PNG, (Bitmap) aCallableS47S0210000_8.l1, new C0VSJ(((VideoPublishEditModel) aCallableS47S0210000_8.l0).getVideoCoverPath()));
        }
        Boolean boolValueOf = Boolean.valueOf(zLJFF);
        C1C7U.LIZIZ("ImageCoverHelperKt@2181.loadImageCover$5$1");
        return boolValueOf;
    }

    public ACallableS47S0210000_8(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.z2 = z;
        this.l1 = obj;
    }
}
