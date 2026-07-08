package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hNN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1201670hNN {
    public static final EnumC1201670hNN API_ERROR;
    public static final /* synthetic */ EnumC1201670hNN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1201670hNN NETWORK_ERROR;

    public static InterfaceC2044707zh<EnumC1201670hNN> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1201670hNN enumC1201670hNN = new EnumC1201670hNN("NETWORK_ERROR", 0);
        NETWORK_ERROR = enumC1201670hNN;
        EnumC1201670hNN enumC1201670hNN2 = new EnumC1201670hNN("API_ERROR", 1);
        API_ERROR = enumC1201670hNN2;
        EnumC1201670hNN[] enumC1201670hNNArr = {enumC1201670hNN, enumC1201670hNN2};
        LL = enumC1201670hNNArr;
        LLILLJJLI = new C2254308sP(enumC1201670hNNArr);
    }

    public static EnumC1201670hNN[] values() {
        return (EnumC1201670hNN[]) LL.clone();
    }

    public static EnumC1201670hNN valueOf(String str) {
        return (EnumC1201670hNN) C08FF.LIZ(EnumC1201670hNN.class, str);
    }

    public EnumC1201670hNN(String str, int i) {
    }
}
