package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0085, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0085 {
    public static final /* synthetic */ AnonymousClass0085[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final AnonymousClass0085 UPDATE_FIRST_SCREEN_DATA_INFO;
    public static final AnonymousClass0085 UPDATE_ZIP_BITMAP_INFO;
    public final String LL;

    public static InterfaceC2044707zh<AnonymousClass0085> getEntries() {
        return LLILLL;
    }

    static {
        AnonymousClass0085 anonymousClass0085 = new AnonymousClass0085("UPDATE_ZIP_BITMAP_INFO", 0, "zip_bitmap_info");
        UPDATE_ZIP_BITMAP_INFO = anonymousClass0085;
        AnonymousClass0085 anonymousClass00852 = new AnonymousClass0085("UPDATE_FIRST_SCREEN_DATA_INFO", 1, "update_first_screen_data_info");
        UPDATE_FIRST_SCREEN_DATA_INFO = anonymousClass00852;
        AnonymousClass0085[] anonymousClass0085Arr = {anonymousClass0085, anonymousClass00852};
        LLILLJJLI = anonymousClass0085Arr;
        LLILLL = new C2254308sP(anonymousClass0085Arr);
    }

    public static AnonymousClass0085[] values() {
        return (AnonymousClass0085[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static AnonymousClass0085 valueOf(String str) {
        return (AnonymousClass0085) C08FF.LIZ(AnonymousClass0085.class, str);
    }

    public AnonymousClass0085(String str, int i, String str2) {
        this.LL = str2;
    }
}
