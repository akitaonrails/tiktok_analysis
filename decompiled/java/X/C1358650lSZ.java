package X;

import Y.ARunnableS121S0100000_21;
import Y.ARunnableS90S0200000_21;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.IShareMessageToastHelper;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0lSZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1358650lSZ extends FrameLayout {
    public static final int LLJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
    public final C420050GdX LL;
    public final View LLILLJJLI;
    public Aweme LLILLL;
    public UpvoteStruct LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public boolean LLIZLLLIL;
    public final C01GW LLJ;

    private final InterfaceC1365380ldQ getShareHelper() {
        return (InterfaceC1365380ldQ) this.LLJ.getValue();
    }

    public final View getIconView() {
        return this.LLILLJJLI;
    }

    public final void LIZ(SetSticker setSticker) {
        final User user;
        String string;
        String string2;
        List<? extends TextExtraStruct> list;
        String string3;
        List<? extends TextExtraStruct> list2;
        UpvoteStruct upvoteStruct = this.LLILZ;
        if (upvoteStruct != null) {
            user = upvoteStruct.user;
        } else {
            user = null;
        }
        AttachmentComponent attachmentComponentLJJJJI = getShareHelper().LJJJJI(this.LLILLL, AttachmentTypeComponent.ATTACHMENT_TYPE_REPLY_REPOST, user);
        if (attachmentComponentLJJJJI == null) {
            return;
        }
        StickerTemplate stickerTemplateLJIJJLI = IMStickerApi.LIZ.LIZIZ().getImStickerMessageService().LJIJJLI(setSticker, getContext(), attachmentComponentLJJJJI, null, null);
        InterfaceC1365380ldQ shareHelper = getShareHelper();
        Aweme aweme = this.LLILLL;
        String str = this.LLILZIL;
        Boolean bool = Boolean.TRUE;
        BaseContent.ReferenceSceneType referenceSceneType = BaseContent.ReferenceSceneType.REPLY_TO_REPOST;
        UpvoteStruct upvoteStruct2 = this.LLILZ;
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (upvoteStruct2 == null || (string = Integer.valueOf(C1359720lUI.LJ(upvoteStruct2) ? 1 : 0).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        String strValueOf = String.valueOf(C424430Gkb.LIZ() ? 1 : 0);
        UpvoteStruct upvoteStruct3 = this.LLILZ;
        if (upvoteStruct3 == null || (list2 = upvoteStruct3.textExtra) == null || (string2 = Integer.valueOf(list2.size()).toString()) == null) {
            string2 = CardStruct.IStatusCode.DEFAULT;
        }
        UpvoteStruct upvoteStruct4 = this.LLILZ;
        if (upvoteStruct4 != null && (list = upvoteStruct4.textExtra) != null && (string3 = Integer.valueOf(C1358170lRn.LJ(list)).toString()) != null) {
            str2 = string3;
        }
        String str3 = this.LLILZLL;
        if (str3 == null) {
            str3 = "";
        }
        C0ZCN c0zcn = new C0ZCN(string, "1", strValueOf, string2, str2, str3, C1356790lPZ.LIZ(this.LLILZ, this.LLIZLLLIL));
        C13DA c13da = new C13DA();
        if (C123100dR.LIZ(this.LLIZ)) {
            c13da.put("is_detail_page", C1360320lVG.LIZLLL(Boolean.valueOf(C1360320lVG.LIZJ(this.LLIZ))));
            c13da.put("friends_tab_version", "v3.0");
            c13da.put("is_collapse_reposts", C1360320lVG.LIZLLL(Boolean.valueOf(C1360320lVG.LIZIZ(this.LLIZ))));
        }
        shareHelper.LJIJJ(null, stickerTemplateLJIJJLI, user, aweme, str, "recommend_panel", null, bool, true, referenceSceneType, null, c0zcn, c13da.build(), new InterfaceC1361990lXx() { // from class: X.0lSb
            @Override // X.InterfaceC1361990lXx
            public final /* synthetic */ void LIZIZ(HashMap map) {
            }

            @Override // X.InterfaceC1361990lXx
            public final void LIZ() {
                C786410Ut5.LJLIIL(200L, C799570VYd.LIZJ(), new ARunnableS90S0200000_21(user, this.LIZ, 29));
            }
        });
    }

    public final void LIZIZ(String str) {
        User user;
        String string;
        String string2;
        List<? extends TextExtraStruct> list;
        String string3;
        List<? extends TextExtraStruct> list2;
        String strLJJ = u.LJJ(3, str);
        InterfaceC1365380ldQ shareHelper = getShareHelper();
        UpvoteStruct upvoteStruct = this.LLILZ;
        if (upvoteStruct != null) {
            user = upvoteStruct.user;
        } else {
            user = null;
        }
        Aweme aweme = this.LLILLL;
        String str2 = this.LLILZIL;
        Boolean bool = Boolean.TRUE;
        BaseContent.ReferenceSceneType referenceSceneType = BaseContent.ReferenceSceneType.REPLY_TO_REPOST;
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (upvoteStruct == null || (string = Integer.valueOf(C1359720lUI.LJ(upvoteStruct) ? 1 : 0).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        String strValueOf = String.valueOf(C424430Gkb.LIZ() ? 1 : 0);
        UpvoteStruct upvoteStruct2 = this.LLILZ;
        if (upvoteStruct2 == null || (list2 = upvoteStruct2.textExtra) == null || (string2 = Integer.valueOf(list2.size()).toString()) == null) {
            string2 = CardStruct.IStatusCode.DEFAULT;
        }
        UpvoteStruct upvoteStruct3 = this.LLILZ;
        if (upvoteStruct3 != null && (list = upvoteStruct3.textExtra) != null && (string3 = Integer.valueOf(C1358170lRn.LJ(list)).toString()) != null) {
            str3 = string3;
        }
        String str4 = this.LLILZLL;
        if (str4 == null) {
            str4 = "";
        }
        shareHelper.LJIJJ(strLJJ, null, user, aweme, str2, "recommend_panel", null, bool, true, referenceSceneType, null, new C0ZCN(string, "1", strValueOf, string2, str3, str4, C1356790lPZ.LIZ(this.LLILZ, this.LLIZLLLIL)), new LinkedHashMap(), new InterfaceC1361990lXx() { // from class: X.0lSa
            @Override // X.InterfaceC1361990lXx
            public final /* synthetic */ void LIZIZ(HashMap map) {
            }

            @Override // X.InterfaceC1361990lXx
            public final void LIZ() {
                C786410Ut5.LJLIIL(200L, C799570VYd.LIZJ(), new ARunnableS121S0100000_21(this.LIZ, 86));
            }
        });
    }

    public C1358650lSZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C420050GdX c420050GdX = new C420050GdX();
        this.LL = c420050GdX;
        this.LLJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(429));
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z.LIZJ = Float.valueOf(LLJI);
        setBackground(c384050F3z.LIZ(context));
        View viewLIZIZ = c420050GdX.LIZIZ(context);
        this.LLILLJJLI = viewLIZIZ;
        addView(viewLIZIZ);
    }

    public static void LIZJ(User user, String str, String str2) {
        List listSingletonList;
        IMUser.Companion.getClass();
        IMUser iMUserLIZJ = C2201941BFw.LIZJ(user);
        if (iMUserLIZJ != null && (listSingletonList = Collections.singletonList(iMUserLIZJ)) != null) {
            IShareMessageToastHelper.LIZ.getClass();
            IShareMessageToastHelper iShareMessageToastHelperLIZ = C913340ZsK.LIZ();
            if (iShareMessageToastHelperLIZ == null || str == null || str2 == null) {
                return;
            }
            iShareMessageToastHelperLIZ.zs(new C1365810le7(listSingletonList, str, str2, "recommend_panel", null, false, false, 0, C1766306vt.LIZ(listSingletonList), null, null, null, false, false, 15872));
        }
    }
}
