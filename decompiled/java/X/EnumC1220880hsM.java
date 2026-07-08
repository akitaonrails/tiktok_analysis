package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hsM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1220880hsM {
    public static final EnumC1220880hsM ALIAS;
    public static final EnumC1220880hsM DEFAULT;
    public static final /* synthetic */ EnumC1220880hsM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1220880hsM NICKNAME;
    public static final EnumC1220880hsM USERNAME;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1220880hsM> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1220880hsM enumC1220880hsM = new EnumC1220880hsM(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC1220880hsM;
        EnumC1220880hsM enumC1220880hsM2 = new EnumC1220880hsM("USERNAME", 1, 1);
        USERNAME = enumC1220880hsM2;
        EnumC1220880hsM enumC1220880hsM3 = new EnumC1220880hsM("NICKNAME", 2, 2);
        NICKNAME = enumC1220880hsM3;
        EnumC1220880hsM enumC1220880hsM4 = new EnumC1220880hsM("ALIAS", 3, 3);
        ALIAS = enumC1220880hsM4;
        EnumC1220880hsM[] enumC1220880hsMArr = {enumC1220880hsM, enumC1220880hsM2, enumC1220880hsM3, enumC1220880hsM4};
        LLILLJJLI = enumC1220880hsMArr;
        LLILLL = new C2254308sP(enumC1220880hsMArr);
    }

    public static EnumC1220880hsM[] values() {
        return (EnumC1220880hsM[]) LLILLJJLI.clone();
    }

    public final int getTypeValue() {
        return this.LL;
    }

    public static EnumC1220880hsM valueOf(String str) {
        return (EnumC1220880hsM) C08FF.LIZ(EnumC1220880hsM.class, str);
    }

    public EnumC1220880hsM(String str, int i, int i2) {
        this.LL = i2;
    }
}
