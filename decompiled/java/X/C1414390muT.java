package X;

import Y.ACListenerS143S0100000_8;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0muT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1414390muT extends Scene implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final C1DRG LLJI;
    public final C1664740tQG LLJIJIL;
    public C370670Eg5 LLJILJIL;
    public final C1664750tQH LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1414390muT.class, "imageVideoSeparateModeSwitchApi", "getImageVideoSeparateModeSwitchApi()Lcom/ss/android/ugc/aweme/image/switchmode/ImageVideoSeparateModeSwitchApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1414390muT.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    public C1414390muT(C1DRG c1drg) {
        this.LLJI = c1drg;
        this.LLJIJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC578500MmW.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.we, viewGroup, false);
        C370670Eg5 c370670Eg5 = (C370670Eg5) viewTd.findViewById(R.id.video_to_image_switcher);
        this.LLJILJIL = c370670Eg5;
        if (c370670Eg5 != null) {
            C786410Ut5.Pa(c370670Eg5, new ACListenerS143S0100000_8(this, 24));
        }
        C1414440muY c1414440muY = new C1414440muY();
        C370670Eg5 c370670Eg52 = this.LLJILJIL;
        InterfaceC1414430muX interfaceC1414430muX = new InterfaceC1414430muX() { // from class: X.0muU
            @Override // X.InterfaceC1414430muX
            public final void LJI() {
                C578350MmH c578350MmH = C578350MmH.LIZ;
                C1414390muT c1414390muT = this.LIZ;
                VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) c1414390muT.LLJILJILJ.getValue(c1414390muT, C1414390muT.LLJILLL[1]);
                c578350MmH.getClass();
                C578350MmH.LIZIZ(videoPublishEditModel);
            }
        };
        if (c370670Eg52 != null) {
            C786410Ut5.x3(c370670Eg52.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1466720oGs(c370670Eg52, c1414440muY, interfaceC1414430muX, 0));
            c370670Eg52.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1414420muW(c370670Eg52, c1414440muY, interfaceC1414430muX));
        }
        return viewTd;
    }
}
