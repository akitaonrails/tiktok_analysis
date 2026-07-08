package X;

import Y.ACListenerS163S0100000_29;
import Y.ALAdapterS11S0110000_29;
import Y.AObserverS189S0200000_29;
import Y.AObserverS231S0100000_29;
import Y.ARunnableS129S0100000_29;
import Y.AUListenerS277S0100000_29;
import android.animation.ValueAnimator;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.pipfeed.PipFeedManager;
import com.ss.android.ugc.aweme.pipfeed.components.single.ControlOverlayViewModel;
import com.ss.android.ugc.aweme.pipfeed.vm.PipFeedWindowVM;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS317S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.10sU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19383610sU extends AbstractC19390410ta implements InterfaceC19383710sV {
    public static final int LLJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(156));
    public static final int LLJJIII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(140));
    public final C19391010tg LLILZLL;
    public final C19391010tg LLIZ;
    public TuxIconView LLIZLLLIL;
    public TuxIconView LLJ;
    public TuxIconView LLJI;
    public TuxIconView LLJIJIL;
    public TuxIconView LLJILJIL;
    public View LLJILJILJ;
    public View LLJILLL;
    public final ARunnableS129S0100000_29 LLJJ;

    @Override // X.InterfaceC19383710sV
    public final void LIZ() {
        View view = this.LLILLJJLI;
        if (view != null) {
            LJIILL(view.getVisibility() == 4);
        }
    }

    @Override // X.InterfaceC19383710sV
    public final void LJ() throws PendingIntent.CanceledException {
        PipFeedManager.Companion.getClass();
        C1620120sGI.LIZ.reenterMainApp$pipfeed_release();
    }

    @Override // X.AbstractC19390410ta
    public final void LJIIL() {
        View view = this.LLILLJJLI;
        if (view != null) {
            HandlerHook.viewPostDelay(view, this.LLJJ, 2000L);
        }
    }

    public final ControlOverlayViewModel LJIIZILJ() {
        return (ControlOverlayViewModel) this.LLILZLL.getValue();
    }

    @Override // X.InterfaceC19383710sV
    public final void close() {
        PipFeedManager.Companion.getClass();
        C1620120sGI.LIZ.closeWindowOnly$pipfeed_release("click_exit_app");
    }

    public C19383610sU() {
        super(R.id.qi0);
        this.LLILZLL = new C19391010tg(C452501pT.LIZIZ(new AwS573S0100000_29((AbstractC19390410ta) this, 1083)), C13LE.LIZ(ControlOverlayViewModel.class));
        this.LLIZ = new C19391010tg(C452501pT.LIZIZ(new AwS573S0100000_29((AbstractC19390410ta) this, 1083)), C13LE.LIZ(PipFeedWindowVM.class));
        this.LLJJ = new ARunnableS129S0100000_29(this, 156);
    }

    @Override // X.AbstractC19390410ta
    public final View LJI(Context context) {
        return C786410Ut5.Sd(R.layout.dv5, C786410Ut5.ne(context), null);
    }

    @Override // X.AbstractC19390410ta
    public final void LJIILJJIL(View view) {
        LJIIZILJ().LLILLJJLI = this;
        this.LLIZLLLIL = (TuxIconView) view.findViewById(R.id.jw7);
        this.LLJ = (TuxIconView) view.findViewById(R.id.jw1);
        this.LLJI = (TuxIconView) view.findViewById(R.id.jwb);
        this.LLJIJIL = (TuxIconView) view.findViewById(R.id.jux);
        this.LLJILJIL = (TuxIconView) view.findViewById(R.id.jun);
        this.LLJILJILJ = view.findViewById(R.id.uxu);
        this.LLJILLL = view.findViewById(R.id.uxt);
        TuxIconView tuxIconView = this.LLJIJIL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS163S0100000_29(this, 212));
        }
        TuxIconView tuxIconView2 = this.LLJILJIL;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS163S0100000_29(this, 213));
        }
        LJIIZILJ().LLILZ.observe(LJIIIIZZ(), new AObserverS231S0100000_29(this, 143));
        TuxIconView tuxIconView3 = this.LLJ;
        if (tuxIconView3 != null) {
            final AwS573S0100000_29 awS573S0100000_29 = new AwS573S0100000_29(this, 882);
            C786410Ut5.I7(null, tuxIconView3);
            tuxIconView3.setOnTouchListener(new View.OnTouchListener(awS573S0100000_29) { // from class: X.10sN
                public final Function0<Unit> LL;

                {
                    this.LL = awS573S0100000_29;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    Function0<Unit> function0;
                    Handler handler;
                    Handler handler2;
                    if (view2 == null || view2.getVisibility() != 0 || !view2.isClickable()) {
                        return false;
                    }
                    if (motionEvent != null) {
                        Integer numValueOf = Integer.valueOf(motionEvent.getActionMasked());
                        if (numValueOf != null) {
                            if (numValueOf.intValue() == 0) {
                                C786410Ut5.T4(view2, 0.4f);
                                View view3 = this.LLILLJJLI.LLILLJJLI;
                                if (view3 != null && (handler2 = view3.getHandler()) != null) {
                                    handler2.removeCallbacks(this.LLILLJJLI.LLJJ);
                                }
                            } else if (numValueOf.intValue() == 1 || numValueOf.intValue() == 3) {
                                C786410Ut5.T4(view2, 1.0f);
                                C19383610sU c19383610sU = this.LLILLJJLI;
                                View view4 = c19383610sU.LLILLJJLI;
                                if (view4 != null && (handler = view4.getHandler()) != null) {
                                    handler.removeCallbacks(c19383610sU.LLJJ);
                                    C786410Ut5.LJLIIL(2000L, handler, c19383610sU.LLJJ);
                                }
                            }
                        }
                        if (motionEvent != null && motionEvent.getActionMasked() == 1 && (function0 = this.LL) != null) {
                            function0.invoke();
                        }
                    }
                    return true;
                }
            });
        }
        LJIIZILJ().LLILLL.observe(LJIIIIZZ(), new AObserverS231S0100000_29(this, 144));
        TuxIconView tuxIconView4 = this.LLJI;
        if (tuxIconView4 != null) {
            final AwS573S0100000_29 awS573S0100000_292 = new AwS573S0100000_29(this, 883);
            C786410Ut5.I7(null, tuxIconView4);
            tuxIconView4.setOnTouchListener(new View.OnTouchListener(awS573S0100000_292) { // from class: X.10sN
                public final Function0<Unit> LL;

                {
                    this.LL = awS573S0100000_292;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    Function0<Unit> function0;
                    Handler handler;
                    Handler handler2;
                    if (view2 == null || view2.getVisibility() != 0 || !view2.isClickable()) {
                        return false;
                    }
                    if (motionEvent != null) {
                        Integer numValueOf = Integer.valueOf(motionEvent.getActionMasked());
                        if (numValueOf != null) {
                            if (numValueOf.intValue() == 0) {
                                C786410Ut5.T4(view2, 0.4f);
                                View view3 = this.LLILLJJLI.LLILLJJLI;
                                if (view3 != null && (handler2 = view3.getHandler()) != null) {
                                    handler2.removeCallbacks(this.LLILLJJLI.LLJJ);
                                }
                            } else if (numValueOf.intValue() == 1 || numValueOf.intValue() == 3) {
                                C786410Ut5.T4(view2, 1.0f);
                                C19383610sU c19383610sU = this.LLILLJJLI;
                                View view4 = c19383610sU.LLILLJJLI;
                                if (view4 != null && (handler = view4.getHandler()) != null) {
                                    handler.removeCallbacks(c19383610sU.LLJJ);
                                    C786410Ut5.LJLIIL(2000L, handler, c19383610sU.LLJJ);
                                }
                            }
                        }
                        if (motionEvent != null && motionEvent.getActionMasked() == 1 && (function0 = this.LL) != null) {
                            function0.invoke();
                        }
                    }
                    return true;
                }
            });
        }
        LJIIZILJ().LLIZ.observe(LJIIIIZZ(), new AObserverS231S0100000_29(this, 145));
        LJIIZILJ().LLILZIL.observe(LJIIIIZZ(), new AObserverS231S0100000_29(this, 146));
        TuxIconView tuxIconView5 = this.LLIZLLLIL;
        if (tuxIconView5 != null) {
            final AwS573S0100000_29 awS573S0100000_293 = new AwS573S0100000_29(this, 884);
            C786410Ut5.I7(null, tuxIconView5);
            tuxIconView5.setOnTouchListener(new View.OnTouchListener(awS573S0100000_293) { // from class: X.10sN
                public final Function0<Unit> LL;

                {
                    this.LL = awS573S0100000_293;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    Function0<Unit> function0;
                    Handler handler;
                    Handler handler2;
                    if (view2 == null || view2.getVisibility() != 0 || !view2.isClickable()) {
                        return false;
                    }
                    if (motionEvent != null) {
                        Integer numValueOf = Integer.valueOf(motionEvent.getActionMasked());
                        if (numValueOf != null) {
                            if (numValueOf.intValue() == 0) {
                                C786410Ut5.T4(view2, 0.4f);
                                View view3 = this.LLILLJJLI.LLILLJJLI;
                                if (view3 != null && (handler2 = view3.getHandler()) != null) {
                                    handler2.removeCallbacks(this.LLILLJJLI.LLJJ);
                                }
                            } else if (numValueOf.intValue() == 1 || numValueOf.intValue() == 3) {
                                C786410Ut5.T4(view2, 1.0f);
                                C19383610sU c19383610sU = this.LLILLJJLI;
                                View view4 = c19383610sU.LLILLJJLI;
                                if (view4 != null && (handler = view4.getHandler()) != null) {
                                    handler.removeCallbacks(c19383610sU.LLJJ);
                                    C786410Ut5.LJLIIL(2000L, handler, c19383610sU.LLJJ);
                                }
                            }
                        }
                        if (motionEvent != null && motionEvent.getActionMasked() == 1 && (function0 = this.LL) != null) {
                            function0.invoke();
                        }
                    }
                    return true;
                }
            });
        }
        final MutableLiveData<EnumC19384410sc> mutableLiveData = ((PipFeedWindowVM) this.LLIZ.getValue()).LLILLJJLI;
        final MutableLiveData<Boolean> mutableLiveData2 = ((PipFeedWindowVM) this.LLIZ.getValue()).LLILZ;
        final AFwS317S0000000_29 aFwS317S0000000_29 = AFwS317S0000000_29.get$arr$(15);
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(mutableLiveData, new Observer() { // from class: X.00uQ
            @Override // androidx.lifecycle.Observer
            public final void onChanged(T t) {
                mediatorLiveData.setValue(aFwS317S0000000_29.invoke(t, mutableLiveData2.getValue()));
            }
        });
        mediatorLiveData.addSource(mutableLiveData2, new Observer() { // from class: X.00uP
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                mediatorLiveData.setValue(aFwS317S0000000_29.invoke(mutableLiveData.getValue(), obj));
            }
        });
        final MutableLiveData<C19386210su> mutableLiveData3 = ((PipFeedWindowVM) this.LLIZ.getValue()).LL;
        final AFwS317S0000000_29 aFwS317S0000000_292 = AFwS317S0000000_29.get$arr$(16);
        final MediatorLiveData mediatorLiveData2 = new MediatorLiveData();
        mediatorLiveData2.addSource(mediatorLiveData, new Observer() { // from class: X.00uQ
            @Override // androidx.lifecycle.Observer
            public final void onChanged(T t) {
                mediatorLiveData2.setValue(aFwS317S0000000_292.invoke(t, mutableLiveData3.getValue()));
            }
        });
        mediatorLiveData2.addSource(mutableLiveData3, new Observer() { // from class: X.00uP
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                mediatorLiveData2.setValue(aFwS317S0000000_292.invoke(mediatorLiveData.getValue(), obj));
            }
        });
        mediatorLiveData2.observe(LJIIIIZZ(), new AObserverS189S0200000_29(view, this, 4));
    }

    public final void LJIILL(boolean z) {
        ValueAnimator valueAnimatorOfFloat;
        View view;
        View view2 = this.LLILLJJLI;
        if (view2 != null && view2.getVisibility() == 0) {
            if (z) {
                return;
            }
        } else if (!z) {
            return;
        }
        float[] fArr = {1.0f, 0.0f};
        if (z) {
            // fill-array-data instruction
            fArr[0] = 0.0f;
            fArr[1] = 1.0f;
            valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        } else {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        }
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(this, 21));
        valueAnimatorOfFloat.addListener(new ALAdapterS11S0110000_29(this, z, 1));
        valueAnimatorOfFloat.start();
        if (z && (view = this.LLILLJJLI) != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    public static void LJIILLIIL(EnumC19384110sZ enumC19384110sZ, TuxIconView tuxIconView) {
        if (tuxIconView == null) {
            return;
        }
        int i = C19383910sX.LIZIZ[enumC19384110sZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                    C786410Ut5.x5(tuxIconView, 0.5f);
                    tuxIconView.setClickable(false);
                    return;
                }
                throw new C1954807lC();
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, 4);
            return;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        C786410Ut5.x5(tuxIconView, 1.0f);
        tuxIconView.setClickable(true);
    }

    public final void LJIJ(ViewGroup viewGroup, EnumC19384410sc enumC19384410sc, boolean z) {
        Integer numValueOf;
        int i = C19383910sX.LIZ[enumC19384410sc.ordinal()];
        Integer num = null;
        int iValueOf = 0;
        if (i != 1) {
            if (i == 2) {
                TuxIconView tuxIconView = this.LLJILJIL;
                if (tuxIconView != null) {
                    C19386310sv.LIZJ(tuxIconView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
                    C426750GoL.LJIIIZ(tuxIconView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, null, false, 28);
                }
                TuxIconView tuxIconView2 = this.LLJIJIL;
                if (tuxIconView2 != null) {
                    C19386310sv.LIZJ(tuxIconView2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
                    num = null;
                    C426750GoL.LJIIIZ(tuxIconView2, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, false, 25);
                }
                View view = this.LLJILJILJ;
                if (view != null) {
                    C19386310sv.LIZJ(view, num, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))));
                }
                if (viewGroup != null) {
                    C426750GoL.LJIIIZ(viewGroup, num, num, num, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), false, 23);
                }
                TuxIconView tuxIconView3 = this.LLJI;
                if (tuxIconView3 != null) {
                    C19386310sv.LIZJ(tuxIconView3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))));
                    tuxIconView3.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                    tuxIconView3.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                    Integer num2 = num;
                    num = num;
                    C426750GoL.LJIIIZ(tuxIconView3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), num2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), num, false, 26);
                }
                TuxIconView tuxIconView4 = this.LLIZLLLIL;
                if (tuxIconView4 != null) {
                    C19386310sv.LIZJ(tuxIconView4, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))));
                    tuxIconView4.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                    tuxIconView4.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                    Integer num3 = num;
                    num = num;
                    C426750GoL.LJIIIZ(tuxIconView4, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), num3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), num, false, 26);
                }
                TuxIconView tuxIconView5 = this.LLJ;
                if (tuxIconView5 != null) {
                    C19386310sv.LIZJ(tuxIconView5, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))));
                    tuxIconView5.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                    tuxIconView5.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                    C426750GoL.LJIIIZ(tuxIconView5, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), num, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), num, false, 26);
                }
                View view2 = this.LLJILLL;
                if (view2 != null) {
                    C19386310sv.LIZJ(view2, num, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54))));
                }
            } else {
                throw new C1954807lC();
            }
        } else {
            TuxIconView tuxIconView6 = this.LLJILJIL;
            if (tuxIconView6 != null) {
                C19386310sv.LIZJ(tuxIconView6, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))));
                C426750GoL.LJIIIZ(tuxIconView6, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), null, null, false, 28);
            }
            TuxIconView tuxIconView7 = this.LLJIJIL;
            if (tuxIconView7 != null) {
                C19386310sv.LIZJ(tuxIconView7, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))));
                num = null;
                C426750GoL.LJIIIZ(tuxIconView7, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), null, false, 25);
            }
            View view3 = this.LLJILJILJ;
            if (view3 != null) {
                C19386310sv.LIZJ(view3, num, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))));
            }
            if (viewGroup != null) {
                Integer num4 = num;
                Integer num5 = num;
                num = num;
                C426750GoL.LJIIIZ(viewGroup, num4, num5, num, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))), false, 23);
            }
            TuxIconView tuxIconView8 = this.LLJI;
            if (tuxIconView8 != null) {
                C19386310sv.LIZJ(tuxIconView8, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44))));
                tuxIconView8.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                tuxIconView8.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
            }
            TuxIconView tuxIconView9 = this.LLIZLLLIL;
            if (tuxIconView9 != null) {
                C19386310sv.LIZJ(tuxIconView9, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52))));
                tuxIconView9.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
                tuxIconView9.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
                if (z) {
                    numValueOf = 0;
                } else {
                    iValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                    numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                }
                C426750GoL.LJIIIZ(tuxIconView9, iValueOf, num, numValueOf, num, false, 26);
            }
            TuxIconView tuxIconView10 = this.LLJ;
            if (tuxIconView10 != null) {
                C19386310sv.LIZJ(tuxIconView10, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44))));
                tuxIconView10.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                tuxIconView10.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
            }
            View view4 = this.LLJILLL;
            if (view4 != null) {
                C19386310sv.LIZJ(view4, num, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(66))));
            }
        }
        View view5 = this.LLILLJJLI;
        if (view5 != null) {
            view5.invalidate();
        }
    }
}
