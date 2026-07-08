package X;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.article.model.ArticleStickerStruct;
import com.ss.android.ugc.aweme.ogc.news.sticker.common.ArticleStickerSettingsConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.article.ArticleStickerModel;
import irm.AkS95S0100000_29;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS238S0300000_29;
import kotlin.jvm.internal.AwS273S0300000_29;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11q9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19623911q9 extends AbstractC19588311kP<ArticleStickerModel> {
    public Animator LLILZIL;

    private final View getArticleStickerView() {
        return this;
    }

    public final C1003970cEV LIZIZ() {
        C1003970cEV c1003970cEV = new C1003970cEV(this);
        View view = c1003970cEV.LIZ;
        int iLIZIZ = (C497820Jfg.LIZIZ(getContext()) - C1919207fS.LJ()) - C1919207fS.LJIIIIZZ();
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(249));
        if (iLIZIZ > iLIZIZ2) {
            iLIZIZ = iLIZIZ2;
        }
        C995130c0F.LIZJ(iLIZIZ, view);
        C786410Ut5.LJLLLLLL(0, c1003970cEV.LIZIZ);
        C995130c0F.LIZIZ(0, c1003970cEV.LJ);
        C995130c0F.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(156)), c1003970cEV.LJFF);
        return c1003970cEV;
    }

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LJIIZILJ() {
        ArticleStickerStruct articleSticker = getStruct().getArticleSticker();
        if (articleSticker == null || !articleSticker.clickable()) {
            return;
        }
        C786410Ut5.I7(new AkS95S0100000_29(this, 71), this);
    }

    public final void LJ(boolean z) {
        String uid;
        String str;
        String str2;
        String articleTitle;
        String articleLink;
        String str3;
        C705930RmZ c705930RmZ;
        C705930RmZ c705930RmZ2;
        C0R60 c0r60;
        C705930RmZ c705930RmZ3;
        User user;
        C19591211ks interactStickerContainerCommonParam = getInteractStickerContainerCommonParam();
        if (interactStickerContainerCommonParam == null || (c705930RmZ3 = interactStickerContainerCommonParam.LJFF) == null || (user = c705930RmZ3.LIZJ) == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        C19591211ks interactStickerContainerCommonParam2 = getInteractStickerContainerCommonParam();
        if (interactStickerContainerCommonParam2 == null || (c705930RmZ2 = interactStickerContainerCommonParam2.LJFF) == null || (c0r60 = c705930RmZ2.LJIIZILJ) == null || (str = c0r60.LIZ) == null) {
            str = "";
        }
        C19591211ks interactStickerContainerCommonParam3 = getInteractStickerContainerCommonParam();
        if (interactStickerContainerCommonParam3 == null || (c705930RmZ = interactStickerContainerCommonParam3.LJFF) == null || (str2 = c705930RmZ.LIZLLL) == null) {
            str2 = "";
        }
        ArticleStickerStruct articleSticker = getStruct().getArticleSticker();
        if (articleSticker == null || (articleTitle = articleSticker.getArticleTitle()) == null) {
            articleTitle = "";
        }
        ArticleStickerStruct articleSticker2 = getStruct().getArticleSticker();
        if (articleSticker2 == null || (articleLink = articleSticker2.getArticleLink()) == null) {
            articleLink = "";
        }
        if (z) {
            str3 = "article_link_sticker_show";
        } else {
            str3 = "article_link_sticker_click";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("author_id", uid);
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("group_id", str2);
        linkedHashMap.put("article_link_id", "");
        linkedHashMap.put("article_link_title", articleTitle);
        linkedHashMap.put("article_link_url", articleLink);
        C20684815ws.LJIILLIIL(str3, linkedHashMap);
    }

    public C19623911q9(Context context, AttributeSet attributeSet) {
        super(0, 12, context, attributeSet);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
    }

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LIZJ(final InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
        boolean z;
        String articleTitle;
        String brandIconUrl;
        String nickname;
        C705930RmZ c705930RmZ;
        User user;
        View view;
        int screenWidth;
        this.LLILZ = interactStickerStruct;
        C1003970cEV c1003970cEVLIZIZ = LIZIZ();
        final View view2 = c1003970cEVLIZIZ.LIZ;
        C2211631BhB.LIZJ(view2, new AbstractC2211791BhR(view2, this, interactStickerStruct) { // from class: X.11qA
            public Function0<String> LJ;
            public final C19624111qB LJFF;

            @Override // X.AbstractC2211791BhR
            public final int LIZJ() {
                return 0;
            }

            @Override // X.AbstractC2211791BhR
            public final boolean LJIIIIZZ() {
                return true;
            }

            @Override // X.AbstractC2211791BhR
            public final float LJIIL() {
                return 0.0f;
            }

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZLLL() {
                return this.LJ;
            }

            @Override // X.AbstractC2211791BhR
            public final InterfaceC2211931Bhf LJFF() {
                return this.LJFF;
            }

            @Override // X.AbstractC2211791BhR
            public final void LJIILL(Function0<String> function0) {
                this.LJ = function0;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [X.11qB] */
            {
                this.LJ = new AwS273S0300000_29(this, view2, this, interactStickerStruct, 15);
                this.LJFF = new InterfaceC2211931Bhf() { // from class: X.11qB
                    @Override // X.InterfaceC2211931Bhf
                    public final void LIZ(View view3, String str) {
                        this.LJ(true);
                    }
                };
            }
        });
        Integer num = ArticleStickerSettingsConfig.LIZ().enableStickerAutoResize;
        boolean z2 = true;
        if (num != null && num.intValue() != 1) {
            z = false;
        } else {
            z = true;
        }
        String brandThemeColor = null;
        if (z) {
            AwS591S0100000_12 awS591S0100000_12 = new AwS591S0100000_12(view2, 762);
            getArticleStickerView();
            if (isAttachedToWindow()) {
                Object parent = getParent();
                if ((parent instanceof View) && (view = (View) parent) != null && (screenWidth = ScreenUtils.getScreenWidth(view2.getContext())) > 0) {
                    if (view.getWidth() > 0) {
                        awS591S0100000_12.invoke(Float.valueOf(view.getWidth() / screenWidth));
                    } else {
                        C1591860rWi.LIZ(view, new C01A5(screenWidth, view, awS591S0100000_12));
                    }
                }
            } else {
                addOnAttachStateChangeListener(new C12YI(this, view2, awS591S0100000_12, 0));
            }
        }
        ArticleStickerStruct articleSticker = interactStickerStruct.getArticleSticker();
        if (articleSticker != null) {
            articleTitle = articleSticker.getArticleTitle();
        } else {
            articleTitle = null;
        }
        c1003970cEVLIZIZ.LIZJ(null, articleTitle);
        ArticleStickerStruct articleSticker2 = interactStickerStruct.getArticleSticker();
        if (articleSticker2 != null) {
            brandIconUrl = articleSticker2.getBrandIconUrl();
        } else {
            brandIconUrl = null;
        }
        C19591211ks interactStickerContainerCommonParam = getInteractStickerContainerCommonParam();
        if (interactStickerContainerCommonParam == null || (c705930RmZ = interactStickerContainerCommonParam.LJFF) == null || (user = c705930RmZ.LIZJ) == null || (nickname = user.getNickname()) == null) {
            nickname = "";
        }
        c1003970cEVLIZIZ.LIZIZ(brandIconUrl, nickname);
        ArticleStickerStruct articleSticker3 = interactStickerStruct.getArticleSticker();
        if (articleSticker3 == null || !articleSticker3.clickable()) {
            z2 = false;
        }
        ArticleStickerStruct articleSticker4 = interactStickerStruct.getArticleSticker();
        if (articleSticker4 != null) {
            brandThemeColor = articleSticker4.getBrandThemeColor();
        }
        c1003970cEVLIZIZ.LIZLLL(brandThemeColor, z2);
        addView(c1003970cEVLIZIZ.LIZ);
    }

    public final void LIZLLL(LifecycleOwner lifecycleOwner, C1664680tQA c1664680tQA) {
        C1003970cEV c1003970cEV = new C1003970cEV(this);
        C995130c0F.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(154)), c1003970cEV.LIZ);
        C339190DRl.LIZIZ(c1003970cEV.LIZIZ);
        C995130c0F.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), c1003970cEV.LJ);
        C995130c0F.LIZJ(-1, c1003970cEV.LJFF);
        c1003970cEV.LIZJ(C20467080b.LIZIZ(2131826638), null);
        addView(c1003970cEV.LIZ);
        C1003970cEV c1003970cEVLIZIZ = LIZIZ();
        addView(c1003970cEVLIZIZ.LIZ);
        c1664680tQA.LIZ(new C2217381BqS() { // from class: X.11q6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ArticleStickerModel) obj).getBaseStickerModel();
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 578));
        c1664680tQA.LIZ(new C2217371BqR() { // from class: X.11qC
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ArticleStickerModel) obj).getStyleState();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((ArticleStickerModel) obj).setStyleState((ArticleStickerModel.StyleModel) obj2);
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS238S0300000_29(this, c1003970cEV, c1003970cEVLIZIZ, 23));
        c1664680tQA.LIZ(new C2217371BqR() { // from class: X.11qD
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ArticleStickerModel) obj).getBrandIconUrl();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((ArticleStickerModel) obj).setBrandIconUrl((String) obj2);
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS595S0100000_16(c1003970cEVLIZIZ, this, 207));
        c1664680tQA.LIZ(new C2217371BqR() { // from class: X.11qE
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ArticleStickerModel) obj).getBrandThemeColor();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((ArticleStickerModel) obj).setBrandThemeColor((String) obj2);
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS595S0100000_16(c1003970cEVLIZIZ, 208));
        c1664680tQA.LIZ(new C2217371BqR() { // from class: X.11qF
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ArticleStickerModel) obj).getArticleTitle();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((ArticleStickerModel) obj).setArticleTitle((String) obj2);
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS608S0100000_29(c1003970cEVLIZIZ, 577));
    }

    public C19623911q9(C19EG c19eg, C19591211ks c19591211ks) {
        super(0, c19eg, (AttributeSet) null, c19591211ks);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
    }
}
