package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EGe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.effect.EditEffectSceneV2$onShowEffectExtraInfoIfNeeded$1", f = "EditEffectSceneV2.kt", l = {676}, m = "invokeSuspend")
public final class C361740EGe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C365100ETc LLILLJJLI;
    public final /* synthetic */ C0EGS LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C361740EGe(C365100ETc c365100ETc, C0EGS c0egs, InterfaceC1364105Vn<? super C361740EGe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c365100ETc;
        this.LLILLL = c0egs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C361740EGe(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C19292410dm c19292410dmLJI;
        C1C7U.LIZ("EditEffectSceneV2@ba81.onShowEffectExtraInfoIfNeeded$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                try {
                    C365100ETc c365100ETc = this.LLILLJJLI;
                    C0EGS c0egs = this.LLILLL;
                    String str = c0egs.LIZ;
                    String str2 = c0egs.LIZIZ;
                    c365100ETc.getClass();
                    c19292410dmLJI = C0CHQ.LIZ().getAccountService().LJI(str, str2, EnumC1254700iku.STICKER_EDIT_V2);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1632480saE c1632480saE = C1632480saE.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onShowEffectExtraInfoIfNeeded: queryUser Exception: ");
                    sbLIZ.append(e.getMessage());
                    C201955140j.LIZJ(c1632480saE, C2188811AlT.LIZIZ(sbLIZ));
                    c19292410dmLJI = null;
                }
                if (c19292410dmLJI != null) {
                    this.LLILLJJLI.LLLIILIL.put(this.LLILLL.LIZ, c19292410dmLJI);
                    C1DFH c1dfh = C0PEM.LIZ;
                    AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                    C361750EGf c361750EGf = new C361750EGf(this.LLILLJJLI, c19292410dmLJI, null);
                    this.LL = 1;
                    if (C23250099c.LJI(this, abstractC2238408pq, c361750EGf) == objLJFF) {
                        C1C7U.LIZIZ("EditEffectSceneV2@ba81.onShowEffectExtraInfoIfNeeded$1");
                        return objLJFF;
                    }
                }
            }
        } catch (CancellationException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1632480saE c1632480saE2 = C1632480saE.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onShowEffectExtraInfoIfNeeded: cancelled: ");
            sbLIZ2.append(e2.getMessage());
            C201955140j.LIZJ(c1632480saE2, C2188811AlT.LIZIZ(sbLIZ2));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditEffectSceneV2@ba81.onShowEffectExtraInfoIfNeeded$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
