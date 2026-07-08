package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.Scene;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import irm.AkS80S0100000_8;

/* JADX INFO: renamed from: X.0M7q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C563360M7q extends Scene implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C1DRG LLJI;
    public final C1664750tQH LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C563360M7q.class, "previewComponentApi", "getPreviewComponentApi()Lcom/ss/android/ugc/aweme/texttoimage/choose/Text2ImageChoosePreviewComponent;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    public C563360M7q(C1DRG c1drg) {
        this.LLJI = c1drg;
        this.LLJIJIL = C1664770tQJ.LIZ(c1drg, C572850MdP.class, null);
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.onViewCreated(view, bundle);
        Activity activity = this.mActivity;
        if (activity != null) {
            ScreenUtils.getStatusBarHeight(activity);
            View viewFindViewById = view.findViewById(R.id.cuf);
            if (viewFindViewById != null) {
                C786410Ut5.I7(new AkS80S0100000_8(this, 14), viewFindViewById);
            }
            C418740GbQ c418740GbQ = (C418740GbQ) view.findViewById(R.id.lgc);
            if (c418740GbQ != null) {
                ViewGroup.LayoutParams layoutParams = c418740GbQ.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    Activity activity2 = this.mActivity;
                    if (activity2 != null) {
                        marginLayoutParams.topMargin = ScreenUtils.getStatusBarHeight(activity2);
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c418740GbQ);
                        c418740GbQ.setLayoutParams(marginLayoutParams);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                Context sceneContext = getSceneContext();
                if (sceneContext != null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_chevron_left_offset_ltr;
                    c418740GbQ.setImageDrawable(c419910GdJ.LIZ(sceneContext));
                }
                C786410Ut5.I7(new AkS80S0100000_8(this, 15), c418740GbQ);
            }
            TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.hbc);
            if (tuxIconView != null) {
                C0HTI c0hti = new C0HTI();
                c0hti.LIZ = R.drawable.nl;
                tuxIconView.setImageDrawable(c0hti.LIZ(tuxIconView.getContext()));
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.erw, viewGroup, false);
    }
}
