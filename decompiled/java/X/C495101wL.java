package X;

import com.bytedance.android.live.effect.singleselector.SingleStickerEffectSelectorDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01wL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.singleselector.SingleStickerEffectSelectorDialog$onViewCreated$6", f = "SingleStickerEffectSelectorDialog.kt", l = {127}, m = "invokeSuspend")
public final class C495101wL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SingleStickerEffectSelectorDialog LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C495101wL(SingleStickerEffectSelectorDialog singleStickerEffectSelectorDialog, InterfaceC1364105Vn<? super C495101wL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = singleStickerEffectSelectorDialog;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C495101wL(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SingleStickerEffectSelectorDialog@19d0.onViewCreated$6");
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
            C1DEK c1dek = this.LLILLJJLI.LLILZLL.LLILLJJLI;
            C400401h4 c400401h4 = C400401h4.LIZ;
            this.LL = 1;
            if (c1dek.LJIJI(c400401h4, this) == objLJFF) {
                C1C7U.LIZIZ("SingleStickerEffectSelectorDialog@19d0.onViewCreated$6");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SingleStickerEffectSelectorDialog@19d0.onViewCreated$6");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
