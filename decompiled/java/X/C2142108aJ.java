package X;

import android.graphics.Color;
import android.text.Spannable;
import android.view.View;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.chatagent.common.ui.markdown.typewriter.ForegroundAlphaSpan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.text.u;

/* JADX INFO: renamed from: X.08aJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2142108aJ {
    public static boolean LJ;
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1713));
    public static final C054G LIZIZ = C2296808zG.LIZIZ();
    public static final Map<String, C2142208aK> LIZJ = new LinkedHashMap();
    public static final Map<String, Set<TextView>> LIZLLL = new LinkedHashMap();
    public static final int LJFF = 750;

    public static void LIZ(String str) {
        Set set;
        Spannable spannable;
        int length;
        C2142208aK c2142208aK = (C2142208aK) ((LinkedHashMap) LIZJ).get(str);
        if (c2142208aK == null || (set = (Set) ((LinkedHashMap) LIZLLL).get(str)) == null) {
            return;
        }
        Map<Integer, Integer> map = c2142208aK.LIZJ;
        CharSequence charSequence = c2142208aK.LIZ;
        if ((charSequence instanceof Spannable) && (spannable = (Spannable) charSequence) != null) {
            List listLJLLJ = C13LP.LJLLJ(C13LP.LLIIII(map.keySet()));
            for (Object obj : spannable.getSpans(0, spannable.length(), ForegroundAlphaSpan.class)) {
                spannable.removeSpan(obj);
            }
            int i = 0;
            for (Object obj2 : listLJLLJ) {
                int i2 = i + 1;
                if (i >= 0) {
                    int iIntValue = ((Number) obj2).intValue();
                    if (spannable.length() > iIntValue) {
                        if (i2 < listLJLLJ.size()) {
                            length = ((Number) ListProtector.get(listLJLLJ, i2)).intValue();
                            int length2 = spannable.length();
                            if (length > length2) {
                                length = length2;
                            }
                        } else {
                            length = spannable.length();
                        }
                        Integer num = map.get(Integer.valueOf(iIntValue));
                        if (num != null) {
                            int iIntValue2 = num.intValue();
                            C786410Ut5.o2(spannable, new ForegroundAlphaSpan(Color.argb(iIntValue2, 0, 0, 0), iIntValue2), iIntValue, length, 17);
                        }
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public static void LIZIZ(String str) {
        Set setKeySet = ((LinkedHashMap) LIZLLL).keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('#');
            if (u.LJJIIJZLJL((String) obj, C2188811AlT.LIZIZ(sbLIZ), false)) {
                arrayList.add(obj);
            }
        }
        Set setKeySet2 = ((LinkedHashMap) LIZJ).keySet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : setKeySet2) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append('#');
            if (u.LJJIIJZLJL((String) obj2, C2188811AlT.LIZIZ(sbLIZ2), false)) {
                arrayList2.add(obj2);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            LIZLLL.remove(it2.next());
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            LIZJ.remove(it3.next());
        }
    }
}
