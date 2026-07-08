package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0d4M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1036120d4M {
    public static final EnumC1036120d4M DEFAULT;
    public static final EnumC1036120d4M FULLSCREEN_IMMERSION;
    public static final EnumC1036120d4M FULLSCREEN_NON_IMMERSION;
    public static final /* synthetic */ EnumC1036120d4M[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1036120d4M SPLIT_SCREEN_IMMERSION;
    public static final EnumC1036120d4M SPLIT_SCREEN_NON_IMMERSION;

    public static InterfaceC2044707zh<EnumC1036120d4M> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1036120d4M enumC1036120d4M = new EnumC1036120d4M("FULLSCREEN_IMMERSION", 0);
        FULLSCREEN_IMMERSION = enumC1036120d4M;
        EnumC1036120d4M enumC1036120d4M2 = new EnumC1036120d4M("FULLSCREEN_NON_IMMERSION", 1);
        FULLSCREEN_NON_IMMERSION = enumC1036120d4M2;
        EnumC1036120d4M enumC1036120d4M3 = new EnumC1036120d4M("SPLIT_SCREEN_IMMERSION", 2);
        SPLIT_SCREEN_IMMERSION = enumC1036120d4M3;
        EnumC1036120d4M enumC1036120d4M4 = new EnumC1036120d4M("SPLIT_SCREEN_NON_IMMERSION", 3);
        SPLIT_SCREEN_NON_IMMERSION = enumC1036120d4M4;
        EnumC1036120d4M enumC1036120d4M5 = new EnumC1036120d4M(LivePreviewCTASmartDisplayManager.DEFAULT, 4);
        DEFAULT = enumC1036120d4M5;
        EnumC1036120d4M[] enumC1036120d4MArr = {enumC1036120d4M, enumC1036120d4M2, enumC1036120d4M3, enumC1036120d4M4, enumC1036120d4M5};
        LL = enumC1036120d4MArr;
        LLILLJJLI = new C2254308sP(enumC1036120d4MArr);
    }

    public static EnumC1036120d4M[] values() {
        return (EnumC1036120d4M[]) LL.clone();
    }

    public final boolean isFullScreen() {
        return this == FULLSCREEN_IMMERSION || this == FULLSCREEN_NON_IMMERSION;
    }

    public final boolean isImmersion() {
        return this == FULLSCREEN_IMMERSION || this == SPLIT_SCREEN_IMMERSION;
    }

    public final boolean isNonImmersion() {
        return this == FULLSCREEN_NON_IMMERSION || this == SPLIT_SCREEN_NON_IMMERSION;
    }

    public final boolean isSplitScreen() {
        return this == SPLIT_SCREEN_IMMERSION || this == SPLIT_SCREEN_NON_IMMERSION;
    }

    public static EnumC1036120d4M valueOf(String str) {
        return (EnumC1036120d4M) C08FF.LIZ(EnumC1036120d4M.class, str);
    }

    public EnumC1036120d4M(String str, int i) {
    }
}
