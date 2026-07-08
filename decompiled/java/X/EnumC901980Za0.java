package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Za0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC901980Za0 {
    public static final EnumC901980Za0 DEFAULT;
    public static final /* synthetic */ EnumC901980Za0[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC901980Za0 NUDE_MASK;

    public static InterfaceC2044707zh<EnumC901980Za0> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC901980Za0 enumC901980Za0 = new EnumC901980Za0(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC901980Za0;
        EnumC901980Za0 enumC901980Za02 = new EnumC901980Za0("NUDE_MASK", 1);
        NUDE_MASK = enumC901980Za02;
        EnumC901980Za0[] enumC901980Za0Arr = {enumC901980Za0, enumC901980Za02};
        LL = enumC901980Za0Arr;
        LLILLJJLI = new C2254308sP(enumC901980Za0Arr);
    }

    public static EnumC901980Za0[] values() {
        return (EnumC901980Za0[]) LL.clone();
    }

    public static EnumC901980Za0 valueOf(String str) {
        return (EnumC901980Za0) C08FF.LIZ(EnumC901980Za0.class, str);
    }

    public EnumC901980Za0(String str, int i) {
    }
}
