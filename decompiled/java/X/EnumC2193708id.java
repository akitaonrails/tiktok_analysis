package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08id, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2193708id {
    public static final EnumC2193708id CANCEL;
    public static final EnumC2193708id INIT;
    public static final /* synthetic */ EnumC2193708id[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2193708id REQUESTED;
    public static final EnumC2193708id REQUESTING;

    public static InterfaceC2044707zh<EnumC2193708id> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2193708id enumC2193708id = new EnumC2193708id("INIT", 0);
        INIT = enumC2193708id;
        EnumC2193708id enumC2193708id2 = new EnumC2193708id("REQUESTING", 1);
        REQUESTING = enumC2193708id2;
        EnumC2193708id enumC2193708id3 = new EnumC2193708id("REQUESTED", 2);
        REQUESTED = enumC2193708id3;
        EnumC2193708id enumC2193708id4 = new EnumC2193708id("CANCEL", 3);
        CANCEL = enumC2193708id4;
        EnumC2193708id[] enumC2193708idArr = {enumC2193708id, enumC2193708id2, enumC2193708id3, enumC2193708id4};
        LL = enumC2193708idArr;
        LLILLJJLI = new C2254308sP(enumC2193708idArr);
    }

    public static EnumC2193708id[] values() {
        return (EnumC2193708id[]) LL.clone();
    }

    public static EnumC2193708id valueOf(String str) {
        return (EnumC2193708id) C08FF.LIZ(EnumC2193708id.class, str);
    }

    public EnumC2193708id(String str, int i) {
    }
}
