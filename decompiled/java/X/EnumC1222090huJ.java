package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0huJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1222090huJ {
    public static final EnumC1222090huJ CANCEL;
    public static final EnumC1222090huJ CLICK_ON_FOR_MORE_INFORMATION;
    public static final EnumC1222090huJ GO_BACK;
    public static final EnumC1222090huJ GO_BACK_TO_HOMEPAGE;
    public static final /* synthetic */ EnumC1222090huJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1222090huJ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1222090huJ enumC1222090huJ = new EnumC1222090huJ("CANCEL", 0, CardStruct.IStatusCode.DEFAULT);
        CANCEL = enumC1222090huJ;
        EnumC1222090huJ enumC1222090huJ2 = new EnumC1222090huJ("CLICK_ON_FOR_MORE_INFORMATION", 1, "1");
        CLICK_ON_FOR_MORE_INFORMATION = enumC1222090huJ2;
        EnumC1222090huJ enumC1222090huJ3 = new EnumC1222090huJ("GO_BACK", 2, "2");
        GO_BACK = enumC1222090huJ3;
        EnumC1222090huJ enumC1222090huJ4 = new EnumC1222090huJ("GO_BACK_TO_HOMEPAGE", 3, "3");
        GO_BACK_TO_HOMEPAGE = enumC1222090huJ4;
        EnumC1222090huJ[] enumC1222090huJArr = {enumC1222090huJ, enumC1222090huJ2, enumC1222090huJ3, enumC1222090huJ4};
        LLILLJJLI = enumC1222090huJArr;
        LLILLL = new C2254308sP(enumC1222090huJArr);
    }

    public static EnumC1222090huJ[] values() {
        return (EnumC1222090huJ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1222090huJ valueOf(String str) {
        return (EnumC1222090huJ) C08FF.LIZ(EnumC1222090huJ.class, str);
    }

    public EnumC1222090huJ(String str, int i, String str2) {
        this.LL = str2;
    }
}
