package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08jx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2201908jx {
    public static final EnumC2201908jx GET;
    public static final /* synthetic */ EnumC2201908jx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2201908jx POST;

    public static InterfaceC2044707zh<EnumC2201908jx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2201908jx enumC2201908jx = new EnumC2201908jx("GET", 0);
        GET = enumC2201908jx;
        EnumC2201908jx enumC2201908jx2 = new EnumC2201908jx("POST", 1);
        POST = enumC2201908jx2;
        EnumC2201908jx[] enumC2201908jxArr = {enumC2201908jx, enumC2201908jx2};
        LL = enumC2201908jxArr;
        LLILLJJLI = new C2254308sP(enumC2201908jxArr);
    }

    public static EnumC2201908jx[] values() {
        return (EnumC2201908jx[]) LL.clone();
    }

    public static EnumC2201908jx valueOf(String str) {
        return (EnumC2201908jx) C08FF.LIZ(EnumC2201908jx.class, str);
    }

    public EnumC2201908jx(String str, int i) {
    }
}
