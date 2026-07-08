package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EnW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC375280EnW {
    public static final EnumC375280EnW LEFT;
    public static final /* synthetic */ EnumC375280EnW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC375280EnW RIGHT;

    public static InterfaceC2044707zh<EnumC375280EnW> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC375280EnW enumC375280EnW = new EnumC375280EnW("RIGHT", 0);
        RIGHT = enumC375280EnW;
        EnumC375280EnW enumC375280EnW2 = new EnumC375280EnW("LEFT", 1);
        LEFT = enumC375280EnW2;
        EnumC375280EnW[] enumC375280EnWArr = {enumC375280EnW, enumC375280EnW2};
        LL = enumC375280EnWArr;
        LLILLJJLI = new C2254308sP(enumC375280EnWArr);
    }

    public static EnumC375280EnW[] values() {
        return (EnumC375280EnW[]) LL.clone();
    }

    public static EnumC375280EnW valueOf(String str) {
        return (EnumC375280EnW) C08FF.LIZ(EnumC375280EnW.class, str);
    }

    public EnumC375280EnW(String str, int i) {
    }
}
