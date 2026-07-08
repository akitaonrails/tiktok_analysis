package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UCA, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UCA {
    public static final C0UCA ADD_EFFECT;
    public static final /* synthetic */ C0UCA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0UCA REMOVE_EFFECT;
    public static final C0UCA REPLACE_EFFECT;
    public static final C0UCA RESTORE_EFFECT;
    public static final C0UCA SHOW_EFFECT;
    public static final C0UCA SYNC_TAG;
    public static final C0UCA UPDATE_TAG;
    public final int LL;

    public static InterfaceC2044707zh<C0UCA> getEntries() {
        return LLILLL;
    }

    static {
        C0UCA c0uca = new C0UCA("RESTORE_EFFECT", 0, 0);
        RESTORE_EFFECT = c0uca;
        C0UCA c0uca2 = new C0UCA("ADD_EFFECT", 1, 1);
        ADD_EFFECT = c0uca2;
        C0UCA c0uca3 = new C0UCA("SHOW_EFFECT", 2, 2);
        SHOW_EFFECT = c0uca3;
        C0UCA c0uca4 = new C0UCA("REPLACE_EFFECT", 3, 3);
        REPLACE_EFFECT = c0uca4;
        C0UCA c0uca5 = new C0UCA("REMOVE_EFFECT", 4, 4);
        REMOVE_EFFECT = c0uca5;
        C0UCA c0uca6 = new C0UCA("SYNC_TAG", 5, 5);
        SYNC_TAG = c0uca6;
        C0UCA c0uca7 = new C0UCA("UPDATE_TAG", 6, 6);
        UPDATE_TAG = c0uca7;
        C0UCA[] c0ucaArr = {c0uca, c0uca2, c0uca3, c0uca4, c0uca5, c0uca6, c0uca7};
        LLILLJJLI = c0ucaArr;
        LLILLL = new C2254308sP(c0ucaArr);
    }

    public static C0UCA[] values() {
        return (C0UCA[]) LLILLJJLI.clone();
    }

    public final int getKey() {
        return this.LL;
    }

    public static C0UCA valueOf(String str) {
        return (C0UCA) C08FF.LIZ(C0UCA.class, str);
    }

    public C0UCA(String str, int i, int i2) {
        this.LL = i2;
    }
}
