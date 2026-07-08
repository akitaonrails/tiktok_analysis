package X;

import com.bytedance.android.live.base.service.IHostMonitorAndLog;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveLinkMicAlogUploadSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveLinkMicExceptionUploadSetting;
import java.util.Map;

/* JADX INFO: renamed from: X.0ksA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1336080ksA implements InterfaceC076000Qc {
    public abstract int LIZJ();

    public abstract int LIZLLL();

    public abstract void LJI(int i, String str, Throwable th, Map map);

    public boolean LJFF(int i) {
        int iLIZJ = LIZJ();
        if (i <= LIZLLL() && iLIZJ <= i) {
            return true;
        }
        return false;
    }

    public static String LJ(int i, String str, Throwable th) {
        String localizedMessage;
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[ExceptionType-");
        sbLIZ.append(i);
        sbLIZ.append("]: ");
        if (th instanceof C477520Io2) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("code: ");
            C477520Io2 c477520Io2 = (C477520Io2) th;
            sbLIZ2.append(c477520Io2.getErrorCode());
            sbLIZ2.append(" logId: ");
            sbLIZ2.append(c477520Io2.getxTtLogId());
            sbLIZ2.append(" msg: ");
            sbLIZ2.append(c477520Io2.getErrorMsg());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else if (th instanceof C1811850xFX) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("code: ");
            C1811850xFX c1811850xFX = (C1811850xFX) th;
            sbLIZ3.append(c1811850xFX.statusCode);
            sbLIZ3.append(" msg: ");
            sbLIZ3.append(c1811850xFX.getLocalizedMessage());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        } else {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("msg: ");
            if (th != null) {
                localizedMessage = th.getLocalizedMessage();
            } else {
                localizedMessage = null;
            }
            sbLIZ4.append(localizedMessage);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
        }
        sbLIZ.append(strLIZIZ);
        sbLIZ.append(' ');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC076000Qc
    public void LIZ(int i, String str, Map<String, String> map) {
        LJII(i, str, null, map);
    }

    @Override // X.InterfaceC076000Qc
    public void LIZIZ(int i, String str, Throwable th, Map<String, String> map) {
        LJII(i, str, th, map);
    }

    public final void LJII(int i, String str, Throwable th, Map<String, String> map) {
        Map mapOf;
        if (th == null) {
            th = new Throwable(str);
        }
        if (LiveLinkMicExceptionUploadSetting.INSTANCE.canUpload(i)) {
            if (map != null) {
                mapOf = C19871212ow.of("linkmic_extra", map.toString());
            } else {
                mapOf = null;
            }
            LJI(i, str, th, mapOf);
        }
        boolean zCanUpload = LiveLinkMicAlogUploadSetting.INSTANCE.canUpload(i);
        if (!C500260Jjc.LJJIFFI(Boolean.valueOf(zCanUpload))) {
            boolean zLIZ = ((C588290N5n) C1163470gNl.LIZ.getValue()).LIZ();
            if (zCanUpload) {
                if (zLIZ) {
                    Throwable th2 = new Throwable();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("hitSample but out of freq of ALog ");
                    sbLIZ.append(i);
                    sbLIZ.append('.');
                    C1CC2.LIZ(C2188811AlT.LIZIZ(sbLIZ), th2);
                    return;
                }
                ((IHostMonitorAndLog) C1161920gLG.LIZJ(IHostMonitorAndLog.class)).Iz0();
                ((C588290N5n) C1163470gNl.LIZ.getValue()).LIZJ.add(Long.valueOf(System.currentTimeMillis()));
            }
        }
    }
}
