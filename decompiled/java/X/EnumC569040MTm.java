package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MTm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC569040MTm {
    public static final C569050MTn Companion;
    public static final EnumC569040MTm DEFAULT;
    public static final EnumC569040MTm DM_SHARE;
    public static final EnumC569040MTm GREEN_SCREEN;
    public static final /* synthetic */ EnumC569040MTm[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC569040MTm> getEntries() {
        return LLILLL;
    }

    static {
        EnumC569040MTm enumC569040MTm = new EnumC569040MTm(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC569040MTm;
        EnumC569040MTm enumC569040MTm2 = new EnumC569040MTm("GREEN_SCREEN", 1, 1);
        GREEN_SCREEN = enumC569040MTm2;
        EnumC569040MTm enumC569040MTm3 = new EnumC569040MTm("DM_SHARE", 2, 3);
        DM_SHARE = enumC569040MTm3;
        EnumC569040MTm[] enumC569040MTmArr = {enumC569040MTm, enumC569040MTm2, enumC569040MTm3};
        LLILLJJLI = enumC569040MTmArr;
        LLILLL = new C2254308sP(enumC569040MTmArr);
        Companion = new C569050MTn();
    }

    public static EnumC569040MTm[] values() {
        return (EnumC569040MTm[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC569040MTm valueOf(String str) {
        return (EnumC569040MTm) C08FF.LIZ(EnumC569040MTm.class, str);
    }

    public EnumC569040MTm(String str, int i, int i2) {
        this.LL = i2;
    }
}
