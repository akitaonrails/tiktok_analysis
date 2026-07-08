package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qm7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1562970qm7 {
    public static final EnumC1562970qm7 DEFAULT;
    public static final EnumC1562970qm7 FIRST_RECHARGE;
    public static final EnumC1562970qm7 FROM_SWITCH;
    public static final /* synthetic */ EnumC1562970qm7[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1562970qm7> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1562970qm7 enumC1562970qm7 = new EnumC1562970qm7(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1562970qm7;
        EnumC1562970qm7 enumC1562970qm72 = new EnumC1562970qm7("FROM_SWITCH", 1);
        FROM_SWITCH = enumC1562970qm72;
        EnumC1562970qm7 enumC1562970qm73 = new EnumC1562970qm7("FIRST_RECHARGE", 2);
        FIRST_RECHARGE = enumC1562970qm73;
        EnumC1562970qm7[] enumC1562970qm7Arr = {enumC1562970qm7, enumC1562970qm72, enumC1562970qm73};
        LL = enumC1562970qm7Arr;
        LLILLJJLI = new C2254308sP(enumC1562970qm7Arr);
    }

    public static EnumC1562970qm7[] values() {
        return (EnumC1562970qm7[]) LL.clone();
    }

    public static EnumC1562970qm7 valueOf(String str) {
        return (EnumC1562970qm7) C08FF.LIZ(EnumC1562970qm7.class, str);
    }

    public EnumC1562970qm7(String str, int i) {
    }
}
