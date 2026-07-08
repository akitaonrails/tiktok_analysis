package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bxO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993360bxO {
    public static final EnumC993360bxO CLICK;
    public static final EnumC993360bxO DEFAULT;
    public static final /* synthetic */ EnumC993360bxO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC993360bxO OTHERCLICK;

    public static InterfaceC2044707zh<EnumC993360bxO> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC993360bxO enumC993360bxO = new EnumC993360bxO("CLICK", 0);
        CLICK = enumC993360bxO;
        EnumC993360bxO enumC993360bxO2 = new EnumC993360bxO("OTHERCLICK", 1);
        OTHERCLICK = enumC993360bxO2;
        EnumC993360bxO enumC993360bxO3 = new EnumC993360bxO(LivePreviewCTASmartDisplayManager.DEFAULT, 2);
        DEFAULT = enumC993360bxO3;
        EnumC993360bxO[] enumC993360bxOArr = {enumC993360bxO, enumC993360bxO2, enumC993360bxO3};
        LL = enumC993360bxOArr;
        LLILLJJLI = new C2254308sP(enumC993360bxOArr);
    }

    public static EnumC993360bxO[] values() {
        return (EnumC993360bxO[]) LL.clone();
    }

    public static EnumC993360bxO valueOf(String str) {
        return (EnumC993360bxO) C08FF.LIZ(EnumC993360bxO.class, str);
    }

    public EnumC993360bxO(String str, int i) {
    }
}
