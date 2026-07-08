package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CFm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC310600CFm {
    public static final EnumC310600CFm DEFAULT;
    public static final EnumC310600CFm ENTER_FULL_PAGE;
    public static final EnumC310600CFm EXIT_FULL_PAGE;
    public static final /* synthetic */ EnumC310600CFm[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC310600CFm> getEntries() {
        return LLILLL;
    }

    static {
        EnumC310600CFm enumC310600CFm = new EnumC310600CFm(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC310600CFm;
        EnumC310600CFm enumC310600CFm2 = new EnumC310600CFm("ENTER_FULL_PAGE", 1, 1);
        ENTER_FULL_PAGE = enumC310600CFm2;
        EnumC310600CFm enumC310600CFm3 = new EnumC310600CFm("EXIT_FULL_PAGE", 2, 2);
        EXIT_FULL_PAGE = enumC310600CFm3;
        EnumC310600CFm[] enumC310600CFmArr = {enumC310600CFm, enumC310600CFm2, enumC310600CFm3};
        LLILLJJLI = enumC310600CFmArr;
        LLILLL = new C2254308sP(enumC310600CFmArr);
    }

    public static EnumC310600CFm[] values() {
        return (EnumC310600CFm[]) LLILLJJLI.clone();
    }

    public final int getReason() {
        return this.LL;
    }

    public static EnumC310600CFm valueOf(String str) {
        return (EnumC310600CFm) C08FF.LIZ(EnumC310600CFm.class, str);
    }

    public EnumC310600CFm(String str, int i, int i2) {
        this.LL = i2;
    }
}
