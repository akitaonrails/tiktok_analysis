package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Kh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.edittext.TextWatcherViewModelKt$emitWhenSubscribedTo$2", f = "TextWatcherViewModel.kt", l = {}, m = "invokeSuspend")
public final class C315701Kh extends C09AX implements Function2<Integer, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ int LL;

    public C315701Kh(InterfaceC1364105Vn<? super C315701Kh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C315701Kh c315701Kh = new C315701Kh(interfaceC1364105Vn);
        c315701Kh.LL = ((Number) obj).intValue();
        return c315701Kh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("TextWatcherViewModelKt@569d.emitWhenSubscribedTo$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL > 0) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("TextWatcherViewModelKt@569d.emitWhenSubscribedTo$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(Integer.valueOf(num.intValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
