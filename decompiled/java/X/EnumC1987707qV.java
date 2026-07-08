package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1987707qV {
    public static final EnumC1987707qV BY_ITEM_TYPE;
    public static final /* synthetic */ EnumC1987707qV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1987707qV> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1987707qV enumC1987707qV = new EnumC1987707qV();
        BY_ITEM_TYPE = enumC1987707qV;
        EnumC1987707qV[] enumC1987707qVArr = {enumC1987707qV};
        LL = enumC1987707qVArr;
        LLILLJJLI = new C2254308sP(enumC1987707qVArr);
    }

    public static EnumC1987707qV[] values() {
        return (EnumC1987707qV[]) LL.clone();
    }

    public static EnumC1987707qV valueOf(String str) {
        return (EnumC1987707qV) C08FF.LIZ(EnumC1987707qV.class, str);
    }
}
