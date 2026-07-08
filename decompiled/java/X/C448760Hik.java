package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.algorithm.VEFaceDetectCropResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hik, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler$cropAndGetInformation$2", f = "AIGCPictureHandler.kt", l = {}, m = "invokeSuspend")
public final class C448760Hik extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super VEFaceDetectCropResult>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ AIGCPictureHandler LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C448760Hik(String str, AIGCPictureHandler aIGCPictureHandler, String str2, String str3, String str4, InterfaceC1364105Vn<? super C448760Hik> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = aIGCPictureHandler;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C448760Hik(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCPictureHandler@13c6.cropAndGetInformation$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0HLZ c0hlz = new C0HLZ();
        String str = this.LL;
        AIGCPictureHandler aIGCPictureHandler = this.LLILLJJLI;
        String str2 = this.LLILLL;
        String str3 = this.LLILZ;
        String str4 = this.LLILZIL;
        c0hlz.picturePath = str;
        c0hlz.LIZ = aIGCPictureHandler.isFastPath;
        if (str2 != null) {
            c0hlz.LIZIZ = str2;
        }
        if (str3 != null) {
            c0hlz.LIZJ = str3;
        }
        if (str4 != null) {
            c0hlz.LIZLLL = str4;
        }
        VEFaceDetectCropResult vEFaceDetectCropResultScanPicture = VEUtils.scanPicture(c0hlz);
        C1C7U.LIZIZ("AIGCPictureHandler@13c6.cropAndGetInformation$2");
        return vEFaceDetectCropResultScanPicture;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super VEFaceDetectCropResult> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
