package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gOS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1163900gOS {
    public static final /* synthetic */ EnumC1163900gOS[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1163900gOS MIXCREATE;
    public static final EnumC1163900gOS MIXDELETE;
    public static final EnumC1163900gOS RENAME;
    public static final EnumC1163900gOS VIDEOADD;
    public static final EnumC1163900gOS VIDEOCOMMITCHANGES;
    public static final EnumC1163900gOS VIDEOREMOVE;
    public int LL;

    public static InterfaceC2044707zh<EnumC1163900gOS> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1163900gOS enumC1163900gOS = new EnumC1163900gOS("MIXCREATE", 0, 1);
        MIXCREATE = enumC1163900gOS;
        EnumC1163900gOS enumC1163900gOS2 = new EnumC1163900gOS("MIXDELETE", 1, 2);
        MIXDELETE = enumC1163900gOS2;
        EnumC1163900gOS enumC1163900gOS3 = new EnumC1163900gOS("RENAME", 2, 3);
        RENAME = enumC1163900gOS3;
        EnumC1163900gOS enumC1163900gOS4 = new EnumC1163900gOS("VIDEOADD", 3, 10);
        VIDEOADD = enumC1163900gOS4;
        EnumC1163900gOS enumC1163900gOS5 = new EnumC1163900gOS("VIDEOREMOVE", 4, 11);
        VIDEOREMOVE = enumC1163900gOS5;
        EnumC1163900gOS enumC1163900gOS6 = new EnumC1163900gOS("VIDEOCOMMITCHANGES", 5, 12);
        VIDEOCOMMITCHANGES = enumC1163900gOS6;
        EnumC1163900gOS[] enumC1163900gOSArr = {enumC1163900gOS, enumC1163900gOS2, enumC1163900gOS3, enumC1163900gOS4, enumC1163900gOS5, enumC1163900gOS6};
        LLILLJJLI = enumC1163900gOSArr;
        LLILLL = new C2254308sP(enumC1163900gOSArr);
    }

    public static EnumC1163900gOS[] values() {
        return (EnumC1163900gOS[]) LLILLJJLI.clone();
    }

    public final int getOperation() {
        return this.LL;
    }

    public static EnumC1163900gOS valueOf(String str) {
        return (EnumC1163900gOS) C08FF.LIZ(EnumC1163900gOS.class, str);
    }

    public final void setOperation(int i) {
        this.LL = i;
    }

    public EnumC1163900gOS(String str, int i, int i2) {
        this.LL = i2;
    }
}
