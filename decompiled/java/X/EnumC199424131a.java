package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;

/* JADX INFO: renamed from: X.131a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public enum EnumC199424131a implements InterfaceC19935612zK {
    STRING(0),
    CORD(1),
    STRING_PIECE(2);

    public static final C199428131e LLILLJJLI;
    public static final EnumC199424131a[] LLILLL;
    public final int LL;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.131e] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "CType");
        LLILLJJLI = new InterfaceC19922212xA<EnumC199424131a>() { // from class: X.131e
            @Override // X.InterfaceC19922212xA
            public final InterfaceC19931112yb LIZJ(int i) {
                return EnumC199424131a.forNumber(i);
            }
        };
        LLILLL = values();
    }

    public static C199422130y getDescriptor() {
        return (C199422130y) ListProtector.get(C131Y.getDescriptor().LJIJI(), 0);
    }

    public final C199422130y getDescriptorForType() {
        return getDescriptor();
    }

    public final C199423130z getValueDescriptor() {
        return (C199423130z) ListProtector.get(getDescriptor().LJIJ(), ordinal());
    }

    public static InterfaceC19922212xA<EnumC199424131a> internalGetValueMap() {
        return LLILLJJLI;
    }

    @Override // X.InterfaceC19931112yb
    public final int getNumber() {
        return this.LL;
    }

    public static EnumC199424131a forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return STRING_PIECE;
            }
            return CORD;
        }
        return STRING;
    }

    public static EnumC199424131a valueOf(C199423130z c199423130z) {
        if (c199423130z.LLILZLL == getDescriptor()) {
            return LLILLL[c199423130z.LLILLJJLI];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }

    public static EnumC199424131a valueOf(String str) {
        return (EnumC199424131a) C08FF.LIZ(EnumC199424131a.class, str);
    }

    public static EnumC199424131a valueOf(int i) {
        return forNumber(i);
    }

    EnumC199424131a(int i) {
        this.LL = i;
    }
}
