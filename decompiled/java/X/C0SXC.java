package X;

import Y.ARunnableS16S1200000_11;
import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS160S1100000_11;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0SXC, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SXC {
    public static final C0SXC LIZ = new C0SXC();
    public static final int LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(469));
    public static final BPEAHandler LIZLLL = new BPEAHandler(Looper.getMainLooper());
    public static final C0SX2 LJ = C0SX2.LL;
    public static C0P0T LJFF;
    public static WeakReference<TextView> LJI;
    public static C0SXD LJII;
    public static boolean LJIIIIZZ;

    public static void LIZ() {
        LIZLLL.removeCallbacks(LJ);
        LJI();
        C0P0T c0p0t = LJFF;
        LJFF = null;
        LJI = null;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
    }

    public static void LJI() {
        TextView textView;
        C0SXD c0sxd = LJII;
        if (c0sxd == null) {
            return;
        }
        LJII = null;
        WeakReference<TextView> weakReference = LJI;
        if (weakReference == null || (textView = weakReference.get()) == null || !textView.getViewTreeObserver().isAlive()) {
            return;
        }
        C786410Ut5.D3(textView.getViewTreeObserver(), c0sxd);
    }

    public static Rect LIZJ(TextView textView) {
        Layout layout = textView.getLayout();
        if (layout == null || layout.getLineCount() <= 0) {
            return null;
        }
        int[] iArr = new int[2];
        textView.getLocationOnScreen(iArr);
        return new Rect((iArr[0] + textView.getTotalPaddingLeft()) - textView.getScrollX(), ((iArr[1] + textView.getTotalPaddingTop()) + layout.getLineTop(0)) - textView.getScrollY(), ((iArr[0] + textView.getWidth()) - textView.getTotalPaddingRight()) - textView.getScrollX(), ((iArr[1] + textView.getTotalPaddingTop()) + layout.getLineBottom(layout.getLineCount() - 1)) - textView.getScrollY());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Rect LIZLLL(TextView textView) {
        Rect rect = new Rect();
        if (!textView.getGlobalVisibleRect(rect)) {
            return null;
        }
        ViewParent parent = textView.getParent();
        while (true) {
            if (parent == 0) {
                break;
            }
            if (parent instanceof RecyclerView) {
                Rect rect2 = new Rect();
                if (((View) parent).getGlobalVisibleRect(rect2)) {
                    rect.intersect(rect2);
                }
            } else {
                parent = parent.getParent();
            }
        }
        return rect;
    }

    public static boolean LJ(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        String strReplace = new Regex("@\\S+").replace(String.valueOf(charSequence), "");
        for (int i = 0; i < strReplace.length(); i++) {
            if (Character.isLetterOrDigit(strReplace.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJFF(TextView textView) {
        Rect rectLIZJ;
        Rect rectLIZLLL;
        if (textView == null || (rectLIZJ = LIZJ(textView)) == null || (rectLIZLLL = LIZLLL(textView)) == null || rectLIZJ.top < rectLIZLLL.top || rectLIZJ.bottom > rectLIZLLL.bottom) {
            return false;
        }
        return true;
    }

    public static void LJIIIZ(TextView textView) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        C1391720mJu c1391720mJu;
        boolean z;
        int measuredWidth;
        int measuredHeight;
        int measuredWidth2;
        boolean zLJFF;
        EnumC1235690iGF enumC1235690iGF;
        C0SXE c0sxeLIZIZ;
        int paddingLeft;
        int i;
        int iLIZIZ;
        int measuredWidth3;
        int i2;
        TextView textView2;
        C0P0T c0p0t = LJFF;
        if (c0p0t == null || (viewGroup = c0p0t.LJIILL().LIZJ) == null || (viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.ex3)) == null || (c1391720mJu = (C1391720mJu) viewGroup2.findViewById(R.id.cxs)) == null) {
            return;
        }
        Integer numValueOf = Integer.valueOf(viewGroup2.getWidth());
        if (numValueOf.intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            measuredWidth = numValueOf.intValue();
        } else {
            measuredWidth = viewGroup2.getMeasuredWidth();
        }
        Integer numValueOf2 = Integer.valueOf(viewGroup2.getHeight());
        if (numValueOf2.intValue() > 0) {
            measuredHeight = numValueOf2.intValue();
        } else {
            measuredHeight = viewGroup2.getMeasuredHeight();
        }
        Integer numValueOf3 = Integer.valueOf(c1391720mJu.getWidth());
        if (numValueOf3.intValue() > 0) {
            measuredWidth2 = numValueOf3.intValue();
        } else {
            measuredWidth2 = c1391720mJu.getMeasuredWidth();
        }
        if (measuredWidth > 0 && measuredHeight > 0 && measuredWidth2 > 0) {
            TextView textView3 = (TextView) textView.getRootView().findViewById(R.id.rkk);
            if (textView3 != null && textView3.isShown() && textView3.isShown()) {
                zLJFF = LJFF(textView3);
            } else {
                zLJFF = LJFF(textView);
            }
            if (zLJFF) {
                enumC1235690iGF = EnumC1235690iGF.BOTTOM;
            } else {
                enumC1235690iGF = EnumC1235690iGF.TOP;
            }
            if (c0p0t.LJIILL().LIZLLL != enumC1235690iGF) {
                c0p0t.LJIILL().LIZLLL = enumC1235690iGF;
                c0p0t.LJ();
            }
            if ((enumC1235690iGF == EnumC1235690iGF.TOP && (textView2 = (TextView) textView.getRootView().findViewById(R.id.rli)) != null && textView2.isShown() && (c0sxeLIZIZ = LIZIZ(viewGroup, textView2)) != null) || (c0sxeLIZIZ = LIZIZ(viewGroup, textView)) != null) {
                Integer numValueOf4 = Integer.valueOf(c1391720mJu.getLeft());
                if (numValueOf4.intValue() > 0) {
                    paddingLeft = numValueOf4.intValue();
                } else {
                    paddingLeft = viewGroup2.getPaddingLeft();
                }
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                int width = (viewGroup.getWidth() - measuredWidth2) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                if (width < iLIZIZ2) {
                    width = iLIZIZ2;
                }
                if (textView.getLayoutDirection() == 1) {
                    i = c0sxeLIZIZ.LIZIZ - measuredWidth2;
                } else {
                    i = c0sxeLIZIZ.LIZ;
                }
                int iLJ = C13LZ.LJ(i, iLIZIZ2, width) - paddingLeft;
                int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                int height = (viewGroup.getHeight() - measuredHeight) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                if (height < iLIZIZ3) {
                    height = iLIZIZ3;
                }
                if (enumC1235690iGF == EnumC1235690iGF.BOTTOM) {
                    iLIZIZ = c0sxeLIZIZ.LIZLLL + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                } else {
                    iLIZIZ = (c0sxeLIZIZ.LJ - measuredHeight) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                }
                int iLJ2 = C13LZ.LJ(iLIZIZ, iLIZIZ3, height);
                C786410Ut5.Ed(iLJ, viewGroup2);
                C786410Ut5.Kd(iLJ2, viewGroup2);
                Integer numValueOf5 = Integer.valueOf(c1391720mJu.getWidth());
                if (numValueOf5.intValue() > 0) {
                    measuredWidth3 = numValueOf5.intValue();
                } else {
                    measuredWidth3 = c1391720mJu.getMeasuredWidth();
                }
                if (measuredWidth3 > 0) {
                    if (textView.getLayoutDirection() == 1) {
                        i2 = measuredWidth3 - LIZIZ;
                    } else {
                        i2 = LIZIZ;
                    }
                    c1391720mJu.setAx(i2);
                }
            }
        }
    }

    public static C0SXE LIZIZ(ViewGroup viewGroup, TextView textView) {
        Rect rectLIZLLL;
        Rect rectLIZJ = LIZJ(textView);
        if (rectLIZJ == null || (rectLIZLLL = LIZLLL(textView)) == null) {
            return null;
        }
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int i = rectLIZJ.left;
        int i2 = iArr[0];
        int i3 = i - i2;
        int i4 = rectLIZJ.right - i2;
        int i5 = rectLIZJ.top;
        int i6 = iArr[1];
        return new C0SXE(i3, i4, i5 - i6, rectLIZJ.bottom - i6, Math.max(i5, rectLIZLLL.top) - iArr[1]);
    }

    public static void LJII(TextView textView, EnumC1235690iGF enumC1235690iGF, String str) {
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        ViewGroup viewGroup = (ViewGroup) textView.getRootView().findViewById(android.R.id.content);
        if (viewGroup == null) {
            View rootView = textView.getRootView();
            if (!(rootView instanceof ViewGroup) || (viewGroup = (ViewGroup) rootView) == null) {
                return;
            }
        }
        LJI = new WeakReference<>(textView);
        C450720Hlu c450720Hlu = new C450720Hlu(context);
        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
        c1391600mJi.LIZJ = viewGroup;
        c1391600mJi.LIZIZ = textView;
        c1391600mJi.LIZLLL = enumC1235690iGF;
        c450720Hlu.LJIIJ(2131821460);
        c450720Hlu.LJII(R.attr.f509o0);
        c450720Hlu.LLILLJJLI.LJII = -1001L;
        c450720Hlu.LJ(new AwS160S1100000_11(textView, str, 11));
        C0P0T c0p0tLIZIZ = c450720Hlu.LIZIZ();
        LJFF = c0p0tLIZIZ;
        c0p0tLIZIZ.show();
    }

    public static Pair LJIIIIZZ(AppCompatTextView appCompatTextView, boolean z, String str) {
        String curUserId;
        if (!z) {
            return null;
        }
        try {
            curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            curUserId = "default";
        }
        Keva keva = (Keva) LIZJ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("has_shown_onboarding_");
        sbLIZ.append(curUserId);
        if (keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false) || LJFF != null || LJIIIIZZ) {
            return null;
        }
        LJIIIIZZ = true;
        ARunnableS16S1200000_11 aRunnableS16S1200000_11 = new ARunnableS16S1200000_11(appCompatTextView, str, appCompatTextView, 11);
        HandlerHook.viewPostDelay(appCompatTextView, aRunnableS16S1200000_11, 1500L);
        return new Pair(appCompatTextView, aRunnableS16S1200000_11);
    }
}
