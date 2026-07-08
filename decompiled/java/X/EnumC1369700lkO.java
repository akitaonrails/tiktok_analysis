package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lkO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1369700lkO {
    public static final EnumC1369700lkO BOTTOM;
    public static final EnumC1369700lkO FLOATING_BOTTOM;
    public static final /* synthetic */ EnumC1369700lkO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1369700lkO MIDDLE;
    public static final EnumC1369700lkO TOP;

    public static InterfaceC2044707zh<EnumC1369700lkO> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1369700lkO enumC1369700lkO = new EnumC1369700lkO("TOP", 0);
        TOP = enumC1369700lkO;
        EnumC1369700lkO enumC1369700lkO2 = new EnumC1369700lkO("MIDDLE", 1);
        MIDDLE = enumC1369700lkO2;
        EnumC1369700lkO enumC1369700lkO3 = new EnumC1369700lkO("BOTTOM", 2);
        BOTTOM = enumC1369700lkO3;
        EnumC1369700lkO enumC1369700lkO4 = new EnumC1369700lkO("FLOATING_BOTTOM", 3);
        FLOATING_BOTTOM = enumC1369700lkO4;
        EnumC1369700lkO[] enumC1369700lkOArr = {enumC1369700lkO, enumC1369700lkO2, enumC1369700lkO3, enumC1369700lkO4};
        LL = enumC1369700lkOArr;
        LLILLJJLI = new C2254308sP(enumC1369700lkOArr);
    }

    public static EnumC1369700lkO[] values() {
        return (EnumC1369700lkO[]) LL.clone();
    }

    public static EnumC1369700lkO valueOf(String str) {
        return (EnumC1369700lkO) C08FF.LIZ(EnumC1369700lkO.class, str);
    }

    public EnumC1369700lkO(String str, int i) {
    }
}
