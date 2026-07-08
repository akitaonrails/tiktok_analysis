package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1220600hru {
    public static final EnumC1220600hru AUTHOR_COMMENT_PANEL;
    public static final EnumC1220600hru DEFAULT;
    public static final EnumC1220600hru FRIENDS_TAB_WATERFALL;
    public static final /* synthetic */ EnumC1220600hru[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1220600hru OFFLINE_COMMENT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1220600hru> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1220600hru enumC1220600hru = new EnumC1220600hru(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC1220600hru;
        EnumC1220600hru enumC1220600hru2 = new EnumC1220600hru("AUTHOR_COMMENT_PANEL", 1, 18);
        AUTHOR_COMMENT_PANEL = enumC1220600hru2;
        EnumC1220600hru enumC1220600hru3 = new EnumC1220600hru("FRIENDS_TAB_WATERFALL", 2, 28);
        FRIENDS_TAB_WATERFALL = enumC1220600hru3;
        EnumC1220600hru enumC1220600hru4 = new EnumC1220600hru("OFFLINE_COMMENT", 3, 33);
        OFFLINE_COMMENT = enumC1220600hru4;
        EnumC1220600hru[] enumC1220600hruArr = {enumC1220600hru, enumC1220600hru2, enumC1220600hru3, enumC1220600hru4};
        LLILLJJLI = enumC1220600hruArr;
        LLILLL = new C2254308sP(enumC1220600hruArr);
    }

    public static EnumC1220600hru[] values() {
        return (EnumC1220600hru[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1220600hru valueOf(String str) {
        return (EnumC1220600hru) C08FF.LIZ(EnumC1220600hru.class, str);
    }

    public EnumC1220600hru(String str, int i, int i2) {
        this.LL = i2;
    }
}
