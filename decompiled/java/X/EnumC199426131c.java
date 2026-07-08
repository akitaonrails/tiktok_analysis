package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;

/* JADX INFO: renamed from: X.131c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public enum EnumC199426131c implements InterfaceC19935612zK {
    RETENTION_UNKNOWN(0),
    RETENTION_RUNTIME(1),
    RETENTION_SOURCE(2);

    public static final C199430131g LLILLJJLI;
    public static final EnumC199426131c[] LLILLL;
    public final int LL;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.131g] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "OptionRetention");
        LLILLJJLI = new InterfaceC19922212xA<EnumC199426131c>() { // from class: X.131g
            @Override // X.InterfaceC19922212xA
            public final InterfaceC19931112yb LIZJ(int i) {
                return EnumC199426131c.forNumber(i);
            }
        };
        LLILLL = values();
    }

    public static C199422130y getDescriptor() {
        return (C199422130y) ListProtector.get(C131Y.getDescriptor().LJIJI(), 2);
    }

    public final C199422130y getDescriptorForType() {
        return getDescriptor();
    }

    public final C199423130z getValueDescriptor() {
        return (C199423130z) ListProtector.get(getDescriptor().LJIJ(), ordinal());
    }

    public static InterfaceC19922212xA<EnumC199426131c> internalGetValueMap() {
        return LLILLJJLI;
    }

    @Override // X.InterfaceC19931112yb
    public final int getNumber() {
        return this.LL;
    }

    public static EnumC199426131c forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return RETENTION_SOURCE;
            }
            return RETENTION_RUNTIME;
        }
        return RETENTION_UNKNOWN;
    }

    public static EnumC199426131c valueOf(C199423130z c199423130z) {
        if (c199423130z.LLILZLL == getDescriptor()) {
            return LLILLL[c199423130z.LLILLJJLI];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }

    public static EnumC199426131c valueOf(String str) {
        return (EnumC199426131c) C08FF.LIZ(EnumC199426131c.class, str);
    }

    public static EnumC199426131c valueOf(int i) {
        return forNumber(i);
    }

    EnumC199426131c(int i) {
        this.LL = i;
    }
}
