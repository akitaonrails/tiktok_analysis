package X;

import com.ss.android.ugc.aweme.feed.mingap.MinGapMonitorComponent;
import com.ss.android.ugc.aweme.feed.mingap.MinGapViolationResult;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qtA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.mingap.MinGapMonitorComponent$reportMinGap$1", f = "MinGapMonitorComponent.kt", l = {}, m = "invokeSuspend")
public final class C1567340qtA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1567350qtB LL;
    public final /* synthetic */ MinGapMonitorComponent LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1567340qtA(C1567350qtB c1567350qtB, MinGapMonitorComponent minGapMonitorComponent, Aweme aweme, int i, InterfaceC1364105Vn<? super C1567340qtA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1567350qtB;
        this.LLILLJJLI = minGapMonitorComponent;
        this.LLILLL = aweme;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1567340qtA(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MinGapMonitorComponent@a4f6.reportMinGap$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CopyOnWriteArrayList<MinGapViolationResult> copyOnWriteArrayList = this.LL.LIZ;
        MinGapMonitorComponent minGapMonitorComponent = this.LLILLJJLI;
        Aweme aweme = this.LLILLL;
        int i = this.LLILZ;
        for (MinGapViolationResult minGapViolationResult : copyOnWriteArrayList) {
            minGapMonitorComponent.getClass();
            JSONObject jSONObjectLIZ = C591500NHw.LIZ(new Pair("log_id", aweme.getRequestId()), new Pair("item_id", aweme.getAid()), new Pair("market_sub_type", Integer.valueOf(aweme.getMarketSubType())), new Pair("rule_type", minGapViolationResult.minGapRuleId), new Pair("last_item_id", minGapViolationResult.previousItemId), new Pair("last_item_log_id", minGapViolationResult.previousItemLogId), new Pair("item_gap", Integer.valueOf(minGapViolationResult.gap)), new Pair("extra_info", minGapViolationResult.LIZIZ), new Pair("reason", minGapViolationResult.reason), new Pair("version", 1), new Pair("position", Integer.valueOf(i)), new Pair("server_extra_info", minGapViolationResult.LIZ));
            C20684815ws.LJIJ("content_min_gap_info", jSONObjectLIZ);
            C793770VBv.LJII("content_min_gap_info", jSONObjectLIZ, null, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MinGapMonitorComponent@a4f6.reportMinGap$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
