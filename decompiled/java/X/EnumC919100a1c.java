package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a1c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC919100a1c {
    public static final EnumC919100a1c DISMISS_SAVE;
    public static final /* synthetic */ EnumC919100a1c[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC919100a1c NORMAL;
    public static final EnumC919100a1c SAVE;

    public static InterfaceC2044707zh<EnumC919100a1c> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC919100a1c enumC919100a1c = new EnumC919100a1c("NORMAL", 0);
        NORMAL = enumC919100a1c;
        EnumC919100a1c enumC919100a1c2 = new EnumC919100a1c("SAVE", 1);
        SAVE = enumC919100a1c2;
        EnumC919100a1c enumC919100a1c3 = new EnumC919100a1c("DISMISS_SAVE", 2);
        DISMISS_SAVE = enumC919100a1c3;
        EnumC919100a1c[] enumC919100a1cArr = {enumC919100a1c, enumC919100a1c2, enumC919100a1c3};
        LL = enumC919100a1cArr;
        LLILLJJLI = new C2254308sP(enumC919100a1cArr);
    }

    public static EnumC919100a1c[] values() {
        return (EnumC919100a1c[]) LL.clone();
    }

    public static EnumC919100a1c valueOf(String str) {
        return (EnumC919100a1c) C08FF.LIZ(EnumC919100a1c.class, str);
    }

    public EnumC919100a1c(String str, int i) {
    }
}
