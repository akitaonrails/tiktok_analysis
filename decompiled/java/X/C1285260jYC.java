package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0jYC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1285260jYC {
    public boolean LIZ;
    public InterfaceC1285250jYB LIZIZ;
    public final EnumC1153070g6z LIZLLL;
    public boolean LJ;
    public final String LJFF;
    public String LJII;
    public boolean LJI = true;
    public final C1285280jYE LIZJ = new C1285280jYE();

    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            r2 = this;
            boolean r0 = r2.LJI
            r2.LIZ = r0
            java.lang.String r1 = r2.LJFF
            if (r1 == 0) goto L4c
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L4c
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "hevc"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L49
            java.lang.String r0 = "265"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L49
            java.lang.String r0 = "avc"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L34
            java.lang.String r0 = "264"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L4c
        L34:
            java.lang.String r1 = "video/avc"
        L36:
            r2.LJII = r1
            if (r1 == 0) goto L48
            r0 = 1920(0x780, float:2.69E-42)
            android.media.MediaFormat r1 = android.media.MediaFormat.createVideoFormat(r1, r0, r0)
            X.0jYL r0 = X.C1285350jYL.LJI
            X.0jYB r0 = r0.LIZIZ(r1, r2)
            r2.LIZIZ = r0
        L48:
            return
        L49:
            java.lang.String r1 = "video/hevc"
            goto L36
        L4c:
            r1 = 0
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1285260jYC.LIZIZ():void");
    }

    public final ByteBuffer[] LIZJ() {
        MediaCodec mediaCodecLIZIZ;
        InterfaceC1285250jYB interfaceC1285250jYB = this.LIZIZ;
        if (interfaceC1285250jYB == null || (mediaCodecLIZIZ = interfaceC1285250jYB.LIZIZ()) == null) {
            return null;
        }
        return mediaCodecLIZIZ.getOutputBuffers();
    }

    public final MediaFormat LIZLLL() {
        MediaCodec mediaCodecLIZIZ;
        InterfaceC1285250jYB interfaceC1285250jYB = this.LIZIZ;
        if (interfaceC1285250jYB == null || (mediaCodecLIZIZ = interfaceC1285250jYB.LIZIZ()) == null) {
            return null;
        }
        return mediaCodecLIZIZ.getOutputFormat();
    }

    public final void LJ() {
        C1285280jYE c1285280jYE = this.LIZJ;
        c1285280jYE.getClass();
        c1285280jYE.LIZ = System.currentTimeMillis();
        InterfaceC1285250jYB interfaceC1285250jYB = this.LIZIZ;
        if (interfaceC1285250jYB != null) {
            interfaceC1285250jYB.start();
        }
        C1285280jYE c1285280jYE2 = this.LIZJ;
        ((HashMap) c1285280jYE2.LIZIZ).put("SCodec", Long.valueOf(System.currentTimeMillis() - c1285280jYE2.LIZ));
    }

    public C1285260jYC(String str, EnumC1153070g6z enumC1153070g6z) {
        this.LJFF = str;
        this.LIZLLL = enumC1153070g6z;
    }

    public final void LIZ(MediaFormat mediaFormat, Surface surface) {
        boolean z;
        boolean z2;
        InterfaceC1285250jYB interfaceC1285250jYBLIZIZ = null;
        boolean z3 = false;
        if (this.LJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("configure ignored, mediaFormat:");
            sbLIZ.append(mediaFormat);
            sbLIZ.append(" surface:");
            sbLIZ.append(surface);
            sbLIZ.append(" crypto:");
            sbLIZ.append((Object) null);
            sbLIZ.append(" flags:");
            sbLIZ.append(0);
            sbLIZ.append(" stack:");
            sbLIZ.append(Log.getStackTraceString(new Throwable()));
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        this.LJ = true;
        String string = mediaFormat.getString("mime");
        this.LJII = string;
        C1285350jYL c1285350jYL = C1285350jYL.LJI;
        boolean z4 = c1285350jYL.LIZLLL;
        boolean z5 = this.LJI;
        boolean zContains = string.contains("video");
        if (z4 && z5) {
            z = true;
        } else {
            z = false;
        }
        if (C1283990jW9.LIZ >= 23) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && zContains && z2 && surface != null) {
            z3 = true;
        }
        this.LIZ = z3;
        C1285280jYE c1285280jYE = this.LIZJ;
        ((HashMap) c1285280jYE.LIZIZ).clear();
        c1285280jYE.LIZ = System.currentTimeMillis();
        C1285280jYE c1285280jYE2 = this.LIZJ;
        ((HashMap) c1285280jYE2.LIZIZ).put("CCodec", Long.valueOf(System.currentTimeMillis() - c1285280jYE2.LIZ));
        C1285280jYE c1285280jYE3 = this.LIZJ;
        c1285280jYE3.getClass();
        c1285280jYE3.LIZ = System.currentTimeMillis();
        C1285280jYE c1285280jYE4 = this.LIZJ;
        this.LJII.contains("video");
        c1285280jYE4.getClass();
        InterfaceC1285250jYB interfaceC1285250jYB = this.LIZIZ;
        if (interfaceC1285250jYB == null) {
            c1285350jYL.LIZ = true;
            try {
                interfaceC1285250jYBLIZIZ = c1285350jYL.LIZIZ(mediaFormat, this);
                c1285350jYL.LIZ(interfaceC1285250jYBLIZIZ, mediaFormat, surface, this);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("getCodecAdapter failed, e:");
                sbLIZ2.append(e);
                sbLIZ2.append(", codecAdapter:");
                sbLIZ2.append(interfaceC1285250jYBLIZIZ);
                C2188811AlT.LIZIZ(sbLIZ2);
            }
            this.LIZIZ = interfaceC1285250jYBLIZIZ;
        } else {
            c1285350jYL.LIZ(interfaceC1285250jYB, mediaFormat, surface, this);
        }
        InterfaceC1285250jYB interfaceC1285250jYB2 = this.LIZIZ;
        if (interfaceC1285250jYB2 != null && !interfaceC1285250jYB2.LJFF()) {
            C1285280jYE c1285280jYE5 = this.LIZJ;
            ((HashMap) c1285280jYE5.LIZIZ).put("CfgCodec", Long.valueOf(System.currentTimeMillis() - c1285280jYE5.LIZ));
            return;
        }
        throw new RuntimeException("create codec adapter failed");
    }
}
