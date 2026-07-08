package X;

import Y.ACallableS250S0200000_22;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.EditImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.StoryMultiImageParams;
import com.ss.android.ugc.aweme.creative.model.edit.crop.CropData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.io.File;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS101S0210000_22;
import kotlin.jvm.internal.AwS32S0200100_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS81S0500000_22;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0nrQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1450940nrQ {
    public final ImageView LIZ;
    public final SingleImageData LIZIZ;
    public final ImageAlbumData LIZJ;
    public final int LIZLLL;
    public final Context LJ;
    public final CreativeInfo LJFF;
    public final CreativeModel LJI;
    public final VideoPublishEditModel LJII;
    public final InterfaceC1451100nrg LJIIIIZZ;
    public Bitmap LJIIIZ;
    public boolean LJIIJ;
    public C2472609mW LJIIJJI;
    public C2472609mW LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ = true;

    public final void LIZLLL() {
        this.LJIIZILJ = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hide: position=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(" isDragging=");
        sbLIZ.append(false);
        sbLIZ.append(" imageViewVisible=");
        sbLIZ.append(this.LIZ.getVisibility());
        LJFF("ImageViewManager", C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.LJZI(8, this.LIZ);
    }

    public final boolean LIZJ() {
        return this.LJIIIZ != null ? this.LJIIJ : this.LIZIZ.getEditImageInfo().isLocalImageWithEnhance();
    }

    public final void LJ() {
        StoryMultiImageParams storyMultiImageParams = this.LIZIZ.getEditImageInfo().getStoryMultiImageParams();
        CropData cropData = this.LIZIZ.getEditImageInfo().getCropData();
        boolean z = true;
        boolean z2 = storyMultiImageParams != null && storyMultiImageParams.getBgColorStart() != null && storyMultiImageParams.getCropScale() == null && (cropData != null && cropData.isPhotoCropped());
        String tempSynthesisPath = this.LIZIZ.getEditImageInfo().getTempSynthesisPath();
        if (C123100dR.LIZ(tempSynthesisPath) && (C0C64.LJIILLIIL().LJIIIZ(31744, "image_first_frame_use_temp", true, true) || z2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadFirstFrameOpt use tempSynthesisPath isStoryPostCrop=");
            sbLIZ.append(z2);
            LJFF("ImageViewManager", C2188811AlT.LIZIZ(sbLIZ));
            this.LIZ.setImageURI(UriProtector.parse(tempSynthesisPath));
            C786410Ut5.LJZI(0, this.LIZ);
            return;
        }
        int iLJ = C1450870nrJ.LJ();
        ImportVideoInfo originAlbumImageData = this.LIZIZ.getOriginAlbumImageData();
        int videoWidth = originAlbumImageData != null ? originAlbumImageData.getVideoWidth() : this.LIZIZ.getSrcImageInfo().getWidth();
        ImportVideoInfo originAlbumImageData2 = this.LIZIZ.getOriginAlbumImageData();
        int videoHeight = originAlbumImageData2 != null ? originAlbumImageData2.getVideoHeight() : this.LIZIZ.getSrcImageInfo().getHeight();
        String str = this.LIZIZ.getCameraPhotoInfo() != null ? "camera" : "album";
        Pair pairLIZ = C1450870nrJ.LIZ(videoWidth, videoHeight);
        int iIntValue = ((Number) pairLIZ.getFirst()).intValue();
        int iIntValue2 = ((Number) pairLIZ.getSecond()).intValue();
        if (iIntValue == videoWidth && iIntValue2 == videoHeight) {
            z = false;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("loadFirstFrameOpt src=");
        sbLIZ2.append(str);
        sbLIZ2.append(" original=");
        sbLIZ2.append(videoWidth);
        sbLIZ2.append('x');
        sbLIZ2.append(videoHeight);
        sbLIZ2.append(" clamped=");
        sbLIZ2.append(iIntValue);
        sbLIZ2.append('x');
        sbLIZ2.append(iIntValue2);
        sbLIZ2.append(" maxSide=");
        sbLIZ2.append(iLJ);
        sbLIZ2.append(" needDowngrade=");
        sbLIZ2.append(z);
        LJFF("ImageViewManager", C2188811AlT.LIZIZ(sbLIZ2));
        if (!z) {
            C1450070nq1.LJFF(this.LIZLLL, videoWidth, videoHeight, iLJ, str);
            this.LIZ.setImageURI(UriProtector.parse(this.LIZIZ.getSrcImageInfo().getPath()));
            C786410Ut5.LJZI(0, this.LIZ);
            return;
        }
        C1450070nq1.LJ(this.LIZLLL, videoWidth, videoHeight, iIntValue, str, iIntValue2, iLJ);
        Bitmap bitmapLIZIZ = u.LJIIZILJ(this.LIZIZ.getSrcImageInfo().getPath(), ".raw", false) ? C574070MfN.LIZIZ(this.LIZIZ.getSrcImageInfo().getPath(), iLJ, iLJ) : C2477909nN.LIZJ(this.LIZIZ.getSrcImageInfo().getPath(), iLJ, iLJ, Bitmap.Config.RGB_565);
        if (this.LJIILJJIL || bitmapLIZIZ == null) {
            return;
        }
        int i = this.LIZLLL;
        int width = bitmapLIZIZ.getWidth();
        int height = bitmapLIZIZ.getHeight();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("bitmap_decoded: index=");
        sbLIZ3.append(i);
        sbLIZ3.append(", decoded=");
        sbLIZ3.append(width);
        sbLIZ3.append('x');
        sbLIZ3.append(height);
        sbLIZ3.append(", target=");
        sbLIZ3.append(iIntValue);
        sbLIZ3.append('x');
        sbLIZ3.append(iIntValue2);
        C1450070nq1.LIZIZ("ImageEdit#CompileResolution", C2188811AlT.LIZIZ(sbLIZ3));
        Bitmap bitmapLJIIJ = C297700Blg.LIZ() ? LJIIJ(bitmapLIZIZ) : bitmapLIZIZ;
        this.LIZ.setImageBitmap(bitmapLJIIJ);
        if (bitmapLJIIJ != bitmapLIZIZ) {
            bitmapLIZIZ.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapLIZIZ);
        }
        C786410Ut5.LJZI(0, this.LIZ);
    }

    public final void LJIIIZ() throws Throwable {
        Bitmap bitmap = this.LJIIIZ;
        if (bitmap == null) {
            return;
        }
        C2488709p7 c2488709p7 = C2488709p7.LIZ;
        int i = this.LIZLLL;
        c2488709p7.getClass();
        String strLJIIIIZZ = C2488709p7.LJIIIIZZ(i);
        File fileLIZIZ = C2489809pI.LIZIZ(this.LJFF);
        boolean zLJIIL = C2488709p7.LJIIL(bitmap, fileLIZIZ.getPath(), strLJIIIIZZ);
        if (zLJIIL) {
            EditImageInfo editImageInfo = this.LIZIZ.getEditImageInfo();
            editImageInfo.setTempSynthesisPath(new C0VSJ(fileLIZIZ, strLJIIIIZZ).getPath(), !C0CHQ.LIZ().LJJIIJZLJL().LIZ());
            editImageInfo.setBitmapWidth(bitmap.getWidth());
            editImageInfo.setBitmapHeight(bitmap.getHeight());
            editImageInfo.setNeedCompileLocalImage(false);
            editImageInfo.setLocalImageWithEnhance(this.LJIIJ);
            this.LIZIZ.getFilterInfo().setNeedRender(false);
        }
        LJI(new C0VSJ(fileLIZIZ, strLJIIIIZZ).getPath(), zLJIIL);
        if (C297370Bl9.LIZ()) {
            return;
        }
        this.LJIIIZ = null;
    }

    public final void LIZIZ(boolean z) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("destroy needSaveImage");
        sbLIZ.append(z);
        LJFF("ImageViewManager", C2188811AlT.LIZIZ(sbLIZ));
        C2472609mW c2472609mW = this.LJIIJJI;
        if (c2472609mW != null) {
            c2472609mW.cancel();
        }
        this.LJIIJJI = null;
        if (this.LJIILLIIL && this.LJIIIZ == null) {
            C2488709p7 c2488709p7 = C2488709p7.LIZ;
            ImageView imageView = this.LIZ;
            c2488709p7.getClass();
            Drawable drawable = imageView.getDrawable();
            if ((drawable instanceof BitmapDrawable) && (bitmapDrawable = (BitmapDrawable) drawable) != null) {
                bitmap = bitmapDrawable.getBitmap();
            } else {
                bitmap = null;
            }
            imageView.setImageURI(null);
            if (bitmap != null) {
                bitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
            }
            C786410Ut5.LJZI(8, imageView);
        }
        Bitmap bitmap2 = this.LJIIIZ;
        if (bitmap2 != null) {
            this.LIZ.setImageURI(null);
            if (!z) {
                bitmap2.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap2);
                this.LJIIIZ = null;
            } else {
                C15O7.LIZJ(new ACallableS250S0200000_22(this, new AwS566S0100000_22(bitmap2, 174), 2));
            }
        }
        this.LJIILL = true;
    }

    public final Bitmap LJIIJ(Bitmap bitmap) {
        boolean z;
        int screenWidth;
        int screenHeight;
        if (bitmap.isRecycled()) {
            return bitmap;
        }
        Integer numValueOf = Integer.valueOf(this.LIZ.getWidth());
        boolean z2 = false;
        if (numValueOf.intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        Integer num = null;
        if (!z) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            screenWidth = numValueOf.intValue();
        } else {
            screenWidth = ScreenUtils.getScreenWidth(this.LJ);
        }
        Integer numValueOf2 = Integer.valueOf(this.LIZ.getHeight());
        if (numValueOf2.intValue() > 0) {
            z2 = true;
        }
        if (z2) {
            num = numValueOf2;
        }
        if (num != null) {
            screenHeight = num.intValue();
        } else {
            screenHeight = ScreenUtils.getScreenHeight(this.LJ);
        }
        if (screenWidth > 0 && screenHeight > 0) {
            if (bitmap.getWidth() <= screenWidth && bitmap.getHeight() <= screenHeight) {
                return bitmap;
            }
            float fMin = Math.min(screenWidth / bitmap.getWidth(), screenHeight / bitmap.getHeight());
            if (fMin >= 1.0f) {
                return bitmap;
            }
            int width = (int) (bitmap.getWidth() * fMin);
            if (width < 1) {
                width = 1;
            }
            int height = (int) (bitmap.getHeight() * fMin);
            if (height < 1) {
                height = 1;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("scaleBitmapToFitView: ");
            sbLIZ.append(bitmap.getWidth());
            sbLIZ.append('x');
            sbLIZ.append(bitmap.getHeight());
            sbLIZ.append(" -> ");
            sbLIZ.append(width);
            sbLIZ.append('x');
            sbLIZ.append(height);
            sbLIZ.append(", view=");
            sbLIZ.append(screenWidth);
            sbLIZ.append('x');
            sbLIZ.append(screenHeight);
            sbLIZ.append(", scale=");
            sbLIZ.append(fMin);
            LJFF("ImageViewManager", C2188811AlT.LIZIZ(sbLIZ));
            try {
                bitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
                return bitmap;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return bitmap;
    }

    public final boolean LJIIJJI(float f) {
        CropData cropData;
        if (!((Boolean) C0APY.LIZ.getValue()).booleanValue() || !C568750MSj.LIZ(this.LJI) || !this.LJI.postPageModel.fromPublishPageEditBtn || (((cropData = this.LIZIZ.getEditImageInfo().getCropData()) != null && cropData.isPhotoCropped()) || !C1450870nrJ.LJIIJ(f))) {
            return false;
        }
        return true;
    }

    public final void LJIIL(Function0<Unit> function0) {
        boolean z;
        Bitmap.Config config;
        int width;
        int height;
        String str;
        String tempSynthesisMiniPath;
        Bitmap.Config config2;
        Bitmap.Config config3;
        String path;
        String path2;
        Bitmap.Config config4;
        Bitmap.Config config5;
        this.LJIIZILJ = false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show: position=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(" latestBitmap=");
        if (this.LJIIIZ != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(" tempSynthesisPath=");
        sbLIZ.append(this.LIZIZ.getEditImageInfo().getTempSynthesisPath());
        sbLIZ.append(" needCompileNle=");
        sbLIZ.append(this.LIZIZ.getEditImageInfo().getNeedCompileNle());
        LJFF("ImageViewManager", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LJIJ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("show: !isChanged, just show imageView position=");
            sbLIZ2.append(this.LIZLLL);
            LJFF("ImageViewManager", C2188811AlT.LIZIZ(sbLIZ2));
            C786410Ut5.LJZI(0, this.LIZ);
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.LJIIIZ != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("show: latestBitmap not null, realLoadImage position=");
            sbLIZ3.append(this.LIZLLL);
            LJFF("ImageViewManager", C2188811AlT.LIZIZ(sbLIZ3));
            Bitmap bitmap = this.LJIIIZ;
            if (bitmap != null) {
                LJIIIIZZ(bitmap, function0, 1, Long.valueOf(jCurrentTimeMillis));
                return;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        if (C123100dR.LIZ(this.LIZIZ.getEditImageInfo().getTempSynthesisPath())) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("show: by tempSynthesisPath=");
            sbLIZ4.append(this.LIZIZ.getEditImageInfo().getTempSynthesisPath());
            sbLIZ4.append(" position=");
            sbLIZ4.append(this.LIZLLL);
            sbLIZ4.append(" needCompileNle=");
            sbLIZ4.append(this.LIZIZ.getEditImageInfo().getNeedCompileNle());
            LJFF("ImageViewManager", C2188811AlT.LIZIZ(sbLIZ4));
            C2472609mW c2472609mW = this.LJIIJJI;
            if (c2472609mW != null) {
                c2472609mW.cancel();
            }
            this.LJIIJJI = null;
            if (this.LIZIZ.getEditImageInfo().getNeedCompileNle()) {
                LIZ(null, function0);
                return;
            }
            if (this.LIZJ.getAutoEnhanceOn() != this.LIZIZ.getEditImageInfo().isLocalImageWithEnhance()) {
                LIZ(Boolean.valueOf(this.LIZJ.getAutoEnhanceOn()), function0);
                return;
            }
            if (this.LIZIZ.getFilterInfo().getNeedRender()) {
                LIZ(null, function0);
                return;
            }
            if (C2286708xd.LIZJ(this.LIZIZ.getEditImageInfo().getTempSynthesisPath())) {
                String tempSynthesisPath = this.LIZIZ.getEditImageInfo().getTempSynthesisPath();
                if (tempSynthesisPath == null) {
                    return;
                }
                int bitmapWidth = this.LIZIZ.getEditImageInfo().getBitmapWidth();
                int bitmapHeight = this.LIZIZ.getEditImageInfo().getBitmapHeight();
                if (C2534909wZ.LIZ()) {
                    config5 = Bitmap.Config.RGB_565;
                } else {
                    config5 = Bitmap.Config.ARGB_8888;
                }
                this.LJIIJJI = C574070MfN.LJFF(tempSynthesisPath, bitmapWidth, bitmapHeight, config5, new AwS32S0200100_22(this, function0, jCurrentTimeMillis, 0));
                return;
            }
            LIZ(null, function0);
            return;
        }
        if (C568750MSj.LIZ(this.LJI)) {
            ImageSynthesisResult synthesisData = this.LIZIZ.getSynthesisData();
            if (synthesisData != null) {
                path = synthesisData.getPath();
            } else {
                path = null;
            }
            if (C123100dR.LIZ(path)) {
                LJFF("ImageViewManager", "show: by synthesisData");
                ImageSynthesisResult synthesisData2 = this.LIZIZ.getSynthesisData();
                if (synthesisData2 != null && (path2 = synthesisData2.getPath()) != null) {
                    int bitmapWidth2 = this.LIZIZ.getEditImageInfo().getBitmapWidth();
                    int bitmapHeight2 = this.LIZIZ.getEditImageInfo().getBitmapHeight();
                    if (C2534909wZ.LIZ()) {
                        config4 = Bitmap.Config.RGB_565;
                    } else {
                        config4 = Bitmap.Config.ARGB_8888;
                    }
                    this.LJIIJJI = C574070MfN.LJFF(path2, bitmapWidth2, bitmapHeight2, config4, new AwS32S0200100_22(this, function0, jCurrentTimeMillis, 1));
                    return;
                }
                return;
            }
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("show: else branch - get source image bitmap position=");
        sbLIZ5.append(this.LIZLLL);
        sbLIZ5.append(" srcPath=");
        sbLIZ5.append(this.LIZIZ.getSrcImageInfo().getPath());
        LJFF("ImageViewManager", C2188811AlT.LIZIZ(sbLIZ5));
        C2472609mW c2472609mW2 = this.LJIIJJI;
        if (c2472609mW2 != null) {
            c2472609mW2.cancel();
        }
        this.LJIIJJI = null;
        C2472609mW c2472609mW3 = this.LJIIL;
        if (c2472609mW3 != null) {
            c2472609mW3.cancel();
        }
        this.LJIIL = null;
        String tempSynthesisMiniPath2 = this.LIZIZ.getEditImageInfo().getTempSynthesisMiniPath();
        if (tempSynthesisMiniPath2 != null) {
            this.LJIILIIL = true;
            if (C2534909wZ.LIZ()) {
                config3 = Bitmap.Config.RGB_565;
            } else {
                config3 = Bitmap.Config.ARGB_8888;
            }
            this.LJIIL = C574070MfN.LJI(tempSynthesisMiniPath2, 0, 0, config3, new AwS32S0200100_22(this, function0, jCurrentTimeMillis, 2), 6);
        }
        if (this.LIZJ.getAutoEnhanceOn()) {
            LIZ(Boolean.valueOf(this.LIZJ.getAutoEnhanceOn()), function0);
            return;
        }
        if (this.LIZIZ.getFilterInfo().getNeedRender()) {
            LIZ(null, function0);
            return;
        }
        if (C1450950nrR.LIZ().getEnableLargeImageLoadOpt() && ((tempSynthesisMiniPath = this.LIZIZ.getEditImageInfo().getTempSynthesisMiniPath()) == null || tempSynthesisMiniPath.length() == 0)) {
            int largeImageLoadResizeWidth = C1450950nrR.LIZ().getLargeImageLoadResizeWidth();
            int largeImageLoadResizeHeight = C1450950nrR.LIZ().getLargeImageLoadResizeHeight();
            if (this.LIZIZ.getSrcImageInfo().getWidth() * this.LIZIZ.getSrcImageInfo().getHeight() * C1450950nrR.LIZ().getLargeImageLoadOptRatio() > largeImageLoadResizeWidth * largeImageLoadResizeHeight) {
                this.LJIILIIL = true;
                String path3 = this.LIZIZ.getSrcImageInfo().getPath();
                if (C2534909wZ.LIZ()) {
                    config2 = Bitmap.Config.RGB_565;
                } else {
                    config2 = Bitmap.Config.ARGB_8888;
                }
                this.LJIIL = C574070MfN.LJFF(path3, largeImageLoadResizeWidth, largeImageLoadResizeHeight, config2, new AwS32S0200100_22(this, function0, jCurrentTimeMillis, 3));
            }
        }
        if (C2534909wZ.LIZ()) {
            config = Bitmap.Config.RGB_565;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        if (C297700Blg.LIZ()) {
            ImportVideoInfo originAlbumImageData = this.LIZIZ.getOriginAlbumImageData();
            if (originAlbumImageData != null) {
                width = originAlbumImageData.getVideoWidth();
            } else {
                width = this.LIZIZ.getSrcImageInfo().getWidth();
            }
            ImportVideoInfo originAlbumImageData2 = this.LIZIZ.getOriginAlbumImageData();
            if (originAlbumImageData2 != null) {
                height = originAlbumImageData2.getVideoHeight();
            } else {
                height = this.LIZIZ.getSrcImageInfo().getHeight();
            }
            Pair pairLIZ = C1450870nrJ.LIZ(width, height);
            int iIntValue = ((Number) pairLIZ.getFirst()).intValue();
            int iIntValue2 = ((Number) pairLIZ.getSecond()).intValue();
            int iLJ = C1450870nrJ.LJ();
            if (this.LIZIZ.getCameraPhotoInfo() != null) {
                str = "camera";
            } else {
                str = "album";
            }
            if (iIntValue == width && iIntValue2 == height) {
                C1450070nq1.LJFF(this.LIZLLL, width, height, iLJ, str);
            } else {
                C1450070nq1.LJ(this.LIZLLL, width, height, iIntValue, str, iIntValue2, iLJ);
            }
            this.LJIIJJI = C574070MfN.LJFF(this.LIZIZ.getSrcImageInfo().getPath(), iLJ, iLJ, config, new AwS32S0200100_22(this, function0, jCurrentTimeMillis, 4));
            return;
        }
        this.LJIIJJI = C574070MfN.LJI(this.LIZIZ.getSrcImageInfo().getPath(), 0, 0, config, new AwS32S0200100_22(this, function0, jCurrentTimeMillis, 5), 6);
    }

    public static void LJI(String str, boolean z) {
        String str2;
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("path", str);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("success", str2);
        C2341909Fp.LIZ("save_bitmap_to_sd", c0lab.LIZ);
    }

    public final void LIZ(Boolean bool, Function0 function0) {
        LJFF("ImageViewManager", "compileTempImageForChange");
        if (this.LIZJ.getSurfaceData().getSurfaceViewHeight() <= 0) {
            C574070MfN.LJIIIZ(this.LIZJ.getSurfaceData());
        }
        C15O7.LIZJ(new ACallableS250S0200000_22(this, bool, 0)).LJ(new C1466880oH8(this, bool, function0, 0), C15O7.LJIIIIZZ, null);
    }

    public final void LJFF(String str, String str2) {
        C1450960nrS c1450960nrS = new AbstractC201949140d() { // from class: X.0nrS
        };
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append(' ');
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(" visible=");
        sbLIZ.append(this.LIZ.getVisibility());
        sbLIZ.append(" destroy=");
        sbLIZ.append(this.LJIILL);
        sbLIZ.append("  ");
        sbLIZ.append(this.LIZIZ.getId());
        C201955140j.LJIIIIZZ(c1450960nrS, str, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final synchronized void LJII(Bitmap bitmap, boolean z) {
        boolean z2;
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLatestImageGet: position=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(" bitmap=");
        if (bitmap != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ.append(z2);
        sbLIZ.append(" bitmapSize=");
        Integer numValueOf2 = null;
        if (bitmap == null) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(bitmap.getWidth());
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append('x');
        if (bitmap != null) {
            numValueOf2 = Integer.valueOf(bitmap.getHeight());
        }
        sbLIZ.append(numValueOf2);
        sbLIZ.append(" enhanceOn=");
        sbLIZ.append(z);
        LJFF("ImageViewManager", C2188811AlT.LIZIZ(sbLIZ));
        if (C297370Bl9.LIZ()) {
            C01TT.LIZLLL(new AwS101S0210000_22(this, bitmap, z, 1));
        } else {
            Bitmap bitmap2 = this.LJIIIZ;
            if (bitmap2 != null) {
                bitmap2.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap2);
            }
            this.LJIIIZ = bitmap;
            this.LJIIJ = z;
            this.LJIJ = true;
        }
    }

    public final void LJIIIIZZ(Bitmap bitmap, Function0<Unit> function0, Integer num, Long l) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("realLoadImage: position=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(" needHide=");
        sbLIZ.append(this.LJIIZILJ);
        sbLIZ.append(" destroy=");
        sbLIZ.append(this.LJIILL);
        sbLIZ.append(" bitmapRecycled=");
        sbLIZ.append(bitmap.isRecycled());
        sbLIZ.append(" bitmapSize=");
        sbLIZ.append(bitmap.getWidth());
        sbLIZ.append('x');
        sbLIZ.append(bitmap.getHeight());
        LJFF("ImageViewManager", C2188811AlT.LIZIZ(sbLIZ));
        if (num != null && num.intValue() == 1) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("bitmap_loaded_");
            sbLIZ2.append(this.LIZLLL);
            C2188811AlT.LIZIZ(sbLIZ2);
            C297700Blg.LIZ();
            C844470XAv c844470XAv = C844470XAv.LIZ;
            EnumC2143908ab enumC2143908ab = EnumC2143908ab.PRINT_MEMORY_IMAGE;
            c844470XAv.getClass();
            enumC2143908ab.name();
        }
        if (this.LJIILL || this.LJIIZILJ || bitmap.isRecycled()) {
            return;
        }
        C01TT.LIZLLL(new AwS81S0500000_22(bitmap, (Bitmap) this, (C1450940nrQ) l, (Long) num, (Integer) function0, (Function0<Unit>) 0));
    }

    public C1450940nrQ(ImageView imageView, SingleImageData singleImageData, ImageAlbumData imageAlbumData, int i, Context context, CreativeInfo creativeInfo, CreativeModel creativeModel, VideoPublishEditModel videoPublishEditModel, InterfaceC1451100nrg interfaceC1451100nrg) {
        this.LIZ = imageView;
        this.LIZIZ = singleImageData;
        this.LIZJ = imageAlbumData;
        this.LIZLLL = i;
        this.LJ = context;
        this.LJFF = creativeInfo;
        this.LJI = creativeModel;
        this.LJII = videoPublishEditModel;
        this.LJIIIIZZ = interfaceC1451100nrg;
    }
}
