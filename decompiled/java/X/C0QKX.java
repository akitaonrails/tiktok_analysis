package X;

import Y.ARunnableS103S0100000_3;
import Y.ARunnableS110S0100000_10;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: X.0QKX, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0QKX {
    public long LIZ;
    public Object LIZIZ;
    public volatile boolean LIZJ;
    public final C668590QKj LIZLLL = new C668590QKj();

    public final void LIZ() {
        C668280QJe c668280QJe;
        C0X9S<SearchSugResponse> c0x9s;
        this.LIZJ = true;
        Object obj = this.LIZIZ;
        if (obj instanceof ListenableFuture) {
            ((Future) obj).cancel(true);
        }
        Object obj2 = this.LIZIZ;
        if (obj2 instanceof C668510QKb) {
            C668510QKb c668510QKb = (C668510QKb) obj2;
            c668510QKb.LJFF.set(true);
            c668510QKb.LIZLLL.countDown();
            C01GW c01gw = C284280BCg.LIZ;
            if (((Number) c01gw.getValue()).intValue() == 1) {
                if (c668510QKb.LIZIZ != null) {
                    C823050WQl.LIZJ().submit(new ARunnableS110S0100000_10(c668510QKb, 122));
                }
            } else if (((Number) c01gw.getValue()).intValue() == 2) {
                C0X9S<C1515820pY4<SearchSugResponse>> c0x9s2 = c668510QKb.LIZIZ;
                if (c0x9s2 != null) {
                    try {
                        c0x9s2.cancel();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    c668510QKb.LIZIZ = null;
                }
            } else if (c668510QKb.LIZIZ != null) {
                C823050WQl.LIZJ().submit(new ARunnableS110S0100000_10(c668510QKb, 123));
            }
        }
        Object obj3 = this.LIZIZ;
        if (!(obj3 instanceof C668280QJe) || (c0x9s = (c668280QJe = (C668280QJe) obj3).LIZ) == null) {
            return;
        }
        C823050WQl.LIZJ().submit(new ARunnableS103S0100000_3(c0x9s, 84));
        c668280QJe.LIZ = null;
    }
}
