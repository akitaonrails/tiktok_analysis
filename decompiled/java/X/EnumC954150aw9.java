package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aw9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC954150aw9 {
    public static final EnumC954150aw9 CACHE;
    public static final EnumC954150aw9 DEFAULT;
    public static final EnumC954150aw9 HISTORY;
    public static final /* synthetic */ EnumC954150aw9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC954150aw9> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC954150aw9 enumC954150aw9 = new EnumC954150aw9("HISTORY", 0);
        HISTORY = enumC954150aw9;
        EnumC954150aw9 enumC954150aw92 = new EnumC954150aw9(LivePreviewCTASmartDisplayManager.DEFAULT, 1);
        DEFAULT = enumC954150aw92;
        EnumC954150aw9 enumC954150aw93 = new EnumC954150aw9("CACHE", 2);
        CACHE = enumC954150aw93;
        EnumC954150aw9[] enumC954150aw9Arr = {enumC954150aw9, enumC954150aw92, enumC954150aw93};
        LL = enumC954150aw9Arr;
        LLILLJJLI = new C2254308sP(enumC954150aw9Arr);
    }

    public static EnumC954150aw9[] values() {
        return (EnumC954150aw9[]) LL.clone();
    }

    public static EnumC954150aw9 valueOf(String str) {
        return (EnumC954150aw9) C08FF.LIZ(EnumC954150aw9.class, str);
    }

    public EnumC954150aw9(String str, int i) {
    }
}
