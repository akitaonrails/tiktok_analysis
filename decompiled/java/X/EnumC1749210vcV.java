package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vcV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1749210vcV {
    public static final EnumC1749210vcV FOOTER;
    public static final EnumC1749210vcV HEADER;
    public static final /* synthetic */ EnumC1749210vcV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1749210vcV NONE;

    public static InterfaceC2044707zh<EnumC1749210vcV> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1749210vcV enumC1749210vcV = new EnumC1749210vcV("NONE", 0);
        NONE = enumC1749210vcV;
        EnumC1749210vcV enumC1749210vcV2 = new EnumC1749210vcV("FOOTER", 1);
        FOOTER = enumC1749210vcV2;
        EnumC1749210vcV enumC1749210vcV3 = new EnumC1749210vcV("HEADER", 2);
        HEADER = enumC1749210vcV3;
        EnumC1749210vcV[] enumC1749210vcVArr = {enumC1749210vcV, enumC1749210vcV2, enumC1749210vcV3};
        LL = enumC1749210vcVArr;
        LLILLJJLI = new C2254308sP(enumC1749210vcVArr);
    }

    public static EnumC1749210vcV[] values() {
        return (EnumC1749210vcV[]) LL.clone();
    }

    public static EnumC1749210vcV valueOf(String str) {
        return (EnumC1749210vcV) C08FF.LIZ(EnumC1749210vcV.class, str);
    }

    public EnumC1749210vcV(String str, int i) {
    }
}
