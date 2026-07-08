package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Mwh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC584810Mwh {
    public static final EnumC584810Mwh FAST;
    public static final /* synthetic */ EnumC584810Mwh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC584810Mwh SLOW;

    public static InterfaceC2044707zh<EnumC584810Mwh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC584810Mwh enumC584810Mwh = new EnumC584810Mwh("FAST", 0);
        FAST = enumC584810Mwh;
        EnumC584810Mwh enumC584810Mwh2 = new EnumC584810Mwh("SLOW", 1);
        SLOW = enumC584810Mwh2;
        EnumC584810Mwh[] enumC584810MwhArr = {enumC584810Mwh, enumC584810Mwh2};
        LL = enumC584810MwhArr;
        LLILLJJLI = new C2254308sP(enumC584810MwhArr);
    }

    public static EnumC584810Mwh[] values() {
        return (EnumC584810Mwh[]) LL.clone();
    }

    public static EnumC584810Mwh valueOf(String str) {
        return (EnumC584810Mwh) C08FF.LIZ(EnumC584810Mwh.class, str);
    }

    public EnumC584810Mwh(String str, int i) {
    }
}
