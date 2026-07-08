package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QUo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC671240QUo {
    public static final /* synthetic */ EnumC671240QUo[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC671240QUo ON_FROM_FRAGMENT_PAUSED;
    public static final EnumC671240QUo ON_NAVIGATE_CALLED;

    public static InterfaceC2044707zh<EnumC671240QUo> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC671240QUo enumC671240QUo = new EnumC671240QUo("ON_NAVIGATE_CALLED", 0);
        ON_NAVIGATE_CALLED = enumC671240QUo;
        EnumC671240QUo enumC671240QUo2 = new EnumC671240QUo("ON_FROM_FRAGMENT_PAUSED", 1);
        ON_FROM_FRAGMENT_PAUSED = enumC671240QUo2;
        EnumC671240QUo[] enumC671240QUoArr = {enumC671240QUo, enumC671240QUo2};
        LL = enumC671240QUoArr;
        LLILLJJLI = new C2254308sP(enumC671240QUoArr);
    }

    public static EnumC671240QUo[] values() {
        return (EnumC671240QUo[]) LL.clone();
    }

    public static EnumC671240QUo valueOf(String str) {
        return (EnumC671240QUo) C08FF.LIZ(EnumC671240QUo.class, str);
    }

    public EnumC671240QUo(String str, int i) {
    }
}
