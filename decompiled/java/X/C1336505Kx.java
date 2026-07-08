package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Kx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.lego.RecUserRequestLegoTask$requestMAF$2", f = "RecUserRequestLegoTask.kt", l = {59, 60}, m = "invokeSuspend")
public final class C1336505Kx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C259800zU<InterfaceC1337505Lh> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1336505Kx(C259800zU<InterfaceC1337505Lh> c259800zU, InterfaceC1364105Vn<? super C1336505Kx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1336505Kx(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecUserRequestLegoTask@3341.requestMAF$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("RecUserRequestLegoTask@3341.requestMAF$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC1345705Ol imUserService = C1336205Ku.LIZ(false).getImUserService();
            this.LL = 1;
            obj = imUserService.LJI();
            if (obj == objLJFF) {
                C1C7U.LIZIZ("RecUserRequestLegoTask@3341.requestMAF$2");
                return objLJFF;
            }
        }
        if (((Number) obj).intValue() < 15) {
            InterfaceC1337505Lh interfaceC1337505Lh = this.LLILLJJLI.element;
            this.LL = 2;
            if (interfaceC1337505Lh.Mt(this) == objLJFF) {
                C1C7U.LIZIZ("RecUserRequestLegoTask@3341.requestMAF$2");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RecUserRequestLegoTask@3341.requestMAF$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
