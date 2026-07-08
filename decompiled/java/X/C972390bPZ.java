package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS250S0000000_15;

/* JADX INFO: renamed from: X.0bPZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C972390bPZ extends AbstractC485930J3v<C972380bPY, ViewOnClickListenerC972400bPa> {
    public final Function1<C972380bPY, Unit> LIZLLL;

    public C972390bPZ(AFwS250S0000000_15 aFwS250S0000000_15) {
        super(R.layout.gvq, Boolean.FALSE);
        this.LIZLLL = aFwS250S0000000_15;
    }

    @Override // X.AbstractC485930J3v, X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
        ViewOnClickListenerC972400bPa viewOnClickListenerC972400bPa = (ViewOnClickListenerC972400bPa) viewHolder;
        C972380bPY c972380bPY = (C972380bPY) obj;
        viewOnClickListenerC972400bPa.getClass();
        boolean z = true;
        String strLJIIL = C497740JfY.LJIIL(2131756014, C963140bAe.LJIIIIZZ((int) c972380bPY.LIZ), C972470bPh.LIZJ(c972380bPY.LIZ));
        viewOnClickListenerC972400bPa.LLILLL = c972380bPY;
        C16F5 c16f5 = viewOnClickListenerC972400bPa.LL;
        if (c16f5 != null) {
            c16f5.setText(strLJIIL);
        }
        C20744016Fi c20744016Fi = viewOnClickListenerC972400bPa.LLILLJJLI;
        if (c20744016Fi != null) {
            Long lLIZIZ = InterfaceC1106030et7.o9.LIZIZ();
            long j = c972380bPY.LIZ;
            if (lLIZIZ == null || lLIZIZ.longValue() != j) {
                z = false;
            }
            c20744016Fi.setChecked(z);
        }
    }

    @Override // X.AbstractC485930J3v
    public final RecyclerView.ViewHolder LJIIIIZZ(View view, ViewGroup viewGroup) {
        return new ViewOnClickListenerC972400bPa(this, view);
    }
}
