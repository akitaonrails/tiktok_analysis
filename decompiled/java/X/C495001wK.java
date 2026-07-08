package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePerfComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01wK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePerfComponent$reportReachBottom$2", f = "LoadMorePerfComponent.kt", l = {}, m = "invokeSuspend")
public final class C495001wK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ LoadMorePerfComponent LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ JSONObject LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C495001wK(LoadMorePerfComponent loadMorePerfComponent, Aweme aweme, int i, JSONObject jSONObject, InterfaceC1364105Vn<? super C495001wK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = loadMorePerfComponent;
        this.LLILLL = aweme;
        this.LLILZ = i;
        this.LLILZIL = jSONObject;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C495001wK c495001wK = new C495001wK(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c495001wK.LL = obj;
        return c495001wK;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LoadMorePerfComponent@d571.reportReachBottom$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            this.LLILLJJLI.ho(this.LLILLL, this.LLILZ, this.LLILZIL);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LoadMorePerfComponent@d571.reportReachBottom$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
