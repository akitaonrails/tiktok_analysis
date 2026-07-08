package X;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0czU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public interface InterfaceC1033100czU extends Serializable {
    void clearAllWithParams(List<? extends HashMap<String, Object>> list);

    boolean clearWithCacheConfig(C1033320czq c1033320czq);

    String requestIdWithCacheConfig(C1033320czq c1033320czq, String str);

    void requestWithConfig(C1033280czm c1033280czm, String str, Function1<? super Integer, Unit> function1);
}
