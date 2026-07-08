package X;

import Y.AObserverS224S0100000_21;
import Y.ARunnableS90S0200000_21;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.zhiliaoapp.musically.R;
import iyl.i3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mRG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1396280mRG extends C1659140tHE implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public final C1DRG LLJJLIIIJLLLLLLLZ;
    public C0GZN LLJL;
    public final C1664750tQH LLJLIL;
    public final C1664750tQH LLJLILLLLZIIL;
    public ARunnableS90S0200000_21 LLJLL;
    public C1342110l1t LLJLLIL;
    public final C01GW LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1396280mRG.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1396280mRG.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public final VideoPublishEditModel LJJIIZ() {
        return (VideoPublishEditModel) this.LLJLILLLLZIIL.getValue(this, LLJZ[1]);
    }

    @Override // X.C1659140tHE, X.AbstractC1659350tHZ, X.InterfaceC1657880tFC
    public final void LJ() {
        super.LJ();
        ARunnableS90S0200000_21 aRunnableS90S0200000_21 = this.LLJLL;
        if (aRunnableS90S0200000_21 != null) {
            C0GZN c0gzn = this.LLJL;
            if (c0gzn != null) {
                HandlerHook.viewRemoveCallbacks(c0gzn, aRunnableS90S0200000_21);
            }
            C1342110l1t c1342110l1t = this.LLJLLIL;
            if (c1342110l1t != null) {
                Iterator it2 = ((ArrayList) c1342110l1t.LIZJ).iterator();
                while (it2.hasNext()) {
                    ((C21647019ng) it2.next()).LIZ();
                }
            }
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.C1659140tHE, X.InterfaceC1657880tFC
    public final void LIZJ(i3 i3Var) {
        super.LIZJ(i3Var);
        C0GZN c0gzn = this.LLJL;
        if (c0gzn != null) {
            c0gzn.setTopHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
            c0gzn.setBackgroundColorRes(R.attr.zi);
            c0gzn.setBackgroundSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT((List) this.LLJLLL.getValue()));
            c1331670kl3LJIIJ.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LJIIJ.LJJ(c0gzn);
            C786410Ut5.h3(c1331670kl3LJIIJ);
            C0HWW.LIZ.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("action_type", "show");
            C20684815ws.LJIILLIIL("social_avatar_sticker_promotional_channel", c2344009Gk.LIZ);
            if (c0gzn.getParent() != null) {
                this.LLJLL = new ARunnableS90S0200000_21(c0gzn, this, 0);
                HandlerHook.viewPostDelay(c0gzn, this.LLJLL, 1500L);
            }
        }
    }

    @Override // X.C1659140tHE, X.AbstractC1659350tHZ
    public final void LJIIJJI(View view) {
        boolean z;
        super.LJIIJJI(view);
        if (!C1428470nHB.LJJJZ(LJJIIZ()) && (!LJJIIZ().creativeModel.stickerModel.dmGroupChatStickerModel.isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        if ((IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().LJIILJJIL(null, null) instanceof C0HWY) && this.LLJLLL.getValue() != null && !LJJIIZ().isEnterFromDM() && !C1428470nHB.LJJLIIIJLLLLLLLZ(LJJIIZ()) && !z) {
            if (!Intrinsics.LJFF(LJJIIZ().getEnterFrom(), "post_social_avatar_anchor_page") || u4.LJIIZILJ(LJJIIZ())) {
                C0HYP.LIZ.getClass();
                if (!(!C0HYP.LJ().getBoolean("has_shown_editor_icon_flip_animation", false))) {
                    return;
                }
            }
            C0GZN c0gzn = new C0GZN(view.getContext(), null, 0);
            int visibility = c0gzn.getVisibility();
            c0gzn.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c0gzn);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38)));
            layoutParams.gravity = 17;
            FrameLayout frameLayout = this.LLJILJIL;
            if (frameLayout != null) {
                frameLayout.addView(c0gzn, layoutParams);
            }
            this.LLJL = c0gzn;
            ((InterfaceC1455610nyx) this.LLJLIL.getValue(this, LLJZ[0])).ww().observe(this, new AObserverS224S0100000_21(this, 0));
            C1331660kl2.LJIIJ(new C03IT((List) this.LLJLLL.getValue())).LJJIII();
        }
    }

    public C1396280mRG(LifecycleOwner lifecycleOwner, C1DRG c1drg, List<View> list) {
        super(lifecycleOwner, list, new C1659620tI0(new AwS565S0100000_21(c1drg, 28)));
        this.LLJJLIIIJLLLLLLLZ = c1drg;
        this.LLJLIL = C1664770tQJ.LIZ(c1drg, InterfaceC1460000o62.class, null);
        this.LLJLILLLLZIIL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJLLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(3));
    }
}
