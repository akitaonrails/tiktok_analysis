package X;

import Y.ACallableS35S0500000_22;
import android.graphics.Bitmap;
import com.ss.android.ttve.nativePort.TEImageInterface;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageFilterInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSurfaceData;
import com.ss.android.ugc.aweme.creative.model.edit.TemplateFilterBean;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0MfN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C574070MfN {
    public static final boolean LJII(MediaModel mediaModel) {
        if (mediaModel.width <= C1450870nrJ.LIZIZ() * 3 && mediaModel.height <= C1450870nrJ.LIZIZ() * 3) {
            return false;
        }
        return true;
    }

    public static final FilterBean LJIIIIZZ(ImageFilterInfo imageFilterInfo) {
        String filterFolder;
        TemplateFilterBean filterBean;
        TemplateFilterBean filterBean2;
        String resId;
        if (C123100dR.LIZ(imageFilterInfo.getFilterId())) {
            InterfaceC1639870sm9 interfaceC1639870sm9LIZIZ = C0CHQ.LIZ().LJJIL().LIZIZ();
            FilterBean filterBeanLJII = C1453230nv7.LJII(interfaceC1639870sm9LIZIZ.LJJI(), imageFilterInfo.getFilterId());
            if (filterBeanLJII != null || (((filterBean = imageFilterInfo.getFilterBean()) != null && (resId = filterBean.getResId()) != null && (filterBeanLJII = C1453230nv7.LJ(interfaceC1639870sm9LIZIZ.LJJI(), resId)) != null) || ((filterBean2 = imageFilterInfo.getFilterBean()) != null && (filterBeanLJII = filterBean2.convertToFilterBean()) != null))) {
                String filterFolder2 = filterBeanLJII.getFilterFolder();
                if (filterFolder2 == null || filterFolder2.length() == 0) {
                    TemplateFilterBean filterBean3 = imageFilterInfo.getFilterBean();
                    if (filterBean3 == null || (filterFolder = filterBean3.getFilterFolder()) == null) {
                        filterFolder = "";
                    }
                    filterBeanLJII.setFilterFolder(filterFolder);
                    filterBeanLJII.setFilterFilePath(filterBeanLJII.getFilterFolder());
                }
                return filterBeanLJII;
            }
        }
        return null;
    }

    public static final void LJIIIZ(ImageSurfaceData imageSurfaceData) {
        int i;
        if (C1450870nrJ.LIZIZ > 0 && (i = C1450870nrJ.LIZ) > 0) {
            imageSurfaceData.setSurfaceViewHeight(i);
            imageSurfaceData.setSurfaceViewWidth(C1450870nrJ.LIZIZ);
        } else {
            C201955140j.LJIIZILJ("refreshing invalid surface data");
        }
    }

    public static final ImportVideoInfo LIZJ(MediaModel mediaModel, int i) {
        return new ImportVideoInfo(mediaModel.width, mediaModel.height, 0, 0, String.valueOf(i), mediaModel.endTime - mediaModel.startTime, mediaModel.duration, null, null, 0, 0.0f, mediaModel.LJFF(), mediaModel.LJFF(), false, null, mediaModel.aigcInfo, mediaModel.date, 26508, null);
    }

    public static final boolean LJ(MediaModel mediaModel, String str) throws Throwable {
        C0VSJ c0vsj = new C0VSJ(str);
        if (c0vsj.exists()) {
            return true;
        }
        if (LJII(mediaModel)) {
            C201955140j.LJIILJJIL(C1662160tM6.LIZIZ, "image_upload_crop hit too large resize ab resize image");
            Bitmap bitmapLIZ = C2477909nN.LIZ(mediaModel.LJFF(), C1450870nrJ.LIZIZ() * 2, C1450870nrJ.LIZIZ() * 2, Bitmap.Config.RGB_565);
            if (bitmapLIZ != null) {
                boolean zLJFF = C2475009mu.LJFF(70, Bitmap.CompressFormat.JPEG, bitmapLIZ, c0vsj);
                if (C0L1C.LIZ()) {
                    C1446920nkw.LIZJ(mediaModel.LJFF(), str);
                }
                return zLJFF;
            }
        }
        return C2471909mP.LIZJ(mediaModel.LJFF(), str);
    }

    public static Bitmap LIZIZ(String str, int i, int i2) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        if (C2286708xd.LIZJ(str)) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
            if (TEImageInterface.convertBitmapWithRgba(bitmapCreateBitmap, str, 1).booleanValue()) {
                return bitmapCreateBitmap;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.creative.model.edit.SingleImageData LIZLLL(com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r48, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r49, int r50) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C574070MfN.LIZLLL(com.ss.android.ugc.aweme.mediachoose.helper.MediaModel, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, int):com.ss.android.ugc.aweme.creative.model.edit.SingleImageData");
    }

    public static final void LIZ(CreativeInfo creativeInfo, CreativeModel creativeModel, ImageAlbumData imageAlbumData, Map map, Function0 function0) {
        C15O7.LIZJ(new ACallableS35S0500000_22(creativeInfo, creativeModel, imageAlbumData, map, function0, 0));
    }

    public static final C2472609mW LJFF(final String str, final int i, final int i2, final Bitmap.Config config, final Function1<? super Bitmap, Unit> function1) {
        C2472609mW c2472609mW = new C2472609mW();
        C15O7.LIZIZ(new Callable() { // from class: X.09pC
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("ImageModeExtKt@da1.getBitmap$1");
                Bitmap bitmapLIZIZ = u.LJIIZILJ(str, ".raw", false) ? C574070MfN.LIZIZ(str, i, i2) : C2477909nN.LIZJ(str, i, i2, config);
                if (bitmapLIZIZ != null) {
                    function1.invoke(bitmapLIZIZ);
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ImageModeExtKt@da1.getBitmap$1");
                return unit;
            }
        }, C15O7.LJI, c2472609mW.LIZ());
        return c2472609mW;
    }

    public static C2472609mW LJI(String str, int i, int i2, Bitmap.Config config, Function1 function1, int i3) {
        if ((i3 & 2) != 0) {
            i = C1450870nrJ.LIZIZ();
        }
        if ((i3 & 4) != 0) {
            i2 = C1450870nrJ.LIZIZ();
        }
        if ((i3 & 8) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return LJFF(str, i, i2, config, function1);
    }
}
