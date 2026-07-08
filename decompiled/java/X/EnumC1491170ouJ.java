package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ouJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1491170ouJ {
    public static final EnumC1491170ouJ IN_PROGRESS;
    public static final /* synthetic */ EnumC1491170ouJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1491170ouJ READY;

    public static InterfaceC2044707zh<EnumC1491170ouJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1491170ouJ enumC1491170ouJ = new EnumC1491170ouJ("IN_PROGRESS", 0);
        IN_PROGRESS = enumC1491170ouJ;
        EnumC1491170ouJ enumC1491170ouJ2 = new EnumC1491170ouJ("READY", 1);
        READY = enumC1491170ouJ2;
        EnumC1491170ouJ[] enumC1491170ouJArr = {enumC1491170ouJ, enumC1491170ouJ2};
        LL = enumC1491170ouJArr;
        LLILLJJLI = new C2254308sP(enumC1491170ouJArr);
    }

    public static EnumC1491170ouJ[] values() {
        return (EnumC1491170ouJ[]) LL.clone();
    }

    public static EnumC1491170ouJ valueOf(String str) {
        return (EnumC1491170ouJ) C08FF.LIZ(EnumC1491170ouJ.class, str);
    }

    public EnumC1491170ouJ(String str, int i) {
    }
}
