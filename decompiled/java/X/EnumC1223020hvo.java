package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hvo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1223020hvo {
    public static final EnumC1223020hvo DOWN_EMPTY;
    public static final EnumC1223020hvo EMPTY;
    public static final /* synthetic */ EnumC1223020hvo[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1223020hvo LOADING;
    public static final EnumC1223020hvo READY;
    public static final EnumC1223020hvo UNINITIALIZED;
    public static final EnumC1223020hvo UP_EMPTY;
    public static final EnumC1223020hvo UP_LOADING;

    public static InterfaceC2044707zh<EnumC1223020hvo> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1223020hvo enumC1223020hvo = new EnumC1223020hvo("UNINITIALIZED", 0);
        UNINITIALIZED = enumC1223020hvo;
        EnumC1223020hvo enumC1223020hvo2 = new EnumC1223020hvo("LOADING", 1);
        LOADING = enumC1223020hvo2;
        EnumC1223020hvo enumC1223020hvo3 = new EnumC1223020hvo("UP_EMPTY", 2);
        UP_EMPTY = enumC1223020hvo3;
        EnumC1223020hvo enumC1223020hvo4 = new EnumC1223020hvo("UP_LOADING", 3);
        UP_LOADING = enumC1223020hvo4;
        EnumC1223020hvo enumC1223020hvo5 = new EnumC1223020hvo("DOWN_EMPTY", 4);
        DOWN_EMPTY = enumC1223020hvo5;
        EnumC1223020hvo enumC1223020hvo6 = new EnumC1223020hvo("READY", 5);
        READY = enumC1223020hvo6;
        EnumC1223020hvo enumC1223020hvo7 = new EnumC1223020hvo("EMPTY", 6);
        EMPTY = enumC1223020hvo7;
        EnumC1223020hvo[] enumC1223020hvoArr = {enumC1223020hvo, enumC1223020hvo2, enumC1223020hvo3, enumC1223020hvo4, enumC1223020hvo5, enumC1223020hvo6, enumC1223020hvo7};
        LL = enumC1223020hvoArr;
        LLILLJJLI = new C2254308sP(enumC1223020hvoArr);
    }

    public static EnumC1223020hvo[] values() {
        return (EnumC1223020hvo[]) LL.clone();
    }

    public static EnumC1223020hvo valueOf(String str) {
        return (EnumC1223020hvo) C08FF.LIZ(EnumC1223020hvo.class, str);
    }

    public EnumC1223020hvo(String str, int i) {
    }
}
