package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gHM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1159500gHM {
    public static final C1159490gHL Companion;
    public static final EnumC1159500gHM DEFAULT;
    public static final /* synthetic */ EnumC1159500gHM[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC1159500gHM NORMAL;
    public static final EnumC1159500gHM SEE_LESS;
    public static final EnumC1159500gHM SEE_MORE;
    public static final EnumC1159500gHM SEE_MUCH_LESS;
    public static final EnumC1159500gHM SEE_MUCH_MORE;
    public final float LL;
    public final int LLILLJJLI;
    public final int LLILLL;

    public static InterfaceC2044707zh<EnumC1159500gHM> getEntries() {
        return LLILZIL;
    }

    static {
        EnumC1159500gHM enumC1159500gHM = new EnumC1159500gHM(3.0f, 0, 0, 2131834527, LivePreviewCTASmartDisplayManager.DEFAULT);
        DEFAULT = enumC1159500gHM;
        EnumC1159500gHM enumC1159500gHM2 = new EnumC1159500gHM(1.0f, 1, 1, 2131834528, "SEE_MUCH_LESS");
        SEE_MUCH_LESS = enumC1159500gHM2;
        EnumC1159500gHM enumC1159500gHM3 = new EnumC1159500gHM(2.0f, 2, 2, 2131834528, "SEE_LESS");
        SEE_LESS = enumC1159500gHM3;
        EnumC1159500gHM enumC1159500gHM4 = new EnumC1159500gHM(3.0f, 3, 3, 2131834527, "NORMAL");
        NORMAL = enumC1159500gHM4;
        EnumC1159500gHM enumC1159500gHM5 = new EnumC1159500gHM(4.0f, 4, 4, 2131834529, "SEE_MORE");
        SEE_MORE = enumC1159500gHM5;
        EnumC1159500gHM enumC1159500gHM6 = new EnumC1159500gHM(5.0f, 5, 5, 2131834529, "SEE_MUCH_MORE");
        SEE_MUCH_MORE = enumC1159500gHM6;
        EnumC1159500gHM[] enumC1159500gHMArr = {enumC1159500gHM, enumC1159500gHM2, enumC1159500gHM3, enumC1159500gHM4, enumC1159500gHM5, enumC1159500gHM6};
        LLILZ = enumC1159500gHMArr;
        LLILZIL = new C2254308sP(enumC1159500gHMArr);
        Companion = new C1159490gHL();
    }

    public static EnumC1159500gHM[] values() {
        return (EnumC1159500gHM[]) LLILZ.clone();
    }

    public final int getDisplayRes() {
        return this.LLILLL;
    }

    public final float getProgressValue() {
        return this.LL;
    }

    public final int getServerValue() {
        return this.LLILLJJLI;
    }

    public static EnumC1159500gHM valueOf(String str) {
        return (EnumC1159500gHM) C08FF.LIZ(EnumC1159500gHM.class, str);
    }

    public EnumC1159500gHM(float f, int i, int i2, int i3, String str) {
        this.LL = f;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
    }
}
