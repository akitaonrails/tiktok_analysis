package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Mza, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC586600Mza {
    public static final EnumC586600Mza DEFAULT;
    public static final EnumC586600Mza EU_NEW_VERSION;
    public static final EnumC586600Mza ID_NEW_VERSION;
    public static final /* synthetic */ EnumC586600Mza[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC586600Mza> getEntries() {
        return LLILLL;
    }

    static {
        EnumC586600Mza enumC586600Mza = new EnumC586600Mza(LivePreviewCTASmartDisplayManager.DEFAULT, 0, CardStruct.IStatusCode.DEFAULT);
        DEFAULT = enumC586600Mza;
        EnumC586600Mza enumC586600Mza2 = new EnumC586600Mza("ID_NEW_VERSION", 1, "1");
        ID_NEW_VERSION = enumC586600Mza2;
        EnumC586600Mza enumC586600Mza3 = new EnumC586600Mza("EU_NEW_VERSION", 2, "2");
        EU_NEW_VERSION = enumC586600Mza3;
        EnumC586600Mza[] enumC586600MzaArr = {enumC586600Mza, enumC586600Mza2, enumC586600Mza3};
        LLILLJJLI = enumC586600MzaArr;
        LLILLL = new C2254308sP(enumC586600MzaArr);
    }

    public static EnumC586600Mza[] values() {
        return (EnumC586600Mza[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC586600Mza valueOf(String str) {
        return (EnumC586600Mza) C08FF.LIZ(EnumC586600Mza.class, str);
    }

    public EnumC586600Mza(String str, int i, String str2) {
        this.LL = str2;
    }
}
