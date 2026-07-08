package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;

/* JADX INFO: renamed from: X.131p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public enum EnumC199439131p implements InterfaceC19935612zK {
    ENFORCE_NAMING_STYLE_UNKNOWN(0),
    STYLE2024(1),
    STYLE_LEGACY(2);

    public static final C199443131t LLILLJJLI;
    public static final EnumC199439131p[] LLILLL;
    public final int LL;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.131t] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "EnforceNamingStyle");
        LLILLJJLI = new InterfaceC19922212xA<EnumC199439131p>() { // from class: X.131t
            @Override // X.InterfaceC19922212xA
            public final InterfaceC19931112yb LIZJ(int i) {
                return EnumC199439131p.forNumber(i);
            }
        };
        LLILLL = values();
    }

    public static C199422130y getDescriptor() {
        return (C199422130y) ListProtector.get(C199437131n.getDescriptor().LJIJI(), 6);
    }

    public final C199422130y getDescriptorForType() {
        return getDescriptor();
    }

    public final C199423130z getValueDescriptor() {
        return (C199423130z) ListProtector.get(getDescriptor().LJIJ(), ordinal());
    }

    public static InterfaceC19922212xA<EnumC199439131p> internalGetValueMap() {
        return LLILLJJLI;
    }

    @Override // X.InterfaceC19931112yb
    public final int getNumber() {
        return this.LL;
    }

    public static EnumC199439131p forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return STYLE_LEGACY;
            }
            return STYLE2024;
        }
        return ENFORCE_NAMING_STYLE_UNKNOWN;
    }

    public static EnumC199439131p valueOf(C199423130z c199423130z) {
        if (c199423130z.LLILZLL == getDescriptor()) {
            return LLILLL[c199423130z.LLILLJJLI];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }

    public static EnumC199439131p valueOf(String str) {
        return (EnumC199439131p) C08FF.LIZ(EnumC199439131p.class, str);
    }

    public static EnumC199439131p valueOf(int i) {
        return forNumber(i);
    }

    EnumC199439131p(int i) {
        this.LL = i;
    }
}
