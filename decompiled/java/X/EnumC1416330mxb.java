package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mxb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1416330mxb {
    public static final EnumC1416330mxb EVERYONE;
    public static final EnumC1416330mxb FRIENDS;
    public static final /* synthetic */ EnumC1416330mxb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1416330mxb ONLYME;

    public static InterfaceC2044707zh<EnumC1416330mxb> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1416330mxb enumC1416330mxb = new EnumC1416330mxb("ONLYME", 0);
        ONLYME = enumC1416330mxb;
        EnumC1416330mxb enumC1416330mxb2 = new EnumC1416330mxb("FRIENDS", 1);
        FRIENDS = enumC1416330mxb2;
        EnumC1416330mxb enumC1416330mxb3 = new EnumC1416330mxb("EVERYONE", 2);
        EVERYONE = enumC1416330mxb3;
        EnumC1416330mxb[] enumC1416330mxbArr = {enumC1416330mxb, enumC1416330mxb2, enumC1416330mxb3};
        LL = enumC1416330mxbArr;
        LLILLJJLI = new C2254308sP(enumC1416330mxbArr);
    }

    public static EnumC1416330mxb[] values() {
        return (EnumC1416330mxb[]) LL.clone();
    }

    public static EnumC1416330mxb valueOf(String str) {
        return (EnumC1416330mxb) C08FF.LIZ(EnumC1416330mxb.class, str);
    }

    public EnumC1416330mxb(String str, int i) {
    }
}
