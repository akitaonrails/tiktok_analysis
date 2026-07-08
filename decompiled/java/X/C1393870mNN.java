package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS565S0100000_21;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mNN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1393870mNN extends AbstractC707180Roa {
    public final SmartImageView LLILZ;
    public final View LLILZIL;
    public final TuxTextView LLILZLL;
    public final TuxTextView LLIZ;
    public final TuxTextView LLIZLLLIL;
    public final ConstraintLayout LLJ;
    public AnchorCommonStruct LLJI;
    public InterfaceC1392640mLO LLJIJIL;
    public String LLJILJIL;
    public Boolean LLJILJILJ;
    public final C01GW LLJILLL;

    @Override // X.AbstractC707180Roa
    public final boolean LIZJ(C2344009Gk c2344009Gk) {
        return true;
    }

    private final String getLogPb() {
        String strOptString;
        JSONObject jSONObjectRequestId;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LLJIJIL;
        if (interfaceC1392640mLO == null || (jSONObjectRequestId = interfaceC1392640mLO.requestId()) == null || (strOptString = jSONObjectRequestId.optString("request_id")) == null) {
            strOptString = "";
        }
        LogPbBean logPbBean = new LogPbBean();
        logPbBean.setImprId(strOptString);
        return C584850Mwl.LIZ.LIZ(logPbBean);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C2344009Gk getOriginalMobParam() {
        /*
            r4 = this;
            X.09Gk r2 = new X.09Gk
            r2.<init>()
            X.0mLO r0 = r4.LLJIJIL
            java.lang.String r3 = ""
            if (r0 == 0) goto L17
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LJJLIIIJJIZ()
            if (r0 == 0) goto L17
            java.lang.String r1 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r0)
            if (r1 != 0) goto L18
        L17:
            r1 = r3
        L18:
            java.lang.String r0 = "author_id"
            r2.LJIIIIZZ(r0, r1)
            X.0mLO r0 = r4.LLJIJIL
            if (r0 == 0) goto L2e
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LJJLIIIJJIZ()
            if (r0 == 0) goto L2e
            java.lang.String r0 = r0.getAid()
            if (r0 == 0) goto L2e
            r3 = r0
        L2e:
            java.lang.String r0 = "group_id"
            r2.LJIIIIZZ(r0, r3)
            X.0mLO r0 = r4.LLJIJIL
            r3 = 0
            if (r0 == 0) goto L8e
            java.lang.String r1 = r0.Cf()
        L3c:
            java.lang.String r0 = "enter_from"
            r2.LJIIIIZZ(r0, r1)
            X.0dp6 r1 = new X.0dp6
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = r4.LLJI
            if (r0 == 0) goto L8c
            java.lang.String r0 = r0.getLogExtra()
        L4b:
            r1.<init>(r0)
            java.lang.String r1 = r1.LJ()
            java.lang.String r0 = "anchor_type"
            r2.LJIIIIZZ(r0, r1)
            X.0dp6 r1 = new X.0dp6
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = r4.LLJI
            if (r0 == 0) goto L8a
            java.lang.String r0 = r0.getLogExtra()
        L61:
            r1.<init>(r0)
            java.lang.String r1 = r1.LIZIZ()
            java.lang.String r0 = "anchor_name"
            r2.LJIIIIZZ(r0, r1)
            X.0dp6 r1 = new X.0dp6
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = r4.LLJI
            if (r0 == 0) goto L88
            java.lang.String r0 = r0.getLogExtra()
        L77:
            r1.<init>(r0)
            java.lang.String r1 = r1.LIZ()
            java.lang.String r0 = "anchor_id"
            r2.LJIIIIZZ(r0, r1)
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = r4.LLJI
            if (r0 == 0) goto La7
            goto L90
        L88:
            r0 = r3
            goto L77
        L8a:
            r0 = r3
            goto L61
        L8c:
            r0 = r3
            goto L4b
        L8e:
            r1 = r3
            goto L3c
        L90:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> La3
            java.lang.String r0 = r0.getExtra()     // Catch: org.json.JSONException -> La3
            r1.<init>(r0)     // Catch: org.json.JSONException -> La3
            java.lang.String r0 = "mobile_effect_type"
            boolean r1 = r1.optBoolean(r0)     // Catch: org.json.JSONException -> La3
            r0 = 1
            if (r1 != r0) goto La7
            goto Laa
        La3:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        La7:
            java.lang.String r1 = "0"
            goto Lac
        Laa:
            java.lang.String r1 = "1"
        Lac:
            java.lang.String r0 = "is_mobile_effect"
            r2.LJIIIIZZ(r0, r1)
            X.0mLO r0 = r4.LLJIJIL
            if (r0 == 0) goto Lb9
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.LJJLIIIJJIZ()
        Lb9:
            java.lang.String r1 = X.C735370Ssx.LJIILIIL(r3)
            java.lang.String r0 = "music_id"
            r2.LJIIIIZZ(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1393870mNN.getOriginalMobParam():X.09Gk");
    }

    private final String getRealTitle() {
        String keyword;
        AnchorCommonStruct anchorCommonStruct = this.LLJI;
        return (anchorCommonStruct == null || (keyword = anchorCommonStruct.getKeyword()) == null) ? "" : keyword;
    }

    private final C1394160mNq getRouter() {
        return (C1394160mNq) this.LLJILLL.getValue();
    }

    @Override // X.InterfaceC713230RyL
    public final void LIZ() {
        TuxTextView tuxTextView = this.LLIZLLLIL;
        if (tuxTextView != null) {
            C786410Ut5.LJLLLLLL(8, tuxTextView);
        }
        View view = this.LLILZIL;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = -2;
            layoutParams.height = -2;
            C786410Ut5.W5(view, layoutParams);
        }
    }

    @Override // X.AbstractC707180Roa, X.InterfaceC1392510mLB
    public C1400390mXt getAnchorMobConfiguration() {
        return new C1400390mXt(new AwS565S0100000_21(this, 1316), new AwS565S0100000_21(this, 1317), new AwS565S0100000_21(this, 1318), null, null, 24);
    }

    public final String getPropResourceId() {
        Aweme awemeLJJLIIIJJIZ;
        List<AnchorCommonStruct> anchors;
        AnchorCommonStruct anchorCommonStruct;
        String strLIZLLL;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LLJIJIL;
        return (interfaceC1392640mLO == null || (awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ()) == null || (anchors = awemeLJJLIIIJJIZ.getAnchors()) == null || (anchorCommonStruct = (AnchorCommonStruct) C13LP.LJJJLL(anchors)) == null || (strLIZLLL = C1212100heC.LIZLLL(anchorCommonStruct)) == null) ? "" : strLIZLLL;
    }

    public final String getResourceList() {
        Aweme awemeLJJLIIIJJIZ;
        String strLJFF;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LLJIJIL;
        return (interfaceC1392640mLO == null || (awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ()) == null || (strLJFF = C1212100heC.LJFF(awemeLJJLIIIJJIZ, null)) == null) ? "" : strLJFF;
    }

    public C1393870mNN(Context context) {
        super(context);
        this.LLJILJIL = "one_line";
        C786410Ut5.Sd(R.layout.c35, C786410Ut5.ne(context), this);
        this.LLILZ = (SmartImageView) findViewById(R.id.b2h);
        this.LLILZIL = findViewById(R.id.m8d);
        this.LLILZLL = (TuxTextView) findViewById(R.id.b2o);
        this.LLIZ = (TuxTextView) findViewById(R.id.b2p);
        this.LLIZLLLIL = (TuxTextView) findViewById(R.id.b2a);
        this.LLJ = (ConstraintLayout) findViewById(R.id.b36);
        this.LLJILLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(360));
    }

    public static Long LJIILL(String str) {
        boolean z;
        Long lValueOf = null;
        if (str != null) {
            try {
                String strOptString = new JSONObject(str).optString("effect_post_publish_count");
                if (strOptString.length() <= 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    strOptString = null;
                }
                if (strOptString == null) {
                    return null;
                }
                lValueOf = Long.valueOf(CastLongProtector.parseLong(strOptString));
                return lValueOf;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return lValueOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x015e  */
    @Override // X.AbstractC707180Roa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(double r14) {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1393870mNN.LJIIL(double):void");
    }

    public final void LJIILLIIL(final String str) {
        int measuredWidth;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        TuxTextView tuxTextView = this.LLILZLL;
        if (tuxTextView != null) {
            tuxTextView.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        }
        TuxTextView tuxTextView2 = this.LLIZ;
        if (tuxTextView2 != null) {
            tuxTextView2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        }
        TuxTextView tuxTextView3 = this.LLIZLLLIL;
        if (tuxTextView3 != null) {
            tuxTextView3.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        }
        TuxTextView tuxTextView4 = this.LLILZLL;
        if (tuxTextView4 != null) {
            int measuredWidth2 = tuxTextView4.getMeasuredWidth();
            TuxTextView tuxTextView5 = this.LLIZ;
            if (tuxTextView5 != null) {
                measuredWidth = tuxTextView5.getMeasuredWidth();
            } else {
                measuredWidth = 0;
            }
            final int i = measuredWidth2 + measuredWidth;
            TuxTextView tuxTextView6 = this.LLILZLL;
            if (tuxTextView6 != null) {
                final int measuredHeight = tuxTextView6.getMeasuredHeight();
                TuxTextView tuxTextView7 = this.LLIZLLLIL;
                if (tuxTextView7 != null) {
                    final int measuredWidth3 = tuxTextView7.getMeasuredWidth();
                    TuxTextView tuxTextView8 = this.LLIZLLLIL;
                    if (tuxTextView8 != null) {
                        final int measuredHeight2 = tuxTextView8.getMeasuredHeight();
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setDuration(300L);
                        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0hgv
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                ViewGroup.LayoutParams layoutParams;
                                View view = this.LL.LLILZIL;
                                if (view != null) {
                                    layoutParams = view.getLayoutParams();
                                    if (layoutParams != null) {
                                        layoutParams.height = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * measuredHeight2) + measuredHeight);
                                    }
                                } else {
                                    layoutParams = null;
                                }
                                if (measuredWidth3 > i && layoutParams != null) {
                                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    int i2 = measuredWidth3;
                                    layoutParams.width = (int) ((fFloatValue * (i2 - r1)) + i);
                                }
                                View view2 = this.LL.LLILZIL;
                                if (view2 != null) {
                                    C786410Ut5.W5(view2, layoutParams);
                                }
                            }
                        });
                        TuxTextView tuxTextView9 = this.LLIZLLLIL;
                        if (tuxTextView9 != null) {
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxTextView9, "alpha", 0.0f, 1.0f);
                            objectAnimatorOfFloat.setStartDelay(50L);
                            objectAnimatorOfFloat.setDuration(300L);
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(valueAnimatorOfFloat, objectAnimatorOfFloat);
                            animatorSet.addListener(new Animator.AnimatorListener() { // from class: X.0hgw
                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationCancel(Animator animator) {
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animator) {
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationRepeat(Animator animator) {
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationStart(Animator animator) {
                                    TuxTextView tuxTextView10 = this.LL.LLIZLLLIL;
                                    if (tuxTextView10 != null) {
                                        tuxTextView10.setText(str);
                                    }
                                    TuxTextView tuxTextView11 = this.LL.LLIZLLLIL;
                                    if (tuxTextView11 != null) {
                                        C786410Ut5.LLLLZLL(tuxTextView11, 0);
                                    }
                                }
                            });
                            animatorSet.start();
                        }
                    }
                }
            }
        }
    }

    public static final void LJIILIIL(C2344009Gk c2344009Gk, JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObject.optString(next, "");
            if (C703302op.LIZ(strOptString)) {
                c2344009Gk.LJFF(next, strOptString);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:185:0x0178, code lost:
    
        continue;
     */
    @Override // X.InterfaceC713230RyL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.C2344009Gk r25, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r26) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1393870mNN.LJ(X.09Gk, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject LJIILJJIL(java.lang.String r13, X.C736480Suk r14) {
        /*
            Method dump skipped, instruction units count: 667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1393870mNN.LJIILJJIL(java.lang.String, X.0Suk):org.json.JSONObject");
    }

    public final void LJIIZILJ(int i, TuxTextView tuxTextView) {
        if (tuxTextView != null) {
            ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
            if (layoutParams != null) {
                C19ME c19me = (C19ME) layoutParams;
                c19me.constrainedWidth = true;
                C786410Ut5.W5(tuxTextView, c19me);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        C19MB c19mb = new C19MB();
        c19mb.LJII(this.LLJ);
        c19mb.LJIILIIL(i, -2);
        c19mb.LIZIZ(this.LLJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0170  */
    @Override // X.InterfaceC713230RyL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r16, X.InterfaceC1392640mLO r17, int r18, kotlin.jvm.functions.Function0 r19) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1393870mNN.LJIIIIZZ(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct, X.0mLO, int, kotlin.jvm.functions.Function0):void");
    }
}
