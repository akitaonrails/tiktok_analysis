package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05qM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1477205qM {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ EnumC1477205qM[] $VALUES;
    public final int value;
    public static final EnumC1477205qM UNKNOWN = new EnumC1477205qM("UNKNOWN", 0, -1);
    public static final EnumC1477205qM DEFAULT = new EnumC1477205qM(LivePreviewCTASmartDisplayManager.DEFAULT, 1, 0);
    public static final EnumC1477205qM SWITCH_BIZ_INBOX_MODE = new EnumC1477205qM("SWITCH_BIZ_INBOX_MODE", 2, 1);

    public static final /* synthetic */ EnumC1477205qM[] $values() {
        return new EnumC1477205qM[]{UNKNOWN, DEFAULT, SWITCH_BIZ_INBOX_MODE};
    }

    public static InterfaceC2044707zh<EnumC1477205qM> getEntries() {
        return $ENTRIES;
    }

    static {
        EnumC1477205qM[] enumC1477205qMArr$values = $values();
        $VALUES = enumC1477205qMArr$values;
        $ENTRIES = new C2254308sP(enumC1477205qMArr$values);
    }

    public static EnumC1477205qM[] values() {
        return (EnumC1477205qM[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static EnumC1477205qM valueOf(String str) {
        return (EnumC1477205qM) C08FF.LIZ(EnumC1477205qM.class, str);
    }

    public EnumC1477205qM(String str, int i, int i2) {
        this.value = i2;
    }
}
