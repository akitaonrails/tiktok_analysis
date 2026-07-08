package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.dataChannel.PublicScreenShrinkChannel;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenAvatarLoadSceneSampleRateSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS596S0100000_17;
import wh6.AbS507S0200000_17;

/* JADX INFO: renamed from: X.0f5X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1113730f5X extends AbstractC1111020f1A<InterfaceC1113740f5Y> {
    public final InterfaceC1113760f5a LLILZ;
    public final View LLILZIL;
    public final C1324720kZq LLILZLL;
    public boolean LLIZ;

    public final void S5() {
        View view = this.LLILZIL;
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMarginEnd(this.LLIZ ? C497740JfY.LJIIIZ(R.dimen.alg) : C497740JfY.LJIIIZ(R.dimen.alf));
            C786410Ut5.W5(view, marginLayoutParams);
        }
    }

    public C1113730f5X(View view) {
        super(view);
        this.LLILZ = (InterfaceC1113760f5a) view.findViewById(R.id.dc3);
        this.LLILZIL = view.findViewById(R.id.eu1);
        this.LLILZLL = (C1324720kZq) view.findViewById(R.id.k55);
    }

    public void R5(C1109770ez9 c1109770ez9) {
        DataChannel dataChannel = c1109770ez9.LJIIIZ;
        if (dataChannel != null) {
            dataChannel.BQ2(c1109770ez9.LIZIZ, PublicScreenShrinkChannel.class, new AwS596S0100000_17(this, 741));
        }
        S5();
    }

    @Override // X.AbstractC1111020f1A
    /* JADX INFO: renamed from: P5, reason: merged with bridge method [inline-methods] */
    public void L5(C1109770ez9 c1109770ez9, InterfaceC1113740f5Y interfaceC1113740f5Y) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        C1324720kZq c1324720kZq = this.LLILZLL;
        if (c1324720kZq != null) {
            int iLJIJJ = interfaceC1113740f5Y.LJIJJ();
            if (iLJIJJ != -1) {
                C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(iLJIJJ, c1324720kZq.getContext());
                int iLJJLL = interfaceC1113740f5Y.LJJLL();
                if (iLJJLL != -1 && c20743516FdLIZLLL != null) {
                    c20743516FdLIZLLL.setTint(C20736316Cj.LIZIZ(iLJJLL, c1324720kZq.getContext()));
                }
                c1324720kZq.setImageDrawable(c20743516FdLIZLLL);
                ViewGroup.LayoutParams layoutParams = c1324720kZq.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams2.width = c1324720kZq.getContext().getResources().getDimensionPixelSize(R.dimen.at4);
                    marginLayoutParams2.height = c1324720kZq.getContext().getResources().getDimensionPixelSize(R.dimen.at4);
                    marginLayoutParams2.setMarginStart(c1324720kZq.getContext().getResources().getDimensionPixelSize(R.dimen.at3));
                    C786410Ut5.u6(c1324720kZq, marginLayoutParams2);
                }
            } else {
                ImageModel imageModelLJLLLLLL = interfaceC1113740f5Y.LJLLLLLL();
                if (imageModelLJLLLLLL != null) {
                    if (LivePublicScreenAvatarLoadSceneSampleRateSetting.shouldPassAvatarScene()) {
                        C1121670fIL.LJIIIIZZ(c1324720kZq, imageModelLJLLLLLL, "capsule_vh_image");
                    } else {
                        C1121670fIL.LJI(imageModelLJLLLLLL, c1324720kZq);
                    }
                } else {
                    C439101nJ.LJ(interfaceC1113740f5Y.LIZLLL(), c1324720kZq);
                }
                ViewGroup.LayoutParams layoutParams2 = c1324720kZq.getLayoutParams();
                if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    marginLayoutParams.width = c1324720kZq.getContext().getResources().getDimensionPixelSize(R.dimen.aqs);
                    marginLayoutParams.height = c1324720kZq.getContext().getResources().getDimensionPixelSize(R.dimen.aqs);
                    marginLayoutParams.setMarginStart(c1324720kZq.getContext().getResources().getDimensionPixelSize(R.dimen.aqr));
                    C786410Ut5.u6(c1324720kZq, marginLayoutParams);
                }
            }
        }
        R5(c1109770ez9);
        InterfaceC1113760f5a interfaceC1113760f5a = this.LLILZ;
        if (interfaceC1113760f5a != null) {
            interfaceC1113760f5a.LJLJLLL(interfaceC1113740f5Y);
        }
        if (interfaceC1113740f5Y.LJJIZ()) {
            InterfaceC1113760f5a interfaceC1113760f5a2 = this.LLILZ;
            if (interfaceC1113760f5a2 != null) {
                C786410Ut5.I7(new AbS507S0200000_17(interfaceC1113740f5Y, c1109770ez9, 8), interfaceC1113760f5a2.getActionView());
                C786410Ut5.I7(new AbS507S0200000_17(interfaceC1113740f5Y, c1109770ez9, 9), interfaceC1113760f5a2.getContentView());
                return;
            }
            return;
        }
        View view = this.LLILZIL;
        if (view == null) {
            return;
        }
        C786410Ut5.I7(new AbS507S0200000_17(interfaceC1113740f5Y, c1109770ez9, 7), view);
    }
}
