package X;

import Y.ARunnableS122S0100000_22;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import com.zhiliaoapp.musically.R;
import irm.AkS30S0300000_22;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0n1q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1418960n1q extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LLJJL = 0;
    public final SmartImageView LL;
    public final SmartImageView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final RemoteImageView LLILZ;
    public final View LLILZIL;
    public final C427300GpE LLILZLL;
    public final C427300GpE LLIZ;
    public final View LLIZLLLIL;
    public final View LLJ;
    public final FrameLayout LLJI;
    public final TuxIconView LLJIJIL;
    public final TuxIconView LLJILJIL;
    public final TuxIconView LLJILJILJ;
    public final View LLJILLL;
    public final View LLJJ;
    public final TuxIconView LLJJI;
    public final View LLJJIII;
    public final View LLJJIJI;
    public final C19671011xk LLJJIJIIJIL;
    public final TuxIconView LLJJIJIL;
    public final View LLJJJ;
    public final View LLJJJIL;
    public final View LLJJJJ;
    public final TuxIconView LLJJJJJIL;
    public AutoCutThemeData LLJJJJLIIL;

    public final void X5() {
        final C427300GpE c427300GpE = this.LLILZLL;
        if (c427300GpE == null) {
            return;
        }
        if (c427300GpE.getWidth() > 0) {
            I5(c427300GpE);
        } else if (!c427300GpE.isLaidOut() || c427300GpE.isLayoutRequested()) {
            c427300GpE.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0n1v
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    view.removeOnLayoutChangeListener(this);
                    C1418960n1q c1418960n1q = this.LL;
                    C427300GpE c427300GpE2 = c427300GpE;
                    c1418960n1q.getClass();
                    C1418960n1q.I5(c427300GpE2);
                }
            });
        } else {
            I5(c427300GpE);
        }
    }

    public static void I5(C427300GpE c427300GpE) {
        String string;
        int i;
        TextPaint paint = c427300GpE.getPaint();
        CharSequence text = c427300GpE.getText();
        if (text == null || (string = text.toString()) == null) {
            string = "";
        }
        if (paint.measureText(string) < c427300GpE.getWidth()) {
            i = 17;
        } else {
            i = 8388611;
        }
        c427300GpE.setGravity(i);
    }

    public static final void V5(String str) {
        ((IToolsDebugGpService) ServiceManager.get().getService(IToolsDebugGpService.class)).isOpen();
    }

    public final void L5(Integer num) {
        boolean z;
        AutoCutThemeData autoCutThemeData = this.LLJJJJLIIL;
        int i = 0;
        if (autoCutThemeData != null && autoCutThemeData.templateType == EnumC1412640mre.AUTO_PICK_TEMPLATE.getValue()) {
            z = true;
        } else {
            z = false;
        }
        TuxIconView tuxIconView = this.LLJJJJJIL;
        if (tuxIconView != null) {
            if ((num == null || num.intValue() != 1) && !z) {
                i = 8;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, i);
        }
    }

    public final void N5(boolean z) {
        if (z && !C2176211AEx.LIZLLL()) {
            C427300GpE c427300GpE = this.LLILZLL;
            if (c427300GpE != null) {
                HandlerHook.viewPost(c427300GpE, new ARunnableS122S0100000_22(this, 31));
            }
            C427300GpE c427300GpE2 = this.LLIZ;
            if (c427300GpE2 != null) {
                HandlerHook.viewPost(c427300GpE2, new ARunnableS122S0100000_22(this, 32));
                return;
            }
            return;
        }
        C427300GpE c427300GpE3 = this.LLILZLL;
        if (c427300GpE3 != null) {
            c427300GpE3.setEllipsize(null);
        }
        View view = this.LLIZLLLIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        C427300GpE c427300GpE4 = this.LLIZ;
        if (c427300GpE4 != null) {
            c427300GpE4.setEllipsize(null);
        }
        View view2 = this.LLJ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        X5();
    }

    public final void P5(C0MJA c0mja) {
        int i = C1416060mxA.LIZ[c0mja.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    TuxIconView tuxIconView = this.LLJJI;
                    if (tuxIconView != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                    }
                    View view = this.LLJJIII;
                    if (view != null) {
                        C786410Ut5.LJLLLLLL(0, view);
                    }
                    TuxIconView tuxIconView2 = this.LLJJI;
                    if (tuxIconView2 != null) {
                        tuxIconView2.setIconRes(R.raw.icon_vertical_rectangle_play_fill);
                        return;
                    }
                    return;
                }
                throw new C1954807lC();
            }
            TuxIconView tuxIconView3 = this.LLJJI;
            if (tuxIconView3 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
            }
            View view2 = this.LLJJIII;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
            TuxIconView tuxIconView4 = this.LLJJI;
            if (tuxIconView4 == null) {
                return;
            }
            tuxIconView4.setIconRes(R.raw.icon_camera_single_note);
            return;
        }
        TuxIconView tuxIconView5 = this.LLJJI;
        if (tuxIconView5 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView5, 8);
        }
        View view3 = this.LLJJIII;
        if (view3 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view3);
    }

    public final void S5(boolean z) {
        if (z) {
            TuxIconView tuxIconView = this.LLJIJIL;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            }
            RemoteImageView remoteImageView = this.LLILZ;
            if (remoteImageView != null) {
                C786410Ut5.l(remoteImageView, 8);
            }
            SmartImageView smartImageView = this.LL;
            if (smartImageView != null) {
                C786410Ut5.LLFF(8, smartImageView);
            }
            SmartImageView smartImageView2 = this.LLILLJJLI;
            if (smartImageView2 != null) {
                C786410Ut5.LLFF(8, smartImageView2);
            }
            TuxTextView tuxTextView = this.LLILLL;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }
            View view = this.LLJJ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            View view2 = this.LLJILLL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            W5(null);
            return;
        }
        TuxIconView tuxIconView2 = this.LLJIJIL;
        if (tuxIconView2 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        }
        TuxIconView tuxIconView3 = this.LLJILJIL;
        if (tuxIconView3 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
        }
        TuxIconView tuxIconView4 = this.LLJILJILJ;
        if (tuxIconView4 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView4, 8);
        }
        RemoteImageView remoteImageView2 = this.LLILZ;
        if (remoteImageView2 != null) {
            C786410Ut5.l(remoteImageView2, 0);
        }
        SmartImageView smartImageView3 = this.LL;
        if (smartImageView3 != null) {
            C786410Ut5.LLFF(0, smartImageView3);
        }
        SmartImageView smartImageView4 = this.LLILLJJLI;
        if (smartImageView4 != null) {
            C786410Ut5.LLFF(0, smartImageView4);
        }
        TuxTextView tuxTextView2 = this.LLILLL;
        if (tuxTextView2 != null) {
            C786410Ut5.LLLLZLL(tuxTextView2, 0);
        }
        View view3 = this.LLJJ;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(0, view3);
        }
        View view4 = this.LLJILLL;
        if (view4 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, view4);
    }

    public final void U5(boolean z) {
        int i;
        View view = this.LLILZIL;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
        if (!z) {
            N5(false);
        }
    }

    public final void W5(AutoCutThemeData autoCutThemeData) {
        boolean z;
        int i;
        int i2 = 0;
        if (autoCutThemeData != null && autoCutThemeData.templateType == EnumC1412640mre.AUTO_PICK_TEMPLATE.getValue()) {
            z = true;
        } else {
            z = false;
        }
        View view = this.LLJJIJI;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
        TuxIconView tuxIconView = this.LLJJJJJIL;
        if (tuxIconView != null) {
            if (!z) {
                i2 = 8;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, i2);
        }
    }

    public final void T5(int i, boolean z) {
        if (z) {
            if (i == EnumC1417170myx.PHOTO_MODE_NONE.getIndex()) {
                C427300GpE c427300GpE = this.LLILZLL;
                if (c427300GpE != null) {
                    c427300GpE.setText(this.itemView.getContext().getResources().getString(2131846220));
                }
                View view = this.LLJILLL;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                }
                TuxIconView tuxIconView = this.LLJILJIL;
                if (tuxIconView != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                }
                TuxIconView tuxIconView2 = this.LLJILJILJ;
                if (tuxIconView2 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
                }
            } else if (i == EnumC1417170myx.SLIDE_SHOW.getIndex()) {
                C427300GpE c427300GpE2 = this.LLILZLL;
                if (c427300GpE2 != null) {
                    c427300GpE2.setText(this.itemView.getContext().getResources().getString(2131846221));
                }
                View view2 = this.LLJILLL;
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(0, view2);
                }
                TuxIconView tuxIconView3 = this.LLJILJILJ;
                if (tuxIconView3 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
                }
                TuxIconView tuxIconView4 = this.LLJILJIL;
                if (tuxIconView4 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView4, 8);
                }
            }
            RemoteImageView remoteImageView = this.LLILZ;
            if (remoteImageView != null) {
                C786410Ut5.l(remoteImageView, 8);
            }
            View view3 = this.LLJJ;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(8, view3);
            }
            W5(null);
            return;
        }
        TuxIconView tuxIconView5 = this.LLJILJIL;
        if (tuxIconView5 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView5, 8);
        }
        TuxIconView tuxIconView6 = this.LLJILJILJ;
        if (tuxIconView6 == null) {
            return;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView6, 8);
    }

    public final void R5(EnumC1416050mx9 enumC1416050mx9, Integer num, boolean z) {
        int i;
        int iIntValue;
        int i2;
        View view = this.LLJJJJ;
        if (view != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, view);
        }
        if (enumC1416050mx9 != null && (i = C1416060mxA.LIZIZ[enumC1416050mx9.ordinal()]) != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            C19671011xk c19671011xk = this.LLJJIJIIJIL;
                            if (c19671011xk != null) {
                                C786410Ut5.I1(c19671011xk, 8);
                            }
                            TuxIconView tuxIconView = this.LLJJIJIL;
                            if (tuxIconView != null) {
                                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                            }
                            View view2 = this.LLJJJ;
                            if (view2 != null) {
                                C786410Ut5.LJLLLLLL(0, view2);
                                return;
                            }
                            return;
                        }
                        throw new C1954807lC();
                    }
                    C19671011xk c19671011xk2 = this.LLJJIJIIJIL;
                    if (c19671011xk2 != null) {
                        C786410Ut5.I1(c19671011xk2, 8);
                    }
                    TuxIconView tuxIconView2 = this.LLJJIJIL;
                    if (tuxIconView2 != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
                    }
                    View view3 = this.LLJJJ;
                    if (view3 == null) {
                        return;
                    }
                    C786410Ut5.LJLLLLLL(8, view3);
                    return;
                }
                C19671011xk c19671011xk3 = this.LLJJIJIIJIL;
                if (c19671011xk3 != null) {
                    C786410Ut5.I1(c19671011xk3, 0);
                }
                C19671011xk c19671011xk4 = this.LLJJIJIIJIL;
                if (c19671011xk4 != null) {
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    c19671011xk4.setProgress(C13LZ.LJ(iIntValue, 0, 100));
                }
                TuxIconView tuxIconView3 = this.LLJJIJIL;
                if (tuxIconView3 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
                }
                View view4 = this.LLJJJ;
                if (view4 == null) {
                    return;
                }
                C786410Ut5.LJLLLLLL(8, view4);
                return;
            }
            C19671011xk c19671011xk5 = this.LLJJIJIIJIL;
            if (c19671011xk5 != null) {
                C786410Ut5.I1(c19671011xk5, 8);
            }
            TuxIconView tuxIconView4 = this.LLJJIJIL;
            if (tuxIconView4 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView4, 8);
            }
            View view5 = this.LLJJJ;
            if (view5 == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(8, view5);
            return;
        }
        C19671011xk c19671011xk6 = this.LLJJIJIIJIL;
        if (c19671011xk6 != null) {
            C786410Ut5.I1(c19671011xk6, 8);
        }
        TuxIconView tuxIconView5 = this.LLJJIJIL;
        if (tuxIconView5 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView5, 8);
        }
        View view6 = this.LLJJJ;
        if (view6 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view6);
    }

    public C1418960n1q(View view, boolean z, boolean z2, InterfaceC1631630sYr<? super View, ? super Integer, ? super AutoCutThemeData, ? super Boolean, Unit> interfaceC1631630sYr) {
        ViewGroup.LayoutParams layoutParams;
        int i;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        ViewGroup.LayoutParams layoutParams5;
        ViewGroup.LayoutParams layoutParams6;
        ViewGroup.LayoutParams layoutParams7;
        ViewGroup.LayoutParams layoutParams8;
        ViewGroup.LayoutParams layoutParams9;
        ViewGroup.LayoutParams layoutParams10;
        super(view);
        RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(R.id.xsh);
        this.LLILZ = remoteImageView;
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.xsi);
        this.LL = smartImageView;
        this.LLILLJJLI = (SmartImageView) view.findViewById(R.id.xsj);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.tyx);
        this.LLILLL = tuxTextView;
        if (tuxTextView != null) {
            if (tuxTextView.isLaidOut() && !tuxTextView.isLayoutRequested()) {
                Typeface typefaceLIZIZ = C1697580uHE.LIZIZ(0.0f, 900, 16.0f, 0.0f, null, 0.0f, 0, null, 249);
                if (typefaceLIZIZ != null) {
                    tuxTextView.setTypeface(typefaceLIZIZ);
                }
                tuxTextView.LJJJJI(16.0f);
            } else {
                tuxTextView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0n1s
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                        TuxTextView tuxTextView2;
                        view2.removeOnLayoutChangeListener(this);
                        Typeface typefaceLIZIZ2 = C1697580uHE.LIZIZ(0.0f, 900, 16.0f, 0.0f, null, 0.0f, 0, null, 249);
                        if ((view2 instanceof TuxTextView) && (tuxTextView2 = (TuxTextView) view2) != null) {
                            if (typefaceLIZIZ2 != null) {
                                tuxTextView2.setTypeface(typefaceLIZIZ2);
                            }
                            tuxTextView2.LJJJJI(16.0f);
                        }
                    }
                });
            }
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.f4y);
        this.LLJI = frameLayout;
        View viewFindViewById = view.findViewById(R.id.um0);
        this.LLILZIL = viewFindViewById;
        if (remoteImageView != null) {
            remoteImageView.setCornerRadius(C418440Gaw.LIZIZ(8));
        }
        if (remoteImageView != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1d, frameLayout.getContext());
            if (numLIZJ != null) {
                gradientDrawable.setColor(numLIZJ.intValue());
            }
            gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(8));
            remoteImageView.setBackground(gradientDrawable);
        }
        if (smartImageView != null) {
            C1447470nlp.LIZIZ(smartImageView, C418440Gaw.LIZIZ(10));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1d, frameLayout.getContext());
            if (numLIZJ2 != null) {
                gradientDrawable2.setColor(numLIZJ2.intValue());
            }
            gradientDrawable2.setCornerRadius(C418440Gaw.LIZIZ(10));
            smartImageView.setBackground(gradientDrawable2);
        }
        this.LLJJI = (TuxIconView) view.findViewById(R.id.l2a);
        this.LLJJIII = view.findViewById(R.id.l2e);
        View viewFindViewById2 = view.findViewById(R.id.amy);
        if (viewFindViewById2 != null) {
            float dimension = view.getResources().getDimension(R.dimen.b5);
            GradientDrawable gradientDrawable3 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216});
            gradientDrawable3.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, dimension, dimension, dimension, dimension});
            viewFindViewById2.setBackground(gradientDrawable3);
        } else {
            viewFindViewById2 = null;
        }
        this.LLJJIJI = viewFindViewById2;
        C19671011xk c19671011xk = (C19671011xk) view.findViewById(R.id.nnd);
        this.LLJJIJIIJIL = c19671011xk;
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.tep);
        this.LLJJIJIL = tuxIconView;
        View viewFindViewById3 = view.findViewById(R.id.nmv);
        this.LLJJJ = viewFindViewById3;
        this.LLJJJJ = view.findViewById(R.id.enn);
        this.LLJJJJJIL = (TuxIconView) view.findViewById(R.id.aok);
        this.LLJJJIL = view.findViewById(R.id.vf3);
        if (!C1418880n1i.LIZ() && !z && !z2) {
            if (viewFindViewById != null) {
                viewFindViewById.setBackgroundResource(R.drawable.a6v);
            }
        } else {
            if (viewFindViewById != null) {
                GradientDrawable gradientDrawable4 = new GradientDrawable();
                gradientDrawable4.setCornerRadius(C418440Gaw.LIZIZ(8));
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a00, new ContextThemeWrapper(view.getContext(), R.style.y0));
                if (numLIZJ3 != null) {
                    gradientDrawable4.setStroke(C0EGK.LIZ(2), numLIZJ3.intValue());
                }
                viewFindViewById.setBackground(gradientDrawable4);
            }
            ViewGroup.LayoutParams layoutParams11 = frameLayout.getLayoutParams();
            if (layoutParams11 != null) {
                layoutParams11.width = C0EGK.LIZ(74);
                layoutParams11.height = C0EGK.LIZ(74);
            }
            if (viewFindViewById != null && (layoutParams = viewFindViewById.getLayoutParams()) != null) {
                layoutParams.width = C0EGK.LIZ(74);
                layoutParams.height = C0EGK.LIZ(74);
            }
        }
        C427300GpE c427300GpE = (C427300GpE) view.findViewById(R.id.xsk);
        this.LLILZLL = c427300GpE;
        if (c427300GpE != null) {
            c427300GpE.setEllipsize(null);
        }
        C427300GpE c427300GpE2 = (C427300GpE) view.findViewById(R.id.bc6);
        this.LLIZ = c427300GpE2;
        if (c427300GpE2 != null) {
            c427300GpE2.setEllipsize(null);
        }
        if (C444960Hcc.LIZIZ()) {
            i = R.id.hji;
        } else {
            i = R.id.hjh;
        }
        View viewFindViewById4 = view.findViewById(i);
        this.LLIZLLLIL = viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.bc8);
        this.LLJ = viewFindViewById5;
        this.LLJIJIL = (TuxIconView) view.findViewById(R.id.pb3);
        this.LLJILJIL = (TuxIconView) view.findViewById(R.id.qcy);
        this.LLJILJILJ = (TuxIconView) view.findViewById(R.id.qd0);
        View viewFindViewById6 = view.findViewById(R.id.xsl);
        this.LLJILLL = viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.bc7);
        this.LLJJ = viewFindViewById7;
        if (((Boolean) C277570AuJ.LIZ.getValue()).booleanValue()) {
            ViewGroup.LayoutParams layoutParams12 = frameLayout.getLayoutParams();
            if (layoutParams12 != null) {
                layoutParams12.width = C0EGK.LIZ(77);
                layoutParams12.height = C0EGK.LIZ(100);
            }
            if (remoteImageView != null && (layoutParams10 = remoteImageView.getLayoutParams()) != null) {
                layoutParams10.width = C0EGK.LIZ(69);
                layoutParams10.height = C0EGK.LIZ(69);
            }
            if (viewFindViewById != null && (layoutParams9 = viewFindViewById.getLayoutParams()) != null) {
                layoutParams9.width = C0EGK.LIZ(77);
                layoutParams9.height = C0EGK.LIZ(100);
            }
            if (c19671011xk != null && (layoutParams8 = c19671011xk.getLayoutParams()) != null) {
                layoutParams8.width = C0EGK.LIZ(69);
                layoutParams8.height = C0EGK.LIZ(92);
            }
            if (viewFindViewById3 != null && (layoutParams7 = viewFindViewById3.getLayoutParams()) != null) {
                layoutParams7.width = C0EGK.LIZ(69);
                layoutParams7.height = C0EGK.LIZ(92);
            }
            if (tuxIconView != null && (layoutParams6 = tuxIconView.getLayoutParams()) != null) {
                layoutParams6.width = C0EGK.LIZ(69);
                layoutParams6.height = C0EGK.LIZ(92);
            }
            if (viewFindViewById2 != null && (layoutParams5 = viewFindViewById2.getLayoutParams()) != null) {
                layoutParams5.width = C0EGK.LIZ(69);
                layoutParams5.height = C0EGK.LIZ(46);
            }
            if (viewFindViewById6 != null && (layoutParams4 = viewFindViewById6.getLayoutParams()) != null) {
                layoutParams4.width = (int) (C0EGK.LIZIZ() * 67.0f);
                layoutParams4.height = C0EGK.LIZ(16);
            }
            if (c427300GpE != null && (layoutParams3 = c427300GpE.getLayoutParams()) != null) {
                layoutParams3.width = C0EGK.LIZ(67);
                layoutParams3.height = C0EGK.LIZ(16);
            }
            if (c427300GpE != null) {
                c427300GpE.setTextSize(2, 12.0f);
            }
            if (viewFindViewById7 != null && (layoutParams2 = viewFindViewById7.getLayoutParams()) != null) {
                layoutParams2.width = C0EGK.LIZ(67);
                layoutParams2.height = C0EGK.LIZ(16);
            }
            if (c427300GpE2 != null) {
                ViewGroup.LayoutParams layoutParams13 = c427300GpE2.getLayoutParams();
                if (layoutParams13 != null) {
                    layoutParams13.width = C0EGK.LIZ(67);
                    layoutParams13.height = C0EGK.LIZ(16);
                }
                c427300GpE2.setTextSize(2, 12.0f);
            }
            if (viewFindViewById != null) {
                GradientDrawable gradientDrawable5 = new GradientDrawable();
                gradientDrawable5.setCornerRadius(C418440Gaw.LIZIZ(Double.valueOf(14.35d)));
                Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a00, new ContextThemeWrapper(view.getContext(), R.style.y0));
                if (numLIZJ4 != null) {
                    gradientDrawable5.setStroke(C0EGK.LIZ(2), numLIZJ4.intValue());
                }
                viewFindViewById.setBackground(gradientDrawable5);
            }
        }
        if (z) {
            if (viewFindViewById4 != null) {
                viewFindViewById4.setBackgroundResource(R.drawable.a70);
            }
            if (viewFindViewById5 != null) {
                viewFindViewById5.setBackgroundResource(R.drawable.a70);
            }
        }
        C786410Ut5.I7(new AkS30S0300000_22(view, this, (InterfaceC1631630sYr) interfaceC1631630sYr, 0), view);
        view.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: X.0n1u
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                ((IToolsDebugGpService) ServiceManager.get().getService(IToolsDebugGpService.class)).isOpen();
                return false;
            }
        });
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new AkS30S0300000_22(view, this, (InterfaceC1631630sYr) interfaceC1631630sYr, 1));
        }
    }
}
