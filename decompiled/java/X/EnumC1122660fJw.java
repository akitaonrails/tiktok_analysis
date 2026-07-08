package X;

import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fJw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1122660fJw {
    public static final C1122950fKP Companion;
    public static final EnumC1122660fJw DM;
    public static final EnumC1122660fJw FORM;
    public static final /* synthetic */ EnumC1122660fJw[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final List<EnumC1122660fJw> ROUTABLE_SKUS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1122660fJw> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0fKP] */
    static {
        EnumC1122660fJw enumC1122660fJw = new EnumC1122660fJw("DM", 0, "dm");
        DM = enumC1122660fJw;
        EnumC1122660fJw enumC1122660fJw2 = new EnumC1122660fJw("FORM", 1, "form");
        FORM = enumC1122660fJw2;
        EnumC1122660fJw[] enumC1122660fJwArr = {enumC1122660fJw, enumC1122660fJw2};
        LLILLJJLI = enumC1122660fJwArr;
        LLILLL = new C2254308sP(enumC1122660fJwArr);
        Companion = new Object() { // from class: X.0fKP
        };
        ROUTABLE_SKUS = C1697810uHb.LJIIJJI(enumC1122660fJw, enumC1122660fJw2);
    }

    public static EnumC1122660fJw[] values() {
        return (EnumC1122660fJw[]) LLILLJJLI.clone();
    }

    public final String getTrackingValue() {
        return this.LL;
    }

    public static EnumC1122660fJw valueOf(String str) {
        return (EnumC1122660fJw) C08FF.LIZ(EnumC1122660fJw.class, str);
    }

    public EnumC1122660fJw(String str, int i, String str2) {
        this.LL = str2;
    }
}
