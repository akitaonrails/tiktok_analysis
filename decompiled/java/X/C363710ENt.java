package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ENt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C363710ENt {
    public final C0E48 LIZ;
    public final Context LIZIZ;

    public C363710ENt(C0E48 c0e48, Context context) {
        this.LIZ = c0e48;
        this.LIZIZ = context;
    }

    public static void LIZJ(NLETrackSlot nLETrackSlot, TextStickerData textStickerData) {
        nLETrackSlot.setExtra("text_sticker_data", C0EJ1.LIZIZ(textStickerData));
        nLETrackSlot.setExtra("text", textStickerData.getTextStr());
        nLETrackSlot.setExtra("text_wrap_list", C363430EMr.LJ(textStickerData.getTextWrapList()));
        nLETrackSlot.setExtra("clip_start", String.valueOf(textStickerData.getClipStart()));
        nLETrackSlot.setExtra("clip_end", String.valueOf(textStickerData.getClipEnd()));
    }

    public final void LIZ(String str, String str2, TextStickerData textStickerData) {
        NLETrackSlot nLETrackSlotLIZIZ;
        String uuid;
        C0E48 c0e48;
        NLETrackSlot next;
        NLETrackSlot nLETrackSlotLIZIZ2;
        long endTime;
        String extra;
        if (this.LIZIZ == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionTrackSlotHelper -> mergeCaptionSlot-> firstUuid = ");
        sbLIZ.append(str);
        sbLIZ.append(", secondUuid = ");
        sbLIZ.append(str2);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (str.length() != 0 && str2.length() != 0) {
            C0E48 c0e482 = this.LIZ;
            if (c0e482 != null) {
                nLETrackSlotLIZIZ = C349550Dn7.LIZIZ(C350870DpF.LJI(c0e482), str2);
            } else {
                nLETrackSlotLIZIZ = null;
            }
            C201955140j.LIZ("CaptionTrackSlotHelper -> secondSlot");
            C0E48 c0e483 = this.LIZ;
            if (c0e483 != null && (nLETrackSlotLIZIZ2 = C349550Dn7.LIZIZ(C350870DpF.LJI(c0e483), str)) != null) {
                if (nLETrackSlotLIZIZ != null) {
                    endTime = nLETrackSlotLIZIZ.getEndTime();
                } else {
                    endTime = nLETrackSlotLIZIZ2.getEndTime();
                }
                nLETrackSlotLIZIZ2.setEndTime(endTime);
                TextStickerData textStickerDataLIZ = C0EJ1.LIZ(nLETrackSlotLIZIZ2.getExtra("text_sticker_data"));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(textStickerDataLIZ.getTextStr());
                if (nLETrackSlotLIZIZ == null || (extra = nLETrackSlotLIZIZ.getExtra("text_sticker_data")) == null) {
                    extra = "";
                }
                sbLIZ2.append(C0EJ1.LIZ(extra).getTextStr());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                textStickerDataLIZ.setEndTime(((int) nLETrackSlotLIZIZ2.getEndTime()) / LSPassThroughRecordSizeConfig.DEFAULT);
                textStickerDataLIZ.setWords(textStickerData.getWords());
                textStickerDataLIZ.setCacheWords(textStickerData.getCacheWords());
                textStickerDataLIZ.setClipStart(textStickerData.getClipStart());
                textStickerDataLIZ.setClipEnd(textStickerData.getClipEnd());
                C363730ENv.LJIIIZ(textStickerDataLIZ, strLIZIZ, this.LIZIZ);
                nLETrackSlotLIZIZ2.setExtra("text_sticker_data", C0EJ1.LIZIZ(textStickerDataLIZ));
                nLETrackSlotLIZIZ2.setExtra("text_wrap_list", C363430EMr.LJ(textStickerDataLIZ.getTextWrapList()));
                nLETrackSlotLIZIZ2.setExtra("text", textStickerDataLIZ.getTextStr());
            }
            if (nLETrackSlotLIZIZ != null && (uuid = nLETrackSlotLIZIZ.getUUID()) != null && (c0e48 = this.LIZ) != null) {
                for (NLETrack nLETrack : (ArrayList) C351220Dpo.LJLLI(C350870DpF.LJI(c0e48))) {
                    VecNLETrackSlotSPtr slots = nLETrack.getSlots();
                    if (slots != null) {
                        Iterator<NLETrackSlot> it2 = slots.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (Intrinsics.LJFF(next.getUUID(), uuid)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        NLETrackSlot nLETrackSlot = next;
                        if (nLETrackSlot != null) {
                            nLETrack.removeSlot(nLETrackSlot);
                        }
                    }
                }
            }
        }
    }

    public final void LIZIZ(String str, TextStickerData textStickerData, TextStickerData textStickerData2) {
        NLETrackSlot nLETrackSlotLIZIZ;
        NLETrack nLETrackLIZLLL;
        C0E55 player;
        if (this.LIZIZ == null) {
            return;
        }
        C0E48 c0e48 = this.LIZ;
        if (c0e48 != null && (player = c0e48.getPlayer()) != null) {
            player.pause(false);
        }
        C0E48 c0e482 = this.LIZ;
        if (c0e482 != null && (nLETrackSlotLIZIZ = C349550Dn7.LIZIZ(C350870DpF.LJI(c0e482), str)) != null) {
            nLETrackSlotLIZIZ.setEndTime(((long) textStickerData.getEndTime()) * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            TextStickerData textStickerDataLIZ = C0EJ1.LIZ(nLETrackSlotLIZIZ.getExtra("text_sticker_data"));
            String textStr = textStickerData.getTextStr();
            if (textStr == null) {
                textStr = "";
            }
            C363730ENv.LJIIIZ(textStickerDataLIZ, textStr, this.LIZIZ);
            textStickerDataLIZ.setEndTime(textStickerData.getEndTime());
            textStickerDataLIZ.setWords(textStickerData.getWords());
            textStickerDataLIZ.setClipStart(textStickerData.getClipStart());
            textStickerDataLIZ.setClipEnd(textStickerData.getClipEnd());
            LIZJ(nLETrackSlotLIZIZ, textStickerDataLIZ);
            NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlotLIZIZ.deepClone(true));
            if (nLETrackSlotDynamicCast != null) {
                nLETrackSlotDynamicCast.setStartTime(((long) textStickerData2.getStartTime()) * 1000);
                nLETrackSlotDynamicCast.setEndTime(((long) textStickerData2.getEndTime()) * 1000);
                textStickerData2.setNleUuid(nLETrackSlotDynamicCast.getUUID());
                textStickerData2.setPlaceholderSlotId(nLETrackSlotDynamicCast.getUUID());
                LIZJ(nLETrackSlotDynamicCast, textStickerData2);
                C0E48 c0e483 = this.LIZ;
                if (c0e483 != null && (nLETrackLIZLLL = C349550Dn7.LIZLLL(C350870DpF.LJI(c0e483), str)) != null) {
                    nLETrackLIZLLL.addSlot(nLETrackSlotDynamicCast);
                }
            }
        }
    }
}
