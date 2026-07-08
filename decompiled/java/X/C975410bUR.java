package X;

import android.widget.LinearLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchScoreTrackSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bUR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C975410bUR {
    public boolean LJIIJJI;
    public boolean LJIILJJIL;
    public int LIZ = -1;
    public final LinkedHashMap<Long, Long> LIZIZ = new LinkedHashMap<>();
    public LinkedHashMap<Long, Long> LIZJ = new LinkedHashMap<>();
    public final LinkedHashMap<Long, Long> LIZLLL = new LinkedHashMap<>();
    public LinkedHashMap<Long, Long> LJ = new LinkedHashMap<>();
    public LinkedHashMap<Long, Long> LJFF = new LinkedHashMap<>();
    public LinkedHashMap<Long, Long> LJI = new LinkedHashMap<>();
    public final ArrayList<Long> LJII = new ArrayList<>();
    public final ArrayList<Long> LJIIIIZZ = new ArrayList<>();
    public final ArrayList<Long> LJIIIZ = new ArrayList<>();
    public final LinkedHashMap<Long, ArrayList<Long>> LJIIJ = new LinkedHashMap<>();
    public String LJIIL = CardStruct.IStatusCode.DEFAULT;
    public String LJIILIIL = "none";

    public static Map LJIIIIZZ() {
        MutableLiveData<List<C976480bWA>> mutableLiveDataLJJJJIZL;
        List<C976480bWA> value;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null && (mutableLiveDataLJJJJIZL = interfaceC973730bRjYf2.LJJJJIZL()) != null && (value = mutableLiveDataLJJJJIZL.getValue()) != null) {
            for (C976480bWA c976480bWA : value) {
                linkedHashMap.put(Long.valueOf(c976480bWA.LIZ), Long.valueOf(c976480bWA.LIZIZ));
            }
        }
        return linkedHashMap;
    }

    public final void LJIIJ() {
        if (this.LIZJ.size() != this.LJII.size()) {
            LinkedHashMap<Long, Long> linkedHashMap = this.LIZIZ;
            LinkedHashMap<Long, Long> linkedHashMap2 = this.LIZJ;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry<Long, Long> entry : linkedHashMap2.entrySet()) {
                long jLongValue = entry.getKey().longValue();
                long jLongValue2 = entry.getValue().longValue();
                if (!this.LJII.contains(Long.valueOf(jLongValue)) && jLongValue2 > 0) {
                    linkedHashMap3.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            linkedHashMap4.putAll(linkedHashMap3);
            linkedHashMap.putAll(linkedHashMap4);
        }
        LJIIJJI();
    }

    public final void LJIIJJI() {
        if ((!this.LJII.isEmpty()) && (!this.LIZJ.isEmpty()) && !Intrinsics.LJFF(C13LP.LLIIII(this.LIZJ.keySet()), this.LJII)) {
            ArrayList<Long> arrayList = this.LJII;
            ArrayList arrayList2 = new ArrayList();
            Iterator<Long> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                long jLongValue = it2.next().longValue();
                Long l = this.LIZJ.get(Long.valueOf(jLongValue));
                if (l != null) {
                    arrayList2.add(new Pair(Long.valueOf(jLongValue), Long.valueOf(l.longValue())));
                }
            }
            LinkedHashMap<Long, Long> linkedHashMap = new LinkedHashMap<>();
            C2097608Jq.LJIILJJIL(arrayList2, linkedHashMap);
            this.LIZJ = linkedHashMap;
        }
    }

    public final void LJIIL() {
        ArrayList<Long> arrayList = this.LJII;
        ArrayList arrayList2 = new ArrayList();
        Iterator<Long> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            long jLongValue = it2.next().longValue();
            Long l = this.LJ.get(Long.valueOf(jLongValue));
            if (l != null) {
                arrayList2.add(new Pair(Long.valueOf(jLongValue), Long.valueOf(l.longValue())));
            }
        }
        LinkedHashMap<Long, Long> linkedHashMap = new LinkedHashMap<>();
        C2097608Jq.LJIILJJIL(arrayList2, linkedHashMap);
        this.LJ = linkedHashMap;
        ArrayList<Long> arrayList3 = this.LJII;
        ArrayList arrayList4 = new ArrayList();
        Iterator<Long> it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            long jLongValue2 = it3.next().longValue();
            Long l2 = this.LJFF.get(Long.valueOf(jLongValue2));
            if (l2 != null) {
                arrayList4.add(new Pair(Long.valueOf(jLongValue2), Long.valueOf(l2.longValue())));
            }
        }
        LinkedHashMap<Long, Long> linkedHashMap2 = new LinkedHashMap<>();
        C2097608Jq.LJIILJJIL(arrayList4, linkedHashMap2);
        this.LJFF = linkedHashMap2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIZ() {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C975410bUR.LJIIIZ():boolean");
    }

    public final void LIZ(ArrayList<EnumC975430bUT> arrayList) {
        if ((!this.LJ.isEmpty()) && (!this.LJII.isEmpty()) && this.LJ.size() == this.LJII.size() && !Intrinsics.LJFF(C13LP.LLIIII(this.LJ.keySet()), this.LJII)) {
            arrayList.add(EnumC975430bUT.PERSONAL_SCORE_POSITION);
        }
    }

    public final void LIZIZ(ArrayList<EnumC975430bUT> arrayList) {
        ViewOnClickListenerC986770bml viewOnClickListenerC986770bmlX1;
        LinearLayout hostScoreLayout;
        if (this.LIZJ.isEmpty()) {
            return;
        }
        this.LJIIIZ.clear();
        Iterator<Long> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            long jLongValue = it2.next().longValue();
            if (!this.LIZJ.containsKey(Long.valueOf(jLongValue))) {
                return;
            }
            try {
                MatchBaseWidget matchBaseWidget = C975400bUQ.LIZIZ;
                if (matchBaseWidget != null && (viewOnClickListenerC986770bmlX1 = matchBaseWidget.x1(jLongValue)) != null && (hostScoreLayout = viewOnClickListenerC986770bmlX1.getHostScoreLayout()) != null && hostScoreLayout.getVisibility() != 0) {
                    arrayList.add(EnumC975430bUT.PERSONAL_SCORE_SHOW);
                    this.LJIIIZ.add(Long.valueOf(jLongValue));
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("checkPersonalScoreShow: Exception ");
                sbLIZ.append(e);
                C20441214yg.LJ("MatchScoreAccuracyHelper", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public final void LIZJ(ArrayList<EnumC975430bUT> arrayList) {
        Long l;
        if ((!this.LJ.isEmpty()) && (!this.LIZJ.isEmpty())) {
            for (Map.Entry<Long, Long> entry : this.LJ.entrySet()) {
                long jLongValue = entry.getKey().longValue();
                long jLongValue2 = entry.getValue().longValue();
                if (this.LIZJ.containsKey(Long.valueOf(jLongValue)) && ((l = this.LIZJ.get(Long.valueOf(jLongValue))) == null || jLongValue2 != l.longValue())) {
                    arrayList.add(EnumC975430bUT.PERSONAL_SCORE_VALUE);
                    return;
                }
            }
        }
    }

    public final void LJ(ArrayList<EnumC975430bUT> arrayList) {
        long jLJJJJJ;
        long jLongValue;
        if (this.LIZ == 0 && !this.LIZLLL.isEmpty()) {
            boolean zLIZLLL = C970370bMJ.LIZLLL();
            if (!zLIZLLL && !C970370bMJ.LJIIIIZZ()) {
                if (C970370bMJ.LJ() && (!this.LIZLLL.isEmpty()) && (!this.LJII.isEmpty()) && this.LIZLLL.size() == this.LJII.size() && !Intrinsics.LJFF(C13LP.LLIIII(this.LIZLLL.keySet()), this.LJII)) {
                    arrayList.add(EnumC975430bUT.SCORE_BAR_POSITION);
                    return;
                }
                return;
            }
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf2 != null) {
                jLJJJJJ = interfaceC973730bRjYf2.LJJJJJ();
            } else {
                jLJJJJJ = 0;
            }
            Long l = (Long) C13LP.LJJJLIIL(this.LIZLLL.keySet());
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            C974540bT2 c974540bT2 = C974540bT2.LIZ;
            long jLJJIIZ = C974540bT2.LJJIIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkScoreBarPosition: is1v1Match ");
            sbLIZ.append(zLIZLLL);
            sbLIZ.append(", selfTeamId ");
            sbLIZ.append(jLJJJJJ);
            sbLIZ.append(", scoreBarLeftTeamId ");
            sbLIZ.append(jLongValue);
            sbLIZ.append(", curAnchorId ");
            sbLIZ.append(jLJJIIZ);
            C20441214yg.LIZIZ("MatchScoreAccuracyHelper", C2188811AlT.LIZIZ(sbLIZ));
            if (jLJJIIZ == 0 || jLongValue == 0 || jLJJJJJ == 0 || this.LIZLLL.size() != 2 || jLongValue == jLJJJJJ) {
                return;
            }
            if (zLIZLLL) {
                if (jLJJIIZ == jLongValue) {
                    return;
                }
                arrayList.add(EnumC975430bUT.SCORE_BAR_POSITION);
                return;
            }
            arrayList.add(EnumC975430bUT.SCORE_BAR_POSITION);
        }
    }

    public final void LJFF(ArrayList<EnumC975430bUT> arrayList) {
        Long l;
        LinkedHashMap<Long, Long> linkedHashMap = this.LJI;
        boolean zIsEmpty = linkedHashMap.isEmpty();
        Map mapLJIIIIZZ = linkedHashMap;
        if (zIsEmpty) {
            mapLJIIIIZZ = LJIIIIZZ();
        }
        if (this.LIZ == 0 && (!this.LIZLLL.isEmpty()) && (!mapLJIIIIZZ.isEmpty()) && this.LIZLLL.size() == mapLJIIIIZZ.size()) {
            for (Map.Entry<Long, Long> entry : this.LIZLLL.entrySet()) {
                long jLongValue = entry.getKey().longValue();
                long jLongValue2 = entry.getValue().longValue();
                if (mapLJIIIIZZ.containsKey(Long.valueOf(jLongValue)) && ((l = (Long) mapLJIIIIZZ.get(Long.valueOf(jLongValue))) == null || jLongValue2 != l.longValue())) {
                    arrayList.add(EnumC975430bUT.SCORE_BAR_VALUE);
                    return;
                }
            }
        }
    }

    public final void LJII(ArrayList<EnumC975430bUT> arrayList) {
        Long l;
        if (!this.LIZIZ.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkScoreUIConsistent: dataTeamQuitScores.isNotEmpty() ");
            sbLIZ.append(this.LIZIZ);
            C20441214yg.LJIIIZ("MatchScoreAccuracyHelper", C2188811AlT.LIZIZ(sbLIZ));
            if (LiveMatchScoreTrackSetting.INSTANCE.enableTrackNormal()) {
                arrayList.add(EnumC975430bUT.SCORE_UI_CONSISTENT);
                return;
            }
            return;
        }
        if (this.LIZ == 0 && !this.LIZLLL.isEmpty() && !this.LJ.isEmpty()) {
            if (C970370bMJ.LJ()) {
                if (this.LIZLLL.size() == this.LJ.size()) {
                    LinkedHashMap<Long, Long> linkedHashMap = this.LIZLLL;
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry<Long, Long> entry : linkedHashMap.entrySet()) {
                            long jLongValue = entry.getKey().longValue();
                            long jLongValue2 = entry.getValue().longValue();
                            if (this.LJ.containsKey(Long.valueOf(jLongValue)) && ((l = this.LJ.get(Long.valueOf(jLongValue))) == null || l.longValue() != jLongValue2)) {
                                arrayList.add(EnumC975430bUT.SCORE_UI_CONSISTENT);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (!C970370bMJ.LJIIIIZZ() || !(!this.LJII.isEmpty()) || !(!this.LJ.isEmpty()) || !(!this.LIZLLL.isEmpty())) {
                return;
            }
            for (Map.Entry<Long, Long> entry2 : this.LIZLLL.entrySet()) {
                long jLongValue3 = entry2.getKey().longValue();
                long jLongValue4 = entry2.getValue().longValue();
                long j = 0;
                for (Map.Entry<Long, Long> entry3 : this.LJ.entrySet()) {
                    long jLongValue5 = entry3.getKey().longValue();
                    long jLongValue6 = entry3.getValue().longValue();
                    ArrayList<Long> arrayList2 = this.LJIIJ.get(Long.valueOf(jLongValue3));
                    if (arrayList2 != null && arrayList2.contains(Long.valueOf(jLongValue5))) {
                        j += jLongValue6;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("checkScoreUIConsistent: teamId ");
                    sbLIZ2.append(jLongValue3);
                    sbLIZ2.append(", teamScore ");
                    sbLIZ2.append(jLongValue4);
                    sbLIZ2.append(", anchorId ");
                    sbLIZ2.append(jLongValue5);
                    sbLIZ2.append(", anchorScore ");
                    sbLIZ2.append(jLongValue6);
                    sbLIZ2.append(", anchorScoreSum ");
                    sbLIZ2.append(j);
                    C20441214yg.LIZIZ("MatchScoreAccuracyHelper", C2188811AlT.LIZIZ(sbLIZ2));
                }
                if (jLongValue4 != j) {
                    arrayList.add(EnumC975430bUT.SCORE_UI_CONSISTENT);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(int r14, java.util.ArrayList r15) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C975410bUR.LJI(int, java.util.ArrayList):void");
    }

    public final synchronized void LIZLLL(ArrayList arrayList, int i, String str, AFwS203S0000000_15 aFwS203S0000000_15) {
        String str2;
        if (this.LJIIJJI && C915980Zwa.LJFF().co0() && LJIIIZ()) {
            if (!this.LJIILJJIL && !C970370bMJ.LJFF()) {
                if (i != -1) {
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                str2 = "none";
                            } else {
                                str2 = "draw";
                            }
                        } else {
                            str2 = "lost";
                        }
                    } else {
                        str2 = "win";
                    }
                    this.LJIILIIL = str2;
                }
                if (this.LIZ != 0) {
                    arrayList.add(EnumC975430bUT.SCORE_BAR_SHOW);
                }
                LJ(arrayList);
                LJFF(arrayList);
                if (!C970370bMJ.LIZLLL()) {
                    LIZIZ(arrayList);
                    LIZ(arrayList);
                    LIZJ(arrayList);
                    LJII(arrayList);
                }
                if (Intrinsics.LJFF(str, EnumC975440bUU.SHOW_RESULT.getValue())) {
                    LJI(i, arrayList);
                }
                return;
            }
            if (Intrinsics.LJFF(str, EnumC975440bUU.SHOW_RESULT.getValue())) {
                arrayList.add(EnumC975430bUT.SCORE_DROP_OFF);
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkScoreAbnormal: return: matchStart ");
        sbLIZ.append(this.LJIIJJI);
        C20441214yg.LJIIIZ("MatchScoreAccuracyHelper", C2188811AlT.LIZIZ(sbLIZ));
        aFwS203S0000000_15.invoke();
    }
}
