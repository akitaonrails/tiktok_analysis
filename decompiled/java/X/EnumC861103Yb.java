package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Yb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC861103Yb {
    public static final EnumC861103Yb ADD;
    public static final EnumC861103Yb ENABLE;
    public static final EnumC861103Yb ENABLE_AND_ADD;
    public static final /* synthetic */ EnumC861103Yb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC861103Yb> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC861103Yb enumC861103Yb = new EnumC861103Yb("ENABLE", 0);
        ENABLE = enumC861103Yb;
        EnumC861103Yb enumC861103Yb2 = new EnumC861103Yb("ADD", 1);
        ADD = enumC861103Yb2;
        EnumC861103Yb enumC861103Yb3 = new EnumC861103Yb("ENABLE_AND_ADD", 2);
        ENABLE_AND_ADD = enumC861103Yb3;
        EnumC861103Yb[] enumC861103YbArr = {enumC861103Yb, enumC861103Yb2, enumC861103Yb3};
        LL = enumC861103YbArr;
        LLILLJJLI = new C2254308sP(enumC861103YbArr);
    }

    public static EnumC861103Yb[] values() {
        return (EnumC861103Yb[]) LL.clone();
    }

    public static EnumC861103Yb valueOf(String str) {
        return (EnumC861103Yb) C08FF.LIZ(EnumC861103Yb.class, str);
    }

    public EnumC861103Yb(String str, int i) {
    }
}
