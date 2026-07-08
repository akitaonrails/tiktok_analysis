package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08o3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2227308o3 {
    public static final EnumC2227308o3 CONTINUE;
    public static final EnumC2227308o3 DELETE;
    public static final EnumC2227308o3 DRAG;
    public static final /* synthetic */ EnumC2227308o3[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2227308o3 PLAY;
    public static final EnumC2227308o3 UPLOAD;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2227308o3> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2227308o3 enumC2227308o3 = new EnumC2227308o3("DELETE", 0, "delete");
        DELETE = enumC2227308o3;
        EnumC2227308o3 enumC2227308o32 = new EnumC2227308o3("UPLOAD", 1, "upload");
        UPLOAD = enumC2227308o32;
        EnumC2227308o3 enumC2227308o33 = new EnumC2227308o3("CONTINUE", 2, "continue");
        CONTINUE = enumC2227308o33;
        EnumC2227308o3 enumC2227308o34 = new EnumC2227308o3("PLAY", 3, "play");
        PLAY = enumC2227308o34;
        EnumC2227308o3 enumC2227308o35 = new EnumC2227308o3("DRAG", 4, "drag");
        DRAG = enumC2227308o35;
        EnumC2227308o3[] enumC2227308o3Arr = {enumC2227308o3, enumC2227308o32, enumC2227308o33, enumC2227308o34, enumC2227308o35};
        LLILLJJLI = enumC2227308o3Arr;
        LLILLL = new C2254308sP(enumC2227308o3Arr);
    }

    public static EnumC2227308o3[] values() {
        return (EnumC2227308o3[]) LLILLJJLI.clone();
    }

    public final String getEventValue() {
        return this.LL;
    }

    public static EnumC2227308o3 valueOf(String str) {
        return (EnumC2227308o3) C08FF.LIZ(EnumC2227308o3.class, str);
    }

    public EnumC2227308o3(String str, int i, String str2) {
        this.LL = str2;
    }
}
