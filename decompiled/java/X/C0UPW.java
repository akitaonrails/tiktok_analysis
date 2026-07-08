package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.BugFixMgBlankScreenSetting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0UPW, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UPW {
    public static WeakReference<FrameLayout> LIZ;
    public static WeakReference<FrameLayout> LIZIZ;
    public static WeakReference<FrameLayout> LIZJ;
    public static String LIZLLL = "";

    public static void LIZJ() {
        FrameLayout frameLayout;
        ViewGroup viewGroup;
        WeakReference<FrameLayout> weakReference = LIZ;
        if (weakReference == null || (frameLayout = weakReference.get()) == null) {
            return;
        }
        ViewParent parent = frameLayout.getParent();
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return;
        }
        C786410Ut5.LJJJLZIJ(frameLayout, viewGroup);
    }

    public static void LJ() {
        C20441214yg.LIZIZ("GuestLayoutContainerHelper", "release");
        LIZJ();
        WeakReference<FrameLayout> weakReference = LIZ;
        if (weakReference != null) {
            weakReference.clear();
        }
        LIZ = null;
        WeakReference<FrameLayout> weakReference2 = LIZIZ;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        LIZIZ = null;
        if (BugFixMgBlankScreenSetting.INSTANCE.isEnable()) {
            WeakReference<FrameLayout> weakReference3 = LIZJ;
            if (weakReference3 != null) {
                weakReference3.clear();
            }
            LIZJ = null;
        }
        LIZLLL = "";
    }

    public static void LIZ(Context context, ViewGroup viewGroup) {
        ArrayList<View> arrayList = new ArrayList();
        LIZIZ(context, viewGroup, arrayList);
        if (!arrayList.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Context mismatch found! Target Context: ");
            sbLIZ.append(context);
            C20441214yg.LJ("GuestLayoutContainerHelper", C2188811AlT.LIZIZ(sbLIZ));
            for (View view : arrayList) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("  - View: ");
                sbLIZ2.append(view.getClass().getSimpleName());
                sbLIZ2.append(" (ID: ");
                sbLIZ2.append(view.getId());
                sbLIZ2.append(") has incorrect Context: ");
                sbLIZ2.append(view.getContext());
                C20441214yg.LJ("GuestLayoutContainerHelper", C2188811AlT.LIZIZ(sbLIZ2));
            }
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("All contexts match the target context: ");
        sbLIZ3.append(context);
        C20441214yg.LJ("GuestLayoutContainerHelper", C2188811AlT.LIZIZ(sbLIZ3));
    }

    public static boolean LJFF(View view, View view2) {
        ViewGroup viewGroup;
        if (view == null || view2 == null) {
            return false;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return false;
        }
        int iIndexOfChild = viewGroup.indexOfChild(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int id = view.getId();
        C786410Ut5.LJJJLZIJ(view, viewGroup);
        view2.setId(id);
        C786410Ut5.W5(view2, layoutParams);
        viewGroup.addView(view2, iIndexOfChild);
        return true;
    }

    public static void LIZIZ(Context context, View view, List list) {
        if (view.getContext() != context) {
            ((ArrayList) list).add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                LIZIZ(context, viewGroup.getChildAt(i), list);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.widget.FrameLayout LIZLLL(android.content.Context r4, android.view.View r5, android.view.ViewGroup r6, java.lang.String r7) {
        /*
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "guestLayoutAttachBroadcast, scene: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "GuestLayoutContainerHelper"
            X.C20441214yg.LIZIZ(r0, r1)
            java.lang.ref.WeakReference<android.widget.FrameLayout> r0 = X.C0UPW.LIZ
            r1 = 0
            if (r0 == 0) goto L98
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L98
            X.C0UPW.LIZLLL = r7
            LIZJ()
            java.lang.ref.WeakReference<android.widget.FrameLayout> r0 = X.C0UPW.LIZ
            if (r0 == 0) goto L92
            java.lang.Object r3 = r0.get()
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
        L2f:
            if (r5 == 0) goto L81
            boolean r0 = LJFF(r5, r3)
            if (r0 == 0) goto L94
        L37:
            if (r4 == 0) goto L94
            java.lang.ref.WeakReference<android.widget.FrameLayout> r0 = X.C0UPW.LIZ
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L7f
            android.content.Context r2 = r0.getContext()
        L49:
            boolean r0 = r2 instanceof android.content.MutableContextWrapper
            if (r0 == 0) goto L54
            android.content.MutableContextWrapper r2 = (android.content.MutableContextWrapper) r2
            if (r2 == 0) goto L54
            r2.setBaseContext(r4)
        L54:
            java.lang.ref.WeakReference<android.widget.FrameLayout> r0 = X.C0UPW.LIZIZ
            if (r0 == 0) goto L64
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L64
            android.content.Context r1 = r0.getContext()
        L64:
            boolean r0 = r1 instanceof android.content.MutableContextWrapper
            if (r0 == 0) goto L6f
            android.content.MutableContextWrapper r1 = (android.content.MutableContextWrapper) r1
            if (r1 == 0) goto L6f
            r1.setBaseContext(r4)
        L6f:
            java.lang.ref.WeakReference<android.widget.FrameLayout> r0 = X.C0UPW.LIZ
            if (r0 == 0) goto L7e
            java.lang.Object r0 = r0.get()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L7e
            LIZ(r4, r0)
        L7e:
            return r3
        L7f:
            r2 = r1
            goto L49
        L81:
            if (r6 == 0) goto L94
            if (r3 == 0) goto L94
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r0 = -1
            r2.<init>(r0, r0)
            X.C786410Ut5.W5(r3, r2)
            r6.addView(r3)
            goto L37
        L92:
            r3 = r1
            goto L2f
        L94:
            LJ()
            return r1
        L98:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UPW.LIZLLL(android.content.Context, android.view.View, android.view.ViewGroup, java.lang.String):android.widget.FrameLayout");
    }
}
