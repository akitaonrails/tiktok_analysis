package X;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLESetting;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMobModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.logic.EditorProTTSHelper;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS134S0400000_5;
import kotlin.jvm.internal.AwS14S0410000_5;
import kotlin.jvm.internal.AwS249S0300000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0EKW, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EKW extends AbstractC19622511pv<TextStickerModel> implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final C19EG LLILLJJLI;
    public final C19A3 LLILLL;
    public final C1DRG LLILZ;
    public final C0EJ3 LLILZIL;
    public final C387590FHp LLILZLL;
    public final InterfaceC362470EIz LLIZ;
    public final InterfaceC384330F5b LLIZLLLIL;
    public final C1664740tQG LLJ;
    public final C1664750tQH LLJI;
    public final C1664740tQG LLJIJIL;
    public final C1664740tQG LLJILJIL;
    public final C1664740tQG LLJILJILJ;
    public final C1664740tQG LLJILLL;
    public final C01GW LLJJ;
    public TextStickerModel LLJJI;
    public NLETrackSlot LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public int LLJJJ;
    public boolean LLJJJIL;
    public String LLJJJJ;
    public final AFwS191S0000000_5 LLJJJJJIL;
    public final EnumC1466150oFx LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EKW.class, "editorProStickerEngineApi", "getEditorProStickerEngineApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/engine/EditorProStickerEngineApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0EKW.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0EKW.class, "previewApi", "getPreviewApi()Lcom/ss/ugc/android/editor/preview/PreviewPanelApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0EKW.class, "trackApi", "getTrackApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C0EKW.class, "epPanelApi", "getEpPanelApi()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/EPPanelApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C0EKW.class, "bottomBarApi", "getBottomBarApi()Lcom/ss/android/ugc/gamora/editorpro/framework/bottombar/ui/BottomBarApiComponent;", 0);
        c09r3.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
    }

    public static final VideoPublishEditModel LJJLIIIJ() {
        if (C364210EPr.LIZIZ) {
            EditModelProvider.Companion.getClass();
            VideoPublishEditModel editModel = C0E1T.LIZ().getEditModel();
            if (editModel != null) {
                return editModel;
            }
        }
        return new VideoPublishEditModel();
    }

    public final C0E48 LJJLIIIJILLIZJL() {
        return (C0E48) this.LLJJ.getValue();
    }

    public final C0EOK LJJLIIIJJI() {
        return (C0EOK) this.LLJ.getValue(this, LLJJL[0]);
    }

    public final boolean LJJLIIIJJIZ() {
        return this.LLILLL.findSceneByTag("CaptionFillerWordPanelRootScene") != null;
    }

    public final boolean LJJLIIIJL() {
        return this.LLILLL.findSceneByTag("CaptionTemplatePanelRootScene") != null;
    }

    public final boolean LJJLIIIJLJLI() {
        C385670FAf<C0FHM> c385670FAfS1;
        InterfaceC384330F5b interfaceC384330F5b = this.LLIZLLLIL;
        return ((interfaceC384330F5b == null || (c385670FAfS1 = interfaceC384330F5b.S1()) == null) ? null : c385670FAfS1.LIZJ()) == C0FHM.VISIBLE;
    }

    public final boolean LJJLI() {
        if (LJJLIIIJL() || LJJLIIIJJIZ()) {
            return false;
        }
        EditModelProvider.Companion.getClass();
        return !C1416310mxZ.LJIIZILJ(C0E1T.LIZIZ() != null ? r0.getEditModel() : null);
    }

    @Override // X.AbstractC19622511pv
    public final EnumC1466150oFx LJJIJLIJ() {
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILZ;
    }

    @Override // X.AbstractC19622511pv
    public final void LJJIJL(StickerModel stickerModel) {
        TextStickerModel textStickerModel = (TextStickerModel) stickerModel;
        InterfaceC384330F5b interfaceC384330F5b = this.LLIZLLLIL;
        if (interfaceC384330F5b != null && interfaceC384330F5b.EA(textStickerModel)) {
            LJJLIL(this, textStickerModel, null, C0E1V.ADD_TEXT, EnumC356070Dxd.COMMIT, false, false, 32);
        }
    }

    @Override // X.AbstractC19622511pv
    public final void LJJJI(StickerModel stickerModel) {
        C0E48 c0e48LJJLIIIJILLIZJL;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        boolean z;
        TextStickerModel textStickerModel = (TextStickerModel) stickerModel;
        String uuid = textStickerModel.getUuid();
        if (uuid != null && Intrinsics.LJFF(this.LLJJJJ, uuid) && !LJJLIIIJL() && !LJJLIIIJJIZ()) {
            C0E48 c0e48LJJLIIIJILLIZJL2 = LJJLIIIJILLIZJL();
            C0E2C c0e2cLIZIZ = null;
            if (c0e48LJJLIIIJILLIZJL2 != null) {
                c0e2cLIZIZ = C0EB5.LIZIZ(c0e48LJJLIIIJILLIZJL2, (C0EB6) this.LLJILJILJ.getValue(this, LLJJL[4]));
            }
            boolean z2 = false;
            if ((c0e2cLIZIZ != null && c0e2cLIZIZ.LIZ && Intrinsics.LJFF(c0e2cLIZIZ.LIZJ, "free_layer_panel")) || (c0e48LJJLIIIJILLIZJL = LJJLIIIJILLIZJL()) == null || (nLETrackSlotLLLLLLIL = c0e48LJJLIIIJILLIZJL.LLLLLLIL()) == null) {
                return;
            }
            VideoPublishEditModel videoPublishEditModelLJJLIIIJ = LJJLIIIJ();
            TTSModel ttsModel = textStickerModel.getTtsModel();
            if (ttsModel != null && ttsModel.ttsVoiceModel != null) {
                z = true;
            } else {
                z = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            if (textStickerModel.getCaptionModel() != null) {
                z2 = true;
            }
            u4.LJJLIIIIJ(videoPublishEditModelLJJLIIIJ, "click_text", 1, null, boolValueOf, null, null, null, Boolean.valueOf(z2), Boolean.valueOf(textStickerModel.isVERenderSticker()), 224);
            this.LLILZIL.Y61(nLETrackSlotLLLLLLIL);
        }
    }

    @Override // X.AbstractC19622511pv
    public final void LJJJIL(StickerModel stickerModel) {
        TTSVoiceModel tTSVoiceModel;
        boolean z;
        TextStickerModel textStickerModel = (TextStickerModel) stickerModel;
        if (!C0F8Y.LJIIJ(textStickerModel) && textStickerModel.getUuid() != null && !this.LLJJJIL && !LJJLIIIJL() && !LJJLIIIJJIZ()) {
            VideoPublishEditModel videoPublishEditModelLJJLIIIJ = LJJLIIIJ();
            TTSModel ttsModel = textStickerModel.getTtsModel();
            if (ttsModel != null) {
                tTSVoiceModel = ttsModel.ttsVoiceModel;
            } else {
                tTSVoiceModel = null;
            }
            boolean z2 = true;
            if (tTSVoiceModel != null) {
                z = true;
            } else {
                z = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            if (textStickerModel.getCaptionModel() == null) {
                z2 = false;
            }
            u4.LJJLIIIIJ(videoPublishEditModelLJJLIIIJ, "click_text", 1, null, boolValueOf, null, null, null, Boolean.valueOf(z2), Boolean.valueOf(textStickerModel.isVERenderSticker()), 224);
        }
    }

    @Override // X.AbstractC19622511pv
    public final void LJJJJI(StickerModel stickerModel) {
        C0E55 player;
        C0E55 player2;
        this.LLJJIJI = true;
        this.LLJJJ = ((TextStickerModel) stickerModel).getId();
        C0E48 c0e48LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if (c0e48LJJLIIIJILLIZJL != null && (player2 = c0e48LJJLIIIJILLIZJL.getPlayer()) != null) {
            player2.pause(false);
        }
        C0E48 c0e48LJJLIIIJILLIZJL2 = LJJLIIIJILLIZJL();
        if (c0e48LJJLIIIJILLIZJL2 != null && (player = c0e48LJJLIIIJILLIZJL2.getPlayer()) != null) {
            player.LJJIIJZLJL(this.LLJJJJJIL);
        }
    }

    @Override // X.AbstractC19622511pv
    public final void LJJJJIZL(StickerModel stickerModel) {
        TextStickerModel textStickerModel = (TextStickerModel) stickerModel;
        if (!this.LLJJIJI && !this.LLJJIJIL && !this.LLJJIJIIJIL) {
            return;
        }
        C384180F4m.LIZIZ.getClass();
        C384180F4m.LJ(textStickerModel);
    }

    @Override // X.AbstractC19622511pv
    public final void LJJJJL(StickerModel stickerModel) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        TextStickerModel textStickerModel = (TextStickerModel) stickerModel;
        if (LJJLI()) {
            InterfaceC361710EGb interfaceC361710EGb = (InterfaceC361710EGb) this.LLJIJIL.getValue(this, LLJJL[2]);
            if (interfaceC361710EGb != null) {
                interfaceC361710EGb.LR1(false);
            }
            View viewFindViewById = this.LLILLJJLI.findViewById(R.id.gct);
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(4, viewFindViewById);
            }
        }
        this.LLJJI = TextStickerModel.copy$default(textStickerModel, null, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -1, 65535, null);
        C0E48 c0e48LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if (c0e48LJJLIIIJILLIZJL != null) {
            nLETrackSlotLLLLLLIL = c0e48LJJLIIIJILLIZJL.LLLLLLIL();
        } else {
            nLETrackSlotLLLLLLIL = null;
        }
        this.LLJJIII = nLETrackSlotLLLLLLIL;
    }

    @Override // X.AbstractC19622511pv
    public final void LJJJJLL(StickerModel stickerModel) {
        C0E55 player;
        C0E55 player2;
        this.LLJJIJIIJIL = true;
        this.LLJJJ = ((TextStickerModel) stickerModel).getId();
        C0E48 c0e48LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if (c0e48LJJLIIIJILLIZJL != null && (player2 = c0e48LJJLIIIJILLIZJL.getPlayer()) != null) {
            player2.pause(false);
        }
        C0E48 c0e48LJJLIIIJILLIZJL2 = LJJLIIIJILLIZJL();
        if (c0e48LJJLIIIJILLIZJL2 != null && (player = c0e48LJJLIIIJILLIZJL2.getPlayer()) != null) {
            player.LJJIIJZLJL(this.LLJJJJJIL);
        }
    }

    @Override // X.AbstractC19622511pv
    public final void LJJJJZ(StickerModel stickerModel) {
        TextStickerModel textStickerModel = (TextStickerModel) stickerModel;
        if (!this.LLJJIJI && !this.LLJJIJIL && !this.LLJJIJIIJIL) {
            return;
        }
        C384180F4m.LIZIZ.getClass();
        C384180F4m.LJ(textStickerModel);
    }

    @Override // X.AbstractC19622511pv
    public final void LJJJLIIL(StickerModel stickerModel) {
        C0E55 player;
        C0E55 player2;
        this.LLJJIJIL = true;
        this.LLJJJ = ((TextStickerModel) stickerModel).getId();
        C0E48 c0e48LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if (c0e48LJJLIIIJILLIZJL != null && (player2 = c0e48LJJLIIIJILLIZJL.getPlayer()) != null) {
            player2.pause(false);
        }
        C0E48 c0e48LJJLIIIJILLIZJL2 = LJJLIIIJILLIZJL();
        if (c0e48LJJLIIIJILLIZJL2 != null && (player = c0e48LJJLIIIJILLIZJL2.getPlayer()) != null) {
            player.LJJIIJZLJL(this.LLJJJJJIL);
        }
    }

    @Override // X.AbstractC19622511pv
    public final void LJJJLL(StickerModel stickerModel) {
        TextStickerModel textStickerModel = (TextStickerModel) stickerModel;
        if (!this.LLJJIJI && !this.LLJJIJIL && !this.LLJJIJIIJIL) {
            return;
        }
        C384180F4m.LIZIZ.getClass();
        C384180F4m.LJ(textStickerModel);
    }

    @Override // X.AbstractC19622511pv
    public final void LJJL(StickerModel stickerModel) {
        C0E55 player;
        TextStickerModel textStickerModel = (TextStickerModel) stickerModel;
        TextStickerData textStickerDataLIZJ = C0F7U.LIZJ(textStickerModel);
        float x = textStickerDataLIZJ.getX();
        C1664750tQH c1664750tQH = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        u4.LJJLIIIJJI(LJJLIIIJ(), textStickerDataLIZJ, (x / ((InterfaceC1455860nzM) c1664750tQH.getValue(this, interfaceC2217461BqaArr[1])).k52()) - 0.5f, (textStickerDataLIZJ.getY() / ((InterfaceC1455860nzM) this.LLJI.getValue(this, interfaceC2217461BqaArr[1])).VF0()) - 0.5f, 1);
        if ((this.LLJJIJI || this.LLJJIJIIJIL || this.LLJJIJIL) && textStickerModel.getBaseStickerModel().getId() == this.LLJJJ) {
            this.LLJJJ = -1;
            C384180F4m.LIZIZ.getClass();
            C384180F4m.LJFF(textStickerModel);
            this.LLJJIJIIJIL = false;
            this.LLJJIJI = false;
            this.LLJJIJIL = false;
            C0E48 c0e48LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
            if (c0e48LJJLIIIJILLIZJL != null && (player = c0e48LJJLIIIJILLIZJL.getPlayer()) != null) {
                player.LIZ(this.LLJJJJJIL);
            }
            C354270Duj.LIZ(0L, new AwS406S0200000_5(this, textStickerModel, 124));
        }
    }

    @Override // X.AbstractC19622511pv
    public final void LJJJJLI(StickerModel stickerModel, boolean z) {
        View viewFindViewById;
        TextStickerModel textStickerModel = (TextStickerModel) stickerModel;
        this.LLILZLL.LJJIL(textStickerModel);
        if (LJJLI() && (viewFindViewById = this.LLILLJJLI.findViewById(R.id.gct)) != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        }
        TextStickerModel textStickerModel2 = this.LLJJI;
        NLETrackSlot nLETrackSlot = this.LLJJIII;
        this.LLJJIII = null;
        this.LLJJI = null;
        C354270Duj.LIZ(0L, new AwS14S0410000_5(this, textStickerModel, z, textStickerModel2, nLETrackSlot, 0));
    }

    @Override // X.AbstractC19622511pv
    public final void LJJJZ(StickerModel stickerModel, MotionEvent motionEvent) {
        String uuid;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        if (motionEvent != null && motionEvent.getActionMasked() == 0) {
            this.LLJJJIL = LJJLIIIJLJLI();
            C0E48 c0e48LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
            if (c0e48LJJLIIIJILLIZJL != null && (nLETrackSlotLLLLLLIL = c0e48LJJLIIIJILLIZJL.LLLLLLIL()) != null) {
                uuid = nLETrackSlotLLLLLLIL.getUUID();
            } else {
                uuid = null;
            }
            this.LLJJJJ = uuid;
        }
    }

    public final void LJJLIIIIJ(String str, EnumC356070Dxd enumC356070Dxd) {
        if (enumC356070Dxd != null) {
            int i = C350620Doq.LIZ[enumC356070Dxd.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C0E48 c0e48LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
                        if (c0e48LJJLIIIJILLIZJL != null) {
                            C350870DpF.LIZJ(c0e48LJJLIIIJILLIZJL, str);
                            return;
                        }
                        return;
                    }
                    throw new C1954807lC();
                }
                return;
            }
            C0E48 c0e48LJJLIIIJILLIZJL2 = LJJLIIIJILLIZJL();
            if (c0e48LJJLIIIJILLIZJL2 == null) {
                return;
            }
            C350870DpF.LIZ(c0e48LJJLIIIJILLIZJL2, false);
        }
    }

    public final void LJJLIIJ(TextStickerModel textStickerModel, boolean z) {
        C0EOK c0eokLJJLIIIJJI;
        List<StickerModel> listLLLILZLLLI;
        TextStyleModel textStyleModelLIZ;
        Object next;
        if (textStickerModel.getCaptionModel() != null && (c0eokLJJLIIIJJI = LJJLIIIJJI()) != null && (listLLLILZLLLI = c0eokLJJLIIIJJI.LLLILZLLLI(EnumC1466150oFx.TEXT)) != null) {
            ArrayList arrayList = new ArrayList();
            for (StickerModel stickerModel : listLLLILZLLLI) {
                if (stickerModel instanceof TextStickerModel) {
                    arrayList.add(stickerModel);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                TextStickerModel textStickerModel2 = (TextStickerModel) obj;
                if (C0F8Y.LJIIIIZZ(textStickerModel2) && !Intrinsics.LJFF(textStickerModel2.getUuid(), textStickerModel.getUuid())) {
                    arrayList2.add(obj);
                }
            }
            C0E48 c0e48LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
            if (c0e48LJJLIIIJILLIZJL != null) {
                NLEModel nLEModelLJI = C350870DpF.LJI(c0e48LJJLIIIJILLIZJL);
                C0EKO c0eko = C0EKO.LIZ;
                C19EG c19eg = this.LLILLJJLI;
                c0eko.getClass();
                ArrayList arrayList3 = new ArrayList();
                for (NLETrackSlot nLETrackSlot : C349550Dn7.LIZJ(nLEModelLJI)) {
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        textStyleModelLIZ = null;
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (Intrinsics.LJFF(((TextStickerModel) next).getUuid(), nLETrackSlot.getUUID())) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    TextStickerModel textStickerModel3 = (TextStickerModel) next;
                    if (textStickerModel3 != null) {
                        TextStickerModel textStickerModelCopy$default = TextStickerModel.copy$default(textStickerModel3, BaseStickerModel.copy$default(textStickerModel3.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, textStickerModel.getBaseStickerModel().getTranslateX(), textStickerModel.getBaseStickerModel().getTranslateY(), textStickerModel.getBaseStickerModel().getScale(), textStickerModel.getBaseStickerModel().getRotation(), 0.0f, 0.0f, false, 0.0f, 0.0f, false, textStickerModel.getBaseStickerModel().getAlpha(), null, null, null, false, 2116026367, 15, null), null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, true, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -16386, 65535, null);
                        if (z) {
                            TextFontModel textFontModelLIZ = TextFontModel.LIZ(textStickerModel.getFontModel(), null, null, null, null, null, null, 0, 0, null, null, false, false, 0, 16383);
                            int mode = textStickerModel.getMode();
                            int align = textStickerModel.getAlign();
                            int color = textStickerModel.getColor();
                            TextMotionModel textMotionModelLIZ = TextMotionModel.LIZ(textStickerModel.getTextMotionModel(), null, 0.0f, 0, null, null, 0, false, 1023);
                            TextStyleModel textStyle = textStickerModel.getTextStyle();
                            if (textStyle != null) {
                                textStyleModelLIZ = TextStyleModel.LIZ(textStyle, null, null, null, null, false, null, 2047);
                            }
                            TextStickerModel textStickerModelCopy$default2 = TextStickerModel.copy$default(textStickerModelCopy$default, BaseStickerModel.copy$default(textStickerModelCopy$default.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, textStickerModel.isVERenderSticker(), 0.0f, null, null, null, false, -1073741825, 15, null), null, null, null, null, mode, color, align, 0.0f, textFontModelLIZ, false, false, false, textStickerModel.isVERenderSticker(), false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, textMotionModelLIZ, null, false, textStickerModel.getMentionList(), null, false, false, CaptionTemplateModel.LIZ(textStickerModel.getCaptionTemplateModel(), false, null, null, false, false, false, 63), textStyleModelLIZ, null, null, null, null, false, false, null, false, false, false, null, 1879039262, 65511, null);
                            textStickerModelCopy$default = TextStickerModel.copy$default(textStickerModelCopy$default2, null, null, null, null, C13LQ.LJJJ(C123P.LIZJ(C123P.LJIILJJIL(C0F7U.LIZJ(textStickerModelCopy$default2), c19eg)).getStickerStringArray(), "\n", null, null, AFwS234S0000000_5.get$arr$(445), 30), 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -17, 65535, null);
                            nLETrackSlot.setExtra("text_wrap_list", C363430EMr.LJ(C123P.LIZLLL(textStickerModelCopy$default.getTextStrWithLineBreak())));
                        }
                        if (z) {
                            boolean zLJIIJ = C385050F7v.LJIIJ(textStickerModelCopy$default);
                            String str = CardStruct.IStatusCode.DEFAULT;
                            if (!zLJIIJ) {
                                C0EKO.LIZ.getClass();
                                C0EKO.LIZ(nLETrackSlot, textStickerModelCopy$default);
                            } else {
                                C0EKO.LIZ.getClass();
                                TextMobModel mobModel = textStickerModelCopy$default.getMobModel();
                                mobModel.adjustTextStyleInEditorPro = CardStruct.IStatusCode.DEFAULT;
                                mobModel.adjustTextParagraph = CardStruct.IStatusCode.DEFAULT;
                                mobModel.adjustTextColorInEditorPro = CardStruct.IStatusCode.DEFAULT;
                                mobModel.adjustTextFontInEditorPro = CardStruct.IStatusCode.DEFAULT;
                            }
                            nLETrackSlot.setExtra("bg_mode", String.valueOf(textStickerModelCopy$default.getMode()));
                            nLETrackSlot.setExtra("align", String.valueOf(textStickerModelCopy$default.getAlign()));
                            nLETrackSlot.setExtra("color", String.valueOf(textStickerModelCopy$default.getColor()));
                            nLETrackSlot.setExtra("font_size", String.valueOf(textStickerModelCopy$default.getFontModel().fontSize));
                            nLETrackSlot.setExtra("font_type", textStickerModelCopy$default.getFontModel().fileName);
                            C0EKO.LIZ.getClass();
                            C0EKO.LIZIZ(nLETrackSlot, textStickerModelCopy$default);
                            nLETrackSlot.setExtra("text_sticker_data", C363430EMr.LIZLLL(C0F7U.LIZJ(textStickerModelCopy$default)));
                            if (textStickerModelCopy$default.getTextMotionModel().lastMotionEnabledState) {
                                str = "1";
                            }
                            nLETrackSlot.setExtra("motion_enabled_on_last_use", str);
                        }
                        nLETrackSlot.setExtra("ep_slot_add_order", String.valueOf(C351220Dpo.LJLJLLL(nLEModelLJI)));
                        BaseStickerModel baseStickerModel = textStickerModelCopy$default.getBaseStickerModel();
                        nLETrackSlot.setScale(baseStickerModel.getScale());
                        NLESegmentTextSticker nLESegmentTextStickerDynamicCast = NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                        if (nLESegmentTextStickerDynamicCast != null && nLESegmentTextStickerDynamicCast.getIsRichtext()) {
                            nLETrackSlot.setTransformX((2 * baseStickerModel.getTranslateX()) / baseStickerModel.getContainerWidth());
                            nLETrackSlot.setTransformY(((-2) * baseStickerModel.getTranslateY()) / baseStickerModel.getContainerHeight());
                            nLETrackSlot.setRotation((-baseStickerModel.getRotation()) % 360);
                        } else {
                            nLETrackSlot.setTransformX(baseStickerModel.getTranslateX());
                            nLETrackSlot.setTransformY(baseStickerModel.getTranslateY());
                            nLETrackSlot.setRotation(baseStickerModel.getRotation());
                        }
                        arrayList3.add(textStickerModelCopy$default);
                    }
                }
                C0EOK c0eokLJJLIIIJJI2 = LJJLIIIJJI();
                if (c0eokLJJLIIIJJI2 != null) {
                    c0eokLJJLIIIJJI2.T(arrayList3, EnumC356070Dxd.COMMIT);
                }
                C0EOK c0eokLJJLIIIJJI3 = LJJLIIIJJI();
                if (c0eokLJJLIIIJJI3 != null) {
                    c0eokLJJLIIIJJI3.d71(EnumC1466150oFx.TEXT, true);
                }
            }
        }
    }

    public final void LJJLIIIJLLLLLLLZ(TextStickerModel textStickerModel, TextStickerModel textStickerModel2, NLETrackSlot nLETrackSlot) {
        C0E5S c0e5s;
        C0E48 c0e48LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if (c0e48LJJLIIIJILLIZJL != null) {
            NLEModel nLEModelLJI = C350870DpF.LJI(c0e48LJJLIIIJILLIZJL);
            nLEModelLJI.setExtra("use_text_in_editor_pro", "true");
            for (NLETrack nLETrack : nLEModelLJI.getTracks()) {
                for (NLETrackSlot nLETrackSlot2 : nLETrack.getSlots()) {
                    if (Intrinsics.LJFF(nLETrackSlot2.getUUID(), textStickerModel.getUuid())) {
                        nLETrack.removeSlot(nLETrackSlot2);
                    }
                }
            }
            if (nLETrackSlot != null) {
                C0EVZ.LIZJ(nLETrackSlot, LJJLIIIJILLIZJL());
            }
            C0E48 c0e48LJJLIIIJILLIZJL2 = LJJLIIIJILLIZJL();
            if (c0e48LJJLIIIJILLIZJL2 != null) {
                C350870DpF.LIZ(c0e48LJJLIIIJILLIZJL2, false);
            }
            if (textStickerModel2 != null && textStickerModel2.isNotEmptyModel() && !LJJLIIIJL() && !LJJLIIIJJIZ()) {
                C0E1X c0e1x = new C0E1X(C0E1V.DELETE.getNameId(), null, null, null, null, 30);
                C0E48 c0e48LJJLIIIJILLIZJL3 = LJJLIIIJILLIZJL();
                if (c0e48LJJLIIIJILLIZJL3 != null) {
                    C350870DpF.LIZJ(c0e48LJJLIIIJILLIZJL3, C051R.LIZIZ(c0e1x));
                }
            }
            if (!LJJLIIIJLJLI() && !LJJLIIIJL() && (c0e5s = (C0E5S) this.LLJILJIL.getValue(this, LLJJL[3])) != null) {
                c0e5s.w6(null, false, false);
            }
        }
    }

    public C0EKW(C19EG c19eg, C19A3 c19a3, C1DRG c1drg, C0EPI c0epi, C387590FHp c387590FHp, InterfaceC362470EIz interfaceC362470EIz, InterfaceC384330F5b interfaceC384330F5b) {
        super(TextStickerModel.class);
        this.LLILLJJLI = c19eg;
        this.LLILLL = c19a3;
        this.LLILZ = c1drg;
        this.LLILZIL = c0epi;
        this.LLILZLL = c387590FHp;
        this.LLIZ = interfaceC362470EIz;
        this.LLIZLLLIL = interfaceC384330F5b;
        this.LLJ = C1664770tQJ.LIZIZ(c1drg, C0EOK.class, null);
        this.LLJI = C1664770tQJ.LIZ(c1drg, InterfaceC1455860nzM.class, null);
        this.LLJIJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC361710EGb.class, null);
        this.LLJILJIL = C1664770tQJ.LIZIZ(c1drg, C0E5S.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZIZ(c1drg, C0EB6.class, null);
        this.LLJILLL = C1664770tQJ.LIZIZ(c1drg, C0EGY.class, null);
        this.LLJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1168));
        this.LLJJJ = -1;
        this.LLJJJJJIL = AFwS191S0000000_5.get$arr$(322);
        this.LLJJJJLIIL = EnumC1466150oFx.TEXT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r38v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r54v0, types: [X.0FTc] */
    /* JADX WARN: Type inference failed for: r55v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r56v0, types: [java.util.List] */
    public static void LJJLIL(C0EKW c0ekw, TextStickerModel textStickerModel, TextStickerModel textStickerModel2, C0E1V c0e1v, EnumC356070Dxd enumC356070Dxd, boolean z, boolean z2, int i) {
        boolean z3;
        boolean z4;
        NLETrack nLETrack;
        boolean z5;
        String str;
        String str2;
        String str3;
        TextMotionModel textMotionModel;
        EnumC1466150oFx enumC1466150oFx;
        Long l;
        Object uuid;
        C0E48 c0e48LJJLIIIJILLIZJL;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C385670FAf<Boolean> c385670FAfXS;
        int layer;
        C364440EQo c364440EQoLLLZIL;
        String str4;
        InlineCaptionModel inlineCaptionModel;
        int layer2;
        String str5;
        EnumC356070Dxd enumC356070Dxd2 = enumC356070Dxd;
        C0E1V c0e1v2 = c0e1v;
        if ((i & 4) != 0) {
            c0e1v2 = C0E1V.EDIT_TEXT;
        }
        if ((i & 8) != 0) {
            enumC356070Dxd2 = EnumC356070Dxd.COMMIT;
        }
        if ((i & 16) != 0) {
            z = true;
        }
        if ((i & 32) != 0) {
            z2 = true;
        }
        C0E48 c0e48LJJLIIIJILLIZJL2 = c0ekw.LJJLIIIJILLIZJL();
        if (c0e48LJJLIIIJILLIZJL2 != null) {
            NLEModel nLEModelLJI = C350870DpF.LJI(c0e48LJJLIIIJILLIZJL2);
            NLESetting setting = nLEModelLJI.getSetting();
            if (setting != null && setting.getFreeRenderLayer()) {
                z3 = true;
            } else {
                z3 = false;
            }
            nLEModelLJI.setExtra("use_text_in_editor_pro", "true");
            BaseStickerModel baseStickerModel = textStickerModel.getBaseStickerModel();
            NLETrackSlot nLETrackSlot = new NLETrackSlot();
            if (C123100dR.LIZ(textStickerModel.getUuid())) {
                z4 = true;
                nLETrack = null;
                for (NLETrack nLETrack2 : nLEModelLJI.getTracks()) {
                    Iterator<NLETrackSlot> it2 = nLETrack2.getSlots().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            NLETrackSlot next = it2.next();
                            if (Intrinsics.LJFF(next.getUUID(), textStickerModel.getUuid())) {
                                nLETrack = nLETrack2;
                                nLETrackSlot = next;
                                z4 = false;
                                break;
                            }
                        }
                    }
                }
            } else {
                z4 = true;
                nLETrack = null;
            }
            if (textStickerModel.getCaptionModel() != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                str = "SUBTITLE";
            } else if (C0F8Y.LJII(textStickerModel) && (Intrinsics.LJFF(nLETrackSlot.getExtra("is_meme_audio"), "1") || Intrinsics.LJFF(nLETrackSlot.getExtra("is_ai_meme"), "1"))) {
                str = "AI_CAPTION";
            } else {
                str = "TEXT_STICKER";
            }
            nLETrackSlot.setExtra("text_slot_type", str);
            if (c0e1v2 == C0E1V.ADD_TEXT) {
                nLETrackSlot.setExtra("is_editor_pro_add_text_used", "true");
            }
            if (textStickerModel.getSourceType() == C0F7S.EDITOR_PRO) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            nLETrackSlot.setExtra("is_editorpro_text", str2);
            if (!C385050F7v.LJIIJ(textStickerModel)) {
                C0EKO.LIZ.getClass();
                C0EKO.LIZ(nLETrackSlot, textStickerModel);
            } else {
                C0EKO.LIZ.getClass();
                TextMobModel mobModel = textStickerModel.getMobModel();
                mobModel.adjustTextStyleInEditorPro = CardStruct.IStatusCode.DEFAULT;
                mobModel.adjustTextParagraph = CardStruct.IStatusCode.DEFAULT;
                mobModel.adjustTextColorInEditorPro = CardStruct.IStatusCode.DEFAULT;
                mobModel.adjustTextFontInEditorPro = CardStruct.IStatusCode.DEFAULT;
            }
            nLETrackSlot.setExtra("bg_mode", String.valueOf(textStickerModel.getMode()));
            nLETrackSlot.setExtra("align", String.valueOf(textStickerModel.getAlign()));
            nLETrackSlot.setExtra("color", String.valueOf(textStickerModel.getColor()));
            nLETrackSlot.setExtra("font_size", String.valueOf(textStickerModel.getFontModel().fontSize));
            nLETrackSlot.setExtra("font_type", textStickerModel.getFontModel().fileName);
            nLETrackSlot.setExtra("text", textStickerModel.getTextStr());
            nLETrackSlot.setExtra("lineSpacingExtra", String.valueOf(textStickerModel.getLineSpacingExtra()));
            nLETrackSlot.setExtra("ep_text_capitalization_state", textStickerModel.getCompatModel().getCapitalizationState().name());
            nLETrackSlot.setExtra("ep_text_show_punctuation", String.valueOf(textStickerModel.getCompatModel().getShowPunctuation()));
            C0EKO.LIZ.getClass();
            C0EKO.LIZIZ(nLETrackSlot, textStickerModel);
            if (textStickerModel.getTextMotionModel().lastMotionEnabledState) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            nLETrackSlot.setExtra("motion_enabled_on_last_use", str3);
            nLETrackSlot.setExtra("text_wrap_list", C363430EMr.LJ(C123P.LIZLLL(textStickerModel.getTextStrWithLineBreak())));
            if (textStickerModel2 != null) {
                textMotionModel = textStickerModel2.getTextMotionModel();
            } else {
                textMotionModel = null;
            }
            if (!Intrinsics.LJFF(textMotionModel, textStickerModel.getTextMotionModel())) {
                if (textStickerModel.getCaptionModel() != null) {
                    str5 = "use_caption_motion_in_ep";
                } else {
                    str5 = "use_text_motion_in_ep";
                }
                nLETrackSlot.setExtra(str5, "1");
            }
            if (C385050F7v.LJIIJ(textStickerModel)) {
                nLETrackSlot.setExtra("use_caption_motion_in_ep", CardStruct.IStatusCode.DEFAULT);
            }
            nLETrackSlot.setExtra("text_sticker_data", C363430EMr.LIZLLL(C0F7U.LIZJ(textStickerModel)));
            nLETrackSlot.setExtra("ep_slot_add_order", String.valueOf(C351220Dpo.LJLJLLL(nLEModelLJI)));
            if (!z3) {
                if (nLETrack != null) {
                    layer2 = nLETrack.getLayer();
                } else {
                    layer2 = 0;
                }
                nLETrackSlot.setLayer(layer2 + 1 + 2000);
            }
            String extra = "";
            if (!textStickerModel.isVERenderSticker()) {
                if (nLETrackSlot.getMainSegment() == null) {
                    nLETrackSlot.setMainSegment(new NLESegmentTextSticker());
                } else {
                    NLENode nLENodeDeepCloneWithUUID = new NLESegmentTextSticker().deepCloneWithUUID(nLETrackSlot.getMainSegment().getUUID());
                    if (nLENodeDeepCloneWithUUID != null) {
                        nLETrackSlot.setMainSegment(NLESegmentTextSticker.dynamicCast(nLENodeDeepCloneWithUUID));
                    }
                }
                nLETrackSlot.setStartTime(((long) baseStickerModel.getStartTime()) * 1000);
                nLETrackSlot.setEndTime(((long) baseStickerModel.getEndTime()) * 1000);
                nLETrackSlot.setTransformX(baseStickerModel.getTranslateX());
                nLETrackSlot.setTransformY(baseStickerModel.getTranslateY());
                nLETrackSlot.setScale(baseStickerModel.getScale());
                C351220Dpo.LLLLLILLIL(nLETrackSlot, baseStickerModel.getAlpha());
                nLETrackSlot.setRotation(baseStickerModel.getRotation());
            } else if (nLETrackSlot.getMainSegment() == null) {
                NLESegmentTextSticker nLESegmentTextSticker = new NLESegmentTextSticker();
                nLESegmentTextSticker.setIsRichtext(true);
                nLESegmentTextSticker.setRichContent(C385050F7v.LIZIZ(textStickerModel, ""));
                nLESegmentTextSticker.setContent(C385050F7v.LIZ(textStickerModel));
                nLETrackSlot.setMainSegment(nLESegmentTextSticker);
            }
            textStickerModel.setUuid(nLETrackSlot.getUUID());
            if (textStickerModel.getCaptionModel() != null && (c364440EQoLLLZIL = c0ekw.LLILZIL.LLLZIL()) != null) {
                CreativeModel creativeModel = LJJLIIIJ().creativeModel;
                if (creativeModel == null || (inlineCaptionModel = creativeModel.inlineCaptionModel) == null || (str4 = inlineCaptionModel.selectLanguage) == null) {
                    str4 = "";
                }
                enumC1466150oFx = null;
                c364440EQoLLLZIL.LJ(str4, c0ekw.LLILZIL.IP(), null, null);
            } else {
                enumC1466150oFx = null;
            }
            if (z4) {
                NLETrack nLETrackLJIIJ = C357540E0a.LJIIJ(nLEModelLJI, nLETrackSlot, C349560Dn8.LJ(nLEModelLJI), new AwS549S0100000_5(nLEModelLJI, 1169), true);
                if (!z3) {
                    if (nLETrackLJIIJ != null) {
                        layer = nLETrackLJIIJ.getLayer();
                    } else {
                        layer = 0;
                    }
                    nLETrackSlot.setLayer(layer + 1 + 2000);
                }
                int layer3 = nLETrackSlot.getLayer();
                C0EOK c0eokLJJLIIIJJI = c0ekw.LJJLIIIJJI();
                if (c0eokLJJLIIIJJI != null) {
                    c0eokLJJLIIIJJI.k3(TextStickerModel.copy$default(textStickerModel, BaseStickerModel.copy$default(textStickerModel.getBaseStickerModel(), 0, layer3, enumC1466150oFx, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, enumC1466150oFx, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, enumC1466150oFx, enumC1466150oFx, enumC1466150oFx, false, -3, 15, enumC1466150oFx), null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -2, 65535, null), EnumC356070Dxd.COMMIT);
                }
            }
            nLEModelLJI.setExtra("is_apply_to_all", String.valueOf(new C0EKG().LIZ()));
            if (z) {
                AwS249S0300000_5 awS249S0300000_5 = new AwS249S0300000_5(enumC356070Dxd2, c0ekw, c0e1v2, 26);
                C0E48 c0e48LJJLIIIJILLIZJL3 = c0ekw.LJJLIIIJILLIZJL();
                if (c0e48LJJLIIIJILLIZJL3 == null) {
                    l = null;
                } else {
                    VideoPublishEditModel videoPublishEditModelLJJLIIIJ = LJJLIIIJ();
                    String extra2 = nLETrackSlot.getExtra("text");
                    if (nLETrackSlot.hasExtra("text_tts_id") && nLETrackSlot.hasExtra("ep_text_tts_content") && !Intrinsics.LJFF(nLETrackSlot.getExtra("ep_text_tts_content"), extra2)) {
                        if (nLETrackSlot.hasExtra("ep_text_tts_speaker_id")) {
                            extra = nLETrackSlot.getExtra("ep_text_tts_speaker_id");
                        }
                        C0EVZ.LIZJ(nLETrackSlot, c0e48LJJLIIIJILLIZJL3);
                        EditorProTTSHelper editorProTTSHelper = new EditorProTTSHelper(c0ekw.LLILLJJLI, c0ekw.LLILLL.getLifecycle(), videoPublishEditModelLJJLIIIJ, c0e48LJJLIIIJILLIZJL3);
                        if (a0.LJJJIL(extra) && C376950EqD.LIZ(videoPublishEditModelLJJLIIIJ)) {
                            C786410Ut5.O4(editorProTTSHelper.LIZ(new AwS584S0100000_5(awS249S0300000_5, 946)));
                            l = null;
                            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2377109Td(editorProTTSHelper, awS249S0300000_5, extra2, nLETrackSlot, null), 3);
                        } else {
                            l = null;
                            EditorProTTSHelper.LIZLLL(editorProTTSHelper, false, extra2, nLETrackSlot, extra, new AwS584S0100000_5(awS249S0300000_5, 947), 32);
                        }
                    } else {
                        l = null;
                        InterfaceC362470EIz interfaceC362470EIz = c0ekw.LLIZ;
                        if (interfaceC362470EIz != null && (c385670FAfXS = interfaceC362470EIz.XS()) != null && Intrinsics.LJFF(c385670FAfXS.LIZJ(), Boolean.TRUE)) {
                            c0ekw.LLIZ.cU(c0ekw.LLILLJJLI, extra2, nLETrackSlot, false, new AwS134S0400000_5(c0ekw, c0e48LJJLIIIJILLIZJL3, videoPublishEditModelLJJLIIIJ, awS249S0300000_5, 8), new AwS406S0200000_5(c0ekw, awS249S0300000_5, 125));
                        } else {
                            awS249S0300000_5.invoke();
                        }
                    }
                }
            } else {
                l = null;
                c0ekw.LJJLIIIIJ(C051R.LIZIZ(new C0E1X(c0e1v2.getNameId(), null, null, null, null, 30)), enumC356070Dxd2);
            }
            C0E48 c0e48LJJLIIIJILLIZJL4 = c0ekw.LJJLIIIJILLIZJL();
            if (c0e48LJJLIIIJILLIZJL4 != null && (nLETrackSlotLLLLLLIL = c0e48LJJLIIIJILLIZJL4.LLLLLLIL()) != null) {
                uuid = nLETrackSlotLLLLLLIL.getUUID();
            } else {
                uuid = l;
            }
            if (!Intrinsics.LJFF(uuid, nLETrackSlot.getUUID()) && z2 && (c0e48LJJLIIIJILLIZJL = c0ekw.LJJLIIIJILLIZJL()) != null) {
                c0e48LJJLIIIJILLIZJL.S7().LIZIZ(new C358740E4q(nLETrackSlot, 0, l, false, 0, 254), "select_slot_event", false);
            }
        }
    }
}
