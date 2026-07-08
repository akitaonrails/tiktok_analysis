package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XsZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.DefaultIMUseCaseCenter$updateMemberInfo$1", f = "DefaultIMUseCaseCenter.kt", l = {433}, m = "invokeSuspend")
public final class C862530XsZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C863650XuN LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ Map<String, String> LLILZLL;
    public final /* synthetic */ InterfaceC867020Xzo<C0YAE> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862530XsZ(C863650XuN c863650XuN, String str, long j, int i, Map<String, String> map, InterfaceC867020Xzo<C0YAE> interfaceC867020Xzo, InterfaceC1364105Vn<? super C862530XsZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c863650XuN;
        this.LLILLL = str;
        this.LLILZ = j;
        this.LLILZIL = i;
        this.LLILZLL = map;
        this.LLIZ = interfaceC867020Xzo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C862530XsZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultIMUseCaseCenter@568c.updateMemberInfo$1");
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
            C867340Y0u c867340Y0uLIZJ = this.LLILLJJLI.LLILZIL.LIZJ();
            String str = this.LLILLL;
            long j = this.LLILZ;
            int i2 = this.LLILZIL;
            Map<String, String> map = this.LLILZLL;
            InterfaceC867020Xzo<C0YAE> interfaceC867020Xzo = this.LLIZ;
            this.LL = 1;
            c867340Y0uLIZJ.getClass();
            Object objLIZJ = c867340Y0uLIZJ.LIZJ(str, j, new C862540Xsa(C2286608xc.LJ(i2), map, 6), interfaceC867020Xzo, this);
            if (objLIZJ != C099R.LJFF()) {
                objLIZJ = Unit.LIZ;
            }
            if (objLIZJ == objLJFF) {
                C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.updateMemberInfo$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.updateMemberInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
