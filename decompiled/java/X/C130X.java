package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;

/* JADX INFO: renamed from: X.130X, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C130X implements InterfaceC19935612zK {
    UTF8_VALIDATION_UNKNOWN(0),
    VERIFY(2),
    NONE(3);

    public static final C130Y LLILLJJLI;
    public static final C130X[] LLILLL;
    public final int LL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.130Y] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "Utf8Validation");
        LLILLJJLI = new InterfaceC19922212xA<C130X>() { // from class: X.130Y
            @Override // X.InterfaceC19922212xA
            public final InterfaceC19931112yb LIZJ(int i) {
                return C130X.forNumber(i);
            }
        };
        LLILLL = values();
    }

    public static C199422130y getDescriptor() {
        return (C199422130y) ListProtector.get(C199437131n.getDescriptor().LJIJI(), 3);
    }

    public final C199422130y getDescriptorForType() {
        return getDescriptor();
    }

    public final C199423130z getValueDescriptor() {
        return (C199423130z) ListProtector.get(getDescriptor().LJIJ(), ordinal());
    }

    public static InterfaceC19922212xA<C130X> internalGetValueMap() {
        return LLILLJJLI;
    }

    @Override // X.InterfaceC19931112yb
    public final int getNumber() {
        return this.LL;
    }

    public static C130X forNumber(int i) {
        if (i != 0) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return NONE;
            }
            return VERIFY;
        }
        return UTF8_VALIDATION_UNKNOWN;
    }

    public static C130X valueOf(C199423130z c199423130z) {
        if (c199423130z.LLILZLL == getDescriptor()) {
            return LLILLL[c199423130z.LLILLJJLI];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }

    public static C130X valueOf(String str) {
        return (C130X) C08FF.LIZ(C130X.class, str);
    }

    public static C130X valueOf(int i) {
        return forNumber(i);
    }

    C130X(int i) {
        this.LL = i;
    }
}
