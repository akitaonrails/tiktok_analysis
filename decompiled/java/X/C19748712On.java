package X;

import java.util.function.Supplier;

/* JADX INFO: renamed from: X.12On, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19748712On {
    public static final ThreadLocal<EnumC19368010py> LIZ = ThreadLocal.withInitial(new Supplier() { // from class: X.12Oo
        @Override // java.util.function.Supplier
        public final Object get() {
            return EnumC19368010py.DEFAULT_FORMAT;
        }
    });
}
