package X;

import android.util.Size;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.offline.tako.debug.ITakoDebugService;

/* JADX INFO: renamed from: X.0yOh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1855970yOh implements InterfaceC1783680wW6 {
    public final RecyclerView LIZ;
    public final boolean LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public int LJ;
    public InterfaceC1855990yOj LJFF;

    @Override // X.InterfaceC1783680wW6
    public final InterfaceC346201Wa LIZ(AnonymousClass0950 anonymousClass0950) {
        return C09IC.LJIILL(new C1864860yd2(new C1864870yd3(anonymousClass0950, 24), this, 13));
    }

    public C1855970yOh(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, Size size, boolean z) {
        this.LIZ = viewOnAttachStateChangeListenerC20604515jv;
        this.LIZIZ = z;
        int paddingTop = viewOnAttachStateChangeListenerC20604515jv.getPaddingTop() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) + size.getHeight();
        float fLIZIZ = C418440Gaw.LIZIZ(8);
        float f = paddingTop;
        this.LIZJ = f + fLIZIZ;
        this.LIZLLL = f - fLIZIZ;
        AnonymousClass1425.LIZ.getClass();
        ITakoDebugService iTakoDebugServiceLIZ = AnonymousClass1425.LIZ();
        if (iTakoDebugServiceLIZ != null) {
            iTakoDebugServiceLIZ.LJIIL();
        }
    }
}
