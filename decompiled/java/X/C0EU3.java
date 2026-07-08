package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EU3, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EU3 {
    public static final C0EU3 LIZ = new C0EU3();

    public static void LIZ(C0E48 c0e48, String str) {
        if (!C0E5N.LIZ()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start frequency info collect: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C860330Xp1 c860330Xp1 = C860340Xp2.LIZ;
        new Pair(-1, -1);
        C860470XpF.LJIIIIZZ(c860330Xp1, str, 2000L, C361680EFy.LJII(null, c0e48).LIZ, null, 8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C0E48 r3, java.lang.String r4) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EU3.LIZIZ(X.0E48, java.lang.String):void");
    }

    public static void LIZJ(NLETrack nLETrack, NLETrackSlot nLETrackSlot, C0E48 c0e48) {
        int i;
        String strLIZIZ;
        String str;
        if (C0E5N.LIZ() && nLETrack != null && nLETrackSlot != null) {
            NLETrackType trackType = nLETrack.getTrackType();
            if (trackType == null) {
                i = -1;
            } else {
                i = C347300DjU.LIZ[trackType.ordinal()];
            }
            String str2 = "";
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        strLIZIZ = "STICKER";
                    } else if (i != 4) {
                        strLIZIZ = "";
                    } else {
                        if (nLETrack.getMainTrack()) {
                            strLIZIZ = "VIDEO&main";
                        } else {
                            strLIZIZ = "VIDEO&pip";
                        }
                        if (C351220Dpo.LLJJIJIL(nLETrackSlot)) {
                            if (nLETrack.getMainTrack()) {
                                strLIZIZ = "IMAGE&main";
                            } else {
                                strLIZIZ = "IMAGE&pip";
                            }
                        }
                    }
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("FILTER&");
                    sbLIZ.append(nLETrack.getExtra("FilterTrackType"));
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("AUDIO&");
                sbLIZ2.append(nLETrack.getExtra("AudioTrackType"));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            if (C351220Dpo.LLIILII(nLETrack)) {
                strLIZIZ = "FILTER&ADJUST";
            }
            if (C351220Dpo.LLJJIII(nLETrack)) {
                strLIZIZ = "EFFECT&NORMAL";
            }
            if (C351220Dpo.LLLLILI(nLETrack)) {
                strLIZIZ = "EFFECT&VIDEO_ANIM";
            }
            if (C351220Dpo.LLLJL(nLETrack)) {
                if (!C349550Dn7.LJFF(nLETrackSlot) && !Intrinsics.LJFF(nLETrackSlot.getExtra("text_slot_type"), "AI_CAPTION")) {
                    strLIZIZ = "TEXT&NORMAL";
                } else {
                    strLIZIZ = "TEXT&CAPTION";
                }
            }
            switch (strLIZIZ.hashCode()) {
                case -1456521750:
                    if (strLIZIZ.equals("EFFECT&VIDEO_ANIM")) {
                        str2 = "effect_video_anim";
                    }
                    break;
                case -1320607880:
                    if (strLIZIZ.equals("AUDIO&BGM")) {
                        str2 = "audio_bgm";
                    }
                    break;
                case -1172269795:
                    if (strLIZIZ.equals("STICKER")) {
                        str2 = "sticker";
                    }
                    break;
                case -1155078300:
                    if (strLIZIZ.equals("VIDEO&main")) {
                        str2 = "video_main";
                    }
                    break;
                case -1006155247:
                    if (strLIZIZ.equals("AUDIO&SOUND_EFFECT")) {
                        str2 = "audio_effect";
                    }
                    break;
                case -980001148:
                    if (strLIZIZ.equals("IMAGE&main")) {
                        str2 = "image_main";
                    }
                    break;
                case -328633373:
                    str = "AUDIO&EDITOR_MUSIC";
                    strLIZIZ.equals(str);
                    break;
                case -239213268:
                    str = "AUDIO&ORIGIN_VOICE_CONVERSION";
                    strLIZIZ.equals(str);
                    break;
                case -232151979:
                    if (strLIZIZ.equals("FILTER&COLOR")) {
                        str2 = "filter_color";
                    }
                    break;
                case -175804788:
                    if (strLIZIZ.equals("VIDEO&pip")) {
                        str2 = "video_pip";
                    }
                    break;
                case -20345075:
                    if (strLIZIZ.equals("TEXT&CAPTION")) {
                        str2 = "text_caption";
                    }
                    break;
                case 53367382:
                    if (strLIZIZ.equals("AUDIO&ORIGIN")) {
                        str2 = "audio_origin";
                    }
                    break;
                case 604340928:
                    if (strLIZIZ.equals("TEXT&NORMAL")) {
                        str2 = "text_normal";
                    }
                    break;
                case 628870186:
                    if (strLIZIZ.equals("AUDIO&AUDIO_RECORD")) {
                        str2 = "audio_record";
                    }
                    break;
                case 969578972:
                    if (strLIZIZ.equals("EFFECT&NORMAL")) {
                        str2 = "effect_normal";
                    }
                    break;
                case 1325752509:
                    if (strLIZIZ.equals("FILTER&ADJUST")) {
                        str2 = "filter_adjust";
                    }
                    break;
                case 1849682256:
                    if (strLIZIZ.equals("AUDIO&TEXT_SPEAK")) {
                        str2 = "audio_tts";
                    }
                    break;
                case 1908052844:
                    if (strLIZIZ.equals("IMAGE&pip")) {
                        str2 = "image_pip";
                    }
                    break;
            }
            if (str2.length() == 0) {
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("ep_main_track_select_");
            sbLIZ3.append(str2);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
            C860330Xp1 c860330Xp1 = C860340Xp2.LIZ;
            new Pair(-1, -1);
            C860470XpF.LJIIIIZZ(c860330Xp1, strLIZIZ2, 500L, C361680EFy.LJII(null, c0e48).LIZ, null, 8);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("collect track select: ");
            sbLIZ4.append(strLIZIZ2);
            C2188811AlT.LIZIZ(sbLIZ4);
        }
    }
}
