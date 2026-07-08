package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;
import tikcast.api.anchor.LiveFragmentDetail;

/* JADX INFO: renamed from: X.09hV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.sfv.special.LiveSfvPostRecyclerViewHolder$fetchColorFromBitmap$1$2", f = "LiveSfvPostRecyclerViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C2441509hV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1838930xxD LL;
    public final /* synthetic */ LiveFragmentDetail LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2441509hV(C1838930xxD c1838930xxD, LiveFragmentDetail liveFragmentDetail, InterfaceC1364105Vn<? super C2441509hV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1838930xxD;
        this.LLILLJJLI = liveFragmentDetail;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2441509hV(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveSfvPostRecyclerViewHolder@e8fa.fetchColorFromBitmap$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Function1<LiveFragmentDetail, Unit> function1 = this.LL.LLILLL;
        if (function1 != null) {
            function1.invoke(this.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveSfvPostRecyclerViewHolder@e8fa.fetchColorFromBitmap$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
