package X;

import Y.AsS53S0100000_27;
import android.content.Context;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS143S0110000_27;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0yXm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1861600yXm {
    public final ITakoContextAbility LIZ;
    public final RecyclerView LIZIZ;
    public final Function0<C1780320wQg> LIZJ;
    public final Function0<Unit> LIZLLL;
    public int LJ;
    public boolean LJFF;
    public boolean LJI;
    public volatile Integer LJII;
    public volatile long LJIIIIZZ;
    public final int LJIIIZ;
    public AnonymousClass0956 LJIIJ;
    public final C054G LJIIJJI;
    public final C054G LJIIL;

    public C1861600yXm(ITakoContextAbility iTakoContextAbility, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, AwS571S0100000_27 awS571S0100000_27, AwS143S0110000_27 awS143S0110000_27) {
        int scaledTouchSlop;
        Context context;
        this.LIZ = iTakoContextAbility;
        this.LIZIZ = viewOnAttachStateChangeListenerC20604515jv;
        this.LIZJ = awS571S0100000_27;
        this.LIZLLL = awS143S0110000_27;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (context = viewOnAttachStateChangeListenerC20604515jv.getContext()) != null) {
            scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        } else {
            scaledTouchSlop = 10;
        }
        this.LJIIIZ = scaledTouchSlop;
        AsS53S0100000_27 asS53S0100000_27 = new AsS53S0100000_27(this, 10);
        C1DFH c1dfh = C0PEM.LIZ;
        this.LJIIJJI = C2296808zG.LIZ(C2107308Nj.LIZ.LLIILII());
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.addOnScrollListener(asS53S0100000_27);
        }
        this.LJIIL = C2296808zG.LIZ(C0PEM.LIZJ);
    }
}
