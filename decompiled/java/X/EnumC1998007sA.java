package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07sA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1998007sA {
    public static final EnumC1998007sA BOTTOM_PANEL_MODE;
    public static final EnumC1998007sA DEFAULT;
    public static final /* synthetic */ EnumC1998007sA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1998007sA> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1998007sA enumC1998007sA = new EnumC1998007sA(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1998007sA;
        EnumC1998007sA enumC1998007sA2 = new EnumC1998007sA("BOTTOM_PANEL_MODE", 1);
        BOTTOM_PANEL_MODE = enumC1998007sA2;
        EnumC1998007sA[] enumC1998007sAArr = {enumC1998007sA, enumC1998007sA2};
        LL = enumC1998007sAArr;
        LLILLJJLI = new C2254308sP(enumC1998007sAArr);
    }

    public static EnumC1998007sA[] values() {
        return (EnumC1998007sA[]) LL.clone();
    }

    public static EnumC1998007sA valueOf(String str) {
        return (EnumC1998007sA) C08FF.LIZ(EnumC1998007sA.class, str);
    }

    public EnumC1998007sA(String str, int i) {
    }
}
