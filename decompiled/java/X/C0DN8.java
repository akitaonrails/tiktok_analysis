package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DN8, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DN8 {
    public static final C0DN8 INTO_ALL;
    public static final C0DN8 INTO_DISK;
    public static final C0DN8 INTO_MEMORY;
    public static final /* synthetic */ C0DN8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0DN8> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0DN8 c0dn8 = new C0DN8("INTO_DISK", 0);
        INTO_DISK = c0dn8;
        C0DN8 c0dn82 = new C0DN8("INTO_MEMORY", 1);
        INTO_MEMORY = c0dn82;
        C0DN8 c0dn83 = new C0DN8("INTO_ALL", 2);
        INTO_ALL = c0dn83;
        C0DN8[] c0dn8Arr = {c0dn8, c0dn82, c0dn83};
        LL = c0dn8Arr;
        LLILLJJLI = new C2254308sP(c0dn8Arr);
    }

    public static C0DN8[] values() {
        return (C0DN8[]) LL.clone();
    }

    public static C0DN8 valueOf(String str) {
        return (C0DN8) C08FF.LIZ(C0DN8.class, str);
    }

    public C0DN8(String str, int i) {
    }
}
