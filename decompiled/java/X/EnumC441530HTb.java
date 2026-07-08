package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HTb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC441530HTb {
    public static final EnumC441530HTb BOTTOM;
    public static final /* synthetic */ EnumC441530HTb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC441530HTb TOP;

    public static InterfaceC2044707zh<EnumC441530HTb> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC441530HTb enumC441530HTb = new EnumC441530HTb("TOP", 0);
        TOP = enumC441530HTb;
        EnumC441530HTb enumC441530HTb2 = new EnumC441530HTb("BOTTOM", 1);
        BOTTOM = enumC441530HTb2;
        EnumC441530HTb[] enumC441530HTbArr = {enumC441530HTb, enumC441530HTb2};
        LL = enumC441530HTbArr;
        LLILLJJLI = new C2254308sP(enumC441530HTbArr);
    }

    public static EnumC441530HTb[] values() {
        return (EnumC441530HTb[]) LL.clone();
    }

    public static EnumC441530HTb valueOf(String str) {
        return (EnumC441530HTb) C08FF.LIZ(EnumC441530HTb.class, str);
    }

    public EnumC441530HTb(String str, int i) {
    }
}
