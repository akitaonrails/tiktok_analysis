package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureUploadHandler;
import com.ss.android.vesdk.algorithm.VEFaceDetectCropResult;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hin, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureUploadHandler$cropAndCheckValid$tempResult$1", f = "AIGCPictureUploadHandler.kt", l = {472}, m = "invokeSuspend")
public final class C448790Hin extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AIGCPictureUploadHandler.HandleResult>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AIGCPictureUploadHandler LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ List<String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C448790Hin(AIGCPictureUploadHandler aIGCPictureUploadHandler, String str, List<String> list, InterfaceC1364105Vn<? super C448790Hin> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = aIGCPictureUploadHandler;
        this.LLILZ = str;
        this.LLILZIL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C448790Hin(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strLIZIZ;
        Object objLJI = obj;
        C1C7U.LIZ("AIGCPictureUploadHandler@a7fd.cropAndCheckValid$tempResult$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                strLIZIZ = (String) this.LL;
                C155000ia.LIZIZ(objLJI);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            this.LLILLL.getClass();
            this.LLILLL.getClass();
            this.LLILLL.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('/');
            sbLIZ.append(this.LLILZ.hashCode());
            sbLIZ.append("_slow.jpeg");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(AIGCPictureUploadHandler.LJIILL.getValue().LJ);
            String str = File.separator;
            sbLIZ2.append(str);
            sbLIZ2.append("AIGC");
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ2);
            C2286708xd.LJIIIIZZ(strLIZIZ3, false);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ3);
            sbLIZ3.append(str);
            sbLIZ3.append(strLIZIZ2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            AIGCPictureUploadHandler aIGCPictureUploadHandler = this.LLILLL;
            String str2 = this.LLILZ;
            this.LL = strLIZIZ;
            this.LLILLJJLI = 1;
            aIGCPictureUploadHandler.getClass();
            objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C448750Hij(str2, aIGCPictureUploadHandler, null, null, strLIZIZ, null));
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("AIGCPictureUploadHandler@a7fd.cropAndCheckValid$tempResult$1");
                return objLJFF;
            }
        }
        VEFaceDetectCropResult vEFaceDetectCropResult = (VEFaceDetectCropResult) objLJI;
        AIGCPictureUploadHandler.HandleResult handleResult = null;
        if (!this.LLILLL.LIZLLL && vEFaceDetectCropResult != null && vEFaceDetectCropResult.retCode == 0) {
            handleResult = new AIGCPictureUploadHandler.HandleResult(vEFaceDetectCropResult, null, null, strLIZIZ);
        } else {
            this.LLILZIL.add(this.LLILZ);
        }
        C1C7U.LIZIZ("AIGCPictureUploadHandler@a7fd.cropAndCheckValid$tempResult$1");
        return handleResult;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AIGCPictureUploadHandler.HandleResult> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
