package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;

/* JADX INFO: renamed from: X.1321, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum AnonymousClass1321 implements InterfaceC19935612zK {
    SPEED(1),
    CODE_SIZE(2),
    LITE_RUNTIME(3);

    public static final AnonymousClass1325 LLILLJJLI;
    public static final AnonymousClass1321[] LLILLL;
    public final int LL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.1325] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "OptimizeMode");
        LLILLJJLI = new InterfaceC19922212xA<AnonymousClass1321>() { // from class: X.1325
            @Override // X.InterfaceC19922212xA
            public final InterfaceC19931112yb LIZJ(int i) {
                return AnonymousClass1321.forNumber(i);
            }
        };
        LLILLL = values();
    }

    public static C199422130y getDescriptor() {
        return (C199422130y) ListProtector.get(C132E.getDescriptor().LJIJI(), 0);
    }

    public final C199422130y getDescriptorForType() {
        return getDescriptor();
    }

    public final C199423130z getValueDescriptor() {
        return (C199423130z) ListProtector.get(getDescriptor().LJIJ(), ordinal());
    }

    public static InterfaceC19922212xA<AnonymousClass1321> internalGetValueMap() {
        return LLILLJJLI;
    }

    @Override // X.InterfaceC19931112yb
    public final int getNumber() {
        return this.LL;
    }

    public static AnonymousClass1321 forNumber(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return LITE_RUNTIME;
            }
            return CODE_SIZE;
        }
        return SPEED;
    }

    public static AnonymousClass1321 valueOf(C199423130z c199423130z) {
        if (c199423130z.LLILZLL == getDescriptor()) {
            return LLILLL[c199423130z.LLILLJJLI];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }

    public static AnonymousClass1321 valueOf(String str) {
        return (AnonymousClass1321) C08FF.LIZ(AnonymousClass1321.class, str);
    }

    public static AnonymousClass1321 valueOf(int i) {
        return forNumber(i);
    }

    AnonymousClass1321(int i) {
        this.LL = i;
    }
}
