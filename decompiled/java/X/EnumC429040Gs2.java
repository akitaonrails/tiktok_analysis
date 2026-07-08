package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Gs2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429040Gs2 {
    public static final EnumC429040Gs2 IDLE;
    public static final /* synthetic */ EnumC429040Gs2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC429040Gs2 RECORDING;

    public static InterfaceC2044707zh<EnumC429040Gs2> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC429040Gs2 enumC429040Gs2 = new EnumC429040Gs2("IDLE", 0);
        IDLE = enumC429040Gs2;
        EnumC429040Gs2 enumC429040Gs22 = new EnumC429040Gs2(C1649000t0s.LLLJIL, 1);
        RECORDING = enumC429040Gs22;
        EnumC429040Gs2[] enumC429040Gs2Arr = {enumC429040Gs2, enumC429040Gs22};
        LL = enumC429040Gs2Arr;
        LLILLJJLI = new C2254308sP(enumC429040Gs2Arr);
    }

    public static EnumC429040Gs2[] values() {
        return (EnumC429040Gs2[]) LL.clone();
    }

    public static EnumC429040Gs2 valueOf(String str) {
        return (EnumC429040Gs2) C08FF.LIZ(EnumC429040Gs2.class, str);
    }

    public EnumC429040Gs2(String str, int i) {
    }
}
