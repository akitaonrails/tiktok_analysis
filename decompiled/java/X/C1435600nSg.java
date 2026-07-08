package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.wavepublish.utils.UploadResumeInfo;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nSg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1435600nSg {
    public static boolean LIZJ;
    public static final Object LIZ = new Object();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(7));
    public static final HashMap<String, UploadResumeInfo> LIZLLL = new HashMap<>();

    public static boolean LIZ(UploadResumeInfo uploadResumeInfo) {
        if (uploadResumeInfo.skipVEWriteFile && C297810Blr.LIZ()) {
            return C2286708xd.LIZJ(uploadResumeInfo.outputFilePath);
        }
        if (C2286708xd.LIZJ(uploadResumeInfo.outputFilePath) && C2286708xd.LIZJ(uploadResumeInfo.synthesisFilePath)) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        if (!C297790Blp.LIZ()) {
            return;
        }
        if (!LJIIJ(videoPublishEditModel, true, true)) {
            videoPublishEditModel.setCompileFinished(false);
            videoPublishEditModel.setSynthesisFileHash("");
            return;
        }
        UploadResumeInfo uploadResumeInfoLJFF = LJFF(LJI(videoPublishEditModel), true);
        if (uploadResumeInfoLJFF != null) {
            videoPublishEditModel.setCompileFinished(uploadResumeInfoLJFF.isCompileFinished());
            videoPublishEditModel.setOutputFile(uploadResumeInfoLJFF.outputFilePath);
            videoPublishEditModel.setParallelUploadOutputFile(uploadResumeInfoLJFF.synthesisFilePath);
            videoPublishEditModel.setSynthesisFileHash(uploadResumeInfoLJFF.synthesisFileHash);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("convertToEditModel, output: ");
        sbLIZ.append(videoPublishEditModel.getOutputFile());
        sbLIZ.append(", synthesis: ");
        sbLIZ.append(videoPublishEditModel.getParallelUploadOutputFile());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZJ(String str) {
        if (str.length() == 0) {
            return;
        }
        synchronized (LIZ) {
            try {
                ((Keva) LIZIZ.getValue()).erase(str);
                LIZLLL.remove(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static String LJ(C0VSJ c0vsj) {
        Object c098200Yq;
        if (((Boolean) C262860ARw.LIZ.getValue()).booleanValue() && c0vsj.length() > 3145728) {
            try {
                c098200Yq = C2177908g5.LIZ(c0vsj);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1AF0.LJ(thM5exceptionOrNullimpl);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            String str = (String) c098200Yq;
            if (str == null) {
                return "";
            }
            return str;
        }
        return C08F1.LIZ(c0vsj);
    }

    public static String LJI(VideoPublishEditModel videoPublishEditModel) {
        String draftPrimaryKey = videoPublishEditModel.getDraftPrimaryKey();
        if (draftPrimaryKey == null) {
            return videoPublishEditModel.getCreationId();
        }
        return draftPrimaryKey;
    }

    public static boolean LJII(VideoPublishEditModel videoPublishEditModel) {
        if (!((Boolean) C0C3U.LIZIZ.getValue()).booleanValue()) {
            return false;
        }
        if (((Boolean) C0C3U.LIZJ.getValue()).booleanValue()) {
            if (videoPublishEditModel.getTtStoryUploadModel() == null) {
                return false;
            }
            return true;
        }
        if (!((Boolean) C0C3U.LIZLLL.getValue()).booleanValue()) {
            return false;
        }
        return true;
    }

    public static void LJIIIZ(String str) {
        if (!C297790Blp.LIZ()) {
            return;
        }
        if (str.length() != 0) {
            String str2 = C1443030nef.LJII().LJII;
            if (str2 == null) {
                str2 = "";
            }
            if (!Intrinsics.LJFF(str, str2)) {
                LIZLLL(str, null);
                return;
            }
        }
        C1AF0.LIZJ("can't delete publish file");
    }

    public static void LIZLLL(String str, UploadResumeInfo uploadResumeInfo) {
        if (!C297790Blp.LIZ()) {
            return;
        }
        if (uploadResumeInfo == null && (uploadResumeInfo = LJFF(str, false)) == null) {
            return;
        }
        LIZJ(str);
        C2286708xd.LJIJ(uploadResumeInfo.getRealSynthesisFilePath());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0059 A[Catch: all -> 0x0060, PHI: r3
      0x0059: PHI (r3v5 com.ss.android.ugc.aweme.wavepublish.utils.UploadResumeInfo) = 
      (r3v0 com.ss.android.ugc.aweme.wavepublish.utils.UploadResumeInfo)
      (r3v2 com.ss.android.ugc.aweme.wavepublish.utils.UploadResumeInfo)
     binds: [B:18:0x002e, B:26:0x0051] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:12:0x0012, B:14:0x001a, B:17:0x0022, B:22:0x0048, B:25:0x004f, B:27:0x0053, B:28:0x0059, B:21:0x003d, B:19:0x0030), top: B:35:0x0012, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.wavepublish.utils.UploadResumeInfo LJFF(java.lang.String r4, boolean r5) {
        /*
            int r0 = r4.length()
            if (r0 != 0) goto Lb
            r0 = 1
        L7:
            r3 = 0
            if (r0 == 0) goto Ld
            return r3
        Lb:
            r0 = 0
            goto L7
        Ld:
            java.lang.Object r2 = X.C1435600nSg.LIZ
            monitor-enter(r2)
            if (r5 == 0) goto L22
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.wavepublish.utils.UploadResumeInfo> r1 = X.C1435600nSg.LIZLLL     // Catch: java.lang.Throwable -> L60
            boolean r0 = r1.containsKey(r4)     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L22
            java.lang.Object r0 = r1.get(r4)     // Catch: java.lang.Throwable -> L60
            com.ss.android.ugc.aweme.wavepublish.utils.UploadResumeInfo r0 = (com.ss.android.ugc.aweme.wavepublish.utils.UploadResumeInfo) r0     // Catch: java.lang.Throwable -> L60
            monitor-exit(r2)
            return r0
        L22:
            X.01GW r0 = X.C1435600nSg.LIZIZ     // Catch: java.lang.Throwable -> L60
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L60
            com.bytedance.keva.Keva r0 = (com.bytedance.keva.Keva) r0     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = r0.getString(r4, r3)     // Catch: java.lang.Throwable -> L60
            if (r1 == 0) goto L59
            java.lang.Class<com.ss.android.ugc.aweme.wavepublish.utils.UploadResumeInfo> r0 = com.ss.android.ugc.aweme.wavepublish.utils.UploadResumeInfo.class
            java.lang.Object r1 = X.C2292508yZ.LIZ(r1, r0)     // Catch: java.lang.Throwable -> L3c
            com.ss.android.ugc.aweme.wavepublish.utils.UploadResumeInfo r1 = (com.ss.android.ugc.aweme.wavepublish.utils.UploadResumeInfo) r1     // Catch: java.lang.Throwable -> L3c
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L3c
            goto L48
        L3c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L60
            X.00Yq r1 = new X.00Yq     // Catch: java.lang.Throwable -> L60
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L60
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L60
        L48:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)     // Catch: java.lang.Throwable -> L60
            if (r0 != 0) goto L4f
            r3 = r1
        L4f:
            com.ss.android.ugc.aweme.wavepublish.utils.UploadResumeInfo r3 = (com.ss.android.ugc.aweme.wavepublish.utils.UploadResumeInfo) r3     // Catch: java.lang.Throwable -> L60
            if (r3 == 0) goto L59
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.wavepublish.utils.UploadResumeInfo> r0 = X.C1435600nSg.LIZLLL     // Catch: java.lang.Throwable -> L60
            r0.put(r4, r3)     // Catch: java.lang.Throwable -> L60
            goto L5e
        L59:
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.wavepublish.utils.UploadResumeInfo> r0 = X.C1435600nSg.LIZLLL     // Catch: java.lang.Throwable -> L60
            r0.remove(r4)     // Catch: java.lang.Throwable -> L60
        L5e:
            monitor-exit(r2)
            return r3
        L60:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L60
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1435600nSg.LJFF(java.lang.String, boolean):com.ss.android.ugc.aweme.wavepublish.utils.UploadResumeInfo");
    }

    public static void LJIIIIZZ(VideoPublishEditModel videoPublishEditModel, boolean z, boolean z2) {
        if (!C297790Blp.LIZ()) {
            return;
        }
        if (z) {
            if (C297810Blr.LIZ() && !z2) {
                LIZJ(LJI(videoPublishEditModel));
                return;
            } else {
                LIZLLL(LJI(videoPublishEditModel), null);
                return;
            }
        }
        LIZJ(LJI(videoPublishEditModel));
    }

    public static boolean LJIIJ(VideoPublishEditModel videoPublishEditModel, boolean z, boolean z2) {
        if (!C297790Blp.LIZ() || videoPublishEditModel.creativeModel.dmMediaModel != null) {
            return false;
        }
        String strLJI = LJI(videoPublishEditModel);
        if (strLJI.length() == 0 || !z) {
            return false;
        }
        UploadResumeInfo uploadResumeInfoLJFF = LJFF(strLJI, false);
        if (uploadResumeInfoLJFF == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("shouldResumeFromDisk return false: no record found, infoKey: ");
            sbLIZ.append(strLJI);
            C201955140j.LIZIZ("SynthesisFile", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("shouldResumeFromDisk found record, infoKey: ");
        sbLIZ2.append(strLJI);
        sbLIZ2.append(", outputFile: ");
        sbLIZ2.append(uploadResumeInfoLJFF.outputFilePath);
        sbLIZ2.append(", synthesisFilePath: ");
        sbLIZ2.append(uploadResumeInfoLJFF.synthesisFilePath);
        sbLIZ2.append(", realSynthesisFilePath: ");
        sbLIZ2.append(uploadResumeInfoLJFF.getRealSynthesisFilePath());
        sbLIZ2.append(", isCompileFinished: ");
        sbLIZ2.append(uploadResumeInfoLJFF.isCompileFinished());
        sbLIZ2.append(", skipVEWriteFile: ");
        sbLIZ2.append(uploadResumeInfoLJFF.skipVEWriteFile);
        C201955140j.LIZIZ("SynthesisFile", C2188811AlT.LIZIZ(sbLIZ2));
        if (z2 || (!uploadResumeInfoLJFF.skipVEWriteFile || !C297810Blr.LIZ() ? !(videoPublishEditModel.isCompileFinished() != uploadResumeInfoLJFF.isCompileFinished() || !Intrinsics.LJFF(uploadResumeInfoLJFF.outputFilePath, videoPublishEditModel.getOutputFile()) || !Intrinsics.LJFF(uploadResumeInfoLJFF.synthesisFilePath, videoPublishEditModel.getParallelUploadOutputFile())) : !(videoPublishEditModel.isCompileFinished() != uploadResumeInfoLJFF.isCompileFinished() || !Intrinsics.LJFF(uploadResumeInfoLJFF.outputFilePath, videoPublishEditModel.getOutputFile())))) {
            if (uploadResumeInfoLJFF.isCompileFinished() && LIZ(uploadResumeInfoLJFF)) {
                String strLJ = LJ(new C0VSJ(uploadResumeInfoLJFF.getRealSynthesisFilePath()));
                if (!Intrinsics.LJFF(strLJ, uploadResumeInfoLJFF.synthesisFileHash)) {
                    LIZJ(strLJI);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("shouldResumeFromDisk return false: hash mismatch, infoKey: ");
                    sbLIZ3.append(strLJI);
                    sbLIZ3.append(", currentHash: ");
                    sbLIZ3.append(strLJ);
                    sbLIZ3.append(", storedHash: ");
                    sbLIZ3.append(uploadResumeInfoLJFF.synthesisFileHash);
                    C201955140j.LIZIZ("SynthesisFile", C2188811AlT.LIZIZ(sbLIZ3));
                    return false;
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("shouldResumeFromDisk return true: meet all condition, infoKey: ");
                sbLIZ4.append(strLJI);
                sbLIZ4.append(", outputFile: ");
                sbLIZ4.append(uploadResumeInfoLJFF.outputFilePath);
                sbLIZ4.append(", synthesisFilePath: ");
                sbLIZ4.append(uploadResumeInfoLJFF.synthesisFilePath);
                C201955140j.LIZIZ("SynthesisFile", C2188811AlT.LIZIZ(sbLIZ4));
                return true;
            }
            LIZJ(strLJI);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("shouldResumeFromDisk return false: no synthesis file or not compile done, infoKey: ");
            sbLIZ5.append(strLJI);
            C201955140j.LIZIZ("SynthesisFile", C2188811AlT.LIZIZ(sbLIZ5));
            return false;
        }
        LIZJ(strLJI);
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("shouldResumeFromDisk return false: info not equal to model, infoKey: ");
        sbLIZ6.append(strLJI);
        C201955140j.LIZIZ("SynthesisFile", C2188811AlT.LIZIZ(sbLIZ6));
        return false;
    }
}
