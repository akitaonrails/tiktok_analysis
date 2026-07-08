package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zsX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1912910zsX {
    public static final EnumC1912910zsX BOTTOM;
    public static final EnumC1912910zsX DEFAULT;
    public static final /* synthetic */ EnumC1912910zsX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1912910zsX TOP;

    public static InterfaceC2044707zh<EnumC1912910zsX> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1912910zsX enumC1912910zsX = new EnumC1912910zsX(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1912910zsX;
        EnumC1912910zsX enumC1912910zsX2 = new EnumC1912910zsX("BOTTOM", 1);
        BOTTOM = enumC1912910zsX2;
        EnumC1912910zsX enumC1912910zsX3 = new EnumC1912910zsX("TOP", 2);
        TOP = enumC1912910zsX3;
        EnumC1912910zsX[] enumC1912910zsXArr = {enumC1912910zsX, enumC1912910zsX2, enumC1912910zsX3};
        LL = enumC1912910zsXArr;
        LLILLJJLI = new C2254308sP(enumC1912910zsXArr);
    }

    public static EnumC1912910zsX[] values() {
        return (EnumC1912910zsX[]) LL.clone();
    }

    public static EnumC1912910zsX valueOf(String str) {
        return (EnumC1912910zsX) C08FF.LIZ(EnumC1912910zsX.class, str);
    }

    public EnumC1912910zsX(String str, int i) {
    }
}
