package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hP2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1202700hP2 {
    public static final /* synthetic */ EnumC1202700hP2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1202700hP2 MEMORY_CACHE;
    public static final EnumC1202700hP2 NETWORK;
    public static final EnumC1202700hP2 PERSISTENT;
    public static final EnumC1202700hP2 SLASH_LITE_PRELOAD;

    public static InterfaceC2044707zh<EnumC1202700hP2> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1202700hP2 enumC1202700hP2 = new EnumC1202700hP2("SLASH_LITE_PRELOAD", 0);
        SLASH_LITE_PRELOAD = enumC1202700hP2;
        EnumC1202700hP2 enumC1202700hP22 = new EnumC1202700hP2("MEMORY_CACHE", 1);
        MEMORY_CACHE = enumC1202700hP22;
        EnumC1202700hP2 enumC1202700hP23 = new EnumC1202700hP2("NETWORK", 2);
        NETWORK = enumC1202700hP23;
        EnumC1202700hP2 enumC1202700hP24 = new EnumC1202700hP2("PERSISTENT", 3);
        PERSISTENT = enumC1202700hP24;
        EnumC1202700hP2[] enumC1202700hP2Arr = {enumC1202700hP2, enumC1202700hP22, enumC1202700hP23, enumC1202700hP24};
        LL = enumC1202700hP2Arr;
        LLILLJJLI = new C2254308sP(enumC1202700hP2Arr);
    }

    public static EnumC1202700hP2[] values() {
        return (EnumC1202700hP2[]) LL.clone();
    }

    public final int getPriority() {
        int i = C1202710hP3.LIZ[ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        throw new C1954807lC();
                    }
                }
            }
        }
        return i2;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C1202710hP3.LIZ[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Network" : "Persistent" : "memory_cache" : "slash_lite_preload";
    }

    public static EnumC1202700hP2 valueOf(String str) {
        return (EnumC1202700hP2) C08FF.LIZ(EnumC1202700hP2.class, str);
    }

    public EnumC1202700hP2(String str, int i) {
    }
}
