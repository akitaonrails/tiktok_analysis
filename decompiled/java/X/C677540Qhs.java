package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.arch.EComSearchBffBody;
import com.ss.android.ugc.aweme.ecommerce.arch.EComSearchBffResp;
import com.ss.android.ugc.aweme.ecommerce.arch.SearchBffItem;
import com.ss.android.ugc.aweme.ecommerce.arch.SearchBffSection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.0Qhs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C677540Qhs {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(792));
    public final Map<Integer, InterfaceC677850QiN<AbstractC677870QiP, AbstractC677840QiM>> LIZIZ;

    public C677540Qhs(Map<Integer, ? extends InterfaceC677850QiN<AbstractC677870QiP, AbstractC677840QiM>> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LIZIZ = linkedHashMap;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
    }

    public static C1422405hW LIZJ(C677540Qhs c677540Qhs, String str) {
        List<SearchBffSection> list;
        int i;
        c677540Qhs.getClass();
        try {
            EComSearchBffResp eComSearchBffResp = (EComSearchBffResp) ((Gson) c677540Qhs.LIZ.getValue()).LJII(str, EComSearchBffResp.class);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C677890QiR c677890QiR = new C677890QiR(eComSearchBffResp.logPb, eComSearchBffResp.globalDoodleConfig, eComSearchBffResp.shopCardSkin, eComSearchBffResp.brandSkin, eComSearchBffResp.bigSaleSkin, eComSearchBffResp.skinType);
            EComSearchBffBody eComSearchBffBody = eComSearchBffResp.bffBody;
            if (eComSearchBffBody != null && (list = eComSearchBffBody.sections) != null) {
                for (SearchBffSection searchBffSection : list) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<SearchBffItem> it2 = searchBffSection.items.iterator();
                    while (it2.hasNext()) {
                        AbstractC677840QiM abstractC677840QiMLIZ = c677540Qhs.LIZ(it2.next(), searchBffSection);
                        if (abstractC677840QiMLIZ != null) {
                            abstractC677840QiMLIZ.LLILLL = c677890QiR;
                            arrayList.add(abstractC677840QiMLIZ);
                            arrayList3.add(abstractC677840QiMLIZ);
                        }
                    }
                    arrayList2.add(new C1397705dX(searchBffSection.order, searchBffSection.type, searchBffSection.id, arrayList3, searchBffSection.isSticky, searchBffSection.isDynamicSticky));
                    ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        AbstractC677870QiP abstractC677870QiP = ((AbstractC677840QiM) it3.next()).LL;
                        if (abstractC677870QiP != null) {
                            i = abstractC677870QiP.LIZIZ;
                        } else {
                            i = -1;
                        }
                        arrayList4.add(Integer.valueOf(i));
                    }
                }
            }
            return new C1422405hW(eComSearchBffResp, arrayList, arrayList2, eComSearchBffResp.hasMore, eComSearchBffResp.cursor, eComSearchBffResp.sectionCursor, null, eComSearchBffResp.logPb);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            C13BV c13bv = C13BV.INSTANCE;
            return new C1422405hW(c13bv, c13bv, 248);
        }
    }

    public final AbstractC677840QiM LIZ(SearchBffItem searchBffItem, SearchBffSection searchBffSection) {
        InterfaceC677850QiN interfaceC677850QiN;
        AbstractC677870QiP abstractC677870QiPLIZ;
        if (searchBffItem.techType == EnumC677880QiQ.BFF_TECH_TYPE_LYNX.getValue()) {
            interfaceC677850QiN = (InterfaceC677850QiN) ((LinkedHashMap) this.LIZIZ).get(-1);
        } else {
            interfaceC677850QiN = (InterfaceC677850QiN) ((LinkedHashMap) this.LIZIZ).get(Integer.valueOf(searchBffItem.type));
        }
        if (interfaceC677850QiN != null && (abstractC677870QiPLIZ = interfaceC677850QiN.LIZ(searchBffItem.data)) != null) {
            abstractC677870QiPLIZ.LIZJ = searchBffItem.id;
            abstractC677870QiPLIZ.LIZIZ = searchBffItem.type;
            abstractC677870QiPLIZ.LIZ = searchBffItem.techType;
            abstractC677870QiPLIZ.LIZLLL = searchBffSection.id;
            abstractC677870QiPLIZ.LJ = searchBffSection.type;
            abstractC677870QiPLIZ.LJFF = searchBffItem.data;
            AbstractC677840QiM abstractC677840QiMLIZIZ = interfaceC677850QiN.LIZIZ(abstractC677870QiPLIZ);
            abstractC677840QiMLIZIZ.LL = abstractC677870QiPLIZ;
            abstractC677840QiMLIZIZ.LLILLJJLI = searchBffSection.sectionStyle;
            return abstractC677840QiMLIZIZ;
        }
        return null;
    }

    public final C1422405hW LIZIZ(n nVar, C675270QeD c675270QeD) {
        EComSearchBffResp eComSearchBffResp;
        List<SearchBffSection> list;
        int i;
        try {
            C1422705hZ.LIZ.getClass();
            if (C1422705hZ.LIZIZ.optParse == 1) {
                eComSearchBffResp = (EComSearchBffResp) ((Gson) this.LIZ.getValue()).LIZJ(nVar, EComSearchBffResp.class);
            } else {
                eComSearchBffResp = (EComSearchBffResp) ((Gson) this.LIZ.getValue()).LJII(((Gson) this.LIZ.getValue()).LJIILJJIL(nVar), EComSearchBffResp.class);
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C677890QiR c677890QiR = new C677890QiR(eComSearchBffResp.logPb, eComSearchBffResp.globalDoodleConfig, eComSearchBffResp.shopCardSkin, eComSearchBffResp.brandSkin, eComSearchBffResp.bigSaleSkin, eComSearchBffResp.skinType);
            EComSearchBffBody eComSearchBffBody = eComSearchBffResp.bffBody;
            if (eComSearchBffBody != null && (list = eComSearchBffBody.sections) != null) {
                for (SearchBffSection searchBffSection : list) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<SearchBffItem> it2 = searchBffSection.items.iterator();
                    while (it2.hasNext()) {
                        AbstractC677840QiM abstractC677840QiMLIZ = LIZ(it2.next(), searchBffSection);
                        if (abstractC677840QiMLIZ != null) {
                            abstractC677840QiMLIZ.LLILLL = c677890QiR;
                            arrayList.add(abstractC677840QiMLIZ);
                            arrayList3.add(abstractC677840QiMLIZ);
                        }
                    }
                    arrayList2.add(new C1397705dX(searchBffSection.order, searchBffSection.type, searchBffSection.id, arrayList3, searchBffSection.isSticky, searchBffSection.isDynamicSticky));
                    ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        AbstractC677870QiP abstractC677870QiP = ((AbstractC677840QiM) it3.next()).LL;
                        if (abstractC677870QiP != null) {
                            i = abstractC677870QiP.LIZIZ;
                        } else {
                            i = -1;
                        }
                        arrayList4.add(Integer.valueOf(i));
                    }
                }
            }
            return new C1422405hW(eComSearchBffResp, arrayList, arrayList2, eComSearchBffResp.hasMore, eComSearchBffResp.cursor, eComSearchBffResp.sectionCursor, c675270QeD, eComSearchBffResp.logPb);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            C13BV c13bv = C13BV.INSTANCE;
            return new C1422405hW(c13bv, c13bv, 248);
        }
    }
}
