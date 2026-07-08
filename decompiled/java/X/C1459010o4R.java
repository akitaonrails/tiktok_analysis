package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0o4R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1459010o4R extends Scene implements InterfaceC1166920gTK, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIL;
    public final C1DRG LLJI;
    public List<Integer> LLJILJIL;
    public ArrayList<String> LLJILJILJ;
    public final C1664750tQH LLJILLL;
    public boolean LLJJ;
    public String LLJJI;
    public boolean LLJJIII;
    public final C1664750tQH LLJJIJIL;
    public final C1664740tQG LLJJJ;
    public final C1664740tQG LLJJJIL;
    public final C1664740tQG LLJJJJ;
    public final C1664740tQG LLJJJJJIL;
    public InterfaceC1459070o4X LLJJJJLIIL;
    public final C1664750tQH LLJJL;
    public final C1664740tQG LLJJLIIIJLLLLLLLZ;
    public final C1664740tQG LLJL;
    public final C1664740tQG LLJLIL;
    public final C1664740tQG LLJLILLLLZIIL;
    public final C1664740tQG LLJLL;
    public final C1664740tQG LLJLLIL;
    public InterfaceC1459150o4f LLJLLL;
    public final C1664740tQG LLJZ;
    public final C1664740tQG LLJZIJLIL;
    public final C1664740tQG LLL;
    public final C1664740tQG LLLF;
    public final C1664740tQG LLLFF;
    public final C1664740tQG LLLFFI;
    public Function0<Unit> LLLFZ;
    public boolean LLLI;
    public final C1664740tQG LLLII;
    public final C1664740tQG LLLIIII;
    public final C01GW LLLIIIIL;
    public final C1459000o4Q LLLIIIL;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(221));
    public String LLJJIJI = "";
    public final int LLJJIJIIJIL = LSPassThroughRecordSizeConfig.DEFAULT;

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1459010o4R.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1459010o4R.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1459010o4R.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1459010o4R.class, "editCutMusicApi", "getEditCutMusicApi()Lcom/ss/android/ugc/gamora/editor/cutmusic/EditCutMusicApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1459010o4R.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1459010o4R.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1459010o4R.class, "replaceManager", "getReplaceManager()Lcom/ss/android/ugc/gamora/editor/toolbar/ReplaceMusicToolbarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C1459010o4R.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C1459010o4R.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(C1459010o4R.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(C1459010o4R.class, "editMusicStickerApi", "getEditMusicStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/music/EditMusicStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS12 = new C2217381BqS(C1459010o4R.class, "lighteningMusicApi", "getLighteningMusicApi()Lcom/ss/android/ugc/gamora/editor/lightening/music/LighteningMusicApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS13 = new C2217381BqS(C1459010o4R.class, "editAudioCopyrightDetectApi", "getEditAudioCopyrightDetectApi()Lcom/ss/android/ugc/gamora/editor/audio/copyrightdetect/EditAudioCopyrightDetectApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS14 = new C2217381BqS(C1459010o4R.class, "switchModeApi", "getSwitchModeApi()Lcom/ss/android/ugc/aweme/image/switchmode/ImageModeSwitchApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS15 = new C2217381BqS(C1459010o4R.class, "recentMusicApi", "getRecentMusicApi()Lcom/ss/android/ugc/aweme/tools/music/music/recent/components/RecentMusicAddApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS16 = new C2217381BqS(C1459010o4R.class, "editPrePublishApi", "getEditPrePublishApi()Lcom/ss/android/ugc/gamora/editor/preload/EditPrePublishApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS17 = new C2217381BqS(C1459010o4R.class, "memeAudioComponent", "getMemeAudioComponent()Lcom/ss/android/ugc/gamora/editor/audioservice/service/memeaudio/MemeAudioApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS18 = new C2217381BqS(C1459010o4R.class, "musicPanelViewHolderParamInject", "getMusicPanelViewHolderParamInject()Lcom/ss/android/ugc/aweme/port/internal/MusicPanelViewHolderParam;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS19 = new C2217381BqS(C1459010o4R.class, "chooseMusicConfigInject", "getChooseMusicConfigInject()Lcom/ss/android/ugc/aweme/port/in/music/ChooseMusicConfig;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS20 = new C2217381BqS(C1459010o4R.class, "autoCutPreloadApi", "getAutoCutPreloadApi()Lcom/ss/android/ugc/aweme/autocut/AutoCutPreloadingApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS21 = new C2217381BqS(C1459010o4R.class, "stripPreviewApi", "getStripPreviewApi()Lcom/ss/android/ugc/gamora/editor/toolbar/StripMusicPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS22 = new C2217381BqS(C1459010o4R.class, "collectCountApi", "getCollectCountApi()Lcom/ss/android/ugc/aweme/tools/music/music/collect/count/CollectCountApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS23 = new C2217381BqS(C1459010o4R.class, "epRecommendSyncApi", "getEpRecommendSyncApi()Lcom/ss/android/ugc/gamora/editorpro/sync/IEPMusicSyncApiComponent;", 0);
        c09r3.getClass();
        LLLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11, c2217381BqS12, c2217381BqS13, c2217381BqS14, c2217381BqS15, c2217381BqS16, c2217381BqS17, c2217381BqS18, c2217381BqS19, c2217381BqS20, c2217381BqS21, c2217381BqS22, c2217381BqS23};
    }

    public final C1457860o2a LLLIIIIL() {
        return (C1457860o2a) this.LLLF.getValue(this, LLLIIL[18]);
    }

    public final InterfaceC1457250o1b LLLIILIL() {
        return (InterfaceC1457250o1b) this.LLJJJIL.getValue(this, LLLIIL[3]);
    }

    public final InterfaceC1453200nv4 LLLIL() {
        return (InterfaceC1453200nv4) this.LLJJIJIL.getValue(this, LLLIIL[1]);
    }

    public final InterfaceC1455860nzM LLLILZ() {
        return (InterfaceC1455860nzM) this.LLJJJJ.getValue(this, LLLIIL[5]);
    }

    public final InterfaceC1461350o8D LLLILZLLLI() {
        return (InterfaceC1461350o8D) this.LLJL.getValue(this, LLLIIL[9]);
    }

    public final InterfaceC1418580n1E LLLIZZ() {
        return (InterfaceC1418580n1E) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLLIIL[8]);
    }

    public final InterfaceC1413540mt6 LLLJ() {
        return (InterfaceC1413540mt6) this.LLJLILLLLZIIL.getValue(this, LLLIIL[11]);
    }

    public final InterfaceC1459100o4a LLLJL() {
        return (InterfaceC1459100o4a) this.LLLIIIIL.getValue();
    }

    public final VideoPublishEditModel LLLLII() {
        return (VideoPublishEditModel) this.LLJILLL.getValue(this, LLLIIL[0]);
    }

    public final InterfaceC1454960nxu LLLLIIIILLL() {
        return (InterfaceC1454960nxu) this.LLJJL.getValue(this, LLLIIL[7]);
    }

    public final InterfaceC1459020o4S LLLLIL() {
        return (InterfaceC1459020o4S) this.LLJJJJJIL.getValue(this, LLLIIL[6]);
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        InterfaceC1459070o4X interfaceC1459070o4X = this.LLJJJJLIIL;
        if (interfaceC1459070o4X != null) {
            interfaceC1459070o4X.destroy();
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    public C1459010o4R(C1DRG c1drg) {
        this.LLJI = c1drg;
        this.LLJILLL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(c1drg, InterfaceC1453200nv4.class, null);
        this.LLJJJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC377540ErA.class, null);
        this.LLJJJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1457250o1b.class, null);
        C1664770tQJ.LIZIZ(c1drg, InterfaceC1460000o62.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1455860nzM.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1459020o4S.class, null);
        this.LLJJL = C1664770tQJ.LIZ(c1drg, InterfaceC1454960nxu.class, null);
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1418580n1E.class, null);
        this.LLJL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1461350o8D.class, null);
        this.LLJLIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1459040o4U.class, null);
        this.LLJLILLLLZIIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1413540mt6.class, null);
        this.LLJLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1453760nvy.class, null);
        this.LLJLLIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC578430MmP.class, null);
        this.LLJZ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1453610nvj.class, null);
        this.LLJZIJLIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1451520nsM.class, null);
        C1664770tQJ.LIZIZ(c1drg, InterfaceC1457820o2W.class, null);
        this.LLL = C1664770tQJ.LIZIZ(c1drg, C129C.class, null);
        this.LLLF = C1664770tQJ.LIZIZ(c1drg, C1457860o2a.class, null);
        this.LLLFF = C1664770tQJ.LIZIZ(c1drg, InterfaceC1417110myr.class, null);
        this.LLLFFI = C1664770tQJ.LIZIZ(c1drg, InterfaceC372120EiQ.class, null);
        this.LLLII = C1664770tQJ.LIZIZ(c1drg, InterfaceC1459120o4c.class, null);
        this.LLLIIII = C1664770tQJ.LIZIZ(c1drg, InterfaceC1458170o35.class, null);
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 658));
        this.LLLIIIL = new C1459000o4Q(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LLLII(X.InterfaceC1455860nzM r9) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1459010o4R.LLLII(X.0nzM):kotlin.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C204628155e LLLLIILL(boolean r20) {
        /*
            Method dump skipped, instruction units count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1459010o4R.LLLLIILL(boolean):X.155e");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    @Override // com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onActivityCreated(r5)
            X.1DRG r3 = r4.LLJI
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r4.LLLLII()
            com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1$Config r0 = com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1.LIZ()
            boolean r0 = r0.enableMergeEPLazy
            r1 = 0
            if (r0 == 0) goto L75
            java.lang.Class<X.0ETY> r0 = X.C0ETY.class
            java.lang.Object r3 = r3.LJII(r0, r1)
            X.0ETY r3 = (X.C0ETY) r3
            java.lang.Class<X.0nv4> r2 = X.InterfaceC1453200nv4.class
            kotlin.jvm.internal.AwS601S0100000_22 r1 = new kotlin.jvm.internal.AwS601S0100000_22
            r0 = 437(0x1b5, float:6.12E-43)
            r1.<init>(r4, r0)
        L23:
            r3.Sd(r2, r1)
        L26:
            X.0o4a r0 = r4.LLLJL()
            X.0Lyd r2 = r0.LJIIIZ()
            if (r2 == 0) goto L3a
            Y.AObjectS245S0100000_22 r1 = new Y.AObjectS245S0100000_22
            r0 = 168(0xa8, float:2.35E-43)
            r1.<init>(r4, r0)
            r2.LIZ(r4, r1)
        L3a:
            X.0o4a r0 = r4.LLLJL()
            X.0Lyd r2 = r0.LJI()
            if (r2 == 0) goto L4e
            Y.AObjectS245S0100000_22 r1 = new Y.AObjectS245S0100000_22
            r0 = 169(0xa9, float:2.37E-43)
            r1.<init>(r4, r0)
            r2.LIZ(r4, r1)
        L4e:
            X.0o4a r0 = r4.LLLJL()
            X.0Lyd r2 = r0.LJIILJJIL()
            if (r2 == 0) goto L62
            Y.AObjectS240S0100000_5 r1 = new Y.AObjectS240S0100000_5
            r0 = 26
            r1.<init>(r4, r0)
            r2.LIZ(r4, r1)
        L62:
            X.0o4a r0 = r4.LLLJL()
            X.0Lyd r2 = r0.LIZLLL()
            Y.AObjectS245S0100000_22 r1 = new Y.AObjectS245S0100000_22
            r0 = 170(0xaa, float:2.38E-43)
            r1.<init>(r4, r0)
            r2.LIZ(r4, r1)
            return
        L75:
            boolean r0 = X.C365940EWi.LIZLLL(r2)
            if (r0 == 0) goto L8d
            java.lang.Class<X.0ETY> r0 = X.C0ETY.class
            java.lang.Object r3 = r3.LJII(r0, r1)
            X.0ETY r3 = (X.C0ETY) r3
            java.lang.Class<X.0nv4> r2 = X.InterfaceC1453200nv4.class
            kotlin.jvm.internal.AwS601S0100000_22 r1 = new kotlin.jvm.internal.AwS601S0100000_22
            r0 = 438(0x1b6, float:6.14E-43)
            r1.<init>(r4, r0)
            goto L23
        L8d:
            java.lang.Class<X.0nv4> r0 = X.InterfaceC1453200nv4.class
            java.lang.Object r0 = r3.LJIIL(r1, r0)
            X.05YF r0 = (X.C05YF) r0
            X.0nv4 r0 = (X.InterfaceC1453200nv4) r0
            if (r0 == 0) goto L26
            com.bytedance.als.LiveEvent r2 = r0.W60()
            if (r2 == 0) goto L26
            Y.AObjectS245S0100000_22 r1 = new Y.AObjectS245S0100000_22
            r0 = 167(0xa7, float:2.34E-43)
            r1.<init>(r4, r0)
            r2.LIZ(r4, r1)
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1459010o4R.onActivityCreated(android.os.Bundle):void");
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.eoh, viewGroup, false);
        viewTd.findViewById(R.id.txu);
        return viewTd;
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZLLL(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
