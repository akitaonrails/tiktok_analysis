package X;

import Y.ACListenerS151S0100000_16;
import Y.ATListenerS449S0100000_16;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0d7R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1038030d7R extends FrameLayout {
    public final AbstractC1038140d7c LL;
    public final Boolean LLILLJJLI;
    public final int LLILLL;
    public TuxNavBar LLILZ;
    public final String LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public Boolean LLJ;
    public String LLJI;
    public TuxNavBar LLJIJIL;
    public final C1250250idj LLJILJIL;

    public final void LIZ() {
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        TuxNavBar tuxNavBar = this.LLJIJIL;
        if (tuxNavBar != null && (tuxTextView2 = (TuxTextView) tuxNavBar.findViewById(getTiktokViewId())) != null) {
            tuxTextView2.setTextColor(R.attr.a1k);
            if (C04VO.LIZ()) {
                tuxTextView2.setTuxFont(82);
            }
        }
        TuxNavBar tuxNavBar2 = this.LLJIJIL;
        if (tuxNavBar2 == null || (tuxTextView = (TuxTextView) tuxNavBar2.findViewById(getDomainViewId())) == null) {
            return;
        }
        tuxTextView.setTextColor(LIZLLL(tuxTextView));
        if (C04VO.LIZ()) {
            tuxTextView.setTuxFont(52);
        }
    }

    public final TuxNavBar getNavBarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.p15);
            this.LLILZ = (TuxNavBar) callbackFindViewById;
        }
        return (TuxNavBar) callbackFindViewById;
    }

    private final int getDomainViewId() {
        return C04VO.LIZ() ? R.id.p1i : R.id.p28;
    }

    public final Integer LJ() {
        Object c098200Yq;
        try {
            c098200Yq = C1308910kAL.LIZJ(R.attr.a1b, getContext());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (Integer) c098200Yq;
    }

    public final int getTiktokViewId() {
        return C04VO.LIZ() ? R.id.p28 : R.id.p1i;
    }

    public final TuxNavBar getNavBar() {
        return this.LLJIJIL;
    }

    @Override // android.view.View
    public final String getTag() {
        return this.LLILZIL;
    }

    public final void LIZIZ(int i) {
        TuxNavBar navBarFromXml = getNavBarFromXml();
        if (navBarFromXml != null) {
            navBarFromXml.setNavBackground(i);
        }
        TuxNavBar navBarFromXml2 = getNavBarFromXml();
        if (navBarFromXml2 != null) {
            navBarFromXml2.setBackgroundColor(i);
        }
        TuxNavBar tuxNavBar = this.LLJIJIL;
        if (tuxNavBar != null) {
            tuxNavBar.setNavBackground(i);
        }
        TuxNavBar tuxNavBar2 = this.LLJIJIL;
        if (tuxNavBar2 != null) {
            tuxNavBar2.setBackgroundColor(i);
        }
    }

    public final void LIZJ(TuxTextView tuxTextView) {
        C786410Ut5.x3(tuxTextView.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1077380e8u(tuxTextView, new C118300cf(), this, 1));
    }

    public final int LIZLLL(TuxTextView tuxTextView) {
        int i;
        Integer numValueOf;
        if (C04VO.LIZ()) {
            i = R.attr.a1h;
        } else {
            i = R.attr.a1k;
        }
        Integer numLJFF = LJFF(i);
        if (numLJFF != null) {
            return numLJFF.intValue();
        }
        if (tuxTextView != null && (numValueOf = Integer.valueOf(tuxTextView.getCurrentTextColor())) != null) {
            return numValueOf.intValue();
        }
        return -16777216;
    }

    public final Integer LJFF(int i) {
        Object c098200Yq;
        int i2;
        Object c098200Yq2;
        Object c098200Yq3;
        Boolean bool = this.LLJ;
        Object obj = null;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            Context context = getContext();
            if (!zBooleanValue) {
                i2 = R.style.y0;
            } else {
                i2 = R.style.y3;
            }
            try {
                c098200Yq2 = C1308910kAL.LIZJ(i, new ContextThemeWrapper(context, i2));
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq2 = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = null;
            }
            Integer num = (Integer) c098200Yq2;
            if (num == null) {
                try {
                    c098200Yq3 = C1308910kAL.LIZJ(i, getContext());
                    C189200o6.m2constructorimpl(c098200Yq3);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq3 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq3);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq3)) {
                    obj = c098200Yq3;
                }
                return (Integer) obj;
            }
            return num;
        }
        try {
            c098200Yq = C1308910kAL.LIZJ(i, getContext());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (Integer) obj;
    }

    public final C1250250idj LJI(CharSequence charSequence) {
        if (C04VO.LIZ()) {
            C1250250idj c1250250idj = this.LLJILJIL;
            c1250250idj.LIZLLL = charSequence;
            return c1250250idj;
        }
        C1250250idj c1250250idj2 = this.LLJILJIL;
        c1250250idj2.LIZJ = charSequence;
        return c1250250idj2;
    }

    public final void LJII(EnumC1038130d7b enumC1038130d7b) {
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        if (!this.LLIZ || this.LLIZLLLIL) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C770750ULh c770750ULh = new C770750ULh();
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.wt;
        c770750ULh.LIZ = c0hti.LIZ(getContext());
        c770750ULh.LIZLLL = 2;
        c770750ULh.LJ = "This website's connection\nis secure";
        c770750ULh.LIZJ("Any information you share with this website,\nsuch as passwords or credit card numbers,\nwill be sent securely.");
        c770750ULh.LJIILLIIL = true;
        C1390920mIc c1390920mIcLIZIZ = c770750ULh.LIZIZ();
        DialogInterfaceOnCancelListenerC1077290e8l dialogInterfaceOnCancelListenerC1077290e8l = new DialogInterfaceOnCancelListenerC1077290e8l(this, 0);
        TuxSheet tuxSheet = c1390920mIcLIZIZ.LIZ;
        tuxSheet.LL = dialogInterfaceOnCancelListenerC1077290e8l;
        tuxSheet.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0d7T
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                EnumC1038100d7Y enumC1038100d7Y;
                String str = TuxSheet._pnsPageId;
                if (Intrinsics.LJFF(C1391190mJ3.LJIIJJI(dialogInterface), C343980De8.LIZ)) {
                    enumC1038100d7Y = EnumC1038100d7Y.EXIT_BUTTON;
                } else {
                    enumC1038100d7Y = EnumC1038100d7Y.OTHER_AREA;
                }
                C1038030d7R c1038030d7R = this.LL;
                c1038030d7R.LLIZLLLIL = false;
                AbstractC1038140d7c abstractC1038140d7c = c1038030d7R.LL;
                if (abstractC1038140d7c != null) {
                    abstractC1038140d7c.LIZLLL(enumC1038100d7Y, System.currentTimeMillis() - jCurrentTimeMillis);
                }
            }
        };
        tuxSheet.LLJJIJIIJIL = false;
        Activity topActivity = ActivityStack.getTopActivity();
        if ((topActivity instanceof C19EG) && (c19eg = (C19EG) topActivity) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null) {
            tuxSheet.show(supportFragmentManager, (String) null);
            this.LLIZLLLIL = true;
            AbstractC1038140d7c abstractC1038140d7c = this.LL;
            if (abstractC1038140d7c != null) {
                abstractC1038140d7c.LIZJ(enumC1038130d7b);
            }
        }
    }

    public final void LJIIIIZZ(View view) {
        int iIntValue;
        if (view instanceof TuxIconView) {
            TuxIconView tuxIconView = (TuxIconView) view;
            Integer numLJFF = LJFF(R.attr.a1h);
            if (numLJFF != null) {
                iIntValue = numLJFF.intValue();
            } else {
                iIntValue = -16777216;
            }
            tuxIconView.setTintColor(iIntValue);
            return;
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            LJIIIIZZ(viewGroup.getChildAt(i));
        }
    }

    public final void LJIIIZ(String str) {
        TuxTextView tuxTextView;
        Object c098200Yq;
        boolean z;
        int i;
        C1250250idj c1250250idj;
        View viewFindViewById;
        View viewFindViewById2;
        if (!Intrinsics.LJFF(this.LLILLJJLI, Boolean.TRUE)) {
            return;
        }
        this.LLJI = str;
        TuxNavBar tuxNavBar = this.LLJIJIL;
        if (tuxNavBar != null) {
            tuxTextView = (TuxTextView) tuxNavBar.findViewById(getDomainViewId());
        } else {
            tuxTextView = null;
        }
        try {
            c098200Yq = UriProtector.parse(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Uri uri = Uri.EMPTY;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = uri;
        }
        Uri uri2 = (Uri) c098200Yq;
        if (this.LLILZLL && u.LJIJI(uri2.getScheme(), "https", false)) {
            z = true;
        } else {
            z = false;
        }
        this.LLIZ = z;
        AbstractC1038140d7c abstractC1038140d7c = this.LL;
        if (abstractC1038140d7c != null) {
            abstractC1038140d7c.LIZIZ(z);
        }
        String host = uri2.getHost();
        if (host == null) {
            host = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
        int iLIZLLL = LIZLLL(tuxTextView);
        if (this.LLIZ) {
            i = R.raw.icon_lock_fill;
        } else {
            i = R.raw.icon_info_circle;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(" ");
        TuxIconDrawable tuxIconDrawable = new TuxIconDrawable(getContext(), i);
        tuxIconDrawable.setBounds(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        tuxIconDrawable.LJFF(iLIZLLL);
        C786410Ut5.q2(spannableStringBuilder2, new C419890GdH(tuxIconDrawable, 2), 0, 1, 33);
        SpannableString spannableString = new SpannableString(host);
        C786410Ut5.p2(spannableString, new ForegroundColorSpan(iLIZLLL), 0, spannableString.length(), 33);
        spannableStringBuilder2.append((CharSequence) " ");
        spannableStringBuilder2.append((CharSequence) spannableString);
        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
        TuxNavBar tuxNavBar2 = this.LLJIJIL;
        if (tuxNavBar2 != null && (viewFindViewById2 = tuxNavBar2.findViewById(getDomainViewId())) != null) {
            C786410Ut5.I7(new ACListenerS151S0100000_16(this, 76), viewFindViewById2);
        }
        TuxNavBar tuxNavBar3 = this.LLJIJIL;
        if (tuxNavBar3 != null && (viewFindViewById = tuxNavBar3.findViewById(getTiktokViewId())) != null) {
            viewFindViewById.setOnTouchListener(new ATListenerS449S0100000_16(this, 11));
        }
        if (C04VO.LIZ()) {
            c1250250idj = this.LLJILJIL;
            c1250250idj.LIZJ = spannableStringBuilder;
        } else {
            c1250250idj = this.LLJILJIL;
            c1250250idj.LIZLLL = spannableStringBuilder;
        }
        TuxNavBar tuxNavBar4 = this.LLJIJIL;
        if (tuxNavBar4 != null) {
            tuxNavBar4.LJIJJ(c1250250idj);
        }
        LIZ();
    }

    public final void setNavBar(TuxNavBar tuxNavBar) {
        this.LLJIJIL = tuxNavBar;
    }

    public final void setNavBarFromXml(TuxNavBar tuxNavBar) {
        this.LLILZ = tuxNavBar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1038030d7R(SparkContext sparkContext, AbstractC1037990d7N abstractC1037990d7N, AbstractC1038140d7c abstractC1038140d7c, Boolean bool, CharSequence charSequence, int i, View view, Context context, int i2) {
        TuxTextView tuxTextView;
        super(context, null, 0);
        abstractC1037990d7N = (i2 & 2) != 0 ? null : abstractC1037990d7N;
        abstractC1038140d7c = (i2 & 4) != 0 ? null : abstractC1038140d7c;
        bool = (i2 & 8) != 0 ? Boolean.FALSE : bool;
        charSequence = (i2 & 16) != 0 ? "" : charSequence;
        i = (i2 & 32) != 0 ? 0 : i;
        view = (i2 & 64) != 0 ? null : view;
        this.LL = abstractC1038140d7c;
        this.LLILLJJLI = bool;
        this.LLILLL = i;
        this.LLILZIL = "SparkWebNavBar";
        this.LLILZLL = true;
        this.LLJILJIL = new C1250250idj();
        if (view != null) {
            addView(view, new ViewGroup.LayoutParams(-1, -2));
        } else {
            C786410Ut5.Td(C786410Ut5.ne(context), R.layout.f_e, this, true);
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        this.LLJIJIL = getNavBarFromXml();
        C0OM1 c0om1 = new C0OM1();
        Integer numLJ = LJ();
        if (numLJ != null) {
            int iIntValue = numLJ.intValue();
            c0om1.LIZJ(iIntValue);
            LIZIZ(iIntValue);
        }
        if (abstractC1037990d7N != null) {
            AbstractC1250290idn abstractC1250290idnLIZIZ = abstractC1037990d7N.LIZIZ();
            if (abstractC1250290idnLIZIZ != null) {
                c0om1.LJ(abstractC1250290idnLIZIZ);
            }
            AbstractC1250290idn abstractC1250290idnLIZ = abstractC1037990d7N.LIZ();
            if (abstractC1250290idnLIZ != null) {
                c0om1.LIZIZ(abstractC1250290idnLIZ);
            }
        }
        c0om1.LIZJ = LJI(charSequence);
        TuxNavBar tuxNavBar = this.LLJIJIL;
        if (tuxNavBar != null && (tuxTextView = (TuxTextView) tuxNavBar.findViewById(getTiktokViewId())) != null) {
            LIZJ(tuxTextView);
        }
        TuxNavBar tuxNavBar2 = this.LLJIJIL;
        if (tuxNavBar2 != null) {
            tuxNavBar2.setNavActions(c0om1);
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(sparkContext.LJIJI()), "url");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
            LJIIIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            if (abstractC1038140d7c != null) {
                abstractC1038140d7c.LJII(EnumC1038090d7X.URL, System.currentTimeMillis() - jCurrentTimeMillis);
            }
        }
        sparkContext.LJJLIL(new InterfaceC1542320qEo() { // from class: X.0d7S
            @Override // X.InterfaceC1542320qEo
            public final void LIZ(String str) {
            }

            @Override // X.InterfaceC1542320qEo
            public final void LIZIZ(String str) {
                TuxTextView tuxTextView2;
                if (this.LIZ.LLILLL == 2 && str != null && C1533950q1J.LJ(str)) {
                    C1250250idj c1250250idjLJI = this.LIZ.LJI(str);
                    C1038030d7R c1038030d7R = this.LIZ;
                    TuxNavBar navBar = c1038030d7R.getNavBar();
                    if (navBar != null) {
                        navBar.LJIJJ(c1250250idjLJI);
                    }
                    c1038030d7R.LIZ();
                    TuxNavBar navBar2 = c1038030d7R.getNavBar();
                    if (navBar2 != null && (tuxTextView2 = (TuxTextView) navBar2.findViewById(c1038030d7R.getTiktokViewId())) != null) {
                        c1038030d7R.LIZJ(tuxTextView2);
                    }
                    AbstractC1038140d7c abstractC1038140d7c2 = this.LIZ.LL;
                    if (abstractC1038140d7c2 != null) {
                        abstractC1038140d7c2.LJII(EnumC1038090d7X.TITLE, System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                }
            }

            @Override // X.InterfaceC1542320qEo
            public final void LIZJ(String str, boolean z) {
                this.LIZ.LJIIIZ(str);
                AbstractC1038140d7c abstractC1038140d7c2 = this.LIZ.LL;
                if (abstractC1038140d7c2 != null) {
                    abstractC1038140d7c2.LIZ(str, z);
                }
            }
        });
        sparkContext.LJJJJZ(new C1077530e99(this, 4));
    }
}
