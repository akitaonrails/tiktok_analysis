package X;

import Y.ARunnableS101S0200000_32;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.ecommerce.action.framework.ECActionDto;
import com.ss.android.ugc.aweme.ecommerce.action.framework.ECActionNextDto;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18bu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21319218bu {
    public final ECActionDto LIZ;
    public final C21319318bv LIZIZ;
    public final Map<String, Object> LIZJ;

    public final void LIZ(Object obj) {
        Object obj2;
        Thread threadU3 = C786410Ut5.u3();
        BPEAHandler bPEAHandler = C19350810nC.LIZ;
        if (Intrinsics.LJFF(threadU3, bPEAHandler.getLooper().getThread())) {
            LIZIZ(obj);
            InterfaceC21319618by interfaceC21319618by = this.LIZIZ.LJFF;
            if (interfaceC21319618by != null) {
                interfaceC21319618by.LIZ(new AwS433S0200000_32(this, obj, 39));
            }
            C21319318bv c21319318bv = this.LIZIZ;
            C21319018bs c21319018bs = c21319318bv.LIZJ;
            ECActionNextDto eCActionNextDto = this.LIZ.next;
            if (eCActionNextDto != null) {
                obj2 = eCActionNextDto.fail;
            } else {
                obj2 = null;
            }
            c21319018bs.LIZLLL(obj2, c21319318bv);
            return;
        }
        C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS101S0200000_32(this, obj, 23));
    }

    public final void LIZIZ(Object obj) {
        String str;
        Map<? extends String, ? extends Object> mapLIZJ;
        if (obj != null && (str = this.LIZ.returnKey) != null && (mapLIZJ = C2097908Jt.LIZJ(new Pair(str, obj))) != null) {
            this.LIZIZ.LIZLLL.putAll(mapLIZJ);
        }
    }

    public final void LIZJ(Object obj) {
        Object obj2;
        Thread threadU3 = C786410Ut5.u3();
        BPEAHandler bPEAHandler = C19350810nC.LIZ;
        if (Intrinsics.LJFF(threadU3, bPEAHandler.getLooper().getThread())) {
            LIZIZ(obj);
            InterfaceC21319618by interfaceC21319618by = this.LIZIZ.LJFF;
            if (interfaceC21319618by != null) {
                interfaceC21319618by.LIZ(new AwS433S0200000_32(this, obj, 40));
            }
            C21319318bv c21319318bv = this.LIZIZ;
            C21319018bs c21319018bs = c21319318bv.LIZJ;
            ECActionNextDto eCActionNextDto = this.LIZ.next;
            if (eCActionNextDto != null) {
                obj2 = eCActionNextDto.success;
            } else {
                obj2 = null;
            }
            c21319018bs.LIZLLL(obj2, c21319318bv);
            return;
        }
        C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS101S0200000_32(this, obj, 24));
    }

    public C21319218bu(ECActionDto eCActionDto, C21319318bv c21319318bv, Map<String, ? extends Object> map) {
        this.LIZ = eCActionDto;
        this.LIZIZ = c21319318bv;
        this.LIZJ = map;
    }
}
