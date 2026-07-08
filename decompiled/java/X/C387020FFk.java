package X;

/* JADX INFO: renamed from: X.0FFk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C387020FFk {
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c A[PHI: r1
      0x009c: PHI (r1v3 int) = (r1v2 int), (r1v4 int) binds: [B:27:0x006c, B:29:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C21665719qh LIZ(com.bytedance.ies.nle.editor_jni.NLETrackSlot r15, X.C1450600nqs r16) {
        /*
            r1 = r16
            com.ss.android.ugc.aweme.comment.model.CommentImageModel r0 = r1.imageOriginalPath
            r3 = 0
            if (r0 == 0) goto Ld
            java.lang.String r5 = r0.getEditedImagePath()
            if (r5 != 0) goto L21
        Ld:
            com.bytedance.ies.nle.editor_jni.NLESegment r0 = r15.getMainSegment()
            if (r0 == 0) goto L1f
            com.bytedance.ies.nle.editor_jni.NLEResourceNode r0 = r0.getResource()
            if (r0 == 0) goto L1f
            java.lang.String r5 = r0.getResourceFile()
            if (r5 != 0) goto L21
        L1f:
            java.lang.String r5 = ""
        L21:
            X.0EnO[] r2 = X.EnumC375200EnO.values()
            java.lang.String r0 = "ep_crop_mode"
            java.lang.Integer r0 = X.C351220Dpo.LJJJLZIJ(r15, r0, r3)
            if (r0 == 0) goto La4
            int r0 = r0.intValue()
        L31:
            r2 = r2[r0]
            java.lang.String r0 = "ep_crop_ratio"
            java.lang.Float r7 = X.C351220Dpo.LJJJJJL(r15, r0, r3)
            java.lang.String r0 = "crop_slider_rotation"
            java.lang.Float r0 = X.C351220Dpo.LJJJJJL(r15, r0, r3)
            if (r0 == 0) goto La2
            float r8 = r0.floatValue()
        L45:
            android.graphics.Matrix r9 = X.C1449620npI.LIZ(r15)
            java.lang.String r0 = "crop_mirror_x"
            java.lang.Boolean r0 = X.C351220Dpo.LJJII(r15, r0, r3)
            r6 = 0
            if (r0 == 0) goto La0
            boolean r11 = r0.booleanValue()
        L56:
            X.19qh r4 = new X.19qh
            com.ss.android.ugc.aweme.comment.model.CommentImageModel r0 = r1.imageOriginalPath
            X.C438710HIf.LIZ(r0)
            int[] r1 = X.C375210EnP.LIZ
            int r0 = r2.ordinal()
            r2 = r1[r0]
            r0 = 1
            if (r2 == r0) goto L78
            r1 = 3
            if (r2 == r1) goto L9e
            r6 = 4
            if (r2 == r6) goto L9c
            r1 = 6
            r0 = 5
            if (r2 == r0) goto L9c
            if (r2 == r1) goto L9a
            r0 = 7
            if (r2 == r0) goto L78
            r6 = 1
        L78:
            java.lang.String r0 = "crop_button_rotation"
            java.lang.Float r0 = X.C351220Dpo.LJJJJJL(r15, r0, r3)
            if (r0 == 0) goto L98
            float r10 = r0.floatValue()
        L84:
            float r12 = r15.getScale()
            float r13 = r15.getTransformX()
            float r14 = r15.getTransformY()
            float r15 = r15.getRotation()
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r4
        L98:
            r10 = 0
            goto L84
        L9a:
            r6 = 5
            goto L78
        L9c:
            r6 = r1
            goto L78
        L9e:
            r6 = 2
            goto L78
        La0:
            r11 = 0
            goto L56
        La2:
            r8 = 0
            goto L45
        La4:
            X.0EnO r0 = X.EnumC375200EnO.FREE
            int r0 = r0.ordinal()
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C387020FFk.LIZ(com.bytedance.ies.nle.editor_jni.NLETrackSlot, X.0nqs):X.19qh");
    }
}
