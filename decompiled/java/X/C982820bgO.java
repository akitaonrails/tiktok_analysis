package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bgO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982820bgO extends C0J8P<C982910bgX, C983320bhC> {
    public final InterfaceC983770bhv LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, C982910bgX c982910bgX) {
        LJIIIIZZ((C983320bhC) viewHolder, c982910bgX);
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C983320bhC c983320bhC = new C983320bhC(C786410Ut5.Td(layoutInflater, R.layout.h57, viewGroup, false));
        C1143680frq.LJ((View) c983320bhC.LLILLL.getValue(), "tiktok_live_interaction_demand_25", "ttlive_bg_take_stage_rank1_crown_circle_final_call.png", ImageView.ScaleType.CENTER_CROP);
        C1143680frq.LJ((View) c983320bhC.LLJIJIL.getValue(), "tiktok_live_interaction_demand_25", "ttlive_ic_take_stage_playing_management_panel_gift.png", ImageView.ScaleType.CENTER_CROP);
        return c983320bhC;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(X.C983320bhC r6, X.C982910bgX r7) {
        /*
            Method dump skipped, instruction units count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C982820bgO.LJIIIIZZ(X.0bhC, X.0bgX):void");
    }

    @Override // X.C0J8P
    public final void LIZLLL(RecyclerView.ViewHolder viewHolder, C982910bgX c982910bgX, List list) {
        C983320bhC c983320bhC = (C983320bhC) viewHolder;
        C982910bgX c982910bgX2 = c982910bgX;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBindViewHolder position=");
        sbLIZ.append(c983320bhC.getAdapterPosition());
        sbLIZ.append(" name=");
        sbLIZ.append(c982910bgX2.LIZJ);
        sbLIZ.append(" payloadsSize=");
        sbLIZ.append(list.size());
        sbLIZ.append(" payloads=");
        sbLIZ.append(list);
        sbLIZ.append(" isPlayingV3=");
        sbLIZ.append(this.LIZJ);
        C20441214yg.LIZIZ("TakeStagePlayingItemViewBinder", C2188811AlT.LIZIZ(sbLIZ));
        if (list.size() <= 0) {
            LIZJ(c983320bhC, c982910bgX2);
            return;
        }
        if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next(), "performing_time_update")) {
                    ((TextView) c983320bhC.LLJILJILJ.getValue()).setText(c982910bgX2.LJIIJJI);
                    return;
                }
            }
        }
        if (!list.isEmpty()) {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                if (Intrinsics.LJFF(it3.next(), "score_update")) {
                    ((TextView) c983320bhC.LLIZLLLIL.getValue()).setText(c982910bgX2.LJIILL);
                    return;
                }
            }
        }
        LJIIIIZZ(c983320bhC, c982910bgX2);
    }

    public C982820bgO(InterfaceC983770bhv interfaceC983770bhv, boolean z, boolean z2, boolean z3, int i) {
        z = (i & 2) != 0 ? false : z;
        z2 = (i & 4) != 0 ? false : z2;
        z3 = (i & 8) != 0 ? false : z3;
        this.LIZIZ = interfaceC983770bhv;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
    }
}
