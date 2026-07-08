package X;

import Y.ACListenerS155S0100000_21;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0lZK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1362840lZK extends RecyclerView.ViewHolder implements InterfaceC1363770lap {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public SharePanelViewModel LL;
    public final EnumC994650bzT LLILLJJLI;
    public final InterfaceC1362600lYw LLILLL;
    public final TuxIconView LLILZ;
    public IMContact LLILZIL;
    public int LLILZLL;
    public final C1361580lXI LLIZ;

    @Override // X.InterfaceC1363770lap
    public final void onDetachedFromWindow() {
    }

    @Override // X.InterfaceC1363770lap
    public final void onAttachedToWindow() {
        IMUser iMUser;
        HashMap<String, String> map = new HashMap<>();
        map.put("to_user_id", "more");
        map.put("rank_index", String.valueOf(this.LLILZLL));
        map.put("icon_type", "search_icon");
        Object objValueOf = "";
        map.put("share_relation_type", "");
        map.put("panel_source", "share_panel");
        IMContact iMContact = this.LLILZIL;
        if ((iMContact instanceof IMUser) && (iMUser = (IMUser) iMContact) != null) {
            objValueOf = Integer.valueOf(iMUser.getFollowStatus());
        }
        map.put("share_follow_status", objValueOf.toString());
        InterfaceC1362600lYw interfaceC1362600lYw = this.LLILLL;
        if (interfaceC1362600lYw != null) {
            interfaceC1362600lYw.LIZLLL(map);
        }
    }

    public final Drawable I5(int i, Context context) {
        C1362230lYL c1362230lYL = this.LL.LLJI;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        if (c1362230lYL != null) {
            int i2 = c1362230lYL.LJIILIIL;
            c419910GdJ.LIZIZ = i2;
            c419910GdJ.LIZJ = i2;
        } else {
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        }
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.br);
        if (c1362230lYL != null) {
            c384050F3z.LIZJ = Float.valueOf(c1362230lYL.LJIIL / 2.0f);
            int i3 = c1362230lYL.LJIIL;
            c384050F3z.LJII = i3;
            c384050F3z.LJI = i3;
        } else {
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        }
        return C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context));
    }

    public C1362840lZK(View view, SharePanelViewModel sharePanelViewModel, EnumC994650bzT enumC994650bzT, InterfaceC1362600lYw interfaceC1362600lYw) {
        super(view);
        this.LL = sharePanelViewModel;
        this.LLILLJJLI = enumC994650bzT;
        this.LLILLL = interfaceC1362600lYw;
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.du3);
        this.LLILZ = tuxIconView;
        this.LLILZLL = -1;
        this.LLIZ = new C1361580lXI();
        C786410Ut5.a9(tuxIconView, new ACListenerS155S0100000_21(this, 260));
        tuxIconView.setImportantForAccessibility(2);
        C2211751BhN.LIZ(view, this.LLIZ);
    }
}
