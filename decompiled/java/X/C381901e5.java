package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01e5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C381901e5 {
    public final Map<Integer, InterfaceC381401e0<Object, Object>> LIZ = new LinkedHashMap();
    public final CopyOnWriteArrayList<AbstractC405601hu> LIZIZ = new CopyOnWriteArrayList<>();
    public final List<AbstractC405501ht> LIZJ = new ArrayList();

    public final void LIZ(Function0<? extends InterfaceC381401e0<Object, Object>> function0) {
        InterfaceC381401e0<Object, Object> interfaceC381401e0Invoke = function0.invoke();
        if (interfaceC381401e0Invoke != null) {
            if (!this.LIZ.containsKey(Integer.valueOf(interfaceC381401e0Invoke.getType()))) {
                this.LIZ.put(Integer.valueOf(interfaceC381401e0Invoke.getType()), interfaceC381401e0Invoke);
            } else {
                C20441214yg.LJ("AutoAdaptiveCenter", "Register task failed, register same type task is not allowed.");
            }
        }
    }
}
