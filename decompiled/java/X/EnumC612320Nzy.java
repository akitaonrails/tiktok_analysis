package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Nzy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC612320Nzy {
    public static final EnumC612320Nzy BEFORE_LIVE;
    public static final EnumC612320Nzy DURING_LIVE;
    public static final /* synthetic */ EnumC612320Nzy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC612320Nzy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC612320Nzy enumC612320Nzy = new EnumC612320Nzy("BEFORE_LIVE", 0);
        BEFORE_LIVE = enumC612320Nzy;
        EnumC612320Nzy enumC612320Nzy2 = new EnumC612320Nzy("DURING_LIVE", 1);
        DURING_LIVE = enumC612320Nzy2;
        EnumC612320Nzy[] enumC612320NzyArr = {enumC612320Nzy, enumC612320Nzy2};
        LL = enumC612320NzyArr;
        LLILLJJLI = new C2254308sP(enumC612320NzyArr);
    }

    public static EnumC612320Nzy[] values() {
        return (EnumC612320Nzy[]) LL.clone();
    }

    public static EnumC612320Nzy valueOf(String str) {
        return (EnumC612320Nzy) C08FF.LIZ(EnumC612320Nzy.class, str);
    }

    public EnumC612320Nzy(String str, int i) {
    }
}
