package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03nP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC949303nP {
    public static final EnumC949303nP LEFT;
    public static final /* synthetic */ EnumC949303nP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC949303nP RIGHT;

    public static InterfaceC2044707zh<EnumC949303nP> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC949303nP enumC949303nP = new EnumC949303nP("LEFT", 0);
        LEFT = enumC949303nP;
        EnumC949303nP enumC949303nP2 = new EnumC949303nP("RIGHT", 1);
        RIGHT = enumC949303nP2;
        EnumC949303nP[] enumC949303nPArr = {enumC949303nP, enumC949303nP2};
        LL = enumC949303nPArr;
        LLILLJJLI = new C2254308sP(enumC949303nPArr);
    }

    public static EnumC949303nP[] values() {
        return (EnumC949303nP[]) LL.clone();
    }

    public static EnumC949303nP valueOf(String str) {
        return (EnumC949303nP) C08FF.LIZ(EnumC949303nP.class, str);
    }

    public EnumC949303nP(String str, int i) {
    }
}
