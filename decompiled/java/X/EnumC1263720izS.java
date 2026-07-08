package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0izS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1263720izS {
    public static final EnumC1263720izS APPENDED;
    public static final /* synthetic */ EnumC1263720izS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1263720izS NOT_APPENDED;

    public static InterfaceC2044707zh<EnumC1263720izS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1263720izS enumC1263720izS = new EnumC1263720izS("NOT_APPENDED", 0);
        NOT_APPENDED = enumC1263720izS;
        EnumC1263720izS enumC1263720izS2 = new EnumC1263720izS("APPENDED", 1);
        APPENDED = enumC1263720izS2;
        EnumC1263720izS[] enumC1263720izSArr = {enumC1263720izS, enumC1263720izS2};
        LL = enumC1263720izSArr;
        LLILLJJLI = new C2254308sP(enumC1263720izSArr);
    }

    public static EnumC1263720izS[] values() {
        return (EnumC1263720izS[]) LL.clone();
    }

    public static EnumC1263720izS valueOf(String str) {
        return (EnumC1263720izS) C08FF.LIZ(EnumC1263720izS.class, str);
    }

    public EnumC1263720izS(String str, int i) {
    }
}
