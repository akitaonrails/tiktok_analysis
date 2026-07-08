package Y;

import X.C0HD9;
import X.C0VSJ;
import X.C12848051a;
import X.C1340400kz8;
import X.C1341580l12;
import X.C1357650lQx;
import X.C1360460lVU;
import X.C1369870lkf;
import X.C1371810lnn;
import X.C1371840lnq;
import X.C1371850lnr;
import X.C1375540lto;
import X.C1388190mED;
import X.C19EG;
import X.C20684815ws;
import X.C2188811AlT;
import X.C607070NrV;
import X.C736480Suk;
import X.C786410Ut5;
import X.InterfaceC1369790lkX;
import X.InterfaceC2217461Bqa;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.FileProvider;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS60S2100000_21;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class ACListenerS59S1200000_21 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS59S1200000_21 aCListenerS59S1200000_21, View view) {
        C19EG c19egLIZIZ;
        String aid;
        String strEnterFrom;
        String uid;
        String strEnterFrom2;
        String uid2;
        User user;
        User user2;
        Aweme aweme = ((BaseCommentCell) aCListenerS59S1200000_21.l1).getAweme();
        if (aweme == null || (c19egLIZIZ = C1388190mED.LIZIZ(((BaseCommentCell) aCListenerS59S1200000_21.l1).itemView.getContext())) == null || (aid = aweme.getAid()) == null) {
            return;
        }
        C1360460lVU c1360460lVU = C1360460lVU.LIZIZ;
        CommentContextSource commentContextSourceI6 = ((BaseCommentCell) aCListenerS59S1200000_21.l1).i6();
        User user3 = null;
        if (commentContextSourceI6 != null) {
            strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSourceI6);
        } else {
            strEnterFrom = null;
        }
        String str = aCListenerS59S1200000_21.s0;
        Comment commentQ6 = ((BaseCommentCell) aCListenerS59S1200000_21.l1).q6();
        if (commentQ6 != null && (user2 = commentQ6.getUser()) != null) {
            uid = user2.getUid();
        } else {
            uid = null;
        }
        c1360460lVU.LJJIJIIJI(aweme, strEnterFrom, "comment_panel_edit", "click", str, uid);
        String str2 = aCListenerS59S1200000_21.s0;
        String str3 = ((C0HD9) aCListenerS59S1200000_21.l2).LIZJ;
        CommentContextSource commentContextSourceI62 = ((BaseCommentCell) aCListenerS59S1200000_21.l1).i6();
        if (commentContextSourceI62 != null) {
            strEnterFrom2 = CommentContextSourceKt.enterFrom(commentContextSourceI62);
        } else {
            strEnterFrom2 = null;
        }
        AwS60S2100000_21 awS60S2100000_21 = new AwS60S2100000_21(aid, aCListenerS59S1200000_21.s0, (String) aCListenerS59S1200000_21.l1, (BaseCommentCell<C1340400kz8>) 0);
        Comment commentQ62 = ((BaseCommentCell) aCListenerS59S1200000_21.l1).q6();
        if (commentQ62 != null && (user = commentQ62.getUser()) != null) {
            uid2 = user.getUid();
        } else {
            uid2 = null;
        }
        Comment commentQ63 = ((BaseCommentCell) aCListenerS59S1200000_21.l1).q6();
        if (commentQ63 != null) {
            user3 = commentQ63.getUser();
        }
        c1360460lVU.LJJIL(c19egLIZIZ, aweme, str2, str3, strEnterFrom2, "comment_panel_edit", awS60S2100000_21, uid2, C1341580l12.LIZ(user3));
    }

    public static final void onClick$1(ACListenerS59S1200000_21 aCListenerS59S1200000_21, View view) {
        Uri uriFromFile;
        VideoShare2GifPreviewActivity videoShare2GifPreviewActivity = (VideoShare2GifPreviewActivity) aCListenerS59S1200000_21.l1;
        InterfaceC1369790lkX interfaceC1369790lkX = (InterfaceC1369790lkX) aCListenerS59S1200000_21.l2;
        String str = aCListenerS59S1200000_21.s0;
        if (videoShare2GifPreviewActivity.LLILZIL != null) {
            C736480Suk c736480Suk = new C736480Suk();
            c736480Suk.LIZ("group_id", videoShare2GifPreviewActivity.LLILZIL.awemeId);
            c736480Suk.LIZ("author_id", videoShare2GifPreviewActivity.LLILZIL.authorId);
            c736480Suk.LIZ("enter_from", videoShare2GifPreviewActivity.LLILZIL.enterFrom);
            c736480Suk.LIZ("log_pb", videoShare2GifPreviewActivity.LLILZIL.logPb);
            c736480Suk.LIZ("platform", interfaceC1369790lkX.key());
            C20684815ws.LJIJ("share_as_gif", c736480Suk.LIZIZ());
            C1357650lQx c1357650lQx = new C1357650lQx();
            VideoShare2GifEditContext videoShare2GifEditContext = videoShare2GifPreviewActivity.LLILZIL;
            c1357650lQx.LJJLIIIJ = videoShare2GifEditContext.awemeId;
            c1357650lQx.LJJLIIIJILLIZJL = videoShare2GifEditContext.authorId;
            c1357650lQx.LIZLLL = videoShare2GifEditContext.enterFrom;
            c1357650lQx.LJJLIIIJJI = interfaceC1369790lkX.key();
            c1357650lQx.LLFII = "gif_form";
            c1357650lQx.LJIILJJIL();
        }
        C0VSJ c0vsj = new C0VSJ(videoShare2GifPreviewActivity.LLILZIL.gifImagePath);
        if (Build.VERSION.SDK_INT >= 24) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(videoShare2GifPreviewActivity.getPackageName());
            sbLIZ.append(".fileprovider");
            uriFromFile = FileProvider.androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(videoShare2GifPreviewActivity, C2188811AlT.LIZIZ(sbLIZ), c0vsj);
        } else {
            uriFromFile = Uri.fromFile(c0vsj);
        }
        if (TextUtils.equals(str, "facebook")) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("video/*");
                intent.setClassName(videoShare2GifPreviewActivity.getPackageName(), "com.facebook.composer.shareintent.ImplicitShareIntentHandlerDefaultAlias");
                intent.putExtra("android.intent.extra.STREAM", uriFromFile);
                VideoShare2GifPreviewActivity.LLLLLZL(videoShare2GifPreviewActivity, Intent.createChooser(Intent.createChooser(intent, ""), ""));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else if (videoShare2GifPreviewActivity.LLILZIL != null) {
            interfaceC1369790lkX.LJJJIL(new C1375540lto(uriFromFile, null, null, null, null, false, 252), videoShare2GifPreviewActivity, null);
        }
        videoShare2GifPreviewActivity.LLILZLL = true;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Integer, java.lang.Object] */
    public static final void onClick$2(ACListenerS59S1200000_21 aCListenerS59S1200000_21, View view) {
        C1371840lnq c1371840lnq = C1371810lnn.LIZ;
        String str = aCListenerS59S1200000_21.s0;
        c1371840lnq.getClass();
        if (Intrinsics.LJFF(str, "homepage_hot")) {
            C607070NrV<Integer> c607070NrV = C1371810lnn.LIZIZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1371840lnq.LIZ;
            C12848051a.LIZIZ(c607070NrV.LIZ, -1, c607070NrV.LIZIZ);
            c607070NrV.LIZLLL = -1;
        } else {
            C607070NrV<Integer> c607070NrV2 = C1371810lnn.LIZJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C1371840lnq.LIZ;
            C12848051a.LIZIZ(c607070NrV2.LIZ, -1, c607070NrV2.LIZIZ);
            c607070NrV2.LIZLLL = -1;
        }
        C786410Ut5.LJLLLLLL(8, (View) aCListenerS59S1200000_21.l1);
        ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
        String str2 = aCListenerS59S1200000_21.s0;
        String string = ((C1371850lnr) aCListenerS59S1200000_21.l2).LIZLLL.getString("group_id");
        if (string == null) {
            string = "";
        }
        C1369870lkf.LJIIL(str2, "click_exit_icon", string, "click");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS59S1200000_21(Object obj, BaseCommentCell<C1340400kz8> baseCommentCell, String str, C0HD9 c0hd9) {
        this.$t = c0hd9;
        this.l1 = obj;
        this.s0 = baseCommentCell;
        this.l2 = str;
    }
}
