package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05O8, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.MusicPanelLyricsEffectComponent$startLoadDeferredLocked$deferred$1$1", f = "MusicPanelLyricsEffectComponent.kt", l = {}, m = "invokeSuspend")
public final class C05O8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1465410oEl LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05O8(C1465410oEl c1465410oEl, String str, InterfaceC1364105Vn<? super C05O8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1465410oEl;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05O8(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicPanelLyricsEffectComponent@e9d2.startLoadDeferredLocked$deferred$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJIILIIL.LJIIJ(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicPanelLyricsEffectComponent@e9d2.startLoadDeferredLocked$deferred$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
