package Y;

import X.C09JN;
import X.C1C7U;
import X.C749960TbO;
import X.C750030TbV;
import X.C784440Upu;
import X.InterfaceC750020TbU;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class AfS1S1110200_12 implements C09JN {
    public final int $t;
    public long j3;
    public long j4;
    public Object l1;
    public String s0;
    public boolean z2;

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

    public static final void accept$0(AfS1S1110200_12 afS1S1110200_12, Object obj) {
        C1C7U.LIZ("KickOutManager@53a9.kickOut$1");
        InterfaceC750020TbU interfaceC750020TbU = (InterfaceC750020TbU) ((WeakReference) afS1S1110200_12.l1).get();
        if (interfaceC750020TbU != null) {
            interfaceC750020TbU.LJJJLZIJ(afS1S1110200_12.z2);
        }
        if (Intrinsics.LJFF(afS1S1110200_12.s0, "KickOutDialog")) {
            C784440Upu.LIZ().LIZIZ(new C749960TbO(afS1S1110200_12.z2, afS1S1110200_12.j3));
        }
        C750030TbV.LIZIZ(afS1S1110200_12.j4, afS1S1110200_12.j3, afS1S1110200_12.z2);
        C1C7U.LIZIZ("KickOutManager@53a9.kickOut$1");
    }

    public static final void accept$1(AfS1S1110200_12 afS1S1110200_12, Object obj) {
        C1C7U.LIZ("KickOutManager@53a9.kickOut$3");
        InterfaceC750020TbU interfaceC750020TbU = (InterfaceC750020TbU) ((WeakReference) afS1S1110200_12.l1).get();
        if (interfaceC750020TbU != null) {
            interfaceC750020TbU.LJJJLZIJ(afS1S1110200_12.z2);
        }
        if (Intrinsics.LJFF(afS1S1110200_12.s0, "KickOutDialog")) {
            C784440Upu.LIZ().LIZIZ(new C749960TbO(afS1S1110200_12.z2, afS1S1110200_12.j3));
        }
        C750030TbV.LIZIZ(afS1S1110200_12.j4, afS1S1110200_12.j3, afS1S1110200_12.z2);
        C1C7U.LIZIZ("KickOutManager@53a9.kickOut$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x000b: IPUT (r7 I:long), (r0 I:Y.AfS1S1110200_12) (LINE:100663307) Y.AfS1S1110200_12.j4 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0000: IPUT (r9 I:int), (r1 I:Y.AfS1S1110200_12) (LINE:100663296) Y.AfS1S1110200_12.$t int, block:B:2:0x0000 */
    public AfS1S1110200_12(WeakReference weakReference, WeakReference<InterfaceC750020TbU> weakReference2, boolean z, String str, long j, long j2) {
        int i;
        long j3;
        this.$t = i;
        this.l1 = weakReference;
        this.z2 = weakReference2;
        this.s0 = z;
        this.j3 = str;
        this.j4 = j3;
    }
}
