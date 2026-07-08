package X;

import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.054d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC12929054d {
    public static final EnumC12929054d APP;
    public static final EnumC12929054d COLD_START;
    public static final C12941054p Companion;
    public static final /* synthetic */ EnumC12929054d[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC12929054d LOGIN;
    public static final EnumC12929054d NO_RUNTIME_TYPE;
    public static final C01GW<Map<String, EnumC12929054d>> map$delegate;
    public final String LL;

    public static InterfaceC2044707zh<EnumC12929054d> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.054p] */
    static {
        EnumC12929054d enumC12929054d = new EnumC12929054d("COLD_START", 0, "cold_start");
        COLD_START = enumC12929054d;
        EnumC12929054d enumC12929054d2 = new EnumC12929054d("APP", 1, "app");
        APP = enumC12929054d2;
        EnumC12929054d enumC12929054d3 = new EnumC12929054d("NO_RUNTIME_TYPE", 2, "no_runtime_type");
        NO_RUNTIME_TYPE = enumC12929054d3;
        EnumC12929054d enumC12929054d4 = new EnumC12929054d("LOGIN", 3, "login");
        LOGIN = enumC12929054d4;
        EnumC12929054d[] enumC12929054dArr = {enumC12929054d, enumC12929054d2, enumC12929054d3, enumC12929054d4};
        LLILLJJLI = enumC12929054dArr;
        LLILLL = new C2254308sP(enumC12929054dArr);
        Companion = new Object() { // from class: X.054p
        };
        map$delegate = C452501pT.LIZIZ(new C054X());
    }

    public static EnumC12929054d[] values() {
        return (EnumC12929054d[]) LLILLJJLI.clone();
    }

    public final String getTag() {
        return this.LL;
    }

    public static EnumC12929054d valueOf(String str) {
        return (EnumC12929054d) C08FF.LIZ(EnumC12929054d.class, str);
    }

    public EnumC12929054d(String str, int i, String str2) {
        this.LL = str2;
    }
}
