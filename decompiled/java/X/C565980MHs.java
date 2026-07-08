package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0MHs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.util.PublishPageUtils$saveCustomOriginalContent$1", f = "PublishPageUtils.kt", l = {}, m = "invokeSuspend")
public final class C565980MHs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ InterfaceC1452170ntP LLILLJJLI;
    public final /* synthetic */ MediaModel LLILLL;
    public final /* synthetic */ C259800zU<String> LLILZ;
    public final /* synthetic */ VideoPublishEditModel LLILZIL;
    public final /* synthetic */ Context LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C565980MHs(String str, InterfaceC1452170ntP interfaceC1452170ntP, MediaModel mediaModel, C259800zU<String> c259800zU, VideoPublishEditModel videoPublishEditModel, Context context, InterfaceC1364105Vn<? super C565980MHs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = interfaceC1452170ntP;
        this.LLILLL = mediaModel;
        this.LLILZ = c259800zU;
        this.LLILZIL = videoPublishEditModel;
        this.LLILZLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C565980MHs(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [T, android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, android.graphics.Bitmap] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        int i2;
        InterfaceC1452170ntP interfaceC1452170ntP;
        C1C7U.LIZ("PublishPageUtils@13bc.saveCustomOriginalContent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C259800zU c259800zU = new C259800zU();
        if (Intrinsics.LJFF(this.LL, "fake_path_for_screen_34") && (interfaceC1452170ntP = this.LLILLJJLI) != null) {
            ?? currDisplayImage = interfaceC1452170ntP.getCurrDisplayImage();
            if (currDisplayImage != 0) {
                c259800zU.element = currDisplayImage;
            }
        } else if (!Intrinsics.LJFF(this.LL, "fake_path_for_screen_34")) {
            MediaModel mediaModel = this.LLILLL;
            if (mediaModel != null && this.LLILZ.element != null && C574070MfN.LJII(mediaModel)) {
                VideoPublishEditModel videoPublishEditModel = this.LLILZIL;
                MediaModel mediaModel2 = this.LLILLL;
                String str = this.LLILZ.element;
                if (C574070MfN.LJII(mediaModel2)) {
                    C1444060ngK.LIZLLL = mediaModel2;
                    Bitmap bitmapLIZ = C2477909nN.LIZ(mediaModel2.LJFF(), C1450870nrJ.LIZIZ() * 2, C1450870nrJ.LIZIZ() * 2, Bitmap.Config.RGB_565);
                    if (bitmapLIZ != null) {
                        if (C493401w4.LIZ()) {
                            C0MH8 c0mh8 = C0MH8.LIZ;
                            if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
                                i = 1001;
                            } else {
                                i = LSPassThroughRecordSizeConfig.DEFAULT;
                            }
                            c0mh8.getClass();
                            C0MH8.LJIJ(videoPublishEditModel, bitmapLIZ, i, 5, str, 100);
                        } else {
                            C2475009mu.LJFF(70, Bitmap.CompressFormat.JPEG, bitmapLIZ, new C0VSJ(str));
                        }
                    }
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("PublishPageUtils@13bc.saveCustomOriginalContent$1");
                return unit;
            }
            ?? LJFF = C1443400nfG.LJFF(this.LLILZLL, this.LL);
            if (LJFF == 0) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("PublishPageUtils@13bc.saveCustomOriginalContent$1");
                return unit2;
            }
            c259800zU.element = LJFF;
        }
        Bitmap bitmap = (Bitmap) c259800zU.element;
        if (bitmap != null && this.LLILZ.element != null) {
            if (C493401w4.LIZ()) {
                C0MH8 c0mh82 = C0MH8.LIZ;
                String str2 = this.LLILZ.element;
                VideoPublishEditModel videoPublishEditModel2 = this.LLILZIL;
                if (C1428470nHB.LJJZZI(videoPublishEditModel2)) {
                    i2 = 1001;
                } else {
                    i2 = LSPassThroughRecordSizeConfig.DEFAULT;
                }
                c0mh82.getClass();
                Boolean.valueOf(C0MH8.LJIJ(videoPublishEditModel2, bitmap, i2, 6, str2, 100));
            } else {
                C1443400nfG.LJIJJ(bitmap, this.LLILZ.element);
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("PublishPageUtils@13bc.saveCustomOriginalContent$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
