package X;

import Y.AObjectS245S0100000_22;
import Y.AObserverS225S0100000_22;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0o8F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1461370o8F extends Scene implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final InterfaceC1461390o8H LLJI;
    public final C1DRG LLJIJIL;
    public C1461430o8L LLJILJIL;
    public final C1664750tQH LLJILJILJ;
    public final C1664740tQG LLJILLL;
    public final C1664740tQG LLJJ;
    public final C01GW LLJJI = C1449630npJ.LIZ(this, InterfaceC1455860nzM.class);
    public final C1664750tQH LLJJIII;
    public final C1461400o8I LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1461370o8F.class, "editGestureApi", "getEditGestureApi()Lcom/ss/android/ugc/gamora/editor/gesture/EditGestureApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1461370o8F.class, "editFilterApi", "getEditFilterApi()Lcom/ss/android/ugc/gamora/editor/filter/core/EditFilterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1461370o8F.class, "storyEditFilterApi", "getStoryEditFilterApi()Lcom/ss/android/ugc/aweme/social/creation/api/edit/StoryEditFilterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1461370o8F.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1461370o8F.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJJIII.getValue(this, LLJJIJIIJIL[4]);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJIJIL;
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
    }

    public final void LLLII(boolean z) {
        if (!C1428470nHB.LLIIIJ(getEditModel()) && !C1428500nHE.LIZ()) {
            VideoPublishEditModel editModel = getEditModel();
            C1414930mvL.LIZ.getClass();
            if ((C1414930mvL.LJII(editModel, false) && !C0C64.LJIILLIIL().LJIIIZ(31744, "studio_mix_material_block_horizontal_sliding_gesture", true, false)) || getEditModel().isEnterFromLinkShare()) {
                return;
            }
            if (C1428520nHG.LJLIL(getEditModel())) {
                InterfaceC1453020num interfaceC1453020num = (InterfaceC1453020num) this.LLJJ.getValue(this, LLJJIJIIJIL[2]);
                if (interfaceC1453020num == null) {
                    return;
                }
                interfaceC1453020num.Fv(z);
                return;
            }
            InterfaceC1453430nvR interfaceC1453430nvR = (InterfaceC1453430nvR) this.LLJILLL.getValue(this, LLJJIJIIJIL[1]);
            if (interfaceC1453430nvR == null) {
                return;
            }
            interfaceC1453430nvR.Fv(z);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        C0ETY c0ety;
        Class<InterfaceC1461350o8D> cls;
        AwS601S0100000_22 awS601S0100000_22;
        super.onActivityCreated(bundle);
        ((InterfaceC1455860nzM) this.LLJJI.getValue()).Yh().observe(this, new AObserverS225S0100000_22(this, 75));
        C1664750tQH c1664750tQH = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        ((InterfaceC1452130ntL) c1664750tQH.getValue(this, interfaceC2217461BqaArr[0])).tt1().LIZ(this, new AObjectS245S0100000_22(this, 123));
        ((InterfaceC1452130ntL) this.LLJILJILJ.getValue(this, interfaceC2217461BqaArr[0])).lF0().LIZ(this, new AObjectS245S0100000_22(this, 124));
        ((InterfaceC1452130ntL) this.LLJILJILJ.getValue(this, interfaceC2217461BqaArr[0])).gc0().LIZ(this, new AObjectS245S0100000_22(this, 125));
        Function0<Rect> function0Rn0 = null;
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            ((C0ETY) this.LLJIJIL.LJII(C0ETY.class, null)).Sd(InterfaceC1461350o8D.class, new AwS601S0100000_22(this, 336));
            return;
        }
        C1DRG c1drg = this.LLJIJIL;
        VideoPublishEditModel editModel = getEditModel();
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableMergeEPLazy) {
            c0ety = (C0ETY) c1drg.LJII(C0ETY.class, null);
            cls = InterfaceC1461350o8D.class;
            awS601S0100000_22 = new AwS601S0100000_22(this, 334);
        } else if (C365940EWi.LIZLLL(editModel)) {
            c0ety = (C0ETY) c1drg.LJII(C0ETY.class, null);
            cls = InterfaceC1461350o8D.class;
            awS601S0100000_22 = new AwS601S0100000_22(this, 335);
        } else {
            InterfaceC1461350o8D interfaceC1461350o8D = (InterfaceC1461350o8D) ((C05YF) c1drg.LJIIL(null, InterfaceC1461350o8D.class));
            InterfaceC1461390o8H interfaceC1461390o8H = this.LLJI;
            if (interfaceC1461350o8D != null) {
                function0Rn0 = interfaceC1461350o8D.Rn0();
            }
            this.LLJILJIL = new C1461430o8L(interfaceC1461390o8H, function0Rn0);
            return;
        }
        c0ety.Sd(cls, awS601S0100000_22);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0o8I] */
    public C1461370o8F(InterfaceC1461390o8H interfaceC1461390o8H, C1DRG c1drg) {
        this.LLJI = interfaceC1461390o8H;
        this.LLJIJIL = c1drg;
        this.LLJILJILJ = C1664770tQJ.LIZ(c1drg, InterfaceC1452130ntL.class, null);
        this.LLJILLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1453430nvR.class, null);
        this.LLJJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1453020num.class, null);
        C1664770tQJ.LIZIZ(c1drg, InterfaceC1461350o8D.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJJIJI = new Object() { // from class: X.0o8I
        };
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return new View(requireSceneContext());
    }
}
