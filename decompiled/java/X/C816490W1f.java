package X;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0W1f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C816490W1f {
    public static final void LIZ(final Dialog dialog) {
        Window window;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        if (C1848410yCV.LIZ && dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewTreeObserver = decorView.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: X.0yBK
                @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                public final void onWindowFocusChanged(boolean z) {
                    View viewLIZLLL;
                    List<WeakReference<View>> listPutIfAbsent;
                    final Dialog dialog2 = dialog;
                    final Activity activityLIZ = C1808610xAJ.LIZ(dialog2);
                    if (C1847960yBm.LJIIIIZZ) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onDialogFocusChanged: dialog=");
                        sbLIZ.append(dialog2);
                        sbLIZ.append(", hasFocus=");
                        sbLIZ.append(z);
                        sbLIZ.append(", activity=");
                        sbLIZ.append(activityLIZ);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                    if (activityLIZ != null) {
                        if (z) {
                            InterfaceC1846560y9W interfaceC1846560y9WLIZ = C1847660yBI.LIZ();
                            if (interfaceC1846560y9WLIZ != null && interfaceC1846560y9WLIZ.LIZLLL() && (viewLIZLLL = C1846620y9c.LIZLLL(dialog2)) != null) {
                                int iHashCode = activityLIZ.hashCode();
                                ConcurrentHashMap<Integer, List<WeakReference<View>>> concurrentHashMap = C588030N4n.LIZ;
                                Integer numValueOf = Integer.valueOf(iHashCode);
                                List<WeakReference<View>> arrayList = concurrentHashMap.get(numValueOf);
                                if (arrayList == null && (listPutIfAbsent = concurrentHashMap.putIfAbsent(numValueOf, (arrayList = new ArrayList<>()))) != null) {
                                    arrayList = listPutIfAbsent;
                                }
                                List<WeakReference<View>> list = arrayList;
                                if (!list.isEmpty()) {
                                    Iterator<WeakReference<View>> it2 = list.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        WeakReference<View> next = it2.next();
                                        if (next.get() != null && Intrinsics.LJFF(next.get(), viewLIZLLL)) {
                                            list.remove(next);
                                            break;
                                        }
                                    }
                                }
                                list.add(new WeakReference<>(viewLIZLLL));
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("openAutoMount v: ");
                                sbLIZ2.append(viewLIZLLL);
                                sbLIZ2.append(" act:");
                                sbLIZ2.append(activityLIZ.getClass().getSimpleName());
                                sbLIZ2.append(" size: ");
                                sbLIZ2.append(Integer.valueOf(list.size()));
                                C2188811AlT.LIZIZ(sbLIZ2);
                            }
                            C1847860yBc.LLILLJJLI.LIZJ.LIZIZ(new InterfaceC1489050oqt<InterfaceC1848190yC9>() { // from class: X.0yBL
                                @Override // X.InterfaceC1489050oqt
                                public final void LIZ(InterfaceC1848190yC9 interfaceC1848190yC9) {
                                    interfaceC1848190yC9.LLZ(activityLIZ, dialog2);
                                }
                            });
                            return;
                        }
                        C1847860yBc.LLILLJJLI.LIZJ.LIZIZ(new C1847700yBM(activityLIZ, dialog2));
                    }
                }
            });
            viewTreeObserver.addOnWindowAttachListener(new ViewTreeObserver.OnWindowAttachListener() { // from class: X.0yBJ
                @Override // android.view.ViewTreeObserver.OnWindowAttachListener
                public final void onWindowAttached() {
                }

                @Override // android.view.ViewTreeObserver.OnWindowAttachListener
                public final void onWindowDetached() {
                    InterfaceC1846560y9W interfaceC1846560y9WLIZ;
                    View viewLIZLLL;
                    Dialog dialog2 = dialog;
                    Activity activityLIZ = C1808610xAJ.LIZ(dialog2);
                    if (C1847960yBm.LJIIIIZZ) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onDialogStop: dialog=");
                        sbLIZ.append(dialog2);
                        sbLIZ.append(", activity=");
                        sbLIZ.append(activityLIZ);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                    if (activityLIZ != null && (interfaceC1846560y9WLIZ = C1847660yBI.LIZ()) != null && interfaceC1846560y9WLIZ.LIZLLL() && (viewLIZLLL = C1846620y9c.LIZLLL(dialog2)) != null) {
                        List<WeakReference<View>> list = C588030N4n.LIZ.get(Integer.valueOf(activityLIZ.hashCode()));
                        if (list != null && (!list.isEmpty())) {
                            Iterator<WeakReference<View>> it2 = list.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                WeakReference<View> next = it2.next();
                                if (Intrinsics.LJFF(next.get(), viewLIZLLL)) {
                                    list.remove(next);
                                    break;
                                }
                            }
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("closeAutoMount v: ");
                        sbLIZ2.append(viewLIZLLL);
                        sbLIZ2.append(" act:");
                        sbLIZ2.append(activityLIZ.getClass().getSimpleName());
                        sbLIZ2.append(" size: ");
                        sbLIZ2.append(list != null ? Integer.valueOf(list.size()) : null);
                        C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    C1847860yBc.LLILLJJLI.LIZJ.LIZIZ(new C1847700yBM(activityLIZ, dialog2));
                }
            });
        }
    }
}
