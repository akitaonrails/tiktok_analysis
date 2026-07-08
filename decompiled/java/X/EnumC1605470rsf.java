package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rsf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1605470rsf {
    public static final EnumC1605470rsf DEFAULT;
    public static final EnumC1605470rsf FAIL;
    public static final EnumC1605470rsf HIDE_PROFILE_BADGE;
    public static final /* synthetic */ EnumC1605470rsf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1605470rsf NONE;
    public static final EnumC1605470rsf OFF;
    public static final EnumC1605470rsf ON;
    public static final EnumC1605470rsf PROGRESS;

    public static InterfaceC2044707zh<EnumC1605470rsf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1605470rsf enumC1605470rsf = new EnumC1605470rsf("ON", 0);
        ON = enumC1605470rsf;
        EnumC1605470rsf enumC1605470rsf2 = new EnumC1605470rsf("OFF", 1);
        OFF = enumC1605470rsf2;
        EnumC1605470rsf enumC1605470rsf3 = new EnumC1605470rsf("PROGRESS", 2);
        PROGRESS = enumC1605470rsf3;
        EnumC1605470rsf enumC1605470rsf4 = new EnumC1605470rsf("FAIL", 3);
        FAIL = enumC1605470rsf4;
        EnumC1605470rsf enumC1605470rsf5 = new EnumC1605470rsf("NONE", 4);
        NONE = enumC1605470rsf5;
        EnumC1605470rsf enumC1605470rsf6 = new EnumC1605470rsf(LivePreviewCTASmartDisplayManager.DEFAULT, 5);
        DEFAULT = enumC1605470rsf6;
        EnumC1605470rsf enumC1605470rsf7 = new EnumC1605470rsf("HIDE_PROFILE_BADGE", 6);
        HIDE_PROFILE_BADGE = enumC1605470rsf7;
        EnumC1605470rsf[] enumC1605470rsfArr = {enumC1605470rsf, enumC1605470rsf2, enumC1605470rsf3, enumC1605470rsf4, enumC1605470rsf5, enumC1605470rsf6, enumC1605470rsf7};
        LL = enumC1605470rsfArr;
        LLILLJJLI = new C2254308sP(enumC1605470rsfArr);
    }

    public static EnumC1605470rsf[] values() {
        return (EnumC1605470rsf[]) LL.clone();
    }

    public static EnumC1605470rsf valueOf(String str) {
        return (EnumC1605470rsf) C08FF.LIZ(EnumC1605470rsf.class, str);
    }

    public EnumC1605470rsf(String str, int i) {
    }
}
