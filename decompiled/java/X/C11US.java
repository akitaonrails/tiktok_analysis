package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11US, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11US {
    public static final C11UW Companion;
    public static final C11US DOWNLOADED;
    public static final C11US DOWNLOADING;
    public static final /* synthetic */ C11US[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C11US NOT_DOWNLOAD;

    public static InterfaceC2044707zh<C11US> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.11UW] */
    static {
        C11US c11us = new C11US("DOWNLOADED", 0);
        DOWNLOADED = c11us;
        C11US c11us2 = new C11US("NOT_DOWNLOAD", 1);
        NOT_DOWNLOAD = c11us2;
        C11US c11us3 = new C11US("DOWNLOADING", 2);
        DOWNLOADING = c11us3;
        C11US[] c11usArr = {c11us, c11us2, c11us3};
        LL = c11usArr;
        LLILLJJLI = new C2254308sP(c11usArr);
        Companion = new Object() { // from class: X.11UW
        };
    }

    public static C11US[] values() {
        return (C11US[]) LL.clone();
    }

    public static C11US valueOf(String str) {
        return (C11US) C08FF.LIZ(C11US.class, str);
    }

    public C11US(String str, int i) {
    }
}
