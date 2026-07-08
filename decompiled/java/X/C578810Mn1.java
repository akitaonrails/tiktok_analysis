package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VESize;
import java.util.IllegalFormatException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import ln3.a;
import lnn.q;
import mn3.e0;

/* JADX INFO: renamed from: X.0Mn1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C578810Mn1 implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C1DRG LL;
    public final C19EG LLILLJJLI;
    public final C1664750tQH LLILLL;
    public final C1664750tQH LLILZ;
    public final C1664750tQH LLILZIL;
    public final C1664750tQH LLILZLL;
    public final C1664740tQG LLIZ;
    public final C1664740tQG LLIZLLLIL;
    public final C1664740tQG LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 958));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(419));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C578810Mn1.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C578810Mn1.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C578810Mn1.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C578810Mn1.class, "recordControlCompatBridge", "getRecordControlCompatBridge()Lcom/ss/android/ugc/aweme/social/creation/record/viewmodel/bridge/RecordControlCompatBridge;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C578810Mn1.class, "recordComponent", "getRecordComponent()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C578810Mn1.class, "beautyApiComponent", "getBeautyApiComponent()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C578810Mn1.class, "filterApiComponent", "getFilterApiComponent()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7};
    }

    public final String LIZJ() {
        C0LFI c0lfi = (C0LFI) this.LLJI.getValue();
        c0lfi.getClass();
        try {
            C0VSJ c0vsj = new C0VSJ(c0lfi.LIZ);
            if (!c0vsj.exists()) {
                c0vsj.mkdirs();
            }
            return c0lfi.LIZ();
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LIZLLL(6, "Story", "NullPointerException when generate photo path error");
            return null;
        } catch (IllegalFormatException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2344809Gs.LIZLLL(6, "Story", "IllegalFormatException when generate photo path error");
            return null;
        }
    }

    public final e0 LIZLLL() {
        return (e0) this.LLILZIL.getValue(this, LLJILJIL[2]);
    }

    public final boolean LJ() {
        return ((Boolean) this.LLJIJIL.getValue()).booleanValue();
    }

    public final ShortVideoContext LJFF() {
        return (ShortVideoContext) this.LLILLL.getValue(this, LLJILJIL[0]);
    }

    public final q LJI() {
        return (q) this.LLILZ.getValue(this, LLJILJIL[1]);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C578810Mn1(C19EG c19eg, C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = c19eg;
        this.LLILLL = C1664770tQJ.LIZ(c1drg, ShortVideoContext.class, null);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, q.class, null);
        this.LLILZIL = C1664770tQJ.LIZ(c1drg, e0.class, null);
        this.LLILZLL = C1664770tQJ.LIZ(c1drg, C1656610tD9.class, null);
        this.LLIZ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1648570t0B.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZIZ(c1drg, a.class, null);
        this.LLJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1644770su3.class, null);
    }

    public static Object LJII(Bitmap bitmap, String str, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        if (bitmap == null) {
            C2243608qg.LIZ(null, c23260099m);
        } else {
            C2477909nN.LJI(bitmap, str, Bitmap.CompressFormat.JPEG, 0, 4);
            C2243608qg.LIZ(str, c23260099m);
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public final Pair<AnonymousClass0957<C443120HZe<Bitmap, Long, Boolean>>, AnonymousClass0957<Pair<Bitmap, Long>>> LJIIIIZZ(final ShortVideoContext shortVideoContext, boolean z, final String str, EnumC1448590nnd enumC1448590nnd) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final C099F c099fLIZIZ = C090F.LIZIZ();
        final C099F c099fLIZIZ2 = C090F.LIZIZ();
        if (!z) {
            c099fLIZIZ2.LJJLIIIJILLIZJL(new Pair(null, 0L));
        }
        CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
        final int i = cameraComponentModel.mVideoWidth;
        final int ratio = cameraComponentModel.mVideoHeight;
        if (enumC1448590nnd != null && enumC1448590nnd != EnumC1448590nnd.RATIO_9_16) {
            ratio = (int) (i / enumC1448590nnd.getRatio());
        }
        if (str == null && !LJ()) {
            LJIIIZ(i, ratio, z, jCurrentTimeMillis, c099fLIZIZ, c099fLIZIZ2);
        } else if (z) {
            VESize vESize = new VESize(i, ratio);
            VERecorder vERecorderLIZIZ = LIZLLL().u92().LIZIZ();
            C578870Mn7 c578870Mn7 = new C578870Mn7();
            C1AO8 c1ao8 = C1AO8.NORMAL_GET_FRAME_MODE;
            C2254411DLr c2254411DLr = c578870Mn7.LIZ;
            c2254411DLr.LIZ = c1ao8;
            c2254411DLr.LJ = EnumC578750Mmv.NO_EFFECT;
            c2254411DLr.LJI = EnumC1780180wQS.CENTER_CROP;
            c2254411DLr.LIZIZ = vESize;
            int i2 = ratio;
            c2254411DLr.LJII = new C1AO7() { // from class: X.0Mn5
                public final /* synthetic */ boolean LIZLLL = true;

                @Override // X.C1AO7
                public final /* synthetic */ void LIZ(int i3, int i4, int[] iArr) {
                }

                @Override // X.C1AO7
                public final /* synthetic */ void onResult(int i3) {
                }

                @Override // X.C1AO7
                public final void LIZIZ(VEFrame vEFrame, int i3) {
                    Bitmap bitmap;
                    if (!this.LIZ.LJ()) {
                        this.LIZ.LJIIJ(i, ratio, this.LIZLLL, jCurrentTimeMillis, str, shortVideoContext, c099fLIZIZ, c099fLIZIZ2);
                    }
                    if (!c099fLIZIZ2.isCompleted()) {
                        if (vEFrame == null) {
                            bitmap = null;
                        } else {
                            try {
                                bitmap = vEFrame.toBitmap();
                            } catch (UnsupportedOperationException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c099fLIZIZ2.LJIIZILJ(new Pair<>(null, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
                                return;
                            }
                        }
                        c099fLIZIZ2.LJIIZILJ(new Pair<>(bitmap, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
                    }
                }
            };
            vERecorderLIZIZ.LJIIJJI(c2254411DLr);
            if (LJ()) {
                LJIIJ(i, i2, true, jCurrentTimeMillis, str, shortVideoContext, c099fLIZIZ, c099fLIZIZ2);
            }
        } else {
            LJIIJ(i, ratio, false, jCurrentTimeMillis, str, shortVideoContext, c099fLIZIZ, c099fLIZIZ2);
        }
        return new Pair<>(c099fLIZIZ, c099fLIZIZ2);
    }

    public final void LJIIIZ(int i, int i2, boolean z, final long j, final C05XL<C443120HZe<Bitmap, Long, Boolean>> c05xl, final C05XL<Pair<Bitmap, Long>> c05xl2) {
        LIZLLL().u92().LIZIZ().LJJIJ(i, i2, new InterfaceC2173471A4j() { // from class: X.01tO
            @Override // X.InterfaceC2173471A4j
            public final void LIZ(int i3, Bitmap bitmap) {
                Integer numValueOf;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("shotScreen onResult ");
                sbLIZ.append(i3);
                sbLIZ.append(' ');
                Integer numValueOf2 = null;
                if (bitmap != null) {
                    numValueOf = Integer.valueOf(bitmap.getWidth());
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                sbLIZ.append(' ');
                if (bitmap != null) {
                    numValueOf2 = Integer.valueOf(bitmap.getHeight());
                }
                sbLIZ.append(numValueOf2);
                C2188811AlT.LIZIZ(sbLIZ);
                if (!c05xl.isCompleted()) {
                    c05xl.LJIIZILJ(new C443120HZe<>(bitmap, Long.valueOf(System.currentTimeMillis() - j), Boolean.FALSE));
                }
            }
        }, z, new VERecorder.IVEFrameShotScreenCallback() { // from class: X.0Mn6
            @Override // com.ss.android.vesdk.VERecorder.IVEFrameShotScreenCallback
            public final void onShotScreen(VEFrame vEFrame, int i3) {
                Bitmap bitmap;
                if (!c05xl2.isCompleted()) {
                    C05XL<Pair<Bitmap, Long>> c05xl3 = c05xl2;
                    if (vEFrame != null) {
                        bitmap = vEFrame.toBitmap();
                    } else {
                        bitmap = null;
                    }
                    c05xl3.LJIIZILJ(new Pair<>(bitmap, Long.valueOf(System.currentTimeMillis() - j)));
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0237 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0360  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC497601wk r38, android.graphics.Bitmap r39, java.lang.String r40, boolean r41, X.AnonymousClass0957<kotlin.Pair<android.graphics.Bitmap, java.lang.Long>> r42, kotlin.jvm.functions.Function0<kotlin.Unit> r43, java.util.Map<android.graphics.Bitmap, ? extends kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>> r44, X.InterfaceC1364105Vn<? super kotlin.Unit> r45) {
        /*
            Method dump skipped, instruction units count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C578810Mn1.LIZ(X.01wk, android.graphics.Bitmap, java.lang.String, boolean, X.0957, kotlin.jvm.functions.Function0, java.util.Map, X.05Vn):java.lang.Object");
    }

    public final void LJIIJ(final int i, final int i2, final boolean z, final long j, final String str, final ShortVideoContext shortVideoContext, final C05XL<C443120HZe<Bitmap, Long, Boolean>> c05xl, final C05XL<Pair<Bitmap, Long>> c05xl2) {
        VESize vESize = new VESize(i, i2);
        final C099F c099fLIZIZ = C090F.LIZIZ();
        C578870Mn7 c578870Mn7 = new C578870Mn7();
        C1AO8 c1ao8 = C1AO8.NORMAL_GET_FRAME_MODE;
        C2254411DLr c2254411DLr = c578870Mn7.LIZ;
        c2254411DLr.LIZ = c1ao8;
        c2254411DLr.LJ = EnumC578750Mmv.FULL_EFFECT;
        c2254411DLr.LJI = EnumC1780180wQS.CENTER_CROP;
        c2254411DLr.LIZIZ = vESize;
        c2254411DLr.LJII = new C1AO7() { // from class: X.0Mn3
            @Override // X.C1AO7
            public final /* synthetic */ void LIZ(int i3, int i4, int[] iArr) {
            }

            @Override // X.C1AO7
            public final void onResult(int i3) {
                if (i3 != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("take photo save error: ");
                    sbLIZ.append(i3);
                    C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                }
                String str2 = str;
                if (str2 != null) {
                    c099fLIZIZ.LJIIZILJ(Unit.LIZ);
                    C373801cm.LIZIZ(str2);
                }
            }

            @Override // X.C1AO7
            public final void LIZIZ(VEFrame vEFrame, int i3) {
                Bitmap bitmap;
                if (vEFrame != null) {
                    try {
                        bitmap = vEFrame.toBitmap();
                    } catch (RuntimeException e) {
                        TryCatchGuardChecker.doCheck(e);
                        bitmap = null;
                    }
                } else {
                    bitmap = null;
                }
                String str2 = str;
                if (str2 != null) {
                    if (i3 == 0 && bitmap != null) {
                        if (!c05xl.isCompleted()) {
                            c05xl.LJIIZILJ(new C443120HZe<>(bitmap, Long.valueOf(System.currentTimeMillis() - j), Boolean.TRUE));
                            return;
                        }
                        return;
                    } else {
                        C373801cm.LIZIZ(str2);
                        if (this.LJ()) {
                            this.LJIIJ(i, i2, z, j, null, shortVideoContext, c05xl, c05xl2);
                            return;
                        } else {
                            this.LJIIIZ(i, i2, z, j, c05xl, c05xl2);
                            return;
                        }
                    }
                }
                if (!c05xl.isCompleted()) {
                    c05xl.LJIIZILJ(new C443120HZe<>(bitmap, Long.valueOf(System.currentTimeMillis() - j), Boolean.FALSE));
                }
            }
        };
        if (str != null) {
            c2254411DLr.LJIILIIL = EnumC578800Mn0.TEXTURE;
            c2254411DLr.LJIILL = str;
            C373801cm.LIZ(str, c099fLIZIZ);
        }
        LIZLLL().u92().LIZIZ().LJIIJJI(c578870Mn7.LIZ);
    }
}
