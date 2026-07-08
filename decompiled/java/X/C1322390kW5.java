package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.aweme.ecommerce.ab.EcomCommonOptimizeConfigBean;
import com.ss.android.ugc.aweme.ecommerce.preloader.EcomRoundedCornerPostprocessor;
import com.ss.android.ugc.aweme.ecommerce.resource.EcomResourceBystander;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0kW5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1322390kW5 extends C1315750kLN {
    public final Context LJJLIIIJJI;

    public C1322390kW5(Context context) {
        super(context, C1322200kVm.LIZJ(), null, false);
        this.LJJLIIIJJI = context;
    }

    public static void LJIJJ(C1322390kW5 c1322390kW5, String str, String str2, String str3, String str4, int i, int i2, boolean z, Bitmap.Config config, boolean z2, int i3, int i4, int i5, int i6, float[] fArr, InterfaceC1320380kSq interfaceC1320380kSq, EnumC1331380kka enumC1331380kka, String str5, boolean z3, String str6, ArrayList arrayList, String str7, int i7) {
        C1325710kbR c1325710kbRLIZ;
        EcomCommonOptimizeConfigBean ecomCommonOptimizeConfigBean;
        String str8 = str7;
        ArrayList arrayList2 = arrayList;
        boolean z4 = z3;
        String str9 = str5;
        EnumC1331380kka enumC1331380kka2 = enumC1331380kka;
        InterfaceC1320380kSq interfaceC1320380kSq2 = interfaceC1320380kSq;
        float[] fArr2 = fArr;
        int i8 = i5;
        int i9 = i4;
        int i10 = i3;
        int i11 = i6;
        String str10 = str6;
        Bitmap.Config config2 = config;
        if ((i7 & 128) != 0) {
            config2 = Bitmap.Config.ARGB_8888;
        }
        if ((i7 & 512) != 0) {
            i10 = 0;
        }
        if ((i7 & 1024) != 0) {
            i9 = 0;
        }
        if ((i7 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            i8 = 0;
        }
        if ((i7 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            i11 = 0;
        }
        if ((i7 & 8192) != 0) {
            fArr2 = new float[0];
        }
        if ((i7 & 16384) != 0) {
            interfaceC1320380kSq2 = InterfaceC1320380kSq.LJI;
        }
        if ((32768 & i7) != 0) {
            enumC1331380kka2 = null;
        }
        if ((65536 & i7) != 0) {
            str9 = null;
        }
        if ((131072 & i7) != 0) {
            z4 = false;
        }
        if ((262144 & i7) != 0) {
            str10 = null;
        }
        if ((524288 & i7) != 0) {
            arrayList2 = null;
        }
        if ((i7 & 1048576) != 0) {
            str8 = null;
        }
        c1322390kW5.getClass();
        if (i >= 1 && i2 >= 1) {
            if (i == 1 && i2 == 1) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C1315720kLK c1315720kLK = c1322390kW5.LJJIIZI;
            c1315720kLK.LJIILL = config2;
            c1315720kLK.LJJII.LIZ();
            if (z) {
                C1325710kbR c1325710kbRLJII = c1322390kW5.LJII(new C089P(c1322390kW5.LJJLIIIJJI, str4, 0), i, i2, i10, i9, i8, i11, fArr2, interfaceC1320380kSq2);
                if (c1325710kbRLJII == null) {
                    return;
                }
                C1325700kbQ c1325700kbQLIZIZ = C1325700kbQ.LIZIZ(c1325710kbRLJII);
                c1325700kbQLIZIZ.LJIILIIL = new EcomRoundedCornerPostprocessor(str4, i, i2, i10, i9, i8, i11, fArr2, interfaceC1320380kSq2, null, null, config2);
                C1322400kW6.LIZ.getClass();
                if (C1322400kW6.LIZIZ.priorityOptimizeSwitch > 0) {
                    c1325700kbQLIZIZ.LJIIL = EnumC1331380kka.MEDIUM;
                }
                C1326590kcr.LIZIZ(c1325700kbQLIZIZ, str10);
                c1325710kbRLIZ = c1325700kbQLIZIZ.LIZ();
            } else {
                boolean z5 = false;
                C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(C1946007jm.LJ(str4));
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(config2);
                imageDecodeOptionsBuilder.getClass();
                C1329360khK c1329360khK = new C1329360khK(imageDecodeOptionsBuilder);
                if (z2 || (ecomCommonOptimizeConfigBean = C1323240kXS.LIZ.bitmapRgb565) == null || !ecomCommonOptimizeConfigBean.enable) {
                    z5 = true;
                }
                c1329360khK.LJIIJJI = z5;
                c1325700kbQLIZLLL.LJFF = c1329360khK;
                c1325700kbQLIZLLL.LIZJ = new C1324630kZh(i, i2);
                c1325700kbQLIZLLL.LJ = C1324670kZl.LIZJ;
                if (enumC1331380kka2 != null) {
                    c1325700kbQLIZLLL.LJIIL = enumC1331380kka2;
                }
                C1326590kcr.LIZIZ(c1325700kbQLIZLLL, str10);
                c1325710kbRLIZ = c1325700kbQLIZLLL.LIZ();
            }
            if (c1325710kbRLIZ == null) {
                return;
            }
            C1324660kZk c1324660kZkLIZIZ = C1322200kVm.LIZ().LJIIJJI.LIZIZ(c1325710kbRLIZ, null);
            if (C1322200kVm.LIZ().LIZLLL.get(c1324660kZkLIZIZ) != null) {
                return;
            }
            final C1301840jyw c1301840jyw = new C1301840jyw(c1325710kbRLIZ, z4, str9, c1322390kW5, str3, c1324660kZkLIZIZ, jElapsedRealtime);
            EcomResourceBystander ecomResourceBystander = EcomResourceBystander.LIZ;
            InterfaceC1508110pLd interfaceC1508110pLd = new InterfaceC1508110pLd() { // from class: X.0kd3
                @Override // X.InterfaceC1508110pLd
                public final InterfaceC1508150pLh LIZ(final C1508120pLe c1508120pLe) {
                    Executor executor;
                    final InterfaceC1320200kSY<Object> interfaceC1320200kSYInvoke = c1301840jyw.invoke();
                    InterfaceC589510NAf<Object> interfaceC589510NAf = new InterfaceC589510NAf<Object>() { // from class: X.0kd9
                        @Override // X.InterfaceC589510NAf
                        public final void LIZJ(AbstractC1321260kUG abstractC1321260kUG) {
                        }

                        @Override // X.InterfaceC589510NAf
                        public final void LIZ(InterfaceC1320200kSY<Object> interfaceC1320200kSY) {
                            c1508120pLe.onSuccess();
                        }

                        @Override // X.InterfaceC589510NAf
                        public final void LIZIZ(InterfaceC1320200kSY<Object> interfaceC1320200kSY) {
                            String message;
                            Throwable thLIZLLL;
                            C03W6 c03w6 = c1508120pLe;
                            if (interfaceC1320200kSY == null || (thLIZLLL = ((AbstractC1321260kUG) interfaceC1320200kSY).LIZLLL()) == null || (message = thLIZLLL.getMessage()) == null) {
                                message = " failure";
                            }
                            c03w6.LIZ(message);
                        }

                        @Override // X.InterfaceC589510NAf
                        public final void LIZLLL(AbstractC1321260kUG abstractC1321260kUG) {
                            c1508120pLe.LIZ("cancel");
                        }
                    };
                    C1507890pLH c1507890pLHLIZ = C1507890pLH.LIZJ.LIZ();
                    if (c1507890pLHLIZ == null || (executor = c1507890pLHLIZ.LIZIZ.LIZIZ) == null) {
                        executor = C1326680kd0.LIZ;
                    }
                    interfaceC1320200kSYInvoke.LIZJ(interfaceC589510NAf, executor);
                    return new InterfaceC1508150pLh() { // from class: X.0kd6
                        @Override // X.InterfaceC1508150pLh
                        public final void LIZ() {
                            interfaceC1320200kSYInvoke.close();
                        }
                    };
                }
            };
            ecomResourceBystander.getClass();
            C1507990pLR c1507990pLRLJIIL = EcomResourceBystander.LJIIL(str, str2, 2, str9, interfaceC1508110pLd, str8, str4);
            if (arrayList2 != null) {
                arrayList2.add(c1507990pLRLJIIL);
            }
            String str11 = c1507990pLRLJIIL.LJIILIIL;
            if (!z4 || str9 == null) {
                return;
            }
            System.currentTimeMillis();
            C1326660kcy.LIZ.LIZIZ(str9, str11);
            System.currentTimeMillis();
        }
    }
}
