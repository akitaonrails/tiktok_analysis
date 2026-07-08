package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qD0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1541200qD0 {
    public static final EnumC1541200qD0 CACHE;
    public static final /* synthetic */ EnumC1541200qD0[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1541200qD0 REQUEST;

    public static InterfaceC2044707zh<EnumC1541200qD0> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1541200qD0 enumC1541200qD0 = new EnumC1541200qD0("REQUEST", 0);
        REQUEST = enumC1541200qD0;
        EnumC1541200qD0 enumC1541200qD02 = new EnumC1541200qD0("CACHE", 1);
        CACHE = enumC1541200qD02;
        EnumC1541200qD0[] enumC1541200qD0Arr = {enumC1541200qD0, enumC1541200qD02};
        LL = enumC1541200qD0Arr;
        LLILLJJLI = new C2254308sP(enumC1541200qD0Arr);
    }

    public static EnumC1541200qD0[] values() {
        return (EnumC1541200qD0[]) LL.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C1541210qD1.LIZ[ordinal()];
        if (i == 1) {
            return "hit_cache";
        }
        if (i == 2) {
            return "hit_request";
        }
        throw new C1954807lC();
    }

    public static EnumC1541200qD0 valueOf(String str) {
        return (EnumC1541200qD0) C08FF.LIZ(EnumC1541200qD0.class, str);
    }

    public EnumC1541200qD0(String str, int i) {
    }
}
