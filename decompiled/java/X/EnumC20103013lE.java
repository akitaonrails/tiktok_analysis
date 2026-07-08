package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.13lE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC20103013lE {
    public static final EnumC20103013lE DESTROYED;
    public static final EnumC20103013lE INITED;
    public static final /* synthetic */ EnumC20103013lE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20103013lE READY;
    public static final EnumC20103013lE RELEASED;
    public static final EnumC20103013lE STARTED;
    public static final EnumC20103013lE STOPED;

    public static InterfaceC2044707zh<EnumC20103013lE> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20103013lE enumC20103013lE = new EnumC20103013lE("INITED", 0);
        INITED = enumC20103013lE;
        EnumC20103013lE enumC20103013lE2 = new EnumC20103013lE("READY", 1);
        READY = enumC20103013lE2;
        EnumC20103013lE enumC20103013lE3 = new EnumC20103013lE("STARTED", 2);
        STARTED = enumC20103013lE3;
        EnumC20103013lE enumC20103013lE4 = new EnumC20103013lE("STOPED", 3);
        STOPED = enumC20103013lE4;
        EnumC20103013lE enumC20103013lE5 = new EnumC20103013lE("RELEASED", 4);
        RELEASED = enumC20103013lE5;
        EnumC20103013lE enumC20103013lE6 = new EnumC20103013lE("DESTROYED", 5);
        DESTROYED = enumC20103013lE6;
        EnumC20103013lE[] enumC20103013lEArr = {enumC20103013lE, enumC20103013lE2, enumC20103013lE3, enumC20103013lE4, enumC20103013lE5, enumC20103013lE6};
        LL = enumC20103013lEArr;
        LLILLJJLI = new C2254308sP(enumC20103013lEArr);
    }

    public static EnumC20103013lE[] values() {
        return (EnumC20103013lE[]) LL.clone();
    }

    public static EnumC20103013lE valueOf(String str) {
        return (EnumC20103013lE) C08FF.LIZ(EnumC20103013lE.class, str);
    }

    public EnumC20103013lE(String str, int i) {
    }
}
