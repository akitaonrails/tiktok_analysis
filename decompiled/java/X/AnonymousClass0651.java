package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0651, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0651 {
    public static final /* synthetic */ AnonymousClass0651[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final AnonymousClass0651 PASS;
    public static final AnonymousClass0651 REJECT;
    public final int LL;

    public static InterfaceC2044707zh<AnonymousClass0651> getEntries() {
        return LLILLL;
    }

    static {
        AnonymousClass0651 anonymousClass0651 = new AnonymousClass0651("PASS", 0, 1);
        PASS = anonymousClass0651;
        AnonymousClass0651 anonymousClass06512 = new AnonymousClass0651("REJECT", 1, 2);
        REJECT = anonymousClass06512;
        AnonymousClass0651[] anonymousClass0651Arr = {anonymousClass0651, anonymousClass06512};
        LLILLJJLI = anonymousClass0651Arr;
        LLILLL = new C2254308sP(anonymousClass0651Arr);
    }

    public static AnonymousClass0651[] values() {
        return (AnonymousClass0651[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static AnonymousClass0651 valueOf(String str) {
        return (AnonymousClass0651) C08FF.LIZ(AnonymousClass0651.class, str);
    }

    public AnonymousClass0651(String str, int i, int i2) {
        this.LL = i2;
    }
}
