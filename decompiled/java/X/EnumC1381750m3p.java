package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0m3p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1381750m3p {
    public static final EnumC1381750m3p GROUP_MEMBER;
    public static final /* synthetic */ EnumC1381750m3p[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1381750m3p PRIVATE_MEDIA;
    public static final EnumC1381750m3p SHARED_COLLECTION;
    public static final EnumC1381750m3p SHARED_VIDEO;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1381750m3p> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1381750m3p enumC1381750m3p = new EnumC1381750m3p("SHARED_VIDEO", 0, "share_video_tab");
        SHARED_VIDEO = enumC1381750m3p;
        EnumC1381750m3p enumC1381750m3p2 = new EnumC1381750m3p("PRIVATE_MEDIA", 1, "private_video_tab");
        PRIVATE_MEDIA = enumC1381750m3p2;
        EnumC1381750m3p enumC1381750m3p3 = new EnumC1381750m3p("SHARED_COLLECTION", 2, "co_collection_tab");
        SHARED_COLLECTION = enumC1381750m3p3;
        EnumC1381750m3p enumC1381750m3p4 = new EnumC1381750m3p("GROUP_MEMBER", 3, "group_member_tab");
        GROUP_MEMBER = enumC1381750m3p4;
        EnumC1381750m3p[] enumC1381750m3pArr = {enumC1381750m3p, enumC1381750m3p2, enumC1381750m3p3, enumC1381750m3p4};
        LLILLJJLI = enumC1381750m3pArr;
        LLILLL = new C2254308sP(enumC1381750m3pArr);
    }

    public static EnumC1381750m3p[] values() {
        return (EnumC1381750m3p[]) LLILLJJLI.clone();
    }

    public final String getEtString() {
        return this.LL;
    }

    public static EnumC1381750m3p valueOf(String str) {
        return (EnumC1381750m3p) C08FF.LIZ(EnumC1381750m3p.class, str);
    }

    public EnumC1381750m3p(String str, int i, String str2) {
        this.LL = str2;
    }
}
