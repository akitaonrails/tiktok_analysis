package X;

import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.154E, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.music.collect.page.MusicCollectThemeAllMusicPage$loadMoreData$1", f = "MusicCollectThemeAllMusicPage.kt", l = {97}, m = "invokeSuspend")
public final class C154E extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C154G LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C154E(C154G c154g, int i, InterfaceC1364105Vn<? super C154E> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c154g;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C154E(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C154G c154g;
        C129L c129l;
        C1C7U.LIZ("MusicCollectThemeAllMusicPage@cf93.loadMoreData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        CollectedMusicList collectedMusicList = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C154G c154g2 = this.LLILLJJLI;
            if (c154g2.LLJIJIL) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MusicCollectThemeAllMusicPage@cf93.loadMoreData$1");
                return unit;
            }
            c154g2.LLJIJIL = true;
            C129L c129l2 = c154g2.LLJI;
            if (c129l2 != null) {
                c129l2.showLoadMoreLoading();
            }
            C1DFB c1dfb = C0PEM.LIZJ;
            C859980XoS c859980XoS = new C859980XoS(this.LLILLJJLI, this.LLILLL, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c859980XoS);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MusicCollectThemeAllMusicPage@cf93.loadMoreData$1");
                return objLJFF;
            }
        }
        Pair pair = (Pair) obj;
        if (pair != null) {
            collectedMusicList = (CollectedMusicList) pair.getFirst();
        }
        if (collectedMusicList != null) {
            List<? extends MusicModel> list = (List) pair.getSecond();
            C154G c154g3 = this.LLILLJJLI;
            for (MusicModel musicModel : list) {
                C155W c155wLJIIL = c154g3.LJIIL();
                if (c155wLJIIL != null) {
                    c155wLJIIL.I5(musicModel);
                }
            }
            C20440014yU c20440014yU = C20440014yU.LJIIJ;
            List<MusicModel> listLIZ = c20440014yU.LIZ(this.LLILLJJLI.LLJILJILJ, list, true);
            this.LLILLJJLI.LLJILJILJ.addAll(listLIZ);
            List<MusicModel> listLIZ2 = c20440014yU.LIZ(this.LLILLJJLI.LLJJIJI.LIZ, listLIZ, true);
            this.LLILLJJLI.LLJJIJI.LIZ.addAll(listLIZ2);
            this.LLILLJJLI.LLJJIJI.LIZJ = collectedMusicList.getCursor();
            this.LLILLJJLI.LLJJIJI.LIZLLL = collectedMusicList.isHasMore();
            this.LLILLJJLI.LLJJIJI.LJ = listLIZ2.size();
            if ((!listLIZ2.isEmpty()) && (c129l = (c154g = this.LLILLJJLI).LLJI) != null) {
                c129l.setDataAfterLoadMore(c154g.LLJJIJI.LIZ);
            }
            C154G c154g4 = this.LLILLJJLI;
            if (c154g4.LLJJIJI.LIZLLL) {
                C129L c129l3 = c154g4.LLJI;
                if (c129l3 != null) {
                    c129l3.resetLoadMoreState();
                }
            } else {
                C129L c129l4 = c154g4.LLJI;
                if (c129l4 != null) {
                    c129l4.setShowFooter(false);
                }
            }
        }
        this.LLILLJJLI.LLJIJIL = false;
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MusicCollectThemeAllMusicPage@cf93.loadMoreData$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
