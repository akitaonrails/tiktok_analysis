package X;

import android.text.TextWatcher;
import com.ss.android.ugc.aweme.im.edittext.TextWatcherViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0I0d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.edittext.TextWatcherViewModel$fireAddTextWatcherEvent$1", f = "TextWatcherViewModel.kt", l = {37}, m = "invokeSuspend")
public final class C459490I0d extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TextWatcherViewModel LLILLJJLI;
    public final /* synthetic */ TextWatcher LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C459490I0d(TextWatcherViewModel textWatcherViewModel, TextWatcher textWatcher, InterfaceC1364105Vn<? super C459490I0d> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = textWatcherViewModel;
        this.LLILLL = textWatcher;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C459490I0d(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TextWatcherViewModel@d2e1.fireAddTextWatcherEvent$1");
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
            C2252331DDr c2252331DDr = this.LLILLJJLI.LL;
            TextWatcher textWatcher = this.LLILLL;
            this.LL = 1;
            if (C459520I0g.LIZ(c2252331DDr, textWatcher, this) == objLJFF) {
                C1C7U.LIZIZ("TextWatcherViewModel@d2e1.fireAddTextWatcherEvent$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TextWatcherViewModel@d2e1.fireAddTextWatcherEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
