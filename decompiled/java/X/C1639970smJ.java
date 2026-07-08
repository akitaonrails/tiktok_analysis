package X;

import Y.ACListenerS159S0100000_25;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS639S0100000_25;

/* JADX INFO: renamed from: X.0smJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1639970smJ extends RecyclerView.ViewHolder {
    public final C1640000smM LL;
    public final Function2<FilterBean, EnumC1641340soW, Unit> LLILLJJLI;
    public final ImageView LLILLL;
    public final C1662870tNF LLILZ;
    public ObjectAnimator LLILZIL;
    public FilterBean LLILZLL;
    public EnumC1641340soW LLIZ;

    public final void I5() {
        ObjectAnimator objectAnimator = this.LLILZIL;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            objectAnimator.cancel();
        }
        C786410Ut5.Cb(this.LLILLL, 0.0f);
        Integer numValueOf = Integer.valueOf(this.LL.LJFF);
        this.LLILLL.setImageResource(numValueOf.intValue() != 0 ? numValueOf.intValue() : R.drawable.a_y);
    }

    public C1639970smJ(View view, C1640000smM c1640000smM, AwS639S0100000_25 awS639S0100000_25) {
        super(view);
        this.LL = c1640000smM;
        this.LLILLJJLI = awS639S0100000_25;
        this.LLILLL = (ImageView) view.findViewById(R.id.lfk);
        this.LLILZ = (C1662870tNF) view.findViewById(R.id.l2j);
        this.LLIZ = EnumC1641340soW.FILTER_STATE_UNKNOWN;
        C786410Ut5.I7(new ACListenerS159S0100000_25(this, 67), view);
    }
}
