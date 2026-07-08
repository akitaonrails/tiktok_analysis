package X;

import Y.AObserverS209S0100000_5;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLECommonKeyframe;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEKeyframe;
import com.bytedance.ies.nle.editor_jni.NLEKeyframeType;
import com.bytedance.ies.nle.editor_jni.NLEMask;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCrop;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.PairIntInt;
import com.bytedance.ies.nle.editor_jni.VecNLECommonKeyframe;
import com.bytedance.ies.nle.editor_jni.VecNLEFilterSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEKeyframe;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoEffectSPtr;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModelStatus;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.info.InfoStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel;
import com.ss.ugc.android.editor.track.CurrentSlotInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ELO, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ELO extends AbstractC381020Ewm<InterfaceC363160ELq> implements InterfaceC363160ELq, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public static final int LLJJJ;
    public final C1DRG LLILLL;
    public final C372830EjZ LLILZ;
    public final InterfaceC363160ELq LLILZIL;
    public final InterfaceC1731706qJ LLILZLL;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final InterfaceC1731706qJ LLJI;
    public InterfaceC363010ELb LLJIJIL;
    public final Map<String, C0ELX> LLJILJIL;
    public String LLJILJILJ;
    public final C01GW LLJILLL;
    public boolean LLJJ;
    public C0EOK LLJJI;
    public final C363000ELa LLJJIII;
    public final InterfaceC363790EOb LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0ELO.class, "trackApi", "getTrackApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0ELO.class, "previewPanelApi", "getPreviewPanelApi()Lcom/ss/ugc/android/editor/preview/PreviewPanelApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0ELO.class, "epPanelApi", "getEpPanelApi()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/EPPanelApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0ELO.class, "epStateApi", "getEpStateApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProStateApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C0ELO.class, "epAIGCResultPanelApi", "getEpAIGCResultPanelApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/shared/results/EditorProAIGCResultsPanelApi;", 0);
        c09r3.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLJJJ = 8;
    }

    private final C0E5S E3() {
        return (C0E5S) this.LLILZLL.getValue(this, LLJJIJIL[0]);
    }

    private final void O3() {
        ViewGroup viewGroup;
        if (this.LLJIJIL != null) {
            return;
        }
        View previewLayout = this.LLILZ.getPreviewLayout();
        if (!(previewLayout instanceof ViewGroup) || (viewGroup = (ViewGroup) previewLayout) == null) {
            return;
        }
        C363200ELu c363200ELu = new C363200ELu(this.LLILZ.getContext(), null, 6);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
        layoutParams.gravity = 1;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c363200ELu);
        c363200ELu.setLayoutParams(layoutParams);
        viewGroup.addView(c363200ELu);
        this.LLJIJIL = c363200ELu;
        c363200ELu.LIZLLL(Integer.valueOf(viewGroup.getWidth()), Integer.valueOf(viewGroup.getHeight()));
    }

    private final InterfaceC351060DpY W2() {
        return (InterfaceC351060DpY) this.LLJILLL.getValue();
    }

    private final InterfaceC377410Eqx c3() {
        return (InterfaceC377410Eqx) this.LLJI.getValue(this, LLJJIJIL[4]);
    }

    private final C0EB6 i3() {
        return (C0EB6) this.LLIZLLLIL.getValue(this, LLJJIJIL[2]);
    }

    private final InterfaceC359950E9h m3() {
        return (InterfaceC359950E9h) this.LLJ.getValue(this, LLJJIJIL[3]);
    }

    public final InterfaceC361710EGb v3() {
        return (InterfaceC361710EGb) this.LLIZ.getValue(this, LLJJIJIL[1]);
    }

    @Override // X.InterfaceC363160ELq
    public InterfaceC363020ELc xG2() {
        return (InterfaceC363020ELc) this.LLJJIJIIJIL.getValue();
    }

    private final int B3() {
        CurrentSlotInfo currentSlotInfoVD1;
        C0E48 c0e48W1 = W1();
        if (c0e48W1 == null || (currentSlotInfoVD1 = E3().vD1()) == null) {
            return 0;
        }
        int i = currentSlotInfoVD1.index;
        NLETrackSlot nLETrackSlot = currentSlotInfoVD1.slot;
        long j = currentSlotInfoVD1.playTime;
        if (nLETrackSlot != null) {
            return nLETrackSlot.getMeasuredEndTime() - j <= nLETrackSlot.getDuration() / ((long) 2) ? i + 1 : i;
        }
        VecNLETrackSlotSPtr slots = c0e48W1.Rn().getSlots();
        if (slots != null) {
            return slots.size();
        }
        return 0;
    }

    private final boolean Q3() {
        C0E2C c0e2cLIZIZ;
        C0E48 c0e48W1 = W1();
        return c0e48W1 != null && (c0e2cLIZIZ = C0EB5.LIZIZ(c0e48W1, i3())) != null && c0e2cLIZIZ.LIZ && Intrinsics.LJFF(c0e2cLIZIZ.LIZJ, "mask_panel");
    }

    public final void e4() {
        E3().zE2().observe(this, new AObserverS209S0100000_5(this, 96));
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_ep_i2v_generating_hide_sticker", true, true)) {
            ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(C0EOK.class, new AwS584S0100000_5(this, 757));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        m3().QO0().observe(this, new AObserverS209S0100000_5(this, 95));
    }

    public InterfaceC363160ELq T2() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    public final InterfaceC363010ELb q3() {
        return this.LLJIJIL;
    }

    public final void K4(boolean z) {
        C0E48 c0e48W1;
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_ep_i2v_generating_hide_sticker", true, true) || (c0e48W1 = W1()) == null) {
            return;
        }
        boolean z2 = false;
        for (NLETrack nLETrack : C350870DpF.LJI(c0e48W1).getTracks()) {
            if (C351220Dpo.LLJLILLLLZIIL(nLETrack) || C351220Dpo.LLJJJJ(nLETrack)) {
                VecNLETrackSlotSPtr slots = nLETrack.getSlots();
                if (slots != null) {
                    for (NLETrackSlot nLETrackSlot : slots) {
                        if (nLETrackSlot.getEnable() != z) {
                            nLETrackSlot.setEnable(z);
                            z2 = true;
                        }
                    }
                }
            }
        }
        if (z2) {
            c0e48W1.LLFII().LJI().commit();
        }
        z4(z);
        MutableLiveData mutableLiveDataLIZ = c0e48W1.S7().LIZ("set_sticker_visible");
        if (mutableLiveDataLIZ != null) {
            mutableLiveDataLIZ.postValue(Boolean.valueOf(z));
        }
        v3().o10(new C0ELW[]{C0ELW.TEXT_STICKER, C0ELW.INFO_STICKER, C0ELW.LYRIC_STICKER}, z);
        v3().Kq2(Boolean.valueOf(z), null, null, null);
        this.LLJJ = !z;
    }

    @Override // X.InterfaceC363160ELq
    public void dd0(String str) {
        C0ELX c0elx = this.LLJILJIL.get(str);
        if (c0elx == null || !c0elx.LJFF) {
            this.LLJILJIL.remove(str);
        }
        F4(this, false, false, false);
    }

    public final void o4(InterfaceC363010ELb interfaceC363010ELb) {
        this.LLJIJIL = interfaceC363010ELb;
    }

    public final void z4(boolean z) {
        LyricStickerModel lyricStickerModel;
        C0EOK c0eok = this.LLJJI;
        if (c0eok == null) {
            return;
        }
        for (StickerModel stickerModel : c0eok.LLLILZLLLI(EnumC1466150oFx.LYRIC_STICKER)) {
            if ((stickerModel instanceof LyricStickerModel) && (lyricStickerModel = (LyricStickerModel) stickerModel) != null && (!Intrinsics.LJFF(lyricStickerModel.getEnabled(), Boolean.FALSE)) != z) {
                c0eok.k3(lyricStickerModel.copy(lyricStickerModel.baseStickerModel, lyricStickerModel.uuid, lyricStickerModel.clipStart, lyricStickerModel.clipEnd, lyricStickerModel.musicId, lyricStickerModel.lyricId, lyricStickerModel.musicName, lyricStickerModel.lyricStyleUrs, lyricStickerModel.selectedFrom, lyricStickerModel.lyricStyleEffectId, lyricStickerModel.recommendWidth, lyricStickerModel.recommendHeight, lyricStickerModel.initialTrimInfo, lyricStickerModel.textStickerModels, lyricStickerModel.fallbackFonts, Boolean.valueOf(z)), EnumC356070Dxd.COMMIT);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.0ELa] */
    public C0ELO(C1DRG c1drg, C372830EjZ c372830EjZ) {
        super(c1drg);
        this.LLILLL = c1drg;
        this.LLILZ = c372830EjZ;
        this.LLILZIL = this;
        this.LLILZLL = C1664770tQJ.LIZ(getDiContainer(), C0E5S.class, null);
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC361710EGb.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), C0EB6.class, null);
        this.LLJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC359950E9h.class, null);
        this.LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC377410Eqx.class, null);
        this.LLJILJIL = new LinkedHashMap();
        this.LLJILLL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(271));
        this.LLJJIII = new C0FTB() { // from class: X.0ELa
            @Override // X.C0FTB
            public final void LIZ(StickerModel stickerModel, boolean z) {
            }

            @Override // X.C0FTB
            public final void LIZIZ(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LIZJ(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LIZLLL(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJ(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJFF(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJI(StickerModel stickerModel, boolean z) {
            }

            @Override // X.C0FTB
            public final void LJII() {
            }

            @Override // X.C0FTB
            public final void LJIIIIZZ(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIIIZ(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIIJ(StickerModel stickerModel, String str) {
            }

            @Override // X.C0FTB
            public final void LJIIJJI(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIIL(StickerModel stickerModel, int i) {
            }

            @Override // X.C0FTB
            public final void LJIILIIL(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIILJJIL(int i) {
            }

            @Override // X.C0FTB
            public final void LJIILL(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIILLIIL(int i) {
            }

            @Override // X.C0FTB
            public final void LJIIZILJ(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIJ(int i) {
            }

            @Override // X.C0FTB
            public final void LJIJI(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIJJ(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIJJLI(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIL() {
            }

            @Override // X.C0FTB
            public final void LJJ(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJJI(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJJIFFI(int i) {
            }

            @Override // X.C0FTB
            public final void LJJII(StickerModel stickerModel, MotionEvent motionEvent) {
            }

            @Override // X.C0FTB
            public final void LJJIII(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJJIIJ(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJJIIJZLJL(StickerModel stickerModel, boolean z, boolean z2) {
            }

            @Override // X.C0FTB
            public final void LJJIIZ() {
            }

            @Override // X.C0FTB
            public final void LJJIIZI(int i) {
            }

            @Override // X.C0FTB
            public final void LJJIJ() {
            }

            @Override // X.C0FTB
            public final void LJJIJIIJI(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJJIJIIJIL(int i) {
            }

            @Override // X.C0FTB
            public final EnumC1466150oFx[] LJJIJIL() {
                return EnumC1466150oFx.values();
            }

            @Override // X.C0FTB
            public final void f4(StickerModel stickerModel) {
                C0ELO c0elo = this.LL;
                if (!c0elo.LLJJ) {
                    return;
                }
                c0elo.K4(false);
            }
        };
        this.LLJJIJI = new InterfaceC363790EOb() { // from class: X.0EOY
            @Override // X.InterfaceC363790EOb
            public final StickerModel LIZ(StickerModel stickerModel) {
                if (!this.LIZ.LLJJ) {
                    return stickerModel;
                }
                if (stickerModel instanceof LyricStickerModel) {
                    LyricStickerModel lyricStickerModel = (LyricStickerModel) stickerModel;
                    return lyricStickerModel.copy(lyricStickerModel.baseStickerModel, lyricStickerModel.uuid, lyricStickerModel.clipStart, lyricStickerModel.clipEnd, lyricStickerModel.musicId, lyricStickerModel.lyricId, lyricStickerModel.musicName, lyricStickerModel.lyricStyleUrs, lyricStickerModel.selectedFrom, lyricStickerModel.lyricStyleEffectId, lyricStickerModel.recommendWidth, lyricStickerModel.recommendHeight, lyricStickerModel.initialTrimInfo, lyricStickerModel.textStickerModels, lyricStickerModel.fallbackFonts, Boolean.FALSE);
                }
                if (!(stickerModel instanceof InfoStickerModel)) {
                    return stickerModel;
                }
                InfoStickerModel infoStickerModel = (InfoStickerModel) stickerModel;
                return infoStickerModel.copy(infoStickerModel.baseStickerModel, infoStickerModel.uuid, infoStickerModel.path, infoStickerModel.iconPath, infoStickerModel.stickerId, infoStickerModel.resId, infoStickerModel.effectType, infoStickerModel.type, infoStickerModel.extra, infoStickerModel.panel, infoStickerModel.imageStickerModel, infoStickerModel.isImageSticker, infoStickerModel.enableGesture, infoStickerModel.visible, false, infoStickerModel.isPinning, infoStickerModel.sourceType, infoStickerModel.stickerType, infoStickerModel.isFromPUGCTemplate);
            }
        };
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 895));
    }

    private final void X1(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
        Iterator<NLEVideoAnimation> it2 = nLETrackSlot.getVideoAnims().iterator();
        while (it2.hasNext()) {
            nLETrackSlot2.addVideoAnim(it2.next());
        }
        nLETrackSlot2.setExtra("key_is_use_anim_new_ui", nLETrackSlot.getExtra("key_is_use_anim_new_ui"));
        nLETrackSlot2.setExtra("anim_type", nLETrackSlot.getExtra("anim_type"));
        nLETrackSlot2.setExtra("ep_anim_res_id", nLETrackSlot.getExtra("ep_anim_res_id"));
    }

    private final void o2(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
        if (nLETrackSlot.hasExtra("freeze_from_uuid")) {
            nLETrackSlot2.setExtra("freeze_from_uuid", nLETrackSlot.getExtra("freeze_from_uuid"));
        }
        if (nLETrackSlot.hasExtra("freeze_from_resource_path")) {
            nLETrackSlot2.setExtra("freeze_from_resource_path", nLETrackSlot.getExtra("freeze_from_resource_path"));
        }
        if (nLETrackSlot.hasExtra("freeze_timestamp")) {
            nLETrackSlot2.setExtra("freeze_timestamp", nLETrackSlot.getExtra("freeze_timestamp"));
        }
    }

    public final void H3(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
        float fLJLLLL = C351220Dpo.LJLLLL(nLETrackSlot.getMainSegment());
        NLEFilter nLEFilterLJJLL = C351220Dpo.LJJLL(nLETrackSlot);
        C351220Dpo.LLLLLL(nLETrackSlot2.getMainSegment(), fLJLLLL);
        if (nLEFilterLJJLL != null) {
            if (nLEFilterLJJLL.getSegment() != null) {
                nLETrackSlot2.removeFilterByName(nLEFilterLJJLL.getSegment().getFilterName());
            }
            nLETrackSlot2.addFilter(nLEFilterLJJLL);
        }
    }

    @Override // X.InterfaceC363160ELq
    public void P50(boolean z, boolean z2) {
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null) {
            E3().I61(C350870DpF.LJI(c0e48W1), z, z2);
        }
    }

    @Override // X.InterfaceC363160ELq
    public NLETrackSlot Qa1(String str, C0ELT c0elt) {
        return G2(str, c0elt, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008f A[PHI: r8 r9 r10
      0x008f: PHI (r8v3 float) = (r8v5 float), (r8v6 float) binds: [B:28:0x007c, B:20:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x008f: PHI (r9v1 android.graphics.Bitmap) = (r9v3 android.graphics.Bitmap), (r9v4 android.graphics.Bitmap) binds: [B:28:0x007c, B:20:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x008f: PHI (r10v0 java.lang.String) = (r10v3 java.lang.String), (r10v5 java.lang.String) binds: [B:28:0x007c, B:20:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC363160ELq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void gb0(com.bytedance.ies.nle.editor_jni.NLEModel r15, java.util.Map<java.lang.String, X.C0ELY> r16) {
        /*
            r14 = this;
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = r15.getMainTrack()
            r3 = 0
            if (r0 == 0) goto L9a
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r0 = r0.getSlots()
            if (r0 == 0) goto L9a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r0.iterator()
        L1b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r2 = r5.next()
            r1 = r2
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r1 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r1
            boolean r0 = X.C0E5J.LIZJ(r1)
            if (r0 != 0) goto L34
            boolean r0 = X.C0E5J.LIZLLL(r1)
            if (r0 == 0) goto L1b
        L34:
            r6.add(r2)
            goto L1b
        L38:
            java.util.Iterator r6 = r6.iterator()
        L3c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r11 = r6.next()
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r11 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r11
            java.lang.String r5 = r11.getUUID()
            java.util.Map<java.lang.String, X.0ELX> r0 = r14.LLJILJIL
            java.lang.Object r2 = r0.get(r5)
            X.0ELX r2 = (X.C0ELX) r2
            r0 = r16
            java.lang.Object r1 = r0.get(r5)
            X.0ELY r1 = (X.C0ELY) r1
            X.0ELX r7 = new X.0ELX
            if (r2 == 0) goto L92
            float r8 = r2.LIZ
            android.graphics.Bitmap r9 = r2.LIZIZ
            java.lang.String r10 = r2.LIZJ
            if (r10 != 0) goto L8f
        L68:
            com.bytedance.ies.nle.editor_jni.NLESegment r0 = r11.getMainSegment()
            if (r0 == 0) goto L7a
            com.bytedance.ies.nle.editor_jni.NLEResourceNode r0 = r0.getResource()
            if (r0 == 0) goto L7a
            java.lang.String r10 = r0.getResourceFile()
            if (r10 != 0) goto L7c
        L7a:
            java.lang.String r10 = ""
        L7c:
            if (r2 != 0) goto L8f
            if (r1 == 0) goto L8d
            boolean r12 = r1.LIZ
        L82:
            boolean r13 = X.C0E5J.LIZLLL(r11)
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r4.put(r5, r7)
            goto L3c
        L8d:
            r12 = 0
            goto L82
        L8f:
            boolean r12 = r2.LJ
            goto L82
        L92:
            if (r1 == 0) goto L98
            float r8 = r1.LIZIZ
        L96:
            r9 = r3
            goto L68
        L98:
            r8 = 0
            goto L96
        L9a:
            java.util.Map<java.lang.String, X.0ELX> r0 = r14.LLJILJIL
            r0.clear()
            java.util.Map<java.lang.String, X.0ELX> r0 = r14.LLJILJIL
            r0.putAll(r4)
            r14.LLJILJILJ = r3
            r1 = 1
            r0 = 0
            F4(r14, r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ELO.gb0(com.bytedance.ies.nle.editor_jni.NLEModel, java.util.Map):void");
    }

    public final void w2(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
        NLEStyCrop crop;
        nLETrackSlot2.setTransformX(nLETrackSlot.getTransformX());
        nLETrackSlot2.setTransformY(nLETrackSlot.getTransformY());
        nLETrackSlot2.setTransformZ(nLETrackSlot.getTransformZ());
        nLETrackSlot2.setRotation(nLETrackSlot.getRotation());
        nLETrackSlot2.setScale(nLETrackSlot.getScale());
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot2.getMainSegment());
        if (nLESegmentVideoDynamicCast != null) {
            nLESegmentVideoDynamicCast.setAlpha(C351220Dpo.LJJLIIIJLLLLLLLZ(nLETrackSlot));
        }
        NLESegmentVideo nLESegmentVideoDynamicCast2 = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentVideoDynamicCast2 != null && (crop = nLESegmentVideoDynamicCast2.getCrop()) != null) {
            NLESegmentVideo nLESegmentVideoDynamicCast3 = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot2.getMainSegment());
            if (nLESegmentVideoDynamicCast3 != null) {
                nLESegmentVideoDynamicCast3.setIsWithEffect(true);
            }
            NLESegmentVideo nLESegmentVideoDynamicCast4 = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot2.getMainSegment());
            if (nLESegmentVideoDynamicCast4 != null) {
                nLESegmentVideoDynamicCast4.setCrop(NLEStyCrop.dynamicCast(crop.deepClone(true)));
            }
            nLETrackSlot2.setExtra("ep_crop_transX", nLETrackSlot.getExtra("ep_crop_transX"));
            nLETrackSlot2.setExtra("ep_crop_transY", nLETrackSlot.getExtra("ep_crop_transY"));
            nLETrackSlot2.setExtra("ep_crop_scale", nLETrackSlot.getExtra("ep_crop_scale"));
            nLETrackSlot2.setExtra("ep_crop_degree", nLETrackSlot.getExtra("ep_crop_degree"));
            nLETrackSlot2.setExtra("ep_crop_ratio", nLETrackSlot.getExtra("ep_crop_ratio"));
            nLETrackSlot2.setExtra("ep_crop_mode", nLETrackSlot.getExtra("ep_crop_mode"));
        }
        VecNLEFilterSPtr filters = nLETrackSlot.getFilters();
        ArrayList arrayList = new ArrayList();
        for (NLEFilter nLEFilter : filters) {
            NLEFilter nLEFilter2 = nLEFilter;
            if (!C351220Dpo.LLILIL(nLEFilter2)) {
                C351510DqH.LIZ.getClass();
                if (!C351510DqH.LJJIJL(nLEFilter2)) {
                    arrayList.add(nLEFilter);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            nLETrackSlot2.addFilter(NLEFilter.dynamicCast(((NLENode) it2.next()).deepClone(true)));
        }
        VecNLEVideoEffectSPtr videoEffects = nLETrackSlot.getVideoEffects();
        ArrayList arrayList2 = new ArrayList();
        for (NLEVideoEffect nLEVideoEffect : videoEffects) {
            C351510DqH.LIZ.getClass();
            if (!C351510DqH.LJJIJIL(nLEVideoEffect)) {
                arrayList2.add(nLEVideoEffect);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            nLETrackSlot2.addVideoEffect(NLEVideoEffect.dynamicCast(((NLENode) it3.next()).deepClone(true)));
        }
    }

    @Override // X.InterfaceC363160ELq
    public void zo2(NLEModel nLEModel, Map<String, C0ELY> map) {
        VecNLETrackSlotSPtr slots;
        float f;
        String resourceFile;
        boolean z;
        NLEResourceNode resource;
        this.LLJILJIL.clear();
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null && (slots = mainTrack.getSlots()) != null) {
            ArrayList<NLETrackSlot> arrayList = new ArrayList();
            for (NLETrackSlot nLETrackSlot : slots) {
                NLETrackSlot nLETrackSlot2 = nLETrackSlot;
                if (C0E5J.LIZJ(nLETrackSlot2) || C0E5J.LIZLLL(nLETrackSlot2)) {
                    arrayList.add(nLETrackSlot);
                }
            }
            for (NLETrackSlot nLETrackSlot3 : arrayList) {
                Map<String, C0ELX> map2 = this.LLJILJIL;
                String uuid = nLETrackSlot3.getUUID();
                C0ELY c0ely = map.get(nLETrackSlot3.getUUID());
                if (c0ely != null) {
                    f = c0ely.LIZIZ;
                } else {
                    f = 0.0f;
                }
                NLESegment mainSegment = nLETrackSlot3.getMainSegment();
                if (mainSegment == null || (resource = mainSegment.getResource()) == null || (resourceFile = resource.getResourceFile()) == null) {
                    resourceFile = "";
                }
                C0ELY c0ely2 = map.get(nLETrackSlot3.getUUID());
                if (c0ely2 != null) {
                    z = c0ely2.LIZ;
                } else {
                    z = false;
                }
                map2.put(uuid, new C0ELX(f, null, resourceFile, nLETrackSlot3, z, C0E5J.LIZLLL(nLETrackSlot3)));
                C385300F8u c385300F8u = C385300F8u.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("refreshData from draft slotId: ");
                sbLIZ.append(nLETrackSlot3.getUUID());
                sbLIZ.append(",refreshData: ");
                sbLIZ.append(this.LLJILJIL.get(nLETrackSlot3.getUUID()));
                sbLIZ.append(' ');
                C201955140j.LIZLLL(c385300F8u, "EditorProAIGCComponent", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        F4(this, true, false, false);
    }

    @Override // X.InterfaceC363160ELq
    public void Dc1(Integer num, Float f, Float f2) {
        PairIntInt pairIntInt;
        InterfaceC363010ELb interfaceC363010ELb;
        View view;
        ViewGroup.LayoutParams layoutParams;
        View view2;
        ViewGroup.LayoutParams layoutParams2;
        View view3;
        View view4;
        INLEMediaRuntime mediaRuntimeApi;
        C0E48 c0e48W1 = W1();
        if (c0e48W1 == null) {
            return;
        }
        INLEMediaSession iNLEMediaSessionF1 = c0e48W1.f1();
        if (iNLEMediaSessionF1 == null || (mediaRuntimeApi = iNLEMediaSessionF1.getMediaRuntimeApi()) == null || (pairIntInt = mediaRuntimeApi.getInitSize()) == null) {
            pairIntInt = new PairIntInt(0, 0);
        }
        if (pairIntInt.getFirst() != 0 && pairIntInt.getSecond() != 0 && (interfaceC363010ELb = this.LLJIJIL) != null && (view = interfaceC363010ELb.getView()) != null && (layoutParams = view.getLayoutParams()) != null) {
            int i = layoutParams.width;
            InterfaceC363010ELb interfaceC363010ELb2 = this.LLJIJIL;
            if (interfaceC363010ELb2 != null && (view2 = interfaceC363010ELb2.getView()) != null && (layoutParams2 = view2.getLayoutParams()) != null) {
                int i2 = layoutParams2.height;
                if (i > 0 && i2 > 0) {
                    if (num != null) {
                        num.intValue();
                        float fIntValue = num.intValue() / i2;
                        InterfaceC363010ELb interfaceC363010ELb3 = this.LLJIJIL;
                        if (interfaceC363010ELb3 != null && (view4 = interfaceC363010ELb3.getView()) != null) {
                            view4.getLayoutParams().width = C814420VxA.LIZIZ(i * fIntValue);
                            view4.getLayoutParams().height = num.intValue();
                            view4.requestLayout();
                        }
                    }
                    if (f != null) {
                        float fFloatValue = f.floatValue();
                        InterfaceC363010ELb interfaceC363010ELb4 = this.LLJIJIL;
                        if (interfaceC363010ELb4 != null && (view3 = interfaceC363010ELb4.getView()) != null) {
                            C786410Ut5.ed(view3, fFloatValue);
                            C786410Ut5.Jc(view3, 0.0f);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[PHI: r8
      0x0021: PHI (r8v5 boolean) = (r8v1 boolean), (r8v6 boolean) binds: [B:38:0x0086, B:12:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a A[PHI: r8
      0x007a: PHI (r8v1 boolean) = (r8v0 boolean), (r8v6 boolean), (r8v6 boolean) binds: [B:31:0x0077, B:10:0x0019, B:12:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void F4(X.C0ELO r10, boolean r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ELO.F4(X.0ELO, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0266  */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, com.bytedance.ies.nle.editor_jni.NLENode, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLETrackSlot] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.ies.nle.editor_jni.NLETrackSlot G2(java.lang.String r50, X.C0ELT r51, boolean r52, boolean r53) {
        /*
            Method dump skipped, instruction units count: 865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ELO.G2(java.lang.String, X.0ELT, boolean, boolean):com.bytedance.ies.nle.editor_jni.NLETrackSlot");
    }

    public final void Z1(NLETrackSlot nLETrackSlot, final NLETrackSlot nLETrackSlot2, C0EO0 c0eo0, boolean z) {
        if (z) {
            X1(nLETrackSlot, nLETrackSlot2);
        }
        if (c0eo0 == null) {
            return;
        }
        Iterator<NLEMask> it2 = nLETrackSlot.getMasks().iterator();
        while (it2.hasNext()) {
            nLETrackSlot2.addMask(it2.next());
        }
        long duration = nLETrackSlot2.getDuration();
        nLETrackSlot.swingKeyframesOfType(NLEKeyframeType.Mask).forEach(new BiConsumer() { // from class: X.0ELZ
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                nLETrackSlot2.addSwingKeyframe((NLEKeyframe) obj2);
            }
        });
        VecNLEKeyframe swingKeyframes = nLETrackSlot2.getSwingKeyframes();
        if (swingKeyframes != null) {
            for (NLEKeyframe nLEKeyframe : swingKeyframes) {
                VecNLECommonKeyframe sortedCommonKeyframes = nLEKeyframe.getSortedCommonKeyframes();
                if (sortedCommonKeyframes != null) {
                    for (NLECommonKeyframe nLECommonKeyframe : sortedCommonKeyframes) {
                        long timeOffset = nLECommonKeyframe.getTimeOffset();
                        if (0 > timeOffset || timeOffset > duration) {
                            nLEKeyframe.removeKeyframe(nLECommonKeyframe);
                        }
                    }
                }
            }
        }
        C351490DqF.LIZ(nLETrackSlot2, C351490DqF.LIZIZ(nLETrackSlot2, v3()), c0eo0);
        o2(nLETrackSlot, nLETrackSlot2);
    }

    @Override // X.InterfaceC363160ELq
    public NLETrackSlot nD(NLEModel nLEModel, String str, C0ELT c0elt, EditorProAIGCMediaItemModel editorProAIGCMediaItemModel) {
        NLETrackSlot nLETrackSlotLIZLLL;
        NLETrackSlot nLETrackSlotLIZLLL2;
        boolean z;
        EditorProAIGCMediaItemModelStatus editorProAIGCMediaItemModelStatus = editorProAIGCMediaItemModel.status;
        if (editorProAIGCMediaItemModelStatus == EditorProAIGCMediaItemModelStatus.LOADING) {
            G2(str, c0elt, true, false);
            if (nLEModel != null && (nLETrackSlotLIZLLL2 = C377740ErU.LIZLLL(nLEModel, str)) != null) {
                if (editorProAIGCMediaItemModel.param.imagePath.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                xG2().LIZLLL(nLETrackSlotLIZLLL2.getUUID(), new C0ELY(z, editorProAIGCMediaItemModel.progress / 100.0f, 4));
                return null;
            }
            return null;
        }
        if (editorProAIGCMediaItemModelStatus == EditorProAIGCMediaItemModelStatus.ERROR) {
            G2(str, c0elt, true, false);
            if (nLEModel == null || (nLETrackSlotLIZLLL = C377740ErU.LIZLLL(nLEModel, str)) == null) {
                return null;
            }
            xG2().LIZ(0L, nLETrackSlotLIZLLL.getUUID(), true, false);
            return null;
        }
        if (editorProAIGCMediaItemModelStatus != EditorProAIGCMediaItemModelStatus.COMPLETE) {
            return null;
        }
        return G2(str, c0elt, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fe A[PHI: r13
      0x00fe: PHI (r13v2 java.lang.Integer) = (r13v1 java.lang.Integer), (r13v3 java.lang.Integer) binds: [B:35:0x0093, B:37:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010b  */
    @Override // X.InterfaceC363160ELq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.ies.nle.editor_jni.NLETrackSlot dI2(java.lang.String r31, java.lang.String r32, X.C0ELT r33, boolean r34, com.ss.android.ugc.aweme.creative.model.editorpro.EditorProAIGCTemplateModel r35) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ELO.dI2(java.lang.String, java.lang.String, X.0ELT, boolean, com.ss.android.ugc.aweme.creative.model.editorpro.EditorProAIGCTemplateModel):com.bytedance.ies.nle.editor_jni.NLETrackSlot");
    }
}
