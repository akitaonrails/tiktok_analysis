package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TitleTemplate;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.util.IUserProfilePreload;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS289S0000000_6;
import kotlin.jvm.internal.AFwS315S0000000_28;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0zjB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1907110zjB extends AbstractViewOnClickListenerC1907000zj0 {
    public C1907300zjU LLIZ;
    public C12MG LLIZLLLIL;
    public SmartAvatarImageView LLJ;
    public ConstraintLayout LLJI;
    public SmartAvatarImageView LLJIJIL;
    public C1609500rzA LLJILJIL;

    public final C1609500rzA getFlNowAvatarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.i8g);
            this.LLJILJIL = (C1609500rzA) callbackFindViewById;
        }
        return (C1609500rzA) callbackFindViewById;
    }

    public final ConstraintLayout getNotificationHeadDoubleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pe2);
            this.LLJI = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final C12MG getNotificationHeadPlaceholderFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pe3);
            this.LLIZLLLIL = (C12MG) callbackFindViewById;
        }
        return (C12MG) callbackFindViewById;
    }

    public final C1907300zjU getNotificationHeadSingleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pe4);
            this.LLIZ = (C1907300zjU) callbackFindViewById;
        }
        return (C1907300zjU) callbackFindViewById;
    }

    public final SmartAvatarImageView getNotificationHeadUser1FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pe5);
            this.LLJ = (SmartAvatarImageView) callbackFindViewById;
        }
        return (SmartAvatarImageView) callbackFindViewById;
    }

    public final SmartAvatarImageView getNotificationHeadUser2FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pe6);
            this.LLJIJIL = (SmartAvatarImageView) callbackFindViewById;
        }
        return (SmartAvatarImageView) callbackFindViewById;
    }

    @Override // X.AbstractViewOnClickListenerC1907000zj0
    public EnumC1907390zjd getTemplatePosition() {
        return EnumC1907390zjd.Left;
    }

    @Override // X.AbstractViewOnClickListenerC1907000zj0
    public final String LIZJ(View view) {
        NoticeUITemplate noticeUITemplate;
        GeneralTemplateNotice templateNotice;
        TitleTemplate titleTemplate;
        List<User> list;
        GeneralTemplateNotice templateNotice2 = getTemplateNotice();
        if (templateNotice2 == null || (noticeUITemplate = templateNotice2.uiTemplate) == null) {
            return null;
        }
        if ((noticeUITemplate.avatarSchemaUrl == null && ((titleTemplate = noticeUITemplate.titleTemplate) == null || (list = titleTemplate.fromUsers) == null || list.size() <= 1)) || (templateNotice = getTemplateNotice()) == null) {
            return null;
        }
        return C1906180zhg.LIZ(templateNotice, noticeUITemplate.avatarSchemaUrl);
    }

    @Override // X.AbstractViewOnClickListenerC1907000zj0
    public final boolean LIZLLL(View view) {
        boolean z;
        NoticeUITemplate noticeUITemplate;
        TitleTemplate titleTemplate;
        List<User> list;
        User user;
        String str;
        GeneralTemplateNotice generalTemplateNotice;
        Function1<String, Unit> function1;
        Function1<String, Unit> function12;
        InterfaceC1907020zj2 mBridge;
        C1905050zfr viewHolderConfig = getViewHolderConfig();
        if (viewHolderConfig != null && viewHolderConfig.LJFF) {
            z = true;
        } else {
            z = false;
        }
        if (z && (mBridge = getMBridge()) != null && mBridge.c3("click_head")) {
            return true;
        }
        String strLIZJ = LIZJ(view);
        if (strLIZJ != null) {
            C1242270iQr searchTemplateInfo = getSearchTemplateInfo();
            if (searchTemplateInfo != null && (function12 = searchTemplateInfo.LIZLLL) != null) {
                function12.invoke("enter_profile");
            }
            LJ(EnumC1905950zhJ.LEFT, strLIZJ);
            return true;
        }
        GeneralTemplateNotice templateNotice = getTemplateNotice();
        if (templateNotice == null || (noticeUITemplate = templateNotice.uiTemplate) == null || (titleTemplate = noticeUITemplate.titleTemplate) == null || (list = titleTemplate.fromUsers) == null || (user = (User) C13LP.LJJJLL(list)) == null) {
            return false;
        }
        if (user.getUid() != null && user.getSecUid() != null) {
            C1242270iQr searchTemplateInfo2 = getSearchTemplateInfo();
            if (searchTemplateInfo2 != null && (function1 = searchTemplateInfo2.LIZLLL) != null) {
                function1.invoke("enter_profile");
            }
            InterfaceC1907020zj2 mBridge2 = getMBridge();
            if (mBridge2 != null) {
                mBridge2.LLD(EnumC1154130g8h.OTHERS);
            }
            ((IUserProfilePreload) ServiceManager.get().getService(IUserProfilePreload.class)).LIZ(user);
            MusNotice mBaseNotice = getMBaseNotice();
            String accountType = null;
            if (mBaseNotice != null && (generalTemplateNotice = mBaseNotice.templateNotice) != null) {
                str = generalTemplateNotice.schemaUrl;
            } else {
                str = null;
            }
            MusNotice mBaseNotice2 = getMBaseNotice();
            if (mBaseNotice2 != null && mBaseNotice2.type == 225 && !TextUtils.isEmpty(str)) {
                String str2 = C1900870zZ7.LIZ;
                if (str2 == null) {
                    str2 = "";
                }
                InterfaceC1907020zj2 mBridge3 = getMBridge();
                if (mBridge3 != null) {
                    MusNotice mBaseNotice3 = getMBaseNotice();
                    if (mBaseNotice3 != null) {
                        accountType = mBaseNotice3.getAccountType();
                    }
                    mBridge3.s4(user, "click_head", str2, accountType);
                }
                HashMap map = new HashMap();
                map.put("inbox_position", str2);
                C19724912Fj.LIZLLL().LJFF(str, map);
                return true;
            }
            InterfaceC1907020zj2 mBridge4 = getMBridge();
            if (mBridge4 != null) {
                mBridge4.l5(user.getUid(), user.getSecUid(), getMBaseNotice(), false, getSearchTemplateInfo());
            }
        }
        return true;
    }

    public final void setFlNowAvatarFromXml(C1609500rzA c1609500rzA) {
        this.LLJILJIL = c1609500rzA;
    }

    public final void setNotificationHeadDoubleFromXml(ConstraintLayout constraintLayout) {
        this.LLJI = constraintLayout;
    }

    public final void setNotificationHeadPlaceholderFromXml(C12MG c12mg) {
        this.LLIZLLLIL = c12mg;
    }

    public final void setNotificationHeadSingleFromXml(C1907300zjU c1907300zjU) {
        this.LLIZ = c1907300zjU;
    }

    public final void setNotificationHeadUser1FromXml(SmartAvatarImageView smartAvatarImageView) {
        this.LLJ = smartAvatarImageView;
    }

    public final void setNotificationHeadUser2FromXml(SmartAvatarImageView smartAvatarImageView) {
        this.LLJIJIL = smartAvatarImageView;
    }

    public C1907110zjB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.aal, this, true);
        getNotificationHeadSingleFromXml().setRequestImgSize(C422830Gi1.LIZ(101));
        C1906140zhc c1906140zhc = C1906140zhc.LIZ;
        SmartAvatarImageView avatarImageView = getNotificationHeadSingleFromXml().getAvatarImageView();
        EnumC1906160zhe enumC1906160zhe = EnumC1906160zhe.AVATAR;
        c1906140zhc.getClass();
        C1906140zhc.LIZ(avatarImageView, enumC1906160zhe, 0.0f);
        ConstraintLayout notificationHeadDoubleFromXml = getNotificationHeadDoubleFromXml();
        notificationHeadDoubleFromXml.setOnTouchListener(new ViewOnTouchListenerC1394220mNw(notificationHeadDoubleFromXml, getNotificationHeadUser1FromXml(), getNotificationHeadUser2FromXml()));
        C1387040mCM.LIZ(this, AFwS289S0000000_6.get$arr$(59));
    }

    @Override // X.AbstractViewOnClickListenerC1907000zj0
    public final void LIZ(MusNotice musNotice, InterfaceC1907020zj2 interfaceC1907020zj2, C1242270iQr c1242270iQr) throws JSONException {
        NoticeUITemplate noticeUITemplate;
        List list;
        String avatarSceneTag;
        float f;
        ViewGroup viewGroup;
        EnumC1906770zid enumC1906770zidLJJLIIIJLJLI;
        EnumC1906770zid enumC1906770zidLJJLIIIJLJLI2;
        EnumC1906770zid enumC1906770zidLJJLIIIJLJLI3;
        EnumC1906770zid enumC1906770zidLJJLIIIJLJLI4;
        String avatarSceneTag2;
        EnumC1906770zid enumC1906770zidLJJLIIIJLJLI5;
        EnumC1906770zid enumC1906770zidLJJLIIIJLJLI6;
        super.LIZ(musNotice, interfaceC1907020zj2, c1242270iQr);
        C786410Ut5.ga(getNotificationHeadSingleFromXml(), this);
        C786410Ut5.Y7(getNotificationHeadDoubleFromXml(), this);
        C1387040mCM.LIZ(getNotificationHeadSingleFromXml(), AFwS315S0000000_28.get$arr$(24));
        C1387040mCM.LIZ(getNotificationHeadDoubleFromXml(), AFwS315S0000000_28.get$arr$(25));
        GeneralTemplateNotice templateNotice = getTemplateNotice();
        String avatarSceneTag3 = null;
        TuxIconDrawable tuxIconDrawableLIZ = null;
        avatarSceneTag = null;
        String avatarSceneTag4 = null;
        avatarSceneTag = null;
        String avatarSceneTag5 = null;
        avatarSceneTag = null;
        String avatarSceneTag6 = null;
        avatarSceneTag3 = null;
        if (templateNotice != null && (noticeUITemplate = templateNotice.uiTemplate) != null) {
            C1609500rzA flNowAvatarFromXml = getFlNowAvatarFromXml();
            int visibility = flNowAvatarFromXml.getVisibility();
            flNowAvatarFromXml.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, flNowAvatarFromXml);
            C786410Ut5.j0(getNotificationHeadSingleFromXml(), 0);
            C786410Ut5.LL(8, getNotificationHeadDoubleFromXml());
            TitleTemplate titleTemplate = noticeUITemplate.titleTemplate;
            if (titleTemplate == null || (list = titleTemplate.fromUsers) == null) {
                list = C13BV.INSTANCE;
            }
            if (C1907180zjI.LJ(getTemplateNotice())) {
                C786410Ut5.j0(getNotificationHeadSingleFromXml(), 0);
                C786410Ut5.LL(8, getNotificationHeadDoubleFromXml());
                getNotificationHeadSingleFromXml().setUserData(null);
                C1907300zjU notificationHeadSingleFromXml = getNotificationHeadSingleFromXml();
                Activity topActivity = ActivityStack.getTopActivity();
                if (topActivity != null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_color_foot_print_circle;
                    tuxIconDrawableLIZ = c419910GdJ.LIZ(topActivity);
                }
                notificationHeadSingleFromXml.setPlaceHolderImage(tuxIconDrawableLIZ);
                return;
            }
            if (noticeUITemplate.avatarImageUrl != null) {
                if (noticeUITemplate.avatarCoverUrl != null) {
                    C1609500rzA flNowAvatarFromXml2 = getFlNowAvatarFromXml();
                    int visibility2 = flNowAvatarFromXml2.getVisibility();
                    flNowAvatarFromXml2.setVisibility(8);
                    C1602160rnK.LIZIZ(visibility2, 8, flNowAvatarFromXml2);
                    C786410Ut5.j0(getNotificationHeadSingleFromXml(), 8);
                    C786410Ut5.LL(0, getNotificationHeadDoubleFromXml());
                    C1910480zoc c1910480zoc = C1910480zoc.LIZ;
                    C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(noticeUITemplate.avatarCoverUrl);
                    InterfaceC1907020zj2 mBridge = getMBridge();
                    if (mBridge != null && (enumC1906770zidLJJLIIIJLJLI6 = mBridge.LJJLIIIJLJLI()) != null) {
                        avatarSceneTag2 = enumC1906770zidLJJLIIIJLJLI6.getAvatarSceneTag();
                    } else {
                        avatarSceneTag2 = null;
                    }
                    c1331670kl3LJIIIIZZ.LIZLLL(avatarSceneTag2);
                    c1910480zoc.getClass();
                    C1910480zoc.LIZIZ(c1331670kl3LJIIIIZZ);
                    C1890820zIu.LIZ(c1331670kl3LJIIIIZZ);
                    c1331670kl3LJIIIIZZ.LJJ(getNotificationHeadUser1FromXml());
                    C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                    C1331670kl3 c1331670kl3LJIIIIZZ2 = C1331660kl2.LJIIIIZZ(noticeUITemplate.avatarImageUrl);
                    InterfaceC1907020zj2 mBridge2 = getMBridge();
                    if (mBridge2 != null && (enumC1906770zidLJJLIIIJLJLI5 = mBridge2.LJJLIIIJLJLI()) != null) {
                        avatarSceneTag4 = enumC1906770zidLJJLIIIJLJLI5.getAvatarSceneTag();
                    }
                    c1331670kl3LJIIIIZZ2.LIZLLL(avatarSceneTag4);
                    C1910480zoc.LIZIZ(c1331670kl3LJIIIIZZ2);
                    c1331670kl3LJIIIIZZ2.LJJ(getNotificationHeadUser2FromXml());
                    C1890820zIu.LIZ(c1331670kl3LJIIIIZZ2);
                    C786410Ut5.h3(c1331670kl3LJIIIIZZ2);
                    return;
                }
                UserVerify userVerify = new UserVerify(noticeUITemplate.avatarImageUrl, null, null, -1);
                C1907300zjU notificationHeadSingleFromXml2 = getNotificationHeadSingleFromXml();
                InterfaceC1907020zj2 mBridge3 = getMBridge();
                if (mBridge3 != null && (enumC1906770zidLJJLIIIJLJLI4 = mBridge3.LJJLIIIJLJLI()) != null) {
                    avatarSceneTag5 = enumC1906770zidLJJLIIIJLJLI4.getAvatarSceneTag();
                }
                notificationHeadSingleFromXml2.LIZLLL(userVerify, avatarSceneTag5);
                return;
            }
            if (list.size() == 1) {
                C1910480zoc c1910480zoc2 = C1910480zoc.LIZ;
                User user = (User) ListProtector.get(list, 0);
                Context context = getContext();
                C1907300zjU notificationHeadSingleFromXml3 = getNotificationHeadSingleFromXml();
                c1910480zoc2.getClass();
                UserVerify userVerify2 = new UserVerify(C1910480zoc.LIZ(context, notificationHeadSingleFromXml3, user), ((User) ListProtector.get(list, 0)).getCustomVerify(), ((User) ListProtector.get(list, 0)).getEnterpriseVerifyReason(), Integer.valueOf(((User) ListProtector.get(list, 0)).getVerificationType()));
                C1907300zjU notificationHeadSingleFromXml4 = getNotificationHeadSingleFromXml();
                InterfaceC1907020zj2 mBridge4 = getMBridge();
                if (mBridge4 != null && (enumC1906770zidLJJLIIIJLJLI3 = mBridge4.LJJLIIIJLJLI()) != null) {
                    avatarSceneTag6 = enumC1906770zidLJJLIIIJLJLI3.getAvatarSceneTag();
                }
                notificationHeadSingleFromXml4.LIZLLL(userVerify2, avatarSceneTag6);
                getNotificationHeadSingleFromXml().LIZ();
                return;
            }
            if (list.size() > 1) {
                C786410Ut5.j0(getNotificationHeadSingleFromXml(), 8);
                C786410Ut5.LL(0, getNotificationHeadDoubleFromXml());
                C1910480zoc c1910480zoc3 = C1910480zoc.LIZ;
                User user2 = (User) ListProtector.get(list, 0);
                Context context2 = getContext();
                SmartAvatarImageView notificationHeadUser1FromXml = getNotificationHeadUser1FromXml();
                c1910480zoc3.getClass();
                ImageUrlModel imageUrlModelLIZ = C438710HIf.LIZ(C1910480zoc.LIZ(context2, notificationHeadUser1FromXml, user2));
                ImageUrlModel imageUrlModelLIZ2 = C438710HIf.LIZ(C1910480zoc.LIZ(getContext(), getNotificationHeadUser2FromXml(), (User) ListProtector.get(list, 1)));
                C1331670kl3 c1331670kl3LJIIIIZZ3 = C1331660kl2.LJIIIIZZ(imageUrlModelLIZ);
                InterfaceC1907020zj2 mBridge5 = getMBridge();
                if (mBridge5 != null && (enumC1906770zidLJJLIIIJLJLI2 = mBridge5.LJJLIIIJLJLI()) != null) {
                    avatarSceneTag = enumC1906770zidLJJLIIIJLJLI2.getAvatarSceneTag();
                } else {
                    avatarSceneTag = null;
                }
                c1331670kl3LJIIIIZZ3.LIZLLL(avatarSceneTag);
                C1910480zoc.LIZIZ(c1331670kl3LJIIIIZZ3);
                C1890820zIu.LIZ(c1331670kl3LJIIIIZZ3);
                c1331670kl3LJIIIIZZ3.LJJ(getNotificationHeadUser1FromXml());
                C786410Ut5.h3(c1331670kl3LJIIIIZZ3);
                C1331670kl3 c1331670kl3LJIIIIZZ4 = C1331660kl2.LJIIIIZZ(imageUrlModelLIZ2);
                InterfaceC1907020zj2 mBridge6 = getMBridge();
                if (mBridge6 != null && (enumC1906770zidLJJLIIIJLJLI = mBridge6.LJJLIIIJLJLI()) != null) {
                    avatarSceneTag3 = enumC1906770zidLJJLIIIJLJLI.getAvatarSceneTag();
                }
                c1331670kl3LJIIIIZZ4.LIZLLL(avatarSceneTag3);
                C1910480zoc.LIZIZ(c1331670kl3LJIIIIZZ4);
                C1890820zIu.LIZ(c1331670kl3LJIIIIZZ4);
                c1331670kl3LJIIIIZZ4.LJJ(getNotificationHeadUser2FromXml());
                C786410Ut5.h3(c1331670kl3LJIIIIZZ4);
                C1907140zjE c1907140zjE = C1907140zjE.LIZ;
                ConstraintLayout notificationHeadDoubleFromXml = getNotificationHeadDoubleFromXml();
                Context context3 = getContext();
                UrlModel urlModel = noticeUITemplate.avatarBadgeUrl;
                int iLIZ = C960203pA.LIZ(R.attr.bx, getContext());
                c1907140zjE.getClass();
                C1907140zjE.LIZIZ(notificationHeadDoubleFromXml);
                if (urlModel == null) {
                    return;
                }
                C427870Gq9 c427870Gq9 = (C427870Gq9) notificationHeadDoubleFromXml.findViewById(R.id.bkw);
                if (c427870Gq9 == null) {
                    c427870Gq9 = new C427870Gq9(context3);
                }
                if (c427870Gq9.getId() == R.id.bkw) {
                    C786410Ut5.LLLLJI(c427870Gq9, 0);
                    return;
                }
                int i = C1907140zjE.LIZJ;
                C19ME c19me = new C19ME(i, i);
                c19me.endToEnd = 0;
                c19me.bottomToBottom = 0;
                notificationHeadDoubleFromXml.setClipChildren(false);
                ViewParent parent = notificationHeadDoubleFromXml.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    viewGroup.setClipChildren(false);
                }
                if (C444960Hcc.LIZIZ()) {
                    f = -C1907140zjE.LIZIZ;
                } else {
                    f = C1907140zjE.LIZIZ;
                }
                C786410Ut5.Sc(c427870Gq9, f);
                float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c427870Gq9);
                c427870Gq9.setTranslationY(fLIZIZ);
                int i2 = C1907140zjE.LIZIZ;
                c427870Gq9.setPadding(i2, i2, i2, i2);
                Drawable drawableLIZIZ = C800330VaR.LIZIZ(context3, R.drawable.agm);
                if (drawableLIZIZ != null) {
                    drawableLIZIZ.mutate().setTint(iLIZ);
                    c427870Gq9.setBackground(drawableLIZIZ);
                }
                C1331670kl3 c1331670kl3LJIIIIZZ5 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
                c1331670kl3LJIIIIZZ5.LJJIJ(C422830Gi1.LIZ(100));
                c1331670kl3LJIIIIZZ5.LIZLLL(EnumC1906770zid.ACTIVITY.getIconSceneTag());
                c1331670kl3LJIIIIZZ5.LJJ(c427870Gq9);
                C786410Ut5.h3(c1331670kl3LJIIIIZZ5);
                C786410Ut5.LLLLJI(c427870Gq9, 0);
                c427870Gq9.setId(R.id.bkw);
                if (notificationHeadDoubleFromXml.indexOfChild(c427870Gq9) != -1) {
                    return;
                }
                notificationHeadDoubleFromXml.addView(c427870Gq9, c19me);
                return;
            }
            getNotificationHeadSingleFromXml().setUserData(null);
            C1907190zjJ c1907190zjJ = C1907190zjJ.LIZ;
            GeneralTemplateNotice templateNotice2 = getTemplateNotice();
            EnumC1907220zjM enumC1907220zjM = EnumC1907220zjM.LEFT;
            c1907190zjJ.getClass();
            C1907190zjJ.LIZIZ(templateNotice2, enumC1907220zjM, "not_avatar");
            return;
        }
        C1907190zjJ c1907190zjJ2 = C1907190zjJ.LIZ;
        GeneralTemplateNotice templateNotice3 = getTemplateNotice();
        EnumC1907220zjM enumC1907220zjM2 = EnumC1907220zjM.LEFT;
        c1907190zjJ2.getClass();
        C1907190zjJ.LIZIZ(templateNotice3, enumC1907220zjM2, "not_data");
        C786410Ut5.j0(getNotificationHeadSingleFromXml(), 0);
        C786410Ut5.LL(8, getNotificationHeadDoubleFromXml());
        getNotificationHeadSingleFromXml().setUserData(null);
    }
}
