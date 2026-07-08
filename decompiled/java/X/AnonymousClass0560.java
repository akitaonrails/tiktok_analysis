package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0560, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0560 {
    public static final /* synthetic */ AnonymousClass0560[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final AnonymousClass0560 NOT_SUPPORT_SHARE_MODE;
    public static final AnonymousClass0560 SHARE_LINK_FORM_LINK_EMPTY;
    public final int LL;

    public static InterfaceC2044707zh<AnonymousClass0560> getEntries() {
        return LLILLL;
    }

    static {
        AnonymousClass0560 anonymousClass0560 = new AnonymousClass0560("NOT_SUPPORT_SHARE_MODE", 0, 1001);
        NOT_SUPPORT_SHARE_MODE = anonymousClass0560;
        AnonymousClass0560 anonymousClass05602 = new AnonymousClass0560("SHARE_LINK_FORM_LINK_EMPTY", 1, 1002);
        SHARE_LINK_FORM_LINK_EMPTY = anonymousClass05602;
        AnonymousClass0560[] anonymousClass0560Arr = {anonymousClass0560, anonymousClass05602};
        LLILLJJLI = anonymousClass0560Arr;
        LLILLL = new C2254308sP(anonymousClass0560Arr);
    }

    public static AnonymousClass0560[] values() {
        return (AnonymousClass0560[]) LLILLJJLI.clone();
    }

    public final int getNum() {
        return this.LL;
    }

    public static AnonymousClass0560 valueOf(String str) {
        return (AnonymousClass0560) C08FF.LIZ(AnonymousClass0560.class, str);
    }

    public AnonymousClass0560(String str, int i, int i2) {
        this.LL = i2;
    }
}
