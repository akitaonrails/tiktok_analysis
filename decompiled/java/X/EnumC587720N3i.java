package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N3i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC587720N3i {
    public static final EnumC587720N3i COLD_CACHE;
    public static final EnumC587720N3i GOLDEN_CACHE;
    public static final /* synthetic */ EnumC587720N3i[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC587720N3i> getEntries() {
        return LLILLL;
    }

    static {
        EnumC587720N3i enumC587720N3i = new EnumC587720N3i("COLD_CACHE", 0, 0);
        COLD_CACHE = enumC587720N3i;
        EnumC587720N3i enumC587720N3i2 = new EnumC587720N3i("GOLDEN_CACHE", 1, 1);
        GOLDEN_CACHE = enumC587720N3i2;
        EnumC587720N3i[] enumC587720N3iArr = {enumC587720N3i, enumC587720N3i2};
        LLILLJJLI = enumC587720N3iArr;
        LLILLL = new C2254308sP(enumC587720N3iArr);
    }

    public static EnumC587720N3i[] values() {
        return (EnumC587720N3i[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC587720N3i valueOf(String str) {
        return (EnumC587720N3i) C08FF.LIZ(EnumC587720N3i.class, str);
    }

    public EnumC587720N3i(String str, int i, int i2) {
        this.LL = i2;
    }
}
