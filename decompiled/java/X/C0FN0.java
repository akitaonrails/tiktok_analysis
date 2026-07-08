package X;

import Y.ACListenerS109S0200000_5;
import android.content.Context;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0FN0, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FN0 implements InterfaceC1340660kzY, InterfaceC1391650mJn {
    public final Context LIZ;
    public List<C0FN1> LIZIZ;
    public final C0FN2 LIZJ;
    public final EnumC1235690iGF LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final LinearLayout LJI;
    public C0P0T LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;

    public C0FN0() {
        throw null;
    }

    public final void LIZIZ() {
        C0P0T c0p0t = this.LJII;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
    }

    public final boolean LIZLLL() {
        C0P0T c0p0t = this.LJII;
        if (c0p0t != null) {
            return c0p0t.isShowing();
        }
        return false;
    }

    @Override // X.InterfaceC1391650mJn
    public final void onShow() {
        this.LIZJ.onShow();
    }

    @Override // X.InterfaceC1340660kzY
    public final void LIZ(AbstractC1391670mJp abstractC1391670mJp) {
        if (this.LJIIIIZZ) {
            this.LJIIIIZZ = false;
        } else {
            this.LIZJ.onCancel();
        }
    }

    public final void LIZJ(List<C0FN1> list) {
        boolean z;
        LinearLayout linearLayout;
        String string;
        this.LIZIZ = list;
        int i = 0;
        for (C0FN1 c0fn1 : list) {
            i++;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, this.LJFF);
            LinearLayout linearLayout2 = new LinearLayout(this.LIZ);
            C786410Ut5.d6(linearLayout2, layoutParams);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(16);
            linearLayout2.setMinimumWidth((int) C11VU.LIZIZ(156.0f, linearLayout2.getContext()));
            if (c0fn1.LJII) {
                C786410Ut5.W4(linearLayout2, 1.0f);
            } else {
                C786410Ut5.W4(linearLayout2, 0.4f);
            }
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.setMarginStart((int) c0fn1.LJIIIZ.getFirst().floatValue());
            layoutParams2.setMarginEnd((int) c0fn1.LJIIIZ.getSecond().floatValue());
            TuxTextView tuxTextView = new TuxTextView(this.LIZ, null, 6, 0);
            tuxTextView.setTextColorRes(c0fn1.LIZJ);
            tuxTextView.setTuxFont(42);
            tuxTextView.setMinimumWidth((int) C11VU.LIZIZ(104.0f, tuxTextView.getContext()));
            tuxTextView.setMaxWidth((int) C11VU.LIZIZ(198.0f, tuxTextView.getContext()));
            tuxTextView.setMaxLines(1);
            tuxTextView.setGravity(16);
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            tuxTextView.setText(tuxTextView.getContext().getString(c0fn1.LIZIZ));
            Context context = tuxTextView.getContext();
            if (c0fn1.LJIIIIZZ) {
                if (LJ(context, tuxTextView)) {
                    tuxTextView.setTuxFont(62);
                }
            } else {
                tuxTextView.measure((int) C11VU.LIZIZ(198.0f, context), View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE));
                tuxTextView.layout(0, 0, tuxTextView.getMeasuredWidth(), tuxTextView.getMeasuredHeight());
                Layout layout = tuxTextView.getLayout();
                if (layout != null && layout.getEllipsisCount(tuxTextView.getLineCount() - 1) > 0) {
                    tuxTextView.setTuxFont(62);
                }
            }
            C786410Ut5.R6(tuxTextView, layoutParams2);
            if (c0fn1.LJIIIIZZ) {
                if (LJ(this.LIZ, tuxTextView)) {
                    string = this.LIZ.getString(c0fn1.LIZIZ);
                    float fLIZIZ = C11VU.LIZIZ(172.0f, this.LIZ);
                    int length = string.length();
                    while (true) {
                        length--;
                        if (length <= 0) {
                            break;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(string.substring(0, length));
                        sbLIZ.append("...");
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        tuxTextView.setText(strLIZIZ);
                        tuxTextView.measure(0, 0);
                        if (tuxTextView.getMeasuredWidth() <= fLIZIZ) {
                            string = strLIZIZ;
                            break;
                        }
                    }
                } else {
                    string = this.LIZ.getString(c0fn1.LIZIZ);
                }
                C419910GdJ c419910GdJ = new C419910GdJ();
                int i2 = c0fn1.LJIIJ;
                if (i2 <= 0) {
                    i2 = R.raw.icon_arrow_up_right_in_rec_ltr;
                }
                c419910GdJ.LIZ = i2;
                Integer numValueOf = c0fn1.LJIIJJI;
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(R.attr.eg);
                }
                c419910GdJ.LJ = numValueOf;
                Context context2 = this.LIZ;
                float f = c0fn1.LJIIL;
                if (f <= 0.0f) {
                    f = 14.0f;
                }
                c419910GdJ.LIZJ = (int) C11VU.LIZIZ(f, context2);
                c419910GdJ.LIZIZ = (int) C11VU.LIZIZ(14.0f, this.LIZ);
                C419890GdH c419890GdHLIZIZ = c419910GdJ.LIZIZ(2, this.LIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(string);
                sbLIZ2.append('$');
                SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ2));
                if (a0.LJJIIZI(string, "...", false)) {
                    c419890GdHLIZIZ.LIZIZ(0, 0, C11VU.LJFF(this.LIZ));
                } else {
                    c419890GdHLIZIZ.LIZIZ((int) C11VU.LIZIZ(4.0f, this.LIZ), 0, C11VU.LJFF(this.LIZ));
                }
                C786410Ut5.p2(spannableString, c419890GdHLIZIZ, spannableString.length() - 1, spannableString.length(), 33);
                tuxTextView.setText(spannableString);
            }
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) C11VU.LIZIZ(20.0f, this.LIZ), (int) C11VU.LIZIZ(20.0f, this.LIZ));
            if (C11VU.LJFF(this.LIZ)) {
                layoutParams3.setMarginEnd((int) C11VU.LIZIZ(12.0f, this.LIZ));
            } else {
                layoutParams3.setMarginStart((int) C11VU.LIZIZ(12.0f, this.LIZ));
            }
            if (c0fn1.LIZ > 0) {
                TuxIconView tuxIconView = new TuxIconView(this.LIZ, null, 0, 6, null);
                tuxIconView.setIconRes(c0fn1.LIZ);
                Integer num = c0fn1.LIZLLL;
                if (num != null) {
                    tuxIconView.setTintColorRes(num.intValue());
                }
                C786410Ut5.M6(tuxIconView, layoutParams3);
                tuxIconView.setLayoutDirection(0);
                linearLayout2.addView(tuxIconView, 0);
                z = true;
                linearLayout2.addView(tuxTextView, 1);
            } else {
                z = true;
                linearLayout2.addView(tuxTextView);
            }
            linearLayout2.setClickable(z);
            C786410Ut5.R7(linearLayout2, new ACListenerS109S0200000_5(c0fn1, this, 24));
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, (int) C11VU.LIZIZ(0.5f, this.LIZ));
            View view = new View(this.LIZ);
            C786410Ut5.W5(view, layoutParams4);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zj, this.LIZ);
            if (numLIZJ != null) {
                view.setBackgroundColor(numLIZJ.intValue());
            }
            LinearLayout linearLayout3 = this.LJI;
            if (linearLayout3 != null) {
                linearLayout3.addView(linearLayout2);
            }
            if (i != list.size() && (linearLayout = this.LJI) != null) {
                linearLayout.addView(view);
            }
        }
    }

    public final void LJFF(View view) {
        ViewParent parent;
        ViewGroup viewGroup;
        if (LIZLLL()) {
            return;
        }
        LinearLayout linearLayout = this.LJI;
        if (linearLayout != null && (parent = linearLayout.getParent()) != null && (parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(this.LJI, viewGroup);
        }
        int iLIZ = C960203pA.LIZ(R.attr.e7, this.LIZ);
        C1391550mJd c1391550mJd = new C1391550mJd(this.LIZ);
        c1391550mJd.LLILLJJLI.LIZIZ = view;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        C1391600mJi c1391600mJi = c1391550mJd.LLILLJJLI;
        c1391600mJi.LJIIIIZZ = iLIZIZ;
        c1391600mJi.LJIIZILJ = this.LJI;
        c1391600mJi.LJIIL = false;
        c1391600mJi.LJIIJ = 200L;
        c1391550mJd.LJI(iLIZ);
        c1391550mJd.LJIIIZ(true, null);
        EnumC1235690iGF enumC1235690iGF = this.LIZLLL;
        C1391600mJi c1391600mJi2 = c1391550mJd.LLILLJJLI;
        c1391600mJi2.LIZLLL = enumC1235690iGF;
        c1391600mJi2.LJII = -1001L;
        c1391600mJi2.LJFF = this.LJ;
        C0P0T c0p0tLIZIZ = c1391550mJd.LIZIZ();
        this.LJII = c0p0tLIZIZ;
        c0p0tLIZIZ.LJIJ(this);
        C0P0T c0p0t = this.LJII;
        if (c0p0t != null) {
            c0p0t.LJIIIZ(this);
        }
        C0P0T c0p0t2 = this.LJII;
        if (c0p0t2 != null) {
            c0p0t2.show();
        }
    }

    public final void LJI(List<C0FN1> list) {
        if (this.LIZIZ.containsAll(list) && list.containsAll(this.LIZIZ)) {
            return;
        }
        LinearLayout linearLayout = this.LJI;
        if (linearLayout != null) {
            C786410Ut5.LJJJJJL(linearLayout);
        }
        LIZJ(list);
    }

    public static boolean LJ(Context context, TuxTextView tuxTextView) {
        tuxTextView.measure((int) C11VU.LIZIZ(180.0f, context), View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE));
        tuxTextView.layout(0, 0, tuxTextView.getMeasuredWidth(), tuxTextView.getMeasuredHeight());
        Layout layout = tuxTextView.getLayout();
        if (layout == null || layout.getEllipsisCount(tuxTextView.getLineCount() - 1) <= 0) {
            return false;
        }
        return true;
    }

    public C0FN0(Context context, List list, C0FN2 c0fn2) {
        EnumC1235690iGF enumC1235690iGF = EnumC1235690iGF.TOP;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
        this.LIZ = context;
        this.LIZIZ = list;
        this.LIZJ = c0fn2;
        this.LIZLLL = enumC1235690iGF;
        this.LJ = 0;
        this.LJFF = iLIZIZ;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(context);
        C786410Ut5.d6(linearLayout, layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setMinimumWidth((int) C11VU.LIZIZ(156.0f, context));
        linearLayout.setGravity(16);
        this.LJI = linearLayout;
        LIZJ(this.LIZIZ);
    }
}
