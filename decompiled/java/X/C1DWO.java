package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkListener;
import com.ss.android.vesdk.VEUtils;
import lth.o;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1DWO, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DWO implements C128I {
    public static final String LJIIIZ = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJJJI("pic/");
    public boolean LIZ;
    public boolean LIZIZ;
    public WaterMarkBuilder LIZLLL;
    public long LJ;
    public C1DWQ LJFF;
    public InterfaceC1781960wTK LJI;
    public VEUtils.VEVideoFileInfo LJII;
    public final Context LIZJ = C786410Ut5.M3(C0CHQ.LIZ);
    public final CreativeInfo LJIIIIZZ = new CreativeInfo(null, 0, null, 7, null);

    @Override // X.C128I
    public final void LIZIZ() {
        WaterMarkListener waterMarkListener;
        this.LIZ = true;
        this.LIZIZ = true;
        InterfaceC1781960wTK interfaceC1781960wTK = this.LJI;
        if (interfaceC1781960wTK != null) {
            interfaceC1781960wTK.reset();
        }
        C1DWQ c1dwq = this.LJFF;
        if (c1dwq != null && c1dwq.LIZIZ) {
            C1DWS c1dws = c1dwq.LIZJ;
            if (c1dws != null) {
                C1DWQ.LIZIZ(c1dws);
            }
            C1463670oBx c1463670oBx = c1dwq.LIZLLL;
            if (c1463670oBx != null) {
                c1463670oBx.destroy();
            }
            c1dwq.LIZLLL = null;
            c1dwq.LIZIZ = false;
        }
        WaterMarkBuilder waterMarkBuilder = this.LIZLLL;
        if (waterMarkBuilder == null || (waterMarkListener = waterMarkBuilder.listener) == null) {
            return;
        }
        waterMarkListener.onCancel();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027 A[PHI: r3
      0x0027: PHI (r3v4 java.util.List<java.lang.String>) = (r3v1 java.util.List<java.lang.String>), (r3v5 java.util.List<java.lang.String>) binds: [B:14:0x0025, B:12:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002b A[PHI: r3
      0x002b: PHI (r3v3 java.util.List<java.lang.String>) = (r3v1 java.util.List<java.lang.String>), (r3v4 java.util.List<java.lang.String>) binds: [B:14:0x0025, B:16:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C128I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder r0 = r8.LIZLLL
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r0.addInterMark
            if (r0 == 0) goto L4a
            r5 = 0
            r8.LJ(r5)
            com.ss.android.ugc.aweme.services.audio.IAudioWatermarkService r0 = com.ss.android.ugc.gamora.editor.audioservice.service.watermark.AudioWatermarkServiceImpl.LJ()
            boolean r0 = r0.enbaleAudioWatermarkTTSVC()
            if (r0 == 0) goto L37
            com.ss.android.ugc.aweme.services.audio.IAudioWatermarkService r4 = com.ss.android.ugc.gamora.editor.audioservice.service.watermark.AudioWatermarkServiceImpl.LJ()
            com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder r0 = r8.LIZLLL
            if (r0 == 0) goto L23
            java.util.List<java.lang.String> r3 = r0.ttsCreatorIdList
            if (r3 != 0) goto L27
        L23:
            X.13BV r3 = X.C13BV.INSTANCE
            if (r0 == 0) goto L2b
        L27:
            java.util.List<java.lang.String> r2 = r0.vcCreatorIdList
            if (r2 != 0) goto L2d
        L2b:
            X.13BV r2 = X.C13BV.INSTANCE
        L2d:
            kotlin.jvm.internal.AwS614S0100000_35 r1 = new kotlin.jvm.internal.AwS614S0100000_35
            r0 = 169(0xa9, float:2.37E-43)
            r1.<init>(r8, r0)
            r4.fetchAudioWatermarkInfo(r3, r2, r1)
        L37:
            X.0wTK r2 = r8.LJI
            com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder r0 = r8.LIZLLL
            X.1DWa r1 = r0.author
            r0 = 1
            r2.LJIIIZ(r0, r1)
            X.0wTK r1 = r8.LJI
            com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder r0 = r8.LIZLLL
            X.1DWa r0 = r0.author
            r1.LJIIIZ(r5, r0)
        L4a:
            com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder r0 = r8.LIZLLL
            boolean r0 = r0.isInstagram
            if (r0 == 0) goto L97
            X.1DsM r0 = lth.o.LJII
            r0.getClass()
            boolean r0 = X.C1380880m2Q.LIZ()
            if (r0 == 0) goto L97
            android.content.Context r0 = r8.LIZJ
            if (r0 == 0) goto L97
            com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder r0 = r8.LIZLLL
            if (r0 == 0) goto L97
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.video
            int r2 = r0.getWidth()
            com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder r0 = r8.LIZLLL
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.video
            int r1 = r0.getHeight()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r3.add(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.add(r0)
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.128L r2 = r0.LIZIZ()
            com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder r0 = r8.LIZLLL
            java.lang.String r4 = r0.inputPath
            X.1DWa r5 = r0.author
            r6 = 0
            r7 = r6
            r2.LIZ(r3, r4, r5, r6, r7)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DWO.LIZ():void");
    }

    public C1DWO() {
        C2354709Kn.LJFF(LJIIIZ, false);
    }

    @Override // X.C128I
    public final void LIZJ(WaterMarkBuilder waterMarkBuilder) {
        this.LIZLLL = waterMarkBuilder;
    }

    public final void LJ(boolean z) {
        Video video;
        int i;
        WaterMarkBuilder waterMarkBuilder = this.LIZLLL;
        if (waterMarkBuilder != null && (video = waterMarkBuilder.video) != null) {
            if (this.LJI == null || z) {
                if (waterMarkBuilder.isInstagram) {
                    i = 2;
                } else {
                    i = -1;
                }
                int width = video.getWidth();
                int height = this.LIZLLL.video.getHeight();
                CreativeInfo creativeInfo = this.LJIIIIZZ;
                WaterMarkBuilder waterMarkBuilder2 = this.LIZLLL;
                if (waterMarkBuilder2 != null) {
                    this.LJI = C1781950wTJ.LIZIZ(creativeInfo, i, waterMarkBuilder2.video.getPlayAddrH264().getBitRatedRatioUri(), new int[]{width, height});
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017c  */
    @Override // X.C128I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void waterMark(com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder r8) {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DWO.waterMark(com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder):void");
    }

    public final void LIZLLL(int i, int i2, String str) {
        InterfaceC1781960wTK interfaceC1781960wTK = this.LJI;
        if (interfaceC1781960wTK != null) {
            interfaceC1781960wTK.reset();
        }
        WaterMarkListener waterMarkListener = this.LIZLLL.listener;
        if (waterMarkListener != null) {
            waterMarkListener.onError(i2);
        }
        if (!this.LIZ) {
            this.LIZ = true;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("WaterMarkComposer ret: ");
            sbLIZ.append(i);
            C201955140j.LJI("reportWaterComposeErrorForVESDK", new Exception(C2188811AlT.LIZIZ(sbLIZ)));
            Application application = o.LIZ;
            try {
                if (C036E.LIZ.LIZIZ()) {
                    C1637890six.LJ("aweme_download_synthesis_error_rate", 1, null);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                C1B9C c1b9c = C612400O0g.LIZ;
                jSONObject.put("netWorkQuality", c1b9c.LIZIZ().toString());
                jSONObject.put("netWorkSpeed", (int) c1b9c.LIZJ());
                jSONObject.put("ret", i);
                jSONObject.put("ext", i2);
                jSONObject.put("msg", str);
                C1637890six.LIZ("aweme_movie_synthesis_log", "video_download_compose", jSONObject);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C201955140j.LJI("reportWaterComposeErrorForVESDK error", e2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(int r22, int r23, java.lang.String r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DWO.LJFF(int, int, java.lang.String, boolean):void");
    }
}
