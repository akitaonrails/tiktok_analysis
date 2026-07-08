package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;

/* JADX INFO: renamed from: X.131r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public enum EnumC199441131r implements InterfaceC19935612zK {
    DEFAULT_SYMBOL_VISIBILITY_UNKNOWN(0),
    EXPORT_ALL(1),
    EXPORT_TOP_LEVEL(2),
    LOCAL_ALL(3),
    STRICT(4);

    public static final C199446131w LLILLJJLI;
    public static final EnumC199441131r[] LLILLL;
    public final int LL;

    /* JADX WARN: Type inference failed for: r0v8, types: [X.131w] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "DefaultSymbolVisibility");
        LLILLJJLI = new InterfaceC19922212xA<EnumC199441131r>() { // from class: X.131w
            @Override // X.InterfaceC19922212xA
            public final InterfaceC19931112yb LIZJ(int i) {
                return EnumC199441131r.forNumber(i);
            }
        };
        LLILLL = values();
    }

    public static C199422130y getDescriptor() {
        return (C199422130y) ListProtector.get(C132Z.getDescriptor().LJIJI(), 0);
    }

    public final C199422130y getDescriptorForType() {
        return getDescriptor();
    }

    public final C199423130z getValueDescriptor() {
        return (C199423130z) ListProtector.get(getDescriptor().LJIJ(), ordinal());
    }

    public static InterfaceC19922212xA<EnumC199441131r> internalGetValueMap() {
        return LLILLJJLI;
    }

    @Override // X.InterfaceC19931112yb
    public final int getNumber() {
        return this.LL;
    }

    public static EnumC199441131r forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return STRICT;
                    }
                    return LOCAL_ALL;
                }
                return EXPORT_TOP_LEVEL;
            }
            return EXPORT_ALL;
        }
        return DEFAULT_SYMBOL_VISIBILITY_UNKNOWN;
    }

    public static EnumC199441131r valueOf(C199423130z c199423130z) {
        if (c199423130z.LLILZLL == getDescriptor()) {
            return LLILLL[c199423130z.LLILLJJLI];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }

    public static EnumC199441131r valueOf(String str) {
        return (EnumC199441131r) C08FF.LIZ(EnumC199441131r.class, str);
    }

    public static EnumC199441131r valueOf(int i) {
        return forNumber(i);
    }

    EnumC199441131r(int i) {
        this.LL = i;
    }
}
