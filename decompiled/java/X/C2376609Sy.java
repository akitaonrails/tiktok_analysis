package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.services.audio.IAudioParams;
import com.ss.android.ugc.aweme.services.audio.IAudioService;
import com.ss.android.ugc.aweme.services.audio.IAudioServiceFactory;
import com.ss.android.ugc.aweme.services.audio.ITTSCallback;
import com.ss.android.ugc.aweme.services.audio.ITTSService;
import java.io.File;

/* JADX INFO: renamed from: X.09Sy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2376609Sy implements ITTSService, IAudioServiceFactory<IAudioParams> {
    @Override // com.ss.android.ugc.aweme.services.audio.IAudioServiceFactory
    public final IAudioService getAudioService(IAudioParams iAudioParams) {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.ITTSService
    public final void onDestroy() {
        C2374609Se.LIZ.clear();
    }

    @Override // com.ss.android.ugc.aweme.services.audio.ITTSService
    public final void destroyAudioSDKHandler() {
        ITTSCallback iTTSCallback;
        if (C09T0.LIZ()) {
            C09T7 c09t7 = C09T7.LIZ;
            if (C09T7.LJIILIIL) {
                return;
            }
            C201955140j.LIZLLL(C11YP.LIZIZ, C09T7.LIZIZ, "destroySDKHandler called by outside.");
            C23250099c.LIZLLL(C09T7.LIZIZ(), null, null, new C09T2(null), 3);
            C09TF c09tf = C09T7.LJI;
            if ((c09tf != null ? c09tf.LJI : null) != C09TL.IDLE || (iTTSCallback = C09T7.LJIIIZ) == null) {
                return;
            }
            iTTSCallback.onCancel(1);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.audio.ITTSService
    public final boolean isStreamReading() {
        return C09T0.LIZ() && C09T7.LIZLLL == 5421;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.ITTSService
    public final void stopStreamReading() {
        if (C09T0.LIZ()) {
            C09T7 c09t7 = C09T7.LIZ;
            C201955140j.LIZLLL(C11YP.LIZIZ, C09T7.LIZIZ, "stopReading called by outside.");
            C23250099c.LIZLLL(C09T7.LIZIZ(), null, null, new C09T4(null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.audio.ITTSService
    public final void initAudioSDKHandler(String str) {
        if (str != null && str.length() != 0 && C09T0.LIZ()) {
            C09T7 c09t7 = C09T7.LIZ;
            C201955140j.LIZLLL(C11YP.LIZIZ, C09T7.LIZIZ, "createSDKHandler called by outside.");
            C09T7.LIZJ.LIZJ = str;
            C23250099c.LIZLLL(C09T7.LIZIZ(), null, null, new C09T3(null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.audio.ITTSService
    public final void setForbidDestroy(boolean z) {
        if (C09T0.LIZ()) {
            C09T7.LJIILIIL = z;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.audio.ITTSService
    public final void initAudioSDKHandler(CreativeInfo creativeInfo) {
        String absolutePath;
        File parentFile = new C0VSJ(C2279808wW.LIZJ(creativeInfo, "")).getParentFile();
        if (parentFile != null) {
            absolutePath = parentFile.getAbsolutePath();
        } else {
            absolutePath = null;
        }
        initAudioSDKHandler(absolutePath);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    @Override // com.ss.android.ugc.aweme.services.audio.ITTSService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchTTSAudioFile(java.lang.String r15, java.lang.String r16, java.lang.String r17, com.ss.android.ugc.aweme.creative.model.CreativeInfo r18, boolean r19, boolean r20, com.ss.android.ugc.aweme.services.audio.ITTSCallback r21, X.InterfaceC1364105Vn<? super kotlin.Unit> r22) {
        /*
            r14 = this;
            r3 = r22
            boolean r0 = r3 instanceof X.C090M
            if (r0 == 0) goto L48
            r4 = r3
            X.090M r4 = (X.C090M) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r4.LLILLL = r2
        L14:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L27
            if (r0 != r1) goto L4e
            X.C155000ia.LIZIZ(r3)
        L24:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L27:
            X.C155000ia.LIZIZ(r3)
            X.1DFB r0 = X.C0PEM.LIZJ
            X.08zt r5 = new X.08zt
            r13 = 0
            r12 = r21
            r11 = r20
            r10 = r19
            r9 = r18
            r8 = r17
            r7 = r16
            r6 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r4.LLILLL = r1
            java.lang.Object r0 = X.C23250099c.LJI(r4, r0, r5)
            if (r0 != r2) goto L24
            return r2
        L48:
            X.090M r4 = new X.090M
            r4.<init>(r14, r3)
            goto L14
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2376609Sy.fetchTTSAudioFile(java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.creative.model.CreativeInfo, boolean, boolean, com.ss.android.ugc.aweme.services.audio.ITTSCallback, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    @Override // com.ss.android.ugc.aweme.services.audio.ITTSService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchTTSAudioFile(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, boolean r19, boolean r20, com.ss.android.ugc.aweme.services.audio.ITTSCallback r21, X.InterfaceC1364105Vn<? super kotlin.Unit> r22) {
        /*
            r14 = this;
            r3 = r22
            boolean r0 = r3 instanceof X.C090N
            if (r0 == 0) goto L48
            r4 = r3
            X.090N r4 = (X.C090N) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r4.LLILLL = r2
        L14:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L27
            if (r0 != r1) goto L4e
            X.C155000ia.LIZIZ(r3)
        L24:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L27:
            X.C155000ia.LIZIZ(r3)
            X.1DFB r0 = X.C0PEM.LIZJ
            X.08zu r5 = new X.08zu
            r13 = 0
            r12 = r21
            r11 = r20
            r10 = r19
            r6 = r18
            r9 = r17
            r8 = r16
            r7 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r4.LLILLL = r1
            java.lang.Object r0 = X.C23250099c.LJI(r4, r0, r5)
            if (r0 != r2) goto L24
            return r2
        L48:
            X.090N r4 = new X.090N
            r4.<init>(r14, r3)
            goto L14
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2376609Sy.fetchTTSAudioFile(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, com.ss.android.ugc.aweme.services.audio.ITTSCallback, X.05Vn):java.lang.Object");
    }
}
