package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JIV, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JIV {
    public static final C0JIV COULD_NOT_REMOVE_UNAUTHORIZED_SOUNDS;
    public static final /* synthetic */ C0JIV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0JIV MUTED_UNDER_REVIEW;
    public static final C0JIV UNAUTHORIZED_SOUNDS_REMOVED;

    public static InterfaceC2044707zh<C0JIV> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0JIV c0jiv = new C0JIV("MUTED_UNDER_REVIEW", 0);
        MUTED_UNDER_REVIEW = c0jiv;
        C0JIV c0jiv2 = new C0JIV("UNAUTHORIZED_SOUNDS_REMOVED", 1);
        UNAUTHORIZED_SOUNDS_REMOVED = c0jiv2;
        C0JIV c0jiv3 = new C0JIV("COULD_NOT_REMOVE_UNAUTHORIZED_SOUNDS", 2);
        COULD_NOT_REMOVE_UNAUTHORIZED_SOUNDS = c0jiv3;
        C0JIV[] c0jivArr = {c0jiv, c0jiv2, c0jiv3};
        LL = c0jivArr;
        LLILLJJLI = new C2254308sP(c0jivArr);
    }

    public static C0JIV[] values() {
        return (C0JIV[]) LL.clone();
    }

    public static C0JIV valueOf(String str) {
        return (C0JIV) C08FF.LIZ(C0JIV.class, str);
    }

    public C0JIV(String str, int i) {
    }
}
