package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.router.AbsOpenResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0z0n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.pns.activitycenter.watchhistory.feeds.WHFeedsBridgeModel$openAweme$1", f = "WHFeedsBridgeModel.kt", l = {174}, m = "invokeSuspend")
public final class C1879590z0n extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1884130z87 LLILLL;
    public final /* synthetic */ InterfaceC1876240yvO<InterfaceC1876690yw7> LLILZ;
    public final /* synthetic */ InterfaceC1876740ywC LLILZIL;
    public final /* synthetic */ Activity LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1879590z0n(C1884130z87 c1884130z87, InterfaceC1876240yvO<InterfaceC1876690yw7> interfaceC1876240yvO, InterfaceC1876740ywC interfaceC1876740ywC, Activity activity, InterfaceC1364105Vn<? super C1879590z0n> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1884130z87;
        this.LLILZ = interfaceC1876240yvO;
        this.LLILZIL = interfaceC1876740ywC;
        this.LLILZLL = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1879590z0n c1879590z0n = new C1879590z0n(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1879590z0n.LLILLJJLI = obj;
        return c1879590z0n;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        final InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("WHFeedsBridgeModel@17b3.openAweme$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            if (!this.LLILLL.LLIZ.compareAndSet(false, true)) {
                this.LLILZ.onFail(0, "cannot open while another one is opening.");
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("WHFeedsBridgeModel@17b3.openAweme$1");
                return unit;
            }
            if (!this.LLILLL.LLILLL.isEmpty()) {
                C1442105kh c1442105kh = new C1442105kh(this.LLILLL, null);
                this.LLILLJJLI = interfaceC497601wk;
                this.LL = 1;
                if (C099A.LIZIZ(1000L, c1442105kh, this) == objLJFF) {
                    C1C7U.LIZIZ("WHFeedsBridgeModel@17b3.openAweme$1");
                    return objLJFF;
                }
            }
        }
        final C118300cf c118300cf = new C118300cf();
        CopyOnWriteArrayList<InterfaceC1876680yw6> copyOnWriteArrayList = this.LLILLL.LLJ;
        InterfaceC1876740ywC interfaceC1876740ywC = this.LLILZIL;
        Iterator<InterfaceC1876680yw6> it2 = copyOnWriteArrayList.iterator();
        int i2 = 0;
        while (true) {
            if (it2.hasNext()) {
                InterfaceC1876680yw6 next = it2.next();
                if (Intrinsics.LJFF(next.getAwemeId(), interfaceC1876740ywC.getAweme().getAwemeId()) && Intrinsics.LJFF(next.getWatchTimestamp(), interfaceC1876740ywC.getAweme().getWatchTimestamp())) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        c118300cf.element = i2;
        if (i2 < 0) {
            this.LLILZ.onFail(-3004, "this aweme is not found");
            this.LLILLL.LLIZ.set(false);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("WHFeedsBridgeModel@17b3.openAweme$1");
            return unit2;
        }
        C1879650z0t c1879650z0t = this.LLILLL.LLJILJILJ;
        String awemeId = this.LLILZIL.getAweme().getAwemeId();
        String watchTimestamp = this.LLILZIL.getAweme().getWatchTimestamp();
        c1879650z0t.getClass();
        c1879650z0t.LIZLLL = System.currentTimeMillis();
        C20684815ws.LJIILLIIL("ac_open_detail_start", C2097608Jq.LJIIIIZZ(new Pair("aweme_id", awemeId), new Pair("react_id", c1879650z0t.LIZ), new Pair("page_name", "watch_history"), new Pair("watch_time", watchTimestamp), new Pair("is_exp", String.valueOf(1))));
        C1603960rqE.LIZ = this.LLILLL;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LLILZLL, "aweme://aweme/detail/");
        smartRouteBuildRoute.withParam("react_session_id", this.LLILZIL.getReactId());
        smartRouteBuildRoute.withParam("page_type", this.LLILZIL.getEnterFrom());
        smartRouteBuildRoute.withParam("refer", this.LLILZIL.getEnterFrom());
        smartRouteBuildRoute.withParam("video_from", "from_watch_history");
        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, this.LLILZIL.getAweme().getAwemeId());
        final C1884130z87 c1884130z87 = this.LLILLL;
        final InterfaceC1876740ywC interfaceC1876740ywC2 = this.LLILZIL;
        final InterfaceC1876240yvO<InterfaceC1876690yw7> interfaceC1876240yvO = this.LLILZ;
        smartRouteBuildRoute.withCallback(new AbsOpenResultCallback() { // from class: X.0z0X
            @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
            public final void onSuccess(Intent intent) {
                super.onSuccess(intent);
                C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZ, null, new C1879580z0m(c118300cf, c1884130z87, interfaceC1876740ywC2, interfaceC1876240yvO, null), 2);
            }

            @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
            public final void onFail(String str, String str2) {
                super.onFail(str, str2);
                interfaceC1876240yvO.onFail(0, "smart router open failed.");
            }
        });
        smartRouteBuildRoute.open();
        this.LLILLL.LLIZ.set(false);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("WHFeedsBridgeModel@17b3.openAweme$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
