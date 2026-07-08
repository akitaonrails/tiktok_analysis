package Y;

import X.C1402840mbq;
import X.C1B45;
import X.C20684815ws;
import X.C2220181Buy;
import X.C2220221Bv2;
import X.C2220331BvD;
import X.C2220391BvJ;
import X.C2344009Gk;
import android.app.Activity;
import com.bytedance.creationmodel.framework.CommonModelReadWriterInternal;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.openshare.IShareRespSendService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes35.dex */
public class AObjectS320S0200000_34 implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS320S0200000_34 aObjectS320S0200000_34, Object obj) {
        C2220391BvJ c2220391BvJ = (C2220391BvJ) aObjectS320S0200000_34.l0;
        c2220391BvJ.LIZIZ.LJJIII((Integer) aObjectS320S0200000_34.l1, ((C2220221Bv2) obj).LIZIZ());
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS320S0200000_34 aObjectS320S0200000_34, Object obj) {
        C2220181Buy c2220181BuyLJII;
        C2220331BvD c2220331BvD = (C2220331BvD) aObjectS320S0200000_34.l0;
        Integer num = (Integer) aObjectS320S0200000_34.l1;
        C2220221Bv2 c2220221Bv2 = (C2220221Bv2) obj;
        if (c2220221Bv2 != null) {
            c2220331BvD.getClass();
            c2220181BuyLJII = C2220331BvD.LJII(c2220221Bv2, true);
        } else {
            c2220181BuyLJII = C2220181Buy.LJFF;
        }
        c2220331BvD.LIZ.LIZIZ.LJJIII(num, c2220181BuyLJII);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS320S0200000_34 aObjectS320S0200000_34, Object obj) {
        C2220331BvD c2220331BvD = (C2220331BvD) aObjectS320S0200000_34.l0;
        c2220331BvD.LIZ.LIZIZ.LJJIII((Integer) aObjectS320S0200000_34.l1, ((C2220221Bv2) obj).LIZIZ());
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS320S0200000_34 aObjectS320S0200000_34, Object obj) {
        C2220331BvD c2220331BvD = (C2220331BvD) aObjectS320S0200000_34.l0;
        c2220331BvD.LIZ.LIZIZ.LJJIII((Integer) aObjectS320S0200000_34.l1, ((C2220221Bv2) obj).LIZIZ());
        return Unit.LIZ;
    }

    public static final Object invoke$4(AObjectS320S0200000_34 aObjectS320S0200000_34, Object obj) {
        C2220331BvD c2220331BvD = (C2220331BvD) aObjectS320S0200000_34.l0;
        c2220331BvD.LIZ.LIZIZ.LJJIII((Integer) aObjectS320S0200000_34.l1, ((C2220221Bv2) obj).LIZ());
        return Unit.LIZ;
    }

    public static final Object invoke$5(AObjectS320S0200000_34 aObjectS320S0200000_34, Object obj) {
        Activity activity = (Activity) aObjectS320S0200000_34.l0;
        C1402840mbq c1402840mbq = (C1402840mbq) aObjectS320S0200000_34.l1;
        ((IShareRespSendService) ServiceManager.get().getService(IShareRespSendService.class)).LIZLLL(activity, C1B45.LIZLLL);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("channel", c1402840mbq.mClientKey);
        c2344009Gk.LJIIIIZZ("launch_method", "share_to_dm");
        c2344009Gk.LJIIIIZZ("sdk_name", c1402840mbq.getSdkNameForServer());
        c2344009Gk.LJIIIIZZ("sdk_version", c1402840mbq.mSdkVersion);
        C20684815ws.LJIILLIIL("return_to_origin_app", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object invoke$6(AObjectS320S0200000_34 aObjectS320S0200000_34, Object obj) {
        CommonModelReadWriterInternal commonModelReadWriterInternal = (CommonModelReadWriterInternal) aObjectS320S0200000_34.l0;
        commonModelReadWriterInternal.LJI.invoke((T) ((Function2) aObjectS320S0200000_34.l1).invoke(commonModelReadWriterInternal.LJFF.invoke(), obj));
        return Unit.LIZ;
    }

    public AObjectS320S0200000_34(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
