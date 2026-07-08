package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0kcs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1326600kcs {
    public static final EnumC1326600kcs LLILLL;
    public static final EnumC1326600kcs LLILZ;
    public static final EnumC1326600kcs LLILZIL;
    public static final /* synthetic */ EnumC1326600kcs[] LLILZLL;
    public final String LL;
    public final String LLILLJJLI;

    static {
        EnumC1326600kcs enumC1326600kcs = new EnumC1326600kcs(LivePreviewCTASmartDisplayManager.DEFAULT, 0, "default", null);
        LLILLL = enumC1326600kcs;
        EnumC1326600kcs enumC1326600kcs2 = new EnumC1326600kcs("MAIN", 1, "main", "ecom_main_cache");
        LLILZ = enumC1326600kcs2;
        EnumC1326600kcs enumC1326600kcs3 = new EnumC1326600kcs("OPERATION", 2, "operation", "ecom_operation_cache");
        LLILZIL = enumC1326600kcs3;
        EnumC1326600kcs[] enumC1326600kcsArr = {enumC1326600kcs, enumC1326600kcs2, enumC1326600kcs3};
        LLILZLL = enumC1326600kcsArr;
        new C2254308sP(enumC1326600kcsArr);
    }

    public static EnumC1326600kcs[] values() {
        return (EnumC1326600kcs[]) LLILZLL.clone();
    }

    public static EnumC1326600kcs valueOf(String str) {
        return (EnumC1326600kcs) C08FF.LIZ(EnumC1326600kcs.class, str);
    }

    public EnumC1326600kcs(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
