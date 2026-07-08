package X;

import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.08z6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.sdk.smartmovie.interop.AlgorithmSystemManagerExt$startFetchModelResourceIfNeeded$1", f = "AlgorithmSystemManagerExt.kt", l = {}, m = "invokeSuspend")
public final class C2295808z6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C2294808yw LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2295808z6(C2294808yw c2294808yw, InterfaceC1364105Vn<? super C2295808z6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2294808yw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2295808z6(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AlgorithmSystemManagerExt@93da.startFetchModelResourceIfNeeded$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        final C2294808yw c2294808yw = this.LL;
        if (c2294808yw.LIZ.LIZIZ.LJIILJJIL.length() == 0) {
            c2294808yw.LIZJ();
        } else {
            String[] strArr = (String[]) a0.LJJLIIIJILLIZJL(c2294808yw.LIZ.LIZIZ.LJIILJJIL, new String[]{","}, 0, 6).toArray(new String[0]);
            C0CHQ.LIZ().initDownloadableModel();
            DownloadableModelSupport.getInstance().fetchResourcesWithModelNames(0, strArr, new FetchResourcesListener() { // from class: X.08z7
                @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
                public final void onSuccess() {
                    C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("fetchModelResource onSuccess ");
                    sbLIZ.append(c2294808yw.LIZ.LIZIZ.LJIILJJIL);
                    C201955140j.LIZLLL(c1398350mUb, "AlgorithmSystemManagerExt", C2188811AlT.LIZIZ(sbLIZ));
                    c2294808yw.LIZJ();
                }

                @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
                public final void onFailed(Exception exc) {
                    C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("fetchModelResource onFailure ");
                    sbLIZ.append(c2294808yw.LIZ.LIZIZ.LJIILJJIL);
                    sbLIZ.append(' ');
                    sbLIZ.append(exc);
                    C201955140j.LIZLLL(c1398350mUb, "AlgorithmSystemManagerExt", C2188811AlT.LIZIZ(sbLIZ));
                    c2294808yw.LIZJ();
                }
            });
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AlgorithmSystemManagerExt@93da.startFetchModelResourceIfNeeded$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
