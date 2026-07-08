package X;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import dmt.av.video.SingleImageCoverBitmapData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0L06, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L06 {
    public static final Bitmap LIZ(SingleImageCoverBitmapData singleImageCoverBitmapData, boolean z) {
        double d;
        AbstractC1327750kej abstractC1327750kej;
        AbstractC1325130kaV abstractC1325130kaV;
        String previewBitmap;
        Bitmap second = null;
        if (singleImageCoverBitmapData == null) {
            return null;
        }
        boolean z2 = true;
        if (!z && (previewBitmap = singleImageCoverBitmapData.getPreviewBitmap()) != null) {
            if (Intrinsics.LJFF(C0L07.LIZ.getFirst(), previewBitmap)) {
                second = C0L07.LIZ.getSecond();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("try get previewSurfaceBitmap: ");
            if (second == null) {
                z2 = false;
            }
            sbLIZ.append(z2);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            return second;
        }
        C578520MmY c578520MmY = InterfaceC540790LIv.LJI;
        if (c578520MmY.getOpenAlbumOptiGroup() == 1) {
            d = 0.8d;
        } else if (c578520MmY.getOpenAlbumOptiGroup() == 2) {
            d = 0.6d;
        } else {
            d = 1.0d;
        }
        int itemCoverWidth = singleImageCoverBitmapData.getItemCoverWidth() * ((int) d);
        if (itemCoverWidth <= 0) {
            return null;
        }
        Class<?> cls = C1322200kVm.LIZ;
        C1325170kaZ<InterfaceC1324680kZm, AbstractC1327750kej> c1325170kaZLJII = C1328130kfL.LJIILIIL().LJII();
        String string = C2471909mP.LJIILIIL(singleImageCoverBitmapData.getSourcePath()).toString();
        C1324630kZh c1324630kZh = new C1324630kZh(itemCoverWidth, itemCoverWidth);
        C1324670kZl c1324670kZl = C1324670kZl.LIZJ;
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
        imageDecodeOptionsBuilder.getClass();
        C1323050kX9<AbstractC1327750kej> c1323050kX9 = c1325170kaZLJII.get(new C1324660kZk(string, c1324630kZh, c1324670kZl, new C1329360khK(imageDecodeOptionsBuilder), null, null, null));
        if (c1323050kX9 != null) {
            abstractC1327750kej = c1323050kX9.get();
        } else {
            abstractC1327750kej = null;
        }
        if (!(abstractC1327750kej instanceof C1325120kaU) || (abstractC1325130kaV = (AbstractC1325130kaV) abstractC1327750kej) == null) {
            return null;
        }
        return abstractC1325130kaV.getUnderlyingBitmap();
    }
}
