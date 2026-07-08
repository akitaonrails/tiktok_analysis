package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bfY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982300bfY extends C0J8P<C982910bgX, C983310bhB> {
    public final InterfaceC983770bhv LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, C982910bgX c982910bgX) {
        LJIIIZ((C983310bhB) viewHolder, c982910bgX);
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C983310bhB c983310bhB = new C983310bhB(C786410Ut5.Td(layoutInflater, R.layout.h58, viewGroup, false));
        C1143680frq.LJ((View) c983310bhB.LLILLL.getValue(), "tiktok_live_interaction_demand_25", "ttlive_bg_take_stage_rank1_crown_circle_final_call.png", ImageView.ScaleType.CENTER_CROP);
        C1143680frq.LJ((View) c983310bhB.LLIZLLLIL.getValue(), "tiktok_live_interaction_demand_25", "ttlive_ic_take_stage_playing_management_panel_gift.png", ImageView.ScaleType.CENTER_CROP);
        return c983310bhB;
    }

    public final void LJIIIIZZ(C983310bhB c983310bhB, C982910bgX c982910bgX) {
        long j;
        String string;
        String value;
        C974430bSr c974430bSr;
        C500260Jjc.LJLJLJ(c983310bhB.I5(), c982910bgX.LJIILLIIL);
        C500260Jjc.LJLIIIL(500L, c983310bhB.I5(), new AwS381S0200000_15(this, c982910bgX, 1));
        int i = 1;
        C500260Jjc.LJLJLJ(c983310bhB.L5(), !c982910bgX.LJIILLIIL);
        C500260Jjc.LJLIIIL(500L, c983310bhB.L5(), new AwS381S0200000_15(this, c982910bgX, 2));
        if (!c982910bgX.LJIILLIIL) {
            long j2 = c982910bgX.LIZ;
            long j3 = c982910bgX.LIZLLL;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
            if (c981480beEM91 != null && (c974430bSr = c981480beEM91.LJJIJIIJIL) != null) {
                j = c974430bSr.LIZJ;
            } else {
                j = 0;
            }
            C981480beE c981480beEM912 = C915980Zwa.LIZIZ().M91(false);
            String str = "";
            if (c981480beEM912 == null || (string = Long.valueOf(c981480beEM912.LJIIIZ).toString()) == null) {
                string = "";
            }
            linkedHashMap.put("pk_id", string);
            linkedHashMap.put("to_anchor_id", String.valueOf(j2));
            linkedHashMap.put("to_room_id", String.valueOf(j3));
            linkedHashMap.put("performer_id", String.valueOf(j));
            if (j != j2) {
                i = 0;
            }
            linkedHashMap.put("is_to_current_performer", String.valueOf(i));
            EnumC973870bRx enumC973870bRxLIZJ = C973930bS3.LIZJ();
            if (enumC973870bRxLIZJ != null && (value = enumC973870bRxLIZJ.getValue()) != null) {
                str = value;
            }
            linkedHashMap.put("click_period", str);
            C973690bRf.LJJIJIIJIL(12, C973690bRf.LIZ, "livesdk_take_stage_panel_switch_show", linkedHashMap, false);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(X.C983310bhB r7, X.C982910bgX r8) {
        /*
            Method dump skipped, instruction units count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C982300bfY.LJIIIZ(X.0bhB, X.0bgX):void");
    }

    public C982300bfY(C982200bfO c982200bfO, boolean z, boolean z2) {
        this.LIZIZ = c982200bfO;
        this.LIZJ = z;
        this.LIZLLL = z2;
    }

    @Override // X.C0J8P
    public final void LIZLLL(RecyclerView.ViewHolder viewHolder, C982910bgX c982910bgX, List list) {
        C983310bhB c983310bhB = (C983310bhB) viewHolder;
        C982910bgX c982910bgX2 = c982910bgX;
        if (list.size() <= 0) {
            LIZJ(c983310bhB, c982910bgX2);
            return;
        }
        if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next(), "score_update")) {
                    ((TextView) c983310bhB.LLJI.getValue()).setText(c982910bgX2.LJIILL);
                    return;
                }
            }
        }
        LJIIIZ(c983310bhB, c982910bgX2);
    }
}
