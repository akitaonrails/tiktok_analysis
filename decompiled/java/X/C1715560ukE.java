package X;

import Y.ARunnableS12S0301000_19;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS121S0400000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ukE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1715560ukE {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, Fragment fragment, C1713570uh1 c1713570uh1, Function0 function0) {
        InputMethodManager inputMethodManager;
        View decorView;
        IBinder windowToken;
        View view;
        if (c1713570uh1.LJFF() != EnumC1714450uiR.HALF_PAGE) {
            if (C1713570uh1.LJIIL(c1713570uh1, i)) {
                function0.invoke();
                return;
            }
            return;
        }
        C19EG activity = fragment.getActivity();
        if (activity != null) {
            Object objJ2 = C786410Ut5.J2(activity, "input_method");
            if (objJ2 instanceof InputMethodManager) {
                inputMethodManager = (InputMethodManager) objJ2;
            } else {
                inputMethodManager = null;
            }
            View currentFocus = activity.getCurrentFocus();
            if (currentFocus != null || (((view = fragment.getView()) != null && (currentFocus = view.findFocus()) != null) || (currentFocus = fragment.getView()) != null)) {
                currentFocus.clearFocus();
            }
            if (currentFocus != null && (windowToken = currentFocus.getWindowToken()) != null && inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
            }
            Window window = activity.getWindow();
            if (window != null && (decorView = window.getDecorView()) != null) {
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(decorView.getWindowToken(), 0);
                }
                new C1A6V(activity.getWindow(), decorView).LIZ(8);
            }
        }
        ARunnableS12S0301000_19 aRunnableS12S0301000_19 = new ARunnableS12S0301000_19(i, fragment, c1713570uh1, function0, 1);
        View view2 = fragment.getView();
        if (view2 != null) {
            HandlerHook.viewPostDelay(view2, aRunnableS12S0301000_19, 50L);
        } else {
            aRunnableS12S0301000_19.run();
        }
    }

    public static void LIZIZ(Fragment fragment, C1713570uh1 c1713570uh1, AbstractC1714770uix abstractC1714770uix, Function0 function0) {
        if (abstractC1714770uix instanceof C1714750uiv) {
            LIZ(((C1714750uiv) abstractC1714770uix).LIZ.LIZ, fragment, c1713570uh1, function0);
        } else if (abstractC1714770uix instanceof C1714760uiw) {
            LIZJ(fragment, c1713570uh1, ((C1714760uiw) abstractC1714770uix).LIZ, function0);
        } else if (Intrinsics.LJFF(abstractC1714770uix, C1714780uiy.LIZ)) {
        } else {
            throw new C1954807lC();
        }
    }

    public static void LIZJ(Fragment fragment, C1713570uh1 c1713570uh1, List list, Function0 function0) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1714740uiu c1714740uiu = (C1714740uiu) it2.next();
            C1247510iZJ c1247510iZJ = new C1247510iZJ();
            c1247510iZJ.LIZIZ(c1714740uiu.LIZJ);
            c1247510iZJ.LIZ(new AwS121S0400000_26(fragment, (Fragment) c1713570uh1, (C1713570uh1) c1714740uiu, (C1714740uiu) function0, (Function0<Unit>) 9));
            arrayList.add(c1247510iZJ);
        }
        C1247510iZJ[] c1247510iZJArr = (C1247510iZJ[]) arrayList.toArray(new C1247510iZJ[0]);
        C1390850mIV c1390850mIV = new C1390850mIV();
        c1390850mIV.LIZ.LLJJIJI = fragment.getString(2131840446);
        c1390850mIV.LIZIZ((C1247510iZJ[]) Arrays.copyOf(c1247510iZJArr, c1247510iZJArr.length));
        c1390850mIV.LIZLLL(2131840414);
        c1390850mIV.LIZJ().show(fragment.getParentFragmentManager(), "verify_candidate_switch");
    }
}
