package X;

import android.opengl.GLES20;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.nio.Buffer;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: renamed from: X.0jGb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1274350jGb implements InterfaceC1272760jE2, InterfaceC1268830j7h {
    public static int LLJIJIL;
    public static int LLJILJIL;
    public static int LLJILJILJ;
    public InterfaceC1274410jGh LLILLJJLI;
    public boolean LLILLL;
    public long LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public final String LL = "InteractVideoClient";
    public final C1274310jGX LLJI = new C1274310jGX();

    @Override // X.C0UHD
    public final void u(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr, Object... objArr) {
    }

    public final void LIZ() {
        this.LLJ++;
        LLJILJILJ++;
        int iGlGetError = GLES20.glGetError();
        String strLIZIZ = "";
        int i = 0;
        boolean z = false;
        while (iGlGetError != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(", error code:");
            sbLIZ.append(iGlGetError);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (iGlGetError == 1282) {
                this.LLIZ++;
                LLJIJIL++;
                z = true;
            } else if (iGlGetError == 1285) {
                this.LLIZLLLIL++;
                LLJILJIL++;
            }
            iGlGetError = GLES20.glGetError();
            i++;
            if (i >= 10) {
                break;
            }
        }
        if (!TextUtils.isEmpty(strLIZIZ)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("rtc opengl error:");
            sbLIZ2.append(strLIZIZ);
            AVLog.ioe("GLUtil", C2188811AlT.LIZIZ(sbLIZ2));
            if (!this.LLILZIL) {
                this.LLILZIL = true;
                String str = this.LL;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("rtc opengl error:");
                sbLIZ3.append(strLIZIZ);
                AVLog.logKibana(6, str, C2188811AlT.LIZIZ(sbLIZ3), null);
            } else if (z && !this.LLILZLL) {
                this.LLILZLL = true;
                String str2 = this.LL;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("rtc opengl error:");
                sbLIZ4.append(strLIZIZ);
                AVLog.logKibana(6, str2, C2188811AlT.LIZIZ(sbLIZ4), null);
            }
        }
        if (this.LLJ % 75 == 0) {
            if (this.LLIZ > 0 || this.LLIZLLLIL > 0) {
                AVLog.logKibana(6, this.LL, C786410Ut5.j4("RTC OPENGL errors:[current 5s(1285_occurs:%d, 1282_occurs:%d) ,total(1285_occurs:%d, 1282_occurs:%d), total_frames_number:%d]", new Object[]{Integer.valueOf(this.LLIZLLLIL), Integer.valueOf(this.LLIZ), Integer.valueOf(LLJILJIL), Integer.valueOf(LLJIJIL), Integer.valueOf(LLJILJILJ)}), null);
                this.LLIZ = 0;
                this.LLIZLLLIL = 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02ab  */
    @Override // X.InterfaceC1268830j7h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q0(java.nio.ByteBuffer r23, int r24, int r25, long r26, java.lang.Object... r28) {
        /*
            Method dump skipped, instruction units count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1274350jGb.q0(java.nio.ByteBuffer, int, int, long, java.lang.Object[]):void");
    }

    @Override // X.C0UHD
    public final void LLLLZLL(EGLContext eGLContext, int i, boolean z, InterfaceC1272490jDb interfaceC1272490jDb, int i2, int i3, long j, float[] fArr, long j2, Object... objArr) {
        long jCurrentTimeMillis;
        Buffer buffer;
        Object objValueOf;
        C1274310jGX c1274310jGX = this.LLJI;
        if (c1274310jGX != null) {
            jCurrentTimeMillis = System.currentTimeMillis();
        } else {
            jCurrentTimeMillis = 0;
        }
        if (objArr.length >= 1) {
            buffer = (Buffer) objArr[0];
        } else {
            buffer = null;
        }
        if (C1267520j5a.LIZ()) {
            String str = this.LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Send rtc extra data ");
            if (buffer == null) {
                objValueOf = "null";
            } else {
                objValueOf = Integer.valueOf(buffer.capacity());
            }
            sbLIZ.append(objValueOf);
            AVLog.i(str, C2188811AlT.LIZIZ(sbLIZ));
        }
        InterfaceC1274410jGh interfaceC1274410jGh = this.LLILLJJLI;
        if (interfaceC1274410jGh != null && this.LLILLL) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (jCurrentTimeMillis2 - this.LLILZ > 10000) {
                String str2 = this.LL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Input interact video frame tex ");
                sbLIZ2.append(i);
                AVLog.ioi(str2, C2188811AlT.LIZIZ(sbLIZ2));
                this.LLILZ = jCurrentTimeMillis2;
            }
            try {
                try {
                    ((C1274340jGa) interfaceC1274410jGh).LIZ(GLThreadManager.getEGLContext(), i, z, fArr, interfaceC1272490jDb, i2, i3, j / 1000000, j2, objArr);
                    LIZ();
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    C1274070jG9 c1274070jG9 = C1274080jGA.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(this.LL);
                    sbLIZ3.append(".onTextureFrameAvailable");
                    c1274070jG9.LIZ(C2188811AlT.LIZIZ(sbLIZ3), th);
                    if (!C1274040jG6.LIZ()) {
                        AVLog.ioe(this.LL, "Rtc updateVideoFrame error", th);
                        LIZ();
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("VideoClient update frame exception(");
                        sbLIZ4.append(th.getMessage());
                        sbLIZ4.append(")");
                        ((C1274340jGa) interfaceC1274410jGh).LJFF.LJJJIL = C2188811AlT.LIZIZ(sbLIZ4);
                    } else {
                        throw new AndroidRuntimeException(th.getMessage(), th);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (c1274310jGX != null) {
            c1274310jGX.LIZ(System.currentTimeMillis() - jCurrentTimeMillis);
        }
    }
}
