package X;

import com.bytedance.android.live.liveinteract.competition.core.model.bizextra.TakeTheStageBizExtra;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionABInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTakeTheStageAudienceV3Setting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTakeTheStageV3Setting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0beG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C981500beG {
    public final C981480beE LIZ;
    public long LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public List<TakeTheStageBizExtra.PerformAnchor> LJ;
    public long LJFF;
    public List<Long> LJI;
    public List<Long> LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public List<Long> LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public long LJIILLIIL;
    public Map<Long, Long> LJIIZILJ;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        r5 = new java.lang.StringBuilder("getTakeStagePerformUserList userList:");
        r3 = new java.util.ArrayList(X.C15438062q.LJIJJ(r4, 10));
        r2 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
    
        if (r2.hasNext() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        r3.add(java.lang.Long.valueOf(((X.C954460awe) r2.next()).LJ));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        r5.append(r3);
        r5.append(", getCoHostLinkedUserList:");
        r1 = X.C915980Zwa.LJII().LLILZLL(true);
        r3 = new java.util.ArrayList(X.C15438062q.LJIJJ(r1, 10));
        r2 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        if (r2.hasNext() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
    
        r3.add(java.lang.Long.valueOf(r2.next().LJ));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a0, code lost:
    
        r5.append(r3);
        X.C20441214yg.LJ("Competition_TakeStageModel", r5.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C954460awe> LIZIZ() {
        /*
            r11 = this;
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List<java.lang.Long> r0 = r11.LJI
            java.util.Iterator r10 = r0.iterator()
        Lb:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lae
            java.lang.Object r0 = r10.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r8 = r0.longValue()
            com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r0 = X.C915980Zwa.LJII()
            r7 = 1
            java.util.List r0 = r0.LLILZLL(r7)
            java.util.Iterator r5 = r0.iterator()
        L28:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r3 = r5.next()
            r0 = r3
            X.0awe r0 = (X.C954460awe) r0
            long r1 = r0.LJ
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto L28
            if (r3 == 0) goto L41
            r4.add(r3)
            goto Lb
        L41:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "getTakeStagePerformUserList userList:"
            r5.<init>(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r6 = 10
            int r0 = X.C15438062q.LJIJJ(r4, r6)
            r3.<init>(r0)
            java.util.Iterator r2 = r4.iterator()
        L57:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r2.next()
            X.0awe r0 = (X.C954460awe) r0
            long r0 = r0.LJ
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.add(r0)
            goto L57
        L6d:
            r5.append(r3)
            java.lang.String r0 = ", getCoHostLinkedUserList:"
            r5.append(r0)
            com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r0 = X.C915980Zwa.LJII()
            java.util.List r1 = r0.LLILZLL(r7)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r0 = X.C15438062q.LJIJJ(r1, r6)
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L8a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La0
            java.lang.Object r0 = r2.next()
            X.0awe r0 = (X.C954460awe) r0
            long r0 = r0.LJ
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.add(r0)
            goto L8a
        La0:
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            java.lang.String r0 = "Competition_TakeStageModel"
            X.C20441214yg.LJ(r0, r1)
            goto Lb
        Lae:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C981500beG.LIZIZ():java.util.List");
    }

    public final boolean LIZLLL() {
        CompetitionABInfo.TakeTheStageABInfo takeTheStageABInfo;
        CompetitionABInfo competitionABInfo = this.LIZ.LJIJ.get(Long.valueOf(C950220apo.LJ()));
        if (competitionABInfo == null || (takeTheStageABInfo = competitionABInfo.tts) == null) {
            return false;
        }
        return takeTheStageABInfo.atmosphereDuration;
    }

    public final boolean LJ() {
        if (this.LJIILLIIL != 3) {
            return false;
        }
        if (this.LIZ.LIZIZ && LiveCoHostTakeTheStageV3Setting.INSTANCE.isEnable()) {
            return true;
        }
        return !this.LIZ.LIZIZ && LiveCoHostTakeTheStageAudienceV3Setting.INSTANCE.isEnable();
    }

    public final long LIZ() {
        return C158B.LIZJ() - this.LIZ.LJIIJ.LIZJ;
    }

    public C981500beG(C981480beE c981480beE) {
        this.LIZ = c981480beE;
        C13BV c13bv = C13BV.INSTANCE;
        this.LJ = c13bv;
        this.LJI = c13bv;
        this.LJII = c13bv;
        this.LJIIL = c13bv;
        this.LJIIZILJ = new HashMap();
    }

    public final long LIZJ(long j) {
        Long l = this.LJIIZILJ.get(Long.valueOf(j));
        if (l == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getStyleV2DefaultOrder, uid=");
            sbLIZ.append(j);
            sbLIZ.append(", defaultOrder=");
            sbLIZ.append(l);
            sbLIZ.append(", styleV2DefaultOrderMap=");
            sbLIZ.append(this.LJIIZILJ);
            C20441214yg.LJ("Competition_TakeStageModel", C2188811AlT.LIZIZ(sbLIZ));
            return 0L;
        }
        return l.longValue();
    }

    public final void LJFF(List<TakeTheStageBizExtra.PerformAnchor> list) {
        if (list.isEmpty()) {
            return;
        }
        this.LJ = list;
        HashMap map = new HashMap();
        for (TakeTheStageBizExtra.PerformAnchor performAnchor : list) {
            map.put(Long.valueOf(performAnchor.userId), Long.valueOf(performAnchor.defaultOrder));
        }
        this.LJIIZILJ = map;
    }

    public final void LJI(List<Long> list) {
        long jLongValue;
        if (LJ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updatePerformSequenceInfoForAnchor");
            sbLIZ.append(" isStyleV3. Use performance list=");
            sbLIZ.append(list);
            sbLIZ.append(" as it is");
            C20441214yg.LIZIZ("Competition_TakeStageModel", C2188811AlT.LIZIZ(sbLIZ));
            this.LJI = list;
            this.LJII = list;
            return;
        }
        List<C954460awe> list2 = this.LIZ.LJI;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<C954460awe> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().LJ));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        long j = this.LIZ.LJFF;
        Long l = (Long) C13LP.LJJJLZIJ(0, list);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        ArrayList arrayList3 = new ArrayList();
        if (jLongValue <= 0) {
            arrayList3.addAll(arrayList2);
        } else {
            ArrayList arrayList4 = (ArrayList) list;
            if (arrayList2.size() == arrayList4.size()) {
                if (j == jLongValue) {
                    arrayList3.addAll(list);
                } else {
                    arrayList3.add(Long.valueOf(jLongValue));
                    arrayList3.add(Long.valueOf(j));
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        long jLongValue2 = ((Number) it3.next()).longValue();
                        if (jLongValue2 != jLongValue && jLongValue2 != j) {
                            arrayList3.add(Long.valueOf(jLongValue2));
                        }
                    }
                }
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updatePerformSequenceInfoForAnchor");
                sbLIZ2.append(", abnormal case, performSequenceInfo=");
                sbLIZ2.append(list);
                sbLIZ2.append(", localUidList=");
                sbLIZ2.append(arrayList2);
                C20441214yg.LJ("Competition_TakeStageModel", C2188811AlT.LIZIZ(sbLIZ2));
                Long l2 = (Long) C13LP.LJJJLZIJ(0, arrayList2);
                if (l2 != null && l2.longValue() == jLongValue) {
                    arrayList3.addAll(arrayList2);
                } else {
                    arrayList3.add(Long.valueOf(jLongValue));
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        long jLongValue3 = ((Number) it4.next()).longValue();
                        if (jLongValue3 != jLongValue) {
                            arrayList3.add(Long.valueOf(jLongValue3));
                        }
                    }
                }
            }
        }
        this.LJI = arrayList3;
        this.LJII = list;
        C20441214yg.LIZIZ("Competition_TakeStageModel", "updatePerformSequenceInfoForAnchor, performSequenceList.size=" + arrayList3.size() + ", performSequenceList=" + arrayList3 + ", performSequenceInfo=" + list);
    }

    public final void LJII(long j) {
        if (LJ()) {
            List<C954460awe> listLJJLI = C915980Zwa.LJII().LJJLI();
            List<C954460awe> list = this.LIZ.LJI;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C954460awe> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(it2.next().LJ));
            }
            Set setLLIIJI = C13LP.LLIIJI(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (C954460awe c954460awe : listLJJLI) {
                if (setLLIIJI.contains(Long.valueOf(c954460awe.LJ))) {
                    arrayList2.add(c954460awe);
                }
            }
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Long.valueOf(((C954460awe) it3.next()).LJ));
            }
            List<Long> listLJLIL = arrayList3;
            if (j > 0) {
                boolean zContains = arrayList3.contains(Long.valueOf(j));
                listLJLIL = arrayList3;
                if (zContains) {
                    List listSingletonList = Collections.singletonList(Long.valueOf(j));
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj : arrayList3) {
                        if (((Number) obj).longValue() != j) {
                            arrayList4.add(obj);
                        }
                    }
                    listLJLIL = C13LP.LJLIL(arrayList4, listSingletonList);
                }
            }
            this.LJI = listLJLIL;
            C20441214yg.LIZIZ("Competition_TakeStageModel", "updatePerformSequenceInfoForAudience isStyleV3. Use mic ordered list with enlarged anchor fallback. micPosOrderedUsers size=" + listLJJLI.size() + " allowedUids size=" + setLLIIJI.size() + " performUidList size=" + listLJLIL.size() + " enlargedAnchorId=" + j);
            return;
        }
        List<C954460awe> list2 = this.LIZ.LJI;
        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<C954460awe> it4 = list2.iterator();
        while (it4.hasNext()) {
            arrayList5.add(Long.valueOf(it4.next().LJ));
        }
        ArrayList arrayList6 = new ArrayList(arrayList5);
        ArrayList arrayList7 = new ArrayList();
        if (j <= 0) {
            arrayList7.addAll(arrayList6);
        } else {
            Long l = (Long) C13LP.LJJJLZIJ(0, arrayList6);
            if (l != null && l.longValue() == j) {
                arrayList7.addAll(arrayList6);
            } else {
                arrayList7.add(Long.valueOf(j));
                Iterator it5 = arrayList6.iterator();
                while (it5.hasNext()) {
                    long jLongValue = ((Number) it5.next()).longValue();
                    if (jLongValue != j) {
                        arrayList7.add(Long.valueOf(jLongValue));
                    }
                }
            }
        }
        this.LJI = arrayList7;
        C20441214yg.LIZIZ("Competition_TakeStageModel", "updatePerformSequenceInfoForAudience, performSequenceList.size=" + arrayList7.size() + ", performSequenceList=" + arrayList7);
    }
}
