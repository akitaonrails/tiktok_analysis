package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05i2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.component.LyricStickerEffectDataLogicComponent$loadMiniDraft$2$2", f = "LyricStickerEffectDataLogicComponent.kt", l = {}, m = "invokeSuspend")
public final class C1425605i2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1425705i3>, Object> {
    public final /* synthetic */ C1425705i3 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1425605i2(C1425705i3 c1425705i3, InterfaceC1364105Vn<? super C1425605i2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1425705i3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1425605i2(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LyricStickerEffectDataLogicComponent@6232.loadMiniDraft$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1366105Wh.LIZJ(EnumC1366205Wi.EVENT_TOOLS_LYRIC_MOTION_GEN_MINIDRAFT_REQUEST, true, 0L, true, 0, "");
        C1425705i3 c1425705i3 = this.LL;
        C1C7U.LIZIZ("LyricStickerEffectDataLogicComponent@6232.loadMiniDraft$2$2");
        return c1425705i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1425705i3> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
