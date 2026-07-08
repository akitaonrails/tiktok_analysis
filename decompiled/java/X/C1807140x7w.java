package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import wh6.AbS706S0100000_27;

/* JADX INFO: renamed from: X.0x7w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1807140x7w extends RecyclerView.ViewHolder implements InterfaceC1807270x89 {
    public final C16F5 LL;

    public C1807140x7w(View view) {
        super(view);
        this.LL = (C16F5) view.findViewById(R.id.fc4);
    }

    @Override // X.InterfaceC1807270x89
    public final void f5(boolean z, Function0 function0) {
        int i;
        C16F5 c16f5 = this.LL;
        if (c16f5 != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLJJJJ(c16f5, i);
        }
        C786410Ut5.I7(new AbS706S0100000_27(function0, 7, 42), this.itemView);
    }
}
