package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.fresco.heif.HeifDecoder;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.behavior.ui.image.FlattenUIImage;
import com.lynx.tasm.behavior.ui.image.UIImage;
import com.lynx.tasm.image.AutoSizeImage;
import com.lynx.tasm.service.ILynxImageService;
import com.lynx.tasm.service.ILynxImageServiceExtension;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kMg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1316560kMg implements ILynxImageService, ILynxImageServiceExtension {
    public static volatile C1316560kMg LJFF;
    public C1320120kSQ LIZ;
    public C1325170kaZ LIZIZ;
    public final ConcurrentHashMap<C1315700kLI, C1323050kX9<AbstractC1327750kej>> LIZJ = new ConcurrentHashMap<>();
    public Resources LIZLLL = null;
    public final C822690WPb LJ = C822690WPb.LIZ();

    @Override // com.lynx.tasm.service.ILynxImageService, com.lynx.tasm.service.IServiceProvider
    public final /* synthetic */ Class getServiceClass() {
        return C1316670kMr.LIZ(this);
    }

    @Override // com.lynx.tasm.service.IServiceProvider
    public final /* synthetic */ void onInitialize(Context context) {
        C1289470jez.LIZ(this, context);
    }

    public static C1316560kMg LJFF() {
        if (LJFF == null) {
            synchronized (C1316560kMg.class) {
                try {
                    if (LJFF == null) {
                        LJFF = new C1316560kMg();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJFF;
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public final Object getImageSRPostProcessor() {
        return C1316660kMq.LIZ();
    }

    @Override // com.lynx.tasm.service.ILynxImageServiceExtension
    public final void onLynxEnvSetup() {
        C1301610jyZ.LIZIZ().execute(new Runnable() { // from class: X.0kMi
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LynxImageService@4460.onLynxEnvSetup$1");
                try {
                    SystemClock.uptimeMillis();
                    try {
                        new InterfaceC1210760hc2() { // from class: X.0kTB
                            @Override // X.InterfaceC1210760hc2
                            public final void LIZ() {
                                try {
                                    Class.forName(FlattenUIImage.class.getName());
                                    Class.forName(C1315920kLe.class.getName());
                                    Class.forName(C1316220kM8.class.getName());
                                    Class.forName(InterfaceC1316000kLm.class.getName());
                                    Class.forName(C1315680kLG.class.getName());
                                    try {
                                        Class.forName("com.lynx.tasm.behavior.ui.image.LynxImageManager$ImageRequestHandle");
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                    }
                                    Class.forName(UIImage.class.getName());
                                    try {
                                        Class.forName("com.lynx.tasm.behavior.ui.image.LynxImageLoader");
                                    } catch (Throwable th2) {
                                        TryCatchGuardChecker.doCheck(th2);
                                    }
                                    Class.forName(C1316550kMf.class.getName());
                                    Class.forName(AutoSizeImage.class.getName());
                                    try {
                                        Class.forName("com.lynx.tasm.image.LynxImageMediaFetcherProxy");
                                    } catch (Throwable th3) {
                                        TryCatchGuardChecker.doCheck(th3);
                                    }
                                    Class.forName(C1315860kLY.class.getName());
                                    Class.forName(C1315700kLI.class.getName());
                                    Class.forName(C1316560kMg.class.getName());
                                    Class.forName(C1320120kSQ.class.getName());
                                    Class.forName(AbstractC1328490kfv.class.getName());
                                    Class.forName(AbstractC1301670jyf.class.getName());
                                    Class.forName(C1329310khF.class.getName());
                                    Class.forName(C1329350khJ.class.getName());
                                    Class.forName(C1335440kr8.class.getName());
                                    Class.forName(C1327620keW.class.getName());
                                    Class.forName(C1325540kbA.class.getName());
                                    Class.forName(C1329330khH.class.getName());
                                    Class.forName(C1328520kfy.class.getName());
                                    Class.forName(C1326950kdR.class.getName());
                                    Class.forName(C1327640keY.class.getName());
                                    Class.forName(C1328500kfw.class.getName());
                                    Class.forName(AnimatedFactoryV2Impl.class.getName());
                                    Class.forName(C1320810kTX.class.getName());
                                    Class.forName(C1320700kTM.class.getName());
                                    Class.forName(C1331090kk7.class.getName());
                                    Class.forName(C1331100kk8.class.getName());
                                    Class.forName(C1331070kk5.class.getName());
                                    Class.forName(C1331050kk3.class.getName());
                                    Class.forName(C1330970kjv.class.getName());
                                    Class.forName(C1331180kkG.class.getName());
                                    Class.forName(C1331080kk6.class.getName());
                                    Class.forName(C1319910kS5.class.getName());
                                    Class.forName(C1331060kk4.class.getName());
                                    Class.forName(C1331110kk9.class.getName());
                                    Class.forName(C440190HNx.class.getName());
                                    Class.forName(C1325700kbQ.class.getName());
                                    Class.forName(ImageDecodeOptionsBuilder.class.getName());
                                    Class.forName(C1329360khK.class.getName());
                                    Class.forName(C1325710kbR.class.getName());
                                    Class.forName(EnumC1320950kTl.class.getName());
                                    Class.forName(EnumC1325560kbC.class.getName());
                                    Class.forName(EnumC1331380kka.class.getName());
                                    Class.forName(C1324670kZl.class.getName());
                                    Class.forName(C1324630kZh.class.getName());
                                    Class.forName(C1325880kbi.class.getName());
                                    Class.forName(C1324660kZk.class.getName());
                                    Class.forName(C908880Zl8.class.getName());
                                    Class.forName(C1328780kgO.class.getName());
                                    Class.forName(C1328200kfS.class.getName());
                                    Class.forName(C1325080kaQ.class.getName());
                                    Class.forName(C1334380kpQ.class.getName());
                                    Class.forName(C1328620kg8.class.getName());
                                    Class.forName(C1335450kr9.class.getName());
                                    Class.forName(C1335460krA.class.getName());
                                    Class.forName(C1325680kbO.class.getName());
                                    Class.forName(C1326970kdT.class.getName());
                                    Class.forName(C1327140kdk.class.getName());
                                    Class.forName(C1320620kTE.class.getName());
                                    Class.forName(C1328630kg9.class.getName());
                                    Class.forName(C1320630kTF.class.getName());
                                    Class.forName(C1328100kfI.class.getName());
                                    Class.forName(C1328110kfJ.class.getName());
                                    Class.forName(C0HWE.class.getName());
                                } catch (ClassNotFoundException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                        }.LIZ();
                        SystemClock.uptimeMillis();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LynxImageService@4460.onLynxEnvSetup$1");
            }
        });
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public final boolean canParseUrl(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("file://") || str.startsWith("content://") || str.startsWith("asset://") || str.startsWith("data:")) {
            return true;
        }
        return false;
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public final int getImageOrigin(Object obj) {
        if (obj instanceof AbstractC1327750kej) {
            return C1316550kMf.LIZ((AbstractC1327750kej) obj);
        }
        return -1;
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public final boolean pauseAnimation(Drawable drawable) {
        if (drawable instanceof AnimatedDrawable2) {
            ((AnimatedDrawable2) drawable).LJFF();
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.lynx.tasm.service.ILynxImageService
    public final void releaseAnimDrawable(Drawable drawable) {
        if (drawable instanceof InterfaceC1316680kMs) {
            ((InterfaceC1316680kMs) drawable).LIZ();
        }
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public final void releaseImage(C1315700kLI c1315700kLI) {
        C1323050kX9<AbstractC1327750kej> c1323050kX9Remove;
        if (c1315700kLI != null && (c1323050kX9Remove = this.LIZJ.remove(c1315700kLI)) != null) {
            C1323050kX9.LJII(c1323050kX9Remove);
        }
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public final boolean resumeAnimation(Drawable drawable) {
        if (drawable instanceof AnimatedDrawable2) {
            ((AnimatedDrawable2) drawable).start();
            return true;
        }
        return false;
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public final void setCustomImageDecoder(Object obj) {
        if (obj instanceof ImageDecodeOptionsBuilder) {
            ((ImageDecodeOptionsBuilder) obj).LJIIIZ = new C1329800ki2();
        }
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public final boolean startAnimation(Drawable drawable) {
        if (drawable instanceof AnimatedDrawable2) {
            AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) drawable;
            animatedDrawable2.stop();
            animatedDrawable2.start();
            return true;
        }
        return false;
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public final boolean stopAnimation(Drawable drawable) {
        if (drawable instanceof AnimatedDrawable2) {
            ((AnimatedDrawable2) drawable).stop();
            return true;
        }
        return false;
    }

    public static JSONObject LJI(int i, long j) {
        JSONObject jSONObject = new JSONObject();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = jCurrentTimeMillis - j;
        try {
            jSONObject.put("load_start", j);
            jSONObject.put("load_finish", jCurrentTimeMillis);
            jSONObject.put("cost", j2);
            jSONObject.put("origin", i);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    @Override // com.lynx.tasm.service.ILynxImageServiceExtension
    public final AbstractC1313950kIT createBackgroundImageDrawable(Context context, String str) {
        if (LynxEnv.inst().getBackgroundImageLoader() != null) {
            return LynxEnv.inst().getBackgroundImageLoader().LIZ(context, str);
        }
        return null;
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public final void decodeImage(final C1315700kLI c1315700kLI, final InterfaceC1316540kMe interfaceC1316540kMe) {
        if (c1315700kLI != null) {
            C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
            ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
            imageDecodeOptionsBuilder.setBitmapConfig(c1315700kLI.LJ);
            imageDecodeOptionsBuilder.LJFF = c1315700kLI.LJIILJJIL;
            if (!c1315700kLI.LJIJJLI) {
                imageDecodeOptionsBuilder.LJIIIZ = new InterfaceC1330200kig() { // from class: X.0kde
                    @Override // X.InterfaceC1330200kig
                    public final AbstractC1327750kej decode(C1328480kfu c1328480kfu, int i, InterfaceC529960KqQ interfaceC529960KqQ, C1329360khK c1329360khK) throws Throwable {
                        Bitmap bitmapDecodeStream;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inPremultiplied = false;
                        c1328480kfu.LJIJJLI();
                        if (Objects.equals(c1328480kfu.LLILLL.LIZ, "heic")) {
                            bitmapDecodeStream = HeifDecoder.sBitmapFactory.decodeStream(c1328480kfu.LJII(), null, options);
                        } else {
                            bitmapDecodeStream = BitmapFactory.decodeStream(c1328480kfu.LJII(), null, options);
                        }
                        C530820Kro c530820KroLIZIZ = C530820Kro.LIZIZ();
                        c1328480kfu.LJIJJLI();
                        return new C1325120kaU(bitmapDecodeStream, c530820KroLIZIZ, interfaceC529960KqQ, c1328480kfu.LLILZ);
                    }
                };
            }
            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(c1315700kLI.LIZ));
            c1325700kbQLIZLLL.LIZJ = new C1324630kZh(Integer.MAX_VALUE, Integer.MAX_VALUE, 2.1474836E9f);
            c1325700kbQLIZLLL.LJFF = new C1329360khK(imageDecodeOptionsBuilder);
            ((AbstractC1321260kUG) c1325540kbALIZ.LJI(c1325700kbQLIZLLL.LIZ(), null)).LIZJ(new C0HWE<C1323050kX9<AbstractC1327750kej>>() { // from class: X.0kMa
                @Override // X.C0HWE
                public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                    if (interfaceC1320200kSY.LIZLLL() != null) {
                        interfaceC1316540kMe.LIZJ(C846560XIw.LIZ(interfaceC1320200kSY.LIZLLL()), interfaceC1320200kSY.LIZLLL());
                    } else {
                        interfaceC1316540kMe.LIZJ(-1, new Throwable("imageLoadFailed."));
                    }
                }

                @Override // X.C0HWE
                public final void LJFF(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                    C1323050kX9<AbstractC1327750kej> result = interfaceC1320200kSY.getResult();
                    Bitmap bitmap = new C1315970kLj(result).LIZIZ;
                    if (bitmap != null) {
                        interfaceC1316540kMe.LIZ(new C1315930kLf(new C1315970kLj(result)), c1315700kLI, new C1316350kML(bitmap.getWidth(), bitmap.getHeight(), false));
                    } else {
                        interfaceC1316540kMe.LIZJ(-1, new Throwable("empty bitmap!"));
                    }
                }
            }, C822700WPc.LL);
        }
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public final void setCacheKeyUri(Object obj, Uri uri) {
        if (obj instanceof C1325700kbQ) {
            C1316550kMf.LIZJ((C1325700kbQ) obj, uri);
        }
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public final void setImageCacheChoice(String str, Object obj) {
        if (obj instanceof C1325700kbQ) {
            C1325700kbQ c1325700kbQ = (C1325700kbQ) obj;
            c1325700kbQ.LJI = EnumC1325560kbC.CUSTOM;
            c1325700kbQ.getClass();
            str.getClass();
            c1325700kbQ.LJIJI = str;
        }
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public final void setImageDecodeRegion(Object obj, Rect rect) {
        if (obj instanceof C1325700kbQ) {
            C1325700kbQ c1325700kbQ = (C1325700kbQ) obj;
            ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
            imageDecodeOptionsBuilder.LIZ(c1325700kbQ.LJFF);
            imageDecodeOptionsBuilder.LJIILJJIL = rect;
            setSampleSize(c1325700kbQ, 1);
            c1325700kbQ.LJFF = new C1329360khK(imageDecodeOptionsBuilder);
        }
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public final void setImageSRSize(Object obj, View view) {
        if (obj instanceof C1325710kbR) {
            ((C1325710kbR) obj).LJJ = new C1322050kVX(view);
        }
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public final void setSampleSize(Object obj, int i) {
        if (obj instanceof C1325700kbQ) {
            ((C1325700kbQ) obj).LJJIIZ = i;
        }
    }

    public static boolean LJIIIIZZ(C1315700kLI c1315700kLI, Drawable drawable, final InterfaceC1316410kMR interfaceC1316410kMR) {
        if (drawable instanceof AnimatedDrawable2) {
            AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) drawable;
            if (interfaceC1316410kMR != null) {
                animatedDrawable2.LJII(new C0I9J() { // from class: X.0kLk
                    @Override // X.C0I9J, X.InterfaceC1331000kjy
                    public final void LIZ(AnimatedDrawable2 animatedDrawable22) {
                        C1315680kLG c1315680kLG = ((C1316300kMG) interfaceC1316410kMR).LIZ;
                        if (c1315680kLG.LLLILZ) {
                            c1315680kLG.LJIILLIIL("startplay");
                        }
                    }

                    @Override // X.C0I9J, X.InterfaceC1331000kjy
                    public final void LIZIZ(AnimatedDrawable2 animatedDrawable22) {
                        if (animatedDrawable22.isRunning()) {
                            C1315680kLG c1315680kLG = ((C1316300kMG) interfaceC1316410kMR).LIZ;
                            if (c1315680kLG.LLLILZJ) {
                                c1315680kLG.LJIILLIIL("currentloopcomplete");
                            }
                        }
                    }

                    @Override // X.C0I9J, X.InterfaceC1331000kjy
                    public final void LIZJ(AnimatedDrawable2 animatedDrawable22) {
                        if (animatedDrawable22.isRunning()) {
                            C1315680kLG c1315680kLG = ((C1316300kMG) interfaceC1316410kMR).LIZ;
                            if (c1315680kLG.LLLILZJ) {
                                c1315680kLG.LJIILLIIL("currentloopcomplete");
                            }
                            C1315680kLG c1315680kLG2 = ((C1316300kMG) interfaceC1316410kMR).LIZ;
                            if (c1315680kLG2.LLLILZLLLI) {
                                c1315680kLG2.LJIILLIIL("finalloopcomplete");
                            }
                        }
                    }
                });
            }
            final InterfaceC1330960kju interfaceC1330960kju = animatedDrawable2.LLILLL;
            final int i = c1315700kLI.LIZLLL;
            animatedDrawable2.LJI(new C1330930kjr(interfaceC1330960kju, i) { // from class: X.0kMo
                public final int LIZJ;

                @Override // X.C1330930kjr, X.InterfaceC1330470kj7
                public final int getLoopCount() {
                    return this.LIZJ;
                }

                {
                    this.LIZJ = i;
                }
            });
            if (!c1315700kLI.LJIILL) {
                animatedDrawable2.setPrivateFrameScheduler(new C1330040kiQ(animatedDrawable2.LLILLL));
            }
            if (c1315700kLI.LJIILIIL) {
                animatedDrawable2.start();
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public final void prefetchImage(String str, Object obj, Map<String, Object> map) {
        prefetchImage(str, obj, map, null);
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public final void setImageSRSize(Object obj, int i, int i2) {
        if (obj instanceof C1325700kbQ) {
            C1316550kMf.LIZLLL((C1325700kbQ) obj, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7 A[PHI: r1
      0x00e7: PHI (r1v11 X.0jiv) = (r1v14 X.0jiv), (r1v15 X.0jiv) binds: [B:87:0x0181, B:51:0x00e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017f  */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.0NAf, X.0kMb] */
    @Override // com.lynx.tasm.service.ILynxImageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void fetchImage(final X.C1315700kLI r17, final X.InterfaceC1316540kMe r18, final X.InterfaceC1316410kMR r19, android.content.Context r20) {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1316560kMg.fetchImage(X.0kLI, X.0kMe, X.0kMR, android.content.Context):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3  */
    @Override // com.lynx.tasm.service.ILynxImageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void prefetchImage(java.lang.String r9, java.lang.Object r10, java.util.Map<java.lang.String, java.lang.Object> r11, final X.InterfaceC1316540kMe r12) {
        /*
            r8 = this;
            r2 = 0
            if (r11 != 0) goto L10
            r4 = r2
            r7 = r2
        L5:
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r9)
            java.lang.String r0 = r1.getScheme()
            if (r0 != 0) goto L29
            return
        L10:
            java.lang.String r0 = "priority"
            java.lang.Object r4 = r11.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r0 = "cacheTarget"
            java.lang.Object r7 = r11.get(r0)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r0 = "additional-custom-info"
            java.lang.Object r2 = r11.get(r0)
            java.util.Map r2 = (java.util.Map) r2
            goto L5
        L29:
            X.0kbQ r6 = X.C1325700kbQ.LIZLLL(r1)
            com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder r1 = new com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder
            r1.<init>()
            r0 = 0
            r1.LIZIZ(r0)
            X.0khK r0 = new X.0khK
            r0.<init>(r1)
            r6.LJFF = r0
            if (r2 == 0) goto L70
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L4c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r1 = r2.getKey()
            java.lang.Object r0 = r2.getValue()
            if (r0 != 0) goto L68
            java.lang.String r0 = ""
        L64:
            r5.put(r1, r0)
            goto L4c
        L68:
            java.lang.Object r0 = r2.getValue()
            goto L64
        L6d:
            r6.LJ(r5)
        L70:
            if (r7 == 0) goto L93
            java.lang.String r0 = "bitmap"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L93
            X.0kbR r1 = r6.LIZ()
            X.0kbA r0 = X.C1322200kVm.LIZ()
            X.0kUG r2 = r0.LJIIZILJ(r1, r10)
            if (r12 == 0) goto L92
            X.0kMd r1 = new X.0kMd
            r1.<init>()
            X.0WPc r0 = X.C822700WPc.LL
            r2.LIZJ(r1, r0)
        L92:
            return
        L93:
            X.0kbR r2 = r6.LIZ()
            if (r4 == 0) goto Lc3
            java.lang.String r0 = "high"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lb8
            X.0kka r1 = X.EnumC1331380kka.HIGH
        La3:
            X.0kbA r0 = X.C1322200kVm.LIZ()
            X.0kUG r2 = r0.LJIJI(r2, r10, r1)
            if (r12 == 0) goto L92
            X.0kMc r1 = new X.0kMc
            r1.<init>()
            X.0WPc r0 = X.C822700WPc.LL
            r2.LIZJ(r1, r0)
            return
        Lb8:
            java.lang.String r0 = "medium"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lc3
            X.0kka r1 = X.EnumC1331380kka.MEDIUM
            goto La3
        Lc3:
            X.0kka r1 = X.EnumC1331380kka.LOW
            goto La3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1316560kMg.prefetchImage(java.lang.String, java.lang.Object, java.util.Map, X.0kMe):void");
    }

    public static void LJII(final Bitmap bitmap, final C1331070kk5 c1331070kk5, final C1325710kbR c1325710kbR, InterfaceC1320380kSq interfaceC1320380kSq, final long j, int i, int i2, String str) {
        if (c1331070kk5 != null && c1325710kbR != null) {
            if (bitmap != null && !bitmap.isRecycled()) {
                final C1317740kOa c1317740kOa = new C1317740kOa(bitmap, i, i2, interfaceC1320380kSq);
                C1289620jfE.LIZLLL(new Runnable() { // from class: X.0kMl
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LynxImageService@4460.handleHashDrawable$1");
                        try {
                            Bitmap bitmap2 = bitmap;
                            if (bitmap2 != null && !bitmap2.isRecycled()) {
                                long jUptimeMillis = SystemClock.uptimeMillis();
                                long j2 = jUptimeMillis - j;
                                C1325710kbR c1325710kbR2 = c1325710kbR;
                                c1325710kbR2.LJJIJIIJIL = j2;
                                c1325710kbR2.LJJIJIL = jUptimeMillis;
                                c1331070kk5.LJJIFFI(c1317740kOa, InterfaceC1320380kSq.LIZ);
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LynxImageService@4460.handleHashDrawable$1");
                    }
                });
            } else {
                c1325710kbR.LJJIJL = str;
            }
        }
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public final void setImagePlaceHolderHash(final Object obj, final Object obj2, final Object obj3, final String str, String str2, int i, int i2, int i3, int i4, boolean z) {
        if ((obj2 instanceof C1325710kbR) && (obj instanceof C1331070kk5) && (obj3 instanceof InterfaceC1320380kSq)) {
            if (!z) {
                C1325710kbR c1325710kbR = (C1325710kbR) obj2;
                c1325710kbR.LJJIJ = true;
                c1325710kbR.LJJIJIIJI = 1;
                final C1318160kPG c1318160kPG = new C1318160kPG(i, i2);
                final long jUptimeMillis = SystemClock.uptimeMillis();
                new C1318150kPF(str, c1318160kPG, new InterfaceC1318090kP9() { // from class: X.0kMk
                    @Override // X.InterfaceC1318090kP9
                    public final void LIZ(Bitmap bitmap) {
                        C1316560kMg c1316560kMg = this.LJI;
                        C1331070kk5 c1331070kk5 = (C1331070kk5) obj;
                        C1325710kbR c1325710kbR2 = (C1325710kbR) obj2;
                        InterfaceC1320380kSq interfaceC1320380kSq = (InterfaceC1320380kSq) obj3;
                        long j = jUptimeMillis;
                        C1318160kPG c1318160kPG2 = c1318160kPG;
                        int i5 = c1318160kPG2.LJ;
                        int i6 = c1318160kPG2.LJFF;
                        String str3 = str;
                        c1316560kMg.getClass();
                        C1316560kMg.LJII(bitmap, c1331070kk5, c1325710kbR2, interfaceC1320380kSq, j, i5, i6, str3);
                    }
                });
                return;
            }
            C1325710kbR c1325710kbR2 = (C1325710kbR) obj2;
            c1325710kbR2.LJJIJ = true;
            c1325710kbR2.LJJIJIIJI = 2;
            final long jUptimeMillis2 = SystemClock.uptimeMillis();
            final C1316650kMp c1316650kMp = new C1316650kMp(i4, i3, i, i2);
            if (!TextUtils.isEmpty(str2)) {
                new C1318140kPE(str, str2, c1316650kMp, new InterfaceC1318130kPD() { // from class: X.0kMm
                    @Override // X.InterfaceC1318130kPD
                    public final void LIZ(Bitmap bitmap) {
                        C1316560kMg c1316560kMg = this.LJI;
                        C1331070kk5 c1331070kk5 = (C1331070kk5) obj;
                        C1325710kbR c1325710kbR3 = (C1325710kbR) obj2;
                        InterfaceC1320380kSq interfaceC1320380kSq = (InterfaceC1320380kSq) obj3;
                        long j = jUptimeMillis2;
                        C1316650kMp c1316650kMp2 = c1316650kMp;
                        int i5 = c1316650kMp2.LIZJ;
                        int i6 = c1316650kMp2.LIZLLL;
                        String str3 = str;
                        c1316560kMg.getClass();
                        C1316560kMg.LJII(bitmap, c1331070kk5, c1325710kbR3, interfaceC1320380kSq, j, i5, i6, str3);
                    }
                });
            } else {
                new C1318140kPE(str, c1316650kMp, new InterfaceC1318130kPD() { // from class: X.0kMn
                    @Override // X.InterfaceC1318130kPD
                    public final void LIZ(Bitmap bitmap) {
                        C1316560kMg c1316560kMg = this.LJI;
                        C1331070kk5 c1331070kk5 = (C1331070kk5) obj;
                        C1325710kbR c1325710kbR3 = (C1325710kbR) obj2;
                        InterfaceC1320380kSq interfaceC1320380kSq = (InterfaceC1320380kSq) obj3;
                        long j = jUptimeMillis2;
                        C1316650kMp c1316650kMp2 = c1316650kMp;
                        int i5 = c1316650kMp2.LIZJ;
                        int i6 = c1316650kMp2.LIZLLL;
                        String str3 = str;
                        c1316560kMg.getClass();
                        C1316560kMg.LJII(bitmap, c1331070kk5, c1325710kbR3, interfaceC1320380kSq, j, i5, i6, str3);
                    }
                });
            }
        }
    }
}
