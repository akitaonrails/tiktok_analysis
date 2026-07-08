package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;

/* JADX INFO: renamed from: X.130S, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C130S implements InterfaceC19935612zK {
    NEST_IN_FILE_CLASS_UNKNOWN(0),
    NO(1),
    YES(2),
    LEGACY(3);

    public static final C130T LLILLJJLI;
    public static final C130S[] LLILLL;
    public final int LL;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.130T] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "NestInFileClass");
        LLILLJJLI = new InterfaceC19922212xA<C130S>() { // from class: X.130T
            @Override // X.InterfaceC19922212xA
            public final InterfaceC19931112yb LIZJ(int i) {
                return C130S.forNumber(i);
            }
        };
        LLILLL = values();
    }

    public static C199422130y getDescriptor() {
        return (C199422130y) ListProtector.get(C130U.getDescriptor().LJIJI(), 0);
    }

    public final C199422130y getDescriptorForType() {
        return getDescriptor();
    }

    public final C199423130z getValueDescriptor() {
        return (C199423130z) ListProtector.get(getDescriptor().LJIJ(), ordinal());
    }

    public static InterfaceC19922212xA<C130S> internalGetValueMap() {
        return LLILLJJLI;
    }

    @Override // X.InterfaceC19931112yb
    public final int getNumber() {
        return this.LL;
    }

    public static C130S forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return LEGACY;
                }
                return YES;
            }
            return NO;
        }
        return NEST_IN_FILE_CLASS_UNKNOWN;
    }

    public static C130S valueOf(C199423130z c199423130z) {
        if (c199423130z.LLILZLL == getDescriptor()) {
            return LLILLL[c199423130z.LLILLJJLI];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }

    public static C130S valueOf(String str) {
        return (C130S) C08FF.LIZ(C130S.class, str);
    }

    public static C130S valueOf(int i) {
        return forNumber(i);
    }

    C130S(int i) {
        this.LL = i;
    }
}
