package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;

/* JADX INFO: renamed from: X.131o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public enum EnumC199438131o implements InterfaceC19935612zK {
    ENUM_TYPE_UNKNOWN(0),
    OPEN(1),
    CLOSED(2);

    public static final C199444131u LLILLJJLI;
    public static final EnumC199438131o[] LLILLL;
    public final int LL;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.131u] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "EnumType");
        LLILLJJLI = new InterfaceC19922212xA<EnumC199438131o>() { // from class: X.131u
            @Override // X.InterfaceC19922212xA
            public final InterfaceC19931112yb LIZJ(int i) {
                return EnumC199438131o.forNumber(i);
            }
        };
        LLILLL = values();
    }

    public static C199422130y getDescriptor() {
        return (C199422130y) ListProtector.get(C199437131n.getDescriptor().LJIJI(), 1);
    }

    public final C199422130y getDescriptorForType() {
        return getDescriptor();
    }

    public final C199423130z getValueDescriptor() {
        return (C199423130z) ListProtector.get(getDescriptor().LJIJ(), ordinal());
    }

    public static InterfaceC19922212xA<EnumC199438131o> internalGetValueMap() {
        return LLILLJJLI;
    }

    @Override // X.InterfaceC19931112yb
    public final int getNumber() {
        return this.LL;
    }

    public static EnumC199438131o forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return CLOSED;
            }
            return OPEN;
        }
        return ENUM_TYPE_UNKNOWN;
    }

    public static EnumC199438131o valueOf(C199423130z c199423130z) {
        if (c199423130z.LLILZLL == getDescriptor()) {
            return LLILLL[c199423130z.LLILLJJLI];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }

    public static EnumC199438131o valueOf(String str) {
        return (EnumC199438131o) C08FF.LIZ(EnumC199438131o.class, str);
    }

    public static EnumC199438131o valueOf(int i) {
        return forNumber(i);
    }

    EnumC199438131o(int i) {
        this.LL = i;
    }
}
