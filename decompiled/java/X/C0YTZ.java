package X;

import android.os.SystemClock;
import android.util.SparseArray;
import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.utils.IChatCustomizeHelper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS111S0400000_14;
import kotlin.jvm.internal.AwS32S0600000_14;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YTZ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YTZ implements InterfaceC874870YTt {
    public static final AtomicInteger LJJI = new AtomicInteger(0);
    public static final C19994613Lc LJJIFFI = C19994513Lb.LIZIZ(System.currentTimeMillis());
    public final int LIZ;
    public final InterfaceC874840YTq LIZIZ;
    public final InterfaceC874680YTa LIZJ;
    public final InterfaceC876950Yaj LIZLLL;
    public final C0YM2 LJ;
    public String LJFF;
    public final List<C0ZCV> LJI;
    public final List<BaseTemplate> LJII;
    public List<C0YC6> LJIIIIZZ;
    public Map<String, String> LJIIIZ;
    public ByteString LJIIJ;
    public ByteString LJIIJJI;
    public String LJIIL;
    public Map<String, String> LJIILIIL;
    public boolean LJIILJJIL;
    public SparseArray<Object> LJIILL;
    public C874830YTp LJIILLIIL;
    public C0YTK LJIIZILJ;
    public ReferenceInfo LJIJ;
    public String LJIJI;
    public boolean LJIJJ;
    public final C1762406vG LJIJJLI;
    public int LJIL;
    public List<C869590Y9l> LJJ;

    public final List<C869590Y9l> LIZ() {
        List<C869590Y9l> list = this.LJJ;
        if (list == null || list.isEmpty()) {
            this.LJJ = this.LIZJ.LJIIJJI(this);
        }
        return this.LJJ;
    }

    public final C0YTK LIZJ() {
        C0YTK c0ytk = this.LJIIZILJ;
        if (c0ytk instanceof C0YTK) {
            return c0ytk;
        }
        return null;
    }

    public final void LIZLLL() {
        IChatCustomizeHelper.LIZ.getClass();
        IChatCustomizeHelper iChatCustomizeHelperLIZ = C1619106Vp.LIZ();
        if (iChatCustomizeHelperLIZ == null || !iChatCustomizeHelperLIZ.isSupportCustomization()) {
            return;
        }
        IChatCustomizeHelper iChatCustomizeHelperLIZ2 = C1619106Vp.LIZ();
        this.LJIIJ = iChatCustomizeHelperLIZ2 != null ? iChatCustomizeHelperLIZ2.createPersistentExtra(this.LJIIJ, false) : null;
    }

    public final boolean LJ() {
        if (C866950Xzh.LIZ(this.LJFF)) {
            return C866950Xzh.LIZIZ(this.LJI) || (this.LJII.isEmpty() ^ true);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageTask{");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", ");
        List<C0ZCV> list = this.LJI;
        sbLIZ.append(list != null ? Integer.valueOf(((ArrayList) list).size()) : null);
        sbLIZ.append(", ");
        sbLIZ.append(false);
        sbLIZ.append(", ");
        sbLIZ.append(this.LJIL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJIIJ(C0Y8T c0y8t) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Conversation{");
        sbLIZ.append(c0y8t.getConversationId());
        sbLIZ.append(", ");
        sbLIZ.append(c0y8t.isTemp());
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJI(C0Y8T c0y8t) {
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onConversationTemp: ");
        sbLIZ.append(LJIIJ(c0y8t));
        sbLIZ.append(", ");
        sbLIZ.append(this);
        C882690Yjz.LJIIIZ("MsgSender_Task", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJIL >= 0) {
            return;
        }
        this.LJIL = 0;
        List<C869590Y9l> listLIZ = LIZ();
        for (C869590Y9l c869590Y9l : listLIZ) {
            c869590Y9l.setMsgStatus(0);
            this.LIZJ.LJJIJL(c869590Y9l, C866950Xzh.LIZJ(AFwS248S0000000_14.get$arr$(586)));
            C0YTK c0ytk = this.LJIIZILJ;
            if (c0ytk != null) {
                c0ytk.LJI(c0y8t, c869590Y9l);
            }
        }
        C0YTK c0ytk2 = this.LJIIZILJ;
        if (c0ytk2 != null) {
            c0ytk2.LIZJ(c0y8t, listLIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C874700YTc
            if (r0 == 0) goto L59
            r5 = r7
            X.0YTc r5 = (X.C874700YTc) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 1
            if (r0 == 0) goto L3f
            if (r0 != r3) goto L5f
            java.lang.Object r2 = r5.LL
            java.util.Iterator r2 = (java.util.Iterator) r2
            X.C155000ia.LIZIZ(r1)
        L26:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r1 = r2.next()
            X.0Y9l r1 = (X.C869590Y9l) r1
            X.0Hst r0 = X.C455050Hst.LIZ
            r5.LL = r2
            r5.LLILZ = r3
            java.lang.Object r0 = r0.LIZ(r1, r5)
            if (r0 != r4) goto L26
            return r4
        L3f:
            X.C155000ia.LIZIZ(r1)
            java.util.List<X.0Y9l> r0 = r6.LJJ
            if (r0 == 0) goto L4c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L67
        L4c:
            X.0YTa r0 = r6.LIZJ
            java.util.List r0 = r0.LJIIJJI(r6)
            r6.LJJ = r0
            java.util.Iterator r2 = r0.iterator()
            goto L26
        L59:
            X.0YTc r5 = new X.0YTc
            r5.<init>(r6, r7)
            goto L12
        L5f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L67:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YTZ.LJII(X.05Vn):java.lang.Object");
    }

    public final void LJIIIIZZ(boolean z) {
        String str;
        C1762406vG c1762406vG = this.LJIJJLI;
        c1762406vG.getClass();
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("stage", "message_task_queue");
        pairArr[1] = new Pair("step", "check_conversation_exist");
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[2] = new Pair("result", str);
        pairArr[3] = new Pair("time", c1762406vG.LIZJ());
        c1762406vG.LIZ(C1761806vA.LIZ(pairArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0YOZ] */
    public final void LJIIIZ(final C0YTK c0ytk) {
        C0YHX c0yhxLIZ;
        ?? LJFF;
        ?? arrayList;
        EnumC873480YOk enumC873480YOk;
        if (!LJ()) {
            C054G c054gLIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZ));
            C23250099c.LIZLLL(c054gLIZ, C2107308Nj.LIZ.LLIILII(), null, new C865040Xwc(c0ytk, c054gLIZ, null), 2);
            return;
        }
        C0YM2 c0ym2 = this.LJ;
        IIMCoreProxyService.LIZ.getClass();
        IIMCoreProxyService iIMCoreProxyServiceLIZ = C875420YVw.LIZ();
        if (iIMCoreProxyServiceLIZ != null && (c0yhxLIZ = iIMCoreProxyServiceLIZ.LIZ(c0ym2)) != null && (LJFF = c0yhxLIZ.LJFF()) != 0) {
            String str = this.LJFF;
            if (str == null) {
                arrayList = C13BV.INSTANCE;
            } else {
                C1265504xJ c1265504xJ = new C1265504xJ(str);
                arrayList = new ArrayList();
                for (BaseTemplate baseTemplate : (ArrayList) this.LJII) {
                    int messageType = baseTemplate.getMessageType();
                    C460190I2v c460190I2v = new C460190I2v(baseTemplate.encode());
                    String str2 = this.LJIIL;
                    String str3 = this.LJIJI;
                    ByteString byteString = this.LJIIJ;
                    ByteString byteString2 = this.LJIIJJI;
                    Map<String, String> map = this.LJIIIZ;
                    Map<String, String> map2 = this.LJIILIIL;
                    SparseArray<Object> sparseArray = this.LJIILL;
                    if (sparseArray == null) {
                        sparseArray = new SparseArray<>();
                    }
                    sparseArray.put(2004, baseTemplate);
                    arrayList.add(new C0YP2(c1265504xJ, messageType, c460190I2v, str2, str3, map, map2, byteString, byteString2, sparseArray, this.LJIIIIZZ, this.LJIJ, 12288));
                }
                for (C0ZCV c0zcv : (ArrayList) this.LJI) {
                    String json = GsonProtectorUtils.toJson(C051M.LIZ, c0zcv);
                    if (json != null) {
                        C882400YjW c882400YjW = C882400YjW.LIZ;
                        C0YM2 c0ym22 = this.LJ;
                        c882400YjW.getClass();
                        int iLJII = C882400YjW.LIZIZ(c0ym22).LJII(c0zcv);
                        C459930I1v c459930I1v = new C459930I1v(json);
                        String str4 = this.LJIIL;
                        String str5 = this.LJIJI;
                        ByteString byteString3 = this.LJIIJ;
                        ByteString byteString4 = this.LJIIJJI;
                        Map<String, String> map3 = this.LJIIIZ;
                        Map<String, String> map4 = this.LJIILIIL;
                        SparseArray<Object> sparseArray2 = this.LJIILL;
                        if (sparseArray2 == null) {
                            sparseArray2 = new SparseArray<>();
                        }
                        sparseArray2.put(2004, c0zcv);
                        arrayList.add(new C0YP2(c1265504xJ, iLJII, c459930I1v, str4, str5, map3, map4, byteString3, byteString4, sparseArray2, this.LJIIIIZZ, this.LJIJ, 12288));
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            final C054G c054gLIZ2 = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZ));
            final boolean z = true;
            if (this.LJIILJJIL && arrayList.size() > 1) {
                enumC873480YOk = EnumC873480YOk.IN_ORDER;
            } else {
                enumC873480YOk = EnumC873480YOk.PARALLEL;
            }
            C0IC5 c0ic5 = new C0IC5(enumC873480YOk, 1);
            final C0YTJ c0ytj = C0YTJ.ADDED_AND_STARTED;
            C054G c054g = C0YTP.LIZ;
            final AbstractC2238408pq abstractC2238408pqLLIILII = C2107308Nj.LIZ.LLIILII();
            if (c054gLIZ2 != C0YTP.LIZ) {
                final C259800zU c259800zU = new C259800zU();
                LJFF.LIZJ(arrayList, c0ic5, new C0YOY() { // from class: X.0YTG
                    @Override // X.C0YOY
                    public final void onEvent(InterfaceC873750YPl interfaceC873750YPl) {
                        if (interfaceC873750YPl instanceof C0YQY) {
                            C23250099c.LIZLLL(c054gLIZ2, abstractC2238408pqLLIILII, null, new C0YTH(c259800zU, interfaceC873750YPl, c0ytj, c0ytk, null), 2);
                            return;
                        }
                        if (interfaceC873750YPl instanceof C0YPL) {
                            C23250099c.LIZLLL(c054gLIZ2, abstractC2238408pqLLIILII, null, new C0YTI(c0ytk, interfaceC873750YPl, null, c259800zU), 2);
                            return;
                        }
                        if (interfaceC873750YPl instanceof C0YQ0) {
                            C23250099c.LIZLLL(c054gLIZ2, abstractC2238408pqLLIILII, null, new C0YTF(c0ytk, interfaceC873750YPl, null, c259800zU), 2);
                        } else {
                            if (!(interfaceC873750YPl instanceof C0YPX)) {
                                return;
                            }
                            InterfaceC497601wk interfaceC497601wk = c054gLIZ2;
                            C23250099c.LIZLLL(interfaceC497601wk, abstractC2238408pqLLIILII, null, new C0YTE(c0ytk, c259800zU, interfaceC873750YPl, z, interfaceC497601wk, null), 2);
                        }
                    }
                });
                return;
            } else {
                "cancelScopeOnTerminal=true requires an explicit scope; the shared bridge scope is process-lifetime".toString();
                throw new IllegalArgumentException("cancelScopeOnTerminal=true requires an explicit scope; the shared bridge scope is process-lifetime");
            }
        }
        C0YTP.LIZ(c0ytk);
    }

    public final void LJFF(C0Y3I c0y3i, C0Y8T c0y8t) {
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onConversationReady: ");
        sbLIZ.append(LJIIJ(c0y8t));
        sbLIZ.append(", ");
        sbLIZ.append(this);
        C882690Yjz.LJIIIZ("MsgSender_Task", C2188811AlT.LIZIZ(sbLIZ));
        SystemClock.uptimeMillis();
        char c = 1;
        if (this.LJIL >= 1) {
            return;
        }
        this.LJIL = 1;
        List<C869590Y9l> listLIZ = LIZ();
        C0YTK c0ytkLIZJ = LIZJ();
        InterfaceC874680YTa interfaceC874680YTa = this.LIZJ;
        List<C869590Y9l> listLLIIII = C13LP.LLIIII(listLIZ);
        char c2 = 0;
        if (this.LJIILJJIL && listLLIIII.size() > 1) {
            AtomicInteger atomicInteger = new AtomicInteger(0);
            if (c0ytkLIZJ != null) {
                c0ytkLIZJ.LIZLLL(c0y8t, (C869590Y9l) ListProtector.get(listLLIIII, 0));
            }
            for (C869590Y9l c869590Y9l : listLLIIII) {
                c869590Y9l.setMsgStatus(1);
                interfaceC874680YTa.LJJIJL(c869590Y9l, C866950Xzh.LIZJ(AFwS248S0000000_14.get$arr$(587)));
            }
            interfaceC874680YTa.LIZJ(new C914120Zta(new AwS111S0400000_14(c0ytkLIZJ, c0y8t, listLLIIII, atomicInteger, 5), new AwS111S0400000_14(c0ytkLIZJ, c0y8t, listLLIIII, atomicInteger, 6), 12), listLLIIII);
            return;
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C869590Y9l c869590Y9l2 : listLIZ) {
            C1762406vG c1762406vG = this.LJIJJLI;
            c1762406vG.getClass();
            Pair[] pairArr = new Pair[3];
            pairArr[c2] = new Pair("stage", "message_task");
            pairArr[c] = new Pair("step", "on_conversation_ready");
            pairArr[2] = new Pair("time", c1762406vG.LIZJ());
            c1762406vG.LIZ(C1761806vA.LIZ(pairArr));
            c869590Y9l2.getUuid();
            Intrinsics.LJFF(C1762406vG.LJ, Boolean.TRUE);
            C0YTK c0ytkLIZJ2 = LIZJ();
            if (c0ytkLIZJ2 != null) {
                c0ytkLIZJ2.LIZLLL(c0y8t, c869590Y9l2);
            }
            this.LIZJ.LJ(c0y3i, c869590Y9l2, new C914120Zta(new AwS32S0600000_14(this, (C0YTZ) c0y8t, (C0Y8T) c869590Y9l2, (C869590Y9l) arrayList, listLIZ, (List<C869590Y9l>) linkedHashMap, (Map<C869590Y9l, C0YMW>) 4), new AwS32S0600000_14(this, (C0YTZ) c0y8t, (C0Y8T) c869590Y9l2, (C869590Y9l) listLIZ, (List<C869590Y9l>) arrayList, (List<C869590Y9l>) linkedHashMap, (Map<C869590Y9l, C0YMW>) 5), 12));
            c = 1;
            c2 = 0;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.06vI] */
    public C0YTZ(int i, InterfaceC874840YTq interfaceC874840YTq, InterfaceC874680YTa interfaceC874680YTa, InterfaceC876950Yaj interfaceC876950Yaj) {
        C0YM2 c0ym2 = C0YM2.TIKTOK_SOCIAL_IM;
        this.LIZ = i;
        this.LIZIZ = interfaceC874840YTq;
        this.LIZJ = interfaceC874680YTa;
        this.LIZLLL = interfaceC876950Yaj;
        this.LJ = c0ym2;
        this.LJI = new ArrayList();
        this.LJII = new ArrayList();
        this.LJIIL = "";
        this.LJIJI = "";
        boolean z = true;
        if (LJJIFFI.nextInt(1, 10001) != 1) {
            C0I0B c0i0b = C0I0B.LJFF;
            c0i0b.LIZJ();
            if (!C894660Z7w.LIZJ()) {
                c0i0b.LIZJ();
                if (!Intrinsics.LJFF(C894660Z7w.LIZIZ(), "local_test")) {
                    z = false;
                }
            }
        }
        ?? r3 = new InterfaceC1762506vH() { // from class: X.06vI
            @Override // X.InterfaceC1762506vH
            public final void LIZIZ(Map map) {
                if (this.LIZ.LJIJJ) {
                    C0I0B.LJFF.LIZIZ();
                    C20684815ws.LJIILLIIL("im_send_message_business_funnel", map);
                }
            }
        };
        if (C1762406vG.LJ == null) {
            C1762406vG.LJ = Boolean.valueOf(z);
        }
        Boolean bool = C1762406vG.LJ;
        this.LJIJJLI = new C1762406vG(bool != null ? bool.booleanValue() : z, SystemClock.uptimeMillis(), r3);
        this.LJIL = -1;
        this.LJJ = new ArrayList();
    }

    public final void LIZIZ(C0Y8T c0y8t, List<C869590Y9l> list, List<C869590Y9l> list2, Map<C869590Y9l, C0YMW> map) {
        int i;
        if (list2.size() + map.size() != list.size()) {
            return;
        }
        if (!list2.isEmpty()) {
            i = 2;
        } else {
            i = 3;
        }
        this.LJIL = i;
        C0YTK c0ytkLIZJ = LIZJ();
        if (c0ytkLIZJ != null) {
            c0ytkLIZJ.LIZIZ(c0y8t, list2, map);
        }
    }
}
