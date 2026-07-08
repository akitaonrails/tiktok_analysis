package X;

import Y.ACListenerS124S0200000_21;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0laP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1363510laP extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LLILLL = 0;
    public SharePanelViewModel LL;
    public final C1361580lXI LLILLJJLI;

    public final void I5(boolean z) {
        if (z) {
            C786410Ut5.x5((TuxIconView) this.itemView.findViewById(R.id.lkw), 1.0f);
            C786410Ut5.B5((TuxTextView) this.itemView.findViewById(R.id.tv_title), 1.0f);
        } else {
            C786410Ut5.x5((TuxIconView) this.itemView.findViewById(R.id.lkw), 0.34f);
            C786410Ut5.B5((TuxTextView) this.itemView.findViewById(R.id.tv_title), 0.34f);
        }
    }

    public final void L5(IMContact iMContact) {
        if (!this.LL.LJIILL().isEmpty()) {
            C786410Ut5.I7(null, this.itemView);
            I5(false);
        } else {
            I5(true);
            C786410Ut5.I7(new ACListenerS124S0200000_21(iMContact, this, 98), this.itemView);
        }
    }

    public C1363510laP(View view, SharePanelViewModel sharePanelViewModel) {
        super(view);
        this.LL = sharePanelViewModel;
        this.LLILLJJLI = new C1361580lXI();
        C2211751BhN.LIZ(view, this.LLILLJJLI);
    }
}
