package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1AUw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC2180361AUw {
    public static final EnumC2180361AUw AUTO_END;
    public static final EnumC2180361AUw DRAG;
    public static final EnumC2180361AUw FORWARD;
    public static final EnumC2180361AUw KILL;
    public static final /* synthetic */ EnumC2180361AUw[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2180361AUw OFF;
    public static final EnumC2180361AUw ON;
    public static final EnumC2180361AUw PAUSE;
    public static final EnumC2180361AUw RETURN;
    public static final EnumC2180361AUw REWIND;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2180361AUw> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2180361AUw enumC2180361AUw = new EnumC2180361AUw("DRAG", 0, "drag");
        DRAG = enumC2180361AUw;
        EnumC2180361AUw enumC2180361AUw2 = new EnumC2180361AUw("REWIND", 1, "rewind");
        REWIND = enumC2180361AUw2;
        EnumC2180361AUw enumC2180361AUw3 = new EnumC2180361AUw("FORWARD", 2, "forward");
        FORWARD = enumC2180361AUw3;
        EnumC2180361AUw enumC2180361AUw4 = new EnumC2180361AUw("PAUSE", 3, "pause");
        PAUSE = enumC2180361AUw4;
        EnumC2180361AUw enumC2180361AUw5 = new EnumC2180361AUw("AUTO_END", 4, "auto_end");
        AUTO_END = enumC2180361AUw5;
        EnumC2180361AUw enumC2180361AUw6 = new EnumC2180361AUw("RETURN", 5, "return");
        RETURN = enumC2180361AUw6;
        EnumC2180361AUw enumC2180361AUw7 = new EnumC2180361AUw("ON", 6, "on");
        ON = enumC2180361AUw7;
        EnumC2180361AUw enumC2180361AUw8 = new EnumC2180361AUw("OFF", 7, "off");
        OFF = enumC2180361AUw8;
        EnumC2180361AUw enumC2180361AUw9 = new EnumC2180361AUw("KILL", 8, "kill");
        KILL = enumC2180361AUw9;
        EnumC2180361AUw[] enumC2180361AUwArr = {enumC2180361AUw, enumC2180361AUw2, enumC2180361AUw3, enumC2180361AUw4, enumC2180361AUw5, enumC2180361AUw6, enumC2180361AUw7, enumC2180361AUw8, enumC2180361AUw9};
        LLILLJJLI = enumC2180361AUwArr;
        LLILLL = new C2254308sP(enumC2180361AUwArr);
    }

    public static EnumC2180361AUw[] values() {
        return (EnumC2180361AUw[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC2180361AUw valueOf(String str) {
        return (EnumC2180361AUw) C08FF.LIZ(EnumC2180361AUw.class, str);
    }

    public EnumC2180361AUw(String str, int i, String str2) {
        this.LL = str2;
    }
}
