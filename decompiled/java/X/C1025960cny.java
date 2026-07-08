package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior;
import kotlin.jvm.internal.AwS417S0200000_16;

/* JADX INFO: renamed from: X.0cny, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1025960cny extends C16G0 {
    public static boolean LLJLIL = true;
    public AdPopUpWebBottomSheetBehavior<C1025960cny> LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public InterfaceC1025980co0 LLJL;

    public final InterfaceC1026030co5 getOnInterceptListener() {
        return null;
    }

    public final void setOnInterceptListener(InterfaceC1026030co5 interfaceC1026030co5) {
    }

    public final C1025920cnu getActionMode() {
        return (C1025920cnu) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final AdPopUpWebBottomSheetBehavior<C1025960cny> getBehavior() {
        return this.LLJJL;
    }

    public final InterfaceC1025980co0 getCallback() {
        return this.LLJL;
    }

    @Override // X.C16G0, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setBehavior(AdPopUpWebBottomSheetBehavior<C1025960cny> adPopUpWebBottomSheetBehavior) {
        this.LLJJL = adPopUpWebBottomSheetBehavior;
    }

    public final void setCallback(InterfaceC1025980co0 interfaceC1025980co0) {
        this.LLJL = interfaceC1025980co0;
    }

    public C1025960cny(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        final AdPopUpWebBottomSheetBehavior<C1025960cny> adPopUpWebBottomSheetBehavior = new AdPopUpWebBottomSheetBehavior<>();
        adPopUpWebBottomSheetBehavior.LJIILLIIL = new AbstractC1026070co9() { // from class: X.0cnz
            @Override // X.AbstractC1026070co9
            public final void LIZIZ(int i) {
                InterfaceC1025980co0 callback;
                if (i != 1) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5 && (callback = this.getCallback()) != null) {
                                callback.LJJJIL();
                                return;
                            }
                            return;
                        }
                        InterfaceC1025980co0 callback2 = this.getCallback();
                        if (callback2 == null) {
                            return;
                        }
                        callback2.LLLFFI();
                        return;
                    }
                    if (this.getActionMode().LJ != 0) {
                        adPopUpWebBottomSheetBehavior.setPeekHeight(this.getActionMode().LJ);
                    }
                    InterfaceC1025980co0 callback3 = this.getCallback();
                    if (callback3 == null) {
                        return;
                    }
                    callback3.LLLFZ();
                    return;
                }
                if (!C1025960cny.LLJLIL) {
                    adPopUpWebBottomSheetBehavior.setState(3);
                }
                InterfaceC1025980co0 callback4 = this.getCallback();
                if (callback4 == null) {
                    return;
                }
                callback4.LLLFF();
            }

            @Override // X.AbstractC1026070co9
            public final void LIZ(View view, float f) {
                InterfaceC1025980co0 callback = this.getCallback();
                if (callback != null) {
                    callback.LJJJI(f);
                }
            }
        };
        this.LLJJL = adPopUpWebBottomSheetBehavior;
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS417S0200000_16(context, this, 90));
        AdPopUpWebBottomSheetBehavior<C1025960cny> adPopUpWebBottomSheetBehavior2 = this.LLJJL;
        adPopUpWebBottomSheetBehavior2.LJI = true;
        LLJLIL = true;
        adPopUpWebBottomSheetBehavior2.setState(5);
        this.LLJJL.setPeekHeight(getActionMode().LIZLLL);
    }
}
