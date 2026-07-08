package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallDynamicBackgroundDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallItemInfoDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallItemInfoLynxDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallStyleDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wEH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1772630wEH {
    public String LIZ;
    public ECMixMallStyleDTO LIZIZ;
    public C1773780wG8 LIZJ;
    public C1772690wEN LIZLLL;
    public C1773330wFP LJ;
    public C1773330wFP LJFF;
    public Map<String, ECMixMallItemInfoDTO> LJI;
    public JSONObject LJII;
    public Map<String, ? extends Object> LJIIIIZZ;
    public Map<String, ? extends Object> LJIIIZ;
    public List<String> LJIIJ;
    public ECMixMallDynamicBackgroundDTO LJIIJJI;
    public String LJIIL;
    public Long LJIILIIL;

    public final String LIZ() {
        List<? extends AbstractC1773210wFD> list;
        ECMixMallItemInfoLynxDTO eCMixMallItemInfoLynxDTO;
        String str;
        List<? extends AbstractC1773210wFD> list2;
        List<? extends AbstractC1773210wFD> list3;
        try {
            StringBuilder sb = new StringBuilder("dump mix-pagevo");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(", Header count is ");
            C1773780wG8 c1773780wG8 = this.LIZJ;
            Integer numValueOf = null;
            sbLIZ.append((c1773780wG8 == null || (list3 = c1773780wG8.LIZLLL) == null) ? null : Integer.valueOf(list3.size()));
            sbLIZ.append(' ');
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(",  BODY  count is ");
            C1772690wEN c1772690wEN = this.LIZLLL;
            sbLIZ2.append((c1772690wEN == null || (list2 = c1772690wEN.LIZJ) == null) ? null : Integer.valueOf(list2.size()));
            sbLIZ2.append("    ");
            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(", itemsInfo count is ");
            Map<String, ECMixMallItemInfoDTO> map = this.LJI;
            if (map != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, ECMixMallItemInfoDTO> entry : map.entrySet()) {
                    ECMixMallItemInfoDTO value = entry.getValue();
                    boolean z = false;
                    if (value != null && (eCMixMallItemInfoLynxDTO = value.lynx) != null && (str = eCMixMallItemInfoLynxDTO.schema) != null) {
                        if (str.length() > 0) {
                            z = true;
                        }
                    }
                    if (z) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                numValueOf = Integer.valueOf(linkedHashMap.size());
            }
            sb2.append(numValueOf);
            sb2.append(" \n");
            sb.append(sb2.toString());
            C1772690wEN c1772690wEN2 = this.LIZLLL;
            if (c1772690wEN2 != null && (list = c1772690wEN2.LIZJ) != null) {
                for (AbstractC1773210wFD abstractC1773210wFD : list) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("    body item sectionid:");
                    sbLIZ3.append(abstractC1773210wFD.LJIIJ());
                    sbLIZ3.append(", ");
                    sb.append(C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
            sb.append("\n");
            C1773710wG1 c1773710wG1LIZIZ = LIZIZ();
            if (c1773710wG1LIZIZ != null) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("TAB: size:");
                sbLIZ4.append(c1773710wG1LIZIZ.LJJIII.size());
                sbLIZ4.append("   defaultIndex:");
                sbLIZ4.append(c1773710wG1LIZIZ.LJJ);
                sbLIZ4.append(" \n");
                sb.append(C2188811AlT.LIZIZ(sbLIZ4));
                C1772690wEN c1772690wEN3 = c1773710wG1LIZIZ.LJJIII.get(c1773710wG1LIZIZ.LJJ);
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("    current list: hasMore:");
                sbLIZ5.append(c1772690wEN3.LJ);
                sbLIZ5.append(" cursor:");
                sbLIZ5.append(c1772690wEN3.LJFF);
                sbLIZ5.append(" size:");
                sbLIZ5.append(c1772690wEN3.LIZJ.size());
                sbLIZ5.append("     ");
                sb.append(C2188811AlT.LIZIZ(sbLIZ5));
                for (AbstractC1773210wFD abstractC1773210wFD2 : c1772690wEN3.LIZJ) {
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append(", ");
                    sbLIZ6.append(abstractC1773210wFD2.LJIIIZ());
                    sbLIZ6.append("-datasize:");
                    sbLIZ6.append(abstractC1773210wFD2.LJI.size());
                    sb.append(C2188811AlT.LIZIZ(sbLIZ6));
                }
                sb.append("\n");
            }
            return sb.toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return "dumpStr mix-pagevo failed";
        }
    }

    public final C1773710wG1 LIZIZ() {
        List<? extends AbstractC1773210wFD> list;
        C1772690wEN c1772690wEN = this.LIZLLL;
        AbstractC1773210wFD abstractC1773210wFD = (c1772690wEN == null || (list = c1772690wEN.LIZJ) == null) ? null : (AbstractC1773210wFD) C13LP.LJJLIIIJL(list);
        if (abstractC1773210wFD instanceof C1773710wG1) {
            return (C1773710wG1) abstractC1773210wFD;
        }
        return null;
    }

    public final C1774040wGY LIZJ() {
        AbstractC1773210wFD abstractC1773210wFD;
        AbstractC1773210wFD abstractC1773210wFD2;
        List<? extends AbstractC1773210wFD> list;
        AbstractC1773210wFD next;
        C1774040wGY c1774040wGY;
        List<? extends AbstractC1773210wFD> list2;
        AbstractC1773210wFD next2;
        C1772690wEN c1772690wEN = this.LIZLLL;
        if (c1772690wEN == null || (list2 = c1772690wEN.LIZJ) == null) {
            abstractC1773210wFD = null;
        } else {
            Iterator<? extends AbstractC1773210wFD> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (next2 instanceof C1774040wGY) {
                    break;
                }
            }
            abstractC1773210wFD = next2;
        }
        if ((abstractC1773210wFD instanceof C1774040wGY) && (c1774040wGY = (C1774040wGY) abstractC1773210wFD) != null) {
            return c1774040wGY;
        }
        C1773780wG8 c1773780wG8 = this.LIZJ;
        if (c1773780wG8 == null || (list = c1773780wG8.LIZLLL) == null) {
            abstractC1773210wFD2 = null;
        } else {
            Iterator<? extends AbstractC1773210wFD> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                if (next instanceof C1774040wGY) {
                    break;
                }
            }
            abstractC1773210wFD2 = next;
        }
        if (abstractC1773210wFD2 instanceof C1774040wGY) {
            return (C1774040wGY) abstractC1773210wFD2;
        }
        return null;
    }

    public final void LIZLLL(C1772630wEH c1772630wEH) {
        List<C1772690wEN> list;
        C1772690wEN c1772690wEN;
        C1772690wEN c1772690wEN2;
        List<? extends AbstractC1773210wFD> list2;
        List<C1772690wEN> list3;
        C1773710wG1 c1773710wG1LIZIZ = LIZIZ();
        if (c1773710wG1LIZIZ != null && (list = c1773710wG1LIZIZ.LJJIII) != null && (c1772690wEN = (C1772690wEN) C13LP.LJJJLZIJ(c1773710wG1LIZIZ.LJJ, list)) != null) {
            String str = null;
            if (!c1772690wEN.LIZJ.isEmpty()) {
                C1773710wG1 c1773710wG1LIZIZ2 = c1772630wEH.LIZIZ();
                if (c1773710wG1LIZIZ2 == null || (list3 = c1773710wG1LIZIZ2.LJJIII) == null || (c1772690wEN2 = (C1772690wEN) C13LP.LJJJLZIJ(c1773710wG1LIZIZ2.LJJ, list3)) == null || !(!c1772690wEN2.LIZJ.isEmpty())) {
                    c1772690wEN2 = null;
                }
                if (c1772690wEN.LJIIIIZZ.length() != 0) {
                    if (c1772690wEN2 != null) {
                        str = c1772690wEN2.LJIIIIZZ;
                    }
                    if (!Intrinsics.LJFF(str, c1772690wEN.LJIIIIZZ)) {
                        return;
                    }
                }
                ArrayList arrayList = new ArrayList(c1772690wEN.LIZJ);
                if (c1772690wEN2 != null && (list2 = c1772690wEN2.LIZJ) != null) {
                    for (AbstractC1773210wFD abstractC1773210wFD : list2) {
                        Iterator it2 = arrayList.iterator();
                        int i = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            if (Intrinsics.LJFF(((AbstractC1773210wFD) it2.next()).LJIIIZ(), abstractC1773210wFD.LJIIIZ())) {
                                if (i != -1) {
                                    ListProtector.set(arrayList, i, abstractC1773210wFD);
                                }
                            } else {
                                i++;
                            }
                        }
                    }
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((AbstractC1773210wFD) it3.next()).LJII.LIZIZ.LIZ = c1772690wEN2;
                }
                if (c1772690wEN2 != null && Intrinsics.LJFF(c1772690wEN2.LJ, Boolean.TRUE)) {
                    C1772720wEQ c1772720wEQ = new C1772720wEQ(0);
                    c1772720wEQ.LJIJ(c1772690wEN2);
                    arrayList.add(c1772720wEQ);
                }
                c1772690wEN.LIZJ = C13LP.LLIIII(arrayList);
            }
        }
    }
}
