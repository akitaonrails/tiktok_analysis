package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.tools.AVApi;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0MCp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C564650MCp {
    public static final String LIZIZ = ((AVApi) ServiceManager.get().getService(AVApi.class)).LIZ();
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(409));

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r7, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.gamora.editor.ailive.repo.BlipDescriptionResponse>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C564680MCs
            if (r0 == 0) goto L20
            r4 = r8
            X.0MCs r4 = (X.C564680MCs) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r5 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L43
        L20:
            X.0MCs r4 = new X.0MCs
            r4.<init>(r6, r8)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r5)
            X.01GW r0 = r6.LIZ     // Catch: java.lang.Throwable -> L98
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> L98
            com.ss.android.ugc.gamora.editor.ailive.repo.AILivePhotoRequestApi r1 = (com.ss.android.ugc.gamora.editor.ailive.repo.AILivePhotoRequestApi) r1     // Catch: java.lang.Throwable -> L98
            r4.LLILLL = r2     // Catch: java.lang.Throwable -> L98
            r0 = 2
            java.lang.Object r5 = r1.getBlipDescription(r7, r0, r4)     // Catch: java.lang.Throwable -> L98
            if (r5 != r3) goto L46
            return r3
        L43:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Throwable -> L98
        L46:
            com.ss.android.ugc.gamora.editor.ailive.repo.BlipDescriptionResponse r5 = (com.ss.android.ugc.gamora.editor.ailive.repo.BlipDescriptionResponse) r5     // Catch: java.lang.Throwable -> L98
            if (r5 == 0) goto L8b
            java.util.List<java.lang.String> r0 = r5.blipDescription     // Catch: java.lang.Throwable -> L98
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)     // Catch: java.lang.Throwable -> L98
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L5c
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L98
            if (r0 <= 0) goto L5e
            r0 = 1
            goto L5f
        L5c:
            r2 = 0
            goto L61
        L5e:
            r0 = 0
        L5f:
            if (r0 != r2) goto L5c
        L61:
            if (r2 == 0) goto L6b
            int r0 = r5.statusCode     // Catch: java.lang.Throwable -> L98
            if (r0 != 0) goto L6b
            X.C189200o6.m2constructorimpl(r5)     // Catch: java.lang.Throwable -> L98
            return r5
        L6b:
            X.0MCt r4 = new X.0MCt     // Catch: java.lang.Throwable -> L98
            int r3 = r5.statusCode     // Catch: java.lang.Throwable -> L98
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L98
            java.lang.String r0 = r5.statusMessage     // Catch: java.lang.Throwable -> L98
            r1.append(r0)     // Catch: java.lang.Throwable -> L98
            java.lang.String r0 = " response: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L98
            r1.append(r5)     // Catch: java.lang.Throwable -> L98
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L98
            r1 = 0
            java.lang.String r0 = ""
            r4.<init>(r3, r2, r0, r1)     // Catch: java.lang.Throwable -> L98
            throw r4     // Catch: java.lang.Throwable -> L98
        L8b:
            X.0MCt r4 = new X.0MCt     // Catch: java.lang.Throwable -> L98
            java.lang.String r3 = "response is null"
            r2 = 0
            r1 = 10002(0x2712, float:1.4016E-41)
            java.lang.String r0 = ""
            r4.<init>(r1, r3, r0, r2)     // Catch: java.lang.Throwable -> L98
            throw r4     // Catch: java.lang.Throwable -> L98
        L98:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r5 = new X.00Yq
            r5.<init>(r0)
            X.C189200o6.m2constructorimpl(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C564650MCp.LIZJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(int r13, java.lang.String r14, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.gamora.editor.ailive.repo.AILivePhotoPromptsResponse>> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof X.C564660MCq
            if (r0 == 0) goto L20
            r4 = r15
            X.0MCq r4 = (X.C564660MCq) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r11 = 1
            if (r0 == 0) goto L2e
            if (r0 != r11) goto L26
            goto L52
        L20:
            X.0MCq r4 = new X.0MCq
            r4.<init>(r12, r15)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.0C64 r6 = X.C0C64.LJIILLIIL()     // Catch: X.C094W -> L5b java.lang.Throwable -> L6c
            java.lang.String r10 = "studio_story_ai_live_photo_prompt_time_out_threshold"
            r7 = 31744(0x7c00, float:4.4483E-41)
            r8 = 20
            long r0 = r6.LJIJJLI(r7, r8, r10, r11)     // Catch: X.C094W -> L5b java.lang.Throwable -> L6c
            r2 = 1000(0x3e8, float:1.401E-42)
            long r2 = (long) r2     // Catch: X.C094W -> L5b java.lang.Throwable -> L6c
            long r0 = r0 * r2
            X.0MCo r3 = new X.0MCo     // Catch: X.C094W -> L5b java.lang.Throwable -> L6c
            r2 = 0
            r3.<init>(r12, r13, r14, r2)     // Catch: X.C094W -> L5b java.lang.Throwable -> L6c
            r4.LLILLL = r11     // Catch: X.C094W -> L5b java.lang.Throwable -> L6c
            java.lang.Object r1 = X.C099A.LIZIZ(r0, r3, r4)     // Catch: X.C094W -> L5b java.lang.Throwable -> L6c
            if (r1 != r5) goto L55
            return r5
        L52:
            X.C155000ia.LIZIZ(r1)     // Catch: X.C094W -> L5b java.lang.Throwable -> L6c
        L55:
            com.ss.android.ugc.gamora.editor.ailive.repo.AILivePhotoPromptsResponse r1 = (com.ss.android.ugc.gamora.editor.ailive.repo.AILivePhotoPromptsResponse) r1     // Catch: X.C094W -> L5b java.lang.Throwable -> L6c
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L6c
            return r1
        L5b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L6c
            X.0MCt r4 = new X.0MCt     // Catch: java.lang.Throwable -> L6c
            java.lang.String r3 = "time out"
            r2 = 0
            r1 = 10005(0x2715, float:1.402E-41)
            java.lang.String r0 = ""
            r4.<init>(r1, r3, r0, r2)     // Catch: java.lang.Throwable -> L6c
            throw r4     // Catch: java.lang.Throwable -> L6c
        L6c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C564650MCp.LIZ(int, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r11, java.lang.String r12, java.lang.String r13, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.gamora.editor.ailive.repo.AILivePromptRewriteResponse>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof X.C564670MCr
            if (r0 == 0) goto L20
            r9 = r14
            X.0MCr r9 = (X.C564670MCr) r9
            int r2 = r9.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r9.LLILLL = r2
        L12:
            java.lang.Object r3 = r9.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r9.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L4c
        L20:
            X.0MCr r9 = new X.0MCr
            r9.<init>(r10, r14)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            X.01GW r0 = r10.LIZ     // Catch: java.lang.Throwable -> L64
            java.lang.Object r3 = r0.getValue()     // Catch: java.lang.Throwable -> L64
            com.ss.android.ugc.gamora.editor.ailive.repo.AILivePhotoRequestApi r3 = (com.ss.android.ugc.gamora.editor.ailive.repo.AILivePhotoRequestApi) r3     // Catch: java.lang.Throwable -> L64
            java.lang.String r4 = "camera_aigc"
            java.lang.String r5 = "prompt_rewrite"
            java.util.List r7 = java.util.Collections.singletonList(r12)     // Catch: java.lang.Throwable -> L64
            r9.LLILLL = r1     // Catch: java.lang.Throwable -> L64
            r8 = r13
            r6 = r11
            java.lang.Object r3 = r3.getAILivePromptRewrite(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L64
            if (r3 != r2) goto L4f
            return r2
        L4c:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L64
        L4f:
            com.ss.android.ugc.gamora.editor.ailive.repo.AILivePromptRewriteResponse r3 = (com.ss.android.ugc.gamora.editor.ailive.repo.AILivePromptRewriteResponse) r3     // Catch: java.lang.Throwable -> L64
            if (r3 == 0) goto L57
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L64
            return r3
        L57:
            X.0MCt r4 = new X.0MCt     // Catch: java.lang.Throwable -> L64
            java.lang.String r3 = "response is null"
            r2 = 0
            r1 = 10002(0x2712, float:1.4016E-41)
            java.lang.String r0 = ""
            r4.<init>(r1, r3, r0, r2)     // Catch: java.lang.Throwable -> L64
            throw r4     // Catch: java.lang.Throwable -> L64
        L64:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r3 = new X.00Yq
            r3.<init>(r0)
            X.C189200o6.m2constructorimpl(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C564650MCp.LIZIZ(java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
