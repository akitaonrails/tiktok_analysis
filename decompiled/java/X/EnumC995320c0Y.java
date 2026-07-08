package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c0Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC995320c0Y {
    public static final EnumC995320c0Y FINISH_ACCEPT;
    public static final /* synthetic */ EnumC995320c0Y[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC995320c0Y READY_TO_ACCEPT;

    public static InterfaceC2044707zh<EnumC995320c0Y> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC995320c0Y enumC995320c0Y = new EnumC995320c0Y("READY_TO_ACCEPT", 0);
        READY_TO_ACCEPT = enumC995320c0Y;
        EnumC995320c0Y enumC995320c0Y2 = new EnumC995320c0Y("FINISH_ACCEPT", 1);
        FINISH_ACCEPT = enumC995320c0Y2;
        EnumC995320c0Y[] enumC995320c0YArr = {enumC995320c0Y, enumC995320c0Y2};
        LL = enumC995320c0YArr;
        LLILLJJLI = new C2254308sP(enumC995320c0YArr);
    }

    public static EnumC995320c0Y[] values() {
        return (EnumC995320c0Y[]) LL.clone();
    }

    public static EnumC995320c0Y valueOf(String str) {
        return (EnumC995320c0Y) C08FF.LIZ(EnumC995320c0Y.class, str);
    }

    public EnumC995320c0Y(String str, int i) {
    }
}
