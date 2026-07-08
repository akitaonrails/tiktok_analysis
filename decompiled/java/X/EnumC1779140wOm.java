package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wOm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779140wOm {
    public static final EnumC1779140wOm INITIAL;
    public static final /* synthetic */ EnumC1779140wOm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1779140wOm STICKER;

    public static InterfaceC2044707zh<EnumC1779140wOm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1779140wOm enumC1779140wOm = new EnumC1779140wOm("INITIAL", 0);
        INITIAL = enumC1779140wOm;
        EnumC1779140wOm enumC1779140wOm2 = new EnumC1779140wOm("STICKER", 1);
        STICKER = enumC1779140wOm2;
        EnumC1779140wOm[] enumC1779140wOmArr = {enumC1779140wOm, enumC1779140wOm2};
        LL = enumC1779140wOmArr;
        LLILLJJLI = new C2254308sP(enumC1779140wOmArr);
    }

    public static EnumC1779140wOm[] values() {
        return (EnumC1779140wOm[]) LL.clone();
    }

    public static EnumC1779140wOm valueOf(String str) {
        return (EnumC1779140wOm) C08FF.LIZ(EnumC1779140wOm.class, str);
    }

    public EnumC1779140wOm(String str, int i) {
    }
}
