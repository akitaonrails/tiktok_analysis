package X;

import com.ss.android.ugc.aweme.creative.model.DraftInfo;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0sic, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1637680sic {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069 A[PHI: r6
      0x0069: PHI (r6v2 java.lang.String) = (r6v0 java.lang.String), (r6v3 java.lang.String) binds: [B:20:0x0056, B:18:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect> LIZ(java.util.List<com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2> r15) {
        /*
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r15.iterator()
        L9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2 r0 = (com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2) r0
            com.ss.android.ugc.aweme.creative.model.DraftInfo r0 = r0.draftInfo
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.draftId
            if (r0 == 0) goto L9
            int r0 = r0.length()
            if (r0 == 0) goto L9
            r3.add(r1)
            goto L9
        L28:
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r3, r0)
            r2.<init>(r0)
            java.util.Iterator r3 = r3.iterator()
        L37:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L73
            java.lang.Object r1 = r3.next()
            com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2 r1 = (com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2) r1
            java.lang.String r5 = r1.effectId
            java.lang.String r7 = r1.effectName
            java.lang.String r8 = r1.iconFilePath
            java.lang.String r9 = r1.zipFilePath
            com.ss.android.ugc.aweme.creative.model.DraftInfo r0 = r1.draftInfo
            java.lang.String r13 = ""
            if (r0 == 0) goto L55
            java.lang.String r6 = r0.draftId
            if (r6 != 0) goto L69
        L55:
            r6 = r13
            if (r0 != 0) goto L69
            r11 = 0
            r12 = 1
        L5a:
            boolean r14 = r1.capturedInPhotoMode
            java.lang.String r15 = r1.prompt
            com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect r4 = new com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect
            java.lang.String r10 = ""
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2.add(r4)
            goto L37
        L69:
            boolean r11 = r0.needSubmission
            boolean r12 = r0.enableSubmission
            java.lang.String r0 = r0.hintStarlingKey
            if (r0 == 0) goto L5a
            r13 = r0
            goto L5a
        L73:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1637680sic.LIZ(java.util.List):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a A[PHI: r9
      0x005a: PHI (r9v3 java.lang.String) = (r9v0 java.lang.String), (r9v4 java.lang.String) binds: [B:20:0x0058, B:18:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[PHI: r9
      0x005e: PHI (r9v2 java.lang.String) = (r9v0 java.lang.String), (r9v3 java.lang.String) binds: [B:20:0x0058, B:22:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect> LIZIZ(java.util.List<com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2> r15) {
        /*
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r15.iterator()
        L9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2 r0 = (com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2) r0
            com.ss.android.ugc.aweme.creative.model.DraftInfo r0 = r0.draftInfo
            if (r0 == 0) goto L24
            java.lang.String r0 = r0.draftId
            if (r0 == 0) goto L24
            int r0 = r0.length()
            if (r0 != 0) goto L9
        L24:
            r3.add(r1)
            goto L9
        L28:
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r3, r0)
            r2.<init>(r0)
            java.util.Iterator r3 = r3.iterator()
        L37:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r1 = r3.next()
            com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2 r1 = (com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2) r1
            com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect r4 = new com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect
            java.lang.String r5 = r1.effectId
            java.lang.String r6 = r1.effectName
            java.lang.String r7 = r1.iconFilePath
            java.lang.String r8 = r1.zipFilePath
            com.ss.android.ugc.aweme.creative.model.TemplateEffectInfo r0 = r1.templateInfo
            java.lang.String r11 = ""
            if (r0 == 0) goto L57
            java.lang.String r9 = r0.templateResourceId
            if (r9 != 0) goto L5a
        L57:
            r9 = r11
            if (r0 == 0) goto L5e
        L5a:
            java.lang.String r10 = r0.templateEffectId
            if (r10 != 0) goto L5f
        L5e:
            r10 = r11
        L5f:
            com.ss.android.ugc.aweme.creative.model.GreenScreenInfo r0 = r1.greenScreenInfo
            if (r0 == 0) goto L68
            java.lang.String r0 = r0.selectedMedia
            if (r0 == 0) goto L68
            r11 = r0
        L68:
            boolean r14 = r1.capturedInPhotoMode
            java.lang.String r15 = r1.prompt
            r12 = 0
            r13 = 1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2.add(r4)
            goto L37
        L75:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1637680sic.LIZIZ(java.util.List):java.util.List");
    }

    public static final boolean LIZJ(List<UploadableMobileEffect2> list) {
        String str;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<UploadableMobileEffect2> it2 = list.iterator();
            while (it2.hasNext()) {
                DraftInfo draftInfo = it2.next().draftInfo;
                if (draftInfo != null && (str = draftInfo.draftId) != null && str.length() != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean LIZLLL(List<UploadableMobileEffect2> list) {
        String str;
        if (list.isEmpty()) {
            return false;
        }
        Iterator<UploadableMobileEffect2> it2 = list.iterator();
        while (it2.hasNext()) {
            DraftInfo draftInfo = it2.next().draftInfo;
            if (draftInfo == null || (str = draftInfo.draftId) == null || str.length() == 0) {
                return true;
            }
        }
        return false;
    }
}
