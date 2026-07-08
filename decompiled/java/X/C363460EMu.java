package X;

import com.bytedance.ies.nle.editor_jni.NLESegmentSticker;
import com.bytedance.ies.nle.editor_jni.NLEStyStickerAnim;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionData;

/* JADX INFO: renamed from: X.0EMu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C363460EMu {
    public final C0EOK LIZ;
    public final C0E48 LIZIZ;
    public boolean LIZJ;

    public C363460EMu(C0EOK c0eok, C0E48 c0e48) {
        this.LIZ = c0eok;
        this.LIZIZ = c0e48;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0565 A[PHI: r76
      0x0565: PHI (r76v13 java.lang.String) = (r76v1 java.lang.String), (r76v14 java.lang.String) binds: [B:223:0x0563, B:221:0x055f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x056f A[PHI: r76
      0x056f: PHI (r76v2 java.lang.String) = (r76v1 java.lang.String), (r76v13 java.lang.String), (r76v13 java.lang.String) binds: [B:223:0x0563, B:225:0x0567, B:227:0x056d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0573 A[PHI: r76 r77
      0x0573: PHI (r76v12 java.lang.String) = (r76v2 java.lang.String), (r76v13 java.lang.String) binds: [B:229:0x0571, B:227:0x056d] A[DONT_GENERATE, DONT_INLINE]
      0x0573: PHI (r77v11 java.lang.String) = (r77v1 java.lang.String), (r77v12 java.lang.String) binds: [B:229:0x0571, B:227:0x056d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x057d A[PHI: r76 r77
      0x057d: PHI (r76v3 java.lang.String) = (r76v2 java.lang.String), (r76v12 java.lang.String), (r76v12 java.lang.String) binds: [B:229:0x0571, B:231:0x0575, B:233:0x057b] A[DONT_GENERATE, DONT_INLINE]
      0x057d: PHI (r77v2 java.lang.String) = (r77v1 java.lang.String), (r77v11 java.lang.String), (r77v11 java.lang.String) binds: [B:229:0x0571, B:231:0x0575, B:233:0x057b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0581 A[PHI: r76 r77 r78
      0x0581: PHI (r76v11 java.lang.String) = (r76v3 java.lang.String), (r76v12 java.lang.String) binds: [B:235:0x057f, B:233:0x057b] A[DONT_GENERATE, DONT_INLINE]
      0x0581: PHI (r77v10 java.lang.String) = (r77v2 java.lang.String), (r77v11 java.lang.String) binds: [B:235:0x057f, B:233:0x057b] A[DONT_GENERATE, DONT_INLINE]
      0x0581: PHI (r78v8 java.lang.String) = (r78v1 java.lang.String), (r78v9 java.lang.String) binds: [B:235:0x057f, B:233:0x057b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0585 A[PHI: r76 r77 r78
      0x0585: PHI (r76v10 java.lang.String) = (r76v3 java.lang.String), (r76v11 java.lang.String) binds: [B:235:0x057f, B:237:0x0583] A[DONT_GENERATE, DONT_INLINE]
      0x0585: PHI (r77v9 java.lang.String) = (r77v2 java.lang.String), (r77v10 java.lang.String) binds: [B:235:0x057f, B:237:0x0583] A[DONT_GENERATE, DONT_INLINE]
      0x0585: PHI (r78v7 java.lang.String) = (r78v1 java.lang.String), (r78v8 java.lang.String) binds: [B:235:0x057f, B:237:0x0583] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0588 A[PHI: r4 r76 r77 r78
      0x0588: PHI (r4v14 java.lang.String) = (r4v20 java.lang.String), (r4v21 java.lang.String) binds: [B:239:0x0586, B:237:0x0583] A[DONT_GENERATE, DONT_INLINE]
      0x0588: PHI (r76v4 java.lang.String) = (r76v10 java.lang.String), (r76v11 java.lang.String) binds: [B:239:0x0586, B:237:0x0583] A[DONT_GENERATE, DONT_INLINE]
      0x0588: PHI (r77v3 java.lang.String) = (r77v9 java.lang.String), (r77v10 java.lang.String) binds: [B:239:0x0586, B:237:0x0583] A[DONT_GENERATE, DONT_INLINE]
      0x0588: PHI (r78v2 java.lang.String) = (r78v7 java.lang.String), (r78v8 java.lang.String) binds: [B:239:0x0586, B:237:0x0583] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x058c A[PHI: r4 r76 r77 r78
      0x058c: PHI (r4v19 java.lang.String) = (r4v14 java.lang.String), (r4v20 java.lang.String) binds: [B:241:0x058a, B:239:0x0586] A[DONT_GENERATE, DONT_INLINE]
      0x058c: PHI (r76v9 java.lang.String) = (r76v4 java.lang.String), (r76v10 java.lang.String) binds: [B:241:0x058a, B:239:0x0586] A[DONT_GENERATE, DONT_INLINE]
      0x058c: PHI (r77v8 java.lang.String) = (r77v3 java.lang.String), (r77v9 java.lang.String) binds: [B:241:0x058a, B:239:0x0586] A[DONT_GENERATE, DONT_INLINE]
      0x058c: PHI (r78v6 java.lang.String) = (r78v2 java.lang.String), (r78v7 java.lang.String) binds: [B:241:0x058a, B:239:0x0586] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x058f A[PHI: r3 r4 r76 r77 r78
      0x058f: PHI (r3v19 java.lang.String) = (r3v15 java.lang.String), (r3v20 java.lang.String) binds: [B:241:0x058a, B:243:0x058d] A[DONT_GENERATE, DONT_INLINE]
      0x058f: PHI (r4v18 java.lang.String) = (r4v14 java.lang.String), (r4v19 java.lang.String) binds: [B:241:0x058a, B:243:0x058d] A[DONT_GENERATE, DONT_INLINE]
      0x058f: PHI (r76v8 java.lang.String) = (r76v4 java.lang.String), (r76v9 java.lang.String) binds: [B:241:0x058a, B:243:0x058d] A[DONT_GENERATE, DONT_INLINE]
      0x058f: PHI (r77v7 java.lang.String) = (r77v3 java.lang.String), (r77v8 java.lang.String) binds: [B:241:0x058a, B:243:0x058d] A[DONT_GENERATE, DONT_INLINE]
      0x058f: PHI (r78v5 java.lang.String) = (r78v2 java.lang.String), (r78v6 java.lang.String) binds: [B:241:0x058a, B:243:0x058d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0593 A[PHI: r3 r4 r76 r77 r78
      0x0593: PHI (r3v16 java.lang.String) = (r3v19 java.lang.String), (r3v20 java.lang.String) binds: [B:245:0x0591, B:243:0x058d] A[DONT_GENERATE, DONT_INLINE]
      0x0593: PHI (r4v15 java.lang.String) = (r4v18 java.lang.String), (r4v19 java.lang.String) binds: [B:245:0x0591, B:243:0x058d] A[DONT_GENERATE, DONT_INLINE]
      0x0593: PHI (r76v5 java.lang.String) = (r76v8 java.lang.String), (r76v9 java.lang.String) binds: [B:245:0x0591, B:243:0x058d] A[DONT_GENERATE, DONT_INLINE]
      0x0593: PHI (r77v4 java.lang.String) = (r77v7 java.lang.String), (r77v8 java.lang.String) binds: [B:245:0x0591, B:243:0x058d] A[DONT_GENERATE, DONT_INLINE]
      0x0593: PHI (r78v3 java.lang.String) = (r78v5 java.lang.String), (r78v6 java.lang.String) binds: [B:245:0x0591, B:243:0x058d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x06d8 A[PHI: r5
      0x06d8: PHI (r5v13 java.lang.String) = (r5v4 java.lang.String), (r5v14 java.lang.String) binds: [B:296:0x06d6, B:294:0x06d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x06f2 A[PHI: r1 r4 r5
      0x06f2: PHI (r1v30 int) = (r1v29 int), (r1v34 int), (r1v34 int), (r1v34 int) binds: [B:323:0x0721, B:304:0x06e6, B:306:0x06ea, B:308:0x06f0] A[DONT_GENERATE, DONT_INLINE]
      0x06f2: PHI (r4v7 float) = (r4v6 float), (r4v11 float), (r4v11 float), (r4v11 float) binds: [B:323:0x0721, B:304:0x06e6, B:306:0x06ea, B:308:0x06f0] A[DONT_GENERATE, DONT_INLINE]
      0x06f2: PHI (r5v7 java.lang.String) = (r5v6 java.lang.String), (r5v11 java.lang.String), (r5v11 java.lang.String), (r5v11 java.lang.String) binds: [B:323:0x0721, B:304:0x06e6, B:306:0x06ea, B:308:0x06f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x06f6 A[PHI: r1 r4 r5 r37
      0x06f6: PHI (r1v33 int) = (r1v30 int), (r1v34 int) binds: [B:310:0x06f4, B:308:0x06f0] A[DONT_GENERATE, DONT_INLINE]
      0x06f6: PHI (r4v10 float) = (r4v7 float), (r4v11 float) binds: [B:310:0x06f4, B:308:0x06f0] A[DONT_GENERATE, DONT_INLINE]
      0x06f6: PHI (r5v10 java.lang.String) = (r5v7 java.lang.String), (r5v11 java.lang.String) binds: [B:310:0x06f4, B:308:0x06f0] A[DONT_GENERATE, DONT_INLINE]
      0x06f6: PHI (r37v4 java.lang.String) = (r37v1 java.lang.String), (r37v5 java.lang.String) binds: [B:310:0x06f4, B:308:0x06f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0704 A[PHI: r1 r4 r5 r37
      0x0704: PHI (r1v31 int) = (r1v30 int), (r1v33 int), (r1v33 int), (r1v33 int) binds: [B:310:0x06f4, B:312:0x06f8, B:314:0x06fc, B:316:0x0702] A[DONT_GENERATE, DONT_INLINE]
      0x0704: PHI (r4v8 float) = (r4v7 float), (r4v10 float), (r4v10 float), (r4v10 float) binds: [B:310:0x06f4, B:312:0x06f8, B:314:0x06fc, B:316:0x0702] A[DONT_GENERATE, DONT_INLINE]
      0x0704: PHI (r5v8 java.lang.String) = (r5v7 java.lang.String), (r5v10 java.lang.String), (r5v10 java.lang.String), (r5v10 java.lang.String) binds: [B:310:0x06f4, B:312:0x06f8, B:314:0x06fc, B:316:0x0702] A[DONT_GENERATE, DONT_INLINE]
      0x0704: PHI (r37v2 java.lang.String) = (r37v1 java.lang.String), (r37v4 java.lang.String), (r37v4 java.lang.String), (r37v4 java.lang.String) binds: [B:310:0x06f4, B:312:0x06f8, B:314:0x06fc, B:316:0x0702] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x071c A[PHI: r5
      0x071c: PHI (r5v5 java.lang.String) = (r5v4 java.lang.String), (r5v13 java.lang.String) binds: [B:296:0x06d6, B:298:0x06da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0720 A[PHI: r4 r5
      0x0720: PHI (r4v6 float) = (r4v5 float), (r4v12 float) binds: [B:320:0x071d, B:301:0x06e0] A[DONT_GENERATE, DONT_INLINE]
      0x0720: PHI (r5v6 java.lang.String) = (r5v5 java.lang.String), (r5v12 java.lang.String) binds: [B:320:0x071d, B:301:0x06e0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.util.List<? extends X.C443120HZe<? extends com.bytedance.ies.nle.editor_jni.NLETrack, ? extends com.bytedance.ies.nle.editor_jni.NLETrackSlot, com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel>> r134, boolean r135) {
        /*
            Method dump skipped, instruction units count: 1845
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C363460EMu.LIZIZ(java.util.List, boolean):void");
    }

    public static int LIZ(NLETrackSlot nLETrackSlot, TextFontStyleData textFontStyleData, boolean z) {
        NLEStyStickerAnim animation;
        TextMotionData textMotionData;
        NLESegmentSticker nLESegmentStickerDynamicCast = NLESegmentSticker.dynamicCast(nLETrackSlot.getMainSegment());
        if (nLESegmentStickerDynamicCast != null) {
            animation = nLESegmentStickerDynamicCast.getAnimation();
        } else {
            animation = null;
        }
        if (animation != null) {
            return 1;
        }
        if (textFontStyleData != null && (textMotionData = textFontStyleData.LIZJ) != null && textMotionData.LIZIZ == 1) {
            if (z) {
                return 1;
            }
            return 2;
        }
        return 3;
    }
}
