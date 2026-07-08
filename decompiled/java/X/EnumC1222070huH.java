package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0huH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1222070huH {
    public static final EnumC1222070huH FAILED;
    public static final /* synthetic */ EnumC1222070huH[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1222070huH SUCCESS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1222070huH> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1222070huH enumC1222070huH = new EnumC1222070huH("FAILED", 0, CardStruct.IStatusCode.DEFAULT);
        FAILED = enumC1222070huH;
        EnumC1222070huH enumC1222070huH2 = new EnumC1222070huH("SUCCESS", 1, "1");
        SUCCESS = enumC1222070huH2;
        EnumC1222070huH[] enumC1222070huHArr = {enumC1222070huH, enumC1222070huH2};
        LLILLJJLI = enumC1222070huHArr;
        LLILLL = new C2254308sP(enumC1222070huHArr);
    }

    public static EnumC1222070huH[] values() {
        return (EnumC1222070huH[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1222070huH valueOf(String str) {
        return (EnumC1222070huH) C08FF.LIZ(EnumC1222070huH.class, str);
    }

    public EnumC1222070huH(String str, int i, String str2) {
        this.LL = str2;
    }
}
