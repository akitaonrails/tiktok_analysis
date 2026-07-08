package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Lvx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC558870Lvx {
    public static final EnumC558870Lvx COMPLETED;
    public static final EnumC558870Lvx FAILED;
    public static final EnumC558870Lvx IDLE;
    public static final /* synthetic */ EnumC558870Lvx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC558870Lvx PAUSED;
    public static final EnumC558870Lvx RUNNING;

    public static InterfaceC2044707zh<EnumC558870Lvx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC558870Lvx enumC558870Lvx = new EnumC558870Lvx("IDLE", 0);
        IDLE = enumC558870Lvx;
        EnumC558870Lvx enumC558870Lvx2 = new EnumC558870Lvx("RUNNING", 1);
        RUNNING = enumC558870Lvx2;
        EnumC558870Lvx enumC558870Lvx3 = new EnumC558870Lvx("PAUSED", 2);
        PAUSED = enumC558870Lvx3;
        EnumC558870Lvx enumC558870Lvx4 = new EnumC558870Lvx("COMPLETED", 3);
        COMPLETED = enumC558870Lvx4;
        EnumC558870Lvx enumC558870Lvx5 = new EnumC558870Lvx("FAILED", 4);
        FAILED = enumC558870Lvx5;
        EnumC558870Lvx[] enumC558870LvxArr = {enumC558870Lvx, enumC558870Lvx2, enumC558870Lvx3, enumC558870Lvx4, enumC558870Lvx5};
        LL = enumC558870LvxArr;
        LLILLJJLI = new C2254308sP(enumC558870LvxArr);
    }

    public static EnumC558870Lvx[] values() {
        return (EnumC558870Lvx[]) LL.clone();
    }

    public static EnumC558870Lvx valueOf(String str) {
        return (EnumC558870Lvx) C08FF.LIZ(EnumC558870Lvx.class, str);
    }

    public EnumC558870Lvx(String str, int i) {
    }
}
