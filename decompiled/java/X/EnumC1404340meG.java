package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0meG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1404340meG {
    public static final EnumC1404340meG BEAUTY;
    public static final EnumC1404340meG FILTER;
    public static final /* synthetic */ EnumC1404340meG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1404340meG> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1404340meG enumC1404340meG = new EnumC1404340meG("BEAUTY", 0, 10000);
        BEAUTY = enumC1404340meG;
        EnumC1404340meG enumC1404340meG2 = new EnumC1404340meG("FILTER", 1, 20000);
        FILTER = enumC1404340meG2;
        EnumC1404340meG[] enumC1404340meGArr = {enumC1404340meG, enumC1404340meG2};
        LLILLJJLI = enumC1404340meGArr;
        LLILLL = new C2254308sP(enumC1404340meGArr);
    }

    public static EnumC1404340meG[] values() {
        return (EnumC1404340meG[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1404340meG valueOf(String str) {
        return (EnumC1404340meG) C08FF.LIZ(EnumC1404340meG.class, str);
    }

    public EnumC1404340meG(String str, int i, int i2) {
        this.LL = i2;
    }
}
