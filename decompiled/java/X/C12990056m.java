package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.im.frequencycontrol.api.frequencyrule.FrequencyMarkRecord;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model.FrequencyCounter;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model.FrequencyCounterEntry;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model.FrequencyData;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model.FrequencySyncItem;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.config.model.ImFrequencyTypeEnum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.056m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12990056m {
    public static final Gson LIZ = C051M.LIZ;

    public static void LIZ(String str, Map map, FrequencySyncItem frequencySyncItem) {
        FrequencyCounter frequencyCounter;
        InterfaceC12997056t interfaceC12997056t;
        long jLongValue;
        if (!Intrinsics.LJFF(frequencySyncItem.scene, str)) {
            return;
        }
        List<FrequencyData> list = frequencySyncItem.fcData;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        if (list.isEmpty()) {
            return;
        }
        C12991056n c12991056n = ImFrequencyTypeEnum.Companion;
        Integer num = frequencySyncItem.frequencyType;
        c12991056n.getClass();
        ImFrequencyTypeEnum imFrequencyTypeEnumLIZ = C12991056n.LIZ(num);
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        for (FrequencyData frequencyData : list) {
            String str2 = frequencyData.id;
            if (str2 == null) {
                str2 = "";
            }
            if (imFrequencyTypeEnumLIZ == ImFrequencyTypeEnum.UID) {
                str2 = curUserId;
            }
            if (str2.length() != 0) {
                List<FrequencyCounterEntry> list2 = frequencyData.counters;
                if (list2 == null) {
                    list2 = C13BV.INSTANCE;
                }
                for (FrequencyCounterEntry frequencyCounterEntry : list2) {
                    C12994056q c12994056q = EnumC12995056r.Companion;
                    Integer num2 = frequencyCounterEntry.trigger;
                    c12994056q.getClass();
                    EnumC12995056r enumC12995056rLIZ = C12994056q.LIZ(num2);
                    if (enumC12995056rLIZ != null && (frequencyCounter = frequencyCounterEntry.counter) != null && (interfaceC12997056t = (InterfaceC12997056t) map.get(enumC12995056rLIZ)) != null) {
                        Long l = frequencyCounter.count;
                        long jLongValue2 = 0;
                        if (l != null) {
                            jLongValue = l.longValue();
                            if (jLongValue > 2147483647L) {
                                jLongValue = 2147483647L;
                            }
                        } else {
                            jLongValue = 0;
                        }
                        int i = (int) jLongValue;
                        if (i < 0) {
                            i = 0;
                        }
                        Long l2 = frequencyCounter.lastTime;
                        if (l2 != null) {
                            jLongValue2 = l2.longValue();
                        }
                        long j = jLongValue2 * 1000;
                        List list3 = frequencyCounter.hitTimestamps;
                        if (list3 == null) {
                            list3 = C13BV.INSTANCE;
                        }
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
                        Iterator it2 = list3.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Long.valueOf(((Number) it2.next()).longValue() * 1000));
                        }
                        String json = GsonProtectorUtils.toJson(LIZ, new FrequencyMarkRecord(Integer.valueOf(i), Long.valueOf(j), arrayList, Boolean.FALSE));
                        if (json == null) {
                            json = "";
                        }
                        interfaceC12997056t.LJFF(str2, json);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C12992056o LIZIZ(java.lang.String r8, int r9, java.lang.Long r10, long r11, boolean r13) {
        /*
            if (r10 == 0) goto L26
            long r5 = r10.longValue()
            r3 = 0
            if (r10 == 0) goto L26
            long r1 = r10.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L26
            r0 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r0
            r1 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L1d
            r5 = 10000(0x2710, double:4.9407E-320)
        L1d:
            X.056o r1 = new X.056o
            r7 = r13
            r3 = r11
            r2 = r9
            r1.<init>(r2, r3, r5, r7, r8)
            return r1
        L26:
            r5 = 1800000(0x1b7740, double:8.89318E-318)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12990056m.LIZIZ(java.lang.String, int, java.lang.Long, long, boolean):X.056o");
    }
}
