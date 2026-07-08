package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ad.experiment.EnableTtClidAttachInIABExp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0d67, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1037210d67 {
    public static List<Pattern> LIZ;

    public static boolean LIZIZ(C1035880d3y c1035880d3y) {
        int iIntValue = ((Number) EnableTtClidAttachInIABExp.LIZJ.getValue()).intValue();
        boolean z = false;
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return false;
            }
            return true;
        }
        if (c1035880d3y != null && c1035880d3y.getFirstPage() == 1) {
            z = true;
        }
        return !z;
    }

    public static final boolean LIZJ(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        List<Pattern> list = LIZ;
        if (list == null) {
            LIZ = new ArrayList();
            for (String str2 : C131800eq.LIZ()) {
                List<Pattern> list2 = LIZ;
                if (list2 != null) {
                    ((ArrayList) list2).add(PatternProtector.compile(str2));
                }
            }
            list = LIZ;
            if (list == null) {
                return false;
            }
        }
        Iterator<Pattern> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    public static final String LIZ(String str, C1035880d3y c1035880d3y, boolean z, boolean z2, C1040740dBo c1040740dBo) {
        int i;
        int i2 = 0;
        if (str != null && str.length() != 0 && c1035880d3y != null && ((Boolean) EnableTtClidAttachInIABExp.LIZIZ.getValue()).booleanValue()) {
            C0XI4 c0xi4 = new C0XI4(str);
            String strTtclid = c1035880d3y.ttclid();
            String strValueOf = String.valueOf(c1035880d3y.getRealCreativeId());
            if (!c1035880d3y.enableClickIdAttach()) {
                i = 1;
            } else if (strTtclid != null && strTtclid.length() != 0) {
                if (a0.LJJIIZI(str, "ttclid=", false)) {
                    i = 3;
                } else {
                    C01GW c01gw = C130900eh.LIZ;
                    if ((!((List) c01gw.getValue()).isEmpty()) && ((List) c01gw.getValue()).contains(strValueOf)) {
                        i = 4;
                    } else if (LIZJ(UriProtector.parse(str).getHost())) {
                        i = 5;
                    } else if (z && LIZIZ(c1035880d3y)) {
                        i = 6;
                    } else if (!z2 && LIZIZ(c1035880d3y)) {
                        i = 7;
                    } else if (Intrinsics.LJFF(c1035880d3y.getCurrentUrlAddedTtclid(), str)) {
                        i = 8;
                    } else {
                        i = -1;
                        c0xi4.LJ("ttclid", strTtclid);
                        c1035880d3y.setCurrentUrlAddedTtclid(str);
                    }
                }
            } else {
                i = 2;
            }
            if (c1040740dBo != null) {
                String strLJFF = c0xi4.LJFF();
                if (i == -1) {
                    i2 = 1;
                }
                c1040740dBo.LJJJLZIJ(i2, Integer.valueOf(i), strLJFF);
            }
            return c0xi4.LJFF();
        }
        return str;
    }
}
