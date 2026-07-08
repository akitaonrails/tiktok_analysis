package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wOa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779020wOa {
    public static final EnumC1779020wOa IDLE;
    public static final /* synthetic */ EnumC1779020wOa[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1779020wOa RUNNING;
    public static final EnumC1779020wOa SUCCESS;
    public static final EnumC1779020wOa UNDOING;

    public static InterfaceC2044707zh<EnumC1779020wOa> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1779020wOa enumC1779020wOa = new EnumC1779020wOa("IDLE", 0);
        IDLE = enumC1779020wOa;
        EnumC1779020wOa enumC1779020wOa2 = new EnumC1779020wOa("RUNNING", 1);
        RUNNING = enumC1779020wOa2;
        EnumC1779020wOa enumC1779020wOa3 = new EnumC1779020wOa("SUCCESS", 2);
        SUCCESS = enumC1779020wOa3;
        EnumC1779020wOa enumC1779020wOa4 = new EnumC1779020wOa("UNDOING", 3);
        UNDOING = enumC1779020wOa4;
        EnumC1779020wOa[] enumC1779020wOaArr = {enumC1779020wOa, enumC1779020wOa2, enumC1779020wOa3, enumC1779020wOa4};
        LL = enumC1779020wOaArr;
        LLILLJJLI = new C2254308sP(enumC1779020wOaArr);
    }

    public static EnumC1779020wOa[] values() {
        return (EnumC1779020wOa[]) LL.clone();
    }

    public static EnumC1779020wOa valueOf(String str) {
        return (EnumC1779020wOa) C08FF.LIZ(EnumC1779020wOa.class, str);
    }

    public EnumC1779020wOa(String str, int i) {
    }
}
