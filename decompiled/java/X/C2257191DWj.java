package X;

import android.graphics.Canvas;
import android.graphics.Picture;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: X.1DWj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2257191DWj {
    public C1DXA LIZ;
    public final Map<String, C1DX1> LIZIZ = new HashMap();
    public C1DX7 LIZJ;

    public final C2257131DWd LIZ() {
        EnumC2257261DWq enumC2257261DWq;
        EnumC2257261DWq enumC2257261DWq2;
        EnumC2257261DWq enumC2257261DWq3;
        EnumC2257261DWq enumC2257261DWq4;
        float fLIZ;
        EnumC2257261DWq enumC2257261DWq5;
        C1DXA c1dxa = this.LIZ;
        C2257141DWe c2257141DWe = c1dxa.LJIIL;
        C2257141DWe c2257141DWe2 = c1dxa.LJIILIIL;
        if (c2257141DWe == null || c2257141DWe.LJI() || (enumC2257261DWq = c2257141DWe.LLILLJJLI) == (enumC2257261DWq2 = EnumC2257261DWq.percent) || enumC2257261DWq == (enumC2257261DWq3 = EnumC2257261DWq.em) || enumC2257261DWq == (enumC2257261DWq4 = EnumC2257261DWq.ex)) {
            return new C2257131DWd(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        C1DX7 c1dx7 = this.LIZJ;
        float fLIZ2 = c2257141DWe.LIZ(c1dx7.LIZIZ, c1dx7.LIZJ);
        if (c2257141DWe2 == null) {
            C2257131DWd c2257131DWd = this.LIZ.LJIIIZ;
            fLIZ = c2257131DWd != null ? (c2257131DWd.LIZLLL * fLIZ2) / c2257131DWd.LIZJ : fLIZ2;
        } else {
            if (c2257141DWe2.LJI() || (enumC2257261DWq5 = c2257141DWe2.LLILLJJLI) == enumC2257261DWq2 || enumC2257261DWq5 == enumC2257261DWq3 || enumC2257261DWq5 == enumC2257261DWq4) {
                return new C2257131DWd(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            C1DX7 c1dx72 = this.LIZJ;
            fLIZ = c2257141DWe2.LIZ(c1dx72.LIZIZ, c1dx72.LIZJ);
        }
        return new C2257131DWd(0.0f, 0.0f, fLIZ2, fLIZ);
    }

    public static C2257191DWj LIZJ(String str) {
        InputStream inputStream;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getFromString():");
        sbLIZ.append(str);
        LynxLog.i("lynx_UISvg", C2188811AlT.LIZIZ(sbLIZ));
        C2257181DWi c2257181DWi = new C2257181DWi();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        boolean zMarkSupported = byteArrayInputStream.markSupported();
        InputStream bufferedInputStream = byteArrayInputStream;
        if (!zMarkSupported) {
            bufferedInputStream = new BufferedInputStream(byteArrayInputStream);
        }
        try {
            bufferedInputStream.mark(3);
            int i = bufferedInputStream.read() + (bufferedInputStream.read() << 8);
            bufferedInputStream.reset();
            inputStream = bufferedInputStream;
            if (i == 35615) {
                bufferedInputStream = new BufferedInputStream(new GZIPInputStream(bufferedInputStream));
                inputStream = bufferedInputStream;
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            inputStream = bufferedInputStream;
        }
        try {
            c2257181DWi.LJIJ(inputStream);
            C2257191DWj c2257191DWj = c2257181DWi.LIZ;
            try {
                inputStream.close();
                return c2257191DWj;
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return c2257191DWj;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                inputStream.close();
                throw th;
            } catch (IOException e3) {
                TryCatchGuardChecker.doCheck(e3);
                throw th;
            }
        }
    }

    public final C1DX1 LJFF(String str) {
        String strSubstring;
        if (str == null) {
            return null;
        }
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        String strReplace = str.replace("\\\n", "").replace("\\A", "\n");
        if (strReplace.length() <= 1 || !strReplace.startsWith("#") || (strSubstring = strReplace.substring(1)) == null || strSubstring.length() == 0) {
            return null;
        }
        if (strSubstring.equals(this.LIZ.LIZJ)) {
            return this.LIZ;
        }
        if (((HashMap) this.LIZIZ).containsKey(strSubstring)) {
            return (C1DX1) ((HashMap) this.LIZIZ).get(strSubstring);
        }
        C1DX1 c1dx1LIZIZ = LIZIZ(this.LIZ, strSubstring);
        ((HashMap) this.LIZIZ).put(strSubstring, c1dx1LIZIZ);
        return c1dx1LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C1DX1 LIZIZ(C1DXL c1dxl, String str) {
        C1DX1 c1dx1LIZIZ;
        C1DX1 c1dx1 = (C1DX1) c1dxl;
        if (str.equals(c1dx1.LIZJ)) {
            return c1dx1;
        }
        for (Object obj : c1dxl.LIZ()) {
            if (obj instanceof C1DX1) {
                C1DX1 c1dx12 = (C1DX1) obj;
                if (str.equals(c1dx12.LIZJ)) {
                    return c1dx12;
                }
                if ((obj instanceof C1DXL) && (c1dx1LIZIZ = LIZIZ((C1DXL) obj, str)) != null) {
                    return c1dx1LIZIZ;
                }
            }
        }
        return null;
    }

    public final Picture LJ(C1DX7 c1dx7, C1290350jgP c1290350jgP) {
        C2257141DWe c2257141DWe;
        C2257131DWd c2257131DWd;
        this.LIZJ = c1dx7;
        C1DXA c1dxa = this.LIZ;
        if (c1dxa == null) {
            LynxLog.e("SVG", " bad format SVG, rootElement is null");
            return null;
        }
        C2257131DWd c2257131DWd2 = c1dxa.LJIIIZ;
        if (c1dx7 != null && (c2257131DWd = c1dx7.LIZ) != null) {
            return LIZLLL((int) Math.ceil(c2257131DWd.LIZ + c2257131DWd.LIZJ), (int) Math.ceil(c2257131DWd.LIZIZ + c2257131DWd.LIZLLL), c1dx7, c1290350jgP);
        }
        C2257141DWe c2257141DWe2 = c1dxa.LJIIL;
        if (c2257141DWe2 != null) {
            EnumC2257261DWq enumC2257261DWq = c2257141DWe2.LLILLJJLI;
            EnumC2257261DWq enumC2257261DWq2 = EnumC2257261DWq.percent;
            if (enumC2257261DWq != enumC2257261DWq2 && (c2257141DWe = c1dxa.LJIILIIL) != null && c2257141DWe.LLILLJJLI != enumC2257261DWq2) {
                return LIZLLL((int) Math.ceil(c2257141DWe2.LIZ(c1dx7.LIZIZ, c1dx7.LIZJ)), (int) Math.ceil(this.LIZ.LJIILIIL.LIZ(c1dx7.LIZIZ, c1dx7.LIZJ)), c1dx7, c1290350jgP);
            }
            if (c2257131DWd2 != null) {
                return LIZLLL((int) Math.ceil(c2257141DWe2.LIZ(c1dx7.LIZIZ, c1dx7.LIZJ)), (int) Math.ceil((c2257131DWd2.LIZLLL * r1) / c2257131DWd2.LIZJ), c1dx7, c1290350jgP);
            }
        }
        C2257141DWe c2257141DWe3 = c1dxa.LJIILIIL;
        if (c2257141DWe3 != null && c2257131DWd2 != null) {
            return LIZLLL((int) Math.ceil((c2257131DWd2.LIZJ * r2) / c2257131DWd2.LIZLLL), (int) Math.ceil(c2257141DWe3.LIZ(c1dx7.LIZIZ, c1dx7.LIZJ)), c1dx7, c1290350jgP);
        }
        return LIZLLL(512, 512, c1dx7, c1290350jgP);
    }

    public final Picture LIZLLL(int i, int i2, C1DX7 c1dx7, C1290350jgP c1290350jgP) {
        this.LIZJ = c1dx7;
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(i, i2);
        if (c1dx7 != null) {
            if (c1dx7.LIZ == null) {
                c1dx7 = new C1DX7(c1dx7);
            }
            C2257171DWh c2257171DWh = new C2257171DWh(canvasBeginRecording, c1dx7.LIZIZ, c1290350jgP);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("beforeRenderDocument(),  svg hasCode:");
            sbLIZ.append(this);
            LynxLog.i("lynx_UISvg", C2188811AlT.LIZIZ(sbLIZ));
            c2257171DWh.LJJIIJ(this, c1dx7);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("AfterRenderDocument(),svg hasCode:");
            sbLIZ2.append(this);
            LynxLog.i("lynx_UISvg", C2188811AlT.LIZIZ(sbLIZ2));
            picture.endRecording();
            return picture;
        }
        c1dx7 = new C1DX7(14.0f, 14.0f);
        c1dx7.LIZ(i, i2);
        C2257171DWh c2257171DWh2 = new C2257171DWh(canvasBeginRecording, c1dx7.LIZIZ, c1290350jgP);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("beforeRenderDocument(),  svg hasCode:");
        sbLIZ3.append(this);
        LynxLog.i("lynx_UISvg", C2188811AlT.LIZIZ(sbLIZ3));
        c2257171DWh2.LJJIIJ(this, c1dx7);
        StringBuilder sbLIZ22 = C2188811AlT.LIZ();
        sbLIZ22.append("AfterRenderDocument(),svg hasCode:");
        sbLIZ22.append(this);
        LynxLog.i("lynx_UISvg", C2188811AlT.LIZIZ(sbLIZ22));
        picture.endRecording();
        return picture;
    }
}
