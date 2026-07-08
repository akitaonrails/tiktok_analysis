package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0kZD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1324330kZD {
    public static final EnumC1324330kZD Horizontal;
    public static final /* synthetic */ EnumC1324330kZD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1324330kZD Vertical;

    public static InterfaceC2044707zh<EnumC1324330kZD> getEntries() {
        return LLILLJJLI;
    }

    public static EnumC1324330kZD valueOf(String str) {
        return (EnumC1324330kZD) C08FF.LIZ(EnumC1324330kZD.class, str);
    }

    public static EnumC1324330kZD[] values() {
        return (EnumC1324330kZD[]) LL.clone();
    }

    static {
        EnumC1324330kZD enumC1324330kZD = new EnumC1324330kZD("Horizontal", 0);
        Horizontal = enumC1324330kZD;
        EnumC1324330kZD enumC1324330kZD2 = new EnumC1324330kZD("Vertical", 1);
        Vertical = enumC1324330kZD2;
        EnumC1324330kZD[] enumC1324330kZDArr = {enumC1324330kZD, enumC1324330kZD2};
        LL = enumC1324330kZDArr;
        LLILLJJLI = new C2254308sP(enumC1324330kZDArr);
    }

    public EnumC1324330kZD(String str, int i) {
    }
}
