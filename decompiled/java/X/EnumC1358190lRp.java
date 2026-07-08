package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lRp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1358190lRp {
    public static final EnumC1358190lRp AVATAR;
    public static final EnumC1358190lRp BUTTON;
    public static final EnumC1358190lRp CELL;
    public static final /* synthetic */ EnumC1358190lRp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1358190lRp NULL;
    public static final EnumC1358190lRp USERNAME;

    public static InterfaceC2044707zh<EnumC1358190lRp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1358190lRp enumC1358190lRp = new EnumC1358190lRp("CELL", 0);
        CELL = enumC1358190lRp;
        EnumC1358190lRp enumC1358190lRp2 = new EnumC1358190lRp("AVATAR", 1);
        AVATAR = enumC1358190lRp2;
        EnumC1358190lRp enumC1358190lRp3 = new EnumC1358190lRp("USERNAME", 2);
        USERNAME = enumC1358190lRp3;
        EnumC1358190lRp enumC1358190lRp4 = new EnumC1358190lRp("BUTTON", 3);
        BUTTON = enumC1358190lRp4;
        EnumC1358190lRp enumC1358190lRp5 = new EnumC1358190lRp("NULL", 4);
        NULL = enumC1358190lRp5;
        EnumC1358190lRp[] enumC1358190lRpArr = {enumC1358190lRp, enumC1358190lRp2, enumC1358190lRp3, enumC1358190lRp4, enumC1358190lRp5};
        LL = enumC1358190lRpArr;
        LLILLJJLI = new C2254308sP(enumC1358190lRpArr);
    }

    public static EnumC1358190lRp[] values() {
        return (EnumC1358190lRp[]) LL.clone();
    }

    public static EnumC1358190lRp valueOf(String str) {
        return (EnumC1358190lRp) C08FF.LIZ(EnumC1358190lRp.class, str);
    }

    public EnumC1358190lRp(String str, int i) {
    }
}
