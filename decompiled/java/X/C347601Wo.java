package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01Wo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.ui.CountDownTextView$startCountDown$2", f = "CountDownTextView.kt", l = {}, m = "invokeSuspend")
public final class C347601Wo extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super Long>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ C23236098o LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C347601Wo(Function0<Unit> function0, C23236098o c23236098o, InterfaceC1364105Vn<? super C347601Wo> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LL = function0;
        this.LLILLJJLI = c23236098o;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CountDownTextView@eb04.startCountDown$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke();
        this.LLILLJJLI.LJJJJI();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CountDownTextView@eb04.startCountDown$2");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super Long> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C347601Wo(this.LL, this.LLILLJJLI, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
