package X;

import android.content.Intent;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0KzH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C535450KzH implements InterfaceC345200Dg6 {
    @Override // X.InterfaceC345200Dg6
    public final void LIZIZ(C1DRG c1drg) {
    }

    @Override // X.InterfaceC345200Dg6
    public final String getName() {
        return "c2pa_read_task";
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0066 -> B:11:0x0037). Please report as a decompilation issue!!! */
    @Override // X.InterfaceC345200Dg6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(android.content.Intent r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            r14 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C535460KzI
            if (r0 == 0) goto Lb0
            r13 = r3
            X.0KzI r13 = (X.C535460KzI) r13
            int r2 = r13.LLIZLLLIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb0
            int r2 = r2 - r1
            r13.LLIZLLLIL = r2
        L14:
            java.lang.Object r7 = r13.LLILZLL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r13.LLIZLLLIL
            r4 = 1
            r12 = 0
            java.lang.String r3 = "key_choose_media_data"
            if (r0 == 0) goto L6b
            if (r0 != r4) goto Lbd
            com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r8 = r13.LLILZIL
            java.lang.Object r6 = r13.LLILZ
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r1 = r13.LLILLL
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r13.LLILLJJLI
            java.lang.Object r15 = r13.LL
            android.content.Intent r15 = (android.content.Intent) r15
            X.C155000ia.LIZIZ(r7)
        L37:
            com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo r7 = (com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo) r7
            r8.aigcInfo = r7
        L3b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lb7
            java.lang.Object r8 = r6.next()
            com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r8 = (com.ss.android.ugc.aweme.mediachoose.helper.MediaModel) r8
            if (r8 == 0) goto L3b
            X.140D r7 = X.C140D.LIZ
            if (r2 == 0) goto L69
            com.ss.android.ugc.aweme.creative.model.CreativeInfo r9 = r2.creativeInfo
        L4f:
            r13.LL = r15
            r13.LLILLJJLI = r2
            r13.LLILLL = r1
            r13.LLILZ = r6
            r13.LLILZIL = r8
            r13.LLIZLLLIL = r4
            r7.getClass()
            long r10 = X.C140D.LJIIZILJ()
            java.lang.Object r7 = r7.LJIILJJIL(r8, r9, r10, r12, r13)
            if (r7 != r5) goto L37
            return r5
        L69:
            r9 = r12
            goto L4f
        L6b:
            X.C155000ia.LIZIZ(r7)
            java.util.ArrayList r6 = r15.getParcelableArrayListExtra(r3)
            if (r6 != 0) goto L77
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L77:
            java.lang.String r0 = "key_short_video_context"
            android.os.Parcelable r2 = r15.getParcelableExtra(r0)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = (com.ss.android.ugc.aweme.shortvideo.ShortVideoContext) r2
            boolean r0 = X.C275780ArQ.LIZJ()
            if (r0 != 0) goto L88
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L88:
            android.os.Bundle r1 = r15.getExtras()     // Catch: java.lang.Exception -> L8d
            goto L92
        L8d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r1 = r12
        L92:
            if (r1 == 0) goto La4
            java.lang.String r0 = "key_choose_scene"
            int r1 = r1.getInt(r0)
            r0 = 19
            if (r1 != r0) goto La4
            r0 = 1
        L9f:
            if (r0 == 0) goto La6
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        La4:
            r0 = 0
            goto L9f
        La6:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r6)
            java.util.Iterator r6 = r1.iterator()
            goto L3b
        Lb0:
            X.0KzI r13 = new X.0KzI
            r13.<init>(r14, r3)
            goto L14
        Lb7:
            r15.putExtra(r3, r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Lbd:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C535450KzH.LIZ(android.content.Intent, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC345200Dg6
    public final Object LIZJ(C1DRG c1drg, Intent intent, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return C345230Dg9.LIZIZ(this, intent, interfaceC1364105Vn);
    }
}
