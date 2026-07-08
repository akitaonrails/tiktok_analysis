package X;

import Y.ACListenerS124S0200000_21;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AwS565S0100000_21;
import u4.q0;

/* JADX INFO: renamed from: X.0laW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1363580laW extends RecyclerView.ViewHolder implements InterfaceC1363770lap {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public SharePanelViewModel LL;
    public final InterfaceC1362600lYw LLILLJJLI;
    public final TuxIconView LLILLL;
    public final int LLILZ;
    public IMContact LLILZIL;
    public final C1361580lXI LLILZLL;
    public int LLIZ;

    static {
        new C1363590laX();
    }

    @Override // X.InterfaceC1363770lap
    public final void onDetachedFromWindow() {
    }

    @Override // X.InterfaceC1363770lap
    public final void onAttachedToWindow() {
        IMUser iMUser;
        HashMap<String, String> map = new HashMap<>();
        map.put("to_user_id", "more");
        map.put("rank_index", String.valueOf(this.LLIZ));
        map.put("icon_type", "search_icon");
        Object objValueOf = "";
        map.put("share_relation_type", "");
        map.put("panel_source", "long_press");
        IMContact iMContact = this.LLILZIL;
        if ((iMContact instanceof IMUser) && (iMUser = (IMUser) iMContact) != null) {
            objValueOf = Integer.valueOf(iMUser.getFollowStatus());
        }
        map.put("share_follow_status", objValueOf.toString());
        InterfaceC1362600lYw interfaceC1362600lYw = this.LLILLJJLI;
        if (interfaceC1362600lYw != null) {
            interfaceC1362600lYw.LIZLLL(map);
        }
    }

    public C1363580laW(View view, SharePanelViewModel sharePanelViewModel, InterfaceC1362600lYw interfaceC1362600lYw) {
        super(view);
        this.LL = sharePanelViewModel;
        this.LLILLJJLI = interfaceC1362600lYw;
        this.LLILZ = R.raw.icon_magnifying_glass_fill;
        this.LLILZLL = new C1361580lXI();
        this.LLIZ = -1;
        q0.LJIILLIIL(R.id.p0w, view);
        this.LLILLL = (TuxIconView) q0.LJIILLIIL(R.id.ol0, view);
        RelativeLayout relativeLayout = (RelativeLayout) q0.LJIILLIIL(R.id.l3m, view);
        C2211751BhN.LIZ(view, this.LLILZLL);
        C786410Ut5.S7(relativeLayout, new ACListenerS124S0200000_21(view, this, 87));
    }

    public final void I5(int i, IMContact iMContact, SharePanelViewModel sharePanelViewModel) {
        this.LLILZIL = iMContact;
        this.LL = sharePanelViewModel;
        Context context = this.LLILLL.getContext();
        int i2 = this.LLILZ;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i2;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.c6);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        c384050F3z.LJFF = Integer.valueOf(R.attr.nd);
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
        this.LLILLL.setImageDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context)));
        this.LLIZ = i;
        this.LLILZLL.LIZ(iMContact, "SHARE_PANEL", new AwS565S0100000_21(this, 1562));
    }
}
