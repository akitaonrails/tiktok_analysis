package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iFY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1235260iFY {
    public static final EnumC1235260iFY DIGITAL_0;
    public static final EnumC1235260iFY DIGITAL_1;
    public static final /* synthetic */ EnumC1235260iFY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1235260iFY NULL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1235260iFY> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1235260iFY enumC1235260iFY = new EnumC1235260iFY("DIGITAL_0", 0, CardStruct.IStatusCode.DEFAULT);
        DIGITAL_0 = enumC1235260iFY;
        EnumC1235260iFY enumC1235260iFY2 = new EnumC1235260iFY("DIGITAL_1", 1, "1");
        DIGITAL_1 = enumC1235260iFY2;
        EnumC1235260iFY enumC1235260iFY3 = new EnumC1235260iFY("NULL", 2, "null");
        NULL = enumC1235260iFY3;
        EnumC1235260iFY[] enumC1235260iFYArr = {enumC1235260iFY, enumC1235260iFY2, enumC1235260iFY3};
        LLILLJJLI = enumC1235260iFYArr;
        LLILLL = new C2254308sP(enumC1235260iFYArr);
    }

    public static EnumC1235260iFY[] values() {
        return (EnumC1235260iFY[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1235260iFY valueOf(String str) {
        return (EnumC1235260iFY) C08FF.LIZ(EnumC1235260iFY.class, str);
    }

    public EnumC1235260iFY(String str, int i, String str2) {
        this.LL = str2;
    }
}
