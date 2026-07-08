package X;

import Y.AfS109S0300000_15;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multihost.biz.event.CoHostOpenEOYListEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0b9r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C962650b9r extends C0J8P<C962010b8p, C962820bA8> {
    public final InterfaceC962690b9v LIZIZ;
    public final DataChannel LIZJ;
    public C11JF LIZLLL;

    @Override // X.C0J8P
    public final void LJI(RecyclerView.ViewHolder viewHolder) {
        C11JF c11jf = this.LIZLLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LIZLLL = null;
    }

    public C962650b9r(InterfaceC962690b9v interfaceC962690b9v, DataChannel dataChannel) {
        this.LIZIZ = interfaceC962690b9v;
        this.LIZJ = dataChannel;
    }

    public static void LJIIIIZZ(C16F5 c16f5, C962010b8p c962010b8p) {
        String strLJI = C963140bAe.LJI(c962010b8p.LJFF);
        String strLJI2 = C963140bAe.LJI(c962010b8p.LJI);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJI);
        sbLIZ.append(" - ");
        sbLIZ.append(strLJI2);
        c16f5.setText(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, C962010b8p c962010b8p) {
        final C962820bA8 c962820bA8 = (C962820bA8) viewHolder;
        final C962010b8p c962010b8p2 = c962010b8p;
        LJIIIZ(c962820bA8, c962010b8p2);
        long jLIZJ = c962010b8p2.LJI - C158B.LIZJ();
        C11JF c11jf = this.LIZLLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LIZLLL = (C11JF) C19490011Na.LIZ(0L, 1L, TimeUnit.SECONDS).LJLIIL(jLIZJ).LJJJJZI(new C517101zt(jLIZJ, 10)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJZ(new AfS109S0300000_15(this, c962820bA8, c962010b8p2, 15), new AfS109S0300000_15(this, c962820bA8, c962010b8p2, 16), new InterfaceC781210Ukh() { // from class: X.0b9t
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                C11JF c11jf2 = this.LIZ.LIZLLL;
                if (c11jf2 != null) {
                    c11jf2.dispose();
                }
                this.LIZ.LJIIIZ(c962820bA8, c962010b8p2);
                this.LIZ.LIZIZ.ag();
            }
        });
        C1143680frq.LJI((View) c962820bA8.LLILZLL.getValue(), C1143780fs0.LJIIJ("tiktok_live_interaction_normal_1", "ttlive_cohost_eoy_banner_round2.png"), null, true);
        if (!c962010b8p2.LIZ) {
            c962010b8p2.LIZ = true;
            C955400ayA.LIZ.LJLILLLLZI(EnumC962630b9p.ROUND2_ON.getValue());
        }
        C960940b76.LIZIZ(c962820bA8, c962010b8p2);
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C962820bA8(C786410Ut5.Td(layoutInflater, R.layout.gr9, viewGroup, false));
    }

    public final void LJIIIZ(C962820bA8 c962820bA8, C962010b8p c962010b8p) {
        if (C158B.LIZJ() < c962010b8p.LJFF) {
            ((TextView) c962820bA8.LL.getValue()).setText(C497740JfY.LJIJI(2131840642));
            LJIIIIZZ((C16F5) c962820bA8.LLILLJJLI.getValue(), c962010b8p);
        } else if (C158B.LIZJ() > c962010b8p.LJI) {
            ((TextView) c962820bA8.LL.getValue()).setText(C497740JfY.LJIJI(2131840641));
            LJIIIIZZ((C16F5) c962820bA8.LLILLJJLI.getValue(), c962010b8p);
            C11JF c11jf = this.LIZLLL;
            if (c11jf != null) {
                c11jf.dispose();
            }
            this.LIZLLL = null;
        } else {
            ((TextView) c962820bA8.LL.getValue()).setText(C497740JfY.LJIJI(2131840640));
            ((TextView) c962820bA8.LLILLJJLI.getValue()).setText(C963140bAe.LJIIIZ((int) (c962010b8p.LJI - C158B.LIZJ())));
        }
        long jLIZJ = C158B.LIZJ();
        if (jLIZJ >= c962010b8p.LJFF && jLIZJ <= c962010b8p.LJI) {
            C500260Jjc.LLFFF((View) c962820bA8.LLILZ.getValue());
            C500260Jjc.LLFFF((View) c962820bA8.LLILZIL.getValue());
            ((TextView) c962820bA8.LLILZ.getValue()).setText(C497740JfY.LJIJJ(2131840639, Long.valueOf(c962010b8p.LJII)));
            C786410Ut5.I7(new AbstractViewOnClickListenerC951940asa() { // from class: X.0b9k
                {
                    super(0);
                }

                @Override // X.AbstractViewOnClickListenerC951940asa
                public final void LIZ(View view) {
                    DataChannel dataChannel = this.LLILZIL.LIZJ;
                    if (dataChannel != null) {
                        dataChannel.FQ2(CoHostOpenEOYListEvent.class);
                    }
                    C955400ayA.LIZ.LJLIL(EnumC962630b9p.ROUND2_ON.getValue());
                }
            }, c962820bA8.itemView);
            return;
        }
        C500260Jjc.LJIILIIL((View) c962820bA8.LLILZ.getValue());
        C500260Jjc.LJIILIIL((View) c962820bA8.LLILZIL.getValue());
        C786410Ut5.I7(null, c962820bA8.itemView);
    }
}
