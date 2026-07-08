package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HFK, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HFK {
    public static final /* synthetic */ C0HFK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0HFK SOCIAL_AVATAR;

    public static InterfaceC2044707zh<C0HFK> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0HFK c0hfk = new C0HFK();
        SOCIAL_AVATAR = c0hfk;
        C0HFK[] c0hfkArr = {c0hfk};
        LL = c0hfkArr;
        LLILLJJLI = new C2254308sP(c0hfkArr);
    }

    public static C0HFK[] values() {
        return (C0HFK[]) LL.clone();
    }

    public static C0HFK valueOf(String str) {
        return (C0HFK) C08FF.LIZ(C0HFK.class, str);
    }
}
