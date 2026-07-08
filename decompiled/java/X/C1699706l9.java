package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.matchedfriends.data.MatchedFriendsKeva;
import com.ss.android.ugc.aweme.im.service.service.IMatchedFriendsAnalytics;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.06l9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1699706l9 extends FrameLayout implements InterfaceC1632106aF {
    public final /* synthetic */ C1631706aB LL;
    public C430210Gtv LLILLJJLI;
    public View LLILLL;
    public ConstraintLayout LLILZ;
    public C197039127h LLILZIL;
    public TuxTextView LLILZLL;
    public TuxIconView LLIZ;
    public RelationButton LLIZLLLIL;
    public boolean LLJ;
    public IMUser LLJI;

    @Override // X.InterfaceC1632106aF
    public final void LJIILIIL() {
        this.LL.LJIILIIL();
    }

    @Override // X.C06OA
    public final void LLLZIL(C06MF c06mf) {
        this.LL.LLLZIL(c06mf);
    }

    @Override // X.C06OA
    public final void LLZLI() {
        this.LL.LLZLI();
    }

    @Override // X.C06OA
    public final void l(C06MF c06mf) {
        this.LL.l(c06mf);
    }

    public final C430210Gtv getAvatarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bh2);
            this.LLILLJJLI = (C430210Gtv) callbackFindViewById;
        }
        return (C430210Gtv) callbackFindViewById;
    }

    public final TuxIconView getCloseButtonFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.e1j);
            this.LLIZ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final C197039127h getFirstButtonFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.hzc);
            this.LLILZIL = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final ConstraintLayout getPopupContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ri2);
            this.LLILZ = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final View getPopupTopSeparatorFromXml() {
        View view = this.LLILLL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.ria);
        this.LLILLL = viewFindViewById;
        return viewFindViewById;
    }

    public final RelationButton getRelationBtnFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.t4f);
            this.LLIZLLLIL = (RelationButton) callbackFindViewById;
        }
        return (RelationButton) callbackFindViewById;
    }

    public final TuxTextView getTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.title);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void setAvatarFromXml(C430210Gtv c430210Gtv) {
        this.LLILLJJLI = c430210Gtv;
    }

    public final void setCloseButtonFromXml(TuxIconView tuxIconView) {
        this.LLIZ = tuxIconView;
    }

    public final void setFirstButtonFromXml(C197039127h c197039127h) {
        this.LLILZIL = c197039127h;
    }

    public final void setPopupContainerFromXml(ConstraintLayout constraintLayout) {
        this.LLILZ = constraintLayout;
    }

    public final void setPopupTopSeparatorFromXml(View view) {
        this.LLILLL = view;
    }

    public final void setRelationBtnFromXml(RelationButton relationButton) {
        this.LLIZLLLIL = relationButton;
    }

    public final void setTitleFromXml(TuxTextView tuxTextView) {
        this.LLILZLL = tuxTextView;
    }

    public C1699706l9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new C1631706aB();
    }

    public static int LIZ(String str, boolean z) {
        int iLJFF = MatchedFriendsKeva.LIZ.LJFF(str);
        if (iLJFF != 0 && iLJFF != 1 && iLJFF != 2) {
            return 7;
        }
        if (!z) {
            return 1;
        }
        return 3;
    }

    public static void LIZIZ(IMUser iMUser, int i) {
        String str;
        if (iMUser != null) {
            if (iMUser.getFollowerStatus() == 1) {
                str = "follow_back";
            } else {
                str = "follow";
            }
            IMUser.Companion.getClass();
            String strLJJIFFI = C735370Ssx.LJJIFFI(C2201941BFw.LJII(iMUser));
            IMatchedFriendsAnalytics.LIZ.getClass();
            IMatchedFriendsAnalytics value = C1699806lA.LIZIZ.getValue();
            if (value != null) {
                String uid = iMUser.getUid();
                if (uid == null) {
                    uid = "";
                }
                value.LJ(uid, str, iMUser.getRecType(), String.valueOf(i), strLJJIFFI, C0I0B.LJFF.LIZIZ());
            }
        }
    }

    public static void LIZJ(int i, String str, boolean z) {
        MatchedFriendsKeva matchedFriendsKeva = MatchedFriendsKeva.LIZ;
        if (str == null) {
            matchedFriendsKeva.getClass();
            return;
        }
        if (z) {
            Keva kevaLJI = matchedFriendsKeva.LJI();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("key_maf_follow_popup_show_num");
            sbLIZ2.append(MatchedFriendsKeva.LJ());
            sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
            sbLIZ.append(str);
            kevaLJI.storeInt(C2188811AlT.LIZIZ(sbLIZ), matchedFriendsKeva.LJFF(str) + 1);
        }
        Keva kevaLJI2 = matchedFriendsKeva.LJI();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("key_maf_follow_popup_timestamp");
        sbLIZ4.append(MatchedFriendsKeva.LJ());
        sbLIZ3.append(C2188811AlT.LIZIZ(sbLIZ4));
        sbLIZ3.append(str);
        kevaLJI2.storeLong(C2188811AlT.LIZIZ(sbLIZ3), System.currentTimeMillis() + (((long) i) * 86400000));
    }
}
