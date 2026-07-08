package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Myw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC586200Myw {
    public static final EnumC586200Myw AUTO_TRANSLATION_OFF;
    public static final EnumC586200Myw AUTO_TRANSLATION_ON;
    public static final EnumC586200Myw DEFAULT;
    public static final /* synthetic */ EnumC586200Myw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC586200Myw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC586200Myw enumC586200Myw = new EnumC586200Myw(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC586200Myw;
        EnumC586200Myw enumC586200Myw2 = new EnumC586200Myw("AUTO_TRANSLATION_ON", 1);
        AUTO_TRANSLATION_ON = enumC586200Myw2;
        EnumC586200Myw enumC586200Myw3 = new EnumC586200Myw("AUTO_TRANSLATION_OFF", 2);
        AUTO_TRANSLATION_OFF = enumC586200Myw3;
        EnumC586200Myw[] enumC586200MywArr = {enumC586200Myw, enumC586200Myw2, enumC586200Myw3};
        LL = enumC586200MywArr;
        LLILLJJLI = new C2254308sP(enumC586200MywArr);
    }

    public static EnumC586200Myw[] values() {
        return (EnumC586200Myw[]) LL.clone();
    }

    public static EnumC586200Myw valueOf(String str) {
        return (EnumC586200Myw) C08FF.LIZ(EnumC586200Myw.class, str);
    }

    public EnumC586200Myw(String str, int i) {
    }
}
