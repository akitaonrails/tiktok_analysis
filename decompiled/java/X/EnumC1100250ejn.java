package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ejn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1100250ejn {
    public static final EnumC1100250ejn EFFECT;
    public static final /* synthetic */ EnumC1100250ejn[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1100250ejn MESSAGE;
    public static final EnumC1100250ejn PRIVILEGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1100250ejn> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1100250ejn enumC1100250ejn = new EnumC1100250ejn("MESSAGE", 0, "message");
        MESSAGE = enumC1100250ejn;
        EnumC1100250ejn enumC1100250ejn2 = new EnumC1100250ejn("PRIVILEGE", 1, "privilege");
        PRIVILEGE = enumC1100250ejn2;
        EnumC1100250ejn enumC1100250ejn3 = new EnumC1100250ejn("EFFECT", 2, "effect");
        EFFECT = enumC1100250ejn3;
        EnumC1100250ejn[] enumC1100250ejnArr = {enumC1100250ejn, enumC1100250ejn2, enumC1100250ejn3};
        LLILLJJLI = enumC1100250ejnArr;
        LLILLL = new C2254308sP(enumC1100250ejnArr);
    }

    public static EnumC1100250ejn[] values() {
        return (EnumC1100250ejn[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static EnumC1100250ejn valueOf(String str) {
        return (EnumC1100250ejn) C08FF.LIZ(EnumC1100250ejn.class, str);
    }

    public EnumC1100250ejn(String str, int i, String str2) {
        this.LL = str2;
    }
}
