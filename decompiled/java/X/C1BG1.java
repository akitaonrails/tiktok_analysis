package X;

import com.bytedance.keva.Keva;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import com.ss.android.ugc.aweme.utils.IChatCustomizeHelper;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: renamed from: X.1BG1, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BG1 {
    public static final C1BG1 LIZ = new C1BG1();
    public static final long LIZIZ;
    public static final long LIZJ;
    public static final ConcurrentHashMap<String, Long> LIZLLL;
    public static final C01GW LJ;
    public static C054G LJFF;
    public static AnonymousClass0956 LJI;
    public static final C01GW LJII;
    public static final C01GW LJIIIIZZ;
    public static final C01GW LJIIIZ;
    public static final C01GW LJIIJ;
    public static final C2252321DDq LJIIJJI;
    public static final AnonymousClass0951 LJIIL;
    public static final C01GW LJIILIIL;
    public static final C01GW LJIILJJIL;
    public static boolean LJIILL;
    public static long LJIILLIIL;
    public static C11JF LJIIZILJ;
    public static String LJIJ;
    public static final C1725006pE LJIJI;

    /* JADX WARN: Type inference failed for: r0v28, types: [X.06pE] */
    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        LIZIZ = timeUnit.toMillis(4L);
        LIZJ = timeUnit.toMillis(7L);
        LIZLLL = new ConcurrentHashMap<>();
        LJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(975));
        LJFF = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
        LJII = C452501pT.LIZIZ(new C848480XQg());
        LJIIIIZZ = C452501pT.LIZIZ(new C1389540mGO());
        LJIIIZ = C452501pT.LIZIZ(new C1725306pH());
        LJIIJ = C452501pT.LIZIZ(new C2201781BFg());
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(Boolean.FALSE);
        LJIIJJI = c2252321DDqLIZ;
        LJIIL = C09IC.LIZIZ(c2252321DDqLIZ);
        LJIILIIL = C452501pT.LIZIZ(new C1BGO());
        LJIILJJIL = C452501pT.LIZIZ(new C1485305rf());
        LJIJ = "";
        LJIJI = new InterfaceC989510brB<PrivacyUserSettingsV2>() { // from class: X.06pE
            @Override // X.InterfaceC989510brB
            public final void LLZZLLIL(PrivacyUserSettingsV2 privacyUserSettingsV2) {
                if (C21287318Sh.LIZIZ()) {
                    C1BG1.LIZ.getClass();
                    C23250099c.LIZLLL(C1BG1.LJFF, null, null, new C1317405Do(1000L, null), 3);
                }
            }
        };
    }

    public static ConcurrentHashMap LJIILIIL() {
        return (ConcurrentHashMap) LJIILJJIL.getValue();
    }

    public static boolean LJIJI() {
        AnonymousClass0956 anonymousClass0956 = LJI;
        if (anonymousClass0956 != null) {
            return anonymousClass0956.isCancelled();
        }
        return false;
    }

    public static void LJJI() {
        int readHoldCount;
        C0Z7V c0z7vLJIILJJIL;
        C2296808zG.LIZJ(LJFF, null);
        LJFF = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
        LJIIJJI.setValue(Boolean.FALSE);
        int i = 0;
        LJIILL = false;
        LJIILLIIL = 0L;
        LJIJ = "";
        ReentrantReadWriteLock reentrantReadWriteLock = C21287318Sh.LIZJ;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            readHoldCount = reentrantReadWriteLock.getReadHoldCount();
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock.unlock();
            }
        } else {
            readHoldCount = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            Keva kevaLIZ = C21287318Sh.LIZ();
            kevaLIZ.erase("key_contact_list_fetch_timestamp");
            kevaLIZ.erase("key_dm_setting_friends");
            kevaLIZ.erase("key_dm_setting_potential_connection");
            kevaLIZ.erase("key_dm_setting_others");
            C21287318Sh.LIZIZ = null;
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            C1594306Mb.LIZ = null;
            IIMBusinessChatService.LIZ.getClass();
            IIMBusinessChatService iIMBusinessChatService = C1668706g9.LIZIZ;
            if (iIMBusinessChatService != null && (c0z7vLJIILJJIL = iIMBusinessChatService.LJIILJJIL()) != null) {
                c0z7vLJIILJJIL.LJIIJ();
            }
            ((InterfaceC1710106mp) LJIIIIZZ.getValue()).LJII();
            LJIILIIL().clear();
            LIZLLL.clear();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    public static boolean LIZ(String str) {
        return !C1697810uHb.LJIIJJI("im_chat", "im_avatar", "group_chat_management").contains(str);
    }

    public static List LJIIL(List list) {
        long jLongValue = ((Number) LJ.getValue()).longValue();
        if (jLongValue > 0 && !LIZLLL.isEmpty()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                ConcurrentHashMap<String, Long> concurrentHashMap = LIZLLL;
                Long l = concurrentHashMap.get(obj);
                if (l != null) {
                    if (jCurrentTimeMillis - l.longValue() >= jLongValue) {
                        concurrentHashMap.remove(obj);
                    }
                }
                arrayList.add(obj);
            }
            return arrayList;
        }
        return list;
    }

    public static List LJIILL(List list) {
        if (list == null) {
            return null;
        }
        InterfaceC2202381BHo interfaceC2202381BHoLIZ = C808290VnH.LIZ();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Number) obj).longValue() > 0) {
                arrayList.add(obj);
            }
        }
        return ((C2202371BHn) interfaceC2202381BHoLIZ).LJII(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C1BGB
            if (r0 == 0) goto La4
            r7 = r12
            X.1BGB r7 = (X.C1BGB) r7
            int r2 = r7.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La4
            int r2 = r2 - r1
            r7.LLILZIL = r2
        L12:
            java.lang.Object r10 = r7.LLILLL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZIL
            r8 = 0
            r5 = 4
            r9 = 3
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L2f
            if (r0 == r3) goto L45
            if (r0 == r4) goto L6c
            if (r0 == r9) goto L88
            if (r0 != r5) goto Lab
            X.C155000ia.LIZIZ(r10)
        L2c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2f:
            X.C155000ia.LIZIZ(r10)
            X.06pU r2 = X.C805480Vik.LIZIZ()
            r7.LL = r2
            r7.LLILLJJLI = r2
            r7.LLILZIL = r3
            java.lang.Object r10 = r2.LJI(r7)
            if (r10 != r6) goto L43
            return r6
        L43:
            r1 = r2
            goto L4e
        L45:
            java.lang.Object r2 = r7.LLILLJJLI
            X.06pU r2 = (X.InterfaceC1726606pU) r2
            X.06pU r1 = r7.LL
            X.C155000ia.LIZIZ(r10)
        L4e:
            r0 = r10
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            r3 = r3 ^ r0
            if (r3 != 0) goto L59
            r10 = r8
        L59:
            java.util.List r10 = (java.util.List) r10
            if (r10 == 0) goto L2c
            r7.LL = r1
            r7.LLILLJJLI = r10
            r7.LLILZIL = r4
            java.lang.Object r0 = r2.LJIILL(r7)
            if (r0 != r6) goto L6a
            return r6
        L6a:
            r2 = r10
            goto L75
        L6c:
            java.lang.Object r2 = r7.LLILLJJLI
            java.util.List r2 = (java.util.List) r2
            X.06pU r1 = r7.LL
            X.C155000ia.LIZIZ(r10)
        L75:
            X.1BHo r0 = X.C808290VnH.LIZ()
            r7.LL = r1
            r7.LLILLJJLI = r2
            r7.LLILZIL = r9
            X.1BHn r0 = (X.C2202371BHn) r0
            java.lang.Object r0 = r0.LIZJ(r2, r7)
            if (r0 != r6) goto L91
            return r6
        L88:
            java.lang.Object r2 = r7.LLILLJJLI
            java.util.List r2 = (java.util.List) r2
            X.06pU r1 = r7.LL
            X.C155000ia.LIZIZ(r10)
        L91:
            X.1BGN r0 = X.C808280VnG.LIZ()
            r7.LL = r1
            r7.LLILLJJLI = r8
            r7.LLILZIL = r5
            X.1BGq r0 = (X.C2202141BGq) r0
            java.lang.Object r0 = r0.LIZJ(r2, r7)
            if (r0 != r6) goto L2c
            return r6
        La4:
            X.1BGB r7 = new X.1BGB
            r7.<init>(r11, r12)
            goto L12
        Lab:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BG1.LIZIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x05d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x042b  */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v6, types: [T, java.lang.Integer] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x0538 -> B:116:0x0540). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x053a -> B:115:0x053c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.InterfaceC1364105Vn<? super kotlin.Unit> r32) {
        /*
            Method dump skipped, instruction units count: 1538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BG1.LJI(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.InterfaceC1364105Vn<? super java.lang.Boolean> r13) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BG1.LJIIIIZZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof X.C1BGJ
            if (r0 == 0) goto L93
            r12 = r15
            X.1BGJ r12 = (X.C1BGJ) r12
            int r2 = r12.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L93
            int r2 = r2 - r1
            r12.LLILZ = r2
        L12:
            java.lang.Object r4 = r12.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r12.LLILZ
            r2 = 1
            if (r0 == 0) goto L5b
            if (r0 != r2) goto L9a
            java.lang.Object r1 = r12.LL
            java.lang.String r1 = (java.lang.String) r1
            X.C155000ia.LIZIZ(r4)
        L26:
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r3 = X.C13LP.LJJJLL(r4)
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r3 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) r3
            if (r3 == 0) goto L58
            X.06g9 r0 = com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService r0 = X.C1668706g9.LIZIZ
            if (r0 == 0) goto L58
            X.0Z7V r2 = r0.LJIILJJIL()
            if (r2 == 0) goto L58
            java.lang.Long r1 = X.C2095008Iq.LJIILIIL(r1)
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo r0 = r3.getImUserBizInfo()
            if (r0 == 0) goto L53
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo r0 = r0.getUserB2CAccountInfo()
            if (r0 == 0) goto L53
            java.lang.String r0 = r0.userTags
            if (r0 != 0) goto L55
        L53:
            java.lang.String r0 = ""
        L55:
            r2.LJ(r1, r0)
        L58:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L5b:
            X.C155000ia.LIZIZ(r4)
            X.0I0B r0 = X.C0I0B.LJFF
            X.0I8r r0 = r0.LIZ()
            X.0mXo r0 = (X.C1400340mXo) r0
            java.lang.String r1 = r0.getCurUserId()
            if (r1 == 0) goto L58
            java.lang.String r0 = X.C1BG1.LJIJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 != 0) goto L58
            X.C1BG1.LJIJ = r1
            X.1BG1 r4 = X.C1BG1.LIZ
            r4.getClass()
            java.util.List r5 = java.util.Collections.singletonList(r1)
            java.lang.String r6 = "im_chat"
            r11 = 0
            r12.LL = r1
            r12.LLILZ = r2
            r7 = 1
            r10 = 0
            r13 = 96
            r8 = r7
            r9 = r7
            java.lang.Object r4 = LJIIJ(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r4 != r3) goto L26
            return r3
        L93:
            X.1BGJ r12 = new X.1BGJ
            r12.<init>(r14, r15)
            goto L12
        L9a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BG1.LJIIJJI(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJJ(X.InterfaceC1364105Vn<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C1BGL
            if (r0 == 0) goto L40
            r4 = r6
            X.1BGL r4 = (X.C1BGL) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L40
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L46
            X.C155000ia.LIZIZ(r3)
        L22:
            java.lang.Number r3 = (java.lang.Number) r3
            int r0 = r3.intValue()
            if (r0 == 0) goto L2b
            r1 = 0
        L2b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L30:
            X.C155000ia.LIZIZ(r3)
            X.06pU r0 = X.C805480Vik.LIZIZ()
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LJIILLIIL(r4)
            if (r3 != r2) goto L22
            return r2
        L40:
            X.1BGL r4 = new X.1BGL
            r4.<init>(r5, r6)
            goto L12
        L46:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BG1.LJIJJ(X.05Vn):java.lang.Object");
    }

    public static Object LJIILJJIL(Long l, InterfaceC1364105Vn interfaceC1364105Vn) {
        if (l != null) {
            long jLongValue = l.longValue();
            Object objLJ = ((C2202141BGq) C808280VnG.LIZ()).LJ(C2286608xc.LJFF(jLongValue), interfaceC1364105Vn);
            if (objLJ == C099R.LJFF()) {
                return objLJ;
            }
            return objLJ;
        }
        return null;
    }

    public static void LJIJJLI(int i, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("retryTimes= ");
        sbLIZ.append(i);
        sbLIZ.append(", error=");
        String message = th.getMessage();
        if (message == null) {
            message = "null stack message";
        }
        sbLIZ.append(message);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("monitorDBUpdateError: errorStack=");
        sbLIZ2.append(strLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJ(java.util.List r10, java.util.List r11) {
        /*
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L7d
            X.01GW r0 = X.C1BG1.LJ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r1 = r0.longValue()
            r8 = 0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto L7d
            long r6 = java.lang.System.currentTimeMillis()
            if (r11 == 0) goto L57
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r11.iterator()
        L27:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L51
            java.lang.Object r0 = r4.next()
            com.ss.android.ugc.aweme.im.contacts.impl.model.IMUserProfileInfo r0 = (com.ss.android.ugc.aweme.im.contacts.impl.model.IMUserProfileInfo) r0
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo r0 = r0.imUserBaseInfo
            if (r0 == 0) goto L27
            long r0 = r0.getUserId()
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            long r1 = r3.longValue()
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto L27
            java.lang.String r0 = r3.toString()
            if (r0 == 0) goto L27
            r5.add(r0)
            goto L27
        L51:
            java.util.Set r4 = X.C13LP.LLIIJI(r5)
            if (r4 != 0) goto L59
        L57:
            X.08CX r4 = X.C08CX.INSTANCE
        L59:
            java.util.Iterator r3 = r10.iterator()
        L5d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r2 = r3.next()
            boolean r0 = r4.contains(r2)
            if (r0 == 0) goto L73
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r0 = X.C1BG1.LIZLLL
            r0.remove(r2)
            goto L5d
        L73:
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r0 = X.C1BG1.LIZLLL
            r0.put(r2, r1)
            goto L5d
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BG1.LJJ(java.util.List, java.util.List):void");
    }

    public static void LJJIFFI(long j, IMUserBizInfo iMUserBizInfo) {
        String curUserId;
        Long lLJIILIIL;
        List<String> unlockedBubbleIds;
        if (j <= 0 || iMUserBizInfo == null || (curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId()) == null || (lLJIILIIL = C2095008Iq.LJIILIIL(curUserId)) == null || j != lLJIILIIL.longValue() || (unlockedBubbleIds = iMUserBizInfo.getUnlockedBubbleIds()) == null) {
            return;
        }
        IChatCustomizeHelper.LIZ.getClass();
        IChatCustomizeHelper iChatCustomizeHelperLIZ = C1619106Vp.LIZ();
        if (iChatCustomizeHelperLIZ != null) {
            iChatCustomizeHelperLIZ.syncUnlockedBubbleIdsFromBizInfo(unlockedBubbleIds);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(long r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C1BGI
            if (r0 == 0) goto L7f
            r7 = r11
            X.1BGI r7 = (X.C1BGI) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7f
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r2 = r7.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZ
            r3 = 0
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L44
            if (r0 == r4) goto L5f
            if (r0 != r5) goto L9c
            long r9 = r7.LL
            X.C155000ia.LIZIZ(r2)
        L28:
            X.069P r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()
            X.1BGS r2 = r0.LJ()
            java.lang.String r1 = java.lang.String.valueOf(r9)
            java.lang.String r0 = "im_local_db"
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r1 = r2.LJIIL(r1, r3, r0)
            if (r1 != 0) goto L85
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L44:
            X.C155000ia.LIZIZ(r2)
            r1 = 0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 > 0) goto L50
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L50:
            java.lang.Long r0 = X.C2286608xc.LJFF(r9)
            r7.LL = r9
            r7.LLILZ = r4
            java.lang.Object r2 = LJIILJJIL(r0, r7)
            if (r2 != r6) goto L64
            return r6
        L5f:
            long r9 = r7.LL
            X.C155000ia.LIZIZ(r2)
        L64:
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo r2 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo) r2
            if (r2 == 0) goto L28
            r2.setUnlockedBubbleIds(r3)
            X.1BG1 r1 = X.C1BG1.LIZ
            java.lang.Long r0 = X.C2286608xc.LJFF(r9)
            r7.LL = r9
            r7.LLILZ = r5
            r1.getClass()
            java.lang.Object r0 = LJJIIJ(r0, r2, r7)
            if (r0 != r6) goto L28
            return r6
        L7f:
            X.1BGI r7 = new X.1BGI
            r7.<init>(r8, r11)
            goto L12
        L85:
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo r0 = r1.getImUserBizInfo()
            if (r0 == 0) goto L8e
            r0.setUnlockedBubbleIds(r3)
        L8e:
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()
            X.1BGS r0 = r0.LJ()
            r0.LJFF(r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L9c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BG1.LIZJ(long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.Long r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C1BGC
            if (r0 == 0) goto L83
            r5 = r11
            X.1BGC r5 = (X.C1BGC) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L83
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r6 = 3
            r7 = 2
            r8 = 1
            if (r0 == 0) goto L2b
            if (r0 == r8) goto L55
            if (r0 == r7) goto L6d
            if (r0 != r6) goto L89
            X.C155000ia.LIZIZ(r1)
        L28:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2b:
            X.C155000ia.LIZIZ(r1)
            if (r10 == 0) goto L28
            long r0 = r10.longValue()
            java.lang.Long r0 = X.C2286608xc.LJFF(r0)
            boolean r0 = X.C1317805Ds.LIZ(r0)
            if (r0 == 0) goto L28
            long r2 = r10.longValue()
            X.06pU r1 = X.C805480Vik.LIZIZ()
            java.lang.Long r0 = X.C2286608xc.LJFF(r2)
            r5.LL = r2
            r5.LLILZ = r8
            java.lang.Object r0 = r1.LIZIZ(r0, r5)
            if (r0 != r4) goto L5a
            return r4
        L55:
            long r2 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L5a:
            X.1BHo r1 = X.C808290VnH.LIZ()
            java.lang.Long r0 = X.C2286608xc.LJFF(r2)
            r5.LL = r2
            r5.LLILZ = r7
            java.lang.Object r0 = r1.LIZIZ(r0, r5)
            if (r0 != r4) goto L72
            return r4
        L6d:
            long r2 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L72:
            X.1BGN r1 = X.C808280VnG.LIZ()
            java.lang.Long r0 = X.C2286608xc.LJFF(r2)
            r5.LLILZ = r6
            java.lang.Object r0 = r1.LIZIZ(r0, r5)
            if (r0 != r4) goto L28
            return r4
        L83:
            X.1BGC r5 = new X.1BGC
            r5.<init>(r9, r11)
            goto L12
        L89:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BG1.LIZLLL(java.lang.Long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0082 -> B:36:0x0088). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:38:0x008d
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.util.List<com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo> r7, X.InterfaceC1364105Vn<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1BGE
            if (r0 == 0) goto L26
            r2 = r8
            X.1BGE r2 = (X.C1BGE) r2
            int r3 = r2.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L26
            int r3 = r3 - r1
            r2.LLILZIL = r3
        L12:
            java.lang.Object r5 = r2.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r2.LLILZIL
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2c
            int r4 = r2.LLILLJJLI
            java.lang.Object r7 = r2.LL
            java.util.List r7 = (java.util.List) r7
            goto L85
        L26:
            X.1BGE r2 = new X.1BGE
            r2.<init>(r6, r8)
            goto L12
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r5)
            java.lang.StringBuilder r4 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "doIMUserBaseInfoDBUpdate start: result="
            r4.append(r0)
            if (r7 == 0) goto L68
            int r0 = r7.size()
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
        L4a:
            r4.append(r0)
            r0 = 32
            r4.append(r0)
            X.C2188811AlT.LIZIZ(r4)
            if (r7 == 0) goto L66
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L66
            r0 = 0
        L5e:
            if (r0 == 0) goto L6a
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L66:
            r0 = 1
            goto L5e
        L68:
            r0 = 0
            goto L4a
        L6a:
            r4 = 0
        L6b:
            r0 = 2
            if (r4 >= r0) goto L9a
            boolean r0 = LJIJI()
            if (r0 != 0) goto L9a
            X.06pU r0 = X.C805480Vik.LIZIZ()     // Catch: java.lang.Throwable -> L8d
            r2.LL = r7     // Catch: java.lang.Throwable -> L8d
            r2.LLILLJJLI = r4     // Catch: java.lang.Throwable -> L8d
            r2.LLILZIL = r1     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r0 = r0.LIZ(r7, r2)     // Catch: java.lang.Throwable -> L8d
            if (r0 != r3) goto L88
            goto L99
        L85:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Throwable -> L8f
        L88:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L8f
            return r0
        L8d:
            r0 = move-exception
            goto L90
        L8f:
            r0 = move-exception
        L90:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            LJIJJLI(r4, r0)
            int r4 = r4 + 1
            goto L6b
        L99:
            return r3
        L9a:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BG1.LJ(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0084 -> B:36:0x008a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:38:0x008f
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.util.List<com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo> r7, X.InterfaceC1364105Vn<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1BGF
            if (r0 == 0) goto L26
            r2 = r8
            X.1BGF r2 = (X.C1BGF) r2
            int r3 = r2.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L26
            int r3 = r3 - r1
            r2.LLILZIL = r3
        L12:
            java.lang.Object r5 = r2.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r2.LLILZIL
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2c
            int r4 = r2.LLILLJJLI
            java.lang.Object r7 = r2.LL
            java.util.List r7 = (java.util.List) r7
            goto L87
        L26:
            X.1BGF r2 = new X.1BGF
            r2.<init>(r6, r8)
            goto L12
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r5)
            java.lang.StringBuilder r4 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "doIMUserBizInfoDBUpdate start: result="
            r4.append(r0)
            if (r7 == 0) goto L68
            int r0 = r7.size()
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
        L4a:
            r4.append(r0)
            r0 = 32
            r4.append(r0)
            X.C2188811AlT.LIZIZ(r4)
            if (r7 == 0) goto L66
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L66
            r0 = 0
        L5e:
            if (r0 == 0) goto L6a
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L66:
            r0 = 1
            goto L5e
        L68:
            r0 = 0
            goto L4a
        L6a:
            r4 = 0
        L6b:
            r0 = 2
            if (r4 >= r0) goto L9c
            boolean r0 = LJIJI()
            if (r0 != 0) goto L9c
            X.1BGN r0 = X.C808280VnG.LIZ()     // Catch: java.lang.Throwable -> L8f
            r2.LL = r7     // Catch: java.lang.Throwable -> L8f
            r2.LLILLJJLI = r4     // Catch: java.lang.Throwable -> L8f
            r2.LLILZIL = r1     // Catch: java.lang.Throwable -> L8f
            X.1BGq r0 = (X.C2202141BGq) r0     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r0 = r0.LIZ(r7, r2)     // Catch: java.lang.Throwable -> L8f
            if (r0 != r3) goto L8a
            goto L9b
        L87:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Throwable -> L91
        L8a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L91
            return r0
        L8f:
            r0 = move-exception
            goto L92
        L91:
            r0 = move-exception
        L92:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            LJIJJLI(r4, r0)
            int r4 = r4 + 1
            goto L6b
        L9b:
            return r3
        L9c:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BG1.LJFF(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0084 -> B:36:0x008a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:38:0x008f
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(java.util.List<com.ss.android.ugc.aweme.im.contacts.impl.model.SharePermission> r7, X.InterfaceC1364105Vn<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1BGG
            if (r0 == 0) goto L26
            r2 = r8
            X.1BGG r2 = (X.C1BGG) r2
            int r3 = r2.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L26
            int r3 = r3 - r1
            r2.LLILZIL = r3
        L12:
            java.lang.Object r5 = r2.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r2.LLILZIL
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2c
            int r4 = r2.LLILLJJLI
            java.lang.Object r7 = r2.LL
            java.util.List r7 = (java.util.List) r7
            goto L87
        L26:
            X.1BGG r2 = new X.1BGG
            r2.<init>(r6, r8)
            goto L12
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r5)
            java.lang.StringBuilder r4 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "doSharePermissionDBUpdate start: result="
            r4.append(r0)
            if (r7 == 0) goto L68
            int r0 = r7.size()
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
        L4a:
            r4.append(r0)
            r0 = 32
            r4.append(r0)
            X.C2188811AlT.LIZIZ(r4)
            if (r7 == 0) goto L66
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L66
            r0 = 0
        L5e:
            if (r0 == 0) goto L6a
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L66:
            r0 = 1
            goto L5e
        L68:
            r0 = 0
            goto L4a
        L6a:
            r4 = 0
        L6b:
            r0 = 2
            if (r4 >= r0) goto L9c
            boolean r0 = LJIJI()
            if (r0 != 0) goto L9c
            X.1BHo r0 = X.C808290VnH.LIZ()     // Catch: java.lang.Throwable -> L8f
            r2.LL = r7     // Catch: java.lang.Throwable -> L8f
            r2.LLILLJJLI = r4     // Catch: java.lang.Throwable -> L8f
            r2.LLILZIL = r1     // Catch: java.lang.Throwable -> L8f
            X.1BHn r0 = (X.C2202371BHn) r0     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r0 = r0.LIZ(r7, r2)     // Catch: java.lang.Throwable -> L8f
            if (r0 != r3) goto L8a
            goto L9b
        L87:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Throwable -> L91
        L8a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L91
            return r0
        L8f:
            r0 = move-exception
            goto L92
        L91:
            r0 = move-exception
        L92:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            LJIJJLI(r4, r0)
            int r4 = r4 + 1
            goto L6b
        L9b:
            return r3
        L9c:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BG1.LJII(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILLIIL(java.lang.Long r9, X.InterfaceC1364105Vn<? super java.lang.Integer> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C1BGH
            if (r0 == 0) goto L46
            r7 = r10
            X.1BGH r7 = (X.C1BGH) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L46
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L2c
            if (r0 != r5) goto L4c
            X.C155000ia.LIZIZ(r1)
        L23:
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo r1 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo) r1
            if (r1 == 0) goto L2b
            java.lang.Integer r4 = r1.getShareFilterType()
        L2b:
            return r4
        L2c:
            X.C155000ia.LIZIZ(r1)
            if (r9 == 0) goto L2b
            long r2 = r9.longValue()
            X.1BGN r1 = X.C808280VnG.LIZ()
            java.lang.Long r0 = X.C2286608xc.LJFF(r2)
            r7.LLILLL = r5
            java.lang.Object r1 = r1.LJ(r0, r7)
            if (r1 != r6) goto L23
            return r6
        L46:
            X.1BGH r7 = new X.1BGH
            r7.<init>(r8, r10)
            goto L12
        L4c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BG1.LJIILLIIL(java.lang.Long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c9 A[LOOP:0: B:34:0x00c3->B:36:0x00c9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIZILJ(int r15, X.InterfaceC1364105Vn<? super java.util.List<X.C1724806pC>> r16) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BG1.LJIIZILJ(int, X.05Vn):java.lang.Object");
    }

    public static Object LJJIIJ(Long l, IMUserBizInfo iMUserBizInfo, InterfaceC1364105Vn interfaceC1364105Vn) {
        if (l != null) {
            l.longValue();
            Object objLJFF = ((C2202141BGq) C808280VnG.LIZ()).LJFF(iMUserBizInfo, interfaceC1364105Vn);
            if (objLJFF == C099R.LJFF()) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (((java.lang.Boolean) r4).booleanValue() == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(X.InterfaceC497601wk r7, boolean r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C1BGD
            if (r0 == 0) goto L6a
            r5 = r9
            X.1BGD r5 = (X.C1BGD) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6a
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L70
            X.01wk r7 = r5.LL
            X.C155000ia.LIZIZ(r4)
        L25:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r0 = r4.booleanValue()
            if (r0 != 0) goto L46
        L2d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L30:
            X.C155000ia.LIZIZ(r4)
            if (r8 == 0) goto L55
            X.0956 r0 = X.C1BG1.LJI
            if (r0 == 0) goto L46
            boolean r0 = r0.isActive()
            if (r0 == 0) goto L46
            X.0956 r0 = X.C1BG1.LJI
            if (r0 == 0) goto L46
            r0.LIZIZ(r2)
        L46:
            X.05Dn r1 = new X.05Dn
            r1.<init>(r2)
            r0 = 3
            X.0956 r0 = X.C23250099c.LIZLLL(r7, r2, r2, r1, r0)
            X.C1BG1.LJI = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L55:
            X.0956 r0 = X.C1BG1.LJI
            if (r0 == 0) goto L5f
            boolean r0 = r0.isActive()
            if (r0 != 0) goto L2d
        L5f:
            r5.LL = r7
            r5.LLILZ = r1
            java.lang.Object r4 = r6.LJIIIIZZ(r5)
            if (r4 != r3) goto L25
            return r3
        L6a:
            X.1BGD r5 = new X.1BGD
            r5.<init>(r6, r9)
            goto L12
        L70:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BG1.LJIIIZ(X.01wk, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIL(com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo r17, java.lang.String r18, X.InterfaceC1364105Vn<? super kotlin.Unit> r19) {
        /*
            Method dump skipped, instruction units count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BG1.LJIL(com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0158 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0159  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
    public final java.lang.Object LJJIII(com.ss.android.ugc.aweme.im.contacts.impl.model.IMUserProfileInfo r12, java.lang.String r13, X.InterfaceC1364105Vn<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BG1.LJJIII(com.ss.android.ugc.aweme.im.contacts.impl.model.IMUserProfileInfo, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0134 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIIJZLJL(com.ss.android.ugc.aweme.im.contacts.impl.model.IMUserProfileInfo r12, java.lang.String r13, X.InterfaceC1364105Vn<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BG1.LJJIIJZLJL(com.ss.android.ugc.aweme.im.contacts.impl.model.IMUserProfileInfo, java.lang.String, X.05Vn):java.lang.Object");
    }

    public static void LJJII(long j, ArrayList arrayList, int i, int i2, int i3) {
        C23250099c.LIZLLL(LJFF, null, null, new C1726406pS(i, j, arrayList, i2, i3, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01f8 A[Catch: Exception -> 0x023a, TRY_ENTER, TryCatch #2 {Exception -> 0x023a, blocks: (B:83:0x01b0, B:84:0x01bf, B:86:0x01c5, B:88:0x01d3, B:93:0x01de, B:94:0x01e9, B:38:0x00db, B:40:0x00e1, B:42:0x00ef, B:43:0x00f3, B:47:0x0109, B:102:0x01f8, B:103:0x01fc, B:105:0x0202, B:107:0x021b), top: B:123:0x01b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x021b A[Catch: Exception -> 0x023a, TryCatch #2 {Exception -> 0x023a, blocks: (B:83:0x01b0, B:84:0x01bf, B:86:0x01c5, B:88:0x01d3, B:93:0x01de, B:94:0x01e9, B:38:0x00db, B:40:0x00e1, B:42:0x00ef, B:43:0x00f3, B:47:0x0109, B:102:0x01f8, B:103:0x01fc, B:105:0x0202, B:107:0x021b), top: B:123:0x01b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1 A[Catch: Exception -> 0x023a, TryCatch #2 {Exception -> 0x023a, blocks: (B:83:0x01b0, B:84:0x01bf, B:86:0x01c5, B:88:0x01d3, B:93:0x01de, B:94:0x01e9, B:38:0x00db, B:40:0x00e1, B:42:0x00ef, B:43:0x00f3, B:47:0x0109, B:102:0x01f8, B:103:0x01fc, B:105:0x0202, B:107:0x021b), top: B:123:0x01b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014f A[Catch: Exception -> 0x023e, TryCatch #0 {Exception -> 0x023e, blocks: (B:55:0x0146, B:56:0x0149, B:58:0x014f, B:60:0x0157, B:62:0x015b, B:64:0x0167, B:69:0x0172, B:71:0x0176, B:73:0x0182, B:78:0x018d), top: B:119:0x0146 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ad  */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x013f -> B:82:0x01ae). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0141 -> B:56:0x0149). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x01ad -> B:82:0x01ae). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJ(java.util.List<java.lang.String> r17, java.lang.String r18, boolean r19, boolean r20, boolean r21, boolean r22, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r23, X.InterfaceC1364105Vn<? super java.util.List<? extends com.ss.android.ugc.aweme.im.contacts.api.model.IMUser>> r24) {
        /*
            Method dump skipped, instruction units count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BG1.LJIJ(java.util.List, java.lang.String, boolean, boolean, boolean, boolean, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    public static Object LJIIJ(C1BG1 c1bg1, List list, String str, boolean z, boolean z2, boolean z3, boolean z4, AwS581S0100000_2 awS581S0100000_2, InterfaceC1364105Vn interfaceC1364105Vn, int i) {
        Object objLJIJ;
        boolean z5 = z4;
        boolean z6 = z3;
        AwS581S0100000_2 awS581S0100000_22 = awS581S0100000_2;
        boolean z7 = z2;
        boolean z8 = z;
        if ((i & 4) != 0) {
            z8 = true;
        }
        if ((i & 8) != 0) {
            z7 = false;
        }
        if ((i & 16) != 0) {
            z6 = false;
        }
        if ((i & 32) != 0) {
            z5 = false;
        }
        if ((i & 64) != 0) {
            awS581S0100000_22 = null;
        }
        c1bg1.getClass();
        boolean zLJI = MethodIDManager.LJI(137208);
        if (LIZ(str)) {
            objLJIJ = ChatRoomAdaptiveRequestManager.LIZ.LJLLI(interfaceC1364105Vn, new C1317605Dq(list, str, z8, z7, z6, z5, awS581S0100000_22, null));
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            objLJIJ = c1bg1.LJIJ(list, str, z8, z7, z6, z5, awS581S0100000_22, interfaceC1364105Vn);
            if (zLJI) {
                MethodIDManager.LJ();
                return objLJIJ;
            }
        }
        return objLJIJ;
    }
}
