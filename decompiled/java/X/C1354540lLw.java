package X;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS230S0300000_21;
import kotlin.jvm.internal.AwS299S0300000_21;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0lLw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1354540lLw {
    public final boolean LIZ = C1340700kzc.LIZ();
    public final boolean LIZIZ;

    public C1354540lLw() {
        this.LIZIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "inbox_add_as_post_enable_intro_page", true, false);
    }

    public final void LIZIZ(C1354580lM0 c1354580lM0, Function0<Unit> function0) {
        C0MNH c0mnh;
        Bitmap bitmap = c1354580lM0.LJI;
        if (bitmap == null) {
            if (C294390BgL.LIZ()) {
                c0mnh = C0MNH.STORY;
            } else {
                c0mnh = C0MNH.POST;
            }
            C823050WQl.LIZLLL().execute(new C0H1T(c1354580lM0.LIZJ, c1354580lM0.LIZIZ, c1354580lM0.LIZ, c0mnh, new AwS230S0300000_21(this, c1354580lM0, function0, 2)));
            return;
        }
        LIZJ(function0, c1354580lM0, this, bitmap);
    }

    public static void LIZLLL(Context context, Comment comment, String str) {
        boolean z;
        if (comment.getTextImageCommentPostItemList() != null && (!r0.isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        String str2 = null;
        if (z) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://aweme/detail/");
            List<String> textImageCommentPostItemList = comment.getTextImageCommentPostItemList();
            if (textImageCommentPostItemList != null) {
                str2 = (String) ListProtector.get(textImageCommentPostItemList, 0);
            }
            smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, str2);
            smartRouteBuildRoute.withParam("refer", str);
            smartRouteBuildRoute.withParam("from_view_post_entry", true);
            smartRouteBuildRoute.open();
            return;
        }
        if (comment.getCommentPostItemList() != null && (!r1.isEmpty())) {
            SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(context, "aweme://aweme/detail/");
            List<String> commentPostItemList = comment.getCommentPostItemList();
            if (commentPostItemList != null) {
                str2 = (String) ListProtector.get(commentPostItemList, 0);
            }
            smartRouteBuildRoute2.withParam(FollowStatusChangeMethod.PARAM_UID, str2);
            smartRouteBuildRoute2.withParam("refer", str);
            smartRouteBuildRoute2.open();
        }
    }

    public static final void LIZJ(Function0<Unit> function0, C1354580lM0 c1354580lM0, C1354540lLw c1354540lLw, Bitmap bitmap) {
        Aweme aweme;
        Comment comment;
        if (function0 != null) {
            function0.invoke();
        }
        c1354580lM0.LJI = bitmap;
        if (c1354540lLw.LIZ) {
            C1354600lM2 c1354600lM2 = C1354600lM2.LIZ;
            c1354600lM2.getClass();
            Context context = c1354580lM0.LIZJ;
            if (context != null && (aweme = c1354580lM0.LIZ) != null && (comment = c1354580lM0.LIZIZ) != null) {
                Bitmap bitmap2 = c1354580lM0.LJI;
                String str = c1354580lM0.LJ;
                boolean z = c1354580lM0.LJII;
                C0MNH c0mnh = C0MNH.POST;
                boolean z2 = true;
                if (!C0C64.LJIILLIIL().LJIIIZ(31744, "inbox_add_as_post_video_style", true, false)) {
                    z2 = false;
                }
                C0MN4 c0mn4 = new C0MN4(comment, bitmap2, c0mnh, str, z, false, z2);
                C1E2V c1e2v = C1E2V.LIZIZ;
                String str2 = c1354580lM0.LIZLLL;
                if (str2 == null) {
                    str2 = "";
                }
                c1e2v.startForward(context, C1354600lM2.LIZ(c1354600lM2, aweme, str2), c0mn4, new AwS387S0200000_21(c1354580lM0, comment, 69));
                return;
            }
            return;
        }
        C1354600lM2.LIZ.getClass();
        C1354600lM2.LJFF(c1354580lM0.LIZ, c1354580lM0.LIZIZ, c1354580lM0.LIZJ, c1354580lM0.LIZLLL, c1354580lM0.LJ, c1354580lM0.LJFF, c1354580lM0.LJI);
    }

    public final void LIZ(int i, Context context, Comment comment, Aweme aweme, String str, String str2, Function0 function0, boolean z) {
        FragmentManager supportFragmentManager;
        String str3;
        UrlModel avatarThumb;
        String str4 = str;
        if (i != 0) {
            if (i == 2) {
                LIZLLL(context, comment, "notification_page");
                return;
            }
            return;
        }
        Comment commentM169clone = comment.m169clone();
        if (commentM169clone.getStickerStruct() != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(commentM169clone.getText());
            sbLIZ.append(C20642515q3.LJI(2131829123));
            commentM169clone.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        C1354580lM0 c1354580lM0 = new C1354580lM0(aweme, commentM169clone, context, str4, str2, 480);
        if (this.LIZIZ) {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                C1354600lM2 c1354600lM2 = C1354600lM2.LIZ;
                if (str4 == null) {
                    str4 = "";
                }
                ForwardMedia forwardMediaLIZ = C1354600lM2.LIZ(c1354600lM2, aweme, str4);
                C0MN4 c0mn4 = new C0MN4(commentM169clone, null, C0MNH.POST, "", false, true, false);
                C1354620lM4 c1354620lM4 = new C1354620lM4(forwardMediaLIZ, c0mn4, z, new AwS299S0300000_21(this, (C1354540lLw) c1354580lM0, (C1354580lM0) function0, (Function0<Unit>) 2));
                if (C1354590lM1.LIZ) {
                    return;
                }
                C1354590lM1.LIZ = true;
                if (z) {
                    str3 = "inbox_activity";
                } else {
                    str3 = "comment_panel";
                }
                C1354590lM1.LIZIZ = str3;
                C1354570lLz c1354570lLz = new C1354570lLz(context);
                c1354570lLz.setParams(c1354620lM4);
                C786410Ut5.Td(C786410Ut5.ne(c1354570lLz.getContext()), R.layout.ahi, c1354570lLz, true);
                User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
                if (curUser != null && (avatarThumb = curUser.getAvatarThumb()) != null) {
                    C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarThumb));
                    c1331670kl3LJIIIIZZ.LJJ(c1354570lLz.getIvAvatarFromXml());
                    c1331670kl3LJIIIIZZ.LJIIJJI();
                }
                FrameLayout quickPublishFromXml = c1354570lLz.getQuickPublishFromXml();
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.br);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
                quickPublishFromXml.setBackground(c384050F3z.LIZ(quickPublishFromXml.getContext()));
                C786410Ut5.O7(quickPublishFromXml, new View.OnClickListener() { // from class: X.0lM6
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                    }
                });
                C786410Ut5.LJZ(8, quickPublishFromXml);
                LinearLayout storyNormalQuickPostFromXml = c1354570lLz.getStoryNormalQuickPostFromXml();
                C384050F3z c384050F3z2 = new C384050F3z();
                c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a04);
                c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
                storyNormalQuickPostFromXml.setBackground(c384050F3z2.LIZ(storyNormalQuickPostFromXml.getContext()));
                C786410Ut5.R7(storyNormalQuickPostFromXml, new View.OnClickListener() { // from class: X.0lM7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                    }
                });
                FrameLayout statusViewFromXml = c1354570lLz.getStatusViewFromXml();
                C384050F3z c384050F3z3 = new C384050F3z();
                c384050F3z3.LIZIZ = Integer.valueOf(R.attr.e7);
                c384050F3z3.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(20));
                statusViewFromXml.setBackground(c384050F3z3.LIZ(c1354570lLz.getContext()));
                C1390410mHn dualBallLoadingFromXml = c1354570lLz.getDualBallLoadingFromXml();
                if (dualBallLoadingFromXml != null) {
                    dualBallLoadingFromXml.LIZJ();
                }
                Comment commentInfo = c0mn4.getCommentInfo();
                if (commentInfo != null) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1354550lLx(context, commentInfo, forwardMediaLIZ, c1354570lLz, null), 3);
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_method", C1354590lM1.LIZIZ);
                    c2344009Gk.LJIIIIZZ("action_type", "show");
                    C20684815ws.LJIILLIIL("inbox_popup_add_as_post", c2344009Gk.LIZ);
                }
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                c1390920mIc.LIZ.LLJJIII = c1354570lLz;
                c1390920mIc.LJIIIIZZ(1);
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJJIJIIJIL = true;
                tuxSheet.LLJLL = true;
                tuxSheet.LLJLILLLLZIIL = false;
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(451));
                TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                tuxSheet2.LLJJL = iLIZIZ;
                tuxSheet2.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0lM5
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        C1354590lM1.LIZ = false;
                    }
                };
                c1354570lLz.setCancelClickLogic(new AwS565S0100000_21(tuxSheet2, 1339));
                tuxSheet2.show(supportFragmentManager, "comment_notice_preview");
                return;
            }
            return;
        }
        LIZIZ(c1354580lM0, function0);
    }
}
