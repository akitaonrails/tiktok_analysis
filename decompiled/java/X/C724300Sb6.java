package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Sb6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C724300Sb6 {
    public final ConcurrentHashMap<C13IQ<?>, Object> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<C13IQ<?>, AssemViewModel<?>> LIZIZ = new ConcurrentHashMap<>();

    public final <VM extends AssemViewModel<S>, S extends InterfaceC0148002o, ITEM> void LIZ(VM vm, InterfaceC1631620sYq<? super S, ? super ITEM, ? super List<? extends Object>, ? extends S> interfaceC1631620sYq, AbstractC724260Sb2 abstractC724260Sb2) {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(vm.getClass());
        if (!this.LIZ.containsKey(c19719912DlLIZ)) {
            if (abstractC724260Sb2 != null) {
                abstractC724260Sb2.LJ(vm, interfaceC1631620sYq);
            }
            this.LIZ.put(c19719912DlLIZ, interfaceC1631620sYq);
            this.LIZIZ.put(c19719912DlLIZ, vm);
        }
    }
}
