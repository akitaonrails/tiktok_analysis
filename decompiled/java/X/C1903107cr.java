package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.07cr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1903107cr {
    public static final /* synthetic */ int LIZ = 0;

    public static final int LIZLLL(Object obj) {
        if (obj instanceof List) {
            return ((List) obj).size();
        }
        if (obj instanceof Object[]) {
            return ((Object[]) obj).length;
        }
        if (obj instanceof Map) {
            return ((Map) obj).size();
        }
        if (obj instanceof String) {
            return ((String) obj).length();
        }
        return 0;
    }

    public static final boolean LJ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            if (((String) obj).length() <= 0) {
                return false;
            }
            return true;
        }
        if (obj instanceof Number) {
            double dDoubleValue = ((Number) obj).doubleValue();
            if (dDoubleValue == 0.0d || Double.isNaN(dDoubleValue)) {
                return false;
            }
            return true;
        }
        if (obj instanceof Map) {
            if (((Map) obj).size() <= 0) {
                return false;
            }
            return true;
        }
        if (obj instanceof List) {
            if (((List) obj).size() <= 0) {
                return false;
            }
            return true;
        }
        if (!(obj instanceof Object[]) || ((Object[]) obj).length <= 0) {
            return false;
        }
        return true;
    }

    public static boolean LIZ(Object obj, Object obj2) {
        if ((obj instanceof Number) && (obj2 instanceof Number)) {
            if (((Number) obj).doubleValue() == ((Number) obj2).doubleValue()) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(obj, obj2);
    }

    public static Object LIZIZ(Object obj, String str) {
        for (Object obj2 : a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6)) {
            if (obj instanceof Map) {
                obj = ((Map) obj).get(obj2);
            } else {
                return null;
            }
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float LIZJ(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            java.lang.String r1 = "-"
            r6 = 0
            boolean r0 = kotlin.text.a0.LJJIIZI(r7, r1, r6)
            r3 = 44
            if (r0 == 0) goto La0
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r0 = 6
            java.util.List r0 = kotlin.text.a0.LJJLIIIJILLIZJL(r7, r1, r6, r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r0.iterator()
        L1d:
            boolean r0 = r4.hasNext()
            r2 = 1
            if (r0 == 0) goto L36
            java.lang.Object r1 = r4.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            r2 = r2 ^ r0
            if (r2 == 0) goto L1d
            r5.add(r1)
            goto L1d
        L36:
            int r1 = r5.size()
            r0 = 2
            if (r1 != r0) goto L84
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r5, r6)
            java.lang.String r0 = (java.lang.String) r0
            float r3 = com.bytedance.mt.protector.impl.string2number.CastFloatProtector.parseFloat(r0)
            java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r5, r2)
            java.lang.String r2 = (java.lang.String) r2
            int r1 = r2.hashCode()
            r0 = -1378088671(0xffffffffaddc0921, float:-2.5015158E-11)
            if (r1 == r0) goto L76
            r0 = 3633(0xe31, float:5.091E-42)
            if (r1 == r0) goto L6b
            r0 = 92909918(0x589b15e, float:1.2948572E-35)
            if (r1 != r0) goto L81
            java.lang.String r0 = "alpha"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L81
            r0 = -1090519040(0xffffffffbf000000, float:-0.5)
        L69:
            float r3 = r3 + r0
            return r3
        L6b:
            java.lang.String r0 = "rc"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L81
            r0 = -1098907648(0xffffffffbe800000, float:-0.25)
            goto L69
        L76:
            java.lang.String r0 = "bugfix"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L81
            r0 = 1048576000(0x3e800000, float:0.25)
            goto L69
        L81:
            r0 = -1086324736(0xffffffffbf400000, float:-0.75)
            goto L69
        L84:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "the version format is illegal,params:"
            r1.append(r0)
            r1.append(r8)
            r1.append(r3)
            r1.append(r9)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        La0:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "params is string but don't  include '-',params:"
            r1.append(r0)
            r1.append(r8)
            r1.append(r3)
            r1.append(r9)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1903107cr.LIZJ(java.lang.String, java.lang.String, java.lang.String):float");
    }
}
