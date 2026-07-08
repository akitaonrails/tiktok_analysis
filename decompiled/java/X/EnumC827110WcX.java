package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0WcX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC827110WcX {
    public static final EnumC827110WcX End;
    public static final /* synthetic */ EnumC827110WcX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC827110WcX LogSessionBatch;
    public static final EnumC827110WcX Start;

    public static InterfaceC2044707zh<EnumC827110WcX> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC827110WcX enumC827110WcX = new EnumC827110WcX("Start", 0);
        Start = enumC827110WcX;
        EnumC827110WcX enumC827110WcX2 = new EnumC827110WcX("End", 1);
        End = enumC827110WcX2;
        EnumC827110WcX enumC827110WcX3 = new EnumC827110WcX("LogSessionBatch", 2);
        LogSessionBatch = enumC827110WcX3;
        EnumC827110WcX[] enumC827110WcXArr = {enumC827110WcX, enumC827110WcX2, enumC827110WcX3};
        LL = enumC827110WcXArr;
        LLILLJJLI = new C2254308sP(enumC827110WcXArr);
    }

    public static EnumC827110WcX[] values() {
        return (EnumC827110WcX[]) LL.clone();
    }

    public static EnumC827110WcX valueOf(String str) {
        return (EnumC827110WcX) C08FF.LIZ(EnumC827110WcX.class, str);
    }

    public EnumC827110WcX(String str, int i) {
    }
}
