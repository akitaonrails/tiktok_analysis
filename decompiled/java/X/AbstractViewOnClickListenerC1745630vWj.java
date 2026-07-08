package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ViewStyle;

/* JADX INFO: renamed from: X.0vWj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractViewOnClickListenerC1745630vWj extends RecyclerView.ViewHolder implements View.OnClickListener {
    public InterfaceC1743730vTf LL;

    public abstract void I5(CandInputData candInputData, int i, ViewStyle viewStyle, String str);

    public AbstractViewOnClickListenerC1745630vWj(View view) {
        super(view);
        C786410Ut5.I7(this, view);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1743730vTf interfaceC1743730vTf = this.LL;
        if (interfaceC1743730vTf != null) {
            interfaceC1743730vTf.LIZ(getLayoutPosition());
        }
    }
}
