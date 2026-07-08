package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05av, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.material.AnchoredDraggableState$doAnchoredDrag$2", f = "AnchoredDraggable.kt", l = {441}, m = "invokeSuspend")
public final class C1381505av extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1381605aw<Object> LLILLL;
    public final /* synthetic */ EnumC1384205bM LLILZ;
    public final /* synthetic */ InterfaceC1631620sYq<C05RG, Map<Object, Float>, InterfaceC1364105Vn<? super Unit>, Object> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1381505av(Object obj, C1381605aw<Object> c1381605aw, EnumC1384205bM enumC1384205bM, InterfaceC1631620sYq<? super C05RG, ? super Map<Object, Float>, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631620sYq, InterfaceC1364105Vn<? super C1381505av> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = obj;
        this.LLILLL = c1381605aw;
        this.LLILZ = enumC1384205bM;
        this.LLILZIL = interfaceC1631620sYq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1381505av(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object next;
        boolean z;
        Object next2;
        boolean z2;
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Object key = null;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                if (this.LLILLJJLI != null && !this.LLILLL.LIZIZ().containsKey(this.LLILLJJLI)) {
                    if (this.LLILLL.LIZLLL.invoke(this.LLILLJJLI).booleanValue()) {
                        ((C13FE) this.LLILLL.LJI).setValue(this.LLILLJJLI);
                    }
                    return Unit.LIZ;
                }
                C1381605aw<Object> c1381605aw = this.LLILLL;
                C1381805ay c1381805ay = c1381605aw.LJ;
                EnumC1384205bM enumC1384205bM = this.LLILZ;
                C1381405au c1381405au = new C1381405au(this.LLILLJJLI, c1381605aw, this.LLILZIL, null);
                this.LL = 1;
                c1381805ay.getClass();
                if (C2296808zG.LJ(new C1383205bC(enumC1384205bM, c1381805ay, c1381405au, null), this) == objLJFF) {
                    return objLJFF;
                }
            }
            if (this.LLILLJJLI != null) {
                ((C13FE) this.LLILLL.LJIILIIL).setValue(null);
            }
            Set<Map.Entry<Object, Float>> setEntrySet = this.LLILLL.LIZIZ().entrySet();
            C1381605aw<Object> c1381605aw2 = this.LLILLL;
            Iterator<T> it2 = setEntrySet.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next2 = it2.next();
                    if (Math.abs(((Number) ((Map.Entry) next2).getValue()).floatValue() - c1381605aw2.LIZLLL()) < 0.5f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) next2;
            if (entry != null) {
                key = entry.getKey();
            }
            if (key != null && this.LLILLL.LIZLLL.invoke(key).booleanValue()) {
                ((C13FE) this.LLILLL.LJI).setValue(key);
            }
            return Unit.LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (this.LLILLJJLI != null) {
                ((C13FE) this.LLILLL.LJIILIIL).setValue(null);
            }
            Set<Map.Entry<Object, Float>> setEntrySet2 = this.LLILLL.LIZIZ().entrySet();
            C1381605aw<Object> c1381605aw3 = this.LLILLL;
            Iterator<T> it3 = setEntrySet2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    if (Math.abs(((Number) ((Map.Entry) next).getValue()).floatValue() - c1381605aw3.LIZLLL()) < 0.5f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            Map.Entry entry2 = (Map.Entry) next;
            if (entry2 != null) {
                key = entry2.getKey();
            }
            if (key != null && this.LLILLL.LIZLLL.invoke(key).booleanValue()) {
                ((C13FE) this.LLILLL.LJI).setValue(key);
            }
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
