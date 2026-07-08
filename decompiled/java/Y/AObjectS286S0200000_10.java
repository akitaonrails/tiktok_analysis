package Y;

import X.C07DY;
import X.C645110PSb;
import X.C645140PSe;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.arch.v2.services.signal.impl.SearchContextAbilityImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public class AObjectS286S0200000_10 implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS286S0200000_10 aObjectS286S0200000_10) {
        C645140PSe c645140PSe = (C645140PSe) aObjectS286S0200000_10.l0;
        RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) aObjectS286S0200000_10.l1;
        c645140PSe.getClass();
        if (C07DY.LIZ()) {
            return C645110PSb.LIZIZ(viewHolder.itemView, c645140PSe.LLILZIL.getFragment());
        }
        return new SearchContextAbilityImpl(viewHolder.itemView, c645140PSe.LLILZIL.getFragment(), null, null, null, null);
    }

    public static final Object invoke$1(AObjectS286S0200000_10 aObjectS286S0200000_10) {
        C645140PSe c645140PSe = (C645140PSe) aObjectS286S0200000_10.l0;
        RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) aObjectS286S0200000_10.l1;
        c645140PSe.getClass();
        if (C07DY.LIZ()) {
            return C645110PSb.LIZIZ(viewHolder.itemView, c645140PSe.LLILZIL.getFragment());
        }
        return new SearchContextAbilityImpl(viewHolder.itemView, c645140PSe.LLILZIL.getFragment(), null, null, null, null);
    }

    public AObjectS286S0200000_10(C645140PSe c645140PSe, RecyclerView.ViewHolder viewHolder, int i) {
        this.$t = i;
        this.l0 = c645140PSe;
        this.l1 = viewHolder;
    }
}
