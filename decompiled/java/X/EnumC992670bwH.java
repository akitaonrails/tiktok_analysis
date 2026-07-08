package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992670bwH {
    public static final EnumC992670bwH ALL_INVISIBLE;
    public static final EnumC992670bwH DEFAULT;
    public static final EnumC992670bwH DOCK_BAR;
    public static final /* synthetic */ EnumC992670bwH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC992670bwH MUSIC_AND_TOOLBAR;

    public static InterfaceC2044707zh<EnumC992670bwH> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992670bwH enumC992670bwH = new EnumC992670bwH(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC992670bwH;
        EnumC992670bwH enumC992670bwH2 = new EnumC992670bwH("ALL_INVISIBLE", 1);
        ALL_INVISIBLE = enumC992670bwH2;
        EnumC992670bwH enumC992670bwH3 = new EnumC992670bwH("MUSIC_AND_TOOLBAR", 2);
        MUSIC_AND_TOOLBAR = enumC992670bwH3;
        EnumC992670bwH enumC992670bwH4 = new EnumC992670bwH("DOCK_BAR", 3);
        DOCK_BAR = enumC992670bwH4;
        EnumC992670bwH[] enumC992670bwHArr = {enumC992670bwH, enumC992670bwH2, enumC992670bwH3, enumC992670bwH4};
        LL = enumC992670bwHArr;
        LLILLJJLI = new C2254308sP(enumC992670bwHArr);
    }

    public static EnumC992670bwH[] values() {
        return (EnumC992670bwH[]) LL.clone();
    }

    public static EnumC992670bwH valueOf(String str) {
        return (EnumC992670bwH) C08FF.LIZ(EnumC992670bwH.class, str);
    }

    public EnumC992670bwH(String str, int i) {
    }
}
