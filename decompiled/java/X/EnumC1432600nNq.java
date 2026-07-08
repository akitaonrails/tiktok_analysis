package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0nNq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1432600nNq {
    public static final /* synthetic */ EnumC1432600nNq[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1432600nNq POST;
    public static final EnumC1432600nNq WATERMARK_MODERATION;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1432600nNq> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1432600nNq enumC1432600nNq = new EnumC1432600nNq("WATERMARK_MODERATION", 0, "watermark");
        WATERMARK_MODERATION = enumC1432600nNq;
        EnumC1432600nNq enumC1432600nNq2 = new EnumC1432600nNq("POST", 1, "post");
        POST = enumC1432600nNq2;
        EnumC1432600nNq[] enumC1432600nNqArr = {enumC1432600nNq, enumC1432600nNq2};
        LLILLJJLI = enumC1432600nNqArr;
        LLILLL = new C2254308sP(enumC1432600nNqArr);
    }

    public static EnumC1432600nNq[] values() {
        return (EnumC1432600nNq[]) LLILLJJLI.clone();
    }

    public final String getDesc() {
        return this.LL;
    }

    public static EnumC1432600nNq valueOf(String str) {
        return (EnumC1432600nNq) C08FF.LIZ(EnumC1432600nNq.class, str);
    }

    public EnumC1432600nNq(String str, int i, String str2) {
        this.LL = str2;
    }
}
