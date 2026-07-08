package X;

import android.view.View;
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterEntranceWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS238S0300000_29;

/* JADX INFO: renamed from: X.12O8, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C12O8 {
    public static final /* synthetic */ int LIZLLL = 0;
    public final C12OE LIZ;
    public final int LIZIZ;
    public WeakReference<C12OA> LIZJ;

    public boolean LIZ(C12O8 c12o8) {
        return false;
    }

    public int LIZIZ() {
        return 4;
    }

    public abstract View LIZJ();

    public View LJFF() {
        return null;
    }

    public int LJII() {
        return 39;
    }

    public long LJIIIIZZ() {
        return 10000L;
    }

    public int LJIIIZ() {
        return 0;
    }

    public abstract int LJIIJJI();

    public abstract void LJIIL(C12OB c12ob);

    public abstract void LJIILJJIL();

    public void LJIILL(C12O8 c12o8) {
    }

    public abstract void LJIIZILJ();

    public boolean LJIJ(C12O8 c12o8) {
        return this instanceof C12O6;
    }

    public boolean LJIJI() {
        return this instanceof C19416310xl;
    }

    public final LiveCenterEntranceWidget LJI() {
        C12OA c12oa = this.LIZJ.get();
        if (c12oa != null) {
            return c12oa.LJII();
        }
        return null;
    }

    public final Integer LIZLLL() {
        View viewLIZJ = LIZJ();
        if (viewLIZJ != null) {
            return Integer.valueOf(viewLIZJ.getId());
        }
        return null;
    }

    public final DataChannel LJ() {
        LiveCenterEntranceWidget liveCenterEntranceWidgetLJI = LJI();
        if (liveCenterEntranceWidgetLJI != null) {
            return liveCenterEntranceWidgetLJI.dataChannel;
        }
        return null;
    }

    public Map<String, String> LJIIJ(String str) {
        return new HashMap();
    }

    public void LJIILLIIL(C19MB c19mb) {
        View viewLIZJ = LIZJ();
        if (viewLIZJ != null) {
            C786410Ut5.LJLLLLLL(0, viewLIZJ);
            C786410Ut5.T4(viewLIZJ, 0.0f);
        }
    }

    public C12O8(C12OE c12oe, int i) {
        this.LIZ = c12oe;
        this.LIZIZ = i;
        this.LIZJ = new WeakReference<>(null);
    }

    public void LJIILIIL(C12OB c12ob, AwS238S0300000_29 awS238S0300000_29) {
        awS238S0300000_29.invoke(150L);
        LJIIL(c12ob);
    }

    public /* synthetic */ C12O8(C12OE c12oe, int i, int i2) {
        this(c12oe, i);
    }
}
