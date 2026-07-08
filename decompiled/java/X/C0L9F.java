package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L9F, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L9F {
    public static final C0L9F AI;
    public static final C0L9F CAMERA;
    public static final /* synthetic */ C0L9F[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0L9F MEDIA_STORE;
    public static final C0L9F PHOTO_PICKER;
    public final int LL;

    public static InterfaceC2044707zh<C0L9F> getEntries() {
        return LLILLL;
    }

    static {
        C0L9F c0l9f = new C0L9F("MEDIA_STORE", 0, 0);
        MEDIA_STORE = c0l9f;
        C0L9F c0l9f2 = new C0L9F("PHOTO_PICKER", 1, 1);
        PHOTO_PICKER = c0l9f2;
        C0L9F c0l9f3 = new C0L9F("CAMERA", 2, 3);
        CAMERA = c0l9f3;
        C0L9F c0l9f4 = new C0L9F("AI", 3, 4);
        AI = c0l9f4;
        C0L9F[] c0l9fArr = {c0l9f, c0l9f2, c0l9f3, c0l9f4};
        LLILLJJLI = c0l9fArr;
        LLILLL = new C2254308sP(c0l9fArr);
    }

    public static C0L9F[] values() {
        return (C0L9F[]) LLILLJJLI.clone();
    }

    public final int getKey() {
        return this.LL;
    }

    public static C0L9F valueOf(String str) {
        return (C0L9F) C08FF.LIZ(C0L9F.class, str);
    }

    public C0L9F(String str, int i, int i2) {
        this.LL = i2;
    }
}
