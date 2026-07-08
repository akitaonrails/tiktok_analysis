package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.18SK, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18SK {
    public static final C18SK LL;
    public static final C18SK LLILLJJLI;
    public static final C18SK LLILLL;
    public static final /* synthetic */ C18SK[] LLILZ;

    static {
        C18SK c18sk = new C18SK("INSERT", 0);
        LL = c18sk;
        C18SK c18sk2 = new C18SK("SEND", 1);
        LLILLJJLI = c18sk2;
        C18SK c18sk3 = new C18SK("CANCEL", 2);
        LLILLL = c18sk3;
        C18SK[] c18skArr = {c18sk, c18sk2, c18sk3};
        LLILZ = c18skArr;
        new C2254308sP(c18skArr);
    }

    public static C18SK[] values() {
        return (C18SK[]) LLILZ.clone();
    }

    public static C18SK valueOf(String str) {
        return (C18SK) C08FF.LIZ(C18SK.class, str);
    }

    public C18SK(String str, int i) {
    }
}
