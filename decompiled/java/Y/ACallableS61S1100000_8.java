package Y;

import X.C0L45;
import X.C0L48;
import X.C1292000jj4;
import X.C1294250jmh;
import X.C1294720jnS;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1C7U;
import X.C2471909mP;
import X.C366700EZg;
import X.C531250KsV;
import X.EnumC1338240kve;
import X.InterfaceC1331910klR;
import android.graphics.Bitmap;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.o;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveBusinessGiftHighlight;
import com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl;
import com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2;
import java.io.InputStream;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public class ACallableS61S1100000_8 implements Callable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS61S1100000_8 aCallableS61S1100000_8) {
        Object obj;
        C1C7U.LIZ("VEMediaParserProviderV2@d09d.getBitmapFromCache$1");
        C0L45 c0l45LIZ = ((C0L48) ((VEMediaParserProviderV2) aCallableS61S1100000_8.l1).LLIZ.getValue()).LIZ(aCallableS61S1100000_8.s0);
        if (c0l45LIZ != null) {
            obj = c0l45LIZ.LIZ;
        } else {
            obj = null;
        }
        C1C7U.LIZIZ("VEMediaParserProviderV2@d09d.getBitmapFromCache$1");
        return obj;
    }

    public static final Object call$1(ACallableS61S1100000_8 aCallableS61S1100000_8) {
        InputStream inputStream = (InputStream) aCallableS61S1100000_8.l1;
        String str = aCallableS61S1100000_8.s0;
        C1C7U.LIZ("LottieCompositionFactory@f22f.fromJsonInputStream$1L");
        C1292000jj4<C1294720jnS> c1292000jj4LJFF = C1294250jmh.LJFF(inputStream, str);
        C1C7U.LIZIZ("LottieCompositionFactory@f22f.fromJsonInputStream$1L");
        return c1292000jj4LJFF;
    }

    public static final Object call$2(ACallableS61S1100000_8 aCallableS61S1100000_8) {
        Object obj;
        C1C7U.LIZ("VEMediaParserFrameProviderImpl@276f.getBitmapFromCache$1");
        C0L45 c0l45LIZ = ((C0L48) ((VEMediaParserFrameProviderImpl) aCallableS61S1100000_8.l1).LLILZLL.getValue()).LIZ(aCallableS61S1100000_8.s0);
        if (c0l45LIZ != null) {
            obj = c0l45LIZ.LIZ;
        } else {
            obj = null;
        }
        C1C7U.LIZIZ("VEMediaParserFrameProviderImpl@276f.getBitmapFromCache$1");
        return obj;
    }

    public static final Object call$3(ACallableS61S1100000_8 aCallableS61S1100000_8) {
        C1C7U.LIZ("PreviewVideoClipFrameThumbnailsAdapter@693d.cacheBitmap$2$1");
        C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(C2471909mP.LJIILIIL(aCallableS61S1100000_8.s0));
        int i = (int) ((C531250KsV) aCallableS61S1100000_8.l1).LLILLJJLI;
        int iLIZ = C366700EZg.LIZ(48.0d);
        c1331670kl3LJI.LJIIIIZZ = i;
        c1331670kl3LJI.LJIIIZ = iLIZ;
        c1331670kl3LJI.LJIL = Bitmap.Config.ARGB_8888;
        c1331670kl3LJI.LJJ = EnumC1338240kve.CENTER_CROP;
        c1331670kl3LJI.LJJIL = true;
        final C531250KsV c531250KsV = (C531250KsV) aCallableS61S1100000_8.l1;
        final String str = aCallableS61S1100000_8.s0;
        c1331670kl3LJI.LJJII(new InterfaceC1331910klR() { // from class: X.0KsX
            @Override // X.InterfaceC1331910klR
            public final void onCanceled() {
            }

            @Override // X.InterfaceC1331910klR
            public final void onFailed(Throwable th) {
            }

            @Override // X.InterfaceC1331910klR
            public final void onProgress(float f) {
            }

            @Override // X.InterfaceC1331910klR
            public final void LIZ(Bitmap bitmap) {
                if (bitmap != null && !bitmap.isRecycled()) {
                    C531250KsV c531250KsV2 = c531250KsV;
                    C532990KvJ c532990KvJ = c531250KsV2.LLILZLL;
                    String str2 = str;
                    synchronized (c532990KvJ) {
                        try {
                            c531250KsV2.LLILZLL.put(str2, bitmap);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PreviewVideoClipFrameThumbnailsAdapter@693d.cacheBitmap$2$1");
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$4(Y.ACallableS61S1100000_8 r6) {
        /*
            java.lang.String r5 = "DataConverterKt@c573.saveVideoCoverPath$2"
            X.C1C7U.LIZ(r5)
            java.lang.Object r0 = r6.l1
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = (com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r0
            boolean r0 = r0.isMvThemeVideoType()
            r4 = 0
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r6.l1
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt r0 = (com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt) r0
            com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData r0 = r0.getMvCreateVideoData()
            if (r0 == 0) goto L47
            java.lang.String r3 = r0.videoCoverImgPath
        L1c:
            boolean r0 = X.C493401w4.LIZ()
            if (r0 == 0) goto L34
            X.0MH8 r2 = X.C0MH8.LIZ
            java.lang.Object r1 = r6.l1
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = (com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r1
            java.lang.String r0 = r6.s0
            r2.getClass()
            X.C0MH8.LIZLLL(r1, r3, r0)
        L30:
            X.C1C7U.LIZIZ(r5)
            return r4
        L34:
            java.lang.String r0 = r6.s0
            X.C2354709Kn.LIZLLL(r3, r0)
            goto L30
        L3a:
            java.lang.Object r0 = r6.l1
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt r0 = (com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt) r0
            com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData r0 = r0.getMultiEditVideoRecordData()
            if (r0 == 0) goto L47
            java.lang.String r3 = r0.coverImagePath
            goto L1c
        L47:
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS61S1100000_8.call$4(Y.ACallableS61S1100000_8):java.lang.Object");
    }

    public static final Object call$5(ACallableS61S1100000_8 aCallableS61S1100000_8) {
        Gson gson = (Gson) aCallableS61S1100000_8.l1;
        String str = aCallableS61S1100000_8.s0;
        C1C7U.LIZ("LiveHostCreativeTool@890f.openShortVideoEditPage$1L");
        try {
            LiveBusinessGiftHighlight liveBusinessGiftHighlight = (LiveBusinessGiftHighlight) GsonProtectorUtils.fromJson(gson, str, LiveBusinessGiftHighlight.class);
            C1C7U.LIZIZ("LiveHostCreativeTool@890f.openShortVideoEditPage$1L");
            return liveBusinessGiftHighlight;
        } catch (o | ClassCastException | NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            C1C7U.LIZIZ("LiveHostCreativeTool@890f.openShortVideoEditPage$1L");
            return null;
        }
    }

    public ACallableS61S1100000_8(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
