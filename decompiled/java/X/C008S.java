package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008S, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C008S {
    public static final C008S ALBUM_PICKER_LAZY;
    public static final C008S ALBUM_PICKER_PROMPTLY;
    public static final /* synthetic */ C008S[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C008S> getEntries() {
        return LLILLJJLI;
    }

    static {
        C008S c008s = new C008S("ALBUM_PICKER_LAZY", 0);
        ALBUM_PICKER_LAZY = c008s;
        C008S c008s2 = new C008S("ALBUM_PICKER_PROMPTLY", 1);
        ALBUM_PICKER_PROMPTLY = c008s2;
        C008S[] c008sArr = {c008s, c008s2};
        LL = c008sArr;
        LLILLJJLI = new C2254308sP(c008sArr);
    }

    public static C008S[] values() {
        return (C008S[]) LL.clone();
    }

    public static C008S valueOf(String str) {
        return (C008S) C08FF.LIZ(C008S.class, str);
    }

    public C008S(String str, int i) {
    }
}
