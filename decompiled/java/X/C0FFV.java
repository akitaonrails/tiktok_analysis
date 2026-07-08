package X;

import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS406S0200000_5;
import njp.a;

/* JADX INFO: renamed from: X.0FFV, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.sticker.core.BaseSticker$getRealStickerModelAfterViewReady$2$1$result$1", f = "BaseSticker.kt", l = {}, m = "invokeSuspend")
public final class C0FFV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0FFE<StickerModel> LL;
    public final /* synthetic */ InterfaceC1364105Vn<StickerModel> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0FFV(C0FFE<StickerModel> c0ffe, InterfaceC1364105Vn<? super StickerModel> interfaceC1364105Vn, InterfaceC1364105Vn<? super C0FFV> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LL = c0ffe;
        this.LLILLJJLI = interfaceC1364105Vn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0FFV(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("BaseSticker@10fa.getRealStickerModelAfterViewReady$2$1$result$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0FFP c0ffpLJJIL = this.LL.LJJIL();
        if (c0ffpLJJIL != null) {
            c0ffpLJJIL.LIZ(new AwS406S0200000_5((InterfaceC1364105Vn) this.LLILLJJLI, (InterfaceC1364105Vn<? super StickerModel>) this.LL, (C0FFE<StickerModel>) 96));
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("BaseSticker@10fa.getRealStickerModelAfterViewReady$2$1$result$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
