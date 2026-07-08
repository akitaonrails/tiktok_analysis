package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vPz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1741450vPz {
    public static final EnumC1741450vPz AUTO_JUMP;
    public static final EnumC1741450vPz DEFAULT;
    public static final /* synthetic */ EnumC1741450vPz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1741450vPz SEARCH_AREA;
    public static final EnumC1741450vPz SHOP_TAB;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1741450vPz> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1741450vPz enumC1741450vPz = new EnumC1741450vPz(LivePreviewCTASmartDisplayManager.DEFAULT, 0, "c0");
        DEFAULT = enumC1741450vPz;
        EnumC1741450vPz enumC1741450vPz2 = new EnumC1741450vPz("SHOP_TAB", 1, "c80006");
        SHOP_TAB = enumC1741450vPz2;
        EnumC1741450vPz enumC1741450vPz3 = new EnumC1741450vPz("SEARCH_AREA", 2, "c8603");
        SEARCH_AREA = enumC1741450vPz3;
        EnumC1741450vPz enumC1741450vPz4 = new EnumC1741450vPz("AUTO_JUMP", 3, "c1985");
        AUTO_JUMP = enumC1741450vPz4;
        EnumC1741450vPz[] enumC1741450vPzArr = {enumC1741450vPz, enumC1741450vPz2, enumC1741450vPz3, enumC1741450vPz4};
        LLILLJJLI = enumC1741450vPzArr;
        LLILLL = new C2254308sP(enumC1741450vPzArr);
    }

    public static EnumC1741450vPz[] values() {
        return (EnumC1741450vPz[]) LLILLJJLI.clone();
    }

    public final String getCCode() {
        return this.LL;
    }

    public static EnumC1741450vPz valueOf(String str) {
        return (EnumC1741450vPz) C08FF.LIZ(EnumC1741450vPz.class, str);
    }

    public EnumC1741450vPz(String str, int i, String str2) {
        this.LL = str2;
    }
}
