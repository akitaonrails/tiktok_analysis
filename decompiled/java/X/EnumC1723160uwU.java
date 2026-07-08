package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uwU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1723160uwU {
    public static final EnumC1723160uwU ALWAYS;
    public static final EnumC1723160uwU DEFAULT;
    public static final /* synthetic */ EnumC1723160uwU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1723160uwU NEVER;

    public static InterfaceC2044707zh<EnumC1723160uwU> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1723160uwU enumC1723160uwU = new EnumC1723160uwU(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1723160uwU;
        EnumC1723160uwU enumC1723160uwU2 = new EnumC1723160uwU("ALWAYS", 1);
        ALWAYS = enumC1723160uwU2;
        EnumC1723160uwU enumC1723160uwU3 = new EnumC1723160uwU("NEVER", 2);
        NEVER = enumC1723160uwU3;
        EnumC1723160uwU[] enumC1723160uwUArr = {enumC1723160uwU, enumC1723160uwU2, enumC1723160uwU3};
        LL = enumC1723160uwUArr;
        LLILLJJLI = new C2254308sP(enumC1723160uwUArr);
    }

    public static EnumC1723160uwU[] values() {
        return (EnumC1723160uwU[]) LL.clone();
    }

    public static EnumC1723160uwU valueOf(String str) {
        return (EnumC1723160uwU) C08FF.LIZ(EnumC1723160uwU.class, str);
    }

    public EnumC1723160uwU(String str, int i) {
    }
}
