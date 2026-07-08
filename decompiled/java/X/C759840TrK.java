package X;

import com.bytedance.android.livesdk.chatroom.model.CreatePlaylistReq;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.playlist.LiveReplayPlaylistApi;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TrK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.playlist.LiveReplayPlaylistDataManager$createPlaylist$1", f = "LiveReplayPlaylistDataManager.kt", l = {68, 69, 78}, m = "invokeSuspend")
public final class C759840TrK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ List<Long> LLILLL;
    public final /* synthetic */ InterfaceC759880TrO LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C759840TrK(String str, List<Long> list, InterfaceC759880TrO interfaceC759880TrO, InterfaceC1364105Vn<? super C759840TrK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = list;
        this.LLILZ = interfaceC759880TrO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C759840TrK(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveReplayPlaylistDataManager@3a1a.createPlaylist$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C759860TrM c759860TrM = new C759860TrM(this.LLILZ, e, null);
            this.LL = 3;
            if (C23250099c.LJI(this, abstractC2238408pq, c759860TrM) == objLJFF) {
                C1C7U.LIZIZ("LiveReplayPlaylistDataManager@3a1a.createPlaylist$1");
                return objLJFF;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2 || i == 3) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("LiveReplayPlaylistDataManager@3a1a.createPlaylist$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C759780TrE c759780TrE = ((C759790TrF) C759800TrG.LIZ.getValue()).LLILLJJLI;
            String str = this.LLILLJJLI;
            List<Long> list = this.LLILLL;
            this.LL = 1;
            c759780TrE.getClass();
            CreatePlaylistReq createPlaylistReq = new CreatePlaylistReq();
            createPlaylistReq.name = str;
            createPlaylistReq.items = list;
            obj = ((LiveReplayPlaylistApi) c759780TrE.LL.LL.getValue()).createLiveReplayPlaylist(createPlaylistReq, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LiveReplayPlaylistDataManager@3a1a.createPlaylist$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh2 = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
        C759850TrL c759850TrL = new C759850TrL((C470590Icr) obj, this.LLILZ, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq2, c759850TrL) == objLJFF) {
            C1C7U.LIZIZ("LiveReplayPlaylistDataManager@3a1a.createPlaylist$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LiveReplayPlaylistDataManager@3a1a.createPlaylist$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
