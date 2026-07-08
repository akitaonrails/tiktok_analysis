package X;

import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.1BGR, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BGR implements InterfaceC1710106mp {
    public static final /* synthetic */ int LJIILLIIL = 0;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(499));
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1397870mTp());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C1397880mTq());
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C2202041BGg());
    public final C054G LJ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public final Object LJFF = new Object();
    public final C01GW LJI = C452501pT.LIZIZ(new C2201991BGb());
    public final C01GW LJII = C452501pT.LIZIZ(new C2202001BGc());
    public final Object LJIIIIZZ = new Object();
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new C2201981BGa());
    public final C01GW LJIIJ = C452501pT.LIZIZ(new C1397860mTo());
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new C2202011BGd());
    public final C01GW LJIIL = C452501pT.LIZIZ(new C2202031BGf());
    public final C01GW LJIILIIL = C452501pT.LIZIZ(new C2202021BGe());
    public final C01GW LJIILJJIL = C452501pT.LIZIZ(new C1BGY());
    public final C01GW LJIILL = C452501pT.LIZIZ(new C1BGZ());

    public static final List<IMUser> LJIIZILJ() {
        String str = C1382030m4H.LIZLLL;
        IMContactApi.LIZ.getClass();
        return C069P.LIZ().LIZ().LJFF(str, false);
    }

    public static final List<IMUser> LJIJ() {
        IMContactApi.LIZ.getClass();
        return C069P.LIZ().LIZ().LJ(C1382030m4H.LIZIZ);
    }

    public static final List<IMUser> LJIL() {
        IMUser iMUserLJIIJJI;
        ArrayList<C0Y8T> arrayList = new ArrayList();
        for (C0Y8T c0y8t : C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZIZ()) {
            if (arrayList.size() != 10) {
                long jLJII = C0YNP.LJII(c0y8t.getConversationId());
                C869590Y9l lastShowMessage = c0y8t.getLastShowMessage();
                if (c0y8t.getConversationType() == AbstractC1711506n3.LIZ && (lastShowMessage == null || lastShowMessage.getMsgType() != 15)) {
                    if (jLJII > 0) {
                        arrayList.add(c0y8t);
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C0Y8T c0y8t2 : arrayList) {
            IIMContactUtilService.LIZ.getClass();
            IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
            if (iIMContactUtilServiceLIZ != null && (iMUserLJIIJJI = iIMContactUtilServiceLIZ.LJIIJJI(c0y8t2)) != null) {
                iMUserLJIIJJI.setType(1);
                arrayList2.add(iMUserLJIIJJI);
            }
        }
        return arrayList2;
    }

    public final boolean LJJ() {
        return ((Boolean) this.LIZ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1710106mp
    public final List<IMUser> getAllFriends() {
        String str = C1382030m4H.LIZ;
        IMContactApi.LIZ.getClass();
        return C069P.LIZ().LIZ().LJFF(str, false);
    }

    @Override // X.InterfaceC1710106mp
    public final void LJII() {
        if (LJJ()) {
            C139X c139x = (C139X) this.LIZLLL.getValue();
            c139x.LIZ().LIZJ();
            c139x.LIZIZ().clear();
        } else {
            ((LruCache) this.LIZJ.getValue()).evictAll();
        }
        ((LruCache) this.LIZIZ.getValue()).evictAll();
        ((Map) this.LJIILL.getValue()).clear();
    }

    public static final IMUser LJIJJ(String str) {
        IMUserBizInfo imUserBizInfo;
        IMContactApi.LIZ.getClass();
        IMUser iMUserLJ = C069P.LIZ().LJ().LJ(str, null);
        if (iMUserLJ != null && (imUserBizInfo = iMUserLJ.getImUserBizInfo()) != null && imUserBizInfo.getUserB2CAccountInfo() != null) {
            return iMUserLJ;
        }
        return (IMUser) C23250099c.LJ(C23271099x.INSTANCE, new C05KZ(str, null, null));
    }

    @Override // X.InterfaceC1710106mp
    public final void LIZ(Map<String, MatchedFriendStruct> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ((Map) this.LJIILL.getValue()).putAll(linkedHashMap);
    }

    @Override // X.InterfaceC1710106mp
    public final MatchedFriendStruct LIZIZ(String str) {
        if (str != null) {
            return (MatchedFriendStruct) ((Map) this.LJIILL.getValue()).get(str);
        }
        return null;
    }

    @Override // X.InterfaceC1710106mp
    public final void LJFF(IMUser iMUser) {
        LJJIII(iMUser);
    }

    public final boolean LJJI(String str) {
        boolean zContains;
        if (str.length() == 0) {
            return false;
        }
        synchronized (this.LJIIIIZZ) {
            try {
                zContains = ((HashSet) this.LJIIIZ.getValue()).contains(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zContains;
    }

    public final void LJJIII(IMUser iMUser) {
        if (C123100dR.LIZ(iMUser.getUid()) && !Intrinsics.LJFF(iMUser.getUid(), "-1")) {
            if (LJJ()) {
                C139X c139x = (C139X) this.LIZLLL.getValue();
                String uid = iMUser.getUid();
                if (uid == null) {
                    c139x.getClass();
                    return;
                } else {
                    c139x.LIZIZ().put(uid, new SoftReference(iMUser));
                    c139x.LIZ().put(uid, iMUser);
                    return;
                }
            }
            ((LruCache) this.LIZJ.getValue()).put(iMUser.getUid(), iMUser);
        }
    }

    public final boolean LJJIIZI(String str) {
        boolean zAdd;
        if (str.length() == 0) {
            return false;
        }
        synchronized (this.LJIIIIZZ) {
            try {
                zAdd = ((HashSet) this.LJIIIZ.getValue()).add(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zAdd;
    }

    public final boolean LJJIJ(List<String> list) {
        boolean zAddAll;
        if (list.isEmpty()) {
            return false;
        }
        synchronized (this.LJIIIIZZ) {
            try {
                zAddAll = ((HashSet) this.LJIIIZ.getValue()).addAll(list);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zAddAll;
    }

    @Override // X.InterfaceC1710106mp
    public final IMUser LJ(String str, String str2) {
        boolean z;
        IMUser iMUser;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z && (str2 == null || str2.length() == 0)) {
            return null;
        }
        if (C123100dR.LIZ(str)) {
            IMUser iMUserLJIJJLI = LJIJJLI(str, null);
            if (iMUserLJIJJLI != null) {
                return iMUserLJIJJLI;
            }
        } else if (C123100dR.LIZ(str2) && (iMUser = (IMUser) ((LruCache) this.LIZIZ.getValue()).get(str2)) != null) {
            return iMUser;
        }
        return null;
    }

    @Override // X.InterfaceC1710106mp
    public final Object LJIIIIZZ(List list, AbstractC23140094w abstractC23140094w) {
        if (list != null && !list.isEmpty()) {
            return LJIILIIL("im_share", list, abstractC23140094w, true, false, false);
        }
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC1710106mp
    public final Object LJIIJJI(List list, C1BG6 c1bg6) {
        C1DFH c1dfh = C0PEM.LIZ;
        Object objLJI = C23250099c.LJI(c1bg6, C2107308Nj.LIZ, new C1434805jW(list, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a1, code lost:
    
        if (r3 != null) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r18, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.im.contacts.api.model.IMUser> r19) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BGR.LJIILJJIL(com.ss.android.ugc.aweme.im.contacts.api.model.IMUser, X.05Vn):java.lang.Object");
    }

    public final IMUser LJIJJLI(String str, String str2) {
        boolean z;
        IMUser iMUser;
        Object objLJIIIZ;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        Object obj = null;
        if (z || C1697810uHb.LJIIJJI("-1", "1").contains(str)) {
            return null;
        }
        if (LJJ()) {
            C139X c139x = (C139X) this.LIZLLL.getValue();
            if (str == null) {
                c139x.getClass();
            } else {
                SoftReference softReference = (SoftReference) c139x.LIZIZ().get(str);
                if (softReference != null && (objLJIIIZ = softReference.get()) != null) {
                    if (c139x.LIZ().LJIIIZ(str) == null) {
                        c139x.LIZ().put(str, objLJIIIZ);
                    }
                } else {
                    objLJIIIZ = c139x.LIZ().LJIIIZ(str);
                    if (objLJIIIZ != null) {
                        c139x.LIZIZ().put(str, new SoftReference(objLJIIIZ));
                    } else {
                        c139x.LIZIZ().remove(str);
                    }
                }
                obj = objLJIIIZ;
            }
            return (IMUser) obj;
        }
        if (str != null && (iMUser = (IMUser) ((LruCache) this.LIZJ.getValue()).get(str)) != null) {
            return iMUser;
        }
        if (str2 == null) {
            return null;
        }
        return (IMUser) ((LruCache) this.LIZIZ.getValue()).get(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJII(boolean r6, X.C1BGT r7) {
        /*
            r5 = this;
            if (r6 == 0) goto L3f
            boolean r0 = r5.LJJ()
            if (r0 == 0) goto L2e
            X.01GW r0 = r5.LIZLLL
            java.lang.Object r1 = r0.getValue()
            X.139X r1 = (X.C139X) r1
            java.util.concurrent.ConcurrentHashMap r0 = r1.LIZIZ()
            int r0 = r0.size()
            if (r0 != 0) goto L3d
            X.139P r0 = r1.LIZ()
            long r3 = r0.size()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L3d
        L28:
            r0 = 1
        L29:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2e:
            X.01GW r0 = r5.LIZJ
            java.lang.Object r0 = r0.getValue()
            android.util.LruCache r0 = (android.util.LruCache) r0
            int r0 = r0.size()
            if (r0 != 0) goto L3d
            goto L28
        L3d:
            r0 = 0
            goto L29
        L3f:
            X.1BG1 r0 = X.C1BG1.LIZ
            java.lang.Object r0 = r0.LJIJJ(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BGR.LJJII(boolean, X.1BGT):java.lang.Object");
    }

    public final void LJJIIJZLJL(String str, C0ZVN c0zvn) {
        C23250099c.LIZLLL(this.LJ, null, null, new C1389530mGN(str, c0zvn, null), 3);
    }

    @Override // X.InterfaceC1710106mp
    public final IMUser LIZLLL(String str, String str2, String str3) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z && (str2 == null || str2.length() == 0)) {
            return null;
        }
        if (C13LP.LJJJJ(str, C1697810uHb.LJIIJJI("-1", "1")) && (str2 == null || str2.length() == 0)) {
            return null;
        }
        IMUser iMUserLJIIL = LJIIL(str, str2, str3);
        if (iMUserLJIIL != null) {
            return iMUserLJIIL;
        }
        LJIILLIIL(str, str2, null, null, str3);
        return null;
    }

    @Override // X.InterfaceC1710106mp
    public final IMUser LJIIL(String str, String str2, String str3) {
        boolean z;
        IMUser iMUserLJIJJLI;
        boolean z2;
        String uid;
        long jLongValue;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        Long updateTime = null;
        if ((z && (str2 == null || str2.length() == 0)) || C13LP.LJJJJ(str, C1697810uHb.LJIIJJI("-1", "1"))) {
            return null;
        }
        if (C123100dR.LIZ(str)) {
            iMUserLJIJJLI = LJIJJLI(str, null);
            if (iMUserLJIJJLI == null) {
                iMUserLJIJJLI = ((InterfaceC1725106pF) this.LJIIJ.getValue()).LJIILL(str, str3, false);
                if (iMUserLJIJJLI != null) {
                    LJJIII(iMUserLJIJJLI);
                }
                iMUserLJIJJLI = null;
                z2 = false;
            }
            z2 = true;
        } else {
            iMUserLJIJJLI = null;
            z2 = false;
        }
        if (this.LJIILJJIL.getValue() != null && str != null && str.length() != 0) {
            InterfaceC1485205re.LJIIL.getClass();
            if (C1485105rd.LIZJ.contains(str3)) {
                if (!((HashSet) this.LJIIL.getValue()).contains(str)) {
                    ((HashSet) this.LJIIL.getValue()).add(str);
                    C1243290iSV c1243290iSV = (C1243290iSV) this.LJIILJJIL.getValue();
                    if (c1243290iSV != null) {
                        C1243290iSV.LIZLLL(c1243290iSV, "im_inbox", z2);
                    }
                }
            } else if (u.LJJIIJZLJL(str3, "im_chat", false)) {
                if (!((HashSet) this.LJIILIIL.getValue()).contains(str)) {
                    ((HashSet) this.LJIILIIL.getValue()).add(str);
                    C1243290iSV c1243290iSV2 = (C1243290iSV) this.LJIILJJIL.getValue();
                    if (c1243290iSV2 != null) {
                        C1243290iSV.LIZLLL(c1243290iSV2, str3, z2);
                    }
                }
            } else if (!((HashSet) this.LJIIJJI.getValue()).contains(str)) {
                ((HashSet) this.LJIIJJI.getValue()).add(str);
                C1243290iSV c1243290iSV3 = (C1243290iSV) this.LJIILJJIL.getValue();
                if (c1243290iSV3 != null) {
                    C1243290iSV.LIZLLL(c1243290iSV3, str3, z2);
                }
            }
        }
        C2201771BFf.LIZIZ(iMUserLJIJJLI, Boolean.FALSE);
        C1BG1 c1bg1 = C1BG1.LIZ;
        if (iMUserLJIJJLI != null) {
            uid = iMUserLJIJJLI.getUid();
            updateTime = iMUserLJIJJLI.getUpdateTime();
        } else {
            uid = null;
        }
        c1bg1.getClass();
        if (uid != null && C1BG1.LJIILL) {
            if (updateTime != null) {
                jLongValue = updateTime.longValue();
            } else {
                jLongValue = 0;
            }
            if (jLongValue < System.currentTimeMillis() - C1BG1.LIZIZ) {
                InterfaceC1485205re.LJIIL.getClass();
                List<String> list = C1485105rd.LIZIZ;
                if (list.contains(str3) || !((Set) C1BG1.LJIILIIL.getValue()).contains(uid)) {
                    ((Set) C1BG1.LJIILIIL.getValue()).add(uid);
                    if (list.contains(str3)) {
                        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) C1BG1.LJIILIIL().get(str3);
                        if (copyOnWriteArraySet != null) {
                            copyOnWriteArraySet.add(uid);
                        }
                    } else {
                        CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) C1BG1.LJIILIIL().get("im_compensation");
                        if (copyOnWriteArraySet2 != null) {
                            copyOnWriteArraySet2.add(uid);
                            return iMUserLJIJJLI;
                        }
                    }
                }
            }
        }
        return iMUserLJIJJLI;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILL(java.lang.String r15, java.util.List r16, X.InterfaceC1364105Vn r17) {
        /*
            r14 = this;
            r0 = 137206(0x217f6, float:1.92267E-40)
            boolean r6 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            r3 = r17
            boolean r0 = r3 instanceof X.C1BGW
            if (r0 == 0) goto L38
            r10 = r3
            X.1BGW r10 = (X.C1BGW) r10
            int r2 = r10.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L38
            int r2 = r2 - r1
            r10.LLILZ = r2
        L1b:
            java.lang.Object r1 = r10.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r10.LLILZ
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L46
            if (r0 == r2) goto L65
            if (r0 == r3) goto L3e
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            if (r6 == 0) goto L37
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L37:
            throw r1
        L38:
            X.1BGW r10 = new X.1BGW
            r10.<init>(r14, r3)
            goto L1b
        L3e:
            java.lang.Object r5 = r10.LL
            java.util.List r5 = (java.util.List) r5
            X.C155000ia.LIZIZ(r1)
            goto L8a
        L46:
            X.C155000ia.LIZIZ(r1)
            X.01GW r0 = r14.LJIIJ
            java.lang.Object r7 = r0.getValue()
            X.06pF r7 = (X.InterfaceC1725106pF) r7
            r10.LLILZ = r2
            r11 = 0
            r9 = r16
            r8 = r15
            r12 = r11
            r13 = r11
            java.lang.Object r1 = r7.LJII(r8, r9, r10, r11, r12, r13)
            if (r1 != r4) goto L68
            if (r6 == 0) goto L64
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L64:
            return r4
        L65:
            X.C155000ia.LIZIZ(r1)
        L68:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto Lb9
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto Lb9
            X.05rI r0 = new X.05rI
            r0.<init>(r2)
            r10.LL = r1
            r10.LLILZ = r3
            java.lang.Object r0 = r14.LJJIIZ(r1, r0, r10)
            if (r0 != r4) goto L89
            if (r6 == 0) goto L88
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L88:
            return r4
        L89:
            r5 = r1
        L8a:
            java.util.Iterator r4 = r5.iterator()
        L8e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lbb
            java.lang.Object r3 = r4.next()
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r3 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) r3
            r2 = 0
            com.ss.android.ugc.aweme.im.service.IIMService r0 = X.C1336205Ku.LIZ(r2)
            X.0zm6 r1 = r0.getImMafService()
            java.lang.String r0 = r3.getUid()
            boolean r0 = r1.LIZJ(r0)
            if (r0 == 0) goto L8e
            com.ss.android.ugc.aweme.im.service.IIMService r0 = X.C1336205Ku.LIZ(r2)
            X.0zm6 r0 = r0.getImMafService()
            r0.LIZ(r3)
            goto L8e
        Lb9:
            X.13BV r5 = X.C13BV.INSTANCE
        Lbb:
            if (r6 == 0) goto Lc0
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        Lc0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BGR.LJIILL(java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }

    public final Object LJIJI(String str, String str2, InterfaceC1364105Vn<? super IMUser> interfaceC1364105Vn) {
        return LJIILJJIL(LJIIL(str, str2, "im_local_db"), interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00d8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List LJJIFFI(java.lang.String r15, boolean r16, java.util.List r17) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BGR.LJJIFFI(java.lang.String, boolean, java.util.List):java.util.List");
    }

    public final void LJJIIJ(String str, Map<String, ? extends List<Integer>> map, IMUser iMUser) {
        C23250099c.LIZLLL(this.LJ, null, null, new C1724406p8(str, this, map, iMUser, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIIZ(java.util.List<? extends com.ss.android.ugc.aweme.im.contacts.api.model.IMUser> r9, X.C1483005rI r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C1BGV
            if (r0 == 0) goto L26
            r6 = r11
            X.1BGV r6 = (X.C1BGV) r6
            int r2 = r6.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r6.LLILZIL = r2
        L12:
            java.lang.Object r1 = r6.LLILLL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILZIL
            r5 = 1
            if (r0 == 0) goto L34
            if (r0 != r5) goto L2c
            java.lang.Object r4 = r6.LLILLJJLI
            java.util.Iterator r4 = (java.util.Iterator) r4
            X.05rI r10 = r6.LL
            goto L3c
        L26:
            X.1BGV r6 = new X.1BGV
            r6.<init>(r8, r11)
            goto L12
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r1)
            java.util.Iterator r4 = r9.iterator()     // Catch: java.lang.Exception -> L7a
            goto L3f
        L3c:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L7a
        L3f:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Exception -> L7a
            if (r0 == 0) goto L7e
            java.lang.Object r3 = r4.next()     // Catch: java.lang.Exception -> L7a
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r3 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) r3     // Catch: java.lang.Exception -> L7a
            if (r3 == 0) goto L58
            boolean r0 = r10.LIZ     // Catch: java.lang.Exception -> L7a
            if (r0 != 0) goto L58
            int r0 = r3.getInternalShareHoldoutVersion()     // Catch: java.lang.Exception -> L7a
            r3.setInternalShareHoldoutVersion(r0)     // Catch: java.lang.Exception -> L7a
        L58:
            r8.LJJIII(r3)     // Catch: java.lang.Exception -> L7a
            r6.LL = r10     // Catch: java.lang.Exception -> L7a
            r6.LLILLJJLI = r4     // Catch: java.lang.Exception -> L7a
            r6.LLILZIL = r5     // Catch: java.lang.Exception -> L7a
            X.1DFH r0 = X.C0PEM.LIZ     // Catch: java.lang.Exception -> L7a
            X.08pq r2 = X.C2107308Nj.LIZ     // Catch: java.lang.Exception -> L7a
            X.05jY r1 = new X.05jY     // Catch: java.lang.Exception -> L7a
            r0 = 0
            r1.<init>(r3, r0)     // Catch: java.lang.Exception -> L7a
            java.lang.Object r1 = X.C23250099c.LJI(r6, r2, r1)     // Catch: java.lang.Exception -> L7a
            java.lang.Object r0 = X.C099R.LJFF()     // Catch: java.lang.Exception -> L7a
            if (r1 == r0) goto L77
            kotlin.Unit r1 = kotlin.Unit.LIZ     // Catch: java.lang.Exception -> L7a
        L77:
            if (r1 != r7) goto L3f
            return r7
        L7a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L7e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BGR.LJJIIZ(java.util.List, X.05rI, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1710106mp
    public final Object LJIIIZ(IMUser iMUser, IMUser iMUser2, C1483005rI c1483005rI, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        if (iMUser2 != null && !c1483005rI.LIZ) {
            iMUser.setInternalShareHoldoutVersion(iMUser2.getInternalShareHoldoutVersion());
        }
        LJJIII(iMUser);
        C1DFH c1dfh = C0PEM.LIZ;
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C1435005jY(iMUser, null));
        if (objLJI != C099R.LJFF()) {
            objLJI = Unit.LIZ;
        }
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    @Override // X.InterfaceC1710106mp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(java.lang.String r13, java.lang.String r14, boolean r15, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.im.contacts.api.model.IMUser> r16) {
        /*
            r12 = this;
            r0 = 137330(0x21872, float:1.9244E-40)
            boolean r4 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            r3 = r16
            boolean r0 = r3 instanceof X.C1BGX
            if (r0 == 0) goto L35
            r8 = r3
            X.1BGX r8 = (X.C1BGX) r8
            int r2 = r8.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L35
            int r2 = r2 - r1
            r8.LLILLL = r2
        L1b:
            java.lang.Object r0 = r8.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r8.LLILLL
            r1 = 1
            if (r2 == 0) goto L3b
            if (r2 == r1) goto L5e
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            if (r4 == 0) goto L34
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L34:
            throw r1
        L35:
            X.1BGX r8 = new X.1BGX
            r8.<init>(r12, r3)
            goto L1b
        L3b:
            X.C155000ia.LIZIZ(r0)
            if (r13 == 0) goto L68
            X.01GW r0 = r12.LJIIJ
            java.lang.Object r5 = r0.getValue()
            X.06pF r5 = (X.InterfaceC1725106pF) r5
            java.util.List r7 = java.util.Collections.singletonList(r13)
            r8.LLILLL = r1
            r9 = 0
            r11 = r15
            r6 = r14
            r10 = r9
            java.lang.Object r0 = r5.LJII(r6, r7, r8, r9, r10, r11)
            if (r0 != r3) goto L61
            if (r4 == 0) goto L5d
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L5d:
            return r3
        L5e:
            X.C155000ia.LIZIZ(r0)
        L61:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            goto L69
        L68:
            r0 = 0
        L69:
            if (r4 == 0) goto L6e
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L6e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BGR.LJIIJ(java.lang.String, java.lang.String, boolean, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1710106mp
    public final void LIZJ(InterfaceC1480505qt interfaceC1480505qt, String str, String str2, String str3, boolean z) {
        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
            if (interfaceC1480505qt != null) {
                interfaceC1480505qt.LIZ(new IllegalArgumentException("Query user with empty uid and sec uid"));
                return;
            }
            return;
        }
        if (C13LP.LJJJJ(str, C1697810uHb.LJIIJJI("-1", "1")) && (str2 == null || str2.length() == 0)) {
            if (interfaceC1480505qt != null) {
                interfaceC1480505qt.LIZ(new IllegalArgumentException("Query user with invalid uid and sec uid"));
                return;
            }
            return;
        }
        IMUser iMUserLJIIL = LJIIL(str, str2, str3);
        if (!z && iMUserLJIIL != null) {
            C2201771BFf.LIZIZ(iMUserLJIIL, Boolean.FALSE);
            if (interfaceC1480505qt != null) {
                interfaceC1480505qt.LIZIZ(iMUserLJIIL);
                return;
            }
            return;
        }
        LJIILLIIL(str, str2, interfaceC1480505qt, iMUserLJIIL, str3);
    }

    @Override // X.InterfaceC1710106mp
    public final void LJI(InterfaceC1480505qt interfaceC1480505qt, String str, String str2, String str3, boolean z) {
        C23250099c.LIZLLL(this.LJ, null, null, new C1481105qz(str, str2, this, str3, z, interfaceC1480505qt, null), 3);
    }

    public final void LJIILLIIL(String str, String str2, InterfaceC1480505qt interfaceC1480505qt, IMUser iMUser, String str3) {
        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
            if (interfaceC1480505qt != null) {
                interfaceC1480505qt.LIZ(new IllegalArgumentException("Query user with empty uid and sec uid"));
                return;
            }
            return;
        }
        if (C13LP.LJJJJ(str, C1697810uHb.LJIIJJI("-1", "1"))) {
            if (interfaceC1480505qt != null) {
                interfaceC1480505qt.LIZ(new IllegalArgumentException("Query user with invalid uid"));
                return;
            }
            return;
        }
        if (C1481905r7.LIZLLL(str, str3, interfaceC1480505qt)) {
            return;
        }
        synchronized (this.LJFF) {
            if (interfaceC1480505qt == null) {
                try {
                    if (C13LP.LJJJJ(str, (Set) this.LJII.getValue())) {
                        return;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (str != null) {
                ((Set) this.LJII.getValue()).add(str);
            }
            if (interfaceC1480505qt == null && C13LP.LJJJJ(str2, (Set) this.LJI.getValue())) {
                return;
            }
            if (str2 != null) {
                ((Set) this.LJI.getValue()).add(str2);
            }
            C23250099c.LIZLLL(this.LJ, null, null, new C1481305r1(this, str, str3, interfaceC1480505qt, iMUser, str2, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e1  */
    @Override // X.InterfaceC1710106mp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(java.lang.String r20, java.util.List r21, X.InterfaceC1364105Vn r22, boolean r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BGR.LJIILIIL(java.lang.String, java.util.List, X.05Vn, boolean, boolean, boolean):java.lang.Object");
    }
}
