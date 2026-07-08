package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.ui.PortraitAudienceInteractionFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Ifb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C472290Ifb {
    public final Context LIZ;
    public final InterfaceC472320Ife LIZIZ;
    public float LIZLLL;
    public float LJ;
    public final int LJFF;
    public int LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public InterfaceC472330Iff LJIL;
    public int LJJ;
    public VelocityTracker LJJI;
    public boolean LJJIFFI;
    public InterfaceC2453409jQ<String> LJJII;
    public boolean LJJIII;
    public final int LJI = (int) C497740JfY.LIZIZ(8.0f);
    public final int LJII = (int) C497740JfY.LIZIZ(80.0f);
    public final int LJIIIIZZ = (int) C497740JfY.LIZIZ(150.0f);
    public final boolean LIZJ = C497740JfY.LJJ();

    public final boolean LIZ() {
        C21586319dt c21586319dt;
        C21586319dt c21586319dt2 = ((C472280Ifa) this.LIZIZ).LLILLL;
        return (c21586319dt2 == null || !c21586319dt2.isDrawerOpen(3)) && !(((c21586319dt = ((C472280Ifa) this.LIZIZ).LLILLL) != null && c21586319dt.isDrawerOpen(5)) || LIZLLL() || this.LJIILIIL || this.LJIIZILJ || this.LJIIJ || this.LJIJ || this.LJIJI || this.LJIJJLI || this.LJJIFFI);
    }

    public final boolean LIZLLL() {
        if (this.LJIILL || C520010KaN.LJIJ(this.LIZ, false) == null) {
            return false;
        }
        return C500260Jjc.LJJII(C520010KaN.LJIJ(this.LIZ, false).getRequestedOrientation());
    }

    public final boolean LIZIZ(MotionEvent motionEvent) {
        C21586319dt c21586319dt;
        InterfaceC2453409jQ<String> interfaceC2453409jQ;
        InterfaceC472330Iff interfaceC472330Iff = this.LJIL;
        if (interfaceC472330Iff != null) {
            C472310Ifd c472310Ifd = (C472310Ifd) interfaceC472330Iff;
            PortraitAudienceInteractionFragment portraitAudienceInteractionFragment = c472310Ifd.LIZ;
            View view = c472310Ifd.LIZIZ;
            if (portraitAudienceInteractionFragment.LLJILJIL != null) {
                if (motionEvent != null) {
                    if (portraitAudienceInteractionFragment.G == null) {
                        try {
                            portraitAudienceInteractionFragment.G = (ViewGroup) view.findViewById(R.id.gf3);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    ViewGroup viewGroup = portraitAudienceInteractionFragment.G;
                    if (viewGroup != null) {
                        int[] iArr = new int[2];
                        viewGroup.getLocationOnScreen(iArr);
                        int i = iArr[0];
                        int i2 = iArr[1];
                        int width = viewGroup.getWidth();
                        int height = viewGroup.getHeight();
                        float rawX = motionEvent.getRawX();
                        float rawY = motionEvent.getRawY();
                        if (rawX >= i && rawX <= i + width && rawY >= i2 && rawY <= i2 + height) {
                            return false;
                        }
                    }
                }
                if (!((Boolean) portraitAudienceInteractionFragment.LLLJIL.LJIIIZ.getValue()).booleanValue()) {
                    return false;
                }
            }
        }
        C21586319dt c21586319dt2 = ((C472280Ifa) this.LIZIZ).LLILLL;
        if ((c21586319dt2 == null || !c21586319dt2.isDrawerOpen(3)) && (((c21586319dt = ((C472280Ifa) this.LIZIZ).LLILLL) == null || !c21586319dt.isDrawerOpen(5)) && !LIZLLL() && !this.LJIIL && !this.LJIILIIL && !this.LJIIZILJ && !this.LJIILJJIL && this.LJIILLIIL && !this.LJIJ && !this.LJIJJ && !this.LJIJI && !this.LJIJJLI && !this.LJJIII && (((interfaceC2453409jQ = this.LJJII) != null && ("nearby".equals(interfaceC2453409jQ.get()) || "discover".equals(this.LJJII.get()) || "hangout".equals(this.LJJII.get()))) || this.LJJ == 0))) {
            return true;
        }
        return false;
    }

    public final boolean LIZJ(float f) {
        if (f <= 0.0f || !((C472280Ifa) this.LIZIZ).LIZIZ(3)) {
            if (f < 0.0f && ((C472280Ifa) this.LIZIZ).LIZIZ(5)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public C472290Ifb(Context context, InterfaceC472320Ife interfaceC472320Ife) {
        this.LIZ = context;
        this.LIZIZ = interfaceC472320Ife;
        this.LJFF = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
