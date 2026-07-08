package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.userservice.UserService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0U2O, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U2O extends C0U2M {
    public final ImageView LLJIJIL;
    public final ImageView LLJILJIL;
    public final LiveIconView LLJILJILJ;
    public final ImageView LLJILLL;
    public final C1324720kZq LLJJ;
    public final TextView LLJJI;
    public final int LLJJIII;
    public final int LLJJIJI;

    public final void R5(C0U22 c0u22) {
        ImageModel imageModel;
        C0U2W c0u2w = this.LLJ;
        if (c0u2w != null && c0u2w.oc()) {
            C0U2X c0u2x = c0u22.LJIILLIIL;
            String str = null;
            if (c0u2x != null && (imageModel = c0u2x.LIZJ) != null) {
                C500260Jjc.LLFFF(this.LLJJ);
                C500260Jjc.LLFFF(this.LLJJI);
                TextView textView = this.LLJJI;
                C0U2X c0u2x2 = c0u22.LJIILLIIL;
                if (c0u2x2 != null) {
                    str = c0u2x2.LIZ;
                }
                textView.setText(str);
                C1324610kZf c1324610kZfLJFF = C1819620xS4.LIZ().LJFF(Boolean.FALSE);
                c1324610kZfLJFF.LJIILIIL = Boolean.TRUE;
                c1324610kZfLJFF.LJIIIZ = R.drawable.ela;
                c1324610kZfLJFF.LJIIL = new C786400Ut4(this, 1);
                c1324610kZfLJFF.LJIIIZ(imageModel);
                c1324610kZfLJFF.LJJI(this.LLJJ);
                C1324720kZq c1324720kZq = this.LLJJ;
                if (c1324720kZq != null) {
                    c1324720kZq.setForeground(C497740JfY.LJIIJ(R.drawable.ezt));
                }
            } else {
                C500260Jjc.LJIILIIL(this.LLJJ);
                C500260Jjc.LJIILIIL(this.LLJJI);
            }
            C1324720kZq c1324720kZq2 = this.LLILLL;
            if (c1324720kZq2 != null) {
                ViewGroup.LayoutParams layoutParams = c1324720kZq2.getLayoutParams();
                int i = this.LLJJIII;
                layoutParams.width = i;
                layoutParams.height = i;
                C786410Ut5.u6(c1324720kZq2, layoutParams);
                return;
            }
            return;
        }
        C500260Jjc.LJIILIIL(this.LLJJ);
        C500260Jjc.LJIILIIL(this.LLJJI);
        C1324720kZq c1324720kZq3 = this.LLILLL;
        if (c1324720kZq3 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = c1324720kZq3.getLayoutParams();
        int i2 = this.LLJJIJI;
        layoutParams2.width = i2;
        layoutParams2.height = i2;
        C786410Ut5.u6(c1324720kZq3, layoutParams2);
    }

    public C0U2O(int i, View view) {
        super(i, view);
        this.LLJIJIL = (ImageView) view.findViewById(R.id.m3q);
        this.LLJILJIL = (ImageView) view.findViewById(R.id.m3m);
        this.LLJILJILJ = (LiveIconView) view.findViewById(R.id.m3r);
        this.LLJILLL = (ImageView) view.findViewById(R.id.m3p);
        this.LLJJ = (C1324720kZq) view.findViewById(R.id.tbe);
        this.LLJJI = (TextView) view.findViewById(R.id.m3t);
        this.LLJJIII = (int) C497740JfY.LIZIZ(64.0f);
        this.LLJJIJI = (int) C497740JfY.LIZIZ(48.0f);
    }

    @Override // X.C0U2M
    public final void P5(int i, C0U22 c0u22) {
        super.P5(i, c0u22);
        S5(i, c0u22);
        if (c0u22.LJIILJJIL == C0U2R.PLAYING) {
            LiveIconView liveIconView = this.LLJILJILJ;
            if (liveIconView != null) {
                liveIconView.setIconAttr(R.attr.e6l);
                return;
            }
            return;
        }
        LiveIconView liveIconView2 = this.LLJILJILJ;
        if (liveIconView2 == null) {
            return;
        }
        liveIconView2.setIconAttr(R.attr.e9g);
    }

    public final void S5(int i, C0U22 c0u22) {
        C0U2X c0u2x;
        if (i != 0) {
            if (i != 1) {
                C500260Jjc.LJIILLIIL(this.LLJILLL);
                C500260Jjc.LJIILLIIL(this.LLJILJILJ);
                C500260Jjc.LLFFF(this.LLJIJIL);
                C500260Jjc.LLFFF(this.LLJILJIL);
            } else {
                C500260Jjc.LJIILLIIL(this.LLJILLL);
                C500260Jjc.LJIILLIIL(this.LLJILJILJ);
                C500260Jjc.LJIILLIIL(this.LLJIJIL);
                C500260Jjc.LLFFF(this.LLJILJIL);
            }
        } else {
            C500260Jjc.LLFFF(this.LLJILLL);
            C500260Jjc.LLFFF(this.LLJILJILJ);
            C500260Jjc.LJIILLIIL(this.LLJIJIL);
            C500260Jjc.LJIILLIIL(this.LLJILJIL);
        }
        C0U2W c0u2w = this.LLJ;
        if (c0u2w == null || c0u2w.LIZJ() != 1) {
            C500260Jjc.LJIILIIL(this.LLJILLL);
            C500260Jjc.LJIILIIL(this.LLJILJILJ);
            C500260Jjc.LJIILIIL(this.LLJIJIL);
            C500260Jjc.LJIILIIL(this.LLJILJIL);
        }
        C0U2W c0u2w2 = this.LLJ;
        if (c0u2w2 != null && c0u2w2.LIZJ() == 3 && (c0u2x = c0u22.LJIILLIIL) != null && c0u2x.LIZIZ == UserService.getInstance().user().getCurrentUserId()) {
            if (i == 0) {
                C500260Jjc.LLFFF(this.LLJILLL);
                C500260Jjc.LLFFF(this.LLJILJILJ);
            } else {
                C500260Jjc.LLFFF(this.LLJILJIL);
            }
        }
    }

    @Override // X.C0U2M
    public final void N5(C0U22 c0u22, int i, C0U2K c0u2k) {
        super.N5(c0u22, i, c0u2k);
        switch (C0U2Q.LIZ[c0u2k.ordinal()]) {
            case 1:
                S5(i, c0u22);
                ImageView imageView = this.LLJIJIL;
                if (imageView != null) {
                    C500260Jjc.LJLIIIL(500L, imageView, new AwS591S0100000_12(this, 1069));
                }
                ImageView imageView2 = this.LLJILJIL;
                if (imageView2 != null) {
                    C500260Jjc.LJLIIIL(500L, imageView2, new AwS591S0100000_12(this, 1070));
                }
                LiveIconView liveIconView = this.LLJILJILJ;
                if (liveIconView != null) {
                    C500260Jjc.LJLIIIL(500L, liveIconView, new AwS591S0100000_12(this, 1071));
                }
                ImageView imageView3 = this.LLJILLL;
                if (imageView3 != null) {
                    C500260Jjc.LJLIIIL(500L, imageView3, new AwS591S0100000_12(this, 1072));
                }
                R5(c0u22);
                break;
            case 2:
                if (C763810Txj.LIZ(Integer.valueOf(this.LL))) {
                    C500260Jjc.LJIILLIIL(this.LLJIJIL);
                }
                break;
            case 3:
                if (C763810Txj.LIZ(Integer.valueOf(this.LL))) {
                    C500260Jjc.LLFFF(this.LLJIJIL);
                }
                break;
            case 4:
                LiveIconView liveIconView2 = this.LLJILJILJ;
                if (liveIconView2 != null) {
                    liveIconView2.setIconAttr(R.attr.e6l);
                }
                break;
            case 5:
            case 6:
                LiveIconView liveIconView3 = this.LLJILJILJ;
                if (liveIconView3 != null) {
                    liveIconView3.setIconAttr(R.attr.e9g);
                }
                break;
            case 7:
                R5(c0u22);
                break;
        }
    }
}
