package X;

import Y.AObjectS240S0100000_5;
import Y.AObserverS209S0100000_5;
import Y.ARunnableS105S0100000_5;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EPAnchorData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProSchemeModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.MagicI2InfoModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.logic.EditorProTTSHelper;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.ui.TTSFragment;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.ss.ugc.android.editor.track.SeekInfo;
import ge.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EGr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C361870EGr extends i<C0EGY, C0EJ9, C0EJ5, C0EH2> implements C0EGY, InterfaceC379610EuV {
    public static final C361930EGx LLLFZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLI;
    public static final int LLLII;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public InterfaceC359860E8y LLJJ;
    public List<C361980EHc> LLJJI;
    public C0EHF LLJJIII;
    public InterfaceC359850E8x LLJJIJI;
    public InterfaceC359940E9g LLJJIJIIJIL;
    public C0E90 LLJJIJIL;
    public C0EHW LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public C0EJ9 LLJLIL;
    public C557050Lt1 LLJLILLLLZIIL;
    public final InterfaceC1731706qJ LLJLL;
    public final InterfaceC1731706qJ LLJLLIL;
    public InterfaceC361910EGv LLJLLL;
    public InterfaceC361920EGw LLJZ;
    public final Set<InterfaceC361900EGu> LLJZIJLIL;
    public NLETrackSlot LLL;
    public final C01GW LLLF;
    public final MutableLiveData<Long> LLLFF;
    public final MutableLiveData<Unit> LLLFFI;

    @Override // X.C0EGY
    public void KL2() {
        m6(false);
        u6(false);
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.0EGx] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C361870EGr.class, "epLoaderApi", "getEpLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0);
        C13LE.LIZ.getClass();
        LLLI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C361870EGr.class, "epStateApi", "getEpStateApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProStateApi;", 0), new C2217381BqS(C361870EGr.class, "epInitLegacyApi", "getEpInitLegacyApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EPSceneLegacyApi;", 0), new C2217381BqS(C361870EGr.class, "textStickerApi", "getTextStickerApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/text/api/EditorProTextNewApi;", 0), new C2217381BqS(C361870EGr.class, "trackApi", "getTrackApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0), new C2217381BqS(C361870EGr.class, "editorProAIGCLogicApi", "getEditorProAIGCLogicApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/logic/EditorProAIGCLogicApi;", 0), new C2217381BqS(C361870EGr.class, "editorProAIGCResultsPanelApi", "getEditorProAIGCResultsPanelApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/shared/results/EditorProAIGCResultsPanelApi;", 0), new C2217381BqS(C361870EGr.class, "editorProStickerBottomBarApi", "getEditorProStickerBottomBarApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/common/EditorProStickerBottomBarApi;", 0), new C2217381BqS(C361870EGr.class, "epPanelApi", "getEpPanelApi()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/EPPanelApiComponent;", 0)};
        LLLFZ = new Object() { // from class: X.0EGx
        };
        LLLII = 8;
    }

    private final C0E48 F4() {
        return (C0E48) this.LLLF.getValue();
    }

    private final InterfaceC377650ErL H4() {
        return (InterfaceC377650ErL) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLLI[5]);
    }

    private final InterfaceC377410Eqx K4() {
        return (InterfaceC377410Eqx) this.LLJL.getValue(this, LLLI[6]);
    }

    private final InterfaceC357820E1c O4() {
        return (InterfaceC357820E1c) this.LLJLL.getValue(this, LLLI[7]);
    }

    private final C0EC7 P4() {
        return (C0EC7) this.LLJJJJJIL.getValue(this, LLLI[2]);
    }

    private final InterfaceC359950E9h d5() {
        return (InterfaceC359950E9h) this.LLJJJJ.getValue(this, LLLI[1]);
    }

    private final VideoPublishEditModel getEditModel() {
        EditModelProvider.Companion.getClass();
        return C0E1T.LIZ().getEditModel();
    }

    private final C0EJ3 t5() {
        return (C0EJ3) this.LLJJJJLIIL.getValue(this, LLLI[3]);
    }

    public final void D5() {
        InterfaceC359940E9g interfaceC359940E9g = this.LLJJIJIIJIL;
        if (interfaceC359940E9g == null) {
            throw new IllegalStateException("uiManager is null");
        }
        interfaceC359940E9g.onBackPressed();
    }

    @Override // ge.i
    public Function0<C0EJ9> E3() {
        return new AwS549S0100000_5(this, 786);
    }

    public final void E5() {
        C0EHR c0ehr;
        InterfaceC359940E9g interfaceC359940E9g = this.LLJJIJIIJIL;
        if (interfaceC359940E9g == null) {
            throw new IllegalStateException("uiManager is null");
        }
        if (!(interfaceC359940E9g instanceof C0EHR) || (c0ehr = (C0EHR) interfaceC359940E9g) == null) {
            return;
        }
        Iterator<C0EHU> it2 = c0ehr.LJIIIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else {
                it2.next().LIZ(false);
            }
        }
        if (!c0ehr.LIZJ.LIZLLL(r2, c0ehr.LJIJ() != null ? TextUtils.equals(r2.LJI, "root_item") : false)) {
            c0ehr.LJIIZILJ();
        }
    }

    public final void H5() {
        this.LLLFF.setValue(Long.valueOf(System.currentTimeMillis()));
    }

    @Override // X.C0EGY
    public C0EHF Rr2() {
        if (!this.LLJLILLLLZIIL.LIZIZ()) {
            throw new IllegalStateException("You haven not init BottomBarComponent yet.");
        }
        C0EHF c0ehf = this.LLJJIII;
        if (c0ehf != null) {
            return c0ehf;
        }
        throw new IllegalStateException("btmBarDispatchHandler is null.");
    }

    public final C0EY2 T4() {
        return (C0EY2) this.LLJJJIL.getValue(this, LLLI[0]);
    }

    public final C0EB6 Z4() {
        return (C0EB6) this.LLJLLIL.getValue(this, LLLI[8]);
    }

    @Override // X.C0EGY
    public C0E90 ah2() {
        if (!this.LLJLILLLLZIIL.LIZIZ()) {
            throw new IllegalStateException("You haven not init BottomBarComponent yet.");
        }
        C0E90 c0e90 = this.LLJJIJIL;
        if (c0e90 != null) {
            return c0e90;
        }
        throw new IllegalStateException("TrackSelectHandler is null.");
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0EJ5> o2() {
        return AFwS191S0000000_5.get$arr$(229);
    }

    public final C0E5S v5() {
        return (C0E5S) this.LLJJL.getValue(this, LLLI[4]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0EH2> w2() {
        return new AwS549S0100000_5(this, 785);
    }

    public final void U5() {
        VideoPublishEditModel editModel;
        EditorProSchemeModel editorProSchemeModel;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 == null) {
            return;
        }
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) c0e48F4.S7().LIZJ("is_showing_bottom_menu_anim_guide", bool)).booleanValue();
        EditModelProvider.Companion.getClass();
        EditModelProvider editModelProviderLIZIZ = C0E1T.LIZIZ();
        boolean zLIZIZ = (editModelProviderLIZIZ == null || (editModel = editModelProviderLIZIZ.getEditModel()) == null || (editorProSchemeModel = editModel.creativeModel.editorProSchemeModel) == null) ? false : C537970L7z.LIZIZ(editorProSchemeModel);
        boolean zBooleanValue2 = ((Boolean) c0e48F4.S7().LIZJ("event_user_guide_intercepted", bool)).booleanValue();
        if (!zBooleanValue || zBooleanValue2 || zLIZIZ) {
            return;
        }
        c0e48F4.S7().LIZIZ(Boolean.TRUE, "has_shown_bottom_menu_anim_guide", false);
        c0e48F4.S7().LIZIZ(bool, "is_showing_bottom_menu_anim_guide", false);
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        LiveData<SeekInfo> liveDataZE2;
        LiveEvent<Unit> liveEventAU;
        LiveData<Boolean> liveDataQO0;
        LiveData<Boolean> liveDataN71;
        super.onCreate();
        InterfaceC359950E9h interfaceC359950E9hD5 = d5();
        if (interfaceC359950E9hD5 != null && (liveDataN71 = interfaceC359950E9hD5.N71()) != null) {
            liveDataN71.observe(this, new AObserverS209S0100000_5(this, 85));
        }
        InterfaceC359950E9h interfaceC359950E9hD52 = d5();
        if (interfaceC359950E9hD52 != null && (liveDataQO0 = interfaceC359950E9hD52.QO0()) != null) {
            liveDataQO0.observe(this, new AObserverS209S0100000_5(this, 86));
        }
        InterfaceC359950E9h interfaceC359950E9hD53 = d5();
        if (interfaceC359950E9hD53 != null && (liveEventAU = interfaceC359950E9hD53.AU()) != null) {
            liveEventAU.LIZ(this, new AObjectS240S0100000_5(this, 121));
        }
        C0E5S c0e5sV5 = v5();
        if (c0e5sV5 == null || (liveDataZE2 = c0e5sV5.zE2()) == null) {
            return;
        }
        liveDataZE2.observe(this, new AObserverS209S0100000_5(this, 87));
    }

    @Override // X.C0EGY
    public InterfaceC359940E9g AZ0() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.C0EGY
    public InterfaceC359850E8x B20() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    @Override // X.C0EGY
    public /* bridge */ /* synthetic */ LiveData jq2() {
        return this.LLLFF;
    }

    public MutableLiveData<Unit> k5() {
        return this.LLLFFI;
    }

    public MutableLiveData<Long> n5() {
        return this.LLLFF;
    }

    @Override // X.C0EGY
    public /* bridge */ /* synthetic */ LiveData zb0() {
        return this.LLLFFI;
    }

    public final void C5(final C19A3 c19a3) {
        C0EY2 c0ey2T4;
        LiveData<C0EHI> liveDataZu2;
        C0EHI value;
        VideoPublishEditModel editModel;
        C0EC7 c0ec7P4 = P4();
        if (c0ec7P4 != null && (c0ey2T4 = T4()) != null && (liveDataZu2 = c0ey2T4.zu2()) != null && (value = liveDataZu2.getValue()) != null) {
            C0E6P c0e6p = new C0E6P(getDiContainer(), c19a3, value.LJ.isTemplateCreate());
            C0EHF c0ehf = this.LLJJIII;
            if (c0ehf != null) {
                c0ehf.LIZIZ(c0e6p);
            }
            C0EHF c0ehf2 = this.LLJJIII;
            if (c0ehf2 != null) {
                c0ehf2.LIZIZ(new C360600EBu(c19a3, getDiContainer(), c0ec7P4.K10()));
            }
            C0EHF c0ehf3 = this.LLJJIII;
            if (c0ehf3 != null) {
                final C1DRG diContainer = getDiContainer();
                c0ehf3.LIZIZ(new C0EH9(c19a3, diContainer) { // from class: X.0EHB
                    public final C01GW LLJILJIL;
                    public final C01GW LLJILJILJ;
                    public final String[] LLJILLL = {"bottom_item_root_edit", "bottom_item_lyric_edit_style", "bottom_item_lyric_edit_delete"};

                    @Override // X.C0EHG
                    public final boolean LJ(C361980EHc c361980EHc) {
                        return C13LQ.LJIILLIIL(c361980EHc.LJI, this.LLJILLL);
                    }

                    {
                        this.LLJILJIL = C452501pT.LIZIZ(new AwS549S0100000_5(diContainer, 1535));
                        this.LLJILJILJ = C452501pT.LIZIZ(new AwS549S0100000_5(diContainer, 1538));
                    }

                    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                    @Override // X.C0EHG
                    public final void LIZJ(C361980EHc c361980EHc, View view, Map<String, String> map) {
                        C0E55 player;
                        C0E55 player2;
                        C0E55 player3;
                        C0E55 player4;
                        String str = c361980EHc.LJI;
                        switch (str.hashCode()) {
                            case -1126405112:
                                if (str.equals("bottom_item_lyric_edit_delete") && c361980EHc.LJII) {
                                    C0E48 c0e48LJIIJ = LJIIJ();
                                    if (c0e48LJIIJ != null && (player = c0e48LJIIJ.getPlayer()) != null) {
                                        player.pause(false);
                                    }
                                    EditModelProvider.Companion.getClass();
                                    VideoPublishEditModel editModel2 = C0E1T.LIZ().getEditModel();
                                    if (editModel2 != null) {
                                        C361680EFy.LJJJI("delete", editModel2, LJIIJ(), null, false, false, null, null, 1016);
                                    }
                                    C0EHC c0ehc = (C0EHC) this.LLJILJIL.getValue();
                                    if (c0ehc != null) {
                                        c0ehc.r(EnumC356070Dxd.DONE);
                                    }
                                    C0E48 c0e48LJIIJ2 = LJIIJ();
                                    if (c0e48LJIIJ2 != null) {
                                        c0e48LJIIJ2.S7().LIZIZ(new C358740E4q(null, 0, null, false, 0, 254), "select_slot_event", false);
                                    }
                                    InterfaceC366450EYh interfaceC366450EYh = (InterfaceC366450EYh) this.LLJILJILJ.getValue();
                                    if (interfaceC366450EYh != null) {
                                        interfaceC366450EYh.LC1(false);
                                    }
                                    break;
                                }
                                break;
                            case -900678753:
                                if (str.equals("bottom_item_lyric_edit_layers") && c361980EHc.LJII) {
                                    C0E48 c0e48LJIIJ3 = LJIIJ();
                                    if (c0e48LJIIJ3 != null && (player2 = c0e48LJIIJ3.getPlayer()) != null) {
                                        player2.pause(false);
                                    }
                                    EditModelProvider.Companion.getClass();
                                    VideoPublishEditModel editModel3 = C0E1T.LIZ().getEditModel();
                                    if (editModel3 != null) {
                                        C361680EFy.LJJJI("adjust", editModel3, LJIIJ(), null, false, false, null, null, 1016);
                                    }
                                    break;
                                }
                                break;
                            case 1086355380:
                                if (str.equals("bottom_item_lyric_edit_style")) {
                                    if (c361980EHc.LJII) {
                                        C0E48 c0e48LJIIJ4 = LJIIJ();
                                        if (c0e48LJIIJ4 != null && (player3 = c0e48LJIIJ4.getPlayer()) != null) {
                                            player3.pause(false);
                                        }
                                        C0EHC c0ehc2 = (C0EHC) this.LLJILJIL.getValue();
                                        if (c0ehc2 != null) {
                                            c0ehc2.ee(EnumC366550EYr.REPLACE_FUNCTION);
                                        }
                                    }
                                    EditModelProvider.Companion.getClass();
                                    VideoPublishEditModel editModel4 = C0E1T.LIZ().getEditModel();
                                    if (editModel4 != null) {
                                        C0EZ7.LIZIZ(editModel4, "click_ep_style", true);
                                    }
                                }
                                break;
                            case 1231032504:
                                if (str.equals("bottom_item_lyric_edit_adjust_opacity") && c361980EHc.LJII) {
                                    C0E48 c0e48LJIIJ5 = LJIIJ();
                                    if (c0e48LJIIJ5 != null && (player4 = c0e48LJIIJ5.getPlayer()) != null) {
                                        player4.pause(false);
                                    }
                                    EditModelProvider.Companion.getClass();
                                    VideoPublishEditModel editModel5 = C0E1T.LIZ().getEditModel();
                                    if (editModel5 != null) {
                                        C361680EFy.LJJJI("opacity", editModel5, LJIIJ(), null, false, false, null, null, 1016);
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            final C361850EGp c361850EGp = new C361850EGp(c19a3, getDiContainer(), c0ec7P4.K10(), t5(), v5());
            C0EHF c0ehf4 = this.LLJJIII;
            if (c0ehf4 != null) {
                c0ehf4.LIZIZ(c361850EGp);
            }
            final C1DRG diContainer2 = getDiContainer();
            final C0EGH c0eghK10 = c0ec7P4.K10();
            final C0EJ3 c0ej3T5 = t5();
            AbstractC361790EGj abstractC361790EGj = new AbstractC361790EGj(c19a3, diContainer2, c0eghK10, c0ej3T5, c361850EGp) { // from class: X.0EGm
                public final C0EGH LLJILJIL;
                public final C0EJ3 LLJILJILJ;
                public final InterfaceC361830EGn LLJILLL;
                public final List<String> LLJJ;
                public final C2377909Tl LLJJI;

                @Override // X.C0EHG
                public final boolean LJ(C361980EHc c361980EHc) {
                    return this.LLJJ.contains(c361980EHc.LJI);
                }

                @Override // X.C0E96, X.C0EHG
                public final boolean LJII(C361980EHc c361980EHc) {
                    if (TextUtils.equals(c361980EHc.LJI, "bottom_item_root_text")) {
                        return true;
                    }
                    return false;
                }

                @Override // X.AbstractC361790EGj
                public final void LJIILJJIL(boolean z) {
                    String str;
                    C0E48 c0e48LJIIJ = LJIIJ();
                    if (c0e48LJIIJ == null) {
                        return;
                    }
                    if (!((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_SUBTRACK_OVER_MAIN, Boolean.TRUE)).booleanValue()) {
                        if ((C351220Dpo.LJII(C350870DpF.LJI(c0e48LJIIJ)) - (c0e48LJIIJ.getPlayer().Jh() * 1000)) / ((long) LSPassThroughRecordSizeConfig.DEFAULT) < ((Number) C0E5G.LIZIZ(EnumC357850E1f.IMPORT_LIMIT, 100)).intValue()) {
                            Activity activityLJIIIZ = LJIIIZ();
                            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                            creativeToastBuilder.messageRes(2131827574);
                            C1390380mHk.LIZ(activityLJIIIZ, 6007, creativeToastBuilder);
                            return;
                        }
                    }
                    boolean z2 = true;
                    if (C349560Dn8.LIZLLL(c0e48LJIIJ) >= 30) {
                        Activity activityLJIIIZ2 = LJIIIZ();
                        CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                        creativeToastBuilder2.messageRes(2131836170);
                        creativeToastBuilder2.isTuxToastLegacy(true);
                        C1390380mHk.LIZ(activityLJIIIZ2, 1035, creativeToastBuilder2);
                        return;
                    }
                    if (c0e48LJIIJ.getPlayer().isPlaying()) {
                        c0e48LJIIJ.getPlayer().pause(false);
                    }
                    C0EJ3 c0ej3 = this.LLJILJILJ;
                    if (c0ej3 != null) {
                        c0ej3.J2();
                    }
                    if (z) {
                        str = "click_popup_secondary_menu";
                    } else {
                        str = "click_add_text";
                    }
                    EditModelProvider.Companion.getClass();
                    VideoPublishEditModel editModel2 = C0E1T.LIZ().getEditModel();
                    NLETrackSlot nLETrackSlotLLLLLLIL = c0e48LJIIJ.LLLLLLIL();
                    if (nLETrackSlotLLLLLLIL == null || !C351220Dpo.LLLLIILLL(nLETrackSlotLLLLLLIL)) {
                        z2 = false;
                    }
                    u4.LJJLIIIIJ(editModel2, str, 1, null, null, null, null, null, null, Boolean.valueOf(z2), 504);
                }

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v44, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r40v0, types: [X.0E96, X.0EGj, X.0EGm, X.0EH9] */
                /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Boolean] */
                /* JADX WARN: Type inference failed for: r7v9, types: [java.util.Map] */
                @Override // X.C0EHG
                public final void LIZJ(C361980EHc c361980EHc, View view, Map<String, String> map) {
                    NLETrackSlot nLETrackSlotLLLLLLIL;
                    VecNLETrackSPtr tracks;
                    C0E55 player;
                    C0E55 player2;
                    NLETrackSlot nLETrackSlotLLLLLLIL2;
                    C0E55 player3;
                    C0E48 c0e48LJIIJ;
                    NLETrackSlot nLETrackSlotLLLLLLIL3;
                    NLEEditor nLEEditorLJI;
                    int layer;
                    int transformZ;
                    boolean z;
                    NLENode nLENodeDeepClone;
                    NLETrackSlot nLETrackSlotLLLLLLIL4;
                    EditModelProvider.Companion.getClass();
                    VideoPublishEditModel editModel2 = C0E1T.LIZ().getEditModel();
                    if (editModel2 != null && c361980EHc.LJII) {
                        String str = c361980EHc.LJI;
                        C21378018lO c21378018lO = null;
                        String str2 = "";
                        switch (str.hashCode()) {
                            case -1469701281:
                                if (str.equals("bottom_item_text_edit_split")) {
                                    C0E48 c0e48LJIIJ2 = LJIIJ();
                                    if (c0e48LJIIJ2 != null && (nLETrackSlotLLLLLLIL4 = c0e48LJIIJ2.LLLLLLIL()) != null) {
                                        nLETrackSlotLLLLLLIL4.setExtra("is_editor_pro_split_used", "true");
                                    }
                                    final C0E48 c0e48LJIIJ3 = LJIIJ();
                                    if (c0e48LJIIJ3 != null) {
                                        c0e48LJIIJ3.getPlayer().pause(false);
                                        int i = C349360Dmo.LIZJ;
                                        c21378018lO = null;
                                        C350670Dov.LIZJ(c0e48LJIIJ3, EnumC356070Dxd.DONE, new InterfaceC349350Dmn() { // from class: X.0EGl
                                            @Override // X.InterfaceC349350Dmn
                                            public final void LIZ(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
                                                if (nLETrackSlot.hasExtra("text_tts_id")) {
                                                    C0EVZ.LIZ.LIZ(nLETrackSlot, nLETrackSlot2, c0e48LJIIJ3);
                                                }
                                            }
                                        }, null, null, true);
                                    }
                                    C0EJ3 c0ej3 = this.LLJILJILJ;
                                    if (c0ej3 != null) {
                                        c0ej3.Rc();
                                    }
                                    C361680EFy.LJJJI("split", editModel2, LJIIJ(), c21378018lO, false, false, c21378018lO, c21378018lO, 1016);
                                }
                                break;
                            case -602076528:
                                if (str.equals("bottom_item_text_edit_copy")) {
                                    C20684815ws.LJIILLIIL("click_text_copy_tab", C361680EFy.LJFF(-1L, editModel2, LJIIJ(), new Pair(-1, -1)).LIZ);
                                    C361680EFy.LJJJI("copy", editModel2, LJIIJ(), null, false, false, null, null, 1016);
                                    C0E48 c0e48LJIIJ4 = LJIIJ();
                                    if (c0e48LJIIJ4 != null) {
                                        if (C349560Dn8.LIZLLL(c0e48LJIIJ4) >= 30) {
                                            Activity activityLJIIIZ = LJIIIZ();
                                            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                                            creativeToastBuilder.messageRes(2131836170);
                                            creativeToastBuilder.isTuxToastLegacy(true);
                                            C1390380mHk.LIZ(activityLJIIIZ, 1035, creativeToastBuilder);
                                            break;
                                        } else {
                                            NLETrackSlot nLETrackSlotLLLLLLIL5 = c0e48LJIIJ4.LLLLLLIL();
                                            if (nLETrackSlotLLLLLLIL5 != null) {
                                                C0E55 player4 = c0e48LJIIJ4.getPlayer();
                                                if (player4 != null) {
                                                    player4.pause(false);
                                                }
                                                NLETrackSlot nLETrackSlot = new NLETrackSlot();
                                                NLESegment mainSegment = nLETrackSlotLLLLLLIL5.getMainSegment();
                                                if (mainSegment != null && (nLENodeDeepClone = mainSegment.deepClone(true)) != null) {
                                                    nLETrackSlot.setMainSegment(NLESegmentTextSticker.dynamicCast(nLENodeDeepClone));
                                                }
                                                nLETrackSlot.setTransformZ(C351420Dq8.LJ(C350870DpF.LJI(c0e48LJIIJ4), EnumC355980DxU.TEXT));
                                                nLETrackSlot.setTransformX(nLETrackSlotLLLLLLIL5.getTransformX());
                                                nLETrackSlot.setTransformY(nLETrackSlotLLLLLLIL5.getTransformY());
                                                nLETrackSlot.setRotation(nLETrackSlotLLLLLLIL5.getRotation());
                                                nLETrackSlot.setScale(nLETrackSlotLLLLLLIL5.getScale());
                                                nLETrackSlot.setStartTime(nLETrackSlotLLLLLLIL5.getStartTime());
                                                nLETrackSlot.setEndTime(nLETrackSlotLLLLLLIL5.getEndTime());
                                                C364470EQr.LIZ.getClass();
                                                for (String str3 : C1697810uHb.LJIIJJI("text_sticker_data", "text_wrap_list", "font_size", "motion_id", "motion_res_id", "animation_type", "animation_duration", "motion_enabled_on_last_use", "lineSpacingExtra", "color", "font_type", "align", "bg_mode", "text", "text_slot_type", "text_inline_styles", "is_use_auto_size", "font_size_changed", "is_editorpro_trim_text_length", "is_editorpro_adjust_text_style", "is_editorpro_adjust_text_paragraph", "is_editorpro_adjust_text_font", "is_editorpro_adjust_text_color", "is_editorpro_adjust_text_position", "use_dropper_color", "use_adjust_text_roll_bar")) {
                                                    String extra = nLETrackSlotLLLLLLIL5.getExtra(str3);
                                                    if (Intrinsics.LJFF(str3, "text_slot_type") && Intrinsics.LJFF(extra, "AI_CAPTION")) {
                                                        extra = "TEXT_STICKER";
                                                    }
                                                    nLETrackSlot.setExtra(str3, extra);
                                                }
                                                String strLJLJL = C351220Dpo.LJLJL(nLETrackSlot, "text_sticker_data", null);
                                                if (strLJLJL != null) {
                                                    str2 = strLJLJL;
                                                }
                                                TextStickerData textStickerDataLIZIZ = C363430EMr.LIZIZ(str2);
                                                textStickerDataLIZIZ.setEditorProText("1");
                                                textStickerDataLIZIZ.setIdInNewEngine(0);
                                                nLETrackSlot.setExtra("text_sticker_data", C363430EMr.LIZLLL(textStickerDataLIZIZ));
                                                nLETrackSlot.setExtra("is_editorpro_text", "1");
                                                C0EVZ.LIZ.LIZ(nLETrackSlotLLLLLLIL5, nLETrackSlot, c0e48LJIIJ4);
                                                nLETrackSlot.setExtra("ep_slot_add_order", String.valueOf(C351220Dpo.LJLJLLL(C350870DpF.LJI(c0e48LJIIJ4))));
                                                nLETrackSlot.setExtra("is_editorpro_copy_text", "1");
                                                NLEModel nLEModelLJI = C350870DpF.LJI(c0e48LJIIJ4);
                                                NLETrack nLETrackLJIIJ = C357540E0a.LJIIJ(nLEModelLJI, nLETrackSlot, C349560Dn8.LJ(nLEModelLJI), new AwS549S0100000_5(nLEModelLJI, 1379), false);
                                                if (C351420Dq8.LIZLLL(nLEModelLJI)) {
                                                    transformZ = nLETrackSlot.getTransformZ();
                                                } else {
                                                    if (nLETrackLJIIJ != null) {
                                                        layer = nLETrackLJIIJ.getLayer();
                                                    } else {
                                                        layer = 0;
                                                    }
                                                    transformZ = layer + 1 + 2000;
                                                }
                                                nLETrackSlot.setLayer(transformZ);
                                                if (nLETrackLJIIJ != null) {
                                                    C350870DpF.LIZJ(c0e48LJIIJ4, C051R.LIZIZ(new C0E1X(C0E1V.COPY_TEXT.getNameId(), null, null, null, null, 30)));
                                                    long startTime = nLETrackSlotLLLLLLIL5.getStartTime();
                                                    long endTime = nLETrackSlotLLLLLLIL5.getEndTime();
                                                    long jLLLLLLJ = C351220Dpo.LLLLLLJ(c0e48LJIIJ4.getPlayer().Jh());
                                                    if (startTime <= jLLLLLLJ && jLLLLLLJ <= endTime) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    boolean z2 = !z;
                                                    C0EJ3 c0ej32 = this.LLJILJILJ;
                                                    if (c0ej32 != null) {
                                                        c0ej32.Rc();
                                                    }
                                                    c0e48LJIIJ4.S7().LIZIZ(new C358740E4q(C354870Dvh.LIZJ(C350870DpF.LJI(c0e48LJIIJ4), nLETrackSlot.getUUID()), 0, null, z2, 0, 238), "select_slot_event", false);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                            case 471574511:
                                if (str.equals("bottom_item_text_edit_text_to_speech") && (c0e48LJIIJ = LJIIJ()) != null && (nLETrackSlotLLLLLLIL3 = c0e48LJIIJ.LLLLLLIL()) != null) {
                                    if (C0CHT.LIZ() && !C311110CHl.LIZ()) {
                                        if (nLETrackSlotLLLLLLIL3.hasExtra("text") && !nLETrackSlotLLLLLLIL3.hasExtra("text_tts_id")) {
                                            EditorProTTSHelper.LIZLLL(new EditorProTTSHelper(LJIIJJI(), this.LL.getLifecycle(), editModel2, LJIIJ()), true, nLETrackSlotLLLLLLIL3.getExtra("text"), nLETrackSlotLLLLLLIL3, "", new AwS371S0200000_5(c361980EHc, (C361820EGm) this, 234), 96);
                                            C0FWY.LIZJ(C0FWY.LIZ, new ShortVideoCommonParams(editModel2.mShootWay, C1428470nHB.LJIILIIL(editModel2), C1428470nHB.LJIILL(editModel2), editModel2.getCreationId(), 0, 0, 0, 0, null, null, null, null, null, 8176, null), null, "editor_pro", null, "1", editModel2.creativeModel.pugcTemplateData.isFromCreateTemplate, 10);
                                            C361680EFy.LJJJI("cancel", editModel2, LJIIJ(), null, false, false, null, null, 1016);
                                        } else if (nLETrackSlotLLLLLLIL3.hasExtra("text") && nLETrackSlotLLLLLLIL3.hasExtra("text_tts_id")) {
                                            C0EVZ.LIZJ(nLETrackSlotLLLLLLIL3, LJIIJ());
                                            c361980EHc.LIZJ = LJIIIZ().getString(2131833415);
                                            InterfaceC359850E8x interfaceC359850E8x = (InterfaceC359850E8x) this.LLJI.getValue();
                                            if (interfaceC359850E8x != null) {
                                                interfaceC359850E8x.LJIIJJI(c361980EHc);
                                            }
                                            C0E48 c0e48LJIIJ5 = LJIIJ();
                                            if (c0e48LJIIJ5 != null) {
                                                nLEEditorLJI = c0e48LJIIJ5.LLFII().LJI();
                                            } else {
                                                nLEEditorLJI = null;
                                            }
                                            C350410DoV.LIZJ(nLEEditorLJI, C0E1V.TEXT_TO_SPEECH.getNameId(), false, 5);
                                            C0FWY.LIZ(C0FWY.LIZ, new ShortVideoCommonParams(editModel2.mShootWay, C1428470nHB.LJIILIIL(editModel2), C1428470nHB.LJIILL(editModel2), editModel2.getCreationId(), 0, 0, 0, 0, null, null, null, null, null, 8176, null), "1", null, 4);
                                        }
                                    }
                                    if (C0CHT.LIZ() && C311110CHl.LIZ()) {
                                        C0E48 c0e48LJIIJ6 = LJIIJ();
                                        if (c0e48LJIIJ6 != null) {
                                            C350870DpF.LJI(c0e48LJIIJ6).setExtra("enter_tts_panel", String.valueOf(System.currentTimeMillis()));
                                        }
                                        TTSFragment tTSFragment = new TTSFragment();
                                        String extra2 = nLETrackSlotLLLLLLIL3.getExtra("text");
                                        C2377909Tl c2377909Tl = this.LLJJI;
                                        C0EJ3 c0ej33 = this.LLJILJILJ;
                                        C1DRG c1drg = this.LLILLJJLI;
                                        tTSFragment.LLLII = extra2;
                                        tTSFragment.LLLIIII = nLETrackSlotLLLLLLIL3;
                                        tTSFragment.LLLIIIIL = c2377909Tl;
                                        tTSFragment.LLLIZZ = c0ej33;
                                        if (C301750BsD.LIZ()) {
                                            if (c1drg != null) {
                                                tTSFragment.LLLIIIL = (InterfaceC362470EIz) c1drg.LJIIL(null, InterfaceC362470EIz.class);
                                                c21378018lO = (C21378018lO) c1drg.LJIIL(null, C21378018lO.class);
                                            }
                                        } else if (c1drg != null) {
                                            c21378018lO = (C21378018lO) c1drg.LJIIL(null, C21378018lO.class);
                                        }
                                        tTSFragment.LLLIIL = c21378018lO;
                                        LJIIL(tTSFragment);
                                        C0FWY.LIZJ(C0FWY.LIZ, new ShortVideoCommonParams(editModel2.mShootWay, C1428470nHB.LJIILIIL(editModel2), C1428470nHB.LJIILL(editModel2), editModel2.getCreationId(), 0, 0, 0, 0, null, null, null, null, null, 8176, null), null, "editor_pro", null, "1", editModel2.creativeModel.pugcTemplateData.isFromCreateTemplate, 10);
                                        C361680EFy.LJJJI("text_to_speech", editModel2, LJIIJ(), null, false, false, null, null, 1016);
                                        break;
                                    }
                                }
                                break;
                            case 1007271076:
                                if (str.equals("bottom_item_text_edit_open_edit")) {
                                    C0EU3 c0eu3 = C0EU3.LIZ;
                                    C0E48 c0e48LJIIJ7 = LJIIJ();
                                    c0eu3.getClass();
                                    C0EU3.LIZ(c0e48LJIIJ7, "click_ep_text_edit");
                                    C0E48 c0e48LJIIJ8 = LJIIJ();
                                    if (c0e48LJIIJ8 != null && (nLETrackSlotLLLLLLIL2 = c0e48LJIIJ8.LLLLLLIL()) != null) {
                                        C0E48 c0e48LJIIJ9 = LJIIJ();
                                        if (c0e48LJIIJ9 != null && (player3 = c0e48LJIIJ9.getPlayer()) != null) {
                                            player3.pause(false);
                                        }
                                        C0EJ3 c0ej34 = this.LLJILJILJ;
                                        if (c0ej34 != null) {
                                            c0ej34.Y61(nLETrackSlotLLLLLLIL2);
                                        }
                                        u4.LJJLIIIIJ(editModel2, "click_text_edit", 1, null, null, null, null, null, null, Boolean.valueOf(C351220Dpo.LLLLIILLL(nLETrackSlotLLLLLLIL2)), 504);
                                        break;
                                    }
                                }
                                break;
                            case 1244300806:
                                if (str.equals("bottom_item_text_edit_delete")) {
                                    C361680EFy.LJJJI("delete", editModel2, LJIIJ(), null, false, false, null, null, 1016);
                                    C0E48 c0e48LJIIJ10 = LJIIJ();
                                    if (c0e48LJIIJ10 != null && (nLETrackSlotLLLLLLIL = c0e48LJIIJ10.LLLLLLIL()) != null) {
                                        C0E48 c0e48LJIIJ11 = LJIIJ();
                                        if (c0e48LJIIJ11 != null && (tracks = C350870DpF.LJI(c0e48LJIIJ11).getTracks()) != null) {
                                            ArrayList arrayList = new ArrayList();
                                            for (NLETrack nLETrack : tracks) {
                                                if (nLETrack.getTrackType() == NLETrackType.STICKER) {
                                                    arrayList.add(nLETrack);
                                                }
                                            }
                                            ArrayList arrayList2 = new ArrayList();
                                            for (Object obj : arrayList) {
                                                Iterator<NLETrackSlot> it2 = ((NLETrack) obj).getSlots().iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        NLETrackSlot next = it2.next();
                                                        String uuid = next.getUUID();
                                                        String uuid2 = nLETrackSlotLLLLLLIL.getUUID();
                                                        if (uuid2 == null) {
                                                            uuid2 = "";
                                                        }
                                                        if (Intrinsics.LJFF(uuid, uuid2)) {
                                                            if (next != null) {
                                                                arrayList2.add(obj);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (!arrayList2.isEmpty()) {
                                                C0E48 c0e48LJIIJ12 = LJIIJ();
                                                if (c0e48LJIIJ12 != null && (player2 = c0e48LJIIJ12.getPlayer()) != null) {
                                                    player2.pause(false);
                                                }
                                                ((NLETrack) ListProtector.get(arrayList2, 0)).removeSlot(nLETrackSlotLLLLLLIL);
                                                C0EVZ.LIZJ(nLETrackSlotLLLLLLIL, LJIIJ());
                                                C0E48 c0e48LJIIJ13 = LJIIJ();
                                                if (c0e48LJIIJ13 != null) {
                                                    C350870DpF.LIZ(c0e48LJIIJ13, false);
                                                }
                                                C0E1X c0e1x = new C0E1X(C0E1V.DELETE.getNameId(), null, null, null, null, 30);
                                                C0E48 c0e48LJIIJ14 = LJIIJ();
                                                if (c0e48LJIIJ14 != null) {
                                                    C350870DpF.LIZJ(c0e48LJIIJ14, C051R.LIZIZ(c0e1x));
                                                }
                                                InterfaceC359940E9g interfaceC359940E9gLJIILIIL = LJIILIIL();
                                                if (interfaceC359940E9gLJIILIIL != null) {
                                                    interfaceC359940E9gLJIILIIL.LJFF();
                                                }
                                                C0E48 c0e48LJIIJ15 = LJIIJ();
                                                if (c0e48LJIIJ15 != null && (player = c0e48LJIIJ15.getPlayer()) != null) {
                                                    player.LJJIIZ(null);
                                                }
                                                C0EJ3 c0ej35 = this.LLJILJILJ;
                                                if (c0ej35 != null) {
                                                    c0ej35.Rc();
                                                }
                                            }
                                        }
                                        u4.LJJLIIIJL(editModel2, 0, "click_cross", null, 1, null);
                                        break;
                                    }
                                }
                                break;
                            case 1853001541:
                                if (str.equals("bottom_item_text_add_text")) {
                                    C0EU3 c0eu32 = C0EU3.LIZ;
                                    C0E48 c0e48LJIIJ16 = LJIIJ();
                                    c0eu32.getClass();
                                    C0EU3.LIZ(c0e48LJIIJ16, "click_ep_text_edit");
                                    LJIILJJIL(false);
                                }
                                break;
                            case 2073595090:
                                if (str.equals("bottom_item_root_text")) {
                                    C0E48 c0e48LJIIJ17 = LJIIJ();
                                    if (c0e48LJIIJ17 != null) {
                                        this.LLJILLL.LIZ(editModel2, C350870DpF.LJI(c0e48LJIIJ17));
                                    }
                                    if (view != null) {
                                        C0EC5.LJIILIIL(editModel2, LJIIJ(), "click_button");
                                        if (C301720BsA.LIZ(editModel2)) {
                                            C0EU3 c0eu33 = C0EU3.LIZ;
                                            C0E48 c0e48LJIIJ18 = LJIIJ();
                                            c0eu33.getClass();
                                            C0EU3.LIZ(c0e48LJIIJ18, "click_ep_text_edit");
                                            LJIILJJIL(false);
                                        } else {
                                            this.LLJILLL.LIZIZ(editModel2);
                                            C0EGH c0egh = this.LLJILJIL;
                                            c0egh.getClass();
                                            C786410Ut5.T4(view, 0.6f);
                                            if (c0egh.LIZLLL().LIZLLL()) {
                                                c0egh.LIZLLL().LIZIZ();
                                                View view2 = c0egh.LIZJ;
                                                if (view2 != null) {
                                                    C786410Ut5.T4(view2, 1.0f);
                                                }
                                                c0egh.LJIIIIZZ = true;
                                            }
                                            c0egh.LJ().LJFF(view);
                                            c0egh.LIZJ = view;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                }

                {
                    this.LLJILJIL = c0eghK10;
                    this.LLJILJILJ = c0ej3T5;
                    this.LLJILLL = c361850EGp;
                    c361850EGp.LJIILL(new AwS549S0100000_5(this, 1171));
                    this.LLJJ = C1697810uHb.LJIILJJIL("bottom_item_root_text", "bottom_item_text_add_text", "bottom_item_text_edit_split", "bottom_item_text_edit_text_to_speech", "bottom_item_text_edit_copy", "bottom_item_text_edit_delete", "bottom_item_text_edit_open_edit");
                    this.LLJJI = new C2377909Tl();
                }
            };
            C0EHF c0ehf5 = this.LLJJIII;
            if (c0ehf5 != null) {
                c0ehf5.LIZIZ(abstractC361790EGj);
            }
            C0EHF c0ehf6 = this.LLJJIII;
            if (c0ehf6 != null) {
                c0ehf6.LIZIZ(new C0E6L(c19a3, getDiContainer()));
            }
            C0EHF c0ehf7 = this.LLJJIII;
            if (c0ehf7 != null) {
                c0ehf7.LIZIZ(new C357810E1b(c19a3, getDiContainer(), c0ec7P4.K10(), O4()));
            }
            C0EHF c0ehf8 = this.LLJJIII;
            if (c0ehf8 != null) {
                final C1DRG diContainer3 = getDiContainer();
                c0ehf8.LIZIZ(new C0EH9(c19a3, diContainer3) { // from class: X.0Dwm
                    public final ArrayList<String> LLJILJIL = C1697810uHb.LJ("bottom_item_root_filter", "bottom_item_filter_add_filters", "bottom_item_filter_edit_split", "bottom_item_filter_edit_replace", "bottom_item_filter_edit_copy", "bottom_item_filter_edit_delete");
                    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(388));

                    @Override // X.C0EHG
                    public final boolean LJ(C361980EHc c361980EHc) {
                        return this.LLJILJIL.contains(c361980EHc.LJI);
                    }

                    @Override // X.C0E96, X.C0EHG
                    public final boolean LJII(C361980EHc c361980EHc) {
                        if (TextUtils.equals(c361980EHc.LJI, "bottom_item_root_filter")) {
                            return true;
                        }
                        return false;
                    }

                    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                    /* JADX WARN: Removed duplicated region for block: B:285:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:70:0x0156  */
                    /* JADX WARN: Removed duplicated region for block: B:85:0x0199  */
                    @Override // X.C0EHG
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZJ(X.C361980EHc r25, android.view.View r26, java.util.Map<java.lang.String, java.lang.String> r27) {
                        /*
                            Method dump skipped, instruction units count: 1456
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C355540Dwm.LIZJ(X.0EHc, android.view.View, java.util.Map):void");
                    }
                });
            }
            C0EHF c0ehf9 = this.LLJJIII;
            if (c0ehf9 != null) {
                c0ehf9.LIZIZ(new C355580Dwq(c19a3, getDiContainer(), c0ec7P4.K10()));
            }
            C0EHF c0ehf10 = this.LLJJIII;
            if (c0ehf10 != null) {
                final C1DRG diContainer4 = getDiContainer();
                c0ehf10.LIZIZ(new AbstractC357570E0d(c19a3, diContainer4) { // from class: X.0E0c
                    public final ArrayList<String> LLJILJIL = C1697810uHb.LJ("bottom_item_root_magic", "bottom_item_edit_magic", "bottom_item_overlay_edit_magic");

                    @Override // X.C0EHG
                    public final boolean LJ(C361980EHc c361980EHc) {
                        return this.LLJILJIL.contains(c361980EHc.LJI);
                    }

                    @Override // X.C0EHG
                    public final void LIZJ(C361980EHc c361980EHc, View view, Map<String, String> map) {
                        String str;
                        C0E55 player;
                        if (!c361980EHc.LJII || C0OBG.LIZIZ(LJIIIZ().findViewById(this.LLILLL))) {
                            return;
                        }
                        String str2 = c361980EHc.LJI;
                        int iHashCode = str2.hashCode();
                        String str3 = "1";
                        if (iHashCode != -1417351905) {
                            if (iHashCode != -1054751280) {
                                if (iHashCode == -149662040) {
                                    str2.equals("bottom_item_root_magic");
                                }
                            } else if (str2.equals("bottom_item_edit_magic")) {
                                str = "1";
                            }
                            str = CardStruct.IStatusCode.DEFAULT;
                        } else if (!str2.equals("bottom_item_overlay_edit_magic")) {
                            str = CardStruct.IStatusCode.DEFAULT;
                        } else {
                            str = "2";
                        }
                        boolean zLJFF = Intrinsics.LJFF(c361980EHc.LJI, "bottom_item_overlay_edit_magic");
                        EditModelProvider.Companion.getClass();
                        VideoPublishEditModel editModel2 = C0E1T.LIZ().getEditModel();
                        if (editModel2 != null) {
                            String str4 = c361980EHc.LJI;
                            if (Intrinsics.LJFF(str4, "bottom_item_edit_magic")) {
                                C361680EFy.LJJJI("magic", editModel2, LJIIJ(), null, false, false, null, null, 1016);
                            } else if (Intrinsics.LJFF(str4, "bottom_item_overlay_edit_magic")) {
                                C361680EFy.LJJJI("magic", editModel2, LJIIJ(), null, false, true, null, null, 888);
                            }
                            C0LAB c0labLJFF = C361680EFy.LJFF(-1L, editModel2, LJIIJ(), new Pair(-1, -1));
                            c0labLJFF.LJ("enter_method", "click_button");
                            c0labLJFF.LJ("is_editor_pro", "1");
                            if (!zLJFF) {
                                str3 = CardStruct.IStatusCode.DEFAULT;
                            }
                            c0labLJFF.LJ("is_from_pip", str3);
                            c0labLJFF.LJ("position", str);
                            c0labLJFF.LJ("enter_from", "video_edit_page");
                            C20684815ws.LJIILLIIL("click_magic_tab", c0labLJFF.LIZ);
                            editModel2.creativeModel.effectEntrancePosition = "editor_pro_magic";
                        }
                        C0E48 c0e48LJIIJ = LJIIJ();
                        if (c0e48LJIIJ != null && (player = c0e48LJIIJ.getPlayer()) != null) {
                            player.pause(false);
                        }
                        C0E48 c0e48LJIIJ2 = LJIIJ();
                        if (c0e48LJIIJ2 == null) {
                            return;
                        }
                        C375820EoO.LIZ(this.LL, c0e48LJIIJ2, C0ESL.class, new C360030E9p(null, c0e48LJIIJ2, c361980EHc.LJI, zLJFF), 16);
                    }

                    @Override // X.AbstractC357570E0d
                    public final void LJIILJJIL(EPAnchorData ePAnchorData, C0E48 c0e48, boolean z) {
                        if (c0e48 != null) {
                            C375820EoO.LIZ(this.LL, c0e48, C0ESL.class, new C360030E9p(ePAnchorData, c0e48, "bottom_item_root_magic", z), 16);
                        }
                    }
                });
            }
            C0EHF c0ehf11 = this.LLJJIII;
            if (c0ehf11 != null) {
                final C1DRG diContainer5 = getDiContainer();
                final InterfaceC377650ErL interfaceC377650ErLH4 = H4();
                final InterfaceC377410Eqx interfaceC377410EqxK4 = K4();
                final C0E5S c0e5sV5 = v5();
                c0ehf11.LIZIZ(new C0EH9(c19a3, diContainer5, interfaceC377650ErLH4, interfaceC377410EqxK4, c0e5sV5) { // from class: X.0E6t
                    public final InterfaceC377650ErL LLJILJIL;
                    public final InterfaceC377410Eqx LLJILJILJ;
                    public final C0E5S LLJILLL;
                    public final ArrayList<String> LLJJ = C1697810uHb.LJ("bottom_item_root_ai_create", "bottom_item_create_ai_image", "bottom_item_create_ai_video", "bottom_item_edit_ai_image", "bottom_item_edit_ai_video", "bottom_item_edit_ai_create");
                    public final C01GW LLJJI = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(392));

                    public final VideoPublishEditModel LJIILL() {
                        return (VideoPublishEditModel) this.LLJJI.getValue();
                    }

                    @Override // X.C0EHG
                    public final boolean LJ(C361980EHc c361980EHc) {
                        return this.LLJJ.contains(c361980EHc.LJI);
                    }

                    @Override // X.C0E96, X.C0EHG
                    public final boolean LJII(C361980EHc c361980EHc) {
                        if (TextUtils.equals(c361980EHc.LJI, "bottom_item_root_ai_create")) {
                            return true;
                        }
                        return false;
                    }

                    public final AIGCGenerationParam LJIILJJIL(boolean z) {
                        CreativeModel creativeModel;
                        C0E48 c0e48LJIIJ;
                        NLETrackSlot nLETrackSlotLLLLLLIL;
                        String str;
                        String uuid;
                        NLETrackSlot nLETrackSlotLLLLLLIL2;
                        VideoPublishEditModel videoPublishEditModelLJIILL = LJIILL();
                        AIGCGenerationParam aIGCGenerationParam = null;
                        if (videoPublishEditModelLJIILL != null && (creativeModel = videoPublishEditModelLJIILL.creativeModel) != null && (c0e48LJIIJ = LJIIJ()) != null && (nLETrackSlotLLLLLLIL = c0e48LJIIJ.LLLLLLIL()) != null) {
                            C351510DqH.LIZ.getClass();
                            String strLJJIFFI = C351510DqH.LJJIFFI(nLETrackSlotLLLLLLIL);
                            if (C123100dR.LIZ(strLJJIFFI)) {
                                MagicI2InfoModel magicI2InfoModel = creativeModel.editorProAIGCInfoModel.magicI2IInfoModelMap.get(strLJJIFFI);
                                if (magicI2InfoModel != null) {
                                    str = magicI2InfoModel.filePath;
                                } else {
                                    str = null;
                                }
                                if (C123100dR.LIZ(str)) {
                                    C0E48 c0e48LJIIJ2 = LJIIJ();
                                    if (c0e48LJIIJ2 == null || (nLETrackSlotLLLLLLIL2 = c0e48LJIIJ2.LLLLLLIL()) == null || (uuid = nLETrackSlotLLLLLLIL2.getUUID()) == null) {
                                        uuid = "";
                                    }
                                    aIGCGenerationParam = new AIGCGenerationParam(null, null, str, "clip", z, true, null, null, null, null, 0, 0, null, null, uuid, false, false, 0, false, null, null, null, null, null, null, false, false, false, null, null, 0, 0, null, null, null, -16445, 7, null);
                                }
                            }
                        }
                        return aIGCGenerationParam;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
                    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LJIILLIIL(com.bytedance.ies.nle.editor_jni.NLETrackSlot r10, java.lang.String r11) {
                        /*
                            r9 = this;
                            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r8 = r9.LJIILL()
                            if (r8 == 0) goto L9a
                            if (r10 == 0) goto Le
                            java.lang.String r1 = X.C377740ErU.LIZIZ(r10)
                            if (r1 != 0) goto L10
                        Le:
                            java.lang.String r1 = ""
                        L10:
                            r0 = 12
                            r4 = 0
                            java.util.List r0 = X.C377150EqX.LJIILJJIL(r8, r1, r4, r0)
                            boolean r0 = r0.isEmpty()
                            r7 = 1
                            r6 = r0 ^ 1
                            java.util.List r0 = X.C377150EqX.LJIILIIL(r8, r1)
                            boolean r0 = r0.isEmpty()
                            r3 = r0 ^ 1
                            X.0E48 r0 = r9.LJIIJ()
                            if (r0 == 0) goto Lb6
                            com.bytedance.ies.nle.editor_jni.NLEModel r1 = X.C350870DpF.LJI(r0)
                            if (r10 == 0) goto Lb4
                            java.lang.String r0 = r10.getUUID()
                        L38:
                            com.bytedance.ies.nle.editor_jni.NLETrack r0 = X.C351220Dpo.LJLLILLLL(r1, r0)
                            if (r0 == 0) goto Lb6
                            boolean r0 = X.C351220Dpo.LLLIIL(r0)
                            if (r0 != r7) goto Lb6
                            r5 = 1
                        L45:
                            X.0EqU r2 = X.C377120EqU.LIZ
                            X.0E48 r1 = r9.LJIIJ()
                            if (r3 != 0) goto Lae
                            if (r6 == 0) goto La6
                            java.lang.String r6 = "video"
                        L51:
                            if (r10 == 0) goto La4
                            boolean r0 = X.C0E5J.LIZ(r10)
                            if (r0 == r7) goto L5f
                            boolean r0 = X.C0E5J.LIZJ(r10)
                            if (r0 != r7) goto La4
                        L5f:
                            r3 = 1
                        L60:
                            if (r10 == 0) goto L6a
                            boolean r0 = X.C0E5J.LIZJ(r10)
                            if (r0 != r7) goto L9b
                            java.lang.String r4 = "generating"
                        L6a:
                            r2.getClass()
                            X.0LAB r2 = X.C377120EqU.LIZJ(r8, r1)
                            java.lang.String r1 = "enter_source"
                            java.lang.String r0 = "edit_toolbar"
                            r2.LJ(r1, r0)
                            java.lang.String r0 = "tab_name"
                            r2.LJ(r0, r11)
                            java.lang.String r0 = "clip_type"
                            r2.LJ(r0, r6)
                            java.lang.String r0 = "is_ai_create_generated"
                            r2.LIZ(r3, r0)
                            java.lang.String r0 = "is_from_pip"
                            r2.LIZ(r5, r0)
                            if (r4 == 0) goto L93
                            java.lang.String r0 = "ai_create_generate_status"
                            r2.LJ(r0, r4)
                        L93:
                            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
                            java.lang.String r0 = "click_ai_create_option"
                            X.C20684815ws.LJIILLIIL(r0, r1)
                        L9a:
                            return
                        L9b:
                            boolean r0 = X.C0E5J.LIZ(r10)
                            if (r0 != r7) goto L6a
                            java.lang.String r4 = "generated"
                            goto L6a
                        La4:
                            r3 = 0
                            goto L60
                        La6:
                            if (r10 == 0) goto Lb1
                            boolean r0 = X.C351220Dpo.LLJJIJIL(r10)
                            if (r0 != r7) goto Lb1
                        Lae:
                            java.lang.String r6 = "image"
                            goto L51
                        Lb1:
                            java.lang.String r6 = "no_clip"
                            goto L51
                        Lb4:
                            r0 = r4
                            goto L38
                        Lb6:
                            r5 = 0
                            goto L45
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C359290E6t.LJIILLIIL(com.bytedance.ies.nle.editor_jni.NLETrackSlot, java.lang.String):void");
                    }

                    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                    /* JADX WARN: Removed duplicated region for block: B:119:0x0219 A[PHI: r6
                      0x0219: PHI (r6v1 com.bytedance.ies.nle.editor_jni.NLETrackSlot) = 
                      (r6v0 com.bytedance.ies.nle.editor_jni.NLETrackSlot)
                      (r6v6 com.bytedance.ies.nle.editor_jni.NLETrackSlot)
                      (r6v6 com.bytedance.ies.nle.editor_jni.NLETrackSlot)
                      (r6v6 com.bytedance.ies.nle.editor_jni.NLETrackSlot)
                      (r6v6 com.bytedance.ies.nle.editor_jni.NLETrackSlot)
                     binds: [B:102:0x01e7, B:104:0x01ed, B:114:0x020b, B:116:0x0211, B:118:0x0217] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Removed duplicated region for block: B:123:0x0223  */
                    /* JADX WARN: Removed duplicated region for block: B:141:0x02c4  */
                    /* JADX WARN: Removed duplicated region for block: B:149:0x02ef  */
                    /* JADX WARN: Removed duplicated region for block: B:150:0x02f2  */
                    /* JADX WARN: Removed duplicated region for block: B:169:0x036a  */
                    /* JADX WARN: Removed duplicated region for block: B:172:0x0373  */
                    /* JADX WARN: Removed duplicated region for block: B:185:0x03b9  */
                    /* JADX WARN: Removed duplicated region for block: B:193:0x03e4  */
                    /* JADX WARN: Removed duplicated region for block: B:194:0x03e7  */
                    /* JADX WARN: Removed duplicated region for block: B:213:0x045f  */
                    @Override // X.C0EHG
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZJ(X.C361980EHc r49, android.view.View r50, java.util.Map<java.lang.String, java.lang.String> r51) {
                        /*
                            Method dump skipped, instruction units count: 1148
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C359290E6t.LIZJ(X.0EHc, android.view.View, java.util.Map):void");
                    }

                    {
                        this.LLJILJIL = interfaceC377650ErLH4;
                        this.LLJILJILJ = interfaceC377410EqxK4;
                        this.LLJILLL = c0e5sV5;
                    }

                    public final void LJIIZILJ(EnumC378720Et4 enumC378720Et4, AbstractC359300E6u abstractC359300E6u, AIGCGenerationParam aIGCGenerationParam, long j, EnumC378910EtN enumC378910EtN) {
                        boolean z;
                        NLETrack nLETrackPt;
                        C0E48 c0e48LJIIJ = LJIIJ();
                        if (c0e48LJIIJ != null) {
                            C19A3 c19a32 = this.LL;
                            VideoPublishEditModel videoPublishEditModelLJIILL = LJIILL();
                            C0E48 c0e48LJIIJ2 = LJIIJ();
                            if (c0e48LJIIJ2 != null && (nLETrackPt = c0e48LJIIJ2.Pt()) != null && C351220Dpo.LLLIIL(nLETrackPt)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            C375820EoO.LIZ(c19a32, c0e48LJIIJ, C376260Ep6.class, new C379120Eti(c0e48LJIIJ, videoPublishEditModelLJIILL, enumC378720Et4, aIGCGenerationParam, null, abstractC359300E6u, false, false, false, z, null, null, j, enumC378910EtN, 3536), 16);
                        }
                    }
                });
            }
            C0EHF c0ehf12 = this.LLJJIII;
            if (c0ehf12 != null) {
                final C1DRG diContainer6 = getDiContainer();
                c0ehf12.LIZIZ(new C0EH9(c19a3, diContainer6) { // from class: X.0E6f
                    public static final /* synthetic */ int LLJJ = 0;
                    public final ArrayList<String> LLJILJIL = C1697810uHb.LJ("bottom_item_edit_ai_extend_modify", "bottom_item_edit_ai_extend");
                    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(393));
                    public final C01GW LLJILLL;

                    @Override // X.C0EHG
                    public final boolean LJ(C361980EHc c361980EHc) {
                        return this.LLJILJIL.contains(c361980EHc.LJI);
                    }

                    {
                        this.LLJILLL = C452501pT.LIZIZ(new AwS549S0100000_5(diContainer6, 1546));
                    }

                    @Override // X.C0EHG
                    public final void LIZJ(C361980EHc c361980EHc, View view, Map<String, String> map) {
                        boolean z;
                        C0E48 c0e48LJIIJ;
                        NLETrackSlot nLETrackSlotLLLLLLIL;
                        String strLIZIZ;
                        NLETrackSlot nLETrackSlotLLLLLLIL2;
                        NLETrack nLETrackPt;
                        if (!c361980EHc.LJII) {
                            return;
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        C0E48 c0e48LJIIJ2 = LJIIJ();
                        if (c0e48LJIIJ2 != null && (nLETrackPt = c0e48LJIIJ2.Pt()) != null && C351220Dpo.LLLIIL(nLETrackPt)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C378370EsV c378370EsV = C378370EsV.LIZ;
                        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.LLJILJILJ.getValue();
                        c378370EsV.getClass();
                        if (videoPublishEditModel != null) {
                            C369780Eee.LIZ.getClass();
                            if (C369780Eee.LIZ(videoPublishEditModel)) {
                                C378370EsV.LJFF(videoPublishEditModel, C359200E6k.LIZIZ, C359280E6s.LIZIZ, z, EnumC359320E6w.AI_EXTEND);
                            }
                        }
                        String str = c361980EHc.LJI;
                        if (Intrinsics.LJFF(str, "bottom_item_edit_ai_extend_modify")) {
                            C0E48 c0e48LJIIJ3 = LJIIJ();
                            if (c0e48LJIIJ3 == null || (nLETrackSlotLLLLLLIL2 = c0e48LJIIJ3.LLLLLLIL()) == null || (strLIZIZ = C377740ErU.LIZIZ(nLETrackSlotLLLLLLIL2)) == null) {
                                strLIZIZ = "";
                            }
                            EnumC378720Et4 enumC378720Et4 = EnumC378720Et4.TEXT_TO_VIDEO_RESULT;
                            InterfaceC377410Eqx interfaceC377410Eqx = (InterfaceC377410Eqx) this.LLJILLL.getValue();
                            if (interfaceC377410Eqx != null) {
                                interfaceC377410Eqx.RX(enumC378720Et4, strLIZIZ, "edit_toolbar", true);
                                return;
                            }
                            return;
                        }
                        if (!Intrinsics.LJFF(str, "bottom_item_edit_ai_extend") || (c0e48LJIIJ = LJIIJ()) == null || (nLETrackSlotLLLLLLIL = c0e48LJIIJ.LLLLLLIL()) == null) {
                            return;
                        }
                        C359140E6e.LIZIZ(this.LL, LJIIIZ(), c0e48LJIIJ, (VideoPublishEditModel) this.LLJILJILJ.getValue(), nLETrackSlotLLLLLLIL, z, jCurrentTimeMillis);
                    }
                });
            }
            C0EHF c0ehf13 = this.LLJJIII;
            if (c0ehf13 != null) {
                final C1DRG diContainer7 = getDiContainer();
                final boolean zIsTemplateCreate = value.LJ.isTemplateCreate();
                c0ehf13.LIZIZ(new C0EH9(diContainer7, c19a3, zIsTemplateCreate) { // from class: X.0Dwo
                    public final boolean LLJILJIL;
                    public final List<String> LLJILJILJ = C1697810uHb.LJIILJJIL("bottom_item_root_adjust_filter", "bottom_item_adjust_add_adjust", "bottom_item_adjust_adjust_edit", "bottom_item_adjust_adjust_copy", "bottom_item_adjust_adjust_delete");

                    @Override // X.C0EHG
                    public final boolean LJ(C361980EHc c361980EHc) {
                        return this.LLJILJILJ.contains(c361980EHc.LJI);
                    }

                    @Override // X.C0E96, X.C0EHG
                    public final boolean LJII(C361980EHc c361980EHc) {
                        if (TextUtils.equals(c361980EHc.LJI, "bottom_item_root_adjust_filter")) {
                            return true;
                        }
                        return false;
                    }

                    {
                        this.LLJILJIL = zIsTemplateCreate;
                    }

                    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                    @Override // X.C0EHG
                    public final void LIZJ(C361980EHc c361980EHc, View view, Map<String, String> map) {
                        C0E55 player;
                        C0E48 c0e48LJIIJ;
                        C0E48 c0e48LJIIJ2;
                        C0E48 c0e48LJIIJ3;
                        NLETrackSlot nLETrackSlotLLLLLLIL;
                        NLETrack nLETrackPt;
                        C0E48 c0e48LJIIJ4;
                        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
                        if (c361980EHc.LJII) {
                            String str = c361980EHc.LJI;
                            switch (str.hashCode()) {
                                case -1273019357:
                                    if (!str.equals("bottom_item_root_adjust_filter")) {
                                        return;
                                    }
                                    break;
                                case 1132641347:
                                    if (!str.equals("bottom_item_adjust_adjust_delete")) {
                                        return;
                                    }
                                    C0E48 c0e48LJIIJ5 = LJIIJ();
                                    if (c0e48LJIIJ5 != null) {
                                        nLETrackPt = c0e48LJIIJ5.Pt();
                                    } else {
                                        nLETrackPt = null;
                                    }
                                    C0E48 c0e48LJIIJ6 = LJIIJ();
                                    if (c0e48LJIIJ6 != null && (interfaceC351350Dq1LLFII = c0e48LJIIJ6.LLFII()) != null) {
                                        interfaceC351350Dq1LLFII.LJL(EnumC356070Dxd.COMMIT);
                                    }
                                    C0E1X c0e1x = new C0E1X(C0E1V.DELETE.getNameId(), null, null, null, null, 30);
                                    C0E48 c0e48LJIIJ7 = LJIIJ();
                                    if (c0e48LJIIJ7 != null) {
                                        C350870DpF.LIZJ(c0e48LJIIJ7, C051R.LIZIZ(c0e1x));
                                    }
                                    C0E48 c0e48LJIIJ8 = LJIIJ();
                                    if (c0e48LJIIJ8 != null) {
                                        NLETrackType nLETrackType = NLETrackType.NONE;
                                        c0e48LJIIJ8.S7().LIZIZ(new C0EB9(nLETrackPt, null), "delete_slot_event", false);
                                    }
                                    EditModelProvider.Companion.getClass();
                                    VideoPublishEditModel editModel2 = C0E1T.LIZ().getEditModel();
                                    if (editModel2 == null || (c0e48LJIIJ4 = LJIIJ()) == null) {
                                        return;
                                    }
                                    C361680EFy.LJJJI("delete", editModel2, c0e48LJIIJ4, "adjust_filter", false, false, null, null, LSPassThroughRecordSizeConfig.DEFAULT);
                                    return;
                                case 1234676749:
                                    if (!str.equals("bottom_item_adjust_adjust_copy")) {
                                        return;
                                    }
                                    C0E48 c0e48LJIIJ9 = LJIIJ();
                                    if (c0e48LJIIJ9 != null && (nLETrackSlotLLLLLLIL = c0e48LJIIJ9.LLLLLLIL()) != null) {
                                        long jLJII = C351220Dpo.LJII(C350870DpF.LJI(c0e48LJIIJ9)) - nLETrackSlotLLLLLLIL.getEndTime();
                                        if (jLJII / ((long) LSPassThroughRecordSizeConfig.DEFAULT) < ((Number) C0E5G.LIZIZ(EnumC357850E1f.VIDEO_CLIP_MIN_DURATION, 100L)).longValue()) {
                                            jLJII = -1;
                                        }
                                        NLETrackSlot nLETrackSlotLJJJJIZL = c0e48LJIIJ9.LLFII().LJJJJIZL(jLJII);
                                        C350870DpF.LIZJ(c0e48LJIIJ9, C051R.LIZIZ(new C0E1X(C0E1V.COPY.getNameId(), null, null, null, null, 30)));
                                        c0e48LJIIJ9.S7().LIZIZ(new C358740E4q(nLETrackSlotLJJJJIZL, 0, null, false, 0, 254), "select_slot_event", false);
                                    }
                                    EditModelProvider.Companion.getClass();
                                    VideoPublishEditModel editModel3 = C0E1T.LIZ().getEditModel();
                                    if (editModel3 == null || (c0e48LJIIJ3 = LJIIJ()) == null) {
                                        return;
                                    }
                                    C361680EFy.LJJJI("copy", editModel3, c0e48LJIIJ3, "adjust_filter", false, false, null, null, LSPassThroughRecordSizeConfig.DEFAULT);
                                    return;
                                case 1234725538:
                                    if (!str.equals("bottom_item_adjust_adjust_edit")) {
                                        return;
                                    }
                                    EditModelProvider.Companion.getClass();
                                    VideoPublishEditModel editModel4 = C0E1T.LIZ().getEditModel();
                                    if (editModel4 != null && (c0e48LJIIJ2 = LJIIJ()) != null) {
                                        C361680EFy.LJJJI("adjust_filter", editModel4, c0e48LJIIJ2, "adjust_filter", false, false, null, null, LSPassThroughRecordSizeConfig.DEFAULT);
                                    }
                                    C0E48 c0e48LJIIJ10 = LJIIJ();
                                    if (c0e48LJIIJ10 == null) {
                                        return;
                                    }
                                    C375820EoO.LIZ(this.LL, c0e48LJIIJ10, C0EUC.class, null, 24);
                                    return;
                                case 1394015749:
                                    if (!str.equals("bottom_item_adjust_add_adjust")) {
                                        return;
                                    }
                                    break;
                                default:
                                    return;
                            }
                            int i = !Intrinsics.LJFF(c361980EHc.LJI, "bottom_item_root_adjust_filter") ? 1 : 0;
                            EditModelProvider.Companion.getClass();
                            VideoPublishEditModel editModel5 = C0E1T.LIZ().getEditModel();
                            if (editModel5 != null && (c0e48LJIIJ = LJIIJ()) != null) {
                                C361680EFy.LJJIIZ(editModel5, c0e48LJIIJ, this.LLJILJIL, i);
                            }
                            C0E48 c0e48LJIIJ11 = LJIIJ();
                            if (c0e48LJIIJ11 != null && (player = c0e48LJIIJ11.getPlayer()) != null) {
                                player.pause(false);
                            }
                            C0E48 c0e48LJIIJ12 = LJIIJ();
                            if (c0e48LJIIJ12 == null) {
                                return;
                            }
                            C375820EoO.LIZ(this.LL, c0e48LJIIJ12, C0EUC.class, null, 24);
                        }
                    }
                });
            }
            C0EHF c0ehf14 = this.LLJJIII;
            if (c0ehf14 != null) {
                c0ehf14.LIZIZ(new C356940Dz2(c19a3, getDiContainer()));
            }
            C0EHF c0ehf15 = this.LLJJIII;
            if (c0ehf15 != null) {
                final C1DRG diContainer8 = getDiContainer();
                c0ehf15.LIZIZ(new C0E94(c19a3, diContainer8) { // from class: X.0E6S
                    public final List<String> LLJJIJI = C1697810uHb.LJIILJJIL("bottom_item_edit_retouch", "bottom_item_root_retouch");

                    @Override // X.C0EHG
                    public final boolean LJ(C361980EHc c361980EHc) {
                        return this.LLJJIJI.contains(c361980EHc.LJI);
                    }

                    @Override // X.C0EHG
                    public final void LIZJ(C361980EHc c361980EHc, View view, Map<String, String> map) {
                        C0E48 c0e48LJIIJ = LJIIJ();
                        if (c0e48LJIIJ == null) {
                            return;
                        }
                        String str = c361980EHc.LJI;
                        if (Intrinsics.LJFF(str, "bottom_item_edit_retouch")) {
                            c0e48LJIIJ.getPlayer().pause(false);
                            LJIJJLI();
                        } else {
                            if (!Intrinsics.LJFF(str, "bottom_item_root_retouch")) {
                                return;
                            }
                            c0e48LJIIJ.getPlayer().pause(false);
                            LJIJJLI();
                        }
                    }
                });
            }
            VideoPublishEditModel editModel2 = getEditModel();
            if (editModel2 == null || !C1403850mdT.LIZ(editModel2) || (editModel = getEditModel()) == null || !u4.LJLJLLL(editModel)) {
                if (C301720BsA.LIZ(getEditModel())) {
                    InterfaceC359850E8x interfaceC359850E8xB20 = B20();
                    if (interfaceC359850E8xB20 != null) {
                        interfaceC359850E8xB20.LJIIJ("bottom_item_root_text", "bottom_item_text_captions");
                    }
                    InterfaceC359850E8x interfaceC359850E8xB202 = B20();
                    if (interfaceC359850E8xB202 != null) {
                        interfaceC359850E8xB202.LJI();
                    }
                } else {
                    InterfaceC359850E8x interfaceC359850E8xB203 = B20();
                    if (interfaceC359850E8xB203 != null) {
                        interfaceC359850E8xB203.LJIIJ("bottom_item_root_text", "bottom_item_root_caption");
                    }
                }
            }
            Pj1(new InterfaceC361910EGv() { // from class: X.0E6n
                public boolean LIZ;

                @Override // X.InterfaceC361910EGv
                public final void LIZ(C361980EHc c361980EHc) {
                    if (Intrinsics.LJFF(c361980EHc.LJI, "bottom_item_root_edit")) {
                        this.LIZ = true;
                    }
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
                /* JADX WARN: Removed duplicated region for block: B:147:0x026f  */
                /* JADX WARN: Removed duplicated region for block: B:151:0x027d  */
                /* JADX WARN: Removed duplicated region for block: B:161:0x029f  */
                /* JADX WARN: Removed duplicated region for block: B:168:0x02b9  */
                /* JADX WARN: Removed duplicated region for block: B:172:0x02c7  */
                /* JADX WARN: Removed duplicated region for block: B:176:0x02d5  */
                /* JADX WARN: Removed duplicated region for block: B:192:0x030d  */
                /* JADX WARN: Removed duplicated region for block: B:196:0x031b  */
                /* JADX WARN: Removed duplicated region for block: B:203:0x0333  */
                /* JADX WARN: Removed duplicated region for block: B:207:0x0341  */
                /* JADX WARN: Removed duplicated region for block: B:211:0x034f  */
                /* JADX WARN: Removed duplicated region for block: B:86:0x0172  */
                @Override // X.InterfaceC361910EGv
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZIZ(X.C361980EHc r15, X.C0E48 r16) {
                    /*
                        Method dump skipped, instruction units count: 1086
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C359230E6n.LIZIZ(X.0EHc, X.0E48):void");
                }
            });
        }
    }

    @Override // X.C0EGY
    public void Pj1(InterfaceC361910EGv interfaceC361910EGv) {
        this.LLJLLL = interfaceC361910EGv;
    }

    public final void S5(List<C361980EHc> list) {
        InterfaceC361920EGw interfaceC361920EGw = this.LLJZ;
        if (interfaceC361920EGw != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C361980EHc> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LJI);
            }
            interfaceC361920EGw.LIZ(arrayList);
        }
    }

    @Override // X.C0EGY
    public void aE0(InterfaceC361900EGu interfaceC361900EGu) {
        C0EJ9 c0ej9;
        if (this.LLJZIJLIL.isEmpty() && (c0ej9 = this.LLJLIL) != null) {
            c0ej9.LLLFZ = new InterfaceC361900EGu() { // from class: X.0EGs
                @Override // X.InterfaceC361900EGu
                public final void LIZ(List<String> list) {
                    Iterator<T> it2 = this.LIZ.LLJZIJLIL.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC361900EGu) it2.next()).LIZ(list);
                    }
                }

                @Override // X.InterfaceC361900EGu
                public final void LIZIZ(List<String> list) {
                    Iterator<T> it2 = this.LIZ.LLJZIJLIL.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC361900EGu) it2.next()).LIZIZ(list);
                    }
                }
            };
        }
        this.LLJZIJLIL.add(interfaceC361900EGu);
    }

    public final void m6(boolean z) {
        C362080EHm c362080EHm;
        InterfaceC359860E8y interfaceC359860E8y = this.LLJJ;
        if ((interfaceC359860E8y instanceof C362080EHm) && (c362080EHm = (C362080EHm) interfaceC359860E8y) != null && c362080EHm.LJI != z) {
            c362080EHm.LJI = z;
            InterfaceC359850E8x interfaceC359850E8x = this.LLJJIJI;
            if (interfaceC359850E8x != null) {
                interfaceC359850E8x.LJFF(c362080EHm);
            }
        }
    }

    public final void u6(boolean z) {
        C362080EHm c362080EHm;
        InterfaceC359860E8y interfaceC359860E8y = this.LLJJ;
        if ((interfaceC359860E8y instanceof C362080EHm) && (c362080EHm = (C362080EHm) interfaceC359860E8y) != null && c362080EHm.LJII != z) {
            c362080EHm.LJII = z;
            InterfaceC359850E8x interfaceC359850E8x = this.LLJJIJI;
            if (interfaceC359850E8x != null) {
                interfaceC359850E8x.LJFF(c362080EHm);
            }
        }
    }

    public final void x5(C361890EGt c361890EGt) {
        Boolean boolValueOf;
        LiveData<C0EHI> liveDataZu2;
        C0EHI value;
        C0ELJ c0elj;
        LiveData<C0EHI> liveDataZu22;
        C0EHI value2;
        C0ELJ c0elj2;
        if (this.LLJLILLLLZIIL.LIZ(false, true)) {
            this.LLJJI = c361890EGt.LIZIZ;
            this.LLJJ = c361890EGt.LIZ;
            C0EHW c0ehw = new C0EHW();
            ArrayList<C361980EHc> arrayList = new ArrayList<>(c361890EGt.LIZIZ);
            c0ehw.LIZ = arrayList;
            c0ehw.LIZIZ.LIZLLL(arrayList);
            final C362000EHe c362000EHe = new C362000EHe(G2(), c0ehw);
            this.LLJJIII = new C0EHF(c362000EHe) { // from class: X.0EHE
                public final InterfaceC359850E8x LIZ;
                public final Set<C0EHG> LIZIZ = new LinkedHashSet();
                public C0EHG LIZJ;

                @Override // X.C0EHF
                public final void onBackPressed() {
                    C0EHG c0ehg = this.LIZJ;
                    if (c0ehg != null) {
                        c0ehg.LJIIIIZZ();
                    }
                }

                {
                    this.LIZ = c362000EHe;
                }

                @Override // X.C0EHF
                public final void LIZIZ(C0E96 c0e96) {
                    this.LIZIZ.add(c0e96);
                }

                @Override // X.C0EHF
                public final <T extends C0EHG> T LIZJ(Class<T> cls) {
                    Iterator<C0EHG> it2 = this.LIZIZ.iterator();
                    while (it2.hasNext()) {
                        T t = (T) it2.next();
                        if (cls.isInstance(t)) {
                            return t;
                        }
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("No handler found for class: ");
                    sbLIZ.append(cls.getName());
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }

                @Override // X.C0EHF
                public final void LIZ(C361980EHc c361980EHc, View view) {
                    C0EHG next;
                    Iterator<C0EHG> it2 = this.LIZIZ.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (next.LJ(c361980EHc)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    C0EHG c0ehg = next;
                    if (c0ehg == null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onSmallItemClicked for '");
                        sbLIZ.append((Object) c361980EHc.LIZJ);
                        sbLIZ.append("' is not found");
                        C372670EjJ.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                    this.LIZJ = c0ehg;
                    c0ehg.LIZLLL();
                }

                @Override // X.C0EHF
                public final boolean LIZLLL(C361980EHc c361980EHc, View view, Map<String, String> map) {
                    C0EHG next;
                    Iterator<C0EHG> it2 = this.LIZIZ.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (next.LJ(c361980EHc)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    C0EHG c0ehg = next;
                    if (c0ehg == null) {
                        return false;
                    }
                    this.LIZJ = c0ehg;
                    if (!((ArrayList) c361980EHc.LIZ).isEmpty()) {
                        if (c0ehg.LJII(c361980EHc) && view != null) {
                            C0E97 c0e97LJFF = c0ehg.LJFF();
                            if (c0e97LJFF != null) {
                                c0e97LJFF.LIZIZ();
                            }
                            c0ehg.LIZJ(c361980EHc, view, map);
                        } else {
                            InterfaceC359850E8x interfaceC359850E8x = this.LIZ;
                            if (interfaceC359850E8x != null) {
                                interfaceC359850E8x.LIZIZ(c361980EHc);
                                return true;
                            }
                        }
                        return true;
                    }
                    C0E97 c0e97LJFF2 = c0ehg.LJFF();
                    if (c0e97LJFF2 != null) {
                        c0e97LJFF2.LIZIZ();
                    }
                    c0ehg.LIZJ(c361980EHc, view, map);
                    return true;
                }
            };
            this.LLJJIJI = c362000EHe;
            this.LLJJJ = c0ehw;
            InterfaceC359860E8y interfaceC359860E8y = this.LLJJ;
            if (interfaceC359860E8y != null) {
                C0EJ9 c0ej9 = this.LLJLIL;
                if (c0ej9 != null) {
                    this.LLJJIJIIJIL = new C0EHR(G2(), c0ej9, interfaceC359860E8y, this.LLJJIII, this.LLJJIJI, this.LLJJJ, new AwS549S0100000_5(this, 783), new AwS549S0100000_5(this, 784), T4());
                }
                C0EJ9 c0ej92 = this.LLJLIL;
                if (c0ej92 != null) {
                    this.LLJJIJIL = new C359800E8s(interfaceC359860E8y, this.LLJJIJI, v5(), Z4(), (C19EG) c0ej92.requireActivity(), F4(), getDiContainer());
                }
            }
            InterfaceC359860E8y interfaceC359860E8y2 = this.LLJJ;
            if (interfaceC359860E8y2 != null) {
                interfaceC359860E8y2.LIZ(this.LLJJIJI, this.LLJJIJIIJIL);
            }
            C0EY2 c0ey2T4 = T4();
            Boolean boolValueOf2 = null;
            if (c0ey2T4 != null && (liveDataZu22 = c0ey2T4.zu2()) != null && (value2 = liveDataZu22.getValue()) != null && (c0elj2 = value2.LJ) != null) {
                boolValueOf = Boolean.valueOf(c0elj2.getEffectMultiTrackMode());
            } else {
                boolValueOf = null;
            }
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.LJFF(boolValueOf, bool)) {
                m6(true);
            } else {
                i3(new AwS584S0100000_5(c361890EGt, 695));
            }
            C0EY2 c0ey2T42 = T4();
            if (c0ey2T42 != null && (liveDataZu2 = c0ey2T42.zu2()) != null && (value = liveDataZu2.getValue()) != null && (c0elj = value.LJ) != null) {
                boolValueOf2 = Boolean.valueOf(c0elj.getRetouchMultiTrackMode());
            }
            if (Intrinsics.LJFF(boolValueOf2, bool)) {
                u6(true);
            }
            this.LLJLILLLLZIIL.LIZJ(true);
            C0EJ9 c0ej93 = this.LLJLIL;
            if (c0ej93 != null) {
                C12WG.LIZJ(c0ej93, new ARunnableS105S0100000_5(this, 67));
            }
        }
    }

    @Override // X.C0EGY
    public void zI1(InterfaceC361920EGw interfaceC361920EGw) {
        this.LLJZ = interfaceC361920EGw;
    }

    public C361870EGr(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), C0EY2.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC359950E9h.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), C0EC7.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZIZ(getDiContainer(), C0EJ3.class, null);
        this.LLJJL = C1664770tQJ.LIZIZ(getDiContainer(), C0E5S.class, null);
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC377650ErL.class, null);
        this.LLJL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC377410Eqx.class, null);
        this.LLJLILLLLZIIL = new C557050Lt1(false);
        this.LLJLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC357820E1c.class, null);
        this.LLJLLIL = C1664770tQJ.LIZIZ(getDiContainer(), C0EB6.class, null);
        this.LLJZIJLIL = new LinkedHashSet();
        this.LLLF = C452501pT.LIZIZ(new AwS549S0100000_5(this, 782));
        this.LLLFF = new MutableLiveData<>();
        this.LLLFFI = new MutableLiveData<>();
    }

    public final void N5(C361980EHc c361980EHc, int i) {
        InterfaceC361910EGv interfaceC361910EGv = this.LLJLLL;
        if (interfaceC361910EGv != null) {
            interfaceC361910EGv.LIZ(c361980EHc);
        }
    }

    public final void R5(C361980EHc c361980EHc, int i) {
        InterfaceC361910EGv interfaceC361910EGv = this.LLJLLL;
        if (interfaceC361910EGv != null) {
            interfaceC361910EGv.LIZIZ(c361980EHc, F4());
        }
    }

    public final void M5(C361980EHc c361980EHc, int i, View view) {
        InterfaceC359940E9g interfaceC359940E9g = this.LLJJIJIIJIL;
        if (interfaceC359940E9g != null) {
            interfaceC359940E9g.LIZLLL(c361980EHc, view);
            return;
        }
        throw new IllegalStateException("uiManager is null");
    }

    public final void d6(C361980EHc c361980EHc, int i, View view) {
        InterfaceC359940E9g interfaceC359940E9g = this.LLJJIJIIJIL;
        if (interfaceC359940E9g != null) {
            interfaceC359940E9g.LJIIJJI(c361980EHc, view);
            return;
        }
        throw new IllegalStateException("uiManager is null");
    }

    @Override // X.C0EGY
    public void LQ0(NLETrack nLETrack, NLETrackSlot nLETrackSlot, C0E7I c0e7i, boolean z, boolean z2, boolean z3, boolean z4) {
        InterfaceC359940E9g interfaceC359940E9g;
        C0E90 c0e90;
        C361980EHc c361980EHcLIZ = null;
        if ((nLETrack != null && nLETrackSlot != null && ((c0e90 = this.LLJJIJIL) == null || (c361980EHcLIZ = c0e90.LIZ(nLETrack, nLETrackSlot, z3, z4)) == null)) || 1 == 0 || (interfaceC359940E9g = this.LLJJIJIIJIL) == null) {
            return;
        }
        interfaceC359940E9g.LJIIIIZZ(nLETrack, nLETrackSlot, c0e7i, z, z2, c361980EHcLIZ);
    }
}
