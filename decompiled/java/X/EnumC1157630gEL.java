package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gEL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1157630gEL {
    public static final EnumC1157630gEL DEFAULT;
    public static final /* synthetic */ EnumC1157630gEL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1157630gEL PANGLE;
    public static final EnumC1157630gEL SHARE;
    public static final EnumC1157630gEL UG;
    public static final EnumC1157630gEL VSA;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1157630gEL> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1157630gEL enumC1157630gEL = new EnumC1157630gEL(LivePreviewCTASmartDisplayManager.DEFAULT, 0, CardStruct.IStatusCode.DEFAULT);
        DEFAULT = enumC1157630gEL;
        EnumC1157630gEL enumC1157630gEL2 = new EnumC1157630gEL("VSA", 1, "1");
        VSA = enumC1157630gEL2;
        EnumC1157630gEL enumC1157630gEL3 = new EnumC1157630gEL("UG", 2, "2");
        UG = enumC1157630gEL3;
        EnumC1157630gEL enumC1157630gEL4 = new EnumC1157630gEL("PANGLE", 3, "3");
        PANGLE = enumC1157630gEL4;
        EnumC1157630gEL enumC1157630gEL5 = new EnumC1157630gEL("SHARE", 4, "4");
        SHARE = enumC1157630gEL5;
        EnumC1157630gEL[] enumC1157630gELArr = {enumC1157630gEL, enumC1157630gEL2, enumC1157630gEL3, enumC1157630gEL4, enumC1157630gEL5};
        LLILLJJLI = enumC1157630gELArr;
        LLILLL = new C2254308sP(enumC1157630gELArr);
    }

    public static EnumC1157630gEL[] values() {
        return (EnumC1157630gEL[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1157630gEL valueOf(String str) {
        return (EnumC1157630gEL) C08FF.LIZ(EnumC1157630gEL.class, str);
    }

    public EnumC1157630gEL(String str, int i, String str2) {
        this.LL = str2;
    }
}
