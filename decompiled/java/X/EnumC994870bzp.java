package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bzp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994870bzp {
    public static final EnumC994870bzp HIDE;
    public static final /* synthetic */ EnumC994870bzp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC994870bzp SHOW;

    public static InterfaceC2044707zh<EnumC994870bzp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC994870bzp enumC994870bzp = new EnumC994870bzp("HIDE", 0);
        HIDE = enumC994870bzp;
        EnumC994870bzp enumC994870bzp2 = new EnumC994870bzp("SHOW", 1);
        SHOW = enumC994870bzp2;
        EnumC994870bzp[] enumC994870bzpArr = {enumC994870bzp, enumC994870bzp2};
        LL = enumC994870bzpArr;
        LLILLJJLI = new C2254308sP(enumC994870bzpArr);
    }

    public static EnumC994870bzp[] values() {
        return (EnumC994870bzp[]) LL.clone();
    }

    public static EnumC994870bzp valueOf(String str) {
        return (EnumC994870bzp) C08FF.LIZ(EnumC994870bzp.class, str);
    }

    public EnumC994870bzp(String str, int i) {
    }
}
