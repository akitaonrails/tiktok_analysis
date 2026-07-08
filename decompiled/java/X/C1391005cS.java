package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05cS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.component.LyricStickerEffectUIComponent$innerLoadTrimPoints$timeoutTask$1", f = "LyricStickerEffectUIComponent.kt", l = {699}, m = "invokeSuspend")
public final class C1391005cS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn, Object> {
    public int LL;

    public C1391005cS(InterfaceC1364105Vn<? super C1391005cS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1391005cS(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LyricStickerEffectUIComponent@df9c.innerLoadTrimPoints$timeoutTask$1");
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
            if (AnonymousClass0958.LIZIZ(2000L, this) == objLJFF) {
                C1C7U.LIZIZ("LyricStickerEffectUIComponent@df9c.innerLoadTrimPoints$timeoutTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("LyricStickerEffectUIComponent@df9c.innerLoadTrimPoints$timeoutTask$1");
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn interfaceC1364105Vn) {
        return new C1391005cS(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
