package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Cxs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC330740Cxs {
    public static final /* synthetic */ EnumC330740Cxs[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC330740Cxs POST_LIKE_LIST;
    public static final EnumC330740Cxs POST_VIEWER_LIST;
    public static final EnumC330740Cxs STORY_VIEWER_LIST;

    public static InterfaceC2044707zh<EnumC330740Cxs> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC330740Cxs enumC330740Cxs = new EnumC330740Cxs("STORY_VIEWER_LIST", 0);
        STORY_VIEWER_LIST = enumC330740Cxs;
        EnumC330740Cxs enumC330740Cxs2 = new EnumC330740Cxs("POST_VIEWER_LIST", 1);
        POST_VIEWER_LIST = enumC330740Cxs2;
        EnumC330740Cxs enumC330740Cxs3 = new EnumC330740Cxs("POST_LIKE_LIST", 2);
        POST_LIKE_LIST = enumC330740Cxs3;
        EnumC330740Cxs[] enumC330740CxsArr = {enumC330740Cxs, enumC330740Cxs2, enumC330740Cxs3};
        LL = enumC330740CxsArr;
        LLILLJJLI = new C2254308sP(enumC330740CxsArr);
    }

    public static EnumC330740Cxs[] values() {
        return (EnumC330740Cxs[]) LL.clone();
    }

    public static EnumC330740Cxs valueOf(String str) {
        return (EnumC330740Cxs) C08FF.LIZ(EnumC330740Cxs.class, str);
    }

    public EnumC330740Cxs(String str, int i) {
    }
}
