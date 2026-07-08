package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0162, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0162 {
    public static final AnonymousClass0162 HORIZONTAL;
    public static final /* synthetic */ AnonymousClass0162[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final AnonymousClass0162 VERTICAL;
    public final int LL;

    public static InterfaceC2044707zh<AnonymousClass0162> getEntries() {
        return LLILLL;
    }

    static {
        AnonymousClass0162 anonymousClass0162 = new AnonymousClass0162("HORIZONTAL", 0, 0);
        HORIZONTAL = anonymousClass0162;
        AnonymousClass0162 anonymousClass01622 = new AnonymousClass0162("VERTICAL", 1, 1);
        VERTICAL = anonymousClass01622;
        AnonymousClass0162[] anonymousClass0162Arr = {anonymousClass0162, anonymousClass01622};
        LLILLJJLI = anonymousClass0162Arr;
        LLILLL = new C2254308sP(anonymousClass0162Arr);
    }

    public static AnonymousClass0162[] values() {
        return (AnonymousClass0162[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static AnonymousClass0162 valueOf(String str) {
        return (AnonymousClass0162) C08FF.LIZ(AnonymousClass0162.class, str);
    }

    public AnonymousClass0162(String str, int i, int i2) {
        this.LL = i2;
    }
}
