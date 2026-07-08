package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.strategy.decisiontree.DecisionNode;
import com.ss.android.ugc.aweme.im.strategy.decisiontree.DecisionTree;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Zm3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.strategy.StrategyPreheatManager$preheatOperationType$2", f = "StrategyPreheatManager.kt", l = {}, m = "invokeSuspend")
public final class C909450Zm3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Map<String, DecisionTree> LL;
    public final /* synthetic */ C909040ZlO LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C909450Zm3(Map<String, DecisionTree> map, C909040ZlO c909040ZlO, InterfaceC1364105Vn<? super C909450Zm3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = map;
        this.LLILLJJLI = c909040ZlO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C909450Zm3(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List listLLIIII;
        C1C7U.LIZ("StrategyPreheatManager@6353.preheatOperationType$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LinkedHashSet<DecisionNode> linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry : C2097608Jq.LJIIZILJ(this.LL).entrySet()) {
            Object key = entry.getKey();
            DecisionNode decisionNode = ((DecisionTree) entry.getValue()).root;
            if (decisionNode != null && !((ConcurrentHashMap) this.LLILLJJLI.LIZ.getValue()).contains(key)) {
                ((ConcurrentHashMap) this.LLILLJJLI.LIZ.getValue()).put(key, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(decisionNode);
                while (!arrayList.isEmpty()) {
                    DecisionNode decisionNode2 = (DecisionNode) ListProtector.remove(arrayList, arrayList.size() - 1);
                    if (C2215511BnR.LIZ(decisionNode2.nodeType).LIZ()) {
                        linkedHashSet.add(decisionNode2.copy(decisionNode2.nodeAttribute, decisionNode2.nodeType, decisionNode2.nodeOperation, decisionNode2.nodeValue, null, null));
                    }
                    List<DecisionNode> list = decisionNode2.nodeList;
                    if (list != null && (listLLIIII = C13LP.LLIIII(list)) != null) {
                        Iterator it2 = listLLIIII.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(it2.next());
                        }
                    }
                }
            }
        }
        for (DecisionNode decisionNode3 : linkedHashSet) {
            InterfaceC909670ZmP interfaceC909670ZmPLIZ = C2215511BnR.LIZ(decisionNode3.nodeType);
            String str = decisionNode3.nodeValue;
            if (str != null) {
                interfaceC909670ZmPLIZ.LIZIZ(str);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StrategyPreheatManager@6353.preheatOperationType$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
