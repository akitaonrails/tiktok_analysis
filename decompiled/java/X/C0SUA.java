package X;

import android.graphics.PointF;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.IToolsBusinessService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeTextInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0SUA, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SUA implements InterfaceC19578611iq {
    public final C19EG LL;
    public final C705930RmZ LLILLJJLI;
    public final Aweme LLILLL;

    @Override // X.InterfaceC19578611iq
    public final boolean onClick(InteractStickerStruct interactStickerStruct) {
        return false;
    }

    @Override // X.InterfaceC19578611iq
    public final boolean onClick(InteractStickerStruct interactStickerStruct, PointF pointF) {
        String str;
        Long originalItemId;
        Integer numValueOf;
        String aid;
        String str2;
        PhotoModeTextInfo photoModeTextInfo;
        User author;
        PhotoModeTextInfo photoModeTextInfo2;
        C0R60 c0r60;
        C259800zU c259800zU = new C259800zU();
        String string = JSONObjectProtectorUtils.getString(new JSONObject(interactStickerStruct.getAttr()), "original_user_id");
        C705930RmZ c705930RmZ = this.LLILLJJLI;
        String uid = null;
        if (c705930RmZ != null && (c0r60 = c705930RmZ.LJIIZILJ) != null) {
            str = c0r60.LIZ;
        } else {
            str = null;
        }
        Aweme aweme = this.LLILLL;
        if (aweme != null && (photoModeTextInfo2 = aweme.getPhotoModeTextInfo()) != null) {
            originalItemId = photoModeTextInfo2.getOriginalItemId();
        } else {
            originalItemId = null;
        }
        String strValueOf = String.valueOf(originalItemId);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        } else {
            numValueOf = null;
        }
        c0lab.LIZLLL(numValueOf, "aweme_type");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c0lab.LJ("group_id", aid);
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            uid = author.getUid();
        }
        c0lab.LJ("author_id", uid);
        c0lab.LIZ(C735370Ssx.LJIILL(aweme), "pic_cnt");
        c0lab.LJ("to_group_id", strValueOf);
        c0lab.LJ("to_author_id", string);
        if (aweme != null && (photoModeTextInfo = aweme.getPhotoModeTextInfo()) != null && photoModeTextInfo.isAISummary()) {
            str2 = "ai_summary";
        } else {
            str2 = "ori_text";
        }
        c0lab.LJ("ori_context_type", str2);
        c0lab.LJ("hotzone_type", "original_video");
        C20684815ws.LJIILLIIL("ttinter_textmode_hotzone_click", c0lab.LIZ);
        IToolsBusinessService iToolsBusinessService = (IToolsBusinessService) PluggableExtentionKt.pluggableSpi$default(IToolsBusinessService.class, false, false, false, 14, null);
        if (iToolsBusinessService != null) {
            iToolsBusinessService.showTip(this.LL, interactStickerStruct, pointF, 2131848875, new AwS590S0100000_11(c259800zU, (C259800zU<C0P0T>) 603), new AwS127S1200000_11(c259800zU, (C259800zU<C0P0T>) this, (C0SUA) string, (String) 17));
        }
        return true;
    }

    public C0SUA(C19EG c19eg, Aweme aweme, C705930RmZ c705930RmZ) {
        this.LL = c19eg;
        this.LLILLJJLI = c705930RmZ;
        this.LLILLL = aweme;
    }
}
