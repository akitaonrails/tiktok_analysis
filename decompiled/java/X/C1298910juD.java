package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.ies.xelement.LynxAudio;
import com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo;
import com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView;
import com.bytedance.ies.xelement.video.pro.LynxVideoUI;
import com.bytedance.mt.protector.impl.UriProtector;
import com.lynx.tasm.behavior.XElementBehavior;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.ss.android.ugc.aweme.base.xelements.xaudio.ActivityMonitorImpl;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import com.ss.ttvideoengine.TTVideoEngine;
import j27.s;
import java.util.List;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.0juD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1298910juD {
    public static final C1298910juD LIZ = new C1298910juD();

    public static final List LIZ() {
        List<C1311670kEn> listLJJII;
        List<C1311670kEn> listCreate = new XElementBehavior().create();
        final ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi == null || (listLJJII = iSparkHostApi.LJJII()) == null) {
            listLJJII = C13BV.INSTANCE;
        }
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(new C1339200kxC(124), new C1339200kxC(152), new C1339200kxC(110), new C1339200kxC(140), new C1339200kxC(101), new C1339200kxC(131), new C1339200kxC(92), new C1339200kxC(99), new C1339200kxC(102), new C1339200kxC(97), new C1339200kxC(100), new C1339200kxC(103), new C1339200kxC(105), new C1339200kxC(107), new C1339200kxC(109), new C1339200kxC(112), new C1339200kxC(115), new C1339200kxC(118), new C1339200kxC(121), new C1339200kxC(126), new C1339200kxC(129), new C1339200kxC(132), new C1339200kxC(135), new C1311670kEn() { // from class: X.1AN3
            public final /* synthetic */ boolean LJFF = true;

            @Override // X.C1311670kEn
            public final LynxUI<?> LJFF(s sVar) {
                LynxVideoUI lynxVideoUI = new LynxVideoUI(sVar, null);
                boolean z = this.LJFF;
                C1AN9 c1an9 = new InterfaceC1474390oTF() { // from class: X.1AN9
                    @Override // X.InterfaceC1474390oTF
                    public final void LIZ() {
                    }
                };
                lynxVideoUI.LLJJJ = c1an9;
                ((C1AM9) lynxVideoUI.mView).setUrlConstructor(c1an9);
                if (z) {
                    lynxVideoUI.LLJJIJI = new C1547960qNu(sVar, false, EnumC1533980q1M.LYNX_VIDEO);
                }
                ((C1AM9) lynxVideoUI.mView).setEngineFactory(new InterfaceC1395140mPQ() { // from class: X.1AN5
                    @Override // X.InterfaceC1395140mPQ
                    public final TTVideoEngine LIZJ(Context context) {
                        TTVideoEngine tTVideoEngine = new TTVideoEngine(context, 0);
                        tTVideoEngine.LIZJ(160, 1);
                        tTVideoEngine.LIZJ(21, 1);
                        return tTVideoEngine;
                    }
                });
                return lynxVideoUI;
            }
        }, new C1311670kEn() { // from class: X.1AN2
            public final /* synthetic */ boolean LJI = true;

            {
                super("x-video-pro-ug", false, false, false);
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
            @Override // X.C1311670kEn
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.lynx.tasm.behavior.ui.LynxUI<?> LJFF(j27.s r5) {
                /*
                    r4 = this;
                    com.ss.android.ugc.aweme.spark.ISparkHostApi r1 = r3
                    if (r1 == 0) goto Lc
                    boolean r0 = r4.LJI
                    com.lynx.tasm.behavior.ui.view.UISimpleView r3 = r1.LJIIIIZZ(r5, r0)
                    if (r3 != 0) goto L34
                Lc:
                    com.bytedance.ies.xelement.video.pro.LynxVideoUI r3 = new com.bytedance.ies.xelement.video.pro.LynxVideoUI
                    r0 = 0
                    r3.<init>(r5, r0)
                    boolean r2 = r4.LJI
                    X.1ANA r1 = new X.InterfaceC1474390oTF() { // from class: X.1ANA
                        static {
                            /*
                                X.1ANA r0 = new X.1ANA
                                r0.<init>()
                                
                                // error: 0x0005: SPUT (r0 I:X.1ANA) X.1ANA.LIZ X.1ANA
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1ANA.<clinit>():void");
                        }

                        {
                            /*
                                r0 = this;
                                r0.<init>()
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1ANA.<init>():void");
                        }

                        @Override // X.InterfaceC1474390oTF
                        public final void LIZ() {
                            /*
                                r0 = this;
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1ANA.LIZ():void");
                        }
                    }
                    r3.LLJJJ = r1
                    T extends android.view.View r0 = r3.mView
                    X.1AM9 r0 = (X.C1AM9) r0
                    r0.setUrlConstructor(r1)
                    if (r2 == 0) goto L2b
                    X.0qNu r2 = new X.0qNu
                    r1 = 0
                    X.0q1M r0 = X.EnumC1533980q1M.LYNX_VIDEO
                    r2.<init>(r5, r1, r0)
                    r3.LLJJIJI = r2
                L2b:
                    X.1AN6 r1 = new X.InterfaceC1395140mPQ() { // from class: X.1AN6
                        static {
                            /*
                                X.1AN6 r0 = new X.1AN6
                                r0.<init>()
                                
                                // error: 0x0005: SPUT (r0 I:X.1AN6) X.1AN6.LIZ X.1AN6
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1AN6.<clinit>():void");
                        }

                        {
                            /*
                                r0 = this;
                                r0.<init>()
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1AN6.<init>():void");
                        }

                        @Override // X.InterfaceC1395140mPQ
                        public final com.ss.ttvideoengine.TTVideoEngine LIZJ(android.content.Context r4) {
                            /*
                                r3 = this;
                                com.ss.ttvideoengine.TTVideoEngine r2 = new com.ss.ttvideoengine.TTVideoEngine
                                r0 = 0
                                r2.<init>(r4, r0)
                                r0 = 160(0xa0, float:2.24E-43)
                                r1 = 1
                                r2.LIZJ(r0, r1)
                                r0 = 21
                                r2.LIZJ(r0, r1)
                                return r2
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1AN6.LIZJ(android.content.Context):com.ss.ttvideoengine.TTVideoEngine");
                        }
                    }
                    T extends android.view.View r0 = r3.mView
                    X.1AM9 r0 = (X.C1AM9) r0
                    r0.setEngineFactory(r1)
                L34:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1AN2.LJFF(j27.s):com.lynx.tasm.behavior.ui.LynxUI");
            }
        }, new C1339200kxC(142), new C1339200kxC(145), new C1339200kxC(148), new C1311670kEn() { // from class: X.0jhg
            public final /* synthetic */ boolean LJFF = true;

            @Override // X.C1311670kEn
            public final LynxUI<?> LJFF(s sVar) {
                LynxAlphaVideo lynxAlphaVideo = new LynxAlphaVideo(sVar, "", null);
                if (this.LJFF) {
                    lynxAlphaVideo.LLIZLLLIL = new C1547950qNt(sVar, EnumC1533980q1M.LYNX_VIDEO, 2);
                }
                lynxAlphaVideo.LLIZ = false;
                return lynxAlphaVideo;
            }
        }, new C1339200kxC(91), new C1311670kEn() { // from class: X.1AN1
            {
                super("x-audio", false, false, false);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [X.0jg0] */
            @Override // X.C1311670kEn
            public final LynxUI<?> LJFF(s sVar) {
                int iLJLL;
                InterfaceC2178171AMl player;
                LynxAudio lynxAudio = new LynxAudio(sVar, null);
                ISparkHostApi iSparkHostApi2 = iSparkHostApi;
                C1AN4 c1an4 = new C1AN4();
                c1an4.LIZ = new ActivityMonitorImpl();
                c1an4.LIZIZ = new InterfaceC2179561ARu() { // from class: X.0jg0
                    public InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> LIZ;
                    public final int LIZIZ;

                    @Override // X.InterfaceC2179561ARu
                    public final void cancel() {
                        InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY = this.LIZ;
                        if (interfaceC1320200kSY != null) {
                            interfaceC1320200kSY.close();
                        }
                        this.LIZ = null;
                    }

                    {
                        C844470XAv.LIZ.getClass();
                        this.LIZIZ = Math.min(C1336100ksC.LIZJ(C844470XAv.LIZ()) / 3, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
                    }

                    @Override // X.InterfaceC2179561ARu
                    public final void LIZ(String str, final AwS612S0100000_33 awS612S0100000_33) {
                        InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY = this.LIZ;
                        if (interfaceC1320200kSY != null) {
                            interfaceC1320200kSY.close();
                        }
                        C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
                        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
                        int i = this.LIZIZ;
                        c1325700kbQLIZLLL.LIZJ = new C1324630kZh(i, i);
                        InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSYLJI = c1325540kbALIZ.LJI(c1325700kbQLIZLLL.LIZ(), null);
                        ((AbstractC1321260kUG) interfaceC1320200kSYLJI).LIZJ(new AbstractC447090Hg3() { // from class: X.0jfz
                            @Override // X.C0HWE
                            public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY2) {
                                awS612S0100000_33.invoke(null);
                            }

                            @Override // X.AbstractC447090Hg3
                            public final void LJI(Bitmap bitmap) {
                                awS612S0100000_33.invoke(bitmap);
                            }
                        }, C822700WPc.LL);
                        this.LIZ = interfaceC1320200kSYLJI;
                    }
                };
                if (iSparkHostApi2 != null) {
                    iLJLL = iSparkHostApi2.LJLL();
                } else {
                    iLJLL = 0;
                }
                c1an4.LIZJ = iLJLL;
                lynxAudio.LL = c1an4;
                AbstractC2178181AMm abstractC2178181AMm = (AbstractC2178181AMm) lynxAudio.mView;
                if (abstractC2178181AMm != null && (player = abstractC2178181AMm.getPlayer()) != null) {
                    player.LJIILL(c1an4);
                }
                return lynxAudio;
            }
        }, new C16H5(8), new C1339190kxB(iSparkHostApi, 6), new C1339190kxB(iSparkHostApi, 8), new C1339190kxB(iSparkHostApi, 9), new C1339190kxB(iSparkHostApi, 10), new C1339190kxB(iSparkHostApi, 11), new C1311670kEn() { // from class: X.0jhi
            public final /* synthetic */ boolean LJFF = true;

            @Override // X.C1311670kEn
            public final LynxUI<?> LJFF(s sVar) {
                LynxBytedLottieView lynxBytedLottieView = new LynxBytedLottieView(sVar, 0);
                if (this.LJFF) {
                    lynxBytedLottieView.LLJJIII = new C1547950qNt(sVar, false, EnumC1533980q1M.LYNX_LOTTIE);
                }
                return lynxBytedLottieView;
            }
        }, new C1311670kEn() { // from class: X.0jhh
            public final /* synthetic */ boolean LJFF = true;

            @Override // X.C1311670kEn
            public final LynxUI<?> LJFF(s sVar) {
                LynxBytedLottieView lynxBytedLottieView = new LynxBytedLottieView(sVar, 0);
                if (this.LJFF) {
                    lynxBytedLottieView.LLJJIII = new C1547950qNt(sVar, EnumC1533980q1M.LYNX_LOTTIE, 2);
                }
                return lynxBytedLottieView;
            }
        }, new C1339200kxC(113), new C1339200kxC(116), new C1339200kxC(119), new C1339200kxC(122), new C1339190kxB(iSparkHostApi, 12), new C1339200kxC(127), new C1339200kxC(130), new C1339200kxC(133), new C1339200kxC(136), new C1339200kxC(138), new C1339200kxC(143), new C1339200kxC(146), new C1339200kxC(149), new C1339200kxC(151), new C1339190kxB(iSparkHostApi, 0), new C1339190kxB(iSparkHostApi, 2), new C1339190kxB(iSparkHostApi, 3), new C1339200kxC(93), new C1339200kxC(95), new C1339200kxC(98), new C1339200kxC(104), new C1339200kxC(106), new C1339200kxC(108), new C1339200kxC(111), new C1339200kxC(114), new C1339200kxC(117), new C1339200kxC(120), new C1339200kxC(123), new C1339200kxC(125), new C1339200kxC(128), new C1339200kxC(134), new C1339200kxC(137), new C1339200kxC(139), new C1311670kEn() { // from class: com.ss.android.ugc.aweme.base.xelements.XElements$getBehaviors$overrideBehaviors$73
            @Override // X.C1311670kEn
            public final LynxUI<?> LJFF(final s sVar) {
                return new UISimpleView<AndroidView>(sVar) { // from class: com.ss.android.ugc.aweme.base.xelements.XElements$getBehaviors$overrideBehaviors$73$createUI$1
                    @Override // com.lynx.tasm.behavior.ui.LynxUI
                    public final View createView(Context context) {
                        return new AndroidView(context);
                    }
                };
            }
        }, new C1339200kxC(141), new C1339200kxC(144), new C1339200kxC(147), new C1339200kxC(150), new C1339190kxB(iSparkHostApi, 13), new C1339190kxB(iSparkHostApi, 1), new C1339190kxB(iSparkHostApi, 4), new C1339200kxC(94), new C1339200kxC(96));
        if (iSparkHostApi != null) {
            listLJIILJJIL.add(new C1339190kxB(iSparkHostApi, iSparkHostApi.LJIILLIIL(), 5));
            listLJIILJJIL.add(new C1339190kxB(iSparkHostApi, iSparkHostApi.LJIJJLI(), 7));
        }
        listCreate.addAll(listLJIILJJIL);
        listCreate.addAll(listLJJII);
        if (iSparkHostApi != null) {
            if (iSparkHostApi.LJJLI()) {
                listCreate.addAll(iSparkHostApi.LJJIFFI());
            }
            List<C1311670kEn> listE3 = iSparkHostApi.e3();
            if (listE3 != null) {
                listCreate.addAll(listE3);
            }
        }
        return listCreate;
    }
}
