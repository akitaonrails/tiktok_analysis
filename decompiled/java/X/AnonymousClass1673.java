package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1673, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1673 {
    public static final AnonymousClass1673 BACK;
    public static final AnonymousClass1673 DELETE;
    public static final AnonymousClass1673 DONE;
    public static final /* synthetic */ AnonymousClass1673[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final AnonymousClass1673 OTHER;

    public static InterfaceC2044707zh<AnonymousClass1673> getEntries() {
        return LLILLJJLI;
    }

    static {
        AnonymousClass1673 anonymousClass1673 = new AnonymousClass1673("DONE", 0);
        DONE = anonymousClass1673;
        AnonymousClass1673 anonymousClass16732 = new AnonymousClass1673("DELETE", 1);
        DELETE = anonymousClass16732;
        AnonymousClass1673 anonymousClass16733 = new AnonymousClass1673("BACK", 2);
        BACK = anonymousClass16733;
        AnonymousClass1673 anonymousClass16734 = new AnonymousClass1673("OTHER", 3);
        OTHER = anonymousClass16734;
        AnonymousClass1673[] anonymousClass1673Arr = {anonymousClass1673, anonymousClass16732, anonymousClass16733, anonymousClass16734};
        LL = anonymousClass1673Arr;
        LLILLJJLI = new C2254308sP(anonymousClass1673Arr);
    }

    public static AnonymousClass1673[] values() {
        return (AnonymousClass1673[]) LL.clone();
    }

    public static AnonymousClass1673 valueOf(String str) {
        return (AnonymousClass1673) C08FF.LIZ(AnonymousClass1673.class, str);
    }

    public AnonymousClass1673(String str, int i) {
    }
}
