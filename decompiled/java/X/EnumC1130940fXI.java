package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fXI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1130940fXI {
    public static final EnumC1130940fXI DEFAULT;
    public static final /* synthetic */ EnumC1130940fXI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1130940fXI PRICE_ASCEND;
    public static final EnumC1130940fXI PRICE_DESCEND;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1130940fXI> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1130940fXI enumC1130940fXI = new EnumC1130940fXI(LivePreviewCTASmartDisplayManager.DEFAULT, 0, "default");
        DEFAULT = enumC1130940fXI;
        EnumC1130940fXI enumC1130940fXI2 = new EnumC1130940fXI("PRICE_DESCEND", 1, "high_to_low");
        PRICE_DESCEND = enumC1130940fXI2;
        EnumC1130940fXI enumC1130940fXI3 = new EnumC1130940fXI("PRICE_ASCEND", 2, "low_to_high");
        PRICE_ASCEND = enumC1130940fXI3;
        EnumC1130940fXI[] enumC1130940fXIArr = {enumC1130940fXI, enumC1130940fXI2, enumC1130940fXI3};
        LLILLJJLI = enumC1130940fXIArr;
        LLILLL = new C2254308sP(enumC1130940fXIArr);
    }

    public static EnumC1130940fXI[] values() {
        return (EnumC1130940fXI[]) LLILLJJLI.clone();
    }

    public final EnumC1130940fXI nextState() {
        int i = C1130960fXK.LIZ[ordinal()];
        if (i == 1) {
            return PRICE_DESCEND;
        }
        if (i == 2) {
            return PRICE_ASCEND;
        }
        if (i == 3) {
            return DEFAULT;
        }
        throw new C1954807lC();
    }

    public final String getDescription() {
        return this.LL;
    }

    public static EnumC1130940fXI valueOf(String str) {
        return (EnumC1130940fXI) C08FF.LIZ(EnumC1130940fXI.class, str);
    }

    public EnumC1130940fXI(String str, int i, String str2) {
        this.LL = str2;
    }
}
