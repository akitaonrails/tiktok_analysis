package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.FullDsl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k0v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.linkcore.dsl.LiveDslManagerV2$forceReadFromLocal$1", f = "LiveDslManagerV2.kt", l = {271, 282}, m = "invokeSuspend")
public final class C1303070k0v extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1303170k15 LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1303070k0v(C1303170k15 c1303170k15, Function0<Unit> function0, InterfaceC1364105Vn<? super C1303070k0v> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1303170k15;
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1303070k0v(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("LiveDslManagerV2@f6ff.forceReadFromLocal$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.getClass();
            C1AZW.LJFF(C1303170k15.LJII(197), "GsonHelper.get().fromJson FAILED", e.getMessage(), null);
            if (this.LLILLJJLI.LIZ != EnumC1154700g9c.LOCAL) {
                z = false;
            }
            C1303200k18.LIZJ(z, 10002, e.toString());
            C1CC2.LIZ("LinkMic DSL deserialized exception occurs.", e);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1439505kH c1439505kH = new C1439505kH(this.LLILLL, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c1439505kH) == objLJFF) {
                C1C7U.LIZIZ("LiveDslManagerV2@f6ff.forceReadFromLocal$1");
                return objLJFF;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("LiveDslManagerV2@f6ff.forceReadFromLocal$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            String strLJIIIZ = this.LLILLJJLI.LJIIIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("forceReadFromLocal dslString=");
            sbLIZ.append(strLJIIIZ);
            C20441214yg.LIZIZ("LiveDslManagerV2", C2188811AlT.LIZIZ(sbLIZ));
            FullDsl fullDsl = (FullDsl) C19748512Ol.LIZIZ.LJII(strLJIIIZ, FullDsl.class);
            if (fullDsl != null) {
                this.LLILLJJLI.LIZLLL(fullDsl);
            }
            C1DFH c1dfh2 = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
            C1439405kG c1439405kG = new C1439405kG(this.LLILLL, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, abstractC2238408pq2, c1439405kG);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LiveDslManagerV2@f6ff.forceReadFromLocal$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LiveDslManagerV2@f6ff.forceReadFromLocal$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
