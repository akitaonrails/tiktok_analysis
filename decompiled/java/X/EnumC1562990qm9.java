package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qm9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1562990qm9 {
    public static final C1563000qmA Companion;
    public static final EnumC1562990qm9 DEFAULT;
    public static final /* synthetic */ EnumC1562990qm9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1562990qm9 NON_DEFAULT;
    public static final EnumC1562990qm9 NO_SWITCH_OPTION;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1562990qm9> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0qmA] */
    static {
        EnumC1562990qm9 enumC1562990qm9 = new EnumC1562990qm9(LivePreviewCTASmartDisplayManager.DEFAULT, 0, "default");
        DEFAULT = enumC1562990qm9;
        EnumC1562990qm9 enumC1562990qm92 = new EnumC1562990qm9("NON_DEFAULT", 1, "non_default");
        NON_DEFAULT = enumC1562990qm92;
        EnumC1562990qm9 enumC1562990qm93 = new EnumC1562990qm9("NO_SWITCH_OPTION", 2, "no_switch_option");
        NO_SWITCH_OPTION = enumC1562990qm93;
        EnumC1562990qm9[] enumC1562990qm9Arr = {enumC1562990qm9, enumC1562990qm92, enumC1562990qm93};
        LLILLJJLI = enumC1562990qm9Arr;
        LLILLL = new C2254308sP(enumC1562990qm9Arr);
        Companion = new Object() { // from class: X.0qmA
        };
    }

    public static EnumC1562990qm9[] values() {
        return (EnumC1562990qm9[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1562990qm9 valueOf(String str) {
        return (EnumC1562990qm9) C08FF.LIZ(EnumC1562990qm9.class, str);
    }

    public EnumC1562990qm9(String str, int i, String str2) {
        this.LL = str2;
    }
}
