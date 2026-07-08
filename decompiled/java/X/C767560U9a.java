package X;

import Y.AgS202S0200000_12;
import com.bytedance.android.live.effect.sticker.shortcutpanel.StickerShortCutWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0U9a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.shortcutpanel.StickerShortCutWidget$observeViewModel$1", f = "StickerShortCutWidget.kt", l = {392}, m = "invokeSuspend")
public final class C767560U9a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ StickerShortCutWidget LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C767560U9a(StickerShortCutWidget stickerShortCutWidget, InterfaceC1364105Vn<? super C767560U9a> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = stickerShortCutWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C767560U9a c767560U9a = new C767560U9a(this.LLILLL, interfaceC1364105Vn);
        c767560U9a.LLILLJJLI = obj;
        return c767560U9a;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerShortCutWidget@5ed5.observeViewModel$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            StickerShortCutWidget stickerShortCutWidget = this.LLILLL;
            C2252331DDr c2252331DDr = stickerShortCutWidget.LLILZLL.LLILLL;
            AgS202S0200000_12 agS202S0200000_12 = new AgS202S0200000_12(stickerShortCutWidget, interfaceC497601wk, 1);
            this.LL = 1;
            c2252331DDr.getClass();
            if (C2252331DDr.LJIIJ(c2252331DDr, agS202S0200000_12, this) == objLJFF) {
                C1C7U.LIZIZ("StickerShortCutWidget@5ed5.observeViewModel$1");
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
