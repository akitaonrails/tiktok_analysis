package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;

/* JADX INFO: renamed from: X.131R, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C131R implements InterfaceC19935612zK {
    REPEATED_FIELD_ENCODING_UNKNOWN(0),
    PACKED(1),
    EXPANDED(2);

    public static final C131S LLILLJJLI;
    public static final C131R[] LLILLL;
    public final int LL;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.131S] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "RepeatedFieldEncoding");
        LLILLJJLI = new InterfaceC19922212xA<C131R>() { // from class: X.131S
            @Override // X.InterfaceC19922212xA
            public final InterfaceC19931112yb LIZJ(int i) {
                return C131R.forNumber(i);
            }
        };
        LLILLL = values();
    }

    public static C199422130y getDescriptor() {
        return (C199422130y) ListProtector.get(C199437131n.getDescriptor().LJIJI(), 2);
    }

    public final C199422130y getDescriptorForType() {
        return getDescriptor();
    }

    public final C199423130z getValueDescriptor() {
        return (C199423130z) ListProtector.get(getDescriptor().LJIJ(), ordinal());
    }

    public static InterfaceC19922212xA<C131R> internalGetValueMap() {
        return LLILLJJLI;
    }

    @Override // X.InterfaceC19931112yb
    public final int getNumber() {
        return this.LL;
    }

    public static C131R forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return EXPANDED;
            }
            return PACKED;
        }
        return REPEATED_FIELD_ENCODING_UNKNOWN;
    }

    public static C131R valueOf(C199423130z c199423130z) {
        if (c199423130z.LLILZLL == getDescriptor()) {
            return LLILLL[c199423130z.LLILLJJLI];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }

    public static C131R valueOf(String str) {
        return (C131R) C08FF.LIZ(C131R.class, str);
    }

    public static C131R valueOf(int i) {
        return forNumber(i);
    }

    C131R(int i) {
        this.LL = i;
    }
}
