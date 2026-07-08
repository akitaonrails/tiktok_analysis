package X;

import Y.AObjectS240S0100000_5;
import Y.AObserverS209S0100000_5;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ECA, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ECA extends AbstractC381020Ewm<C0EGQ> implements C0EGQ, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final int LLJIJIL;
    public final C1DRG LLILLL;
    public final InterfaceC1731706qJ LLILZ;
    public final InterfaceC1731706qJ LLILZIL;
    public final InterfaceC1731706qJ LLILZLL;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public C09AE LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0ECA.class, "bottomBarApi", "getBottomBarApi()Lcom/ss/android/ugc/gamora/editorpro/framework/bottombar/ui/BottomBarApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0ECA.class, "epLoaderApi", "getEpLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0ECA.class, "epInitLegacyApi", "getEpInitLegacyApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EPSceneLegacyApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0ECA.class, "epStateApi", "getEpStateApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProStateApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C0ECA.class, "trackApi", "getTrackApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLJIJIL = 8;
    }

    public C0EGQ Z1() {
        return this;
    }

    private final InterfaceC359950E9h H2() {
        return (InterfaceC359950E9h) this.LLIZ.getValue(this, LLJI[3]);
    }

    private final C0E5S T2() {
        return (C0E5S) this.LLIZLLLIL.getValue(this, LLJI[4]);
    }

    public final C0EY2 G2() {
        return (C0EY2) this.LLILZIL.getValue(this, LLJI[1]);
    }

    public final void X1() {
        C354270Duj.LIZ(0L, new AwS549S0100000_5(this, 409));
    }

    public final void Xi() {
        LiveData<C0EHI> liveDataZu2;
        C0EHI value;
        C0ELJ c0elj;
        InterfaceC359950E9h interfaceC359950E9hH2;
        LiveEvent<Unit> liveEventJI;
        o2().aE0(new InterfaceC361900EGu() { // from class: X.0ECC
            @Override // X.InterfaceC361900EGu
            public final void LIZIZ(List<String> list) {
            }

            @Override // X.InterfaceC361900EGu
            public final void LIZ(List<String> list) {
                if (!((ArrayList) list).contains("bottom_item_sound_add_sound")) {
                    return;
                }
                this.LIZ.X1();
            }
        });
        InterfaceC359940E9g interfaceC359940E9gAZ0 = o2().AZ0();
        if (interfaceC359940E9gAZ0 != null) {
            interfaceC359940E9gAZ0.LIZJ(new C0EHU() { // from class: X.0ECB
                @Override // X.C0EHU
                public final void LIZJ(C361980EHc c361980EHc) {
                }

                @Override // X.C0EHU
                public final void LIZLLL(C361980EHc c361980EHc) {
                }

                @Override // X.C0EHU
                public final void LIZ(boolean z) {
                    LiveData<C0EHI> liveDataZu22;
                    C0EHI value2;
                    C0ELJ c0elj2;
                    C0EY2 c0ey2G2 = this.LIZ.G2();
                    if (c0ey2G2 != null && (liveDataZu22 = c0ey2G2.zu2()) != null && (value2 = liveDataZu22.getValue()) != null && (c0elj2 = value2.LJ) != null && c0elj2.getChangeBanMusicMode() != null) {
                        this.LIZ.X1();
                    }
                }

                @Override // X.C0EHU
                public final void LIZIZ(C361980EHc c361980EHc) {
                    if (Intrinsics.LJFF(c361980EHc.LJI, "bottom_item_root_sound")) {
                        this.LIZ.W2();
                    }
                }

                @Override // X.C0EHU
                public final void LJ(C361980EHc c361980EHc) {
                    String str;
                    if (c361980EHc != null) {
                        str = c361980EHc.LJIIL;
                    } else {
                        str = null;
                    }
                    if (Intrinsics.LJFF(str, "bottom_item_root_sound")) {
                        this.LIZ.W2();
                    }
                }
            });
        }
        C0EY2 c0ey2G2 = G2();
        if (c0ey2G2 == null || (liveDataZu2 = c0ey2G2.zu2()) == null || (value = liveDataZu2.getValue()) == null || (c0elj = value.LJ) == null || c0elj.getChangeBanMusicMode() == null || (interfaceC359950E9hH2 = H2()) == null || (liveEventJI = interfaceC359950E9hH2.JI()) == null) {
            return;
        }
        liveEventJI.LJII(this, Lifecycle.State.RESUMED, new AObjectS240S0100000_5(this, 61));
    }

    public final VideoPublishEditModel getEditModel() {
        if (C364210EPr.LIZIZ) {
            EditModelProvider.Companion.getClass();
            VideoPublishEditModel editModel = C0E1T.LIZ().getEditModel();
            if (editModel != null) {
                return editModel;
            }
        }
        return new VideoPublishEditModel();
    }

    public final C0EGY o2() {
        return (C0EGY) this.LLILZ.getValue(this, LLJI[0]);
    }

    public final C0EC7 w2() {
        return (C0EC7) this.LLILZLL.getValue(this, LLJI[2]);
    }

    public final void W2() {
        C0EGC musicController;
        C0E48 c0e48W1 = W1();
        boolean z = (c0e48W1 != null ? C350870DpF.LJI(c0e48W1).getDuration() : 0L) > 60000000;
        if (getEditModel().getEditorProModel().getShowMultiMusicEntrance() != z) {
            getEditModel().getEditorProModel().setShowMultiMusicEntrance(z);
        }
        C0EC7 c0ec7W2 = w2();
        boolean z2 = (c0ec7W2 == null || (musicController = c0ec7W2.getMusicController()) == null || !musicController.b1()) ? false : true;
        C0E48 c0e48W12 = W1();
        if (c0e48W12 != null) {
            C350870DpF.LJIIIZ(c0e48W12, "event_music_added", Boolean.valueOf(z2));
        }
    }

    public final void c3() {
        if (getEditModel().mIsFromDraft && C349930Dnj.LIZ(getEditModel(), null, false)) {
            MusicBuzModel musicBuzModel = getEditModel().creativeModel.musicBuzModel;
            if (C1429680nJ8.LIZJ(musicBuzModel).length() == 0) {
                return;
            }
            if (musicBuzModel.extendMusicList == null || !(!r0.isEmpty())) {
                MusicObject musicObject = musicBuzModel.music;
                if (musicObject == null || !musicObject.canBeStitched) {
                    this.LLJ = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0EC9(musicBuzModel, this, null), 3);
                }
            }
        }
    }

    @Override // X.C0EGQ
    public void k1() {
        C0EGC musicController;
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null) {
            NLEModel nLEModelLJI = C350870DpF.LJI(c0e48W1);
            boolean showMultiMusicEntrance = getEditModel().getEditorProModel().getShowMultiMusicEntrance();
            boolean z = nLEModelLJI.getDuration() > ((long) 60000000);
            if (showMultiMusicEntrance != z) {
                getEditModel().getEditorProModel().setShowMultiMusicEntrance(z);
                C0E48 c0e48W12 = W1();
                if (c0e48W12 != null) {
                    C0EC7 c0ec7W2 = w2();
                    C350870DpF.LJIIIZ(c0e48W12, "event_music_added", Boolean.valueOf((c0ec7W2 == null || (musicController = c0ec7W2.getMusicController()) == null || !musicController.b1()) ? false : true));
                }
                C0E5S c0e5sT2 = T2();
                if (c0e5sT2 != null) {
                    c0e5sT2.yV(new AwS371S0200000_5(this, nLEModelLJI, 73));
                }
            }
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        LiveData<Boolean> liveDataQO0;
        super.onCreate();
        o2().zb0().observe(this, new AObserverS209S0100000_5(this, 43));
        InterfaceC359950E9h interfaceC359950E9hH2 = H2();
        if (interfaceC359950E9hH2 == null || (liveDataQO0 = interfaceC359950E9hH2.QO0()) == null) {
            return;
        }
        C0EHK.LJIIJ(liveDataQO0, this, new AObserverS209S0100000_5(this, 44));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        C09AE c09ae;
        super.onDestroy();
        C09AE c09ae2 = this.LLJ;
        if (c09ae2 == null || !c09ae2.isActive() || (c09ae = this.LLJ) == null) {
            return;
        }
        c09ae.LIZIZ(null);
    }

    @Override // X.C0EGQ
    public void T0() {
        X1();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        Z1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    public C0ECA(C1DRG c1drg) {
        super(c1drg);
        this.LLILLL = c1drg;
        this.LLILZ = C1664770tQJ.LIZ(getDiContainer(), C0EGY.class, null);
        this.LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), C0EY2.class, null);
        this.LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), C0EC7.class, null);
        this.LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC359950E9h.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), C0E5S.class, null);
    }
}
