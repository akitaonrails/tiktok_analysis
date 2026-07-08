package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06mw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1710806mw {
    public static final EnumC1710806mw GROUP_SHOT_RETRY;
    public static final /* synthetic */ EnumC1710806mw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1710806mw SCHEMA;

    public static InterfaceC2044707zh<EnumC1710806mw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1710806mw enumC1710806mw = new EnumC1710806mw("SCHEMA", 0);
        SCHEMA = enumC1710806mw;
        EnumC1710806mw enumC1710806mw2 = new EnumC1710806mw("GROUP_SHOT_RETRY", 1);
        GROUP_SHOT_RETRY = enumC1710806mw2;
        EnumC1710806mw[] enumC1710806mwArr = {enumC1710806mw, enumC1710806mw2};
        LL = enumC1710806mwArr;
        LLILLJJLI = new C2254308sP(enumC1710806mwArr);
    }

    public static EnumC1710806mw[] values() {
        return (EnumC1710806mw[]) LL.clone();
    }

    public static EnumC1710806mw valueOf(String str) {
        return (EnumC1710806mw) C08FF.LIZ(EnumC1710806mw.class, str);
    }

    public EnumC1710806mw(String str, int i) {
    }
}
