package X;

import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cAk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.beauty.manager.CkBeautyDataGlobalFetcherDelegate$queryBeautyData$1$local$1", f = "CkBeautyDataGlobalFetcherDelegate.kt", l = {}, m = "invokeSuspend")
public final class C1001640cAk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<BeautyCategory>>, Object> {
    public final /* synthetic */ C12HT LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1001640cAk(C12HT c12ht, InterfaceC1364105Vn<? super C1001640cAk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c12ht;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1001640cAk(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CkBeautyDataGlobalFetcherDelegate@3cef.queryBeautyData$1$local$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<BeautyCategory> listLJIJ = this.LL.LJIJ();
        C1C7U.LIZIZ("CkBeautyDataGlobalFetcherDelegate@3cef.queryBeautyData$1$local$1");
        return listLJIJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<BeautyCategory>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
