package X;

import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.lynx.tasm.LynxView;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: renamed from: X.0pkf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1523630pkf extends AbstractC1542200qEc {
    public final Uri LLILLJJLI;
    public final String LLILLL;
    public final SparkContext LLILZ;
    public boolean LLILZIL;
    public final C1554520qYU LLILZLL = new C1554520qYU(this, 3);
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS567S0100000_23(this, 85));

    public final void LJLLLL(Object obj) {
        if (this.LLILZIL) {
            return;
        }
        this.LLILZIL = true;
        C1523590pkb c1523590pkb = C1523590pkb.LIZ;
        Uri uri = this.LLILLJJLI;
        c1523590pkb.getClass();
        Map mapLIZ = C1523590pkb.LIZ(false, uri);
        if (mapLIZ != null) {
            this.LLILZ.LJJLIIIJILLIZJL(C2097908Jt.LIZJ(new Pair("ec_lynx_perf_data", mapLIZ)));
        }
        if (obj instanceof LynxView) {
            ((LynxView) obj).addLynxViewClient(new C1554360qYE(this, 0));
        }
    }

    public C1523630pkf(Uri uri, String str, SparkContext sparkContext) {
        this.LLILLJJLI = uri;
        this.LLILLL = str;
        this.LLILZ = sparkContext;
    }
}
