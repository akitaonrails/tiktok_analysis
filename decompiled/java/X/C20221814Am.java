package X;

import com.ss.android.ugc.aweme.ecommerce.ab.EcVmSdkConfigSettings;

/* JADX INFO: renamed from: X.14Am, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20221814Am {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final InterfaceC21321018cC LIZLLL;
    public final InterfaceC21321018cC LJ;
    public final String LJFF;

    public C20221814Am(InterfaceC21321018cC interfaceC21321018cC) {
        String str;
        String str2;
        if (C21187817vo.LIZ().switchConfig.masterSwitch) {
            str = C21187817vo.LIZ().vmsdkConfig.commonCheckScriptPath;
        } else {
            str = EcVmSdkConfigSettings.LIZ().paramCommonCheck;
        }
        if (C21187817vo.LIZ().switchConfig.masterSwitch) {
            str2 = C21187817vo.LIZ().vmsdkConfig.initScriptPath;
        } else {
            str2 = EcVmSdkConfigSettings.LIZ().ecvmBaseConfig;
        }
        this.LIZ = str;
        this.LIZIZ = "common_check";
        this.LIZJ = str2;
        this.LIZLLL = null;
        this.LJ = interfaceC21321018cC;
        this.LJFF = "ec_params_rule_verifier";
    }
}
