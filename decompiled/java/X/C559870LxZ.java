package X;

import Y.AObjectS61S0000000_8;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.bytedance.ies.nleeditor.NLE;
import com.ss.ugc.android.davinciresource.jni.DAVLogLevel;
import com.ss.ugc.android.davinciresource.jni.DAVLogger;
import com.ss.ugc.android.davinciresource.jni.DAVLoggerFunc;

/* JADX INFO: renamed from: X.0LxZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C559870LxZ {
    public static InterfaceC559900Lxc LIZ;
    public static final C01GW LIZIZ;
    public static final C01GW LIZJ;

    static {
        C2169008ee.LIZ.LIZ();
        NLE.loadNLELibrary$default(NLE.INSTANCE, false, false, false, 7, null);
        LIZ = new InterfaceC559900Lxc() { // from class: X.0Lxd
            @Override // X.InterfaceC559900Lxc
            public final void LIZ(String str) {
            }

            @Override // X.InterfaceC559900Lxc
            public final void LIZIZ(String str) {
            }

            @Override // X.InterfaceC559900Lxc
            public final void d(String str) {
            }

            @Override // X.InterfaceC559900Lxc
            public final void i(String str) {
            }

            @Override // X.InterfaceC559900Lxc
            public final void w(String str) {
            }
        };
        LIZIZ = C452501pT.LIZIZ(new AObjectS61S0000000_8(4));
        LIZJ = C452501pT.LIZIZ(new AObjectS61S0000000_8(5));
    }

    public static void LIZLLL() {
        LIZJ("[CutSameLog]", "initLibraryLog: ");
        LIZJ("[CutSameLog]", "initNLELog: ");
        NLE nle = NLE.INSTANCE;
        nle.setLogger((NLELoggerListener) LIZIZ.getValue());
        nle.setLogLevel(LogLevel.LEVEL_DEBUG);
        LIZJ("[CutSameLog]", "initDAVLog: ");
        DAVLogger.obtain().setDelegate((DAVLoggerFunc) LIZJ.getValue());
        DAVLogger.obtain().setLogLevel(DAVLogLevel.LEVEL_DEBUG);
    }

    public static void LIZ(String str, String str2) {
        InterfaceC559900Lxc interfaceC559900Lxc = LIZ;
        if (interfaceC559900Lxc != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(", ");
            sbLIZ.append(str2);
            interfaceC559900Lxc.d(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LIZJ(String str, String str2) {
        InterfaceC559900Lxc interfaceC559900Lxc = LIZ;
        if (interfaceC559900Lxc != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(", ");
            sbLIZ.append(str2);
            interfaceC559900Lxc.i(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LJ(String str, String str2) {
        InterfaceC559900Lxc interfaceC559900Lxc = LIZ;
        if (interfaceC559900Lxc != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(", ");
            sbLIZ.append(str2);
            interfaceC559900Lxc.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LJFF(String str, String str2) {
        InterfaceC559900Lxc interfaceC559900Lxc = LIZ;
        if (interfaceC559900Lxc != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(", ");
            sbLIZ.append(str2);
            interfaceC559900Lxc.w(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LIZIZ(String str, String str2, Throwable th) {
        InterfaceC559900Lxc interfaceC559900Lxc = LIZ;
        if (interfaceC559900Lxc != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(", ");
            sbLIZ.append(str2);
            interfaceC559900Lxc.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
