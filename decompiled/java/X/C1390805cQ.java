package X;

import com.ss.android.ugc.aweme.music.model.TrimPointResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05cQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.component.LyricStickerEffectUIComponent$innerLoadTrimPoints$result$1$1", f = "LyricStickerEffectUIComponent.kt", l = {}, m = "invokeSuspend")
public final class C1390805cQ extends C09AX implements Function2<TrimPointResponse, InterfaceC1364105Vn<? super TrimPointResponse>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AnonymousClass0957 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1390805cQ(AnonymousClass0957 anonymousClass0957, InterfaceC1364105Vn<? super C1390805cQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anonymousClass0957;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1390805cQ c1390805cQ = new C1390805cQ(this.LLILLJJLI, interfaceC1364105Vn);
        c1390805cQ.LL = obj;
        return c1390805cQ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LyricStickerEffectUIComponent@df9c.innerLoadTrimPoints$result$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = this.LL;
        this.LLILLJJLI.LIZIZ(null);
        C1C7U.LIZIZ("LyricStickerEffectUIComponent@df9c.innerLoadTrimPoints$result$1$1");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TrimPointResponse trimPointResponse, InterfaceC1364105Vn<? super TrimPointResponse> interfaceC1364105Vn) {
        return ((a) create(trimPointResponse, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
