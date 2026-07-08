package X;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.09k0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2457009k0 extends AbstractC2457109k1 {
    public static C2457009k0 LJIIIZ;
    public final BPEAHandler LJI;
    public final C08TC LJII;
    public final Set LJIIIIZZ;

    public static synchronized C2457009k0 LIZLLL(Context context) {
        if (LJIIIZ == null) {
            LJIIIZ = new C2457009k0(context, EnumC2121908Sz.zza);
        }
        return LJIIIZ;
    }

    public final synchronized void LJ(C2458109kB c2458109kB) {
        Iterator it2 = new LinkedHashSet(this.LJIIIIZZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC2457409k4) it2.next()).LIZ(c2458109kB);
        }
        LIZIZ(c2458109kB);
    }

    public C2457009k0(Context context, EnumC2121908Sz enumC2121908Sz) {
        super(new C2458409kE("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.LJI = new BPEAHandler(Looper.getMainLooper());
        this.LJIIIIZZ = new LinkedHashSet();
        this.LJII = enumC2121908Sz;
    }
}
