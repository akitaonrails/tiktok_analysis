package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Pza, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC663040Pza {
    public static final EnumC663040Pza CLICK_SHOOT;
    public static final EnumC663040Pza CLICK_TOOL;
    public static final /* synthetic */ EnumC663040Pza[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC663040Pza NONE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC663040Pza> getEntries() {
        return LLILLL;
    }

    static {
        EnumC663040Pza enumC663040Pza = new EnumC663040Pza("NONE", 0, "");
        NONE = enumC663040Pza;
        EnumC663040Pza enumC663040Pza2 = new EnumC663040Pza("CLICK_SHOOT", 1, "click_shoot");
        CLICK_SHOOT = enumC663040Pza2;
        EnumC663040Pza enumC663040Pza3 = new EnumC663040Pza("CLICK_TOOL", 2, "click_tool");
        CLICK_TOOL = enumC663040Pza3;
        EnumC663040Pza[] enumC663040PzaArr = {enumC663040Pza, enumC663040Pza2, enumC663040Pza3};
        LLILLJJLI = enumC663040PzaArr;
        LLILLL = new C2254308sP(enumC663040PzaArr);
    }

    public static EnumC663040Pza[] values() {
        return (EnumC663040Pza[]) LLILLJJLI.clone();
    }

    public final String getMob() {
        return this.LL;
    }

    public static EnumC663040Pza valueOf(String str) {
        return (EnumC663040Pza) C08FF.LIZ(EnumC663040Pza.class, str);
    }

    public EnumC663040Pza(String str, int i, String str2) {
        this.LL = str2;
    }
}
