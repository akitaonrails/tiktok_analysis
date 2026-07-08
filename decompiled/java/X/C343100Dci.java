package X;

import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dci, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.ies.powerlist.optimize.preload.ViewCacheAbility$preCreateVH$1", f = "ViewCacheExtension.kt", l = {}, m = "invokeSuspend")
public final class C343100Dci extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C344380Dem LLILLJJLI;
    public final /* synthetic */ PowerAdapter LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C343100Dci(C344380Dem c344380Dem, PowerAdapter powerAdapter, InterfaceC1364105Vn<? super C343100Dci> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c344380Dem;
        this.LLILLL = powerAdapter;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C343100Dci c343100Dci = new C343100Dci(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c343100Dci.LL = obj;
        return c343100Dci;
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
        C1C7U.LIZ("ViewCacheAbility@bdf3.preCreateVH$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C344380Dem c344380Dem = this.LLILLJJLI;
        PowerAdapter powerAdapter = this.LLILLL;
        try {
            Map map = c344380Dem.LL.customPreloadVH;
            if (map == null) {
                map = new HashMap();
            }
            if (map.isEmpty()) {
                Iterator<Integer> it2 = powerAdapter.LLLLLL().iterator();
                while (it2.hasNext()) {
                    int iIntValue = it2.next().intValue();
                    int i = c344380Dem.LL.preloadCount;
                    for (int i2 = 0; i2 < i; i2++) {
                        PowerCell<? extends InterfaceC1891350zJl> powerCellCreateViewHolder = powerAdapter.createViewHolder(c344380Dem.LLILLJJLI, iIntValue);
                        powerCellCreateViewHolder.onPreload();
                        c344380Dem.LJJJJ(powerCellCreateViewHolder, iIntValue, 0);
                    }
                }
            } else {
                c344380Dem.LJJIJIIJIL(powerAdapter);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ViewCacheAbility@bdf3.preCreateVH$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
