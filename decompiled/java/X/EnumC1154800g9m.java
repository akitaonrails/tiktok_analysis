package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g9m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154800g9m {
    public static final EnumC1154800g9m BUBBLE;
    public static final /* synthetic */ EnumC1154800g9m[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1154800g9m NATURE;
    public static final EnumC1154800g9m VSA;

    public static InterfaceC2044707zh<EnumC1154800g9m> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1154800g9m enumC1154800g9m = new EnumC1154800g9m("NATURE", 0);
        NATURE = enumC1154800g9m;
        EnumC1154800g9m enumC1154800g9m2 = new EnumC1154800g9m("BUBBLE", 1);
        BUBBLE = enumC1154800g9m2;
        EnumC1154800g9m enumC1154800g9m3 = new EnumC1154800g9m("VSA", 2);
        VSA = enumC1154800g9m3;
        EnumC1154800g9m[] enumC1154800g9mArr = {enumC1154800g9m, enumC1154800g9m2, enumC1154800g9m3};
        LL = enumC1154800g9mArr;
        LLILLJJLI = new C2254308sP(enumC1154800g9mArr);
    }

    public static EnumC1154800g9m[] values() {
        return (EnumC1154800g9m[]) LL.clone();
    }

    public static EnumC1154800g9m valueOf(String str) {
        return (EnumC1154800g9m) C08FF.LIZ(EnumC1154800g9m.class, str);
    }

    public EnumC1154800g9m(String str, int i) {
    }
}
