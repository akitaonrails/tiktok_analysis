package X;

import Y.AObjectS240S0100000_5;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEMediaSettings;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.android.editor.track.TrackShowType;
import java.util.List;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E9f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C359930E9f extends AbstractC381020Ewm<InterfaceC376600Epe> implements InterfaceC376600Epe, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public static final int LLJJIII;
    public final C19A3 LLILLL;
    public final C1DRG LLILZ;
    public final InterfaceC376600Epe LLILZIL;
    public final InterfaceC1731706qJ LLILZLL;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final InterfaceC1731706qJ LLJI;
    public final InterfaceC1731706qJ LLJIJIL;
    public final InterfaceC1731706qJ LLJILJIL;
    public final InterfaceC1731706qJ LLJILJILJ;
    public final C01GW LLJILLL;
    public long LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C359930E9f.class, "epLoaderApi", "getEpLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C359930E9f.class, "epStateApi", "getEpStateApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProStateApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C359930E9f.class, "bottomBarApi", "getBottomBarApi()Lcom/ss/android/ugc/gamora/editorpro/framework/bottombar/ui/BottomBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C359930E9f.class, "controlBar", "getControlBar()Lcom/ss/ugc/android/editor/components/base/api/ConsoleBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C359930E9f.class, "trackApi", "getTrackApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C359930E9f.class, "epLegacyApi", "getEpLegacyApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EPSceneLegacyApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C359930E9f.class, "previewPanelApi", "getPreviewPanelApi()Lcom/ss/ugc/android/editor/preview/PreviewPanelApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C359930E9f.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0);
        c09r3.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8};
        LLJJIII = 8;
    }

    private final InterfaceC360800ECo G2() {
        return (InterfaceC360800ECo) this.LLJ.getValue(this, LLJJI[3]);
    }

    private final List<InterfaceC359970E9j> H2() {
        return (List) this.LLJILLL.getValue();
    }

    private final InterfaceC359950E9h i3() {
        return (InterfaceC359950E9h) this.LLIZ.getValue(this, LLJJI[1]);
    }

    public final InterfaceC377540ErA T2() {
        return (InterfaceC377540ErA) this.LLJILJILJ.getValue(this, LLJJI[7]);
    }

    public final C0EC7 W2() {
        return (C0EC7) this.LLJIJIL.getValue(this, LLJJI[5]);
    }

    public final C0EY2 c3() {
        return (C0EY2) this.LLILZLL.getValue(this, LLJJI[0]);
    }

    public final InterfaceC361710EGb m3() {
        return (InterfaceC361710EGb) this.LLJILJIL.getValue(this, LLJJI[6]);
    }

    public final C0E5S q3() {
        return (C0E5S) this.LLJI.getValue(this, LLJJI[4]);
    }

    public final C0EGY w2() {
        return (C0EGY) this.LLIZLLLIL.getValue(this, LLJJI[2]);
    }

    private final InterfaceC359850E8x B20() {
        return w2().B20();
    }

    private final void H3() {
        C0E48 c0e48W1 = W1();
        if (c0e48W1 == null) {
            return;
        }
        q3().I61(C350870DpF.LJI(c0e48W1), false, true);
        c0e48W1.getPlayer().LJIJI(this.LLJJ * ((long) LSPassThroughRecordSizeConfig.DEFAULT), C351110Dpd.LIZ);
        q3().QD2(true, false);
        this.LLJJ = 0L;
    }

    private final void Z1() {
        C358780E4u c358780E4uXJ2;
        C0EHI value = c3().zu2().getValue();
        if (value == null) {
            return;
        }
        C0ELJ c0elj = value.LJ;
        C0E48 c0e48W1 = W1();
        if (c0e48W1 == null) {
            return;
        }
        C0EC7 c0ec7W2 = W2();
        if (c0ec7W2 != null && (c358780E4uXJ2 = c0ec7W2.xJ2()) != null) {
            c358780E4uXJ2.LLJJIII = true;
        }
        if (value.LJFF) {
            H3();
            return;
        }
        if (c0elj.getFromRetouch()) {
            c0e48W1.getPlayer().LJIJI(C351220Dpo.LLLLLLJ(c0e48W1.getPlayer().Jh()), C351110Dpd.LIZ);
            return;
        }
        if (c0elj.getInitIntent() != null) {
            c0e48W1.getPlayer().LJIJI(0L, C351110Dpd.LIZ);
            E3(c0elj);
        } else if (c0elj.getEnterSelectSlotId() != null && c0elj.getChangeBanMusicMode() == null) {
            v3(c0elj, c0e48W1);
        } else if (c0elj.isSlideInto()) {
            B3(c0e48W1, c0elj);
        } else {
            c0e48W1.getPlayer().LJIJI(0L, C351110Dpd.LIZ);
        }
    }

    public final void X1() {
        Z1();
        for (InterfaceC359970E9j interfaceC359970E9j : H2()) {
            if (!interfaceC359970E9j.LIZ() || !i3().gv0()) {
                interfaceC359970E9j.LIZIZ(this);
            }
        }
    }

    @Override // X.InterfaceC376600Epe
    public void nq0() {
        this.LLJJ = G2().jq().LIZJ().longValue();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        i3().K50().LIZ(this, new AObjectS240S0100000_5(this, 143));
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        super.onStop();
        if (this.LLJJ == 0) {
            this.LLJJ = G2().jq().LIZJ().longValue();
        }
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILZ;
    }

    public InterfaceC376600Epe o2() {
        return this.LLILZIL;
    }

    private final void E3(C0ELJ c0elj) {
        NLEModel nLEModelLJI;
        C0E48 c0e48W1;
        NLETrack nLETrackLIZLLL;
        VecNLETrackSlotSPtr sortedSlots;
        NLETrackSlot nLETrackSlot;
        boolean z;
        EnumC359990E9l initIntent = c0elj.getInitIntent();
        if (initIntent == null) {
            return;
        }
        int i = C359980E9k.LIZ[initIntent.ordinal()];
        Boolean boolValueOf = null;
        if (i != 1 && i != 2) {
            if (i == 3 && (c0e48W1 = W1()) != null && (nLETrackLIZLLL = C349930Dnj.LIZLLL(C350870DpF.LJI(c0e48W1))) != null && (sortedSlots = nLETrackLIZLLL.getSortedSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(sortedSlots)) != null) {
                InterfaceC359940E9g interfaceC359940E9gAZ0 = w2().AZ0();
                if (interfaceC359940E9gAZ0 != null) {
                    boolean zLJII = false;
                    if (interfaceC359940E9gAZ0.LJIILJJIL() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (interfaceC359940E9gAZ0 != null) {
                        zLJII = interfaceC359940E9gAZ0.LJII();
                    }
                    if (z && !zLJII && interfaceC359940E9gAZ0 != null) {
                        interfaceC359940E9gAZ0.LJIILLIIL(Boolean.FALSE);
                    }
                }
                c0e48W1.S7().LIZIZ(new C358740E4q(nLETrackSlot, 0, null, true, 0, 238), "selected_audio_track_slot", true);
                if (C359960E9i.LIZ(null)) {
                    C363750ENx.LIZ.LIZIZ("func_bar_transition_anim_show", true);
                    return;
                }
                return;
            }
            return;
        }
        C1388190mED.LIZIZ(C1664590tQ1.LJIIIZ(this));
        C0E48 c0e48W12 = W1();
        if (c0e48W12 != null && (nLEModelLJI = C350870DpF.LJI(c0e48W12)) != null) {
            boolValueOf = Boolean.valueOf(C349760DnS.LIZIZ(nLEModelLJI));
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            InterfaceC359850E8x interfaceC359850E8xB20 = B20();
            if (interfaceC359850E8xB20 != null) {
                interfaceC359850E8xB20.LJIIL("bottom_item_root_filter");
            }
            q3().da0(TrackShowType.FILTER);
            return;
        }
        C0E48 c0e48W13 = W1();
        if (c0e48W13 == null) {
            return;
        }
        C375820EoO.LIZ(this.LLILLL, c0e48W13, C364870ESf.class, new C360010E9n(new C355530Dwl((EnumC356350Dy5) null, (NLETrack) null, 0L, initIntent.getValue(), 15), c0e48W13), 16);
    }

    public C359930E9f(C19A3 c19a3, C1DRG c1drg) {
        super(c1drg);
        this.LLILLL = c19a3;
        this.LLILZ = c1drg;
        this.LLILZIL = this;
        this.LLILZLL = C1664770tQJ.LIZ(getDiContainer(), C0EY2.class, null);
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC359950E9h.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), C0EGY.class, null);
        this.LLJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC360800ECo.class, null);
        this.LLJI = C1664770tQJ.LIZ(getDiContainer(), C0E5S.class, null);
        this.LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), C0EC7.class, null);
        this.LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC361710EGb.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC377540ErA.class, null);
        this.LLJILLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 936));
    }

    private final void B3(C0E48 c0e48, C0ELJ c0elj) {
        INLEMediaSettings mediaSettingApi;
        INLEMediaSession iNLEMediaSessionF1 = c0e48.f1();
        if (iNLEMediaSessionF1 != null && (mediaSettingApi = iNLEMediaSessionF1.getMediaSettingApi()) != null) {
            mediaSettingApi.setLoopPlay(false);
        }
        c0e48.getPlayer().LJIILL(true);
    }

    private final void v3(C0ELJ c0elj, C0E48 c0e48) {
        NLETrackSlot nLETrackSlotLJL;
        C0E6E c0e6e;
        String enterSelectSlotId = c0elj.getEnterSelectSlotId();
        if (C123100dR.LIZ(enterSelectSlotId)) {
            nLETrackSlotLJL = C351220Dpo.LJL(C350870DpF.LJI(c0e48), enterSelectSlotId);
        } else {
            nLETrackSlotLJL = null;
        }
        String enterSelectedFuncType = c0elj.getEnterSelectedFuncType();
        if (nLETrackSlotLJL != null) {
            if (C123100dR.LIZ(enterSelectedFuncType)) {
                c0e6e = C0E6E.LINE;
            } else {
                c0e6e = C0E6E.CLIP;
            }
            q3().G22(nLETrackSlotLJL, c0e6e, EnumC358760E4s.NORMAL, false, C359960E9i.LIZ(c0elj), true);
            c0elj.setEnterSelectSlotId(null);
            c0e48.getPlayer().LJIJI(c0elj.getEnterMovePos(), C351110Dpd.LIZ);
            if (C123100dR.LIZ(enterSelectedFuncType)) {
                InterfaceC359940E9g interfaceC359940E9gAZ0 = w2().AZ0();
                if (interfaceC359940E9gAZ0 != null) {
                    interfaceC359940E9gAZ0.LJIIIZ(enterSelectedFuncType);
                }
                c0elj.setEnterSelectedFuncType(null);
            }
        }
    }
}
