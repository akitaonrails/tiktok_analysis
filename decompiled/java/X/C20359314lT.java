package X;

import com.bytedance.android.livesdk.condition.Condition;
import com.bytedance.android.livesdk.condition.ConditionData;
import com.bytedance.android.livesdk.condition.ConditionParams;
import com.bytedance.android.livesdk.entity.PlayRule;
import com.bytedance.android.livesdk.livesetting.linkmic.PlaybookAutoRunTypeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.14lT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20359314lT {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("leads", "topic", "victory_lap_funny_effect", "designated_gift", "community_designated_gift");

    public static final String LIZ(ConditionParams conditionParams) {
        try {
            return C19748512Ol.LIZIZ.LJIILL(conditionParams);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("conditionParamsToString error: ");
            sbLIZ.append(e);
            C20441214yg.LJ("chenzepeng_pbam", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        return X.EnumC20429614wo.NUM;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.EnumC20429614wo LIZIZ(java.lang.String r2) {
        /*
            int r1 = r2.hashCode()
            r0 = -644713094(0xffffffffd992757a, float:-5.153064E15)
            if (r1 == r0) goto L29
            r0 = 1456611304(0x56d21fe8, float:1.1551724E14)
            if (r1 == r0) goto L1e
            r0 = 1520189732(0x5a9c4124, float:2.199086E16)
            if (r1 != r0) goto L1b
            java.lang.String r0 = "cohost_count"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L26
        L1b:
            X.14wo r0 = X.EnumC20429614wo.TEXT
            return r0
        L1e:
            java.lang.String r0 = "guest_count"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1b
        L26:
            X.14wo r0 = X.EnumC20429614wo.NUM
            return r0
        L29:
            java.lang.String r0 = "countdown_check"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1b
            X.14wo r0 = X.EnumC20429614wo.TIME
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20359314lT.LIZIZ(java.lang.String):X.14wo");
    }

    public static final String LIZJ(String str) {
        Integer num = C20350914k7.LIZ.get(str);
        if (num != null) {
            return C497740JfY.LJIJI(num.intValue());
        }
        return "";
    }

    public static final String LIZLLL(C20361214lm c20361214lm) {
        Condition condition;
        String strLJIILL = null;
        if (!PlaybookAutoRunTypeSetting.INSTANCE.enable()) {
            return null;
        }
        if (LIZ.contains(c20361214lm.LIZ)) {
            condition = new Condition("always_true", null, null, 0);
        } else {
            condition = new Condition("never", null, null, 0);
        }
        try {
            strLJIILL = C19748512Ol.LIZIZ.LJIILL(new ConditionData(Collections.singletonList(condition), condition.name));
            return strLJIILL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return strLJIILL;
        }
    }

    public static final String LJ(C20361214lm c20361214lm) {
        String str;
        C20357914lF config;
        String strLJIILL = null;
        if (!PlaybookAutoRunTypeSetting.INSTANCE.enable()) {
            return null;
        }
        PlayRule playRule = c20361214lm.LIZLLL;
        if (playRule != null && (config = playRule.getConfig()) != null) {
            str = config.LJIIJJI;
        } else {
            str = null;
        }
        if (str != null) {
            Condition condition = new Condition(str, null, null, 0);
            try {
                strLJIILL = C19748512Ol.LIZIZ.LJIILL(new ConditionData(Collections.singletonList(condition), condition.name));
                return strLJIILL;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return strLJIILL;
    }

    public static final Condition LJFF(C20359414lU c20359414lU) {
        String str;
        ConditionData conditionDataLIZ;
        List<Condition> list;
        if (c20359414lU == null) {
            return null;
        }
        List<C20361214lm> list2 = c20359414lU.LIZJ;
        if (!list2.isEmpty() && !c20359414lU.LJI) {
            str = ((C20361214lm) ListProtector.get(list2, 0)).LJII;
        } else {
            str = c20359414lU.LJ;
        }
        if (str == null || (conditionDataLIZ = C20356614l2.LIZ(str)) == null || (list = conditionDataLIZ.conditions) == null || list.isEmpty()) {
            return null;
        }
        return (Condition) ListProtector.get(list, 0);
    }

    public static final Condition LJI(C20361214lm c20361214lm) {
        String str;
        ConditionData conditionDataLIZ;
        List<Condition> list;
        if (c20361214lm == null || (str = c20361214lm.LJII) == null || (conditionDataLIZ = C20356614l2.LIZ(str)) == null || (list = conditionDataLIZ.conditions) == null || list.isEmpty()) {
            return null;
        }
        return (Condition) ListProtector.get(list, 0);
    }

    public static final String LJIIIIZZ(Condition condition) {
        ConditionParams conditionParamsLJIIJ;
        Integer num;
        String str = condition.name;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -644713094) {
                if (iHashCode != 1456611304) {
                    if (iHashCode != 1520189732 || !str.equals("cohost_count")) {
                        return null;
                    }
                } else if (!str.equals("guest_count")) {
                    return null;
                }
                String str2 = condition.params;
                if (str2 == null || (conditionParamsLJIIJ = LJIIJ(str2)) == null || (num = conditionParamsLJIIJ.micCount) == null) {
                    return null;
                }
                return num.toString();
            }
            if (!str.equals("countdown_check")) {
                return null;
            }
            return String.valueOf(condition.duration);
        }
        return null;
    }

    public static final ConditionParams LJIIJ(String str) {
        boolean z;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            return (ConditionParams) C19748512Ol.LIZIZ.LJII(str, ConditionParams.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stringToConditionParams error: ");
            sbLIZ.append(e);
            C20441214yg.LJ("chenzepeng_pbam", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    public static final String LJIIJJI(Condition condition) {
        try {
            return C19748512Ol.LIZIZ.LJIILL(new ConditionData(Collections.singletonList(condition), condition.name));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String LJII(C20359414lU c20359414lU, boolean z) {
        String str;
        int iIntValue;
        Integer num;
        int iIntValue2;
        Integer num2;
        int iIntValue3;
        if (c20359414lU != null) {
            str = c20359414lU.LJFF;
        } else {
            str = null;
        }
        String strLIZJ = "";
        if (Intrinsics.LJFF(str, "auto") && C500260Jjc.LJJIJIIJIL(Boolean.valueOf(c20359414lU.LJI)) && z) {
            return "";
        }
        Condition conditionLJFF = LJFF(c20359414lU);
        if (conditionLJFF == null) {
            if (z) {
                return "";
            }
            return C497740JfY.LJIJI(2131855258);
        }
        String str2 = conditionLJFF.name;
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -1941598786:
                    if (str2.equals("always_true")) {
                        return "";
                    }
                    break;
                case -644713094:
                    if (str2.equals("countdown_check")) {
                        Object[] objArr = new Object[1];
                        Object[] objArr2 = new Object[1];
                        Integer num3 = conditionLJFF.duration;
                        if (num3 != null) {
                            iIntValue3 = num3.intValue();
                        } else {
                            iIntValue3 = 0;
                        }
                        objArr2[0] = Integer.valueOf(iIntValue3);
                        objArr[0] = C497740JfY.LJIJJ(2131854668, objArr2);
                        return C497740JfY.LJIJJ(2131855188, objArr);
                    }
                    break;
                case 1456611304:
                    if (str2.equals("guest_count")) {
                        Object[] objArr3 = new Object[1];
                        Object[] objArr4 = new Object[1];
                        ConditionParams conditionParamsLJIIJ = LJIIJ(conditionLJFF.params);
                        if (conditionParamsLJIIJ != null && (num2 = conditionParamsLJIIJ.micCount) != null) {
                            iIntValue2 = num2.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        objArr4[0] = Integer.valueOf(iIntValue2);
                        objArr3[0] = C497740JfY.LJIJJ(2131854670, objArr4);
                        return C497740JfY.LJIJJ(2131855188, objArr3);
                    }
                    break;
                case 1520189732:
                    if (str2.equals("cohost_count")) {
                        Object[] objArr5 = new Object[1];
                        Object[] objArr6 = new Object[1];
                        ConditionParams conditionParamsLJIIJ2 = LJIIJ(conditionLJFF.params);
                        if (conditionParamsLJIIJ2 != null && (num = conditionParamsLJIIJ2.micCount) != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        objArr6[0] = Integer.valueOf(iIntValue);
                        objArr5[0] = C497740JfY.LJIJJ(2131854669, objArr6);
                        return C497740JfY.LJIJJ(2131855188, objArr5);
                    }
                    break;
            }
        }
        Object[] objArr7 = new Object[1];
        String str3 = conditionLJFF.name;
        if (str3 != null) {
            strLIZJ = LIZJ(str3);
        }
        objArr7[0] = strLIZJ;
        return C497740JfY.LJIJJ(2131855188, objArr7);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final boolean LJIIIZ(int i, int i2, String str) {
        switch (str.hashCode()) {
            case -1112834937:
                if (str.equals("LESS_THAN")) {
                    if (i < i2) {
                        return true;
                    }
                    return false;
                }
                break;
            case 629498505:
                if (str.equals("GREATER_THAN_OR_EQUAL_TO")) {
                    if (i >= i2) {
                        return true;
                    }
                    return false;
                }
                break;
            case 925013674:
                if (str.equals("LESS_THAN_OR_EQUAL_TO")) {
                    if (i <= i2) {
                        return true;
                    }
                    return false;
                }
                break;
            case 972152550:
                if (str.equals("GREATER_THAN")) {
                    if (i > i2) {
                        return true;
                    }
                    return false;
                }
                break;
            case 1630331595:
                if (str.equals("NOT_EQUALS")) {
                    if (i != i2) {
                        return true;
                    }
                    return false;
                }
                break;
            case 2052813759:
                if (str.equals("EQUALS")) {
                    if (i == i2) {
                        return true;
                    }
                    return false;
                }
                break;
        }
        if (i >= i2) {
            return true;
        }
        return false;
    }
}
