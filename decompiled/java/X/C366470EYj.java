package X;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EYj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.component.LyricStickerEffectUIComponent$downloadSuccessAndApply$applyJob$1", f = "LyricStickerEffectUIComponent.kt", l = {386}, m = "invokeSuspend")
public final class C366470EYj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C389110FNl LLILLJJLI;
    public final /* synthetic */ Pair<List<C0EQL>, C05WK> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C366470EYj(C389110FNl c389110FNl, Pair<? extends List<C0EQL>, C05WK> pair, InterfaceC1364105Vn<? super C366470EYj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c389110FNl;
        this.LLILLL = pair;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C366470EYj(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LyricStickerEffectUIComponent@df9c.downloadSuccessAndApply$applyJob$1");
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
            InterfaceC366450EYh interfaceC366450EYhK5 = this.LLILLJJLI.k5();
            boolean z = this.LLILLJJLI.LLJILJILJ.LIZ;
            Pair<List<C0EQL>, C05WK> pair = this.LLILLL;
            this.LL = 1;
            if (interfaceC366450EYhK5.yQ0(z, pair, true, null, this) == objLJFF) {
                C1C7U.LIZIZ("LyricStickerEffectUIComponent@df9c.downloadSuccessAndApply$applyJob$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LyricStickerEffectUIComponent@df9c.downloadSuccessAndApply$applyJob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
