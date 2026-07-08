package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.livesdk.microom.MicRoomUserInfoWidget;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveFollowCardWidget;

/* JADX INFO: renamed from: X.0Kdg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C522060Kdg extends C0IYA {
    public final int $t;
    public Object l0;

    @Override // X.C0IYA, X.InterfaceC1142670fqD
    public final void LIZJ(int i, int i2, String str) {
        switch (this.$t) {
            case 0:
                LIZJ$0(this, i, i2, str);
                break;
            case 1:
                LIZJ$1(this, i, i2, str);
                break;
            case 2:
            default:
                super.LIZJ(i, i2, str);
                break;
            case 3:
                LIZJ$2(this, i, i2, str);
                break;
            case 4:
                LIZJ$3(this, i, i2, str);
                break;
        }
    }

    @Override // X.C0IYA, X.InterfaceC1142670fqD
    public final void LIZLLL(String str, Exception exc) {
        switch (this.$t) {
            case 0:
                LIZLLL$0(this, str, exc);
                break;
            case 1:
            case 2:
            case 3:
            default:
                super.LIZLLL(str, exc);
                break;
            case 4:
                LIZLLL$1(this, str, exc);
                break;
        }
    }

    @Override // X.C0IYA
    public final void LJ(boolean z) {
        if (2 - this.$t != 0) {
            super.LJ(z);
        } else {
            LJ$0(this, z);
        }
    }

    public C522060Kdg(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJ$0(C522060Kdg c522060Kdg, boolean z) {
        int i;
        ImageView imageView = ((MicRoomUserInfoWidget) c522060Kdg.l0).LLJIJIL;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C12ES.LJIILL(i, imageView);
    }

    public static final void LIZLLL$0(C522060Kdg c522060Kdg, String str, Exception exc) {
        C500260Jjc.LJIILIIL(((ProgrammedLiveFollowCardWidget) c522060Kdg.l0).LLILZIL);
    }

    public static final void LIZLLL$1(C522060Kdg c522060Kdg, String str, Exception exc) {
        C500260Jjc.LJIILIIL(((C488940JFk) c522060Kdg.l0).LLILZIL);
    }

    public static final void LIZJ$0(C522060Kdg c522060Kdg, int i, int i2, String str) {
        C500260Jjc.LLFFF(((ProgrammedLiveFollowCardWidget) c522060Kdg.l0).LLILZIL);
    }

    public static final void LIZJ$1(C522060Kdg c522060Kdg, int i, int i2, String str) {
        ViewGroup.LayoutParams layoutParams = ((C1324720kZq) c522060Kdg.l0).getLayoutParams();
        layoutParams.width = (int) (layoutParams.height * (i / i2));
        C786410Ut5.u6((C1324720kZq) c522060Kdg.l0, layoutParams);
    }

    public static final void LIZJ$2(C522060Kdg c522060Kdg, int i, int i2, String str) {
        ViewGroup.LayoutParams layoutParams;
        C1324720kZq c1324720kZq = (C1324720kZq) c522060Kdg.l0;
        if (c1324720kZq != null) {
            layoutParams = c1324720kZq.getLayoutParams();
            float f = i / i2;
            if (layoutParams != null) {
                layoutParams.width = Integer.valueOf((int) (layoutParams.height * f)).intValue();
            }
        } else {
            layoutParams = null;
        }
        C1324720kZq c1324720kZq2 = (C1324720kZq) c522060Kdg.l0;
        if (c1324720kZq2 != null) {
            C786410Ut5.u6(c1324720kZq2, layoutParams);
        }
    }

    public static final void LIZJ$3(C522060Kdg c522060Kdg, int i, int i2, String str) {
        C500260Jjc.LLFFF(((C488940JFk) c522060Kdg.l0).LLILZIL);
    }
}
