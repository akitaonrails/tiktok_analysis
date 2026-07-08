package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.0Sje, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C729600Sje {
    public final Map<String, C729690Sjn> LIZ = new LinkedHashMap();
    public final List<String> LIZIZ = new ArrayList();
    public final Map<String, C729700Sjo> LIZJ = new LinkedHashMap();
    public final List<String> LIZLLL = new ArrayList();
    public final C054G LJ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public final Object LJFF = new Object();
    public final C01GW LJI = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(651));
    public C0O05 LJII;

    public final C603820NmG<String, C729670Sjl> LIZ() {
        return (C603820NmG) this.LJI.getValue();
    }

    public final void LJIIIIZZ() {
        List<String> listLL;
        synchronized (this.LIZIZ) {
            try {
                listLL = C13LP.LL(this.LIZIZ, ((Number) C18004073i.LIZ.getValue()).intValue());
                if (!listLL.isEmpty()) {
                    ((ArrayList) this.LIZIZ).removeAll(listLL);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (listLL.isEmpty()) {
            return;
        }
        for (String str : listLL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("schedulePreloadGroupStoryDetail, groupId: ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            long jCurrentTimeMillis = System.currentTimeMillis();
            C099G c099gLIZIZ = C23250099c.LIZIZ(this.LJ, null, null, new C728800SiM(this, str, null), 3);
            synchronized (this.LIZ) {
                try {
                    this.LIZ.put(str, new C729690Sjn(jCurrentTimeMillis, c099gLIZIZ));
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
    }

    public final void LJIIIZ() {
        List listLL;
        synchronized (this.LIZLLL) {
            try {
                listLL = C13LP.LL(this.LIZLLL, ((Number) C18004073i.LIZ.getValue()).intValue());
                if (!listLL.isEmpty()) {
                    ((ArrayList) this.LIZLLL).removeAll(listLL);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (listLL.isEmpty()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("schedulePreloadMemberStoryDetail, memberIds: ");
        sbLIZ.append(listLL);
        C2188811AlT.LIZIZ(sbLIZ);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C099G c099gLIZIZ = C23250099c.LIZIZ(this.LJ, null, null, new C728390Shh(this, listLL, null), 3);
        synchronized (this.LIZJ) {
            try {
                Iterator it2 = listLL.iterator();
                while (it2.hasNext()) {
                    this.LIZJ.put((String) it2.next(), new C729700Sjo(jCurrentTimeMillis, c099gLIZIZ));
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public final boolean LIZIZ(String str) {
        boolean z;
        boolean z2;
        synchronized (this.LIZ) {
            try {
                C729690Sjn c729690Sjn = (C729690Sjn) ((LinkedHashMap) this.LIZ).get(str);
                if (c729690Sjn != null) {
                    if (System.currentTimeMillis() - c729690Sjn.LIZ > 10000) {
                        this.LIZ.remove(str);
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isNecessaryToFetchGroup, ");
            sbLIZ.append(str);
            sbLIZ.append(" is fetching");
            C2188811AlT.LIZIZ(sbLIZ);
            return false;
        }
        synchronized (LIZ()) {
            try {
                if (LIZ().LIZJ(str) != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        if (!z2) {
            return true;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("isNecessaryToFetchGroup, ");
        sbLIZ2.append(str);
        sbLIZ2.append(" was fetched before");
        C2188811AlT.LIZIZ(sbLIZ2);
        return false;
    }

    public final boolean LIZJ(String str) {
        boolean z;
        boolean z2;
        synchronized (this.LIZJ) {
            try {
                C729700Sjo c729700Sjo = (C729700Sjo) ((LinkedHashMap) this.LIZJ).get(str);
                if (c729700Sjo != null) {
                    if (System.currentTimeMillis() - c729700Sjo.LIZ > 10000) {
                        this.LIZJ.remove(str);
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isNecessaryToFetchMember, ");
            sbLIZ.append(str);
            sbLIZ.append(" is fetching");
            C2188811AlT.LIZIZ(sbLIZ);
            return false;
        }
        synchronized (this.LJFF) {
            try {
                if (C1618440sDa.LIZIZ.LJJLIIIJLJLI().LJIIIZ(str) != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        if (!z2) {
            return true;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("isNecessaryToFetchMember, ");
        sbLIZ2.append(str);
        sbLIZ2.append(" was fetched before");
        C2188811AlT.LIZIZ(sbLIZ2);
        return false;
    }

    public final void LJ(List<String> list, boolean z) {
        if (!z) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (LIZIZ(str)) {
                    arrayList.add(str);
                }
            }
            list = arrayList;
        }
        if (list.isEmpty()) {
            return;
        }
        synchronized (this.LIZIZ) {
            try {
                boolean zIsEmpty = ((ArrayList) this.LIZIZ).isEmpty();
                for (String str2 : list) {
                    if (!((ArrayList) this.LIZIZ).contains(str2)) {
                        ((ArrayList) this.LIZIZ).add(str2);
                    }
                }
                boolean zIsEmpty2 = ((ArrayList) this.LIZIZ).isEmpty();
                if (zIsEmpty && !zIsEmpty2) {
                    LJIIIIZZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(java.lang.String r9, X.InterfaceC1364105Vn<? super kotlin.Pair<X.C729670Sjl, java.lang.Boolean>> r10) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C729600Sje.LJI(java.lang.String, X.05Vn):java.lang.Object");
    }

    public final void LJIIJJI(String str, List<? extends Aweme> list) {
        synchronized (this.LJFF) {
            if (list != null) {
                try {
                    for (Aweme aweme : list) {
                        if (C1618440sDa.LIZIZ.LJJLIIIJLJLI().LJIIIZ(AwemeExtKt.getAuthorUid(aweme)) == null) {
                            C728090ShD.LIZ.LIZIZ(aweme, str, true);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.0Sjl] */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.0Sje] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.0Sjl] */
    /* JADX WARN: Type inference failed for: r6v4, types: [X.0Sjl] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.lang.String r12, java.lang.String r13, X.InterfaceC1364105Vn<? super X.C729680Sjm> r14) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C729600Sje.LJFF(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(java.lang.String r6, java.lang.String r7, X.InterfaceC1364105Vn<? super X.C728820SiO> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C729630Sjh
            if (r0 == 0) goto L52
            r4 = r8
            X.0Sjh r4 = (X.C729630Sjh) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L52
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r1 = r4.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZIL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L78
            java.lang.Object r7 = r4.LLILLJJLI
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r4.LL
            java.lang.String r6 = (java.lang.String) r6
            X.C155000ia.LIZIZ(r1)
        L2a:
            java.lang.Object r3 = r5.LJFF
            monitor-enter(r3)
            goto L58
        L2e:
            X.C155000ia.LIZIZ(r1)
            java.util.Map<java.lang.String, X.0Sjo> r1 = r5.LIZJ
            monitor-enter(r1)
            java.util.Map<java.lang.String, X.0Sjo> r0 = r5.LIZJ     // Catch: java.lang.Throwable -> L80
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> L80
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L80
            X.0Sjo r0 = (X.C729700Sjo) r0     // Catch: java.lang.Throwable -> L80
            monitor-exit(r1)
            if (r0 == 0) goto L2a
            X.0957<java.lang.Boolean> r0 = r0.LIZIZ
            if (r0 == 0) goto L2a
            r4.LL = r6
            r4.LLILLJJLI = r7
            r4.LLILZIL = r2
            java.lang.Object r0 = r0.LJLIIIL(r4)
            if (r0 != r3) goto L2a
            return r3
        L52:
            X.0Sjh r4 = new X.0Sjh
            r4.<init>(r5, r8)
            goto L12
        L58:
            X.0sDa r0 = X.C1618440sDa.LIZIZ     // Catch: java.lang.Throwable -> L72
            X.0ShE r0 = r0.LJJLIIIJLJLI()     // Catch: java.lang.Throwable -> L72
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.LJIIIZ(r6)     // Catch: java.lang.Throwable -> L72
            r1 = 0
            if (r2 == 0) goto L70
            boolean r0 = X.C729510SjV.LJJII(r2)     // Catch: java.lang.Throwable -> L72
            if (r0 != 0) goto L70
            X.0SiO r1 = new X.0SiO     // Catch: java.lang.Throwable -> L72
            r1.<init>(r2, r7)     // Catch: java.lang.Throwable -> L72
        L70:
            monitor-exit(r3)
            return r1
        L72:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L72
            monitor-exit(r3)
            throw r0
        L78:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L80:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L80
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C729600Sje.LJII(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02f7 A[PHI: r10
      0x02f7: PHI (r10v6 ??) = (r10v7 ??), (r10v8 ??) binds: [B:97:0x024c, B:132:0x02e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024e  */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r22v0, types: [X.0Sje] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(long r23, java.lang.String r25, java.lang.String r26, X.InterfaceC1364105Vn r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C729600Sje.LIZLLL(long, java.lang.String, java.lang.String, X.05Vn, boolean):java.lang.Object");
    }

    public final C729670Sjl LJIIJ(long j, String str, List list, boolean z, boolean z2) {
        List<C728820SiO> list2;
        C729670Sjl c729670Sjl;
        if (list.isEmpty()) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateCache for ");
        sbLIZ.append(str);
        sbLIZ.append(", isRefresh: ");
        sbLIZ.append(z);
        sbLIZ.append(", size: ");
        sbLIZ.append(list.size());
        C2188811AlT.LIZIZ(sbLIZ);
        synchronized (LIZ()) {
            if (!z) {
                try {
                    C729670Sjl c729670SjlLIZJ = LIZ().LIZJ(str);
                    if (c729670SjlLIZJ != null && (list2 = c729670SjlLIZJ.LIZJ) != null) {
                        list = C13LP.LJLIL(list, list2);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            c729670Sjl = new C729670Sjl(j, z2, list);
            LIZ().LIZLLL(str, c729670Sjl);
        }
        return c729670Sjl;
    }
}
