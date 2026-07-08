package X;

import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ujk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C780620Ujk {
    public final HashMap<EnumC780830Uk5, List<C780630Ujl>> LIZ = new HashMap<>();
    public final HashMap<EnumC780830Uk5, List<Function0<Unit>>> LIZIZ = new HashMap<>();
    public final HashMap<EnumC2011707uN, List<C780630Ujl>> LIZJ = new HashMap<>();
    public final List<C780630Ujl> LIZLLL = new ArrayList();
    public final List<C780630Ujl> LJ = new ArrayList();
    public RecyclableWidgetManager LJFF;
    public Map<String, ? extends EnumC780830Uk5> LJI;

    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C780630Ujl r7) {
        /*
            r6 = this;
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r7.LJII
            if (r0 == 0) goto L7
            r0.invoke()
        L7:
            com.bytedance.android.widget.Widget r1 = r7.LIZ
            r5 = 0
            if (r1 == 0) goto L39
            java.lang.Integer r0 = r7.LIZJ
            if (r0 == 0) goto L2f
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r3 = r6.LJFF
            if (r3 == 0) goto L1f
            int r2 = r0.intValue()
            com.bytedance.android.widget.Widget r1 = r7.LIZ
            boolean r0 = r7.LIZLLL
            r3.load(r2, r1, r0)
        L1f:
            com.bytedance.android.widget.Widget r1 = r7.LIZ
        L21:
            r7.LIZ = r1
            kotlin.jvm.functions.Function1<? super com.bytedance.android.widget.Widget, kotlin.Unit> r0 = r7.LJIIIIZZ
            if (r0 == 0) goto L2a
            r0.invoke(r1)
        L2a:
            r7.LJII = r5
            r7.LJIIIIZZ = r5
            return
        L2f:
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r0 = r6.LJFF
            if (r0 == 0) goto L36
            r0.load(r1)
        L36:
            com.bytedance.android.widget.Widget r1 = r7.LIZ
            goto L21
        L39:
            java.lang.Class<? extends com.bytedance.ies.sdk.widgets.LiveRecyclableWidget> r2 = r7.LIZIZ
            if (r2 == 0) goto L5f
            java.lang.Integer r0 = r7.LIZJ
            if (r0 == 0) goto L54
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r4 = r6.LJFF
            if (r4 == 0) goto L5f
            int r3 = r0.intValue()
            java.lang.Class<? extends com.bytedance.ies.sdk.widgets.LiveRecyclableWidget> r2 = r7.LIZIZ
            boolean r1 = r7.LIZLLL
            java.lang.Object[] r0 = r7.LJ
            com.bytedance.ies.sdk.widgets.LiveRecyclableWidget r1 = r4.load(r3, r2, r1, r0)
            goto L21
        L54:
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r1 = r6.LJFF
            if (r1 == 0) goto L5f
            java.lang.Object[] r0 = r7.LJ
            com.bytedance.ies.sdk.widgets.LiveRecyclableWidget r1 = r1.load(r2, r0)
            goto L21
        L5f:
            r1 = r5
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C780620Ujk.LIZIZ(X.0Ujl):void");
    }

    public final void LIZJ(EnumC780830Uk5 enumC780830Uk5) {
        List<Function0<Unit>> list = this.LIZIZ.get(enumC780830Uk5);
        if (list != null) {
            Iterator<Function0<Unit>> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().invoke();
            }
        }
        C19719512Dh.LIZJ(this.LIZIZ).remove(enumC780830Uk5);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x000a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L4
            r7.LJFF = r8
        L4:
            java.util.List<X.0Ujl> r0 = r7.LJ
            java.util.Iterator r6 = r0.iterator()
        La:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto La5
            java.lang.Object r5 = r6.next()
            X.0Ujl r5 = (X.C780630Ujl) r5
            java.util.List<X.0Ujl> r0 = r7.LIZLLL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L28
            com.bytedance.android.widget.Widget r1 = r5.LIZ
            if (r1 != 0) goto L40
            java.lang.Class<? extends com.bytedance.ies.sdk.widgets.LiveRecyclableWidget> r0 = r5.LIZIZ
            if (r0 != 0) goto L40
        L28:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "register check invalidate config: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "LoadConfigDsl"
            X.C20441214yg.LJ(r0, r1)
            java.util.Map<java.lang.String, java.lang.Object> r0 = X.C1338270kvh.LIZ
            goto La
        L40:
            java.lang.Class<? extends com.bytedance.ies.sdk.widgets.LiveRecyclableWidget> r0 = r5.LIZIZ
            if (r0 == 0) goto L8b
            java.lang.String r1 = r0.getSimpleName()
        L48:
            if (r1 == 0) goto L58
            java.util.Map<java.lang.String, ? extends X.0Uk5> r0 = r7.LJI
            if (r0 == 0) goto L58
            java.lang.Object r0 = r0.get(r1)
            X.0Uk5 r0 = (X.EnumC780830Uk5) r0
            if (r0 == 0) goto L58
            r5.LJFF = r0
        L58:
            X.0Uk5 r2 = r5.LJFF
            r4 = 0
            r3 = 1
            if (r2 == 0) goto L6b
            java.util.HashMap<X.0Uk5, java.util.List<X.0Ujl>> r0 = r7.LIZ
            java.lang.Object r0 = r0.get(r2)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L7d
            r0.add(r5)
        L6b:
            X.07uN r2 = r5.LJI
            if (r2 == 0) goto La
            java.util.HashMap<X.07uN, java.util.List<X.0Ujl>> r0 = r7.LIZJ
            java.lang.Object r0 = r0.get(r2)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L96
            r0.add(r5)
            goto La
        L7d:
            java.util.HashMap<X.0Uk5, java.util.List<X.0Ujl>> r1 = r7.LIZ
            X.0Ujl[] r0 = new X.C780630Ujl[r3]
            r0[r4] = r5
            java.util.List r0 = X.C1697810uHb.LJIILJJIL(r0)
            r1.put(r2, r0)
            goto L6b
        L8b:
            if (r1 == 0) goto L58
            java.lang.Class r0 = r1.getClass()
            java.lang.String r1 = r0.getSimpleName()
            goto L48
        L96:
            java.util.HashMap<X.07uN, java.util.List<X.0Ujl>> r1 = r7.LIZJ
            X.0Ujl[] r0 = new X.C780630Ujl[r3]
            r0[r4] = r5
            java.util.List r0 = X.C1697810uHb.LJIILJJIL(r0)
            r1.put(r2, r0)
            goto La
        La5:
            java.util.List<X.0Ujl> r1 = r7.LIZLLL
            java.util.List<X.0Ujl> r0 = r7.LJ
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.addAll(r0)
            java.util.List<X.0Ujl> r0 = r7.LJ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            java.util.Map<java.lang.String, java.lang.Object> r0 = X.C1338270kvh.LIZ
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C780620Ujk.LJFF(com.bytedance.ies.sdk.widgets.RecyclableWidgetManager):void");
    }

    public static void LIZLLL(C780620Ujk c780620Ujk, EnumC780830Uk5 enumC780830Uk5) {
        c780620Ujk.LJ(enumC780830Uk5, null);
        c780620Ujk.LIZJ(enumC780830Uk5);
    }

    public final void LJ(EnumC780830Uk5 enumC780830Uk5, EnumC2011707uN enumC2011707uN) {
        List<C780630Ujl> list = this.LIZ.get(enumC780830Uk5);
        if (list != null) {
            Iterator<C780630Ujl> it2 = list.iterator();
            while (it2.hasNext()) {
                LIZIZ(it2.next());
            }
        }
        List<C780630Ujl> list2 = this.LIZJ.get(enumC2011707uN);
        if (list2 != null) {
            Iterator<C780630Ujl> it3 = list2.iterator();
            while (it3.hasNext()) {
                LIZIZ(it3.next());
            }
        }
    }

    public final void LIZ(EnumC780830Uk5 enumC780830Uk5, EnumC2011707uN enumC2011707uN, C780630Ujl c780630Ujl) {
        if (((ArrayList) this.LJ).contains(c780630Ujl) || ((ArrayList) this.LIZLLL).contains(c780630Ujl) || (c780630Ujl.LIZ == null && c780630Ujl.LIZIZ == null)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("duplicate or invalid config: ");
            sbLIZ.append(c780630Ujl);
            sbLIZ.append(", priority: ");
            sbLIZ.append(enumC780830Uk5);
            sbLIZ.append(", group: ");
            sbLIZ.append(enumC2011707uN);
            C20441214yg.LJ("LoadConfigDsl", C2188811AlT.LIZIZ(sbLIZ));
            Map<String, Object> map = C1338270kvh.LIZ;
            return;
        }
        if (c780630Ujl.LJFF == null) {
            c780630Ujl.LJFF = enumC780830Uk5;
        }
        if (c780630Ujl.LJI == null) {
            c780630Ujl.LJI = enumC2011707uN;
        }
        ((ArrayList) this.LJ).add(c780630Ujl);
    }
}
