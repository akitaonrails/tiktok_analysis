package X;

import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.translation.ui.TranslationControlsAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Rjw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C704300Rjw extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ TranslationControlsAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C704300Rjw(TranslationControlsAssem translationControlsAssem) {
        super(1);
        this.LL = translationControlsAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        TranslationControlsAssem translationControlsAssem = this.LL;
        assembler.MQ2(translationControlsAssem, new C696370RTf(translationControlsAssem));
        TranslationControlsAssem translationControlsAssem2 = this.LL;
        C736680Sv4.LJIIIZ(translationControlsAssem2, (AssemViewModel) translationControlsAssem2.LLL.getValue(translationControlsAssem2, TranslationControlsAssem.LLLFZ[0]), new C2217381BqS() { // from class: X.0Rk3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0S5G) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0Rk2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0S5G) obj).LLILZLL);
            }
        }, null, new C704290Rjv(), 12);
        C736680Sv4.LJIIIIZZ(translationControlsAssem2, (AssemViewModel) translationControlsAssem2.LLLF.getValue(), new C2217381BqS() { // from class: X.0NzE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, new C704280Rju(), 6);
        return Unit.LIZ;
    }
}
