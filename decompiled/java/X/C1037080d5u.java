package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.context.PreWarmAdSparkHybridContext;
import com.ss.android.ugc.aweme.web.experiment.AdSparkWebViewLoadNewConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0d5u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1037080d5u extends AbstractC1037060d5s {
    public final String LIZ;
    public final C0CFU LIZIZ;
    public final Function1<String, Unit> LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public PreWarmAdSparkHybridContext LJFF;
    public final C1042540dEi LJI;
    public final C01GW LJII;

    @Override // X.AbstractC1037060d5s
    public final List<InterfaceC1037120d5y> LIZJ() {
        return (List) this.LJII.getValue();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IABWebviewTask(");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", status=");
        sbLIZ.append(LIZ(new C1037110d5x()));
        sbLIZ.append(" sparkContext=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isThirdWeb=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1037120d5y
    public final String getTag() {
        return this.LJ;
    }

    @Override // X.AbstractC1037060d5s, X.InterfaceC1037120d5y
    public final C0CFU getType() {
        return this.LIZIZ;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0dEi] */
    public C1037080d5u(String str, C0CFU c0cfu, AFwS252S0000000_16 aFwS252S0000000_16) {
        boolean z;
        String str2;
        this.LIZ = str;
        this.LIZIZ = c0cfu;
        this.LIZJ = aFwS252S0000000_16;
        if (c0cfu == C0CFU.THIRD) {
            z = true;
        } else {
            z = false;
        }
        this.LIZLLL = z;
        if (z) {
            str2 = "IABPreWarm_webview_3p";
        } else {
            str2 = "IABPreWarm_webview_1p";
        }
        this.LJ = str2;
        this.LJI = new InterfaceC1037120d5y() { // from class: X.0dEi
            public final String LIZ;
            public final C0CFU LIZIZ;

            @Override // X.InterfaceC1037120d5y
            public final String getTag() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1037120d5y
            public final C0CFU getType() {
                return this.LIZIZ;
            }

            {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZJ.LJ);
                sbLIZ.append("_webview");
                this.LIZ = C2188811AlT.LIZIZ(sbLIZ);
                this.LIZIZ = this.LIZJ.LIZIZ;
            }

            /* JADX WARN: Code restructure failed: missing block: B:101:0x0184, code lost:
            
                if (X.C1037010d5n.LJIIJJI != false) goto L92;
             */
            /* JADX WARN: Code restructure failed: missing block: B:91:0x015d, code lost:
            
                if (X.C1037010d5n.LJIIJJI != false) goto L92;
             */
            /* JADX WARN: Removed duplicated region for block: B:81:0x012f  */
            @Override // X.InterfaceC1037120d5y
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.EnumC1002230cBh LIZ(X.C1037110d5x r10) {
                /*
                    Method dump skipped, instruction units count: 391
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1042540dEi.LIZ(X.0d5x):X.0cBh");
            }

            @Override // X.InterfaceC1037120d5y
            public final String LIZIZ(C1037110d5x c1037110d5x) {
                EnumC1042550dEj enumC1042550dEj;
                C1037080d5u c1037080d5u = this.LIZJ;
                c1037080d5u.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("aweme://webview/?url=");
                sbLIZ.append(Uri.encode("about:blank"));
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C1037700d6u.LIZ.getClass();
                String strLIZ = C1037700d6u.LIZ(strLIZIZ);
                if (c1037080d5u.LIZLLL) {
                    enumC1042550dEj = EnumC1042550dEj.PURE;
                } else {
                    enumC1042550dEj = EnumC1042550dEj.DEFAULT;
                }
                PreWarmAdSparkHybridContext preWarmAdSparkHybridContext = new PreWarmAdSparkHybridContext();
                preWarmAdSparkHybridContext.bid = "tt_hybrid_commerce";
                preWarmAdSparkHybridContext.LJJLIIJ(strLIZ);
                Uri uriLJ = C1537540q76.LJ(preWarmAdSparkHybridContext.LJIJI());
                String host = uriLJ.getHost();
                if (host != null && a0.LJJIIZI(host, "webview", false) && Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJ, "url"), "about:blank")) {
                    preWarmAdSparkHybridContext.forceHybridRuntimeTypeInBlankPage = enumC1042550dEj;
                }
                preWarmAdSparkHybridContext.LJJJZ("spark_perf_biz", c1037080d5u.LIZ);
                C1042360dEQ c1042360dEQ = new C1042360dEQ(preWarmAdSparkHybridContext, EnumC1042380dES.PRE_WARM);
                preWarmAdSparkHybridContext.LJJLJLI(new AwS595S0100000_16(c1042360dEQ, 305));
                preWarmAdSparkHybridContext.LJJ(AbstractC1539010q9T.class, c1042360dEQ);
                preWarmAdSparkHybridContext.LJJJJZI(new C1077540e9A(c1037080d5u, 1));
                if (((Boolean) AdSparkWebViewLoadNewConfig.LIZLLL.getValue()).booleanValue()) {
                    C1043000dFS c1043000dFS = new C1043000dFS();
                    preWarmAdSparkHybridContext.LJJLIIIIJ(c1043000dFS);
                    preWarmAdSparkHybridContext.LJJ(C1043000dFS.class, c1043000dFS);
                }
                C21395718oF c21395718oF = new C21395718oF();
                preWarmAdSparkHybridContext.LJJLIIIJLJLI(c21395718oF);
                preWarmAdSparkHybridContext.LJJ(C21395718oF.class, c21395718oF);
                c1037080d5u.LJFF = preWarmAdSparkHybridContext;
                C1537060q6K.LJIIJJI(C1529590puH.LIZ, strLIZ, c1037080d5u.LIZ, preWarmAdSparkHybridContext, null, true, null, 40);
                return this.LIZ;
            }
        };
        this.LJII = C452501pT.LIZIZ(new AwS560S0100000_16(this, 64));
    }
}
