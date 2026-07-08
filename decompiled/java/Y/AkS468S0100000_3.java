package Y;

import X.AbstractC19484711Kz;
import X.C098D;
import X.C09A0;
import X.C09MF;
import X.C09MG;
import X.C09MI;
import X.C0PEM;
import X.C0VSJ;
import X.C0WZX;
import X.C11NZ;
import X.C1247080iYc;
import X.C1308910kAL;
import X.C13LP;
import X.C15438062q;
import X.C1631810sZ9;
import X.C163B;
import X.C1640440sn4;
import X.C1697810uHb;
import X.C1701330uNH;
import X.C1900100zXs;
import X.C1911980zr2;
import X.C204674156y;
import X.C20610115kp;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2216708mL;
import X.C2216808mM;
import X.C23056091q;
import X.C23081092p;
import X.C2355009Kq;
import X.C2439109h7;
import X.C2441009hQ;
import X.C2478709nV;
import X.C2502309rJ;
import X.C259800zU;
import X.C316810CbP;
import X.C418440Gaw;
import X.C501470JlZ;
import X.C535020Kya;
import X.C786410Ut5;
import X.C794210VDn;
import X.C814420VxA;
import X.C931450aLX;
import X.InterfaceC1487280oo2;
import X.InterfaceC19483011Ki;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import com.bytedance.android.livesdk.debugtool.DebugInfoDetailFragment;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.fly_main_color.FlyMainColor;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BigThumb;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.mention.viewmodel.VideoCaptionMentionSearchViewModel;
import com.ss.android.ugc.aweme.mixsearch.IMixSearchService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.translation.model.MultiTranslationResultDM;
import com.ss.android.ugc.aweme.translation.model.TranslationResultDM;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerRecommendTabViewModel;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public class AkS468S0100000_3 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            case 5:
                return apply$5(this, obj);
            case 6:
                return apply$6(this, obj);
            case 7:
                return apply$7(this, obj);
            case 8:
                return apply$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return apply$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return apply$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return apply$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return apply$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return apply$13(this, obj);
            case 14:
                return apply$14(this, obj);
            case 15:
                return apply$15(this, obj);
            case 16:
                return apply$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return apply$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return apply$18(this, obj);
            case 19:
                return apply$19(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return apply$20(this, obj);
            case 21:
                return apply$21(this, obj);
            default:
                return null;
        }
    }

    public AkS468S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(AkS468S0100000_3 akS468S0100000_3, Object obj) {
        ((C931450aLX) akS468S0100000_3.l0).getClass();
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap((Bitmap) obj, 61, 61, true);
        int iMin = Math.min(bitmapCreateScaledBitmap.getWidth(), bitmapCreateScaledBitmap.getHeight());
        int width = (bitmapCreateScaledBitmap.getWidth() - iMin) / 2;
        int height = (bitmapCreateScaledBitmap.getHeight() - iMin) / 2;
        Rect rect = new Rect(width, height, width + iMin, height + iMin);
        Rect rect2 = new Rect(0, 0, iMin, iMin);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        float f = iMin / 2.0f;
        canvas.drawCircle(f, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmapCreateScaledBitmap, rect, rect2, paint);
        return bitmapCreateBitmap;
    }

    public static final Object apply$1(AkS468S0100000_3 akS468S0100000_3, Object obj) {
        return AbstractC19484711Kz.LJIJI(new ACallableS21S1000000_3((String) obj, (Aweme) akS468S0100000_3.l0, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006d A[PHI: r0
      0x006d: PHI (r0v3 android.graphics.BitmapRegionDecoder) = 
      (r0v2 android.graphics.BitmapRegionDecoder)
      (r0v14 android.graphics.BitmapRegionDecoder)
      (r0v15 android.graphics.BitmapRegionDecoder)
     binds: [B:23:0x0066, B:10:0x0039, B:26:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object apply$10(Y.AkS468S0100000_3 r4, java.lang.Object r5) {
        /*
            X.09MF r5 = (X.C09MF) r5
            java.lang.Object r3 = r4.l0
            X.09MI r3 = (X.C09MI) r3
            r3.getClass()
            r2 = 0
            com.ss.android.ugc.aweme.feed.model.BigThumb r0 = r5.LIZ     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L77
            if (r0 != 0) goto Lf
            goto L69
        Lf:
            java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L77
            float r1 = r5.LIZJ     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L77
            com.ss.android.ugc.aweme.feed.model.BigThumb r0 = r5.LIZ     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L77
            android.graphics.Rect r4 = X.C09MI.LIZJ(r1, r0)     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L77
            int r1 = r5.LIZIZ     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L77
            com.ss.android.ugc.aweme.feed.model.BigThumb r0 = r5.LIZ     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L77
            java.lang.String r1 = r3.LJ(r1, r0)     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L77
            X.0VSJ r0 = new X.0VSJ     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L77
            r0.<init>(r1)     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L77
            boolean r0 = r0.exists()     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L77
            if (r0 != 0) goto L3c
            Y.ARunnableS72S0200000_3 r1 = new Y.ARunnableS72S0200000_3     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L77
            r0 = 27
            r1.<init>(r3, r5, r0)     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L77
            X.C810560Vqw.LJ(r1)     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L77
            android.graphics.BitmapRegionDecoder r0 = r3.LJIIJ
            if (r0 == 0) goto L70
            goto L6d
        L3c:
            java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L77
            r0 = 0
            android.graphics.BitmapRegionDecoder r0 = android.graphics.BitmapRegionDecoder.newInstance(r1, r0)     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L77
            r3.LJIIJ = r0     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L77
            java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L77
            android.graphics.BitmapRegionDecoder r1 = r3.LJIIJ     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L77
            if (r1 == 0) goto L54
            android.graphics.BitmapFactory$Options r0 = r3.LJFF     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L77
            android.graphics.Bitmap r1 = r1.decodeRegion(r4, r0)     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L77
            goto L55
        L54:
            r1 = r2
        L55:
            android.graphics.BitmapRegionDecoder r0 = r3.LJIIJ
            if (r0 == 0) goto L5c
            r0.recycle()
        L5c:
            r3.LJIIJ = r2
            r2 = r1
            goto L72
        L60:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L77
            android.graphics.BitmapRegionDecoder r0 = r3.LJIIJ
            if (r0 == 0) goto L70
            goto L6d
        L69:
            android.graphics.BitmapRegionDecoder r0 = r3.LJIIJ
            if (r0 == 0) goto L70
        L6d:
            r0.recycle()
        L70:
            r3.LJIIJ = r2
        L72:
            if (r2 != 0) goto L76
            X.11IR r2 = X.C11IR.LL
        L76:
            return r2
        L77:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L77
            android.graphics.BitmapRegionDecoder r0 = r3.LJIIJ
            if (r0 == 0) goto L82
            r0.recycle()
        L82:
            r3.LJIIJ = r2
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AkS468S0100000_3.apply$10(Y.AkS468S0100000_3, java.lang.Object):java.lang.Object");
    }

    public static final Object apply$11(AkS468S0100000_3 akS468S0100000_3, Object obj) {
        int iIntValue;
        C204674156y c204674156yLIZ = FlyMainColor.LIZ.LIZ(new C2439109h7((Bitmap) akS468S0100000_3.l0, null));
        Integer numLIZIZ = c204674156yLIZ.LIZIZ();
        if (numLIZIZ != null) {
            iIntValue = numLIZIZ.intValue();
        } else {
            iIntValue = 0;
        }
        if (c204674156yLIZ.LIZLLL >= 0) {
            return Integer.valueOf(iIntValue);
        }
        throw new IllegalStateException("Could not find main color");
    }

    public static final Object apply$12(AkS468S0100000_3 akS468S0100000_3, Object obj) {
        ((C1900100zXs) akS468S0100000_3.l0).getClass();
        return C11NZ.LJIJJLI(new C2502309rJ((String) obj, 0));
    }

    public static final Object apply$13(AkS468S0100000_3 akS468S0100000_3, Object obj) {
        EffectTextModel effectTextModel;
        Bitmap bitmapMergeCoverText;
        Bitmap bitmap = (Bitmap) obj;
        CoverPublishModel coverPublishModel = ((VideoPublishEditModel) akS468S0100000_3.l0).getCoverPublishModel();
        if (coverPublishModel != null && (effectTextModel = coverPublishModel.getEffectTextModel()) != null && (bitmapMergeCoverText = effectTextModel.mergeCoverText(bitmap)) != null) {
            return bitmapMergeCoverText;
        }
        return bitmap;
    }

    public static final Object apply$14(AkS468S0100000_3 akS468S0100000_3, Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof C501470JlZ) {
            return C11NZ.LJJIJLIJ(th);
        }
        C23081092p c23081092p = (C23081092p) akS468S0100000_3.l0;
        int i = c23081092p.LLILLJJLI;
        if (i <= 1) {
            c23081092p.LLILLJJLI = i + 1;
            return c23081092p.LL.LJJIL(new InterfaceC19483011Ki() { // from class: X.08BH
                @Override // X.InterfaceC19483011Ki
                public final boolean test(Object obj2) {
                    return ((Boolean) obj2).booleanValue();
                }
            });
        }
        return C11NZ.LJJIJLIJ(th);
    }

    public static final Object apply$15(AkS468S0100000_3 akS468S0100000_3, Object obj) {
        C204674156y c204674156yLIZ = FlyMainColor.LIZ.LIZ(new C2439109h7((Bitmap) akS468S0100000_3.l0, null));
        c204674156yLIZ.LJFF(20.0f);
        return c204674156yLIZ;
    }

    public static final Object apply$16(AkS468S0100000_3 akS468S0100000_3, Object obj) {
        Function1<Effect, Boolean> function1 = ((InfoStickerRecommendTabViewModel) akS468S0100000_3.l0).LLILZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            if (function1.invoke((Effect) obj2).booleanValue()) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final Object apply$17(AkS468S0100000_3 akS468S0100000_3, Object obj) {
        T t = ((C259800zU) akS468S0100000_3.l0).element;
        if (t != 0) {
            return t;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Object apply$18(AkS468S0100000_3 akS468S0100000_3, Object obj) {
        ((C1911980zr2) akS468S0100000_3.l0).getClass();
        return C11NZ.LJIJJLI(new C2502309rJ((String) obj, 1));
    }

    public static final Object apply$19(AkS468S0100000_3 akS468S0100000_3, Object obj) {
        return new C23056091q((Throwable) obj, ((C1631810sZ9) akS468S0100000_3.l0).LJI);
    }

    public static final Object apply$2(AkS468S0100000_3 akS468S0100000_3, Object obj) {
        IMixSearchService iMixSearchService;
        C11NZ c11nzLJJJJZ;
        final String str = (String) obj;
        C20610115kp c20610115kp = (C20610115kp) akS468S0100000_3.l0;
        c20610115kp.getClass();
        if (a0.LJJJIL(str) || (iMixSearchService = (IMixSearchService) c20610115kp.LLJILLL.getValue()) == null || (c11nzLJJJJZ = C09A0.LIZ(C0PEM.LIZJ, new C2216708mL(iMixSearchService, str, null)).LJJIJLIJ()) == null) {
            c11nzLJJJJZ = C11NZ.LJJJJZ(new C316810CbP(0));
        }
        final C20610115kp c20610115kp2 = (C20610115kp) akS468S0100000_3.l0;
        return c11nzLJJJJZ.LJJLIIIIJ(new InterfaceC1487280oo2() { // from class: X.0Cbp
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj2) {
                C20610115kp c20610115kp3 = c20610115kp2;
                String str2 = str;
                AssemVMLazy assemVMLazy = c20610115kp3.LLIZLLLIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = AbstractC20610315kr.LLJILJIL;
                VideoCaptionMentionSearchViewModel videoCaptionMentionSearchViewModel = (VideoCaptionMentionSearchViewModel) assemVMLazy.getValue();
                videoCaptionMentionSearchViewModel.setState(new C317080Cbq(videoCaptionMentionSearchViewModel, C13BV.INSTANCE, false, 0, Intrinsics.LJFF(str2, c20610115kp3.LLJI), -1.0f, -1.0f));
                return new C316810CbP(0);
            }
        });
    }

    public static final Object apply$20(AkS468S0100000_3 akS468S0100000_3, Object obj) {
        int iIntValue;
        Bitmap bitmap = (Bitmap) obj;
        Context context = ((SmartImageView) akS468S0100000_3.l0).getContext();
        if (bitmap == null) {
            return C1308910kAL.LIZJ(R.attr.zn, context);
        }
        C2439109h7 c2439109h7 = new C2439109h7(bitmap, null);
        c2439109h7.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), bitmap.getWidth(), bitmap.getHeight());
        C204674156y c204674156yLIZ = FlyMainColor.LIZ.LIZ(c2439109h7);
        c204674156yLIZ.LJFF(27.0f);
        c204674156yLIZ.LJI(0.0f);
        c204674156yLIZ.LJ(0.0f, 0.08f, 0.0f, 0.18f, 0.0f);
        Integer numLIZIZ = c204674156yLIZ.LIZIZ();
        if (numLIZIZ != null) {
            iIntValue = numLIZIZ.intValue();
        } else {
            iIntValue = 0;
        }
        double dLJIIIIZZ = C2441009hQ.LJIIIIZZ(iIntValue);
        if (dLJIIIIZZ >= 0.001d && dLJIIIIZZ <= 0.999d) {
            return Integer.valueOf(iIntValue);
        }
        return C1308910kAL.LIZJ(R.attr.zn, context);
    }

    public static final Object apply$21(AkS468S0100000_3 akS468S0100000_3, Object obj) {
        C2478709nV c2478709nV = (C2478709nV) akS468S0100000_3.l0;
        long jLongValue = ((Long) obj).longValue();
        c2478709nV.getClass();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putLong(jLongValue);
        return C11NZ.LJJJJ(byteBufferAllocate.array());
    }

    public static final Object apply$3(AkS468S0100000_3 akS468S0100000_3, Object obj) throws IOException {
        int length;
        String absolutePath;
        Uri uriFromFile;
        DebugInfoDetailFragment debugInfoDetailFragment = (DebugInfoDetailFragment) akS468S0100000_3.l0;
        Context context = debugInfoDetailFragment.getContext();
        boolean z = false;
        if (context != null) {
            String str = debugInfoDetailFragment.LLILZIL;
            if (str != null) {
                length = str.length();
            } else {
                length = 0;
            }
            if (length > 10000) {
                File fileW2 = C786410Ut5.w2(context);
                if (fileW2 != null && (absolutePath = fileW2.getAbsolutePath()) != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(absolutePath);
                    String str2 = File.separator;
                    sbLIZ.append(str2);
                    sbLIZ.append("ttlive");
                    sbLIZ.append(str2);
                    sbLIZ.append("debug_info");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    C0VSJ c0vsj = new C0VSJ(strLIZIZ);
                    C2355009Kq.LJIILJJIL(c0vsj);
                    if (!c0vsj.exists()) {
                        c0vsj.mkdirs();
                    }
                    String str3 = new SimpleDateFormat("MMddHHmmss", Locale.ENGLISH).format(new Date());
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("ocean_req_info_");
                    sbLIZ2.append(str3);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    File fileCreateTempFile = File.createTempFile(strLIZIZ2, ".txt", new C0VSJ(strLIZIZ));
                    C794210VDn c794210VDn = new C794210VDn(fileCreateTempFile);
                    c794210VDn.write(debugInfoDetailFragment.LLILZIL);
                    c794210VDn.flush();
                    c794210VDn.close();
                    if (Build.VERSION.SDK_INT >= 24) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(context.getPackageName());
                        sbLIZ3.append(".fileprovider");
                        uriFromFile = FileProvider.androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(context, C2188811AlT.LIZIZ(sbLIZ3), fileCreateTempFile);
                    } else {
                        uriFromFile = Uri.fromFile(fileCreateTempFile);
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/*");
                    intent.setPackage("com.ss.android.lark");
                    intent.addFlags(1);
                    intent.putExtra("android.intent.extra.STREAM", uriFromFile);
                    intent.putExtra("android.intent.extra.TEXT", strLIZIZ2);
                    Context context2 = debugInfoDetailFragment.getContext();
                    if (context2 != null) {
                        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context2, intent, "Context_startActivity_1");
                        C1701330uNH.LIZ(intent, context2);
                        C2204961BRm.LJJJJJL(context2, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7y+2tb2ElWX7f8QGbqKcdD9zlqLFsnb35SQ8SUI0BGHv", null));
                    }
                }
            } else {
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.setPackage("com.ss.android.lark");
                intent2.putExtra("android.intent.extra.TEXT", debugInfoDetailFragment.LLILZIL);
                Context context3 = debugInfoDetailFragment.getContext();
                if (context3 != null) {
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context3, intent2, "Context_startActivity_1");
                    C1701330uNH.LIZ(intent2, context3);
                    C2204961BRm.LJJJJJL(context3, intent2, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7y+2tb2ElWX7f8QGbqKcdD9zlqLFsnb35SQ8SUI0BGHv", null));
                }
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object apply$4(AkS468S0100000_3 akS468S0100000_3, Object obj) {
        return (C535020Kya) akS468S0100000_3.l0;
    }

    public static final Object apply$5(AkS468S0100000_3 akS468S0100000_3, Object obj) {
        boolean z;
        Integer numValueOf;
        Pair pair = (Pair) obj;
        List list = (List) pair.getFirst();
        List<TranslationResultDM> list2 = ((MultiTranslationResultDM) pair.getSecond()).results;
        int i = 0;
        if (list2 != null && list2.size() == list.size()) {
            z = true;
        } else {
            z = false;
        }
        Integer numValueOf2 = null;
        if (!z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("multiTranslate: multi-translation failed, translationType=");
            sbLIZ.append(((C163B) akS468S0100000_3.l0).LJ);
            sbLIZ.append(", Translated Result size ");
            if (list2 != null) {
                numValueOf = Integer.valueOf(list2.size());
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            sbLIZ.append(" is not equals to bizCompList size ");
            sbLIZ.append(list.size());
            C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Translation Results size ");
            if (list2 != null) {
                numValueOf2 = Integer.valueOf(list2.size());
            }
            sbLIZ2.append(numValueOf2);
            sbLIZ2.append(" and bizCompList size ");
            sbLIZ2.append(list.size());
            sbLIZ2.append(" does not match");
            throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new Pair(obj2, ListProtector.get(list2, i)));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList;
    }

    public static final Object apply$6(AkS468S0100000_3 akS468S0100000_3, Object obj) {
        return new Pair((List) akS468S0100000_3.l0, obj);
    }

    public static final Object apply$7(AkS468S0100000_3 akS468S0100000_3, Object obj) {
        Pair pair = (Pair) obj;
        Iterable iterable = (Iterable) pair.getFirst();
        int iIntValue = ((Number) pair.getSecond()).intValue();
        if (iIntValue == 0) {
            return new Pair(C13LP.LJLIL(iterable, ((C1640440sn4) akS468S0100000_3.l0).LJJJLIIL), 0);
        }
        return new Pair(iterable, Integer.valueOf(iIntValue + ((C1640440sn4) akS468S0100000_3.l0).LJJJLIIL.size()));
    }

    public static final Object apply$8(AkS468S0100000_3 akS468S0100000_3, Object obj) {
        C098D c098dLJJIJLIJ;
        String str = (String) obj;
        IMixSearchService iMixSearchService = ((C1247080iYc) akS468S0100000_3.l0).LLJILLL;
        if (iMixSearchService != null && (c098dLJJIJLIJ = C09A0.LIZ(C0PEM.LIZJ, new C2216808mM(iMixSearchService, str, null)).LJJIJLIJ()) != null) {
            return c098dLJJIJLIJ;
        }
        return C11NZ.LJJJJZ(new C316810CbP(0));
    }

    public static final Object apply$9(AkS468S0100000_3 akS468S0100000_3, Object obj) {
        Video video;
        List<BigThumb> bigThumbs;
        C09MI c09mi = (C09MI) akS468S0100000_3.l0;
        int iIntValue = ((Integer) obj).intValue();
        Aweme aweme = c09mi.LIZ;
        if (aweme != null && (video = aweme.getVideo()) != null && (bigThumbs = video.getBigThumbs()) != null && !bigThumbs.isEmpty()) {
            BigThumb bigThumb = (BigThumb) ListProtector.get(bigThumbs, 0);
            int size = bigThumb.imgUrls.size();
            float f = 0.0f;
            for (int i = 0; i < size; i++) {
                if (((Boolean) C09MG.LIZ.getValue()).booleanValue()) {
                    if (((double) f) + (bigThumb.interval * bigThumb.imgXLen * bigThumb.imgYLen) > iIntValue) {
                        return new C09MF(bigThumb, i, iIntValue - f);
                    }
                } else if (((double) f) + (bigThumb.interval * bigThumb.imgXLen * bigThumb.imgYLen) >= iIntValue) {
                    return new C09MF(bigThumb, i, iIntValue - f);
                }
                f += (float) (bigThumb.interval * bigThumb.imgXLen * bigThumb.imgYLen);
            }
            return new C09MF(bigThumb, bigThumb.imgUrls.size() - 1, iIntValue - f);
        }
        return new C09MF(null, 0, 0.0f);
    }
}
