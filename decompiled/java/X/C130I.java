package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.130I, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C130I implements InterfaceC19935612zK {
    TARGET_TYPE_UNKNOWN(0),
    TARGET_TYPE_FILE(1),
    TARGET_TYPE_EXTENSION_RANGE(2),
    TARGET_TYPE_MESSAGE(3),
    TARGET_TYPE_FIELD(4),
    TARGET_TYPE_ONEOF(5),
    TARGET_TYPE_ENUM(6),
    TARGET_TYPE_ENUM_ENTRY(7),
    TARGET_TYPE_SERVICE(8),
    TARGET_TYPE_METHOD(9);

    public static final C130J LLILLJJLI;
    public static final C130I[] LLILLL;
    public final int LL;

    /* JADX WARN: Type inference failed for: r0v10, types: [X.130J] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "OptionTargetType");
        LLILLJJLI = new InterfaceC19922212xA<C130I>() { // from class: X.130J
            @Override // X.InterfaceC19922212xA
            public final InterfaceC19931112yb LIZJ(int i) {
                return C130I.forNumber(i);
            }
        };
        LLILLL = values();
    }

    public static C199422130y getDescriptor() {
        return (C199422130y) ListProtector.get(C131Y.getDescriptor().LJIJI(), 3);
    }

    public final C199422130y getDescriptorForType() {
        return getDescriptor();
    }

    public final C199423130z getValueDescriptor() {
        return (C199423130z) ListProtector.get(getDescriptor().LJIJ(), ordinal());
    }

    public static InterfaceC19922212xA<C130I> internalGetValueMap() {
        return LLILLJJLI;
    }

    @Override // X.InterfaceC19931112yb
    public final int getNumber() {
        return this.LL;
    }

    public static C130I forNumber(int i) {
        switch (i) {
            case 0:
                return TARGET_TYPE_UNKNOWN;
            case 1:
                return TARGET_TYPE_FILE;
            case 2:
                return TARGET_TYPE_EXTENSION_RANGE;
            case 3:
                return TARGET_TYPE_MESSAGE;
            case 4:
                return TARGET_TYPE_FIELD;
            case 5:
                return TARGET_TYPE_ONEOF;
            case 6:
                return TARGET_TYPE_ENUM;
            case 7:
                return TARGET_TYPE_ENUM_ENTRY;
            case 8:
                return TARGET_TYPE_SERVICE;
            case BdTuring.TYPE_ECAF /* 9 */:
                return TARGET_TYPE_METHOD;
            default:
                return null;
        }
    }

    public static C130I valueOf(C199423130z c199423130z) {
        if (c199423130z.LLILZLL == getDescriptor()) {
            return LLILLL[c199423130z.LLILLJJLI];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }

    public static C130I valueOf(String str) {
        return (C130I) C08FF.LIZ(C130I.class, str);
    }

    public static C130I valueOf(int i) {
        return forNumber(i);
    }

    C130I(int i) {
        this.LL = i;
    }
}
