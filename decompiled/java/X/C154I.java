package X;

import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.154I, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.music.collect.page.MusicCollectThemeMusicPage$loadData$1", f = "MusicCollectThemeMusicPage.kt", l = {112}, m = "invokeSuspend")
public final class C154I extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C154L LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C154I(int i, C154L c154l, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c154l;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C154I(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C129L c129l;
        C1C7U.LIZ("MusicCollectThemeMusicPage@d38c.loadData$1");
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
            C154L c154l = this.LLILLJJLI;
            if (c154l.LLJIJIL) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MusicCollectThemeMusicPage@d38c.loadData$1");
                return unit;
            }
            c154l.LLJIJIL = true;
            c154l.LJJIFFI();
            C1DFB c1dfb = C0PEM.LIZJ;
            C860000XoU c860000XoU = new C860000XoU(this.LLILLL, this.LLILLJJLI, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c860000XoU);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MusicCollectThemeMusicPage@d38c.loadData$1");
                return objLJFF;
            }
        }
        Pair pair = (Pair) obj;
        if (pair != null) {
            collectedMusicList = (CollectedMusicList) pair.getFirst();
        }
        if (collectedMusicList != null) {
            List<? extends MusicModel> list = (List) pair.getSecond();
            C154L c154l2 = this.LLILLJJLI;
            for (MusicModel musicModel : list) {
                C155W c155wLJIIL = c154l2.LJIIL();
                if (c155wLJIIL != null) {
                    c155wLJIIL.I5(musicModel);
                }
            }
            this.LLILLJJLI.LLJILJILJ.clear();
            C20440014yU c20440014yU = C20440014yU.LJIIJ;
            List<MusicModel> listLIZ = c20440014yU.LIZ(this.LLILLJJLI.LLJILJILJ, list, true);
            this.LLILLJJLI.LLJILJILJ.addAll(listLIZ);
            this.LLILLJJLI.LLJJIII.LIZ.clear();
            List<MusicModel> listLIZ2 = c20440014yU.LIZ(this.LLILLJJLI.LLJJIII.LIZ, listLIZ, true);
            this.LLILLJJLI.LLJJIII.LIZ.addAll(listLIZ2);
            C154J c154j = this.LLILLJJLI.LLJJIII;
            c154j.LJFF = true;
            c154j.LJI = true;
            this.LLILLJJLI.LLJJIII.LIZJ = collectedMusicList.getCursor();
            this.LLILLJJLI.LLJJIII.LIZLLL = collectedMusicList.isHasMore();
            this.LLILLJJLI.LLJJIII.LJ = listLIZ2.size();
            if (this.LLILLJJLI.LLJJIII.LIZ.isEmpty()) {
                this.LLILLJJLI.LJJ();
            } else {
                C154L c154l3 = this.LLILLJJLI;
                C129L c129l2 = c154l3.LLJI;
                if (c129l2 != null) {
                    c129l2.setData(c154l3.LLJJIII.LIZ);
                }
                C154L c154l4 = this.LLILLJJLI;
                if (!c154l4.LLJJIII.LIZLLL && (c129l = c154l4.LLJI) != null) {
                    c129l.setShowFooter(false);
                }
                this.LLILLJJLI.LJIL();
            }
        } else {
            this.LLILLJJLI.LLJJIII.LIZ.clear();
            C154J c154j2 = this.LLILLJJLI.LLJJIII;
            c154j2.LJFF = true;
            c154j2.LJI = false;
            C154L c154l5 = this.LLILLJJLI;
            C154J c154j3 = c154l5.LLJJIII;
            c154j3.LIZJ = 0;
            c154j3.LIZLLL = false;
            c154j3.LJ = 0;
            c154l5.LJJI();
        }
        C154L c154l6 = this.LLILLJJLI;
        c154l6.LLJIJIL = false;
        c154l6.LLJILJIL = true;
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MusicCollectThemeMusicPage@d38c.loadData$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
