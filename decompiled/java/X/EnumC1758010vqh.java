package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vqh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1758010vqh {
    public static final EnumC1758010vqh END;
    public static final /* synthetic */ EnumC1758010vqh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1758010vqh START;

    public static InterfaceC2044707zh<EnumC1758010vqh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1758010vqh enumC1758010vqh = new EnumC1758010vqh("START", 0);
        START = enumC1758010vqh;
        EnumC1758010vqh enumC1758010vqh2 = new EnumC1758010vqh("END", 1);
        END = enumC1758010vqh2;
        EnumC1758010vqh[] enumC1758010vqhArr = {enumC1758010vqh, enumC1758010vqh2};
        LL = enumC1758010vqhArr;
        LLILLJJLI = new C2254308sP(enumC1758010vqhArr);
    }

    public static EnumC1758010vqh[] values() {
        return (EnumC1758010vqh[]) LL.clone();
    }

    public static EnumC1758010vqh valueOf(String str) {
        return (EnumC1758010vqh) C08FF.LIZ(EnumC1758010vqh.class, str);
    }

    public EnumC1758010vqh(String str, int i) {
    }
}
