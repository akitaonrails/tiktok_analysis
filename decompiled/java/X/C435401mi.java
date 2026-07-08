package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data.LiveReplayApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import tikcast.api.anchor.ReplayPlaylistNoticeInfoData;

/* JADX INFO: renamed from: X.01mi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.live.PlayListBannerManager$fetchApi$1", f = "PlayListBannerManager.kt", l = {101}, m = "invokeSuspend")
public final class C435401mi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C435401mi(InterfaceC1364105Vn<? super C435401mi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C435401mi c435401mi = new C435401mi(interfaceC1364105Vn);
        c435401mi.LLILLJJLI = obj;
        return c435401mi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        long jLongValue;
        ReplayPlaylistNoticeInfoData replayPlaylistNoticeInfoData;
        C1C7U.LIZ("PlayListBannerManager@6409.fetchApi$1");
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
                C20441214yg.LIZIZ("PlayListBannerManager", "fetchShouldShowPlayListBanner request");
                C480460Ism.LIZ().getClass();
                LiveReplayApi liveReplayApi = (LiveReplayApi) C480460Ism.LIZLLL(LiveReplayApi.class);
                Long lLIZ = InterfaceC1833600xoc.va.LIZ();
                if (lLIZ != null) {
                    jLongValue = lLIZ.longValue();
                } else {
                    jLongValue = 0;
                }
                this.LL = 1;
                obj = liveReplayApi.fetchShouldShowPlayListBanner(jLongValue, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PlayListBannerManager@6409.fetchApi$1");
                    return objLJFF;
                }
            }
            C470590Icr c470590Icr = (C470590Icr) obj;
            if (c470590Icr != null && (replayPlaylistNoticeInfoData = (ReplayPlaylistNoticeInfoData) c470590Icr.data) != null) {
                InterfaceC1833600xoc.ua.LIZJ(Boolean.valueOf(replayPlaylistNoticeInfoData.isShowFloatingBar));
                c098200Yq = Unit.LIZ;
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C20441214yg.LJFF("PlayListBannerManager", "fetchShouldShowPlayListBanner error", thM5exceptionOrNullimpl);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PlayListBannerManager@6409.fetchApi$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
