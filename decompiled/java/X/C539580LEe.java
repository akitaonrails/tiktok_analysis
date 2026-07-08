package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.CompressConfig;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;
import com.ss.android.ugc.aweme.shortvideo.model.ReturnEcommerceCommentModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEUtils;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LEe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C539580LEe {
    public final Context LIZ;
    public final ShortVideoContext LIZIZ;
    public final InterfaceC1631620sYq<String, C539570LEd, List<ReturnEcommerceCommentModel>, Unit> LIZJ;
    public final List<ReturnEcommerceCommentModel> LIZLLL = new ArrayList();
    public final Float LJ;
    public final Integer LJFF;
    public final SimpleDateFormat LJI;
    public final C0LFI LJII;
    public volatile int LJIIIIZZ;
    public volatile AnonymousClass0956 LJIIIZ;
    public final String LJIIJ;
    public final C01GW LJIIJJI;
    public long LJIIL;

    public final void LIZ() {
        ((ArrayList) this.LIZLLL).clear();
        AnonymousClass0956 anonymousClass0956 = this.LJIIIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJIIL = 0L;
    }

    public final boolean LJ() {
        if ((this.LJ == null && this.LJIIJJI.getValue() == null) || Intrinsics.LIZLLL(this.LJ, 1.0f)) {
            return false;
        }
        return (Intrinsics.LIZLLL(this.LJ, 0.0f) && this.LJIIJJI.getValue() == null) ? false : true;
    }

    public final String LIZIZ() {
        Locale locale = Locale.getDefault();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("%s/VIDEO_%s");
        sbLIZ.append(".mp4");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LJI.format(new Date()));
        sbLIZ2.append('_');
        this.LJIIIIZZ++;
        sbLIZ2.append(this.LJIIIIZZ);
        return C786410Ut5.k4(locale, strLIZIZ, Arrays.copyOf(new Object[]{this.LJIIJ, C2188811AlT.LIZIZ(sbLIZ2)}, 2));
    }

    public C539580LEe(Context context, ShortVideoContext shortVideoContext, C539620LEi c539620LEi) {
        Float f;
        CompressConfig compressConfig;
        Float f2;
        CompressConfig compressConfig2;
        this.LIZ = context;
        this.LIZIZ = shortVideoContext;
        this.LIZJ = c539620LEi;
        RecordPageOptionalConfig recordPageOptionalConfig = shortVideoContext.creativeModel.initialModel.recordPageOptionalConfig;
        Integer numValueOf = null;
        if (recordPageOptionalConfig != null && (compressConfig2 = recordPageOptionalConfig.compressConfig) != null) {
            f = compressConfig2.videoCompress;
        } else {
            f = null;
        }
        this.LJ = f;
        if (recordPageOptionalConfig != null && (compressConfig = recordPageOptionalConfig.compressConfig) != null && (f2 = compressConfig.imageCompress) != null) {
            numValueOf = Integer.valueOf((int) (f2.floatValue() * 100));
        }
        this.LJFF = numValueOf;
        this.LJI = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
        C0LFI c0lfi = new C0LFI(shortVideoContext.creativeInfo);
        this.LJII = c0lfi;
        InterfaceC570310MYj pathService = C0CHQ.LIZ().LJJIIJZLJL().getPathService();
        CreativeInfo creativeInfo = shortVideoContext.creativeInfo;
        EnumC20228014Cw enumC20228014Cw = EnumC20228014Cw.RECORD_CACHE_FILE;
        String strLIZIZ = C2298208zU.LIZIZ(pathService, creativeInfo, enumC20228014Cw, "video", 8);
        this.LJIIJ = strLIZIZ;
        this.LJIIJJI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 184));
        String strLIZIZ2 = C2298208zU.LIZIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), shortVideoContext.creativeInfo, enumC20228014Cw, "photo", 8);
        c0lfi.LIZ = strLIZIZ2;
        C0VSJ c0vsj = new C0VSJ(strLIZIZ2);
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        c0lfi.LIZJ = Bitmap.CompressFormat.JPEG;
        C0VSJ c0vsj2 = new C0VSJ(strLIZIZ);
        if (!c0vsj2.exists()) {
            c0vsj2.mkdirs();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ReturnEcommerceCommentModel LIZJ(String str, TikTokMediaModel tikTokMediaModel, String str2, int i, String str3) {
        String strLJIJ;
        String string;
        C539580LEe c539580LEe;
        CameraComponentModel cameraComponentModel;
        Integer num;
        if (tikTokMediaModel != null) {
            strLJIJ = C2471909mP.LJIJ(tikTokMediaModel);
        } else {
            strLJIJ = str;
        }
        long jLJIIIZ = C2471909mP.LJIIIZ(strLJIJ);
        long jLJIIIZ2 = C2471909mP.LJIIIZ(strLJIJ);
        String strLJIJI = C2471909mP.LJIJI(strLJIJ);
        String str4 = "image/jpeg";
        if (strLJIJI == null) {
            strLJIJI = "image/jpeg";
        }
        String str5 = "photo";
        ReturnEcommerceCommentModel returnEcommerceCommentModel = new ReturnEcommerceCommentModel(i, strLJIJ, strLJIJ, Long.valueOf(jLJIIIZ), jLJIIIZ2, "photo", strLJIJ, strLJIJI);
        if (tikTokMediaModel != null) {
            int i2 = tikTokMediaModel.width;
            int i3 = tikTokMediaModel.height;
            string = new VESize(i2, i3).toString();
            c539580LEe = i3;
        } else {
            string = "";
            c539580LEe = jLJIIIZ;
        }
        try {
            str5 = str3;
            c539580LEe = this;
            cameraComponentModel = c539580LEe.LIZIZ.cameraComponentModel;
        } catch (OutOfMemoryError e) {
            e = e;
        }
        try {
            Bitmap bitmapLIZ = C2475309mx.LIZ(cameraComponentModel.mVideoWidth, cameraComponentModel.mVideoHeight, str);
            if (bitmapLIZ == null) {
                str5 = str5;
                C539630LEj.LIZJ(c539580LEe.LIZIZ, str, "photo", EnumC539610LEh.IMAGE_BITMAP_NULL, str5, System.currentTimeMillis() - c539580LEe.LJIIL, string);
                return returnEcommerceCommentModel;
            }
            Integer num2 = c539580LEe.LJFF;
            if (num2 != null && num2.intValue() != 0 && ((num = c539580LEe.LJFF) == null || num.intValue() != 100)) {
                boolean zLJFF = C2475309mx.LJFF(c539580LEe.LJFF.intValue(), Bitmap.CompressFormat.JPEG, bitmapLIZ, new C0VSJ(str2));
                bitmapLIZ.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmapLIZ);
                if (zLJFF) {
                    C539630LEj.LJFF(c539580LEe.LIZIZ, str, str2, "photo", str5, "photo_compress", System.currentTimeMillis() - c539580LEe.LJIIL, string);
                    long jLJIIIZ3 = C2471909mP.LJIIIZ(strLJIJ);
                    long jLJIIIZ4 = C2471909mP.LJIIIZ(str2);
                    String strLJIJI2 = C2471909mP.LJIJI(str2);
                    if (strLJIJI2 != null) {
                        str4 = strLJIJI2;
                    }
                    return new ReturnEcommerceCommentModel(i, strLJIJ, str2, Long.valueOf(jLJIIIZ3), jLJIIIZ4, "photo", str2, str4);
                }
                C539630LEj.LIZJ(c539580LEe.LIZIZ, str, "photo", EnumC539610LEh.IMAGE_SAVE_BITMAP_WRONG, str5, System.currentTimeMillis() - c539580LEe.LJIIL, string);
                return returnEcommerceCommentModel;
            }
            bitmapLIZ.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapLIZ);
            return returnEcommerceCommentModel;
        } catch (OutOfMemoryError e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            C539630LEj.LIZJ(c539580LEe.LIZIZ, str, "photo", EnumC539610LEh.IMAGE_BITMAP_OUT_OF_MEMORY_ERROR, str5, System.currentTimeMillis() - c539580LEe.LJIIL, string);
            return returnEcommerceCommentModel;
        }
    }

    public final Object LIZLLL(final int i, final String str, final String str2, final String str3, InterfaceC1364105Vn interfaceC1364105Vn) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        VEUtils.getVideoFrames(str2, new int[]{0}, 0, 0, false, new InterfaceC1286300jZs() { // from class: X.0LEf
            @Override // X.InterfaceC1286300jZs
            public final boolean processFrame(ByteBuffer byteBuffer, int i2, int i3, int i4) {
                String strLJIJI;
                if (byteBuffer == null) {
                    C539580LEe c539580LEe = this.LIZ;
                    C539630LEj.LIZJ(c539580LEe.LIZIZ, str2, "video", EnumC539610LEh.VIDEO_EXTRACT_FRAME_NULL, str3, System.currentTimeMillis() - c539580LEe.LJIIL, new VESize(i2, i3).toString());
                    InterfaceC1364105Vn<ReturnEcommerceCommentModel> interfaceC1364105Vn2 = c23260099m;
                    C189200o6.m2constructorimpl(null);
                    interfaceC1364105Vn2.resumeWith(null);
                    return false;
                }
                int iRemaining = byteBuffer.remaining();
                byteBuffer.get(new byte[iRemaining], 0, iRemaining);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
                String strLIZ = this.LIZ.LJII.LIZ();
                C2475309mx.LJFF(100, Bitmap.CompressFormat.JPEG, bitmapCreateBitmap, new C0VSJ(strLIZ));
                if (strLIZ.length() > 0 && C2286708xd.LIZJ(strLIZ)) {
                    strLJIJI = C2471909mP.LJIJI(strLIZ);
                    if (strLJIJI == null) {
                        strLJIJI = "image/jpeg";
                    }
                } else {
                    strLJIJI = "";
                }
                if (strLIZ.length() != 0 && C2286708xd.LIZJ(strLIZ)) {
                    C539580LEe c539580LEe2 = this.LIZ;
                    C539630LEj.LJFF(c539580LEe2.LIZIZ, str, str2, "video", str3, "video_extract_frame", System.currentTimeMillis() - c539580LEe2.LJIIL, new VESize(i2, i3).toString());
                } else {
                    C539580LEe c539580LEe3 = this.LIZ;
                    C539630LEj.LIZJ(c539580LEe3.LIZIZ, str2, "video", EnumC539610LEh.VIDEO_COVER_BIMAP_NULL, str3, System.currentTimeMillis() - c539580LEe3.LJIIL, new VESize(i2, i3).toString());
                }
                bitmapCreateBitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
                long jLJIIIZ = C2471909mP.LJIIIZ(str);
                ReturnEcommerceCommentModel returnEcommerceCommentModel = new ReturnEcommerceCommentModel(i, str, str2, Long.valueOf(jLJIIIZ), C2471909mP.LJIIIZ(str2), "video", strLIZ, strLJIJI);
                InterfaceC1364105Vn<ReturnEcommerceCommentModel> interfaceC1364105Vn3 = c23260099m;
                C189200o6.m2constructorimpl(returnEcommerceCommentModel);
                interfaceC1364105Vn3.resumeWith(returnEcommerceCommentModel);
                return false;
            }
        });
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public final Object LJFF(final String str, final TikTokMediaModel tikTokMediaModel, String str2, final String str3, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) throws Throwable {
        float fFloatValue;
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        C539520LDy c539520LDy = C539520LDy.LIZ;
        Context context = this.LIZ;
        String str4 = this.LJIIJ;
        Float f = this.LJ;
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        VESize vESize = (VESize) this.LJIIJJI.getValue();
        InterfaceC352610Ds3 interfaceC352610Ds3 = new InterfaceC352610Ds3(this) { // from class: X.0LEg
            public final /* synthetic */ C539580LEe LIZIZ;

            @Override // X.InterfaceC352610Ds3
            public final void LIZ() {
            }

            @Override // X.InterfaceC352610Ds3
            public final void LIZIZ(C352620Ds4 c352620Ds4) {
            }

            @Override // X.InterfaceC352610Ds3
            public final void onCancel() {
                String string;
                TikTokMediaModel tikTokMediaModel2 = tikTokMediaModel;
                String strLJIJ = tikTokMediaModel2 != null ? C2471909mP.LJIJ(tikTokMediaModel2) : str;
                if (tikTokMediaModel != null) {
                    TikTokMediaModel tikTokMediaModel3 = tikTokMediaModel;
                    string = new VESize(tikTokMediaModel3.width, tikTokMediaModel3.height).toString();
                } else {
                    string = "";
                }
                C539580LEe c539580LEe = this.LIZIZ;
                C539630LEj.LIZJ(c539580LEe.LIZIZ, strLJIJ, "video", EnumC539610LEh.VIDEO_COMPRESS_TASK_CANCEL, str3, System.currentTimeMillis() - c539580LEe.LJIIL, string);
                InterfaceC1364105Vn<String> interfaceC1364105Vn2 = c23260099m;
                C189200o6.m2constructorimpl(strLJIJ);
                interfaceC1364105Vn2.resumeWith(strLJIJ);
            }

            @Override // X.InterfaceC352610Ds3
            public final void onError(String str5) {
                String strLJIJ;
                String string;
                TikTokMediaModel tikTokMediaModel2 = tikTokMediaModel;
                if (tikTokMediaModel2 != null) {
                    strLJIJ = C2471909mP.LJIJ(tikTokMediaModel2);
                } else {
                    strLJIJ = str;
                }
                if (tikTokMediaModel != null) {
                    TikTokMediaModel tikTokMediaModel3 = tikTokMediaModel;
                    string = new VESize(tikTokMediaModel3.width, tikTokMediaModel3.height).toString();
                } else {
                    string = "";
                }
                C539580LEe c539580LEe = this.LIZIZ;
                C539630LEj.LIZJ(c539580LEe.LIZIZ, strLJIJ, "video", EnumC539610LEh.VIDEO_COMPRESS_TASK_ERROR, str3, System.currentTimeMillis() - c539580LEe.LJIIL, string);
                InterfaceC1364105Vn<String> interfaceC1364105Vn2 = c23260099m;
                C189200o6.m2constructorimpl(strLJIJ);
                interfaceC1364105Vn2.resumeWith(strLJIJ);
            }

            @Override // X.InterfaceC352610Ds3
            public final void onSuccess(String str5) {
                String string;
                if (tikTokMediaModel != null) {
                    TikTokMediaModel tikTokMediaModel2 = tikTokMediaModel;
                    string = new VESize(tikTokMediaModel2.width, tikTokMediaModel2.height).toString();
                } else {
                    string = "";
                }
                C539580LEe c539580LEe = this.LIZIZ;
                C539630LEj.LJFF(c539580LEe.LIZIZ, str, str5, "video", str3, "video_compress", System.currentTimeMillis() - c539580LEe.LJIIL, string);
                InterfaceC1364105Vn<String> interfaceC1364105Vn2 = c23260099m;
                C189200o6.m2constructorimpl(str5);
                interfaceC1364105Vn2.resumeWith(str5);
            }

            {
                this.LIZIZ = this;
            }
        };
        c539520LDy.getClass();
        C539520LDy.LIZ(context, str, str2, str4, fFloatValue, vESize, interfaceC352610Ds3);
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }
}
