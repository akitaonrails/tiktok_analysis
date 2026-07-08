package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.strategy.resourceload.IDMResourceLoadService;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Po, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.res.StreakMilestoneGeckoResHelper$fetchGeckoResourceInner$1", f = "StreakMilestoneGeckoResHelper.kt", l = {}, m = "invokeSuspend")
public final class C1603406Po extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<Pair<String, String>> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C1603306Pn LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1603406Po(List<Pair<String, String>> list, boolean z, C1603306Pn c1603306Pn, long j, InterfaceC1364105Vn<? super C1603406Po> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = z;
        this.LLILLL = c1603306Pn;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1603406Po(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1664506fT interfaceC1664506fTLIZJ;
        String str;
        C1C7U.LIZ("StreakMilestoneGeckoResHelper@823b.fetchGeckoResourceInner$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<Pair<String, String>> list = this.LL;
        boolean z = this.LLILLJJLI;
        C1603306Pn c1603306Pn = this.LLILLL;
        long j = this.LLILZ;
        for (Pair<String, String> pair : list) {
            String first = pair.getFirst();
            String second = pair.getSecond();
            if (z) {
                str = "before_preload";
            } else {
                str = "before_download";
            }
            C15527066b.LIZ(str, first, Collections.singletonList(second), C13BV.INSTANCE, false, 0L, null, 0L, 1008);
            if (!c1603306Pn.LIZLLL.contains(first)) {
                c1603306Pn.LIZLLL.put(first, new C1603806Ps(first, "", 3));
            }
            Forest forest = (Forest) c1603306Pn.LIZ.getValue();
            if (forest != null) {
                RequestParams requestParams = new RequestParams(null, 1, null);
                requestParams.disableBuiltin = true;
                requestParams.resourceScene = EnumC1533980q1M.OTHER;
                requestParams.enableRequestReuse = true;
                requestParams.enableMemoryCache = false;
                requestParams.enableCDNCache = true;
                requestParams.disableGeckoUpdate = z;
                requestParams.channel = first;
                requestParams.bundle = second;
                forest.fetchResourceAsync("", requestParams, new C1603506Pp(c1603306Pn, pair, z, j));
            }
        }
        IDMResourceLoadService iDMResourceLoadService = (IDMResourceLoadService) PluggableExtentionKt.pluggableSpiForReal(IDMResourceLoadService.class);
        if (iDMResourceLoadService != null && (interfaceC1664506fTLIZJ = iDMResourceLoadService.LIZJ(C0Z3V.DIMENSION_UID, true)) != null) {
            interfaceC1664506fTLIZJ.LJI("streak_milestone_preload", "streak_milestone_preload");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakMilestoneGeckoResHelper@823b.fetchGeckoResourceInner$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
