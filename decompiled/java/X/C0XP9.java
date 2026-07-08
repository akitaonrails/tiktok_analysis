package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.account.idv.model.IDVDecisionConf;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XP9, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XP9 implements InterfaceC1141530foN {
    public final Context LL;
    public final C0XP6 LLILLJJLI;
    public final IDVDecisionConf LLILLL;
    public SparkContext LLILZ;

    public final void LIZ() {
        C1548820qPI.LIZLLL("idv_result_event", this);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("idv_extra:");
        sbLIZ.append(this.LLILLL.passportTicket);
        C1323720kYE.LIZ(this.LL).LJIIIIZZ(this.LLILLL.extra, C2188811AlT.LIZIZ(sbLIZ));
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(this.LLILLL.url);
        sparkContext.LJJJJZI(new AbstractC1542200qEc() { // from class: X.0XP7
            @Override // X.AbstractC1537870q7d
            public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
            }

            @Override // X.AbstractC1542100qES
            public final void LJLL(SparkContext sparkContext2) {
                this.LLILLJJLI.LLILLJJLI.LIZ();
            }
        });
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        Context context = this.LL;
        c1537900q7g.getClass();
        new C1541950qED(context, sparkContext).LIZIZ();
        this.LLILZ = sparkContext;
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String strLJFF;
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ;
        if (Intrinsics.LJFF(c262100zr.LIZ, "idv_result_event")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null) {
                strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "result", "");
            } else {
                strLJFF = null;
            }
            EnumC110300bN enumC110300bN = EnumC110300bN.SUCCESS;
            if (!Intrinsics.LJFF(strLJFF, enumC110300bN.getStatus())) {
                enumC110300bN = EnumC110300bN.FAIL;
            }
            this.LLILLJJLI.LIZIZ(enumC110300bN);
            SparkContext sparkContext = this.LLILZ;
            if (sparkContext != null && (interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ()) != null) {
                interfaceC1059280dfiLJJIJLIJ.close();
            }
        }
    }

    public C0XP9(Context context, C0XP6 c0xp6, IDVDecisionConf iDVDecisionConf) {
        this.LL = context;
        this.LLILLJJLI = c0xp6;
        this.LLILLL = iDVDecisionConf;
    }
}
