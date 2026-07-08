package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;

/* JADX INFO: renamed from: X.131y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public enum EnumC199448131y implements InterfaceC19935612zK {
    DECLARATION(0),
    UNVERIFIED(1);

    public static final AnonymousClass1324 LLILLJJLI;
    public static final EnumC199448131y[] LLILLL;
    public final int LL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.1324] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "VerificationState");
        LLILLJJLI = new InterfaceC19922212xA<EnumC199448131y>() { // from class: X.1324
            @Override // X.InterfaceC19922212xA
            public final InterfaceC19931112yb LIZJ(int i) {
                return EnumC199448131y.forNumber(i);
            }
        };
        LLILLL = values();
    }

    public static C199422130y getDescriptor() {
        return (C199422130y) ListProtector.get(C199449131z.getDescriptor().LJIJI(), 0);
    }

    public final C199422130y getDescriptorForType() {
        return getDescriptor();
    }

    public final C199423130z getValueDescriptor() {
        return (C199423130z) ListProtector.get(getDescriptor().LJIJ(), ordinal());
    }

    public static InterfaceC19922212xA<EnumC199448131y> internalGetValueMap() {
        return LLILLJJLI;
    }

    @Override // X.InterfaceC19931112yb
    public final int getNumber() {
        return this.LL;
    }

    public static EnumC199448131y forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return UNVERIFIED;
        }
        return DECLARATION;
    }

    public static EnumC199448131y valueOf(C199423130z c199423130z) {
        if (c199423130z.LLILZLL == getDescriptor()) {
            return LLILLL[c199423130z.LLILLJJLI];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }

    public static EnumC199448131y valueOf(String str) {
        return (EnumC199448131y) C08FF.LIZ(EnumC199448131y.class, str);
    }

    public static EnumC199448131y valueOf(int i) {
        return forNumber(i);
    }

    EnumC199448131y(int i) {
        this.LL = i;
    }
}
