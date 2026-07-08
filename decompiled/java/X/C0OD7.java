package X;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OD7, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OD7 implements InterfaceC19614811og {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ C705930RmZ LLILLL;
    public final /* synthetic */ Aweme LLILZ;
    public final /* synthetic */ C19EG LLILZIL;

    @Override // X.InterfaceC19578611iq
    public final boolean onClick(InteractStickerStruct interactStickerStruct, PointF pointF) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    @Override // X.InterfaceC19614811og
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c4(com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r35) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OD7.c4(com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct):void");
    }

    @Override // X.InterfaceC19578611iq
    public final boolean onClick(InteractStickerStruct interactStickerStruct) {
        String str;
        int followStatus;
        Parcelable[] parcelableArr;
        String str2;
        User author;
        String uid;
        C0R60 c0r60;
        C0OD8 c0od8;
        List<AddYoursAvatar> userAvatars;
        User author2;
        C0R60 c0r602;
        C0OD3 c0od3 = C0OD3.LIZ;
        Context context = this.LLILLJJLI;
        C705930RmZ c705930RmZ = this.LLILLL;
        Aweme aweme = this.LLILZ;
        c0od3.getClass();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//addyours/topic_detail");
        String str3 = "";
        if (c705930RmZ == null || (c0r602 = c705930RmZ.LJIIZILJ) == null || (str = c0r602.LIZ) == null) {
            str = "";
        }
        smartRouteBuildRoute.withParam("enter_from", str);
        if (aweme != null && (author2 = aweme.getAuthor()) != null) {
            followStatus = author2.getFollowStatus();
        } else {
            followStatus = 0;
        }
        smartRouteBuildRoute.withParam("follow_status", followStatus);
        AddYoursStickerStruct addYoursStickerStruct = interactStickerStruct.getAddYoursStickerStruct();
        if (addYoursStickerStruct == null || (userAvatars = addYoursStickerStruct.getUserAvatars()) == null || (parcelableArr = (AddYoursAvatar[]) userAvatars.toArray(new AddYoursAvatar[0])) == null) {
            parcelableArr = new Parcelable[0];
        }
        smartRouteBuildRoute.withParam("user_avatars", parcelableArr);
        smartRouteBuildRoute.withParam("topic", C0OD9.LIZ(interactStickerStruct.getAddYoursStickerStruct()));
        String str4 = null;
        if (c705930RmZ != null && (c0od8 = c705930RmZ.LJIJJLI) != null) {
            str2 = c0od8.LIZ;
        } else {
            str2 = null;
        }
        smartRouteBuildRoute.withParam("add_yours_enter_from_before_detail_page", str2);
        if (c705930RmZ != null && (c0r60 = c705930RmZ.LJIIZILJ) != null) {
            str4 = c0r60.LIZ;
        }
        if (Intrinsics.LJFF(str4, "others_homepage")) {
            if (aweme != null && (author = aweme.getAuthor()) != null && (uid = author.getUid()) != null) {
                str3 = uid;
            }
            smartRouteBuildRoute.withParam("viewed_user_id", str3);
        }
        if (aweme != null) {
            smartRouteBuildRoute.withParam("from_aweme", aweme);
        }
        smartRouteBuildRoute.open();
        return true;
    }

    public C0OD7(Context context, C19EG c19eg, Aweme aweme, C705930RmZ c705930RmZ, boolean z) {
        this.LL = z;
        this.LLILLJJLI = context;
        this.LLILLL = c705930RmZ;
        this.LLILZ = aweme;
        this.LLILZIL = c19eg;
    }
}
