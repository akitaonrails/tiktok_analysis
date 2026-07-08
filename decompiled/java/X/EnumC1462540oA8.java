package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0oA8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1462540oA8 {
    public static final EnumC1462540oA8 APPLIED;
    public static final EnumC1462540oA8 DEFAULT;
    public static final /* synthetic */ EnumC1462540oA8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1462540oA8 PROGRESS;

    public static InterfaceC2044707zh<EnumC1462540oA8> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1462540oA8 enumC1462540oA8 = new EnumC1462540oA8(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1462540oA8;
        EnumC1462540oA8 enumC1462540oA82 = new EnumC1462540oA8("PROGRESS", 1);
        PROGRESS = enumC1462540oA82;
        EnumC1462540oA8 enumC1462540oA83 = new EnumC1462540oA8("APPLIED", 2);
        APPLIED = enumC1462540oA83;
        EnumC1462540oA8[] enumC1462540oA8Arr = {enumC1462540oA8, enumC1462540oA82, enumC1462540oA83};
        LL = enumC1462540oA8Arr;
        LLILLJJLI = new C2254308sP(enumC1462540oA8Arr);
    }

    public static EnumC1462540oA8[] values() {
        return (EnumC1462540oA8[]) LL.clone();
    }

    public static EnumC1462540oA8 valueOf(String str) {
        return (EnumC1462540oA8) C08FF.LIZ(EnumC1462540oA8.class, str);
    }

    public EnumC1462540oA8(String str, int i) {
    }
}
