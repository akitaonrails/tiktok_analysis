package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xEN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1811130xEN extends AbstractC485930J3v<C1810120xCk, C1811150xEP> {
    public final Function0<Unit> LIZLLL;

    public C1811130xEN(Function0<Unit> function0) {
        super(R.layout.gyn, Boolean.FALSE);
        this.LIZLLL = function0;
    }

    @Override // X.AbstractC485930J3v, X.C0J8P
    public final void LJII(RecyclerView.ViewHolder viewHolder) {
        C1811150xEP c1811150xEP = (C1811150xEP) viewHolder;
        super.LJII(c1811150xEP);
        C786410Ut5.I7(null, c1811150xEP.LL);
    }

    @Override // X.AbstractC485930J3v, X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
        final Function0<Unit> function0 = this.LIZLLL;
        C786410Ut5.I7(new AbstractViewOnClickListenerC1105820esm() { // from class: X.0xER
            @Override // X.AbstractViewOnClickListenerC1105820esm
            public final void LIZ() {
                function0.invoke();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1200L);
            }
        }, ((C1811150xEP) viewHolder).LL);
    }

    @Override // X.AbstractC485930J3v
    public final RecyclerView.ViewHolder LJIIIIZZ(View view, ViewGroup viewGroup) {
        if (viewGroup != null) {
            view.getLayoutParams().height = viewGroup.getHeight();
        }
        return new C1811150xEP(view);
    }
}
