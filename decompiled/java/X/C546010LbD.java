package X;

import com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterGenerationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterModel;

/* JADX INFO: renamed from: X.0LbD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C546010LbD {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C546000LbC LIZIZ(java.lang.String r5, com.ss.android.ugc.aweme.creative.model.CreativeModel r6) {
        /*
            com.ss.android.ugc.aweme.creative.model.aigc.AIGCBusinessModelSet r0 = r6.aigcBusinessModel
            com.ss.android.ugc.aweme.theater.model.AITheaterModel r0 = r0.aiTheaterModel
            r4 = 0
            if (r0 == 0) goto L17
            com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel r0 = r0.getCreationModel()
            if (r0 == 0) goto L17
            com.ss.android.ugc.aweme.theater.model.AITheaterGenerationModel r3 = r0.generationModel
        Lf:
            int r0 = r5.length()
            r2 = 1
            if (r0 <= 0) goto L5a
            goto L19
        L17:
            r3 = r4
            goto Lf
        L19:
            X.09BX r0 = new X.09BX     // Catch: java.lang.Throwable -> L28
            r0.<init>(r5, r4)     // Catch: java.lang.Throwable -> L28
            java.lang.Object r1 = X.C23250099c.LJFF(r0)     // Catch: java.lang.Throwable -> L28
            X.0LSZ r1 = (X.C0LSZ) r1     // Catch: java.lang.Throwable -> L28
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L28
            goto L34
        L28:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L34:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L3b
            r4 = r1
        L3b:
            X.0LSZ r4 = (X.C0LSZ) r4
            if (r4 == 0) goto L5a
            java.lang.String r1 = r4.LJ
            java.lang.String r0 = "FINISHED"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L4c
            X.0LbE r1 = X.EnumC546020LbE.READY
            goto L5e
        L4c:
            java.lang.String r0 = "FAILED"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L57
            X.0LbE r1 = X.EnumC546020LbE.FAILED
            goto L5e
        L57:
            X.0LbE r1 = X.EnumC546020LbE.PROCESSING
            goto L5e
        L5a:
            if (r3 != 0) goto L64
            X.0LbE r1 = X.EnumC546020LbE.MISSING
        L5e:
            X.0LbC r0 = new X.0LbC
            r0.<init>(r1)
            return r0
        L64:
            boolean r0 = X.C546670LcH.LIZ(r3)
            if (r0 == 0) goto L6d
            X.0LbE r1 = X.EnumC546020LbE.FAILED
            goto L5e
        L6d:
            boolean r0 = X.C546670LcH.LIZIZ(r3)
            if (r0 == 0) goto L76
            X.0LbE r1 = X.EnumC546020LbE.PROCESSING
            goto L5e
        L76:
            com.ss.android.ugc.aweme.creative.model.aigc.AIGCBusinessModelSet r0 = r6.aigcBusinessModel
            com.ss.android.ugc.aweme.theater.model.AITheaterModel r0 = r0.aiTheaterModel
            if (r0 == 0) goto Lb0
            boolean r0 = X.C547980LeO.LJI(r0)
            if (r0 != r2) goto Lb0
            java.util.List r1 = r3.getResults()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Laa
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lad
            java.util.Iterator r1 = r1.iterator()
        L96:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lad
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = X.C2286708xd.LIZJ(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L96
        Laa:
            X.0LbE r1 = X.EnumC546020LbE.PROCESSING
            goto L5e
        Lad:
            X.0LbE r1 = X.EnumC546020LbE.READY
            goto L5e
        Lb0:
            X.0LbE r1 = X.EnumC546020LbE.PROCESSING
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C546010LbD.LIZIZ(java.lang.String, com.ss.android.ugc.aweme.creative.model.CreativeModel):X.0LbC");
    }

    public static void LIZ(AIGCDraft aIGCDraft, CreativeModel creativeModel, Boolean bool) {
        AITheaterModel aITheaterModel;
        AITheaterCreationModel creationModel;
        AITheaterGenerationModel aITheaterGenerationModel;
        String serverTaskId = aIGCDraft.serverTaskId;
        if (serverTaskId.length() == 0 && ((aITheaterModel = creativeModel.aigcBusinessModel.aiTheaterModel) == null || (creationModel = aITheaterModel.getCreationModel()) == null || (aITheaterGenerationModel = creationModel.generationModel) == null || (serverTaskId = aITheaterGenerationModel.getServerTaskId()) == null)) {
            serverTaskId = "";
        }
        C546030LbF.LIZ(C0LQ4.CLOUD_DRAFT_NAVIGATE, serverTaskId, null, bool, LIZIZ(serverTaskId, creativeModel).LIZ, creativeModel);
    }
}
