package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.sticker.api.model.PopularStickerStruct;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0Hp4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C452680Hp4 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIIIZZ;
    public List<PopularStickerStruct> LIZ;
    public List<StickerItem> LIZIZ;
    public LinkedHashMap<Integer, C452650Hp1> LIZJ;
    public int LJ;
    public volatile InterfaceC450290HlD LJII;
    public final C054G LIZLLL = C2296808zG.LIZ(C0PEM.LIZJ);
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(612));
    public final AtomicBoolean LJI = new AtomicBoolean(false);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C452680Hp4.class, "stickersRepository", "getStickersRepository()Lcom/ss/android/ugc/aweme/im/sticker/api/repo/IMStickerRepository;", 0);
        C13LE.LIZ.getClass();
        LJIIIIZZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public static String LIZ() {
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        return curUserId == null ? "" : curUserId;
    }

    public static void LIZJ() {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C2112608Pk.LJII(C2213981Bky.LIZIZ.getApplicationContext()));
            sbLIZ.append("/sticker_store_resources/pop_sticker_tab/");
            sbLIZ.append(LIZ());
            C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
            if (c0vsj.exists()) {
                c0vsj.delete();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final Keva LJIIIZ() {
        return (Keva) this.LJFF.getValue();
    }

    public static String LJIIIIZZ() {
        String str = C454510Hs1.LIZ() ? "_v2" : "";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId());
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        return strLIZIZ != null ? strLIZIZ : "";
    }

    public static long LJIIJ(C452680Hp4 c452680Hp4) {
        Keva kevaLJIIIZ = c452680Hp4.LJIIIZ();
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        c452680Hp4.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_pop_sticker_fetch_time");
        sbLIZ.append(curUserId);
        return kevaLJIIIZ.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
    }

    public static void LJIILIIL(C452680Hp4 c452680Hp4) {
        Keva kevaLJIIIZ = c452680Hp4.LJIIIZ();
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        c452680Hp4.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_pop_sticker_fetch_time");
        sbLIZ.append(curUserId);
        kevaLJIIIZ.storeLong(C2188811AlT.LIZIZ(sbLIZ), jCurrentTimeMillis);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super kotlin.Unit> r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C452750HpB
            if (r0 == 0) goto L44
            r4 = r9
            X.0HpB r4 = (X.C452750HpB) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r2 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L79
            X.C155000ia.LIZIZ(r2)
        L22:
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L4a
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L29:
            X.C155000ia.LIZIZ(r2)
            java.util.LinkedHashMap<java.lang.Integer, X.0Hp1> r0 = r8.LIZJ
            if (r0 == 0) goto L33
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r4.LLILLL = r1
            X.1DFB r2 = X.C0PEM.LIZJ
            X.08aV r1 = new X.08aV
            r0 = 0
            r1.<init>(r8, r0)
            java.lang.Object r2 = X.C23250099c.LJI(r4, r2, r1)
            if (r2 != r3) goto L22
            return r3
        L44:
            X.0HpB r4 = new X.0HpB
            r4.<init>(r8, r9)
            goto L12
        L4a:
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.util.Iterator r6 = r2.iterator()
        L53:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r5 = r6.next()
            X.0Hp5 r5 = (X.C452690Hp5) r5
            int r0 = r5.requestCursor
            java.lang.Integer r4 = X.C2286608xc.LJ(r0)
            X.0Hp1 r3 = new X.0Hp1
            java.util.ArrayList<com.ss.android.ugc.aweme.im.common.model.StickerItem> r2 = r5.stickers
            int r1 = r5.nextCursor
            boolean r0 = r5.hasMore
            r3.<init>(r2, r1, r0)
            r7.put(r4, r3)
            goto L53
        L74:
            r8.LIZJ = r7
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L79:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C452680Hp4.LIZLLL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.InterfaceC1364105Vn<? super kotlin.Unit> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof X.C452760HpC
            if (r0 == 0) goto L92
            r12 = r14
            X.0HpC r12 = (X.C452760HpC) r12
            int r2 = r12.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L92
            int r2 = r2 - r1
            r12.LLILLL = r2
        L12:
            java.lang.Object r3 = r12.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r12.LLILLL
            r11 = 0
            r2 = 2
            r4 = 1
            if (r0 == 0) goto L29
            if (r0 == r4) goto L57
            if (r0 != r2) goto L99
            X.C155000ia.LIZIZ(r3)
        L26:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L29:
            X.C155000ia.LIZIZ(r3)
            int r3 = r13.LJ
            r0 = 3
            if (r3 <= r0) goto L34
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L34:
            com.ss.android.ugc.aweme.stickerstore.api.StickerApiV2 r5 = X.C452670Hp3.LIZIZ()     // Catch: java.lang.Exception -> L5d
            r6 = 50
            r7 = 0
            X.0Hp0 r0 = X.EnumC452640Hp0.DM_STICKER_PANEL     // Catch: java.lang.Exception -> L5d
            int r9 = r0.getValue()     // Catch: java.lang.Exception -> L5d
            X.01GW r0 = X.C294720Bgs.LIZ     // Catch: java.lang.Exception -> L5d
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L5d
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Exception -> L5d
            int r10 = r0.intValue()     // Catch: java.lang.Exception -> L5d
            r12.LLILLL = r4     // Catch: java.lang.Exception -> L5d
            r8 = r7
            java.lang.Object r3 = r5.LIZJ(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L5d
            if (r3 != r1) goto L5a
            goto La1
        L57:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L5d
        L5a:
            com.ss.android.ugc.aweme.im.sticker.api.model.PopularStickerListResponseV2 r3 = (com.ss.android.ugc.aweme.im.sticker.api.model.PopularStickerListResponseV2) r3     // Catch: java.lang.Exception -> L5d
            goto L6f
        L5d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            boolean r0 = r0 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L68
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L68:
            int r0 = r13.LJ
            int r0 = r0 + 1
            r13.LJ = r0
            r3 = r11
        L6f:
            if (r3 == 0) goto L74
            LJIILIIL(r13)
        L74:
            if (r3 == 0) goto L85
            java.util.List r0 = r3.getStickerList()
            if (r0 == 0) goto L85
            java.util.List r0 = X.C1697820uHc.LIZLLL(r0)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r0)
        L85:
            r13.LIZIZ = r11
            if (r11 == 0) goto L26
            r12.LLILLL = r2
            java.lang.Object r0 = r13.LJIILJJIL(r11, r12)
            if (r0 != r1) goto L26
            return r1
        L92:
            X.0HpC r12 = new X.0HpC
            r12.<init>(r13, r14)
            goto L12
        L99:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C452680Hp4.LJFF(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.im.common.model.StickerItem>> r13) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r13 instanceof X.C452770HpD
            if (r0 == 0) goto L2d
            r6 = r13
            X.0HpD r6 = (X.C452770HpD) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2d
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r8 = 2
            r9 = 1
            r7 = 3
            if (r0 == 0) goto L33
            if (r0 == r9) goto L8b
            if (r0 == r8) goto L79
            if (r0 == r7) goto L8b
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2d:
            X.0HpD r6 = new X.0HpD
            r6.<init>(r12, r13)
            goto L12
        L33:
            X.C155000ia.LIZIZ(r1)
            long r10 = LJIIJ(r12)
            X.01GW r0 = com.ss.android.ugc.aweme.exp.IMStickerPanelRedesignConfig.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.exp.IMStickerPanelRedesignConfig$Config r0 = (com.ss.android.ugc.aweme.exp.IMStickerPanelRedesignConfig.Config) r0
            int r0 = r0.popularStickerCacheExpHours
            int r0 = r0 * 60
            int r0 = r0 * 60
            long r3 = (long) r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r0
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r10
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L61
            r0 = 0
            r12.LJ = r0
            r6.LLILLL = r9
            java.lang.Object r0 = r12.LJFF(r6)
            if (r0 != r5) goto L8e
            return r5
        L61:
            java.util.List<com.ss.android.ugc.aweme.im.common.model.StickerItem> r0 = r12.LIZIZ
            if (r0 == 0) goto L66
            return r0
        L66:
            java.lang.Class<com.ss.android.ugc.aweme.im.common.model.StickerItem> r3 = com.ss.android.ugc.aweme.im.common.model.StickerItem.class
            r6.LLILLL = r8
            X.1DFB r2 = X.C0PEM.LIZJ
            X.08aT r1 = new X.08aT
            r0 = 0
            r1.<init>(r12, r3, r0)
            java.lang.Object r1 = X.C23250099c.LJI(r6, r2, r1)
            if (r1 != r5) goto L7c
            return r5
        L79:
            X.C155000ia.LIZIZ(r1)
        L7c:
            java.util.List r1 = (java.util.List) r1
            r12.LIZIZ = r1
            if (r1 != 0) goto L8e
            r6.LLILLL = r7
            java.lang.Object r0 = r12.LJFF(r6)
            if (r0 != r5) goto L8e
            return r5
        L8b:
            X.C155000ia.LIZIZ(r1)
        L8e:
            java.util.List<com.ss.android.ugc.aweme.im.common.model.StickerItem> r0 = r12.LIZIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C452680Hp4.LJIIL(X.05Vn):java.lang.Object");
    }

    public static List LIZIZ(List list, Set set) {
        if (set != null && !set.isEmpty()) {
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!C13LP.LJJJJ(((PopularStickerStruct) obj).getStringId(), set)) {
                        arrayList.add(obj);
                    }
                }
                return new ArrayList(arrayList);
            }
            return null;
        }
        if (list != null) {
            return new ArrayList(list);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(int r14, X.InterfaceC1364105Vn<? super X.C452650Hp1> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof X.C452740HpA
            if (r0 == 0) goto L93
            r9 = r15
            X.0HpA r9 = (X.C452740HpA) r9
            int r2 = r9.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L93
            int r2 = r2 - r1
            r9.LLILZ = r2
        L12:
            java.lang.Object r1 = r9.LLILLJJLI
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r9.LLILZ
            r5 = 0
            r10 = 1
            if (r0 == 0) goto L3a
            if (r0 != r10) goto L9b
            int r14 = r9.LL
            X.C155000ia.LIZIZ(r1)
        L25:
            java.util.LinkedHashMap<java.lang.Integer, X.0Hp1> r1 = r13.LIZJ
            if (r1 == 0) goto L9a
            java.lang.Integer r0 = X.C2286608xc.LJ(r14)
            java.lang.Object r1 = r1.get(r0)
            X.0Hp1 r1 = (X.C452650Hp1) r1
            if (r1 == 0) goto L9a
            java.util.List<com.ss.android.ugc.aweme.im.common.model.StickerItem> r0 = r1.LIZ
            if (r0 == 0) goto L9a
            return r1
        L3a:
            X.C155000ia.LIZIZ(r1)
            com.bytedance.keva.Keva r3 = r13.LJIIIZ()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "key_pop_sticker_tab_fetch_time"
            r1.append(r0)
            java.lang.String r0 = LIZ()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r1 = 0
            long r11 = r3.getLong(r0, r1)
            X.01GW r0 = com.ss.android.ugc.aweme.exp.IMStickerPanelRedesignConfig.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.exp.IMStickerPanelRedesignConfig$Config r0 = (com.ss.android.ugc.aweme.exp.IMStickerPanelRedesignConfig.Config) r0
            int r0 = r0.popularStickerCacheExpHours
            int r0 = r0 * 60
            int r0 = r0 * 60
            long r3 = (long) r0
            r6 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r6
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 <= 0) goto L88
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r11
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L88
            r13.LIZJ = r5
            X.054G r2 = r13.LIZLLL
            X.08aX r1 = new X.08aX
            r1.<init>(r13, r5)
            r0 = 3
            X.C23250099c.LIZLLL(r2, r5, r5, r1, r0)
            return r5
        L88:
            r9.LL = r14
            r9.LLILZ = r10
            java.lang.Object r0 = r13.LIZLLL(r9)
            if (r0 != r8) goto L25
            return r8
        L93:
            X.0HpA r9 = new X.0HpA
            r9.<init>(r13, r15)
            goto L12
        L9a:
            return r5
        L9b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C452680Hp4.LJII(int, X.05Vn):java.lang.Object");
    }

    public final <T extends Serializable> Object LJIILJJIL(List<? extends T> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C2142908aR(this, list, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.EnumC452720Hp8 r10, java.util.Set<java.lang.String> r11, X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C452680Hp4.LJ(X.0Hp8, java.util.Set, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(X.EnumC452720Hp8 r14, java.util.Set r15, X.InterfaceC1364105Vn r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C452680Hp4.LJIIJJI(X.0Hp8, java.util.Set, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0157, code lost:
    
        if (r4 == null) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.EnumC452640Hp0 r21, int r22, int r23, java.lang.Long r24, boolean r25, X.InterfaceC1364105Vn<? super X.C452650Hp1> r26) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C452680Hp4.LJI(X.0Hp0, int, int, java.lang.Long, boolean, X.05Vn):java.lang.Object");
    }
}
