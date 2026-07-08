package X;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestGaussOptSetting;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0bnL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C987130bnL implements InterfaceC1142670fqD {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void LIZ$0(C987130bnL c987130bnL) {
    }

    public static final void LIZ$1(C987130bnL c987130bnL) {
    }

    public static final void LIZ$2(C987130bnL c987130bnL) {
    }

    public static final void LIZIZ$0(C987130bnL c987130bnL, Animatable animatable) {
    }

    public static final void LIZIZ$1(C987130bnL c987130bnL, Animatable animatable) {
    }

    public static final void LIZIZ$2(C987130bnL c987130bnL, Animatable animatable) {
    }

    @Override // X.InterfaceC1142670fqD
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                break;
            case 1:
                LIZ$1(this);
                break;
            case 2:
                LIZ$2(this);
                break;
        }
    }

    @Override // X.InterfaceC1142670fqD
    public final void LIZIZ(Animatable animatable) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, animatable);
                break;
            case 1:
                LIZIZ$1(this, animatable);
                break;
            case 2:
                LIZIZ$2(this, animatable);
                break;
        }
    }

    @Override // X.InterfaceC1142670fqD
    public final void LIZJ(int i, int i2, String str) {
        switch (this.$t) {
            case 0:
                LIZJ$0(this, i, i2, str);
                break;
            case 1:
                LIZJ$1(this, i, i2, str);
                break;
            case 2:
                LIZJ$2(this, i, i2, str);
                break;
        }
    }

    @Override // X.InterfaceC1142670fqD
    public final void LIZLLL(String str, Exception exc) {
        switch (this.$t) {
            case 0:
                LIZLLL$0(this, str, exc);
                break;
            case 1:
                LIZLLL$1(this, str, exc);
                break;
            case 2:
                LIZLLL$2(this, str, exc);
                break;
        }
    }

    public C987130bnL(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void LIZLLL$0(C987130bnL c987130bnL, String str, Exception exc) {
        C1324720kZq c1324720kZq = ((C939740aYu) c987130bnL.l0).LLJJJIL;
        if (c1324720kZq != null) {
            c1324720kZq.setImageResource(R.drawable.el_);
        }
    }

    public static final void LIZLLL$1(C987130bnL c987130bnL, String str, Exception exc) {
        String message;
        ((C1324720kZq) c987130bnL.l0).setTag(Boolean.FALSE);
        String strLJJIIJ = C939700aYq.LJJIIJ(203);
        if (exc != null) {
            message = exc.getMessage();
        } else {
            message = null;
        }
        C1AZW.LJFF(strLJJIIJ, "load avatar image failed for,", message, null);
    }

    public static final void LIZLLL$2(C987130bnL c987130bnL, String str, Exception exc) {
        String message;
        ((C1324720kZq) c987130bnL.l0).setTag(Boolean.FALSE);
        String strLJJIIJ = C939700aYq.LJJIIJ(229);
        if (exc != null) {
            message = exc.getMessage();
        } else {
            message = null;
        }
        C1AZW.LJFF(strLJJIIJ, "load gauss bg image failed for,", message, null);
    }

    public static final void LIZJ$0(C987130bnL c987130bnL, int i, int i2, String str) {
        C1324720kZq c1324720kZq;
        int height;
        C939740aYu c939740aYu = (C939740aYu) c987130bnL.l0;
        ImageModel imageModel = (ImageModel) c987130bnL.l1;
        c939740aYu.getClass();
        if (MultiGuestGaussOptSetting.INSTANCE.enable() && !C937750aVh.LIZ() && (c1324720kZq = c939740aYu.LLJJJ) != null) {
            int width = 0;
            if (c1324720kZq.getVisibility() == 0) {
                if (!C1819620xS4.LIZLLL(imageModel)) {
                    c1324720kZq.setForeground(new ColorDrawable(C497740JfY.LIZLLL(R.attr.eos, c1324720kZq.getContext())));
                    ViewGroup viewGroup = c939740aYu.LLILLJJLI;
                    if (viewGroup != null) {
                        height = viewGroup.getHeight();
                    } else {
                        height = 0;
                    }
                    ViewGroup viewGroup2 = c939740aYu.LLILLJJLI;
                    if (viewGroup2 != null) {
                        width = viewGroup2.getWidth();
                    }
                    C492300JSi.LIZ(height, width, imageModel, c1324720kZq);
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("showGaussianBlurBg blurImageModel=");
                sbLIZ.append(imageModel);
                C20441214yg.LIZIZ("MultiGuestV3FeedMaskWindow", C2188811AlT.LIZIZ(sbLIZ));
                C492300JSi.LIZIZ(imageModel, c1324720kZq, null);
            }
        }
    }

    public static final void LIZJ$1(C987130bnL c987130bnL, int i, int i2, String str) {
        ((C1324720kZq) c987130bnL.l0).setTag(Boolean.valueOf(!C504670Jqj.LIZIZ(str)));
    }

    public static final void LIZJ$2(C987130bnL c987130bnL, int i, int i2, String str) {
        ((C1324720kZq) c987130bnL.l0).setTag(Boolean.valueOf(!C504670Jqj.LIZIZ(str)));
    }
}
