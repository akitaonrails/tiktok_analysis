package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0huG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1222060huG {
    public static final EnumC1222060huG CANCEL;
    public static final EnumC1222060huG CLICK_ON_FOR_MORE_INFORMATION;
    public static final EnumC1222060huG GO_BACK;
    public static final /* synthetic */ EnumC1222060huG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1222060huG> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1222060huG enumC1222060huG = new EnumC1222060huG("CANCEL", 0, CardStruct.IStatusCode.DEFAULT);
        CANCEL = enumC1222060huG;
        EnumC1222060huG enumC1222060huG2 = new EnumC1222060huG("CLICK_ON_FOR_MORE_INFORMATION", 1, "1");
        CLICK_ON_FOR_MORE_INFORMATION = enumC1222060huG2;
        EnumC1222060huG enumC1222060huG3 = new EnumC1222060huG("GO_BACK", 2, "2");
        GO_BACK = enumC1222060huG3;
        EnumC1222060huG[] enumC1222060huGArr = {enumC1222060huG, enumC1222060huG2, enumC1222060huG3};
        LLILLJJLI = enumC1222060huGArr;
        LLILLL = new C2254308sP(enumC1222060huGArr);
    }

    public static EnumC1222060huG[] values() {
        return (EnumC1222060huG[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1222060huG valueOf(String str) {
        return (EnumC1222060huG) C08FF.LIZ(EnumC1222060huG.class, str);
    }

    public EnumC1222060huG(String str, int i, String str2) {
        this.LL = str2;
    }
}
