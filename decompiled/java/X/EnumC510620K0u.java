package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0K0u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC510620K0u {
    public static final /* synthetic */ EnumC510620K0u[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC510620K0u SUB_ONLY_VIDEO;
    public final String LL = "sub_only_video_demo";

    public static InterfaceC2044707zh<EnumC510620K0u> getEntries() {
        return LLILLL;
    }

    static {
        EnumC510620K0u enumC510620K0u = new EnumC510620K0u();
        SUB_ONLY_VIDEO = enumC510620K0u;
        EnumC510620K0u[] enumC510620K0uArr = {enumC510620K0u};
        LLILLJJLI = enumC510620K0uArr;
        LLILLL = new C2254308sP(enumC510620K0uArr);
    }

    public static EnumC510620K0u[] values() {
        return (EnumC510620K0u[]) LLILLJJLI.clone();
    }

    public final String getSource() {
        return this.LL;
    }

    public static EnumC510620K0u valueOf(String str) {
        return (EnumC510620K0u) C08FF.LIZ(EnumC510620K0u.class, str);
    }
}
