package X;

import Y.ARunnableS83S0200000_14;
import com.bytedance.ies.im.core.api.model.RichTextInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.IDmHelper;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Xz1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C866530Xz1 extends AbstractC879060Ye8 {
    public final String LIZIZ;
    public final C0YHX LIZJ;
    public final InterfaceC876950Yaj LIZLLL;
    public final C054G LJ = C2296808zG.LIZ(C0PEM.LIZ.plus(C2296908zH.LIZ()));
    public final C01GW LJFF = C452501pT.LIZIZ(new C866580Xz6(this));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1459));
    public final CopyOnWriteArraySet<InterfaceC866850XzX> LJII = new CopyOnWriteArraySet<>();

    @Override // X.AbstractC879060Ye8
    public final C0Y8T LJ() {
        return this.LIZLLL.LIZ(this.LIZIZ);
    }

    public final InterfaceC866540Xz2 LJIJI() {
        return (InterfaceC866540Xz2) this.LJFF.getValue();
    }

    @Override // X.AbstractC879060Ye8
    public final C0I3B LJII() {
        C0Y8T c0y8tLIZLLL = LJIJI().LIZLLL();
        return c0y8tLIZLLL == null ? new C0I3B(null, null, null, null) : LJIJJ(c0y8tLIZLLL);
    }

    @Override // X.AbstractC879060Ye8
    public final void LJIILL() {
        if (!C0BIJ.LIZ()) {
            this.LJII.clear();
            LJIJI().LJI();
            return;
        }
        C866740XzM c866740XzM = (C866740XzM) this.LJI.getValue();
        String str = this.LIZIZ;
        Set<Pair<String, InterfaceC866850XzX>> setKeySet = c866740XzM.LIZJ.keySet();
        ArrayList<Pair> arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (Intrinsics.LJFF(((Pair) obj).getFirst(), str)) {
                arrayList.add(obj);
            }
        }
        for (Pair pair : arrayList) {
            c866740XzM.LIZJ((String) pair.getFirst(), (InterfaceC866850XzX) pair.getSecond());
        }
    }

    @Override // X.AbstractC879060Ye8
    public final String LJFF() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC879060Ye8
    public final void LJI(InterfaceC867020Xzo<String> interfaceC867020Xzo) {
        if (C293390Bej.LIZ()) {
            C054G c054g = this.LJ;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c054g, C2107308Nj.LIZ.LLIILII(), null, new C866250XyZ(interfaceC867020Xzo, null, this), 2);
            return;
        }
        LJIJI().LLIZLLLIL(interfaceC867020Xzo);
    }

    @Override // X.AbstractC879060Ye8
    public final void LJIIIZ(InterfaceC863600XuI<List<C0YAE>> interfaceC863600XuI) {
        if (C293390Bej.LIZ()) {
            C054G c054g = this.LJ;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c054g, C2107308Nj.LIZ.LLIILII(), null, new C866200XyU(interfaceC863600XuI, null, this), 2);
            return;
        }
        LJIJI().LJLJL(this.LIZIZ, interfaceC863600XuI);
    }

    @Override // X.AbstractC879060Ye8
    public final void LJIIJ(C1769306wN c1769306wN) {
        if (C293390Bej.LIZ()) {
            C054G c054g = this.LJ;
            C914120Zta c914120Zta = new C914120Zta(this, c1769306wN, 4);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c054g, C2107308Nj.LIZ.LLIILII(), null, new C866180XyS(c914120Zta, null, this), 2);
            return;
        }
        if (C0BIJ.LIZ()) {
            LJIJI().LJLIIIL(new C914120Zta(this, c1769306wN, 4));
        } else {
            LJIJI().LJLIIIL(c1769306wN);
        }
    }

    @Override // X.AbstractC879060Ye8
    public final void LJIIJJI(final InterfaceC866850XzX interfaceC866850XzX) {
        if (C0BIJ.LIZ()) {
            final C866740XzM c866740XzM = (C866740XzM) this.LJI.getValue();
            final String str = this.LIZIZ;
            c866740XzM.LIZJ(str, interfaceC866850XzX);
            InterfaceC866310Xyf interfaceC866310XyfLIZIZ = c866740XzM.LIZ.LIZIZ();
            c866740XzM.LIZJ.put(new Pair<>(str, interfaceC866850XzX), new C866570Xz5(interfaceC866310XyfLIZIZ.LJIILIIL().LIZLLL(str).LIZJ(new InterfaceC1741206rq() { // from class: X.0YSU
                @Override // X.InterfaceC1741206rq
                public final void onEvent(InterfaceC874460YSe interfaceC874460YSe) {
                    C0YMW iMError;
                    C866740XzM c866740XzM2 = c866740XzM;
                    InterfaceC866850XzX interfaceC866850XzX2 = interfaceC866850XzX;
                    c866740XzM2.getClass();
                    if (interfaceC874460YSe instanceof C874420YSa) {
                        interfaceC866850XzX2.LJLILLLLZI(((C874420YSa) interfaceC874460YSe).LIZ);
                        return;
                    }
                    if (interfaceC874460YSe instanceof C0YSY) {
                        C0YSY c0ysy = (C0YSY) interfaceC874460YSe;
                        interfaceC866850XzX2.LJLJI(c0ysy.LIZIZ.ordinal(), c0ysy.LIZ);
                        return;
                    }
                    if (interfaceC874460YSe instanceof C874430YSb) {
                        interfaceC866850XzX2.LJJLIIIJ(((C874430YSb) interfaceC874460YSe).LIZ);
                        return;
                    }
                    if (interfaceC874460YSe instanceof C874450YSd) {
                        interfaceC866850XzX2.LJZI(((C874450YSd) interfaceC874460YSe).LIZ);
                        return;
                    }
                    if (interfaceC874460YSe instanceof C874440YSc) {
                        interfaceC866850XzX2.LJJJJJL(((C874440YSc) interfaceC874460YSe).LIZ);
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
                        interfaceC866850XzX2.LJLL(new C1711306n1(l, c0y8t, iMError, null));
                        return;
                    }
                    if (interfaceC874460YSe instanceof C0YSZ) {
                        C0YSZ c0ysz = (C0YSZ) interfaceC874460YSe;
                        interfaceC866850XzX2.LLIIII(c0ysz.LIZIZ, c0ysz.LIZ);
                        return;
                    }
                    throw new C1954807lC();
                }
            }), interfaceC866310XyfLIZIZ.LJI().getEvents().LIZJ(new InterfaceC1741206rq() { // from class: X.0XzO
                @Override // X.InterfaceC1741206rq
                public final void onEvent(InterfaceC866870XzZ interfaceC866870XzZ) {
                    String str2;
                    if (interfaceC866870XzZ instanceof C866780XzQ) {
                        str2 = ((C866780XzQ) interfaceC866870XzZ).LIZ;
                    } else if (interfaceC866870XzZ instanceof C866810XzT) {
                        str2 = ((C866810XzT) interfaceC866870XzZ).LIZ;
                    } else if (interfaceC866870XzZ instanceof C866790XzR) {
                        str2 = ((C866790XzR) interfaceC866870XzZ).LIZ;
                    } else if (interfaceC866870XzZ instanceof C866800XzS) {
                        str2 = ((C866800XzS) interfaceC866870XzZ).LIZ;
                    } else if (interfaceC866870XzZ instanceof C866770XzP) {
                        str2 = ((C866770XzP) interfaceC866870XzZ).LIZ;
                    } else {
                        throw new C1954807lC();
                    }
                    if (Intrinsics.LJFF(str2, str)) {
                        C866740XzM c866740XzM2 = c866740XzM;
                        InterfaceC866850XzX interfaceC866850XzX2 = interfaceC866850XzX;
                        c866740XzM2.getClass();
                        C866740XzM.LIZ(interfaceC866850XzX2, interfaceC866870XzZ);
                    }
                }
            })));
            return;
        }
        this.LJII.add(interfaceC866850XzX);
        LJIJI().LLLIIIL(interfaceC866850XzX);
    }

    @Override // X.AbstractC879060Ye8
    public final void LJIILLIIL(InterfaceC866850XzX interfaceC866850XzX) {
        if (C0BIJ.LIZ()) {
            ((C866740XzM) this.LJI.getValue()).LIZJ(this.LIZIZ, interfaceC866850XzX);
        } else {
            this.LJII.remove(interfaceC866850XzX);
            LJIJI().LLILZIL(interfaceC866850XzX);
        }
    }

    public final C0I3B LJIJJ(C0Y8T c0y8t) {
        Long lLJIILIIL;
        Object c098200Yq;
        String str;
        String str2;
        Object obj = null;
        if (!Intrinsics.LJFF(c0y8t.getConversationId(), this.LIZIZ)) {
            return new C0I3B(null, null, null, null);
        }
        String draftContent = c0y8t.getDraftContent();
        Long lValueOf = Long.valueOf(c0y8t.getDraftTime());
        Map<String, String> localExt = c0y8t.getLocalExt();
        if (localExt != null && (str2 = localExt.get("local_ext_key_draft_quoted_msg_id")) != null) {
            lLJIILIIL = C2095008Iq.LJIILIIL(str2);
        } else {
            lLJIILIIL = null;
        }
        try {
            Type type = new TypeToken<List<? extends RichTextInfo>>() { // from class: X.0Y2M
            }.getType();
            Gson gson = C051M.LIZ;
            if (localExt != null) {
                str = localExt.get("rich_text_draft");
            } else {
                str = null;
            }
            c098200Yq = (List) gson.LJIIIIZZ(str, type);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return new C0I3B(draftContent, lLJIILIIL, (List) obj, lValueOf);
    }

    public final void LJIJJLI(Long l) {
        if (C293390Bej.LIZ()) {
            if (l == null) {
                this.LIZJ.LIZIZ().LJIILL().LJJJIL(this.LIZIZ);
            } else {
                this.LIZJ.LIZIZ().LJIILL().LJJJJ(l.longValue(), this.LIZIZ);
                return;
            }
        } else if (l == null) {
            this.LIZJ.LIZ().LIZJ(this.LIZIZ);
        } else {
            this.LIZJ.LIZ().LJJJLIIL(l.longValue(), this.LIZIZ);
            return;
        }
        IDmHelper iDmHelper = (IDmHelper) PluggableExtentionKt.pluggableSpiForReal(IDmHelper.class);
        if (iDmHelper != null) {
            iDmHelper.LJ(this.LIZIZ);
        }
    }

    @Override // X.AbstractC879060Ye8
    public final void LIZLLL(boolean z, C894190Z6b c894190Z6b) {
        if (C293390Bej.LIZ()) {
            C054G c054g = this.LJ;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c054g, C2107308Nj.LIZ.LLIILII(), null, new C866240XyY(c894190Z6b, null, this, z), 2);
            return;
        }
        LJIJI().LJLJJI(z, c894190Z6b);
    }

    @Override // X.AbstractC879060Ye8
    public final void LJIIIIZZ(boolean z, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        if (C293390Bej.LIZ()) {
            C054G c054g = this.LJ;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c054g, C2107308Nj.LIZ.LLIILII(), null, new C866120XyM(interfaceC863600XuI, null, this, z), 2);
            return;
        }
        LJIJI().LJL(z, interfaceC863600XuI);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x010a  */
    @Override // X.AbstractC879060Ye8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(X.C0I3B r11, X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C866530Xz1.LJIILIIL(X.0I3B, X.05Vn):java.lang.Object");
    }

    @Override // X.AbstractC879060Ye8
    public final void LJIILJJIL(boolean z, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        if (C293390Bej.LIZ()) {
            C054G c054g = this.LJ;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c054g, C2107308Nj.LIZ.LLIILII(), null, new C866130XyN(interfaceC863600XuI, null, this, z), 2);
            return;
        }
        LJIJI().LJLLL(z, interfaceC863600XuI);
    }

    @Override // X.AbstractC879060Ye8
    public final void LJIJ(String str, C914150Ztd c914150Ztd) {
        if (C293390Bej.LIZ()) {
            C054G c054g = this.LJ;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c054g, C2107308Nj.LIZ.LLIILII(), null, new C866150XyP(c914150Ztd, null, this, str), 2);
            return;
        }
        LJIJI().LJLJJL(str, c914150Ztd);
    }

    public final void LJIL(Map<String, String> map, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        if (C293390Bej.LIZ()) {
            C054G c054g = this.LJ;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c054g, C2107308Nj.LIZ.LLIILII(), null, new C866260Xya(interfaceC863600XuI, null, this, map), 2);
            return;
        }
        LJIJI().LLILL(map, interfaceC863600XuI);
    }

    public final void LJJ(Map map, C1768906wJ c1768906wJ) {
        if (C293390Bej.LIZ()) {
            C054G c054g = this.LJ;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c054g, C2107308Nj.LIZ.LLIILII(), null, new C866280Xyc(c1768906wJ, null, this, map), 2);
            return;
        }
        LJIJI().LJJLIIJ(map, new ARunnableS83S0200000_14(c1768906wJ, this, 18));
    }

    public C866530Xz1(String str, C0YHX c0yhx, InterfaceC876950Yaj interfaceC876950Yaj) {
        this.LIZIZ = str;
        this.LIZJ = c0yhx;
        this.LIZLLL = interfaceC876950Yaj;
    }

    @Override // X.AbstractC879060Ye8
    public final void LJIIL(List<String> list, Map<String, String> map, InterfaceC867020Xzo<List<C0YAE>> interfaceC867020Xzo) {
        List<Long> listLJFF = C866950Xzh.LJFF(list);
        if (C293390Bej.LIZ()) {
            C054G c054g = this.LJ;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c054g, C2107308Nj.LIZ.LLIILII(), null, new C866230XyX(interfaceC867020Xzo, null, this, listLJFF, map), 2);
            return;
        }
        LJIJI().LJJL(listLJFF, map, interfaceC867020Xzo);
    }

    @Override // X.AbstractC879060Ye8
    public final void LIZ(List list, int i, Map map, C1225100hzA c1225100hzA) {
        List<Long> listLJFF = C866950Xzh.LJFF(list);
        if (C293390Bej.LIZ()) {
            C054G c054g = this.LJ;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c054g, C2107308Nj.LIZ.LLIILII(), null, new C866170XyR(c1225100hzA, null, this, listLJFF, i, map), 2);
            return;
        }
        LJIJI().LLIILII(listLJFF, i, map, c1225100hzA);
    }

    @Override // X.AbstractC879060Ye8
    public final void LIZIZ(List<? extends EnumC879080YeA> list, List<? extends EnumC879080YeA> list2, Boolean bool, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        if (list.isEmpty() && list2.isEmpty() && bool == null) {
            if (interfaceC863600XuI != null) {
                C0YMW c0ymw = C0YMW.newBuilder().LIZ;
                c0ymw.statusMsg = "nothing to change";
                interfaceC863600XuI.LIZIZ(c0ymw);
                return;
            }
            return;
        }
        if (C293390Bej.LIZ()) {
            C054G c054g = this.LJ;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c054g, C2107308Nj.LIZ.LLIILII(), null, new C866110XyL(interfaceC863600XuI, null, this, list, list2, bool), 2);
            return;
        }
        InterfaceC866540Xz2 interfaceC866540Xz2LJIJI = LJIJI();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<? extends EnumC879080YeA> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getValue());
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<? extends EnumC879080YeA> it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(it3.next().getValue());
        }
        interfaceC866540Xz2LJIJI.LLILLJJLI(arrayList, arrayList2, bool, interfaceC863600XuI);
    }

    @Override // X.AbstractC879060Ye8
    public final void LJIIZILJ(String str, int i, Map<String, String> map, InterfaceC867020Xzo<C0YAE> interfaceC867020Xzo) {
        long jLIZLLL = C866950Xzh.LIZLLL(str);
        if (jLIZLLL <= 0) {
            C0YMX c0ymxNewBuilder = C0YMW.newBuilder();
            c0ymxNewBuilder.LIZ.status = -100000;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("uid invalid: ");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C0YMW c0ymw = c0ymxNewBuilder.LIZ;
            c0ymw.statusMsg = strLIZIZ;
            interfaceC867020Xzo.LIZIZ(new C0Y00(c0ymw, null));
            return;
        }
        if (C293390Bej.LIZ()) {
            C054G c054g = this.LJ;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c054g, C2107308Nj.LIZ.LLIILII(), null, new C866210XyV(interfaceC867020Xzo, null, this, jLIZLLL, i, map), 2);
            return;
        }
        LJIJI().LLIZ(jLIZLLL, i, map, interfaceC867020Xzo);
    }
}
