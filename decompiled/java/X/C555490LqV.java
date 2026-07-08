package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0LqV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C555490LqV {
    public final InterfaceC497601wk LIZ;
    public final InterfaceC561350Lzx LIZIZ;
    public final Map<String, C09AE> LIZJ;
    public final Map<String, C09AE> LIZLLL;
    public InterfaceC555450LqR LJ;

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.draft.model.AwemeDraft r16, X.InterfaceC1364105Vn<? super kotlin.Unit> r17) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C555490LqV.LIZIZ(com.ss.android.ugc.aweme.draft.model.AwemeDraft, X.05Vn):java.lang.Object");
    }

    public C555490LqV(C054G c054g, InterfaceC561350Lzx interfaceC561350Lzx, Map map, Map map2) {
        this.LIZ = c054g;
        this.LIZIZ = interfaceC561350Lzx;
        this.LIZJ = map;
        this.LIZLLL = map2;
    }

    public final void LIZJ(String str, String str2, C561130Lzb c561130Lzb, String str3) {
        List<? extends C561950M2f> listLLIIII = C13LP.LLIIII(this.LIZIZ.Ew());
        Iterator<? extends C561950M2f> it2 = listLLIIII.iterator();
        long j = 0;
        while (it2.hasNext()) {
            j += ((C0M0P) it2.next()).LJI;
        }
        this.LIZIZ.clearAll();
        this.LIZIZ.Bw(listLLIIII);
        InterfaceC555450LqR interfaceC555450LqR = this.LJ;
        if (interfaceC555450LqR != null) {
            interfaceC555450LqR.nR();
        }
        C0MJM.LIZIZ(listLLIIII.size(), str2, str, j, str3);
        InterfaceC497601wk interfaceC497601wk = this.LIZ;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C555430LqP(c561130Lzb, this, str, listLLIIII, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C561130Lzb r8, java.lang.String r9, X.C0M0P r10, X.EnumC545550LaT r11, java.lang.String r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r13 instanceof X.C555470LqT
            if (r0 == 0) goto L9c
            r5 = r13
            X.0LqT r5 = (X.C555470LqT) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9c
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L12:
            java.lang.Object r2 = r5.LLILLL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r4 = 2
            r1 = 1
            if (r0 == 0) goto L26
            if (r0 == r1) goto L7e
            if (r0 != r4) goto La3
            X.C155000ia.LIZIZ(r2)
        L25:
            return r2
        L26:
            X.C155000ia.LIZIZ(r2)
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r3 = r8.LJ(r9)
            if (r3 != 0) goto L3e
            X.0MAY r1 = X.C0MAY.LIZIZ
            java.lang.String r0 = "deleteAwemeDraft -> draft ie null"
            X.C201955140j.LIZJ(r1, r0)
            java.lang.String r0 = "queryNull -> deleteAwemeDraft"
            X.C1AF0.LIZJ(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3e:
            if (r11 == 0) goto L47
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r3.LIZ
            com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel r0 = r0.aiLivePhotoModel
            X.C562560M4o.LJ(r0, r11)
        L47:
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r3.LIZ
            com.ss.android.ugc.aweme.creative.model.DraftBoxModel r0 = r0.draftBoxModel
            r0.draftEnterFrom = r12
            monitor-enter(r8)
            boolean r0 = X.C291100Bb2.LIZ()     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L60
            X.01GW r0 = r8.LIZIZ     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> Lab
            X.0NmG r0 = (X.C603820NmG) r0     // Catch: java.lang.Throwable -> Lab
            r0.LJ(r9)     // Catch: java.lang.Throwable -> Lab
            goto L6d
        L60:
            X.01GW r0 = r8.LIZ     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> Lab
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch: java.lang.Throwable -> Lab
            r0.remove(r9)     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r8)
            goto L6e
        L6d:
            monitor-exit(r8)
        L6e:
            r8.LIZJ(r9)
            r5.LL = r10
            r5.LLILLJJLI = r3
            r5.LLILZIL = r1
            java.lang.Object r0 = r7.LIZIZ(r3, r5)
            if (r0 != r6) goto L85
            return r6
        L7e:
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r3 = r5.LLILLJJLI
            X.0M0P r10 = r5.LL
            X.C155000ia.LIZIZ(r2)
        L85:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0LqS r1 = new X.0LqS
            r0 = 0
            r1.<init>(r7, r10, r3, r0)
            r5.LL = r0
            r5.LLILLJJLI = r0
            r5.LLILZIL = r4
            java.lang.Object r2 = X.C23250099c.LJI(r5, r2, r1)
            if (r2 != r6) goto L25
            return r6
        L9c:
            X.0LqT r5 = new X.0LqT
            r5.<init>(r7, r13)
            goto L12
        La3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lab:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C555490LqV.LIZ(X.0Lzb, java.lang.String, X.0M0P, X.0LaT, java.lang.String, X.05Vn):java.lang.Object");
    }
}
