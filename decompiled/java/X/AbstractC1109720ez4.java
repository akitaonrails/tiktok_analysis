package X;

import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import cu0.a;
import cu0.b;
import java.util.List;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS135S0110000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0ez4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1109720ez4<TEXT_MODEL extends a, PINNED_MODEL extends b<TEXT_MODEL>> extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LLIZ = 0;
    public C1109770ez9 LL;
    public PINNED_MODEL LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final AwS596S0100000_17 LLILZIL;
    public final int LLILZLL;

    public abstract C1110060ezc N5();

    public abstract ImageView P5();

    public void T5(PINNED_MODEL pinned_model, List<? extends Object> list) {
    }

    public final Runnable R5() {
        return (Runnable) this.LLILLL.getValue();
    }

    public final Handler S5() {
        return (Handler) this.LLILZ.getValue();
    }

    public void I5(boolean z) {
        N5().setMeasureListener(new AwS135S0110000_17((AbstractC1109720ez4) this, z, true));
    }

    public AbstractC1109720ez4(View view, C1109770ez9 c1109770ez9) {
        super(view);
        this.LL = c1109770ez9;
        this.LLILLL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 613));
        this.LLILZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(375));
        this.LLILZIL = new AwS596S0100000_17(this, 660);
        this.LLILZLL = -1;
    }

    public final void L5(PINNED_MODEL pinned_model, List<? extends Object> list) {
        this.LLILLJJLI = pinned_model;
        T5(pinned_model, list);
    }
}
