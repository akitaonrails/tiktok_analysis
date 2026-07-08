package X;

import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.154H, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.music.collect.page.MusicCollectThemeAllMusicPage$loadData$1", f = "MusicCollectThemeAllMusicPage.kt", l = {38}, m = "invokeSuspend")
public final class C154H extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C154G LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C154H(C154G c154g, int i, InterfaceC1364105Vn<? super C154H> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c154g;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C154H(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C129L c129l;
        C1C7U.LIZ("MusicCollectThemeAllMusicPage@cf93.loadData$1");
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
            C154G c154g = this.LLILLJJLI;
            if (c154g.LLJIJIL) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MusicCollectThemeAllMusicPage@cf93.loadData$1");
                return unit;
            }
            c154g.LLJIJIL = true;
            c154g.LJJIFFI();
            C1DFB c1dfb = C0PEM.LIZJ;
            C859970XoR c859970XoR = new C859970XoR(this.LLILLL, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c859970XoR);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MusicCollectThemeAllMusicPage@cf93.loadData$1");
                return objLJFF;
            }
        }
        Pair pair = (Pair) obj;
        if (pair != null) {
            collectedMusicList = (CollectedMusicList) pair.getFirst();
        }
        if (collectedMusicList != null) {
            List<? extends MusicModel> list = (List) pair.getSecond();
            C154G c154g2 = this.LLILLJJLI;
            for (MusicModel musicModel : list) {
                C155W c155wLJIIL = c154g2.LJIIL();
                if (c155wLJIIL != null) {
                    c155wLJIIL.I5(musicModel);
                }
            }
            this.LLILLJJLI.LLJILJILJ.clear();
            C20440014yU c20440014yU = C20440014yU.LJIIJ;
            List<MusicModel> listLIZ = c20440014yU.LIZ(this.LLILLJJLI.LLJILJILJ, list, true);
            this.LLILLJJLI.LLJILJILJ.addAll(listLIZ);
            this.LLILLJJLI.LLJJIJI.LIZ.clear();
            List<MusicModel> listLIZ2 = c20440014yU.LIZ(this.LLILLJJLI.LLJJIJI.LIZ, listLIZ, true);
            this.LLILLJJLI.LLJJIJI.LIZ.addAll(listLIZ2);
            C154J c154j = this.LLILLJJLI.LLJJIJI;
            c154j.LJFF = true;
            c154j.LJI = true;
            this.LLILLJJLI.LLJJIJI.LIZJ = collectedMusicList.getCursor();
            this.LLILLJJLI.LLJJIJI.LIZLLL = collectedMusicList.isHasMore();
            this.LLILLJJLI.LLJJIJI.LJ = listLIZ2.size();
            if (this.LLILLJJLI.LLJJIJI.LIZ.isEmpty()) {
                this.LLILLJJLI.LJJ();
            } else {
                C154G c154g3 = this.LLILLJJLI;
                C129L c129l2 = c154g3.LLJI;
                if (c129l2 != null) {
                    c129l2.setData(c154g3.LLJJIJI.LIZ);
                }
                C154G c154g4 = this.LLILLJJLI;
                if (!c154g4.LLJJIJI.LIZLLL && (c129l = c154g4.LLJI) != null) {
                    c129l.setShowFooter(false);
                }
                this.LLILLJJLI.LJIL();
            }
        } else {
            this.LLILLJJLI.LLJJIJI.LIZ.clear();
            C154J c154j2 = this.LLILLJJLI.LLJJIJI;
            c154j2.LJFF = true;
            c154j2.LJI = false;
            C154G c154g5 = this.LLILLJJLI;
            C154J c154j3 = c154g5.LLJJIJI;
            c154j3.LIZJ = 0;
            c154j3.LIZLLL = false;
            c154j3.LJ = 0;
            c154g5.LJJI();
        }
        C154G c154g6 = this.LLILLJJLI;
        c154g6.LLJIJIL = false;
        c154g6.LLJILJIL = true;
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MusicCollectThemeAllMusicPage@cf93.loadData$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
