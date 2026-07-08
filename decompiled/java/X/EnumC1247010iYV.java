package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iYV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1247010iYV {
    public static final C1247020iYW Companion;
    public static final EnumC1247010iYV FOLLOWER;
    public static final EnumC1247010iYV FRIEND;
    public static final /* synthetic */ EnumC1247010iYV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1247010iYV NOBODY;
    public static final Map<Integer, EnumC1247010iYV> map;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1247010iYV> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1247010iYV enumC1247010iYV = new EnumC1247010iYV("FOLLOWER", 0, 0);
        FOLLOWER = enumC1247010iYV;
        EnumC1247010iYV enumC1247010iYV2 = new EnumC1247010iYV("FRIEND", 1, 1);
        FRIEND = enumC1247010iYV2;
        EnumC1247010iYV enumC1247010iYV3 = new EnumC1247010iYV("NOBODY", 2, 2);
        NOBODY = enumC1247010iYV3;
        EnumC1247010iYV[] enumC1247010iYVArr = {enumC1247010iYV, enumC1247010iYV2, enumC1247010iYV3};
        LLILLJJLI = enumC1247010iYVArr;
        LLILLL = new C2254308sP(enumC1247010iYVArr);
        Companion = new C1247020iYW();
        InterfaceC2044707zh<EnumC1247010iYV> entries = getEntries();
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(entries, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC1247010iYV enumC1247010iYV4 : entries) {
            linkedHashMap.put(Integer.valueOf(enumC1247010iYV4.LL), enumC1247010iYV4);
        }
        map = linkedHashMap;
    }

    public static EnumC1247010iYV[] values() {
        return (EnumC1247010iYV[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1247010iYV valueOf(String str) {
        return (EnumC1247010iYV) C08FF.LIZ(EnumC1247010iYV.class, str);
    }

    public EnumC1247010iYV(String str, int i, int i2) {
        this.LL = i2;
    }
}
