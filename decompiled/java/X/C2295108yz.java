package X;

import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.PictureInfoOpt;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.UploadInfoOpt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08yz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.sdk.smartmovie.interop.AlgorithmSystemManagerExt$compressAndSave$2$results$1$1", f = "AlgorithmSystemManagerExt.kt", l = {74, 76}, m = "invokeSuspend")
public final class C2295108yz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super PictureInfoOpt>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ UploadInfoOpt LLILLL;
    public final /* synthetic */ C2294808yw LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2295108yz(UploadInfoOpt uploadInfoOpt, C2294808yw c2294808yw, String str, InterfaceC1364105Vn<? super C2295108yz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = uploadInfoOpt;
        this.LLILZ = c2294808yw;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2295108yz c2295108yz = new C2295108yz(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c2295108yz.LLILLJJLI = obj;
        return c2295108yz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJI = obj;
        C1C7U.LIZ("AlgorithmSystemManagerExt@93da.compressAndSave$2$results$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1 || i == 2) {
                C155000ia.LIZIZ(objLJI);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            if (!C2296808zG.LJI((InterfaceC497601wk) this.LLILLJJLI)) {
                PictureInfoOpt pictureInfoOpt = new PictureInfoOpt(false, false, 0L, 0L, "", 0, 0, 0, false, 0, 0, "", 0L, null);
                C1C7U.LIZIZ("AlgorithmSystemManagerExt@93da.compressAndSave$2$results$1$1");
                return pictureInfoOpt;
            }
            UploadInfoOpt uploadInfoOpt = this.LLILLL;
            if (uploadInfoOpt.needFeature) {
                C2294808yw c2294808yw = this.LLILZ;
                String str = this.LLILZIL;
                this.LL = 1;
                objLJI = c2294808yw.LIZIZ(uploadInfoOpt, str, this);
                if (objLJI == objLJFF) {
                    C1C7U.LIZIZ("AlgorithmSystemManagerExt@93da.compressAndSave$2$results$1$1");
                    return objLJFF;
                }
            } else {
                C096N c096n = C096N.LIZ;
                String str2 = this.LLILZIL;
                this.LL = 2;
                c096n.getClass();
                objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C23162095s(uploadInfoOpt, str2, null));
                if (objLJI == objLJFF) {
                    C1C7U.LIZIZ("AlgorithmSystemManagerExt@93da.compressAndSave$2$results$1$1");
                    return objLJFF;
                }
            }
        }
        C1C7U.LIZIZ("AlgorithmSystemManagerExt@93da.compressAndSave$2$results$1$1");
        return objLJI;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super PictureInfoOpt> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
