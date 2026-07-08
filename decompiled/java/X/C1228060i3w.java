package X;

import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0i3w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1228060i3w extends C1225970i0Z {
    public final C1227070i2L LLILLL;
    public C099G LLILZ;
    public List<? extends AbstractC1223800hx4> LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public List<? extends IMUser> LLJILJIL;

    @Override // X.C1225970i0Z, X.InterfaceC1224180hxg
    public final void LJJIIJ() {
        this.LLILZ = C23250099c.LIZIZ(C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ)), null, null, new C1228070i3x(this, null), 3);
    }

    public C1228060i3w(C1227070i2L c1227070i2L) {
        super(c1227070i2L);
        this.LLILLL = c1227070i2L;
        this.LLILZLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(779));
        this.LLIZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3271));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3270));
        this.LLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3269));
        this.LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3267));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3268));
        this.LLJILJIL = C13BV.INSTANCE;
    }

    public static C1228140i44 LJJJJIZL(List list) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(((BaseContact) obj).getUid())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            IMUser iMUser = (IMUser) obj2;
            C2201941BFw c2201941BFw = IMUser.Companion;
            int followStatus = iMUser.getFollowStatus();
            c2201941BFw.getClass();
            if (C2201941BFw.LIZLLL(followStatus)) {
                if (!C1227320i2k.LIZLLL(iMUser)) {
                    arrayList2.add(obj2);
                } else {
                    arrayList3.add(obj2);
                }
            } else if (!C1227320i2k.LIZ(iMUser) && !C1227320i2k.LIZLLL(iMUser)) {
                arrayList2.add(obj2);
            } else {
                arrayList3.add(obj2);
            }
        }
        Pair pair = new Pair(arrayList2, arrayList3);
        return new C1228140i44((List) pair.getFirst(), (List) pair.getSecond());
    }

    @Override // X.C1225970i0Z, X.InterfaceC1224180hxg
    public final Object LJJIL(InterfaceC1364105Vn<? super AbstractC1223670hwr> interfaceC1364105Vn) {
        return C2296808zG.LJ(new C1534305zZ(this, null), interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJJL(X.InterfaceC1364105Vn<? super X.C189200o6<? extends java.util.List<? extends com.ss.android.ugc.aweme.im.contacts.api.model.IMUser>>> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C1228080i3y
            if (r0 == 0) goto L22
            r5 = r9
            X.0i3y r5 = (X.C1228080i3y) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r6 = 1
            if (r0 == 0) goto L30
            if (r0 != r6) goto L28
            java.lang.Object r3 = r5.LL
            goto L97
        L22:
            X.0i3y r5 = new X.0i3y
            r5.<init>(r8, r9)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r1)
            X.069P r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.LIZ     // Catch: java.lang.Throwable -> L9e
            r0.getClass()     // Catch: java.lang.Throwable -> L9e
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()     // Catch: java.lang.Throwable -> L9e
            X.06pF r1 = r0.LIZ()     // Catch: java.lang.Throwable -> L9e
            X.01GW r0 = r8.LLILZLL     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L9e
            java.util.List r0 = r1.LJFF(r0, r6)     // Catch: java.lang.Throwable -> L9e
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9e
            r3.<init>()     // Catch: java.lang.Throwable -> L9e
            java.util.Iterator r7 = r0.iterator()     // Catch: java.lang.Throwable -> L9e
        L55:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L8a
            java.lang.Object r2 = r7.next()     // Catch: java.lang.Throwable -> L9e
            r1 = r2
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r1 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) r1     // Catch: java.lang.Throwable -> L9e
            java.lang.String r0 = r1.getUid()     // Catch: java.lang.Throwable -> L9e
            boolean r0 = X.C1572306Dp.LIZ(r0)     // Catch: java.lang.Throwable -> L9e
            if (r0 != 0) goto L81
            java.lang.String r0 = r1.getNickName()     // Catch: java.lang.Throwable -> L9e
            boolean r0 = X.C123100dR.LIZ(r0)     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L81
            java.lang.String r0 = r1.getUniqueId()     // Catch: java.lang.Throwable -> L9e
            boolean r0 = X.C123100dR.LIZ(r0)     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L81
            goto L83
        L81:
            r0 = 0
            goto L84
        L83:
            r0 = 1
        L84:
            if (r0 == 0) goto L55
            r3.add(r2)     // Catch: java.lang.Throwable -> L9e
            goto L55
        L8a:
            java.lang.String r0 = "MUF"
            r5.LL = r3     // Catch: java.lang.Throwable -> L9e
            r5.LLILZ = r6     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r0 = r8.LJJJJZ(r0, r3, r5)     // Catch: java.lang.Throwable -> L9e
            if (r0 != r4) goto L9a
            return r4
        L97:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L9e
        L9a:
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L9e
            return r3
        L9e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r3 = new X.00Yq
            r3.<init>(r0)
            X.C189200o6.m2constructorimpl(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1228060i3w.LJJJJJL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cb  */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.0i3w] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.1BGS] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJL(X.InterfaceC1364105Vn<? super java.util.List<? extends com.ss.android.ugc.aweme.im.contacts.api.model.IMUser>> r13) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1228060i3w.LJJJJL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f4 A[RETURN] */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.0i3w] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJLI(X.InterfaceC1364105Vn<? super java.util.List<? extends com.ss.android.ugc.aweme.im.contacts.api.model.IMUser>> r15) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1228060i3w.LJJJJLI(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJLL(X.InterfaceC1364105Vn<? super java.util.List<? extends com.ss.android.ugc.aweme.im.contacts.api.model.IMUser>> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C1228120i42
            if (r0 == 0) goto L9d
            r7 = r12
            X.0i42 r7 = (X.C1228120i42) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9d
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r0 = r7.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r7.LLILLL
            r3 = 2
            r8 = 1
            if (r1 == 0) goto L28
            if (r1 == r8) goto L4d
            if (r1 != r3) goto La4
            X.C155000ia.LIZIZ(r0)
        L25:
            java.util.List<? extends com.ss.android.ugc.aweme.im.contacts.api.model.IMUser> r0 = r11.LLJILJIL
            return r0
        L28:
            X.C155000ia.LIZIZ(r0)
            X.069P r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()
            X.1BGS r4 = r0.LJ()
            X.01GW r0 = r11.LLIZLLLIL
            java.lang.Object r6 = r0.getValue()
            java.util.List r6 = (java.util.List) r6
            java.lang.String r5 = "contact_selector"
            r7.LLILLL = r8
            r10 = 0
            r9 = r8
            java.lang.Object r0 = r4.LJIILIIL(r5, r6, r7, r8, r9, r10)
            if (r0 != r2) goto L50
            return r2
        L4d:
            X.C155000ia.LIZIZ(r0)
        L50:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r0.iterator()
        L5b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r4 = r5.next()
            r1 = r4
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r1 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) r1
            java.lang.String r0 = r1.getNickName()
            if (r0 == 0) goto L74
            int r0 = r0.length()
            if (r0 != 0) goto L81
        L74:
            java.lang.String r0 = r1.getUniqueId()
            if (r0 == 0) goto L5b
            int r0 = r0.length()
            if (r0 != 0) goto L81
            goto L5b
        L81:
            r6.add(r4)
            goto L5b
        L85:
            Y.AComparatorS516S0100000_19 r1 = new Y.AComparatorS516S0100000_19
            r0 = 8
            r1.<init>(r11, r0)
            java.util.List r1 = X.C13LP.LJLLLL(r1, r6)
            r11.LLJILJIL = r1
            r7.LLILLL = r3
            java.lang.String r0 = "stick_top"
            java.lang.Object r0 = r11.LJJJJZ(r0, r1, r7)
            if (r0 != r2) goto L25
            return r2
        L9d:
            X.0i42 r7 = new X.0i42
            r7.<init>(r11, r12)
            goto L12
        La4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1228060i3w.LJJJJLL(X.05Vn):java.lang.Object");
    }

    public final List<C1224840hyk> LJJJJJ(List<? extends IMUser> list, Set<String> set) {
        Map mapLIZJ;
        HashSet hashSet = new HashSet();
        ArrayList<IMUser> arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (hashSet.add(((BaseContact) obj).getUid())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (IMUser iMUser : arrayList) {
            if (C13LP.LJJJJ(iMUser.getUid(), set)) {
                mapLIZJ = C2097608Jq.LJIIIIZZ(new Pair("index_tag", "combined_suggested"), new Pair("is_recommend_item", "1"));
            } else {
                mapLIZJ = C2097908Jt.LIZJ(new Pair("index_tag", "combined_suggested"));
            }
            arrayList2.add(C1227320i2k.LJI(iMUser, null, this.LLILLL, null, mapLIZJ, 5));
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJZ(java.lang.String r11, java.util.List r12, X.InterfaceC1364105Vn r13) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1228060i3w.LJJJJZ(java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }
}
