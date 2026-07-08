package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MWe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC569740MWe {
    public static final EnumC569740MWe ALBUM;
    public static final EnumC569740MWe CREATE_TAB;
    public static final EnumC569740MWe DEFAULT;
    public static final /* synthetic */ EnumC569740MWe[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC569740MWe> getEntries() {
        return LLILLL;
    }

    static {
        EnumC569740MWe enumC569740MWe = new EnumC569740MWe(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 1);
        DEFAULT = enumC569740MWe;
        EnumC569740MWe enumC569740MWe2 = new EnumC569740MWe("CREATE_TAB", 1, 2);
        CREATE_TAB = enumC569740MWe2;
        EnumC569740MWe enumC569740MWe3 = new EnumC569740MWe("ALBUM", 2, 3);
        ALBUM = enumC569740MWe3;
        EnumC569740MWe[] enumC569740MWeArr = {enumC569740MWe, enumC569740MWe2, enumC569740MWe3};
        LLILLJJLI = enumC569740MWeArr;
        LLILLL = new C2254308sP(enumC569740MWeArr);
    }

    public static EnumC569740MWe[] values() {
        return (EnumC569740MWe[]) LLILLJJLI.clone();
    }

    public final int getTab() {
        return this.LL;
    }

    public static EnumC569740MWe valueOf(String str) {
        return (EnumC569740MWe) C08FF.LIZ(EnumC569740MWe.class, str);
    }

    public EnumC569740MWe(String str, int i, int i2) {
        this.LL = i2;
    }
}
