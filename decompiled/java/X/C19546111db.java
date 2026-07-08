package X;

import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter;

/* JADX INFO: renamed from: X.11db, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19546111db {
    public static final C19546111db LIZ = new C19546111db();
    public static final String LIZIZ = "origin_vc_stream_";
    public static final String LIZJ = "origin_vc_dub_stream_";

    public static Effect LJFF() {
        Keva keva = SpeakerCenter.LIZ;
        if (keva.getString("effectPath", "").length() <= 0 || keva.getString("uploadId", "").length() <= 0) {
            return null;
        }
        Effect effect = new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0L, null, null, 0L, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0L, null, null, null, 0L, 0L, null, null, null, null, null, false, false, -1, -1, 15, null);
        effect.setUnzipPath(keva.getString("effectPath", ""));
        effect.setEffectId(keva.getString("uploadId", ""));
        return effect;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(com.bytedance.ies.nle.editor_jni.NLEModel r3) {
        /*
            r2 = 1
            if (r3 == 0) goto L39
            com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr r0 = r3.getTracks()
            if (r0 == 0) goto L20
            java.util.Iterator r1 = r0.iterator()
        Ld:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r1.next()
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = (com.bytedance.ies.nle.editor_jni.NLETrack) r0
            boolean r0 = X.C351220Dpo.LLLII(r0)
            if (r0 == 0) goto Ld
            return r2
        L20:
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = r3.getMainTrack()
            if (r0 == 0) goto L39
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r0 = r0.getSlots()
            if (r0 == 0) goto L39
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r0
            if (r0 == 0) goto L39
            com.bytedance.ies.nle.editor_jni.NLESegment r0 = r0.getMainSegment()
            goto L3a
        L39:
            r0 = 0
        L3a:
            com.bytedance.ies.nle.editor_jni.NLESegmentAudio r0 = com.bytedance.ies.nle.editor_jni.NLESegmentAudio.dynamicCast(r0)
            r1 = 0
            if (r0 != 0) goto L42
            return r1
        L42:
            com.bytedance.ies.nle.editor_jni.NLEResourceNode r0 = r0.getResource()
            if (r0 == 0) goto L56
            java.lang.String r0 = r0.getResourceFile()
            if (r0 == 0) goto L56
            int r0 = X.C2486109oh.LIZ(r0)
            if (r0 == 0) goto L55
            r2 = 0
        L55:
            return r2
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19546111db.LIZ(com.bytedance.ies.nle.editor_jni.NLEModel):boolean");
    }

    public static String LIZLLL(String str) {
        if (!C2286708xd.LIZJ(str)) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(C08F1.LIZIZ(str));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static long LJI(C19536311c1 c19536311c1) {
        NLESegment mainSegment;
        VecNLETrackSPtr tracks;
        NLETrack nLETrack;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        NLEModel nLEModel = c19536311c1.LIZIZ;
        NLESegment mainSegment2 = null;
        if (nLEModel != null && (tracks = nLEModel.getTracks()) != null && (nLETrack = (NLETrack) C13LP.LJJJLL(tracks)) != null && (slots = nLETrack.getSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(slots)) != null) {
            mainSegment = nLETrackSlot.getMainSegment();
        } else {
            mainSegment = null;
        }
        NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(mainSegment);
        if (LJIIIZ(c19536311c1)) {
            NLETrackSlot nLETrackSlot2 = c19536311c1.LIZ;
            if (nLETrackSlot2 != null) {
                mainSegment2 = nLETrackSlot2.getMainSegment();
            }
            nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(mainSegment2);
        }
        if (nLESegmentAudioDynamicCast != null) {
            return nLESegmentAudioDynamicCast.getDuration() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        }
        return 0L;
    }

    public static boolean LJII(Effect effect) {
        if (!LJIIJ(effect) && !LJIIIIZZ(effect)) {
            return false;
        }
        return true;
    }

    public static boolean LJIIIIZZ(Effect effect) {
        String strLJIIIIZZ;
        InterfaceC19549111e5 interfaceC19549111e5LIZ = C19548411dy.LIZ();
        if (effect != null) {
            strLJIIIIZZ = C1664460tPo.LJIIIIZZ(effect);
        } else {
            strLJIIIIZZ = null;
        }
        return ((C19547411do) interfaceC19549111e5LIZ).LJIIJJI(strLJIIIIZZ, true);
    }

    public static boolean LJIIIZ(C19536311c1 c19536311c1) {
        NLEResType type;
        NLESegment mainSegment;
        NLETrackSlot nLETrackSlot = c19536311c1.LIZ;
        if (nLETrackSlot != null && (mainSegment = nLETrackSlot.getMainSegment()) != null) {
            type = mainSegment.getType();
        } else {
            type = null;
        }
        if (type == NLEResType.RECORD) {
            return true;
        }
        return false;
    }

    public static boolean LJIIJ(Effect effect) {
        String strLJIIIIZZ;
        InterfaceC19549111e5 interfaceC19549111e5LIZ = C19548411dy.LIZ();
        if (effect != null) {
            strLJIIIIZZ = C1664460tPo.LJIIIIZZ(effect);
        } else {
            strLJIIIIZZ = null;
        }
        return ((C19547411do) interfaceC19549111e5LIZ).LJIIJJI(strLJIIIIZZ, false);
    }

    public static boolean LJIIJJI(Effect effect) {
        if (C256060A1s.LIZ() && !TextUtils.isEmpty(C1664460tPo.LJIIIIZZ(effect)) && C1664460tPo.LJFF(effect)) {
            return true;
        }
        return false;
    }

    public static void LJIILIIL(Effect effect) {
        if (effect != null) {
            Keva keva = SpeakerCenter.LIZ;
            String unzipPath = effect.getUnzipPath();
            Keva keva2 = SpeakerCenter.LIZ;
            keva2.storeString("effectPath", unzipPath);
            keva2.storeString("uploadId", effect.getEffectId());
            keva2.storeString("restoreSpeakerId", C1664460tPo.LJII(effect));
        }
    }

    public static String LIZJ(VideoPublishEditModel videoPublishEditModel, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJIIL(videoPublishEditModel.getCreativeInfo(), ""));
        sbLIZ.append(str);
        sbLIZ.append(".wav");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append("_stream_1024_temp");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C2286708xd.LJIIIIZZ(strLIZIZ, true);
        return strLIZIZ;
    }

    public static long LJ(EnumC19547111dl enumC19547111dl, Effect effect) {
        long jLJIIIZ = ((C19547411do) C19548411dy.LIZ()).LJIIIZ(false);
        long jLJIIIZ2 = ((C19547411do) C19548411dy.LIZ()).LJIIIZ(true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getCurrentValidDownloadUS currentDownloadUS:");
        sbLIZ.append(jLJIIIZ);
        sbLIZ.append(",dub:");
        sbLIZ.append(jLJIIIZ2);
        sbLIZ.append(", isDubDownloading:");
        sbLIZ.append(LJIIIIZZ(effect));
        sbLIZ.append(",isNativeAudioDownloading:");
        sbLIZ.append(LJIIJ(effect));
        C201955140j.LIZIZ("VoiceConversionStream", C2188811AlT.LIZIZ(sbLIZ));
        int i = C19547211dm.LIZ[enumC19547111dl.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return -1024L;
                }
                if (LJIIIIZZ(effect) && LJIIJ(effect)) {
                    return Math.min(jLJIIIZ, jLJIIIZ2);
                }
                if (LJIIJ(effect) && !LJIIIIZZ(effect)) {
                    return jLJIIIZ;
                }
                if (LJIIJ(effect) || !LJIIIIZZ(effect)) {
                    return Math.max(jLJIIIZ, jLJIIIZ2);
                }
            } else {
                return jLJIIIZ;
            }
        }
        return jLJIIIZ2;
    }

    public static boolean LJIIL(C19536311c1 c19536311c1, VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        loop0: while (true) {
            z = true;
            for (EditVideoSegment editVideoSegment : videoPublishEditModel.getPreviewInfo().getVideoList()) {
                if (!z || editVideoSegment.getVideoFileInfo().getDuration() < 1000) {
                    z = false;
                }
            }
        }
        Effect effect = c19536311c1.LIZJ;
        if (C256060A1s.LIZ() && !TextUtils.isEmpty(C1664460tPo.LJIIIIZZ(effect)) && C1664460tPo.LJFF(effect) && z && !C0CHQ.LIZ().getAccountService().LIZ() && !c19536311c1.LJIILL && !videoPublishEditModel.isDuet() && !videoPublishEditModel.isStitchMode()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C19536311c1 r14, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r15, com.ss.android.ugc.effectmanager.effect.model.Effect r16, X.C19546211dc r17, X.C19547611dq r18) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19546111db.LIZIZ(X.11c1, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.ss.android.ugc.effectmanager.effect.model.Effect, X.11dc, X.11dq):void");
    }
}
