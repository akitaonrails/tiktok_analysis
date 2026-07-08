package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0oxK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1493040oxK {
    public static final EnumC1493040oxK ALLOW;
    public static final /* synthetic */ EnumC1493040oxK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1493040oxK NONE;
    public static final EnumC1493040oxK NOT_ALLOW;

    public static InterfaceC2044707zh<EnumC1493040oxK> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1493040oxK enumC1493040oxK = new EnumC1493040oxK("NONE", 0);
        NONE = enumC1493040oxK;
        EnumC1493040oxK enumC1493040oxK2 = new EnumC1493040oxK("ALLOW", 1);
        ALLOW = enumC1493040oxK2;
        EnumC1493040oxK enumC1493040oxK3 = new EnumC1493040oxK("NOT_ALLOW", 2);
        NOT_ALLOW = enumC1493040oxK3;
        EnumC1493040oxK[] enumC1493040oxKArr = {enumC1493040oxK, enumC1493040oxK2, enumC1493040oxK3};
        LL = enumC1493040oxKArr;
        LLILLJJLI = new C2254308sP(enumC1493040oxKArr);
    }

    public static EnumC1493040oxK[] values() {
        return (EnumC1493040oxK[]) LL.clone();
    }

    public static EnumC1493040oxK valueOf(String str) {
        return (EnumC1493040oxK) C08FF.LIZ(EnumC1493040oxK.class, str);
    }

    public EnumC1493040oxK(String str, int i) {
    }
}
