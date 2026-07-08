package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0FJT, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FJT {
    public static final C0FJT DISK_CACHE;
    public static final C0FJT DOWNLOADED;
    public static final /* synthetic */ C0FJT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0FJT MEMORY_CACHE;
    public static final C0FJT SKIPPED;

    public static InterfaceC2044707zh<C0FJT> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0FJT c0fjt = new C0FJT("DOWNLOADED", 0);
        DOWNLOADED = c0fjt;
        C0FJT c0fjt2 = new C0FJT("DISK_CACHE", 1);
        DISK_CACHE = c0fjt2;
        C0FJT c0fjt3 = new C0FJT("MEMORY_CACHE", 2);
        MEMORY_CACHE = c0fjt3;
        C0FJT c0fjt4 = new C0FJT("SKIPPED", 3);
        SKIPPED = c0fjt4;
        C0FJT[] c0fjtArr = {c0fjt, c0fjt2, c0fjt3, c0fjt4};
        LL = c0fjtArr;
        LLILLJJLI = new C2254308sP(c0fjtArr);
    }

    public static C0FJT[] values() {
        return (C0FJT[]) LL.clone();
    }

    public static C0FJT valueOf(String str) {
        return (C0FJT) C08FF.LIZ(C0FJT.class, str);
    }

    public C0FJT(String str, int i) {
    }
}
