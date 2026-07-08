package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06fY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1665006fY {
    public static final EnumC1665006fY AUTO_SWITCH;
    public static final EnumC1665006fY GUIDE_CREATOR_SWITCH;
    public static final EnumC1665006fY GUIDE_PRO_CREATOR_UPDATE;
    public static final /* synthetic */ EnumC1665006fY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1665006fY> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1665006fY enumC1665006fY = new EnumC1665006fY("AUTO_SWITCH", 0);
        AUTO_SWITCH = enumC1665006fY;
        EnumC1665006fY enumC1665006fY2 = new EnumC1665006fY("GUIDE_CREATOR_SWITCH", 1);
        GUIDE_CREATOR_SWITCH = enumC1665006fY2;
        EnumC1665006fY enumC1665006fY3 = new EnumC1665006fY("GUIDE_PRO_CREATOR_UPDATE", 2);
        GUIDE_PRO_CREATOR_UPDATE = enumC1665006fY3;
        EnumC1665006fY[] enumC1665006fYArr = {enumC1665006fY, enumC1665006fY2, enumC1665006fY3};
        LL = enumC1665006fYArr;
        LLILLJJLI = new C2254308sP(enumC1665006fYArr);
    }

    public static EnumC1665006fY[] values() {
        return (EnumC1665006fY[]) LL.clone();
    }

    public static EnumC1665006fY valueOf(String str) {
        return (EnumC1665006fY) C08FF.LIZ(EnumC1665006fY.class, str);
    }

    public EnumC1665006fY(String str, int i) {
    }
}
