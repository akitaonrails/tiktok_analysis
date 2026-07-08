package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UbO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC775440UbO {
    public static final EnumC775440UbO DEFAULT;
    public static final EnumC775440UbO INIT_END;
    public static final /* synthetic */ EnumC775440UbO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC775440UbO START_INIT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC775440UbO> getEntries() {
        return LLILLL;
    }

    static {
        EnumC775440UbO enumC775440UbO = new EnumC775440UbO(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC775440UbO;
        EnumC775440UbO enumC775440UbO2 = new EnumC775440UbO("START_INIT", 1, 1);
        START_INIT = enumC775440UbO2;
        EnumC775440UbO enumC775440UbO3 = new EnumC775440UbO("INIT_END", 2, 2);
        INIT_END = enumC775440UbO3;
        EnumC775440UbO[] enumC775440UbOArr = {enumC775440UbO, enumC775440UbO2, enumC775440UbO3};
        LLILLJJLI = enumC775440UbOArr;
        LLILLL = new C2254308sP(enumC775440UbOArr);
    }

    public static EnumC775440UbO[] values() {
        return (EnumC775440UbO[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC775440UbO valueOf(String str) {
        return (EnumC775440UbO) C08FF.LIZ(EnumC775440UbO.class, str);
    }

    public EnumC775440UbO(String str, int i, int i2) {
        this.LL = i2;
    }
}
