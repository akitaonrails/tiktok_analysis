package X;

import Y.ARunnableS78S0200000_9;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.search.pages.result.common.anchor.ui.IAdjustAbility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0OhH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C626210OhH implements InterfaceC21676519sR {
    public final C01GW LL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(475));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(474));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(476));
    public final C626220OhI LLILZ = new AbstractC471570IeR() { // from class: X.0OhI
        @Override // X.AbstractC471570IeR
        public final void LIZ() {
            this.LIZ.LIZIZ();
        }

        @Override // X.AbstractC471570IeR
        public final void LIZLLL(int i, int i2) {
            this.LIZ.LIZIZ();
        }

        @Override // X.AbstractC471570IeR
        public final void LJ(int i, int i2) {
            this.LIZ.LIZIZ();
        }

        @Override // X.AbstractC471570IeR
        public final void LJFF(int i, int i2) {
            this.LIZ.LIZIZ();
        }

        @Override // X.AbstractC471570IeR
        public final void LIZJ(int i, int i2, Object obj) {
            this.LIZ.LIZIZ();
        }
    };
    public boolean LLILZIL;
    public final /* synthetic */ C648150PbZ LLILZLL;

    public final void LIZ() {
        Set setEntrySet = ((HashMap) this.LLILLL.getValue()).entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : setEntrySet) {
            Integer numValueOf = Integer.valueOf(((View) ((Map.Entry) obj).getKey()).getTop());
            Object arrayList = linkedHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            List list = (List) ((Map.Entry) it2.next()).getValue();
            if (list.size() == 2) {
                Map.Entry entry = (Map.Entry) ListProtector.get(list, 0);
                View view = (View) entry.getKey();
                Pair pair = (Pair) entry.getValue();
                Map.Entry entry2 = (Map.Entry) ListProtector.get(list, 1);
                View view2 = (View) entry2.getKey();
                Pair pair2 = (Pair) entry2.getValue();
                Pair pair3 = (!((Boolean) pair.getFirst()).booleanValue() || ((Boolean) pair2.getFirst()).booleanValue()) ? (((Boolean) pair.getFirst()).booleanValue() || !((Boolean) pair2.getFirst()).booleanValue()) ? new Pair(2, 2) : new Pair(3, 2) : new Pair(2, 3);
                int iIntValue = ((Number) pair3.getFirst()).intValue();
                int iIntValue2 = ((Number) pair3.getSecond()).intValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("applyAll row: first=");
                sbLIZ.append(pair);
                sbLIZ.append("->");
                sbLIZ.append(iIntValue);
                sbLIZ.append(", second=");
                sbLIZ.append(pair2);
                sbLIZ.append("->");
                sbLIZ.append(iIntValue2);
                C2188811AlT.LIZIZ(sbLIZ);
                IAdjustAbility iAdjustAbility = (IAdjustAbility) ((HashMap) this.LLILLJJLI.getValue()).get(view);
                boolean zTm1 = iAdjustAbility != null ? iAdjustAbility.Tm1(iIntValue) : false;
                IAdjustAbility iAdjustAbility2 = (IAdjustAbility) ((HashMap) this.LLILLJJLI.getValue()).get(view2);
                boolean zTm12 = iAdjustAbility2 != null ? iAdjustAbility2.Tm1(iIntValue2) : false;
                if (zTm1 || zTm12) {
                    view.requestLayout();
                    view2.requestLayout();
                }
            }
        }
    }

    public final void LIZIZ() {
        C648150PbZ c648150PbZ = this.LLILZLL;
        HandlerHook.viewPost(c648150PbZ.LLILLJJLI, new ARunnableS78S0200000_9(c648150PbZ, this, 67));
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0OhI] */
    public C626210OhH(C648150PbZ c648150PbZ) {
        this.LLILZLL = c648150PbZ;
    }

    @Override // X.InterfaceC21676519sR
    public final void g5(View view) {
        InterfaceC626240OhK interfaceC626240OhK;
        IAdjustAbility iAdjustAbilityV1;
        AbstractC21673619ry adapter;
        if (!this.LLILZIL && (adapter = this.LLILZLL.LLILLJJLI.getAdapter()) != null) {
            adapter.registerAdapterDataObserver(this.LLILZ);
            this.LLILZIL = true;
        }
        Object childViewHolder = this.LLILZLL.LLILLJJLI.getChildViewHolder(view);
        if ((childViewHolder instanceof InterfaceC626240OhK) && (interfaceC626240OhK = (InterfaceC626240OhK) childViewHolder) != null && (iAdjustAbilityV1 = interfaceC626240OhK.v1()) != null) {
            ((HashMap) this.LLILLJJLI.getValue()).put(view, iAdjustAbilityV1);
            ((HashMap) this.LL.getValue()).put(view, C948503nH.LJ(this.LLILZLL.LL, C23271099x.INSTANCE, new C596100NZo(iAdjustAbilityV1, this, view, null)));
        }
    }

    @Override // X.InterfaceC21676519sR
    public final void m3(View view) {
        C09AE c09ae = (C09AE) ((HashMap) this.LL.getValue()).remove(view);
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        ((HashMap) this.LLILLJJLI.getValue()).remove(view);
        ((HashMap) this.LLILLL.getValue()).remove(view);
    }
}
