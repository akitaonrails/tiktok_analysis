package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05nt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1461905nt {
    public static final EnumC1461905nt AT_MOST_DB;
    public static final /* synthetic */ EnumC1461905nt[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1461905nt ONLY_CACHE;

    public static InterfaceC2044707zh<EnumC1461905nt> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1461905nt enumC1461905nt = new EnumC1461905nt("ONLY_CACHE", 0);
        ONLY_CACHE = enumC1461905nt;
        EnumC1461905nt enumC1461905nt2 = new EnumC1461905nt("AT_MOST_DB", 1);
        AT_MOST_DB = enumC1461905nt2;
        EnumC1461905nt[] enumC1461905ntArr = {enumC1461905nt, enumC1461905nt2};
        LL = enumC1461905ntArr;
        LLILLJJLI = new C2254308sP(enumC1461905ntArr);
    }

    public static EnumC1461905nt[] values() {
        return (EnumC1461905nt[]) LL.clone();
    }

    public static EnumC1461905nt valueOf(String str) {
        return (EnumC1461905nt) C08FF.LIZ(EnumC1461905nt.class, str);
    }

    public EnumC1461905nt(String str, int i) {
    }
}
