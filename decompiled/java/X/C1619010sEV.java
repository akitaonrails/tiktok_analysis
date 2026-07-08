package X;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.experiment.InboxBubbleInTabCorner;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0sEV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1619010sEV extends AbstractC1619000sEU {
    public final Activity LLILLL;
    public final int[] LLILZ;
    public final C01GW LLILZIL;
    public final Integer[] LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public ViewGroup LLJ;
    public LinearLayout LLJI;
    public ImageView LLJIJIL;
    public boolean LLJILJIL;
    public final int LLJILJILJ;
    public final StringBuilder LLJILLL;
    public final StringBuilder LLJJ;
    public AnimatorSet LLJJI;
    public final ArrayList<PopupWindow.OnDismissListener> LLJJIII;
    public final View LLJJIJI;
    public final View LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;

    public static final boolean LJJIIJZLJL() {
        C0CXE.LIZ.getClass();
        return C0CXE.LIZ() && C305150Bxh.LIZ();
    }

    public final void LJJIIJ() {
        Activity activity;
        if (this.LLJJI == null || (activity = this.LLILLL) == null || activity.isFinishing() || !isShowing()) {
            return;
        }
        ViewGroup viewGroup = this.LLJ;
        if (viewGroup == null) {
            viewGroup = null;
        }
        viewGroup.clearAnimation();
        AnimatorSet animatorSet = this.LLJJI;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        try {
            dismiss();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJI(e);
        }
    }

    public C1619010sEV(C19EG c19eg) {
        InboxBubbleInTabCorner inboxBubbleInTabCorner;
        super(c19eg);
        this.LLILLL = c19eg;
        int[] iArr = new int[8];
        int i = 0;
        do {
            iArr[i] = 0;
            i++;
        } while (i < 8);
        this.LLILZ = iArr;
        this.LLILZIL = C452501pT.LIZIZ(new C1274304yj());
        int i2 = 7;
        this.LLILZLL = new Integer[]{Integer.valueOf(R.id.osa), Integer.valueOf(R.id.osb), Integer.valueOf(R.id.osc), Integer.valueOf(R.id.osd), Integer.valueOf(R.id.ose), Integer.valueOf(R.id.osf), Integer.valueOf(R.id.osg), Integer.valueOf(R.id.osh)};
        this.LLIZ = C452501pT.LIZIZ(new C1274604ym());
        this.LLIZLLLIL = C452501pT.LIZIZ(new C1619040sEY());
        this.LLJILJIL = true;
        C0CXE.LIZ.getClass();
        if (C0CXE.LIZ() && (inboxBubbleInTabCorner = (InboxBubbleInTabCorner) C1619140sEi.LIZIZ.getValue()) != null) {
            i2 = inboxBubbleInTabCorner.maxBubbleTypes;
        }
        this.LLJILJILJ = Math.min(i2, ((Number) C0ANX.LIZ.getValue()).intValue());
        this.LLJILLL = new StringBuilder();
        this.LLJJ = new StringBuilder();
        this.LLJJIII = new ArrayList<>();
        this.LLJJIJIL = C452501pT.LIZIZ(new C1591310rVp());
        this.LLJJJ = C452501pT.LIZIZ(new C1618980sES(this));
        this.LLJJIJI = C20673215v0.LIZJ(R.layout.aau, this.LLILLL);
        this.LLJJIJIIJIL = C20673215v0.LIZJ(R.layout.aav, this.LLILLL);
        super.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: X.0sEa
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                Iterator<PopupWindow.OnDismissListener> it2 = this.LL.LLJJIII.iterator();
                while (it2.hasNext()) {
                    it2.next().onDismiss();
                }
            }
        });
    }

    @Override // android.widget.PopupWindow
    public final void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        if (onDismissListener != null) {
            this.LLJJIII.add(onDismissListener);
        }
    }

    public final void LJJIIZ(int i, int i2, View view) {
        boolean z;
        boolean z2;
        int i3;
        int i4;
        float f;
        int iLIZJ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        if (i2 >= C12ES.LJIIIIZZ(this.LLILLL) / 2) {
            z = true;
        } else {
            z = false;
        }
        if (i >= C12ES.LJIIJ(this.LLILLL) / 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i5 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("anchorView x = ");
        sbLIZ.append(view.getX());
        sbLIZ.append(",y = ");
        sbLIZ.append(view.getY());
        sbLIZ.append(", anchorView = ");
        sbLIZ.append(view);
        C1720106oR.LJI("MusNewNotificationCountView", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("showAtLocation x = ");
        sbLIZ2.append(i);
        sbLIZ2.append(",y = ");
        sbLIZ2.append(i2);
        sbLIZ2.append(", isTopToAnchor = ");
        sbLIZ2.append(z);
        sbLIZ2.append(", isHorizontalEnd = ");
        sbLIZ2.append(z2);
        C1720106oR.LJI("MusNewNotificationCountView", C2188811AlT.LIZIZ(sbLIZ2));
        LinearLayout linearLayout = this.LLJI;
        if (linearLayout == null) {
            linearLayout = null;
        }
        linearLayout.measure(0, 0);
        ImageView imageView = this.LLJIJIL;
        if (imageView == null) {
            imageView = null;
        }
        LinearLayout linearLayout2 = this.LLJI;
        if (linearLayout2 == null) {
            linearLayout2 = null;
        }
        C426750GoL.LJIIIZ(imageView, null, Integer.valueOf((int) (linearLayout2.getMeasuredHeight() - 0.2f)), null, null, false, 29);
        C1391850mK7.LIZIZ(this, "100001");
        int height = view.getHeight();
        if (z) {
            i3 = i2 - height;
        } else {
            i3 = i2 + height;
        }
        showAtLocation(view, 8388659, i, i3);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJI(this);
        C787990Uvd.LIZ.getClass();
        C994003uc.LIZ();
        ViewGroup viewGroup = this.LLJ;
        if (viewGroup == null) {
            viewGroup = null;
        }
        viewGroup.measure(0, 0);
        ViewGroup viewGroup2 = this.LLJ;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        int measuredWidth = viewGroup2.getMeasuredWidth();
        ViewGroup viewGroup3 = this.LLJ;
        if (viewGroup3 == null) {
            viewGroup3 = null;
        }
        int measuredHeight = viewGroup3.getMeasuredHeight();
        int iLJIIJ = C12ES.LJIIJ(this.LLILLL);
        ImageView imageView2 = this.LLJIJIL;
        if (imageView2 == null) {
            imageView2 = null;
        }
        int measuredWidth2 = imageView2.getMeasuredWidth();
        int measuredWidth3 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        float f2 = measuredWidth;
        float f3 = f2 / 2.0f;
        float f4 = measuredWidth3 / 2.0f;
        float f5 = iArr[0] + f4;
        float fLIZJ = C12ES.LIZJ(6.0f, this.LLILLL);
        if ((((Number) C279590AxZ.LIZ.getValue()).intValue() & 4) == 4) {
            i4 = 0;
        } else {
            i4 = 10;
        }
        if (z2) {
            float f6 = iLJIIJ - fLIZJ;
            if ((measuredWidth / 2) + f5 >= f6) {
                f3 = f2 - (f6 - f5);
            }
        } else if (f5 - (measuredWidth / 2) <= fLIZJ) {
            f3 = f5 - fLIZJ;
        }
        if (measuredWidth > iLJIIJ) {
            f3 = iArr[0] + f4;
            this.LLJILJIL = false;
        }
        if (z) {
            f = measuredHeight;
        } else {
            f = 0.0f;
        }
        ImageView imageView3 = this.LLJIJIL;
        if (imageView3 == null) {
            imageView3 = null;
        }
        ViewGroup.LayoutParams layoutParams = imageView3.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            if (C444960Hcc.LIZIZ()) {
                marginLayoutParams3.rightMargin = (int) ((f2 - f3) - (measuredWidth2 / 2));
            } else {
                marginLayoutParams3.leftMargin = (int) (f3 - (measuredWidth2 / 2.0f));
            }
        }
        if (!z) {
            ImageView imageView4 = this.LLJIJIL;
            if (imageView4 == null) {
                imageView4 = null;
            }
            C786410Ut5.Cb(imageView4, 180.0f);
            ImageView imageView5 = this.LLJIJIL;
            if (imageView5 == null) {
                imageView5 = null;
            }
            ViewGroup.LayoutParams layoutParams2 = imageView5.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams2.topMargin = 0;
            }
            LinearLayout linearLayout3 = this.LLJI;
            if (linearLayout3 == null) {
                linearLayout3 = null;
            }
            ViewGroup.LayoutParams layoutParams3 = linearLayout3.getLayoutParams();
            if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                Activity activity = this.LLILLL;
                ImageView imageView6 = this.LLJIJIL;
                if (imageView6 == null) {
                    imageView6 = null;
                }
                marginLayoutParams.topMargin = (int) C12ES.LIZJ(imageView6.getMeasuredHeight() - 0.2f, activity);
            }
        }
        int iLIZJ2 = (int) C12ES.LIZJ(0.0f, this.LLILLL);
        if (z) {
            iLIZJ = ((iArr[1] - measuredHeight) - iLIZJ2) - i4;
        } else {
            iLIZJ = ((iArr[1] + measuredHeight2) + iLIZJ2) - ((int) C12ES.LIZJ(15.0f, this.LLILLL));
        }
        update((int) (f5 - f3), iLIZJ, measuredWidth, measuredHeight + i4);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("pivotX = ");
        sbLIZ3.append(f3);
        sbLIZ3.append(", pivotY = ");
        sbLIZ3.append(f);
        C1720106oR.LJI("MusNewNotificationCountView", C2188811AlT.LIZIZ(sbLIZ3));
        ViewGroup viewGroup4 = this.LLJ;
        if (viewGroup4 == null) {
            viewGroup4 = null;
        }
        viewGroup4.setPivotX(f3);
        ViewGroup viewGroup5 = this.LLJ;
        if (viewGroup5 == null) {
            viewGroup5 = null;
        }
        viewGroup5.setPivotY(f);
    }
}
