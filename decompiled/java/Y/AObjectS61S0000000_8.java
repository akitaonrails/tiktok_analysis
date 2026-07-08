package Y;

import X.C06W5;
import X.C0L8Y;
import X.C0LDZ;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import com.ss.ugc.android.davinciresource.jni.DAVLogLevel;
import com.ss.ugc.android.davinciresource.jni.DAVLoggerListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public class AObjectS61S0000000_8 implements Function0 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            default:
                return null;
        }
    }

    public AObjectS61S0000000_8(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS61S0000000_8 aObjectS61S0000000_8) {
        String str = VideoRecordPermissionActivity._pnsPageId;
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS61S0000000_8 aObjectS61S0000000_8) {
        String str = VideoRecordPermissionActivity._pnsPageId;
        return new C06W5(1);
    }

    public static final Object invoke$2(AObjectS61S0000000_8 aObjectS61S0000000_8) {
        return new C0LDZ();
    }

    public static final Object invoke$3(AObjectS61S0000000_8 aObjectS61S0000000_8) {
        return new C0L8Y();
    }

    public static final Object invoke$4(AObjectS61S0000000_8 aObjectS61S0000000_8) {
        return new NLELoggerListener() { // from class: X.0LxY
            @Override // com.bytedance.ies.nle.editor_jni.NLELoggerListener
            public final void onLog(LogLevel logLevel, String str) {
                int i;
                if (logLevel == null) {
                    i = -1;
                } else {
                    i = C560080Lxu.LIZ[logLevel.ordinal()];
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
                                    C559870LxZ.LIZ("NLE_Native", str);
                                    return;
                                } else {
                                    C559870LxZ.LIZIZ("NLE_Native", str, null);
                                    return;
                                }
                            }
                            InterfaceC559900Lxc interfaceC559900Lxc2 = C559870LxZ.LIZ;
                            C559870LxZ.LJFF("NLE_Native", str);
                            return;
                        }
                        InterfaceC559900Lxc interfaceC559900Lxc3 = C559870LxZ.LIZ;
                        C559870LxZ.LIZJ("NLE_Native", str);
                        return;
                    }
                    InterfaceC559900Lxc interfaceC559900Lxc4 = C559870LxZ.LIZ;
                    C559870LxZ.LIZ("NLE_Native", str);
                    return;
                }
                InterfaceC559900Lxc interfaceC559900Lxc5 = C559870LxZ.LIZ;
                C559870LxZ.LJ("NLE_Native", str);
            }
        };
    }

    public static final Object invoke$5(AObjectS61S0000000_8 aObjectS61S0000000_8) {
        return new DAVLoggerListener() { // from class: X.0Lxa
            @Override // com.ss.ugc.android.davinciresource.jni.DAVLoggerListener
            public final void onLog(DAVLogLevel dAVLogLevel, String str) {
                int i;
                if (dAVLogLevel == null) {
                    i = -1;
                } else {
                    i = C560030Lxp.LIZ[dAVLogLevel.ordinal()];
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
                                    C559870LxZ.LIZ("DAVResource", str);
                                    return;
                                } else {
                                    C559870LxZ.LIZIZ("DAVResource", str, null);
                                    return;
                                }
                            }
                            InterfaceC559900Lxc interfaceC559900Lxc2 = C559870LxZ.LIZ;
                            C559870LxZ.LJFF("DAVResource", str);
                            return;
                        }
                        InterfaceC559900Lxc interfaceC559900Lxc3 = C559870LxZ.LIZ;
                        C559870LxZ.LIZJ("DAVResource", str);
                        return;
                    }
                    InterfaceC559900Lxc interfaceC559900Lxc4 = C559870LxZ.LIZ;
                    C559870LxZ.LIZ("DAVResource", str);
                    return;
                }
                InterfaceC559900Lxc interfaceC559900Lxc5 = C559870LxZ.LIZ;
                C559870LxZ.LJ("DAVResource", str);
            }
        };
    }
}
