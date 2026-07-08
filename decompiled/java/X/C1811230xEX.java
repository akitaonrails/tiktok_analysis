package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0xEX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1811230xEX extends RecyclerView.ViewHolder {
    public final TextView LL;
    public final TextView LLILLJJLI;
    public final TextView LLILLL;
    public final ImageView LLILZ;
    public final ImageView LLILZIL;
    public final C1324720kZq LLILZLL;
    public final ConstraintLayout LLIZ;
    public final TextView LLIZLLLIL;
    public final TextView LLJ;
    public final TextView LLJI;
    public final TextView LLJIJIL;
    public final TextView LLJILJIL;
    public final TextView LLJILJILJ;
    public final TextView LLJILLL;
    public int LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public long LLJJIJIL;
    public CountDownTimerC1811820xFU LLJJJ;

    public final void L5() {
        C786410Ut5.LJZI(8, this.LLILZIL);
        C786410Ut5.LJZI(0, this.LLILZ);
        C786410Ut5.LLIL(this.LLILLL, 8);
    }

    public final void P5() {
        C786410Ut5.LJZI(0, this.LLILZIL);
        C786410Ut5.LJZI(8, this.LLILZ);
        C786410Ut5.LLIL(this.LLILLL, 0);
    }

    public C1811230xEX(View view) {
        super(view);
        this.LL = (TextView) view.findViewById(R.id.tv_rank_league_description);
        this.LLILLJJLI = (TextView) view.findViewById(R.id.tv_rank_league_sub_description);
        this.LLILLL = (TextView) view.findViewById(R.id.tv_rank_league_rule);
        this.LLILZ = (ImageView) view.findViewById(R.id.lej);
        this.LLILZIL = (ImageView) view.findViewById(R.id.leh);
        this.LLILZLL = (C1324720kZq) view.findViewById(R.id.lei);
        this.LLIZ = (ConstraintLayout) view.findViewById(R.id.sqx);
        this.LLIZLLLIL = (TextView) view.findViewById(R.id.zg1);
        this.LLJ = (TextView) view.findViewById(R.id.zg2);
        this.LLJI = (TextView) view.findViewById(R.id.zg3);
        this.LLJIJIL = (TextView) view.findViewById(R.id.zg5);
        this.LLJILJIL = (TextView) view.findViewById(R.id.zg6);
        this.LLJILJILJ = (TextView) view.findViewById(R.id.zfz);
        this.LLJILLL = (TextView) view.findViewById(R.id.zg0);
        this.LLJJIJIIJIL = true;
    }

    public static final String I5(long j) {
        if (j < 10) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('0');
            sbLIZ.append(j);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return String.valueOf(j);
    }

    public static final boolean N5(int i, long j) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return true;
                }
                C20337914i1<Long> c20337914i1 = InterfaceC1094280eaA.dd;
                Long lLIZIZ = c20337914i1.LIZIZ();
                if (lLIZIZ == null || j != lLIZIZ.longValue()) {
                    c20337914i1.LJFF(Long.valueOf(j));
                    return false;
                }
            } else {
                C20337914i1<Long> c20337914i12 = InterfaceC1094280eaA.cd;
                Long lLIZIZ2 = c20337914i12.LIZIZ();
                if (lLIZIZ2 == null || j != lLIZIZ2.longValue()) {
                    c20337914i12.LJFF(Long.valueOf(j));
                    return false;
                }
            }
        } else {
            C20337914i1<Long> c20337914i13 = InterfaceC1094280eaA.bd;
            Long lLIZIZ3 = c20337914i13.LIZIZ();
            if (lLIZIZ3 == null || j != lLIZIZ3.longValue()) {
                c20337914i13.LJFF(Long.valueOf(j));
                return false;
            }
        }
        return true;
    }
}
