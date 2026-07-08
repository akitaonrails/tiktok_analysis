package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS417S0200000_16;

/* JADX INFO: renamed from: X.0cuZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1030050cuZ extends C16G0 {
    public static final /* synthetic */ int LLJLILLLLZIIL = 0;
    public FrameLayout LLJJL;
    public AdPopUpWebBottomSheetBehavior<C1030050cuZ> LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public InterfaceC1030070cub LLJLIL;

    public final InterfaceC1030090cud getOnInterceptListener() {
        return null;
    }

    public final void setOnInterceptListener(InterfaceC1030090cud interfaceC1030090cud) {
    }

    public final void LJIJJLI() {
        this.LLJJLIIIJLLLLLLLZ.setState(3);
    }

    public final C1029600ctq getActionMode() {
        return (C1029600ctq) this.LLJL.getValue();
    }

    public final FrameLayout getPopUpWebRoundLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rhu);
            this.LLJJL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final AdPopUpWebBottomSheetBehavior<C1030050cuZ> getBehavior() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final InterfaceC1030070cub getCallback() {
        return this.LLJLIL;
    }

    @Override // X.C16G0, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setBehavior(AdPopUpWebBottomSheetBehavior<C1030050cuZ> adPopUpWebBottomSheetBehavior) {
        this.LLJJLIIIJLLLLLLLZ = adPopUpWebBottomSheetBehavior;
    }

    public final void setCallback(InterfaceC1030070cub interfaceC1030070cub) {
        this.LLJLIL = interfaceC1030070cub;
    }

    public final void setPopUpWebRoundLayoutFromXml(FrameLayout frameLayout) {
        this.LLJJL = frameLayout;
    }

    public C1030050cuZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        final AdPopUpWebBottomSheetBehavior<C1030050cuZ> adPopUpWebBottomSheetBehavior = new AdPopUpWebBottomSheetBehavior<>();
        adPopUpWebBottomSheetBehavior.LJIILLIIL = new AbstractC1026070co9() { // from class: X.0cua
            @Override // X.AbstractC1026070co9
            public final void LIZIZ(int i) {
                InterfaceC1030070cub callback;
                if (i != 1) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                if (i == 6 && (callback = this.getCallback()) != null) {
                                    callback.LLLI();
                                    return;
                                }
                                return;
                            }
                            InterfaceC1030070cub callback2 = this.getCallback();
                            if (callback2 == null) {
                                return;
                            }
                            callback2.LJJJIL();
                            return;
                        }
                        InterfaceC1030070cub callback3 = this.getCallback();
                        if (callback3 == null) {
                            return;
                        }
                        callback3.LLLFFI();
                        return;
                    }
                    if (this.getActionMode().LJ != 0) {
                        if (this.getActionMode().LIZJ == 3) {
                            adPopUpWebBottomSheetBehavior.LJII = true;
                        } else {
                            adPopUpWebBottomSheetBehavior.setPeekHeight(this.getActionMode().LJ);
                        }
                    }
                    InterfaceC1030070cub callback4 = this.getCallback();
                    if (callback4 == null) {
                        return;
                    }
                    callback4.LLLFZ();
                    return;
                }
                int i2 = C1030050cuZ.LLJLILLLLZIIL;
                if (!C1030100cue.LIZ) {
                    adPopUpWebBottomSheetBehavior.setState(3);
                }
                InterfaceC1030070cub callback5 = this.getCallback();
                if (callback5 == null) {
                    return;
                }
                callback5.LLLFF();
            }

            @Override // X.AbstractC1026070co9
            public final void LIZ(View view, float f) {
                InterfaceC1030070cub callback = this.getCallback();
                if (callback != null) {
                    callback.LLLII(view, f);
                }
            }
        };
        this.LLJJLIIIJLLLLLLLZ = adPopUpWebBottomSheetBehavior;
        this.LLJL = C452501pT.LIZIZ(new AwS417S0200000_16(context, this, 48));
        AdPopUpWebBottomSheetBehavior<C1030050cuZ> adPopUpWebBottomSheetBehavior2 = this.LLJJLIIIJLLLLLLLZ;
        adPopUpWebBottomSheetBehavior2.LJI = true;
        C1030100cue.LIZ = true;
        adPopUpWebBottomSheetBehavior2.setState(5);
        this.LLJJLIIIJLLLLLLLZ.setPeekHeight(getActionMode().LIZLLL);
    }
}
