package X;

import com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitModel;
import com.ss.android.ugc.aweme.portrait.service.IPortraitWorkflowService;

/* JADX INFO: renamed from: X.0Li6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C550280Li6 implements InterfaceC546480Lby<AwemeDraft> {
    public AIPortraitModel LIZIZ;
    public final AIGCWorkflowCreationService LIZ = C2387909Xh.LIZ();
    public final IPortraitWorkflowService LIZJ = (IPortraitWorkflowService) PluggableExtentionKt.pluggableSpi$default(IPortraitWorkflowService.class, false, false, false, 14, null);

    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C550310Li9
            if (r0 == 0) goto L5b
            r5 = r7
            X.0Li9 r5 = (X.C550310Li9) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5b
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r0 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r5.LLILZ
            r3 = 1
            if (r1 == 0) goto L2b
            if (r1 != r3) goto L61
            com.ss.android.ugc.aweme.portrait.model.AIPortraitGeneratingModel r2 = r5.LL
            X.C155000ia.LIZIZ(r0)
        L24:
            com.ss.android.ugc.aweme.portrait.model.GenerateFailedInfo r0 = (com.ss.android.ugc.aweme.portrait.model.GenerateFailedInfo) r0
        L26:
            r2.failedInfo = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2b:
            X.C155000ia.LIZIZ(r0)
            com.ss.android.ugc.aweme.portrait.model.AIPortraitModel r0 = r6.LIZIZ
            if (r0 == 0) goto L69
            com.ss.android.ugc.aweme.portrait.model.AIPortraitContextModel r0 = r0.contextModel
            if (r0 == 0) goto L69
            com.ss.android.ugc.aweme.portrait.model.AIPortraitGeneratingModel r2 = r0.generatingModel
            if (r2 == 0) goto L69
            com.ss.android.ugc.aweme.portrait.model.GenerateStatus r1 = r2.status
            com.ss.android.ugc.aweme.portrait.model.GenerateStatus r0 = com.ss.android.ugc.aweme.portrait.model.GenerateStatus.FAILED
            if (r1 == r0) goto L43
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L43:
            java.lang.String r1 = r2.clientWorkflowId
            if (r1 != 0) goto L4a
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4a:
            com.ss.android.ugc.aweme.portrait.service.IPortraitWorkflowService r0 = r6.LIZJ
            if (r0 == 0) goto L59
            r5.LL = r2
            r5.LLILZ = r3
            java.lang.Object r0 = r0.LIZJ(r1, r5)
            if (r0 != r4) goto L24
            return r4
        L59:
            r0 = 0
            goto L26
        L5b:
            X.0Li9 r5 = new X.0Li9
            r5.<init>(r6, r7)
            goto L12
        L61:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L69:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C550280Li6.LIZLLL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r7, X.InterfaceC1364105Vn<? super X.C539070LCf> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C550330LiB
            if (r0 == 0) goto L3e
            r5 = r8
            X.0LiB r5 = (X.C550330LiB) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L45
            X.C155000ia.LIZIZ(r4)
        L23:
            X.0LCf r4 = (X.C539070LCf) r4
            if (r4 == 0) goto L4d
            X.0LaT r1 = r4.LIZJ
            X.0LaT r0 = X.EnumC545550LaT.NONE
            if (r1 != r0) goto L44
            return r2
        L2e:
            X.C155000ia.LIZIZ(r4)
            com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService r0 = r6.LIZ
            if (r0 == 0) goto L4d
            r5.LLILLL = r1
            java.lang.Object r4 = r0.LJIJ(r7, r5)
            if (r4 != r3) goto L23
            return r3
        L3e:
            X.0LiB r5 = new X.0LiB
            r5.<init>(r6, r8)
            goto L12
        L44:
            return r4
        L45:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L4d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C550280Li6.LIZIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cd  */
    @Override // X.InterfaceC546480Lby
    /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.draft.model.AwemeDraft r31, X.InterfaceC1364105Vn<? super kotlin.Unit> r32) {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C550280Li6.LIZ(com.ss.android.ugc.aweme.draft.model.AwemeDraft, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(com.ss.android.ugc.aweme.creative.model.CreativeModel r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.C550320LiA
            if (r0 == 0) goto L80
            r3 = r13
            X.0LiA r3 = (X.C550320LiA) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L80
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r5 = r3.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r2 = 1
            if (r0 == 0) goto L38
            if (r0 != r2) goto L86
            X.C155000ia.LIZIZ(r5)
        L22:
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L8e
            com.ss.android.ugc.aweme.portrait.model.AIPortraitModel r0 = r11.LIZIZ
            if (r0 == 0) goto L35
            com.ss.android.ugc.aweme.portrait.model.AIPortraitCreationModel r4 = new com.ss.android.ugc.aweme.portrait.model.AIPortraitCreationModel
            r6 = 0
            r7 = r6
            r8 = r6
            r9 = r6
            r4.<init>(r5, r6, r7, r8, r9)
            r0.creationModel = r4
        L35:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L38:
            X.C155000ia.LIZIZ(r5)
            com.ss.android.ugc.aweme.portrait.model.AIPortraitModel r5 = r11.LIZIZ
            if (r5 == 0) goto L50
            com.ss.android.ugc.aweme.portrait.model.AIPortraitContextModel r0 = r5.contextModel
            if (r0 == 0) goto L50
            com.ss.android.ugc.aweme.portrait.model.AIPortraitGeneratingModel r0 = r0.generatingModel
            if (r0 == 0) goto L50
            com.ss.android.ugc.aweme.portrait.model.GenerateStatus r1 = r0.status
        L49:
            com.ss.android.ugc.aweme.portrait.model.GenerateStatus r0 = com.ss.android.ugc.aweme.portrait.model.GenerateStatus.SUCCESS
            if (r1 == r0) goto L52
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L50:
            r1 = 0
            goto L49
        L52:
            com.ss.android.ugc.aweme.creative.model.aigc.AIGCWorkflowModel r0 = r12.aigcWorkflowModel
            r6 = 0
            r0.hasAigcNewFrameworkTask = r6
            if (r5 == 0) goto L91
            com.ss.android.ugc.aweme.portrait.model.AIPortraitContextModel r0 = r5.contextModel
            if (r0 == 0) goto L91
            com.ss.android.ugc.aweme.portrait.model.AIPortraitGeneratingModel r0 = r0.generatingModel
            if (r0 == 0) goto L91
            java.lang.String r1 = r0.clientWorkflowId
            if (r1 != 0) goto L68
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L68:
            java.lang.Class<com.ss.android.ugc.aweme.portrait.service.IPortraitWorkflowService> r5 = com.ss.android.ugc.aweme.portrait.service.IPortraitWorkflowService.class
            r9 = 14
            r10 = 0
            r7 = r6
            r8 = r6
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.portrait.service.IPortraitWorkflowService r0 = (com.ss.android.ugc.aweme.portrait.service.IPortraitWorkflowService) r0
            if (r0 == 0) goto L8e
            r3.LLILLL = r2
            java.lang.Object r5 = r0.LJFF(r1, r3)
            if (r5 != r4) goto L22
            return r4
        L80:
            X.0LiA r3 = new X.0LiA
            r3.<init>(r11, r13)
            goto L12
        L86:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L8e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L91:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C550280Li6.LJ(com.ss.android.ugc.aweme.creative.model.CreativeModel, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(com.ss.android.ugc.aweme.portrait.model.AIPortraitModel r14, java.lang.String r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            r13 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C550300Li8
            if (r0 == 0) goto La6
            r4 = r3
            X.0Li8 r4 = (X.C550300Li8) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La6
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L14:
            java.lang.Object r0 = r4.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r4.LLILZIL
            r2 = 2
            r5 = 1
            if (r1 == 0) goto L4d
            if (r1 == r5) goto L84
            if (r1 != r2) goto Lad
            java.lang.Object r6 = r4.LLILLJJLI
            com.ss.android.ugc.aweme.portrait.model.AIPortraitGeneratingModel r6 = (com.ss.android.ugc.aweme.portrait.model.AIPortraitGeneratingModel) r6
            com.ss.android.ugc.aweme.portrait.model.AIPortraitGeneratingModel r3 = r4.LL
            X.C155000ia.LIZIZ(r0)
        L2d:
            java.lang.String r0 = (java.lang.String) r0
            r6.serverWorkflowId = r0
            X.0Laz r0 = X.C545870Laz.LIZIZ
            java.lang.String r2 = r0.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "AIPortraitDraftRestoreHandler -> updateWorkflowId, serverWorkflowId = "
            r1.append(r0)
            java.lang.String r0 = r3.serverWorkflowId
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LIZIZ(r2, r0)
        L4a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4d:
            X.C155000ia.LIZIZ(r0)
            if (r14 == 0) goto Lb5
            com.ss.android.ugc.aweme.portrait.model.AIPortraitContextModel r0 = r14.contextModel
            if (r0 == 0) goto Lb5
            com.ss.android.ugc.aweme.portrait.model.AIPortraitGeneratingModel r6 = r0.generatingModel
            if (r6 == 0) goto Lb5
            java.lang.Class<com.ss.android.ugc.aweme.portrait.service.IPortraitWorkflowService> r7 = com.ss.android.ugc.aweme.portrait.service.IPortraitWorkflowService.class
            r8 = 0
            r11 = 14
            r12 = 0
            r9 = r8
            r10 = r8
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r7, r8, r9, r10, r11, r12)
            com.ss.android.ugc.aweme.portrait.service.IPortraitWorkflowService r1 = (com.ss.android.ugc.aweme.portrait.service.IPortraitWorkflowService) r1
            if (r1 != 0) goto L6d
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L6d:
            java.lang.String r0 = r6.clientWorkflowId
            if (r0 == 0) goto L77
            int r0 = r0.length()
            if (r0 != 0) goto L93
        L77:
            r4.LL = r6
            r4.LLILLJJLI = r1
            r4.LLILZIL = r5
            java.lang.Object r0 = r1.LIZLLL(r15, r4)
            if (r0 != r3) goto L8d
            return r3
        L84:
            java.lang.Object r1 = r4.LLILLJJLI
            com.ss.android.ugc.aweme.portrait.service.IPortraitWorkflowService r1 = (com.ss.android.ugc.aweme.portrait.service.IPortraitWorkflowService) r1
            com.ss.android.ugc.aweme.portrait.model.AIPortraitGeneratingModel r6 = r4.LL
            X.C155000ia.LIZIZ(r0)
        L8d:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L93
            r6.clientWorkflowId = r0
        L93:
            java.lang.String r0 = r6.clientWorkflowId
            if (r0 == 0) goto L4a
            r4.LL = r6
            r4.LLILLJJLI = r6
            r4.LLILZIL = r2
            java.lang.Object r0 = r1.LJI(r0, r4)
            if (r0 != r3) goto La4
            return r3
        La4:
            r3 = r6
            goto L2d
        La6:
            X.0Li8 r4 = new X.0Li8
            r4.<init>(r13, r3)
            goto L14
        Lad:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lb5:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C550280Li6.LJFF(com.ss.android.ugc.aweme.portrait.model.AIPortraitModel, java.lang.String, X.05Vn):java.lang.Object");
    }
}
