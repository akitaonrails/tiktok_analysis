package X;

import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import wuk.d0;

/* JADX INFO: renamed from: X.091Y, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.internals.main.DefaultStickerSource$dealHorizontalEffects$2$1", f = "DefaultStickerSource.kt", l = {292}, m = "invokeSuspend")
public final class C091Y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ d0 LLILLJJLI;
    public final /* synthetic */ C1641640sp0<HorizontalEffectsModel> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C091Y(d0 d0Var, C1641640sp0<HorizontalEffectsModel> c1641640sp0, InterfaceC1364105Vn<? super C091Y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = d0Var;
        this.LLILLL = c1641640sp0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C091Y(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultStickerSource@cf79.dealHorizontalEffects$2$1");
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
            this.LLILLJJLI.LJJIFFI(this.LLILLL);
            C2238608ps c2238608ps = C2107708Nn.LIZ;
            C091Z c091z = new C091Z(this.LLILLJJLI, this.LLILLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c2238608ps, c091z) == objLJFF) {
                C1C7U.LIZIZ("DefaultStickerSource@cf79.dealHorizontalEffects$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultStickerSource@cf79.dealHorizontalEffects$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
