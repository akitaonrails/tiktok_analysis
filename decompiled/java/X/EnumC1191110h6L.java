package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0h6L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1191110h6L {
    public static final EnumC1191110h6L DEFAULT;
    public static final EnumC1191110h6L HIGHLIGHT_DISSAPPEAR;
    public static final EnumC1191110h6L HIGHLIGHT_ONLY;
    public static final EnumC1191110h6L HIGHLIGHT_WITH_DISSAPPEAR_ON_TIME;
    public static final /* synthetic */ EnumC1191110h6L[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1191110h6L> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1191110h6L enumC1191110h6L = new EnumC1191110h6L(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1191110h6L;
        EnumC1191110h6L enumC1191110h6L2 = new EnumC1191110h6L("HIGHLIGHT_WITH_DISSAPPEAR_ON_TIME", 1);
        HIGHLIGHT_WITH_DISSAPPEAR_ON_TIME = enumC1191110h6L2;
        EnumC1191110h6L enumC1191110h6L3 = new EnumC1191110h6L("HIGHLIGHT_ONLY", 2);
        HIGHLIGHT_ONLY = enumC1191110h6L3;
        EnumC1191110h6L enumC1191110h6L4 = new EnumC1191110h6L("HIGHLIGHT_DISSAPPEAR", 3);
        HIGHLIGHT_DISSAPPEAR = enumC1191110h6L4;
        EnumC1191110h6L[] enumC1191110h6LArr = {enumC1191110h6L, enumC1191110h6L2, enumC1191110h6L3, enumC1191110h6L4};
        LL = enumC1191110h6LArr;
        LLILLJJLI = new C2254308sP(enumC1191110h6LArr);
    }

    public static EnumC1191110h6L[] values() {
        return (EnumC1191110h6L[]) LL.clone();
    }

    public static EnumC1191110h6L valueOf(String str) {
        return (EnumC1191110h6L) C08FF.LIZ(EnumC1191110h6L.class, str);
    }

    public EnumC1191110h6L(String str, int i) {
    }
}
