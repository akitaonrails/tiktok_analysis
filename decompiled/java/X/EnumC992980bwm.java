package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992980bwm {
    public static final EnumC992980bwm DEFAULT;
    public static final /* synthetic */ EnumC992980bwm[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC992980bwm PROFILE_SELF;
    public final int LL;

    public static InterfaceC2044707zh<EnumC992980bwm> getEntries() {
        return LLILLL;
    }

    static {
        EnumC992980bwm enumC992980bwm = new EnumC992980bwm(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC992980bwm;
        EnumC992980bwm enumC992980bwm2 = new EnumC992980bwm("PROFILE_SELF", 1, 1);
        PROFILE_SELF = enumC992980bwm2;
        EnumC992980bwm[] enumC992980bwmArr = {enumC992980bwm, enumC992980bwm2};
        LLILLJJLI = enumC992980bwmArr;
        LLILLL = new C2254308sP(enumC992980bwmArr);
    }

    public static EnumC992980bwm[] values() {
        return (EnumC992980bwm[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC992980bwm valueOf(String str) {
        return (EnumC992980bwm) C08FF.LIZ(EnumC992980bwm.class, str);
    }

    public EnumC992980bwm(String str, int i, int i2) {
        this.LL = i2;
    }
}
