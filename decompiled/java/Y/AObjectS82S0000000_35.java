package Y;

import X.C1452420nto;
import X.C14LJ;
import X.C1ETL;
import X.C2268951DrR;
import X.C357530Dzz;
import X.C366380EYa;
import com.bytedance.ies.cutsame.cut_android.NLETemplateSource;
import com.bytedance.ies.nle.editor_jni.NLEModelDownloader;
import com.bytedance.ies.nle.editor_jni.NLEModelDownloaderParams;
import com.ss.android.ugc.aweme.shortvideo.ui.component.b1;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes36.dex */
public class AObjectS82S0000000_35 implements Function0 {
    public final int $t;

    public static final Object invoke$0(AObjectS82S0000000_35 aObjectS82S0000000_35) {
        return Boolean.valueOf(b1.lf(C1452420nto.LIZ));
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            default:
                return null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AObjectS82S0000000_35(int r2) {
        /*
            r1 = this;
            r1.$t = r2
            if (r2 == 0) goto L9
            r0 = r1
        L5:
            r0.<init>()
            return
        L9:
            r0 = r1
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS82S0000000_35.<init>(int):void");
    }

    public static final Object invoke$1(AObjectS82S0000000_35 aObjectS82S0000000_35) {
        return C1ETL.LJ();
    }

    public static final Object invoke$2(AObjectS82S0000000_35 aObjectS82S0000000_35) {
        return C1ETL.LIZIZ();
    }

    public static final Object invoke$3(AObjectS82S0000000_35 aObjectS82S0000000_35) {
        return C1ETL.LJFF();
    }

    public static final Object invoke$4(AObjectS82S0000000_35 aObjectS82S0000000_35) {
        return C1ETL.LIZJ();
    }

    public static final Object invoke$5(AObjectS82S0000000_35 aObjectS82S0000000_35) {
        C357530Dzz c357530Dzz = C366380EYa.LIZ;
        if (c357530Dzz == null) {
            c357530Dzz = null;
        }
        C2268951DrR c2268951DrRLIZLLL = c357530Dzz.LJ.LIZLLL();
        NLEModelDownloaderParams nLEModelDownloaderParams = new NLEModelDownloaderParams(c2268951DrRLIZLLL.LIZ, c2268951DrRLIZLLL.LIZIZ, c2268951DrRLIZLLL.LIZJ, c2268951DrRLIZLLL.LIZLLL, c2268951DrRLIZLLL.LJ, c2268951DrRLIZLLL.LJFF, c2268951DrRLIZLLL.LJI, c2268951DrRLIZLLL.LJII, c2268951DrRLIZLLL.LJIIIIZZ, c2268951DrRLIZLLL.LJIIJ, c2268951DrRLIZLLL.LJIIJJI, c2268951DrRLIZLLL.LJIIL, "", "", "", "");
        nLEModelDownloaderParams.setChannel(c2268951DrRLIZLLL.LJIIIZ);
        NLEModelDownloader nLEModelDownloader = new NLEModelDownloader();
        NLETemplateSource.LJIIIIZZ.initNLEModelDownloader(C14LJ.LIZLLL(nLEModelDownloader), C14LJ.LIZLLL(nLEModelDownloaderParams));
        return nLEModelDownloader;
    }
}
