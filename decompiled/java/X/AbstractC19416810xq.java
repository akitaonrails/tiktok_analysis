package X;

import Y.ARunnableS129S0100000_29;
import android.view.View;
import com.bytedance.android.live.broadcast.api.LiveCenterTopNoticeDismissEvent;
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterEntranceWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.state.LiveCenterTopNoticeShowEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS430S0200000_29;

/* JADX INFO: renamed from: X.10xq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19416810xq extends C12O8 {
    public final ARunnableS129S0100000_29 LJ;
    public long LJFF;
    public boolean LJI;

    public AbstractC19416810xq() {
        this(0);
    }

    @Override // X.C12O8
    public final int LIZIZ() {
        return 9;
    }

    @Override // X.C12O8
    public final View LIZJ() {
        return null;
    }

    @Override // X.C12O8
    public int LJIIJJI() {
        return 1;
    }

    @Override // X.C12O8
    public void LJIILLIIL(C19MB c19mb) {
    }

    public abstract String LJIJJ();

    public abstract String LJIJJLI();

    public abstract String LJIL();

    public abstract boolean LJJ();

    @Override // X.C12O8
    public final void LJIIZILJ() {
        C473410IhP.LJ(this.LJ);
        DataChannel dataChannelLJ = LJ();
        if (dataChannelLJ != null) {
            dataChannelLJ.LC0(LiveCenterTopNoticeDismissEvent.class, new C1164504h1(null));
        }
    }

    @Override // X.C12O8
    public final void LJIILJJIL() {
        this.LJFF = System.currentTimeMillis();
        LiveCenterEntranceWidget liveCenterEntranceWidgetLJI = LJI();
        if (liveCenterEntranceWidgetLJI != null) {
            liveCenterEntranceWidgetLJI.hide();
        }
        DataChannel dataChannelLJ = LJ();
        if (dataChannelLJ != null) {
            dataChannelLJ.LC0(LiveCenterTopNoticeShowEvent.class, this);
        }
        C473410IhP.LIZJ(this.LJ, LJIIIIZZ());
        C12OY.LJIILIIL(LJ(), LJIJJLI(), LJIL(), null, LJJ(), 40);
    }

    public AbstractC19416810xq(int i) {
        super(C12OE.TOP_NOTICE, 8, 0);
        this.LJ = new ARunnableS129S0100000_29(this, 183);
    }

    @Override // X.C12O8
    public final void LJIIL(C12OB c12ob) {
        C473410IhP.LJ(this.LJ);
        if (!this.LJI) {
            LJJI(C128V.SUB_TYPE_DISAPPEAR.getType());
        }
        DataChannel dataChannelLJ = LJ();
        if (dataChannelLJ != null) {
            dataChannelLJ.LC0(LiveCenterTopNoticeDismissEvent.class, new C1164504h1(new AwS430S0200000_29(this, c12ob, 115)));
        }
    }

    @Override // X.C12O8
    public boolean LJIJ(C12O8 c12o8) {
        return c12o8 instanceof C12O7;
    }

    public final void LJJI(String str) {
        long jCurrentTimeMillis;
        this.LJI = true;
        DataChannel dataChannelLJ = LJ();
        String strLJIJJLI = LJIJJLI();
        if (this.LJFF == 0) {
            jCurrentTimeMillis = 0;
        } else {
            jCurrentTimeMillis = System.currentTimeMillis() - this.LJFF;
        }
        C12OY.LJIIL(dataChannelLJ, strLJIJJLI, str, jCurrentTimeMillis, LJIL(), null, LJJ(), 160);
    }
}
