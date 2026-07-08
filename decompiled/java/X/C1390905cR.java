package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05cR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.component.LyricStickerEffectUIComponent$innerLoadTrimPoints$result$1$2", f = "LyricStickerEffectUIComponent.kt", l = {}, m = "invokeSuspend")
public final class C1390905cR extends C09AX implements Function2 {
    public C1390905cR(InterfaceC1364105Vn<? super C1390905cR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1390905cR(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LyricStickerEffectUIComponent@df9c.innerLoadTrimPoints$result$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1C7U.LIZIZ("LyricStickerEffectUIComponent@df9c.innerLoadTrimPoints$result$1$2");
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        new C1390905cR((InterfaceC1364105Vn) obj2).invokeSuspend(Unit.LIZ);
        return null;
    }
}
