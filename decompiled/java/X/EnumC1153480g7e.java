package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g7e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1153480g7e {
    public static final EnumC1153480g7e LIVEHOST;
    public static final /* synthetic */ EnumC1153480g7e[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1153480g7e PREVIEW;

    public static InterfaceC2044707zh<EnumC1153480g7e> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1153480g7e enumC1153480g7e = new EnumC1153480g7e("PREVIEW", 0);
        PREVIEW = enumC1153480g7e;
        EnumC1153480g7e enumC1153480g7e2 = new EnumC1153480g7e("LIVEHOST", 1);
        LIVEHOST = enumC1153480g7e2;
        EnumC1153480g7e[] enumC1153480g7eArr = {enumC1153480g7e, enumC1153480g7e2};
        LL = enumC1153480g7eArr;
        LLILLJJLI = new C2254308sP(enumC1153480g7eArr);
    }

    public static EnumC1153480g7e[] values() {
        return (EnumC1153480g7e[]) LL.clone();
    }

    public static EnumC1153480g7e valueOf(String str) {
        return (EnumC1153480g7e) C08FF.LIZ(EnumC1153480g7e.class, str);
    }

    public EnumC1153480g7e(String str, int i) {
    }
}
