package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Orh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C632670Orh {
    public static int LIZ;
    public static final Map<Integer, C13ES<Pair<Integer, InterfaceC1631620sYq<Integer, InterfaceC1680500tpg, Integer, Unit>>>> LIZIZ = new LinkedHashMap();
    public static final WeakHashMap<Activity, C13ES<Pair<Integer, InterfaceC1631620sYq<Integer, InterfaceC1680500tpg, Integer, Unit>>>> LIZJ = new WeakHashMap<>();

    public static void LIZ(final int i) {
        Map<Integer, C13ES<Pair<Integer, InterfaceC1631620sYq<Integer, InterfaceC1680500tpg, Integer, Unit>>>> map = LIZIZ;
        C13ES c13es = (C13ES) ((LinkedHashMap) map).get(Integer.valueOf(i));
        if (c13es != null) {
            C19719612Di.LJJIIJ(c13es, new Function1() { // from class: X.04kx
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean z;
                    if (((Number) ((Pair) obj).getFirst()).intValue() == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }, true);
            map.remove(Integer.valueOf(i));
        }
    }

    public static Integer LIZIZ(Context context, C19719212De c19719212De) {
        ComponentActivity componentActivity;
        ViewGroup viewGroup;
        View decorView;
        Activity activityLIZ = C1388190mED.LIZ(context);
        View decorView2 = null;
        if (activityLIZ == null) {
            return null;
        }
        WeakHashMap<Activity, C13ES<Pair<Integer, InterfaceC1631620sYq<Integer, InterfaceC1680500tpg, Integer, Unit>>>> weakHashMap = LIZJ;
        C13ES<Pair<Integer, InterfaceC1631620sYq<Integer, InterfaceC1680500tpg, Integer, Unit>>> c13es = weakHashMap.get(activityLIZ);
        int i = LIZ;
        LIZ = i + 1;
        if (c13es == null) {
            Pair[] pairArr = {new Pair(Integer.valueOf(i), c19719212De)};
            final C13ES<Pair<Integer, InterfaceC1631620sYq<Integer, InterfaceC1680500tpg, Integer, Unit>>> c13es2 = new C13ES<>();
            c13es2.addAll(C13LQ.LJJLL(pairArr));
            ComposeView composeView = new ComposeView(activityLIZ, null, 6);
            C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(-1849818575, new Function2<InterfaceC1680500tpg, Integer, Unit>() { // from class: X.0Orq
                @Override // kotlin.jvm.functions.Function2
                public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
                    InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
                    if ((num.intValue() & 3) == 2 && interfaceC1680500tpg2.LIZ()) {
                        interfaceC1680500tpg2.LIZJ();
                    } else {
                        Iterator<Pair<Integer, InterfaceC1631620sYq<Integer, InterfaceC1680500tpg, Integer, Unit>>> it2 = c13es2.iterator();
                        while (true) {
                            C13EU c13eu = (C13EU) it2;
                            if (!c13eu.hasNext()) {
                                break;
                            }
                            Pair pair = (Pair) c13eu.next();
                            ((InterfaceC1631620sYq) pair.getSecond()).invoke(pair.getFirst(), interfaceC1680500tpg2, 0);
                        }
                    }
                    return Unit.LIZ;
                }
            }, true));
            Window window = activityLIZ.getWindow();
            if ((window == null || (decorView = window.getDecorView()) == null || ViewTreeLifecycleOwner.get(decorView) == null) && (activityLIZ instanceof ComponentActivity) && (componentActivity = (ComponentActivity) activityLIZ) != null) {
                componentActivity.initializeViewTreeOwners();
            }
            Window window2 = activityLIZ.getWindow();
            if (window2 != null) {
                decorView2 = window2.getDecorView();
            }
            if ((decorView2 instanceof ViewGroup) && (viewGroup = (ViewGroup) decorView2) != null) {
                viewGroup.addView(composeView);
            }
            weakHashMap.put(activityLIZ, c13es2);
            LIZIZ.put(Integer.valueOf(i), c13es2);
        } else {
            c13es.add(new Pair<>(Integer.valueOf(i), c19719212De));
            LIZIZ.put(Integer.valueOf(i), c13es);
        }
        return Integer.valueOf(i);
    }
}
