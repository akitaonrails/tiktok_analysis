package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01Wm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.live.leadgen.pincard.CountDownTextView$startCountDown$2", f = "CountDownTextView.kt", l = {}, m = "invokeSuspend")
public final class C347401Wm extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super Long>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ C23237098p LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C347401Wm(Function0<Unit> function0, C23237098p c23237098p, InterfaceC1364105Vn<? super C347401Wm> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LL = function0;
        this.LLILLJJLI = c23237098p;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CountDownTextView@8a2b.startCountDown$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke();
        C23237098p c23237098p = this.LLILLJJLI;
        AnonymousClass0956 anonymousClass0956 = c23237098p.LLJJJJJIL;
        if (anonymousClass0956 != null && anonymousClass0956.isActive()) {
            AnonymousClass0956 anonymousClass09562 = c23237098p.LLJJJJJIL;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
            c23237098p.LLJJJJJIL = null;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CountDownTextView@8a2b.startCountDown$2");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super Long> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C347401Wm(this.LL, this.LLILLJJLI, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
