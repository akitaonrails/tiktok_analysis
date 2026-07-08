package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c0j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC995430c0j {
    public static final EnumC995430c0j CONTAINER_LOCATION_ACCESSORY;
    public static final EnumC995430c0j CONTAINER_LOCATION_BOTTOM;
    public static final EnumC995430c0j CONTAINER_LOCATION_UNKNOWN;
    public static final /* synthetic */ EnumC995430c0j[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC995430c0j> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC995430c0j enumC995430c0j = new EnumC995430c0j("CONTAINER_LOCATION_UNKNOWN", 0);
        CONTAINER_LOCATION_UNKNOWN = enumC995430c0j;
        EnumC995430c0j enumC995430c0j2 = new EnumC995430c0j("CONTAINER_LOCATION_BOTTOM", 1);
        CONTAINER_LOCATION_BOTTOM = enumC995430c0j2;
        EnumC995430c0j enumC995430c0j3 = new EnumC995430c0j("CONTAINER_LOCATION_ACCESSORY", 2);
        CONTAINER_LOCATION_ACCESSORY = enumC995430c0j3;
        EnumC995430c0j[] enumC995430c0jArr = {enumC995430c0j, enumC995430c0j2, enumC995430c0j3};
        LL = enumC995430c0jArr;
        LLILLJJLI = new C2254308sP(enumC995430c0jArr);
    }

    public static EnumC995430c0j[] values() {
        return (EnumC995430c0j[]) LL.clone();
    }

    public static EnumC995430c0j valueOf(String str) {
        return (EnumC995430c0j) C08FF.LIZ(EnumC995430c0j.class, str);
    }

    public EnumC995430c0j(String str, int i) {
    }
}
