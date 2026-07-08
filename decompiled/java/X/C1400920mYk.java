package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mYk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1400920mYk extends AbstractC1401020mYu<Unit> {
    public final C1401320mZO LIZJ;
    public final C1400960mYo LIZLLL;

    @Override // X.AbstractC1401020mYu
    public final boolean LIZIZ() {
        List<Aweme> list;
        MusicAwemeList data = this.LIZJ.getData();
        return (data == null || (list = data.items) == null || !(list.isEmpty() ^ true)) ? false : true;
    }

    @Override // X.AbstractC1401020mYu
    public final void LIZ(List<Aweme> list) {
        Integer numValueOf;
        String str;
        Integer numValueOf2;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        MusicAwemeList data;
        Music music;
        MusicAwemeList data2;
        MusicAwemeList data3;
        MusicAwemeList data4;
        MusicAwemeList data5;
        List<Aweme> list2;
        try {
            ArrayList<Aweme> arrayList = new ArrayList(this.LIZJ.getData().items);
            C1401100mZ2 c1401100mZ2 = C1401100mZ2.LIZIZ;
            StringBuilder sb = new StringBuilder("AddShowAidListStrategy before-->netList:");
            sb.append(arrayList.size());
            sb.append(" squareList:");
            sb.append(this.LIZLLL.LJIIJ.size());
            sb.append(" normalAidList:");
            sb.append(this.LIZLLL.LJIIIZ.size());
            sb.append(" showMoreTimes:");
            sb.append(this.LIZJ.getData().showMoreTimes);
            sb.append(" showNormalAidList:");
            sb.append(this.LIZLLL.LJII.size());
            sb.append(" foldNormalAidList:");
            sb.append(this.LIZLLL.LJIIIIZZ.size());
            sb.append(" netItemS:");
            C1401320mZO c1401320mZO = this.LIZJ;
            String strLIZLLL = null;
            if (c1401320mZO != null && (data5 = c1401320mZO.getData()) != null && (list2 = data5.items) != null) {
                numValueOf = Integer.valueOf(list2.size());
            } else {
                numValueOf = null;
            }
            sb.append(numValueOf);
            sb.append(" list:");
            ArrayList arrayList2 = (ArrayList) list;
            sb.append(arrayList2.size());
            sb.append(" lastDataFrom:");
            C1401320mZO c1401320mZO2 = this.LIZJ;
            if (c1401320mZO2 != null && (data4 = c1401320mZO2.getData()) != null) {
                str = data4.lastDataFrom;
            } else {
                str = null;
            }
            sb.append(str);
            sb.append(" lastShowListSize:");
            List<? extends Aweme> list3 = this.LIZLLL.LJI;
            if (list3 != null) {
                numValueOf2 = Integer.valueOf(list3.size());
            } else {
                numValueOf2 = null;
            }
            sb.append(numValueOf2);
            sb.append(" isHasMore:");
            C1401320mZO c1401320mZO3 = this.LIZJ;
            if (c1401320mZO3 != null && (data3 = c1401320mZO3.getData()) != null) {
                boolValueOf = Boolean.valueOf(data3.isHasMore());
            } else {
                boolValueOf = null;
            }
            sb.append(boolValueOf);
            sb.append(" isRequestingNormalData:");
            C1401320mZO c1401320mZO4 = this.LIZJ;
            if (c1401320mZO4 != null && (data2 = c1401320mZO4.getData()) != null) {
                boolValueOf2 = Boolean.valueOf(data2.requestingNormalData);
            } else {
                boolValueOf2 = null;
            }
            sb.append(boolValueOf2);
            sb.append(" curShowMoreTime:");
            sb.append(this.LIZLLL.LIZ);
            sb.append(" waitingFoldData:");
            sb.append(this.LIZLLL.LIZIZ);
            C201955140j.LIZJ(c1401100mZ2, sb.toString());
            if (arrayList.size() != this.LIZLLL.LJIIJ.size() + this.LIZLLL.LJIIIZ.size()) {
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (Aweme aweme : arrayList) {
                    if (AwemeExtKt.isMDPSquareType(aweme)) {
                        arrayList3.add(aweme);
                    } else {
                        arrayList4.add(aweme);
                    }
                }
                C1400960mYo c1400960mYo = this.LIZLLL;
                c1400960mYo.LJIIIZ = arrayList4;
                c1400960mYo.LJIIJ = arrayList3;
            }
            this.LIZLLL.LIZIZ = false;
            if (this.LIZJ.getData().showMoreTimes == 0) {
                C1400680mYM c1400680mYM = C1400680mYM.LIZ;
                MusicDetail musicDetail = this.LIZJ.LLJJJIL;
                if (musicDetail != null && (music = musicDetail.music) != null) {
                    strLIZLLL = C630980Ooy.LIZLLL(music);
                }
                c1400680mYM.getClass();
                int iLJ = C1400680mYM.LJ(strLIZLLL);
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (Aweme aweme2 : this.LIZLLL.LJIIIZ) {
                    if (C123100dR.LIZ(aweme2.getAid()) && arrayList2.size() >= iLJ - 1) {
                        arrayList6.add(aweme2);
                    } else {
                        arrayList5.add(aweme2);
                        arrayList2.add(aweme2);
                    }
                }
                C1400960mYo c1400960mYo2 = this.LIZLLL;
                c1400960mYo2.LJII = arrayList5;
                c1400960mYo2.LJIIIIZZ = arrayList6;
            } else {
                String str2 = this.LIZLLL.LJIIJJI;
                if (str2 != null && C123100dR.LIZ(str2)) {
                    ArrayList arrayList7 = new ArrayList(this.LIZLLL.LJII);
                    C1466090oFr.LJIILJJIL(arrayList7, new AwS600S0100000_21(this, 427));
                    this.LIZLLL.LJII = arrayList7;
                    arrayList2.addAll(arrayList7);
                    C1400960mYo c1400960mYo3 = this.LIZLLL;
                    c1400960mYo3.LJIIL = true;
                    c1400960mYo3.LJIIJJI = null;
                } else if ((!this.LIZLLL.LJIIIIZZ.isEmpty()) && this.LIZLLL.LIZ < this.LIZJ.getData().showMoreTimes) {
                    arrayList2.addAll(this.LIZLLL.LJII);
                    arrayList2.addAll(this.LIZLLL.LJIIIIZZ);
                    C1400960mYo c1400960mYo4 = this.LIZLLL;
                    c1400960mYo4.LJII = new ArrayList(c1400960mYo4.LJIIIZ);
                    this.LIZLLL.LJIIIIZZ = C13BV.INSTANCE;
                } else if (this.LIZJ.getData().isHasMore() && this.LIZLLL.LJIIIIZZ.isEmpty() && (data = this.LIZJ.getData()) != null && data.requestingNormalData && this.LIZLLL.LIZ < this.LIZJ.getData().showMoreTimes) {
                    C1400960mYo c1400960mYo5 = this.LIZLLL;
                    c1400960mYo5.LIZIZ = true;
                    arrayList2.addAll(c1400960mYo5.LJII);
                } else {
                    C1400960mYo c1400960mYo6 = this.LIZLLL;
                    if (c1400960mYo6.LIZIZ) {
                        arrayList2.addAll(c1400960mYo6.LJIIIZ);
                        C1400960mYo c1400960mYo7 = this.LIZLLL;
                        c1400960mYo7.LJII = new ArrayList(c1400960mYo7.LJIIIZ);
                    } else if (Intrinsics.LJFF(this.LIZJ.getData().lastDataFrom, "square")) {
                        arrayList2.addAll(this.LIZLLL.LJII);
                    } else if (this.LIZJ.getData().showMoreTimes > 0) {
                        ArrayList arrayList8 = new ArrayList(this.LIZLLL.LJIIIZ);
                        arrayList8.removeAll(this.LIZLLL.LJII);
                        this.LIZLLL.LJIIIIZZ = new ArrayList(arrayList8);
                        arrayList2.addAll(this.LIZLLL.LJII);
                    }
                }
            }
            this.LIZJ.getData().foldAidItems.clear();
            this.LIZJ.getData().foldAidItems.addAll(this.LIZLLL.LJIIIIZZ);
            this.LIZJ.getData().showAidItems.clear();
            this.LIZJ.getData().showAidItems.addAll(this.LIZLLL.LJII);
            C1401100mZ2 c1401100mZ22 = C1401100mZ2.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AddShowAidListStrategy after-->show:");
            sbLIZ.append(arrayList2.size());
            sbLIZ.append(" showNormalAidList:");
            sbLIZ.append(this.LIZLLL.LJII.size());
            sbLIZ.append(" foldNormalAidList:");
            sbLIZ.append(this.LIZLLL.LJIIIIZZ.size());
            sbLIZ.append(' ');
            C201955140j.LIZJ(c1401100mZ22, C2188811AlT.LIZIZ(sbLIZ));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public C1400920mYk(C1401320mZO c1401320mZO, C1400960mYo c1400960mYo) {
        super(Unit.LIZ);
        this.LIZJ = c1401320mZO;
        this.LIZLLL = c1400960mYo;
    }
}
