package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009B, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C009B {
    public static final C009B ADD_SONG;
    public static final C009B CAMPAIGN;
    public static final /* synthetic */ C009B[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C009B> getEntries() {
        return LLILLJJLI;
    }

    static {
        C009B c009b = new C009B("ADD_SONG", 0);
        ADD_SONG = c009b;
        C009B c009b2 = new C009B("CAMPAIGN", 1);
        CAMPAIGN = c009b2;
        C009B[] c009bArr = {c009b, c009b2};
        LL = c009bArr;
        LLILLJJLI = new C2254308sP(c009bArr);
    }

    public static C009B[] values() {
        return (C009B[]) LL.clone();
    }

    public static C009B valueOf(String str) {
        return (C009B) C08FF.LIZ(C009B.class, str);
    }

    public C009B(String str, int i) {
    }
}
