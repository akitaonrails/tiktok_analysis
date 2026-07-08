package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992830bwX {
    public static final EnumC992830bwX AIGC_PROFILE;
    public static final EnumC992830bwX DEFAULT;
    public static final /* synthetic */ EnumC992830bwX[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC992830bwX USER_PROFILE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC992830bwX> getEntries() {
        return LLILLL;
    }

    static {
        EnumC992830bwX enumC992830bwX = new EnumC992830bwX(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC992830bwX;
        EnumC992830bwX enumC992830bwX2 = new EnumC992830bwX("USER_PROFILE", 1, 1);
        USER_PROFILE = enumC992830bwX2;
        EnumC992830bwX enumC992830bwX3 = new EnumC992830bwX("AIGC_PROFILE", 2, 2);
        AIGC_PROFILE = enumC992830bwX3;
        EnumC992830bwX[] enumC992830bwXArr = {enumC992830bwX, enumC992830bwX2, enumC992830bwX3};
        LLILLJJLI = enumC992830bwXArr;
        LLILLL = new C2254308sP(enumC992830bwXArr);
    }

    public static EnumC992830bwX[] values() {
        return (EnumC992830bwX[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC992830bwX valueOf(String str) {
        return (EnumC992830bwX) C08FF.LIZ(EnumC992830bwX.class, str);
    }

    public EnumC992830bwX(String str, int i, int i2) {
        this.LL = i2;
    }
}
