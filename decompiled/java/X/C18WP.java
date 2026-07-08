package X;

import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;

/* JADX INFO: renamed from: X.18WP, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18WP<T> implements InterfaceC346701Wf {
    public final /* synthetic */ InterfaceC346701Wf LL;
    public final /* synthetic */ C18WR LLILLJJLI;
    public final /* synthetic */ AIChatGenNode LLILLL;
    public final /* synthetic */ String LLILZ;

    public C18WP(InterfaceC346701Wf interfaceC346701Wf, C18WR c18wr, AIChatGenNode aIChatGenNode, String str) {
        this.LL = interfaceC346701Wf;
        this.LLILLJJLI = c18wr;
        this.LLILLL = aIChatGenNode;
        this.LLILZ = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    @Override // X.InterfaceC346701Wf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r9, X.InterfaceC1364105Vn r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C18WQ
            if (r0 == 0) goto L66
            r6 = r10
            X.18WQ r6 = (X.C18WQ) r6
            int r2 = r6.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L66
            int r2 = r2 - r1
            r6.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r7 = 1
            if (r0 == 0) goto L25
            if (r0 != r7) goto L6c
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            X.01Wf r4 = r8.LL
            X.0gEF r9 = (X.InterfaceC1157570gEF) r9
            boolean r0 = r9 instanceof X.C1157450gE3
            java.lang.String r3 = "ai_chat_image_download_success"
            if (r0 == 0) goto L58
            r0 = r9
            X.0gE3 r0 = (X.C1157450gE3) r0
            T r2 = r0.LIZ
            java.lang.String r2 = (java.lang.String) r2
            X.18WR r1 = r8.LLILLJJLI
            com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode r0 = r8.LLILLL
            r1.X1(r2, r0)
            X.18T2 r0 = X.C18T2.LIZ
            java.lang.String r1 = r8.LLILZ
            r0.getClass()
            java.lang.String r0 = "ai_chat_image_download_duration"
            X.C18T2.LJ(r0, r1)
            X.C18T2.LJI(r3, r7)
        L4f:
            r6.LLILLJJLI = r7
            java.lang.Object r0 = r4.emit(r9, r6)
            if (r0 != r5) goto L22
            return r5
        L58:
            boolean r0 = r9 instanceof X.C1155990gBh
            if (r0 == 0) goto L4f
            X.18T2 r0 = X.C18T2.LIZ
            r0.getClass()
            r0 = 0
            X.C18T2.LJI(r3, r0)
            goto L4f
        L66:
            X.18WQ r6 = new X.18WQ
            r6.<init>(r8, r10)
            goto L12
        L6c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18WP.emit(java.lang.Object, X.05Vn):java.lang.Object");
    }
}
