package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0THq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC744320THq {
    public static final /* synthetic */ EnumC744320THq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC744320THq image;
    public static final EnumC744320THq video;

    public static InterfaceC2044707zh<EnumC744320THq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC744320THq enumC744320THq = new EnumC744320THq("video", 0);
        video = enumC744320THq;
        EnumC744320THq enumC744320THq2 = new EnumC744320THq("image", 1);
        image = enumC744320THq2;
        EnumC744320THq[] enumC744320THqArr = {enumC744320THq, enumC744320THq2};
        LL = enumC744320THqArr;
        LLILLJJLI = new C2254308sP(enumC744320THqArr);
    }

    public static EnumC744320THq[] values() {
        return (EnumC744320THq[]) LL.clone();
    }

    public static EnumC744320THq valueOf(String str) {
        return (EnumC744320THq) C08FF.LIZ(EnumC744320THq.class, str);
    }

    public EnumC744320THq(String str, int i) {
    }
}
