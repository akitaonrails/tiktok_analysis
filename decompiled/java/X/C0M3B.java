package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0M3B, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M3B {
    public static final /* synthetic */ C0M3B[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0M3B NOT_FROM_TARGET_MODE;
    public final String LL = "not_from_target_mode";

    public static InterfaceC2044707zh<C0M3B> getEntries() {
        return LLILLL;
    }

    static {
        C0M3B c0m3b = new C0M3B();
        NOT_FROM_TARGET_MODE = c0m3b;
        C0M3B[] c0m3bArr = {c0m3b};
        LLILLJJLI = c0m3bArr;
        LLILLL = new C2254308sP(c0m3bArr);
    }

    public static C0M3B[] values() {
        return (C0M3B[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0M3B valueOf(String str) {
        return (C0M3B) C08FF.LIZ(C0M3B.class, str);
    }
}
