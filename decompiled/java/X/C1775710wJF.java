package X;

import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.lynx.tasm.LynxViewClient;
import com.ss.android.ugc.aweme.ecommerce.base.bundlepanel.BundlePanelContentAssem;
import com.ss.android.ugc.aweme.ecommerce.base.review.lynx.ReviewLynxAssem;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: renamed from: X.0wJF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1775710wJF extends LynxViewClient {
    public final int $t;
    public Object l0;

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIJ() {
        switch (this.$t) {
            case 1:
                LJIIJ$0(this);
                break;
            case 2:
                LJIIJ$1(this);
                break;
            default:
                super.LJIIJ();
                break;
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILJJIL() {
        switch (this.$t) {
            case 1:
                LJIILJJIL$0(this);
                break;
            case 2:
                LJIILJJIL$1(this);
                break;
            default:
                super.LJIILJJIL();
                break;
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIIZ(String str, Map map, Map map2) {
        if (this.$t != 0) {
            super.LJJIIZ(str, map, map2);
        } else {
            LJJIIZ$0(this, str, map, map2);
        }
    }

    public static final void LJIIJ$0(C1775710wJF c1775710wJF) {
        C1326490kch c1326490kch = C1326490kch.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((BundlePanelContentAssem) c1775710wJF.l0).LLIZLLLIL);
        sbLIZ.append(":lynx data is loaded to container");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1326490kch.getClass();
        C1326490kch.LIZ(strLIZIZ);
        ((BundlePanelContentAssem) c1775710wJF.l0).Go().setState(AFwS268S0000000_26.get$arr$(504));
    }

    public static final void LJIIJ$1(C1775710wJF c1775710wJF) {
        ((ReviewLynxAssem) c1775710wJF.l0).Jo().setState(AFwS268S0000000_26.get$arr$(715));
    }

    public static final void LJIILJJIL$0(C1775710wJF c1775710wJF) {
        C1326490kch c1326490kch = C1326490kch.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((BundlePanelContentAssem) c1775710wJF.l0).LLIZLLLIL);
        sbLIZ.append(":container load success");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1326490kch.getClass();
        C1326490kch.LIZ(strLIZIZ);
        ((BundlePanelContentAssem) c1775710wJF.l0).Go();
    }

    public static final void LJIILJJIL$1(C1775710wJF c1775710wJF) {
        ReviewLynxAssem reviewLynxAssem;
        C1755980vnQ c1755980vnQHo;
        C1747980vaW c1747980vaW = new C1747980vaW();
        c1747980vaW.LJIIIIZZ(new AwS605S0100000_26((ReviewLynxAssem) c1775710wJF.l0, StrategyCenter.ENABLE_SMART_SERVICE));
        c1747980vaW.LIZJ(false);
        ((ReviewLynxAssem) c1775710wJF.l0).Jo().LLJ = true;
        C1766490w4N c1766490w4N = ((ReviewLynxAssem) c1775710wJF.l0).Jo().LLJILJIL;
        if (c1766490w4N != null && (c1755980vnQHo = (reviewLynxAssem = (ReviewLynxAssem) c1775710wJF.l0).Ho()) != null) {
            c1755980vnQHo.LIZJ(reviewLynxAssem.Go(c1766490w4N, false));
        }
    }

    public C1775710wJF(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJIIZ$0(C1775710wJF c1775710wJF, String str, Map map, Map map2) {
        SparkActivity sparkActivity = ((C1211320hcw) c1775710wJF.l0).LLILLJJLI;
        if (sparkActivity != null && (!((HashMap) map2).isEmpty())) {
            C948503nH.LJ(sparkActivity, C23271099x.INSTANCE, new C1315605Cw(sparkActivity, null));
        }
    }
}
