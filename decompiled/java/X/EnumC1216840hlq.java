package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hlq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1216840hlq {
    public static final EnumC1216840hlq INSTAGRAM;
    public static final /* synthetic */ EnumC1216840hlq[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1216840hlq TWITTER;
    public static final EnumC1216840hlq YOUTUBE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1216840hlq> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1216840hlq enumC1216840hlq = new EnumC1216840hlq("INSTAGRAM", 0, "instagram");
        INSTAGRAM = enumC1216840hlq;
        EnumC1216840hlq enumC1216840hlq2 = new EnumC1216840hlq("YOUTUBE", 1, "youtube");
        YOUTUBE = enumC1216840hlq2;
        EnumC1216840hlq enumC1216840hlq3 = new EnumC1216840hlq("TWITTER", 2, "twitter");
        TWITTER = enumC1216840hlq3;
        EnumC1216840hlq[] enumC1216840hlqArr = {enumC1216840hlq, enumC1216840hlq2, enumC1216840hlq3};
        LLILLJJLI = enumC1216840hlqArr;
        LLILLL = new C2254308sP(enumC1216840hlqArr);
    }

    public static EnumC1216840hlq[] values() {
        return (EnumC1216840hlq[]) LLILLJJLI.clone();
    }

    public final String getStrValue() {
        return this.LL;
    }

    public static EnumC1216840hlq valueOf(String str) {
        return (EnumC1216840hlq) C08FF.LIZ(EnumC1216840hlq.class, str);
    }

    public EnumC1216840hlq(String str, int i, String str2) {
        this.LL = str2;
    }
}
