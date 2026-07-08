package X;

import Y.ACListenerS163S0100000_29;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewState;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.110t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194321110t extends AbstractC19670611xg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public C19412810xC LLJILJILJ;
    public final C1664750tQH LLJILLL;
    public final C1664750tQH LLJJ;
    public final String LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C194321110t.class, "editCutInternalApi", "getEditCutInternalApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditCutInternalApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C194321110t.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC19670711xh
    public final String getTag() {
        return this.LLJJI;
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        BaseJediViewModel.iR2((BaseJediViewModel) this.LLJJ.getValue(this, LLJJIII[1]), this, new C2217381BqS() { // from class: X.110u
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((EditAdjustClipsBottomViewState) obj).getStickPointStatus());
            }
        }, new AwS608S0100000_29(this, 746));
    }

    public C194321110t(C1DRG c1drg, C12VS c12vs) {
        super(c1drg, c12vs, R.id.i3k);
        this.LLJILLL = C1664770tQJ.LIZ(this.LLJI, C12VU.class, null);
        this.LLJJ = C1664770tQJ.LIZ(this.LLJI, EditAdjustClipsBottomViewModel.class, null);
        this.LLJJI = "StickPointStatusScene";
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19412810xC c19412810xC = new C19412810xC(requireSceneContext(), null);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19412810xC);
        c19412810xC.setLayoutParams(layoutParams);
        View viewSd = C786410Ut5.Sd(R.layout.v_, C786410Ut5.ne(this.mActivity), null);
        C786410Ut5.I7(new ACListenerS163S0100000_29(this, 280), viewSd.findViewById(R.id.tv_retry));
        ((TextView) viewSd.findViewById(R.id.tv_retry_msg)).setText(R.string.m25);
        C19412710xB c19412710xBLIZ = C19412710xB.LIZ(requireSceneContext());
        C1213400hgI c1213400hgI = new C1213400hgI(c19412710xBLIZ.LIZ);
        c1213400hgI.LIZ.LIZ = c1213400hgI.LIZIZ.getString(R.string.m25);
        C1213390hgH c1213390hgH = c1213400hgI.LIZ;
        c1213390hgH.LIZIZ = true;
        C1213380hgG c1213380hgG = new C1213380hgG(c19412710xBLIZ.LIZ);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1213380hgG);
        c1213380hgG.setLayoutParams(layoutParams2);
        c1213380hgG.setStatus(c1213390hgH);
        c19412710xBLIZ.LIZJ = c1213380hgG;
        c19412710xBLIZ.LIZLLL = viewSd;
        C786410Ut5.W5(c19412710xBLIZ.LIZLLL, new FrameLayout.LayoutParams(-1, -1));
        c19412710xBLIZ.LJ = 1;
        c19412810xC.setBuilder(c19412710xBLIZ);
        this.LLJILJILJ = c19412810xC;
        return c19412810xC;
    }
}
