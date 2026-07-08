package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iFZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1235270iFZ {
    public static final EnumC1235270iFZ DIGITAL_0;
    public static final EnumC1235270iFZ DIGITAL_1;
    public static final /* synthetic */ EnumC1235270iFZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1235270iFZ NULL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1235270iFZ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1235270iFZ enumC1235270iFZ = new EnumC1235270iFZ("DIGITAL_0", 0, CardStruct.IStatusCode.DEFAULT);
        DIGITAL_0 = enumC1235270iFZ;
        EnumC1235270iFZ enumC1235270iFZ2 = new EnumC1235270iFZ("DIGITAL_1", 1, "1");
        DIGITAL_1 = enumC1235270iFZ2;
        EnumC1235270iFZ enumC1235270iFZ3 = new EnumC1235270iFZ("NULL", 2, "null");
        NULL = enumC1235270iFZ3;
        EnumC1235270iFZ[] enumC1235270iFZArr = {enumC1235270iFZ, enumC1235270iFZ2, enumC1235270iFZ3};
        LLILLJJLI = enumC1235270iFZArr;
        LLILLL = new C2254308sP(enumC1235270iFZArr);
    }

    public static EnumC1235270iFZ[] values() {
        return (EnumC1235270iFZ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1235270iFZ valueOf(String str) {
        return (EnumC1235270iFZ) C08FF.LIZ(EnumC1235270iFZ.class, str);
    }

    public EnumC1235270iFZ(String str, int i, String str2) {
        this.LL = str2;
    }
}
