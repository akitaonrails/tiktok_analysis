package X;

import Y.ACListenerS152S0100000_17;
import Y.ARunnableS117S0100000_17;
import Y.ATListenerS450S0100000_17;
import Y.AsS44S0100000_17;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0f4f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1113190f4f {
    public final RecyclerView LIZ;
    public final C16F5 LIZIZ;
    public final DataChannel LIZJ;
    public final boolean LIZLLL;
    public final Function0<Unit> LJ;
    public int LJFF;
    public int LJI;
    public EnumC1091490eVf LJII = EnumC1091490eVf.NORMAL;
    public boolean LJIIIIZZ;
    public final LinearLayoutManager LJIIIZ;

    public final void LIZIZ() {
        AbstractC21673619ry adapter = this.LIZ.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        this.LIZ.smoothScrollToPosition(itemCount);
        this.LJI = itemCount;
        Function0<Unit> function0 = this.LJ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void LIZ(int i) {
        LIZJ(this.LJFF + i);
        if (this.LJFF >= 300) {
            this.LJII = EnumC1091490eVf.NORMAL;
            LIZJ(0);
        }
        if (EnumC1091490eVf.NORMAL == this.LJII || this.LJIIIIZZ) {
            this.LJIIIIZZ = true;
            LIZIZ();
        }
    }

    public final void LIZJ(int i) {
        String strValueOf;
        if (EnumC1091490eVf.NORMAL != this.LJII && i > 0) {
            this.LJFF = i;
            if (i < 100) {
                strValueOf = String.valueOf(i);
            } else {
                strValueOf = "99+";
            }
            this.LIZIZ.setText(C497740JfY.LJIIL(2131755505, i, strValueOf));
            if (this.LIZIZ.getVisibility() != 0) {
                HandlerHook.viewPost(this.LIZIZ, new ARunnableS117S0100000_17(this, 36));
                return;
            }
            return;
        }
        C786410Ut5.LLJJJJ(this.LIZIZ, 4);
        this.LJFF = 0;
    }

    public static void LIZLLL(C1113190f4f c1113190f4f, EnumC1091490eVf enumC1091490eVf, int i) {
        boolean z;
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (c1113190f4f.LJII != enumC1091490eVf) {
            c1113190f4f.LJII = enumC1091490eVf;
            if (EnumC1091490eVf.NORMAL == enumC1091490eVf) {
                c1113190f4f.LIZJ(0);
                if (z) {
                    c1113190f4f.LIZIZ();
                }
            }
        }
    }

    public C1113190f4f(C781550UlF c781550UlF, C16F5 c16f5, DataChannel dataChannel, boolean z, C1113250f4l c1113250f4l) {
        this.LIZ = c781550UlF;
        this.LIZIZ = c16f5;
        this.LIZJ = dataChannel;
        this.LIZLLL = z;
        this.LJ = c1113250f4l;
        this.LJIIIZ = (LinearLayoutManager) c781550UlF.getLayoutManager();
        C786410Ut5.l8(c16f5, new ACListenerS152S0100000_17(this, 11));
        c781550UlF.setOnTouchListener(new ATListenerS450S0100000_17(this, 0));
        c781550UlF.setOnFlingListener(new AbstractC1338480kw2() { // from class: X.0f4g
            @Override // X.AbstractC1338480kw2
            public final boolean LIZ(int i, int i2) {
                if (i2 == 0) {
                    if (!this.LIZ.LIZ.canScrollVertically(1)) {
                        C1113190f4f.LIZLLL(this.LIZ, EnumC1091490eVf.NORMAL, 6);
                        return false;
                    }
                    C1113190f4f.LIZLLL(this.LIZ, EnumC1091490eVf.FOCUS, 6);
                    int iFindLastVisibleItemPosition = this.LIZ.LJIIIZ.findLastVisibleItemPosition();
                    C1113190f4f c1113190f4f = this.LIZ;
                    int i3 = c1113190f4f.LJI;
                    if (iFindLastVisibleItemPosition <= i3) {
                        return false;
                    }
                    c1113190f4f.LIZJ(c1113190f4f.LJFF - (iFindLastVisibleItemPosition - i3));
                    this.LIZ.LJI = iFindLastVisibleItemPosition;
                    return false;
                }
                return false;
            }
        });
        c781550UlF.addOnScrollListener(new AsS44S0100000_17(this, 0));
    }
}
