package X;

import Y.ACListenerS162S0100000_28;
import Y.ARunnableS128S0100000_28;
import Y.AUListenerS276S0100000_28;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.LiveBubbleData;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.LiveBubbleExtra;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.LogPb;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.util.LiveBubbleUtil;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0zgs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1905680zgs extends C214906198m {
    public C1610740s1A LL;
    public final C1610770s1D LLILLJJLI;
    public final C1324720kZq LLILLL;
    public final View LLILZ;
    public final TextView LLILZIL;
    public final View LLILZLL;
    public final View LLIZ;
    public final View LLIZLLLIL;
    public final View LLJ;
    public boolean LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;

    @Override // X.C214906198m, android.widget.PopupWindow
    public final void dismiss() {
        C1610740s1A c1610740s1A;
        Room room;
        Room room2;
        LogPb logPb;
        if (this.LLJI) {
            return;
        }
        this.LLJI = true;
        if (this.LLJILLL) {
            LJJIIJZLJL(this.LLJIJIL, 0, false);
            return;
        }
        super.dismiss();
        this.LLJI = false;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toplive_bubble_duration");
        LiveBubbleUtil liveBubbleUtil = LiveBubbleUtil.LIZ;
        liveBubbleUtil.getClass();
        LiveBubbleData liveBubbleData = LiveBubbleUtil.LJII;
        c474500IjALIZ.LJJII((liveBubbleData == null || !liveBubbleData.showHead) ? "icon" : "head", "live_bubble_mode");
        c474500IjALIZ.LJJII(C1905610zgl.LIZ(), "is_title_run");
        c474500IjALIZ.LJJII(C1905610zgl.LJ, "withdraw_reason");
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - C1905610zgl.LIZLLL), "bubble_show_duration");
        LiveBubbleExtra liveBubbleExtra = LiveBubbleUtil.LJIIIIZZ;
        c474500IjALIZ.LJJII((liveBubbleExtra == null || (logPb = liveBubbleExtra.getLogPb()) == null) ? null : logPb.imprId, "request_id");
        LiveBubbleData liveBubbleData2 = LiveBubbleUtil.LJII;
        c474500IjALIZ.LJJII((liveBubbleData2 == null || (room2 = liveBubbleData2.roomData) == null) ? null : Long.valueOf(room2.getId()), "room_id");
        LiveBubbleData liveBubbleData3 = LiveBubbleUtil.LJII;
        c474500IjALIZ.LJJII((liveBubbleData3 == null || (room = liveBubbleData3.roomData) == null) ? null : Long.valueOf(room.getOwnerUserId()), "anchor_id");
        c474500IjALIZ.LIZ();
        HandlerHook.viewRemoveCallbacks(this.LLIZ, null);
        liveBubbleUtil.getClass();
        LiveBubbleData liveBubbleData4 = LiveBubbleUtil.LJII;
        if (liveBubbleData4 != null && liveBubbleData4.showHead && (c1610740s1A = this.LL) != null) {
            c1610740s1A.LJIIJ();
        }
        View viewLIZLLL = LiveBubbleUtil.LIZLLL();
        if (viewLIZLLL != null) {
            C786410Ut5.LJLLLLLL(0, viewLIZLLL);
        }
        View viewLJII = LiveBubbleUtil.LJII();
        if (viewLJII != null) {
            C786410Ut5.LJLLLLLL(0, viewLJII);
        }
        View viewLJ = LiveBubbleUtil.LJ();
        if (viewLJ != null) {
            C786410Ut5.LJLLLLLL(0, viewLJ);
        }
        View viewLJI = LiveBubbleUtil.LJI();
        if (viewLJI != null) {
            C786410Ut5.LJLLLLLL(0, viewLJI);
        }
        LJJIIZ(1.0f, 1.0f);
        View viewLJII2 = LiveBubbleUtil.LJII();
        if (viewLJII2 != null) {
            C786410Ut5.T4(viewLJII2, 1.0f);
        }
        View viewLJ2 = LiveBubbleUtil.LJ();
        if (viewLJ2 != null) {
            C786410Ut5.T4(viewLJ2, 1.0f);
        }
        View viewLJI2 = LiveBubbleUtil.LJI();
        if (viewLJI2 != null) {
            C786410Ut5.T4(viewLJI2, 1.0f);
        }
    }

    public C1905680zgs(Context context) {
        super(context);
        this.LLJILLL = true;
        this.LLJJ = true;
        setWidth(C497740JfY.LJIIZILJ() - ((int) C497740JfY.LIZIZ(60.0f)));
        setHeight(-2);
        setFocusable(false);
        setOutsideTouchable(false);
        setBackgroundDrawable(new ColorDrawable(0));
        View viewSd = C786410Ut5.Sd(R.layout.di2, C786410Ut5.ne(context), null);
        this.LLJ = viewSd;
        setContentView(viewSd);
        this.LLILLL = (C1324720kZq) viewSd.findViewById(R.id.rh5);
        TextView textView = (TextView) viewSd.findViewById(R.id.rh2);
        this.LLILZIL = textView;
        View viewFindViewById = viewSd.findViewById(R.id.rgz);
        this.LLILZLL = viewFindViewById;
        this.LLILLJJLI = (C1610770s1D) viewSd.findViewById(R.id.rh3);
        this.LLILZ = viewSd.findViewById(R.id.rh4);
        View viewFindViewById2 = viewSd.findViewById(R.id.rh1);
        this.LLIZ = viewFindViewById2;
        this.LLIZLLLIL = viewSd.findViewById(R.id.jhq);
        textView.setSelected(true);
        C786410Ut5.LJLLLLLL(4, viewFindViewById2);
        this.LLJILLL = true;
        this.LLJJ = true;
        C786410Ut5.I7(new ACListenerS162S0100000_28(this, 129), viewFindViewById);
        C786410Ut5.I7(new ACListenerS162S0100000_28(this, 130), viewFindViewById2);
    }

    public static void LJJIIZ(float f, float f2) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        LiveBubbleUtil.LIZ.getClass();
        View viewLIZLLL = LiveBubbleUtil.LIZLLL();
        if (viewLIZLLL != null) {
            C786410Ut5.Ob(viewLIZLLL, f);
        }
        View viewLIZLLL2 = LiveBubbleUtil.LIZLLL();
        if (viewLIZLLL2 != null) {
            C786410Ut5.pc(viewLIZLLL2, f);
        }
        View viewLIZLLL3 = LiveBubbleUtil.LIZLLL();
        if (viewLIZLLL3 != null) {
            C786410Ut5.T4(viewLIZLLL3, f2);
        }
    }

    public final void LJJIJ(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.LLIZ.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        C786410Ut5.W5(this.LLIZ, layoutParams);
    }

    public final void LJJIIJ(int i, int i2, boolean z) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS276S0100000_28(this, 1));
        if (z) {
            valueAnimatorOfInt.setDuration(300L);
        } else {
            valueAnimatorOfInt.setDuration(200L);
        }
        valueAnimatorOfInt.start();
    }

    public final void LJJIIJZLJL(final int i, final int i2, final boolean z) {
        long j;
        long j2;
        if (z) {
            LJJIIZ(1.0f, 1.0f);
            C786410Ut5.LJLLLLLL(8, this.LLJ);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS276S0100000_28(this, 2));
            valueAnimatorOfFloat.setDuration(140L);
            valueAnimatorOfFloat.start();
            long j3 = 160;
            HandlerHook.viewPostDelay(this.LLIZ, new ARunnableS128S0100000_28(this, 104), 160L);
            LiveBubbleUtil.LIZ.getClass();
            LiveBubbleData liveBubbleData = LiveBubbleUtil.LJII;
            if (liveBubbleData == null || liveBubbleData.showHead) {
                j3 = 360;
            }
            HandlerHook.viewPostDelay(this.LLIZ, new Runnable() { // from class: X.0zgt
                public final void LIZ() {
                    ViewParent parent;
                    this.LL.getClass();
                    C1905680zgs.LJJIIZ(1.0f, 0.0f);
                    LiveBubbleUtil.LIZ.getClass();
                    View viewLIZLLL = LiveBubbleUtil.LIZLLL();
                    if (viewLIZLLL != null && (parent = viewLIZLLL.getParent()) != null) {
                        parent.requestLayout();
                    }
                    C786410Ut5.LJLLLLLL(0, this.LL.LLJ);
                    C786410Ut5.LJLLLLLL(0, this.LL.LLIZ);
                    this.LL.LJJIIJ(i, i2, z);
                    this.LL.getClass();
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0zgy
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            LiveBubbleUtil.LIZ.getClass();
                            View viewLJII = LiveBubbleUtil.LJII();
                            if (viewLJII != null) {
                                C786410Ut5.T4(viewLJII, fFloatValue);
                            }
                            View viewLJ = LiveBubbleUtil.LJ();
                            if (viewLJ != null) {
                                C786410Ut5.T4(viewLJ, fFloatValue);
                            }
                            View viewLJI = LiveBubbleUtil.LJI();
                            if (viewLJI != null) {
                                C786410Ut5.T4(viewLJI, fFloatValue);
                            }
                        }
                    });
                    valueAnimatorOfFloat2.setDuration(160L);
                    valueAnimatorOfFloat2.start();
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("TopLiveBubblePopWindow@61ce.playTotalAnimator$2");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TopLiveBubblePopWindow@61ce.playTotalAnimator$2");
                }
            }, j3);
            LiveBubbleData liveBubbleData2 = LiveBubbleUtil.LJII;
            if (liveBubbleData2 != null && !liveBubbleData2.showHead) {
                j = 310;
            } else {
                j = 510;
            }
            HandlerHook.viewPostDelay(this.LLIZ, new Runnable() { // from class: X.0zgw
                public static void LIZ() {
                    C1AV2 c1av2LIZ = C1AV3.LIZ("play_1", "Live", null, "toplive_bubble");
                    c1av2LIZ.LJI = true;
                    LiveBubbleUtil.LIZ.getClass();
                    View viewLJII = LiveBubbleUtil.LJII();
                    if (viewLJII != null) {
                        C2180521AVm.LIZJ(viewLJII, 0.0f, c1av2LIZ);
                    }
                    View viewLJII2 = LiveBubbleUtil.LJII();
                    if (viewLJII2 != null) {
                        C2180521AVm.LIZLLL(viewLJII2, 4, c1av2LIZ);
                    }
                    View viewLJI = LiveBubbleUtil.LJI();
                    if (viewLJI != null) {
                        C2180521AVm.LIZJ(viewLJI, 0.0f, c1av2LIZ);
                    }
                    View viewLJI2 = LiveBubbleUtil.LJI();
                    if (viewLJI2 != null) {
                        C2180521AVm.LIZLLL(viewLJI2, 4, c1av2LIZ);
                    }
                    View viewLJ = LiveBubbleUtil.LJ();
                    if (viewLJ != null) {
                        C2180521AVm.LIZJ(viewLJ, 0.0f, c1av2LIZ);
                    }
                    View viewLJ2 = LiveBubbleUtil.LJ();
                    if (viewLJ2 != null) {
                        C2180521AVm.LIZLLL(viewLJ2, 4, c1av2LIZ);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("TopLiveBubblePopWindow@61ce.playTotalAnimator$3");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TopLiveBubblePopWindow@61ce.playTotalAnimator$3");
                }
            }, j);
            LiveBubbleData liveBubbleData3 = LiveBubbleUtil.LJII;
            if (liveBubbleData3 != null && !liveBubbleData3.showHead) {
                j2 = 460;
            } else {
                j2 = 660;
            }
            HandlerHook.viewPostDelay(this.LLIZ, new ARunnableS128S0100000_28(this, 105), j2);
            return;
        }
        HandlerHook.viewRemoveCallbacks(this.LLIZ, null);
        LJJIIZ(1.0f, 0.0f);
        LJJIJ(this.LLJIJIL, this.LLJILJIL);
        LJJIIJ(i, i2, z);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 0.4f);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0zgv
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                LiveBubbleUtil.LIZ.getClass();
                View viewLJII = LiveBubbleUtil.LJII();
                if (viewLJII != null) {
                    C786410Ut5.T4(viewLJII, fFloatValue);
                }
                View viewLJ = LiveBubbleUtil.LJ();
                if (viewLJ != null) {
                    C786410Ut5.T4(viewLJ, fFloatValue);
                }
                View viewLJI = LiveBubbleUtil.LJI();
                if (viewLJI != null) {
                    C786410Ut5.T4(viewLJI, fFloatValue);
                }
            }
        });
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.start();
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.addUpdateListener(new AUListenerS276S0100000_28(this, 4));
        valueAnimatorOfFloat3.setDuration(200L);
        valueAnimatorOfFloat3.start();
        HandlerHook.viewPostDelay(this.LLIZ, new ARunnableS128S0100000_28(this, 106), 200L);
    }

    @Override // X.C214906198m, android.widget.PopupWindow
    public final void showAtLocation(View view, int i, int i2, int i3) {
        LiveBubbleUtil.LIZ.getClass();
        LiveBubbleUtil.LJIJJ = true;
        C786410Ut5.LJLLLLLL(4, this.LLIZ);
        super.showAtLocation(view, i, i2, i3);
        C1905610zgl.LIZLLL = System.currentTimeMillis();
        HandlerHook.viewPost(this.LLIZ, new ARunnableS128S0100000_28(this, 107));
    }
}
