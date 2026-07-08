package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01o5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.metrics.sticker.StickerGiftTracker$onInteractionSeiUpdate$1$1", f = "StickerGiftTracker.kt", l = {}, m = "invokeSuspend")
public final class C443901o5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Map<String, String> LL;
    public final /* synthetic */ C1136460fgC LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C443901o5(Map<String, String> map, C1136460fgC c1136460fgC, InterfaceC1364105Vn<? super C443901o5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = map;
        this.LLILLJJLI = c1136460fgC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C443901o5(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerGiftTracker@368d.onInteractionSeiUpdate$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onInteractionSeiUpdate: ");
        sbLIZ.append(this.LL);
        C20441214yg.LIZIZ("StickerGiftTracker", C2188811AlT.LIZIZ(sbLIZ));
        C1136460fgC.LJIIZILJ(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerGiftTracker@368d.onInteractionSeiUpdate$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
