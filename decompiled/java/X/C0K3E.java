package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import wh6.AbS324S0300000_7;

/* JADX INFO: renamed from: X.0K3E, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K3E extends C0K3V {
    public final View LL;
    public final SubSpaceDetailVM LLILLJJLI;
    public final TextView LLILLL;
    public final TextView LLILZ;
    public final TuxIconView LLILZIL;
    public final TextView LLILZLL;

    public C0K3E(View view, SubSpaceDetailVM subSpaceDetailVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceDetailVM;
        this.LLILLL = (TextView) view.findViewById(R.id.rj9);
        this.LLILZ = (TextView) view.findViewById(R.id.rjc);
        this.LLILZIL = (TuxIconView) view.findViewById(R.id.f755mn3);
        this.LLILZLL = (TextView) view.findViewById(R.id.mnh);
    }

    @Override // X.C0K3V
    public final void I5(AbstractC511160K2w abstractC511160K2w, InterfaceC2753014t interfaceC2753014t) {
        C0K3F c0k3f;
        C0K3S c0k3s = null;
        if (abstractC511160K2w instanceof C0K3F) {
            c0k3f = (C0K3F) abstractC511160K2w;
        } else {
            c0k3f = null;
        }
        if (interfaceC2753014t instanceof C0K3S) {
            c0k3s = (C0K3S) interfaceC2753014t;
        }
        if (c0k3f == null || c0k3s == null) {
            return;
        }
        SpacePost spacePost = c0k3f.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('\"');
        sbLIZ.append(spacePost.text);
        sbLIZ.append('\"');
        this.LLILLL.setText(C2188811AlT.LIZIZ(sbLIZ));
        TextView textView = this.LLILZ;
        String strLJII = C511520K4g.LJII(2131839629);
        if (strLJII == null) {
            strLJII = "";
        }
        textView.setText(C786410Ut5.j4(strLJII, Arrays.copyOf(new Object[]{C0K7S.LIZ(c0k3s.LLJI)}, 1)));
        U5(spacePost.likeCount, spacePost.userLiked);
        C786410Ut5.I7(new AbS324S0300000_7(spacePost, this, c0k3f, 5), this.LLILZIL);
    }

    public final void U5(long j, boolean z) {
        int i;
        int i2;
        if (j > 0) {
            this.LLILZLL.setText(C511410K3v.LIZIZ(j));
            C786410Ut5.LLIL(this.LLILZLL, 0);
        } else {
            C786410Ut5.LLIL(this.LLILZLL, 8);
        }
        this.LLILZLL.requestLayout();
        TuxIconView tuxIconView = this.LLILZIL;
        C419910GdJ c419910GdJ = new C419910GdJ();
        Context context = this.LL.getContext();
        if (z) {
            i = R.attr.f9d;
        } else {
            i = R.attr.f9c;
        }
        c419910GdJ.LIZ = C426930God.LIZLLL(i, context);
        if (z) {
            i2 = R.attr.f_9;
        } else {
            i2 = R.attr.f_i;
        }
        c419910GdJ.LJ = Integer.valueOf(i2);
        tuxIconView.setTuxIcon(c419910GdJ);
    }
}
