package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0Hzc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C459220Hzc extends RecyclerView.ViewHolder {
    public final Function2<Effect, String, Unit> LL;
    public final C01GW LLILLJJLI;

    /* JADX WARN: Multi-variable type inference failed */
    public C459220Hzc(View view, Function2<? super Effect, ? super String, Unit> function2) {
        super(view);
        this.LL = function2;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS550S0100000_6(view, 607));
    }
}
