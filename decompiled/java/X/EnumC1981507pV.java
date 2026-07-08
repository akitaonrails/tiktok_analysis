package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07pV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1981507pV {
    public static final EnumC1981507pV DOUBLE_COLUMN;
    public static final /* synthetic */ EnumC1981507pV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1981507pV TRIPLE_COLUMN;

    public static InterfaceC2044707zh<EnumC1981507pV> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1981507pV enumC1981507pV = new EnumC1981507pV("DOUBLE_COLUMN", 0);
        DOUBLE_COLUMN = enumC1981507pV;
        EnumC1981507pV enumC1981507pV2 = new EnumC1981507pV("TRIPLE_COLUMN", 1);
        TRIPLE_COLUMN = enumC1981507pV2;
        EnumC1981507pV[] enumC1981507pVArr = {enumC1981507pV, enumC1981507pV2};
        LL = enumC1981507pVArr;
        LLILLJJLI = new C2254308sP(enumC1981507pVArr);
    }

    public static EnumC1981507pV[] values() {
        return (EnumC1981507pV[]) LL.clone();
    }

    public static EnumC1981507pV valueOf(String str) {
        return (EnumC1981507pV) C08FF.LIZ(EnumC1981507pV.class, str);
    }

    public EnumC1981507pV(String str, int i) {
    }
}
