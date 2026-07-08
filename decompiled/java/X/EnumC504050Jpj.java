package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Jpj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC504050Jpj {
    public static final /* synthetic */ EnumC504050Jpj[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC504050Jpj SUB_ONLY_VIDEO;
    public final String LL = "sub_only_video_demo";

    public static InterfaceC2044707zh<EnumC504050Jpj> getEntries() {
        return LLILLL;
    }

    static {
        EnumC504050Jpj enumC504050Jpj = new EnumC504050Jpj();
        SUB_ONLY_VIDEO = enumC504050Jpj;
        EnumC504050Jpj[] enumC504050JpjArr = {enumC504050Jpj};
        LLILLJJLI = enumC504050JpjArr;
        LLILLL = new C2254308sP(enumC504050JpjArr);
    }

    public static EnumC504050Jpj[] values() {
        return (EnumC504050Jpj[]) LLILLJJLI.clone();
    }

    public final String getSource() {
        return this.LL;
    }

    public static EnumC504050Jpj valueOf(String str) {
        return (EnumC504050Jpj) C08FF.LIZ(EnumC504050Jpj.class, str);
    }
}
