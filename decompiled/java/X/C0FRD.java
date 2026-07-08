package X;

import com.bytedance.ies.nle.editor_jni.KeyframeType;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.bytedance.ies.nle.editor_jni.NLEMediaMessageListener;
import com.bytedance.ies.nleeditor.NLE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0FRD, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FRD extends NLEMediaMessageListener {
    public final boolean LIZ;
    public final List<C0FRG> LIZIZ = new ArrayList();

    public C0FRD(boolean z) {
        this.LIZ = z;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEMediaMessageListener
    public final void onKeyFrameProcess(String str, long j, String str2) {
        Unit unit;
        try {
            Iterator<C0FRG> it2 = this.LIZIZ.iterator();
            while (it2.hasNext()) {
                it2.next().onKeyFrameProcess(str, j, str2, null);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                String strLIZJ = C14LJ.LIZJ(th);
                NLELoggerListener logger = NLE.INSTANCE.getLogger();
                if (logger != null) {
                    LogLevel logLevel = LogLevel.LEVEL_ERROR;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("NLEVEPublic2: onKeyFrameProcess exception! errorMsg: ");
                    sbLIZ.append(th.getMessage());
                    sbLIZ.append(" stack: ");
                    sbLIZ.append(strLIZJ);
                    logger.onLog(logLevel, C2188811AlT.LIZIZ(sbLIZ));
                    unit = Unit.LIZ;
                } else {
                    unit = null;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEMediaMessageListener
    public final void onError(int i, int i2, float f, String str) {
        Unit unit;
        String str2;
        String str3;
        if (this.LIZ) {
            try {
                for (C0FRG c0frg : this.LIZIZ) {
                    if (str == null) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    c0frg.LIZ(i, i2, f, str2);
                }
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                try {
                    String strLIZJ = C14LJ.LIZJ(th);
                    NLELoggerListener logger = NLE.INSTANCE.getLogger();
                    if (logger != null) {
                        LogLevel logLevel = LogLevel.LEVEL_ERROR;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("NLEVEPublic2: onError exception! errorMsg: ");
                        sbLIZ.append(th.getMessage());
                        sbLIZ.append(" stack: ");
                        sbLIZ.append(strLIZJ);
                        logger.onLog(logLevel, C2188811AlT.LIZIZ(sbLIZ));
                        unit = Unit.LIZ;
                    } else {
                        unit = null;
                    }
                    C189200o6.m2constructorimpl(unit);
                    return;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                    return;
                }
            }
        }
        for (C0FRG c0frg2 : this.LIZIZ) {
            if (str == null) {
                str3 = "";
            } else {
                str3 = str;
            }
            c0frg2.LIZ(i, i2, f, str3);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEMediaMessageListener
    public final void onInfo(int i, int i2, float f, String str) {
        Unit unit;
        if (this.LIZ) {
            try {
                Iterator<C0FRG> it2 = this.LIZIZ.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZIZ(i, i2, f, str);
                }
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                try {
                    String strLIZJ = C14LJ.LIZJ(th);
                    NLELoggerListener logger = NLE.INSTANCE.getLogger();
                    if (logger != null) {
                        LogLevel logLevel = LogLevel.LEVEL_ERROR;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("NLEVEPublic2: onInfo exception! errorMsg: ");
                        sbLIZ.append(th.getMessage());
                        sbLIZ.append(" stack: ");
                        sbLIZ.append(strLIZJ);
                        logger.onLog(logLevel, C2188811AlT.LIZIZ(sbLIZ));
                        unit = Unit.LIZ;
                    } else {
                        unit = null;
                    }
                    C189200o6.m2constructorimpl(unit);
                    return;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                    return;
                }
            }
        }
        Iterator<C0FRG> it3 = this.LIZIZ.iterator();
        while (it3.hasNext()) {
            it3.next().LIZIZ(i, i2, f, str);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEMediaMessageListener
    public final void onKeyFrameProcessWithType(String str, long j, String str2, KeyframeType keyframeType) {
        Unit unit;
        try {
            Iterator<C0FRG> it2 = this.LIZIZ.iterator();
            while (it2.hasNext()) {
                it2.next().onKeyFrameProcess(str, j, str2, keyframeType);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                String strLIZJ = C14LJ.LIZJ(th);
                NLELoggerListener logger = NLE.INSTANCE.getLogger();
                if (logger != null) {
                    LogLevel logLevel = LogLevel.LEVEL_ERROR;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("NLEVEPublic2: onKeyFrameProcessWithType exception! errorMsg: ");
                    sbLIZ.append(th.getMessage());
                    sbLIZ.append(" stack: ");
                    sbLIZ.append(strLIZJ);
                    logger.onLog(logLevel, C2188811AlT.LIZIZ(sbLIZ));
                    unit = Unit.LIZ;
                } else {
                    unit = null;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
        }
    }
}
