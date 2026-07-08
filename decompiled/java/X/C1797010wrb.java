package X;

import com.bytedance.android.live.wallet.model.CheckSubOrderResultStruct;
import com.bytedance.android.live.wallet.model.CreateSubOrderResult;
import com.bytedance.android.livesdk.wallet.Diamond;
import java.util.List;

/* JADX INFO: renamed from: X.0wrb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1797010wrb {
    public final int LIZ;
    public final List<? extends Diamond> LIZIZ;
    public final C1796560wqs LIZJ;
    public final C1796880wrO LIZLLL;
    public final C1796490wql LJ;
    public final C1796560wqs LJFF;
    public final CheckSubOrderResultStruct LJI;
    public final CreateSubOrderResult LJII;
    public final boolean LJIIIIZZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1797010wrb(int i, List list, C1796560wqs c1796560wqs, C1796880wrO c1796880wrO, C1796490wql c1796490wql, C1796560wqs c1796560wqs2, int i2) {
        CheckSubOrderResultStruct checkSubOrderResultStruct;
        C1796560wqs c1796560wqs3 = c1796560wqs2;
        C1796490wql c1796490wql2 = c1796490wql;
        C1796560wqs c1796560wqs4 = c1796560wqs;
        C1796880wrO c1796880wrO2 = c1796880wrO;
        List list2 = (i2 & 2) != 0 ? C13BV.INSTANCE : list;
        c1796560wqs4 = (i2 & 4) != 0 ? new C1796560wqs(0, null, null, null, false, 31) : c1796560wqs4;
        CreateSubOrderResult createSubOrderResult = null;
        c1796880wrO2 = (i2 & 8) != 0 ? new C1796880wrO(null, null, 0) : c1796880wrO2;
        c1796490wql2 = (i2 & 16) != 0 ? new C1796490wql(null, null) : c1796490wql2;
        if ((i2 & 32) != 0) {
            createSubOrderResult = null;
            c1796560wqs3 = new C1796560wqs(0, null, null, null, false, 31);
        }
        if ((i2 & 64) != 0) {
            checkSubOrderResultStruct = new CheckSubOrderResultStruct();
        } else {
            checkSubOrderResultStruct = createSubOrderResult;
        }
        this(i, list2, c1796560wqs4, c1796880wrO2, c1796490wql2, c1796560wqs3, checkSubOrderResultStruct, (i2 & 128) != 0 ? new CreateSubOrderResult() : createSubOrderResult, false);
    }

    public C1797010wrb(int i, List<? extends Diamond> list, C1796560wqs c1796560wqs, C1796880wrO c1796880wrO, C1796490wql c1796490wql, C1796560wqs c1796560wqs2, CheckSubOrderResultStruct checkSubOrderResultStruct, CreateSubOrderResult createSubOrderResult, boolean z) {
        this.LIZ = i;
        this.LIZIZ = list;
        this.LIZJ = c1796560wqs;
        this.LIZLLL = c1796880wrO;
        this.LJ = c1796490wql;
        this.LJFF = c1796560wqs2;
        this.LJI = checkSubOrderResultStruct;
        this.LJII = createSubOrderResult;
        this.LJIIIIZZ = z;
    }
}
