package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PvP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC660450PvP {
    public static final EnumC660450PvP CUSTOM;
    public static final EnumC660450PvP DEFAULT;
    public static final /* synthetic */ EnumC660450PvP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC660450PvP> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC660450PvP enumC660450PvP = new EnumC660450PvP(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC660450PvP;
        EnumC660450PvP enumC660450PvP2 = new EnumC660450PvP("CUSTOM", 1);
        CUSTOM = enumC660450PvP2;
        EnumC660450PvP[] enumC660450PvPArr = {enumC660450PvP, enumC660450PvP2};
        LL = enumC660450PvPArr;
        LLILLJJLI = new C2254308sP(enumC660450PvPArr);
    }

    public static EnumC660450PvP[] values() {
        return (EnumC660450PvP[]) LL.clone();
    }

    public static EnumC660450PvP valueOf(String str) {
        return (EnumC660450PvP) C08FF.LIZ(EnumC660450PvP.class, str);
    }

    public EnumC660450PvP(String str, int i) {
    }
}
