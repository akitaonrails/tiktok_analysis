package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;

/* JADX INFO: renamed from: X.130F, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C130F implements InterfaceC19935612zK {
    LABEL_OPTIONAL(1),
    LABEL_REPEATED(3),
    LABEL_REQUIRED(2);

    public static final C130G LLILLJJLI;
    public static final C130F[] LLILLL;
    public final int LL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.130G] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "Label");
        LLILLJJLI = new InterfaceC19922212xA<C130F>() { // from class: X.130G
            @Override // X.InterfaceC19922212xA
            public final InterfaceC19931112yb LIZJ(int i) {
                return C130F.forNumber(i);
            }
        };
        LLILLL = values();
    }

    public static C199422130y getDescriptor() {
        return (C199422130y) ListProtector.get(C199412130o.getDescriptor().LJIJI(), 1);
    }

    public final C199422130y getDescriptorForType() {
        return getDescriptor();
    }

    public final C199423130z getValueDescriptor() {
        return (C199423130z) ListProtector.get(getDescriptor().LJIJ(), ordinal());
    }

    public static InterfaceC19922212xA<C130F> internalGetValueMap() {
        return LLILLJJLI;
    }

    @Override // X.InterfaceC19931112yb
    public final int getNumber() {
        return this.LL;
    }

    public static C130F forNumber(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return LABEL_REPEATED;
            }
            return LABEL_REQUIRED;
        }
        return LABEL_OPTIONAL;
    }

    public static C130F valueOf(C199423130z c199423130z) {
        if (c199423130z.LLILZLL == getDescriptor()) {
            return LLILLL[c199423130z.LLILLJJLI];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }

    public static C130F valueOf(String str) {
        return (C130F) C08FF.LIZ(C130F.class, str);
    }

    public static C130F valueOf(int i) {
        return forNumber(i);
    }

    C130F(int i) {
        this.LL = i;
    }
}
