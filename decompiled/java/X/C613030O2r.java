package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.Map;

/* JADX INFO: renamed from: X.0O2r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C613030O2r implements InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>, InterfaceC842703Qz {
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    @Override // X.InterfaceC1631620sYq
    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(com.ss.android.ugc.aweme.feed.model.VideoItemParams r13, java.util.Map<java.lang.String, ? extends java.lang.Object> r14, X.InterfaceC1364105Vn<? super X.AbstractC1387105bp> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof X.C613040O2s
            if (r0 == 0) goto L81
            r2 = r15
            X.0O2s r2 = (X.C613040O2s) r2
            int r3 = r2.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L81
            int r3 = r3 - r1
            r2.LLILLL = r3
        L12:
            java.lang.Object r4 = r2.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r2.LLILLL
            r3 = 1
            if (r0 == 0) goto L29
            if (r0 != r3) goto L87
            X.C155000ia.LIZIZ(r4)
        L22:
            X.05bq r1 = new X.05bq
            r0 = 0
            r1.<init>(r0)
            return r1
        L29:
            X.C155000ia.LIZIZ(r4)
            java.lang.StringBuilder r4 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "triggered button click event. params: "
            r4.append(r0)
            r6 = r14
            r4.append(r6)
            X.C2188811AlT.LIZIZ(r4)
            if (r13 == 0) goto L8f
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r13.getAweme()
            if (r7 == 0) goto L8f
            androidx.fragment.app.Fragment r0 = r13.fragment
            if (r0 != 0) goto L4b
            X.05br r0 = X.C1387305br.LIZIZ
            return r0
        L4b:
            android.content.Context r5 = r0.getContext()
            if (r5 != 0) goto L54
            X.05br r0 = X.C1387305br.LIZIZ
            return r0
        L54:
            com.bytedance.android.btm.api.model.PageFinder r9 = com.bytedance.android.btm.api.model.PageFinder.via(r0)
            X.0h24 r0 = X.C1188460h24.LIZ
            r0.getClass()
            java.lang.String r4 = "video_custom"
            java.lang.String r0 = "homepage_hot"
            X.0h22 r8 = X.C1188460h24.LJ(r7, r4, r0)
            if (r8 != 0) goto L6a
            X.05br r0 = X.C1387305br.LIZIZ
            return r0
        L6a:
            X.1An6 r10 = X.C0SUC.LIZ(r5)
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.0O2u r4 = new X.0O2u
            r11 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r2.LLILLL = r3
            java.lang.Object r0 = X.C23250099c.LJI(r2, r0, r4)
            if (r0 != r1) goto L22
            return r1
        L81:
            X.0O2s r2 = new X.0O2s
            r2.<init>(r12, r15)
            goto L12
        L87:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L8f:
            X.05br r0 = X.C1387305br.LIZIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C613030O2r.invoke(com.ss.android.ugc.aweme.feed.model.VideoItemParams, java.util.Map, X.05Vn):java.lang.Object");
    }
}
