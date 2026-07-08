package X;

import Y.ACListenerS155S0100000_21;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS670S0100000_21;

/* JADX INFO: renamed from: X.0liW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1368540liW<ITEM> extends RecyclerView.ViewHolder {
    public AwS670S0100000_21 LL;
    public final View LLILLJJLI;
    public final SmartAvatarImageView LLILLL;
    public final TuxIconView LLILZ;
    public final TextView LLILZIL;
    public final TextView LLILZLL;
    public final TextView LLIZ;
    public final C0HZQ LLIZLLLIL;
    public final C197039127h LLJ;
    public boolean LLJI;
    public C0ZE7 LLJIJIL;

    public abstract void I5(ITEM item, ITEM item2, int i, C0ZE7 c0ze7);

    public boolean L5() {
        return false;
    }

    public void N5() {
        C786410Ut5.T4(this.itemView, this.LLJI ? 0.34f : 1.0f);
    }

    public AbstractC1368540liW(View view) {
        super(view);
        View viewFindViewById = this.itemView.findViewById(R.id.eu1);
        this.LLILLJJLI = viewFindViewById;
        SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) this.itemView.findViewById(R.id.biz);
        this.LLILLL = smartAvatarImageView;
        this.LLILZ = (TuxIconView) this.itemView.findViewById(R.id.verify_iv);
        this.LLILZIL = (TextView) this.itemView.findViewById(R.id.p0w);
        this.LLILZLL = (TextView) this.itemView.findViewById(R.id.fs0);
        this.LLIZ = (TextView) this.itemView.findViewById(R.id.kky);
        C0HZQ c0hzq = (C0HZQ) this.itemView.findViewById(R.id.dqk);
        this.LLIZLLLIL = c0hzq;
        C197039127h c197039127h = (C197039127h) this.itemView.findViewById(R.id.cuv);
        this.LLJ = c197039127h;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, this.itemView.getContext());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            if (viewFindViewById != null) {
                viewFindViewById.setBackgroundColor(iIntValue);
                C786410Ut5.I7(new ACListenerS155S0100000_21(this, 110), viewFindViewById);
            }
        } else if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 110), viewFindViewById);
        }
        if (smartAvatarImageView != null) {
            C786410Ut5.G9(smartAvatarImageView, new ACListenerS155S0100000_21(this, 111));
        }
        if (c0hzq != null) {
            C786410Ut5.b9(c0hzq, new ACListenerS155S0100000_21(this, 112));
        }
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS155S0100000_21(this, 113));
        }
    }
}
