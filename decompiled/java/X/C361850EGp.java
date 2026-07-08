package X;

import android.app.Activity;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionCachesModel;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.ss.android.ugc.aweme.sticker.data.Word;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionFragment;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.ss.ugc.android.editor.components.base.api.IPreviewService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS103S0400000_5;
import kotlin.jvm.internal.AwS119S1100000_5;
import kotlin.jvm.internal.AwS441S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS619S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0EGp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C361850EGp extends C0EH9 implements InterfaceC361830EGn {
    public final C0EGH LLJILJIL;
    public final C0EJ3 LLJILJILJ;
    public final C0E5S LLJILLL;
    public boolean LLJJ;
    public final List<String> LLJJI;
    public final C01GW LLJJIII;

    public static final VideoPublishEditModel LJIILJJIL() {
        EditModelProvider.Companion.getClass();
        return C0E1T.LIZ().getEditModel();
    }

    public final void LJIILLIIL() {
        C0E48 c0e48LJIIJ = LJIIJ();
        if (c0e48LJIIJ == null) {
            return;
        }
        long jLLLLLLJ = C351220Dpo.LLLLLLJ(c0e48LJIIJ.getPlayer().Jh());
        long[] jArr = new long[2];
        c0e48LJIIJ.Bq(jArr);
        long j = jArr[0];
        long j2 = jArr[1];
        if (j >= jLLLLLLJ) {
            c0e48LJIIJ.getPlayer().LJIJI(j + ((long) (jLLLLLLJ != 0 ? LSPassThroughRecordSizeConfig.DEFAULT : 0)), C351110Dpd.LIZ);
            return;
        }
        if (jLLLLLLJ >= j2) {
            if (C351220Dpo.LLLLLLL(jLLLLLLJ) != c0e48LJIIJ.getPlayer().qq() || jLLLLLLJ - j2 > 1000) {
                c0e48LJIIJ.getPlayer().LJIJI(j2 - ((long) LSPassThroughRecordSizeConfig.DEFAULT), C351110Dpd.LIZ);
            } else {
                c0e48LJIIJ.getPlayer().LJIJI(jLLLLLLJ, C351110Dpd.LIZ);
            }
        }
    }

    public final boolean LJIJ() {
        boolean z;
        C0E48 c0e48LJIIJ = LJIIJ();
        if (c0e48LJIIJ == null) {
            return true;
        }
        if (!C363740ENw.LIZIZ(C350870DpF.LJI(c0e48LJIIJ))) {
            Activity activityLJIIIZ = LJIIIZ();
            if (activityLJIIIZ != null) {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131826919);
                creativeToastBuilder.isTuxToastLegacy(true);
                C1390380mHk.LIZ(activityLJIIIZ, 3027, creativeToastBuilder);
            }
            return true;
        }
        boolean zLJIIJJI = C363740ENw.LJIIJJI(C350870DpF.LJI(c0e48LJIIJ));
        boolean zLIZ = C363740ENw.LIZ(C350870DpF.LJI(c0e48LJIIJ));
        if (zLJIIJJI && zLIZ) {
            Activity activityLJIIIZ2 = LJIIIZ();
            if (activityLJIIIZ2 != null) {
                CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                creativeToastBuilder2.messageRes(2131830665);
                creativeToastBuilder2.isTuxToastLegacy(true);
                C1390380mHk.LIZ(activityLJIIIZ2, 1050, creativeToastBuilder2);
            }
            return true;
        }
        VecNLETrackSPtr tracks = C350870DpF.LJI(c0e48LJIIJ).getTracks();
        if (tracks != null && !tracks.isEmpty()) {
            Iterator<NLETrack> it2 = tracks.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (C351220Dpo.LLLFF(it2.next())) {
                    z = C366800EZq.LIZ(LJIILJJIL(), C350870DpF.LJI(c0e48LJIIJ)) ? false : true;
                }
            }
        }
        if (!zLJIIJJI || !z) {
            return false;
        }
        Activity activityLJIIIZ3 = LJIIIZ();
        if (activityLJIIIZ3 != null) {
            CreativeToastBuilder creativeToastBuilder3 = new CreativeToastBuilder();
            creativeToastBuilder3.messageRes(2131828401);
            creativeToastBuilder3.isTuxToastLegacy(true);
            C1390380mHk.LIZ(activityLJIIIZ3, 3027, creativeToastBuilder3);
        }
        return true;
    }

    @Override // X.InterfaceC361830EGn
    public final void LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        C0E48 c0e48LJIIJ = LJIIJ();
        if (c0e48LJIIJ != null && C363740ENw.LJII(videoPublishEditModel, C350870DpF.LJI(c0e48LJIIJ))) {
            C0EGH c0egh = this.LLJILJIL;
            if (c0egh.LJIIL) {
                c0egh.LJ().LIZLLL();
            }
            c0egh.LJ().LJI(c0egh.LJFF(false));
            return;
        }
        C0EGH c0egh2 = this.LLJILJIL;
        if (c0egh2.LJIIL) {
            c0egh2.LJ().LIZLLL();
        }
        c0egh2.LJ().LJI(c0egh2.LJFF(true));
    }

    @Override // X.C0EHG
    public final boolean LJ(C361980EHc c361980EHc) {
        return this.LLJJI.contains(c361980EHc.LJI);
    }

    public final void LJIILL(AwS549S0100000_5 awS549S0100000_5) {
        this.LLJILJIL.LJFF = new AwS441S0200000_5(awS549S0100000_5, this, 14);
    }

    @Override // X.InterfaceC361830EGn
    public final void LIZ(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        C0EHK.LJIIIIZZ((InterfaceC359850E8x) this.LLJI.getValue(), this.LLJILJIL, videoPublishEditModel, nLEModel);
    }

    @Override // X.InterfaceC361830EGn
    public final void LJI(Effect effect, boolean z) {
        Effect effect2;
        if (z) {
            effect2 = null;
        } else {
            effect2 = effect;
            effect = null;
        }
        LJIIZILJ(false, effect2, effect, true);
    }

    public final void LJIJI(String str, boolean z) {
        CreativeModel creativeModel;
        InlineCaptionModel inlineCaptionModel;
        C364440EQo c364440EQoU4;
        ArrayList<TextStickerData> arrayListLJIIIIZZ;
        C0E5S c0e5s;
        ArrayList<CaptionUtterance> arrayList;
        C0EJ3 c0ej3 = this.LLJILJILJ;
        String str2 = null;
        if (c0ej3 != null && (c364440EQoU4 = c0ej3.u4()) != null) {
            CaptionCachesModel captionCachesModel = c364440EQoU4.LIZ.get(str);
            if (captionCachesModel != null && z && (arrayList = captionCachesModel.captionsList) != null) {
                arrayListLJIIIIZZ = C363730ENv.LJIIIIZZ(arrayList);
                if (!arrayListLJIIIIZZ.isEmpty()) {
                    for (TextStickerData textStickerData : arrayListLJIIIIZZ) {
                        if (!C363740ENw.LIZLLL(textStickerData.getFilterTag(), C13LQ.LJIIJ(C0EVA.values()))) {
                            List<Word> words = textStickerData.getWords();
                            if (!(words instanceof Collection) || !words.isEmpty()) {
                                Iterator<Word> it2 = words.iterator();
                                while (it2.hasNext()) {
                                    if (C363740ENw.LIZLLL(it2.next().getTag(), C13LQ.LJIIJ(C0EVA.values()))) {
                                    }
                                }
                            }
                        }
                    }
                }
                Activity activityLJIIIZ = LJIIIZ();
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.message(LJIIIZ().getString(2131833331));
                C1390380mHk.LIZ(activityLJIIIZ, 3027, creativeToastBuilder);
            } else {
                arrayListLJIIIIZZ = null;
            }
            C0E48 c0e48LJIIJ = LJIIJ();
            if (c0e48LJIIJ != null && c0e48LJIIJ.LLLLLLIL() != null && (c0e5s = this.LLJILLL) != null) {
                c0e5s.w6(null, false, false);
            }
            C0E48 c0e48LJIIJ2 = LJIIJ();
            if (c0e48LJIIJ2 == null) {
                return;
            }
            C19A3 c19a3 = this.LL;
            C375820EoO.LIZ(c19a3, c0e48LJIIJ2, C364510EQv.class, new C364490EQt(c19a3, c0e48LJIIJ2, this.LLILLJJLI, c364440EQoU4, new C0EJ2(((C0ES4) this.LLJJIII.getValue()).LIZ() - C0ES3.LIZ, false, str, 10), arrayListLJIIIIZZ, new AwS619S0100000_5(c0e48LJIIJ2, 69), 64), 16);
        }
        C0EJ3 c0ej32 = this.LLJILJILJ;
        if (c0ej32 != null) {
            List<TextStickerModel> listSb = c0ej32.Sb();
            ArrayList arrayList2 = new ArrayList();
            for (TextStickerModel textStickerModel : listSb) {
                if (C0F8Y.LJIIIIZZ(textStickerModel)) {
                    arrayList2.add(textStickerModel);
                }
            }
            int size = arrayList2.size();
            VideoPublishEditModel videoPublishEditModelLJIILJJIL = LJIILJJIL();
            VideoPublishEditModel videoPublishEditModelLJIILJJIL2 = LJIILJJIL();
            if (videoPublishEditModelLJIILJJIL2 != null && (creativeModel = videoPublishEditModelLJIILJJIL2.creativeModel) != null && (inlineCaptionModel = creativeModel.inlineCaptionModel) != null) {
                str2 = inlineCaptionModel.selectLanguageCode;
            }
            C1402610mbT.LJJIFFI(size, videoPublishEditModelLJIILJJIL, "click_caption_panel", str2);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.ss.android.ugc.effectmanager.effect.model.Effect] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0LAB] */
    @Override // X.C0EHG
    public final void LIZJ(C361980EHc c361980EHc, View view, Map<String, String> map) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C364440EQo c364440EQoLLLZIL;
        boolean z;
        String str;
        List<TextStickerModel> listSb;
        List<TextStickerModel> listSb2;
        IPreviewService iPreviewServiceLIZ;
        InterfaceC361710EGb previewPanelApi;
        C0E48 c0e48LJIIJ;
        String strU41;
        C0E55 player;
        C0E48 c0e48LJIIJ2;
        NLETrackSlot nLETrackSlotLLLLLLIL2;
        C0E48 c0e48LJIIJ3;
        NLETrack nLETrackLIZLLL;
        C0E55 player2;
        NLETrackSlot nLETrackSlotLLLLLLIL3;
        C0E55 player3;
        NLETrackSlot nLETrackSlotLLLLLLIL4;
        C0E48 c0e48LJIIJ4;
        C0E55 player4;
        VideoPublishEditModel videoPublishEditModelLJIILJJIL = LJIILJJIL();
        if (videoPublishEditModelLJIILJJIL == null) {
            return;
        }
        if (!c361980EHc.LJII && (Intrinsics.LJFF(c361980EHc.LJI, "bottom_item_root_caption") || Intrinsics.LJFF(c361980EHc.LJI, "bottom_item_text_captions"))) {
            LJIJ();
            return;
        }
        boolean z2 = true;
        if (c361980EHc.LJII) {
            String str2 = c361980EHc.LJI;
            ?? r14 = 0;
            String strLLIILZL = null;
            ?? size = 0;
            size = 0;
            switch (str2.hashCode()) {
                case -1256230777:
                    if (!str2.equals("bottom_item_text_captions")) {
                        return;
                    }
                    break;
                case 1028537663:
                    if (!str2.equals("bottom_item_captions_edit_split")) {
                        return;
                    }
                    C0E48 c0e48LJIIJ5 = LJIIJ();
                    if (c0e48LJIIJ5 != null) {
                        int i = C349360Dmo.LIZJ;
                        C350670Dov.LIZJ(c0e48LJIIJ5, EnumC356070Dxd.DONE, new InterfaceC349350Dmn() { // from class: X.0DnH
                            @Override // X.InterfaceC349350Dmn
                            public final void LIZ(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
                                if (C351220Dpo.LLLJIL(nLETrackSlot)) {
                                    long endTime = nLETrackSlot.getEndTime() - nLETrackSlot.getStartTime();
                                    long jLongValue = ((Number) C349660DnI.LIZ(nLETrackSlot).getFirst()).longValue();
                                    long j = 1;
                                    C349660DnI.LIZIZ(jLongValue, nLETrackSlot, (endTime * j) + jLongValue);
                                    long endTime2 = nLETrackSlot2.getEndTime() - nLETrackSlot2.getStartTime();
                                    long jLongValue2 = ((Number) C349660DnI.LIZ(nLETrackSlot2).getFirst()).longValue() + endTime;
                                    C349660DnI.LIZIZ(jLongValue2, nLETrackSlot2, ((long) ((int) (endTime2 * j))) + jLongValue2);
                                    C349680DnK.LIZ(nLETrackSlot);
                                    C349680DnK.LIZ(nLETrackSlot2);
                                }
                            }
                        }, null, null, true);
                    }
                    C0EJ3 c0ej3 = this.LLJILJILJ;
                    if (c0ej3 == null) {
                        return;
                    }
                    c0ej3.Rc();
                    return;
                case 1028669398:
                    if (!str2.equals("bottom_item_captions_edit_style")) {
                        return;
                    }
                    if (C305200Bxm.LIZ(videoPublishEditModelLJIILJJIL)) {
                        C0E48 c0e48LJIIJ6 = LJIIJ();
                        if (c0e48LJIIJ6 != null && (player4 = c0e48LJIIJ6.getPlayer()) != null) {
                            player4.pause(false);
                        }
                        LJIILLIIL();
                        if (C363470EMv.LJFF(this.LL) || (c0e48LJIIJ4 = LJIIJ()) == null) {
                            return;
                        }
                        C375820EoO.LIZ(this.LL, c0e48LJIIJ4, C364890ESh.class, new C362760EKc(this.LL, c0e48LJIIJ4, this.LLILLJJLI, new C361860EGq(((C0ES4) this.LLJJIII.getValue()).LIZ() - C0ES3.LIZ, 1), 48), 16);
                        C0LAB c0labLJJI = u4.LJJI(videoPublishEditModelLJIILJJIL, 1, 4);
                        c0labLJJI.LJ("enter_method", "click_caption_panel");
                        C20684815ws.LJIILLIIL("click_caption_template_entrance", c0labLJJI.LIZ);
                        return;
                    }
                    Boolean bool = Boolean.TRUE;
                    C0E48 c0e48LJIIJ7 = LJIIJ();
                    if (c0e48LJIIJ7 == null || (nLETrackSlotLLLLLLIL4 = c0e48LJIIJ7.LLLLLLIL()) == null || !C351220Dpo.LLLLIILLL(nLETrackSlotLLLLLLIL4)) {
                        z2 = false;
                    }
                    u4.LJJLIIIIJ(videoPublishEditModelLJIILJJIL, "click_caption_panel", 1, null, null, null, null, null, bool, Boolean.valueOf(z2), 248);
                    C0E48 c0e48LJIIJ8 = LJIIJ();
                    if (c0e48LJIIJ8 == null || (nLETrackSlotLLLLLLIL3 = c0e48LJIIJ8.LLLLLLIL()) == null) {
                        return;
                    }
                    C0E48 c0e48LJIIJ9 = LJIIJ();
                    if (c0e48LJIIJ9 != null && (player3 = c0e48LJIIJ9.getPlayer()) != null) {
                        player3.pause(false);
                    }
                    C0EJ3 c0ej32 = this.LLJILJILJ;
                    if (c0ej32 == null) {
                        return;
                    }
                    c0ej32.Y61(nLETrackSlotLLLLLLIL3);
                    return;
                case 1380296742:
                    if (!str2.equals("bottom_item_captions_edit_delete") || (c0e48LJIIJ2 = LJIIJ()) == null || (nLETrackSlotLLLLLLIL2 = c0e48LJIIJ2.LLLLLLIL()) == null || (c0e48LJIIJ3 = LJIIJ()) == null || (nLETrackLIZLLL = C349550Dn7.LIZLLL(C350870DpF.LJI(c0e48LJIIJ3), nLETrackSlotLLLLLLIL2.getUUID())) == null) {
                        return;
                    }
                    C0E48 c0e48LJIIJ10 = LJIIJ();
                    if (c0e48LJIIJ10 != null && (player2 = c0e48LJIIJ10.getPlayer()) != null) {
                        player2.pause(false);
                    }
                    nLETrackLIZLLL.removeSlot(nLETrackSlotLLLLLLIL2);
                    C0E1X c0e1x = new C0E1X(C0E1V.DELETE_CAPTION.getNameId(), null, null, null, null, 30);
                    C0E48 c0e48LJIIJ11 = LJIIJ();
                    if (c0e48LJIIJ11 != null) {
                        C350870DpF.LIZJ(c0e48LJIIJ11, C051R.LIZIZ(c0e1x));
                    }
                    InterfaceC359940E9g interfaceC359940E9gLJIILIIL = LJIILIIL();
                    if (interfaceC359940E9gLJIILIIL != null) {
                        interfaceC359940E9gLJIILIIL.LJFF();
                    }
                    C0EJ3 c0ej33 = this.LLJILJILJ;
                    if (c0ej33 == null) {
                        return;
                    }
                    c0ej33.Rc();
                    return;
                case 1781144319:
                    if (!str2.equals("bottom_item_captions_edit_remove")) {
                        return;
                    }
                    C0E48 c0e48LJIIJ12 = LJIIJ();
                    if (c0e48LJIIJ12 != null && (player = c0e48LJIIJ12.getPlayer()) != null) {
                        player.pause(false);
                    }
                    LJIILLIIL();
                    C19A3 c19a3 = this.LL;
                    if ((c19a3 == null || c19a3.findSceneByTag(C364510EQv.class.getSimpleName()) == null) && (c0e48LJIIJ = LJIIJ()) != null) {
                        NLEModel nLEModelLJI = C350870DpF.LJI(c0e48LJIIJ);
                        String strLIZLLL = C0EJ1.LIZLLL(videoPublishEditModelLJIILJJIL, nLEModelLJI);
                        if (strLIZLLL == null) {
                            strLIZLLL = C0EJ1.LJ(nLEModelLJI);
                        }
                        if (!C0EJ1.LJI(strLIZLLL)) {
                            Activity activityLJIIIZ = LJIIIZ();
                            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                            creativeToastBuilder.message(LJIIIZ().getString(2131833332));
                            C1390380mHk.LIZ(activityLJIIIZ, 3027, creativeToastBuilder);
                            return;
                        }
                        String strLIZJ = C0EJ1.LIZJ(nLEModelLJI);
                        C0EJ3 c0ej34 = this.LLJILJILJ;
                        if (c0ej34 != null) {
                            strU41 = c0ej34.U41();
                        } else {
                            strU41 = null;
                        }
                        if (!Intrinsics.LJFF(strLIZJ, strU41)) {
                            C0EJ3 c0ej35 = this.LLJILJILJ;
                            if (c0ej35 != null) {
                                strLLIILZL = c0ej35.LLIILZL();
                            }
                            if (C123100dR.LIZ(strLLIILZL)) {
                                if (!C0XF1.LIZLLL(C0CHQ.LIZ)) {
                                    Activity activityLJIIIZ2 = LJIIIZ();
                                    CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                                    creativeToastBuilder2.messageRes(2131826911);
                                    creativeToastBuilder2.isTuxToastLegacy(true);
                                    C1390380mHk.LIZ(activityLJIIIZ2, 6001, creativeToastBuilder2);
                                    return;
                                }
                                if (LJIJ()) {
                                    return;
                                }
                                C1361400lX0 c1361400lX0 = new C1361400lX0(LJIIIZ(), R.style.y0);
                                if (C0DHG.LIZ() && C1388190mED.LIZ(c1361400lX0) != null) {
                                    C632670Orh.LIZIZ(c1361400lX0, new C19719212De(-1871206911, new C439740HMe(this, strLIZLLL), true));
                                    return;
                                }
                                C1397580mTM c1397580mTM = new C1397580mTM(c1361400lX0);
                                c1397580mTM.LJFF(2131833330);
                                c1397580mTM.LIZ(2131833327);
                                C985403tE.LIZ(c1397580mTM, new AwS119S1100000_5(this, strLIZLLL, 13));
                                new C1397510mTF(c1397580mTM).LIZLLL();
                                return;
                            }
                            LJIJI(strLIZLLL, false);
                            return;
                        }
                        LJIJI(strLIZLLL, true);
                        return;
                    }
                    return;
                case 1927214113:
                    if (!str2.equals("bottom_item_root_caption")) {
                        return;
                    }
                    break;
                case 1990932668:
                    if (!str2.equals("bottom_item_captions_edit_bulk_edit")) {
                        return;
                    }
                    C0E48 c0e48LJIIJ13 = LJIIJ();
                    if (c0e48LJIIJ13 != null) {
                        nLETrackSlotLLLLLLIL = c0e48LJIIJ13.LLLLLLIL();
                    } else {
                        nLETrackSlotLLLLLLIL = null;
                    }
                    if (!C1416310mxZ.LJIILIIL(videoPublishEditModelLJIILJJIL) && (iPreviewServiceLIZ = C357280Dza.LIZ()) != null && (previewPanelApi = iPreviewServiceLIZ.getPreviewPanelApi()) != null) {
                        previewPanelApi.LR1(false);
                    }
                    C0EJ3 c0ej36 = this.LLJILJILJ;
                    if (c0ej36 == null || (c364440EQoLLLZIL = c0ej36.LLLZIL()) == null) {
                        return;
                    }
                    LJIIL(new InlineCaptionFragment(c364440EQoLLLZIL, "bulk_editing", this.LLJJ, nLETrackSlotLLLLLLIL, this.LLJILJILJ, r14, r14, size, 224));
                    if (this.LLJJ) {
                        this.LLJJ = false;
                    }
                    InlineCaptionModel inlineCaptionModel = videoPublishEditModelLJIILJJIL.creativeModel.inlineCaptionModel;
                    if (inlineCaptionModel != null) {
                        r14 = inlineCaptionModel.selectLanguageCode;
                    }
                    C0EJ3 c0ej37 = this.LLJILJILJ;
                    if (c0ej37 != null && (listSb2 = c0ej37.Sb()) != null && !listSb2.isEmpty()) {
                        Iterator<TextStickerModel> it2 = listSb2.iterator();
                        while (it2.hasNext()) {
                            if (C0F8Y.LJIIIIZZ(it2.next())) {
                                z = true;
                            }
                        }
                        z = false;
                    } else {
                        z = false;
                    }
                    C1402610mbT.LJJIIJZLJL(videoPublishEditModelLJIILJJIL, "menu", 1, r14, "bulk_editing_button", z, 16);
                    C0EJ3 c0ej38 = this.LLJILJILJ;
                    if (c0ej38 != null && (listSb = c0ej38.Sb()) != null) {
                        ArrayList arrayList = new ArrayList();
                        for (TextStickerModel textStickerModel : listSb) {
                            if (C0F8Y.LJIIIIZZ(textStickerModel)) {
                                arrayList.add(textStickerModel);
                            }
                        }
                        size = arrayList.size();
                    }
                    if (!C1416310mxZ.LJIILIIL(videoPublishEditModelLJIILJJIL)) {
                        return;
                    }
                    InlineCaptionModel inlineCaptionModel2 = videoPublishEditModelLJIILJJIL.creativeModel.inlineCaptionModel;
                    if (inlineCaptionModel2 == null || (str = inlineCaptionModel2.selectLanguageCode) == null) {
                        str = "";
                    }
                    ?? LJJ = u4.LJJ(1, videoPublishEditModelLJIILJJIL, str);
                    LJJ.LIZ(size, "caption_cnt");
                    C20684815ws.LJIILLIIL("click_edit_captions", LJJ.LIZ);
                    return;
                default:
                    return;
            }
            LJIIZILJ(false, null, null, false);
            return;
        }
        String str3 = c361980EHc.LJI;
        if (!Intrinsics.LJFF(str3, "bottom_item_root_caption") && !Intrinsics.LJFF(str3, "bottom_item_text_captions")) {
            return;
        }
        Activity activityLJIIIZ3 = LJIIIZ();
        CreativeToastBuilder creativeToastBuilder3 = new CreativeToastBuilder();
        creativeToastBuilder3.messageRes(2131830665);
        creativeToastBuilder3.isTuxToastLegacy(true);
        C1390380mHk.LIZ(activityLJIIIZ3, 1050, creativeToastBuilder3);
    }

    public final void LJIIZILJ(boolean z, Effect effect, Effect effect2, boolean z2) {
        C364440EQo c364440EQoLLLZIL;
        C0E48 c0e48LJIIJ;
        boolean z3;
        boolean z4;
        InlineCaptionFragment inlineCaptionFragment;
        String str;
        boolean z5;
        List<TextStickerModel> listSb;
        ArrayList<TextStickerData> arrayListIP;
        String str2;
        boolean z6;
        List<TextStickerModel> listSb2;
        boolean z7;
        ArrayList<TextStickerData> arrayListIP2;
        C0E48 c0e48LJIIJ2;
        C0E5S c0e5s;
        if (!z2 && (c0e48LJIIJ2 = LJIIJ()) != null && c0e48LJIIJ2.LLLLLLIL() != null && (c0e5s = this.LLJILLL) != null) {
            c0e5s.w6(null, false, false);
        }
        if (!C0XF1.LIZLLL(C0CHQ.LIZ)) {
            Activity activityLJIIIZ = LJIIIZ();
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131826911);
            creativeToastBuilder.isTuxToastLegacy(true);
            C1390380mHk.LIZ(activityLJIIIZ, 6001, creativeToastBuilder);
            return;
        }
        C0EJ3 c0ej3 = this.LLJILJILJ;
        if (c0ej3 != null && (c364440EQoLLLZIL = c0ej3.LLLZIL()) != null && (c0e48LJIIJ = LJIIJ()) != null) {
            NLEModel nLEModelLJI = C350870DpF.LJI(c0e48LJIIJ);
            VideoPublishEditModel videoPublishEditModelLJIILJJIL = LJIILJJIL();
            if (videoPublishEditModelLJIILJJIL == null) {
                return;
            }
            if (C349560Dn8.LJFF(nLEModelLJI) && C363740ENw.LJIIJJI(nLEModelLJI) && !C366800EZq.LIZ(videoPublishEditModelLJIILJJIL, nLEModelLJI)) {
                z3 = true;
            } else {
                z3 = false;
            }
            String strLIZJ = C0EJ1.LIZJ(nLEModelLJI);
            String strLLIILZL = this.LLJILJILJ.LLIILZL();
            if (strLLIILZL == null || !(!a0.LJJJIL(strLLIILZL))) {
                strLLIILZL = C0EJ1.LIZJ(nLEModelLJI);
            }
            if ((Intrinsics.LJFF(strLIZJ, strLLIILZL) || z3) && C289250BVj.LIZ(videoPublishEditModelLJIILJJIL)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z2) {
                String str3 = "caption";
                boolean z8 = this.LLJJ;
                NLETrackSlot nLETrackSlot = null;
                C0EJ3 c0ej32 = this.LLJILJILJ;
                if (z4 && c0ej32 != null && (arrayListIP2 = c0ej32.IP()) != null && !arrayListIP2.isEmpty()) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                inlineCaptionFragment = inlineCaptionFragment;
                InlineCaptionFragment inlineCaptionFragment2 = new InlineCaptionFragment(c364440EQoLLLZIL, str3, z8, nLETrackSlot, c0ej32, effect, effect2, z7, 8);
                C362580EJk.LIZIZ(this.LLILZ, inlineCaptionFragment);
            } else {
                inlineCaptionFragment = new InlineCaptionFragment(c364440EQoLLLZIL, "caption", this.LLJJ, null, this.LLJILJILJ, effect, effect2, z4, 8);
            }
            if (this.LLJJ) {
                this.LLJJ = false;
            }
            if (C301720BsA.LIZ(videoPublishEditModelLJIILJJIL)) {
                str = "editorpro_panel";
            } else if (z) {
                str = "text_sub_button";
            } else {
                str = "text_track_option";
            }
            C0EJ3 c0ej33 = this.LLJILJILJ;
            if (c0ej33 != null && (arrayListIP = c0ej33.IP()) != null && !arrayListIP.isEmpty() && effect == null && effect2 == null && !z4) {
                InlineCaptionModel inlineCaptionModel = videoPublishEditModelLJIILJJIL.creativeModel.inlineCaptionModel;
                if (inlineCaptionModel != null) {
                    str2 = inlineCaptionModel.selectLanguageCode;
                } else {
                    str2 = null;
                }
                C0EJ3 c0ej34 = this.LLJILJILJ;
                if (c0ej34 != null && (listSb2 = c0ej34.Sb()) != null && !listSb2.isEmpty()) {
                    Iterator<TextStickerModel> it2 = listSb2.iterator();
                    while (it2.hasNext()) {
                        if (C0F8Y.LJIIIIZZ(it2.next())) {
                            z6 = true;
                            break;
                        }
                    }
                    z6 = false;
                } else {
                    z6 = false;
                }
                C1402610mbT.LJJIIJZLJL(videoPublishEditModelLJIILJJIL, "main_reclick", 1, str2, str, z6, 16);
                C1397580mTM c1397580mTM = new C1397580mTM(new C1361400lX0(LJIIIZ(), R.style.y0));
                c1397580mTM.LJFF(2131828406);
                c1397580mTM.LIZ(2131828404);
                C985403tE.LIZ(c1397580mTM, new AwS103S0400000_5(nLEModelLJI, videoPublishEditModelLJIILJJIL, this, inlineCaptionFragment, 15));
                new C1397510mTF(c1397580mTM).LIZLLL();
                return;
            }
            LJIIL(inlineCaptionFragment);
            C0EJ3 c0ej35 = this.LLJILJILJ;
            if (c0ej35 != null && (listSb = c0ej35.Sb()) != null && !listSb.isEmpty()) {
                Iterator<TextStickerModel> it3 = listSb.iterator();
                while (it3.hasNext()) {
                    if (C0F8Y.LJIIIIZZ(it3.next())) {
                        z5 = true;
                        break;
                    }
                }
                z5 = false;
            } else {
                z5 = false;
            }
            C1402610mbT.LJJIIJZLJL(videoPublishEditModelLJIILJJIL, "main_first", 1, "", str, z5, 16);
        }
    }

    public C361850EGp(C19A3 c19a3, C1DRG c1drg, C0EGH c0egh, C0EJ3 c0ej3, C0E5S c0e5s) {
        super(c19a3, c1drg, R.id.gcw);
        this.LLJILJIL = c0egh;
        this.LLJILJILJ = c0ej3;
        this.LLJILLL = c0e5s;
        this.LLJJ = true;
        this.LLJJI = C1697810uHb.LJIILJJIL("bottom_item_root_caption", "bottom_item_text_captions", "bottom_item_captions_edit_bulk_edit", "bottom_item_captions_edit_split", "bottom_item_captions_edit_delete", "bottom_item_captions_edit_style", "bottom_item_captions_edit_remove");
        this.LLJJIII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1676));
    }
}
