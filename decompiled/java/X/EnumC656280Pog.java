package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Pog, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC656280Pog {
    public static final /* synthetic */ EnumC656280Pog[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC656280Pog PHOTO;
    public static final EnumC656280Pog SHOP_BAG;

    public static InterfaceC2044707zh<EnumC656280Pog> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC656280Pog enumC656280Pog = new EnumC656280Pog("PHOTO", 0);
        PHOTO = enumC656280Pog;
        EnumC656280Pog enumC656280Pog2 = new EnumC656280Pog("SHOP_BAG", 1);
        SHOP_BAG = enumC656280Pog2;
        EnumC656280Pog[] enumC656280PogArr = {enumC656280Pog, enumC656280Pog2};
        LL = enumC656280PogArr;
        LLILLJJLI = new C2254308sP(enumC656280PogArr);
    }

    public static EnumC656280Pog[] values() {
        return (EnumC656280Pog[]) LL.clone();
    }

    public static EnumC656280Pog valueOf(String str) {
        return (EnumC656280Pog) C08FF.LIZ(EnumC656280Pog.class, str);
    }

    public EnumC656280Pog(String str, int i) {
    }
}
