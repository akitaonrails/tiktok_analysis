package X;

import Y.AgS290S0100000_9;
import com.ss.android.ugc.aweme.im.scrolltobottomindicator.ScrollToBottomIndicator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NZk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.scrolltobottomindicator.ScrollToBottomIndicator$observeMsgCount$1", f = "ScrollToBottomIndicator.kt", l = {154}, m = "invokeSuspend")
public final class C596060NZk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ScrollToBottomIndicator LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C596060NZk(ScrollToBottomIndicator scrollToBottomIndicator, InterfaceC1364105Vn<? super C596060NZk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = scrollToBottomIndicator;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C596060NZk(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ScrollToBottomIndicator@f37b.observeMsgCount$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            ScrollToBottomIndicator scrollToBottomIndicator = this.LLILLJJLI;
            C2252321DDq c2252321DDq = scrollToBottomIndicator.LLILLL.LIZJ;
            AgS290S0100000_9 agS290S0100000_9 = new AgS290S0100000_9(scrollToBottomIndicator, 23);
            this.LL = 1;
            if (c2252321DDq.collect(agS290S0100000_9, this) == objLJFF) {
                C1C7U.LIZIZ("ScrollToBottomIndicator@f37b.observeMsgCount$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
