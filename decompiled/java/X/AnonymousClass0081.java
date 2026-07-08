package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0081, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0081 {
    public static final /* synthetic */ AnonymousClass0081[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final AnonymousClass0081 PROMOTION_BADGE_ICON_HOT;
    public static final AnonymousClass0081 PROMOTION_BADGE_ICON_UNSPECIFIED;
    public final int LL;

    public static InterfaceC2044707zh<AnonymousClass0081> getEntries() {
        return LLILLL;
    }

    static {
        AnonymousClass0081 anonymousClass0081 = new AnonymousClass0081("PROMOTION_BADGE_ICON_UNSPECIFIED", 0, 0);
        PROMOTION_BADGE_ICON_UNSPECIFIED = anonymousClass0081;
        AnonymousClass0081 anonymousClass00812 = new AnonymousClass0081("PROMOTION_BADGE_ICON_HOT", 1, 1);
        PROMOTION_BADGE_ICON_HOT = anonymousClass00812;
        AnonymousClass0081[] anonymousClass0081Arr = {anonymousClass0081, anonymousClass00812};
        LLILLJJLI = anonymousClass0081Arr;
        LLILLL = new C2254308sP(anonymousClass0081Arr);
    }

    public static AnonymousClass0081[] values() {
        return (AnonymousClass0081[]) LLILLJJLI.clone();
    }

    public final int getProtoValue() {
        return this.LL;
    }

    public static AnonymousClass0081 valueOf(String str) {
        return (AnonymousClass0081) C08FF.LIZ(AnonymousClass0081.class, str);
    }

    public AnonymousClass0081(String str, int i, int i2) {
        this.LL = i2;
    }
}
