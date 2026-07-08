package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QBe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC666200QBe {
    public static final EnumC666200QBe DEFAULT;
    public static final /* synthetic */ EnumC666200QBe[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC666200QBe TT_NOW;

    public static InterfaceC2044707zh<EnumC666200QBe> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC666200QBe enumC666200QBe = new EnumC666200QBe(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC666200QBe;
        EnumC666200QBe enumC666200QBe2 = new EnumC666200QBe("TT_NOW", 1);
        TT_NOW = enumC666200QBe2;
        EnumC666200QBe[] enumC666200QBeArr = {enumC666200QBe, enumC666200QBe2};
        LL = enumC666200QBeArr;
        LLILLJJLI = new C2254308sP(enumC666200QBeArr);
    }

    public static EnumC666200QBe[] values() {
        return (EnumC666200QBe[]) LL.clone();
    }

    public static EnumC666200QBe valueOf(String str) {
        return (EnumC666200QBe) C08FF.LIZ(EnumC666200QBe.class, str);
    }

    public EnumC666200QBe(String str, int i) {
    }
}
