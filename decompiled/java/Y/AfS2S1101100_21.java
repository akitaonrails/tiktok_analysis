package Y;

import X.AbstractC1368180lhw;
import X.C09JN;
import X.C1C7U;
import X.InterfaceC1368140lhs;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class AfS2S1101100_21 implements C09JN {
    public final int $t;
    public int i2;
    public long j3;
    public Object l1;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS2S1101100_21 afS2S1101100_21, Object obj) {
        C1C7U.LIZ("SupportSearchRelationModel@b348.doRealSearchWithSDKV2$1");
        List<IMContact> list = (List) obj;
        double dNanoTime = (System.nanoTime() - afS2S1101100_21.j3) / 1000000.0d;
        InterfaceC1368140lhs interfaceC1368140lhs = ((AbstractC1368180lhw) afS2S1101100_21.l1).LLJIJIL;
        if (interfaceC1368140lhs != null) {
            interfaceC1368140lhs.bK(list, afS2S1101100_21.s0, Integer.valueOf(afS2S1101100_21.i2), Double.valueOf(dNanoTime), Double.valueOf(0.0d));
        }
        C1C7U.LIZIZ("SupportSearchRelationModel@b348.doRealSearchWithSDKV2$1");
    }

    public static final void accept$1(AfS2S1101100_21 afS2S1101100_21, Object obj) {
        C1C7U.LIZ("SupportSearchRelationModel@b348.doRealSearchWithSDKV2$4");
        Collection collection = (Collection) obj;
        double dNanoTime = (System.nanoTime() - afS2S1101100_21.j3) / 1000000.0d;
        InterfaceC1368140lhs interfaceC1368140lhs = ((AbstractC1368180lhw) afS2S1101100_21.l1).LLJIJIL;
        if (interfaceC1368140lhs != null) {
            interfaceC1368140lhs.bK(new ArrayList(collection), afS2S1101100_21.s0, Integer.valueOf(afS2S1101100_21.i2), Double.valueOf(dNanoTime), Double.valueOf(0.0d));
        }
        C1C7U.LIZIZ("SupportSearchRelationModel@b348.doRealSearchWithSDKV2$4");
    }

    public AfS2S1101100_21(long j, AbstractC1368180lhw abstractC1368180lhw, String str, int i, int i2) {
        this.$t = i2;
        this.j3 = j;
        this.l1 = abstractC1368180lhw;
        this.s0 = str;
        this.i2 = i;
    }
}
