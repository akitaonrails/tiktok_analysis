package X;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.03Oo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C836403Oo extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI = "/api/v1/shop/bill_info/get";
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ HashMap<String, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C836403Oo(int i, HashMap map, boolean z) {
        super(0);
        this.LL = i;
        this.LLILLL = z;
        this.LLILZ = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1018703yb.LIZLLL("rd_page_params_check", new C836503Op(this.LL, this.LLILLJJLI, this.LLILZ, this.LLILLL));
        return Unit.LIZ;
    }
}
