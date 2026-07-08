package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DMp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC337930DMp {
    public static final EnumC337930DMp FAIL_CREATE;
    public static final EnumC337930DMp FAIL_DELETE;
    public static final EnumC337930DMp FAIL_EDIT;
    public static final /* synthetic */ EnumC337930DMp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC337930DMp SUCCEED_ADD;
    public static final EnumC337930DMp SUCCEED_DELETE;
    public static final EnumC337930DMp SUCCEED_EDIT;
    public static final EnumC337930DMp SUCCESS_EDIT_PREVENT_REFRESH;

    public static InterfaceC2044707zh<EnumC337930DMp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC337930DMp enumC337930DMp = new EnumC337930DMp("FAIL_CREATE", 0);
        FAIL_CREATE = enumC337930DMp;
        EnumC337930DMp enumC337930DMp2 = new EnumC337930DMp("FAIL_EDIT", 1);
        FAIL_EDIT = enumC337930DMp2;
        EnumC337930DMp enumC337930DMp3 = new EnumC337930DMp("FAIL_DELETE", 2);
        FAIL_DELETE = enumC337930DMp3;
        EnumC337930DMp enumC337930DMp4 = new EnumC337930DMp("SUCCEED_DELETE", 3);
        SUCCEED_DELETE = enumC337930DMp4;
        EnumC337930DMp enumC337930DMp5 = new EnumC337930DMp("SUCCEED_EDIT", 4);
        SUCCEED_EDIT = enumC337930DMp5;
        EnumC337930DMp enumC337930DMp6 = new EnumC337930DMp("SUCCESS_EDIT_PREVENT_REFRESH", 5);
        SUCCESS_EDIT_PREVENT_REFRESH = enumC337930DMp6;
        EnumC337930DMp enumC337930DMp7 = new EnumC337930DMp("SUCCEED_ADD", 6);
        SUCCEED_ADD = enumC337930DMp7;
        EnumC337930DMp[] enumC337930DMpArr = {enumC337930DMp, enumC337930DMp2, enumC337930DMp3, enumC337930DMp4, enumC337930DMp5, enumC337930DMp6, enumC337930DMp7};
        LL = enumC337930DMpArr;
        LLILLJJLI = new C2254308sP(enumC337930DMpArr);
    }

    public static EnumC337930DMp[] values() {
        return (EnumC337930DMp[]) LL.clone();
    }

    public static EnumC337930DMp valueOf(String str) {
        return (EnumC337930DMp) C08FF.LIZ(EnumC337930DMp.class, str);
    }

    public EnumC337930DMp(String str, int i) {
    }
}
