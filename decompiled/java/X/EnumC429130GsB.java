package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0GsB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429130GsB {
    public static final EnumC429130GsB LEFT;
    public static final /* synthetic */ EnumC429130GsB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC429130GsB RIGHT;

    public static InterfaceC2044707zh<EnumC429130GsB> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC429130GsB enumC429130GsB = new EnumC429130GsB("RIGHT", 0);
        RIGHT = enumC429130GsB;
        EnumC429130GsB enumC429130GsB2 = new EnumC429130GsB("LEFT", 1);
        LEFT = enumC429130GsB2;
        EnumC429130GsB[] enumC429130GsBArr = {enumC429130GsB, enumC429130GsB2};
        LL = enumC429130GsBArr;
        LLILLJJLI = new C2254308sP(enumC429130GsBArr);
    }

    public static EnumC429130GsB[] values() {
        return (EnumC429130GsB[]) LL.clone();
    }

    public static EnumC429130GsB valueOf(String str) {
        return (EnumC429130GsB) C08FF.LIZ(EnumC429130GsB.class, str);
    }

    public EnumC429130GsB(String str, int i) {
    }
}
