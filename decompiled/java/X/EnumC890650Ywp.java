package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ywp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC890650Ywp {
    public static final EnumC890650Ywp HASHTAG;
    public static final /* synthetic */ EnumC890650Ywp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC890650Ywp MENTION_USER;
    public static final EnumC890650Ywp NONE;

    public static InterfaceC2044707zh<EnumC890650Ywp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC890650Ywp enumC890650Ywp = new EnumC890650Ywp("HASHTAG", 0);
        HASHTAG = enumC890650Ywp;
        EnumC890650Ywp enumC890650Ywp2 = new EnumC890650Ywp("MENTION_USER", 1);
        MENTION_USER = enumC890650Ywp2;
        EnumC890650Ywp enumC890650Ywp3 = new EnumC890650Ywp("NONE", 2);
        NONE = enumC890650Ywp3;
        EnumC890650Ywp[] enumC890650YwpArr = {enumC890650Ywp, enumC890650Ywp2, enumC890650Ywp3};
        LL = enumC890650YwpArr;
        LLILLJJLI = new C2254308sP(enumC890650YwpArr);
    }

    public static EnumC890650Ywp[] values() {
        return (EnumC890650Ywp[]) LL.clone();
    }

    public static EnumC890650Ywp valueOf(String str) {
        return (EnumC890650Ywp) C08FF.LIZ(EnumC890650Ywp.class, str);
    }

    public EnumC890650Ywp(String str, int i) {
    }
}
