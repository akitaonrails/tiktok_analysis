package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MAB, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.multientrance.MediaPickerMultiEntranceHeaderKt$EntranceCell$1$1", f = "MediaPickerMultiEntranceHeader.kt", l = {}, m = "invokeSuspend")
public final class C0MAB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0MBC LL;
    public final /* synthetic */ Function1<String, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0MAB(C0MBC c0mbc, Function1<? super String, Unit> function1, InterfaceC1364105Vn<? super C0MAB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0mbc;
        this.LLILLJJLI = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MAB(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MediaPickerMultiEntranceHeaderKt@a188.EntranceCell$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LL.LJFF;
        if (str != null) {
            this.LLILLJJLI.invoke(str);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MediaPickerMultiEntranceHeaderKt@a188.EntranceCell$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
