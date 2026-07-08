package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0M3C, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M3C {
    public static final /* synthetic */ C0M3C[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0M3C NOT_POST_MODE;
    public final String LL = "not_photo_mode";

    public static InterfaceC2044707zh<C0M3C> getEntries() {
        return LLILLL;
    }

    static {
        C0M3C c0m3c = new C0M3C();
        NOT_POST_MODE = c0m3c;
        C0M3C[] c0m3cArr = {c0m3c};
        LLILLJJLI = c0m3cArr;
        LLILLL = new C2254308sP(c0m3cArr);
    }

    public static C0M3C[] values() {
        return (C0M3C[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0M3C valueOf(String str) {
        return (C0M3C) C08FF.LIZ(C0M3C.class, str);
    }
}
