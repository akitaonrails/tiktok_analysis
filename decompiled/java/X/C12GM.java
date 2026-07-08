package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.12GM, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12GM {
    public static final C12GM ADD;
    public static final C12GM AI_COVER_GENERATING;
    public static final C12GM BLANK_SPACE;
    public static final /* synthetic */ C12GM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C12GM THUMBNAIL;
    public final int LL;

    public static InterfaceC2044707zh<C12GM> getEntries() {
        return LLILLL;
    }

    static {
        C12GM c12gm = new C12GM("THUMBNAIL", 0, 0);
        THUMBNAIL = c12gm;
        C12GM c12gm2 = new C12GM("ADD", 1, 1);
        ADD = c12gm2;
        C12GM c12gm3 = new C12GM("BLANK_SPACE", 2, 2);
        BLANK_SPACE = c12gm3;
        C12GM c12gm4 = new C12GM("AI_COVER_GENERATING", 3, 3);
        AI_COVER_GENERATING = c12gm4;
        C12GM[] c12gmArr = {c12gm, c12gm2, c12gm3, c12gm4};
        LLILLJJLI = c12gmArr;
        LLILLL = new C2254308sP(c12gmArr);
    }

    public static C12GM[] values() {
        return (C12GM[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C12GM valueOf(String str) {
        return (C12GM) C08FF.LIZ(C12GM.class, str);
    }

    public C12GM(String str, int i, int i2) {
        this.LL = i2;
    }
}
