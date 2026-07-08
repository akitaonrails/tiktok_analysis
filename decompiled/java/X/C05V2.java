package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05V2, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.ui.aggregated.SocialThoughtAggregatedCellKt$SocialThoughtAggregatedCell$1$1", f = "SocialThoughtAggregatedCell.kt", l = {}, m = "invokeSuspend")
public final class C05V2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05V2(String str, Function0<Unit> function0, InterfaceC1364105Vn<? super C05V2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05V2(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialThoughtAggregatedCellKt@4745.SocialThoughtAggregatedCell$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.length() > 0) {
            this.LLILLJJLI.invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialThoughtAggregatedCellKt@4745.SocialThoughtAggregatedCell$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
