package X;

import Y.ACListenerS150S0100000_15;
import android.content.Context;
import android.view.KeyEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0aWw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C938520aWw extends FrameLayout implements C1AXB {
    public InterfaceC937840aVq LL;
    public final DataChannel LLILLJJLI;
    public final EnumC937920aVy LLILLL;
    public ConstraintLayout LLILZ;
    public C19R8 LLILZIL;
    public TuxTextView LLILZLL;
    public ViewGroup LLIZ;
    public ViewGroup LLIZLLLIL;
    public final C11NJ LLJ;
    public boolean LLJI;

    @Override // X.C1AXB
    public Boolean getAudioMute() {
        return null;
    }

    @Override // X.C1AXB
    public String getLinkMicId() {
        return null;
    }

    @Override // X.C1AXB
    public Long getUid() {
        return null;
    }

    @Override // X.C1AXB
    public Boolean getVideoMute() {
        return null;
    }

    @Override // X.C1AXB
    public final boolean isEmpty() {
        return true;
    }

    public final ConstraintLayout getClMaskFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dxb);
            this.LLILZ = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final C19R8 getLlTagFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.nil);
            this.LLILZIL = (C19R8) callbackFindViewById;
        }
        return (C19R8) callbackFindViewById;
    }

    @Override // X.C1AXB
    public Integer getLogicPos() {
        return Integer.valueOf(this.LL.LJIILL());
    }

    public final TuxTextView getTvTagFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_tag);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    @Override // X.C1AXB
    public Integer getUiPos() {
        return Integer.valueOf(this.LL.LJIIIIZZ());
    }

    @Override // X.C1AXB
    public int getH() {
        return getHeight();
    }

    @Override // X.C1AXB
    public int getW() {
        return getWidth();
    }

    @Override // android.view.View, X.C1AXB
    public int getX() {
        View view;
        Object parent = getParent();
        if (!(parent instanceof ViewGroup) || (view = (View) parent) == null) {
            return -1;
        }
        return view.getLeft();
    }

    @Override // android.view.View, X.C1AXB
    public int getY() {
        View view;
        Object parent = getParent();
        if (!(parent instanceof ViewGroup) || (view = (View) parent) == null) {
            return -1;
        }
        return view.getTop();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        InterfaceC938550aWz interfaceC938550aWzLJIIL;
        ViewGroup viewGroup;
        View childAt;
        FrameLayout.LayoutParams layoutParams;
        ViewGroup viewGroup2;
        SurfaceView surfaceViewLIZLLL;
        super.onAttachedToWindow();
        if (this.LLIZ == null) {
            this.LLIZ = (ViewGroup) FrameLayout.inflate(getContext(), R.layout.hu0, this);
        }
        if (this.LLIZLLLIL == null) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.hd0, this.LLIZ, false);
            if ((viewTd instanceof ViewGroup) && (viewGroup = (ViewGroup) viewTd) != null) {
                this.LLIZLLLIL = viewGroup;
                ViewGroup viewGroup3 = this.LLIZ;
                if (viewGroup3 != null) {
                    viewGroup3.addView(viewGroup);
                }
                ViewGroup viewGroup4 = this.LLIZ;
                if (viewGroup4 != null) {
                    C786410Ut5.K7(viewGroup4, new ACListenerS150S0100000_15(this, 267));
                }
                ViewGroup viewGroup5 = this.LLIZLLLIL;
                if (viewGroup5 != null && (viewGroup2 = (ViewGroup) viewGroup5.findViewById(R.id.i7o)) != null && (surfaceViewLIZLLL = this.LL.LIZLLL()) != null) {
                    C500260Jjc.LJJJLL(surfaceViewLIZLLL);
                    C786410Ut5.U5(surfaceViewLIZLLL, new FrameLayout.LayoutParams(-1, -1));
                    viewGroup2.addView(surfaceViewLIZLLL, 0);
                }
                ViewGroup viewGroup6 = this.LLIZ;
                if (viewGroup6 != null && viewGroup6.getChildCount() != 0 && (childAt = viewGroup6.getChildAt(0)) != null && (childAt instanceof ViewGroup)) {
                    ViewGroup viewGroup7 = (ViewGroup) childAt;
                    if (viewGroup7.getChildCount() > 0) {
                        View childAt2 = viewGroup7.getChildAt(0);
                        ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                            EnumC918970a1P enumC918970a1PLJ = C917140ZyS.LJ();
                            if ((enumC918970a1PLJ == EnumC918970a1P.GRID_FIX || enumC918970a1PLJ == EnumC918970a1P.GRID) && !C917140ZyS.LJIIIZ(childAt2)) {
                                layoutParams.gravity = 49;
                                layoutParams.topMargin = (int) C497740JfY.LIZIZ(78.0f);
                            } else {
                                layoutParams.gravity = 17;
                            }
                            C786410Ut5.W5(childAt2, layoutParams);
                        }
                    }
                }
            }
        }
        ViewGroup viewGroup8 = this.LLIZLLLIL;
        if (viewGroup8 != null && !this.LLJI) {
            InterfaceC938530aWx interfaceC938530aWxLIZ = C01IB.LIZ();
            if (interfaceC938530aWxLIZ != null && (interfaceC938550aWzLJIIL = interfaceC938530aWxLIZ.LJIIL()) != null) {
                interfaceC938550aWzLJIIL.LIZLLL(viewGroup8, this.LLILLL);
            }
            this.LLJI = true;
        }
        if (C497740JfY.LJJ()) {
            ConstraintLayout clMaskFromXml = getClMaskFromXml();
            if (clMaskFromXml != null) {
                clMaskFromXml.setLayoutDirection(1);
            }
            C19R8 llTagFromXml = getLlTagFromXml();
            if (llTagFromXml != null) {
                llTagFromXml.setLayoutDirection(1);
            }
            TuxTextView tvTagFromXml = getTvTagFromXml();
            if (tvTagFromXml != null) {
                tvTagFromXml.setTextDirection(4);
            }
        }
        ViewGroup viewGroup9 = this.LLIZ;
        if (viewGroup9 != null) {
            C500260Jjc.LJLIIIL(500L, viewGroup9, new AwS594S0100000_15(this, 997));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJ.LJ();
        this.LLJI = false;
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    public final DataChannel getDataChannel() {
        return this.LLILLJJLI;
    }

    public final EnumC937920aVy getRole() {
        return this.LLILLL;
    }

    public final InterfaceC937840aVq getWindow() {
        return this.LL;
    }

    public final void setClMaskFromXml(ConstraintLayout constraintLayout) {
        this.LLILZ = constraintLayout;
    }

    public final void setLlTagFromXml(C19R8 c19r8) {
        this.LLILZIL = c19r8;
    }

    public final void setTvTagFromXml(TuxTextView tuxTextView) {
        this.LLILZLL = tuxTextView;
    }

    public final void setWindow(InterfaceC937840aVq interfaceC937840aVq) {
        this.LL = interfaceC937840aVq;
    }

    public C938520aWw(Context context, InterfaceC937840aVq interfaceC937840aVq, DataChannel dataChannel, EnumC937920aVy enumC937920aVy) {
        super(context);
        this.LL = interfaceC937840aVq;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = enumC937920aVy;
        this.LLJ = new C11NJ();
    }
}
