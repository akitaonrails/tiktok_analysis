package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import iyl.i3;
import iyl.s0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0t50, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1651560t50 implements InterfaceC1657840tF8 {
    public final LifecycleOwner LL;
    public final InterfaceC1651490t4t LLILLJJLI;
    public final List<View> LLILLL;
    public List<i3> LLILZ;
    public final C11PQ<C1651600t54> LLILZIL;
    public final Map<C861430Xqn, InterfaceC1651480t4s<Object, InterfaceC1659130tHD<Object>>> LLILZLL;

    @Override // X.InterfaceC1657840tF8
    public final void LJ() {
    }

    @Override // X.InterfaceC1657840tF8
    public final C19475711Hn LIZ() {
        C11PQ<C1651600t54> c11pq = this.LLILZIL;
        c11pq.getClass();
        return new C19475711Hn(c11pq);
    }

    @Override // X.InterfaceC1657840tF8
    public final List<i3> LIZLLL() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1657840tF8
    public final InterfaceC1657880tFC LIZIZ(i3 i3Var) {
        InterfaceC1657880tFC interfaceC1657880tFCLIZ;
        C1651520t4w c1651520t4w = i3Var.LLJJJJLIIL;
        if (c1651520t4w != null) {
            InterfaceC1651320t4c<? extends Object> interfaceC1651320t4c = c1651520t4w.LIZ;
            Class<Object> cls = c1651520t4w.LIZLLL;
            Class<InterfaceC1659130tHD<Object>> cls2 = c1651520t4w.LJFF;
            InterfaceC1651480t4s<Object, InterfaceC1659130tHD<Object>> interfaceC1651480t4s = this.LLILZLL.get(new C861430Xqn(cls, cls2));
            if (interfaceC1651480t4s != null && (interfaceC1657880tFCLIZ = interfaceC1651480t4s.LIZ(interfaceC1651320t4c, this.LL, this.LLILLL)) != null) {
                return interfaceC1657880tFCLIZ;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("can not find viewHolderFactory for stateClazz:");
            sbLIZ.append(cls);
            sbLIZ.append(", actionClazz:");
            sbLIZ.append(cls2);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("config.internalModel is null ");
        sbLIZ2.append(i3Var);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public C1651560t50(s0 s0Var, InterfaceC1651490t4t interfaceC1651490t4t, List list) {
        this.LL = s0Var;
        this.LLILLJJLI = interfaceC1651490t4t;
        this.LLILLL = list;
        C13BV c13bv = C13BV.INSTANCE;
        this.LLILZ = c13bv;
        this.LLILZIL = C11PQ.LJLLLLLL(new C1651600t54(c13bv));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LLILZLL = linkedHashMap;
        linkedHashMap.put(new C861430Xqn(i3.class, InterfaceC1651550t4z.class), new InterfaceC1651480t4s<i3, InterfaceC1651550t4z>() { // from class: X.0t51
            @Override // X.InterfaceC1651480t4s
            public final InterfaceC1651590t53<i3, InterfaceC1651550t4z> LIZ(InterfaceC1651320t4c<? extends i3> interfaceC1651320t4c, LifecycleOwner lifecycleOwner, List<View> list2) {
                return new C1659090tH9(lifecycleOwner, list2);
            }
        });
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(s0Var), null, null, new C861420Xqm(this, null), 3);
    }

    @Override // X.InterfaceC1657840tF8
    public final void LIZJ(List<i3> list, boolean z, C1460190o6L c1460190o6L) {
        this.LLILZIL.onNext(new C1651600t54(this.LLILZ, z, c1460190o6L));
    }
}
