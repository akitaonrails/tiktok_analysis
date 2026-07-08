package X;

import android.content.Context;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0WXB, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WXB {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(android.content.Context r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WXB.LIZIZ(android.content.Context):java.lang.String");
    }

    public static void LIZ(C0VSJ c0vsj, C0VSJ c0vsj2) throws Throwable {
        C0VSP c0vsp = new C0VSP(c0vsj);
        Throwable th = null;
        try {
            C0VSV c0vsv = new C0VSV(c0vsj2);
            try {
                byte[] bArr = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
                while (true) {
                    int i = c0vsp.read(bArr);
                    if (i != -1) {
                        c0vsv.write(bArr, 0, i);
                    } else {
                        C2107108Nh.LIZ(c0vsv, null);
                        C2107108Nh.LIZ(c0vsp, null);
                        c0vsj.delete();
                        return;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        th = th3;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(c0vsv, th);
                                throw th;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    th = null;
                }
            }
        } catch (Throwable th6) {
            try {
                TryCatchGuardChecker.doCheck(th6);
            } catch (Throwable th7) {
                th = th7;
            }
            try {
                throw th6;
            } catch (Throwable th8) {
                th = th8;
                th = th6;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        C2107108Nh.LIZ(c0vsp, th);
                        throw th;
                    } catch (Throwable th9) {
                        th = th9;
                    }
                }
            }
        }
    }

    public static C830090WhL LIZJ(Context context, InterfaceC824480WVy interfaceC824480WVy, C0WXN c0wxn) {
        if (((C830070WhJ) interfaceC824480WVy).LJI != EnumC830230WhZ.POST) {
            return C0WXC.LIZ(EnumC2273771DzD.METHOD_NOT_ALLOWED, "text/plain", "仅支持POST方法");
        }
        try {
            HashMap map = new HashMap();
            C830070WhJ c830070WhJ = (C830070WhJ) interfaceC824480WVy;
            c830070WhJ.LJII(map);
            if (map.isEmpty()) {
                return C0WXC.LIZ(EnumC2273771DzD.BAD_REQUEST, "text/plain", "未找到上传的文件");
            }
            Map.Entry entry = (Map.Entry) C13LP.LJJJJZ(map.entrySet());
            Object key = entry.getKey();
            String str = (String) entry.getValue();
            String strLIZIZ = (String) ((HashMap) c830070WhJ.LJI()).get(key);
            if (strLIZIZ == null) {
                strLIZIZ = "unknown.zip";
            }
            if (!u.LJIIZILJ(strLIZIZ, ".zip", true)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(".zip");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            C0VSJ c0vsj = new C0VSJ(LIZIZ(context), strLIZIZ);
            File parentFile = c0vsj.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            LIZ(new C0VSJ(str), c0vsj);
            if (c0wxn != null) {
                c0wxn.LIZIZ(c0vsj.getAbsolutePath());
            }
            EnumC2273771DzD enumC2273771DzD = EnumC2273771DzD.OK;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("文件上传成功: ");
            sbLIZ2.append(c0vsj.getAbsolutePath());
            return C0WXC.LIZ(enumC2273771DzD, "text/plain", C2188811AlT.LIZIZ(sbLIZ2));
        } catch (C830160WhS e) {
            TryCatchGuardChecker.doCheck(e);
            EnumC2273771DzD enumC2273771DzD2 = EnumC2273771DzD.BAD_REQUEST;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("请求错误: ");
            sbLIZ3.append(e.getMessage());
            return C0WXC.LIZ(enumC2273771DzD2, "text/plain", C2188811AlT.LIZIZ(sbLIZ3));
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
            EnumC2273771DzD enumC2273771DzD3 = EnumC2273771DzD.INTERNAL_ERROR;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("服务器错误: ");
            sbLIZ4.append(e2.getMessage());
            return C0WXC.LIZ(enumC2273771DzD3, "text/plain", C2188811AlT.LIZIZ(sbLIZ4));
        }
    }
}
