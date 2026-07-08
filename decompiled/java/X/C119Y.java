package X;

import Y.AObjectS247S0100000_29;
import Y.AObserverS231S0100000_29;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.119Y, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C119Y extends Scene implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final C1DRG LLJI;
    public View LLJIJIL;
    public View LLJILJIL;
    public RecyclerView LLJILJILJ;
    public C19510111Ut LLJILLL;
    public C194549119n LLJJ;
    public C119J LLJJI;
    public LinearLayoutManager LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public C194544119i LLJJIJIL;
    public InterfaceC1452170ntP LLJJJ;
    public FrameLayout LLJJJIL;
    public final C1664750tQH LLJJJJ;
    public final C1664750tQH LLJJJJJIL;
    public final C01GW LLJJJJLIIL = C1449630npJ.LIZ(this, InterfaceC1455860nzM.class);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C119Y.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C119Y.class, "audioEffectViewModel", "getAudioEffectViewModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/EditAudioEffectApi;", 0);
        c09r3.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public final VideoPublishEditModel LLLII() {
        return (VideoPublishEditModel) this.LLJJJJ.getValue(this, LLJJL[0]);
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroy() {
        InterfaceC194555119t interfaceC194555119t;
        super.onDestroy();
        C2296208zA.LIZ().getClass();
        C2299808zk.LJFF.getValue().LIZ.LJIIIZ(1);
        C194544119i c194544119i = this.LLJJIJIL;
        if (c194544119i == null || (interfaceC194555119t = c194544119i.LIZJ) == null) {
            return;
        }
        interfaceC194555119t.LJJJJLL(true);
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        C2296208zA.LIZ().getClass();
        C2299808zk.LIZJ();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    public C119Y(C1DRG c1drg) {
        this.LLJI = c1drg;
        this.LLJJJJ = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZ(c1drg, InterfaceC1456070nzh.class, null);
    }

    public final void LLLIIIIL(Effect effect) {
        C194544119i c194544119i = this.LLJJIJIL;
        if (c194544119i != null) {
            c194544119i.LIZ(effect);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.119n] */
    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        VideoPublishEditModel videoPublishEditModelLLLII = LLLII();
        if (videoPublishEditModelLLLII != null) {
            videoPublishEditModelLLLII.isFastImport();
        }
        ((InterfaceC1455860nzM) this.LLJJJJLIIL.getValue()).d02().observe(this, new AObserverS231S0100000_29(this, 256));
        this.LLJJ = new C194551119p() { // from class: X.119n
            @Override // X.C194551119p, X.InterfaceC19510211Uu
            public final void LIZ() {
                C1456140nzo.LIZIZ((InterfaceC1455860nzM) this.LIZ.LLJJJJLIIL.getValue(), true, false, false, false, 12);
            }
        };
        ((InterfaceC1456070nzh) this.LLJJJJJIL.getValue(this, LLJJL[1])).jj2().LIZ(this, new AObjectS247S0100000_29(this, 100));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLIILIL(com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119Y.LLLIILIL(com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel, boolean):void");
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = (FrameLayout) C786410Ut5.Td(layoutInflater, R.layout.enz, viewGroup, false);
        this.LLJJJIL = frameLayout;
        return frameLayout;
    }
}
