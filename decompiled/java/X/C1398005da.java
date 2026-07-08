package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05da, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.effectplatform.helper.Tool$compressRes$1", f = "Tool.kt", l = {28}, m = "invokeSuspend")
public final class C1398005da extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ EnumC2479809ng LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ Function1<String, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1398005da(String str, EnumC2479809ng enumC2479809ng, boolean z, int i, int i2, Function1<? super String, Unit> function1, InterfaceC1364105Vn<? super C1398005da> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = enumC2479809ng;
        this.LLILZ = z;
        this.LLILZIL = i;
        this.LLILZLL = i2;
        this.LLIZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1398005da(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("Tool@ecaf.compressRes$1");
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
            String str = this.LLILLJJLI;
            EnumC2479809ng enumC2479809ng = this.LLILLL;
            boolean z = this.LLILZ;
            int i2 = this.LLILZIL;
            int i3 = this.LLILZLL;
            this.LL = 1;
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C1398205dc(i2, i3, enumC2479809ng, str, null, z));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("Tool@ecaf.compressRes$1");
                return objLJFF;
            }
        }
        this.LLIZ.invoke((String) obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("Tool@ecaf.compressRes$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
