package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.RankAnimationInfo;
import com.bytedance.android.livesdk.model.message.RankUpdate;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.api.RankAnimationType;
import com.bytedance.android.livesdk.rank.model.AffiliatedInfo;
import com.bytedance.android.livesdk.rank.model.ClassInfo;
import com.bytedance.android.livesdk.rank.model.RankEntrance;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0y2q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1842420y2q {
    public C1810410xDD LIZ;
    public C1810410xDD LIZIZ;
    public Text LIZJ;
    public Text LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public long LJI;
    public long LJII;
    public RankAnimationInfo LJIIIIZZ;
    public boolean LJIIIZ;
    public ImageModel LJIIJ;
    public int LJIIJJI;
    public String LJIIL;

    public final C1842420y2q LIZ() {
        C1842420y2q c1842420y2q = new C1842420y2q();
        c1842420y2q.LIZ = this.LIZ;
        c1842420y2q.LIZIZ = this.LIZIZ;
        c1842420y2q.LIZJ = this.LIZJ;
        c1842420y2q.LIZLLL = this.LIZLLL;
        c1842420y2q.LJ = this.LJ;
        c1842420y2q.LJFF = this.LJFF;
        c1842420y2q.LJI = this.LJI;
        c1842420y2q.LJII = this.LJII;
        c1842420y2q.LJIIIZ = this.LJIIIZ;
        if (this.LJIIIIZZ != null) {
            RankAnimationInfo rankAnimationInfo = new RankAnimationInfo();
            RankAnimationInfo rankAnimationInfo2 = this.LJIIIIZZ;
            rankAnimationInfo.type = rankAnimationInfo2 != null ? rankAnimationInfo2.type : RankAnimationType.LIZLLL.type;
            rankAnimationInfo.setBackgroundColor(rankAnimationInfo2 != null ? rankAnimationInfo2.getBackgroundColor() : 0);
            RankAnimationInfo rankAnimationInfo3 = this.LJIIIIZZ;
            rankAnimationInfo.backgroundColorString = rankAnimationInfo3 != null ? rankAnimationInfo3.backgroundColorString : null;
            rankAnimationInfo.setContent(rankAnimationInfo3 != null ? rankAnimationInfo3.getContent() : null);
            RankAnimationInfo rankAnimationInfo4 = this.LJIIIIZZ;
            rankAnimationInfo.contentText = rankAnimationInfo4 != null ? rankAnimationInfo4.contentText : null;
            rankAnimationInfo.duration = rankAnimationInfo4 != null ? rankAnimationInfo4.duration : 0L;
            c1842420y2q.LJIIIIZZ = rankAnimationInfo;
        }
        c1842420y2q.LJIIJ = this.LJIIJ;
        c1842420y2q.LJIIL = this.LJIIL;
        return c1842420y2q;
    }

    public C1842420y2q() {
        C1810410xDD c1810410xDD = C1810410xDD.LJI;
        this.LIZ = C1810410xDD.LJI;
        this.LJIIJJI = EnumC1083210eIJ.DEFAULT.getType();
        this.LJIIL = "";
    }

    public final boolean equals(Object obj) {
        int i;
        int i2;
        String uri;
        String uri2;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C1842420y2q)) {
            C1842420y2q c1842420y2q = (C1842420y2q) obj;
            if (Intrinsics.LJFF(this.LIZ, c1842420y2q.LIZ)) {
                String str = "";
                if (Intrinsics.LJFF(C1133830fbx.LJIILIIL(this.LIZJ, "").toString(), C1133830fbx.LJIILIIL(c1842420y2q.LIZJ, "").toString()) && Intrinsics.LJFF(C1133830fbx.LJIILIIL(this.LIZLLL, "").toString(), C1133830fbx.LJIILIIL(c1842420y2q.LIZLLL, "").toString()) && this.LJ == c1842420y2q.LJ && this.LJI == c1842420y2q.LJI && this.LJII == c1842420y2q.LJII && this.LJIIIZ == c1842420y2q.LJIIIZ) {
                    RankAnimationInfo rankAnimationInfo = this.LJIIIIZZ;
                    if (rankAnimationInfo != null) {
                        i = rankAnimationInfo.type;
                    } else {
                        RankAnimationType rankAnimationType = RankAnimationType.LIZ;
                        i = RankAnimationType.LIZLLL.type;
                    }
                    RankAnimationInfo rankAnimationInfo2 = c1842420y2q.LJIIIIZZ;
                    if (rankAnimationInfo2 != null) {
                        i2 = rankAnimationInfo2.type;
                    } else {
                        RankAnimationType rankAnimationType2 = RankAnimationType.LIZ;
                        i2 = RankAnimationType.LIZLLL.type;
                    }
                    if (i == i2) {
                        ImageModel imageModel = this.LJIIJ;
                        if (imageModel == null || (uri = imageModel.getUri()) == null) {
                            uri = "";
                        }
                        ImageModel imageModel2 = c1842420y2q.LJIIJ;
                        if (imageModel2 != null && (uri2 = imageModel2.getUri()) != null) {
                            str = uri2;
                        }
                        if (Intrinsics.LJFF(uri, str)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public C1842420y2q(RankUpdate rankUpdate, EnumC1811400xEo enumC1811400xEo) {
        int i;
        Text text;
        long j;
        this.LIZ = C1810410xDD.LJI;
        this.LJIIJJI = EnumC1083210eIJ.DEFAULT.getType();
        this.LJIIL = "";
        int i2 = rankUpdate.rankType;
        int i3 = rankUpdate.belongType;
        int i4 = rankUpdate.requestFirstShowType;
        ClassInfo classInfo = rankUpdate.classInfo;
        if (classInfo != null) {
            i = classInfo.classType;
        } else {
            i = 0;
        }
        this.LIZ = new C1810410xDD(enumC1811400xEo, i2, i3, i4, false, i);
        int i5 = rankUpdate.rankType;
        int i6 = rankUpdate.belongType;
        int i7 = rankUpdate.requestFirstShowType;
        ClassInfo classInfo2 = rankUpdate.classInfo;
        this.LIZIZ = new C1810410xDD(enumC1811400xEo, i5, i6, i7, false, classInfo2 != null ? classInfo2.classType : 0);
        this.LIZJ = rankUpdate.defaultContent;
        RankUpdate.AffiliatedInfo affiliatedInfo = rankUpdate.affiliatedInfo;
        if (affiliatedInfo != null) {
            text = affiliatedInfo.textContent;
        } else {
            text = null;
        }
        this.LIZLLL = text;
        this.LJI = rankUpdate.ownRank;
        if (affiliatedInfo != null) {
            j = affiliatedInfo.realTimeRank;
        } else {
            j = 0;
        }
        this.LJII = j;
        RankAnimationInfo rankAnimationInfo = rankUpdate.animationInfo;
        this.LJIIIIZZ = rankAnimationInfo;
        if (rankAnimationInfo != null) {
            try {
                Gson gson = C19748512Ol.LIZJ;
                this.LJIIIIZZ = (RankAnimationInfo) gson.LJII(gson.LJIILL(rankAnimationInfo), RankAnimationInfo.class);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        this.LJIIIZ = rankUpdate.owneronrank;
        this.LJIIJ = rankUpdate.entranceicon;
        this.LJIIL = rankUpdate.listSchema;
    }

    public C1842420y2q(RankEntrance rankEntrance, EnumC1811400xEo enumC1811400xEo) {
        int i;
        Text text;
        this.LIZ = C1810410xDD.LJI;
        this.LJIIJJI = EnumC1083210eIJ.DEFAULT.getType();
        this.LJIIL = "";
        int i2 = rankEntrance.rankType;
        int i3 = rankEntrance.belongRankType;
        int i4 = rankEntrance.requestFirstShowType;
        ClassInfo classInfo = rankEntrance.classInfo;
        if (classInfo != null) {
            i = classInfo.classType;
        } else {
            i = 0;
        }
        this.LIZ = new C1810410xDD(enumC1811400xEo, i2, i3, i4, false, i);
        int i5 = rankEntrance.rankType;
        int i6 = rankEntrance.belongRankType;
        int i7 = rankEntrance.requestFirstShowType;
        ClassInfo classInfo2 = rankEntrance.classInfo;
        this.LIZIZ = new C1810410xDD(enumC1811400xEo, i5, i6, i7, false, classInfo2 != null ? classInfo2.classType : 0);
        this.LIZJ = rankEntrance.defaultContent;
        AffiliatedInfo affiliatedInfo = rankEntrance.affiliatedContent;
        if (affiliatedInfo != null) {
            text = affiliatedInfo.subContent;
        } else {
            text = null;
        }
        this.LIZLLL = text;
        this.LJI = rankEntrance.ownerRankIdx;
        this.LJII = 0L;
        this.LJIIIZ = rankEntrance.ownerOnRank;
        this.LJIIJ = rankEntrance.entranceicon;
        this.LJIIL = rankEntrance.listSchema;
    }
}
