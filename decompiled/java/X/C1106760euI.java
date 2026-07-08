package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0euI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.infra.datacenter.DataCenter$getDataAsync$1", f = "DataCenter.kt", l = {217}, m = "invokeSuspend")
public final class C1106760euI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C1106810euN LLILZ;
    public final /* synthetic */ C1106800euM LLILZIL;
    public final /* synthetic */ Function1<Throwable, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1106760euI(long j, long j2, C1106810euN c1106810euN, C1106800euM c1106800euM, Function1<? super Throwable, Unit> function1, InterfaceC1364105Vn<? super C1106760euI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = c1106810euN;
        this.LLILZIL = c1106800euM;
        this.LLILZLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1106760euI(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DataCenter@f176.getDataAsync$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("DataCenter@f176.getDataAsync$1");
                return objLJFF;
            }
        }
        if (System.currentTimeMillis() - this.LLILLL >= this.LLILLJJLI && this.LLILZ.LIZIZ.remove(this.LLILZIL)) {
            Function1<Throwable, Unit> function1 = this.LLILZLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Request timeout after ");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append("ms");
            function1.invoke(new C1106950eub(C2188811AlT.LIZIZ(sbLIZ), null));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DataCenter@f176.getDataAsync$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
