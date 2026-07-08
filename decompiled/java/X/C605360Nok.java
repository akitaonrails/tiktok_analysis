package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Nok, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C605360Nok extends AbstractC605390Non {
    public final Function1<BulletinAccountInfoResponse, Unit> LIZLLL;

    @Override // X.AbstractC605390Non
    public final boolean LJ() {
        return !C0OJX.LIZIZ();
    }

    public C605360Nok(C605220NoW c605220NoW) {
        super("profile_db", Mp4ScreenVideoLoadTimeout.CONTROL, new C605410Nop(6000L));
        this.LIZLLL = c605220NoW;
    }

    @Override // X.AbstractC605390Non
    public final InterfaceC346201Wa<Boolean> LIZ(InterfaceC605380Nom interfaceC605380Nom) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("task:");
        sbLIZ.append("profile_network");
        sbLIZ.append(":done");
        return interfaceC605380Nom.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae  */
    @Override // X.AbstractC605390Non
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C605550Np3 r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C605300Noe
            if (r0 == 0) goto Lae
            r4 = r11
            X.0Noe r4 = (X.C605300Noe) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lae
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r6 = r4.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZIL
            r5 = 2
            r7 = 1
            r2 = 0
            if (r0 == 0) goto L2e
            if (r0 == r7) goto L4b
            if (r0 != r5) goto Lb5
            X.C155000ia.LIZIZ(r6)
        L26:
            java.lang.String r0 = "BBArch [ProfileDbLoadTask] DB cache dispatched to DC"
            X.C0OPX.LJII(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2e:
            X.C155000ia.LIZIZ(r6)
            long r0 = r10.LIZJ
            java.lang.String r8 = java.lang.String.valueOf(r0)
            X.1DFB r1 = X.C0PEM.LIZJ
            X.0NoX r0 = new X.0NoX
            r0.<init>(r8, r2)
            r4.LL = r10
            r4.LLILLJJLI = r8
            r4.LLILZIL = r7
            java.lang.Object r6 = X.C23250099c.LJI(r4, r1, r0)
            if (r6 != r3) goto L54
            return r3
        L4b:
            java.lang.Object r8 = r4.LLILLJJLI
            java.lang.String r8 = (java.lang.String) r8
            X.0Np3 r10 = r4.LL
            X.C155000ia.LIZIZ(r6)
        L54:
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse r6 = (com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse) r6
            if (r6 != 0) goto L69
            X.0Np1 r1 = r10.LIZIZ
            java.lang.String r0 = r9.LIZLLL()
            X.C605530Np1.LIZ(r1, r0)
            java.lang.String r0 = "BBArch [ProfileDbLoadTask] DB returned null"
            X.C0OPX.LJII(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L69:
            X.0Noo r0 = X.C605400Noo.LIZ
            r0.getClass()
            X.0OJc r0 = X.C605400Noo.LIZ(r8)
            r0.LJII = r7
            X.0Np1 r1 = r10.LIZIZ
            java.lang.String r0 = "profile_network"
            boolean r0 = X.C605470Nov.LIZ(r1, r0)
            if (r0 == 0) goto L86
            java.lang.String r0 = "BBArch [ProfileDbLoadTask] network already done — skipping DC write"
            X.C0OPX.LJII(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L86:
            X.0OI4 r0 = r10.LIZ
            X.C0OI9.LIZ(r0, r6, r7)
            X.0Np1 r1 = r10.LIZIZ
            java.lang.String r0 = r9.LIZJ()
            X.C605530Np1.LIZ(r1, r0)
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.08pq r1 = r0.LLIILII()
            X.0NoY r0 = new X.0NoY
            r0.<init>(r9, r6, r2)
            r4.LL = r2
            r4.LLILLJJLI = r2
            r4.LLILZIL = r5
            java.lang.Object r0 = X.C23250099c.LJI(r4, r1, r0)
            if (r0 != r3) goto L26
            return r3
        Lae:
            X.0Noe r4 = new X.0Noe
            r4.<init>(r9, r11)
            goto L12
        Lb5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C605360Nok.LIZIZ(X.0Np3, X.05Vn):java.lang.Object");
    }
}
