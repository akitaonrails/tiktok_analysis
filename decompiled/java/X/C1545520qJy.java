package X;

import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0qJy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1545520qJy {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("min_margin_top", "drag_min_margin_top");

    public static final boolean LIZ(String str) {
        if (!Intrinsics.LJFF(str, "1") && !Intrinsics.LJFF(str, "true")) {
            return false;
        }
        return true;
    }

    public static final C1058140dds LIZJ(String str, String str2, Map map) {
        Unit unit = null;
        C1058140dds c1058140dds = new C1058140dds(0, 1, null);
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('#');
            if (str2 == null) {
                str2 = "";
            }
            sbLIZ.append(str2);
            c1058140dds.setColor(C1100000ejO.LIZ(C1100000ejO.LIZIZ(C2188811AlT.LIZIZ(sbLIZ))));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append("_light");
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map;
            String str3 = (String) concurrentHashMap.get(C2188811AlT.LIZIZ(sbLIZ2));
            if (str3 != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append('#');
                sbLIZ3.append(str3);
                c1058140dds.setColorLight(C1100000ejO.LIZ(C1100000ejO.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3))));
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(str);
            sbLIZ4.append("_dark");
            String str4 = (String) concurrentHashMap.get(C2188811AlT.LIZIZ(sbLIZ4));
            if (str4 != null) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append('#');
                sbLIZ5.append(str4);
                c1058140dds.setColorDark(C1100000ejO.LIZ(C1100000ejO.LIZIZ(C2188811AlT.LIZIZ(sbLIZ5))));
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
            return c1058140dds;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return c1058140dds;
        }
    }

    public static C1058140dds LIZLLL(String str, String str2, Map map) {
        Unit unit = null;
        C1058140dds c1058140dds = new C1058140dds(0, 1, null);
        try {
            c1058140dds.setColor(C1100000ejO.LIZ(C1100000ejO.LIZIZ(str2)));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_light");
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map;
            String str3 = (String) concurrentHashMap.get(C2188811AlT.LIZIZ(sbLIZ));
            if (str3 != null) {
                c1058140dds.setColorLight(C1100000ejO.LIZ(C1100000ejO.LIZIZ(str3)));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append("_dark");
            String str4 = (String) concurrentHashMap.get(C2188811AlT.LIZIZ(sbLIZ2));
            if (str4 != null) {
                c1058140dds.setColorDark(C1100000ejO.LIZ(C1100000ejO.LIZIZ(str4)));
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
            return c1058140dds;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return c1058140dds;
        }
    }

    public static final int LIZIZ(String str, String str2, Map map, boolean z) {
        float fLJ;
        Function0 c1545640qKA;
        float fFloatValue;
        if (z) {
            try {
                if (u.LJIIZILJ(str2, "rpx", false)) {
                    fFloatValue = CastFloatProtector.parseFloat(a0.LJJJLL("rpx", str2)) / 750;
                    fLJ = C1338790kwX.LJ(null);
                } else if (u.LJIIZILJ(str2, "%", false)) {
                    fLJ = CastFloatProtector.parseFloat(a0.LJJJLL("%", str2)) / 100.0f;
                    if (0.0f <= fLJ && fLJ <= 1.0f) {
                        if (Intrinsics.LJFF(map.get("enable_relative_calculation"), "1")) {
                            if (a0.LJJIIZI(str, "height", false) && fLJ == 1.0f && Intrinsics.LJFF(map.get("trans_status_bar"), "1")) {
                                c1545640qKA = new C1545630qK9();
                            } else if (!a0.LJJIIZI(str, "height", false) && !LIZ.contains(str)) {
                                c1545640qKA = new C1338800kwY();
                            } else {
                                c1545640qKA = new C1338810kwZ(map);
                            }
                        } else if (!a0.LJJIIZI(str, "height", false) && !LIZ.contains(str)) {
                            c1545640qKA = new C1545650qKB();
                        } else {
                            c1545640qKA = new C1545640qKA();
                        }
                        fFloatValue = ((Number) c1545640qKA.invoke()).floatValue();
                    } else {
                        return -1;
                    }
                } else {
                    return C1338790kwX.LIZ(CastFloatProtector.parseFloat(str2));
                }
                return (int) (fFloatValue * fLJ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return -1;
            }
        }
        try {
            return CastIntegerProtector.parseInt(str2);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return -1;
        }
    }
}
