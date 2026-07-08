package X;

import Y.ACListenerS162S0100000_28;
import Y.ACListenerS89S1100000_28;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.topnotice.topnotice.SessionListTopNoticeViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0z2t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1880890z2t extends RecyclerView.ViewHolder implements InterfaceC1508640pMU {
    public static final /* synthetic */ int LLILZIL = 0;
    public final C197039127h LL;
    public final ImageView LLILLJJLI;
    public final TextView LLILLL;
    public final TextView LLILZ;

    @Override // X.InterfaceC1508640pMU
    public final String T() {
        return "TopNoticeViewHolder";
    }

    public C1880890z2t(View view) {
        super(view);
        this.LL = (C197039127h) view.findViewById(R.id.kaq);
        this.LLILLJJLI = (ImageView) view.findViewById(R.id.jud);
        this.LLILLL = (TextView) view.findViewById(R.id.zqa);
        this.LLILZ = (TextView) view.findViewById(R.id.c7x);
    }

    public final void I5(C1868660yjA c1868660yjA, SessionListTopNoticeViewModel sessionListTopNoticeViewModel) {
        C786410Ut5.U8(this.LL, new ACListenerS162S0100000_28(sessionListTopNoticeViewModel, 54));
        C786410Ut5.Q7(this.LLILLJJLI, new ACListenerS89S1100000_28(sessionListTopNoticeViewModel, 3));
        if (c1868660yjA.LIZIZ instanceof C1868640yj8) {
            this.LLILLL.setText(this.itemView.getContext().getString(((C1868640yj8) c1868660yjA.LIZIZ).LIZ));
        }
        if (c1868660yjA.LIZJ instanceof C1868640yj8) {
            this.LLILZ.setText(this.itemView.getContext().getString(((C1868640yj8) c1868660yjA.LIZJ).LIZ));
        }
        InterfaceC1868700yjE interfaceC1868700yjE = c1868660yjA.LIZLLL;
        if (interfaceC1868700yjE instanceof C1868710yjF) {
            C786410Ut5.LLLLLLJ(this.LL, 8);
            return;
        }
        if (interfaceC1868700yjE instanceof C1868640yj8) {
            C786410Ut5.LLLLLLJ(this.LL, 0);
            this.LL.setText(this.itemView.getContext().getString(((C1868640yj8) c1868660yjA.LIZLLL).LIZ));
        } else {
            if (interfaceC1868700yjE instanceof C1169804hs) {
                C786410Ut5.LLLLLLJ(this.LL, 0);
                C197039127h c197039127h = this.LL;
                c1868660yjA.LIZLLL.getClass();
                c197039127h.setText((CharSequence) null);
                return;
            }
            throw new C1954807lC();
        }
    }
}
