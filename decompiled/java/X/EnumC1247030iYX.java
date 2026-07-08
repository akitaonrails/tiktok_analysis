package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iYX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1247030iYX {
    public static final EnumC1247030iYX ALIAS;
    public static final C1247060iYa Companion;
    public static final EnumC1247030iYX DEFAULT;
    public static final /* synthetic */ EnumC1247030iYX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1247030iYX NICKNAME;
    public static final EnumC1247030iYX USERNAME;

    public static InterfaceC2044707zh<EnumC1247030iYX> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1247030iYX enumC1247030iYX = new EnumC1247030iYX(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1247030iYX;
        EnumC1247030iYX enumC1247030iYX2 = new EnumC1247030iYX("USERNAME", 1);
        USERNAME = enumC1247030iYX2;
        EnumC1247030iYX enumC1247030iYX3 = new EnumC1247030iYX("NICKNAME", 2);
        NICKNAME = enumC1247030iYX3;
        EnumC1247030iYX enumC1247030iYX4 = new EnumC1247030iYX("ALIAS", 3);
        ALIAS = enumC1247030iYX4;
        EnumC1247030iYX[] enumC1247030iYXArr = {enumC1247030iYX, enumC1247030iYX2, enumC1247030iYX3, enumC1247030iYX4};
        LL = enumC1247030iYXArr;
        LLILLJJLI = new C2254308sP(enumC1247030iYXArr);
        Companion = new C1247060iYa();
    }

    public static EnumC1247030iYX[] values() {
        return (EnumC1247030iYX[]) LL.clone();
    }

    public static EnumC1247030iYX valueOf(String str) {
        return (EnumC1247030iYX) C08FF.LIZ(EnumC1247030iYX.class, str);
    }

    public EnumC1247030iYX(String str, int i) {
    }
}
