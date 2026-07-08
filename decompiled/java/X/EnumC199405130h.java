package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: X.130h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public enum EnumC199405130h implements InterfaceC19935612zK {
    VISIBILITY_UNSET(0),
    VISIBILITY_LOCAL(1),
    VISIBILITY_EXPORT(2);

    public static final C199406130i LLILLJJLI;
    public static final EnumC199405130h[] LLILLL;
    public final int LL;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.130i] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "SymbolVisibility");
        LLILLJJLI = new InterfaceC19922212xA<EnumC199405130h>() { // from class: X.130i
            @Override // X.InterfaceC19922212xA
            public final InterfaceC19931112yb LIZJ(int i) {
                return EnumC199405130h.forNumber(i);
            }
        };
        LLILLL = values();
    }

    public static C199422130y getDescriptor() {
        return (C199422130y) ListProtector.get(Collections.unmodifiableList(Arrays.asList(C131K.LJJLIIIJJI.LLILZ)), 1);
    }

    public final C199422130y getDescriptorForType() {
        return getDescriptor();
    }

    public final C199423130z getValueDescriptor() {
        return (C199423130z) ListProtector.get(getDescriptor().LJIJ(), ordinal());
    }

    public static InterfaceC19922212xA<EnumC199405130h> internalGetValueMap() {
        return LLILLJJLI;
    }

    @Override // X.InterfaceC19931112yb
    public final int getNumber() {
        return this.LL;
    }

    public static EnumC199405130h forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return VISIBILITY_EXPORT;
            }
            return VISIBILITY_LOCAL;
        }
        return VISIBILITY_UNSET;
    }

    public static EnumC199405130h valueOf(C199423130z c199423130z) {
        if (c199423130z.LLILZLL == getDescriptor()) {
            return LLILLL[c199423130z.LLILLJJLI];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }

    public static EnumC199405130h valueOf(String str) {
        return (EnumC199405130h) C08FF.LIZ(EnumC199405130h.class, str);
    }

    public static EnumC199405130h valueOf(int i) {
        return forNumber(i);
    }

    EnumC199405130h(int i) {
        this.LL = i;
    }
}
