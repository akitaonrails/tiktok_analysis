package X;

import java.util.List;

/* JADX INFO: renamed from: X.0cSs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1012880cSs implements InterfaceC1013030cT7 {
    public final C1012900cSu LIZ;
    public final List<C1012890cSt> LIZIZ;
    public final /* synthetic */ C1012920cSw LIZJ;

    @Override // X.InterfaceC1013030cT7
    public final C1012900cSu LIZ() {
        return this.LIZJ.LLILZLL;
    }

    @Override // X.InterfaceC1013030cT7
    public final List<C1012890cSt> getStats() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1013030cT7
    public final C1012900cSu yc() {
        return this.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1012880cSs(X.C1012920cSw r7) {
        /*
            r6 = this;
            r6.LIZJ = r7
            r6.<init>()
            X.0cSu r0 = r7.LLILZLL
            r6.LIZ = r0
            X.0cSo r0 = r7.LLILLJJLI
            com.ss.android.ugc.aweme.model.AnoleAdCardModel r0 = r0.LIZ()
            if (r0 == 0) goto L5e
            java.util.List r1 = r0.getProductList()
            if (r1 == 0) goto L5e
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r5.<init>(r0)
            java.util.Iterator r4 = r1.iterator()
            r3 = 0
        L27:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L58
            java.lang.Object r0 = r4.next()
            int r2 = r3 + 1
            if (r3 < 0) goto L53
            com.ss.android.ugc.aweme.model.AnoleProductModel r0 = (com.ss.android.ugc.aweme.model.AnoleProductModel) r0
            X.0cSt r1 = new X.0cSt
            com.ss.android.ugc.aweme.model.AnoleVideoDataModel r0 = r0.getVideoData()
            if (r0 == 0) goto L51
            java.lang.Integer r0 = r0.getVideoLength()
            if (r0 == 0) goto L51
            int r0 = r0.intValue()
        L49:
            r1.<init>(r3, r0)
            r5.add(r1)
            r3 = r2
            goto L27
        L51:
            r0 = 0
            goto L49
        L53:
            X.C1697810uHb.LJIJI()
            r0 = 0
            throw r0
        L58:
            java.util.List r0 = X.C13LP.LLIIII(r5)
            if (r0 != 0) goto L60
        L5e:
            X.13BV r0 = X.C13BV.INSTANCE
        L60:
            r6.LIZIZ = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1012880cSs.<init>(X.0cSw):void");
    }
}
