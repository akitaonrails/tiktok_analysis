package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Pyd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC662450Pyd {
    public static final EnumC662450Pyd EMPTY;
    public static final /* synthetic */ EnumC662450Pyd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC662450Pyd SHOW_BLOCK;
    public static final EnumC662450Pyd SHOW_FOLLOW;

    public static InterfaceC2044707zh<EnumC662450Pyd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC662450Pyd enumC662450Pyd = new EnumC662450Pyd("EMPTY", 0);
        EMPTY = enumC662450Pyd;
        EnumC662450Pyd enumC662450Pyd2 = new EnumC662450Pyd("SHOW_FOLLOW", 1);
        SHOW_FOLLOW = enumC662450Pyd2;
        EnumC662450Pyd enumC662450Pyd3 = new EnumC662450Pyd("SHOW_BLOCK", 2);
        SHOW_BLOCK = enumC662450Pyd3;
        EnumC662450Pyd[] enumC662450PydArr = {enumC662450Pyd, enumC662450Pyd2, enumC662450Pyd3};
        LL = enumC662450PydArr;
        LLILLJJLI = new C2254308sP(enumC662450PydArr);
    }

    public static EnumC662450Pyd[] values() {
        return (EnumC662450Pyd[]) LL.clone();
    }

    public static EnumC662450Pyd valueOf(String str) {
        return (EnumC662450Pyd) C08FF.LIZ(EnumC662450Pyd.class, str);
    }

    public EnumC662450Pyd(String str, int i) {
    }
}
