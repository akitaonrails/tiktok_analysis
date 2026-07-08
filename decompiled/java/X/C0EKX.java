package X;

import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EKX, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.text.sticker.text.logic.EPEffectTextPerfMobHelper$onTextTransform$1", f = "EPEffectTextPerfMobHelper.kt", l = {64}, m = "invokeSuspend")
public final class C0EKX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TextStickerModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0EKX(TextStickerModel textStickerModel, InterfaceC1364105Vn<? super C0EKX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = textStickerModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0EKX(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EPEffectTextPerfMobHelper@9eb6.onTextTransform$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(100L, this) == objLJFF) {
                C1C7U.LIZIZ("EPEffectTextPerfMobHelper@9eb6.onTextTransform$1");
                return objLJFF;
            }
        }
        C384180F4m c384180F4m = C384180F4m.LIZIZ;
        TextStickerModel textStickerModel = this.LLILLJJLI;
        c384180F4m.getClass();
        C384180F4m.LJFF(textStickerModel);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EPEffectTextPerfMobHelper@9eb6.onTextTransform$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
