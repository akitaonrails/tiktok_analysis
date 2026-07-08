package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;

/* JADX INFO: renamed from: X.1BrG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2217881BrG extends BPEAThread {
    public final C1336580ksy LL;
    public final /* synthetic */ C2217891BrH LLILLJJLI;

    @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
    public final void run() {
        C1C7U.LIZ("ImageManagerCacheController$CacheSizeThread@628f.run");
        boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
        try {
            LIZJ();
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("ImageManagerCacheController$CacheSizeThread@628f.run");
    }

    public final void LIZJ() {
        System.currentTimeMillis();
        this.LL.getClass();
        long jLIZIZ = C1336580ksy.LIZIZ();
        System.currentTimeMillis();
        this.LLILLJJLI.getClass();
        this.LLILLJJLI.LLILZLL.set(jLIZIZ);
        C2217891BrH.LLJIJIL.set(0L);
        C2217891BrH c2217891BrH = this.LLILLJJLI;
        c2217891BrH.LLIZ.post(c2217891BrH.LLJ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2217881BrG(C2217891BrH c2217891BrH, C1336580ksy c1336580ksy) {
        super("CacheSizeThread");
        this.LLILLJJLI = c2217891BrH;
        this.LL = c1336580ksy;
    }
}
