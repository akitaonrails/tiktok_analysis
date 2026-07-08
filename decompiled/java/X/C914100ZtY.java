package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0ZtY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C914100ZtY implements InterfaceC2385309Wh {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            case 2:
                return then$2(this, c15o7);
            default:
                return null;
        }
    }

    public static final Object then$0(C914100ZtY c914100ZtY, C15O7 c15o7) {
        C1C7U.LIZ("ImageHeaderModule@1844.updateCoverAfterBackFromAlbum$2");
        ((C214848196g) c914100ZtY.l1).LIZ.setVideoCoverPath(c914100ZtY.s0);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageHeaderModule@1844.updateCoverAfterBackFromAlbum$2");
        return unit;
    }

    public static final Object then$1(C914100ZtY c914100ZtY, C15O7 c15o7) throws Throwable {
        int i;
        C1C7U.LIZ("ImageHeaderModule@1844.updateCoverAfterBackFromAlbum$4");
        if (C493401w4.LIZ()) {
            C0MH8 c0mh8 = C0MH8.LIZ;
            VideoPublishEditModel videoPublishEditModel = ((C214848196g) c914100ZtY.l1).LIZ;
            Bitmap bitmap = (Bitmap) c15o7.LJIIL();
            String str = c914100ZtY.s0;
            if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
                i = 1001;
            } else {
                i = LSPassThroughRecordSizeConfig.DEFAULT;
            }
            c0mh8.getClass();
            C0MH8.LJIJ(videoPublishEditModel, bitmap, i, 3, str, 100);
        } else {
            C2477909nN.LJI((Bitmap) c15o7.LJIIL(), c914100ZtY.s0, null, 0, 6);
        }
        Object objLJIIL = c15o7.LJIIL();
        C1C7U.LIZIZ("ImageHeaderModule@1844.updateCoverAfterBackFromAlbum$4");
        return objLJIIL;
    }

    public static final Object then$2(C914100ZtY c914100ZtY, C15O7 c15o7) {
        C1C7U.LIZ("ImageHeaderModule@1844.updateCoverWithCoverText$5");
        ((C214848196g) c914100ZtY.l1).LIZ.setVideoCoverPath(c914100ZtY.s0);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageHeaderModule@1844.updateCoverWithCoverText$5");
        return unit;
    }

    public C914100ZtY(C214848196g c214848196g, String str, int i) {
        this.$t = i;
        this.l1 = c214848196g;
        this.s0 = str;
    }
}
