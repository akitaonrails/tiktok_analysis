package X;

import Y.ACListenerS130S0200000_28;
import Y.ACListenerS89S1100000_28;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.topnotice.topnotice.SessionListTopNoticeViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0z2v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1880910z2v extends RecyclerView.ViewHolder implements InterfaceC1508640pMU {
    public static final /* synthetic */ int LLILZ = 0;
    public final TuxTextView LL;
    public final TuxIconView LLILLJJLI;
    public final C197039127h LLILLL;

    @Override // X.InterfaceC1508640pMU
    public final String T() {
        return "TopNoticeDmPermissionViewHolder";
    }

    public C1880910z2v(View view) {
        super(view);
        this.LL = (TuxTextView) view.findViewById(R.id.title);
        this.LLILLJJLI = (TuxIconView) view.findViewById(R.id.jv0);
        this.LLILLL = (C197039127h) view.findViewById(R.id.yzf);
    }

    public final void I5(C1868650yj9 c1868650yj9, SessionListTopNoticeViewModel sessionListTopNoticeViewModel, EnumC1783110wVB enumC1783110wVB) {
        int i;
        C1868640yj8 c1868640yj8;
        InterfaceC1868700yjE interfaceC1868700yjE = c1868650yj9.LIZIZ;
        if (interfaceC1868700yjE instanceof C1868710yjF) {
            C786410Ut5.LJLLLLLL(8, this.LL);
        } else if (interfaceC1868700yjE instanceof C1868640yj8) {
            C786410Ut5.LJLLLLLL(0, this.LL);
            this.LL.setText(this.itemView.getContext().getString(((C1868640yj8) c1868650yj9.LIZIZ).LIZ));
        } else if (interfaceC1868700yjE instanceof C1169804hs) {
            C786410Ut5.LJLLLLLL(0, this.LL);
            TuxTextView tuxTextView = this.LL;
            c1868650yj9.LIZIZ.getClass();
            tuxTextView.setText((CharSequence) null);
        } else {
            throw new C1954807lC();
        }
        C786410Ut5.a9(this.LLILLJJLI, new ACListenerS89S1100000_28(sessionListTopNoticeViewModel, 2));
        InterfaceC1868700yjE interfaceC1868700yjE2 = c1868650yj9.LIZJ;
        if ((interfaceC1868700yjE2 instanceof C1868640yj8) && (c1868640yj8 = (C1868640yj8) interfaceC1868700yjE2) != null) {
            this.LLILLL.setButtonSize(1);
            C197039127h c197039127h = this.LLILLL;
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(6));
            c197039127h.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
            i = c1868640yj8.LIZ;
        } else {
            i = 2131831901;
        }
        this.LLILLL.setText(this.itemView.getContext().getString(i));
        C786410Ut5.U8(this.LLILLL, new ACListenerS130S0200000_28(sessionListTopNoticeViewModel, enumC1783110wVB, 25));
    }
}
