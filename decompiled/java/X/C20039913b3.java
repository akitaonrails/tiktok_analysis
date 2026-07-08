package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nimblecard.model.NimbleJson;
import com.ss.android.ugc.aweme.nimblecard.model.Template;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.13b3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20039913b3 {
    public static final C20039913b3 LIZ = new C20039913b3();
    public static final Set<String> LIZIZ = new LinkedHashSet();
    public static NimbleJson LIZJ;
    public static NimbleJson LIZLLL;
    public static final NimbleJson LJ;
    public static List<Integer> LJFF;
    public static final List<Integer> LJI;
    public static final Map<Integer, Pair<Integer, String>> LJII;

    static {
        C1860520yW2.LIZ.getClass();
        LIZJ = C685390QuX.LIZIZ(C1860520yW2.LJIIL().getString("tako_nimble_template_local _tako_nimble_conf", ""));
        String strLIZ = C1849107Mb.LIZ();
        Keva kevaLJIIL = C1860520yW2.LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_nimble_template_local _");
        sbLIZ.append(strLIZ);
        LIZLLL = C685390QuX.LIZIZ(kevaLJIIL.getString(C2188811AlT.LIZIZ(sbLIZ), ""));
        NimbleJson nimbleJsonLIZIZ = null;
        try {
            Reader inputStreamReader = new InputStreamReader(C1857750yRZ.LIZ.getAssets().open("asset_nimble_templates.json"), Charsets.UTF_8);
            if (!(inputStreamReader instanceof BufferedReader)) {
                inputStreamReader = new BufferedReader(inputStreamReader, 8192);
            }
            try {
                String strLIZJ = C08KC.LIZJ(inputStreamReader);
                C2107108Nh.LIZ(inputStreamReader, null);
                nimbleJsonLIZIZ = C685390QuX.LIZIZ(strLIZJ);
            } catch (Throwable th) {
                th = th;
                try {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        th = null;
                        TryCatchGuardChecker.doCheck(th);
                        C2107108Nh.LIZ(inputStreamReader, th);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LJ = nimbleJsonLIZIZ;
        LJFF = C13BV.INSTANCE;
        LJI = new ArrayList();
        LJII = new LinkedHashMap();
    }

    public static List LIZJ() {
        List<Integer> listLJLIL = C13LP.LJLIL(C685310QuP.LIZ(LJ), C13LP.LJLIL(C685310QuP.LIZ(LIZJ), C685310QuP.LIZ(LIZLLL)));
        LJFF = listLJLIL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJLIL, 10));
        Iterator it2 = ((ArrayList) listLJLIL).iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            LIZ.getClass();
            arrayList.add(Integer.valueOf(LIZ(iIntValue, "")));
        }
        return arrayList;
    }

    public static Template LIZLLL(Integer num) {
        if (num != null) {
            num.intValue();
            if (!LJFF.contains(num)) {
                return null;
            }
            Template templateLIZIZ = C685310QuP.LIZIZ(LIZLLL, num.intValue());
            if (templateLIZIZ != null) {
                return templateLIZIZ;
            }
            Template templateLIZIZ2 = C685310QuP.LIZIZ(LIZJ, num.intValue());
            if (templateLIZIZ2 != null) {
                return templateLIZIZ2;
            }
            Template templateLIZIZ3 = C685310QuP.LIZIZ(LJ, num.intValue());
            if (templateLIZIZ3 != null) {
                return templateLIZIZ3;
            }
        }
        return null;
    }

    public static int LIZ(int i, String str) {
        Object next;
        Iterator it2 = ((LinkedHashMap) LJII).entrySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                Map.Entry entry = (Map.Entry) next;
                if (((Number) ((Pair) entry.getValue()).getFirst()).intValue() == i && Intrinsics.LJFF(((Pair) entry.getValue()).getSecond(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null) {
            return ((Number) entry2.getKey()).intValue();
        }
        ArrayList arrayList = (ArrayList) LJI;
        int size = arrayList.size() + 50000;
        arrayList.add(Integer.valueOf(size));
        LJII.put(Integer.valueOf(size), new Pair<>(Integer.valueOf(i), str));
        return size;
    }

    public static int LIZIZ(int i, String str) {
        Object next;
        Iterator it2 = ((LinkedHashMap) LJII).entrySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                Map.Entry entry = (Map.Entry) next;
                if (((Number) ((Pair) entry.getValue()).getFirst()).intValue() == i && Intrinsics.LJFF(((Pair) entry.getValue()).getSecond(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null) {
            return ((Number) entry2.getKey()).intValue();
        }
        ArrayList arrayList = (ArrayList) LJI;
        int size = arrayList.size() + 50000;
        arrayList.add(Integer.valueOf(size));
        LJII.put(Integer.valueOf(size), new Pair<>(Integer.valueOf(i), str));
        return size;
    }

    public static final void LJ(C326880Cre c326880Cre, int i, String str, String str2, String str3, String str4) {
        String str5 = str;
        if ((C0B1N.LIZ() & 1) == 1) {
            Set<String> set = LIZIZ;
            if (set.contains(c326880Cre.LLILLL.uuid)) {
                return;
            }
            set.add(c326880Cre.LLILLL.uuid);
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str6 = c326880Cre.LLILLL.uuid;
            String strValueOf = String.valueOf(i);
            String str7 = "";
            if (str5 == null) {
                str5 = "";
            }
            if (str2 != null) {
                str7 = str2;
            }
            C1862330yYx.LJJJJLL(c1862330yYx, str6, strValueOf, str5, str7, str3, str4);
            return;
        }
        Message messageLIZ = C321970Cjj.LIZ(c326880Cre);
        if (messageLIZ != null) {
            C20040013b4 c20040013b4 = new C20040013b4(c326880Cre, i, str5, str2, str3, str4);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("message:");
            sbLIZ.append(messageLIZ.uuid);
            C13MK.LIZJ(C2188811AlT.LIZIZ(sbLIZ), "tikbot_nimble_card_match", c20040013b4);
        }
    }
}
