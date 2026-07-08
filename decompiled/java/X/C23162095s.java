package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.PictureInfoOpt;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.UploadInfoOpt;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.vesdk.VEUtils;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS369S0200000_3;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.095s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.sdk.smartmovie.core.SmartMovieMediaProcessor$extractorFrame$2", f = "SmartMovieMediaProcessor.kt", l = {380}, m = "invokeSuspend")
public final class C23162095s extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super PictureInfoOpt>, Object> {
    public PictureInfoOpt LL;
    public Object LLILLJJLI;
    public C0VSJ LLILLL;
    public int LLILZ;
    public final /* synthetic */ UploadInfoOpt LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23162095s(UploadInfoOpt uploadInfoOpt, String str, InterfaceC1364105Vn<? super C23162095s> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = uploadInfoOpt;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C23162095s(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super PictureInfoOpt> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        PictureInfoOpt pictureInfoOpt;
        String str;
        String strLIZIZ;
        C0VSJ c0vsj;
        int i;
        int i2;
        Bitmap.CompressFormat compressFormat;
        Object objLJIJ = obj;
        C1C7U.LIZ("SmartMovieMediaProcessor@7e98.extractorFrame$2");
        Object objLJFF = C099R.LJFF();
        int i3 = this.LLILZ;
        if (i3 != 0) {
            if (i3 == 1) {
                c0vsj = this.LLILLL;
                strLIZIZ = (String) this.LLILLJJLI;
                pictureInfoOpt = this.LL;
                C155000ia.LIZIZ(objLJIJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIJ);
            AnonymousClass0968 anonymousClass0968 = AnonymousClass0968.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SmartMovieMediaProcessor extractorFrame: uploadInfo = ");
            sbLIZ.append(this.LLILZIL);
            sbLIZ.append(", extra = ");
            sbLIZ.append(this.LLILZLL);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            LogLevel logLevel = LogLevel.LEVEL_INFO;
            anonymousClass0968.getClass();
            AnonymousClass0968.LIZ(logLevel, strLIZIZ2);
            C096N c096n = C096N.LIZ;
            String str2 = this.LLILZLL;
            c096n.getClass();
            CreativeInfo creativeInfoLIZJ = C096N.LIZJ(str2);
            if (creativeInfoLIZJ == null) {
                PictureInfoOpt pictureInfoOpt2 = new PictureInfoOpt(false, false, 0L, 0L, "", 0, 0, 0, false, 0, 0, "", 0L, null);
                C1C7U.LIZIZ("SmartMovieMediaProcessor@7e98.extractorFrame$2");
                return pictureInfoOpt2;
            }
            pictureInfoOpt = new PictureInfoOpt(false, false, 0L, 0L, "", 0, 0, 0, false, 0, 0, "", 0L, null);
            UploadInfoOpt uploadInfoOpt = this.LLILZIL;
            pictureInfoOpt.setVideo(uploadInfoOpt.isVideo());
            pictureInfoOpt.setPath(uploadInfoOpt.path);
            pictureInfoOpt.setDuration(uploadInfoOpt.duration);
            pictureInfoOpt.setFrameTimeStamp(uploadInfoOpt.frameTimeStamp);
            pictureInfoOpt.setNeedFeature(uploadInfoOpt.needFeature);
            pictureInfoOpt.setWidth(uploadInfoOpt.width);
            pictureInfoOpt.setHeight(uploadInfoOpt.height);
            String str3 = pictureInfoOpt.path;
            long j = pictureInfoOpt.duration;
            long j2 = pictureInfoOpt.frameTimeStamp;
            String strLJI = C527950KnB.LJI();
            if (!Intrinsics.LJFF(strLJI, "png") && Intrinsics.LJFF(strLJI, "webp")) {
                str = ".webp";
            } else {
                str = ".png";
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(s.LJIIL(creativeInfoLIZJ));
            sbLIZ2.append(C2084808Es.LIZ(str3));
            sbLIZ2.append('_');
            sbLIZ2.append(j2);
            sbLIZ2.append('_');
            sbLIZ2.append(j);
            sbLIZ2.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            c0vsj = new C0VSJ(strLIZIZ);
            if (c0vsj.exists() && c0vsj.length() >= 1024) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                C2471909mP.LJ(strLIZIZ, options);
                pictureInfoOpt.setResizeWidth(options.outWidth);
                pictureInfoOpt.setResizeHeight(options.outHeight);
                pictureInfoOpt.setResizePath(strLIZIZ);
                C1C7U.LIZIZ("SmartMovieMediaProcessor@7e98.extractorFrame$2");
                return pictureInfoOpt;
            }
            UploadInfoOpt uploadInfoOpt2 = this.LLILZIL;
            this.LL = pictureInfoOpt;
            this.LLILLJJLI = strLIZIZ;
            this.LLILLL = c0vsj;
            this.LLILZ = 1;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final AwS369S0200000_3 awS369S0200000_3 = new AwS369S0200000_3(atomicBoolean, c2252611DEt, 15);
            if (uploadInfoOpt2.isVideo()) {
                int i4 = uploadInfoOpt2.width;
                int i5 = uploadInfoOpt2.height;
                if (i4 > i5) {
                    i2 = (int) (256 * (i4 / i5));
                    i = 256;
                } else {
                    i = (int) (256 * (i5 / i4));
                    i2 = 256;
                }
                VEUtils.getVideoFrames(uploadInfoOpt2.path, new int[]{(int) uploadInfoOpt2.frameTimeStamp}, i2, i, false, new InterfaceC1286300jZs() { // from class: X.095t
                    public final /* synthetic */ int LIZIZ = 256;

                    @Override // X.InterfaceC1286300jZs
                    public final boolean processFrame(ByteBuffer byteBuffer, int i6, int i7, int i8) {
                        if (byteBuffer == null) {
                            awS369S0200000_3.invoke(null);
                            return false;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i6, i7, Bitmap.Config.ARGB_8888);
                        bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
                        awS369S0200000_3.invoke(C2473409me.LIZ(bitmapCreateBitmap, 0, this.LIZIZ));
                        return false;
                    }
                });
            } else {
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inJustDecodeBounds = false;
                options2.inSampleSize = C097U.LIZ(options2, 256, 256);
                Bitmap bitmapLIZLLL = C2471909mP.LIZLLL(uploadInfoOpt2.path, options2);
                if (bitmapLIZLLL != null) {
                    awS369S0200000_3.invoke(C2473409me.LIZ(bitmapLIZLLL, uploadInfoOpt2.rotation, 256));
                } else {
                    awS369S0200000_3.invoke(null);
                }
            }
            c2252611DEt.LJJII(new AwS582S0100000_3(atomicBoolean, 99));
            objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("SmartMovieMediaProcessor@7e98.extractorFrame$2");
                return objLJFF;
            }
        }
        Bitmap bitmap = (Bitmap) objLJIJ;
        if (bitmap == null) {
            C1C7U.LIZIZ("SmartMovieMediaProcessor@7e98.extractorFrame$2");
            return pictureInfoOpt;
        }
        pictureInfoOpt.setResizeWidth(bitmap.getWidth());
        pictureInfoOpt.setResizeHeight(bitmap.getHeight());
        String strLJI2 = C527950KnB.LJI();
        if (!Intrinsics.LJFF(strLJI2, "png") && Intrinsics.LJFF(strLJI2, "webp")) {
            compressFormat = Bitmap.CompressFormat.WEBP;
        } else {
            compressFormat = Bitmap.CompressFormat.PNG;
        }
        C2477909nN.LJFF(bitmap, strLIZIZ, compressFormat, C0C64.LJIILLIIL().LJIJ(31744, 100, "autocut_frame_upload_quality", true));
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        if (c0vsj.exists() && c0vsj.length() >= 1024) {
            pictureInfoOpt.setResizePath(strLIZIZ);
        }
        C1C7U.LIZIZ("SmartMovieMediaProcessor@7e98.extractorFrame$2");
        return pictureInfoOpt;
    }
}
