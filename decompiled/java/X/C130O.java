package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;

/* JADX INFO: renamed from: X.130O, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C130O implements InterfaceC19935612zK {
    UTF8_VALIDATION_UNKNOWN(0),
    DEFAULT(1),
    VERIFY(2);

    public static final C130P LLILLJJLI;
    public static final C130O[] LLILLL;
    public final int LL;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.130P] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "Utf8Validation");
        LLILLJJLI = new InterfaceC19922212xA<C130O>() { // from class: X.130P
            @Override // X.InterfaceC19922212xA
            public final InterfaceC19931112yb LIZJ(int i) {
                return C130O.forNumber(i);
            }
        };
        LLILLL = values();
    }

    public static C199422130y getDescriptor() {
        return (C199422130y) ListProtector.get(C130Q.getDescriptor().LJIJI(), 0);
    }

    public final C199422130y getDescriptorForType() {
        return getDescriptor();
    }

    public final C199423130z getValueDescriptor() {
        return (C199423130z) ListProtector.get(getDescriptor().LJIJ(), ordinal());
    }

    public static InterfaceC19922212xA<C130O> internalGetValueMap() {
        return LLILLJJLI;
    }

    @Override // X.InterfaceC19931112yb
    public final int getNumber() {
        return this.LL;
    }

    public static C130O forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return VERIFY;
            }
            return DEFAULT;
        }
        return UTF8_VALIDATION_UNKNOWN;
    }

    public static C130O valueOf(C199423130z c199423130z) {
        if (c199423130z.LLILZLL == getDescriptor()) {
            return LLILLL[c199423130z.LLILLJJLI];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }

    public static C130O valueOf(String str) {
        return (C130O) C08FF.LIZ(C130O.class, str);
    }

    public static C130O valueOf(int i) {
        return forNumber(i);
    }

    C130O(int i) {
        this.LL = i;
    }
}
