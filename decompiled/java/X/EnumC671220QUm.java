package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QUm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC671220QUm {
    public static final EnumC671220QUm DISABLE_PAGE;
    public static final EnumC671220QUm DISABLE_REQUEST;
    public static final /* synthetic */ EnumC671220QUm[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC671220QUm NO_DISABLE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC671220QUm> getEntries() {
        return LLILLL;
    }

    static {
        EnumC671220QUm enumC671220QUm = new EnumC671220QUm("NO_DISABLE", 0, CardStruct.IStatusCode.DEFAULT);
        NO_DISABLE = enumC671220QUm;
        EnumC671220QUm enumC671220QUm2 = new EnumC671220QUm("DISABLE_REQUEST", 1, "1");
        DISABLE_REQUEST = enumC671220QUm2;
        EnumC671220QUm enumC671220QUm3 = new EnumC671220QUm("DISABLE_PAGE", 2, "2");
        DISABLE_PAGE = enumC671220QUm3;
        EnumC671220QUm[] enumC671220QUmArr = {enumC671220QUm, enumC671220QUm2, enumC671220QUm3};
        LLILLJJLI = enumC671220QUmArr;
        LLILLL = new C2254308sP(enumC671220QUmArr);
    }

    public static EnumC671220QUm[] values() {
        return (EnumC671220QUm[]) LLILLJJLI.clone();
    }

    public final String getStrategy() {
        return this.LL;
    }

    public static EnumC671220QUm valueOf(String str) {
        return (EnumC671220QUm) C08FF.LIZ(EnumC671220QUm.class, str);
    }

    public EnumC671220QUm(String str, int i, String str2) {
        this.LL = str2;
    }
}
