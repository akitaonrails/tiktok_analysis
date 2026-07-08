package X;

import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0I92, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I92 {
    public static final ConcurrentHashMap<String, C572420Mci> LIZ = new ConcurrentHashMap<>();
    public static final C054G LIZIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(216));

    public static List LIZ() {
        List listLJJJJI;
        C844470XAv.LIZ.getClass();
        InputMethodManager inputMethodManager = (InputMethodManager) C786410Ut5.H2(C844470XAv.LIZ(), "input_method");
        try {
            List<InputMethodInfo> enabledInputMethodList = inputMethodManager.getEnabledInputMethodList();
            if (enabledInputMethodList != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<InputMethodInfo> it2 = enabledInputMethodList.iterator();
                while (it2.hasNext()) {
                    List<InputMethodSubtype> enabledInputMethodSubtypeList = inputMethodManager.getEnabledInputMethodSubtypeList(it2.next(), true);
                    if (enabledInputMethodSubtypeList == null) {
                        enabledInputMethodSubtypeList = C13BV.INSTANCE;
                    }
                    C19719612Di.LJJI(enabledInputMethodSubtypeList, arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    String locale = ((InputMethodSubtype) it3.next()).getLocale();
                    if (locale != null) {
                        arrayList2.add(locale);
                    }
                }
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(u.LJJIFFI((String) it4.next(), "-", "_", false).toLowerCase(Locale.ROOT));
                }
                listLJJJJI = C13LP.LJJJJI(arrayList3);
            } else {
                listLJJJJI = null;
            }
            return listLJJJJI == null ? C13BV.INSTANCE : listLJJJJI;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("T2IAddAsPostPrefetch readKeyboardLangList error: ");
            sbLIZ.append(e);
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
            return C13BV.INSTANCE;
        }
    }
}
