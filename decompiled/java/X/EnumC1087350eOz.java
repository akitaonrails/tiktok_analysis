package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eOz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1087350eOz {
    public static final EnumC1087350eOz DRAGGING;
    public static final EnumC1087350eOz IDLE;
    public static final /* synthetic */ EnumC1087350eOz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1087350eOz SETTLING;

    public static InterfaceC2044707zh<EnumC1087350eOz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1087350eOz enumC1087350eOz = new EnumC1087350eOz("IDLE", 0);
        IDLE = enumC1087350eOz;
        EnumC1087350eOz enumC1087350eOz2 = new EnumC1087350eOz("DRAGGING", 1);
        DRAGGING = enumC1087350eOz2;
        EnumC1087350eOz enumC1087350eOz3 = new EnumC1087350eOz("SETTLING", 2);
        SETTLING = enumC1087350eOz3;
        EnumC1087350eOz[] enumC1087350eOzArr = {enumC1087350eOz, enumC1087350eOz2, enumC1087350eOz3};
        LL = enumC1087350eOzArr;
        LLILLJJLI = new C2254308sP(enumC1087350eOzArr);
    }

    public static EnumC1087350eOz[] values() {
        return (EnumC1087350eOz[]) LL.clone();
    }

    public static EnumC1087350eOz valueOf(String str) {
        return (EnumC1087350eOz) C08FF.LIZ(EnumC1087350eOz.class, str);
    }

    public EnumC1087350eOz(String str, int i) {
    }
}
