package X;

import Y.AgS293S0100000_12;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.live.effect.sticker.effecthouse.EffectInfoActionsDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Trw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.effecthouse.EffectInfoActionsDialog$observeViewModel$1", f = "EffectInfoActionsDialog.kt", l = {159}, m = "invokeSuspend")
public final class C760220Trw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EffectInfoActionsDialog LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C760220Trw(EffectInfoActionsDialog effectInfoActionsDialog, InterfaceC1364105Vn<? super C760220Trw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = effectInfoActionsDialog;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C760220Trw(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectInfoActionsDialog@f40c.observeViewModel$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            EffectInfoActionsDialog effectInfoActionsDialog = this.LLILLJJLI;
            StickerEffectViewModel stickerEffectViewModel = effectInfoActionsDialog.LLILZIL;
            if (stickerEffectViewModel == null) {
                stickerEffectViewModel = null;
            }
            C2252331DDr c2252331DDr = stickerEffectViewModel.LLILLL;
            AgS293S0100000_12 agS293S0100000_12 = new AgS293S0100000_12(effectInfoActionsDialog, 0);
            this.LL = 1;
            c2252331DDr.getClass();
            if (C2252331DDr.LJIIJ(c2252331DDr, agS293S0100000_12, this) == objLJFF) {
                C1C7U.LIZIZ("EffectInfoActionsDialog@f40c.observeViewModel$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
