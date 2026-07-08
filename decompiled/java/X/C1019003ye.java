package X;

import com.bytedance.android.btm.api.model.PageFinder;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03ye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.track.ECLoggerUtils$sendLogAsync$5", f = "ECLoggerUtils.kt", l = {}, m = "invokeSuspend")
public final class C1019003ye extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Map<String, Object> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ PageFinder LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1019003ye(String str, Map<String, ? extends Object> map, String str2, PageFinder pageFinder, InterfaceC1364105Vn<? super C1019003ye> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = map;
        this.LLILLL = str2;
        this.LLILZ = pageFinder;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1019003ye(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECLoggerUtils@b6e.sendLogAsync$5");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LL;
        Map<String, Object> map = this.LLILLJJLI;
        C1018703yb.LIZ(this.LLILZ, str, this.LLILLL, map);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECLoggerUtils@b6e.sendLogAsync$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
