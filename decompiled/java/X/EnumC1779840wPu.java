package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wPu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779840wPu {
    public static final EnumC1779840wPu IDLE;
    public static final /* synthetic */ EnumC1779840wPu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1779840wPu PAUSED;
    public static final EnumC1779840wPu RUNNING;

    public static InterfaceC2044707zh<EnumC1779840wPu> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1779840wPu enumC1779840wPu = new EnumC1779840wPu("IDLE", 0);
        IDLE = enumC1779840wPu;
        EnumC1779840wPu enumC1779840wPu2 = new EnumC1779840wPu("RUNNING", 1);
        RUNNING = enumC1779840wPu2;
        EnumC1779840wPu enumC1779840wPu3 = new EnumC1779840wPu("PAUSED", 2);
        PAUSED = enumC1779840wPu3;
        EnumC1779840wPu[] enumC1779840wPuArr = {enumC1779840wPu, enumC1779840wPu2, enumC1779840wPu3};
        LL = enumC1779840wPuArr;
        LLILLJJLI = new C2254308sP(enumC1779840wPuArr);
    }

    public static EnumC1779840wPu[] values() {
        return (EnumC1779840wPu[]) LL.clone();
    }

    public static EnumC1779840wPu valueOf(String str) {
        return (EnumC1779840wPu) C08FF.LIZ(EnumC1779840wPu.class, str);
    }

    public EnumC1779840wPu(String str, int i) {
    }
}
