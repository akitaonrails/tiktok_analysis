package X;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0y7F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1845150y7F implements InterfaceC1848190yC9 {
    public volatile boolean LIZ;
    public volatile boolean LIZIZ = true;

    @Override // X.InterfaceC1848190yC9
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1848190yC9
    public final void LIZJ() {
    }

    @Override // X.InterfaceC1848190yC9
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC1848190yC9
    public final void LLLZIL() {
    }

    @Override // X.InterfaceC1848190yC9
    public final void LLLZL() {
    }

    @Override // X.InterfaceC1848190yC9
    public final void LLLZLL() {
    }

    @Override // X.InterfaceC1848190yC9
    public final void LLLZLZ(View view) {
    }

    @Override // X.InterfaceC1848190yC9
    public final void LLLZZ(C1847620yBE c1847620yBE) {
    }

    @Override // X.InterfaceC1848190yC9
    public final void LLLZZIL(View view) {
    }

    @Override // X.InterfaceC1848190yC9
    public final void LLZ(Activity activity, Dialog dialog) {
    }

    @Override // X.InterfaceC1848190yC9
    public final void LLZIL(C1847620yBE c1847620yBE) {
    }

    @Override // X.InterfaceC1848190yC9
    public final void LLZILL(Activity activity, Dialog dialog) {
    }

    @Override // X.InterfaceC1848190yC9
    public final void LLZL(Activity activity) {
    }

    @Override // X.InterfaceC1848190yC9
    public final void LLZLI(C1847620yBE c1847620yBE) {
    }

    public static void LJ(View view, LinkedList linkedList) {
        String str;
        if (view.getVisibility() == 0 && view.getAlpha() > 0.0f && view.getWidth() != 0 && view.getHeight() != 0) {
            C1847740yBQ c1847740yBQLIZIZ = C1846620y9c.LIZIZ(view);
            if (c1847740yBQLIZIZ != null && (str = c1847740yBQLIZIZ.LIZIZ) != null && str.length() != 0) {
                C1845160y7G c1845160y7G = new C1845160y7G();
                c1845160y7G.LIZ = str;
                c1845160y7G.LIZIZ = new WeakReference<>(view);
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                c1845160y7G.LIZJ = iArr;
                linkedList.addLast(c1845160y7G);
            }
            if (view instanceof ViewGroup) {
                Iterator<View> it2 = new C09RD((ViewGroup) view).iterator();
                while (true) {
                    C09RE c09re = (C09RE) it2;
                    if (c09re.hasNext()) {
                        LJ((View) c09re.next(), linkedList);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void LIZ(Activity activity, Function1<? super Pair<Integer, ? extends HashMap<Integer, C1845160y7G>>, Unit> function1) {
        View decorView;
        int iHashCode;
        int iHashCode2;
        View view;
        View view2;
        Window window;
        if (activity != null && (window = activity.getWindow()) != null) {
            decorView = window.getDecorView();
        } else {
            decorView = null;
        }
        if (activity != null) {
            iHashCode = activity.hashCode();
        } else {
            iHashCode = 0;
        }
        if (decorView == null) {
            function1.invoke(null);
            this.LIZ = false;
            return;
        }
        LinkedList linkedList = new LinkedList();
        HashMap map = new HashMap();
        try {
            LJ(decorView, linkedList);
            if (!linkedList.isEmpty()) {
                C1845160y7G c1845160y7G = (C1845160y7G) linkedList.removeFirst();
                WeakReference<View> weakReference = c1845160y7G.LIZIZ;
                if (weakReference != null && (view2 = weakReference.get()) != null) {
                    iHashCode2 = view2.hashCode();
                } else {
                    iHashCode2 = 0;
                }
                map.put(Integer.valueOf(iHashCode2), c1845160y7G);
                while (!linkedList.isEmpty()) {
                    C1845160y7G c1845160y7G2 = (C1845160y7G) linkedList.removeFirst();
                    WeakReference<View> weakReference2 = c1845160y7G2.LIZIZ;
                    if (weakReference2 != null && (view = weakReference2.get()) != null) {
                        ViewParent parent = view.getParent();
                        while (true) {
                            if (parent == null) {
                                break;
                            }
                            C1845160y7G c1845160y7G3 = (C1845160y7G) map.get(Integer.valueOf(parent.hashCode()));
                            if (c1845160y7G3 != null) {
                                ((ArrayList) c1845160y7G3.LIZLLL).add(c1845160y7G2);
                                map.put(Integer.valueOf(view.hashCode()), c1845160y7G2);
                                break;
                            }
                            parent = parent.getParent();
                        }
                    }
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("prepareViewNode viewNode: ");
                sbLIZ.append(c1845160y7G);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("prepareViewNode ex: ");
            sbLIZ2.append(e);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        function1.invoke(new Pair(Integer.valueOf(iHashCode), map));
        this.LIZ = false;
    }
}
