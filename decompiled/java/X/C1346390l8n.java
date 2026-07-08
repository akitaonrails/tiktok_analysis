package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.InteractPermission;
import com.ss.android.ugc.aweme.feed.model.InteractionPermission;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IExternalService;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0l8n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1346390l8n {
    public static final Pair<Integer, Integer> LIZ(Bitmap bitmap) {
        return ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().processService().calculateGradientBackground(bitmap);
    }

    public static final boolean LIZIZ(Comment comment) {
        String uid;
        if (comment == null || !comment.getIsCommentPostChecked()) {
            return false;
        }
        User user = comment.getUser();
        if ((user != null && (uid = user.getUid()) != null && !uid.equals(C0XQ7.LJFF().getCurUserId())) || comment.getCommentType() != 1 || comment.getImageList() != null || comment.getGift() != null) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(Comment comment) {
        String uid;
        if (comment == null) {
            return false;
        }
        User user = comment.getUser();
        if (user != null && (uid = user.getUid()) != null && !uid.equals(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            return false;
        }
        if ((comment.getStatus() != 1 && comment.getStatus() != 7 && comment.getStatus() != 4) || comment.getCommentType() != 1 || comment.getImageList() != null || comment.getGift() != null) {
            return false;
        }
        C1354600lM2.LIZ.getClass();
        if (C1354600lM2.LIZLLL(comment)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(Aweme aweme) {
        User author;
        User author2;
        String uid;
        InteractPermission interactPermission;
        InteractionPermission allowAddingCommentAsPost;
        User author3;
        User curUser;
        if (aweme == null) {
            return false;
        }
        User author4 = aweme.getAuthor();
        if ((author4 != null && author4.isAccuratePrivateAccount()) || !AwemeExtKt.isPublic(aweme)) {
            return false;
        }
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if ((iAccountUserServiceLJFF != null && (curUser = iAccountUserServiceLJFF.getCurUser()) != null && curUser.getAccountType() == 3) || C729510SjV.LJJIJIL(aweme) || AwemeExtKt.isPhotoMode(aweme) || aweme.getAwemeType() == 160 || aweme.isSubOnlyVideo() || aweme.getIsCommentPostVideo() || AwemeExtKt.isAdTraffic(aweme)) {
            return false;
        }
        if (((aweme.getCommentSetting() == 1 || ((author3 = aweme.getAuthor()) != null && author3.getCommentSetting() == 1)) && (((author = aweme.getAuthor()) == null || author.getFollowStatus() != 2) && (author2 = aweme.getAuthor()) != null && (uid = author2.getUid()) != null && !uid.equals(C0XQ7.LJFF().getCurUserId()))) || (interactPermission = aweme.getInteractPermission()) == null || (allowAddingCommentAsPost = interactPermission.getAllowAddingCommentAsPost()) == null || allowAddingCommentAsPost.status != 0) {
            return false;
        }
        return true;
    }
}
