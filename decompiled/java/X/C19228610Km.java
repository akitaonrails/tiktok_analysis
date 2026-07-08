package X;

import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeButtonsAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.10Km, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeButtonsAssem$initFollowButton$4$1$1", f = "RecSwipeButtonsAssem.kt", l = {}, m = "invokeSuspend")
public final class C19228610Km extends C09AX implements Function1<InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ C1261860iwS LL;
    public final /* synthetic */ RecSwipeButtonsAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19228610Km(C1261860iwS c1261860iwS, RecSwipeButtonsAssem recSwipeButtonsAssem, InterfaceC1364105Vn<? super C19228610Km> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = c1261860iwS;
        this.LLILLJJLI = recSwipeButtonsAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19228610Km(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecSwipeButtonsAssem@ef1b.initFollowButton$4$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.getFollowStatus() != 0) {
            int i = C2187451AjH.LIZ;
            C1C7U.LIZIZ("RecSwipeButtonsAssem@ef1b.initFollowButton$4$1$1");
            return true;
        }
        Boolean boolValueOf = Boolean.valueOf(this.LLILLJJLI.LLJJJJJIL);
        C1C7U.LIZIZ("RecSwipeButtonsAssem@ef1b.initFollowButton$4$1$1");
        return boolValueOf;
    }
}
