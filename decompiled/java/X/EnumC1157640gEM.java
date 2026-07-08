package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gEM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1157640gEM {
    public static final /* synthetic */ EnumC1157640gEM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1157640gEM REVIEW_ALL_TAG;
    public static final EnumC1157640gEM REVIEW_NEGATIVE;
    public static final EnumC1157640gEM REVIEW_RECENT;
    public static final EnumC1157640gEM REVIEW_WITH_IMAGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1157640gEM> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1157640gEM enumC1157640gEM = new EnumC1157640gEM("REVIEW_ALL_TAG", 0, CardStruct.IStatusCode.DEFAULT);
        REVIEW_ALL_TAG = enumC1157640gEM;
        EnumC1157640gEM enumC1157640gEM2 = new EnumC1157640gEM("REVIEW_WITH_IMAGE", 1, "1");
        REVIEW_WITH_IMAGE = enumC1157640gEM2;
        EnumC1157640gEM enumC1157640gEM3 = new EnumC1157640gEM("REVIEW_NEGATIVE", 2, "2");
        REVIEW_NEGATIVE = enumC1157640gEM3;
        EnumC1157640gEM enumC1157640gEM4 = new EnumC1157640gEM("REVIEW_RECENT", 3, "3");
        REVIEW_RECENT = enumC1157640gEM4;
        EnumC1157640gEM[] enumC1157640gEMArr = {enumC1157640gEM, enumC1157640gEM2, enumC1157640gEM3, enumC1157640gEM4};
        LLILLJJLI = enumC1157640gEMArr;
        LLILLL = new C2254308sP(enumC1157640gEMArr);
    }

    public static EnumC1157640gEM[] values() {
        return (EnumC1157640gEM[]) LLILLJJLI.clone();
    }

    public final String getId() {
        return this.LL;
    }

    public static EnumC1157640gEM valueOf(String str) {
        return (EnumC1157640gEM) C08FF.LIZ(EnumC1157640gEM.class, str);
    }

    public EnumC1157640gEM(String str, int i, String str2) {
        this.LL = str2;
    }
}
