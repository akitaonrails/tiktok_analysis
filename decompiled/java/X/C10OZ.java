package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10OZ, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10OZ {
    public static final /* synthetic */ C10OZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C10OZ NEW_USER;
    public static final C10OZ OLD_USER;
    public static final C10OZ UNLOGIN;

    public static InterfaceC2044707zh<C10OZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        C10OZ c10oz = new C10OZ("UNLOGIN", 0);
        UNLOGIN = c10oz;
        C10OZ c10oz2 = new C10OZ("NEW_USER", 1);
        NEW_USER = c10oz2;
        C10OZ c10oz3 = new C10OZ("OLD_USER", 2);
        OLD_USER = c10oz3;
        C10OZ[] c10ozArr = {c10oz, c10oz2, c10oz3};
        LL = c10ozArr;
        LLILLJJLI = new C2254308sP(c10ozArr);
    }

    public static C10OZ[] values() {
        return (C10OZ[]) LL.clone();
    }

    public static C10OZ valueOf(String str) {
        return (C10OZ) C08FF.LIZ(C10OZ.class, str);
    }

    public C10OZ(String str, int i) {
    }
}
