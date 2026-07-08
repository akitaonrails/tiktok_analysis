package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01KS, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.util.InboxSkylightStoryDataCenter$trackSerializeCacheCost$1", f = "SkylightStoryDataCenter.kt", l = {}, m = "invokeSuspend")
public final class C01KS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01KS(long j, String str, InterfaceC1364105Vn<? super C01KS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = j;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01KS(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxSkylightStoryDataCenter@fba4.trackSerializeCacheCost$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20684815ws.LJIILLIIL("inbox_serialize_cache_cost", C2097608Jq.LJIIIIZZ(new Pair("cost", String.valueOf(this.LL)), new Pair("method", this.LLILLJJLI)));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxSkylightStoryDataCenter@fba4.trackSerializeCacheCost$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
