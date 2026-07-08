package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI;
import com.bytedance.sdui.render.tasm.behavior.ui.utils.BackgroundDrawable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Set;
import kotlin.jvm.internal.AFwS208S0000000_20;
import kotlin.jvm.internal.AwS298S0300000_20;

/* JADX INFO: renamed from: X.0kIK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313860kIK {
    public static final C1313860kIK LIZ = new C1313860kIK();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(85));

    public static Rect LIZJ(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
    }

    public static void LIZIZ(View view, Rect rect, Set set, AwS298S0300000_20 awS298S0300000_20) {
        ViewGroup viewGroup;
        int childCount;
        if (view.getVisibility() == 0 && !set.contains(view)) {
            set.add(view);
            if (view instanceof C1317000kNO) {
                Rect rectLIZJ = LIZJ(view);
                if (Rect.intersects(rect, rectLIZJ) || rect.contains(rectLIZJ)) {
                    awS298S0300000_20.invoke(view, rectLIZJ);
                }
            }
            if ((view instanceof ViewGroup) && (childCount = (viewGroup = (ViewGroup) view).getChildCount()) > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    LIZIZ(viewGroup.getChildAt(i), rect, set, awS298S0300000_20);
                    if (i2 >= childCount) {
                        break;
                    } else {
                        i = i2;
                    }
                }
            }
            Object parent = view.getParent();
            if (parent instanceof ViewGroup) {
                LIZIZ((View) parent, rect, set, awS298S0300000_20);
            }
        }
    }

    public static void LIZ(C1317790kOf c1317790kOf, SDUIBaseUI sDUIBaseUI, int i, int i2, int i3, int i4, int i5, int i6) {
        boolean z;
        int i7;
        if (sDUIBaseUI instanceof AbstractC1313520kHm) {
            if (((AbstractC1313520kHm) sDUIBaseUI).LLLLLILLIL.getVisibility() == 0 && r6.getAlpha() >= 0.05d && r6.getScaleX() >= 0.01d && r6.getScaleY() >= 0.01d) {
                if (sDUIBaseUI.LJIILL().size() > 0) {
                    BackgroundDrawable backgroundDrawable = sDUIBaseUI.LLJ.LIZIZ;
                    if (backgroundDrawable == null) {
                        i7 = 0;
                    } else {
                        C1315480kKw c1315480kKw = new C1315480kKw();
                        C1314460kJI c1314460kJI = new C1314460kJI(backgroundDrawable);
                        synchronized (c1315480kKw) {
                            try {
                                c1314460kJI.LIZ(c1315480kKw);
                                z = c1315480kKw.LIZ;
                                c1315480kKw.LIZ = false;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        i7 = (!z ? 1 : 0) ^ 1;
                    }
                    c1317790kOf.LIZ(i3, i4, i5, i6, i7);
                    int size = sDUIBaseUI.LJIILL().size();
                    if (size > 0) {
                        int i8 = 0;
                        while (true) {
                            int i9 = i8 + 1;
                            SDUIBaseUI sDUIBaseUILJIILJJIL = sDUIBaseUI.LJIILJJIL(i8);
                            if (sDUIBaseUILJIILJJIL != null) {
                                int iLJJI = sDUIBaseUILJIILJJIL.LJJI();
                                int iLJJIJLIJ = sDUIBaseUILJIILJJIL.LJJIJLIJ();
                                if (((C2029107xB) LIZIZ.getValue()).LIZ()) {
                                    iLJJI = sDUIBaseUILJIILJJIL.LJJIII();
                                    iLJJIJLIJ = sDUIBaseUILJIILJJIL.LJJIIJ();
                                }
                                int i10 = i + iLJJI;
                                int iLJJJ = i10 + ((int) sDUIBaseUILJIILJJIL.LJJJ());
                                int i11 = i2 + iLJJIJLIJ;
                                int iLJJJI = i11 + ((int) sDUIBaseUILJIILJJIL.LJJJI());
                                int iLJJJJI = i10 + sDUIBaseUILJIILJJIL.LJJJJI() + ((int) sDUIBaseUILJIILJJIL.LJJJ());
                                int iLJIIZILJ = i11 + sDUIBaseUILJIILJJIL.LJIIZILJ() + ((int) sDUIBaseUILJIILJJIL.LJJJI());
                                if (iLJJJ < i5 && iLJJJI < i6 && iLJJJJI > i3 && iLJIIZILJ > i4 && iLJJJ < iLJJJJI && iLJJJI < iLJIIZILJ) {
                                    LIZ(c1317790kOf, sDUIBaseUILJIILJJIL, iLJJJ, iLJJJI, Math.max(i3, iLJJJ), Math.max(i4, iLJJJI), Math.min(i5, iLJJJJI), Math.min(i6, iLJIIZILJ));
                                }
                            }
                            if (i9 < size) {
                                i8 = i9;
                            } else {
                                return;
                            }
                        }
                    }
                } else {
                    c1317790kOf.LIZ(i3, i4, i5, i6, sDUIBaseUI.LJII());
                }
            }
        }
    }
}
