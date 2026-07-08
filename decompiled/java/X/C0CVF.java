package X;

import com.bytedance.android.live.publicscreen.impl.caption.translate.CaptionViewModelV2;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CVF, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.live.publicscreen.impl.caption.translate.CaptionViewModelV2$2$1$1", f = "CaptionViewModelV2.kt", l = {87}, m = "invokeSuspend")
public final class C0CVF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ CaptionViewModelV2 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CVF(String str, CaptionViewModelV2 captionViewModelV2, InterfaceC1364105Vn<? super C0CVF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = captionViewModelV2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CVF(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CaptionViewModelV2@24b6.<init>$2$1$1");
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
                k kVarLJJIIZ = C2348809Ig.LJI(this.LLILLJJLI).LJJIIZ("ts");
                if (kVarLJJIIZ != null) {
                    C1DFH c1dfh = C0PEM.LIZ;
                    AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                    C0CVH c0cvh = new C0CVH(this.LLILLL, kVarLJJIIZ, null);
                    this.LL = 1;
                    if (C23250099c.LJI(this, abstractC2238408pq, c0cvh) == objLJFF) {
                        C1C7U.LIZIZ("CaptionViewModelV2@24b6.<init>$2$1$1");
                        return objLJFF;
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LIZIZ("CaptionViewModel", e.toString());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CaptionViewModelV2@24b6.<init>$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
