package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0H8g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC436120H8g {
    public static final C436130H8h Companion;
    public static final EnumC436120H8g DEFAULT;
    public static final /* synthetic */ EnumC436120H8g[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC436120H8g RECIPE;
    public static final EnumC436120H8g RENDERED_KEYFRAME;
    public final int LL;

    public static InterfaceC2044707zh<EnumC436120H8g> getEntries() {
        return LLILLL;
    }

    static {
        EnumC436120H8g enumC436120H8g = new EnumC436120H8g(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC436120H8g;
        EnumC436120H8g enumC436120H8g2 = new EnumC436120H8g("RECIPE", 1, 1);
        RECIPE = enumC436120H8g2;
        EnumC436120H8g enumC436120H8g3 = new EnumC436120H8g("RENDERED_KEYFRAME", 2, 2);
        RENDERED_KEYFRAME = enumC436120H8g3;
        EnumC436120H8g[] enumC436120H8gArr = {enumC436120H8g, enumC436120H8g2, enumC436120H8g3};
        LLILLJJLI = enumC436120H8gArr;
        LLILLL = new C2254308sP(enumC436120H8gArr);
        Companion = new C436130H8h();
    }

    public static EnumC436120H8g[] values() {
        return (EnumC436120H8g[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC436120H8g valueOf(String str) {
        return (EnumC436120H8g) C08FF.LIZ(EnumC436120H8g.class, str);
    }

    public EnumC436120H8g(String str, int i, int i2) {
        this.LL = i2;
    }
}
