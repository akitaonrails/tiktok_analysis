package X;

import Y.ACListenerS124S0200000_21;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0laU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1363560laU extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LLILZIL = 0;
    public SharePanelViewModel LL;
    public IMContact LLILLJJLI;
    public int LLILLL;
    public final C1361580lXI LLILZ;

    public C1363560laU(View view, SharePanelViewModel sharePanelViewModel) {
        super(view);
        this.LL = sharePanelViewModel;
        this.LLILLL = -1;
        this.LLILZ = new C1361580lXI();
        C786410Ut5.O7((FrameLayout) view.findViewById(R.id.bj1), new ACListenerS124S0200000_21(view, this, 89));
        C2211751BhN.LIZ(view, this.LLILZ);
    }
}
