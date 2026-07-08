package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: renamed from: X.0Nox, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C605490Nox extends AbstractC605390Non {
    public final String LIZLLL;

    @Override // X.AbstractC605390Non
    public final boolean LJ() {
        return !C0OJX.LIZIZ();
    }

    public C605490Nox(String str) {
        super("list_db", Mp4ScreenVideoLoadTimeout.CONTROL, new C605410Nop(6000L));
        this.LIZLLL = str;
    }

    @Override // X.AbstractC605390Non
    public final InterfaceC346201Wa<Boolean> LIZ(InterfaceC605380Nom interfaceC605380Nom) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("task:");
        sbLIZ.append("list_network");
        sbLIZ.append(":done");
        return interfaceC605380Nom.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    @Override // X.AbstractC605390Non
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C605550Np3 r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C605510Noz
            if (r0 == 0) goto L5c
            r6 = r9
            X.0Noz r6 = (X.C605510Noz) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5c
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r4 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L47
            if (r0 != r2) goto Laa
            X.0Np3 r8 = r6.LL
            X.C155000ia.LIZIZ(r4)
        L25:
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse r4 = (com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse) r4
            if (r4 == 0) goto L99
            java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItem> r0 = r4.bulletinItems
            boolean r0 = X.C866950Xzh.LIZIZ(r0)
            if (r0 == 0) goto L99
            int r0 = r4.statusCode
            if (r0 != 0) goto L99
            X.0Np1 r1 = r8.LIZIZ
            java.lang.String r0 = "list_network"
            boolean r0 = X.C605470Nov.LIZ(r1, r0)
            if (r0 == 0) goto L62
            java.lang.String r0 = "BBArch [ListDbLoadTask] network already done — skipping DC write"
            X.C0OPX.LJII(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L47:
            X.C155000ia.LIZIZ(r4)
            X.1DFB r1 = X.C0PEM.LIZJ
            X.0Noy r0 = new X.0Noy
            r0.<init>(r7, r3)
            r6.LL = r8
            r6.LLILZ = r2
            java.lang.Object r4 = X.C23250099c.LJI(r6, r1, r0)
            if (r4 != r5) goto L25
            return r5
        L5c:
            X.0Noz r6 = new X.0Noz
            r6.<init>(r7, r9)
            goto L12
        L62:
            X.0OI4 r2 = r8.LIZ
            kotlin.jvm.internal.AwS588S0100000_9 r1 = new kotlin.jvm.internal.AwS588S0100000_9
            r0 = 441(0x1b9, float:6.18E-43)
            r1.<init>(r4, r0)
            r2.LJFF(r1)
            X.0Np1 r1 = r8.LIZIZ
            java.lang.String r0 = r7.LIZJ()
            X.C605530Np1.LIZ(r1, r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "BBArch [ListDbLoadTask] DB data proposed to DC, items="
            r1.append(r0)
            java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItem> r0 = r4.bulletinItems
            if (r0 == 0) goto L8c
            int r0 = r0.size()
            java.lang.Integer r3 = X.C2286608xc.LJ(r0)
        L8c:
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C0OPX.LJII(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L99:
            X.0Np1 r1 = r8.LIZIZ
            java.lang.String r0 = r7.LIZLLL()
            X.C605530Np1.LIZ(r1, r0)
            java.lang.String r0 = "BBArch [ListDbLoadTask] DB returned null or empty"
            X.C0OPX.LJII(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Laa:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C605490Nox.LIZIZ(X.0Np3, X.05Vn):java.lang.Object");
    }
}
