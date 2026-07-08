package X;

import android.content.Context;
import com.bytedance.ilasdk.api.MaterialScanService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.AVApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS582S0100000_3;
import njp.a;

/* JADX INFO: renamed from: X.08rf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.understanding.tasks.LocalEmbScanTask$run$1$initOk$1", f = "LocalEmbScanTask.kt", l = {111}, m = "invokeSuspend")
public final class C2249708rf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ C2250008ri LLILLJJLI;
    public final /* synthetic */ MaterialScanService LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2249708rf(C2250008ri c2250008ri, MaterialScanService materialScanService, InterfaceC1364105Vn<? super C2249708rf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2250008ri;
        this.LLILLL = materialScanService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2249708rf(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        Object objLJIJ = obj;
        C1C7U.LIZ("LocalEmbScanTask@bf5b.run$1$initOk$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(objLJIJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIJ);
            C2250008ri c2250008ri = this.LLILLJJLI;
            MaterialScanService materialScanService = this.LLILLL;
            this.LL = 1;
            c2250008ri.getClass();
            if (materialScanService.isInitialized()) {
                objLJIJ = true;
            } else {
                C844470XAv.LIZ.getClass();
                Context contextLIZ = C844470XAv.LIZ();
                int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
                if (iAvailableProcessors < 1) {
                    i = 1;
                } else {
                    i = iAvailableProcessors;
                    if (iAvailableProcessors > 4) {
                        i = 4;
                    }
                }
                int iLJ = C13LZ.LJ(C0C64.LJIILLIIL().LJIJ(31744, 2, "local_emb_cv_thread_num", true), 1, i);
                C1673840tew c1673840tew = C1673840tew.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LocalEmbScanTask sdk init config: cpuCores=");
                sbLIZ.append(iAvailableProcessors);
                sbLIZ.append(", cvThreads=");
                sbLIZ.append(iLJ);
                C201955140j.LJIILJJIL(c1673840tew, C2188811AlT.LIZIZ(sbLIZ));
                String strValueOf = String.valueOf(C844470XAv.LJIIJ);
                String str = C844470XAv.LJ;
                String strLIZ = null;
                if (str == null) {
                    str = null;
                }
                String strLJFF = C844470XAv.LJFF();
                String str2 = C844470XAv.LJIILL;
                String absolutePath = C786410Ut5.w2(contextLIZ).getAbsolutePath();
                AVApi aVApi = (AVApi) PluggableExtentionKt.pluggableSpi$default(AVApi.class, false, false, false, 14, null);
                if (aVApi != null) {
                    strLIZ = aVApi.LIZ();
                }
                int iLIZLLL = materialScanService.LIZLLL(contextLIZ, new C2249808rg(strValueOf, str, strLJFF, str2, "phone", "Android", absolutePath, iLJ, true, true, strLIZ, 7680));
                if (iLIZLLL != 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("LocalEmbScanTask init failed code=");
                    sbLIZ2.append(iLIZLLL);
                    C201955140j.LJIIJ(c1673840tew, C2188811AlT.LIZIZ(sbLIZ2), new Throwable("LocalEmbScanTask init failed"));
                    objLJIJ = false;
                } else {
                    C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
                    c2252611DEt.LJIJJ();
                    materialScanService.LJIIIIZZ(new C5182020e(c2252611DEt, 185), new AwS582S0100000_3(c2252611DEt, 78));
                    objLJIJ = c2252611DEt.LJIJ();
                    if (objLJIJ == C099R.LJFF()) {
                        C099Q.LIZJ(this);
                    }
                }
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("LocalEmbScanTask@bf5b.run$1$initOk$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("LocalEmbScanTask@bf5b.run$1$initOk$1");
        return objLJIJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
