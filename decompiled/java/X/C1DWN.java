package X;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkListener;
import com.ss.android.vesdk.VEUtils;
import kotlin.text.u;
import lth.o;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1DWN, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DWN implements C128I {
    public static final String LJIIJJI = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJJJI("pic/");
    public boolean LIZ;
    public boolean LIZIZ;
    public String LIZLLL;
    public String LJ;
    public WaterMarkBuilder LJFF;
    public long LJI;
    public C1DWR LJII;
    public InterfaceC1781960wTK LJIIIIZZ;
    public VEUtils.VEVideoFileInfo LJIIIZ;
    public final Context LIZJ = C786410Ut5.M3(C0CHQ.LIZ);
    public final CreativeInfo LJIIJ = new CreativeInfo(null, 0, null, 7, null);

    @Override // X.C128I
    public final void LIZIZ() {
        this.LIZ = true;
        this.LIZIZ = true;
        this.LIZLLL = null;
        this.LJ = null;
        InterfaceC1781960wTK interfaceC1781960wTK = this.LJIIIIZZ;
        if (interfaceC1781960wTK != null) {
            interfaceC1781960wTK.reset();
        }
        C1DWR c1dwr = this.LJII;
        if (c1dwr != null && c1dwr.LIZIZ) {
            C1DWS c1dws = c1dwr.LIZJ;
            if (c1dws != null) {
                C1DWR.LIZIZ(c1dws);
            }
            C1463670oBx c1463670oBx = c1dwr.LIZLLL;
            if (c1463670oBx != null) {
                c1463670oBx.destroy();
            }
            c1dwr.LIZLLL = null;
            c1dwr.LIZIZ = false;
        }
        WaterMarkListener waterMarkListener = this.LJFF.listener;
        if (waterMarkListener != null) {
            waterMarkListener.onCancel();
        }
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
            r6 = this;
            com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder r0 = r6.LJFF
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r0.addInterMark
            if (r0 == 0) goto L4a
            r4 = 0
            r6.LJ(r4)
            com.ss.android.ugc.aweme.services.audio.IAudioWatermarkService r0 = com.ss.android.ugc.gamora.editor.audioservice.service.watermark.AudioWatermarkServiceImpl.LJ()
            boolean r0 = r0.enbaleAudioWatermarkTTSVC()
            if (r0 == 0) goto L5f
            com.ss.android.ugc.aweme.services.audio.IAudioWatermarkService r5 = com.ss.android.ugc.gamora.editor.audioservice.service.watermark.AudioWatermarkServiceImpl.LJ()
            com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder r0 = r6.LJFF
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
            r0 = 168(0xa8, float:2.35E-43)
            r1.<init>(r6, r0)
            r5.fetchAudioWatermarkInfo(r3, r2, r1)
        L37:
            X.0wTK r2 = r6.LJIIIIZZ
            com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder r0 = r6.LJFF
            X.1DWa r1 = r0.author
            r0 = 1
            r2.LJIIIZ(r0, r1)
            X.0wTK r1 = r6.LJIIIIZZ
            com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder r0 = r6.LJFF
            X.1DWa r0 = r0.author
            r1.LJIIIZ(r4, r0)
        L4a:
            com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder r0 = r6.LJFF
            boolean r0 = r0.isInstagram
            if (r0 == 0) goto L5e
            X.1DsM r0 = lth.o.LJII
            r0.getClass()
            boolean r0 = X.C1380880m2Q.LIZ()
            if (r0 == 0) goto L5e
            r6.LJI()
        L5e:
            return
        L5f:
            X.0wTK r3 = r6.LJIIIIZZ
            if (r3 == 0) goto L37
            com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder r2 = r6.LJFF
            r1 = 0
            if (r2 == 0) goto L70
            java.lang.String r0 = r2.ttsVoiceCreatorDesc
            X.1DWa r1 = r2.author
        L6c:
            r3.LJII(r0, r1)
            goto L37
        L70:
            r0 = r1
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DWN.LIZ():void");
    }

    public final void LJI() {
        String str = this.LIZLLL;
        if (str == null || !C2286708xd.LIZJ(str)) {
            final String nickname = this.LJFF.author.getNickname();
            UrlModel avatarMedium = this.LJFF.author.getAvatarMedium();
            try {
                InterfaceC452050Ho3 interfaceC452050Ho3 = new InterfaceC452050Ho3() { // from class: X.0Ho2
                    @Override // X.InterfaceC452050Ho3
                    public final void onFailure() {
                    }

                    /* JADX WARN: Removed duplicated region for block: B:36:0x0135  */
                    /* JADX WARN: Removed duplicated region for block: B:39:0x0167  */
                    /* JADX WARN: Removed duplicated region for block: B:42:0x01cf  */
                    /* JADX WARN: Removed duplicated region for block: B:45:0x0216  */
                    /* JADX WARN: Removed duplicated region for block: B:49:0x0276  */
                    /* JADX WARN: Removed duplicated region for block: B:51:0x0280  */
                    /* JADX WARN: Removed duplicated region for block: B:54:0x02a3  */
                    /* JADX WARN: Removed duplicated region for block: B:56:0x02ad  */
                    /* JADX WARN: Removed duplicated region for block: B:60:0x02c3  */
                    /* JADX WARN: Removed duplicated region for block: B:64:0x02ce  */
                    /* JADX WARN: Removed duplicated region for block: B:65:0x02d1  */
                    /* JADX WARN: Removed duplicated region for block: B:66:0x02d9  */
                    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
                    @Override // X.InterfaceC452050Ho3
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ(X.InterfaceC1320200kSY<X.C1323050kX9<X.AbstractC1327750kej>> r25) throws java.lang.Throwable {
                        /*
                            Method dump skipped, instruction units count: 769
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C452040Ho2.LIZ(X.0kSY):void");
                    }
                };
                C1325710kbR[] c1325710kbRArrLJIILLIIL = C1324750kZt.LJIILLIIL(avatarMedium, null, EnumC1331380kka.MEDIUM, Bitmap.Config.RGB_565);
                C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
                C452060Ho4 c452060Ho4 = new C452060Ho4(interfaceC452050Ho3, c1325540kbALIZ, c1325710kbRArrLJIILLIIL);
                if (c1325710kbRArrLJIILLIIL.length > 0) {
                    c1325540kbALIZ.LJI(c1325710kbRArrLJIILLIIL[0], null).LIZJ(c452060Ho4, C822690WPb.LIZ());
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public C1DWN() {
        C2354709Kn.LJFF(LJIIJJI, false);
    }

    @Override // X.C128I
    public final void LIZJ(WaterMarkBuilder waterMarkBuilder) {
        this.LJFF = waterMarkBuilder;
    }

    public final void LJ(boolean z) {
        Video video;
        WaterMarkBuilder waterMarkBuilder = this.LJFF;
        if (waterMarkBuilder != null && (video = waterMarkBuilder.video) != null) {
            if (this.LJIIIIZZ == null || z) {
                int i = waterMarkBuilder.saveType;
                int width = video.getWidth();
                int height = this.LJFF.video.getHeight();
                CreativeInfo creativeInfo = this.LJIIJ;
                WaterMarkBuilder waterMarkBuilder2 = this.LJFF;
                if (waterMarkBuilder2 != null) {
                    this.LJIIIIZZ = C1781950wTJ.LIZIZ(creativeInfo, i, waterMarkBuilder2.video.getPlayAddrH264().getBitRatedRatioUri(), new int[]{width, height});
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    @Override // X.C128I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void waterMark(com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder r8) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DWN.waterMark(com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder):void");
    }

    public final void LIZLLL(int i, int i2, String str) {
        this.LIZLLL = null;
        this.LJ = null;
        InterfaceC1781960wTK interfaceC1781960wTK = this.LJIIIIZZ;
        if (interfaceC1781960wTK != null) {
            interfaceC1781960wTK.reset();
        }
        WaterMarkListener waterMarkListener = this.LJFF.listener;
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

    public final void LJFF(int i, int i2, String str, boolean z) {
        boolean zEquals;
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LJI;
        long jLJIIIZ = C2471909mP.LJIIIZ(this.LJFF.inputPath);
        if (C2471909mP.LJJIJ() && C2471909mP.LJJIIZI(this.LJFF.inputPath)) {
            zEquals = u.LJIIZILJ(C2471909mP.LJIJI(this.LJFF.inputPath), "/mp4", false);
        } else {
            zEquals = TextUtils.equals(C2120408Sk.LIZ(new C0VSJ(this.LJFF.inputPath).getPath()), "20");
        }
        if (z) {
            C543670LTx c543670LTx = new C543670LTx();
            c543670LTx.LIZ.put("watermark_duration", Long.valueOf(jCurrentTimeMillis));
            c543670LTx.LIZ.put("download_rate", Long.valueOf(this.LJFF.mDownloadRate));
            c543670LTx.LIZ.put("download_duration", Long.valueOf(this.LJFF.mDownloadDuration));
            c543670LTx.LIZ.put("isInstagram", Boolean.valueOf(this.LJFF.isInstagram));
            c543670LTx.LIZ.put("file_size", Long.valueOf(jLJIIIZ));
            c543670LTx.LIZ.put("url", this.LJFF.mUrl);
            c543670LTx.LIZ.put("needWaterMark", Boolean.TRUE);
            c543670LTx.LIZ.put("ret", "null");
            c543670LTx.LIZ.put("ext", "null");
            c543670LTx.LIZ.put("msg", "null");
            c543670LTx.LIZ.put("isMp4", Boolean.valueOf(zEquals));
            C1637890six.LJ("save_video_success_rate", 0, c543670LTx.LJ());
            return;
        }
        C543670LTx c543670LTx2 = new C543670LTx();
        c543670LTx2.LIZ.put("watermark_duration", Long.valueOf(jCurrentTimeMillis));
        c543670LTx2.LIZ.put("download_rate", Long.valueOf(this.LJFF.mDownloadRate));
        c543670LTx2.LIZ.put("download_duration", Long.valueOf(this.LJFF.mDownloadDuration));
        c543670LTx2.LIZ.put("isInstagram", Boolean.valueOf(this.LJFF.isInstagram));
        c543670LTx2.LIZ.put("file_size", Long.valueOf(jLJIIIZ));
        c543670LTx2.LIZ.put("url", this.LJFF.mUrl);
        c543670LTx2.LIZ.put("needWaterMark", Boolean.TRUE);
        c543670LTx2.LIZ.put("ret", Integer.valueOf(i));
        c543670LTx2.LIZ.put("ext", Integer.valueOf(i2));
        c543670LTx2.LIZ.put("msg", str);
        c543670LTx2.LIZ.put("isMp4", Boolean.valueOf(zEquals));
        C1637890six.LJ("save_video_success_rate", 2, c543670LTx2.LJ());
    }
}
