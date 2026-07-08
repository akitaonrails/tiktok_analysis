package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YGm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC871420YGm {
    public static final EnumC871420YGm GAP_FILLED;
    public static final EnumC871420YGm ITEM_QUEUED;
    public static final /* synthetic */ EnumC871420YGm[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC871420YGm RETRY_BUFFER_FULL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC871420YGm> getEntries() {
        return LLILLL;
    }

    static {
        EnumC871420YGm enumC871420YGm = new EnumC871420YGm("ITEM_QUEUED", 0, "item_queued");
        ITEM_QUEUED = enumC871420YGm;
        EnumC871420YGm enumC871420YGm2 = new EnumC871420YGm("GAP_FILLED", 1, "gap_filled");
        GAP_FILLED = enumC871420YGm2;
        EnumC871420YGm enumC871420YGm3 = new EnumC871420YGm("RETRY_BUFFER_FULL", 2, "retry_buffer_full");
        RETRY_BUFFER_FULL = enumC871420YGm3;
        EnumC871420YGm[] enumC871420YGmArr = {enumC871420YGm, enumC871420YGm2, enumC871420YGm3};
        LLILLJJLI = enumC871420YGmArr;
        LLILLL = new C2254308sP(enumC871420YGmArr);
    }

    public static EnumC871420YGm[] values() {
        return (EnumC871420YGm[]) LLILLJJLI.clone();
    }

    public final String getTitle() {
        return this.LL;
    }

    public static EnumC871420YGm valueOf(String str) {
        return (EnumC871420YGm) C08FF.LIZ(EnumC871420YGm.class, str);
    }

    public EnumC871420YGm(String str, int i, String str2) {
        this.LL = str2;
    }
}
