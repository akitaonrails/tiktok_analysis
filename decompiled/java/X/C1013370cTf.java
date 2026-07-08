package X;

import java.util.List;

/* JADX INFO: renamed from: X.0cTf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1013370cTf implements InterfaceC1013400cTi {
    public final C1013550cTx LIZ;
    public final List<C1013410cTj> LIZIZ;
    public final /* synthetic */ C1013350cTd LIZJ;

    @Override // X.InterfaceC1013400cTi
    public final C0RJC xc() {
        return this.LIZJ.LLILLJJLI.getPlayerManager();
    }

    @Override // X.InterfaceC1013400cTi
    public final List<C1013410cTj> getStats() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1013400cTi
    public final C1013550cTx yc() {
        return this.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1013370cTf(X.C1013350cTd r8) {
        /*
            r7 = this;
            r7.LIZJ = r8
            r7.<init>()
            X.0cTx r0 = r8.LLILZLL
            r7.LIZ = r0
            X.0cTh r0 = r8.LLILLJJLI
            com.ss.android.ugc.aweme.model.AnoleMultiContentModel r0 = r0.LIZ()
            if (r0 == 0) goto L54
            java.util.List r1 = r0.getContentList()
            if (r1 == 0) goto L54
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r6.<init>(r0)
            java.util.Iterator r5 = r1.iterator()
            r4 = 0
        L27:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r5.next()
            int r3 = r4 + 1
            if (r4 < 0) goto L49
            com.ss.android.ugc.aweme.model.AnoleMultiContentItemModel r0 = (com.ss.android.ugc.aweme.model.AnoleMultiContentItemModel) r0
            X.0cTj r2 = new X.0cTj
            java.lang.Integer r1 = r0.getVideoLength()
            java.lang.String r0 = r0.getVid()
            r2.<init>(r1, r0, r4)
            r6.add(r2)
            r4 = r3
            goto L27
        L49:
            X.C1697810uHb.LJIJI()
            r0 = 0
            throw r0
        L4e:
            java.util.List r0 = X.C13LP.LLIIII(r6)
            if (r0 != 0) goto L56
        L54:
            X.13BV r0 = X.C13BV.INSTANCE
        L56:
            r7.LIZIZ = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1013370cTf.<init>(X.0cTd):void");
    }
}
