package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;

/* JADX INFO: renamed from: X.131x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public enum EnumC199447131x implements InterfaceC19935612zK {
    IDEMPOTENCY_UNKNOWN(0),
    NO_SIDE_EFFECTS(1),
    IDEMPOTENT(2);

    public static final AnonymousClass1323 LLILLJJLI;
    public static final EnumC199447131x[] LLILLL;
    public final int LL;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.1323] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "IdempotencyLevel");
        LLILLJJLI = new InterfaceC19922212xA<EnumC199447131x>() { // from class: X.1323
            @Override // X.InterfaceC19922212xA
            public final InterfaceC19931112yb LIZJ(int i) {
                return EnumC199447131x.forNumber(i);
            }
        };
        LLILLL = values();
    }

    public static C199422130y getDescriptor() {
        return (C199422130y) ListProtector.get(AnonymousClass1328.getDescriptor().LJIJI(), 0);
    }

    public final C199422130y getDescriptorForType() {
        return getDescriptor();
    }

    public final C199423130z getValueDescriptor() {
        return (C199423130z) ListProtector.get(getDescriptor().LJIJ(), ordinal());
    }

    public static InterfaceC19922212xA<EnumC199447131x> internalGetValueMap() {
        return LLILLJJLI;
    }

    @Override // X.InterfaceC19931112yb
    public final int getNumber() {
        return this.LL;
    }

    public static EnumC199447131x forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return IDEMPOTENT;
            }
            return NO_SIDE_EFFECTS;
        }
        return IDEMPOTENCY_UNKNOWN;
    }

    public static EnumC199447131x valueOf(C199423130z c199423130z) {
        if (c199423130z.LLILZLL == getDescriptor()) {
            return LLILLL[c199423130z.LLILLJJLI];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }

    public static EnumC199447131x valueOf(String str) {
        return (EnumC199447131x) C08FF.LIZ(EnumC199447131x.class, str);
    }

    public static EnumC199447131x valueOf(int i) {
        return forNumber(i);
    }

    EnumC199447131x(int i) {
        this.LL = i;
    }
}
