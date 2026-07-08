package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0090, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0090 {
    public static final AnonymousClass0090 COLD;
    public static final /* synthetic */ AnonymousClass0090[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final AnonymousClass0090 WARM;

    public static InterfaceC2044707zh<AnonymousClass0090> getEntries() {
        return LLILLJJLI;
    }

    static {
        AnonymousClass0090 anonymousClass0090 = new AnonymousClass0090("COLD", 0);
        COLD = anonymousClass0090;
        AnonymousClass0090 anonymousClass00902 = new AnonymousClass0090("WARM", 1);
        WARM = anonymousClass00902;
        AnonymousClass0090[] anonymousClass0090Arr = {anonymousClass0090, anonymousClass00902};
        LL = anonymousClass0090Arr;
        LLILLJJLI = new C2254308sP(anonymousClass0090Arr);
    }

    public static AnonymousClass0090[] values() {
        return (AnonymousClass0090[]) LL.clone();
    }

    public static AnonymousClass0090 valueOf(String str) {
        return (AnonymousClass0090) C08FF.LIZ(AnonymousClass0090.class, str);
    }

    public AnonymousClass0090(String str, int i) {
    }
}
