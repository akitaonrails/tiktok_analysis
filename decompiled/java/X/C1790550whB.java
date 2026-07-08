package X;

import Y.AComparatorS46S0000000_27;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bubble.record.BubbleRecord;
import com.ss.android.ugc.aweme.experiment.TabTooltipStorageConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0whB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1790550whB {
    public final C01GW LIZ = C452501pT.LIZ(EnumC452301pR.PUBLICATION, new C1790540whA());

    public final C1790530wh9 LIZIZ(String str) {
        List arrayList;
        Map map = (Map) this.LIZ.getValue();
        Object c1790530wh9 = map.get(str);
        if (c1790530wh9 == null) {
            Keva keva = C1790560whC.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_exit");
            long j = keva.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
            try {
                C1227904rF c1227904rF = C1227904rF.LIZ;
                String string = C1790560whC.LIZIZ.getString(str, "");
                c1227904rF.getClass();
                arrayList = C1227904rF.LJFF(BubbleRecord[].class, string);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                arrayList = new ArrayList();
            }
            c1790530wh9 = new C1790530wh9(str, j, arrayList);
            map.put(str, c1790530wh9);
        }
        return (C1790530wh9) c1790530wh9;
    }

    public final void LIZ(String str, BubbleRecord bubbleRecord) {
        int i;
        List<BubbleRecord> listSubList;
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<BubbleRecord> list = LIZIZ(str).LIZJ;
        ListIterator<BubbleRecord> listIterator = list.listIterator(list.size());
        while (true) {
            i = 0;
            if (!listIterator.hasPrevious()) {
                break;
            }
            if (listIterator.previous().showTime == bubbleRecord.showTime) {
                int iNextIndex = listIterator.nextIndex();
                if (iNextIndex >= 0) {
                    ListProtector.set(list, iNextIndex, bubbleRecord);
                }
            }
        }
        list.add(bubbleRecord);
        if (list.size() > 1) {
            C08XD.LJJ(list, new AComparatorS46S0000000_27(9));
        }
        Keva keva = C1790560whC.LIZ;
        int i2 = ((TabTooltipStorageConfig) C1790580whE.LIZIZ.getValue()).maxShownModelCountPerTooltip;
        if (list.size() > i2) {
            C1586120rNS c1586120rNS = C1586120rNS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("evictOldestRecordsIfExceedsLimit origin: ");
            sbLIZ.append(list.size());
            C1586120rNS.LIZ(c1586120rNS, "BubbleRecordRepository", C2188811AlT.LIZIZ(sbLIZ));
            int size = list.size() - i2;
            if (size >= 0) {
                i = size;
            }
            listSubList = list.subList(i, list.size());
        } else {
            listSubList = list;
        }
        Keva keva2 = C1790560whC.LIZIZ;
        C1227904rF.LIZ.getClass();
        keva2.storeString(str, C1227904rF.LJI(listSubList));
        C1586120rNS c1586120rNS2 = C1586120rNS.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("addNewRecord[");
        sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
        sbLIZ2.append("] key: ");
        sbLIZ2.append(str);
        sbLIZ2.append(", records: ");
        sbLIZ2.append(list);
        C2188811AlT.LIZIZ(sbLIZ2);
        c1586120rNS2.getClass();
    }

    public final void LIZJ(long j, String str) {
        LIZIZ(str).LIZIZ = j;
        Keva keva = C1790560whC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_exit");
        keva.storeLong(C2188811AlT.LIZIZ(sbLIZ), j);
    }
}
