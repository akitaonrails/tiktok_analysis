package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zGo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1889520zGo {
    public static final EnumC1889520zGo COMPLETE;
    public static final EnumC1889520zGo ERROR;
    public static final EnumC1889520zGo HAS_MORE;
    public static final /* synthetic */ EnumC1889520zGo[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1889520zGo> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1889520zGo enumC1889520zGo = new EnumC1889520zGo("HAS_MORE", 0);
        HAS_MORE = enumC1889520zGo;
        EnumC1889520zGo enumC1889520zGo2 = new EnumC1889520zGo("COMPLETE", 1);
        COMPLETE = enumC1889520zGo2;
        EnumC1889520zGo enumC1889520zGo3 = new EnumC1889520zGo("ERROR", 2);
        ERROR = enumC1889520zGo3;
        EnumC1889520zGo[] enumC1889520zGoArr = {enumC1889520zGo, enumC1889520zGo2, enumC1889520zGo3};
        LL = enumC1889520zGoArr;
        LLILLJJLI = new C2254308sP(enumC1889520zGoArr);
    }

    public static EnumC1889520zGo[] values() {
        return (EnumC1889520zGo[]) LL.clone();
    }

    public static EnumC1889520zGo valueOf(String str) {
        return (EnumC1889520zGo) C08FF.LIZ(EnumC1889520zGo.class, str);
    }

    public EnumC1889520zGo(String str, int i) {
    }
}
