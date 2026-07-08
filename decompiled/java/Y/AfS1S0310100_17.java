package Y;

import X.AbstractC1126560fQE;
import X.AbstractC1126600fQI;
import X.AbstractC1127100fR6;
import X.AnonymousClass0054;
import X.C013C;
import X.C09JN;
import X.C1126720fQU;
import X.C1126810fQd;
import X.C1127090fR5;
import X.C1127110fR7;
import X.C1127120fR8;
import X.C1127310fRR;
import X.C1324720kZq;
import X.C1954807lC;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1126580fQG;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.common.utility.Logger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public class AfS1S0310100_17 implements C09JN {
    public final int $t;
    public long j4;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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

    public static final void accept$0(AfS1S0310100_17 afS1S0310100_17, Object obj) {
        String message;
        InterfaceC1126580fQG interfaceC1126580fQG;
        Long lValueOf;
        InterfaceC1126580fQG interfaceC1126580fQG2;
        C1324720kZq c1324720kZq;
        C1C7U.LIZ("LiveGiftAbsViewHolderV2@b208.loadDynamicPreview$dynamicPreviewDisposable$1");
        AbstractC1127100fR6 abstractC1127100fR6 = (AbstractC1127100fR6) obj;
        if (Intrinsics.LJFF(abstractC1127100fR6, C1127110fR7.LIZ)) {
            C1126810fQd.LIZ.LIZ(afS1S0310100_17.j4);
        } else if (abstractC1127100fR6 instanceof C1127310fRR) {
            AbstractC1126560fQE abstractC1126560fQE = (AbstractC1126560fQE) afS1S0310100_17.l0;
            long j = afS1S0310100_17.j4;
            boolean z = afS1S0310100_17.z3;
            boolean z2 = ((C013C) afS1S0310100_17.l1).element;
            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = abstractC1126560fQE.LLJJLIIIJLLLLLLLZ;
            if (abstractC1126600fQI != null && abstractC1126600fQI.LIZJ && (c1324720kZq = abstractC1126560fQE.LLJILLL) != null) {
                C786410Ut5.LLJJIII(c1324720kZq, 8);
            }
            C1126810fQd.LIZ.LIZJ(j, Boolean.valueOf(z));
            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = abstractC1126560fQE.LLJJLIIIJLLLLLLLZ;
            if (abstractC1126600fQI2 != null && (interfaceC1126580fQG2 = abstractC1126560fQE.LLJL) != null) {
                interfaceC1126580fQG2.LJJI(abstractC1126600fQI2);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dynamic giftId=");
            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI3 = abstractC1126560fQE.LLJJLIIIJLLLLLLLZ;
            if (abstractC1126600fQI3 != null) {
                lValueOf = Long.valueOf(abstractC1126600fQI3.LJFF());
            } else {
                lValueOf = null;
            }
            sbLIZ.append(lValueOf);
            sbLIZ.append(" isInMemoryCache=");
            sbLIZ.append(z);
            sbLIZ.append(" isInDiskCache=");
            sbLIZ.append(z2);
            Logger.i("GiftIconLoad", C2188811AlT.LIZIZ(sbLIZ));
            ((AbstractC1126560fQE) afS1S0310100_17.l0).LLL = (ImageModel) afS1S0310100_17.l2;
        } else if (abstractC1127100fR6 instanceof C1127090fR5) {
            AbstractC1126560fQE abstractC1126560fQE2 = (AbstractC1126560fQE) afS1S0310100_17.l0;
            long j2 = afS1S0310100_17.j4;
            Exception exc = ((C1127090fR5) abstractC1127100fR6).LIZIZ;
            if (exc == null || (message = exc.getMessage()) == null) {
                message = "Download Error";
            }
            abstractC1126560fQE2.getClass();
            C1126810fQd.LIZ.getClass();
            C1126720fQU.LIZIZ(j2, message);
            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI4 = abstractC1126560fQE2.LLJJLIIIJLLLLLLLZ;
            if (abstractC1126600fQI4 != null && (interfaceC1126580fQG = abstractC1126560fQE2.LLJL) != null) {
                interfaceC1126580fQG.LJJIIJZLJL(abstractC1126600fQI4);
            }
        } else if (!(abstractC1127100fR6 instanceof C1127120fR8)) {
            throw new C1954807lC();
        }
        C1C7U.LIZIZ("LiveGiftAbsViewHolderV2@b208.loadDynamicPreview$dynamicPreviewDisposable$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$1(Y.AfS1S0310100_17 r15, java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS1S0310100_17.accept$1(Y.AfS1S0310100_17, java.lang.Object):void");
    }

    public AfS1S0310100_17(long j, Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.j4 = j;
        this.l0 = obj;
        this.z3 = z;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
