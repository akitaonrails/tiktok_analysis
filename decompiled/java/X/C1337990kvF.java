package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.yoga.m;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS208S0000000_20;
import kotlin.jvm.internal.AwS134S1100000_20;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0kvF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1337990kvF {
    public static final HashMap<String, WeakReference<Bitmap>> LIZ = new HashMap<>();

    public static final boolean LIZ(View view) {
        if (view.getVisibility() != 0 && view.getAnimation() == null) {
            return false;
        }
        return true;
    }

    public static final InterfaceC1338020kvI LIZLLL(View view) {
        InterfaceC1338020kvI interfaceC1338020kvILIZLLL;
        InterfaceC1338020kvI interfaceC1338020kvI;
        Object tag = view.getTag(R.id.p01);
        if ((tag instanceof InterfaceC1338020kvI) && (interfaceC1338020kvI = (InterfaceC1338020kvI) tag) != null) {
            return interfaceC1338020kvI;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null && (interfaceC1338020kvILIZLLL = LIZLLL(childAt)) != null) {
                    return interfaceC1338020kvILIZLLL;
                }
            }
        }
        return null;
    }

    public static final InterfaceC1338020kvI LJI(View view) {
        View view2;
        InterfaceC1338020kvI interfaceC1338020kvI;
        Object tag = view.getTag(R.id.p01);
        if ((tag instanceof InterfaceC1338020kvI) && (interfaceC1338020kvI = (InterfaceC1338020kvI) tag) != null) {
            return interfaceC1338020kvI;
        }
        Object parent = view.getParent();
        if (!(parent instanceof ViewGroup) || (view2 = (View) parent) == null) {
            return null;
        }
        return LJI(view2);
    }

    public static final View LJ(View view, String str) {
        View viewLJ;
        InterfaceC1338020kvI interfaceC1338020kvI;
        Object tag = view.getTag(R.id.p01);
        if ((tag instanceof InterfaceC1338020kvI) && (interfaceC1338020kvI = (InterfaceC1338020kvI) tag) != null && Intrinsics.LJFF(interfaceC1338020kvI.getElementId(), str)) {
            return interfaceC1338020kvI.getView();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null && (viewLJ = LJ(childAt, str)) != null) {
                    return viewLJ;
                }
            }
        }
        return null;
    }

    public static final void LJIIIIZZ(AbstractC21333318eB<?> abstractC21333318eB, List<Float> list) {
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float fFloatValue4;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            if (size != 1) {
                if (size != 2) {
                    if (size != 3) {
                        fFloatValue2 = ((Number) ListProtector.get(list, 0)).floatValue();
                        fFloatValue3 = ((Number) ListProtector.get(list, 1)).floatValue();
                        fFloatValue4 = ((Number) ListProtector.get(list, 2)).floatValue();
                        fFloatValue = ((Number) ListProtector.get(list, 3)).floatValue();
                        m mVar = abstractC21333318eB.LLILZLL;
                        mVar.setPadding(EnumC1321440kUY.TOP, fFloatValue2);
                        mVar.setPadding(EnumC1321440kUY.RIGHT, fFloatValue3);
                        mVar.setPadding(EnumC1321440kUY.BOTTOM, fFloatValue4);
                        mVar.setPadding(EnumC1321440kUY.LEFT, fFloatValue);
                        abstractC21333318eB.LJJLIIIJJIZ();
                    }
                    fFloatValue2 = ((Number) ListProtector.get(list, 0)).floatValue();
                    fFloatValue3 = ((Number) ListProtector.get(list, 1)).floatValue();
                    fFloatValue4 = ((Number) ListProtector.get(list, 2)).floatValue();
                } else {
                    fFloatValue2 = ((Number) ListProtector.get(list, 0)).floatValue();
                    fFloatValue3 = ((Number) ListProtector.get(list, 1)).floatValue();
                    fFloatValue4 = fFloatValue2;
                }
                fFloatValue = fFloatValue3;
                m mVar2 = abstractC21333318eB.LLILZLL;
                mVar2.setPadding(EnumC1321440kUY.TOP, fFloatValue2);
                mVar2.setPadding(EnumC1321440kUY.RIGHT, fFloatValue3);
                mVar2.setPadding(EnumC1321440kUY.BOTTOM, fFloatValue4);
                mVar2.setPadding(EnumC1321440kUY.LEFT, fFloatValue);
                abstractC21333318eB.LJJLIIIJJIZ();
            }
            fFloatValue = ((Number) ListProtector.get(list, 0)).floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        fFloatValue2 = fFloatValue;
        fFloatValue3 = fFloatValue;
        fFloatValue4 = fFloatValue;
        m mVar22 = abstractC21333318eB.LLILZLL;
        mVar22.setPadding(EnumC1321440kUY.TOP, fFloatValue2);
        mVar22.setPadding(EnumC1321440kUY.RIGHT, fFloatValue3);
        mVar22.setPadding(EnumC1321440kUY.BOTTOM, fFloatValue4);
        mVar22.setPadding(EnumC1321440kUY.LEFT, fFloatValue);
        abstractC21333318eB.LJJLIIIJJIZ();
    }

    public static final void LJIIIZ(AbstractC21333318eB<?> abstractC21333318eB, Object obj) {
        int i;
        m mVar = abstractC21333318eB.LLILZLL;
        C1168340gVc c1168340gVcLJIIJ = abstractC21333318eB.LL.LJIIJ();
        try {
            if (obj == null) {
                mVar.setHeightAuto();
            } else if (obj instanceof Number) {
                mVar.setHeight(C21333518eD.LJFF((Number) obj, c1168340gVcLJIIJ));
            } else if (obj instanceof String) {
                if ("auto".equals(obj)) {
                    mVar.setHeightAuto();
                } else if ("stretch".equals(obj)) {
                    mVar.setHeightPercent(100.0f);
                } else {
                    String str = (String) obj;
                    int length = str.length();
                    if (length > 0 && str.charAt(length - 1) == '%') {
                        String str2 = (String) obj;
                        mVar.setHeightPercent(CastFloatProtector.parseFloat(str2.substring(0, str2.length() - 1)));
                    } else {
                        mVar.setHeight(C21333518eD.LJFF(Float.valueOf(CastFloatProtector.parseFloat((String) obj)), c1168340gVcLJIIJ));
                    }
                }
            } else if ((obj instanceof C1337880kv4) && (i = ((C1337880kv4) obj).LIZIZ) != 0) {
                if (i != 1) {
                    if (i != 2) {
                        mVar.setHeightAuto();
                    } else {
                        mVar.setHeightPercent(((C1337880kv4) obj).LIZ);
                    }
                } else {
                    mVar.setHeight(((C1337880kv4) obj).LIZ);
                }
            } else {
                mVar.setHeightAuto();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            mVar.setHeightAuto();
        }
        abstractC21333318eB.LJJLIIIJJIZ();
        if ((!abstractC21333318eB.LL.LIZ.LJJIFFI || abstractC21333318eB.LLILZLL.getOwner() == null || C1325860kbg.LJII()) && !abstractC21333318eB.LJIILL()) {
            ViewGroup.LayoutParams layoutParams = abstractC21333318eB.getView().getLayoutParams();
            if (layoutParams == null) {
                C1325860kbg.LIZIZ(null, AFwS208S0000000_20.get$arr$(78), C2097608Jq.LJ());
                layoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                C786410Ut5.W5(abstractC21333318eB.getView(), layoutParams);
            }
            layoutParams.height = C1337850kv1.LJI(obj, abstractC21333318eB.LL.LJIIJ());
        }
    }

    public static final void LJIIJJI(View view, boolean z) {
        view.setTag(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067 A[PHI: r1
      0x0067: PHI (r1v10 ??) = (r1v8 ??), (r1v11 ??) binds: [B:75:0x0196, B:26:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0198  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Collection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIL(X.AbstractC21333318eB<?> r9, java.util.List<X.C1337880kv4> r10) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1337990kvF.LJIIL(X.18eB, java.util.List):void");
    }

    public static final void LJIILL(AbstractC21333318eB<?> abstractC21333318eB, Object obj) {
        int i;
        m mVar = abstractC21333318eB.LLILZLL;
        C1168340gVc c1168340gVcLJIIJ = abstractC21333318eB.LL.LJIIJ();
        try {
            if (obj == null) {
                mVar.setWidthAuto();
            } else if (obj instanceof Number) {
                mVar.setWidth(C21333518eD.LJFF((Number) obj, c1168340gVcLJIIJ));
            } else if (obj instanceof String) {
                if ("auto".equals(obj)) {
                    mVar.setWidthAuto();
                } else if ("stretch".equals(obj)) {
                    mVar.setWidthPercent(100.0f);
                } else {
                    String str = (String) obj;
                    int length = str.length();
                    if (length > 0 && str.charAt(length - 1) == '%') {
                        String str2 = (String) obj;
                        mVar.setWidthPercent(CastFloatProtector.parseFloat(str2.substring(0, str2.length() - 1)));
                    } else {
                        mVar.setWidth(C21333518eD.LJFF(Float.valueOf(CastFloatProtector.parseFloat((String) obj)), c1168340gVcLJIIJ));
                    }
                }
            } else if ((obj instanceof C1337880kv4) && (i = ((C1337880kv4) obj).LIZIZ) != 0) {
                if (i != 1) {
                    if (i != 2) {
                        mVar.setWidthAuto();
                    } else {
                        mVar.setWidthPercent(((C1337880kv4) obj).LIZ);
                    }
                } else {
                    mVar.setWidth(((C1337880kv4) obj).LIZ);
                }
            } else {
                mVar.setWidthAuto();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            mVar.setWidthAuto();
        }
        abstractC21333318eB.LJJLIIIJJIZ();
        if ((!abstractC21333318eB.LL.LIZ.LJJIFFI || abstractC21333318eB.LLILZLL.getOwner() == null || C1325860kbg.LJII()) && !abstractC21333318eB.LJIILL()) {
            ViewGroup.LayoutParams layoutParams = abstractC21333318eB.getView().getLayoutParams();
            if (layoutParams == null) {
                C1325860kbg.LIZIZ(null, AFwS208S0000000_20.get$arr$(79), C2097608Jq.LJ());
                layoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                C786410Ut5.W5(abstractC21333318eB.getView(), layoutParams);
            }
            layoutParams.width = C1337850kv1.LJI(obj, abstractC21333318eB.LL.LJIIJ());
        }
    }

    public static final void LIZIZ(View view, Canvas canvas, Function0<Unit> function0) {
        C1337860kv2 c1337860kv2;
        C1168270gVV.LIZ.getClass();
        if (C1168270gVV.LJI() && (!Intrinsics.LJFF(view.getTag(), Boolean.FALSE))) {
            canvas.clipRect(view.getScrollX(), view.getScrollY(), view.getWidth() + view.getScrollX(), view.getHeight() + view.getScrollY());
        }
        Drawable background = view.getBackground();
        if ((background instanceof C1337860kv2) && (c1337860kv2 = (C1337860kv2) background) != null) {
            C1337870kv3 c1337870kv3 = c1337860kv2.LLIZ;
            if (c1337870kv3 != null && (!C1337860kv2.LLJJI ? !(!c1337870kv3.LJIIIIZZ || !c1337870kv3.LJ || c1337870kv3.LJIIIZ <= 0.0f) : !(!c1337870kv3.LJIIIIZZ || !c1337870kv3.LJ))) {
                c1337870kv3.LIZLLL(view);
                Path pathLIZIZ = c1337870kv3.LIZIZ();
                int iSave = canvas.save();
                canvas.clipPath(pathLIZIZ);
                try {
                    function0.invoke();
                    canvas.restoreToCount(iSave);
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    canvas.restoreToCount(iSave);
                    throw th;
                }
            }
            function0.invoke();
            return;
        }
        function0.invoke();
    }

    public static final void LIZJ(AbstractC21333318eB<?> abstractC21333318eB, Canvas canvas, Function0<Unit> function0) {
        C1168270gVV.LIZ.getClass();
        if (C1168270gVV.LJI() && (!Intrinsics.LJFF(abstractC21333318eB.LLJJJ, "visible"))) {
            canvas.clipRect(abstractC21333318eB.LJJJIL(), abstractC21333318eB.LJJJJ(), abstractC21333318eB.LJJJJI() + abstractC21333318eB.LJJJIL(), abstractC21333318eB.LJJIL() + abstractC21333318eB.LJJJJ());
        }
        C1337860kv2 c1337860kv2 = abstractC21333318eB.LLIZ;
        if (c1337860kv2 == null) {
            function0.invoke();
            return;
        }
        C1337870kv3 c1337870kv3 = c1337860kv2.LLIZ;
        if (c1337870kv3 != null && (!C1337860kv2.LLJJI ? !(!c1337870kv3.LJIIIIZZ || !c1337870kv3.LJ || c1337870kv3.LJIIIZ <= 0.0f) : !(!c1337870kv3.LJIIIIZZ || !c1337870kv3.LJ))) {
            c1337870kv3.LIZJ(abstractC21333318eB.LJJJIL(), abstractC21333318eB.LJJJJ(), abstractC21333318eB.LJJJJI(), abstractC21333318eB.LJJIL());
            Path pathLIZIZ = c1337870kv3.LIZIZ();
            int iSave = canvas.save();
            canvas.clipPath(pathLIZIZ);
            try {
                function0.invoke();
                canvas.restoreToCount(iSave);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                canvas.restoreToCount(iSave);
                throw th;
            }
        }
        function0.invoke();
    }

    public static final boolean LJII(float f, float f2, View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (f < iArr[0] || f2 <= iArr[1] || f > r2 + view.getWidth() || f2 > iArr[1] + view.getHeight()) {
            return false;
        }
        return true;
    }

    public static final void LJIIJ(AbstractC21333318eB<?> abstractC21333318eB, C1168340gVc c1168340gVc, String str) {
        DashPathEffect dashPathEffect;
        C1337860kv2 c1337860kv2LJJI = abstractC21333318eB.LJJI();
        boolean zLJFF = Intrinsics.LJFF(str, "dashed");
        C1337870kv3 c1337870kv3LIZIZ = c1337860kv2LJJI.LIZIZ();
        if (zLJFF) {
            c1337860kv2LJJI.LIZIZ();
            dashPathEffect = new DashPathEffect(new float[]{C1337970kvD.LIZIZ(Double.valueOf(1.5d), c1168340gVc), C1337970kvD.LIZIZ(Double.valueOf(0.5d), c1168340gVc)}, 0.0f);
        } else {
            dashPathEffect = null;
        }
        c1337870kv3LIZIZ.LJIIJJI = dashPathEffect;
        c1337860kv2LJJI.LJI().setPathEffect(c1337870kv3LIZIZ.LJIIJJI);
        if (c1337870kv3LIZIZ.LJIIIZ > 0.0f) {
            c1337860kv2LJJI.invalidateSelf();
        }
    }

    public static final void LJIILJJIL(C1337860kv2 c1337860kv2, String str, C21325918cz c21325918cz) {
        boolean z;
        Bitmap bitmap;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            c1337860kv2.LJIIL(null);
            return;
        }
        WeakReference<Bitmap> weakReference = LIZ.get(str);
        if (weakReference != null && (bitmap = weakReference.get()) != null) {
            c1337860kv2.LJIIL(bitmap);
            return;
        }
        final AwS134S1100000_20 awS134S1100000_20 = new AwS134S1100000_20(c1337860kv2, str, 2);
        InterfaceC1321110kU1 interfaceC1321110kU1LIZLLL = c21325918cz.LIZ.LIZLLL();
        if (interfaceC1321110kU1LIZLLL != null) {
            interfaceC1321110kU1LIZLLL.LIZ(str, c21325918cz.LIZ.LIZ, C0N7L.BACKGROUND_IMAGE, new Pair(-1, -1), c21325918cz.LJIIJ, null, new InterfaceC1338120kvS() { // from class: X.0kvH
                @Override // X.InterfaceC1338120kvS
                public final void onFailure() {
                    awS134S1100000_20.invoke(null);
                }

                @Override // X.InterfaceC1338120kvS
                public final void LIZ(Bitmap bitmap2) {
                    awS134S1100000_20.invoke(bitmap2);
                }
            });
        } else {
            C1325860kbg.LIZIZ(null, AFwS208S0000000_20.get$arr$(77), C21323718cd.LIZ(c21325918cz));
        }
    }

    public static void LJFF(AbstractC21333318eB abstractC21333318eB, InterfaceC1547330qMt interfaceC1547330qMt, View view, Function0 function0) {
        Object obj = abstractC21333318eB.LJJIJIL().get("enable_click_debounce");
        if (obj != null) {
            if (C1337850kv1.LIZ(obj)) {
                int i = abstractC21333318eB.LL.LIZ.LJIIJJI;
                long jCurrentTimeMillis = System.currentTimeMillis();
                C1168400gVi.LIZ(new C1156760gCw(jCurrentTimeMillis, i));
                if (C1156770gCx.LIZ != null && jCurrentTimeMillis - C1156770gCx.LIZIZ < r0.intValue()) {
                    if (C1325860kbg.LJII()) {
                        C786410Ut5.re(Toast.makeText(abstractC21333318eB.LL.LIZ.LIZ, "Myna: Click intercepted, hit anti-riot strike", 0));
                        return;
                    }
                    return;
                }
                C1156770gCx.LIZ = Integer.valueOf(i);
                C1156770gCx.LIZIZ = jCurrentTimeMillis;
            }
        } else {
            abstractC21333318eB.LL.LIZ.getClass();
        }
        C21325918cz c21325918cz = abstractC21333318eB.LL;
        if (view == null) {
            view = abstractC21333318eB.getView();
        }
        Map<String, ? extends Object> mapLIZJ = (Map) function0.invoke();
        if (mapLIZJ == null) {
            mapLIZJ = abstractC21333318eB.LIZJ();
        }
        c21325918cz.LJ(interfaceC1547330qMt, view, mapLIZJ, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIILIIL(X.C1337860kv2 r12, X.C1168340gVc r13, java.util.List<?> r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1337990kvF.LJIILIIL(X.0kv2, X.0gVc, java.util.List, boolean):void");
    }
}
