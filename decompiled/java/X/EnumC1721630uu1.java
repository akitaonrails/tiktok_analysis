package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uu1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1721630uu1 {
    public static final EnumC1721630uu1 INIT;
    public static final /* synthetic */ EnumC1721630uu1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1721630uu1 MAX_EXCEED;
    public static final EnumC1721630uu1 MIN_BELOW;
    public static final EnumC1721630uu1 NORMAL;

    public static InterfaceC2044707zh<EnumC1721630uu1> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1721630uu1 enumC1721630uu1 = new EnumC1721630uu1("NORMAL", 0);
        NORMAL = enumC1721630uu1;
        EnumC1721630uu1 enumC1721630uu12 = new EnumC1721630uu1("MAX_EXCEED", 1);
        MAX_EXCEED = enumC1721630uu12;
        EnumC1721630uu1 enumC1721630uu13 = new EnumC1721630uu1("MIN_BELOW", 2);
        MIN_BELOW = enumC1721630uu13;
        EnumC1721630uu1 enumC1721630uu14 = new EnumC1721630uu1("INIT", 3);
        INIT = enumC1721630uu14;
        EnumC1721630uu1[] enumC1721630uu1Arr = {enumC1721630uu1, enumC1721630uu12, enumC1721630uu13, enumC1721630uu14};
        LL = enumC1721630uu1Arr;
        LLILLJJLI = new C2254308sP(enumC1721630uu1Arr);
    }

    public static EnumC1721630uu1[] values() {
        return (EnumC1721630uu1[]) LL.clone();
    }

    public static EnumC1721630uu1 valueOf(String str) {
        return (EnumC1721630uu1) C08FF.LIZ(EnumC1721630uu1.class, str);
    }

    public EnumC1721630uu1(String str, int i) {
    }
}
