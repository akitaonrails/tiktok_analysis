package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;

/* JADX INFO: renamed from: X.130Z, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C130Z implements InterfaceC19935612zK {
    FIELD_PRESENCE_UNKNOWN(0),
    EXPLICIT(1),
    IMPLICIT(2),
    LEGACY_REQUIRED(3);

    public static final C199398130a LLILLJJLI;
    public static final C130Z[] LLILLL;
    public final int LL;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.130a] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "FieldPresence");
        LLILLJJLI = new InterfaceC19922212xA<C130Z>() { // from class: X.130a
            @Override // X.InterfaceC19922212xA
            public final InterfaceC19931112yb LIZJ(int i) {
                return C130Z.forNumber(i);
            }
        };
        LLILLL = values();
    }

    public static C199422130y getDescriptor() {
        return (C199422130y) ListProtector.get(C199437131n.getDescriptor().LJIJI(), 0);
    }

    public final C199422130y getDescriptorForType() {
        return getDescriptor();
    }

    public final C199423130z getValueDescriptor() {
        return (C199423130z) ListProtector.get(getDescriptor().LJIJ(), ordinal());
    }

    public static InterfaceC19922212xA<C130Z> internalGetValueMap() {
        return LLILLJJLI;
    }

    @Override // X.InterfaceC19931112yb
    public final int getNumber() {
        return this.LL;
    }

    public static C130Z forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return LEGACY_REQUIRED;
                }
                return IMPLICIT;
            }
            return EXPLICIT;
        }
        return FIELD_PRESENCE_UNKNOWN;
    }

    public static C130Z valueOf(C199423130z c199423130z) {
        if (c199423130z.LLILZLL == getDescriptor()) {
            return LLILLL[c199423130z.LLILLJJLI];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }

    public static C130Z valueOf(String str) {
        return (C130Z) C08FF.LIZ(C130Z.class, str);
    }

    public static C130Z valueOf(int i) {
        return forNumber(i);
    }

    C130Z(int i) {
        this.LL = i;
    }
}
