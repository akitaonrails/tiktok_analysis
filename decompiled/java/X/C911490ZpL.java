package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService;
import java.util.UUID;

/* JADX INFO: renamed from: X.0ZpL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C911490ZpL {
    public static final C911490ZpL LIZ = new C911490ZpL();

    public static void LIZ(String str) {
        C0YS1.LIZJ("AIGroupShotSenderV2", str);
    }

    public static void LIZIZ(AbstractC912050ZqF abstractC912050ZqF, String str, boolean z, boolean z2, String str2, String str3) {
        long jLongValue;
        if (abstractC912050ZqF instanceof C912040ZqE) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onProcessFailed for creation. uuid=");
            sbLIZ.append(str2);
            sbLIZ.append(". inserting fake message.");
            LIZ(C2188811AlT.LIZIZ(sbLIZ));
            C911420ZpE.LIZ(str2, str);
        } else if (abstractC912050ZqF instanceof C912030ZqD) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onProcessFailed for join. uuid=");
            sbLIZ2.append(str2);
            LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            C911450ZpH c911450ZpH = C911450ZpH.LIZ;
            Long lLJIILIIL = C2095008Iq.LJIILIIL(str2);
            if (lLJIILIIL != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            c911450ZpH.getClass();
            C911450ZpH.LIZ(jLongValue);
        } else {
            throw new C1954807lC();
        }
        FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) ServiceManager.get().getService(FakeMsgOperatorService.class);
        C1684506ih c1684506ih = new C1684506ih();
        c1684506ih.LIZJ = UUID.randomUUID().toString();
        c1684506ih.LIZLLL(17);
        C0I0B.LJFF.LIZJ();
        c1684506ih.LIZJ(C894660Z7w.LIZ());
        c1684506ih.LJFF = new C900330ZTr(z, str3);
        fakeMsgOperatorService.LIZIZ(str, c1684506ih, null, null, null);
    }
}
