package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L9L, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L9L {
    public static final /* synthetic */ C0L9L[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final C0L9L WIDTH_HEIGHT_1_1;
    public static final C0L9L WIDTH_HEIGHT_9_16;
    public final float LL;
    public final float LLILLJJLI;

    public static InterfaceC2044707zh<C0L9L> getEntries() {
        return LLILZ;
    }

    static {
        C0L9L c0l9l = new C0L9L(9.0f, 16.0f, 0, "WIDTH_HEIGHT_9_16");
        WIDTH_HEIGHT_9_16 = c0l9l;
        C0L9L c0l9l2 = new C0L9L(1.0f, 1.0f, 1, "WIDTH_HEIGHT_1_1");
        WIDTH_HEIGHT_1_1 = c0l9l2;
        C0L9L[] c0l9lArr = {c0l9l, c0l9l2};
        LLILLL = c0l9lArr;
        LLILZ = new C2254308sP(c0l9lArr);
    }

    public static C0L9L[] values() {
        return (C0L9L[]) LLILLL.clone();
    }

    public final float widthToHeightRatio() {
        return this.LL / this.LLILLJJLI;
    }

    public final float getHeightRatio() {
        return this.LLILLJJLI;
    }

    public final float getWidthRatio() {
        return this.LL;
    }

    public static C0L9L valueOf(String str) {
        return (C0L9L) C08FF.LIZ(C0L9L.class, str);
    }

    public C0L9L(float f, float f2, int i, String str) {
        this.LL = f;
        this.LLILLJJLI = f2;
    }
}
