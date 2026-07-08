package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.notice.NoticeFeature;
import com.ss.android.ugc.aweme.im.service.IDmHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0XzJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C866710XzJ implements InterfaceC876950Yaj {
    public final C0YHX LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new C866700XzI());
    public final C054G LIZLLL = C2296808zG.LIZ(C0PEM.LIZ.plus(C2296908zH.LIZ()));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1458));

    @Override // X.InterfaceC876950Yaj
    public final List<C0Y8T> LIZIZ() {
        List listLLIIII = C13LP.LLIIII(C13LP.LJJJJLI(this.LIZIZ.LIZ().LJJIIZI().values()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLLIIII) {
            C0Y8T c0y8t = (C0Y8T) obj;
            C0YI5 c0yi5LIZ = C876340YZk.LIZ(C876340YZk.LIZ);
            if (((C876310YZh) c0yi5LIZ).LIZ.LJJ().LLJZIJLIL(c0y8t.isGroupChat(), c0y8t.getConversationId(), c0y8t.getLastShowMessage(), c0y8t.getMinIndex())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC876950Yaj
    public final List<C0Y8T> LJII() {
        return this.LIZIZ.LIZ().LJJLIIIJLJLI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC876950Yaj
    public final C878750Ydd LJIILJJIL() {
        C0Y6Q c0y6qLIZIZ;
        if (!C293390Bej.LIZ()) {
            return this.LIZIZ.LIZ().LJIILJJIL();
        }
        try {
            c0y6qLIZIZ = (C0Y6Q) C23250099c.LJ(C23271099x.INSTANCE, new C865970Xy7(null, this));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String message = th.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            c0y6qLIZIZ = C865670Xxd.LIZIZ(new C0YPY(-1, message, th));
        }
        return (C878750Ydd) c0y6qLIZIZ.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC876950Yaj
    public final long LJIILL() {
        C0Y6Q c0y6qLIZIZ;
        if (!C293390Bej.LIZ()) {
            return this.LIZIZ.LIZ().LJIILL();
        }
        try {
            c0y6qLIZIZ = (C0Y6Q) C23250099c.LJ(C23271099x.INSTANCE, new C866960Xzi(null, this));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String message = th.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            c0y6qLIZIZ = C865670Xxd.LIZIZ(new C0YPY(-1, message, th));
        }
        C866930Xzf c866930Xzf = (C866930Xzf) c0y6qLIZIZ.LIZ;
        if (c866930Xzf != null) {
            return c866930Xzf.LIZIZ;
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC876950Yaj
    public final List<C0Y8T> LJJIJ() {
        C0Y6Q c0y6qLIZIZ;
        if (!C293390Bej.LIZ()) {
            return this.LIZIZ.LIZ().LJJJJLL();
        }
        try {
            c0y6qLIZIZ = (C0Y6Q) C23250099c.LJ(C23271099x.INSTANCE, new C866970Xzj(null, this));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String message = th.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            c0y6qLIZIZ = C865670Xxd.LIZIZ(new C0YPY(-1, message, th));
        }
        C867240Y0k c867240Y0k = (C867240Y0k) c0y6qLIZIZ.LIZ;
        List<C0Y8T> list = c867240Y0k != null ? c867240Y0k.LIZIZ : null;
        return list == null ? C13BV.INSTANCE : list;
    }

    public C866710XzJ(C0YHX c0yhx) {
        this.LIZIZ = c0yhx;
    }

    @Override // X.InterfaceC876950Yaj
    public final C0Y8T LIZ(String str) {
        if (str == null) {
            return null;
        }
        return this.LIZIZ.LIZ().LIZ(str);
    }

    @Override // X.InterfaceC876950Yaj
    public final void LJFF(String str) {
        if (C293390Bej.LIZ()) {
            C23250099c.LIZLLL(this.LIZLLL, null, null, new C866030XyD(null, this, str), 3);
        } else {
            this.LIZIZ.LIZ().LJFF(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0XzW, X.0Y0o] */
    @Override // X.InterfaceC876950Yaj
    public final void LJI(final InterfaceC866830XzV interfaceC866830XzV) {
        if (C0BIJ.LIZ()) {
            final C866740XzM c866740XzM = (C866740XzM) this.LJ.getValue();
            c866740XzM.LIZIZ(interfaceC866830XzV);
            InterfaceC866310Xyf interfaceC866310XyfLIZIZ = c866740XzM.LIZ.LIZIZ();
            InterfaceC866920Xze interfaceC866920XzeLIZJ = interfaceC866310XyfLIZIZ.LJIILIIL().LIZJ(new InterfaceC1741206rq() { // from class: X.0YST
                @Override // X.InterfaceC1741206rq
                public final void onEvent(InterfaceC874460YSe interfaceC874460YSe) {
                    C0YMW iMError;
                    C866740XzM c866740XzM2 = c866740XzM;
                    InterfaceC866830XzV interfaceC866830XzV2 = interfaceC866830XzV;
                    c866740XzM2.getClass();
                    if (interfaceC874460YSe instanceof C874420YSa) {
                        interfaceC866830XzV2.LJLILLLLZI(((C874420YSa) interfaceC874460YSe).LIZ);
                        return;
                    }
                    if (interfaceC874460YSe instanceof C0YSY) {
                        C0YSY c0ysy = (C0YSY) interfaceC874460YSe;
                        interfaceC866830XzV2.LJLJI(c0ysy.LIZIZ.ordinal(), c0ysy.LIZ);
                        return;
                    }
                    if (interfaceC874460YSe instanceof C874430YSb) {
                        interfaceC866830XzV2.LJJLIIIJ(((C874430YSb) interfaceC874460YSe).LIZ);
                        return;
                    }
                    if (interfaceC874460YSe instanceof C874450YSd) {
                        interfaceC866830XzV2.LJZI(((C874450YSd) interfaceC874460YSe).LIZ);
                        return;
                    }
                    if (interfaceC874460YSe instanceof C874440YSc) {
                        interfaceC866830XzV2.LJJJJJL(((C874440YSc) interfaceC874460YSe).LIZ);
                        return;
                    }
                    if (interfaceC874460YSe instanceof C0YSW) {
                        C0YSW c0ysw = (C0YSW) interfaceC874460YSe;
                        Long l = c0ysw.LIZ;
                        C0Y8T c0y8t = c0ysw.LIZIZ;
                        C0YPQ c0ypq = c0ysw.LIZJ;
                        if (c0ypq != null) {
                            iMError = c0ypq.toIMError();
                        } else {
                            iMError = null;
                        }
                        interfaceC866830XzV2.LJLL(new C1711306n1(l, c0y8t, iMError, null));
                        return;
                    }
                    if (interfaceC874460YSe instanceof C0YSZ) {
                        C0YSZ c0ysz = (C0YSZ) interfaceC874460YSe;
                        interfaceC866830XzV2.LLIIII(c0ysz.LIZIZ, c0ysz.LIZ);
                        return;
                    }
                    throw new C1954807lC();
                }
            });
            InterfaceC866920Xze interfaceC866920XzeLIZJ2 = interfaceC866310XyfLIZIZ.LJI().getEvents().LIZJ(new InterfaceC1741206rq() { // from class: X.0XzN
                @Override // X.InterfaceC1741206rq
                public final void onEvent(InterfaceC866870XzZ interfaceC866870XzZ) {
                    C866740XzM c866740XzM2 = c866740XzM;
                    InterfaceC866830XzV interfaceC866830XzV2 = interfaceC866830XzV;
                    c866740XzM2.getClass();
                    if (interfaceC866870XzZ instanceof C866780XzQ) {
                        C866780XzQ c866780XzQ = (C866780XzQ) interfaceC866870XzZ;
                        interfaceC866830XzV2.LJLI(c866780XzQ.LIZ, new ArrayList(c866780XzQ.LIZIZ));
                        return;
                    }
                    if (interfaceC866870XzZ instanceof C866810XzT) {
                        interfaceC866830XzV2.LJJZZI(new ArrayList(((C866810XzT) interfaceC866870XzZ).LIZIZ));
                        return;
                    }
                    if (interfaceC866870XzZ instanceof C866790XzR) {
                        interfaceC866830XzV2.LJJLL(new ArrayList(((C866790XzR) interfaceC866870XzZ).LIZIZ));
                        return;
                    }
                    if (interfaceC866870XzZ instanceof C866800XzS) {
                        interfaceC866830XzV2.LJJLJLI(new ArrayList(((C866800XzS) interfaceC866870XzZ).LIZIZ));
                    } else {
                        if (interfaceC866870XzZ instanceof C866770XzP) {
                            C866770XzP c866770XzP = (C866770XzP) interfaceC866870XzZ;
                            interfaceC866830XzV2.LLIILZL(c866770XzP.LIZIZ, c866770XzP.LIZ, new ArrayList(c866770XzP.LIZJ));
                            return;
                        }
                        throw new C1954807lC();
                    }
                }
            });
            ?? r2 = new InterfaceC867280Y0o(interfaceC866830XzV) { // from class: X.0XzW
                public final InterfaceC866830XzV LL;

                @Override // X.InterfaceC868050Y3n
                public final void LJJJJJL(C0Y8T c0y8t) {
                }

                @Override // X.InterfaceC868050Y3n
                public final void LJJLIIIJ(C0Y8T c0y8t) {
                }

                @Override // X.InterfaceC868050Y3n
                public final void LJJLJLI(List<C0YAE> list) {
                }

                @Override // X.InterfaceC868050Y3n
                public final void LJJLL(List<C0YAE> list) {
                }

                @Override // X.InterfaceC868050Y3n
                public final void LJJZZI(List<C0YAE> list) {
                }

                @Override // X.InterfaceC868050Y3n
                public final void LJLI(String str, List<C0YAE> list) {
                }

                @Override // X.InterfaceC868050Y3n
                public final void LJLILLLLZI(C0Y8T c0y8t) {
                }

                @Override // X.InterfaceC868050Y3n
                public final void LJLJI(int i, C0Y8T c0y8t) {
                }

                @Override // X.InterfaceC868050Y3n
                public final void LJLL(C1711306n1 c1711306n1) {
                }

                @Override // X.InterfaceC868050Y3n
                public final void LJZI(C0Y8T c0y8t) {
                }

                @Override // X.InterfaceC868050Y3n
                public final void LLIIII(int i, String str) {
                }

                @Override // X.InterfaceC868050Y3n
                public final void LLIILZL(int i, String str, List list) {
                }

                @Override // X.InterfaceC868050Y3n
                public final int LLLIIII() {
                    return this.LL.LLLIIII();
                }

                {
                    this.LL = interfaceC866830XzV;
                }

                @Override // X.InterfaceC867280Y0o
                public final void LLLIZZ(Map<String, C0Y8T> map) {
                    this.LL.LLLIZZ(map);
                }
            };
            c866740XzM.LIZ.LIZ().LJJLIIIJILLIZJL(r2);
            c866740XzM.LIZIZ.put(interfaceC866830XzV, new C866730XzL(interfaceC866920XzeLIZJ, interfaceC866920XzeLIZJ2, r2));
            return;
        }
        this.LIZIZ.LIZ().LJJLIIIJILLIZJL(interfaceC866830XzV);
    }

    @Override // X.InterfaceC876950Yaj
    public final void LJIIJ(boolean z) {
        this.LIZIZ.LIZ().LJIIJ(z);
    }

    @Override // X.InterfaceC876950Yaj
    public final C0Y6Q<C867240Y0k> LJIIJJI(C869710Y9x c869710Y9x) {
        if (C293390Bej.LIZ()) {
            try {
                return (C0Y6Q) C23250099c.LJ(C23271099x.INSTANCE, new C866300Xye(null, this, c869710Y9x));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                String message = th.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                return C865670Xxd.LIZIZ(new C0YPY(-1, message, th));
            }
        }
        return this.LIZIZ.LIZ().LJIIJJI(c869710Y9x);
    }

    @Override // X.InterfaceC876950Yaj
    public final void LJIIL(C0Y6L c0y6l) {
        this.LIZIZ.LIZ().LJIIL(c0y6l);
    }

    @Override // X.InterfaceC876950Yaj
    public final void LJIILLIIL(InterfaceC868750Y6f interfaceC868750Y6f) {
        this.LIZIZ.LIZ().LJIILLIIL(interfaceC868750Y6f);
    }

    @Override // X.InterfaceC876950Yaj
    public final List<C0Y8T> LJIJJ(List<String> list) {
        C0Y6Q c0y6qLIZIZ;
        if (C293390Bej.LIZ()) {
            try {
                c0y6qLIZIZ = (C0Y6Q) C23250099c.LJ(C23271099x.INSTANCE, new C866020XyC(null, this, list));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                String message = th.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                c0y6qLIZIZ = C865670Xxd.LIZIZ(new C0YPY(-1, message, th));
            }
            List<C0Y8T> list2 = (List) c0y6qLIZIZ.LIZ;
            if (list2 == null) {
                return C13BV.INSTANCE;
            }
            return list2;
        }
        return this.LIZIZ.LIZ().LJIJJ(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC876950Yaj
    public final C0Y8T LJIL(String str) {
        C0Y6Q c0y6qLIZIZ;
        if (C293390Bej.LIZ() && str != null && str.length() != 0) {
            try {
                c0y6qLIZIZ = (C0Y6Q) C23250099c.LJ(C23271099x.INSTANCE, new C865950Xy5(null, this, str));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                String message = th.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                c0y6qLIZIZ = C865670Xxd.LIZIZ(new C0YPY(-1, message, th));
            }
            return (C0Y8T) c0y6qLIZIZ.LIZ;
        }
        return this.LIZIZ.LIZ().LJIL(str);
    }

    @Override // X.InterfaceC876950Yaj
    public final void LJJIFFI(C0Y6L c0y6l) {
        this.LIZIZ.LIZ().LJJIFFI(c0y6l);
    }

    @Override // X.InterfaceC876950Yaj
    public final C0Y8T LJJIIJZLJL(Long l) {
        if (l != null) {
            l.longValue();
            return this.LIZIZ.LIZ().LJIILIIL(l.longValue());
        }
        return null;
    }

    @Override // X.InterfaceC876950Yaj
    public final void LJJIIZI(C0Y8T c0y8t) {
        this.LIZIZ.LIZ().LJJJ(Collections.singletonList(c0y8t.getConversationId()));
    }

    @Override // X.InterfaceC876950Yaj
    public final void LJJIJIIJI(C0Y6X c0y6x) {
        String str;
        NoticeFeature noticeFeatureLIZ = NoticeFeature.LIZ.LIZ();
        C05RV c05rvLIZJ = null;
        if (noticeFeatureLIZ != null) {
            c05rvLIZJ = noticeFeatureLIZ.LIZJ();
        }
        if (c05rvLIZJ == C05RV.PERSONAL_INBOX) {
            return;
        }
        Long lValueOf = Long.valueOf(C461720I8s.LIZJ());
        if (lValueOf.longValue() >= 0) {
            long jLongValue = lValueOf.longValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("conv_tags_has_init:");
            sbLIZ.append(jLongValue);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (((Keva) this.LIZJ.getValue()).getBoolean(strLIZIZ, false)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean zLJIJJLI = C1336205Ku.LIZ(false).getImPrivacySettings().LJIJJLI(false);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (C0Y8T c0y8t : c0y6x.LIZIZ) {
                C0Y8W settingInfo = c0y8t.getSettingInfo();
                if (settingInfo != null && !(!settingInfo.getConversationTags().isEmpty())) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    int category = c0y8t.getCategory();
                    if (category == EnumC868530Y5j.USER_SET_CONVERSATION_CATEGORY_PRIMARY.getValue()) {
                        linkedHashSet.add(EnumC879080YeA.PRIMARY.getValue());
                    } else if (category == EnumC868530Y5j.USER_SET_CONVERSATION_CATEGORY_SECONDARY.getValue()) {
                        linkedHashSet.add(EnumC879080YeA.SECONDARY.getValue());
                    }
                    Map<String, String> ext = c0y8t.getExt();
                    if (ext != null && (str = ext.get("a:user_conversation_tag")) != null) {
                        if (a0.LJJIIZI(str, "10005", false)) {
                            linkedHashSet.add(EnumC879080YeA.SPAM.getValue());
                        }
                        if (a0.LJJIIZI(str, "10006", false)) {
                            linkedHashSet.add(EnumC879080YeA.STARRED.getValue());
                        }
                        Set<String> set = C892380Yzc.LIZIZ;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            Iterator<T> it2 = set.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (a0.LJJIIZI(str, (String) it2.next(), false)) {
                                        linkedHashSet.add(EnumC879080YeA.LEAD.getValue());
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                    if (zLJIJJLI && c0y8t.isRisky()) {
                        linkedHashSet.add(EnumC879080YeA.SPAM.getValue());
                        linkedHashSet.add(EnumC879080YeA.FILTERED_MSG.getValue());
                    }
                    settingInfo.setConversationTags(linkedHashSet);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("initConversationTagsDB, conv_id=");
                    sbLIZ2.append(c0y8t.getConversationId());
                    sbLIZ2.append(", str=");
                    sbLIZ2.append(settingInfo.getConversationTagsStr());
                    C2188811AlT.LIZIZ(sbLIZ2);
                    String conversationId = c0y8t.getConversationId();
                    if (conversationId != null) {
                        String conversationTagsStr = settingInfo.getConversationTagsStr();
                        if (conversationTagsStr == null) {
                            conversationTagsStr = "";
                        }
                        linkedHashMap.put(conversationId, conversationTagsStr);
                    }
                }
            }
            if (linkedHashMap.isEmpty() || this.LIZIZ.LIZ().LJJIII(linkedHashMap)) {
                ((Keva) this.LIZJ.getValue()).storeBoolean(strLIZIZ, true);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("init conversationTags success, total conv num: ");
                sbLIZ3.append(c0y6x.LIZIZ.size());
                sbLIZ3.append(", update conv num: ");
                sbLIZ3.append(linkedHashMap.size());
                sbLIZ3.append(", time consume: ");
                sbLIZ3.append(System.currentTimeMillis() - jCurrentTimeMillis);
                C2188811AlT.LIZIZ(sbLIZ3);
            }
        }
    }

    @Override // X.InterfaceC876950Yaj
    public final void LJJIJIIJIL(InterfaceC866830XzV interfaceC866830XzV) {
        if (C0BIJ.LIZ()) {
            ((C866740XzM) this.LJ.getValue()).LIZIZ(interfaceC866830XzV);
        } else {
            this.LIZIZ.LIZ().LJJII(interfaceC866830XzV);
        }
    }

    @Override // X.InterfaceC876950Yaj
    public final void LIZJ(String str, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            interfaceC863600XuI.onSuccess(null);
        } else {
            if (C293390Bej.LIZ()) {
                C054G c054g = this.LIZLLL;
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(c054g, C2107308Nj.LIZ.LLIILII(), null, new C865940Xy4(interfaceC863600XuI, null, this, str), 2);
                return;
            }
            this.LIZIZ.LIZ().LJJLIL(str, interfaceC863600XuI);
        }
    }

    @Override // X.InterfaceC876950Yaj
    public final void LIZLLL(List list, C877110Yaz c877110Yaz) {
        if (C293390Bej.LIZ()) {
            C054G c054g = this.LIZLLL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c054g, C2107308Nj.LIZ.LLIILII(), null, new C865980Xy8(c877110Yaz, null, this, list), 2);
            return;
        }
        this.LIZIZ.LIZ().LJJIIJZLJL(list, c877110Yaz);
    }

    @Override // X.InterfaceC876950Yaj
    public final void LJ(long j, String str) {
        this.LIZIZ.LIZ().LJ(j, str);
    }

    @Override // X.InterfaceC876950Yaj
    public final void LJIILIIL(Map map, C1768906wJ c1768906wJ) {
        if (C293390Bej.LIZ()) {
            C054G c054g = this.LIZLLL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c054g, C2107308Nj.LIZ.LLIILII(), null, new C866070XyH(c1768906wJ, null, this, map), 2);
            return;
        }
        this.LIZIZ.LIZ().LJJJJJL(map, c1768906wJ);
    }

    @Override // X.InterfaceC876950Yaj
    public final void LJIJI(List list, C914150Ztd c914150Ztd) {
        if (C293390Bej.LIZ()) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String conversationId = ((C0Y8T) it2.next()).getConversationId();
                if (conversationId != null) {
                    arrayList.add(conversationId);
                }
            }
            C054G c054g = this.LIZLLL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c054g, C2107308Nj.LIZ.LLIILII(), null, new C865990Xy9(c914150Ztd, null, this, arrayList), 2);
        } else {
            this.LIZIZ.LIZ().LJIJI(list, c914150Ztd);
        }
        IDmHelper iDmHelper = (IDmHelper) PluggableExtentionKt.pluggableSpiForReal(IDmHelper.class);
        if (iDmHelper != null) {
            iDmHelper.LIZIZ(list);
        }
    }

    @Override // X.InterfaceC876950Yaj
    public final void LJJ(String str, InterfaceC863600XuI<String> interfaceC863600XuI) {
        InterfaceC866540Xz2 interfaceC866540Xz2LJJI = this.LIZIZ.LJJI(str);
        C13BV c13bv = C13BV.INSTANCE;
        interfaceC866540Xz2LJJI.LLILLJJLI(c13bv, c13bv, Boolean.FALSE, null);
        if (C293390Bej.LIZ()) {
            C054G c054g = this.LIZLLL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c054g, C2107308Nj.LIZ.LLIILII(), null, new C865930Xy3(interfaceC863600XuI, null, this, str), 2);
            return;
        }
        this.LIZIZ.LIZ().LJJ(str, interfaceC863600XuI);
    }

    @Override // X.InterfaceC876950Yaj
    public final void LJJIIJ(String str, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        long jLJ = C866950Xzh.LJ(str, interfaceC863600XuI);
        if (jLJ <= 0) {
            return;
        }
        if (C293390Bej.LIZ()) {
            C054G c054g = this.LIZLLL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c054g, C2107308Nj.LIZ.LLIILII(), null, new C865920Xy2(interfaceC863600XuI, null, this, jLJ), 2);
            return;
        }
        this.LIZIZ.LIZ().LJJJJZI(jLJ, interfaceC863600XuI);
    }

    @Override // X.InterfaceC876950Yaj
    public final void LJJIJIL(List list, C914150Ztd c914150Ztd) {
        List<C0Y8T> listLJIJJ = LJIJJ(list);
        if (C293390Bej.LIZ()) {
            C054G c054g = this.LIZLLL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c054g, C2107308Nj.LIZ.LLIILII(), null, new C866010XyB(c914150Ztd, null, this, list), 2);
        } else {
            this.LIZIZ.LIZ().LJIJI(listLJIJJ, c914150Ztd);
        }
        IDmHelper iDmHelper = (IDmHelper) PluggableExtentionKt.pluggableSpiForReal(IDmHelper.class);
        if (iDmHelper != null) {
            iDmHelper.LIZIZ(listLJIJJ);
        }
    }

    @Override // X.InterfaceC876950Yaj
    public final void LJIIIIZZ(int i, InterfaceC863600XuI interfaceC863600XuI, String str) {
        long jLJ = C866950Xzh.LJ(str, interfaceC863600XuI);
        if (jLJ <= 0) {
            return;
        }
        if (C293390Bej.LIZ()) {
            C054G c054g = this.LIZLLL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c054g, C2107308Nj.LIZ.LLIILII(), null, new C865910Xy1(interfaceC863600XuI, null, this, jLJ, i), 2);
            return;
        }
        this.LIZIZ.LIZ().LJJJJIZL(i, jLJ, interfaceC863600XuI);
    }

    @Override // X.InterfaceC876950Yaj
    public final C0Y6X LJIIZILJ(long j, int i, C869290Y8h c869290Y8h) {
        return this.LIZIZ.LIZ().LJIIZILJ(j, i, c869290Y8h);
    }

    @Override // X.InterfaceC876950Yaj
    public final boolean LJIJJLI(long j, int i, C869290Y8h c869290Y8h) {
        return this.LIZIZ.LIZ().LJIJJLI(j, i, c869290Y8h);
    }

    @Override // X.InterfaceC876950Yaj
    public final void LJJII(InterfaceC863600XuI interfaceC863600XuI, List list, boolean z) {
        InterfaceC866720XzK interfaceC866720XzKLIZ = this.LIZIZ.LIZ();
        C13BV c13bv = C13BV.INSTANCE;
        interfaceC866720XzKLIZ.LJJIIJ(list, c13bv, c13bv, Boolean.FALSE, null);
        if (C293390Bej.LIZ()) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String conversationId = ((C0Y8T) it2.next()).getConversationId();
                if (conversationId != null) {
                    arrayList.add(conversationId);
                }
            }
            C054G c054g = this.LIZLLL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c054g, C2107308Nj.LIZ.LLIILII(), null, new C865900Xy0(interfaceC863600XuI, null, this, arrayList, z), 2);
            return;
        }
        this.LIZIZ.LIZ().LJJIJIL(list, Boolean.valueOf(z), interfaceC863600XuI);
    }

    @Override // X.InterfaceC876950Yaj
    public final void LJJI(String str, long j, int i, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        if (C293390Bej.LIZ()) {
            C054G c054g = this.LIZLLL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c054g, C2107308Nj.LIZ.LLIILII(), null, new C865890Xxz(interfaceC863600XuI, null, this, str, j, i), 2);
            return;
        }
        this.LIZIZ.LIZ().LJJI(str, j, i, interfaceC863600XuI);
    }

    @Override // X.InterfaceC876950Yaj
    public final void LJJIII(List list, boolean z, Map map, C877110Yaz c877110Yaz) {
        if (C293390Bej.LIZ()) {
            C054G c054g = this.LIZLLL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c054g, C2107308Nj.LIZ.LLIILII(), null, new C865960Xy6(c877110Yaz, null, this, list, z, map), 2);
            return;
        }
        this.LIZIZ.LIZ().LJJJJ(list, Boolean.valueOf(z), map, c877110Yaz);
    }

    @Override // X.InterfaceC876950Yaj
    public final void LJIJ(long j, C0Y6U c0y6u, C0Z9N[] c0z9nArr, Boolean bool, C1226400i1G c1226400i1G) {
        this.LIZIZ.LIZ().LJIJ(j, c0y6u, c0z9nArr, bool, c1226400i1G);
    }

    @Override // X.InterfaceC876950Yaj
    public final void LJJIIZ(List list, List list2, List list3, Boolean bool, C877110Yaz c877110Yaz) {
        if (!list.isEmpty()) {
            ArrayList arrayList = (ArrayList) list2;
            if (!arrayList.isEmpty() || !((ArrayList) list3).isEmpty() || bool != null) {
                if (C293390Bej.LIZ()) {
                    C054G c054g = this.LIZLLL;
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(c054g, C2107308Nj.LIZ.LLIILII(), null, new C866050XyF(c877110Yaz, null, this, list, list2, list3, bool), 2);
                    return;
                }
                List<C0Y8T> listLJIJJ = LJIJJ(list);
                InterfaceC866720XzK interfaceC866720XzKLIZ = this.LIZIZ.LIZ();
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((EnumC879080YeA) it2.next()).getValue());
                }
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                Iterator it3 = ((ArrayList) list3).iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((EnumC879080YeA) it3.next()).getValue());
                }
                interfaceC866720XzKLIZ.LJJIIJ(listLJIJJ, arrayList2, arrayList3, bool, c877110Yaz);
                return;
            }
        }
        C0YMW c0ymw = C0YMW.newBuilder().LIZ;
        c0ymw.statusMsg = "nothing to change";
        c877110Yaz.LIZIZ(c0ymw);
    }

    @Override // X.InterfaceC876950Yaj
    public final void LJJIJL(List list, List list2, List list3, Boolean bool, C914150Ztd c914150Ztd) {
        if (list.isEmpty() || (list2.isEmpty() && list3.isEmpty() && bool == null)) {
            if (c914150Ztd != null) {
                C0YMW c0ymw = C0YMW.newBuilder().LIZ;
                c0ymw.statusMsg = "nothing to change";
                c914150Ztd.LIZIZ(c0ymw);
                return;
            }
            return;
        }
        if (C293390Bej.LIZ()) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String conversationId = ((C0Y8T) it2.next()).getConversationId();
                if (conversationId != null) {
                    arrayList.add(conversationId);
                }
            }
            C054G c054g = this.LIZLLL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c054g, C2107308Nj.LIZ.LLIILII(), null, new C866040XyE(c914150Ztd, null, this, arrayList, list2, list3, bool), 2);
            return;
        }
        InterfaceC866720XzK interfaceC866720XzKLIZ = this.LIZIZ.LIZ();
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((EnumC879080YeA) it3.next()).getValue());
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list3, 10));
        Iterator it4 = list3.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((EnumC879080YeA) it4.next()).getValue());
        }
        interfaceC866720XzKLIZ.LJJIIJ(list, arrayList2, arrayList3, bool, c914150Ztd);
    }

    @Override // X.InterfaceC876950Yaj
    public final void LJIIIZ(int i, List list, String str, Map map, String str2, String str3, String str4, String str5, String str6, Boolean bool, C913700Zsu c913700Zsu) {
        this.LIZIZ.LIZ().LJIIIZ(i, C866950Xzh.LJFF(list), str, map, str2, str3, str4, str5, str6, bool, c913700Zsu);
    }
}
