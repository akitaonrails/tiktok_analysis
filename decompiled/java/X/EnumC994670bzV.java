package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bzV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994670bzV {
    public static final EnumC994670bzV INVALID;
    public static final /* synthetic */ EnumC994670bzV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC994670bzV NORMAL;

    public static InterfaceC2044707zh<EnumC994670bzV> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC994670bzV enumC994670bzV = new EnumC994670bzV("NORMAL", 0);
        NORMAL = enumC994670bzV;
        EnumC994670bzV enumC994670bzV2 = new EnumC994670bzV("INVALID", 1);
        INVALID = enumC994670bzV2;
        EnumC994670bzV[] enumC994670bzVArr = {enumC994670bzV, enumC994670bzV2};
        LL = enumC994670bzVArr;
        LLILLJJLI = new C2254308sP(enumC994670bzVArr);
    }

    public static EnumC994670bzV[] values() {
        return (EnumC994670bzV[]) LL.clone();
    }

    public static EnumC994670bzV valueOf(String str) {
        return (EnumC994670bzV) C08FF.LIZ(EnumC994670bzV.class, str);
    }

    public EnumC994670bzV(String str, int i) {
    }
}
