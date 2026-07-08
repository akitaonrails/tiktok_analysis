package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HY0, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sticker.impl.ui.StickerTuxTooltipPopHelper$buildAliveMenuAction$1", f = "StickerTuxTooltipPopHelper.kt", l = {409}, m = "invokeSuspend")
public final class C0HY0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05YD<C00F6> LLILLJJLI;
    public final /* synthetic */ C450530Hlb LLILLL;
    public final /* synthetic */ Long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HY0(C05YD<C00F6> c05yd, C450530Hlb c450530Hlb, Long l, InterfaceC1364105Vn<? super C0HY0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05yd;
        this.LLILLL = c450530Hlb;
        this.LLILZ = l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HY0(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerTuxTooltipPopHelper@c663.buildAliveMenuAction$1");
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
            C05YD<C00F6> c05yd = this.LLILLJJLI;
            C442810HXz c442810HXz = new C442810HXz(this.LLILZ, null);
            this.LL = 1;
            if (C09IC.LJIJ(c05yd, this, c442810HXz) == objLJFF) {
                C1C7U.LIZIZ("StickerTuxTooltipPopHelper@c663.buildAliveMenuAction$1");
                return objLJFF;
            }
        }
        C0P0T c0p0t = this.LLILLL.LJIJJLI;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerTuxTooltipPopHelper@c663.buildAliveMenuAction$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
