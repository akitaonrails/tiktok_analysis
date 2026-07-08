package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gPC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1164360gPC {
    public static final EnumC1164360gPC API_ERROR;
    public static final EnumC1164360gPC EMPTY;
    public static final /* synthetic */ EnumC1164360gPC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1164360gPC NO_NET;

    public static InterfaceC2044707zh<EnumC1164360gPC> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1164360gPC enumC1164360gPC = new EnumC1164360gPC("EMPTY", 0);
        EMPTY = enumC1164360gPC;
        EnumC1164360gPC enumC1164360gPC2 = new EnumC1164360gPC("NO_NET", 1);
        NO_NET = enumC1164360gPC2;
        EnumC1164360gPC enumC1164360gPC3 = new EnumC1164360gPC("API_ERROR", 2);
        API_ERROR = enumC1164360gPC3;
        EnumC1164360gPC[] enumC1164360gPCArr = {enumC1164360gPC, enumC1164360gPC2, enumC1164360gPC3};
        LL = enumC1164360gPCArr;
        LLILLJJLI = new C2254308sP(enumC1164360gPCArr);
    }

    public static EnumC1164360gPC[] values() {
        return (EnumC1164360gPC[]) LL.clone();
    }

    public static EnumC1164360gPC valueOf(String str) {
        return (EnumC1164360gPC) C08FF.LIZ(EnumC1164360gPC.class, str);
    }

    public EnumC1164360gPC(String str, int i) {
    }
}
