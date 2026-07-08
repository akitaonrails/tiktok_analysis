package Y;

import X.AbstractC1268600j7K;
import X.AbstractC1317090kNX;
import X.C098200Yq;
import X.C0VSP;
import X.C0VSV;
import X.C1143680frq;
import X.C1168400gVi;
import X.C118300cf;
import X.C1270270jA1;
import X.C1272090jCx;
import X.C1272100jCy;
import X.C1282580jTs;
import X.C1292290jjX;
import X.C1295960jpS;
import X.C1301070jxh;
import X.C1317210kNj;
import X.C1317220kNk;
import X.C13LP;
import X.C189200o6;
import X.C1C7U;
import X.C2106208My;
import X.C2107108Nh;
import X.C2188811AlT;
import X.C259800zU;
import X.C742060T8y;
import X.C786410Ut5;
import X.InterfaceC1143790fs1;
import X.InterfaceC1272120jD0;
import X.InterfaceC1272460jDY;
import android.media.MediaCodec;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.broadcast.end.EndIncentiveSettlementFragmentV2;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttvecamera.TECameraCapture;
import com.ss.android.ttvecamera.b0;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.AwS101S0400000_2;
import kotlin.jvm.internal.AwS386S0200000_20;
import kotlin.jvm.internal.AwS599S0100000_20;
import kotlin.text.u;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS13S0301000_20 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, java.util.zip.ZipEntry] */
    /* JADX WARN: Type inference failed for: r0v25, types: [T, java.util.zip.ZipEntry] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.util.zip.ZipEntry] */
    public final void LIZ$0() {
        Object c098200Yq;
        final C1292290jjX c1292290jjX = (C1292290jjX) this.l0;
        File file = (File) this.l1;
        final File file2 = (File) this.l2;
        c1292290jjX.getClass();
        try {
            C1292290jjX.LIZLLL(file2);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            ArrayList arrayList = new ArrayList();
            ZipInputStream zipInputStream = new ZipInputStream(new C0VSP(file));
            try {
                C259800zU c259800zU = new C259800zU();
                c259800zU.element = zipInputStream.getNextEntry();
                C118300cf c118300cf = new C118300cf();
                while (true) {
                    T t = c259800zU.element;
                    if (t == 0) {
                        break;
                    }
                    c118300cf.element++;
                    File fileLJII = C1292290jjX.LJII(file2, ((ZipEntry) t).getName());
                    if (fileLJII == null) {
                        C1168400gVi.LIZLLL(new AwS599S0100000_20(c259800zU, (C259800zU<ZipEntry>) 6));
                        zipInputStream.closeEntry();
                        c259800zU.element = zipInputStream.getNextEntry();
                    } else {
                        if (((ZipEntry) c259800zU.element).isDirectory()) {
                            fileLJII.mkdirs();
                        } else {
                            File parentFile = fileLJII.getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                            }
                            C0VSV c0vsv = new C0VSV(fileLJII);
                            try {
                                C2106208My.LIZ(zipInputStream, c0vsv);
                                C2107108Nh.LIZ(c0vsv, null);
                                if (u.LJIIZILJ(fileLJII.getName(), ".json", true)) {
                                    arrayList.add(fileLJII);
                                }
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    try {
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        th = null;
                                        TryCatchGuardChecker.doCheck(th);
                                        C2107108Nh.LIZ(c0vsv, th);
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                        }
                        zipInputStream.closeEntry();
                        c259800zU.element = zipInputStream.getNextEntry();
                    }
                }
                C1168400gVi.LIZJ(new AwS101S0400000_2(file, (File) c118300cf, (C118300cf) arrayList, (List<File>) file2, (File) 0));
                C2107108Nh.LIZ(zipInputStream, null);
                c098200Yq = arrayList.isEmpty() ? null : (File) C13LP.LJL(new AComparatorS501S0100000_2(new Comparator() { // from class: X.05kK
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t2, T t3) {
                        C1292290jjX c1292290jjX2 = c1292290jjX;
                        File file3 = file2;
                        c1292290jjX2.getClass();
                        Integer numValueOf = Integer.valueOf(C1292290jjX.LJFF(file3, (File) t2));
                        C1292290jjX c1292290jjX3 = c1292290jjX;
                        File file4 = file2;
                        c1292290jjX3.getClass();
                        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(C1292290jjX.LJFF(file4, (File) t3)));
                    }
                }, 0), arrayList);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th4) {
                th = th4;
                try {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    } catch (Throwable th5) {
                        th = th5;
                        TryCatchGuardChecker.doCheck(th);
                        C2107108Nh.LIZ(zipInputStream, th);
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    th = null;
                    TryCatchGuardChecker.doCheck(th);
                    C2107108Nh.LIZ(zipInputStream, th);
                    throw th;
                }
            }
        } catch (Throwable th7) {
            TryCatchGuardChecker.doCheck(th7);
            c098200Yq = new C098200Yq(th7);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1168400gVi.LIZIZ(new AwS386S0200000_20(file, thM5exceptionOrNullimpl, 0));
        }
        final File file3 = (File) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        final int i = this.i3;
        final C1292290jjX c1292290jjX2 = (C1292290jjX) this.l0;
        final File file4 = (File) this.l2;
        final File file5 = (File) this.l1;
        C742060T8y.LIZ(new Runnable() { // from class: X.0jjU
            public final void LIZ() {
                int i2 = i;
                C1292290jjX c1292290jjX3 = c1292290jjX2;
                if (i2 != c1292290jjX3.LLJ) {
                    C1168400gVi.LIZLLL(new C1292270jjV(file5, i2));
                    c1292290jjX2.LIZJ(file4, "stale");
                    return;
                }
                File file6 = file3;
                if (file6 != null) {
                    c1292290jjX3.LIZIZ(file6.getAbsolutePath(), file4, file5.getAbsolutePath(), i, "zip-json");
                } else {
                    C1168400gVi.LIZIZ(new AwS599S0100000_20(file5, 5));
                    c1292290jjX2.LIZJ(file4, "no-json");
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MynaLottieElementView@f3ae.prepareZipSourceAsync$1$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MynaLottieElementView@f3ae.prepareZipSourceAsync$1$1");
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.l2
            X.0j7N r0 = (X.C1268630j7N) r0
            X.0j3h r1 = r0.LLJI
            if (r1 == 0) goto Laa
            X.0jD9 r0 = r0.LLLFZ
            r5 = 0
            if (r0 == 0) goto L3e
            int r0 = r6.i3
            r1.LJJLJLI(r5, r0, r5)
            android.util.AndroidRuntimeException r2 = new android.util.AndroidRuntimeException
            java.lang.String r0 = "BUG! register again, why?"
            r2.<init>(r0)
            X.0jG9 r1 = X.C1274080jGA.LIZ
            java.lang.String r0 = "LiveCoreImpl.registerScreenAudioPlayBack"
            r1.LIZ(r0, r2)
            boolean r0 = X.C1274040jG6.LIZ()
            if (r0 != 0) goto Lbd
            java.lang.Object r0 = r6.l2
            X.0j7N r0 = (X.C1268630j7N) r0
            X.0jD9 r1 = r0.LLLFZ
            X.0j7g r0 = r1.LIZ
            if (r0 == 0) goto L38
            r0.stop()
            X.0j7g r0 = r1.LIZ
            r0.release()
        L38:
            java.lang.Object r0 = r6.l2
            X.0j7N r0 = (X.C1268630j7N) r0
            r0.LLLFZ = r5
        L3e:
            int r1 = r6.i3
            r0 = 1
            if (r1 != r0) goto L99
            java.lang.Object r0 = r6.l2
            X.0j7N r0 = (X.C1268630j7N) r0
            X.0j8W r0 = r0.LLLL
            boolean r0 = r0.LJJIZ()
            if (r0 != 0) goto Lab
            java.lang.Object r4 = r6.l2
            X.0j7N r4 = (X.C1268630j7N) r4
            X.0j8W r0 = r4.LLLL
            boolean r0 = r0.LJLJL
            if (r0 != 0) goto Lab
            X.0jD9 r3 = new X.0jD9
            X.0j7g r2 = r4.LLLLZ()
            java.lang.Object r1 = r6.l0
            X.0jDY r1 = (X.InterfaceC1272460jDY) r1
            java.lang.Object r0 = r6.l2
            X.0j7N r0 = (X.C1268630j7N) r0
            com.ss.ttlivestreamer.core.engine.AudioDeviceModule r0 = r0.LLILLL
            r3.<init>(r2, r1, r0)
            r4.LLLFZ = r3
        L6e:
            java.lang.Object r0 = r6.l2
            X.0j7N r0 = (X.C1268630j7N) r0
            X.0j3h r0 = r0.LLJI
            if (r0 == 0) goto L99
            X.0j8E r0 = r0.LLILZLL
            if (r0 == 0) goto L99
            X.0j5c r0 = r0.LJIIIIZZ()
            r0.getClass()
            java.lang.Object r0 = r6.l2
            X.0j7N r0 = (X.C1268630j7N) r0
            X.0jD9 r2 = r0.LLLFZ
            X.0j7g r0 = r2.LIZ
            if (r0 == 0) goto L99
            com.ss.ttlivestreamer.core.mixer.AudioMixer$AudioMixerDescription r1 = r0.LIZ()
            r0 = 1036831949(0x3dcccccd, float:0.1)
            r1.volumeCoeff = r0
            X.0j7g r0 = r2.LIZ
            r0.LIZLLL(r1)
        L99:
            java.lang.Object r0 = r6.l2
            X.0j7N r0 = (X.C1268630j7N) r0
            X.0j3h r3 = r0.LLJI
            X.0jD9 r2 = r0.LLLFZ
            int r1 = r6.i3
            java.lang.Object r0 = r6.l1
            com.bytedance.bpea.basics.Cert r0 = (com.bytedance.bpea.basics.Cert) r0
            r3.LJJLJLI(r2, r1, r0)
        Laa:
            return
        Lab:
            java.lang.Object r3 = r6.l2
            X.0j7N r3 = (X.C1268630j7N) r3
            X.0jD9 r2 = new X.0jD9
            java.lang.Object r1 = r6.l0
            X.0jDY r1 = (X.InterfaceC1272460jDY) r1
            com.ss.ttlivestreamer.core.engine.AudioDeviceModule r0 = r3.LLILLL
            r2.<init>(r5, r1, r0)
            r3.LLLFZ = r2
            goto L6e
        Lbd:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS13S0301000_20.LIZ$1():void");
    }

    public final void LIZ$2() {
        int i;
        FrameLayout.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        if (!((EndIncentiveSettlementFragmentV2) this.l0).VR((View) this.l1) || (i = this.i3) < 0 || i >= ((ArrayList) ((EndIncentiveSettlementFragmentV2) this.l0).LLJILJILJ).size() || this.i3 >= ((ArrayList) ((EndIncentiveSettlementFragmentV2) this.l0).LLJILLL).size() || !((View) this.l1).isAttachedToWindow() || !((FrameLayout) this.l2).isAttachedToWindow()) {
            return;
        }
        EndIncentiveSettlementFragmentV2 endIncentiveSettlementFragmentV2 = (EndIncentiveSettlementFragmentV2) this.l0;
        View view = (View) this.l1;
        int i2 = this.i3;
        FrameLayout frameLayout = (FrameLayout) this.l2;
        endIncentiveSettlementFragmentV2.getClass();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int width = iArr[0] + (view.getWidth() / 2);
        int height = iArr[1] + (view.getHeight() / 2);
        int[] iArr2 = new int[2];
        frameLayout.getLocationInWindow(iArr2);
        int i3 = width - iArr2[0];
        int i4 = height - iArr2[1];
        final C1295960jpS c1295960jpS = (C1295960jpS) C13LP.LJJJLZIJ(i2, endIncentiveSettlementFragmentV2.LLJILJILJ);
        if (c1295960jpS != null) {
            ViewGroup.LayoutParams layoutParams3 = c1295960jpS.getLayoutParams();
            if (!(layoutParams3 instanceof FrameLayout.LayoutParams) || (layoutParams = (FrameLayout.LayoutParams) layoutParams3) == null) {
                return;
            }
            layoutParams.setMarginStart(i3 - (c1295960jpS.getLayoutParams().width / 2));
            layoutParams.topMargin = i4 - (c1295960jpS.getLayoutParams().height / 2);
            C786410Ut5.s6(c1295960jpS, layoutParams);
            final C1295960jpS c1295960jpS2 = (C1295960jpS) C13LP.LJJJLZIJ(i2, endIncentiveSettlementFragmentV2.LLJILLL);
            if (c1295960jpS2 != null) {
                ViewGroup.LayoutParams layoutParams4 = c1295960jpS2.getLayoutParams();
                if (!(layoutParams4 instanceof FrameLayout.LayoutParams) || (layoutParams2 = (FrameLayout.LayoutParams) layoutParams4) == null) {
                    return;
                }
                layoutParams2.setMarginStart(i3 - (c1295960jpS2.getLayoutParams().width / 2));
                layoutParams2.topMargin = i4 - (c1295960jpS2.getLayoutParams().height / 2);
                C786410Ut5.s6(c1295960jpS2, layoutParams2);
                C786410Ut5.LLD(0, c1295960jpS);
                c1295960jpS.loop(false);
                final String str = "ttlive_finish_encourage_progress_stroke.zip";
                C1143680frq.LJIILL(c1295960jpS, "tiktok_live_broadcast_demand_12", "ttlive_finish_encourage_progress_stroke.zip", true, new InterfaceC1143790fs1() { // from class: X.0jqm
                    @Override // X.InterfaceC1143790fs1
                    public final void onFinish(boolean z) {
                        if (z) {
                            C786410Ut5.LLD(0, c1295960jpS);
                            c1295960jpS.playAnimation();
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Lottie file load failed: ");
                            sbLIZ.append(str);
                            C20441214yg.LJ("EndIncentiveSettlementFragmentV2", C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                });
                C786410Ut5.LLD(0, c1295960jpS2);
                c1295960jpS2.loop(false);
                final String str2 = "ttlive_finish_encourage_progress_dots.zip";
                C1143680frq.LJIILL(c1295960jpS2, "tiktok_live_broadcast_demand_12", "ttlive_finish_encourage_progress_dots.zip", true, new InterfaceC1143790fs1() { // from class: X.0jqm
                    @Override // X.InterfaceC1143790fs1
                    public final void onFinish(boolean z) {
                        if (z) {
                            C786410Ut5.LLD(0, c1295960jpS2);
                            c1295960jpS2.playAnimation();
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Lottie file load failed: ");
                            sbLIZ.append(str2);
                            C20441214yg.LJ("EndIncentiveSettlementFragmentV2", C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                });
            }
        }
    }

    public final void LIZ$3() {
        LiveStreamVideoCapture liveStreamVideoCapture = (LiveStreamVideoCapture) this.l2;
        AbstractC1268600j7K abstractC1268600j7K = liveStreamVideoCapture.LLJJL;
        if (!(abstractC1268600j7K instanceof C1270270jA1)) {
            if (this.i3 > 0) {
                AVLog.ioe("LiveStreamVideoCapture", "Can not registerScreenAudioPlayBack when not screen capture");
                return;
            }
            return;
        }
        C1270270jA1 c1270270jA1 = (C1270270jA1) abstractC1268600j7K;
        boolean z = liveStreamVideoCapture.LLLIIIL;
        c1270270jA1.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableScreenAudioStereoCapture: ");
        sbLIZ.append(z);
        AVLog.logKibana(4, "ScreenVideoCaptureWithInnerRecord", C2188811AlT.LIZIZ(sbLIZ), null);
        c1270270jA1.LLJLILLLLZIIL = z;
        ((C1270270jA1) ((LiveStreamVideoCapture) this.l2).LLJJL).LLJILLL((InterfaceC1272460jDY) this.l0, (Cert) this.l1);
    }

    public static final void run$0(ARunnableS13S0301000_20 aRunnableS13S0301000_20) {
        boolean zLIZ;
        C1C7U.LIZ("MynaLottieElementView@f3ae.prepareZipSourceAsync$1");
        try {
            aRunnableS13S0301000_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MynaLottieElementView@f3ae.prepareZipSourceAsync$1");
    }

    public static final void run$1(ARunnableS13S0301000_20 aRunnableS13S0301000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LiveCoreImpl@e164.registerScreenAudioPlayBack$1");
        try {
            aRunnableS13S0301000_20.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveCoreImpl@e164.registerScreenAudioPlayBack$1");
    }

    public static final void run$2(ARunnableS13S0301000_20 aRunnableS13S0301000_20) {
        boolean zLIZ;
        C1C7U.LIZ("TECameraServer@d252.switchCamera$1");
        try {
            ((b0) aRunnableS13S0301000_20.l2).switchCamera((TECameraCapture) aRunnableS13S0301000_20.l0, aRunnableS13S0301000_20.i3, (Cert) aRunnableS13S0301000_20.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TECameraServer@d252.switchCamera$1");
    }

    public static final void run$3(ARunnableS13S0301000_20 aRunnableS13S0301000_20) {
        InterfaceC1272120jD0 interfaceC1272120jD0;
        C1272100jCy c1272100jCy = (C1272100jCy) aRunnableS13S0301000_20.l0;
        String[] strArr = (String[]) aRunnableS13S0301000_20.l1;
        int i = aRunnableS13S0301000_20.i3;
        String[] strArr2 = (String[]) aRunnableS13S0301000_20.l2;
        C1C7U.LIZ("VideoEffectNode@5e69.composerPreloadNodesWithTags$1L");
        if (c1272100jCy.LJIILIIL() && (interfaceC1272120jD0 = c1272100jCy.LLILZ) != null) {
            interfaceC1272120jD0.composerPreloadNodesWithTags(strArr, i, strArr2);
        }
        C1C7U.LIZIZ("VideoEffectNode@5e69.composerPreloadNodesWithTags$1L");
    }

    public static final void run$4(ARunnableS13S0301000_20 aRunnableS13S0301000_20) {
        C1272090jCx c1272090jCx = (C1272090jCx) aRunnableS13S0301000_20.l0;
        String[] strArr = (String[]) aRunnableS13S0301000_20.l1;
        int i = aRunnableS13S0301000_20.i3;
        String[] strArr2 = (String[]) aRunnableS13S0301000_20.l2;
        c1272090jCx.getClass();
        C1C7U.LIZ("FilterManager@d45d.composerPreloadNodesWithTags$1L");
        if (c1272090jCx.isValid()) {
            c1272090jCx.LLJJIJIIJIL.composerPreloadNodesWithTags(strArr, i, strArr2);
        }
        C1C7U.LIZIZ("FilterManager@d45d.composerPreloadNodesWithTags$1L");
    }

    public static final void run$5(ARunnableS13S0301000_20 aRunnableS13S0301000_20) {
        boolean zLIZ;
        C1C7U.LIZ("FontFaceManager@c8f5.invokeTypefaceListenerOnUIThread$1");
        try {
            C786410Ut5.LJJZZIII((Handler) aRunnableS13S0301000_20.l1, new ARunnableS89S0200000_20(aRunnableS13S0301000_20, ((C1301070jxh) aRunnableS13S0301000_20.l0).LIZ(aRunnableS13S0301000_20.i3), 129));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FontFaceManager@c8f5.invokeTypefaceListenerOnUIThread$1");
    }

    public static final void run$6(ARunnableS13S0301000_20 aRunnableS13S0301000_20) {
        boolean zLIZ;
        C1C7U.LIZ("EndIncentiveSettlementFragmentV2@f702.playTaskLottieV2$r$1");
        try {
            aRunnableS13S0301000_20.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EndIncentiveSettlementFragmentV2@f702.playTaskLottieV2$r$1");
    }

    public static final void run$7(ARunnableS13S0301000_20 aRunnableS13S0301000_20) {
        C1282580jTs c1282580jTs = (C1282580jTs) aRunnableS13S0301000_20.l0;
        MediaCodec mediaCodec = (MediaCodec) aRunnableS13S0301000_20.l1;
        int i = aRunnableS13S0301000_20.i3;
        MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) aRunnableS13S0301000_20.l2;
        c1282580jTs.getClass();
        C1C7U.LIZ("HardwareVideoEncoder$MediaCodecCallback@ad3.onOutputBufferAvailable$1L");
        c1282580jTs.LIZIZ.LLJILJIL(mediaCodec, i, bufferInfo);
        C1C7U.LIZIZ("HardwareVideoEncoder$MediaCodecCallback@ad3.onOutputBufferAvailable$1L");
    }

    public static final void run$8(ARunnableS13S0301000_20 aRunnableS13S0301000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LiveStreamVideoCapture@20b1.registerScreenAudioPlayBack$1");
        try {
            aRunnableS13S0301000_20.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveStreamVideoCapture@20b1.registerScreenAudioPlayBack$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$9(ARunnableS13S0301000_20 aRunnableS13S0301000_20) {
        int i = aRunnableS13S0301000_20.i3;
        C1317220kNk c1317220kNk = (C1317220kNk) aRunnableS13S0301000_20.l0;
        C259800zU c259800zU = (C259800zU) aRunnableS13S0301000_20.l1;
        C259800zU c259800zU2 = (C259800zU) aRunnableS13S0301000_20.l2;
        C1C7U.LIZ("SDUIDebounceMethod@ec91.handle$2L");
        C1317220kNk.LIZJ.remove(Integer.valueOf(i));
        AbstractC1317090kNX abstractC1317090kNX = c1317220kNk.LIZ;
        if (abstractC1317090kNX == null) {
            abstractC1317090kNX = null;
        }
        abstractC1317090kNX.LLJILLL.LIZ(C1317210kNj.LIZJ, (String) c259800zU.element, (String) c259800zU2.element);
        C1C7U.LIZIZ("SDUIDebounceMethod@ec91.handle$2L");
    }

    public ARunnableS13S0301000_20(int i, Object obj, Object obj2, Object obj3, int i2) {
        this.$t = i2;
        this.i3 = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
