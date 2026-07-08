package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0k3F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1304510k3F {
    public static final EnumC1304510k3F DESTROYED;
    public static final EnumC1304510k3F IDLE;
    public static final EnumC1304510k3F INITIALIZED;
    public static final EnumC1304510k3F LAUNCHED;
    public static final /* synthetic */ EnumC1304510k3F[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1304510k3F PAUSED;
    public static final EnumC1304510k3F RUNTIME_CREATED;

    public static InterfaceC2044707zh<EnumC1304510k3F> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1304510k3F enumC1304510k3F = new EnumC1304510k3F("IDLE", 0);
        IDLE = enumC1304510k3F;
        EnumC1304510k3F enumC1304510k3F2 = new EnumC1304510k3F("INITIALIZED", 1);
        INITIALIZED = enumC1304510k3F2;
        EnumC1304510k3F enumC1304510k3F3 = new EnumC1304510k3F("RUNTIME_CREATED", 2);
        RUNTIME_CREATED = enumC1304510k3F3;
        EnumC1304510k3F enumC1304510k3F4 = new EnumC1304510k3F("LAUNCHED", 3);
        LAUNCHED = enumC1304510k3F4;
        EnumC1304510k3F enumC1304510k3F5 = new EnumC1304510k3F("PAUSED", 4);
        PAUSED = enumC1304510k3F5;
        EnumC1304510k3F enumC1304510k3F6 = new EnumC1304510k3F("DESTROYED", 5);
        DESTROYED = enumC1304510k3F6;
        EnumC1304510k3F[] enumC1304510k3FArr = {enumC1304510k3F, enumC1304510k3F2, enumC1304510k3F3, enumC1304510k3F4, enumC1304510k3F5, enumC1304510k3F6};
        LL = enumC1304510k3FArr;
        LLILLJJLI = new C2254308sP(enumC1304510k3FArr);
    }

    public static EnumC1304510k3F[] values() {
        return (EnumC1304510k3F[]) LL.clone();
    }

    public static EnumC1304510k3F valueOf(String str) {
        return (EnumC1304510k3F) C08FF.LIZ(EnumC1304510k3F.class, str);
    }

    public EnumC1304510k3F(String str, int i) {
    }
}
