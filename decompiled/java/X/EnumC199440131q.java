package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;

/* JADX INFO: renamed from: X.131q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public enum EnumC199440131q implements InterfaceC19935612zK {
    JSON_FORMAT_UNKNOWN(0),
    ALLOW(1),
    LEGACY_BEST_EFFORT(2);

    public static final C199445131v LLILLJJLI;
    public static final EnumC199440131q[] LLILLL;
    public final int LL;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.131v] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "JsonFormat");
        LLILLJJLI = new InterfaceC19922212xA<EnumC199440131q>() { // from class: X.131v
            @Override // X.InterfaceC19922212xA
            public final InterfaceC19931112yb LIZJ(int i) {
                return EnumC199440131q.forNumber(i);
            }
        };
        LLILLL = values();
    }

    public static C199422130y getDescriptor() {
        return (C199422130y) ListProtector.get(C199437131n.getDescriptor().LJIJI(), 5);
    }

    public final C199422130y getDescriptorForType() {
        return getDescriptor();
    }

    public final C199423130z getValueDescriptor() {
        return (C199423130z) ListProtector.get(getDescriptor().LJIJ(), ordinal());
    }

    public static InterfaceC19922212xA<EnumC199440131q> internalGetValueMap() {
        return LLILLJJLI;
    }

    @Override // X.InterfaceC19931112yb
    public final int getNumber() {
        return this.LL;
    }

    public static EnumC199440131q forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return LEGACY_BEST_EFFORT;
            }
            return ALLOW;
        }
        return JSON_FORMAT_UNKNOWN;
    }

    public static EnumC199440131q valueOf(C199423130z c199423130z) {
        if (c199423130z.LLILZLL == getDescriptor()) {
            return LLILLL[c199423130z.LLILLJJLI];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }

    public static EnumC199440131q valueOf(String str) {
        return (EnumC199440131q) C08FF.LIZ(EnumC199440131q.class, str);
    }

    public static EnumC199440131q valueOf(int i) {
        return forNumber(i);
    }

    EnumC199440131q(int i) {
        this.LL = i;
    }
}
