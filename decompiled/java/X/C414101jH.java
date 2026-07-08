package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01jH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2", f = "Zip.kt", l = {273}, m = "invokeSuspend")
public final class C414101jH extends C09AX implements Function2<InterfaceC346701Wf<Object>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC346201Wa[] LLILLL;
    public final /* synthetic */ InterfaceC1631630sYr LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C414101jH(InterfaceC346201Wa[] interfaceC346201WaArr, InterfaceC1364105Vn interfaceC1364105Vn, InterfaceC1631630sYr interfaceC1631630sYr) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC346201WaArr;
        this.LLILZ = interfaceC1631630sYr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C414101jH c414101jH = new C414101jH(this.LLILLL, interfaceC1364105Vn, this.LLILZ);
        c414101jH.LLILLJJLI = obj;
        return c414101jH;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<Object> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
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
            InterfaceC346701Wf interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            InterfaceC346201Wa[] interfaceC346201WaArr = this.LLILLL;
            C414201jI c414201jI = new C414201jI();
            C414001jG c414001jG = new C414001jG(null, this.LLILZ);
            this.LL = 1;
            if (C23039090z.LIZ(this, c414201jI, c414001jG, interfaceC346701Wf, interfaceC346201WaArr) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }
}
