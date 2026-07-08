package X;

import Y.ARunnableS127S0100000_27;
import android.content.Context;
import android.os.Looper;
import com.bytedance.android.livesdk.model.message.RankAnimationInfo;
import com.bytedance.android.livesdk.rank.api.RankAnimationType;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0y2r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1842430y2r {
    public final C1842360y2k LIZ;
    public final InterfaceC1842810y3T LIZIZ;
    public Context LIZJ;
    public final InterfaceC1842570y35 LIZLLL;
    public final Function0<C1091250eVH> LJ;
    public final Function0<Integer> LJFF;
    public long LJI;
    public final int LJII = (int) C497740JfY.LIZIZ(40.0f);
    public int LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public final Map<Integer, Integer> LJIIL;
    public final float LJIILIIL;
    public final float LJIILJJIL;
    public final float LJIILL;
    public C1842470y2v LJIILLIIL;
    public C1842470y2v LJIIZILJ;
    public C1842470y2v LJIJ;
    public final C1105810esl LJIJI;
    public final Map<Integer, TreeMap<Integer, C1842470y2v>> LJIJJ;
    public boolean LJIJJLI;
    public AbstractC1842530y31 LJIL;
    public final BPEAHandler LJJ;
    public ARunnableS127S0100000_27 LJJI;
    public ARunnableS127S0100000_27 LJJIFFI;
    public boolean LJJII;

    public final void LIZJ() {
        int i;
        Map.Entry entryPollFirstEntry;
        C1842470y2v c1842470y2v;
        C1842470y2v c1842470y2vLIZ;
        C20441214yg.LIZIZ("Ranking Entrance Unification", "tryToDisplayDelayedAnimation");
        C1842470y2v c1842470y2v2 = this.LJIILLIIL;
        if (c1842470y2v2 != null) {
            int i2 = c1842470y2v2.LIZ.LIZIZ.type;
            RankAnimationInfo rankAnimationInfo = c1842470y2v2.LJI;
            if (rankAnimationInfo != null) {
                i = rankAnimationInfo.type;
            } else {
                RankAnimationType rankAnimationType = RankAnimationType.LIZ;
                i = RankAnimationType.LIZLLL.type;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("current - ");
            sbLIZ.append(i2);
            sbLIZ.append(" - ");
            sbLIZ.append(i);
            sbLIZ.append(" - ");
            sbLIZ.append(c1842470y2v2.LIZIZ);
            C20441214yg.LIZIZ("Ranking Entrance Unification", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("pendingAnimationTextInfoMap before - ");
            TreeMap treeMap = (TreeMap) ((LinkedHashMap) this.LJIJJ).get(Integer.valueOf(i2));
            sbLIZ2.append(treeMap != null ? Integer.valueOf(treeMap.size()) : null);
            C20441214yg.LIZIZ("Ranking Entrance Unification", C2188811AlT.LIZIZ(sbLIZ2));
            TreeMap treeMap2 = (TreeMap) ((LinkedHashMap) this.LJIJJ).get(Integer.valueOf(i2));
            if (treeMap2 == null || (entryPollFirstEntry = treeMap2.pollFirstEntry()) == null || (c1842470y2v = (C1842470y2v) entryPollFirstEntry.getValue()) == null || (c1842470y2vLIZ = c1842470y2v.LIZ()) == null) {
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("target - ");
            sbLIZ3.append(c1842470y2vLIZ.LIZ.LIZIZ.type);
            sbLIZ3.append(" - ");
            RankAnimationInfo rankAnimationInfo2 = c1842470y2vLIZ.LJI;
            sbLIZ3.append(rankAnimationInfo2 != null ? Integer.valueOf(rankAnimationInfo2.type) : null);
            sbLIZ3.append(" - ");
            sbLIZ3.append(c1842470y2vLIZ.LIZIZ);
            C20441214yg.LIZIZ("Ranking Entrance Unification", C2188811AlT.LIZIZ(sbLIZ3));
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("pendingAnimationTextInfoMap after - ");
            TreeMap treeMap3 = (TreeMap) ((LinkedHashMap) this.LJIJJ).get(Integer.valueOf(i2));
            sbLIZ4.append(treeMap3 != null ? Integer.valueOf(treeMap3.size()) : null);
            C20441214yg.LIZIZ("Ranking Entrance Unification", C2188811AlT.LIZIZ(sbLIZ4));
            this.LIZ.LJFF(c1842470y2v2, c1842470y2vLIZ);
        }
    }

    public final int LIZ(Integer num) {
        if (num != null) {
            Integer num2 = (Integer) ((LinkedHashMap) this.LJIIL).get(num);
            if (num2 != null) {
                return num2.intValue();
            }
            return this.LJIIIIZZ;
        }
        return this.LJIIIIZZ;
    }

    public final int LIZIZ(int i) {
        RankAnimationType rankAnimationType = RankAnimationType.LIZ;
        if (i != RankAnimationType.LJIJI.type && i != RankAnimationType.LJIJJ.type && i != RankAnimationType.LJIIZILJ.type && i != RankAnimationType.LJIIJ.type && i != RankAnimationType.LJIIJJI.type && i != RankAnimationType.LJIIL.type) {
            return this.LJIIIZ;
        }
        return this.LJIIIIZZ;
    }

    public final void LIZLLL(C1842470y2v c1842470y2v) {
        int i;
        Integer numValueOf;
        int i2 = c1842470y2v.LIZ.LIZIZ.type;
        RankAnimationInfo rankAnimationInfo = c1842470y2v.LJI;
        if (rankAnimationInfo != null) {
            i = rankAnimationInfo.type;
        } else {
            i = RankAnimationType.LIZLLL.type;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateDelayedAnimationTextInfo: ");
        sbLIZ.append(i2);
        sbLIZ.append(", ");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        RankAnimationInfo rankAnimationInfo2 = c1842470y2v.LJI;
        String content = null;
        if (rankAnimationInfo2 != null) {
            numValueOf = Integer.valueOf(rankAnimationInfo2.type);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", ");
        RankAnimationInfo rankAnimationInfo3 = c1842470y2v.LJI;
        if (rankAnimationInfo3 != null) {
            content = rankAnimationInfo3.getContent();
        }
        sbLIZ.append(content);
        sbLIZ.append(", ");
        sbLIZ.append(c1842470y2v.LIZIZ);
        C20441214yg.LIZIZ("Ranking Entrance Unification", C2188811AlT.LIZIZ(sbLIZ));
        Map<Integer, TreeMap<Integer, C1842470y2v>> map = this.LJIJJ;
        Integer numValueOf2 = Integer.valueOf(i2);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object treeMap = linkedHashMap.get(numValueOf2);
        if (treeMap == null) {
            treeMap = new TreeMap(this.LJIJI);
            linkedHashMap.put(numValueOf2, treeMap);
        }
        ((TreeMap) treeMap).put(Integer.valueOf(i), c1842470y2v);
    }

    public C1842430y2r(C1842360y2k c1842360y2k, InterfaceC1842810y3T interfaceC1842810y3T, Context context, C1843120y3y c1843120y3y, Function0 function0, Function0 function02) {
        this.LIZ = c1842360y2k;
        this.LIZIZ = interfaceC1842810y3T;
        this.LIZJ = context;
        this.LIZLLL = c1843120y3y;
        this.LJ = function0;
        this.LJFF = function02;
        C497740JfY.LJFF(R.color.a1d);
        this.LJIIIIZZ = C497740JfY.LJFF(R.color.cx);
        this.LJIIIZ = C20736316Cj.LIZIZ(R.attr.eqo, this.LIZJ);
        C497740JfY.LJFF(R.color.a67);
        this.LJIIJ = C20736316Cj.LIZIZ(R.attr.ezq, this.LIZJ);
        this.LJIIJJI = C20736316Cj.LIZIZ(R.attr.ezs, this.LIZJ);
        this.LJIIL = new LinkedHashMap();
        C497740JfY.LIZIZ(11.0f);
        this.LJIILIIL = 1.18f;
        this.LJIILJJIL = 0.8f;
        this.LJIILL = (int) C497740JfY.LIZIZ(22.0f);
        this.LJIJI = C1105810esl.LL;
        this.LJIJJ = new LinkedHashMap();
        this.LJIJJLI = true;
        this.LJJ = new BPEAHandler(Looper.getMainLooper());
    }
}
