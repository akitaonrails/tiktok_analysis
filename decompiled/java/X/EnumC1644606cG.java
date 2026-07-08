package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06cG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1644606cG {
    public static final EnumC1644606cG GROUP;
    public static final /* synthetic */ EnumC1644606cG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1644606cG SINGLE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1644606cG> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1644606cG enumC1644606cG = new EnumC1644606cG("SINGLE", 0, "private");
        SINGLE = enumC1644606cG;
        EnumC1644606cG enumC1644606cG2 = new EnumC1644606cG("GROUP", 1, "group");
        GROUP = enumC1644606cG2;
        EnumC1644606cG[] enumC1644606cGArr = {enumC1644606cG, enumC1644606cG2};
        LLILLJJLI = enumC1644606cGArr;
        LLILLL = new C2254308sP(enumC1644606cGArr);
    }

    public static EnumC1644606cG[] values() {
        return (EnumC1644606cG[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1644606cG valueOf(String str) {
        return (EnumC1644606cG) C08FF.LIZ(EnumC1644606cG.class, str);
    }

    public EnumC1644606cG(String str, int i, String str2) {
        this.LL = str2;
    }
}
