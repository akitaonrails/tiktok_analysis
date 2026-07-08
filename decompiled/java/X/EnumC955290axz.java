package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0axz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC955290axz {
    public static final EnumC955290axz INIT_STATE;
    public static final EnumC955290axz LINKED_STATE;
    public static final /* synthetic */ EnumC955290axz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC955290axz PREPARING_STATE;

    public static InterfaceC2044707zh<EnumC955290axz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC955290axz enumC955290axz = new EnumC955290axz("INIT_STATE", 0);
        INIT_STATE = enumC955290axz;
        EnumC955290axz enumC955290axz2 = new EnumC955290axz("PREPARING_STATE", 1);
        PREPARING_STATE = enumC955290axz2;
        EnumC955290axz enumC955290axz3 = new EnumC955290axz("LINKED_STATE", 2);
        LINKED_STATE = enumC955290axz3;
        EnumC955290axz[] enumC955290axzArr = {enumC955290axz, enumC955290axz2, enumC955290axz3};
        LL = enumC955290axzArr;
        LLILLJJLI = new C2254308sP(enumC955290axzArr);
    }

    public static EnumC955290axz[] values() {
        return (EnumC955290axz[]) LL.clone();
    }

    public static EnumC955290axz valueOf(String str) {
        return (EnumC955290axz) C08FF.LIZ(EnumC955290axz.class, str);
    }

    public EnumC955290axz(String str, int i) {
    }
}
