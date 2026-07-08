package Y;

import X.C1290450jgZ;
import X.C1290500jge;
import X.C1290610jgp;
import X.C1290850jhD;
import X.C1290900jhI;
import X.C1290940jhM;
import X.C1291320jhy;
import X.C1291600jiQ;
import X.C1292910jkX;
import X.C1294030jmL;
import X.C1295960jpS;
import X.C1C7U;
import X.C259800zU;
import X.InterfaceC1290070jfx;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.JsonReader;
import com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;
import z76.g$c;

/* JADX INFO: loaded from: classes21.dex */
public class ACallableS68S1100000_20 implements Callable {
    public final int $t;
    public Object l1;
    public String s0;

    public static final Object call$0(ACallableS68S1100000_20 aCallableS68S1100000_20) {
        return ((C1295960jpS) aCallableS68S1100000_20.l1).lambda$fromAssets$2(aCallableS68S1100000_20.s0);
    }

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
            default:
                return null;
        }
    }

    public static final Object call$1(ACallableS68S1100000_20 aCallableS68S1100000_20) {
        C1C7U.LIZ("LottieCompositionFactory@fe8.fromAsset$1");
        C1290500jge<C1291600jiQ> c1290500jgeLIZJ = C1290610jgp.LIZJ((Context) aCallableS68S1100000_20.l1, aCallableS68S1100000_20.s0);
        C1C7U.LIZIZ("LottieCompositionFactory@fe8.fromAsset$1");
        return c1290500jgeLIZJ;
    }

    public static final Object call$2(ACallableS68S1100000_20 aCallableS68S1100000_20) {
        C1290500jge c1290500jge;
        C1C7U.LIZ("LottieCompositionFactory@fe8.fromJsonReader$1");
        JsonReader jsonReader = (JsonReader) aCallableS68S1100000_20.l1;
        String str = aCallableS68S1100000_20.s0;
        try {
            C1291600jiQ c1291600jiQLIZ = C1292910jkX.LIZ(jsonReader);
            C1291320jhy.LIZIZ.LIZIZ(c1291600jiQLIZ, str);
            c1290500jge = new C1290500jge(c1291600jiQLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c1290500jge = new C1290500jge((Throwable) e);
        }
        C1C7U.LIZIZ("LottieCompositionFactory@fe8.fromJsonReader$1");
        return c1290500jge;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$3(Y.ACallableS68S1100000_20 r7) {
        /*
            java.lang.Object r3 = r7.l1
            com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView r3 = (com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView) r3
            java.lang.String r4 = r7.s0
            java.lang.String r7 = "LynxBytedLottieView@7d8e.asyncLoadLottie$1L"
            X.C1C7U.LIZ(r7)
            r3.getClass()
            java.lang.String r0 = "./"
            r1 = 0
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r4, r0, r1)
            if (r0 == 0) goto Lbf
            j27.s r0 = r3.mContext
            java.lang.String r5 = X.C1294030jmL.LIZ(r0, r4, r1)
        L1d:
            java.lang.String r0 = r3.LLJI
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
            if (r0 != 0) goto Lae
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "start load lottie: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "byted-lottie"
            com.lynx.base.log.LynxLog.i(r0, r1)
            r3.LLJI = r5
            X.0jhM r0 = r3.LLJJIJIL
            if (r5 == 0) goto Lbb
            java.util.HashMap<java.lang.String, java.lang.Long> r2 = r0.LIZIZ
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r5, r0)
        L4d:
            X.0jgI r0 = new X.0jgI
            java.lang.String r5 = r3.LLJI
            r0.<init>(r3, r5)
            r3.LLJLILLLLZIIL = r0
            T extends android.view.View r2 = r3.mView
            boolean r1 = r2 instanceof X.C1290900jhI
            r0 = 0
            if (r1 == 0) goto L64
            X.0jhI r2 = (X.C1290900jhI) r2
            if (r2 == 0) goto L64
            r2.setSrcUrl(r5)
        L64:
            X.07xp<X.0jgB> r5 = r3.LLJJIII
            if (r5 == 0) goto Lab
            java.lang.String r6 = r3.LLJI
            if (r6 == 0) goto Lab
            r3.LLJIJIL = r0
            com.lynx.react.bridge.JavaOnlyMap r1 = r3.getProps()
            java.lang.String r0 = "only-local"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r3.LLJJLIIIJLLLLLLLZ = r0
            if (r0 == 0) goto Lb9
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r6)
            android.net.Uri$Builder r2 = r0.buildUpon()
            java.lang.String r1 = "onlyLocal"
            java.lang.String r0 = "1"
            android.net.Uri$Builder r0 = r2.appendQueryParameter(r1, r0)
            android.net.Uri r0 = r0.build()
            java.lang.String r2 = r0.toString()
        L9a:
            X.0jgG r1 = new X.0jgG
            r1.<init>(r3, r6)
            X.0jfM r0 = new X.0jfM
            r0.<init>(r3, r4)
            r5.LIZ(r2, r1, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto Lae
        Lab:
            r3.LJJIJL(r4)
        Lae:
            X.0jge r1 = new X.0jge
            java.lang.String r0 = ""
            r1.<init>(r0)
            X.C1C7U.LIZIZ(r7)
            return r1
        Lb9:
            r2 = r6
            goto L9a
        Lbb:
            r0.getClass()
            goto L4d
        Lbf:
            r5 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS68S1100000_20.call$3(Y.ACallableS68S1100000_20):java.lang.Object");
    }

    public static final Object call$4(ACallableS68S1100000_20 aCallableS68S1100000_20) {
        final LynxAlphaVideo lynxAlphaVideo = (LynxAlphaVideo) aCallableS68S1100000_20.l1;
        final String str = aCallableS68S1100000_20.s0;
        int i = LynxAlphaVideo.LLJJIJI;
        C1C7U.LIZ("LynxAlphaVideo@e3ce.setLastFrame$1L");
        final C259800zU c259800zU = new C259800zU();
        lynxAlphaVideo.LJJIJL(str, new InterfaceC1290070jfx() { // from class: X.0jfr
            @Override // X.InterfaceC1290070jfx
            public final void onFailed() throws JSONException {
                DataSource dataSource = lynxAlphaVideo.LLILLL;
                if (dataSource != null) {
                    dataSource.setAutoRelease(true);
                }
                LynxAlphaVideo lynxAlphaVideo2 = lynxAlphaVideo;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("set video lastFrame failed, lastFrame is ");
                sbLIZ.append(str);
                lynxAlphaVideo2.LJJIJIIJIL(-16, C2188811AlT.LIZIZ(sbLIZ), lynxAlphaVideo.LLJI);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1290070jfx
            public final void LIZ(Bitmap bitmap) {
                if (bitmap != 0) {
                    c259800zU.element = bitmap;
                }
            }
        });
        C1290450jgZ c1290450jgZ = new C1290450jgZ(c259800zU.element);
        C1C7U.LIZIZ("LynxAlphaVideo@e3ce.setLastFrame$1L");
        return c1290450jgZ;
    }

    public static final Object call$5(ACallableS68S1100000_20 aCallableS68S1100000_20) {
        final LynxAlphaVideo lynxAlphaVideo = (LynxAlphaVideo) aCallableS68S1100000_20.l1;
        final String str = aCallableS68S1100000_20.s0;
        int i = LynxAlphaVideo.LLJJIJI;
        C1C7U.LIZ("LynxAlphaVideo@e3ce.setPoster$1L");
        final C259800zU c259800zU = new C259800zU();
        lynxAlphaVideo.LJJIJL(str, new InterfaceC1290070jfx() { // from class: X.0jfq
            @Override // X.InterfaceC1290070jfx
            public final void onFailed() throws JSONException {
                LynxAlphaVideo lynxAlphaVideo2 = lynxAlphaVideo;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("set video poster failed, poster is ");
                sbLIZ.append(str);
                lynxAlphaVideo2.LJJIJIIJIL(-15, C2188811AlT.LIZIZ(sbLIZ), lynxAlphaVideo.LLJI);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1290070jfx
            public final void LIZ(Bitmap bitmap) {
                if (bitmap != 0) {
                    c259800zU.element = bitmap;
                }
            }
        });
        C1290450jgZ c1290450jgZ = new C1290450jgZ(c259800zU.element);
        C1C7U.LIZIZ("LynxAlphaVideo@e3ce.setPoster$1L");
        return c1290450jgZ;
    }

    public static final Object call$6(ACallableS68S1100000_20 aCallableS68S1100000_20) {
        String strLIZ;
        C1290900jhI c1290900jhI;
        C1290850jhD c1290850jhD = (C1290850jhD) aCallableS68S1100000_20.l1;
        String str = aCallableS68S1100000_20.s0;
        C1C7U.LIZ("SDUIBytedLottieView@4d0c.asyncLoadLottie$1L");
        c1290850jhD.getClass();
        if (u.LJJIIJZLJL(str, "./", false)) {
            strLIZ = C1294030jmL.LIZ(c1290850jhD.LLILZ, str, false);
        } else {
            strLIZ = str;
        }
        if (!Intrinsics.LJFF(c1290850jhD.LLLLZLL, strLIZ)) {
            Intrinsics.LJIIJJI(strLIZ, "start load lottie: ");
            c1290850jhD.LLLLZLL = strLIZ;
            C1290940jhM c1290940jhM = c1290850jhD.LLLZLL;
            if (strLIZ != null) {
                c1290940jhM.LIZIZ.put(strLIZ, Long.valueOf(System.currentTimeMillis()));
            } else {
                c1290940jhM.getClass();
            }
            String str2 = c1290850jhD.LLLLZLL;
            c1290850jhD.LLZLI = new g$c(c1290850jhD, str2);
            T t = c1290850jhD.LLLLLILLIL;
            if ((t instanceof C1290900jhI) && (c1290900jhI = (C1290900jhI) t) != null) {
                c1290900jhI.setSrcUrl(str2);
            }
            c1290850jhD.LJLLLL(str);
        }
        C1290500jge c1290500jge = new C1290500jge("");
        C1C7U.LIZIZ("SDUIBytedLottieView@4d0c.asyncLoadLottie$1L");
        return c1290500jge;
    }

    public ACallableS68S1100000_20(JsonReader jsonReader, int i) {
        this.$t = i;
        this.l1 = jsonReader;
        this.s0 = null;
    }

    public ACallableS68S1100000_20(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
