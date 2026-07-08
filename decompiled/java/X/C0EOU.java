package X;

import Y.AObjectS240S0100000_5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EOU, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EOU extends C0FC9<C07WW, C0EOQ> implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public final C1DRG LLJJJJJIL;
    public final C1664750tQH LLJJJJLIIL;
    public final C1664750tQH LLJJL;
    public C367060EaG LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public TuxTextView LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public final C01GW LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EOU.class, "titleBarApi", "getTitleBarApi()Lcom/ss/android/ugc/aweme/tools/sticker/common/text/pro/titlebar/TextTitleBarApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0EOU.class, "keyFrameApi", "getKeyFrameApi()Lcom/ss/ugc/android/editor/core/api/IKeyFrameApiComponent;", 0);
        c09r3.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJJJJJIL;
    }

    public C0EOU(C1DRG c1drg) {
        super(c1drg);
        this.LLJJJJJIL = c1drg;
        this.LLJJJJLIIL = C1664770tQJ.LIZ(c1drg, C0EOZ.class, null);
        this.LLJJL = C1664770tQJ.LIZ(c1drg, C0ENB.class, null);
        this.LLJLL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(203));
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(final View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.s8j);
        this.LLJLILLLLZIIL = (TuxTextView) view.findViewById(R.id.ha2);
        this.LLJL = (TuxTextView) view.findViewById(R.id.p09);
        TuxTextView tuxTextView = this.LLJLILLLLZIIL;
        if (tuxTextView != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1d);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
            tuxTextView.setBackground(c384050F3z.LIZ(view.getContext()));
        }
        C367060EaG c367060EaG = (C367060EaG) view.findViewById(R.id.ha3);
        this.LLJJLIIIJLLLLLLLZ = c367060EaG;
        if (c367060EaG != null) {
            float fLIZIZ = C418440Gaw.LIZIZ(20);
            float fLIZIZ2 = C418440Gaw.LIZIZ(24);
            c367060EaG.LLJJJJJIL = fLIZIZ;
            c367060EaG.LLJJJJLIIL = fLIZIZ2;
        }
        C367060EaG c367060EaG2 = this.LLJJLIIIJLLLLLLLZ;
        if (c367060EaG2 != null) {
            C426750GoL.LJIIL(c367060EaG2, null, 0, null, 0, 21);
        }
        C367060EaG c367060EaG3 = this.LLJJLIIIJLLLLLLLZ;
        if (c367060EaG3 != null) {
            c367060EaG3.setEnableThumbAlign(true);
        }
        if (C293810BfP.LIZ() && !((Boolean) this.LLJLL.getValue()).booleanValue()) {
            C367060EaG c367060EaG4 = this.LLJJLIIIJLLLLLLLZ;
            if (c367060EaG4 != null) {
                ViewGroup.LayoutParams layoutParams = c367060EaG4.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                    C786410Ut5.W5(c367060EaG4, layoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            C367060EaG c367060EaG5 = this.LLJJLIIIJLLLLLLLZ;
            if (c367060EaG5 != null) {
                C426750GoL.LJIIIZ(c367060EaG5, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7))), false, 23);
            }
            TuxTextView tuxTextView2 = this.LLJLIL;
            if (tuxTextView2 != null) {
                C786410Ut5.wd(tuxTextView2, C418440Gaw.LIZIZ(3));
            }
            TuxTextView tuxTextView3 = this.LLJLIL;
            if (tuxTextView3 != null) {
                C426750GoL.LJIIIZ(tuxTextView3, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), false, 23);
            }
            TuxTextView tuxTextView4 = this.LLJL;
            if (tuxTextView4 != null) {
                C786410Ut5.wd(tuxTextView4, C418440Gaw.LIZIZ(3));
            }
            TuxTextView tuxTextView5 = this.LLJL;
            if (tuxTextView5 != null) {
                C426750GoL.LJIIIZ(tuxTextView5, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), false, 23);
            }
        }
        C367060EaG c367060EaG6 = this.LLJJLIIIJLLLLLLLZ;
        if (c367060EaG6 != null) {
            C786410Ut5.zb(c367060EaG6, new SeekBar.OnSeekBarChangeListener() { // from class: X.0EOP
                public final void LIZ(SeekBar seekBar) {
                    int iLIZIZ;
                    int paddingStart = seekBar.getPaddingStart();
                    int measuredWidth = (seekBar.getMeasuredWidth() - paddingStart) - seekBar.getPaddingEnd();
                    if (!(seekBar instanceof C367060EaG)) {
                        return;
                    }
                    TuxTextView tuxTextView6 = this.LL.LLJLILLLLZIIL;
                    if (tuxTextView6 != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(((C367060EaG) seekBar).getActualProgress());
                        sbLIZ.append('%');
                        tuxTextView6.setText(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    TuxTextView tuxTextView7 = this.LL.LLJLILLLLZIIL;
                    if (tuxTextView7 == null || (iLIZIZ = tuxTextView7.getMeasuredWidth()) == 0) {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(53));
                    }
                    C367060EaG c367060EaG7 = (C367060EaG) seekBar;
                    double x = ((double) ((c367060EaG7.getX() + paddingStart) + (c367060EaG7.getScale() * measuredWidth))) - (((double) iLIZIZ) / 2.0d);
                    TuxTextView tuxTextView8 = this.LL.LLJLILLLLZIIL;
                    if (tuxTextView8 != null) {
                        int i = (int) x;
                        int width = (view.getWidth() - iLIZIZ) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(5.5d)));
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
                    C367060EaG c367060EaG7;
                    if (seekBar instanceof C367060EaG) {
                        c367060EaG7 = (C367060EaG) seekBar;
                    } else {
                        c367060EaG7 = null;
                    }
                    if (c367060EaG7 != null) {
                        c367060EaG7.LJII(true);
                    }
                    LIZ(seekBar);
                    TuxTextView tuxTextView6 = this.LL.LLJLILLLLZIIL;
                    if (tuxTextView6 != null) {
                        C12C5.LIZIZ(tuxTextView6, 0L, 0.0f, null, 7);
                    }
                    C0EOU c0eou = this.LL;
                    C0ENB c0enb = (C0ENB) c0eou.LLJJL.getValue(c0eou, C0EOU.LLJLLIL[1]);
                    if (c0enb != null) {
                        c0enb.Ax2();
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStopTrackingTouch(SeekBar seekBar) {
                    C367060EaG c367060EaG7;
                    if (seekBar == null) {
                        return;
                    }
                    if ((seekBar instanceof C367060EaG) && (c367060EaG7 = (C367060EaG) seekBar) != null) {
                        c367060EaG7.LJII(false);
                    }
                    this.LL.LLLLIL().LIZIZ.invoke(Float.valueOf(seekBar.getProgress() / 100.0f));
                    TuxTextView tuxTextView6 = this.LL.LLJLILLLLZIIL;
                    if (tuxTextView6 != null) {
                        C0F29.LIZ(tuxTextView6, null, 15);
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                    if (z) {
                        this.LL.LLLLIL().LIZ.invoke(Float.valueOf(i / 100.0f));
                    }
                    TuxTextView tuxTextView6 = this.LL.LLJLIL;
                    if (tuxTextView6 != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(i);
                        sbLIZ.append('%');
                        tuxTextView6.setText(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    LIZ(seekBar);
                }
            });
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EOV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((C07WW) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 653));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EOW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C07WW) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, AFwS234S0000000_5.get$arr$(321));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.08r5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C07WW) obj).LIZJ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 655));
        ((C0EOZ) this.LLJJJJLIIL.getValue(this, LLJLLIL[0])).Zg0().LJII(this, Lifecycle.State.RESUMED, new AObjectS240S0100000_5(this, 113));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (((Boolean) this.LLJLL.getValue()).booleanValue()) {
            i = R.layout.bz5;
        } else {
            i = R.layout.bz3;
        }
        return (ViewGroup) C786410Ut5.Td(layoutInflater, i, viewGroup, false);
    }
}
