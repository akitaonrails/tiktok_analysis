package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0atm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC952680atm {
    public static final EnumC952680atm DEFAULT;
    public static final /* synthetic */ EnumC952680atm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC952680atm SINGLE_VIEWMODE;
    public static final EnumC952680atm SINGLE_VIEWMODE_V2;

    public static InterfaceC2044707zh<EnumC952680atm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC952680atm enumC952680atm = new EnumC952680atm(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC952680atm;
        EnumC952680atm enumC952680atm2 = new EnumC952680atm("SINGLE_VIEWMODE", 1);
        SINGLE_VIEWMODE = enumC952680atm2;
        EnumC952680atm enumC952680atm3 = new EnumC952680atm("SINGLE_VIEWMODE_V2", 2);
        SINGLE_VIEWMODE_V2 = enumC952680atm3;
        EnumC952680atm[] enumC952680atmArr = {enumC952680atm, enumC952680atm2, enumC952680atm3};
        LL = enumC952680atmArr;
        LLILLJJLI = new C2254308sP(enumC952680atmArr);
    }

    public static EnumC952680atm[] values() {
        return (EnumC952680atm[]) LL.clone();
    }

    public static EnumC952680atm valueOf(String str) {
        return (EnumC952680atm) C08FF.LIZ(EnumC952680atm.class, str);
    }

    public EnumC952680atm(String str, int i) {
    }
}
