package X;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EFe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C361480EFe extends AbstractC1664490tPr<C361520EFi, C361540EFk> {
    public View LLJJJIL;
    public View LLJJJJ;
    public C367060EaG LLJJJJJIL;
    public C367060EaG LLJJJJLIIL;
    public TuxTextView LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public TuxTextView LLJLIL;
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 397));
    public final C01GW LLJLL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(124));

    public final Pair<Integer, Integer> LLLLLJLJLL() {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0E48 c0e48 = ((C360050E9r) this.LLJLILLLLZIIL.getValue()).LLILLJJLI;
        return new Pair<>(0, Integer.valueOf((int) Math.min((c0e48 == null || (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) == null) ? 0L : nLETrackSlotLLLLLLIL.getDuration() / ((long) 2), 10000000L)));
    }

    public final long LLLLLJIL(EnumC361490EFf enumC361490EFf) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        Pair<Long, Long> pair;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        C0E48 c0e48 = ((C360050E9r) this.LLJLILLLLZIIL.getValue()).LLILLJJLI;
        if (c0e48 != null) {
            nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL();
        } else {
            nLETrackSlotLLLLLLIL = null;
        }
        long jLongValue = 0;
        if (nLETrackSlotLLLLLLIL != null) {
            C0E48 c0e482 = ((C360050E9r) this.LLJLILLLLZIIL.getValue()).LLILLJJLI;
            if (c0e482 == null || (interfaceC351350Dq1LLFII = c0e482.LLFII()) == null || (pair = interfaceC351350Dq1LLFII.LJJIJ(nLETrackSlotLLLLLLIL)) == null) {
                pair = new Pair<>(0L, 0L);
            }
            jLongValue = pair.getFirst().longValue();
            long jLongValue2 = pair.getSecond().longValue();
            int iOrdinal = enumC361490EFf.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    return jLongValue2;
                }
                throw new C1954807lC();
            }
        }
        return jLongValue;
    }

    public final void LLLLLL(EnumC361490EFf enumC361490EFf) {
        C367060EaG c367060EaG;
        View view;
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        AwS584S0100000_5 awS584S0100000_5;
        AwS584S0100000_5 awS584S0100000_52;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator duration;
        int iOrdinal = enumC361490EFf.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                c367060EaG = this.LLJJJJLIIL;
            } else {
                throw new C1954807lC();
            }
        } else {
            c367060EaG = this.LLJJJJJIL;
        }
        int iOrdinal2 = enumC361490EFf.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                view = this.LLJJJJ;
            } else {
                throw new C1954807lC();
            }
        } else {
            view = this.LLJJJIL;
        }
        int iOrdinal3 = enumC361490EFf.ordinal();
        if (iOrdinal3 != 0) {
            if (iOrdinal3 == 1) {
                tuxTextView = this.LLJJLIIIJLLLLLLLZ;
            } else {
                throw new C1954807lC();
            }
        } else {
            tuxTextView = this.LLJJL;
        }
        int iOrdinal4 = enumC361490EFf.ordinal();
        if (iOrdinal4 != 0) {
            if (iOrdinal4 == 1) {
                tuxTextView2 = this.LLJLIL;
            } else {
                throw new C1954807lC();
            }
        } else {
            tuxTextView2 = this.LLJL;
        }
        int iOrdinal5 = enumC361490EFf.ordinal();
        if (iOrdinal5 != 0) {
            if (iOrdinal5 == 1) {
                awS584S0100000_5 = new AwS584S0100000_5(this, 350);
            } else {
                throw new C1954807lC();
            }
        } else {
            awS584S0100000_5 = new AwS584S0100000_5(this, 349);
        }
        int iOrdinal6 = enumC361490EFf.ordinal();
        if (iOrdinal6 != 0) {
            if (iOrdinal6 == 1) {
                awS584S0100000_52 = new AwS584S0100000_5(this, 348);
            } else {
                throw new C1954807lC();
            }
        } else {
            awS584S0100000_52 = new AwS584S0100000_5(this, 347);
        }
        Pair<Integer, Integer> pairLLLLLJLJLL = LLLLLJLJLL();
        int iIntValue = pairLLLLLJLJLL.getFirst().intValue();
        int iIntValue2 = pairLLLLLJLJLL.getSecond().intValue();
        long jLLLLLJIL = LLLLLJIL(enumC361490EFf);
        int iOrdinal7 = enumC361490EFf.ordinal();
        if (iOrdinal7 != 0) {
            if (iOrdinal7 == 1) {
                C361520EFi.LIZ(LLLLILI().LIZ, 0, (int) (jLLLLLJIL / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), null, null, 27);
            } else {
                throw new C1954807lC();
            }
        } else {
            C361520EFi.LIZ(LLLLILI().LIZ, (int) (jLLLLLJIL / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), 0, null, null, 29);
        }
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            if (viewPropertyAnimatorAnimate != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(1.0f)) != null && (interpolator = viewPropertyAnimatorAlpha.setInterpolator(C1619980sG4.LIZLLL())) != null && (duration = interpolator.setDuration(200L)) != null) {
                duration.start();
            }
        }
        if (c367060EaG != null) {
            c367060EaG.LJIIIIZZ(iIntValue, iIntValue2);
            c367060EaG.setVibrate(false);
            c367060EaG.setProgress(((int) jLLLLLJIL) - iIntValue);
            int visibility = c367060EaG.getVisibility();
            c367060EaG.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c367060EaG);
            c367060EaG.setVibrate(true);
            c367060EaG.invalidate();
            String strK4 = C786410Ut5.k4(Locale.ENGLISH, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(C352310DrZ.LIZIZ(jLLLLLJIL))}, 1));
            if (tuxTextView2 != null) {
                tuxTextView2.setText(this.mView.getContext().getString(2131834088, strK4));
            }
            final TuxTextView tuxTextView3 = tuxTextView2;
            final AwS584S0100000_5 awS584S0100000_53 = awS584S0100000_5;
            final AwS584S0100000_5 awS584S0100000_54 = awS584S0100000_52;
            final TuxTextView tuxTextView4 = tuxTextView;
            C786410Ut5.zb(c367060EaG, new SeekBar.OnSeekBarChangeListener() { // from class: X.0ECw
                public final void LIZ(SeekBar seekBar) {
                    int iLIZIZ;
                    int paddingStart = seekBar.getPaddingStart();
                    int measuredWidth = (seekBar.getMeasuredWidth() - paddingStart) - seekBar.getPaddingEnd();
                    if (!(seekBar instanceof C367060EaG)) {
                        return;
                    }
                    C367060EaG c367060EaG2 = (C367060EaG) seekBar;
                    String strK42 = C786410Ut5.k4(Locale.ENGLISH, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(c367060EaG2.getActualProgress() / 1000000)}, 1));
                    TuxTextView tuxTextView5 = tuxTextView4;
                    if (tuxTextView5 != null) {
                        tuxTextView5.setText(this.mView.getContext().getString(2131834088, strK42));
                    }
                    TuxTextView tuxTextView6 = tuxTextView3;
                    if (tuxTextView6 != null) {
                        tuxTextView6.setText(this.mView.getContext().getString(2131834088, strK42));
                    }
                    TuxTextView tuxTextView7 = tuxTextView4;
                    if (tuxTextView7 == null || (iLIZIZ = tuxTextView7.getMeasuredWidth()) == 0) {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(55));
                    }
                    double x = ((double) ((c367060EaG2.getX() + paddingStart) + (c367060EaG2.getScale() * measuredWidth))) - (((double) iLIZIZ) / 2.0d);
                    TuxTextView tuxTextView8 = tuxTextView4;
                    if (tuxTextView8 != null) {
                        int i = (int) x;
                        int width = (this.mView.getWidth() - iLIZIZ) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(5.5d)));
                        if (i > width) {
                            i = width;
                        }
                        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(5.5d)));
                        if (i < iLIZIZ2) {
                            i = iLIZIZ2;
                        }
                        C426750GoL.LJIIIZ(tuxTextView8, Integer.valueOf(i), null, null, null, false, 30);
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStartTrackingTouch(SeekBar seekBar) {
                    if (!(seekBar instanceof C367060EaG)) {
                        return;
                    }
                    ((C367060EaG) seekBar).LJII(true);
                    LIZ(seekBar);
                    TuxTextView tuxTextView5 = tuxTextView4;
                    if (tuxTextView5 != null) {
                        C12C5.LIZIZ(tuxTextView5, 0L, 0.0f, null, 7);
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStopTrackingTouch(SeekBar seekBar) {
                    TuxTextView tuxTextView5 = tuxTextView4;
                    if (tuxTextView5 != null) {
                        C786410Ut5.B5(tuxTextView5, 1.0f);
                    }
                    TuxTextView tuxTextView6 = tuxTextView4;
                    if (tuxTextView6 != null) {
                        C12C5.LIZJ(tuxTextView6, 0L, null, null, 15);
                    }
                    if (!(seekBar instanceof C367060EaG)) {
                        return;
                    }
                    C367060EaG c367060EaG2 = (C367060EaG) seekBar;
                    c367060EaG2.LJII(false);
                    awS584S0100000_54.invoke(Integer.valueOf(c367060EaG2.getActualProgress()));
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                    LIZ(seekBar);
                    if (!(seekBar instanceof C367060EaG)) {
                        return;
                    }
                    awS584S0100000_53.invoke(Integer.valueOf(((C367060EaG) seekBar).getActualProgress()));
                }
            });
        }
    }

    public final void LLLLLLIL(EnumC361490EFf enumC361490EFf) {
        C367060EaG c367060EaG;
        TuxTextView tuxTextView;
        int iOrdinal = enumC361490EFf.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                c367060EaG = this.LLJJJJLIIL;
            } else {
                throw new C1954807lC();
            }
        } else {
            c367060EaG = this.LLJJJJJIL;
        }
        int iIntValue = LLLLLJLJLL().getFirst().intValue();
        long jLLLLLJIL = LLLLLJIL(enumC361490EFf);
        int iOrdinal2 = enumC361490EFf.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                C361520EFi.LIZ(LLLLILI().LIZ, 0, (int) (jLLLLLJIL / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), null, null, 27);
            } else {
                throw new C1954807lC();
            }
        } else {
            C361520EFi.LIZ(LLLLILI().LIZ, (int) (jLLLLLJIL / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), 0, null, null, 29);
        }
        int iOrdinal3 = enumC361490EFf.ordinal();
        if (iOrdinal3 != 0) {
            if (iOrdinal3 == 1) {
                tuxTextView = this.LLJLIL;
            } else {
                throw new C1954807lC();
            }
        } else {
            tuxTextView = this.LLJL;
        }
        if (c367060EaG != null) {
            c367060EaG.setVibrate(false);
            c367060EaG.setProgress(((int) jLLLLLJIL) - iIntValue);
            c367060EaG.setVibrate(true);
            String strK4 = C786410Ut5.k4(Locale.ENGLISH, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(C352310DrZ.LIZIZ(jLLLLLJIL))}, 1));
            if (tuxTextView != null) {
                tuxTextView.setText(this.mView.getContext().getString(2131834088, strK4));
            }
            c367060EaG.invalidate();
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((TextView) requireViewById(R.id.hjb)).setText(view.getContext().getString(2131834086));
        ((TextView) requireViewById(R.id.hjf)).setText(view.getContext().getString(2131834087));
        LLLLLL(EnumC361490EFf.LL);
        LLLLLL(EnumC361490EFf.LLILLJJLI);
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0EFg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C361520EFi) obj).LIZLLL;
            }
        }, AFwS234S0000000_5.get$arr$(178));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0EFh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C361520EFi) obj).LJ;
            }
        }, new AwS584S0100000_5(this, 351));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2;
        setTheme(R.style.y0);
        if (C357780E0y.LIZ()) {
            viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c2e, viewGroup, false);
        } else {
            viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c2d, viewGroup, false);
        }
        this.LLJJJIL = viewGroup2.findViewById(R.id.hj_);
        this.LLJJJJ = viewGroup2.findViewById(R.id.hjd);
        this.LLJJJJJIL = (C367060EaG) viewGroup2.findViewById(R.id.vqn);
        this.LLJJJJLIIL = (C367060EaG) viewGroup2.findViewById(R.id.vqo);
        TuxTextView tuxTextView = (TuxTextView) viewGroup2.findViewById(R.id.hja);
        if (tuxTextView == null) {
            tuxTextView = ((C0ECF) this.LLJLILLLLZIIL.getValue()).LLJJIJIL;
        }
        this.LLJJL = tuxTextView;
        TuxTextView tuxTextView2 = (TuxTextView) viewGroup2.findViewById(R.id.hje);
        if (tuxTextView2 == null) {
            tuxTextView2 = ((C0ECF) this.LLJLILLLLZIIL.getValue()).LLJJJ;
        }
        this.LLJJLIIIJLLLLLLLZ = tuxTextView2;
        if (C357780E0y.LIZ()) {
            this.LLJL = (TuxTextView) viewGroup2.findViewById(R.id.hj9);
            this.LLJLIL = (TuxTextView) viewGroup2.findViewById(R.id.hjc);
        }
        if (((Boolean) this.LLJLL.getValue()).booleanValue()) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(requireSceneContext(), R.style.y3);
            TuxTextView tuxTextView3 = this.LLJJL;
            if (tuxTextView3 != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1d);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
                tuxTextView3.setBackground(c384050F3z.LIZ(contextThemeWrapper));
            }
            TuxTextView tuxTextView4 = this.LLJJLIIIJLLLLLLLZ;
            if (tuxTextView4 != null) {
                C384050F3z c384050F3z2 = new C384050F3z();
                c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a1d);
                c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
                tuxTextView4.setBackground(c384050F3z2.LIZ(contextThemeWrapper));
            }
        }
        AFwS234S0000000_5 aFwS234S0000000_5 = AFwS234S0000000_5.get$arr$(179);
        aFwS234S0000000_5.invoke(this.LLJJJJJIL);
        aFwS234S0000000_5.invoke(this.LLJJJJLIIL);
        return viewGroup2;
    }
}
