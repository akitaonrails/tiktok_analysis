package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.01SR, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.common.plugin.SearchPluginServiceImpl$trackSearchAabBlock$1", f = "SearchPluginServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C01SR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01SR(String str, String str2, Boolean bool, InterfaceC1364105Vn<? super C01SR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = bool;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01SR(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("SearchPluginServiceImpl@d223.trackSearchAabBlock$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("from", this.LL);
            c2344009Gk.LJIIIIZZ("type", this.LLILLJJLI);
            Boolean bool = this.LLILLL;
            if (Intrinsics.LJFF(bool, true)) {
                str = "1";
            } else if (Intrinsics.LJFF(bool, false)) {
                str = CardStruct.IStatusCode.DEFAULT;
            } else if (bool == null) {
                str = "";
            } else {
                throw new C1954807lC();
            }
            c2344009Gk.LJIIIIZZ("exist", str);
            C20684815ws.LJIILLIIL("search_rd_aab_block", c2344009Gk.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchPluginServiceImpl@d223.trackSearchAabBlock$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
