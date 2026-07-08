package X;

import Y.ACListenerS140S0100000_5;
import android.app.Activity;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.gamora.editorpro.capabilities.effects.adjustfilter.ui.HorizontalCenterLayoutManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EEZ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EEZ extends C0FC9<C0EEO, InterfaceC361200EEc> {
    public final Activity LLJJJJJIL;
    public final C1DRG LLJJJJLIIL;
    public ConstraintLayout LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public RecyclerView LLJL;
    public C367060EaG LLJLIL;
    public C367060EaG LLJLILLLLZIIL;
    public C367060EaG LLJLL;
    public TuxIconView LLJLLIL;
    public LinearLayout LLJLLL;
    public FrameLayout LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;

    public final C0EEW LLLLLJLJLL() {
        return (C0EEW) this.LLL.getValue();
    }

    public final RecyclerView LLLLLL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.h8u);
            this.LLJL = (RecyclerView) callbackFindViewById;
        }
        return (RecyclerView) callbackFindViewById;
    }

    public final ConstraintLayout LLLLLLIL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.h9y);
            this.LLJJL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final C367060EaG LLLLLLJ() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.h9z);
            this.LLJLIL = (C367060EaG) callbackFindViewById;
        }
        return (C367060EaG) callbackFindViewById;
    }

    public final C367060EaG LLLLLLL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.h_0);
            this.LLJLL = (C367060EaG) callbackFindViewById;
        }
        return (C367060EaG) callbackFindViewById;
    }

    public final C367060EaG LLLLLLLLL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJLILLLLZIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.h_2);
            this.LLJLILLLLZIIL = (C367060EaG) callbackFindViewById;
        }
        return (C367060EaG) callbackFindViewById;
    }

    public final TuxTextView LLLLLLLLLL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.h_3);
            this.LLJJLIIIJLLLLLLLZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void LLLLLLZ(C0EEV c0eev) {
        Integer numLIZJ;
        int i;
        C0EEX c0eex = c0eev.LIZ;
        Context contextRequireSceneContext = requireSceneContext();
        if (contextRequireSceneContext != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a01, contextRequireSceneContext)) != null) {
            int iIntValue = numLIZJ.intValue();
            C367060EaG c367060EaGLLLLLLJ = LLLLLLJ();
            if (c367060EaGLLLLLLJ != null) {
                c367060EaGLLLLLLJ.setProgress(C814420VxA.LIZ(c0eev.LJFF * ((double) 200)));
            }
            C367060EaG c367060EaGLLLLLLLLL = LLLLLLLLL();
            if (c367060EaGLLLLLLLLL != null) {
                c367060EaGLLLLLLLLL.setProgress(C814420VxA.LIZ(c0eev.LJI * ((double) 200)));
            }
            C367060EaG c367060EaGLLLLLLL = LLLLLLL();
            if (c367060EaGLLLLLLL != null) {
                c367060EaGLLLLLLL.setProgress(C814420VxA.LIZ(c0eev.LJII * ((double) 200)));
            }
            if (((Boolean) this.LLLF.getValue()).booleanValue()) {
                i = 10;
            } else {
                i = 24;
            }
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
            C367060EaG c367060EaGLLLLLLJ2 = LLLLLLJ();
            if (c367060EaGLLLLLLJ2 != null) {
                C366980Ea8 c366980Ea8 = new C366980Ea8();
                c366980Ea8.LIZIZ.setColor(iIntValue);
                c366980Ea8.LIZJ = new LinearGradient(0.0f, 0.0f, C0FU0.LIZJ(this.LLJJJJJIL) - (iLIZIZ * 2), C418440Gaw.LIZIZ(4), c0eex.LIZIZ.getFirst().intValue(), c0eex.LIZIZ.getSecond().intValue(), Shader.TileMode.MIRROR);
                c366980Ea8.invalidateSelf();
                c367060EaGLLLLLLJ2.setProgressDrawable(c366980Ea8);
            }
            C367060EaG c367060EaGLLLLLLLLL2 = LLLLLLLLL();
            if (c367060EaGLLLLLLLLL2 != null) {
                C366980Ea8 c366980Ea82 = new C366980Ea8();
                c366980Ea82.LIZIZ.setColor(iIntValue);
                c366980Ea82.LIZJ = new LinearGradient(0.0f, 0.0f, C0FU0.LIZJ(this.LLJJJJJIL) - (iLIZIZ * 2), C418440Gaw.LIZIZ(20), c0eex.LIZJ.getFirst().intValue(), c0eex.LIZJ.getSecond().intValue(), Shader.TileMode.MIRROR);
                c366980Ea82.invalidateSelf();
                c367060EaGLLLLLLLLL2.setProgressDrawable(c366980Ea82);
            }
            C367060EaG c367060EaGLLLLLLL2 = LLLLLLL();
            if (c367060EaGLLLLLLL2 != null) {
                C366980Ea8 c366980Ea83 = new C366980Ea8();
                c366980Ea83.LIZIZ.setColor(iIntValue);
                c366980Ea83.LIZJ = new LinearGradient(0.0f, 0.0f, C0FU0.LIZJ(this.LLJJJJJIL) - (iLIZIZ * 2), C418440Gaw.LIZIZ(20), c0eex.LIZLLL.getFirst().intValue(), c0eex.LIZLLL.getSecond().intValue(), Shader.TileMode.MIRROR);
                c366980Ea83.invalidateSelf();
                c367060EaGLLLLLLL2.setProgressDrawable(c366980Ea83);
            }
        }
    }

    public C0EEZ(C1DRG c1drg, Activity activity) {
        super(c1drg);
        this.LLJJJJJIL = activity;
        this.LLJJJJLIIL = c1drg;
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 434));
        this.LLL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(135));
        this.LLLF = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(137));
    }

    public static final void LLLLLLLZIL(View view, boolean z) {
        if (view == null) {
            return;
        }
        if (z) {
            C786410Ut5.T4(view, 1.0f);
            view.setOnTouchListener(null);
        } else {
            C786410Ut5.T4(view, 0.36f);
            view.setOnTouchListener(new View.OnTouchListener() { // from class: X.0EEd
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return true;
                }
            });
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        int measuredHeight;
        int iNP;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorTranslationY;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator interpolator;
        View view2;
        super.onViewCreated(view, bundle);
        if (!((Boolean) this.LLLF.getValue()).booleanValue()) {
            ConstraintLayout constraintLayoutLLLLLLIL = LLLLLLIL();
            if (constraintLayoutLLLLLLIL != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.bn);
                c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(12));
                c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(12));
                constraintLayoutLLLLLLIL.setBackground(c384050F3z.LIZ(view.getContext()));
            }
            ConstraintLayout constraintLayoutLLLLLLIL2 = LLLLLLIL();
            if (constraintLayoutLLLLLLIL2 != null) {
                C786410Ut5.Y7(constraintLayoutLLLLLLIL2, new View.OnClickListener() { // from class: X.0EEe
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                    }
                });
            }
            ConstraintLayout constraintLayoutLLLLLLIL3 = LLLLLLIL();
            if (constraintLayoutLLLLLLIL3 != null && (layoutParams = constraintLayoutLLLLLLIL3.getLayoutParams()) != null) {
                Object parent = view.getParent();
                if ((parent instanceof View) && (view2 = (View) parent) != null) {
                    measuredHeight = view2.getMeasuredHeight();
                } else {
                    measuredHeight = 0;
                }
                layoutParams.height = measuredHeight / 2;
                InterfaceC360570EBr interfaceC360570EBr = (InterfaceC360570EBr) this.LLJZIJLIL.getValue();
                if (interfaceC360570EBr != null) {
                    iNP = interfaceC360570EBr.NP();
                } else {
                    iNP = 0;
                }
                layoutParams.height = Math.max(layoutParams.height, Math.max(iNP, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(360))));
                ConstraintLayout constraintLayoutLLLLLLIL4 = LLLLLLIL();
                if (constraintLayoutLLLLLLIL4 != null) {
                    constraintLayoutLLLLLLIL4.requestLayout();
                }
                ConstraintLayout constraintLayoutLLLLLLIL5 = LLLLLLIL();
                if (constraintLayoutLLLLLLIL5 != null) {
                    C786410Ut5.jd(constraintLayoutLLLLLLIL5, layoutParams.height);
                }
                ConstraintLayout constraintLayoutLLLLLLIL6 = LLLLLLIL();
                if (constraintLayoutLLLLLLIL6 != null && (viewPropertyAnimatorAnimate = constraintLayoutLLLLLLIL6.animate()) != null && (viewPropertyAnimatorTranslationY = viewPropertyAnimatorAnimate.translationY(0.0f)) != null && (duration = viewPropertyAnimatorTranslationY.setDuration(350L)) != null && (interpolator = duration.setInterpolator(C1619980sG4.LJIILIIL())) != null) {
                    interpolator.start();
                }
            }
        } else {
            View viewRequireView = requireView();
            KeyEvent.Callback callbackFindViewById = this.LLJLLIL;
            if (callbackFindViewById == null) {
                callbackFindViewById = viewRequireView.findViewById(R.id.h8s);
                this.LLJLLIL = (TuxIconView) callbackFindViewById;
            }
            TuxIconView tuxIconView = (TuxIconView) callbackFindViewById;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            }
        }
        RecyclerView recyclerViewLLLLLL = LLLLLL();
        if (recyclerViewLLLLLL != null) {
            recyclerViewLLLLLL.setLayoutManager(new HorizontalCenterLayoutManager(recyclerViewLLLLLL.getContext()));
            recyclerViewLLLLLL.setAdapter(LLLLLJLJLL());
            recyclerViewLLLLLL.setItemAnimator(null);
        }
        TuxTextView tuxTextViewLLLLLLLLLL = LLLLLLLLLL();
        if (tuxTextViewLLLLLLLLLL != null) {
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.zh);
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
            tuxTextViewLLLLLLLLLL.setBackground(c384050F3z2.LIZ(view.getContext()));
        }
        Activity activity = this.mActivity;
        if (activity != null) {
            int iLIZJ = C0FU0.LIZJ(activity);
            int iLIZIZ = iLIZJ - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30)) * 2);
            if (iLIZJ < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(375))) {
                i = 25;
            } else {
                i = 29;
            }
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
            int itemCount = (iLIZIZ - (LLLLLJLJLL().getItemCount() * iLIZIZ2)) / (LLLLLJLJLL().getItemCount() - 1);
            C0EEW c0eewLLLLLJLJLL = LLLLLJLJLL();
            c0eewLLLLLJLJLL.LLILZ = Integer.valueOf(iLIZIZ2);
            c0eewLLLLLJLJLL.LLILZIL = itemCount;
            c0eewLLLLLJLJLL.notifyDataSetChanged();
        }
        LLLLLJLJLL().LLILLJJLI = new C0EEY(this);
        LLLLLLLZIL(LLLLLLJ(), false);
        LLLLLLLZIL(LLLLLLLLL(), false);
        LLLLLLLZIL(LLLLLLL(), false);
        C367060EaG c367060EaGLLLLLLJ = LLLLLLJ();
        if (c367060EaGLLLLLLJ != null) {
            final C0E4K c0e4k = C0E4K.HUE;
            C786410Ut5.zb(c367060EaGLLLLLLJ, new SeekBar.OnSeekBarChangeListener(c0e4k) { // from class: X.0EEb
                public final C0E4K LL;

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStartTrackingTouch(SeekBar seekBar) {
                    C367060EaG c367060EaG;
                    C0EEV c0eevLLLFZ = this.LLILLJJLI.LLLLLJLJLL().LLLFZ();
                    if (c0eevLLLFZ == null) {
                        return;
                    }
                    this.LLILLJJLI.LLLLIL().LIZLLL(c0eevLLLFZ, this.LL);
                    if ((seekBar instanceof C367060EaG) && (c367060EaG = (C367060EaG) seekBar) != null) {
                        c367060EaG.LJII(true);
                    }
                    TuxTextView tuxTextViewLLLLLLLLLL2 = this.LLILLJJLI.LLLLLLLLLL();
                    if (tuxTextViewLLLLLLLLLL2 != null) {
                        C12C5.LIZIZ(tuxTextViewLLLLLLLLLL2, 0L, 0.0f, null, 7);
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStopTrackingTouch(SeekBar seekBar) {
                    C367060EaG c367060EaG;
                    C0EEV c0eevLLLFZ = this.LLILLJJLI.LLLLLJLJLL().LLLFZ();
                    if (c0eevLLLFZ == null) {
                        return;
                    }
                    this.LLILLJJLI.LLLLIL().LIZJ(c0eevLLLFZ);
                    if ((seekBar instanceof C367060EaG) && (c367060EaG = (C367060EaG) seekBar) != null) {
                        c367060EaG.LJII(false);
                    }
                    TuxTextView tuxTextViewLLLLLLLLLL2 = this.LLILLJJLI.LLLLLLLLLL();
                    if (tuxTextViewLLLLLLLLLL2 != null) {
                        C786410Ut5.B5(tuxTextViewLLLLLLLLLL2, 1.0f);
                    }
                    TuxTextView tuxTextViewLLLLLLLLLL3 = this.LLILLJJLI.LLLLLLLLLL();
                    if (tuxTextViewLLLLLLLLLL3 != null) {
                        C12C5.LIZJ(tuxTextViewLLLLLLLLLL3, 0L, null, AFwS191S0000000_5.get$arr$(133), 7);
                    }
                }

                {
                    this.LL = c0e4k;
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
                    C0EEV c0eevLLLFZ;
                    float f;
                    if (seekBar == null || !z || (c0eevLLLFZ = this.LLILLJJLI.LLLLLJLJLL().LLLFZ()) == null) {
                        return;
                    }
                    this.LLILLJJLI.LLLLIL().LIZIZ(i2, z, c0eevLLLFZ, this.LL);
                    C0EEZ c0eez = this.LLILLJJLI;
                    c0eez.getClass();
                    int left = seekBar.getLeft() + seekBar.getPaddingStart();
                    int top = seekBar.getTop();
                    View viewRequireView2 = c0eez.requireView();
                    View viewFindViewById = c0eez.LLJLLL;
                    if (viewFindViewById == null) {
                        viewFindViewById = viewRequireView2.findViewById(R.id.h_1);
                        c0eez.LLJLLL = (LinearLayout) viewFindViewById;
                    }
                    int top2 = top + viewFindViewById.getTop();
                    int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(53));
                    int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(33));
                    float f2 = left;
                    float progress = seekBar.getProgress();
                    int max = seekBar.getMax();
                    boolean z2 = true;
                    if (max < 1) {
                        max = 1;
                    }
                    float width = f2 + ((progress / max) * (seekBar.getWidth() - (seekBar.getPaddingStart() * 2)));
                    TuxTextView tuxTextViewLLLLLLLLLL2 = c0eez.LLLLLLLLLL();
                    if (tuxTextViewLLLLLLLLLL2 != null) {
                        Context contextRequireSceneContext = c0eez.requireSceneContext();
                        if (contextRequireSceneContext == null || !C426750GoL.LIZLLL(contextRequireSceneContext)) {
                            z2 = false;
                        }
                        float f3 = iLIZIZ3 / 2.0f;
                        if (z2) {
                            f = f3 - width;
                        } else {
                            f = width - f3;
                        }
                        C786410Ut5.Vc(tuxTextViewLLLLLLLLLL2, f);
                    }
                    TuxTextView tuxTextViewLLLLLLLLLL3 = c0eez.LLLLLLLLLL();
                    if (tuxTextViewLLLLLLLLLL3 != null) {
                        C786410Ut5.wd(tuxTextViewLLLLLLLLLL3, (top2 - iLIZIZ4) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                    }
                    TuxTextView tuxTextViewLLLLLLLLLL4 = c0eez.LLLLLLLLLL();
                    if (tuxTextViewLLLLLLLLLL4 != null) {
                        tuxTextViewLLLLLLLLLL4.setText(String.valueOf(seekBar.getProgress() - 100));
                    }
                }
            });
        }
        C367060EaG c367060EaGLLLLLLLLL = LLLLLLLLL();
        if (c367060EaGLLLLLLLLL != null) {
            final C0E4K c0e4k2 = C0E4K.SATURATION;
            C786410Ut5.zb(c367060EaGLLLLLLLLL, new SeekBar.OnSeekBarChangeListener(c0e4k2) { // from class: X.0EEb
                public final C0E4K LL;

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStartTrackingTouch(SeekBar seekBar) {
                    C367060EaG c367060EaG;
                    C0EEV c0eevLLLFZ = this.LLILLJJLI.LLLLLJLJLL().LLLFZ();
                    if (c0eevLLLFZ == null) {
                        return;
                    }
                    this.LLILLJJLI.LLLLIL().LIZLLL(c0eevLLLFZ, this.LL);
                    if ((seekBar instanceof C367060EaG) && (c367060EaG = (C367060EaG) seekBar) != null) {
                        c367060EaG.LJII(true);
                    }
                    TuxTextView tuxTextViewLLLLLLLLLL2 = this.LLILLJJLI.LLLLLLLLLL();
                    if (tuxTextViewLLLLLLLLLL2 != null) {
                        C12C5.LIZIZ(tuxTextViewLLLLLLLLLL2, 0L, 0.0f, null, 7);
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStopTrackingTouch(SeekBar seekBar) {
                    C367060EaG c367060EaG;
                    C0EEV c0eevLLLFZ = this.LLILLJJLI.LLLLLJLJLL().LLLFZ();
                    if (c0eevLLLFZ == null) {
                        return;
                    }
                    this.LLILLJJLI.LLLLIL().LIZJ(c0eevLLLFZ);
                    if ((seekBar instanceof C367060EaG) && (c367060EaG = (C367060EaG) seekBar) != null) {
                        c367060EaG.LJII(false);
                    }
                    TuxTextView tuxTextViewLLLLLLLLLL2 = this.LLILLJJLI.LLLLLLLLLL();
                    if (tuxTextViewLLLLLLLLLL2 != null) {
                        C786410Ut5.B5(tuxTextViewLLLLLLLLLL2, 1.0f);
                    }
                    TuxTextView tuxTextViewLLLLLLLLLL3 = this.LLILLJJLI.LLLLLLLLLL();
                    if (tuxTextViewLLLLLLLLLL3 != null) {
                        C12C5.LIZJ(tuxTextViewLLLLLLLLLL3, 0L, null, AFwS191S0000000_5.get$arr$(133), 7);
                    }
                }

                {
                    this.LL = c0e4k2;
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
                    C0EEV c0eevLLLFZ;
                    float f;
                    if (seekBar == null || !z || (c0eevLLLFZ = this.LLILLJJLI.LLLLLJLJLL().LLLFZ()) == null) {
                        return;
                    }
                    this.LLILLJJLI.LLLLIL().LIZIZ(i2, z, c0eevLLLFZ, this.LL);
                    C0EEZ c0eez = this.LLILLJJLI;
                    c0eez.getClass();
                    int left = seekBar.getLeft() + seekBar.getPaddingStart();
                    int top = seekBar.getTop();
                    View viewRequireView2 = c0eez.requireView();
                    View viewFindViewById = c0eez.LLJLLL;
                    if (viewFindViewById == null) {
                        viewFindViewById = viewRequireView2.findViewById(R.id.h_1);
                        c0eez.LLJLLL = (LinearLayout) viewFindViewById;
                    }
                    int top2 = top + viewFindViewById.getTop();
                    int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(53));
                    int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(33));
                    float f2 = left;
                    float progress = seekBar.getProgress();
                    int max = seekBar.getMax();
                    boolean z2 = true;
                    if (max < 1) {
                        max = 1;
                    }
                    float width = f2 + ((progress / max) * (seekBar.getWidth() - (seekBar.getPaddingStart() * 2)));
                    TuxTextView tuxTextViewLLLLLLLLLL2 = c0eez.LLLLLLLLLL();
                    if (tuxTextViewLLLLLLLLLL2 != null) {
                        Context contextRequireSceneContext = c0eez.requireSceneContext();
                        if (contextRequireSceneContext == null || !C426750GoL.LIZLLL(contextRequireSceneContext)) {
                            z2 = false;
                        }
                        float f3 = iLIZIZ3 / 2.0f;
                        if (z2) {
                            f = f3 - width;
                        } else {
                            f = width - f3;
                        }
                        C786410Ut5.Vc(tuxTextViewLLLLLLLLLL2, f);
                    }
                    TuxTextView tuxTextViewLLLLLLLLLL3 = c0eez.LLLLLLLLLL();
                    if (tuxTextViewLLLLLLLLLL3 != null) {
                        C786410Ut5.wd(tuxTextViewLLLLLLLLLL3, (top2 - iLIZIZ4) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                    }
                    TuxTextView tuxTextViewLLLLLLLLLL4 = c0eez.LLLLLLLLLL();
                    if (tuxTextViewLLLLLLLLLL4 != null) {
                        tuxTextViewLLLLLLLLLL4.setText(String.valueOf(seekBar.getProgress() - 100));
                    }
                }
            });
        }
        C367060EaG c367060EaGLLLLLLL = LLLLLLL();
        if (c367060EaGLLLLLLL != null) {
            final C0E4K c0e4k3 = C0E4K.LIGHTNESS;
            C786410Ut5.zb(c367060EaGLLLLLLL, new SeekBar.OnSeekBarChangeListener(c0e4k3) { // from class: X.0EEb
                public final C0E4K LL;

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStartTrackingTouch(SeekBar seekBar) {
                    C367060EaG c367060EaG;
                    C0EEV c0eevLLLFZ = this.LLILLJJLI.LLLLLJLJLL().LLLFZ();
                    if (c0eevLLLFZ == null) {
                        return;
                    }
                    this.LLILLJJLI.LLLLIL().LIZLLL(c0eevLLLFZ, this.LL);
                    if ((seekBar instanceof C367060EaG) && (c367060EaG = (C367060EaG) seekBar) != null) {
                        c367060EaG.LJII(true);
                    }
                    TuxTextView tuxTextViewLLLLLLLLLL2 = this.LLILLJJLI.LLLLLLLLLL();
                    if (tuxTextViewLLLLLLLLLL2 != null) {
                        C12C5.LIZIZ(tuxTextViewLLLLLLLLLL2, 0L, 0.0f, null, 7);
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStopTrackingTouch(SeekBar seekBar) {
                    C367060EaG c367060EaG;
                    C0EEV c0eevLLLFZ = this.LLILLJJLI.LLLLLJLJLL().LLLFZ();
                    if (c0eevLLLFZ == null) {
                        return;
                    }
                    this.LLILLJJLI.LLLLIL().LIZJ(c0eevLLLFZ);
                    if ((seekBar instanceof C367060EaG) && (c367060EaG = (C367060EaG) seekBar) != null) {
                        c367060EaG.LJII(false);
                    }
                    TuxTextView tuxTextViewLLLLLLLLLL2 = this.LLILLJJLI.LLLLLLLLLL();
                    if (tuxTextViewLLLLLLLLLL2 != null) {
                        C786410Ut5.B5(tuxTextViewLLLLLLLLLL2, 1.0f);
                    }
                    TuxTextView tuxTextViewLLLLLLLLLL3 = this.LLILLJJLI.LLLLLLLLLL();
                    if (tuxTextViewLLLLLLLLLL3 != null) {
                        C12C5.LIZJ(tuxTextViewLLLLLLLLLL3, 0L, null, AFwS191S0000000_5.get$arr$(133), 7);
                    }
                }

                {
                    this.LL = c0e4k3;
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
                    C0EEV c0eevLLLFZ;
                    float f;
                    if (seekBar == null || !z || (c0eevLLLFZ = this.LLILLJJLI.LLLLLJLJLL().LLLFZ()) == null) {
                        return;
                    }
                    this.LLILLJJLI.LLLLIL().LIZIZ(i2, z, c0eevLLLFZ, this.LL);
                    C0EEZ c0eez = this.LLILLJJLI;
                    c0eez.getClass();
                    int left = seekBar.getLeft() + seekBar.getPaddingStart();
                    int top = seekBar.getTop();
                    View viewRequireView2 = c0eez.requireView();
                    View viewFindViewById = c0eez.LLJLLL;
                    if (viewFindViewById == null) {
                        viewFindViewById = viewRequireView2.findViewById(R.id.h_1);
                        c0eez.LLJLLL = (LinearLayout) viewFindViewById;
                    }
                    int top2 = top + viewFindViewById.getTop();
                    int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(53));
                    int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(33));
                    float f2 = left;
                    float progress = seekBar.getProgress();
                    int max = seekBar.getMax();
                    boolean z2 = true;
                    if (max < 1) {
                        max = 1;
                    }
                    float width = f2 + ((progress / max) * (seekBar.getWidth() - (seekBar.getPaddingStart() * 2)));
                    TuxTextView tuxTextViewLLLLLLLLLL2 = c0eez.LLLLLLLLLL();
                    if (tuxTextViewLLLLLLLLLL2 != null) {
                        Context contextRequireSceneContext = c0eez.requireSceneContext();
                        if (contextRequireSceneContext == null || !C426750GoL.LIZLLL(contextRequireSceneContext)) {
                            z2 = false;
                        }
                        float f3 = iLIZIZ3 / 2.0f;
                        if (z2) {
                            f = f3 - width;
                        } else {
                            f = width - f3;
                        }
                        C786410Ut5.Vc(tuxTextViewLLLLLLLLLL2, f);
                    }
                    TuxTextView tuxTextViewLLLLLLLLLL3 = c0eez.LLLLLLLLLL();
                    if (tuxTextViewLLLLLLLLLL3 != null) {
                        C786410Ut5.wd(tuxTextViewLLLLLLLLLL3, (top2 - iLIZIZ4) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                    }
                    TuxTextView tuxTextViewLLLLLLLLLL4 = c0eez.LLLLLLLLLL();
                    if (tuxTextViewLLLLLLLLLL4 != null) {
                        tuxTextViewLLLLLLLLLL4.setText(String.valueOf(seekBar.getProgress() - 100));
                    }
                }
            });
        }
        C367060EaG c367060EaGLLLLLLJ2 = LLLLLLJ();
        if (c367060EaGLLLLLLJ2 != null) {
            float fLIZIZ = C418440Gaw.LIZIZ(20);
            float fLIZIZ2 = C418440Gaw.LIZIZ(24);
            c367060EaGLLLLLLJ2.LLJJJJJIL = fLIZIZ;
            c367060EaGLLLLLLJ2.LLJJJJLIIL = fLIZIZ2;
        }
        C367060EaG c367060EaGLLLLLLL2 = LLLLLLL();
        if (c367060EaGLLLLLLL2 != null) {
            float fLIZIZ3 = C418440Gaw.LIZIZ(20);
            float fLIZIZ4 = C418440Gaw.LIZIZ(24);
            c367060EaGLLLLLLL2.LLJJJJJIL = fLIZIZ3;
            c367060EaGLLLLLLL2.LLJJJJLIIL = fLIZIZ4;
        }
        C367060EaG c367060EaGLLLLLLLLL2 = LLLLLLLLL();
        if (c367060EaGLLLLLLLLL2 != null) {
            float fLIZIZ5 = C418440Gaw.LIZIZ(20);
            float fLIZIZ6 = C418440Gaw.LIZIZ(24);
            c367060EaGLLLLLLLLL2.LLJJJJJIL = fLIZIZ5;
            c367060EaGLLLLLLLLL2.LLJJJJLIIL = fLIZIZ6;
        }
        if (C357780E0y.LIZ()) {
            View viewRequireView2 = requireView();
            KeyEvent.Callback callbackFindViewById2 = this.LLJZ;
            if (callbackFindViewById2 == null) {
                callbackFindViewById2 = viewRequireView2.findViewById(R.id.h8t);
                this.LLJZ = (FrameLayout) callbackFindViewById2;
            }
            ViewGroup viewGroup = (ViewGroup) callbackFindViewById2;
            if (viewGroup != null) {
                C0EG9.LIZ(viewGroup, new AwS549S0100000_5(this, 439));
            }
        } else {
            View viewRequireView3 = requireView();
            KeyEvent.Callback callbackFindViewById3 = this.LLJLLIL;
            if (callbackFindViewById3 == null) {
                callbackFindViewById3 = viewRequireView3.findViewById(R.id.h8s);
                this.LLJLLIL = (TuxIconView) callbackFindViewById3;
            }
            TuxIconView tuxIconView2 = (TuxIconView) callbackFindViewById3;
            if (tuxIconView2 != null) {
                C786410Ut5.a9(tuxIconView2, new ACListenerS140S0100000_5(this, 40));
            }
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EEP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0EEO) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 369));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EEQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0EEO) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 371));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EER
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0EEO) obj).LIZJ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 372));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EES
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0EEO) obj).LIZLLL;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 374));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EET
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0EEO) obj).LJ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 368));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (((Boolean) this.LLLF.getValue()).booleanValue()) {
            i = R.layout.byz;
        } else {
            i = R.layout.byy;
        }
        return (ViewGroup) C786410Ut5.Td(layoutInflater, i, viewGroup, false);
    }
}
