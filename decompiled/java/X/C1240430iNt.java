package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0iNt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.search.sdk.impl.IMSearchEngine$doQuery$5", f = "IMSearchEngine.kt", l = {}, m = "invokeSuspend")
public final class C1240430iNt extends C09AX implements Function1<InterfaceC1364105Vn<? super List<? extends C1240300iNg>>, Object> {
    public final /* synthetic */ InterfaceC1685420txc<String, List<Integer>, String, String, List<Integer>, List<C1240300iNg>> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ List<Integer> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ List<Integer> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1240430iNt(InterfaceC1685420txc<? super String, ? super List<Integer>, ? super String, ? super String, ? super List<Integer>, ? extends List<C1240300iNg>> interfaceC1685420txc, String str, List<Integer> list, String str2, String str3, List<Integer> list2, InterfaceC1364105Vn<? super C1240430iNt> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = interfaceC1685420txc;
        this.LLILLJJLI = str;
        this.LLILLL = list;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1240430iNt(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super List<? extends C1240300iNg>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMSearchEngine@a240.doQuery$5");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<C1240300iNg> listInvoke = this.LL.invoke(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
        C1C7U.LIZIZ("IMSearchEngine@a240.doQuery$5");
        return listInvoke;
    }
}
