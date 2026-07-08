package X;

import android.util.SparseArray;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YM6, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YM6 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIILL;
    public final C0YM2 LIZ;
    public volatile C0YHW LIZIZ;
    public volatile C1DW5 LIZJ;
    public volatile C0YDZ LIZLLL;
    public volatile C872760YLq LJ;
    public volatile C871610YHf LJFF;
    public volatile C0Y1B LJI;
    public volatile C0YDX LJII;
    public volatile C0YM7 LJIIIIZZ;
    public volatile C866710XzJ LJIIIZ;
    public volatile C874740YTg LJIIJ;
    public volatile C0YE7 LJIIJJI;
    public volatile InterfaceC876320YZi LJIIL;
    public volatile C0YNW LJIILIIL;
    public volatile C876310YZh LJIILJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0YM6.class, "imSDKProxy", "getImSDKProxy()Lcom/bytedance/ies/im/core/api/proxy/IMSDKContainer;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0YM6.class, "globalMsgObserver", "getGlobalMsgObserver()Lcom/bytedance/ies/im/core/api/client/calback/IMessageObserver;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0YM6.class, "messagePropertyModel", "getMessagePropertyModel()Lcom/bytedance/ies/im/core/api/client/MessagePropertyModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0YM6.class, "messageRequestModel", "getMessageRequestModel()Lcom/bytedance/ies/im/core/api/client/IMessageRequestModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C0YM6.class, "unreadCountModel", "getUnreadCountModel()Lcom/bytedance/ies/im/core/api/client/UnReadCountModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C0YM6.class, "imConversationMemberModel", "getImConversationMemberModel()Lcom/bytedance/ies/im/core/api/search/IMConversationMemberModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C0YM6.class, "conversationPrefetchedIdModel", "getConversationPrefetchedIdModel()Lcom/bytedance/ies/im/core/api/client/IConversationPrefetchedIdModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C0YM6.class, "imSearchOfflineTestTool", "getImSearchOfflineTestTool()Lcom/bytedance/ies/im/core/api/search/IIMSearchOfflineTestTool;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C0YM6.class, "conversationListModel", "getConversationListModel()Lcom/bytedance/ies/im/core/api/client/ConversationListModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(C0YM6.class, "messageTaskQueue", "getMessageTaskQueue()Lcom/bytedance/ies/im/core/api/client/IMessageTaskQueue;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(C0YM6.class, "messageOperator", "getMessageOperator()Lcom/bytedance/ies/im/core/api/client/MessageOperator;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS12 = new C2217381BqS(C0YM6.class, "sdkManager", "getSdkManager()Lcom/bytedance/ies/im/core/api/client/ISDKManager;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS13 = new C2217381BqS(C0YM6.class, "internalService", "getInternalService()Lcom/bytedance/ies/im/core/api/service/IInternalService;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS14 = new C2217381BqS(C0YM6.class, "platformService", "getPlatformService()Lcom/bytedance/ies/im/core/api/service/IPlatformService;", 0);
        c09r3.getClass();
        LJIILL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11, c2217381BqS12, c2217381BqS13, c2217381BqS14};
    }

    public final InterfaceC876950Yaj LIZ() {
        C866710XzJ c866710XzJ = this.LJIIIZ;
        if (c866710XzJ == null) {
            synchronized (this) {
                c866710XzJ = this.LJIIIZ;
                if (c866710XzJ == null) {
                    C866710XzJ c866710XzJ2 = new C866710XzJ(LJ());
                    this.LJIIIZ = c866710XzJ2;
                    return c866710XzJ2;
                }
            }
        }
        return c866710XzJ;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0YDX, X.0YVS] */
    public final C0YVS LIZIZ() {
        C0YDX c0ydx = this.LJII;
        if (c0ydx == null) {
            synchronized (this) {
                c0ydx = this.LJII;
                if (c0ydx == null) {
                    final C0YHX c0yhxLJ = LJ();
                    ?? r0 = new C0YVS(c0yhxLJ) { // from class: X.0YDX
                        public final C0YHX LIZIZ;

                        @Override // X.C0YVS
                        public final List<Long> LJJI() {
                            return this.LIZIZ.LJIILJJIL().LJJI();
                        }

                        @Override // X.C0YVS
                        public final void LJJIJIL() {
                            this.LIZIZ.LJIILJJIL().LJJIJIL();
                        }

                        {
                            this.LIZIZ = c0yhxLJ;
                        }

                        @Override // X.C0YVS
                        public final boolean LJIJJ(C0YMW c0ymw) {
                            return this.LIZIZ.LJIILJJIL().LJIJJ(c0ymw);
                        }
                    };
                    this.LJII = r0;
                    return r0;
                }
            }
        }
        return c0ydx;
    }

    public final C1DW6 LIZJ() {
        C1DW5 c1dw5 = this.LIZJ;
        if (c1dw5 == null) {
            synchronized (this) {
                c1dw5 = this.LIZJ;
                if (c1dw5 == null) {
                    C1DW5 c1dw52 = new C1DW5();
                    this.LIZJ = c1dw52;
                    return c1dw52;
                }
            }
        }
        return c1dw5;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0Y1B, X.0Zii] */
    public final InterfaceC907380Zii LIZLLL() {
        C0Y1B c0y1b = this.LJI;
        if (c0y1b == null) {
            synchronized (this) {
                c0y1b = this.LJI;
                if (c0y1b == null) {
                    final C0YHX c0yhxLJ = LJ();
                    ?? r0 = new InterfaceC907380Zii(c0yhxLJ) { // from class: X.0Y1B
                        public final C0YHX LIZIZ;

                        @Override // X.InterfaceC907380Zii
                        public final List<C0YAE> LIZ() {
                            return this.LIZIZ.LIZ().LIZLLL();
                        }

                        {
                            this.LIZIZ = c0yhxLJ;
                        }
                    };
                    this.LJI = r0;
                    return r0;
                }
            }
        }
        return c0y1b;
    }

    public final C0YHX LJ() {
        C0YHW c0yhw = this.LIZIZ;
        if (c0yhw == null) {
            synchronized (this) {
                c0yhw = this.LIZIZ;
                if (c0yhw == null) {
                    C0YHW c0yhw2 = new C0YHW(this.LIZ);
                    this.LIZIZ = c0yhw2;
                    return c0yhw2;
                }
            }
        }
        return c0yhw;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0YM7, X.0YMN] */
    public final C0YMN LJFF() {
        C0YM7 c0ym7 = this.LJIIIIZZ;
        if (c0ym7 == null) {
            synchronized (this) {
                c0ym7 = this.LJIIIIZZ;
                if (c0ym7 == null) {
                    ?? r0 = new C0YMN() { // from class: X.0YM7
                        {
                            C2296808zG.LIZ(C0PEM.LIZ);
                        }
                    };
                    this.LJIIIIZZ = r0;
                    return r0;
                }
            }
        }
        return c0ym7;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0YE7, X.0YTa] */
    public final InterfaceC874680YTa LJI() {
        C0YE7 c0ye7 = this.LJIIJJI;
        if (c0ye7 == null) {
            synchronized (this) {
                c0ye7 = this.LJIIJJI;
                if (c0ye7 == null) {
                    final C0YM2 c0ym2 = this.LIZ;
                    final C0YHX c0yhxLJ = LJ();
                    final InterfaceC876950Yaj interfaceC876950YajLIZ = LIZ();
                    final InterfaceC874840YTq interfaceC874840YTqLJIIIZ = LJIIIZ();
                    final C1DW6 c1dw6LIZJ = LIZJ();
                    ?? r0 = new InterfaceC874680YTa(c0ym2, c0yhxLJ, interfaceC876950YajLIZ, interfaceC874840YTqLJIIIZ, c1dw6LIZJ) { // from class: X.0YE7
                        public final C0YM2 LIZIZ;
                        public final C0YHX LIZJ;
                        public final InterfaceC876950Yaj LIZLLL;
                        public final InterfaceC874840YTq LJ;
                        public final C1DW6 LJFF;

                        @Override // X.InterfaceC874680YTa
                        public final InterfaceC603530Nln LIZIZ() {
                            return this.LIZJ.LJFF().LIZIZ();
                        }

                        @Override // X.InterfaceC874680YTa
                        public final long LJII() {
                            return this.LIZJ.LJIILIIL().LLIIIL();
                        }

                        @Override // X.InterfaceC874680YTa
                        public final void LJIJJLI() {
                            this.LIZJ.LJIILIIL().LJIJJLI();
                        }

                        @Override // X.InterfaceC874680YTa
                        public final C869590Y9l LIZLLL(String str) {
                            return this.LIZJ.LJIILIIL().LJJIIZI(str);
                        }

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
                        @Override // X.InterfaceC874680YTa
                        public final List<C869590Y9l> LJIIJJI(InterfaceC874870YTt interfaceC874870YTt) {
                            C0YTZ c0ytz;
                            String str;
                            long orderIndex;
                            boolean z;
                            if ((interfaceC874870YTt instanceof C0YTZ) && (c0ytz = (C0YTZ) interfaceC874870YTt) != null && (str = c0ytz.LJFF) != null) {
                                C0YTZ c0ytz2 = (C0YTZ) interfaceC874870YTt;
                                List<C0ZCV> list = c0ytz2.LJI;
                                if (list == null) {
                                    list = C13BV.INSTANCE;
                                }
                                List<BaseTemplate> list2 = c0ytz2.LJII;
                                List<C0YC6> list3 = c0ytz2.LJIIIIZZ;
                                C874830YTp c874830YTp = c0ytz2.LJIILLIIL;
                                Map<String, String> map = c0ytz2.LJIIIZ;
                                Map<String, String> map2 = c0ytz2.LJIILIIL;
                                SparseArray<Object> sparseArray = c0ytz2.LJIILL;
                                String str2 = c0ytz2.LJIIL;
                                ReferenceInfo referenceInfo = c0ytz2.LJIJ;
                                String str3 = c0ytz2.LJIJI;
                                ByteString byteString = c0ytz2.LJIIJ;
                                ByteString byteString2 = c0ytz2.LJIIJJI;
                                C0Y8T c0y8tLIZ = this.LIZLLL.LIZ(str);
                                if (c0y8tLIZ == null) {
                                    C882400YjW.LIZ.getClass();
                                    C882400YjW.LIZLLL();
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("buildMessageList conversation null: ");
                                    sbLIZ.append(str);
                                    C882690Yjz.LJFF("MessageOperator", C2188811AlT.LIZIZ(sbLIZ));
                                    return new ArrayList();
                                }
                                ArrayList<C869590Y9l> arrayList = new ArrayList();
                                if (!((Boolean) C0A37.LIZ.getValue()).booleanValue()) {
                                    orderIndex = 10000;
                                } else {
                                    orderIndex = 0;
                                }
                                C869590Y9l lastShowMessage = c0y8tLIZ.getLastShowMessage();
                                if (lastShowMessage != null) {
                                    orderIndex = lastShowMessage.getOrderIndex();
                                }
                                long j = orderIndex + 1;
                                C882400YjW.LIZ.getClass();
                                C882400YjW.LIZ();
                                C883250Ykt c883250Ykt = C883250Ykt.LL;
                                long jLIZJ = C461720I8s.LIZJ();
                                if (!((C883390Yl7) C882400YjW.LJI()).isDebug() && !((C883390Yl7) C882400YjW.LJI()).isLocalTest()) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                for (BaseTemplate baseTemplate : (ArrayList) list2) {
                                    C869680Y9u c869680Y9u = new C869680Y9u(jLIZJ, null);
                                    c869680Y9u.conversation(c0y8tLIZ);
                                    c869680Y9u.msgType(baseTemplate.getMessageType());
                                    c869680Y9u.contentPB(baseTemplate.encode());
                                    c869680Y9u.scene(str2);
                                    c869680Y9u.source(str3);
                                    c869680Y9u.createdAt(System.currentTimeMillis());
                                    c869680Y9u.toStringPrivacyFilter(!z);
                                    c869680Y9u.transientExt(byteString2);
                                    C869590Y9l c869590Y9lBuild = c869680Y9u.build();
                                    C882400YjW c882400YjW = C882400YjW.LIZ;
                                    C0YM2 c0ym22 = this.LIZIZ;
                                    c882400YjW.getClass();
                                    C882400YjW.LIZIZ(c0ym22).LJIILL(c0y8tLIZ, c869590Y9lBuild, baseTemplate);
                                    arrayList.add(c869590Y9lBuild);
                                }
                                for (C0ZCV c0zcv : list) {
                                    C882400YjW c882400YjW2 = C882400YjW.LIZ;
                                    C0YM2 c0ym23 = this.LIZIZ;
                                    c882400YjW2.getClass();
                                    int iLJII = C882400YjW.LIZIZ(c0ym23).LJII(c0zcv);
                                    if (iLJII <= -1) {
                                        C882400YjW.LIZLLL();
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("buildMessageList msgType unknown: ");
                                        sbLIZ2.append(iLJII);
                                        C882690Yjz.LJFF("MessageOperator", C2188811AlT.LIZIZ(sbLIZ2));
                                    } else {
                                        C869680Y9u c869680Y9u2 = new C869680Y9u(jLIZJ, null);
                                        c869680Y9u2.conversation(c0y8tLIZ);
                                        c869680Y9u2.msgType(iLJII);
                                        c869680Y9u2.scene(str2);
                                        c869680Y9u2.source(str3);
                                        c869680Y9u2.content(C051M.LJ(c0zcv, false));
                                        c869680Y9u2.transientExt(byteString2);
                                        C869590Y9l c869590Y9lBuild2 = c869680Y9u2.build();
                                        C882400YjW.LIZIZ(this.LIZIZ).LJIILL(c0y8tLIZ, c869590Y9lBuild2, c0zcv);
                                        arrayList.add(c869590Y9lBuild2);
                                    }
                                }
                                for (C869590Y9l c869590Y9l : arrayList) {
                                    if (map != null) {
                                        c869590Y9l.putExt(map);
                                    }
                                    if (map2 != null) {
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        for (Map.Entry<String, String> entry : map2.entrySet()) {
                                            if (entry.getKey() != null && entry.getValue() != null) {
                                                linkedHashMap.put(entry.getKey(), entry.getValue());
                                            }
                                        }
                                        c869590Y9l.putLocalExt(linkedHashMap);
                                    }
                                    if (byteString != null) {
                                        c869590Y9l.setPersistentExtra(byteString);
                                    }
                                    if (sparseArray != null) {
                                        int size = sparseArray.size();
                                        for (int i = 0; i < size; i++) {
                                            c869590Y9l.putLocalCache(sparseArray.keyAt(i), sparseArray.valueAt(i));
                                        }
                                    }
                                    c869590Y9l.setOrderIndex(j);
                                    j++;
                                    if (list3 != null) {
                                        Iterator<C0YC6> it2 = list3.iterator();
                                        while (it2.hasNext()) {
                                            it2.next().setMsgUuid(c869590Y9l.getUuid());
                                        }
                                    }
                                    c869590Y9l.setAttachments(list3);
                                    c869590Y9l.setReadStatus(1);
                                    if (c874830YTp != null) {
                                        this.LJ.LIZIZ(c869590Y9l, c874830YTp);
                                    }
                                    if (referenceInfo != null) {
                                        c869590Y9l.setRefMsg(referenceInfo);
                                    }
                                    c869590Y9l.putLocalCache(2001, Long.valueOf(System.currentTimeMillis()));
                                }
                                return arrayList;
                            }
                            return new ArrayList();
                        }

                        @Override // X.InterfaceC874680YTa
                        public final C0Y6Q<C0Y9O> LJIIL(C0Y9U c0y9u) {
                            return this.LIZJ.LJIILIIL().LJIIL(c0y9u);
                        }

                        @Override // X.InterfaceC874680YTa
                        public final boolean LJIILJJIL(long j) {
                            return this.LIZJ.LJIILIIL().LLIIIZ(j);
                        }

                        @Override // X.InterfaceC874680YTa
                        public final C869590Y9l LJIJ(String str) {
                            return this.LIZJ.LJIILIIL().LJJLJ(str);
                        }

                        @Override // X.InterfaceC874680YTa
                        public final void LJJI(C0Y3I c0y3i) {
                            this.LIZJ.LJIJ().LJLL(c0y3i);
                        }

                        @Override // X.InterfaceC874680YTa
                        public final Long LJJIFFI(C869590Y9l c869590Y9l) {
                            return this.LIZJ.LJIILIIL().LJJIFFI(c869590Y9l);
                        }

                        @Override // X.InterfaceC874680YTa
                        public final C0Y6Q<C0Y9N> LJJII(C0Y9U c0y9u) {
                            return this.LIZJ.LJIILIIL().LJJII(c0y9u);
                        }

                        @Override // X.InterfaceC874680YTa
                        public final long LJJIII(List<Integer> list) {
                            return this.LIZJ.LJIILIIL().LLF(list);
                        }

                        @Override // X.InterfaceC874680YTa
                        public final void LJJIIJ(C869520Y9e c869520Y9e) {
                            this.LIZJ.LJIILIIL().LJJIIJ(c869520Y9e);
                        }

                        @Override // X.InterfaceC874680YTa
                        public final List<C869590Y9l> LJJIJIIJIL(List<Long> list) {
                            return this.LIZJ.LJIILIIL().LJJIJIIJIL(list);
                        }

                        @Override // X.InterfaceC874680YTa
                        public final List LJJIJLIJ(long j) {
                            return this.LIZJ.LJIILIIL().LJJIJLIJ(j);
                        }

                        @Override // X.InterfaceC874680YTa
                        public final C869590Y9l LJJJ(long j) {
                            return this.LIZJ.LJIILIIL().LJLIIL(j);
                        }

                        @Override // X.InterfaceC874680YTa
                        public final void LIZJ(C914120Zta c914120Zta, List list) {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                C869590Y9l c869590Y9l = (C869590Y9l) it2.next();
                                C882400YjW c882400YjW = C882400YjW.LIZ;
                                C0YM2 c0ym22 = this.LIZIZ;
                                c882400YjW.getClass();
                                C882400YjW.LIZIZ(c0ym22).LJIIL(c869590Y9l);
                                c869590Y9l.putLocalCache(2002, Long.valueOf(System.currentTimeMillis()));
                            }
                            this.LIZJ.LJIILIIL().LIZJ(c914120Zta, list);
                        }

                        @Override // X.InterfaceC874680YTa
                        public final void LJI(C0Y3I c0y3i, List<? extends C869590Y9l> list) {
                            this.LIZJ.LJIILIIL().LLIIIILZ(list);
                            this.LIZJ.LJIILIIL().LLJLLIL(c0y3i, list);
                        }

                        @Override // X.InterfaceC874680YTa
                        public final void LJIIIIZZ(C0Y3I c0y3i, List<? extends C869590Y9l> list) {
                            this.LIZJ.LJIILIIL().LLI(c0y3i, list);
                        }

                        @Override // X.InterfaceC874680YTa
                        public final void LJIILIIL(Map<Long, String> map, InterfaceC863600XuI<List<C869590Y9l>> interfaceC863600XuI) {
                            this.LIZJ.LJIJ().LJIILIIL(map, interfaceC863600XuI);
                        }

                        @Override // X.InterfaceC874680YTa
                        public final boolean LJIILLIIL(C869590Y9l c869590Y9l, boolean z) {
                            if (c869590Y9l == null) {
                                return false;
                            }
                            return this.LIZJ.LJIILIIL().LJLI(c869590Y9l, Boolean.valueOf(z));
                        }

                        @Override // X.InterfaceC874680YTa
                        public final void LJIJI(C869590Y9l c869590Y9l, C914150Ztd c914150Ztd) {
                            this.LIZJ.LJIILIIL().LJIJI(c869590Y9l, c914150Ztd);
                        }

                        @Override // X.InterfaceC874680YTa
                        public final List LJIL(long j, List list) {
                            return this.LIZJ.LJIILIIL().LJIL(j, list);
                        }

                        @Override // X.InterfaceC874680YTa
                        public final void LJJIIJZLJL(C0Y3I c0y3i, String str) {
                            this.LIZJ.LJIJ().LLJJJIL(c0y3i, str);
                        }

                        @Override // X.InterfaceC874680YTa
                        public final Object LJJIJIL(List<Long> list, InterfaceC1364105Vn<? super List<? extends C869590Y9l>> interfaceC1364105Vn) {
                            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
                            List<C869590Y9l> listLJJLJLI = this.LIZJ.LJIILIIL().LJJLJLI(list);
                            C189200o6.m2constructorimpl(listLJJLJLI);
                            c23260099m.resumeWith(listLJJLJLI);
                            Object objLIZ = c23260099m.LIZ();
                            if (objLIZ == C099R.LJFF()) {
                                C099Q.LIZJ(interfaceC1364105Vn);
                            }
                            return objLIZ;
                        }

                        @Override // X.InterfaceC874680YTa
                        public final void LJJIJL(C869590Y9l c869590Y9l, InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI) {
                            this.LIZJ.LJIILIIL().LJJIJL(c869590Y9l, interfaceC863600XuI);
                        }

                        @Override // X.InterfaceC874680YTa
                        public final C869590Y9l LJJIL(long j, String str) {
                            return this.LIZJ.LJIILIIL().LJJIL(j, str);
                        }

                        @Override // X.InterfaceC874680YTa
                        public final void LJJJJ(C869590Y9l c869590Y9l, C914120Zta c914120Zta) {
                            this.LIZJ.LJIILIIL().LJJJJ(c869590Y9l, c914120Zta);
                        }

                        @Override // X.InterfaceC874680YTa
                        public final void LIZ(C869590Y9l c869590Y9l, boolean z, InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI) {
                            this.LIZJ.LJIILIIL().LIZ(c869590Y9l, z, interfaceC863600XuI);
                        }

                        @Override // X.InterfaceC874680YTa
                        public final void LJ(C0Y3I c0y3i, C869590Y9l c869590Y9l, C914120Zta c914120Zta) {
                            LJJIZ(c0y3i, c869590Y9l, c914120Zta, 0, null);
                        }

                        @Override // X.InterfaceC874680YTa
                        public final void LJIIIZ(InterfaceC863600XuI interfaceC863600XuI, String str, List list) {
                            this.LIZJ.LJIJ().LLJILJILJ(interfaceC863600XuI, str, list);
                        }

                        @Override // X.InterfaceC874680YTa
                        public final void LJIILL(C0Y3I c0y3i, C0YA6 c0ya6, C914090ZtX c914090ZtX) {
                            this.LIZJ.LJIILIIL().LJIILL(c0y3i, c0ya6, c914090ZtX);
                        }

                        @Override // X.InterfaceC874680YTa
                        public final List LJIJJ(int i, String str, List list) {
                            return this.LIZJ.LJIILIIL().LLILLIZIL(i, str, list);
                        }

                        @Override // X.InterfaceC874680YTa
                        public final void LJJIIZ(C0Y3I c0y3i, C869590Y9l c869590Y9l, InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI) {
                            this.LIZJ.LJIILIIL().LJJIIZ(c0y3i, c869590Y9l, interfaceC863600XuI);
                        }

                        @Override // X.InterfaceC874680YTa
                        public final void LJJIJ(long j, InterfaceC863600XuI interfaceC863600XuI, C0Y8T c0y8t) {
                            this.LIZJ.LJIILIIL().LJJIJ(j, interfaceC863600XuI, c0y8t);
                        }

                        @Override // X.InterfaceC874680YTa
                        public final long LJJIJIIJI(String str, int[] iArr, long[] jArr) {
                            return this.LIZJ.LJIILIIL().LJJLL(str, iArr, jArr);
                        }

                        @Override // X.InterfaceC874680YTa
                        public final int LJJ(long j, long j2, String str, boolean z) {
                            if ((!z && str.length() == 0) || j > j2) {
                                return -1;
                            }
                            if (j == j2) {
                                return 1;
                            }
                            if (z) {
                                return this.LIZJ.LJIILIIL().LLJJIJIL(j, j2);
                            }
                            return this.LIZJ.LJIILIIL().LJZI(j, j2, str);
                        }

                        {
                            this.LIZIZ = c0ym2;
                            this.LIZJ = c0yhxLJ;
                            this.LIZLLL = interfaceC876950YajLIZ;
                            this.LJ = interfaceC874840YTqLJIIIZ;
                            this.LJFF = c1dw6LIZJ;
                        }

                        @Override // X.InterfaceC874680YTa
                        public final void LJJIZ(C0Y3I c0y3i, C869590Y9l c869590Y9l, C914120Zta c914120Zta, int i, C0YMW c0ymw) {
                            C882400YjW c882400YjW = C882400YjW.LIZ;
                            C0YM2 c0ym22 = this.LIZIZ;
                            c882400YjW.getClass();
                            C882400YjW.LIZIZ(c0ym22).LJIIL(c869590Y9l);
                            if (i != 0) {
                                LJJIIZ(c0y3i, c869590Y9l, null);
                                C0YJ5 c0yj5LJIJI = this.LIZJ.LJIJI();
                                C0YC9 c0yc9 = new C0YC9();
                                c0yc9.LJJIIJZLJL = i;
                                c0yj5LJIJI.LJ(i, c0yc9, c869590Y9l);
                                if (c914120Zta != null) {
                                    c914120Zta.LIZIZ(c0ymw);
                                    return;
                                }
                                return;
                            }
                            c869590Y9l.putLocalCache(2002, Long.valueOf(System.currentTimeMillis()));
                            this.LIZJ.LJIILIIL().LLJJJJLIIL(c869590Y9l, c914120Zta);
                        }

                        @Override // X.InterfaceC874680YTa
                        public final List LJIIJ(String str, long j, List list, Integer num, long j2, Integer num2) {
                            int iIntValue;
                            C0YE6 c0ye6LJIILIIL = this.LIZJ.LJIILIIL();
                            if (num != null) {
                                iIntValue = num.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            return c0ye6LJIILIIL.LJZ(str, j, list, null, null, iIntValue, j2, num2);
                        }

                        @Override // X.InterfaceC874680YTa
                        public final List<C869590Y9l> LJJIIZI(String str, long j, List<Integer> list, List<Integer> list2, List<String> list3, Integer num) {
                            int iIntValue;
                            C0YE6 c0ye6LJIILIIL = this.LIZJ.LJIILIIL();
                            if (num != null) {
                                iIntValue = num.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            return c0ye6LJIILIIL.LLJILLL(str, j, list, list2, list3, iIntValue);
                        }

                        @Override // X.InterfaceC874680YTa
                        public final List<C869590Y9l> LJFF(long j, long j2, Integer num, boolean z, int[] iArr, boolean z2, boolean z3) {
                            int iIntValue;
                            C0YE6 c0ye6LJIILIIL = this.LIZJ.LJIILIIL();
                            if (num != null) {
                                iIntValue = num.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            return c0ye6LJIILIIL.LLILZLL(j, j2, iIntValue, z, iArr, z2, z3);
                        }

                        @Override // X.InterfaceC874680YTa
                        public final List LJIIZILJ(long j, Integer num, boolean z, int[] iArr, boolean z2, boolean z3, long j2) {
                            int iIntValue;
                            C0YE6 c0ye6LJIILIIL = this.LIZJ.LJIILIIL();
                            if (num != null) {
                                iIntValue = num.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            return c0ye6LJIILIIL.LLJJL(j, iIntValue, z, iArr, z2, z3, j2);
                        }
                    };
                    this.LJIIJJI = r0;
                    return r0;
                }
            }
        }
        return c0ye7;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0YDZ, X.0YNa] */
    public final InterfaceC873120YNa LJII() {
        C0YDZ c0ydz = this.LIZLLL;
        if (c0ydz == null) {
            synchronized (this) {
                c0ydz = this.LIZLLL;
                if (c0ydz == null) {
                    final C0YHX c0yhxLJ = LJ();
                    ?? r0 = new InterfaceC873120YNa(c0yhxLJ) { // from class: X.0YDZ
                        public final C0YHX LIZIZ;

                        {
                            this.LIZIZ = c0yhxLJ;
                        }

                        @Override // X.InterfaceC873120YNa
                        public final C0YA1 LIZIZ(String str) {
                            return this.LIZIZ.LJII().LLJLL(str);
                        }

                        @Override // X.InterfaceC873120YNa
                        public final Object LIZ(long j, String str) {
                            return C2286608xc.LJFF(this.LIZIZ.LJII().LJJLIIIJLJLI(j, str));
                        }

                        @Override // X.InterfaceC873120YNa
                        public final Object LIZJ(long j, String str) {
                            return C2286608xc.LJFF(this.LIZIZ.LJII().LJLIL(j, str));
                        }
                    };
                    this.LIZLLL = r0;
                    return r0;
                }
            }
        }
        return c0ydz;
    }

    public final InterfaceC878180Yci LJIIIIZZ() {
        C872760YLq c872760YLq = this.LJ;
        if (c872760YLq == null) {
            synchronized (this) {
                c872760YLq = this.LJ;
                if (c872760YLq == null) {
                    C872760YLq c872760YLq2 = new C872760YLq(LJ());
                    this.LJ = c872760YLq2;
                    return c872760YLq2;
                }
            }
        }
        return c872760YLq;
    }

    public final InterfaceC874840YTq LJIIIZ() {
        C874740YTg c874740YTg = this.LJIIJ;
        if (c874740YTg == null) {
            synchronized (this) {
                c874740YTg = this.LJIIJ;
                if (c874740YTg == null) {
                    C874740YTg c874740YTg2 = new C874740YTg(LJ(), LIZ());
                    this.LJIIJ = c874740YTg2;
                    return c874740YTg2;
                }
            }
        }
        return c874740YTg;
    }

    public final InterfaceC876320YZi LJIIJ() {
        InterfaceC876320YZi interfaceC876320YZi = this.LJIIL;
        if (interfaceC876320YZi == null) {
            synchronized (this) {
                interfaceC876320YZi = this.LJIIL;
                if (interfaceC876320YZi == null) {
                    C0YM2 c0ym2 = this.LIZ;
                    C0YHX c0yhxLJ = LJ();
                    InterfaceC874840YTq interfaceC874840YTqLJIIIZ = LJIIIZ();
                    C1DW6 c1dw6LIZJ = LIZJ();
                    C0YM9 c0ym9 = (C0YM9) C1807670x8n.LJJIIZ(this.LIZ);
                    InterfaceC876320YZi c883090Ykd = C0C64.LJIILLIIL().LJIIZILJ(31744, 0, 2, "imsdk_fix_sdk_manager_thread_lock", true) > 0 ? new C883090Ykd(c0ym2, c0yhxLJ, interfaceC874840YTqLJIIIZ, c1dw6LIZJ, c0ym9) : new C883100Yke(c0ym2, c0yhxLJ, interfaceC874840YTqLJIIIZ, c1dw6LIZJ, c0ym9);
                    this.LJIIL = c883090Ykd;
                    return c883090Ykd;
                }
            }
        }
        return interfaceC876320YZi;
    }

    public final AbstractC880230Yg1 LJIIJJI() {
        C871610YHf c871610YHf = this.LJFF;
        if (c871610YHf == null) {
            synchronized (this) {
                c871610YHf = this.LJFF;
                if (c871610YHf == null) {
                    C871610YHf c871610YHf2 = new C871610YHf(LJ());
                    this.LJFF = c871610YHf2;
                    return c871610YHf2;
                }
            }
        }
        return c871610YHf;
    }

    public C0YM6(C0YM2 c0ym2) {
        this.LIZ = c0ym2;
    }
}
