package Y;

import X.C0VSJ;
import X.C1290450jgZ;
import X.C1292000jj4;
import X.C1294250jmh;
import X.C1294720jnS;
import X.C1C7U;
import X.C2111508Oz;
import X.C2188811AlT;
import android.content.Context;
import com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import java.io.File;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes21.dex */
public class ACallableS21S2100000_20 implements Callable {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0069 A[EXC_TOP_SPLITTER, PHI: r6
      0x0069: PHI (r6v1 X.0VSJ) = (r6v0 X.0VSJ), (r6v2 X.0VSJ) binds: [B:20:0x0052, B:22:0x0067] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v46, types: [X.0jj3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$0(Y.ACallableS21S2100000_20 r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS21S2100000_20.call$0(Y.ACallableS21S2100000_20):java.lang.Object");
    }

    public static final Object call$1(ACallableS21S2100000_20 aCallableS21S2100000_20) {
        Context context = (Context) aCallableS21S2100000_20.l2;
        String str = aCallableS21S2100000_20.s0;
        String str2 = aCallableS21S2100000_20.s1;
        C1C7U.LIZ("LottieCompositionFactory@f22f.fromAsset$1L");
        C1292000jj4<C1294720jnS> c1292000jj4LIZLLL = C1294250jmh.LIZLLL(context, str, str2);
        C1C7U.LIZIZ("LottieCompositionFactory@f22f.fromAsset$1L");
        return c1292000jj4LIZLLL;
    }

    public static final Object call$2(ACallableS21S2100000_20 aCallableS21S2100000_20) {
        C1290450jgZ c1290450jgZ;
        String strLIZIZ;
        String str = aCallableS21S2100000_20.s0;
        String str2 = aCallableS21S2100000_20.s1;
        LynxAlphaVideo lynxAlphaVideo = (LynxAlphaVideo) aCallableS21S2100000_20.l2;
        int i = LynxAlphaVideo.LLJJIJI;
        C1C7U.LIZ("LynxAlphaVideo@e3ce.resolveResAndTryPlay$1L");
        try {
            C0VSJ c0vsj = new C0VSJ(str);
            if (c0vsj.isDirectory()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("try to load resource which is already unzip, directUrl is ");
                sbLIZ.append(str2);
                LynxLog.i("x-alpha-video", C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(c0vsj.getAbsolutePath());
                sbLIZ2.append(File.separator);
                lynxAlphaVideo.LLILLL = lynxAlphaVideo.LJJIIZI(C2188811AlT.LIZIZ(sbLIZ2));
                c1290450jgZ = new C1290450jgZ("success");
            } else if (u.LJIIZILJ(str, ".zip", false)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("try to load .zip resource, directUrl is ");
                sbLIZ3.append(str2);
                LynxLog.i("x-alpha-video", C2188811AlT.LIZIZ(sbLIZ3));
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(lynxAlphaVideo.mContext.getCacheDir().getAbsolutePath());
                String str3 = File.separator;
                sbLIZ4.append(str3);
                sbLIZ4.append("x_alpha-video");
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
                C0VSJ c0vsj2 = new C0VSJ(strLIZIZ2);
                if (!c0vsj2.exists()) {
                    c0vsj2.mkdir();
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(strLIZIZ2);
                sbLIZ5.append(str3);
                sbLIZ5.append(LynxAlphaVideo.LJJIJ(str2));
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ5);
                try {
                    String strLIZ = C2111508Oz.LIZ(c0vsj, strLIZIZ3);
                    if (Intrinsics.LJFF(strLIZ, "")) {
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append(strLIZIZ3);
                        sbLIZ6.append(str3);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
                    } else {
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append(strLIZIZ3);
                        sbLIZ7.append(str3);
                        sbLIZ7.append(strLIZ);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ7);
                    }
                    lynxAlphaVideo.LLILLL = lynxAlphaVideo.LJJIIZI(strLIZIZ);
                    c1290450jgZ = new C1290450jgZ("success");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append("unzip resource failed, error msg is ");
                    sbLIZ8.append(e.getMessage());
                    c1290450jgZ = new C1290450jgZ(C2188811AlT.LIZIZ(sbLIZ8));
                }
            } else {
                c1290450jgZ = new C1290450jgZ("fail, resource type is not support");
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append("fail, error msg is ");
            sbLIZ9.append(e2);
            c1290450jgZ = new C1290450jgZ(C2188811AlT.LIZIZ(sbLIZ9));
        }
        C1C7U.LIZIZ("LynxAlphaVideo@e3ce.resolveResAndTryPlay$1L");
        return c1290450jgZ;
    }

    public ACallableS21S2100000_20(Object obj, String str, String str2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.s1 = str2;
    }
}
