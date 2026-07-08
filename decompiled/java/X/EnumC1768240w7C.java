package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0w7C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1768240w7C {
    public static final EnumC1768240w7C DEFAULT;
    public static final /* synthetic */ EnumC1768240w7C[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC1768240w7C REDDOT_DEFAULT;
    public static final EnumC1768240w7C REDDOT_STRONG_WILL;
    public static final EnumC1768240w7C REDDOT_WEAK_WILL;
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public static InterfaceC2044707zh<EnumC1768240w7C> getEntries() {
        return LLILZIL;
    }

    static {
        EnumC1768240w7C enumC1768240w7C = new EnumC1768240w7C(LivePreviewCTASmartDisplayManager.DEFAULT, 0, "default", "default", "default");
        DEFAULT = enumC1768240w7C;
        EnumC1768240w7C enumC1768240w7C2 = new EnumC1768240w7C("REDDOT_DEFAULT", 1, "reddot_default", "default", "reddot");
        REDDOT_DEFAULT = enumC1768240w7C2;
        EnumC1768240w7C enumC1768240w7C3 = new EnumC1768240w7C("REDDOT_STRONG_WILL", 2, "reddot_strong_will", "strong", "reddot_strong_will");
        REDDOT_STRONG_WILL = enumC1768240w7C3;
        EnumC1768240w7C enumC1768240w7C4 = new EnumC1768240w7C("REDDOT_WEAK_WILL", 3, "reddot_weak_will", "weak", "reddot_weak_will");
        REDDOT_WEAK_WILL = enumC1768240w7C4;
        EnumC1768240w7C[] enumC1768240w7CArr = {enumC1768240w7C, enumC1768240w7C2, enumC1768240w7C3, enumC1768240w7C4};
        LLILZ = enumC1768240w7CArr;
        LLILZIL = new C2254308sP(enumC1768240w7CArr);
    }

    public static EnumC1768240w7C[] values() {
        return (EnumC1768240w7C[]) LLILZ.clone();
    }

    public final String getDaParamsName() {
        return this.LLILLL;
    }

    public final String getSubStageForDa() {
        return this.LLILLJJLI;
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1768240w7C valueOf(String str) {
        return (EnumC1768240w7C) C08FF.LIZ(EnumC1768240w7C.class, str);
    }

    public EnumC1768240w7C(String str, int i, String str2, String str3, String str4) {
        this.LL = str2;
        this.LLILLJJLI = str3;
        this.LLILLL = str4;
    }
}
