package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSubscriptionInfo;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplateButton;
import com.ss.android.ugc.aweme.notification.aggregate.data.BulletinAggregateNotice;
import com.ss.android.ugc.aweme.notification.aggregate.data.BulletinInviteButtonData;
import com.ss.android.ugc.aweme.notification.aggregate.data.TemplateAggregateRightUiInfo;
import com.ss.android.ugc.aweme.notification.aggregate.data.TemplateAggregateUiInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0y0L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1840870y0L extends AbstractViewOnClickListenerC1840840y0I {
    public C0OR2 LLILZ;
    public C197039127h LLILZIL;
    public C424560Gko LLILZLL;
    public TemplateAggregateRightUiInfo LLIZ;

    public final C0OR2 getInviteButtonFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.kz0);
            this.LLILZ = (C0OR2) callbackFindViewById;
        }
        return (C0OR2) callbackFindViewById;
    }

    public final C197039127h getNormalButtonFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pbg);
            this.LLILZIL = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final C424560Gko getRightNotificationCoverFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tlt);
            this.LLILZLL = (C424560Gko) callbackFindViewById;
        }
        return (C424560Gko) callbackFindViewById;
    }

    @Override // X.AbstractViewOnClickListenerC1840840y0I
    public final String i0(View view) {
        Integer numValueOf;
        TemplateAggregateRightUiInfo templateAggregateRightUiInfo;
        NoticeUITemplateButton noticeUITemplateButton;
        if (view == null || (numValueOf = Integer.valueOf(view.getId())) == null) {
            return null;
        }
        if (numValueOf.intValue() == R.id.pbg) {
            TemplateAggregateRightUiInfo templateAggregateRightUiInfo2 = this.LLIZ;
            if (templateAggregateRightUiInfo2 == null || (noticeUITemplateButton = templateAggregateRightUiInfo2.button) == null) {
                return null;
            }
            return noticeUITemplateButton.schemaUrl;
        }
        if (numValueOf.intValue() != R.id.tlt || (templateAggregateRightUiInfo = this.LLIZ) == null) {
            return null;
        }
        return templateAggregateRightUiInfo.schemeUrl;
    }

    @Override // X.AbstractViewOnClickListenerC1840840y0I
    public final boolean j0(View view) {
        Integer numValueOf;
        String strI0;
        if (view != null && (numValueOf = Integer.valueOf(view.getId())) != null) {
            if ((numValueOf.intValue() == R.id.pbg || numValueOf.intValue() == R.id.tlt) && (strI0 = i0(view)) != null) {
                l0(strI0);
                return true;
            }
            return false;
        }
        return false;
    }

    public final void setInviteButtonFromXml(C0OR2 c0or2) {
        this.LLILZ = c0or2;
    }

    public final void setNormalButtonFromXml(C197039127h c197039127h) {
        this.LLILZIL = c197039127h;
    }

    public final void setRightNotificationCoverFromXml(C424560Gko c424560Gko) {
        this.LLILZLL = c424560Gko;
    }

    public C1840870y0L(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (Object) null);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.a9s, this, true);
        C10VP.LIZIZ(getInviteButtonFromXml());
        C786410Ut5.U8(getNormalButtonFromXml(), this);
        C786410Ut5.H9(getRightNotificationCoverFromXml(), this);
        getRightNotificationCoverFromXml().setCornerRadius(C418440Gaw.LIZIZ(10));
        C1906140zhc c1906140zhc = C1906140zhc.LIZ;
        C424560Gko rightNotificationCoverFromXml = getRightNotificationCoverFromXml();
        EnumC1906160zhe enumC1906160zhe = EnumC1906160zhe.AVATAR;
        float fLIZIZ = C418440Gaw.LIZIZ(2);
        c1906140zhc.getClass();
        C1906140zhc.LIZ(rightNotificationCoverFromXml, enumC1906160zhe, fLIZIZ);
        getInviteButtonFromXml().setTuxFont(42);
        getNormalButtonFromXml().setTuxFont(42);
    }

    @Override // X.AbstractViewOnClickListenerC1840840y0I
    public final void h0(BulletinAggregateNotice bulletinAggregateNotice, C1840830y0H c1840830y0H) {
        TemplateAggregateRightUiInfo templateAggregateRightUiInfo;
        NoticeUITemplateButton noticeUITemplateButton;
        long jLongValue;
        int i;
        UrlModel urlModel;
        String coverSceneTag;
        EnumC1906770zid enumC1906770zidLJJLIIIJLJLI;
        super.h0(bulletinAggregateNotice, c1840830y0H);
        TemplateAggregateUiInfo uiInfo = getUiInfo();
        Long l = null;
        if (uiInfo != null) {
            templateAggregateRightUiInfo = uiInfo.rightUiInfo;
        } else {
            templateAggregateRightUiInfo = null;
        }
        this.LLIZ = templateAggregateRightUiInfo;
        boolean z = false;
        if (templateAggregateRightUiInfo != null && (urlModel = templateAggregateRightUiInfo.imageInfo) != null) {
            C12ES.LJIILL(0, getRightNotificationCoverFromXml());
            C1910480zoc c1910480zoc = C1910480zoc.LIZ;
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
            c1331670kl3LJIIIIZZ.LJJIJ(C422830Gi1.LIZ(500));
            InterfaceC1840850y0J delegate = getDelegate();
            if (delegate != null && (enumC1906770zidLJJLIIIJLJLI = delegate.LJJLIIIJLJLI()) != null) {
                coverSceneTag = enumC1906770zidLJJLIIIJLJLI.getCoverSceneTag();
            } else {
                coverSceneTag = null;
            }
            c1331670kl3LJIIIIZZ.LIZLLL(coverSceneTag);
            c1331670kl3LJIIIIZZ.LJJ(getRightNotificationCoverFromXml());
            C1890820zIu.LIZ(c1331670kl3LJIIIIZZ);
            c1910480zoc.getClass();
            C1910480zoc.LIZIZ(c1331670kl3LJIIIIZZ);
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        } else {
            C0DTR.LIZIZ(getRightNotificationCoverFromXml());
        }
        TemplateAggregateRightUiInfo templateAggregateRightUiInfo2 = this.LLIZ;
        if (templateAggregateRightUiInfo2 != null && (noticeUITemplateButton = templateAggregateRightUiInfo2.button) != null) {
            Integer num = noticeUITemplateButton.type;
            if (num != null && num.intValue() == 5) {
                C0OR2 inviteButtonFromXml = getInviteButtonFromXml();
                if (inviteButtonFromXml != null) {
                    C12ES.LJIILL(0, inviteButtonFromXml);
                    C1227904rF c1227904rF = C1227904rF.LIZ;
                    String str = noticeUITemplateButton.buttonExtra;
                    c1227904rF.getClass();
                    BulletinInviteButtonData bulletinInviteButtonData = (BulletinInviteButtonData) C1227904rF.LIZIZ(str, BulletinInviteButtonData.class);
                    if (bulletinInviteButtonData != null) {
                        l = bulletinInviteButtonData.bbId;
                    }
                    if (!C08A4.LIZIZ(l)) {
                        C0DTR.LIZIZ(inviteButtonFromXml);
                        return;
                    }
                    Long l2 = bulletinInviteButtonData.bbId;
                    if (l2 != null) {
                        jLongValue = l2.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    LifecycleOwner lifecycleOwnerLIZIZ = C0SY5.LIZIZ(getContext());
                    BulletinSubscriptionInfo bulletinSubscriptionInfo = bulletinInviteButtonData.subscriptionInfo;
                    if (bulletinSubscriptionInfo != null) {
                        i = bulletinSubscriptionInfo.subscribeStatus;
                        z = bulletinSubscriptionInfo.noNeedFollowOnSubscribe;
                    } else {
                        i = -1;
                    }
                    inviteButtonFromXml.LJIIL(new C604810Nnr(jLongValue, lifecycleOwnerLIZIZ, i, z, bulletinInviteButtonData.channelOwnId, 0, 2));
                    inviteButtonFromXml.getCallback().setTracker(new AwS428S0200000_27(bulletinInviteButtonData, this, 73));
                    inviteButtonFromXml.getCallback().setInviteClickListener(new AwS571S0100000_27(this, 1142));
                    return;
                }
                return;
            }
            C786410Ut5.U8(getNormalButtonFromXml(), this);
            C197039127h normalButtonFromXml = getNormalButtonFromXml();
            C786410Ut5.LLLLLLJ(normalButtonFromXml, 0);
            normalButtonFromXml.setText(noticeUITemplateButton.content);
            Integer num2 = noticeUITemplateButton.type;
            if (num2 != null && num2.intValue() == 2) {
                getNormalButtonFromXml().setButtonVariant(0);
            } else {
                getNormalButtonFromXml().setButtonVariant(1);
            }
        }
    }
}
