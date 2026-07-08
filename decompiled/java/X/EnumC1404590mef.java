package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mef, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1404590mef {
    public static final EnumC1404590mef DEFAULT;
    public static final EnumC1404590mef DM_VIDEO;
    public static final EnumC1404590mef EDIT_SAVE_LOCAL;
    public static final /* synthetic */ EnumC1404590mef[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1404590mef RE_EDIT_IMAGE;
    public static final EnumC1404590mef TTEP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1404590mef> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1404590mef enumC1404590mef = new EnumC1404590mef(LivePreviewCTASmartDisplayManager.DEFAULT, 0, "default");
        DEFAULT = enumC1404590mef;
        EnumC1404590mef enumC1404590mef2 = new EnumC1404590mef("EDIT_SAVE_LOCAL", 1, "edit_save_local");
        EDIT_SAVE_LOCAL = enumC1404590mef2;
        EnumC1404590mef enumC1404590mef3 = new EnumC1404590mef("TTEP", 2, "ttep");
        TTEP = enumC1404590mef3;
        EnumC1404590mef enumC1404590mef4 = new EnumC1404590mef("DM_VIDEO", 3, "dm_video");
        DM_VIDEO = enumC1404590mef4;
        EnumC1404590mef enumC1404590mef5 = new EnumC1404590mef("RE_EDIT_IMAGE", 4, "re_edit_image");
        RE_EDIT_IMAGE = enumC1404590mef5;
        EnumC1404590mef[] enumC1404590mefArr = {enumC1404590mef, enumC1404590mef2, enumC1404590mef3, enumC1404590mef4, enumC1404590mef5};
        LLILLJJLI = enumC1404590mefArr;
        LLILLL = new C2254308sP(enumC1404590mefArr);
    }

    public static EnumC1404590mef[] values() {
        return (EnumC1404590mef[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1404590mef valueOf(String str) {
        return (EnumC1404590mef) C08FF.LIZ(EnumC1404590mef.class, str);
    }

    public EnumC1404590mef(String str, int i, String str2) {
        this.LL = str2;
    }
}
