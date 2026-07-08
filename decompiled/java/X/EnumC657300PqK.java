package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PqK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC657300PqK {
    public static final /* synthetic */ EnumC657300PqK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC657300PqK SINGLE;
    public static final EnumC657300PqK SUB_CARD;

    public static InterfaceC2044707zh<EnumC657300PqK> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC657300PqK enumC657300PqK = new EnumC657300PqK("SINGLE", 0);
        SINGLE = enumC657300PqK;
        EnumC657300PqK enumC657300PqK2 = new EnumC657300PqK("SUB_CARD", 1);
        SUB_CARD = enumC657300PqK2;
        EnumC657300PqK[] enumC657300PqKArr = {enumC657300PqK, enumC657300PqK2};
        LL = enumC657300PqKArr;
        LLILLJJLI = new C2254308sP(enumC657300PqKArr);
    }

    public static EnumC657300PqK[] values() {
        return (EnumC657300PqK[]) LL.clone();
    }

    public static EnumC657300PqK valueOf(String str) {
        return (EnumC657300PqK) C08FF.LIZ(EnumC657300PqK.class, str);
    }

    public EnumC657300PqK(String str, int i) {
    }
}
