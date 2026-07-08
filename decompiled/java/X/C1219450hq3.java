package X;

import com.ss.android.ugc.aweme.detailpage.audit.viewmodel.AuditRequestListViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hq3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1219450hq3 extends C09AY implements Function1<C1397660mTU, Unit> {
    public final /* synthetic */ AuditRequestListViewModel LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219450hq3(AuditRequestListViewModel auditRequestListViewModel, boolean z, int i) {
        super(1);
        this.LL = auditRequestListViewModel;
        this.LLILLJJLI = z;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397660mTU c1397660mTU) {
        String strValueOf;
        C1528205ya c1528205ya = C1528205ya.LIZJ;
        String strAQ2 = this.LL.AQ2();
        Pair<? extends Object, String>[] pairArr = new Pair[4];
        pairArr[0] = new Pair<>("enter_from", this.LL.BQ2().LL);
        pairArr[1] = new Pair<>("is_batch", C1529305yl.LIZ(Boolean.valueOf(!this.LLILLJJLI)));
        if (this.LLILLJJLI) {
            strValueOf = "1";
        } else {
            strValueOf = String.valueOf(this.LLILLL);
        }
        pairArr[2] = new Pair<>("request_num", strValueOf);
        pairArr[3] = new Pair<>("result", "cancel");
        c1528205ya.LJJIII("click_audit_decline_pop", strAQ2, pairArr, C0I0B.LJFF.LIZIZ());
        return Unit.LIZ;
    }
}
