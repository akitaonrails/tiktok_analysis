package X;

import com.bytedance.scene.Scene;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0S4S, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S4S {
    public static final C0S4S BOTTOM_TAB;
    public static final /* synthetic */ C0S4S[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0S4S SCENE_PAGE;
    public static final C0S4S TOP_PAGE;
    public static final C0S4S TOP_TAB;
    public final String LL;

    public static InterfaceC2044707zh<C0S4S> getEntries() {
        return LLILLL;
    }

    static {
        C0S4S c0s4s = new C0S4S("TOP_PAGE", 0, "page");
        TOP_PAGE = c0s4s;
        C0S4S c0s4s2 = new C0S4S("TOP_TAB", 1, "top");
        TOP_TAB = c0s4s2;
        C0S4S c0s4s3 = new C0S4S("BOTTOM_TAB", 2, "bottom");
        BOTTOM_TAB = c0s4s3;
        C0S4S c0s4s4 = new C0S4S("SCENE_PAGE", 3, Scene.SCENE_SERVICE);
        SCENE_PAGE = c0s4s4;
        C0S4S[] c0s4sArr = {c0s4s, c0s4s2, c0s4s3, c0s4s4};
        LLILLJJLI = c0s4sArr;
        LLILLL = new C2254308sP(c0s4sArr);
    }

    public static C0S4S[] values() {
        return (C0S4S[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static C0S4S valueOf(String str) {
        return (C0S4S) C08FF.LIZ(C0S4S.class, str);
    }

    public C0S4S(String str, int i, String str2) {
        this.LL = str2;
    }
}
