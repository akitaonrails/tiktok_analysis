package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.04Ej, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1064704Ej {
    public static final EnumC1064704Ej LEFT;
    public static final /* synthetic */ EnumC1064704Ej[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1064704Ej RIGHT;

    public static InterfaceC2044707zh<EnumC1064704Ej> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1064704Ej enumC1064704Ej = new EnumC1064704Ej("LEFT", 0);
        LEFT = enumC1064704Ej;
        EnumC1064704Ej enumC1064704Ej2 = new EnumC1064704Ej("RIGHT", 1);
        RIGHT = enumC1064704Ej2;
        EnumC1064704Ej[] enumC1064704EjArr = {enumC1064704Ej, enumC1064704Ej2};
        LL = enumC1064704EjArr;
        LLILLJJLI = new C2254308sP(enumC1064704EjArr);
    }

    public static EnumC1064704Ej[] values() {
        return (EnumC1064704Ej[]) LL.clone();
    }

    public static EnumC1064704Ej valueOf(String str) {
        return (EnumC1064704Ej) C08FF.LIZ(EnumC1064704Ej.class, str);
    }

    public EnumC1064704Ej(String str, int i) {
    }
}
