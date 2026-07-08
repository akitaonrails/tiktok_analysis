package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Dch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.ies.powerlist.optimize.preload.ViewCacheAbility$customPreCreateVH$1", f = "ViewCacheExtension.kt", l = {}, m = "invokeSuspend")
public final class C343090Dch extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C344380Dem LLILLJJLI;
    public final /* synthetic */ HashMap<Integer, Class<? extends PowerCell<?>>> LLILLL;
    public final /* synthetic */ PowerAdapter LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C343090Dch(C344380Dem c344380Dem, HashMap<Integer, Class<? extends PowerCell<?>>> map, PowerAdapter powerAdapter, InterfaceC1364105Vn<? super C343090Dch> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c344380Dem;
        this.LLILLL = map;
        this.LLILZ = powerAdapter;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C343090Dch c343090Dch = new C343090Dch(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c343090Dch.LL = obj;
        return c343090Dch;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int size;
        C1C7U.LIZ("ViewCacheAbility@bdf3.customPreCreateVH$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C344380Dem c344380Dem = this.LLILLJJLI;
        HashMap<Integer, Class<? extends PowerCell<?>>> map = this.LLILLL;
        PowerAdapter powerAdapter = this.LLILZ;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map map2 = c344380Dem.LL.customPreloadVH;
            if (map2 == null) {
                map2 = new HashMap();
            }
            for (Map.Entry entry : map2.entrySet()) {
                Class cls = (Class) entry.getKey();
                int iIntValue = ((Number) entry.getValue()).intValue();
                Set<Map.Entry<Integer, Class<? extends PowerCell<?>>>> setEntrySet = map.entrySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : setEntrySet) {
                    if (Intrinsics.LJFF(((Map.Entry) obj2).getValue(), cls)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(C2286608xc.LJ(((Number) ((Map.Entry) it2.next()).getKey()).intValue()));
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    int iIntValue2 = ((Number) it3.next()).intValue();
                    if (iIntValue2 != -1) {
                        linkedHashMap.put(C2286608xc.LJ(iIntValue2), C2286608xc.LJ(iIntValue));
                    }
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                int iIntValue3 = ((Number) entry2.getKey()).intValue();
                int iIntValue4 = ((Number) entry2.getValue()).intValue();
                for (int i = 0; i < iIntValue4; i++) {
                    CopyOnWriteArrayList<RecyclerView.ViewHolder> copyOnWriteArrayList = c344380Dem.LLILLL.get(C2286608xc.LJ(iIntValue3));
                    if (copyOnWriteArrayList != null) {
                        size = copyOnWriteArrayList.size();
                    } else {
                        size = 0;
                    }
                    if (size < iIntValue4) {
                        PowerCell<? extends InterfaceC1891350zJl> powerCellCreateViewHolder = powerAdapter.createViewHolder(c344380Dem.LLILLJJLI, iIntValue3);
                        powerCellCreateViewHolder.onPreload();
                        c344380Dem.LJJJJ(powerCellCreateViewHolder, iIntValue3, iIntValue4);
                    }
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ViewCacheAbility@bdf3.customPreCreateVH$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
