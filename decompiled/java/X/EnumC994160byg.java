package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0byg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994160byg {
    public static final EnumC994160byg ANCHOR;
    public static final /* synthetic */ EnumC994160byg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC994160byg PLATFORM;

    public static InterfaceC2044707zh<EnumC994160byg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC994160byg enumC994160byg = new EnumC994160byg("ANCHOR", 0);
        ANCHOR = enumC994160byg;
        EnumC994160byg enumC994160byg2 = new EnumC994160byg("PLATFORM", 1);
        PLATFORM = enumC994160byg2;
        EnumC994160byg[] enumC994160bygArr = {enumC994160byg, enumC994160byg2};
        LL = enumC994160bygArr;
        LLILLJJLI = new C2254308sP(enumC994160bygArr);
    }

    public static EnumC994160byg[] values() {
        return (EnumC994160byg[]) LL.clone();
    }

    public static EnumC994160byg valueOf(String str) {
        return (EnumC994160byg) C08FF.LIZ(EnumC994160byg.class, str);
    }

    public EnumC994160byg(String str, int i) {
    }
}
