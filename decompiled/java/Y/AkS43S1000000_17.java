package Y;

import X.C1500860p9w;
import X.C1515210pX5;
import X.C20441214yg;
import X.InterfaceC1487280oo2;
import android.graphics.BitmapFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public class AkS43S1000000_17 implements InterfaceC1487280oo2 {
    public final int $t;
    public String s0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    public AkS43S1000000_17(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }

    public static final Object apply$0(AkS43S1000000_17 akS43S1000000_17, Object obj) {
        try {
            C1515210pX5 c1515210pX5LIZLLL = C1515210pX5.LIZLLL();
            String str = akS43S1000000_17.s0;
            ArrayList arrayList = new ArrayList();
            c1515210pX5LIZLLL.getClass();
            return BitmapFactory.decodeStream(new ByteArrayInputStream(((C1500860p9w) C1515210pX5.LIZ(str, arrayList)).LIZ().LJ));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJIIJ(6, "NinePatchUtil", e.getStackTrace());
            C20441214yg.LJ("NinePatchUtil", e.getMessage());
            return null;
        }
    }

    public static final Object apply$1(AkS43S1000000_17 akS43S1000000_17, Object obj) {
        try {
            C1515210pX5 c1515210pX5LIZLLL = C1515210pX5.LIZLLL();
            String str = akS43S1000000_17.s0;
            ArrayList arrayList = new ArrayList();
            c1515210pX5LIZLLL.getClass();
            return BitmapFactory.decodeStream(new ByteArrayInputStream(((C1500860p9w) C1515210pX5.LIZ(str, arrayList)).LIZ().LJ));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJIIJ(6, "NinePatchUtil", e.getStackTrace());
            C20441214yg.LJ("NinePatchUtil", e.getMessage());
            return null;
        }
    }
}
