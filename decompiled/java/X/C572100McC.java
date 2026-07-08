package X;

import Y.ACListenerS112S0200000_8;
import Y.ACListenerS143S0100000_8;
import Y.AObserverS212S0100000_8;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0McC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C572100McC extends Scene implements InterfaceC379610EuV, InterfaceC362610EJn {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final C1DRG LLJI;
    public boolean LLJIJIL = true;
    public C197039127h LLJILJIL;
    public ImageView LLJILJILJ;
    public final C1664750tQH LLJILLL;
    public final C1664750tQH LLJJ;
    public final C1664750tQH LLJJI;
    public final C1664750tQH LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C572100McC.class, "titleBarComponent", "getTitleBarComponent()Lcom/ss/android/ugc/aweme/texttoimage/toolbar/TextToImageTitleBarApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C572100McC.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C572100McC.class, "editContainerComponent", "getEditContainerComponent()Lcom/ss/android/ugc/aweme/texttoimage/editcontainer/TextToImageEditContainerApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C572100McC.class, "avListenableActivityRegistry", "getAvListenableActivityRegistry()Lcom/ss/android/ugc/tools/view/activity/AVListenableActivityRegistry;", 0);
        c09r3.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    @Override // com.bytedance.scene.Scene
    public final void onStart() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.onStart();
        if (this.LLJIJIL) {
            this.LLJIJIL = false;
            ViewGroup.LayoutParams layoutParams = this.mView.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                return;
            }
            Activity activity = this.mActivity;
            if (activity == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            marginLayoutParams.topMargin = ScreenUtils.getStatusBarHeight(activity);
            C786410Ut5.W5(this.mView, marginLayoutParams);
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    public C572100McC(C1DRG c1drg) {
        this.LLJI = c1drg;
        this.LLJILLL = C1664770tQJ.LIZ(c1drg, InterfaceC572090McB.class, null);
        this.LLJJ = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJJI = C1664770tQJ.LIZ(c1drg, InterfaceC572080McA.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(c1drg, InterfaceC524950KiL.class, null);
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C1664750tQH c1664750tQH = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        ((InterfaceC524950KiL) c1664750tQH.getValue(this, interfaceC2217461BqaArr[3])).kF(this);
        ((InterfaceC572080McA) this.LLJJI.getValue(this, interfaceC2217461BqaArr[2])).dR1().observe(this, new AObserverS212S0100000_8(this, 51));
        ((InterfaceC572090McB) this.LLJILLL.getValue(this, interfaceC2217461BqaArr[0])).getShowToast().observe(this, new AObserverS212S0100000_8(this, 52));
    }

    @Override // X.InterfaceC362610EJn
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ImageView imageView;
        if (i == 4 && (imageView = this.LLJILJILJ) != null) {
            imageView.performClick();
            return true;
        }
        return true;
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        CharSequence text;
        String strValueOf;
        super.onViewCreated(view, bundle);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.csc);
        this.LLJILJIL = c197039127h;
        if (c197039127h != null) {
            C1664750tQH c1664750tQH = this.LLJJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
            if (((VideoPublishEditModel) c1664750tQH.getValue(this, interfaceC2217461BqaArr[1])).creativeModel.text2ImageModel.directToChoose) {
                strValueOf = getString(2131835487);
            } else if (C07CL.LIZ() && !Intrinsics.LJFF(((VideoPublishEditModel) this.LLJJ.getValue(this, interfaceC2217461BqaArr[1])).creativeModel.text2ImageModel.entrance, "search")) {
                strValueOf = getString(2131830055);
            } else {
                C197039127h c197039127h2 = this.LLJILJIL;
                if (c197039127h2 != null) {
                    text = c197039127h2.getText();
                } else {
                    text = null;
                }
                strValueOf = String.valueOf(text);
            }
            c197039127h.setText(strValueOf);
        }
        C197039127h c197039127h3 = this.LLJILJIL;
        if (c197039127h3 != null) {
            C786410Ut5.LLLLLLJ(c197039127h3, 4);
        }
        C197039127h c197039127h4 = this.LLJILJIL;
        if (c197039127h4 != null) {
            c197039127h4.LJJJJL(AFwS239S0000000_8.get$arr$(142));
        }
        C197039127h c197039127h5 = this.LLJILJIL;
        if (c197039127h5 != null) {
            c197039127h5.setEnabled(C123100dR.LIZ(((VideoPublishEditModel) this.LLJJ.getValue(this, LLJJIJI[1])).creativeModel.text2ImageModel.text));
        }
        C197039127h c197039127h6 = this.LLJILJIL;
        if (c197039127h6 != null) {
            C786410Ut5.U8(c197039127h6, new ACListenerS143S0100000_8(this, 91));
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.l_a);
        Context sceneContext = getSceneContext();
        if (sceneContext != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_chevron_left_offset_ltr;
            imageView.setImageDrawable(c419910GdJ.LIZ(sceneContext));
        }
        C786410Ut5.Q7(imageView, new ACListenerS112S0200000_8(this, imageView, 9));
        this.LLJILJILJ = imageView;
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.ery, viewGroup, false);
    }
}
