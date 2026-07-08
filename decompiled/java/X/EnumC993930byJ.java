package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0byJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993930byJ {
    public static final EnumC993930byJ DEFAULT;
    public static final EnumC993930byJ DEVELOPER_DARK;
    public static final EnumC993930byJ DEVELOPER_LIGHT;
    public static final /* synthetic */ EnumC993930byJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC993930byJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC993930byJ enumC993930byJ = new EnumC993930byJ(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC993930byJ;
        EnumC993930byJ enumC993930byJ2 = new EnumC993930byJ("DEVELOPER_LIGHT", 1);
        DEVELOPER_LIGHT = enumC993930byJ2;
        EnumC993930byJ enumC993930byJ3 = new EnumC993930byJ("DEVELOPER_DARK", 2);
        DEVELOPER_DARK = enumC993930byJ3;
        EnumC993930byJ[] enumC993930byJArr = {enumC993930byJ, enumC993930byJ2, enumC993930byJ3};
        LL = enumC993930byJArr;
        LLILLJJLI = new C2254308sP(enumC993930byJArr);
    }

    public static EnumC993930byJ[] values() {
        return (EnumC993930byJ[]) LL.clone();
    }

    public static EnumC993930byJ valueOf(String str) {
        return (EnumC993930byJ) C08FF.LIZ(EnumC993930byJ.class, str);
    }

    public EnumC993930byJ(String str, int i) {
    }
}
