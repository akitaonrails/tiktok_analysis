package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0icR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1249450icR {
    public static final EnumC1249450icR CENTER;
    public static final /* synthetic */ EnumC1249450icR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1249450icR SETTINGS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1249450icR> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1249450icR enumC1249450icR = new EnumC1249450icR("CENTER", 0, LSPassThroughRecordSizeConfig.DEFAULT);
        CENTER = enumC1249450icR;
        EnumC1249450icR enumC1249450icR2 = new EnumC1249450icR("SETTINGS", 1, 0);
        SETTINGS = enumC1249450icR2;
        EnumC1249450icR[] enumC1249450icRArr = {enumC1249450icR, enumC1249450icR2};
        LLILLJJLI = enumC1249450icRArr;
        LLILLL = new C2254308sP(enumC1249450icRArr);
    }

    public static EnumC1249450icR[] values() {
        return (EnumC1249450icR[]) LLILLJJLI.clone();
    }

    public final int getPriority() {
        return this.LL;
    }

    public static EnumC1249450icR valueOf(String str) {
        return (EnumC1249450icR) C08FF.LIZ(EnumC1249450icR.class, str);
    }

    public EnumC1249450icR(String str, int i, int i2) {
        this.LL = i2;
    }
}
