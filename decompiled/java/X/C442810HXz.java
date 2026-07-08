package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HXz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sticker.impl.ui.StickerTuxTooltipPopHelper$buildAliveMenuAction$1$1", f = "StickerTuxTooltipPopHelper.kt", l = {}, m = "invokeSuspend")
public final class C442810HXz extends C09AX implements Function2<C00F6, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C442810HXz(Long l, InterfaceC1364105Vn<? super C442810HXz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C442810HXz c442810HXz = new C442810HXz(this.LLILLJJLI, interfaceC1364105Vn);
        c442810HXz.LL = obj;
        return c442810HXz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerTuxTooltipPopHelper@c663.buildAliveMenuAction$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C442740HXs c442740HXs = ((C00F6) this.LL).LIZ.get(this.LLILLJJLI);
        boolean z = false;
        if (c442740HXs != null && c442740HXs.LIZJ == 1) {
            z = true;
        }
        Boolean boolValueOf = Boolean.valueOf(!z);
        C1C7U.LIZIZ("StickerTuxTooltipPopHelper@c663.buildAliveMenuAction$1$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C00F6 c00f6, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(c00f6, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
