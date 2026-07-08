package Y;

import X.C08QA;
import X.C0VSJ;
import X.C1065320dpS;
import X.C1324750kZt;
import X.C1376300lv2;
import X.C1C7U;
import X.C201955140j;
import X.C201967140v;
import X.C2109608Og;
import X.C2286708xd;
import X.C2428709fR;
import X.C2471909mP;
import X.C838410Wul;
import X.C844470XAv;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public class ACallableS21S1000000_3 implements Callable {
    public final int $t;
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
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return call$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return call$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return call$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return call$12(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS21S1000000_3 aCallableS21S1000000_3) throws Throwable {
        String absolutePath;
        C1C7U.LIZ("PhotoModeSaveVideoHelper@909c.downloadAndCompile$4$1");
        C1376300lv2 c1376300lv2 = C1376300lv2.LIZ;
        String str = aCallableS21S1000000_3.s0;
        c1376300lv2.getClass();
        Context contextLIZ = C1376300lv2.LIZ();
        if (str.length() == 0 || C1376300lv2.LIZIZ || (Build.VERSION.SDK_INT < 29 && C838410Wul.LIZ(contextLIZ, "android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
            absolutePath = "";
        } else {
            String name = new C0VSJ(str).getName();
            File fileLJIL = C08QA.LJIL(new C0VSJ(C2428709fR.LIZIZ()), name);
            C0VSJ c0vsj = new C0VSJ(str);
            if (C2471909mP.LJJIJ()) {
                C2471909mP.LJJIJIIJI(contextLIZ, c0vsj.getAbsolutePath(), name, true, null, 112);
            } else {
                C08QA.LJIILLIIL(c0vsj, fileLJIL, true, 4);
            }
            if (fileLJIL.exists() && fileLJIL.length() > 0) {
                C1065320dpS c1065320dpS = C1065320dpS.LIZ;
                String path = fileLJIL.getPath();
                c1065320dpS.getClass();
                C1065320dpS.LIZ(contextLIZ, path);
            }
            absolutePath = fileLJIL.getAbsolutePath();
        }
        C1C7U.LIZIZ("PhotoModeSaveVideoHelper@909c.downloadAndCompile$4$1");
        return absolutePath;
    }

    public static final Object call$1(ACallableS21S1000000_3 aCallableS21S1000000_3) {
        C1C7U.LIZ("EditAudioRecordComponent@90f6.onCreate$1$1");
        Boolean boolValueOf = Boolean.valueOf(C2286708xd.LJIJ(aCallableS21S1000000_3.s0));
        C1C7U.LIZIZ("EditAudioRecordComponent@90f6.onCreate$1$1");
        return boolValueOf;
    }

    public static final /* bridge */ /* synthetic */ Object call$10(ACallableS21S1000000_3 aCallableS21S1000000_3) {
        C1C7U.LIZ("NewsAnchorPublishRepo@bd0e.requestTitleVerify$1");
        String str = aCallableS21S1000000_3.s0;
        C1C7U.LIZIZ("NewsAnchorPublishRepo@bd0e.requestTitleVerify$1");
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$11(Y.ACallableS21S1000000_3 r15) {
        /*
            java.lang.String r14 = "LocalLottieUtils@f96a.loadLocalLottieImage$1"
            X.C1C7U.LIZ(r14)
            java.lang.String r9 = r15.s0
            X.0VSJ r3 = new X.0VSJ
            r3.<init>(r9)
            boolean r0 = r3.exists()
            r2 = 1
            r1 = 0
            r8 = 0
            if (r0 == 0) goto Lc2
            boolean r0 = r3.isFile()
            if (r0 != 0) goto Lc2
            java.io.File[] r10 = r3.listFiles()
            if (r10 == 0) goto Lc2
            int r0 = r10.length
            if (r0 != r2) goto L2d
            r0 = r10[r1]     // Catch: java.lang.Exception -> Lbe
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Exception -> Lbe
            X.C08P1.LJ(r0, r9)     // Catch: java.lang.Exception -> Lbe
        L2d:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            int r6 = r10.length
            java.lang.String r5 = ""
            r4 = 0
            r13 = 0
        L37:
            if (r4 >= r6) goto Laf
            r2 = r10[r4]
            java.lang.String r1 = r2.getName()
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto L69
            java.io.File[] r12 = r2.listFiles()
            int r11 = r12.length
            r3 = 0
        L4b:
            if (r3 >= r11) goto Lac
            r2 = r12[r3]
            java.lang.String r1 = r2.getName()
            java.lang.String r0 = ".png"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L66
            java.lang.String r0 = r2.getAbsolutePath()
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0)
            r7.put(r1, r0)
        L66:
            int r3 = r3 + 1
            goto L4b
        L69:
            java.lang.String r0 = ".json"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto Lac
            if (r13 != 0) goto Lac
            X.0VSP r3 = new X.0VSP     // Catch: java.lang.Exception -> La5
            r3.<init>(r2)     // Catch: java.lang.Exception -> La5
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Exception -> La5
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> La5
            r0.<init>(r3)     // Catch: java.lang.Exception -> La5
            r1.<init>(r0)     // Catch: java.lang.Exception -> La5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La5
            r2.<init>()     // Catch: java.lang.Exception -> La5
        L87:
            java.lang.String r0 = r1.readLine()     // Catch: java.lang.Exception -> La5
            if (r0 == 0) goto L91
            r2.append(r0)     // Catch: java.lang.Exception -> La5
            goto L87
        L91:
            r1.close()     // Catch: java.lang.Exception -> La5
            r3.close()     // Catch: java.lang.Exception -> La5
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Exception -> La5
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> La5
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> La5
            r1.<init>(r0)     // Catch: java.lang.Exception -> La5
            goto Laa
        La5:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto Lac
        Laa:
            r8 = r1
            r13 = 1
        Lac:
            int r4 = r4 + 1
            goto L37
        Laf:
            X.08Rv r0 = new X.08Rv
            r0.<init>()
            r0.LIZ = r9
            r0.LIZIZ = r8
            r0.LIZJ = r5
            r0.LIZLLL = r7
            r8 = r0
            goto Lc2
        Lbe:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        Lc2:
            X.C1C7U.LIZIZ(r14)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS21S1000000_3.call$11(Y.ACallableS21S1000000_3):java.lang.Object");
    }

    public static final Object call$12(ACallableS21S1000000_3 aCallableS21S1000000_3) {
        C1C7U.LIZ("FTCEditAudioRecordComponent@c495.onCreate$2$1");
        Boolean boolValueOf = Boolean.valueOf(C2286708xd.LJIJ(aCallableS21S1000000_3.s0));
        C1C7U.LIZIZ("FTCEditAudioRecordComponent@c495.onCreate$2$1");
        return boolValueOf;
    }

    public static final Object call$2(ACallableS21S1000000_3 aCallableS21S1000000_3) {
        C1C7U.LIZ("RecordLogicComponent@69c3.mobStickerLoad$1");
        try {
            if (!TextUtils.isEmpty(aCallableS21S1000000_3.s0)) {
                C2286708xd.LJIILLIIL(new C0VSJ(aCallableS21S1000000_3.s0));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJII(C201967140v.LIZIZ, "delete failed");
        }
        C1C7U.LIZIZ("RecordLogicComponent@69c3.mobStickerLoad$1");
        return null;
    }

    public static final Object call$3(ACallableS21S1000000_3 aCallableS21S1000000_3) {
        C1C7U.LIZ("PublishPageUtils@13bc.fileToBitmap$1");
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(aCallableS21S1000000_3.s0);
        C1C7U.LIZIZ("PublishPageUtils@13bc.fileToBitmap$1");
        return bitmapDecodeFile;
    }

    public static final Object call$4(ACallableS21S1000000_3 aCallableS21S1000000_3) {
        C1C7U.LIZ("DraftSavePreProcessorKt@732.fastImportPreProcess$2");
        Boolean boolValueOf = Boolean.valueOf(C2286708xd.LJIJ(aCallableS21S1000000_3.s0));
        C1C7U.LIZIZ("DraftSavePreProcessorKt@732.fastImportPreProcess$2");
        return boolValueOf;
    }

    public static final Object call$5(ACallableS21S1000000_3 aCallableS21S1000000_3) {
        boolean zLJIIZILJ;
        C1C7U.LIZ("DownloadStickerAndHintIconCombiner@4b5.download$1");
        String str = aCallableS21S1000000_3.s0;
        if (str == null) {
            zLJIIZILJ = true;
        } else {
            zLJIIZILJ = C1324750kZt.LJIIZILJ(UriProtector.parse(str));
        }
        Boolean boolValueOf = Boolean.valueOf(!zLJIIZILJ);
        C1C7U.LIZIZ("DownloadStickerAndHintIconCombiner@4b5.download$1");
        return boolValueOf;
    }

    public static final /* bridge */ /* synthetic */ Object call$6(ACallableS21S1000000_3 aCallableS21S1000000_3) {
        C1C7U.LIZ("ArticleLinkEditorVM@3843.createParseUrlTitleTask$1");
        String str = aCallableS21S1000000_3.s0;
        C1C7U.LIZIZ("ArticleLinkEditorVM@3843.createParseUrlTitleTask$1");
        return str;
    }

    public static final /* bridge */ /* synthetic */ Object call$7(ACallableS21S1000000_3 aCallableS21S1000000_3) {
        C1C7U.LIZ("ArticleLinkEditorVM@3843.checkLinkUrl$1");
        String str = aCallableS21S1000000_3.s0;
        C1C7U.LIZIZ("ArticleLinkEditorVM@3843.checkLinkUrl$1");
        return str;
    }

    public static final /* bridge */ /* synthetic */ Object call$8(ACallableS21S1000000_3 aCallableS21S1000000_3) {
        C1C7U.LIZ("ArticleTitleEditorVM$Companion@59f.checkTitle$3");
        String str = aCallableS21S1000000_3.s0;
        C1C7U.LIZIZ("ArticleTitleEditorVM$Companion@59f.checkTitle$3");
        return str;
    }

    public static final Object call$9(ACallableS21S1000000_3 aCallableS21S1000000_3) {
        String str = aCallableS21S1000000_3.s0;
        C1C7U.LIZ("DynamicLanguageInstaller@1504.unCompressLanguageApkFile$1L");
        Keva keva = C2109608Og.LIZ;
        C844470XAv.LIZ.getClass();
        Boolean boolValueOf = Boolean.valueOf(C2109608Og.LIZIZ(C844470XAv.LIZ(), str, false));
        C1C7U.LIZIZ("DynamicLanguageInstaller@1504.unCompressLanguageApkFile$1L");
        return boolValueOf;
    }

    public ACallableS21S1000000_3(String str, int i) {
        this.$t = i;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                this.s0 = str;
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
            default:
                this.s0 = str;
                break;
        }
    }

    public ACallableS21S1000000_3(String str, Aweme aweme, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
