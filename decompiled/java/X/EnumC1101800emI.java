package X;

import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0emI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1101800emI {
    public static final EnumC1101800emI CREATE;
    public static final EnumC1101800emI DESTROY;
    public static final EnumC1101800emI INIT;
    public static final /* synthetic */ EnumC1101800emI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1101800emI NORMAL;
    public static final EnumC1101800emI START;
    public static final EnumC1101800emI STOP;
    public static final EnumC1101800emI TEMP;
    public Map<String, String> LL;

    public EnumC1101800emI() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC1101800emI> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1101800emI enumC1101800emI = new EnumC1101800emI(0, "INIT");
        INIT = enumC1101800emI;
        EnumC1101800emI enumC1101800emI2 = new EnumC1101800emI(1, "CREATE");
        CREATE = enumC1101800emI2;
        EnumC1101800emI enumC1101800emI3 = new EnumC1101800emI(2, "START");
        START = enumC1101800emI3;
        EnumC1101800emI enumC1101800emI4 = new EnumC1101800emI(3, "NORMAL");
        NORMAL = enumC1101800emI4;
        EnumC1101800emI enumC1101800emI5 = new EnumC1101800emI(4, "TEMP");
        TEMP = enumC1101800emI5;
        EnumC1101800emI enumC1101800emI6 = new EnumC1101800emI(5, "STOP");
        STOP = enumC1101800emI6;
        EnumC1101800emI enumC1101800emI7 = new EnumC1101800emI(6, "DESTROY");
        DESTROY = enumC1101800emI7;
        EnumC1101800emI[] enumC1101800emIArr = {enumC1101800emI, enumC1101800emI2, enumC1101800emI3, enumC1101800emI4, enumC1101800emI5, enumC1101800emI6, enumC1101800emI7};
        LLILLJJLI = enumC1101800emIArr;
        LLILLL = new C2254308sP(enumC1101800emIArr);
    }

    public static EnumC1101800emI[] values() {
        return (EnumC1101800emI[]) LLILLJJLI.clone();
    }

    public final Map<String, String> getParams$liveroomfunction_impl_release() {
        return this.LL;
    }

    public static EnumC1101800emI valueOf(String str) {
        return (EnumC1101800emI) C08FF.LIZ(EnumC1101800emI.class, str);
    }

    public final EnumC1101800emI params$liveroomfunction_impl_release(Map<String, String> map) {
        this.LL = map;
        return this;
    }

    public final void setParams$liveroomfunction_impl_release(Map<String, String> map) {
        this.LL = map;
    }

    public EnumC1101800emI(int i, String str) {
        this.LL = null;
    }
}
