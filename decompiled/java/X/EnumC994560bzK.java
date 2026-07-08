package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bzK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994560bzK {
    public static final EnumC994560bzK DEFAULT;
    public static final EnumC994560bzK ICY_CLASH;
    public static final EnumC994560bzK LEAGUE_MATCH;
    public static final /* synthetic */ EnumC994560bzK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC994560bzK> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC994560bzK enumC994560bzK = new EnumC994560bzK(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC994560bzK;
        EnumC994560bzK enumC994560bzK2 = new EnumC994560bzK("LEAGUE_MATCH", 1);
        LEAGUE_MATCH = enumC994560bzK2;
        EnumC994560bzK enumC994560bzK3 = new EnumC994560bzK("ICY_CLASH", 2);
        ICY_CLASH = enumC994560bzK3;
        EnumC994560bzK[] enumC994560bzKArr = {enumC994560bzK, enumC994560bzK2, enumC994560bzK3};
        LL = enumC994560bzKArr;
        LLILLJJLI = new C2254308sP(enumC994560bzKArr);
    }

    public static EnumC994560bzK[] values() {
        return (EnumC994560bzK[]) LL.clone();
    }

    public static EnumC994560bzK valueOf(String str) {
        return (EnumC994560bzK) C08FF.LIZ(EnumC994560bzK.class, str);
    }

    public EnumC994560bzK(String str, int i) {
    }
}
