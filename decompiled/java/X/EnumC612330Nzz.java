package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Nzz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC612330Nzz {
    public static final EnumC612330Nzz BEFORE_LIVE;
    public static final EnumC612330Nzz DURING_LIVE;
    public static final /* synthetic */ EnumC612330Nzz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC612330Nzz> getEntries() {
        return LLILLL;
    }

    static {
        EnumC612330Nzz enumC612330Nzz = new EnumC612330Nzz("BEFORE_LIVE", 0, "before_live");
        BEFORE_LIVE = enumC612330Nzz;
        EnumC612330Nzz enumC612330Nzz2 = new EnumC612330Nzz("DURING_LIVE", 1, "during_live");
        DURING_LIVE = enumC612330Nzz2;
        EnumC612330Nzz[] enumC612330NzzArr = {enumC612330Nzz, enumC612330Nzz2};
        LLILLJJLI = enumC612330NzzArr;
        LLILLL = new C2254308sP(enumC612330NzzArr);
    }

    public static EnumC612330Nzz[] values() {
        return (EnumC612330Nzz[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC612330Nzz valueOf(String str) {
        return (EnumC612330Nzz) C08FF.LIZ(EnumC612330Nzz.class, str);
    }

    public EnumC612330Nzz(String str, int i, String str2) {
        this.LL = str2;
    }
}
