package X;

import Y.ARunnableS117S0100000_17;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.livesdk.userinfowidget.ClearScreenUserInfoWidget;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0g5D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151970g5D extends C0IYA {
    public final int $t;
    public Object l0;

    @Override // X.C0IYA, X.InterfaceC1142670fqD
    public final void LIZJ(int i, int i2, String str) {
        switch (this.$t) {
            case 3:
                LIZJ$0(this, i, i2, str);
                break;
            case 4:
            default:
                super.LIZJ(i, i2, str);
                break;
            case 5:
                LIZJ$1(this, i, i2, str);
                break;
            case 6:
                LIZJ$2(this, i, i2, str);
                break;
        }
    }

    @Override // X.C0IYA, X.InterfaceC1142670fqD
    public final void LIZLLL(String str, Exception exc) {
        switch (this.$t) {
            case 3:
                LIZLLL$0(this, str, exc);
                break;
            case 4:
                LIZLLL$1(this, str, exc);
                break;
            default:
                super.LIZLLL(str, exc);
                break;
        }
    }

    @Override // X.C0IYA
    public final void LJ(boolean z) {
        switch (this.$t) {
            case 0:
                LJ$0(this, z);
                break;
            case 1:
                LJ$1(this, z);
                break;
            case 2:
                LJ$2(this, z);
                break;
            default:
                super.LJ(z);
                break;
        }
    }

    public C1151970g5D(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJ$0(C1151970g5D c1151970g5D, boolean z) {
        int i;
        ImageView imageView = ((ClearScreenUserInfoWidget) c1151970g5D.l0).LLJILJIL;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C12ES.LJIILL(i, imageView);
    }

    public static final void LJ$1(C1151970g5D c1151970g5D, boolean z) {
        int i;
        ImageView imageView = ((ClearScreenUserInfoWidget) c1151970g5D.l0).LLJILJIL;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C12ES.LJIILL(i, imageView);
    }

    public static final void LJ$2(C1151970g5D c1151970g5D, boolean z) {
        int i;
        ImageView imageView = ((LiveRoomUserInfoWidget) c1151970g5D.l0).LLJILJIL;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C12ES.LJIILL(i, imageView);
    }

    public static final void LIZLLL$0(C1151970g5D c1151970g5D, String str, Exception exc) {
        String strR5 = ((AbstractC1126560fQE) c1151970g5D.l0).R5();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadFailed imageUrl ");
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(exc);
        C20441214yg.LJIIIZ(strR5, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZLLL$1(C1151970g5D c1151970g5D, String str, Exception exc) {
        ((C1106110etF) c1151970g5D.l0).LIZIZ();
    }

    public static final void LIZJ$0(C1151970g5D c1151970g5D, int i, int i2, String str) {
        ViewGroup.LayoutParams layoutParams;
        AbstractC1126560fQE abstractC1126560fQE = (AbstractC1126560fQE) c1151970g5D.l0;
        abstractC1126560fQE.getClass();
        if (i != 0 && i2 != 0) {
            ImageView imageView = abstractC1126560fQE.LLILZ;
            if (imageView != null) {
                layoutParams = imageView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = (i * ((int) C497740JfY.LIZIZ(13.0f))) / i2;
                }
            } else {
                layoutParams = null;
            }
            ImageView imageView2 = abstractC1126560fQE.LLILZ;
            if (imageView2 != null) {
                C786410Ut5.c6(imageView2, layoutParams);
            }
        }
    }

    public static final void LIZJ$1(C1151970g5D c1151970g5D, int i, int i2, String str) {
        ViewGroup.LayoutParams layoutParams;
        AbstractC1126590fQH abstractC1126590fQH = (AbstractC1126590fQH) c1151970g5D.l0;
        abstractC1126590fQH.getClass();
        if (i != 0 && i2 != 0) {
            ImageView imageView = abstractC1126590fQH.LLILLL;
            if (imageView != null) {
                layoutParams = imageView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = (i * ((int) C497740JfY.LIZIZ(13.0f))) / i2;
                }
            } else {
                layoutParams = null;
            }
            ImageView imageView2 = abstractC1126590fQH.LLILLL;
            if (imageView2 != null) {
                C786410Ut5.c6(imageView2, layoutParams);
            }
        }
    }

    public static final void LIZJ$2(C1151970g5D c1151970g5D, int i, int i2, String str) {
        C1128760fTm.LJIIJ.getClass();
        C1128760fTm.LJJIIJZLJL("color_change");
        C1120950fHB c1120950fHB = (C1120950fHB) c1151970g5D.l0;
        ImageView imageView = c1120950fHB.LLILZ;
        if (imageView != null) {
            HandlerHook.viewPostDelay(imageView, new ARunnableS117S0100000_17(c1120950fHB, 301), 100L);
        }
        C1324720kZq c1324720kZq = ((C1120950fHB) c1151970g5D.l0).LLILZIL;
        if (c1324720kZq != null) {
            C500260Jjc.LJLJLJ(c1324720kZq, true);
        }
        InterfaceC1094160eZy.c1.LJFF(Boolean.TRUE);
    }
}
