package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eu0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1106580eu0 {
    public static final EnumC1106580eu0 BUTTON;
    public static final EnumC1106580eu0 DEFAULT;
    public static final EnumC1106580eu0 GLINT;
    public static final /* synthetic */ EnumC1106580eu0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1106580eu0 SCALING;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1106580eu0> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1106580eu0 enumC1106580eu0 = new EnumC1106580eu0(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC1106580eu0;
        EnumC1106580eu0 enumC1106580eu02 = new EnumC1106580eu0("BUTTON", 1, 1);
        BUTTON = enumC1106580eu02;
        EnumC1106580eu0 enumC1106580eu03 = new EnumC1106580eu0("GLINT", 2, 2);
        GLINT = enumC1106580eu03;
        EnumC1106580eu0 enumC1106580eu04 = new EnumC1106580eu0("SCALING", 3, 3);
        SCALING = enumC1106580eu04;
        EnumC1106580eu0[] enumC1106580eu0Arr = {enumC1106580eu0, enumC1106580eu02, enumC1106580eu03, enumC1106580eu04};
        LLILLJJLI = enumC1106580eu0Arr;
        LLILLL = new C2254308sP(enumC1106580eu0Arr);
    }

    public static EnumC1106580eu0[] values() {
        return (EnumC1106580eu0[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1106580eu0 valueOf(String str) {
        return (EnumC1106580eu0) C08FF.LIZ(EnumC1106580eu0.class, str);
    }

    public EnumC1106580eu0(String str, int i, int i2) {
        this.LL = i2;
    }
}
