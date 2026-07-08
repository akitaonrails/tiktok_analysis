package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PGk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC642080PGk {
    public static final /* synthetic */ EnumC642080PGk[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC642080PGk POI;
    public static final EnumC642080PGk SEARCH;

    public static InterfaceC2044707zh<EnumC642080PGk> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC642080PGk enumC642080PGk = new EnumC642080PGk("POI", 0);
        POI = enumC642080PGk;
        EnumC642080PGk enumC642080PGk2 = new EnumC642080PGk("SEARCH", 1);
        SEARCH = enumC642080PGk2;
        EnumC642080PGk[] enumC642080PGkArr = {enumC642080PGk, enumC642080PGk2};
        LL = enumC642080PGkArr;
        LLILLJJLI = new C2254308sP(enumC642080PGkArr);
    }

    public static EnumC642080PGk[] values() {
        return (EnumC642080PGk[]) LL.clone();
    }

    public static EnumC642080PGk valueOf(String str) {
        return (EnumC642080PGk) C08FF.LIZ(EnumC642080PGk.class, str);
    }

    public EnumC642080PGk(String str, int i) {
    }
}
