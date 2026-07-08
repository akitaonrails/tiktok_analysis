package X;

import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15hn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20591315hn {
    public static final EnumC20591315hn ALL;
    public static final C20592215hw Companion;
    public static final EnumC20591315hn HORIZONTAL;
    public static final /* synthetic */ EnumC20591315hn[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20591315hn NONE;
    public static final EnumC20591315hn VERTICAL;
    public final int LL;

    public static final int and(int i, int i2) {
        Companion.getClass();
        return i & i2;
    }

    public static InterfaceC2044707zh<EnumC20591315hn> getEntries() {
        return LLILLL;
    }

    public static final int or(int i, int i2) {
        Companion.getClass();
        return i | i2;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.15hw] */
    static {
        EnumC20591315hn enumC20591315hn = new EnumC20591315hn("NONE", 0, 0);
        NONE = enumC20591315hn;
        EnumC20591315hn enumC20591315hn2 = new EnumC20591315hn("HORIZONTAL", 1, 1);
        HORIZONTAL = enumC20591315hn2;
        EnumC20591315hn enumC20591315hn3 = new EnumC20591315hn("VERTICAL", 2, 2);
        VERTICAL = enumC20591315hn3;
        EnumC20591315hn enumC20591315hn4 = new EnumC20591315hn("ALL", 3, 3);
        ALL = enumC20591315hn4;
        EnumC20591315hn[] enumC20591315hnArr = {enumC20591315hn, enumC20591315hn2, enumC20591315hn3, enumC20591315hn4};
        LLILLJJLI = enumC20591315hnArr;
        LLILLL = new C2254308sP(enumC20591315hnArr);
        Companion = new Object() { // from class: X.15hw
        };
    }

    public static EnumC20591315hn[] values() {
        return (EnumC20591315hn[]) LLILLJJLI.clone();
    }

    public final EnumC20591315hn inv() {
        EnumC20591315hn next;
        int i = ~this.LL;
        Iterator<EnumC20591315hn> it2 = getEntries().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next.LL == i) {
                break;
            }
        }
        EnumC20591315hn enumC20591315hn = next;
        return enumC20591315hn == null ? NONE : enumC20591315hn;
    }

    public final int getValue() {
        return this.LL;
    }

    public static final EnumC20591315hn fromValue(int i) {
        EnumC20591315hn next;
        Companion.getClass();
        Iterator<EnumC20591315hn> it2 = getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getValue() == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        EnumC20591315hn enumC20591315hn = next;
        if (enumC20591315hn == null) {
            return ALL;
        }
        return enumC20591315hn;
    }

    public static EnumC20591315hn valueOf(String str) {
        return (EnumC20591315hn) C08FF.LIZ(EnumC20591315hn.class, str);
    }

    public final EnumC20591315hn and(EnumC20591315hn enumC20591315hn) {
        EnumC20591315hn next;
        int i = enumC20591315hn.LL & this.LL;
        Iterator<EnumC20591315hn> it2 = getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LL == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        EnumC20591315hn enumC20591315hn2 = next;
        if (enumC20591315hn2 == null) {
            return NONE;
        }
        return enumC20591315hn2;
    }

    public final boolean contains(EnumC20591315hn enumC20591315hn) {
        int i = this.LL;
        int i2 = enumC20591315hn.LL;
        if ((i & i2) == i2) {
            return true;
        }
        return false;
    }

    public final boolean hasIntersection(EnumC20591315hn enumC20591315hn) {
        if ((enumC20591315hn.LL & this.LL) != 0) {
            return true;
        }
        return false;
    }

    public final EnumC20591315hn or(EnumC20591315hn enumC20591315hn) {
        EnumC20591315hn next;
        int i = enumC20591315hn.LL | this.LL;
        Iterator<EnumC20591315hn> it2 = getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LL == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        EnumC20591315hn enumC20591315hn2 = next;
        if (enumC20591315hn2 == null) {
            return ALL;
        }
        return enumC20591315hn2;
    }

    public final EnumC20591315hn xor(EnumC20591315hn enumC20591315hn) {
        EnumC20591315hn next;
        int i = enumC20591315hn.LL ^ this.LL;
        Iterator<EnumC20591315hn> it2 = getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LL == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        EnumC20591315hn enumC20591315hn2 = next;
        if (enumC20591315hn2 == null) {
            return NONE;
        }
        return enumC20591315hn2;
    }

    public EnumC20591315hn(String str, int i, int i2) {
        this.LL = i2;
    }
}
