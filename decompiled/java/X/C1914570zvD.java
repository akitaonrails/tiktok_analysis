package X;

import android.content.Context;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlock;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlockElement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zvD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1914570zvD {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(Fragment fragment) throws Throwable {
        int i;
        int i2;
        View decorView;
        C20246014Ju c20246014JuLIZ;
        C20244914Jj c20244914JjLIZ = null;
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics windowMetricsLLILZ = C2204961BRm.LLILZ((WindowManager) fragment.requireContext().getSystemService(WindowManager.class), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqmcNHb0jukrhVR62OaE7NxWxhDuwxMTObMiwHMCcrEj/xcTM5V5z12kEEgx6CuwKLQR5ABRzTIQ2U=", null));
            Insets insets = windowMetricsLLILZ.getWindowInsets().getInsets(WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout());
            return (windowMetricsLLILZ.getBounds().height() - insets.top) - insets.bottom;
        }
        Window window = fragment.requireActivity().getWindow();
        if (window != null && (decorView = window.getDecorView()) != null && (c20246014JuLIZ = C14K4.LIZ(decorView)) != null) {
            c20244914JjLIZ = c20246014JuLIZ.LIZ(7);
        }
        int i3 = fragment.requireContext().getResources().getDisplayMetrics().heightPixels;
        if (c20244914JjLIZ != null) {
            i = c20244914JjLIZ.LIZIZ;
            i2 = c20244914JjLIZ.LIZLLL;
        } else {
            i = 0;
            i2 = 0;
        }
        return Math.max(i3 - (i + i2), 0);
    }

    public static C990320bsU LIZIZ(Context context, List list, Map map, InterfaceC1914580zvE interfaceC1914580zvE, String str) {
        InterfaceC1914540zvA interfaceC1914540zvA;
        AbstractC1914480zv4 abstractC1914480zv4LIZ;
        UniversalPopupAction universalPopupAction;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        C786410Ut5.d6(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                UniversalPopupBlock universalPopupBlock = (UniversalPopupBlock) it2.next();
                if (map != null && (interfaceC1914540zvA = (InterfaceC1914540zvA) map.get(universalPopupBlock.type)) != null && (abstractC1914480zv4LIZ = interfaceC1914540zvA.LIZ(context, interfaceC1914580zvE, universalPopupBlock)) != null) {
                    abstractC1914480zv4LIZ.LIZLLL = str;
                    arrayList.add(abstractC1914480zv4LIZ);
                    linearLayout.addView(abstractC1914480zv4LIZ.LIZ());
                    for (Map.Entry<String, UniversalPopupBlockElement> entry : universalPopupBlock.elements.entrySet()) {
                        if (Intrinsics.LJFF(entry.getValue().subtype, "radio") && (universalPopupAction = entry.getValue().action) != null) {
                            arrayList2.add(new C443120HZe(universalPopupAction.actionId, entry.getValue().groupId, abstractC1914480zv4LIZ));
                            linkedHashSet.add(entry.getValue().groupId);
                        }
                    }
                }
            }
        }
        return new C990320bsU(linearLayout, arrayList, arrayList2, linkedHashSet);
    }
}
