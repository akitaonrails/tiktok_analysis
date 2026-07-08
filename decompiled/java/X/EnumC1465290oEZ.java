package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: X.0oEZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1465290oEZ {
    public static final EnumC1465290oEZ AI_STICKER;
    public static final EnumC1465290oEZ CUSTOM_STICKER;
    public static final EnumC1465290oEZ CUSTOM_STICKER_ENTRANCE;
    public static final /* synthetic */ EnumC1465290oEZ[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1465290oEZ NON_GIPHY_INFO_STICKER;
    public final String LL;
    public final int LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1465290oEZ> getEntries() {
        return LLILZ;
    }

    static {
        int iLJ = 100;
        try {
            SettingsManager.LIZLLL().getClass();
            iLJ = SettingsManager.LJ("studio_imported_stickers_cache_threshold", 100);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        EnumC1465290oEZ enumC1465290oEZ = new EnumC1465290oEZ("CUSTOM_STICKER", 0, "recent_c_s", iLJ);
        CUSTOM_STICKER = enumC1465290oEZ;
        EnumC1465290oEZ enumC1465290oEZ2 = new EnumC1465290oEZ("CUSTOM_STICKER_ENTRANCE", 1, "recent_custom_entrance", 1);
        CUSTOM_STICKER_ENTRANCE = enumC1465290oEZ2;
        EnumC1465290oEZ enumC1465290oEZ3 = new EnumC1465290oEZ("NON_GIPHY_INFO_STICKER", 2, "recent_n_g_i_s", 6);
        NON_GIPHY_INFO_STICKER = enumC1465290oEZ3;
        EnumC1465290oEZ enumC1465290oEZ4 = new EnumC1465290oEZ("AI_STICKER", 3, "recent_a_s", 6);
        AI_STICKER = enumC1465290oEZ4;
        EnumC1465290oEZ[] enumC1465290oEZArr = {enumC1465290oEZ, enumC1465290oEZ2, enumC1465290oEZ3, enumC1465290oEZ4};
        LLILLL = enumC1465290oEZArr;
        LLILZ = new C2254308sP(enumC1465290oEZArr);
    }

    public static EnumC1465290oEZ[] values() {
        return (EnumC1465290oEZ[]) LLILLL.clone();
    }

    public final int getMaxCount() {
        return this.LLILLJJLI;
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1465290oEZ valueOf(String str) {
        return (EnumC1465290oEZ) C08FF.LIZ(EnumC1465290oEZ.class, str);
    }

    public EnumC1465290oEZ(String str, int i, String str2, int i2) {
        this.LL = str2;
        this.LLILLJJLI = i2;
    }
}
