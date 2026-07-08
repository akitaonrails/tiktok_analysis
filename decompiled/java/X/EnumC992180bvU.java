package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992180bvU {
    public static final EnumC992180bvU DEFAULT;
    public static final EnumC992180bvU DETAIL_BOTTOM;
    public static final /* synthetic */ EnumC992180bvU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC992180bvU> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992180bvU enumC992180bvU = new EnumC992180bvU(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC992180bvU;
        EnumC992180bvU enumC992180bvU2 = new EnumC992180bvU("DETAIL_BOTTOM", 1);
        DETAIL_BOTTOM = enumC992180bvU2;
        EnumC992180bvU[] enumC992180bvUArr = {enumC992180bvU, enumC992180bvU2};
        LL = enumC992180bvUArr;
        LLILLJJLI = new C2254308sP(enumC992180bvUArr);
    }

    public static EnumC992180bvU[] values() {
        return (EnumC992180bvU[]) LL.clone();
    }

    public static EnumC992180bvU valueOf(String str) {
        return (EnumC992180bvU) C08FF.LIZ(EnumC992180bvU.class, str);
    }

    public EnumC992180bvU(String str, int i) {
    }
}
