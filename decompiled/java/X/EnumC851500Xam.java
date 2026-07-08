package X;

import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Xam, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC851500Xam {
    public static final C851490Xal Companion;
    public static final /* synthetic */ EnumC851500Xam[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC851500Xam V2;
    public static final C01GW<String> ruleStrategies$delegate;
    public final String LL = "2";

    public static InterfaceC2044707zh<EnumC851500Xam> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Xal] */
    static {
        EnumC851500Xam enumC851500Xam = new EnumC851500Xam();
        V2 = enumC851500Xam;
        EnumC851500Xam[] enumC851500XamArr = {enumC851500Xam};
        LLILLJJLI = enumC851500XamArr;
        LLILLL = new C2254308sP(enumC851500XamArr);
        Companion = new Object() { // from class: X.0Xal
        };
        ruleStrategies$delegate = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(81));
    }

    public static EnumC851500Xam[] values() {
        return (EnumC851500Xam[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC851500Xam valueOf(String str) {
        return (EnumC851500Xam) C08FF.LIZ(EnumC851500Xam.class, str);
    }
}
