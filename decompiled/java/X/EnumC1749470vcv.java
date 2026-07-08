package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vcv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1749470vcv {
    public static final EnumC1749470vcv CONTACT_SHEET;
    public static final EnumC1749470vcv DEFAULT;
    public static final /* synthetic */ EnumC1749470vcv[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1749470vcv> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1749470vcv enumC1749470vcv = new EnumC1749470vcv(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1749470vcv;
        EnumC1749470vcv enumC1749470vcv2 = new EnumC1749470vcv("CONTACT_SHEET", 1);
        CONTACT_SHEET = enumC1749470vcv2;
        EnumC1749470vcv[] enumC1749470vcvArr = {enumC1749470vcv, enumC1749470vcv2};
        LL = enumC1749470vcvArr;
        LLILLJJLI = new C2254308sP(enumC1749470vcvArr);
    }

    public static EnumC1749470vcv[] values() {
        return (EnumC1749470vcv[]) LL.clone();
    }

    public static EnumC1749470vcv valueOf(String str) {
        return (EnumC1749470vcv) C08FF.LIZ(EnumC1749470vcv.class, str);
    }

    public EnumC1749470vcv(String str, int i) {
    }
}
