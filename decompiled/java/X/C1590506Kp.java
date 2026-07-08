package X;

import Y.AAListenerS315S0100000_2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: renamed from: X.06Kp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1590506Kp extends LinearLayout implements InterfaceC1296230jpt, InterfaceC1292040jj8<Throwable> {
    public final TuxIconView LL;
    public final TuxTextView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final C1295960jpS LLILZ;
    public EnumC1578706Gb LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;

    public C1590506Kp(Context context) {
        super(context, null, 0);
        AAListenerS315S0100000_2 aAListenerS315S0100000_2 = new AAListenerS315S0100000_2(this, 5);
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        this.LL = tuxIconView;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        this.LLILLJJLI = tuxTextView;
        TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
        this.LLILLL = tuxTextView2;
        C1295960jpS c1295960jpS = new C1295960jpS(context);
        c1295960jpS.addAnimatorListener(aAListenerS315S0100000_2);
        c1295960jpS.setFailureListener(this);
        c1295960jpS.addLottieOnCompositionLoadedListener(this);
        this.LLILZ = c1295960jpS;
        this.LLILZIL = EnumC1578706Gb.GONE;
        this.LLJ = true;
        this.LLJI = true;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(tuxIconView, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        frameLayout.addView(c1295960jpS, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 16;
        addView(frameLayout, layoutParams3);
        tuxTextView.setMaxLines(1);
        tuxTextView2.setMaxLines(1);
        tuxTextView.setGravity(17);
        tuxTextView2.setGravity(17);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.addView(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
        frameLayout2.addView(tuxTextView2, new LinearLayout.LayoutParams(-2, -2));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 16;
        addView(frameLayout2, layoutParams4);
        LJFF(this.LLIZLLLIL, this.LLJ);
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
    }

    @Override // X.InterfaceC1296230jpt
    public final void LIZ(C1294720jnS c1294720jnS) {
        C786410Ut5.LLD(0, this.LLILZ);
        C786410Ut5.LLLLLLZZ(this.LL, 8);
    }

    public final void LIZJ(int i) {
        String str;
        int iIntValue;
        Pair<Integer, Uri> pairLJ;
        Uri second;
        String strLJII;
        int iIntValue2 = 0;
        C786410Ut5.LLLLLLZZ(this.LL, 0);
        C786410Ut5.LLD(8, this.LLILZ);
        EnumC1578706Gb enumC1578706Gb = this.LLILZIL;
        if (C1603906Pt.LIZIZ().enableTuxSmallIcon) {
            this.LL.setImageDrawable(C06GU.LIZ.LIZJ().LIZ(i, enumC1578706Gb));
            return;
        }
        C1578606Ga c1578606GaLIZJ = C06GU.LIZ.LIZJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("streak_icon_");
        String str2 = "";
        if (enumC1578706Gb == EnumC1578706Gb.ORANGE) {
            str = "active";
        } else if (enumC1578706Gb != EnumC1578706Gb.GREY) {
            str = "";
        } else {
            str = "grey";
        }
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Pair<Integer, Uri> pairLJ2 = c1578606GaLIZJ.LIZ.LIZ.LJ(i, enumC1578706Gb);
        int i2 = 1;
        if (pairLJ2.getFirst().intValue() == 0) {
            AnonymousClass0664 anonymousClass0664 = c1578606GaLIZJ.LIZIZ;
            String strLJII2 = c1578606GaLIZJ.LIZ.LIZ.LJII();
            Integer num = c1578606GaLIZJ.LIZ.LIZJ;
            if (num != null) {
                iIntValue2 = num.intValue();
            }
            AnonymousClass0664.LIZIZ(anonymousClass0664, strLJII2, i, strLIZIZ, iIntValue2);
            second = pairLJ2.getSecond();
        } else {
            C06GZ c06gz = c1578606GaLIZJ.LIZ.LIZIZ;
            if (c06gz != null && (pairLJ = c06gz.LJ(i, enumC1578706Gb)) != null && pairLJ.getFirst().intValue() == 0) {
                AnonymousClass0664 anonymousClass06642 = c1578606GaLIZJ.LIZIZ;
                C06GZ c06gz2 = c1578606GaLIZJ.LIZ.LIZIZ;
                if (c06gz2 != null && (strLJII = c06gz2.LJII()) != null) {
                    str2 = strLJII;
                }
                AnonymousClass0664.LIZIZ(anonymousClass06642, str2, i, strLIZIZ, pairLJ2.getFirst().intValue());
                second = pairLJ.getSecond();
            } else {
                AnonymousClass0664 anonymousClass06643 = c1578606GaLIZJ.LIZIZ;
                Integer num2 = c1578606GaLIZJ.LIZ.LIZJ;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = pairLJ2.getFirst().intValue();
                }
                AnonymousClass0664.LIZIZ(anonymousClass06643, "fail", i, strLIZIZ, iIntValue);
                C1577606Fq.LIZIZ.getClass();
                C1577606Fq.LIZIZ(2, enumC1578706Gb);
            }
        }
        if (second != null) {
            this.LL.setImageURI(second);
            if (this.LL.getDrawable() == null) {
                i2 = 3;
            }
            C1577606Fq.LIZIZ.getClass();
            C1577606Fq.LIZIZ(i2, enumC1578706Gb);
            return;
        }
        C1577606Fq.LIZIZ.getClass();
        C1577606Fq.LIZIZ(2, enumC1578706Gb);
    }

    public final void LIZLLL(int i) {
        int i2 = this.LLILZLL;
        C786410Ut5.LLLLZLL(this.LLILLJJLI, 0);
        C786410Ut5.LLLLZLL(this.LLILLL, 8);
        C786410Ut5.wd(this.LLILLJJLI, 0.0f);
        int i3 = C1579106Gf.LIZ[this.LLILZIL.ordinal()];
        if (i3 == 1 || i3 == 2) {
            this.LLILLJJLI.setText(String.valueOf(i2));
        }
        this.LLILLJJLI.setTextColor(LIZIZ(i, this.LLILZIL));
        this.LLILLJJLI.requestLayout();
    }

    @Override // X.InterfaceC1292040jj8
    public final void onResult(Throwable th) {
        LIZJ(this.LLIZ);
    }

    public final int LIZIZ(int i, EnumC1578706Gb enumC1578706Gb) {
        Context context;
        if (this.LLJIJIL) {
            if (enumC1578706Gb == EnumC1578706Gb.GREY) {
                return C1383370m6R.LJFF(R.attr.zk);
            }
            Context context2 = getContext();
            Configuration configuration = new Configuration(context2.getResources().getConfiguration());
            configuration.uiMode = (configuration.uiMode & (-49)) | 32;
            C1361400lX0 c1361400lX0 = new C1361400lX0(context2, context2.getTheme());
            c1361400lX0.LIZ(configuration);
            context = c1361400lX0;
        } else {
            context = getContext();
        }
        return C06GU.LIZ.LIZJ().LIZJ(i, enumC1578706Gb, context);
    }

    public final void LJFF(boolean z, boolean z2) {
        int i;
        int i2;
        ViewGroup.LayoutParams layoutParams = null;
        if (z) {
            TuxTextView tuxTextView = this.LLILLJJLI;
            if (z2) {
                i2 = 82;
            } else {
                i2 = 81;
            }
            tuxTextView.setTuxFont(i2);
            this.LLILLL.setTuxFont(82);
            C1295960jpS c1295960jpS = this.LLILZ;
            ViewGroup.LayoutParams layoutParams2 = c1295960jpS.getLayoutParams();
            layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13));
            layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13));
            C786410Ut5.s6(c1295960jpS, layoutParams2);
            TuxIconView tuxIconView = this.LL;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
            tuxIconView.setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
            TuxIconView tuxIconView2 = this.LL;
            ViewGroup.LayoutParams layoutParams3 = tuxIconView2.getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13));
                layoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13));
                layoutParams = layoutParams3;
            }
            C786410Ut5.M6(tuxIconView2, layoutParams);
            return;
        }
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        if (z2) {
            i = 42;
        } else {
            i = 41;
        }
        tuxTextView2.setTuxFont(i);
        this.LLILLL.setTuxFont(42);
        C1295960jpS c1295960jpS2 = this.LLILZ;
        ViewGroup.LayoutParams layoutParams4 = c1295960jpS2.getLayoutParams();
        if (layoutParams4 != null) {
            layoutParams4.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(18.8d)));
            layoutParams4.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(18.8d)));
        } else {
            layoutParams4 = null;
        }
        C786410Ut5.s6(c1295960jpS2, layoutParams4);
        TuxIconView tuxIconView3 = this.LL;
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.8d)));
        tuxIconView3.setPadding(iLIZIZ2, iLIZIZ2, iLIZIZ2, iLIZIZ2);
        TuxIconView tuxIconView4 = this.LL;
        ViewGroup.LayoutParams layoutParams5 = tuxIconView4.getLayoutParams();
        if (layoutParams5 != null) {
            layoutParams5.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(18.8d)));
            layoutParams5.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(18.8d)));
            layoutParams = layoutParams5;
        }
        C786410Ut5.M6(tuxIconView4, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e6 A[PHI: r8
      0x00e6: PHI (r8v2 boolean) = (r8v1 boolean), (r8v4 boolean), (r8v4 boolean), (r8v4 boolean) binds: [B:65:0x00e3, B:54:0x009b, B:56:0x009f, B:58:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJ(final X.C1590506Kp r9, X.EnumC1578706Gb r10, final int r11, int r12, boolean r13, boolean r14, boolean r15, boolean r16, int r17) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1590506Kp.LJ(X.06Kp, X.06Gb, int, int, boolean, boolean, boolean, boolean, int):boolean");
    }
}
