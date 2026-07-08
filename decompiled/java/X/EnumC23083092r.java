package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.092r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC23083092r implements Callable<List<Object>>, InterfaceC1487280oo2<Object, List<Object>> {
    public static final EnumC23083092r INSTANCE;
    public static final /* synthetic */ EnumC23083092r[] LL;

    static {
        EnumC23083092r enumC23083092r = new EnumC23083092r();
        INSTANCE = enumC23083092r;
        LL = new EnumC23083092r[]{enumC23083092r};
    }

    public static EnumC23083092r[] values() {
        return (EnumC23083092r[]) LL.clone();
    }

    @Override // java.util.concurrent.Callable
    public List<Object> call() {
        return new ArrayList();
    }

    public static <T> Callable<List<T>> asCallable() {
        return INSTANCE;
    }

    public static <T, O> InterfaceC1487280oo2<O, List<T>> asFunction() {
        return INSTANCE;
    }

    public static EnumC23083092r valueOf(String str) {
        return (EnumC23083092r) C08FF.LIZ(EnumC23083092r.class, str);
    }

    @Override // X.InterfaceC1487280oo2
    public List<Object> apply(Object obj) {
        return new ArrayList();
    }
}
