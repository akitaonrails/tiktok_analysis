package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06Gb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1578706Gb {
    public static final C06G2 Companion;
    public static final EnumC1578706Gb GONE;
    public static final EnumC1578706Gb GREY;
    public static final /* synthetic */ EnumC1578706Gb[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1578706Gb ORANGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1578706Gb> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1578706Gb enumC1578706Gb = new EnumC1578706Gb("GONE", 0, "gone");
        GONE = enumC1578706Gb;
        EnumC1578706Gb enumC1578706Gb2 = new EnumC1578706Gb("ORANGE", 1, "orange");
        ORANGE = enumC1578706Gb2;
        EnumC1578706Gb enumC1578706Gb3 = new EnumC1578706Gb("GREY", 2, "grey");
        GREY = enumC1578706Gb3;
        EnumC1578706Gb[] enumC1578706GbArr = {enumC1578706Gb, enumC1578706Gb2, enumC1578706Gb3};
        LLILLJJLI = enumC1578706GbArr;
        LLILLL = new C2254308sP(enumC1578706GbArr);
        Companion = new C06G2();
    }

    public static EnumC1578706Gb[] values() {
        return (EnumC1578706Gb[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1578706Gb valueOf(String str) {
        return (EnumC1578706Gb) C08FF.LIZ(EnumC1578706Gb.class, str);
    }

    public EnumC1578706Gb(String str, int i, String str2) {
        this.LL = str2;
    }
}
