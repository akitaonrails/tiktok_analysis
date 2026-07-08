package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarReuseOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnterRoomClickPerfOptSetting;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: renamed from: X.0JGL, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JGL {
    public static final C0JGN LIZ = new C0JGN(AFwS205S0000000_17.get$arr$(285), LiveEnterRoomClickPerfOptSetting.optPreloadAudienceToolbarLazy());
    public static final Map<Integer, Stack<View>> LIZIZ = new LinkedHashMap();
    public static final Map<Integer, Stack<View>> LIZJ = new LinkedHashMap();
    public static LayoutInflater LIZLLL;
    public static C0J4A LJ;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (r4 == null) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.view.View LIZ(android.content.Context r7, com.bytedance.ies.sdk.datachannel.DataChannel r8, int r9) {
        /*
            r6 = 0
            if (r7 != 0) goto L4
            return r6
        L4:
            com.bytedance.android.livesdk.livesetting.other.LiveToolbarReuseOptimizeSetting r0 = com.bytedance.android.livesdk.livesetting.other.LiveToolbarReuseOptimizeSetting.INSTANCE
            boolean r0 = r0.enable()
            r5 = 0
            if (r0 == 0) goto La3
            java.util.Map<java.lang.Integer, java.util.Stack<android.view.View>> r1 = X.C0JGL.LIZJ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r1 = r1.get(r0)
            java.util.Stack r1 = (java.util.Stack) r1
            if (r1 == 0) goto L2b
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L2b
            java.lang.Object r4 = r1.pop()
            android.view.View r4 = (android.view.View) r4
            if (r4 != 0) goto L93
        L2b:
            java.util.Map<java.lang.Integer, java.util.Stack<android.view.View>> r1 = X.C0JGL.LIZIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r1 = r1.get(r0)
            java.util.Stack r1 = (java.util.Stack) r1
            if (r1 == 0) goto L7e
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L7e
            java.lang.Object r4 = r1.pop()
            android.view.View r4 = (android.view.View) r4
            boolean r0 = X.C500260Jjc.LJIJI(r8)
            if (r0 == 0) goto L7c
            X.0J4A r3 = X.C0JGL.LJ
            if (r3 == 0) goto L7c
            X.0JGM r2 = new X.0JGM
            r2.<init>(r9)
            X.18JT r0 = r3.LIZJ
            X.0eME<X.0J40> r0 = r0.LLILLL
            java.lang.Object r1 = r0.LIZIZ()
            X.0J40 r1 = (X.C0J40) r1
            if (r1 != 0) goto L67
            X.0J40 r1 = new X.0J40
            r1.<init>()
        L67:
            r1.LIZ = r3
            r1.LIZJ = r9
            r1.LIZLLL = r5
            r1.LIZIZ = r6
            r1.LJI = r2
            r1.LJFF = r6
            r1.LJIIJJI = r5
            r1.LJIIJ = r5
            X.18JT r0 = r3.LIZJ
            r0.LIZJ(r1)
        L7c:
            if (r4 != 0) goto L93
        L7e:
            X.0J3Y r0 = X.C0J3Y.LIZ
            r0.getClass()
            android.view.View r4 = X.C0J3Y.LJIIIIZZ(r9)
            if (r4 != 0) goto L93
            android.view.LayoutInflater r0 = X.C0JGL.LIZLLL
            if (r0 == 0) goto Lac
            android.view.View r4 = X.C786410Ut5.Td(r0, r9, r6, r5)
        L91:
            if (r4 == 0) goto Lac
        L93:
            android.content.Context r1 = r4.getContext()
            boolean r0 = r1 instanceof android.content.MutableContextWrapper
            if (r0 == 0) goto La2
            android.content.MutableContextWrapper r1 = (android.content.MutableContextWrapper) r1
            if (r1 == 0) goto La2
            r1.setBaseContext(r7)
        La2:
            return r4
        La3:
            android.view.LayoutInflater r0 = X.C0JGL.LIZLLL
            if (r0 == 0) goto Lac
            android.view.View r4 = X.C786410Ut5.Td(r0, r9, r6, r5)
            goto L91
        Lac:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0JGL.LIZ(android.content.Context, com.bytedance.ies.sdk.datachannel.DataChannel, int):android.view.View");
    }

    public static void LIZIZ(EnumC1099930ejH enumC1099930ejH, EnumC1102740eno enumC1102740eno, View view) {
        Integer numLayoutID;
        ViewGroup viewGroup;
        if (LiveToolbarReuseOptimizeSetting.INSTANCE.enableStrategy(enumC1102740eno.name()) && ((Set) LIZ.getValue()).contains(enumC1102740eno) && (numLayoutID = enumC1102740eno.layoutID(enumC1099930ejH)) != null) {
            int iIntValue = numLayoutID.intValue();
            ViewParent parent = view.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(view, viewGroup);
            }
            Map<Integer, Stack<View>> map = LIZJ;
            Integer numValueOf = Integer.valueOf(iIntValue);
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            Object stack = linkedHashMap.get(numValueOf);
            if (stack == null) {
                stack = new Stack();
                linkedHashMap.put(numValueOf, stack);
            }
            ((Stack) stack).push(view);
        }
    }
}
