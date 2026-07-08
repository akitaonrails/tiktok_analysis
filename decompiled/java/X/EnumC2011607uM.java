package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07uM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2011607uM {
    public static final EnumC2011607uM GEN_ICON_AUTO;
    public static final EnumC2011607uM GEN_ICON_MANUAL;
    public static final /* synthetic */ EnumC2011607uM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2011607uM> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2011607uM enumC2011607uM = new EnumC2011607uM("GEN_ICON_AUTO", 0, "1");
        GEN_ICON_AUTO = enumC2011607uM;
        EnumC2011607uM enumC2011607uM2 = new EnumC2011607uM("GEN_ICON_MANUAL", 1, CardStruct.IStatusCode.DEFAULT);
        GEN_ICON_MANUAL = enumC2011607uM2;
        EnumC2011607uM[] enumC2011607uMArr = {enumC2011607uM, enumC2011607uM2};
        LLILLJJLI = enumC2011607uMArr;
        LLILLL = new C2254308sP(enumC2011607uMArr);
    }

    public static EnumC2011607uM[] values() {
        return (EnumC2011607uM[]) LLILLJJLI.clone();
    }

    public final String getDraftFiled() {
        return this.LL;
    }

    public static EnumC2011607uM valueOf(String str) {
        return (EnumC2011607uM) C08FF.LIZ(EnumC2011607uM.class, str);
    }

    public EnumC2011607uM(String str, int i, String str2) {
        this.LL = str2;
    }
}
