package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bzB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994470bzB {
    public static final EnumC994470bzB ANIMATE;
    public static final EnumC994470bzB HIDE;
    public static final /* synthetic */ EnumC994470bzB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC994470bzB SHOW;

    public static InterfaceC2044707zh<EnumC994470bzB> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC994470bzB enumC994470bzB = new EnumC994470bzB("HIDE", 0);
        HIDE = enumC994470bzB;
        EnumC994470bzB enumC994470bzB2 = new EnumC994470bzB("ANIMATE", 1);
        ANIMATE = enumC994470bzB2;
        EnumC994470bzB enumC994470bzB3 = new EnumC994470bzB("SHOW", 2);
        SHOW = enumC994470bzB3;
        EnumC994470bzB[] enumC994470bzBArr = {enumC994470bzB, enumC994470bzB2, enumC994470bzB3};
        LL = enumC994470bzBArr;
        LLILLJJLI = new C2254308sP(enumC994470bzBArr);
    }

    public static EnumC994470bzB[] values() {
        return (EnumC994470bzB[]) LL.clone();
    }

    public static EnumC994470bzB valueOf(String str) {
        return (EnumC994470bzB) C08FF.LIZ(EnumC994470bzB.class, str);
    }

    public EnumC994470bzB(String str, int i) {
    }
}
