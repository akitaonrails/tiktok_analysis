package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0u9g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1", f = "TextFieldSelectionManager.kt", l = {623}, m = "invokeSuspend")
public final class C1692900u9g extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1692140u8S LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1692900u9g(C1692140u8S c1692140u8S, boolean z, InterfaceC1364105Vn<? super C1692900u9g> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1692140u8S;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1692900u9g(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [X.09AY, kotlin.jvm.functions.Function1] */
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
            if (C1692280u8g.LIZJ(this.LLILLJJLI.LJIIL().LIZIZ)) {
                return Unit.LIZ;
            }
            C1692140u8S c1692140u8S = this.LLILLJJLI;
            InterfaceC1692930u9j interfaceC1692930u9j = c1692140u8S.LJII;
            if (interfaceC1692930u9j != null) {
                C1693890uBH c1693890uBHLIZ = C1693580uAm.LIZ(C1692920u9i.LIZ(c1692140u8S.LJIIL()));
                this.LL = 1;
                if (interfaceC1692930u9j.LIZIZ(c1693890uBHLIZ) == objLJFF) {
                    return objLJFF;
                }
            }
        }
        if (!this.LLILLL) {
            return Unit.LIZ;
        }
        int iLJFF = C1692280u8g.LJFF(this.LLILLJJLI.LJIIL().LIZIZ);
        this.LLILLJJLI.LIZJ.invoke(C1692140u8S.LJ(this.LLILLJJLI.LJIIL().LIZ, C1680680tpy.LIZ(iLJFF, iLJFF)));
        this.LLILLJJLI.LJIJ(EnumC1684410tvz.None);
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
