package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.notification.aggregate.data.BulletinAggregateNotice;
import com.ss.android.ugc.aweme.notification.aggregate.data.TemplateAggregateLeftUiInfo;
import com.ss.android.ugc.aweme.notification.aggregate.data.TemplateAggregateUiInfo;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS310S0000000_24;
import kotlin.jvm.internal.AFwS315S0000000_28;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0zjD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1907130zjD extends AbstractViewOnClickListenerC1840840y0I {
    public C1907300zjU LLILZ;
    public ConstraintLayout LLILZIL;
    public SmartAvatarImageView LLILZLL;
    public SmartAvatarImageView LLIZ;
    public C1609500rzA LLIZLLLIL;
    public TemplateAggregateLeftUiInfo LLJ;

    @Override // X.AbstractViewOnClickListenerC1840840y0I
    public final void e0() {
        String str;
        TemplateAggregateLeftUiInfo templateAggregateLeftUiInfo;
        List<User> list;
        TemplateAggregateLeftUiInfo templateAggregateLeftUiInfo2;
        List<User> list2;
        User user;
        String str2;
        TemplateAggregateLeftUiInfo templateAggregateLeftUiInfo3 = this.LLJ;
        if (templateAggregateLeftUiInfo3 == null || (str = templateAggregateLeftUiInfo3.schemeUrl) == null || !u.LJJIIJZLJL(str, "aweme://user/profile/", false) || (templateAggregateLeftUiInfo = this.LLJ) == null || (list = templateAggregateLeftUiInfo.fromUsers) == null || !C866950Xzh.LIZIZ(list) || (templateAggregateLeftUiInfo2 = this.LLJ) == null || (list2 = templateAggregateLeftUiInfo2.fromUsers) == null || (user = (User) ListProtector.get(list2, 0)) == null) {
            return;
        }
        C735410St1 c735410St1 = new C735410St1();
        c735410St1.LJJLIIJ = user.getUid();
        c735410St1.LIZLLL = "notification_page";
        c735410St1.LJJLIIIJILLIZJL = "click_head";
        C1365450ldX.LIZLLL(c735410St1, user);
        MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
        if (matchedFriendStruct == null || (str2 = matchedFriendStruct.recType) == null) {
            str2 = "";
        }
        c735410St1.LJIJJ = str2;
        c735410St1.LJIILJJIL();
    }

    public final C1609500rzA getFlNowAvatarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.i8g);
            this.LLIZLLLIL = (C1609500rzA) callbackFindViewById;
        }
        return (C1609500rzA) callbackFindViewById;
    }

    public final ConstraintLayout getNotificationHeadDoubleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pe2);
            this.LLILZIL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final C1907300zjU getNotificationHeadSingleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pe4);
            this.LLILZ = (C1907300zjU) callbackFindViewById;
        }
        return (C1907300zjU) callbackFindViewById;
    }

    public final SmartAvatarImageView getNotificationHeadUser1FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pe5);
            this.LLILZLL = (SmartAvatarImageView) callbackFindViewById;
        }
        return (SmartAvatarImageView) callbackFindViewById;
    }

    public final SmartAvatarImageView getNotificationHeadUser2FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pe6);
            this.LLIZ = (SmartAvatarImageView) callbackFindViewById;
        }
        return (SmartAvatarImageView) callbackFindViewById;
    }

    @Override // X.AbstractViewOnClickListenerC1840840y0I
    public final String i0(View view) {
        TemplateAggregateLeftUiInfo templateAggregateLeftUiInfo = this.LLJ;
        if (templateAggregateLeftUiInfo != null) {
            return templateAggregateLeftUiInfo.schemeUrl;
        }
        return null;
    }

    @Override // X.AbstractViewOnClickListenerC1840840y0I
    public final boolean j0(View view) {
        String strI0 = i0(view);
        if (strI0 != null) {
            l0(strI0);
            return true;
        }
        return false;
    }

    public final void setFlNowAvatarFromXml(C1609500rzA c1609500rzA) {
        this.LLIZLLLIL = c1609500rzA;
    }

    public final void setNotificationHeadDoubleFromXml(ConstraintLayout constraintLayout) {
        this.LLILZIL = constraintLayout;
    }

    public final void setNotificationHeadSingleFromXml(C1907300zjU c1907300zjU) {
        this.LLILZ = c1907300zjU;
    }

    public final void setNotificationHeadUser1FromXml(SmartAvatarImageView smartAvatarImageView) {
        this.LLILZLL = smartAvatarImageView;
    }

    public final void setNotificationHeadUser2FromXml(SmartAvatarImageView smartAvatarImageView) {
        this.LLIZ = smartAvatarImageView;
    }

    public C1907130zjD(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // X.AbstractViewOnClickListenerC1840840y0I
    public final void h0(BulletinAggregateNotice bulletinAggregateNotice, C1840830y0H c1840830y0H) {
        TemplateAggregateLeftUiInfo templateAggregateLeftUiInfo;
        String avatarSceneTag;
        EnumC1906770zid enumC1906770zidLJJLIIIJLJLI;
        EnumC1906770zid enumC1906770zidLJJLIIIJLJLI2;
        EnumC1906770zid enumC1906770zidLJJLIIIJLJLI3;
        EnumC1906770zid enumC1906770zidLJJLIIIJLJLI4;
        super.h0(bulletinAggregateNotice, c1840830y0H);
        TemplateAggregateUiInfo uiInfo = getUiInfo();
        String avatarSceneTag2 = null;
        if (uiInfo != null) {
            templateAggregateLeftUiInfo = uiInfo.leftUiInfo;
        } else {
            templateAggregateLeftUiInfo = null;
        }
        this.LLJ = templateAggregateLeftUiInfo;
        C786410Ut5.ga(getNotificationHeadSingleFromXml(), this);
        C786410Ut5.Y7(getNotificationHeadDoubleFromXml(), this);
        C1387040mCM.LIZ(getNotificationHeadSingleFromXml(), AFwS310S0000000_24.get$arr$(65));
        C1387040mCM.LIZ(getNotificationHeadDoubleFromXml(), AFwS310S0000000_24.get$arr$(66));
        TemplateAggregateLeftUiInfo templateAggregateLeftUiInfo2 = this.LLJ;
        if (templateAggregateLeftUiInfo2 != null) {
            C1609500rzA flNowAvatarFromXml = getFlNowAvatarFromXml();
            int visibility = flNowAvatarFromXml.getVisibility();
            flNowAvatarFromXml.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, flNowAvatarFromXml);
            C786410Ut5.j0(getNotificationHeadSingleFromXml(), 0);
            C786410Ut5.LL(8, getNotificationHeadDoubleFromXml());
            List list = templateAggregateLeftUiInfo2.fromUsers;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            if (templateAggregateLeftUiInfo2.avatarImageUrl != null) {
                UserVerify userVerify = new UserVerify(templateAggregateLeftUiInfo2.avatarImageUrl, null, null, -1);
                C1907300zjU notificationHeadSingleFromXml = getNotificationHeadSingleFromXml();
                InterfaceC1840850y0J delegate = getDelegate();
                if (delegate != null && (enumC1906770zidLJJLIIIJLJLI4 = delegate.LJJLIIIJLJLI()) != null) {
                    avatarSceneTag2 = enumC1906770zidLJJLIIIJLJLI4.getAvatarSceneTag();
                }
                notificationHeadSingleFromXml.LIZLLL(userVerify, avatarSceneTag2);
                return;
            }
            if (list.size() == 1) {
                C1910480zoc c1910480zoc = C1910480zoc.LIZ;
                User user = (User) ListProtector.get(list, 0);
                Context context = getContext();
                C1907300zjU notificationHeadSingleFromXml2 = getNotificationHeadSingleFromXml();
                c1910480zoc.getClass();
                UserVerify userVerify2 = new UserVerify(C1910480zoc.LIZ(context, notificationHeadSingleFromXml2, user), ((User) ListProtector.get(list, 0)).getCustomVerify(), ((User) ListProtector.get(list, 0)).getEnterpriseVerifyReason(), Integer.valueOf(((User) ListProtector.get(list, 0)).getVerificationType()));
                C1907300zjU notificationHeadSingleFromXml3 = getNotificationHeadSingleFromXml();
                InterfaceC1840850y0J delegate2 = getDelegate();
                if (delegate2 != null && (enumC1906770zidLJJLIIIJLJLI3 = delegate2.LJJLIIIJLJLI()) != null) {
                    avatarSceneTag2 = enumC1906770zidLJJLIIIJLJLI3.getAvatarSceneTag();
                }
                notificationHeadSingleFromXml3.LIZLLL(userVerify2, avatarSceneTag2);
                getNotificationHeadSingleFromXml().LIZ();
                return;
            }
            if (list.size() > 1) {
                C786410Ut5.j0(getNotificationHeadSingleFromXml(), 8);
                C786410Ut5.LL(0, getNotificationHeadDoubleFromXml());
                C1910480zoc c1910480zoc2 = C1910480zoc.LIZ;
                User user2 = (User) ListProtector.get(list, 0);
                Context context2 = getContext();
                SmartAvatarImageView notificationHeadUser1FromXml = getNotificationHeadUser1FromXml();
                c1910480zoc2.getClass();
                ImageUrlModel imageUrlModelLIZ = C438710HIf.LIZ(C1910480zoc.LIZ(context2, notificationHeadUser1FromXml, user2));
                ImageUrlModel imageUrlModelLIZ2 = C438710HIf.LIZ(C1910480zoc.LIZ(getContext(), getNotificationHeadUser2FromXml(), (User) ListProtector.get(list, 1)));
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(imageUrlModelLIZ);
                InterfaceC1840850y0J delegate3 = getDelegate();
                if (delegate3 != null && (enumC1906770zidLJJLIIIJLJLI2 = delegate3.LJJLIIIJLJLI()) != null) {
                    avatarSceneTag = enumC1906770zidLJJLIIIJLJLI2.getAvatarSceneTag();
                } else {
                    avatarSceneTag = null;
                }
                c1331670kl3LJIIIIZZ.LIZLLL(avatarSceneTag);
                C1910480zoc.LIZIZ(c1331670kl3LJIIIIZZ);
                C1890820zIu.LIZ(c1331670kl3LJIIIIZZ);
                c1331670kl3LJIIIIZZ.LJJ(getNotificationHeadUser1FromXml());
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                C1331670kl3 c1331670kl3LJIIIIZZ2 = C1331660kl2.LJIIIIZZ(imageUrlModelLIZ2);
                InterfaceC1840850y0J delegate4 = getDelegate();
                if (delegate4 != null && (enumC1906770zidLJJLIIIJLJLI = delegate4.LJJLIIIJLJLI()) != null) {
                    avatarSceneTag2 = enumC1906770zidLJJLIIIJLJLI.getAvatarSceneTag();
                }
                c1331670kl3LJIIIIZZ2.LIZLLL(avatarSceneTag2);
                C1910480zoc.LIZIZ(c1331670kl3LJIIIIZZ2);
                C1890820zIu.LIZ(c1331670kl3LJIIIIZZ2);
                c1331670kl3LJIIIIZZ2.LJJ(getNotificationHeadUser2FromXml());
                C786410Ut5.h3(c1331670kl3LJIIIIZZ2);
                return;
            }
            getNotificationHeadSingleFromXml().setUserData(null);
            return;
        }
        C786410Ut5.j0(getNotificationHeadSingleFromXml(), 0);
        C786410Ut5.LL(8, getNotificationHeadDoubleFromXml());
        getNotificationHeadSingleFromXml().setUserData(null);
    }

    public C1907130zjD(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.a9q, this, true);
        getNotificationHeadSingleFromXml().setRequestImgSize(C422830Gi1.LIZ(101));
        C1906140zhc c1906140zhc = C1906140zhc.LIZ;
        SmartAvatarImageView avatarImageView = getNotificationHeadSingleFromXml().getAvatarImageView();
        EnumC1906160zhe enumC1906160zhe = EnumC1906160zhe.AVATAR;
        c1906140zhc.getClass();
        C1906140zhc.LIZ(avatarImageView, enumC1906160zhe, 0.0f);
        ConstraintLayout notificationHeadDoubleFromXml = getNotificationHeadDoubleFromXml();
        notificationHeadDoubleFromXml.setOnTouchListener(new ViewOnTouchListenerC1394220mNw(notificationHeadDoubleFromXml, getNotificationHeadUser1FromXml(), getNotificationHeadUser2FromXml()));
        C1387040mCM.LIZ(this, AFwS315S0000000_28.get$arr$(17));
    }
}
