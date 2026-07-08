package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0OLO, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OLO extends LinearLayout {
    public C427660Gpo LL;
    public C419060Gbw LLILLJJLI;
    public LinearLayout LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxIconView LLILZLL;
    public TuxTextView LLIZ;
    public LinearLayout LLIZLLLIL;

    public final C419060Gbw getBulletinPageBarInfoAreaFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d1z);
            this.LLILLJJLI = (C419060Gbw) callbackFindViewById;
        }
        return (C419060Gbw) callbackFindViewById;
    }

    public final LinearLayout getBulletinPageBarInfoAreaSubFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d20);
            this.LLILLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final C427660Gpo getBulletinPageBarInfoAvatarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d21);
            this.LL = (C427660Gpo) callbackFindViewById;
        }
        return (C427660Gpo) callbackFindViewById;
    }

    public final TuxTextView getBulletinPageBarInfoMemberFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d22);
            this.LLIZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getBulletinPageBarInfoNameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d23);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout getBulletinPageBarInfoRootFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d24);
            this.LLIZLLLIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getBulletinPageBarInfoUsernameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d25);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxIconView getBulletinPageBarInfoUsernameIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d26);
            this.LLILZLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public C0OLO(Context context) {
        TuxTextView bulletinPageBarInfoNameFromXml;
        LinearLayout.LayoutParams layoutParams;
        super(context, null, 0);
        LinearLayout.inflate(context, R.layout.a8o, this);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "bulletin_fix_name_truncation_setting", true, true) && (bulletinPageBarInfoNameFromXml = getBulletinPageBarInfoNameFromXml()) != null) {
            ViewGroup.LayoutParams layoutParams2 = bulletinPageBarInfoNameFromXml.getLayoutParams();
            if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null && layoutParams.weight != 0.0f) {
                layoutParams.weight = 0.0f;
                layoutParams.width = -2;
                C786410Ut5.R6(bulletinPageBarInfoNameFromXml, layoutParams);
            }
        }
    }

    public final void setAccountNameAndIcon(BulletinBoardInfo bulletinBoardInfo) {
        C698190Ra5 c698190Ra5LJII;
        String nickname;
        if (bulletinBoardInfo.accountType == C0OL2.BULLETIN_ACCOUNT_TYPE_LIVE_ARENA.getType()) {
            TuxImageModel tuxImageModel = bulletinBoardInfo.accountIcon;
            if (tuxImageModel != null && (c698190Ra5LJII = C0OSB.LJII(getContext(), tuxImageModel)) != null) {
                C12ES.LJIILL(0, getBulletinPageBarInfoUsernameFromXml());
                C12ES.LJIILL(0, getBulletinPageBarInfoUsernameIconFromXml());
                TuxTextView bulletinPageBarInfoUsernameFromXml = getBulletinPageBarInfoUsernameFromXml();
                User user = bulletinBoardInfo.channelOwner;
                if (user != null) {
                    nickname = user.getNickname();
                } else {
                    nickname = null;
                }
                bulletinPageBarInfoUsernameFromXml.setText(nickname);
                TuxIconView bulletinPageBarInfoUsernameIconFromXml = getBulletinPageBarInfoUsernameIconFromXml();
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = c698190Ra5LJII.LIZ;
                c419910GdJ.LIZLLL = c698190Ra5LJII.LIZIZ;
                bulletinPageBarInfoUsernameIconFromXml.setTuxIcon(c419910GdJ);
                return;
            }
            C0DTR.LIZIZ(getBulletinPageBarInfoUsernameFromXml());
            C0DTR.LIZIZ(getBulletinPageBarInfoUsernameIconFromXml());
            return;
        }
        C0DTR.LIZIZ(getBulletinPageBarInfoUsernameFromXml());
        C0DTR.LIZIZ(getBulletinPageBarInfoUsernameIconFromXml());
    }

    public final void setAvatar(String str) {
        C427660Gpo.LJIIJJI(getBulletinPageBarInfoAvatarFromXml(), str, false, null, null, false, false, null, null, false, null, 1022);
    }

    public final void setBulletinPageBarInfoAreaFromXml(C419060Gbw c419060Gbw) {
        this.LLILLJJLI = c419060Gbw;
    }

    public final void setBulletinPageBarInfoAreaSubFromXml(LinearLayout linearLayout) {
        this.LLILLL = linearLayout;
    }

    public final void setBulletinPageBarInfoAvatarFromXml(C427660Gpo c427660Gpo) {
        this.LL = c427660Gpo;
    }

    public final void setBulletinPageBarInfoMemberFromXml(TuxTextView tuxTextView) {
        this.LLIZ = tuxTextView;
    }

    public final void setBulletinPageBarInfoNameFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setBulletinPageBarInfoRootFromXml(LinearLayout linearLayout) {
        this.LLIZLLLIL = linearLayout;
    }

    public final void setBulletinPageBarInfoUsernameFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public final void setBulletinPageBarInfoUsernameIconFromXml(TuxIconView tuxIconView) {
        this.LLILZLL = tuxIconView;
    }

    public final void setMarginEnd(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getBulletinPageBarInfoRootFromXml().getLayoutParams();
        marginLayoutParams.setMarginEnd(i);
        C786410Ut5.d6(getBulletinPageBarInfoRootFromXml(), marginLayoutParams);
    }

    public final void setMembers(Long l) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setMembers: subscriberCount = ");
        sbLIZ.append(l);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        if (l != null) {
            long jLongValue = l.longValue();
            if (jLongValue >= 0) {
                getBulletinPageBarInfoMemberFromXml().setText(C0OPX.LJFF(2131755123, jLongValue));
            }
        }
    }

    public final void setName(String str) {
        getBulletinPageBarInfoNameFromXml().setText(str);
    }
}
