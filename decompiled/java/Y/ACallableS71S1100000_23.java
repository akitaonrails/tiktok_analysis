package Y;

import X.C1527670prB;
import X.C1C7U;
import X.C2400409as;
import android.content.Context;
import android.net.Uri;
import android.webkit.URLUtil;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes24.dex */
public class ACallableS71S1100000_23 implements Callable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS71S1100000_23 aCallableS71S1100000_23) {
        C1527670prB c1527670prB = (C1527670prB) aCallableS71S1100000_23.l1;
        String str = aCallableS71S1100000_23.s0;
        C1C7U.LIZ("DBServiceImplV4$deleteLocalData$1@dee2.invoke$1L");
        c1527670prB.LJLILLLLZI().LJFF(str);
        c1527670prB.LJLILLLLZI().LJII(str);
        c1527670prB.LJJZ().LJIIIIZZ(str);
        Boolean bool = Boolean.TRUE;
        C1C7U.LIZIZ("DBServiceImplV4$deleteLocalData$1@dee2.invoke$1L");
        return bool;
    }

    public static final Object call$1(ACallableS71S1100000_23 aCallableS71S1100000_23) {
        int iLLJILLL;
        Context context = (Context) aCallableS71S1100000_23.l1;
        String str = aCallableS71S1100000_23.s0;
        C1C7U.LIZ("SSWebSettings@8c2a.processSaveImage$1$saveImage$1L");
        boolean z = false;
        if (context != null) {
            try {
                String strGuessFileName = URLUtil.guessFileName(str, null, "image/jpeg");
                Uri uriLIZ = C2400409as.LIZ(context, strGuessFileName);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new HttpHeader("x-tt-pns-dt-pass-id", String.valueOf(268959746)));
                ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi(ISparkHostApi.class);
                if (iSparkHostApi != null) {
                    iLLJILLL = iSparkHostApi.LLJILLL(str, strGuessFileName, uriLIZ.toString(), arrayList);
                } else {
                    iLLJILLL = 0;
                }
                if (iLLJILLL != 0) {
                    z = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("SSWebSettings@8c2a.processSaveImage$1$saveImage$1L");
        return boolValueOf;
    }

    public ACallableS71S1100000_23(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
