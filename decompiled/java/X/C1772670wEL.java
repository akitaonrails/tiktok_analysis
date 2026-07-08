package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS215S0000000_26;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wEL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1772670wEL {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(321));
    public boolean LIZIZ;

    public final int LIZ() {
        return ((Number) this.LIZ.getValue()).intValue();
    }

    public static void LIZJ(C1772630wEH c1772630wEH, InterfaceC1773310wFN interfaceC1773310wFN) {
        List<? extends AbstractC1773210wFD> list;
        List<? extends AbstractC1773210wFD> list2;
        List<C1772690wEN> list3;
        C1772690wEN c1772690wEN;
        C1773780wG8 c1773780wG8 = c1772630wEH.LIZJ;
        List<? extends AbstractC1773210wFD> list4 = null;
        if (c1773780wG8 != null) {
            list = c1773780wG8.LIZLLL;
        } else {
            list = null;
        }
        C1772690wEN c1772690wEN2 = c1772630wEH.LIZLLL;
        if (c1772690wEN2 != null) {
            list2 = c1772690wEN2.LIZJ;
        } else {
            list2 = null;
        }
        C1773710wG1 c1773710wG1LIZIZ = c1772630wEH.LIZIZ();
        if (c1773710wG1LIZIZ != null && (list3 = c1773710wG1LIZIZ.LJJIII) != null && (c1772690wEN = (C1772690wEN) ListProtector.get(list3, c1773710wG1LIZIZ.LJJ)) != null) {
            list4 = c1772690wEN.LIZJ;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (list2 != null) {
            arrayList2.addAll(list2);
        }
        if (list4 != null) {
            arrayList2.addAll(list4);
        }
        interfaceC1773310wFN.LIZLLL().LJIIL.LJJII = c1772630wEH.LIZ;
        interfaceC1773310wFN.LJIIIIZZ().zQ2(new C1772730wER(EnumC1772960wEo.FETCH, arrayList, arrayList2, c1772630wEH.LJIIL, c1772630wEH.LJIILIIL), interfaceC1773310wFN.LIZLLL().LJIIL);
    }

    public static void LIZLLL(C1772630wEH c1772630wEH, InterfaceC1773310wFN interfaceC1773310wFN) {
        JSONObject jSONObject = c1772630wEH.LJII;
        if (jSONObject != null) {
            jSONObject.put("ec_mix_mall_enable_native_generate_behavior_params", true);
            C1773100wF2.LIZ.getClass();
            jSONObject.put("ec_mall_auto_refresh", ((Number) C1773100wF2.LIZJ.getValue()).intValue());
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mergeAbParams=");
            sbLIZ.append(jSONObject);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZ("AbParams", strLIZIZ);
            InterfaceC599750Nfh interfaceC599750Nfh = interfaceC1773310wFN.LJIIIIZZ().LLILZ;
            if (interfaceC599750Nfh != null) {
                interfaceC599750Nfh.LJ("ab_params", jSONObject, EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
            }
        }
        Map<String, ? extends Object> map = c1772630wEH.LJIIIIZZ;
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                InterfaceC599750Nfh interfaceC599750Nfh2 = interfaceC1773310wFN.LJIIIIZZ().LLILZ;
                if (interfaceC599750Nfh2 != null) {
                    interfaceC599750Nfh2.LJ(entry.getKey(), entry.getValue(), EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
                }
            }
        }
    }

    public static void LJ(RecyclerView recyclerView, InterfaceC1773310wFN interfaceC1773310wFN) {
        AbstractC1773460wFc abstractC1773460wFc;
        AbstractC1773210wFD abstractC1773210wFD;
        int i;
        C1773130wF5 c1773130wF5;
        RecyclerView recyclerView2;
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(i2);
            RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition2 = null;
            if ((viewHolderFindViewHolderForLayoutPosition instanceof AbstractC1773460wFc) && (abstractC1773460wFc = (AbstractC1773460wFc) viewHolderFindViewHolderForLayoutPosition) != null && (abstractC1773210wFD = abstractC1773460wFc.LLILLL) != null) {
                if (interfaceC1773310wFN.LJIIIZ().uZ0(abstractC1773460wFc.getBindingAdapterPosition(), abstractC1773210wFD) == null) {
                    abstractC1773460wFc.a6();
                } else if (!(abstractC1773460wFc instanceof C1773450wFb)) {
                    AbstractC21673619ry adapter = recyclerView.getAdapter();
                    if (adapter != null) {
                        adapter.onBindViewHolder(abstractC1773460wFc, abstractC1773460wFc.getBindingAdapterPosition(), C13BV.INSTANCE);
                    }
                } else {
                    C1773450wFb c1773450wFb = (C1773450wFb) abstractC1773460wFc;
                    C1773710wG1 c1773710wG1 = (C1773710wG1) c1773450wFb.LLILLL;
                    if (c1773710wG1 != null) {
                        i = c1773710wG1.LJJ;
                    } else {
                        i = 0;
                    }
                    View childAt = c1773450wFb.LLJJIJIIJIL.getChildAt(0);
                    if ((childAt instanceof RecyclerView) && (recyclerView2 = (RecyclerView) childAt) != null) {
                        viewHolderFindViewHolderForLayoutPosition2 = recyclerView2.findViewHolderForLayoutPosition(i);
                    }
                    if ((viewHolderFindViewHolderForLayoutPosition2 instanceof C1773130wF5) && (c1773130wF5 = (C1773130wF5) viewHolderFindViewHolderForLayoutPosition2) != null) {
                        LJ(c1773130wF5.LL, interfaceC1773310wFN);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static void LIZIZ(int i, InterfaceC1773310wFN interfaceC1773310wFN, AbstractC1773210wFD abstractC1773210wFD) {
        Pair[] pairArr = new Pair[3];
        String strLJIIJJI = abstractC1773210wFD.LJIIJJI();
        if (strLJIIJJI == null) {
            strLJIIJJI = "";
        }
        pairArr[0] = new Pair("card_type", strLJIIJJI);
        pairArr[1] = new Pair("position", Integer.valueOf(i));
        pairArr[2] = new Pair("has_popup", Integer.valueOf(interfaceC1773310wFN.LIZLLL().LJIIL.LJJJLIIL ? 1 : 0));
        C1768180w76.LIZ("rd_mix_mall_kit_cache_first_fetch_merge_render", null, C2097608Jq.LJIIIIZZ(pairArr), false);
    }
}
