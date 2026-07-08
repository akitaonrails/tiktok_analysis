package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bzT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994650bzT {
    public static final /* synthetic */ EnumC994650bzT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC994650bzT NORMAL;
    public static final EnumC994650bzT RIGHT_ARROW;

    public static InterfaceC2044707zh<EnumC994650bzT> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC994650bzT enumC994650bzT = new EnumC994650bzT("NORMAL", 0);
        NORMAL = enumC994650bzT;
        EnumC994650bzT enumC994650bzT2 = new EnumC994650bzT("RIGHT_ARROW", 1);
        RIGHT_ARROW = enumC994650bzT2;
        EnumC994650bzT[] enumC994650bzTArr = {enumC994650bzT, enumC994650bzT2};
        LL = enumC994650bzTArr;
        LLILLJJLI = new C2254308sP(enumC994650bzTArr);
    }

    public static EnumC994650bzT[] values() {
        return (EnumC994650bzT[]) LL.clone();
    }

    public final boolean isRightArrow() {
        return this == RIGHT_ARROW;
    }

    public static EnumC994650bzT valueOf(String str) {
        return (EnumC994650bzT) C08FF.LIZ(EnumC994650bzT.class, str);
    }

    public EnumC994650bzT(String str, int i) {
    }
}
