package X;

import android.content.Context;
import android.database.Cursor;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ab.EcPhotoSearchBubbleGuideModel;
import com.ss.android.ugc.aweme.ecommerce.search.vision.guide.model.ECSystemPhotoModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ov3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C634750Ov3 {
    public static Long LIZJ;
    public static final C634750Ov3 LIZ = new C634750Ov3();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(466));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(465));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(464));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(526));

    public static void LIZIZ(boolean z) {
        try {
            C01GW c01gw = LIZIZ;
            Set<String> stringSet = ((Keva) c01gw.getValue()).getStringSet("ec_bubble_show_times_key", null);
            if (stringSet == null) {
                stringSet = new LinkedHashSet<>();
            }
            if (z) {
                stringSet.clear();
            } else {
                stringSet.add(String.valueOf(System.currentTimeMillis()));
            }
            ((Keva) c01gw.getValue()).storeStringSet("ec_bubble_show_times_key", stringSet);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
    }

    public static void LIZJ(Integer num) {
        if (((Boolean) LJ.getValue()).booleanValue() && C13LP.LJJJJ(num, (Iterable) LJFF.getValue())) {
            LIZJ = Long.valueOf(System.currentTimeMillis());
            LIZIZ(true);
        }
    }

    public static final void LIZ(Context context, Function2 function2, boolean z) {
        int iIntValue;
        ECSystemPhotoModel eCSystemPhotoModel;
        long jLongValue;
        Cursor cursorLIZIZ;
        Integer numLIZ;
        Long lLJIILIIL;
        Integer numValueOf;
        if (!((Boolean) LJ.getValue()).booleanValue()) {
            function2.invoke(Boolean.FALSE, null);
            return;
        }
        if (!((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin()) {
            function2.invoke(Boolean.FALSE, null);
            return;
        }
        C1A3X.LIZ.getClass();
        if (!C1A3X.LIZIZ(context)) {
            function2.invoke(Boolean.FALSE, null);
            return;
        }
        int i = ((EcPhotoSearchBubbleGuideModel) LIZLLL.getValue()).maxShowTimes;
        try {
            Set<String> stringSet = ((Keva) LIZIZ.getValue()).getStringSet("ec_bubble_show_times_key", null);
            TreeSet treeSet = new TreeSet(new Comparator() { // from class: X.083U
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    String str = (String) obj2;
                    Long lLJIILIIL2 = C2095008Iq.LJIILIIL((String) obj);
                    if (lLJIILIIL2 != null) {
                        long jLongValue2 = lLJIILIIL2.longValue();
                        Long lLJIILIIL3 = C2095008Iq.LJIILIIL(str);
                        if (lLJIILIIL3 != null) {
                            return Intrinsics.LJII(jLongValue2, lLJIILIIL3.longValue());
                        }
                        return 0;
                    }
                    return 0;
                }
            });
            treeSet.addAll(stringSet);
            String str = (String) C13LP.LJJJLIIL(treeSet);
            if (str != null) {
                lLJIILIIL = C2095008Iq.LJIILIIL(str);
            } else {
                lLJIILIIL = null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (lLJIILIIL != null && jCurrentTimeMillis - lLJIILIIL.longValue() < 86400000) {
                numValueOf = Integer.valueOf(treeSet.size());
            } else {
                LIZIZ(true);
                numValueOf = 0;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        if (numValueOf == null) {
            iIntValue = 0;
        } else {
            iIntValue = numValueOf.intValue();
        }
        if (iIntValue < i) {
            C2361109Mz.LIZ.getClass();
            try {
                C1A3X.LIZ.getClass();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Object c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                eCSystemPhotoModel = (ECSystemPhotoModel) c098200Yq;
                if (eCSystemPhotoModel != null) {
                }
            }
            if (C1A3X.LIZIZ(context) && (cursorLIZIZ = C2361109Mz.LIZIZ(context, z)) != null) {
                try {
                    if (cursorLIZIZ.moveToFirst() && (numLIZ = C2361109Mz.LIZ(cursorLIZIZ, "_id")) != null) {
                        long j = cursorLIZIZ.getLong(numLIZ.intValue());
                        Integer numLIZ2 = C2361109Mz.LIZ(cursorLIZIZ, "_data");
                        if (numLIZ2 != null) {
                            String string = cursorLIZIZ.getString(numLIZ2.intValue());
                            Integer numLIZ3 = C2361109Mz.LIZ(cursorLIZIZ, "date_added");
                            if (numLIZ3 != null) {
                                long j2 = cursorLIZIZ.getLong(numLIZ3.intValue()) * 1000;
                                C09JS.LIZ.getClass();
                                eCSystemPhotoModel = new ECSystemPhotoModel(Long.valueOf(j), Long.valueOf(j2), string, C09JS.LIZ(string), null, null);
                                C2107108Nh.LIZ(cursorLIZIZ, null);
                                long j3 = ((EcPhotoSearchBubbleGuideModel) LIZLLL.getValue()).latestPhotoDuration * 1000;
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                Long l = eCSystemPhotoModel.updateTime;
                                if (l != null) {
                                    jLongValue = l.longValue();
                                } else {
                                    jLongValue = 0;
                                }
                                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("currentTime: ");
                                sbLIZ.append(jCurrentTimeMillis2);
                                sbLIZ.append(" latestPhotoUpdateTime:");
                                sbLIZ.append(jLongValue);
                                sbLIZ.append(" path: ");
                                sbLIZ.append(eCSystemPhotoModel.path);
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                c2341109Fh.getClass();
                                C2341109Fh.LIZ(strLIZIZ);
                                if (jCurrentTimeMillis2 - jLongValue <= j3) {
                                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                                    Long l2 = LIZJ;
                                    if (l2 != null && jCurrentTimeMillis3 - l2.longValue() <= ((EcPhotoSearchBubbleGuideModel) LIZLLL.getValue()).latestPhotoDuration * 1000) {
                                        function2.invoke(Boolean.FALSE, null);
                                        return;
                                    } else {
                                        function2.invoke(Boolean.TRUE, eCSystemPhotoModel);
                                        return;
                                    }
                                }
                            } else {
                                C2107108Nh.LIZ(cursorLIZIZ, null);
                            }
                        } else {
                            C2107108Nh.LIZ(cursorLIZIZ, null);
                        }
                    } else {
                        C2107108Nh.LIZ(cursorLIZIZ, null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        } catch (Throwable th3) {
                            th = th3;
                            th = null;
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(cursorLIZIZ, th);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
            }
            function2.invoke(Boolean.FALSE, null);
            return;
        }
        function2.invoke(Boolean.FALSE, null);
    }
}
