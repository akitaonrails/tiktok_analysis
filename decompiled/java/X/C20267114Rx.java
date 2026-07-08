package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.14Rx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20267114Rx {
    public static Integer LIZIZ(Integer num) {
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(iIntValue);
        return Integer.valueOf((int) (c444890HcV.getTextSize() / C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))));
    }

    public static Boolean LIZJ(String str, HashMap map) {
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }

    public static Float LJ(String str, HashMap map) {
        Number number;
        Object obj = map.get(str);
        if (!(obj instanceof Number) || (number = (Number) obj) == null) {
            return null;
        }
        return Float.valueOf(number.floatValue());
    }

    public static Integer LJFF(String str, HashMap map) {
        String str2;
        Object c098200Yq;
        Object obj = map.get(str);
        Object obj2 = null;
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return null;
        }
        try {
            C01GW c01gw = C2248361CzK.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tux://font?token=");
            sbLIZ.append(str2.toUpperCase(Locale.US));
            sbLIZ.append("&from=search-markdown_lynx");
            c098200Yq = C2248361CzK.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        return (Integer) obj2;
    }

    public static Integer LJI(String str, HashMap map) {
        Number number;
        Object obj = map.get(str);
        if (!(obj instanceof Number) || (number = (Number) obj) == null) {
            return null;
        }
        return Integer.valueOf(number.intValue());
    }

    public static void LJII(C689200R1q c689200R1q, HashMap map) {
        Number number;
        Integer numValueOf;
        Context context = c689200R1q.getContext();
        if (context == null) {
            return;
        }
        Integer numLJFF = LJFF("bodyFont", map);
        if (numLJFF != null) {
            int iIntValue = numLJFF.intValue();
            C444890HcV c444890HcV = new C444890HcV();
            c444890HcV.LIZ(iIntValue);
            c689200R1q.getPaint().setTextSize(c444890HcV.getTextSize());
            c689200R1q.getPaint().setTypeface(c444890HcV.getTypeface());
        }
        Integer numLIZLLL = LIZLLL(context, "color", map);
        if (numLIZLLL != null) {
            c689200R1q.setTextColor(numLIZLLL.intValue());
        }
        Boolean boolLIZJ = LIZJ("enableMaxHeightTruncation", map);
        if (boolLIZJ != null) {
            c689200R1q.setEnableHeightTruncation(boolLIZJ.booleanValue());
        }
        Boolean boolLIZJ2 = LIZJ("enableSelectAndCopyText", map);
        if (boolLIZJ2 != null) {
            c689200R1q.setOpenOriginSelect(boolLIZJ2.booleanValue());
        }
        Object obj = map.get("exclusionFrame");
        if (obj instanceof List) {
            List list = (List) obj;
            boolean zBooleanValue = false;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if ((obj2 instanceof Number) && (number = (Number) obj2) != null && (numValueOf = Integer.valueOf(number.intValue())) != null) {
                        arrayList.add(numValueOf);
                    }
                }
                if (arrayList.size() >= 4) {
                    Boolean boolLIZJ3 = LIZJ("isRightExclusion", map);
                    if (boolLIZJ3 != null) {
                        zBooleanValue = boolLIZJ3.booleanValue();
                    }
                    c689200R1q.LJJL(null, arrayList, zBooleanValue);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C21419418s4 LIZ(X.C21419418s4 r51, X.C689200R1q r52, java.util.HashMap r53) {
        /*
            Method dump skipped, instruction units count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20267114Rx.LIZ(X.18s4, X.0R1q, java.util.HashMap):X.18s4");
    }

    public static Integer LIZLLL(Context context, String str, HashMap map) {
        String str2;
        Object c098200Yq;
        Object obj = map.get(str);
        Object obj2 = null;
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return null;
        }
        try {
            C01GW c01gw = C2248361CzK.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tux://color?token=");
            sbLIZ.append(str2);
            sbLIZ.append("&from=search-markdown_lynx");
            c098200Yq = C2248361CzK.LJ(context, C2188811AlT.LIZIZ(sbLIZ));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        return (Integer) obj2;
    }
}
