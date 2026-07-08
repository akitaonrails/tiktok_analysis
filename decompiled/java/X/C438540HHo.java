package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS372S0200000_6;
import njp.a;

/* JADX INFO: renamed from: X.0HHo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.utils.BulletinGeckoManager$getCustomGeckoChannel$1", f = "BulletinGeckoManager.kt", l = {}, m = "invokeSuspend")
public final class C438540HHo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function1<C1533790q13, Unit> LLILLL;
    public final /* synthetic */ Function1<C1533790q13, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C438540HHo(String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1, Function1 function12) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = function1;
        this.LLILZ = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C438540HHo(this.LL, this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL, this.LLILZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinGeckoManager@3a47.getCustomGeckoChannel$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Forest forestLIZ = C0T1N.LIZ();
        RequestParams requestParams = new RequestParams(null, 1, null);
        String str = this.LL;
        String str2 = this.LLILLJJLI;
        requestParams.channel = str;
        requestParams.bundle = str2;
        requestParams.waitGeckoUpdate = true;
        forestLIZ.fetchResourceAsync("", requestParams, new AwS372S0200000_6(this.LLILLL, this.LLILZ, (Function1<? super C1533790q13, Unit>) 87));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinGeckoManager@3a47.getCustomGeckoChannel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
