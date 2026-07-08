package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0GsL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429230GsL {
    public static final EnumC429230GsL DEFAULT;
    public static final EnumC429230GsL EFFECT_IMG_CREATOR;
    public static final /* synthetic */ EnumC429230GsL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC429230GsL> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC429230GsL enumC429230GsL = new EnumC429230GsL(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC429230GsL;
        EnumC429230GsL enumC429230GsL2 = new EnumC429230GsL("EFFECT_IMG_CREATOR", 1);
        EFFECT_IMG_CREATOR = enumC429230GsL2;
        EnumC429230GsL[] enumC429230GsLArr = {enumC429230GsL, enumC429230GsL2};
        LL = enumC429230GsLArr;
        LLILLJJLI = new C2254308sP(enumC429230GsLArr);
    }

    public static EnumC429230GsL[] values() {
        return (EnumC429230GsL[]) LL.clone();
    }

    public static EnumC429230GsL valueOf(String str) {
        return (EnumC429230GsL) C08FF.LIZ(EnumC429230GsL.class, str);
    }

    public EnumC429230GsL(String str, int i) {
    }
}
