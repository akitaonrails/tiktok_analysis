package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.im.service.utils.IIMMsgUtilService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: renamed from: X.0YeB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C879090YeB {
    public final C876800YaU LIZ;
    public final InterfaceC879130YeF LIZIZ;
    public final Queue<C876550Ya5> LIZJ;
    public final List<C876550Ya5> LIZLLL;
    public final List<C876550Ya5> LJ;
    public final List<InterfaceC876440YZu> LJFF;

    public final boolean LJIIL() {
        return this.LIZJ.isEmpty() && this.LIZLLL.isEmpty() && this.LJ.isEmpty();
    }

    public C879090YeB(C876800YaU c876800YaU) {
        InterfaceC879130YeF interfaceC879130YeF = new InterfaceC879130YeF() { // from class: X.0YkL
            public final C01GW LIZ = C452501pT.LIZIZ(new C879150YeH());
            public final C01GW LIZIZ = C452501pT.LIZIZ(new C882920YkM());

            @Override // X.InterfaceC879130YeF
            public final C0Y8T LIZ(String str) {
                return C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
            }

            @Override // X.InterfaceC879130YeF
            public final boolean LIZJ(C869590Y9l c869590Y9l) {
                return ((IIMMsgUtilService) this.LIZ.getValue()).LIZJ(c869590Y9l);
            }

            @Override // X.InterfaceC879130YeF
            public final String LIZLLL(C869590Y9l c869590Y9l) {
                return ((IIMMsgUtilService) this.LIZ.getValue()).LIZLLL(c869590Y9l);
            }

            @Override // X.InterfaceC879130YeF
            public final String LJFF(C869590Y9l c869590Y9l) {
                return ((IIMMsgUtilService) this.LIZ.getValue()).LJFF(c869590Y9l);
            }

            @Override // X.InterfaceC879130YeF
            public final IMContact LJI(C0Y8T c0y8t) {
                String conversationId = c0y8t.getConversationId();
                IMAIServiceAPI.LIZ.getClass();
                if (AnonymousClass0629.LIZ().LIZ().LJIL(conversationId)) {
                    return AnonymousClass0629.LIZ().LIZIZ().LJI(AnonymousClass0629.LIZ().LIZIZ().LIZ(C0YNP.LJII(conversationId)));
                }
                IIMContactUtilService.LIZ.getClass();
                IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
                if (iIMContactUtilServiceLIZ != null) {
                    return iIMContactUtilServiceLIZ.LJI(c0y8t);
                }
                return null;
            }

            @Override // X.InterfaceC879130YeF
            public final CharSequence LIZIZ(C869590Y9l c869590Y9l, String str) {
                return ((IIMMsgUtilService) this.LIZ.getValue()).LIZIZ(c869590Y9l, str);
            }

            @Override // X.InterfaceC879130YeF
            public final IMUser LJ(String str, String str2) {
                String str3;
                IMAIServiceAPI.LIZ.getClass();
                InterfaceC1693306k7 interfaceC1693306k7LIZ = AnonymousClass0629.LIZ().LIZ();
                if (str == null) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                if (interfaceC1693306k7LIZ.LJIL(str3)) {
                    return AnonymousClass0629.LIZ().LIZIZ().LJI(AnonymousClass0629.LIZ().LIZIZ().LIZ(C0YNP.LJII(str)));
                }
                IMContactApi.LIZ.getClass();
                return C069P.LIZ().LJ().LIZLLL(str2, null, "im_push");
            }

            @Override // X.InterfaceC879130YeF
            public final C1462005nu LJII(EnumC1461905nt enumC1461905nt, C1461805ns c1461805ns, C879140YeG c879140YeG) {
                C0Z2F c0z2f = (C0Z2F) this.LIZIZ.getValue();
                if (c0z2f != null) {
                    return c0z2f.LIZIZ(enumC1461905nt, c1461805ns, c879140YeG);
                }
                return null;
            }

            @Override // X.InterfaceC879130YeF
            public final Object LJIIIIZZ(String str, String str2, C879110YeD c879110YeD) {
                String str3;
                final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c879110YeD));
                IMAIServiceAPI.LIZ.getClass();
                InterfaceC1693306k7 interfaceC1693306k7LIZ = AnonymousClass0629.LIZ().LIZ();
                if (str == null) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                if (interfaceC1693306k7LIZ.LJIL(str3)) {
                    IMUser iMUserLJI = AnonymousClass0629.LIZ().LIZIZ().LJI(AnonymousClass0629.LIZ().LIZIZ().LIZ(C0YNP.LJII(str)));
                    C189200o6.m2constructorimpl(iMUserLJI);
                    c23260099m.resumeWith(iMUserLJI);
                } else {
                    IMContactApi.LIZ.getClass();
                    C069P.LIZ().LJ().LIZJ(new InterfaceC1480505qt() { // from class: X.05pG
                        @Override // X.InterfaceC1480505qt
                        public final void LIZJ() {
                            InterfaceC1364105Vn<IMUser> interfaceC1364105Vn = c23260099m;
                            C189200o6.m2constructorimpl(null);
                            interfaceC1364105Vn.resumeWith(null);
                        }

                        @Override // X.InterfaceC1480505qt
                        public final void LIZ(Throwable th) {
                            InterfaceC1364105Vn<IMUser> interfaceC1364105Vn = c23260099m;
                            C189200o6.m2constructorimpl(null);
                            interfaceC1364105Vn.resumeWith(null);
                        }

                        @Override // X.InterfaceC1480505qt
                        public final void LIZIZ(IMUser iMUser) {
                            InterfaceC1364105Vn<IMUser> interfaceC1364105Vn = c23260099m;
                            C189200o6.m2constructorimpl(iMUser);
                            interfaceC1364105Vn.resumeWith(iMUser);
                        }
                    }, str2, null, "im_push", false);
                }
                Object objLIZ = c23260099m.LIZ();
                if (objLIZ == C099R.LJFF()) {
                    C099Q.LIZJ(c879110YeD);
                }
                return objLIZ;
            }
        };
        this.LIZ = c876800YaU;
        this.LIZIZ = interfaceC879130YeF;
        this.LIZJ = new LinkedBlockingDeque();
        this.LIZLLL = Collections.synchronizedList(new ArrayList());
        this.LJ = Collections.synchronizedList(new ArrayList());
        this.LJFF = Collections.synchronizedList(new ArrayList());
    }

    public static String LJIIIIZZ(Set set) {
        String displayName;
        ArrayList<IMContact> arrayList = new ArrayList();
        int i = 0;
        for (Object obj : set) {
            int i2 = i + 1;
            if (i >= 0) {
                if (i < 10) {
                    arrayList.add(obj);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (IMContact iMContact : arrayList) {
            if (iMContact.getDisplayName() == null && (iMContact instanceof IMConversation)) {
                displayName = C1383370m6R.LJIIJ(2131829002);
            } else if (iMContact instanceof IMUser) {
                IMUser iMUser = (IMUser) iMContact;
                displayName = C1247000iYU.LIZ(iMUser);
                if (!C123100dR.LIZ(displayName)) {
                    displayName = iMUser.getDisplayName();
                }
            } else {
                displayName = iMContact.getDisplayName();
            }
            if (displayName != null) {
                arrayList2.add(displayName);
            }
        }
        int size = arrayList2.size();
        if (size != 0) {
            if (size != 1) {
                if (size != 2) {
                    return C1710306mr.LIZIZ(2131832194, ListProtector.get(arrayList2, 0), ListProtector.get(arrayList2, 1));
                }
                return C1710306mr.LIZIZ(2131832196, ListProtector.get(arrayList2, 0), ListProtector.get(arrayList2, 1));
            }
            return (String) ListProtector.get(arrayList2, 0);
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0362 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super X.C879180YeK> r33) {
        /*
            Method dump skipped, instruction units count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C879090YeB.LIZ(X.05Vn):java.lang.Object");
    }

    public final void LIZJ(EnumC1989807qq enumC1989807qq) {
        List<InterfaceC876440YZu> list = this.LJFF;
        List<InterfaceC876440YZu> listSubList = list.subList(0, list.size());
        if (!listSubList.isEmpty()) {
            Iterator<InterfaceC876440YZu> it2 = listSubList.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(new ArrayList(this.LIZLLL));
            }
        }
        this.LIZLLL.clear();
        this.LJ.clear();
        C876800YaU c876800YaU = this.LIZ;
        if (c876800YaU != null) {
            C876800YaU.LIZ(c876800YaU, "clear_aggregated_list", C1906580ziK.LJI());
        }
    }

    public final void LIZLLL(EnumC1989807qq enumC1989807qq) {
        List<InterfaceC876440YZu> list = this.LJFF;
        List<InterfaceC876440YZu> listSubList = list.subList(0, list.size());
        if (!listSubList.isEmpty()) {
            Iterator<InterfaceC876440YZu> it2 = listSubList.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(new ArrayList(this.LIZJ));
            }
        }
        ((LinkedBlockingDeque) this.LIZJ).clear();
        C876800YaU c876800YaU = this.LIZ;
        if (c876800YaU != null) {
            C876800YaU.LIZ(c876800YaU, "clear_single_push_queue", C1906580ziK.LJI());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x026c A[PHI: r14
      0x026c: PHI (r14v5 java.lang.String) = (r14v1 java.lang.String), (r14v6 java.lang.String) binds: [B:100:0x026a, B:98:0x0267] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02d1 A[PHI: r14
      0x02d1: PHI (r14v2 java.lang.String) = (r14v1 java.lang.String), (r14v5 java.lang.String) binds: [B:100:0x026a, B:102:0x026e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.InterfaceC1364105Vn<? super X.C879180YeK> r29) {
        /*
            Method dump skipped, instruction units count: 733
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C879090YeB.LJII(X.05Vn):java.lang.Object");
    }

    public final void LJ(List<? extends C869590Y9l> list, EnumC876540Ya4 enumC876540Ya4) {
        List<C876550Ya5> list2 = this.LIZLLL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C869590Y9l c869590Y9l : list) {
            C876550Ya5.LJI.getClass();
            arrayList.add(C876630YaD.LJFF(c869590Y9l, enumC876540Ya4));
        }
        list2.addAll(arrayList);
        C876800YaU c876800YaU = this.LIZ;
        if (c876800YaU != null) {
            C876800YaU.LIZ(c876800YaU, "enqueue_msg_to_aggregated_push", C1906580ziK.LJI());
        }
    }

    public final void LJFF(List<? extends C869590Y9l> list, EnumC876540Ya4 enumC876540Ya4) {
        List<C876550Ya5> list2 = this.LJ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C869590Y9l c869590Y9l : list) {
            C876550Ya5.LJI.getClass();
            arrayList.add(C876630YaD.LJFF(c869590Y9l, enumC876540Ya4));
        }
        list2.addAll(arrayList);
        C876800YaU c876800YaU = this.LIZ;
        if (c876800YaU != null) {
            C876800YaU.LIZ(c876800YaU, "enqueue_msg_to_message_request_aggregated_push", C1906580ziK.LJI());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Set<com.ss.android.ugc.aweme.im.contacts.api.model.IMContact> LJIIJJI(java.util.List<X.C876550Ya5> r12, java.util.Set<java.lang.Long> r13) {
        /*
            r11 = this;
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.util.Iterator r10 = r12.iterator()
        L9:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lc2
            java.lang.Object r6 = r10.next()
            X.0Ya5 r6 = (X.C876550Ya5) r6
            X.0Y9l r9 = r6.LIZJ
            r1 = 0
            if (r9 != 0) goto L22
            X.0Y8T r0 = r6.LIZLLL
            if (r0 == 0) goto Lbf
            X.0Y9l r9 = r0.getLastShowMessage()
        L22:
            r5 = 1
            if (r9 == 0) goto L2d
            int r1 = r9.getConversationType()
            int r0 = X.AbstractC1711506n3.LIZ
            if (r1 == r0) goto L3b
        L2d:
            X.0YaF r1 = r6.LIZ
            X.0YaF r0 = X.EnumC876650YaF.SINGLE_CHAT_CONVERSATION_ID
            if (r1 != r0) goto L83
            java.lang.String r0 = r6.LIZ()
            if (r0 == 0) goto L83
            if (r9 == 0) goto L7a
        L3b:
            long r0 = r9.getSender()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            long r7 = r1.longValue()
            long r3 = X.C461720I8s.LIZJ()
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 == 0) goto L7a
            int r0 = r9.getMsgType()
            if (r0 == r5) goto L7a
            long r4 = r1.longValue()
        L59:
            X.0YeF r3 = r11.LIZIZ
            java.lang.String r1 = r6.LIZ()
            java.lang.String r0 = java.lang.String.valueOf(r4)
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r1 = r3.LJ(r1, r0)
            if (r1 == 0) goto L72
            boolean r0 = r2.contains(r1)
            if (r0 != 0) goto L72
            r2.add(r1)
        L72:
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r13.add(r0)
            goto L9
        L7a:
            java.lang.String r0 = r6.LIZ()
            long r4 = X.C0YNP.LJII(r0)
            goto L59
        L83:
            if (r9 == 0) goto L9f
            int r1 = r9.getConversationType()
            int r0 = X.AbstractC1711506n3.LIZIZ
            if (r1 != r0) goto L9f
        L8d:
            X.0Y8T r1 = r6.LIZLLL
            if (r1 != 0) goto Lac
            X.0YeF r1 = r11.LIZIZ
            java.lang.String r0 = r6.LIZ()
            X.0Y8T r1 = r1.LIZ(r0)
            if (r1 != 0) goto Lac
            goto L9
        L9f:
            X.0Y8T r0 = r6.LIZLLL
            if (r0 == 0) goto L9
            int r1 = r0.getConversationType()
            int r0 = X.AbstractC1711506n3.LIZIZ
            if (r1 != r0) goto L9
            goto L8d
        Lac:
            X.0YeF r0 = r11.LIZIZ
            com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r1 = r0.LJI(r1)
            if (r1 == 0) goto L9
            boolean r0 = r2.contains(r1)
            if (r0 != 0) goto L9
            r2.add(r1)
            goto L9
        Lbf:
            r9 = r1
            goto L22
        Lc2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C879090YeB.LJIIJJI(java.util.List, java.util.Set):java.util.Set");
    }

    public static String LJIIIZ(int i, String str, String str2) {
        if (str != null) {
            if (C879170YeJ.LIZLLL(str)) {
                String str3 = C879170YeJ.LIZIZ(str).LIZ;
                if (i == AbstractC1711506n3.LIZ) {
                    return C1710306mr.LIZIZ(2131845789, str3);
                }
                if (i == AbstractC1711506n3.LIZIZ) {
                    return C1710306mr.LIZIZ(2131845788, str2, str3);
                }
                return "";
            }
            if (C879170YeJ.LIZJ(str)) {
                if (i == AbstractC1711506n3.LIZ) {
                    return C1383370m6R.LJIIJ(2131826313);
                }
                if (i == AbstractC1711506n3.LIZIZ) {
                    return C1710306mr.LIZIZ(2131826312, str2);
                }
                return "";
            }
            return "";
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0104 A[PHI: r0 r1 r2 r3 r4 r5 r10 r12 r15 r22
      0x0104: PHI (r0v24 java.lang.String) = (r0v6 java.lang.String), (r0v25 java.lang.String) binds: [B:71:0x01b6, B:38:0x0102] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r1v4 X.0Y9l) = (r1v1 X.0Y9l), (r1v5 X.0Y9l) binds: [B:71:0x01b6, B:38:0x0102] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r2v3 java.lang.String) = (r2v0 java.lang.String), (r2v4 java.lang.String) binds: [B:71:0x01b6, B:38:0x0102] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r3v13 java.lang.Object) = (r3v2 java.lang.Object), (r3v14 java.lang.Object) binds: [B:71:0x01b6, B:38:0x0102] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r4v6 java.lang.String) = (r4v0 java.lang.String), (r4v7 java.lang.String) binds: [B:71:0x01b6, B:38:0x0102] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r5v2 X.0Y8T) = (r5v0 X.0Y8T), (r5v4 X.0Y8T) binds: [B:71:0x01b6, B:38:0x0102] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r10v3 long) = (r10v0 long), (r10v4 long) binds: [B:71:0x01b6, B:38:0x0102] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r12v4 java.lang.Integer) = (r12v0 java.lang.Integer), (r12v5 java.lang.Integer) binds: [B:71:0x01b6, B:38:0x0102] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r15v4 ??) = (r15v0 X.0Ya5), (r15v5 X.0Ya5) binds: [B:71:0x01b6, B:38:0x0102] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r22v3 com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) = 
      (r22v0 com.ss.android.ugc.aweme.im.contacts.api.model.IMUser)
      (r22v4 com.ss.android.ugc.aweme.im.contacts.api.model.IMUser)
     binds: [B:71:0x01b6, B:38:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013f A[PHI: r0 r1 r2 r3 r4 r10 r12 r15 r22
      0x013f: PHI (r0v22 java.lang.String) = (r0v24 java.lang.String), (r0v25 java.lang.String) binds: [B:40:0x0108, B:38:0x0102] A[DONT_GENERATE, DONT_INLINE]
      0x013f: PHI (r1v2 X.0Y9l) = (r1v4 X.0Y9l), (r1v5 X.0Y9l) binds: [B:40:0x0108, B:38:0x0102] A[DONT_GENERATE, DONT_INLINE]
      0x013f: PHI (r2v1 java.lang.String) = (r2v3 java.lang.String), (r2v4 java.lang.String) binds: [B:40:0x0108, B:38:0x0102] A[DONT_GENERATE, DONT_INLINE]
      0x013f: PHI (r3v11 java.lang.Object) = (r3v13 java.lang.Object), (r3v14 java.lang.Object) binds: [B:40:0x0108, B:38:0x0102] A[DONT_GENERATE, DONT_INLINE]
      0x013f: PHI (r4v4 java.lang.String) = (r4v6 java.lang.String), (r4v7 java.lang.String) binds: [B:40:0x0108, B:38:0x0102] A[DONT_GENERATE, DONT_INLINE]
      0x013f: PHI (r10v1 long) = (r10v3 long), (r10v4 long) binds: [B:40:0x0108, B:38:0x0102] A[DONT_GENERATE, DONT_INLINE]
      0x013f: PHI (r12v2 java.lang.Integer) = (r12v4 java.lang.Integer), (r12v5 java.lang.Integer) binds: [B:40:0x0108, B:38:0x0102] A[DONT_GENERATE, DONT_INLINE]
      0x013f: PHI (r15v1 ??) = (r15v4 ??), (r15v5 X.0Ya5) binds: [B:40:0x0108, B:38:0x0102] A[DONT_GENERATE, DONT_INLINE]
      0x013f: PHI (r22v1 com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) = 
      (r22v3 com.ss.android.ugc.aweme.im.contacts.api.model.IMUser)
      (r22v4 com.ss.android.ugc.aweme.im.contacts.api.model.IMUser)
     binds: [B:40:0x0108, B:38:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bf  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C876550Ya5 r26, long r27, X.InterfaceC1364105Vn<? super X.C879180YeK> r29) {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C879090YeB.LIZIZ(X.0Ya5, long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.C869590Y9l r10, X.EnumC876540Ya4 r11, X.AbstractC23140094w r12) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C879090YeB.LJI(X.0Y9l, X.0Ya4, X.094w):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012e  */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0YeG] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.C869590Y9l r13, java.lang.CharSequence r14, X.InterfaceC1364105Vn<? super java.lang.String> r15) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C879090YeB.LJIIJ(X.0Y9l, java.lang.CharSequence, X.05Vn):java.lang.Object");
    }
}
