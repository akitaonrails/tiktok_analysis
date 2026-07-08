package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler;
import com.ss.android.vesdk.algorithm.VEFaceDetectCropResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hil, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler$checkValidAndUpload$continueRun$1$tempResult$1", f = "AIGCPictureHandler.kt", l = {277}, m = "invokeSuspend")
public final class C448770Hil extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AIGCPictureHandler.HandleResult>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ AIGCPictureHandler LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ List<String> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C448770Hil(AIGCPictureHandler aIGCPictureHandler, String str, List<String> list, InterfaceC1364105Vn<? super C448770Hil> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = aIGCPictureHandler;
        this.LLILZLL = str;
        this.LLIZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C448770Hil(this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZ;
        String strLIZ2;
        String strLIZ3;
        C1C7U.LIZ("AIGCPictureHandler@13c6.checkValidAndUpload$continueRun$1$tempResult$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        AIGCPictureHandler.HandleResult handleResult = null;
        if (i != 0) {
            if (i == 1) {
                strLIZ3 = (String) this.LLILLL;
                strLIZ2 = (String) this.LLILLJJLI;
                strLIZ = (String) this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILZIL.isFastPath) {
                C448800Hio c448800Hio = AIGCPictureHandler.Companion;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('/');
                sbLIZ.append(this.LLILZLL.hashCode());
                sbLIZ.append("_bingo.jpeg");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c448800Hio.getClass();
                strLIZ = C448800Hio.LIZ(strLIZIZ);
            } else {
                strLIZ = null;
            }
            if (this.LLILZIL.isFastPath) {
                C448800Hio c448800Hio2 = AIGCPictureHandler.Companion;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append('/');
                sbLIZ2.append(this.LLILZLL.hashCode());
                sbLIZ2.append("_smash.jpeg");
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c448800Hio2.getClass();
                strLIZ2 = C448800Hio.LIZ(strLIZIZ2);
            } else {
                strLIZ2 = null;
            }
            if (!this.LLILZIL.isFastPath) {
                C448800Hio c448800Hio3 = AIGCPictureHandler.Companion;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append('/');
                sbLIZ3.append(this.LLILZLL.hashCode());
                sbLIZ3.append("_slow.jpeg");
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                c448800Hio3.getClass();
                strLIZ3 = C448800Hio.LIZ(strLIZIZ3);
            } else {
                strLIZ3 = null;
            }
            AIGCPictureHandler aIGCPictureHandler = this.LLILZIL;
            String str = this.LLILZLL;
            this.LL = strLIZ;
            this.LLILLJJLI = strLIZ2;
            this.LLILLL = strLIZ3;
            this.LLILZ = 1;
            obj = aIGCPictureHandler.cropAndGetInformation(str, strLIZ, strLIZ2, strLIZ3, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AIGCPictureHandler@13c6.checkValidAndUpload$continueRun$1$tempResult$1");
                return objLJFF;
            }
        }
        VEFaceDetectCropResult vEFaceDetectCropResult = (VEFaceDetectCropResult) obj;
        if (vEFaceDetectCropResult != null && vEFaceDetectCropResult.retCode == 0) {
            handleResult = new AIGCPictureHandler.HandleResult(vEFaceDetectCropResult, strLIZ, strLIZ2, strLIZ3);
        } else {
            this.LLIZ.add(this.LLILZLL);
        }
        C1C7U.LIZIZ("AIGCPictureHandler@13c6.checkValidAndUpload$continueRun$1$tempResult$1");
        return handleResult;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AIGCPictureHandler.HandleResult> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
