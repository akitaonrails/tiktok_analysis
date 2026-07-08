package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1A1K, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A1K {
    public static final C1A1K FRIENDS_STABLE_SHOW;
    public static final C1A1K LIKE_MUF_VIDEO;
    public static final /* synthetic */ C1A1K[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C1A1K NOT_SET;

    public static InterfaceC2044707zh<C1A1K> getEntries() {
        return LLILLJJLI;
    }

    static {
        C1A1K c1a1k = new C1A1K("LIKE_MUF_VIDEO", 0);
        LIKE_MUF_VIDEO = c1a1k;
        C1A1K c1a1k2 = new C1A1K("NOT_SET", 1);
        NOT_SET = c1a1k2;
        C1A1K c1a1k3 = new C1A1K("FRIENDS_STABLE_SHOW", 2);
        FRIENDS_STABLE_SHOW = c1a1k3;
        C1A1K[] c1a1kArr = {c1a1k, c1a1k2, c1a1k3};
        LL = c1a1kArr;
        LLILLJJLI = new C2254308sP(c1a1kArr);
    }

    public static C1A1K[] values() {
        return (C1A1K[]) LL.clone();
    }

    public final String toTriggerReason() {
        int i = C1A1L.LIZ[ordinal()];
        if (i == 1) {
            return "like_video";
        }
        if (i == 2) {
            return "quick_reply_muf_post";
        }
        if (i == 3) {
            return "";
        }
        throw new C1954807lC();
    }

    public static C1A1K valueOf(String str) {
        return (C1A1K) C08FF.LIZ(C1A1K.class, str);
    }

    public C1A1K(String str, int i) {
    }
}
