package X;

import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.154F, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.music.collect.page.MusicCollectThemeMusicPage$loadMoreData$1", f = "MusicCollectThemeMusicPage.kt", l = {171}, m = "invokeSuspend")
public final class C154F extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C154L LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C154F(int i, C154L c154l, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c154l;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C154F(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C154L c154l;
        C129L c129l;
        C1C7U.LIZ("MusicCollectThemeMusicPage@d38c.loadMoreData$1");
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
            C154L c154l2 = this.LLILLJJLI;
            if (c154l2.LLJIJIL) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MusicCollectThemeMusicPage@d38c.loadMoreData$1");
                return unit;
            }
            c154l2.LLJIJIL = true;
            C129L c129l2 = c154l2.LLJI;
            if (c129l2 != null) {
                c129l2.showLoadMoreLoading();
            }
            C1DFB c1dfb = C0PEM.LIZJ;
            C860010XoV c860010XoV = new C860010XoV(this.LLILLL, this.LLILLJJLI, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c860010XoV);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MusicCollectThemeMusicPage@d38c.loadMoreData$1");
                return objLJFF;
            }
        }
        Pair pair = (Pair) obj;
        if (pair != null) {
            collectedMusicList = (CollectedMusicList) pair.getFirst();
        }
        if (collectedMusicList != null) {
            List<? extends MusicModel> list = (List) pair.getSecond();
            C154L c154l3 = this.LLILLJJLI;
            for (MusicModel musicModel : list) {
                C155W c155wLJIIL = c154l3.LJIIL();
                if (c155wLJIIL != null) {
                    c155wLJIIL.I5(musicModel);
                }
            }
            C20440014yU c20440014yU = C20440014yU.LJIIJ;
            List<MusicModel> listLIZ = c20440014yU.LIZ(this.LLILLJJLI.LLJILJILJ, list, true);
            this.LLILLJJLI.LLJILJILJ.addAll(listLIZ);
            List<MusicModel> listLIZ2 = c20440014yU.LIZ(this.LLILLJJLI.LLJJIII.LIZ, listLIZ, true);
            this.LLILLJJLI.LLJJIII.LIZ.addAll(listLIZ2);
            this.LLILLJJLI.LLJJIII.LIZJ = collectedMusicList.getCursor();
            this.LLILLJJLI.LLJJIII.LIZLLL = collectedMusicList.isHasMore();
            this.LLILLJJLI.LLJJIII.LJ = listLIZ2.size();
            if ((!listLIZ2.isEmpty()) && (c129l = (c154l = this.LLILLJJLI).LLJI) != null) {
                c129l.setDataAfterLoadMore(c154l.LLJJIII.LIZ);
            }
            C154L c154l4 = this.LLILLJJLI;
            if (c154l4.LLJJIII.LIZLLL) {
                C129L c129l3 = c154l4.LLJI;
                if (c129l3 != null) {
                    c129l3.resetLoadMoreState();
                }
            } else {
                C129L c129l4 = c154l4.LLJI;
                if (c129l4 != null) {
                    c129l4.setShowFooter(false);
                }
            }
        }
        this.LLILLJJLI.LLJIJIL = false;
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MusicCollectThemeMusicPage@d38c.loadMoreData$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
