package Y;

import X.AbstractC1132980faa;
import X.C09JN;
import X.C0WIY;
import X.C1129310fUf;
import X.C1129650fVD;
import X.C1C7U;
import X.InterfaceC1128210fSt;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes18.dex */
public class AfS0S1211200_17 implements C09JN {
    public final int $t;
    public int i4;
    public long j5;
    public long j6;
    public Object l1;
    public Object l2;
    public String s0;
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

    public static final void accept$0(AfS0S1211200_17 afS0S1211200_17, Object obj) {
        C1C7U.LIZ("GiftRepository@13a6.syncGiftListV1$6");
        ((C1129650fVD) afS0S1211200_17.l1).LIZIZ(afS0S1211200_17.j5, null, null, "GiftListSync", "onNext gift/list");
        InterfaceC1128210fSt interfaceC1128210fStInst = GiftManager.inst();
        long j = afS0S1211200_17.j5;
        long j2 = afS0S1211200_17.j6;
        boolean z = afS0S1211200_17.z3;
        int i = afS0S1211200_17.i4;
        AbstractC1132980faa abstractC1132980faa = (AbstractC1132980faa) afS0S1211200_17.l2;
        C1129310fUf.LIZ.getClass();
        interfaceC1128210fStInst.onGiftListSuccess(j, j2, z, i, (C0WIY) obj, abstractC1132980faa, C1129310fUf.LIZJ, afS0S1211200_17.s0);
        C1C7U.LIZIZ("GiftRepository@13a6.syncGiftListV1$6");
    }

    public static final void accept$1(AfS0S1211200_17 afS0S1211200_17, Object obj) {
        C1C7U.LIZ("GiftRepository@13a6.syncGiftListV1$7");
        ((C1129650fVD) afS0S1211200_17.l1).LIZIZ(afS0S1211200_17.j5, null, null, "GiftListSync", "onError gift/list");
        GiftManager.inst().onGiftListFail((Throwable) obj, afS0S1211200_17.j5, afS0S1211200_17.i4, afS0S1211200_17.z3, afS0S1211200_17.j6, (WeakReference) afS0S1211200_17.l2, afS0S1211200_17.s0);
        C1C7U.LIZIZ("GiftRepository@13a6.syncGiftListV1$7");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0007: IPUT (r5 I:int), (r0 I:Y.AfS0S1211200_17) (LINE:134217735) Y.AfS0S1211200_17.i4 int, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x000d: IPUT (r9 I:java.lang.Object), (r0 I:Y.AfS0S1211200_17) (LINE:134217741) Y.AfS0S1211200_17.l2 java.lang.Object, block:B:2:0x0000 */
    public AfS0S1211200_17(Object obj, C1129650fVD c1129650fVD, long j, int i, boolean z, long j2, WeakReference<AbstractC1132980faa> weakReference, String str) {
        int i2;
        Object obj2;
        this.$t = str;
        this.l1 = obj;
        this.j5 = c1129650fVD;
        this.i4 = i2;
        this.z3 = i;
        this.j6 = z ? 1L : 0L;
        this.l2 = obj2;
        this.s0 = weakReference;
    }
}
