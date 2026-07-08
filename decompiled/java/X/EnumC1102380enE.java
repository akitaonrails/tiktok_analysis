package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0enE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1102380enE {
    public static final EnumC1102380enE ALL_CHECK_PASSED;
    public static final EnumC1102380enE FC_DISABLED;
    public static final /* synthetic */ EnumC1102380enE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1102380enE NO_ANCHOR_FC_HANDLER;
    public static final EnumC1102380enE NO_DATA_CHANNEL;
    public static final EnumC1102380enE NO_ROOM_ID;
    public static final EnumC1102380enE NO_VIEWER_FC_HANDLER;
    public static final EnumC1102380enE QUOTA_CHECK_EXEMPTED;
    public static final EnumC1102380enE QUOTA_MAPPING_NOT_INITIALIZED;
    public static final EnumC1102380enE QUOTA_NOT_CONFIGURED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1102380enE> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1102380enE enumC1102380enE = new EnumC1102380enE("NO_DATA_CHANNEL", 0, "dataChannel is null");
        NO_DATA_CHANNEL = enumC1102380enE;
        EnumC1102380enE enumC1102380enE2 = new EnumC1102380enE("FC_DISABLED", 1, "frequency control is disabled");
        FC_DISABLED = enumC1102380enE2;
        EnumC1102380enE enumC1102380enE3 = new EnumC1102380enE("NO_ROOM_ID", 2, "no room id");
        NO_ROOM_ID = enumC1102380enE3;
        EnumC1102380enE enumC1102380enE4 = new EnumC1102380enE("NO_ANCHOR_FC_HANDLER", 3, "no anchor fc handler");
        NO_ANCHOR_FC_HANDLER = enumC1102380enE4;
        EnumC1102380enE enumC1102380enE5 = new EnumC1102380enE("NO_VIEWER_FC_HANDLER", 4, "no viewer fc handler");
        NO_VIEWER_FC_HANDLER = enumC1102380enE5;
        EnumC1102380enE enumC1102380enE6 = new EnumC1102380enE("QUOTA_MAPPING_NOT_INITIALIZED", 5, "quota mapping is not initialized");
        QUOTA_MAPPING_NOT_INITIALIZED = enumC1102380enE6;
        EnumC1102380enE enumC1102380enE7 = new EnumC1102380enE("QUOTA_NOT_CONFIGURED", 6, "quota is not configured");
        QUOTA_NOT_CONFIGURED = enumC1102380enE7;
        EnumC1102380enE enumC1102380enE8 = new EnumC1102380enE("QUOTA_CHECK_EXEMPTED", 7, "quota check is exempted");
        QUOTA_CHECK_EXEMPTED = enumC1102380enE8;
        EnumC1102380enE enumC1102380enE9 = new EnumC1102380enE("ALL_CHECK_PASSED", 8, "all check passed");
        ALL_CHECK_PASSED = enumC1102380enE9;
        EnumC1102380enE[] enumC1102380enEArr = {enumC1102380enE, enumC1102380enE2, enumC1102380enE3, enumC1102380enE4, enumC1102380enE5, enumC1102380enE6, enumC1102380enE7, enumC1102380enE8, enumC1102380enE9};
        LLILLJJLI = enumC1102380enEArr;
        LLILLL = new C2254308sP(enumC1102380enEArr);
    }

    public static EnumC1102380enE[] values() {
        return (EnumC1102380enE[]) LLILLJJLI.clone();
    }

    public final String getDesc() {
        return this.LL;
    }

    public static EnumC1102380enE valueOf(String str) {
        return (EnumC1102380enE) C08FF.LIZ(EnumC1102380enE.class, str);
    }

    public EnumC1102380enE(String str, int i, String str2) {
        this.LL = str2;
    }
}
