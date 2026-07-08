package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1989507qn {
    public static final EnumC1989507qn CONTENT_TYPE_JSON;
    public static final /* synthetic */ EnumC1989507qn[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1989507qn> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1989507qn enumC1989507qn = new EnumC1989507qn();
        CONTENT_TYPE_JSON = enumC1989507qn;
        EnumC1989507qn[] enumC1989507qnArr = {enumC1989507qn};
        LL = enumC1989507qnArr;
        LLILLJJLI = new C2254308sP(enumC1989507qnArr);
    }

    public static EnumC1989507qn[] values() {
        return (EnumC1989507qn[]) LL.clone();
    }

    public static EnumC1989507qn valueOf(String str) {
        return (EnumC1989507qn) C08FF.LIZ(EnumC1989507qn.class, str);
    }
}
