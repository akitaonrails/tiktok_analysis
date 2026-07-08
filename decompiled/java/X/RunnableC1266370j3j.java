package X;

import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.util.List;

/* JADX INFO: renamed from: X.0j3j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class RunnableC1266370j3j implements Runnable {
    public List<String> LL;
    public Boolean LLILLJJLI;
    public Boolean LLILLL;
    public Boolean LLILZ;
    public final /* synthetic */ C1266350j3h LLILZIL;

    public final void LIZ() {
        C1269910j9R c1269910j9RLJIJJ;
        if (this.LLILZIL.A.get()) {
            return;
        }
        AVLog.ioi("LiveStream", "final dostart live stream with urls!");
        C1269780j9E c1269780j9E = this.LLILZIL.LLLILZLLLI;
        if (c1269780j9E != null) {
            c1269780j9E.LIZLLL();
            c1269780j9E.LJ();
        }
        C1266350j3h c1266350j3h = this.LLILZIL;
        C1269160j8E c1269160j8E = c1266350j3h.LLILZLL;
        if (c1269160j8E != null && (c1269910j9RLJIJJ = c1269160j8E.LJIJJ()) != null) {
            c1269910j9RLJIJJ.LIZ(c1266350j3h.LLLIZZ);
        }
        C1266350j3h c1266350j3h2 = this.LLILZIL;
        c1266350j3h2.getClass();
        C1266530j3z.LIZ.onEvent(EnumC1269710j97.START);
        if (c1266350j3h2.LLIZ == null && c1266350j3h2.LLILZLL.LJJJJJL != EnumC1269710j97.DEFAULT && c1266350j3h2.LLJZ.get() != 7 && !c1266350j3h2.A.get()) {
            C1274080jGA.LIZ.LIZ("LiveStream.pusherReadyStart", new AndroidRuntimeException("pusher init so late!"));
            c1266350j3h2.LLILZ(null, false);
        }
        C1266350j3h c1266350j3h3 = this.LLILZIL;
        InterfaceC1266360j3i interfaceC1266360j3i = c1266350j3h3.LLIZ;
        if (c1266350j3h3.LLILZLL.LJJIZ() && interfaceC1266360j3i != null) {
            interfaceC1266360j3i.LJIILL(this.LLILLL.booleanValue());
        }
        this.LLILZIL.LJZI(null, this.LL, this.LLILLJJLI.booleanValue(), this.LLILZ.booleanValue());
        this.LLILZIL.LLLZIIL = !this.LLILLJJLI.booleanValue();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LiveStream$StartUrlsRunable@cdbb.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveStream$StartUrlsRunable@cdbb.run");
    }

    public RunnableC1266370j3j(C1266350j3h c1266350j3h, List<String> list, boolean z, boolean z2, boolean z3) {
        this.LLILZIL = c1266350j3h;
        this.LL = list;
        this.LLILLJJLI = Boolean.valueOf(z);
        this.LLILLL = Boolean.valueOf(z2);
        this.LLILZ = Boolean.valueOf(z3);
    }
}
