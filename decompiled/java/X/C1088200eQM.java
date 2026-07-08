package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LiveWatchReasonConfigSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.watch.ReasonCacheEntry;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eQM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1088200eQM {
    public static final C1088200eQM LIZ = new C1088200eQM();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(109));

    public static boolean LIZ(boolean z) {
        int i;
        int i2;
        if (z) {
            i = LiveWatchReasonConfigSetting.config().previewTime;
            i2 = LiveWatchReasonConfigSetting.config().previewCount;
        } else {
            i = LiveWatchReasonConfigSetting.config().innerTime;
            i2 = LiveWatchReasonConfigSetting.config().innerCount;
        }
        if (i != 0 && i2 != 0) {
            return true;
        }
        return false;
    }

    public static String LIZIZ(long j, String str, boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 1;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append('_');
        sbLIZ.append(j);
        sbLIZ.append('_');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZJ(Long l, String str, boolean z) {
        String strLIZJ;
        String str2;
        ReasonCacheEntry reasonCacheEntry;
        if (str != null && l != null) {
            l.longValue();
            if (!LIZ(z)) {
                return;
            }
            String strLIZIZ = LIZIZ(UserService.getInstance().user().getCurrentUserId(), str, z);
            long jCurrentTimeMillis = System.currentTimeMillis();
            String[] stringArray = ((Keva) LIZIZ.getValue()).getStringArray(strLIZIZ, null);
            if (stringArray == null) {
                stringArray = new String[0];
            }
            try {
                ArrayList arrayList = new ArrayList(stringArray.length);
                for (String str3 : stringArray) {
                    if (str3 != null && str3.length() != 0) {
                        reasonCacheEntry = (ReasonCacheEntry) C19748512Ol.LIZIZ.LJII(str3, ReasonCacheEntry.class);
                    } else {
                        reasonCacheEntry = null;
                    }
                    arrayList.add(reasonCacheEntry);
                }
                ArrayList<ReasonCacheEntry> arrayList2 = new ArrayList(arrayList);
                boolean z2 = false;
                for (ReasonCacheEntry reasonCacheEntry2 : arrayList2) {
                    if (reasonCacheEntry2 != null) {
                        str2 = reasonCacheEntry2.roomId;
                    } else {
                        str2 = null;
                    }
                    if (Intrinsics.LJFF(str2, l.toString())) {
                        reasonCacheEntry2.setTimestamp(String.valueOf(jCurrentTimeMillis));
                        z2 = true;
                    }
                }
                if (!z2) {
                    arrayList2.add(new ReasonCacheEntry(l.toString(), String.valueOf(jCurrentTimeMillis)));
                }
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                for (ReasonCacheEntry reasonCacheEntry3 : arrayList2) {
                    if (reasonCacheEntry3 != null) {
                        strLIZJ = C1516000pYM.LIZJ(reasonCacheEntry3);
                    } else {
                        strLIZJ = null;
                    }
                    arrayList3.add(strLIZJ);
                }
                ((Keva) LIZIZ.getValue()).storeStringArray(strLIZIZ, (String[]) arrayList3.toArray(new String[0]));
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public static boolean LIZLLL(Long l, String str, boolean z) {
        int i;
        int i2;
        String str2;
        String strLIZJ;
        long j;
        String str3;
        ReasonCacheEntry reasonCacheEntry;
        if (str != null && l != null) {
            l.longValue();
            if (!LIZ(z)) {
                return true;
            }
            if (z) {
                i = LiveWatchReasonConfigSetting.config().previewTime;
                i2 = LiveWatchReasonConfigSetting.config().previewCount;
            } else {
                i = LiveWatchReasonConfigSetting.config().innerTime;
                i2 = LiveWatchReasonConfigSetting.config().innerCount;
            }
            String strLIZIZ = LIZIZ(UserService.getInstance().user().getCurrentUserId(), str, z);
            String[] stringArray = ((Keva) LIZIZ.getValue()).getStringArray(strLIZIZ, null);
            if (stringArray == null) {
                stringArray = new String[0];
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - ((long) (i * 3600000));
            try {
                ArrayList arrayList = new ArrayList(stringArray.length);
                for (String str4 : stringArray) {
                    if (str4 != null && str4.length() != 0) {
                        reasonCacheEntry = (ReasonCacheEntry) C19748512Ol.LIZIZ.LJII(str4, ReasonCacheEntry.class);
                    } else {
                        reasonCacheEntry = null;
                    }
                    arrayList.add(reasonCacheEntry);
                }
                ArrayList<ReasonCacheEntry> arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    ReasonCacheEntry reasonCacheEntry2 = (ReasonCacheEntry) obj;
                    if (reasonCacheEntry2 != null && (str3 = reasonCacheEntry2.timestamp) != null) {
                        j = CastLongProtector.parseLong(str3);
                    } else {
                        j = 0;
                    }
                    if (j >= jCurrentTimeMillis) {
                        arrayList2.add(obj);
                    }
                }
                int size = arrayList2.size();
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                for (ReasonCacheEntry reasonCacheEntry3 : arrayList2) {
                    if (reasonCacheEntry3 != null) {
                        strLIZJ = C1516000pYM.LIZJ(reasonCacheEntry3);
                    } else {
                        strLIZJ = null;
                    }
                    arrayList3.add(strLIZJ);
                }
                ((Keva) LIZIZ.getValue()).storeStringArray(strLIZIZ, (String[]) arrayList3.toArray(new String[0]));
                if (size < i2) {
                    return true;
                }
                for (ReasonCacheEntry reasonCacheEntry4 : arrayList2) {
                    if (reasonCacheEntry4 != null) {
                        str2 = reasonCacheEntry4.roomId;
                    } else {
                        str2 = null;
                    }
                    if (Intrinsics.LJFF(str2, l.toString())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return false;
    }
}
