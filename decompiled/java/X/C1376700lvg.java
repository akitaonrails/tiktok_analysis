package X;

import Y.ACListenerS115S0200000_11;
import Y.AUListenerS270S0100000_21;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.LinearLayout;
import android.widget.TextView;
import avg.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.zhiliaoapp.musically.R;
import mf.a;

/* JADX INFO: renamed from: X.0lvg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1376700lvg extends AbstractC736370SuZ {
    public static final int LLJ;
    public static final InterpolatorC420870Ger LLJI;
    public final InterfaceC1373720lqs LLILZ;
    public final InterfaceC1374230lrh LLILZIL;
    public final ViewGroup LLILZLL;
    public final ViewGroup LLIZ;
    public AnimatorSet LLIZLLLIL;

    @Override // X.AbstractC736370SuZ
    public final String LJIIIZ() {
        return "secondary_dislike";
    }

    static {
        C844470XAv.LIZ.getClass();
        LLJ = (int) C12ES.LIZJ(8.0f, C844470XAv.LIZ());
        LLJI = new InterpolatorC420870Ger(0.25f, 0.1f, 0.25f, 1.0f);
    }

    public final void LJIIJ() {
        if (this.LLILZ instanceof C1379170lzf) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", ((C1379170lzf) this.LLILZ).LLILLJJLI);
            Aweme aweme = ((C1379170lzf) this.LLILZ).LL;
            c2344009Gk.LJIIIIZZ("group_id", aweme != null ? aweme.getAid() : null);
            Aweme aweme2 = ((C1379170lzf) this.LLILZ).LL;
            c2344009Gk.LJIIIIZZ("author_id", aweme2 != null ? AwemeExtKt.getAuthorUid(aweme2) : null);
            c2344009Gk.LJIIIIZZ("log_pb", C584850Mwl.LIZ.LIZIZ(C735370Ssx.LJIJJ(((C1379170lzf) this.LLILZ).LL)));
            c2344009Gk.LJIIIIZZ("enter_method", "long_press");
            C20684815ws.LJIILLIIL("click_block_videos", c2344009Gk.LIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v17, types: [X.0Gei, android.view.View] */
    @Override // X.AbstractC1376810lvr
    public final void LIZIZ(View view) {
        boolean z;
        DialogC1372820lpQ dialogC1372820lpQ;
        Context context;
        final Context context2;
        ViewGroup viewGroup = this.LLIZ;
        if (viewGroup != null && viewGroup.getChildCount() == 0) {
            z = true;
        } else {
            z = false;
        }
        ViewGroup.LayoutParams layoutParams = null;
        if (z) {
            InterfaceC1374230lrh interfaceC1374230lrh = this.LLILZIL;
            if (interfaceC1374230lrh != null && (context = interfaceC1374230lrh.getContext()) != null) {
                C1376730lvj c1376730lvj = new C1376730lvj(context);
                C1373910lrB c1373910lrB = new C1373910lrB(new C1374250lrj(0, 2131838157, "", 8), this.LLILZ.LIZLLL(this.LLILZIL), true);
                c1376730lvj.LL = (C1376920lw2) c1373910lrB.LIZIZ;
                TextView textView = c1376730lvj.LLILLJJLI;
                if (textView != null) {
                    textView.setText(c1376730lvj.getContext().getString(c1373910lrB.LIZ.LIZIZ));
                }
                ViewGroup viewGroup2 = this.LLIZ;
                if (viewGroup2 != null) {
                    viewGroup2.addView(c1376730lvj);
                }
                int i = 0;
                for (C1376750lvl c1376750lvl : this.LLILZ.LIZIZ(this.LLILZIL)) {
                    int i2 = i + 1;
                    InterfaceC1374230lrh interfaceC1374230lrh2 = this.LLILZIL;
                    if (interfaceC1374230lrh2 != null) {
                        context2 = interfaceC1374230lrh2.getContext();
                    } else {
                        context2 = null;
                    }
                    ?? r3 = new LinearLayout(context2) { // from class: X.0Gei
                        public View LL;
                        public final TextView LLILLJJLI;

                        public final View getDividingLineFromXml() {
                            View view2 = this.LL;
                            if (view2 != null) {
                                return view2;
                            }
                            View viewFindViewById = findViewById(R.id.g00);
                            this.LL = viewFindViewById;
                            return viewFindViewById;
                        }

                        {
                            C786410Ut5.LJLLJ(getContext(), R.layout.b81, this);
                            int iLIZJ = (int) C12ES.LIZJ(16.0f, getContext());
                            setPadding(iLIZJ, 0, iLIZJ, 0);
                            setOrientation(1);
                            setBackgroundResource(R.drawable.apl);
                            this.LLILLJJLI = (TextView) findViewById(R.id.sut);
                        }

                        public final void setDividingLineFromXml(View view2) {
                            this.LL = view2;
                        }

                        public final void LIZ(C734990SsL c734990SsL, AbstractC736370SuZ abstractC736370SuZ, boolean z2) {
                            TextView textView2 = this.LLILLJJLI;
                            if (textView2 != null) {
                                String str = c734990SsL.LIZIZ;
                                if (str == null) {
                                    str = "";
                                }
                                textView2.setText(str);
                            }
                            View.OnClickListener aCListenerS115S0200000_11 = new ACListenerS115S0200000_11(abstractC736370SuZ, c734990SsL, 20);
                            if (C1848410yCV.LIZ) {
                                aCListenerS115S0200000_11 = new f(aCListenerS115S0200000_11);
                            }
                            a aVar = new a(aCListenerS115S0200000_11);
                            if (C2213981Bky.LIZIZ.isOffline()) {
                                C2211941Bhg.LIZ.injectViewListener(this);
                            }
                            setOnClickListener(aVar);
                            if (z2) {
                                C786410Ut5.LJLLLLLL(4, getDividingLineFromXml());
                            } else {
                                C786410Ut5.LJLLLLLL(0, getDividingLineFromXml());
                            }
                        }
                    };
                    if (i == 0) {
                        r3.LIZ(c1376750lvl.LIZ, c1376750lvl.LIZIZ, true);
                    } else {
                        r3.LIZ(c1376750lvl.LIZ, c1376750lvl.LIZIZ, false);
                    }
                    ViewGroup viewGroup3 = this.LLIZ;
                    if (viewGroup3 != 0) {
                        viewGroup3.addView(r3);
                    }
                    i = i2;
                }
            } else {
                return;
            }
        }
        ViewGroup viewGroup4 = this.LLIZ;
        if (viewGroup4 != null) {
            viewGroup4.measure(View.MeasureSpec.makeMeasureSpec(viewGroup4.getWidth(), Integer.MIN_VALUE), 0);
        }
        AnimatorSet animatorSet = this.LLIZLLLIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS270S0100000_21(this, 25));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setDuration(300L);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS270S0100000_21(this, 26));
        int i3 = LLJ;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, i3);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS270S0100000_21(this, 27));
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(-i3, 0);
        valueAnimatorOfInt2.setDuration(300L);
        valueAnimatorOfInt2.addUpdateListener(new AUListenerS270S0100000_21(this, 28));
        ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(this.LLILZLL.getMeasuredHeight(), this.LLIZ.getMeasuredHeight());
        valueAnimatorOfInt3.setDuration(300L);
        valueAnimatorOfInt3.addUpdateListener(new AUListenerS270S0100000_21(this, 29));
        C844470XAv.LIZ.getClass();
        int iLJ = C14KQ.LJ(C844470XAv.LIZ());
        ViewGroup viewGroup5 = this.LLIZ;
        if (viewGroup5 != null) {
            layoutParams = viewGroup5.getLayoutParams();
        }
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        final int i4 = marginLayoutParams.topMargin;
        final int measuredHeight = (iLJ - this.LLIZ.getMeasuredHeight()) / 2;
        new Animation() { // from class: X.0lvh
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                int i5 = measuredHeight;
                marginLayoutParams2.topMargin = ((int) ((i5 - r1) * f)) + i4;
                ViewGroup viewGroup6 = this.LLIZ;
                if (viewGroup6 != null) {
                    C786410Ut5.X5(marginLayoutParams, viewGroup6);
                }
            }
        }.setDuration(200L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.LLIZLLLIL = animatorSet2;
        animatorSet2.setInterpolator(LLJI);
        animatorSet2.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfInt, valueAnimatorOfInt2, valueAnimatorOfInt3);
        animatorSet2.start();
        LJIIJ();
        InterfaceC1373720lqs interfaceC1373720lqs = this.LLILZ;
        if (interfaceC1373720lqs instanceof C1374200lre) {
            C1374200lre c1374200lre = (C1374200lre) interfaceC1373720lqs;
            String strValueOf = String.valueOf(c1374200lre.LL.extras.getLong("item_id", 0L));
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("room_id", strValueOf);
            c2344009Gk.LJIIIIZZ("request_page", "long_press");
            c2344009Gk.LJIIIIZZ("live_window_mode", "preview_card");
            c2344009Gk.LJIIIIZZ("anchor_id", c1374200lre.LL.extras.getString("uid_for_share", ""));
            c2344009Gk.LJIIIIZZ("enter_from_merge", c1374200lre.LL.extras.getString("enter_from", ""));
            c2344009Gk.LJIIIIZZ("enter_method", c1374200lre.LL.extras.getString("enter_method_live", ""));
            C20684815ws.LJIILLIIL("livesdk_dislike_sec_show", c2344009Gk.LIZ);
        }
        InterfaceC1374230lrh interfaceC1374230lrh3 = this.LLILZIL;
        if ((interfaceC1374230lrh3 instanceof DialogC1372820lpQ) && (dialogC1372820lpQ = (DialogC1372820lpQ) interfaceC1374230lrh3) != null) {
            dialogC1372820lpQ.LLJILJILJ.LIZ(R.id.q1v).setPadding(0, 0, 0, 0);
        }
    }

    @Override // X.AbstractC1376810lvr
    public final void LJII(View view) {
        LIZIZ(view);
    }

    public C1376700lvg(InterfaceC1373720lqs interfaceC1373720lqs, InterfaceC1374230lrh interfaceC1374230lrh) {
        ViewGroup viewGroupLJJIIJ;
        super(interfaceC1373720lqs, interfaceC1374230lrh);
        this.LLILZ = interfaceC1373720lqs;
        this.LLILZIL = interfaceC1374230lrh;
        if (interfaceC1374230lrh != null) {
            viewGroupLJJIIJ = interfaceC1374230lrh.LJJIIJ();
        } else {
            viewGroupLJJIIJ = null;
        }
        this.LLILZLL = viewGroupLJJIIJ;
        this.LLIZ = interfaceC1374230lrh != null ? interfaceC1374230lrh.LJIJ() : null;
    }
}
