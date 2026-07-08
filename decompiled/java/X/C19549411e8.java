package X;

import Y.AObserverS210S0100000_6;
import Y.AObserverS223S0100000_19;
import Y.AObserverS229S0100000_27;
import Y.AObserverS231S0100000_29;
import android.app.Activity;
import android.content.Context;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.shortvideo.model.MemeSongModel;
import com.zhiliaoapp.musically.R;
import irm.AkS78S0100000_6;
import irm.AkS94S0100000_27;
import irm.AkS95S0100000_29;
import java.util.List;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11e8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19549411e8 extends FrameLayout implements LifecycleOwner {
    public final LifecycleRegistry LL;
    public View LLILLJJLI;
    public SmartImageView LLILLL;
    public TuxNavBar LLILZ;
    public TuxTextView LLILZIL;
    public View LLILZLL;
    public C427450GpT LLIZ;
    public C1749280vcc LLIZLLLIL;
    public View LLJ;
    public C0I7D LLJI;
    public C0HN1 LLJIJIL;
    public C19399610v4 LLJILJIL;
    public View LLJILJILJ;
    public View LLJILLL;
    public View LLJJ;
    public View LLJJI;
    public TuxTextView LLJJIII;
    public boolean LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;

    public final C19549911eD getKeyboardHelper() {
        return (C19549911eD) this.LLJJIJIL.getValue();
    }

    public final InterfaceC19550311eH getKeyboardStateListener() {
        return (InterfaceC19550311eH) this.LLJJJ.getValue();
    }

    public final C0OM1 getNavBackBtn() {
        return (C0OM1) this.LLJJJJ.getValue();
    }

    public final C0OM1 getNavCloseBtn() {
        return (C0OM1) this.LLJJJIL.getValue();
    }

    public final C19549211e6 getViewModel() {
        return (C19549211e6) this.LLJJIJIIJIL.getValue();
    }

    public final boolean LIZ() {
        MemeSongModel memeSongModel;
        C19549211e6 viewModel = getViewModel();
        Context context = getContext();
        C0I7D c0i7d = this.LLJI;
        if (c0i7d == null) {
            c0i7d = null;
        }
        String strValueOf = String.valueOf(C2204961BRm.LLLLJI(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF384cWghZ6StZ5ba0yD0HYIYeX3XvhRxH5OKB2ruboWof/TrsELK23u/SjpmUQr1yM06gUEbNE8pVBqyCUpxEA==", null)));
        viewModel.getClass();
        if (strValueOf.length() == 0 || ((memeSongModel = (MemeSongModel) C13LP.LJJJLL(viewModel.LJIIIZ)) != null && memeSongModel.getHasConsumed())) {
            viewModel.LIZJ();
            return false;
        }
        Activity activityLIZ = C0FNT.LIZ(context);
        if (activityLIZ == null) {
            return true;
        }
        int i = viewModel.LJIIL;
        if (i == 0) {
            viewModel.LIZJ();
            return true;
        }
        if (i == 40) {
            C857380XkG c857380XkG = C857380XkG.LIZ;
            AwS573S0100000_29 awS573S0100000_29 = new AwS573S0100000_29(viewModel, 0);
            c857380XkG.getClass();
            C1397580mTM c1397580mTM = new C1397580mTM(activityLIZ);
            c1397580mTM.LIZIZ(activityLIZ.getString(2131820754));
            C985403tE.LIZ(c1397580mTM, new AwS395S0200000_29(activityLIZ, awS573S0100000_29, 5));
            new C1397510mTF(c1397580mTM).LIZLLL();
            return true;
        }
        if (i != 20) {
            if (i != 21) {
                viewModel.LIZJ();
                return true;
            }
            viewModel.LIZ(11);
            return true;
        }
        C19529711ax c19529711ax = viewModel.LJII;
        if (c19529711ax != null) {
            c19529711ax.LJI = true;
        }
        viewModel.LIZ(11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LL.setCurrentState(Lifecycle.State.STARTED);
        C19549911eD keyboardHelper = getKeyboardHelper();
        if (keyboardHelper != null) {
            C786410Ut5.x3(keyboardHelper.LIZLLL.getViewTreeObserver(), keyboardHelper.LJFF);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LL.setCurrentState(Lifecycle.State.DESTROYED);
        C19549911eD keyboardHelper = getKeyboardHelper();
        if (keyboardHelper != null) {
            C786410Ut5.C3(keyboardHelper.LIZLLL.getViewTreeObserver(), keyboardHelper.LJFF);
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.LL;
    }

    public C19549411e8(Context context) {
        super(context, null, 0);
        LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);
        this.LL = lifecycleRegistry;
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(0));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS430S0200000_29(context, this, 0));
        this.LLJJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 2));
        lifecycleRegistry.setCurrentState(Lifecycle.State.CREATED);
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.dl_, this, true);
        TuxNavBar tuxNavBar = (TuxNavBar) findViewById(R.id.o6i);
        this.LLILZ = tuxNavBar;
        (tuxNavBar == null ? null : tuxNavBar).setNavBackground(0);
        TuxNavBar tuxNavBar2 = this.LLILZ;
        (tuxNavBar2 == null ? null : tuxNavBar2).setBackgroundColor(0);
        this.LLILLL = (SmartImageView) findViewById(R.id.o6_);
        SmartImageView smartImageView = (SmartImageView) findViewById(R.id.o6g);
        C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse("https://sf16-sg.tiktokcdn.com/obj/eden-sg/aulpsJ-ojllwZ-hahK/ljhwZthlaukjlkulzlp/badge_aisong.png"));
        c1331670kl3LJI.LJJ(smartImageView);
        C786410Ut5.h3(c1331670kl3LJI);
        this.LLJILJILJ = findViewById(R.id.o64);
        View viewFindViewById = findViewById(R.id.o69);
        this.LLJILLL = viewFindViewById;
        viewFindViewById = viewFindViewById == null ? null : viewFindViewById;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.e9);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        viewFindViewById.setBackground(c384050F3z.LIZ(getContext()));
        View view = this.LLJILLL;
        C427690Gpr.LJI(view == null ? null : view, null);
        View viewFindViewById2 = findViewById(R.id.o65);
        this.LLJJ = viewFindViewById2;
        viewFindViewById2 = viewFindViewById2 == null ? null : viewFindViewById2;
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.ee);
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        viewFindViewById2.setBackground(c384050F3z2.LIZ(getContext()));
        View view2 = this.LLJJ;
        C427690Gpr.LJI(view2 == null ? null : view2, null);
        this.LLJJI = findViewById(R.id.o66);
        this.LLJJIII = (TuxTextView) findViewById(R.id.o67);
        this.LLIZ = (C427450GpT) findViewById(R.id.o6k);
        this.LLIZLLLIL = (C1749280vcc) findViewById(R.id.o6c);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.o68);
        this.LLILZIL = tuxTextView;
        tuxTextView = tuxTextView == null ? null : tuxTextView;
        C384050F3z c384050F3z3 = new C384050F3z();
        c384050F3z3.LIZIZ = Integer.valueOf(R.attr.ee);
        c384050F3z3.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        tuxTextView.setBackground(c384050F3z3.LIZ(getContext()));
        this.LLILZLL = findViewById(R.id.o63);
        this.LLJ = findViewById(R.id.o6e);
        this.LLJI = (C0I7D) findViewById(R.id.o6a);
        this.LLJIJIL = (C0HN1) findViewById(R.id.o6q);
        this.LLJILJIL = (C19399610v4) findViewById(R.id.o6r);
        this.LLILLJJLI = findViewById(R.id.o6m);
        final ScrollView scrollView = (ScrollView) findViewById(R.id.o6b);
        final C0I7D c0i7d = this.LLJI;
        c0i7d = c0i7d == null ? null : c0i7d;
        final AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(this, 0);
        scrollView.setOnTouchListener(new View.OnTouchListener() { // from class: X.0ifP
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                if (motionEvent != null && motionEvent.getAction() == 1) {
                    int[] iArr = new int[2];
                    c0i7d.getLocationInWindow(iArr);
                    int i = iArr[0];
                    int i2 = iArr[1];
                    int width = c0i7d.getWidth() + i;
                    int height = c0i7d.getHeight() + i2;
                    if (motionEvent.getX() < i || motionEvent.getX() > width || motionEvent.getRawY() < i2 || motionEvent.getRawY() > height) {
                        awS571S0100000_27.invoke();
                        return false;
                    }
                }
                return scrollView.onTouchEvent(motionEvent);
            }
        });
        C786410Ut5.I7(new AkS78S0100000_6(this, 0), findViewById(R.id.o6d));
        Activity activityLIZ = C0FNT.LIZ(getContext());
        if (activityLIZ != null) {
            getViewModel().LIZ = activityLIZ;
        }
        C0HN1 c0hn1 = this.LLJIJIL;
        c0hn1 = c0hn1 == null ? null : c0hn1;
        C03AH c03ah = new C03AH() { // from class: X.11eA
            @Override // X.C03AH
            public final void LIZ(int i, String str) {
                C0I7D c0i7d2;
                C0I7D c0i7d3 = this.LIZ.LLJI;
                if (c0i7d3 == null) {
                    c0i7d3 = null;
                }
                c0i7d3.setText(str);
                C0I7D c0i7d4 = this.LIZ.LLJI;
                if (c0i7d4 == null) {
                    c0i7d2 = null;
                    c0i7d4 = null;
                } else {
                    c0i7d2 = c0i7d4;
                }
                c0i7d2.setSelection(String.valueOf(C2204961BRm.LLLLJI(c0i7d4, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF384cWghZ6StZ5ba0yD0HYIYeX3XvhRxH5OKB2ruboWof/TrsELK23u/SjpmUQr1yM06gUEbNE8pVBqyCUpxEA==", null))).length());
                InterfaceC19549711eB interfaceC19549711eB = this.LIZ.getViewModel().LJJIJIIJI;
                if (interfaceC19549711eB != null) {
                    interfaceC19549711eB.LLILZIL(i, str);
                }
            }
        };
        C0HN3 c0hn3 = new C0HN3() { // from class: X.11eE
            @Override // X.C0HN3
            public final void LIZ() {
                InterfaceC19549711eB interfaceC19549711eB = this.LIZ.getViewModel().LJJIJIIJI;
                if (interfaceC19549711eB != null) {
                    interfaceC19549711eB.LLIIIL();
                }
            }
        };
        c0hn1.LLILLL.LLILLJJLI = c03ah;
        c0hn1.LLILZIL = c0hn3;
        View view3 = this.LLJILLL;
        C786410Ut5.I7(new AkS95S0100000_29(this, 1), view3 == null ? null : view3);
        View view4 = this.LLJJ;
        C786410Ut5.I7(new AkS95S0100000_29(this, 2), view4 == null ? null : view4);
        SmartImageView smartImageView2 = this.LLILLL;
        C786410Ut5.I7(new AkS94S0100000_27(this, 0), smartImageView2 == null ? null : smartImageView2);
        View view5 = this.LLJ;
        C786410Ut5.I7(new AkS94S0100000_27(this, 1), view5 == null ? null : view5);
        InputFilter[] inputFilterArr = {new InputFilter.LengthFilter() { // from class: X.11bi
            {
                super(600);
            }

            @Override // android.text.InputFilter.LengthFilter, android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                int length = spanned.length();
                int length2 = charSequence.length();
                if ((length >= 600 && charSequence.length() > 0) || length2 >= 600) {
                    C857380XkG c857380XkG = C857380XkG.LIZ;
                    Context context2 = this.LL.getContext();
                    c857380XkG.getClass();
                    C857380XkG.LIZ(context2, context2.getString(2131820749));
                }
                return super.filter(charSequence, i, i2, spanned, i3, i4);
            }
        }};
        C0I7D c0i7d2 = this.LLJI;
        (c0i7d2 == null ? null : c0i7d2).setFilters(inputFilterArr);
        C0I7D c0i7d3 = this.LLJI;
        (c0i7d3 == null ? null : c0i7d3).addTextChangedListener(new C19773412Ya(this, 0));
        C19399610v4 c19399610v4 = this.LLJILJIL;
        (c19399610v4 == null ? null : c19399610v4).setCenterSelectListener(new InterfaceC19399010uy() { // from class: X.11e7
            /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
            @Override // X.InterfaceC19399010uy
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(int r9, boolean r10) {
                /*
                    r8 = this;
                    X.11e8 r0 = r8.LIZ
                    X.11e6 r4 = r0.getViewModel()
                    java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MemeSongModel> r0 = r4.LJIIIZ
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
                    java.util.ArrayList r0 = (java.util.ArrayList) r0
                    java.util.Iterator r5 = r0.iterator()
                    r7 = 0
                    r3 = 0
                L14:
                    boolean r0 = r5.hasNext()
                    if (r0 == 0) goto L39
                    java.lang.Object r2 = r5.next()
                    int r1 = r3 + 1
                    if (r3 < 0) goto L34
                    com.ss.android.ugc.aweme.shortvideo.model.MemeSongModel r2 = (com.ss.android.ugc.aweme.shortvideo.model.MemeSongModel) r2
                    if (r6 == 0) goto L32
                    int r0 = r6.intValue()
                    if (r3 != r0) goto L32
                    r0 = 1
                L2d:
                    r2.setSelected(r0)
                    r3 = r1
                    goto L14
                L32:
                    r0 = 0
                    goto L2d
                L34:
                    X.C1697810uHb.LJIJI()
                    r0 = 0
                    throw r0
                L39:
                    java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MemeSongModel> r0 = r4.LJIIIZ
                    java.lang.Object r3 = X.C13LP.LJJJLZIJ(r9, r0)
                    com.ss.android.ugc.aweme.shortvideo.model.MemeSongModel r3 = (com.ss.android.ugc.aweme.shortvideo.model.MemeSongModel) r3
                    r4.LJIIJ = r3
                    if (r3 == 0) goto La5
                    java.util.Map<java.lang.String, com.ss.android.ugc.effectmanager.effect.model.Effect> r0 = X.C194397113r.LIZ
                    java.lang.String r0 = r3.getStyle()
                    java.lang.String r1 = X.C194397113r.LIZ(r0)
                    androidx.lifecycle.MutableLiveData<java.lang.String> r0 = r4.LJJIIJZLJL
                    r0.postValue(r1)
                    androidx.lifecycle.MutableLiveData<java.lang.String> r6 = r4.LJJIII
                    com.ss.android.ugc.aweme.shortvideo.model.MemeSongModel r5 = r4.LJIIJ
                    if (r5 == 0) goto L8e
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.util.List r0 = r5.getLyrics()
                    int r1 = r0.size()
                L67:
                    if (r7 >= r1) goto L88
                    java.util.List r0 = r5.getLyrics()
                    java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r7)
                    java.lang.String r0 = (java.lang.String) r0
                    r2.append(r0)
                    java.util.List r0 = r5.getLyrics()
                    int r0 = X.C1697810uHb.LJIIJ(r0)
                    if (r7 == r0) goto L85
                    java.lang.String r0 = "\n"
                    r2.append(r0)
                L85:
                    int r7 = r7 + 1
                    goto L67
                L88:
                    java.lang.String r0 = r2.toString()
                    if (r0 != 0) goto L90
                L8e:
                    java.lang.String r0 = ""
                L90:
                    r6.postValue(r0)
                    boolean r0 = r4.LJ
                    if (r0 == 0) goto La6
                    r4.LJFF(r3)
                L9a:
                    X.11eB r1 = r4.LJJIJIIJI
                    if (r1 == 0) goto La5
                    java.lang.String r0 = r3.getStyle()
                    r1.LJIILLIIL(r9, r0, r10)
                La5:
                    return
                La6:
                    X.11eC r0 = r4.LIZLLL()
                    if (r0 == 0) goto L9a
                    r0.release()
                    goto L9a
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19549311e7.LIZ(int, boolean):void");
            }
        });
        TuxTextView tuxTextView2 = this.LLILZIL;
        C786410Ut5.I7(new AkS95S0100000_29(this, 3), tuxTextView2 == null ? null : tuxTextView2);
        View view6 = this.LLILZLL;
        C786410Ut5.I7(new AkS95S0100000_29(this, 4), view6 == null ? null : view6);
        C1749280vcc c1749280vcc = this.LLIZLLLIL;
        C1749280vcc c1749280vcc2 = c1749280vcc != null ? c1749280vcc : null;
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C1893080zMY.LJFF(c1722300uv6, new AwS573S0100000_29(this, 1));
        c1749280vcc2.setStatus(c1722300uv6);
        getViewModel().LJIILIIL.observe(this, new AObserverS231S0100000_29(this, 1));
        getViewModel().LJJI.observe(this, new AObserverS223S0100000_19(this, 4));
        getViewModel().LJJIFFI.observe(this, new AObserverS223S0100000_19(this, 0));
        getViewModel().LJJII.observe(this, new AObserverS210S0100000_6(this, 11));
        getViewModel().LJIJI.observe(this, new AObserverS223S0100000_19(this, 1));
        getViewModel().LJIL.observe(this, new AObserverS223S0100000_19(this, 2));
        getViewModel().LJIJJ.observe(this, new AObserverS210S0100000_6(this, 12));
        getViewModel().LJJIIJ.observe(this, new AObserverS210S0100000_6(this, 13));
        getViewModel().LJJIII.observe(this, new AObserverS210S0100000_6(this, 14));
        getViewModel().LJJIIZ.observe(this, new AObserverS210S0100000_6(this, 15));
        getViewModel().LJIJJLI.observe(this, new AObserverS210S0100000_6(this, 16));
        getViewModel().LJJIIZI.observe(this, new AObserverS210S0100000_6(this, 17));
        getViewModel().LJIIZILJ.observe(this, new AObserverS210S0100000_6(this, 18));
        getViewModel().LJIJ.observe(this, new AObserverS210S0100000_6(this, 19));
        getViewModel().LJJ.observe(this, new AObserverS223S0100000_19(this, 3));
        getViewModel().LJJIJ.observe(this, new AObserverS231S0100000_29(this, 0));
        getViewModel().LJIILJJIL.observe(this, new AObserverS229S0100000_27(this, 0));
        getViewModel().LJIILL.observe(this, new AObserverS229S0100000_27(this, 1));
        getViewModel().LJIILLIIL.observe(this, new AObserverS210S0100000_6(this, 20));
        getViewModel().LJJIIJZLJL.observe(this, new AObserverS210S0100000_6(this, 21));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 4));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 2));
    }

    public final void setActions(InterfaceC19549711eB interfaceC19549711eB) {
        getViewModel().LJJIJIIJI = interfaceC19549711eB;
    }

    public final void setFrom(String str) {
        getViewModel().LIZIZ = str;
    }

    public final void setInitModels(List<MemeSongModel> list) {
        C19549211e6 viewModel = getViewModel();
        if (list != null) {
            viewModel.LIZJ = list;
        } else {
            viewModel.getClass();
        }
    }
}
