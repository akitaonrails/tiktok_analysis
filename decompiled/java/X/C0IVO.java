package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0IVO, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IVO {
    public static final C0IVO COLD_START;
    public static final C0IVO FOLLOW_SCENE;
    public static final /* synthetic */ C0IVO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C0IVO> getEntries() {
        return LLILLL;
    }

    static {
        C0IVO c0ivo = new C0IVO("COLD_START", 0, "cold_start");
        COLD_START = c0ivo;
        C0IVO c0ivo2 = new C0IVO("FOLLOW_SCENE", 1, "follow_scene");
        FOLLOW_SCENE = c0ivo2;
        C0IVO[] c0ivoArr = {c0ivo, c0ivo2};
        LLILLJJLI = c0ivoArr;
        LLILLL = new C2254308sP(c0ivoArr);
    }

    public static C0IVO[] values() {
        return (C0IVO[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static C0IVO valueOf(String str) {
        return (C0IVO) C08FF.LIZ(C0IVO.class, str);
    }

    public C0IVO(String str, int i, String str2) {
        this.LL = str2;
    }
}
