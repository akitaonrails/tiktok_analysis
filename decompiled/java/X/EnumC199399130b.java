package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;

/* JADX INFO: renamed from: X.130b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public enum EnumC199399130b implements InterfaceC19935612zK {
    MESSAGE_ENCODING_UNKNOWN(0),
    LENGTH_PREFIXED(1),
    DELIMITED(2);

    public static final C199400130c LLILLJJLI;
    public static final EnumC199399130b[] LLILLL;
    public final int LL;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.130c] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "MessageEncoding");
        LLILLJJLI = new InterfaceC19922212xA<EnumC199399130b>() { // from class: X.130c
            @Override // X.InterfaceC19922212xA
            public final InterfaceC19931112yb LIZJ(int i) {
                return EnumC199399130b.forNumber(i);
            }
        };
        LLILLL = values();
    }

    public static C199422130y getDescriptor() {
        return (C199422130y) ListProtector.get(C199437131n.getDescriptor().LJIJI(), 4);
    }

    public final C199422130y getDescriptorForType() {
        return getDescriptor();
    }

    public final C199423130z getValueDescriptor() {
        return (C199423130z) ListProtector.get(getDescriptor().LJIJ(), ordinal());
    }

    public static InterfaceC19922212xA<EnumC199399130b> internalGetValueMap() {
        return LLILLJJLI;
    }

    @Override // X.InterfaceC19931112yb
    public final int getNumber() {
        return this.LL;
    }

    public static EnumC199399130b forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return DELIMITED;
            }
            return LENGTH_PREFIXED;
        }
        return MESSAGE_ENCODING_UNKNOWN;
    }

    public static EnumC199399130b valueOf(C199423130z c199423130z) {
        if (c199423130z.LLILZLL == getDescriptor()) {
            return LLILLL[c199423130z.LLILLJJLI];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }

    public static EnumC199399130b valueOf(String str) {
        return (EnumC199399130b) C08FF.LIZ(EnumC199399130b.class, str);
    }

    public static EnumC199399130b valueOf(int i) {
        return forNumber(i);
    }

    EnumC199399130b(int i) {
        this.LL = i;
    }
}
