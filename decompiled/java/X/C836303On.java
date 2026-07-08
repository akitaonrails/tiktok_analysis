package X;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS1S1211000_1;

/* JADX INFO: renamed from: X.03On, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C836303On extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C03O1 LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL = "/api/v1/shop/bill_info/get";
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ HashMap<String, Object> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C836303On(C03O1 c03o1, int i, boolean z, HashMap map) {
        super(0);
        this.LL = c03o1;
        this.LLILLJJLI = i;
        this.LLILZ = z;
        this.LLILZIL = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1018703yb.LIZLLL("rd_page_params_check", new AwS1S1211000_1(this.LL, (C03O1) this.LLILLJJLI, (int) this.LLILLL, (String) this.LLILZ, (boolean) this.LLILZIL, (HashMap<String, Object>) 1));
        return Unit.LIZ;
    }
}
