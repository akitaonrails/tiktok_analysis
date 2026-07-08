package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10pg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19366210pg {
    public static final /* synthetic */ EnumC19366210pg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19366210pg NONE;
    public static final EnumC19366210pg TEXT;
    public static final EnumC19366210pg TITLE;

    public static InterfaceC2044707zh<EnumC19366210pg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19366210pg enumC19366210pg = new EnumC19366210pg("TITLE", 0);
        TITLE = enumC19366210pg;
        EnumC19366210pg enumC19366210pg2 = new EnumC19366210pg("TEXT", 1);
        TEXT = enumC19366210pg2;
        EnumC19366210pg enumC19366210pg3 = new EnumC19366210pg("NONE", 2);
        NONE = enumC19366210pg3;
        EnumC19366210pg[] enumC19366210pgArr = {enumC19366210pg, enumC19366210pg2, enumC19366210pg3};
        LL = enumC19366210pgArr;
        LLILLJJLI = new C2254308sP(enumC19366210pgArr);
    }

    public static EnumC19366210pg[] values() {
        return (EnumC19366210pg[]) LL.clone();
    }

    public static EnumC19366210pg valueOf(String str) {
        return (EnumC19366210pg) C08FF.LIZ(EnumC19366210pg.class, str);
    }

    public EnumC19366210pg(String str, int i) {
    }
}
