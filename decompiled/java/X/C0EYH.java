package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0EYH, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EYH {
    public static final C0EYH LIZ = new C0EYH();

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        boolean z = !C0C64.LJIILLIIL().LJIIIZ(31744, "studio_ep_fix_720_to_1080", true, false);
        videoPublishEditModel.setNLECanvas(true);
        videoPublishEditModel.setUsePreviewSizeInCanvasModeEnable(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0260, code lost:
    
        r6 = r11.next();
        r10 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0266, code lost:
    
        if (r7 < 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0268, code lost:
    
        r6 = (com.bytedance.ies.nle.editor_jni.NLETrack) r6;
        r9 = r6.getSlots().iterator();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0277, code lost:
    
        if (r9.hasNext() == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0279, code lost:
    
        r8 = r9.next();
        r1 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x027f, code lost:
    
        if (r2 < 0) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0281, code lost:
    
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x028b, code lost:
    
        if (com.bytedance.ies.nle.editor_jni.NLESegmentEffect.dynamicCast(r8.getMainSegment()) == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x028d, code lost:
    
        r1 = X.C2188811AlT.LIZ();
        r1.append("video has been applied add global effect: ");
        r1.append(r7);
        r1.append(' ');
        r1.append(r6.getTrackType().name());
        r1.append(' ');
        r1.append(r2);
        X.C201955140j.LIZIZ("EPCanvasBoundCalculator", X.C2188811AlT.LIZIZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02b4, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02b5, code lost:
    
        r1 = X.C2188811AlT.LIZ();
        r1.append("calculateSizeBeforeCompile, result: ");
        r1.append(r2);
        r1.append(" compileSize:");
        r1.append(r16.LIZLLL());
        r1.append(',');
        r1.append(r16.LJI());
        X.C201955140j.LIZIZ("EPCanvasBoundCalculator", X.C2188811AlT.LIZIZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02e0, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02e9, code lost:
    
        if (com.bytedance.ies.nle.editor_jni.NLESegmentFilter.dynamicCast(r8.getMainSegment()) == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02eb, code lost:
    
        r1 = X.C2188811AlT.LIZ();
        r1.append("video has been applied add filter: ");
        r1.append(r7);
        r1.append(' ');
        r1.append(r6.getTrackType().name());
        r1.append(' ');
        r1.append(r2);
        X.C201955140j.LIZIZ("EPCanvasBoundCalculator", X.C2188811AlT.LIZIZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0313, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0316, code lost:
    
        r7 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0319, code lost:
    
        if (r12 != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x031b, code lost:
    
        r0 = r18.getTracks();
        r6 = new java.util.ArrayList();
        r5 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x032c, code lost:
    
        if (r5.hasNext() == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x032e, code lost:
    
        r2 = r5.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x033b, code lost:
    
        if (r2.getTrackType() != com.bytedance.ies.nle.editor_jni.NLETrackType.VIDEO) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x033d, code lost:
    
        r6.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0341, code lost:
    
        r2 = new java.util.ArrayList();
        r1 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x034e, code lost:
    
        if (r1.hasNext() == false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0350, code lost:
    
        X.C19719612Di.LJJI(((com.bytedance.ies.nle.editor_jni.NLETrack) r1.next()).getSlots(), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0362, code lost:
    
        if (r2.isEmpty() != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0364, code lost:
    
        r2 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x036c, code lost:
    
        if (r2.hasNext() == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x036e, code lost:
    
        r1 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0378, code lost:
    
        if (r1.getAIMatting() != null) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x037a, code lost:
    
        r0 = com.bytedance.ies.nle.editor_jni.NLESegmentVideo.dynamicCast((com.bytedance.ies.nle.editor_jni.NLENode) r1.getMainSegment());
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0382, code lost:
    
        if (r0 == null) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0384, code lost:
    
        r0 = r0.getCanvasStyle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0388, code lost:
    
        if (r0 == null) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x038e, code lost:
    
        if (r0.getImage() == null) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0396, code lost:
    
        if (r17.creativeModel.videoImageSeparateSwitchModel != null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0398, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x039b, code lost:
    
        X.C1697810uHb.LJIJI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x039e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x039f, code lost:
    
        X.C1697810uHb.LJIJI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x03a2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015f, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0160, code lost:
    
        r0 = r18.getTracks();
        r8 = new java.util.ArrayList();
        r7 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0171, code lost:
    
        if (r7.hasNext() == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0173, code lost:
    
        r6 = r7.next();
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0180, code lost:
    
        if (r2.getTrackType() == com.bytedance.ies.nle.editor_jni.NLETrackType.FILTER) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0188, code lost:
    
        if (r2.getTrackType() != com.bytedance.ies.nle.editor_jni.NLETrackType.EFFECT) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018a, code lost:
    
        r8.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d5, code lost:
    
        r1 = X.C2188811AlT.LIZ();
        r1.append("video has been applied to transform ");
        r1.append(r9.getTransformX());
        r1.append('-');
        r1.append(r9.getTransformY());
        r1.append(": ");
        r1.append(r7);
        r1.append(' ');
        r1.append(r6.getTrackType().name());
        r1.append(' ');
        r1.append(r2);
        X.C201955140j.LIZIZ("EPCanvasBoundCalculator", X.C2188811AlT.LIZIZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0255, code lost:
    
        r11 = r8.iterator();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x025e, code lost:
    
        if (r11.hasNext() == false) goto L178;
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0250 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r17, com.bytedance.ies.nle.editor_jni.NLEModel r18) {
        /*
            Method dump skipped, instruction units count: 945
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EYH.LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.bytedance.ies.nle.editor_jni.NLEModel):boolean");
    }
}
