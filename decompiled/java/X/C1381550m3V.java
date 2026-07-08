package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.contacts.api.model.MAFIMUser;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: renamed from: X.0m3V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1381550m3V extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LLJI = 0;
    public SharePanelViewModel LL;
    public final InterfaceC1362600lYw LLILLJJLI;
    public MAFIMUser LLILLL;
    public final C1362940lZU LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;

    static {
        new C1363490laN();
    }

    public final RelationButton L5() {
        return (RelationButton) this.LLJ.getValue();
    }

    public final void I5(MAFIMUser mAFIMUser, SharePanelViewModel sharePanelViewModel) {
        this.LL = sharePanelViewModel;
        this.LLILLL = mAFIMUser;
        User userLIZIZ = C2201951BFx.LIZIZ(mAFIMUser);
        userLIZIZ.setFollowerStatus(1);
        C0HX6 c0hx6 = (C0HX6) this.LLILZIL.getValue();
        c0hx6.setUserData(new UserVerify(userLIZIZ.getAvatarThumb(), userLIZIZ.getCustomVerify(), userLIZIZ.getEnterpriseVerifyReason(), Integer.valueOf(userLIZIZ.getVerificationType())));
        c0hx6.LIZ();
        C0QB7 c0qb7 = (C0QB7) this.LLIZLLLIL.getValue();
        TuxTextView tuxTextView = (TuxTextView) this.LLIZ.getValue();
        C786410Ut5.u1(c0qb7, 8);
        C786410Ut5.LLLLZLL(tuxTextView, 8);
        if (userLIZIZ.getMutualStruct() != null) {
            C786410Ut5.u1(c0qb7, 0);
            C786410Ut5.LLLLZLL(tuxTextView, 4);
            c0qb7.setTextColor(C960203pA.LIZ(R.attr.a1k, this.itemView.getContext()));
            c0qb7.LIZ(userLIZIZ.getMutualStruct(), 4);
        } else if (C123100dR.LIZ(userLIZIZ.getRecommendReason())) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            tuxTextView.setText(userLIZIZ.getRecommendReason());
        }
        ((TextView) this.LLILZLL.getValue()).setText(userLIZIZ.getNickname());
        RelationButton relationButtonL5 = L5();
        C1387050mCN c1387050mCN = new C1387050mCN(userLIZIZ);
        c1387050mCN.LJ = EnumC1387060mCO.FRIENDS;
        relationButtonL5.LLLLZIL(c1387050mCN.LIZ());
        L5().setRequestListener(new AwS635S0100000_21(this, 193));
        L5().setFollowClickListener(new AwS635S0100000_21(this, 194));
        L5().setButtonSize(0);
        C786410Ut5.t0(L5(), 0);
        this.LLILZ.LIZLLL = mAFIMUser;
    }

    public C1381550m3V(View view, SharePanelViewModel sharePanelViewModel, InterfaceC1362600lYw interfaceC1362600lYw) {
        super(view);
        this.LL = sharePanelViewModel;
        this.LLILLJJLI = interfaceC1362600lYw;
        this.LLILZ = new C1362940lZU(sharePanelViewModel, interfaceC1362600lYw);
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLILZIL = C452501pT.LIZ(enumC452301pR, new AwS565S0100000_21(view, 1563));
        this.LLILZLL = C452501pT.LIZ(enumC452301pR, new AwS565S0100000_21(view, 1566));
        this.LLIZ = C452501pT.LIZ(enumC452301pR, new AwS565S0100000_21(view, 1567));
        this.LLIZLLLIL = C452501pT.LIZ(enumC452301pR, new AwS565S0100000_21(view, 1565));
        this.LLJ = C452501pT.LIZ(enumC452301pR, new AwS565S0100000_21(view, 1564));
    }
}
