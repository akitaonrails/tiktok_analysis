package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N4m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC588020N4m {
    public static final EnumC588020N4m BUSY;
    public static final EnumC588020N4m IDLE;
    public static final /* synthetic */ EnumC588020N4m[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC588020N4m> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC588020N4m enumC588020N4m = new EnumC588020N4m("BUSY", 0);
        BUSY = enumC588020N4m;
        EnumC588020N4m enumC588020N4m2 = new EnumC588020N4m("IDLE", 1);
        IDLE = enumC588020N4m2;
        EnumC588020N4m[] enumC588020N4mArr = {enumC588020N4m, enumC588020N4m2};
        LL = enumC588020N4mArr;
        LLILLJJLI = new C2254308sP(enumC588020N4mArr);
    }

    public static EnumC588020N4m[] values() {
        return (EnumC588020N4m[]) LL.clone();
    }

    public static EnumC588020N4m valueOf(String str) {
        return (EnumC588020N4m) C08FF.LIZ(EnumC588020N4m.class, str);
    }

    public EnumC588020N4m(String str, int i) {
    }
}
