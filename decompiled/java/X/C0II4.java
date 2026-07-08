package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0II4, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0II4 {
    public static final C0II4 FULL_SET;
    public static final /* synthetic */ C0II4[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0II4 NONE;
    public static final C0II4 THUMBNAIL;

    public static InterfaceC2044707zh<C0II4> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0II4 c0ii4 = new C0II4("NONE", 0);
        NONE = c0ii4;
        C0II4 c0ii42 = new C0II4("FULL_SET", 1);
        FULL_SET = c0ii42;
        C0II4 c0ii43 = new C0II4("THUMBNAIL", 2);
        THUMBNAIL = c0ii43;
        C0II4[] c0ii4Arr = {c0ii4, c0ii42, c0ii43};
        LL = c0ii4Arr;
        LLILLJJLI = new C2254308sP(c0ii4Arr);
    }

    public static C0II4[] values() {
        return (C0II4[]) LL.clone();
    }

    public static C0II4 valueOf(String str) {
        return (C0II4) C08FF.LIZ(C0II4.class, str);
    }

    public C0II4(String str, int i) {
    }
}
