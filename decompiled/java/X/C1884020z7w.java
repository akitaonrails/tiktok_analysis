package X;

import Y.ACListenerS62S1200000_28;
import android.text.method.LinkMovementMethod;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.topnotice.topnotice.SessionListTopNoticeViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0z7w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1884020z7w extends RecyclerView.ViewHolder implements InterfaceC1508640pMU {
    public static final /* synthetic */ int LLILZ = 0;
    public final TuxIconView LL;
    public final TuxTextView LLILLJJLI;
    public final TuxIconView LLILLL;

    @Override // X.InterfaceC1508640pMU
    public final String T() {
        return "TopNoticeUnifiedAgeServiceAgeDownViewHolder";
    }

    public C1884020z7w(View view) {
        super(view);
        this.LL = (TuxIconView) view.findViewById(R.id.ka3);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.ka4);
        tuxTextView.setMovementMethod(new LinkMovementMethod());
        this.LLILLJJLI = tuxTextView;
        this.LLILLL = (TuxIconView) view.findViewById(R.id.ka2);
    }

    public final void I5(SessionListTopNoticeViewModel sessionListTopNoticeViewModel, C1868720yjG c1868720yjG) {
        this.LL.setIconRes(c1868720yjG.LIZJ);
        this.LLILLJJLI.setText(c1868720yjG.LIZIZ.invoke(this.itemView.getContext()));
        C786410Ut5.a9(this.LLILLL, new ACListenerS62S1200000_28(sessionListTopNoticeViewModel, c1868720yjG, 1));
        c1868720yjG.LIZLLL.invoke();
    }
}
