package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;

/* JADX INFO: renamed from: X.131b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public enum EnumC199425131b implements InterfaceC19935612zK {
    JS_NORMAL(0),
    JS_STRING(1),
    JS_NUMBER(2);

    public static final C199429131f LLILLJJLI;
    public static final EnumC199425131b[] LLILLL;
    public final int LL;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.131f] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "JSType");
        LLILLJJLI = new InterfaceC19922212xA<EnumC199425131b>() { // from class: X.131f
            @Override // X.InterfaceC19922212xA
            public final InterfaceC19931112yb LIZJ(int i) {
                return EnumC199425131b.forNumber(i);
            }
        };
        LLILLL = values();
    }

    public static C199422130y getDescriptor() {
        return (C199422130y) ListProtector.get(C131Y.getDescriptor().LJIJI(), 1);
    }

    public final C199422130y getDescriptorForType() {
        return getDescriptor();
    }

    public final C199423130z getValueDescriptor() {
        return (C199423130z) ListProtector.get(getDescriptor().LJIJ(), ordinal());
    }

    public static InterfaceC19922212xA<EnumC199425131b> internalGetValueMap() {
        return LLILLJJLI;
    }

    @Override // X.InterfaceC19931112yb
    public final int getNumber() {
        return this.LL;
    }

    public static EnumC199425131b forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return JS_NUMBER;
            }
            return JS_STRING;
        }
        return JS_NORMAL;
    }

    public static EnumC199425131b valueOf(C199423130z c199423130z) {
        if (c199423130z.LLILZLL == getDescriptor()) {
            return LLILLL[c199423130z.LLILLJJLI];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }

    public static EnumC199425131b valueOf(String str) {
        return (EnumC199425131b) C08FF.LIZ(EnumC199425131b.class, str);
    }

    public static EnumC199425131b valueOf(int i) {
        return forNumber(i);
    }

    EnumC199425131b(int i) {
        this.LL = i;
    }
}
