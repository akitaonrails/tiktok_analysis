package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.14m0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20362614m0 extends AbstractC960470b6L<C1868250yiV> {
    public final DataChannel LL;
    public final PlaybookAnchorViewModel LLILLJJLI;
    public final TextView LLILLL;
    public final C16FS LLILZ;

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        C1868250yiV c1868250yiV = (C1868250yiV) obj;
        this.LLILLL.setText(C786410Ut5.j4(C497740JfY.LJIJI(2131855276), Arrays.copyOf(new Object[]{Integer.valueOf(c1868250yiV.LIZIZ), c1868250yiV.LIZ.LIZIZ}, 2)));
        if (!c1868250yiV.LIZ.LIZJ.isEmpty()) {
            List<C20361214lm> list = c1868250yiV.LIZ.LIZJ;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (C20361214lm c20361214lm : list) {
                    Function2<C20361214lm, Context, View> function2 = c20361214lm.LIZJ.LJIIIZ;
                    if (function2 == null || function2.invoke(c20361214lm, this.itemView.getContext()) == null) {
                        C439101nJ.LJI(this.LLILZ);
                        return;
                    }
                }
            }
        }
        this.LLILZ.setRadius(C418440Gaw.LIZIZ(16));
        this.LLILZ.setText(C497740JfY.LJIJI(2131855280));
        C12ES.LJIILL(0, this.LLILZ);
        C500260Jjc.LJLIIIL(500L, this.LLILZ, new C20362814m2(this, c1868250yiV));
    }

    public C20362614m0(View view, DataChannel dataChannel, PlaybookAnchorViewModel playbookAnchorViewModel) {
        super(view);
        this.LL = dataChannel;
        this.LLILLJJLI = playbookAnchorViewModel;
        this.LLILLL = (TextView) view.findViewById(R.id.qrz);
        this.LLILZ = (C16FS) view.findViewById(R.id.qry);
    }
}
