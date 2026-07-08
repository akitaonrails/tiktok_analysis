package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gAD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1155070gAD {
    public static final EnumC1155070gAD DEFAULT;
    public static final /* synthetic */ EnumC1155070gAD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1155070gAD NEW_BIND;

    public static InterfaceC2044707zh<EnumC1155070gAD> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1155070gAD enumC1155070gAD = new EnumC1155070gAD(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1155070gAD;
        EnumC1155070gAD enumC1155070gAD2 = new EnumC1155070gAD("NEW_BIND", 1);
        NEW_BIND = enumC1155070gAD2;
        EnumC1155070gAD[] enumC1155070gADArr = {enumC1155070gAD, enumC1155070gAD2};
        LL = enumC1155070gADArr;
        LLILLJJLI = new C2254308sP(enumC1155070gADArr);
    }

    public static EnumC1155070gAD[] values() {
        return (EnumC1155070gAD[]) LL.clone();
    }

    public static EnumC1155070gAD valueOf(String str) {
        return (EnumC1155070gAD) C08FF.LIZ(EnumC1155070gAD.class, str);
    }

    public EnumC1155070gAD(String str, int i) {
    }
}
