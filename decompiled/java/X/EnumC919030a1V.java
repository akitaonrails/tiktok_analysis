package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a1V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC919030a1V {
    public static final EnumC919030a1V EFFECTING;
    public static final /* synthetic */ EnumC919030a1V[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC919030a1V NORMAL;

    public static InterfaceC2044707zh<EnumC919030a1V> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC919030a1V enumC919030a1V = new EnumC919030a1V("NORMAL", 0);
        NORMAL = enumC919030a1V;
        EnumC919030a1V enumC919030a1V2 = new EnumC919030a1V("EFFECTING", 1);
        EFFECTING = enumC919030a1V2;
        EnumC919030a1V[] enumC919030a1VArr = {enumC919030a1V, enumC919030a1V2};
        LL = enumC919030a1VArr;
        LLILLJJLI = new C2254308sP(enumC919030a1VArr);
    }

    public static EnumC919030a1V[] values() {
        return (EnumC919030a1V[]) LL.clone();
    }

    public static EnumC919030a1V valueOf(String str) {
        return (EnumC919030a1V) C08FF.LIZ(EnumC919030a1V.class, str);
    }

    public EnumC919030a1V(String str, int i) {
    }
}
