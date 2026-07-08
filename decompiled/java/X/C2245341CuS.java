package X;

import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.model.RankData;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model.BaseRankModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: renamed from: X.1CuS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2245341CuS implements InterfaceC2245251CuJ {
    public final C2245131Cu7 LIZ;
    public final InterfaceC1609890rzn LIZIZ;
    public final int LIZJ;
    public final List<BaseRankModel> LIZLLL;
    public final Map<String, BaseRankModel> LJ;
    public final InterfaceC2245571Cup LJFF;
    public final boolean LJI;
    public final C01GW LJII = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(221));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3414));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(223));
    public final C01GW LJIIJ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(224));
    public final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(222));
    public final C01GW LJIIL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(225));

    public final boolean LIZLLL() {
        return ((Boolean) this.LJIIJJI.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x016f A[PHI: r15
      0x016f: PHI (r15v6 int) = (r15v1 int), (r15v8 int) binds: [B:48:0x0165, B:52:0x016d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0207  */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.util.ArrayList] */
    @Override // X.InterfaceC2245251CuJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C2245231CuH r24) {
        /*
            Method dump skipped, instruction units count: 1049
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2245341CuS.LIZ(X.1CuH):void");
    }

    public final void LIZJ(List<? extends InterfaceC2245651Cux> list) {
        for (InterfaceC2245651Cux interfaceC2245651Cux : list) {
            if (interfaceC2245651Cux instanceof C2190061AnU) {
                C2190061AnU c2190061AnU = (C2190061AnU) interfaceC2245651Cux;
                if (this.LJFF.LIZLLL(c2190061AnU.LIZIZ) == null) {
                    if (this.LJFF.LIZJ(c2190061AnU.LIZIZ) != null) {
                        C1022620cia.LIZ("ReRankCallback", "[calculateReRankSteps] insert, check post-roll success");
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("replaceInsertCheckException, aid=");
                        sbLIZ.append(c2190061AnU.LIZIZ);
                        throw new Exception(C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else {
                    this.LJFF.LIZIZ(Collections.singletonList(c2190061AnU.LIZIZ));
                    C1022620cia.LIZ("ReRankCallback", "[calculateReRankSteps] insert, check candidate success");
                }
            }
        }
    }

    @Override // X.InterfaceC2245251CuJ
    public final void onFailed(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onFailed] error=");
        sbLIZ.append(str);
        C1022620cia.LIZ("ReRankCallback", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Set LIZIZ(int r14, java.util.List r15, java.util.List r16, X.C1609880rzm r17) {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2245341CuS.LIZIZ(int, java.util.List, java.util.List, X.0rzm):java.util.Set");
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x020b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x011e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Set LJFF(int r15, java.util.List r16, X.C1609880rzm r17, java.util.List r18) {
        /*
            Method dump skipped, instruction units count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2245341CuS.LJFF(int, java.util.List, X.0rzm, java.util.List):java.util.Set");
    }

    public final void LJ(List list, C1609880rzm c1609880rzm, List list2, int i, int i2) {
        C2245351CuT.LJIIZILJ = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[replaceFeedList] feedList.size=");
        sbLIZ.append(list2.size());
        sbLIZ.append(", originReRankList.size=");
        sbLIZ.append(i2 - i);
        sbLIZ.append(", resultReRankList.size=");
        sbLIZ.append(list.size());
        sbLIZ.append(", begin=");
        sbLIZ.append(i);
        sbLIZ.append(", end=");
        sbLIZ.append(i2);
        C1022620cia.LIZ("ReRankCallback", C2188811AlT.LIZIZ(sbLIZ));
        this.LJFF.LJ(true);
        ArrayList<Aweme> arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((RankData) it2.next()).getOriginItem());
        }
        C2245351CuT.LJIJ = System.currentTimeMillis() - C2245351CuT.LJIIZILJ;
        C2245351CuT.LJIJI = System.currentTimeMillis();
        if (!arrayList.isEmpty()) {
            for (Aweme aweme : arrayList) {
                if (aweme.isAd()) {
                    if (aweme.getMarketSubType() == 0 && aweme.isAd()) {
                        aweme.setMarketSubType(1);
                    }
                    C0OF0.LIZIZ(aweme, "ad_rerank");
                }
            }
        }
        c1609880rzm.LIZ.fF(i, i2, "ad_rerank", arrayList);
        C2245351CuT.LJIJJ = System.currentTimeMillis() - C2245351CuT.LJIJI;
        this.LJFF.LJ(false);
    }

    public C2245341CuS(C2245131Cu7 c2245131Cu7, InterfaceC1609890rzn interfaceC1609890rzn, int i, List list, Map map, C2245331CuR c2245331CuR, boolean z) {
        this.LIZ = c2245131Cu7;
        this.LIZIZ = interfaceC1609890rzn;
        this.LIZJ = i;
        this.LIZLLL = list;
        this.LJ = map;
        this.LJFF = c2245331CuR;
        this.LJI = z;
    }
}
