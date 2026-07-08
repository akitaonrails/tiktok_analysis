package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ncm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1441860ncm {
    public static final C1441870ncn Companion;
    public static final /* synthetic */ EnumC1441860ncm[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1441860ncm RECORD;
    public static final EnumC1441860ncm UNKNOWED;
    public static final EnumC1441860ncm UPLOAD_ONE_IMAGE;
    public static final EnumC1441860ncm UPLOAD_ONLY_IMAGE;
    public static final EnumC1441860ncm UPLOAD_OTHER;
    public static final Map<Integer, EnumC1441860ncm> map;
    public final int LL;

    public static final EnumC1441860ncm fromInt(int i) {
        Companion.getClass();
        return C1441870ncn.LIZ(i);
    }

    public static InterfaceC2044707zh<EnumC1441860ncm> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1441860ncm enumC1441860ncm = new EnumC1441860ncm("UNKNOWED", 0, 0);
        UNKNOWED = enumC1441860ncm;
        EnumC1441860ncm enumC1441860ncm2 = new EnumC1441860ncm("RECORD", 1, 1);
        RECORD = enumC1441860ncm2;
        EnumC1441860ncm enumC1441860ncm3 = new EnumC1441860ncm("UPLOAD_ONE_IMAGE", 2, 2);
        UPLOAD_ONE_IMAGE = enumC1441860ncm3;
        EnumC1441860ncm enumC1441860ncm4 = new EnumC1441860ncm("UPLOAD_OTHER", 3, 3);
        UPLOAD_OTHER = enumC1441860ncm4;
        EnumC1441860ncm enumC1441860ncm5 = new EnumC1441860ncm("UPLOAD_ONLY_IMAGE", 4, 4);
        UPLOAD_ONLY_IMAGE = enumC1441860ncm5;
        EnumC1441860ncm[] enumC1441860ncmArr = {enumC1441860ncm, enumC1441860ncm2, enumC1441860ncm3, enumC1441860ncm4, enumC1441860ncm5};
        LLILLJJLI = enumC1441860ncmArr;
        LLILLL = new C2254308sP(enumC1441860ncmArr);
        Companion = new C1441870ncn();
        EnumC1441860ncm[] enumC1441860ncmArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC1441860ncmArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC1441860ncm enumC1441860ncm6 : enumC1441860ncmArrValues) {
            linkedHashMap.put(Integer.valueOf(enumC1441860ncm6.LL), enumC1441860ncm6);
        }
        map = linkedHashMap;
    }

    public static EnumC1441860ncm[] values() {
        return (EnumC1441860ncm[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1441860ncm valueOf(String str) {
        return (EnumC1441860ncm) C08FF.LIZ(EnumC1441860ncm.class, str);
    }

    public EnumC1441860ncm(String str, int i, int i2) {
        this.LL = i2;
    }
}
