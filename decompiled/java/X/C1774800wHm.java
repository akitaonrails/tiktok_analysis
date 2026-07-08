package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mall.service.video.IVideoDetailLoadService;
import com.ss.android.ugc.aweme.ecommerce.mall.service.video.VideoDetailRequestParams;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS141S1200000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import njp.a;

/* JADX INFO: renamed from: X.0wHm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallRepository$preloadVideoWithDiff$1", f = "ShopMallRepository.kt", l = {1326}, m = "invokeSuspend")
public final class C1774800wHm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1771500wCS LLILLL;
    public final /* synthetic */ C1772630wEH LLILZ;
    public final /* synthetic */ C1772630wEH LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1774800wHm(C1771500wCS c1771500wCS, C1772630wEH c1772630wEH, C1772630wEH c1772630wEH2, String str, InterfaceC1364105Vn<? super C1774800wHm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1771500wCS;
        this.LLILZ = c1772630wEH;
        this.LLILZIL = c1772630wEH2;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1774800wHm c1774800wHm = new C1774800wHm(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1774800wHm.LLILLJJLI = obj;
        return c1774800wHm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IVideoDetailLoadService iVideoDetailLoadServiceLIZ;
        C1C7U.LIZ("ShopMallRepository@92e8.preloadVideoWithDiff$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1771500wCS c1771500wCS = this.LLILLL;
                C1772630wEH c1772630wEH = this.LLILZ;
                C1772630wEH c1772630wEH2 = this.LLILZIL;
                String str = this.LLILZLL;
                c1771500wCS.getClass();
                HashSet hashSetLJJIFFI = C09RB.LJJIFFI(C09RB.LJIJI(new C1939607ik(C1771500wCS.LJIIIIZZ(c1772630wEH)), AFwS268S0000000_26.get$arr$(515)));
                List listLJJII = C09RB.LJJII(C09RB.LJIIIZ(C09RB.LJIIIZ(new C1939607ik(C1771500wCS.LJIIIIZZ(c1772630wEH2)), new AwS605S0100000_26(hashSetLJJIFFI, (HashSet<String>) 474)), AFwS268S0000000_26.get$arr$(516)));
                new AwS141S1200000_26(str, (String) hashSetLJJIFFI, (HashSet<String>) listLJJII, (List<VideoDetailRequestParams.Item>) 4);
                C034X.LIZIZ();
                if ((!listLJJII.isEmpty()) && (iVideoDetailLoadServiceLIZ = C1181304jj.LIZ()) != null) {
                    VideoDetailRequestParams videoDetailRequestParams = new VideoDetailRequestParams(C2286608xc.LJ(EnumC2006107tT.FEED_ITEMS_CUT.getValue()), listLJJII);
                    this.LL = 1;
                    if (iVideoDetailLoadServiceLIZ.preloadDetail(videoDetailRequestParams, false, str, this) == objLJFF) {
                        C1C7U.LIZIZ("ShopMallRepository@92e8.preloadVideoWithDiff$1");
                        return objLJFF;
                    }
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopMallRepository@92e8.preloadVideoWithDiff$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
