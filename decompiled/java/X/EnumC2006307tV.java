package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07tV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2006307tV {
    public static final /* synthetic */ EnumC2006307tV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2006307tV LOAD_MORE_STATE;
    public static final EnumC2006307tV NORMAL_STATE;

    public static InterfaceC2044707zh<EnumC2006307tV> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2006307tV enumC2006307tV = new EnumC2006307tV("NORMAL_STATE", 0);
        NORMAL_STATE = enumC2006307tV;
        EnumC2006307tV enumC2006307tV2 = new EnumC2006307tV("LOAD_MORE_STATE", 1);
        LOAD_MORE_STATE = enumC2006307tV2;
        EnumC2006307tV[] enumC2006307tVArr = {enumC2006307tV, enumC2006307tV2};
        LL = enumC2006307tVArr;
        LLILLJJLI = new C2254308sP(enumC2006307tVArr);
    }

    public static EnumC2006307tV[] values() {
        return (EnumC2006307tV[]) LL.clone();
    }

    public static EnumC2006307tV valueOf(String str) {
        return (EnumC2006307tV) C08FF.LIZ(EnumC2006307tV.class, str);
    }

    public EnumC2006307tV(String str, int i) {
    }
}
