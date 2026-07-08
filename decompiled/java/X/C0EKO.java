package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMobModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EKO, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EKO {
    public static final C0EKO LIZ = new C0EKO();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(323));

    public static void LIZJ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList<NLETrack> arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (C351220Dpo.LLLJL(nLETrack)) {
                arrayList.add(nLETrack);
            }
        }
        for (NLETrack nLETrack2 : arrayList) {
            if (nLETrack2.getSlots().size() > 1) {
                NLETrackSlot nLETrackSlot = null;
                for (NLETrackSlot nLETrackSlot2 : nLETrack2.getSortedSlots()) {
                    if (nLETrackSlot != null && nLETrackSlot2.getStartTime() < nLETrackSlot.getEndTime()) {
                        NLETrack nLETrackLJII = C385050F7v.LJII(nLEModel, nLETrackSlot2, true);
                        if (nLETrackLJII == null) {
                            nLETrackLJII = new NLETrack();
                            List<NLETrack> listLJLLI = C351220Dpo.LJLLI(nLEModel);
                            if (nLETrackLJII.getLayer() == 0) {
                                ArrayList arrayList2 = (ArrayList) listLJLLI;
                                int iIntValue = 0;
                                if (!arrayList2.isEmpty()) {
                                    Iterator it2 = arrayList2.iterator();
                                    int i = 0;
                                    while (it2.hasNext()) {
                                        if (((NLETimeSpaceNode) it2.next()).getLayer() == 0 && (i = i + 1) < 0) {
                                            C1697810uHb.LJIJ();
                                            throw null;
                                        }
                                    }
                                    if (i >= 1) {
                                        Iterator it3 = arrayList2.iterator();
                                        if (it3.hasNext()) {
                                            Integer numValueOf = Integer.valueOf(((NLETimeSpaceNode) it3.next()).getLayer());
                                            while (it3.hasNext()) {
                                                Integer numValueOf2 = Integer.valueOf(((NLETimeSpaceNode) it3.next()).getLayer());
                                                if (numValueOf.compareTo(numValueOf2) < 0) {
                                                    numValueOf = numValueOf2;
                                                }
                                            }
                                            if (numValueOf != null) {
                                                iIntValue = numValueOf.intValue();
                                            }
                                        }
                                        nLETrackLJII.setLayer(iIntValue + 1);
                                    }
                                }
                            }
                            nLEModel.addTrack(nLETrackLJII);
                        }
                        nLETrackLJII.addSlot(nLETrackSlot2);
                        C351220Dpo.LLLLJI(nLETrackLJII);
                        nLETrackLJII.setExtra("track_type", "sticker");
                        nLETrackLJII.setExtra("StickerTrackType", "TEXT");
                        nLETrackLJII.setExtraTrackType(NLETrackType.STICKER);
                        nLETrack2.removeSlot(nLETrackSlot2);
                    } else {
                        nLETrackSlot = nLETrackSlot2;
                    }
                }
            }
        }
    }

    public static void LIZ(NLETrackSlot nLETrackSlot, TextStickerModel textStickerModel) {
        String str;
        TextMobModel mobModel = textStickerModel.getMobModel();
        if (!Intrinsics.LJFF(mobModel.adjustTextStyleInEditorPro, "1")) {
            if (textStickerModel.getTextStyle() != null) {
                mobModel.adjustTextStyleInEditorPro = "1";
            } else if (!Intrinsics.LJFF(C351220Dpo.LJLJL(nLETrackSlot, "bg_mode", null), String.valueOf(textStickerModel.getMode())) && ((textStickerModel.getCaptionModel() != null && textStickerModel.getMode() != 4) || (textStickerModel.getCaptionModel() == null && textStickerModel.getMode() != 1))) {
                mobModel.adjustTextStyleInEditorPro = "1";
            }
        }
        if (!Intrinsics.LJFF(mobModel.adjustTextParagraph, "1") && !Intrinsics.LJFF(C351220Dpo.LJLJL(nLETrackSlot, "align", null), String.valueOf(textStickerModel.getAlign())) && textStickerModel.getAlign() != 2) {
            mobModel.adjustTextParagraph = "1";
        }
        if (!Intrinsics.LJFF(mobModel.adjustTextColorInEditorPro, "1") && !Intrinsics.LJFF(C351220Dpo.LJLJL(nLETrackSlot, "color", null), String.valueOf(textStickerModel.getColor())) && textStickerModel.getColor() != -1) {
            if (textStickerModel.getColor() != -1) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            mobModel.adjustTextColorInEditorPro = str;
        }
        if (!Intrinsics.LJFF(mobModel.adjustTextFontInEditorPro, "1") && !Intrinsics.LJFF(C351220Dpo.LJLJL(nLETrackSlot, "font_type", null), textStickerModel.getFontModel().fileName)) {
            String str2 = textStickerModel.getFontModel().fileName;
            if (str2.length() == 0) {
                str2 = "Proxima-Nova-Semibold.otf";
            }
            if (!Intrinsics.LJFF(str2, LIZIZ.getValue())) {
                mobModel.adjustTextFontInEditorPro = "1";
            }
        }
    }

    public static void LIZIZ(NLETrackSlot nLETrackSlot, TextStickerModel textStickerModel) {
        TextMobModel mobModel = textStickerModel.getMobModel();
        nLETrackSlot.setExtra("is_editorpro_adjust_text_color", mobModel.adjustTextColorInEditorPro);
        nLETrackSlot.setExtra("is_editorpro_adjust_text_font", mobModel.adjustTextFontInEditorPro);
        nLETrackSlot.setExtra("is_editorpro_adjust_text_paragraph", mobModel.adjustTextParagraph);
        nLETrackSlot.setExtra("is_editorpro_adjust_text_style", mobModel.adjustTextStyleInEditorPro);
        nLETrackSlot.setExtra("is_editorpro_adjust_text_position", mobModel.adjustTextPositionInEditorPro);
    }
}
