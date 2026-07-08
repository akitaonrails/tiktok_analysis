package X;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0laJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1363450laJ extends RecyclerView.ViewHolder implements InterfaceC1363770lap {
    public static final /* synthetic */ int LLJ = 0;
    public SharePanelViewModel LL;
    public final C197039127h LLILLJJLI;
    public final TextView LLILLL;
    public final C427660Gpo LLILZ;
    public final ConstraintLayout LLILZIL;
    public int LLILZLL;
    public final C1361580lXI LLIZ;
    public AnonymousClass0956 LLIZLLLIL;

    @Override // X.InterfaceC1363770lap
    public final void onAttachedToWindow() {
    }

    @Override // X.InterfaceC1363770lap
    public final void onDetachedFromWindow() {
    }

    public C1363450laJ(View view, SharePanelViewModel sharePanelViewModel) {
        super(view);
        this.LL = sharePanelViewModel;
        this.LLIZ = new C1361580lXI();
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.cuv);
        this.LLILLJJLI = c197039127h;
        this.LLILLL = (TextView) view.findViewById(R.id.p0w);
        this.LLILZ = (C427660Gpo) view.findViewById(R.id.biz);
        this.LLILZIL = (ConstraintLayout) view.findViewById(R.id.l3l);
        if (c197039127h != null) {
            c197039127h.setButtonVariant(1);
        }
        C2211751BhN.LIZ(view, this.LLIZ);
        c197039127h.setButtonVariant(0);
        c197039127h.setWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(78)));
        c197039127h.setMinTextSize(9.0f);
    }
}
