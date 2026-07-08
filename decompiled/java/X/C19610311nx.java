package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.sharedcomment.SharedCommentStickerModel;
import java.io.File;
import kotlin.Unit;

/* JADX INFO: renamed from: X.11nx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19610311nx {
    public static final Object LIZIZ(UrlModel urlModel, C568700MSe c568700MSe) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(c568700MSe));
        c2252611DEt.LJIJJ();
        C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel)).LJIILJJIL(new InterfaceC605070NoH() { // from class: X.01yB
            @Override // X.InterfaceC605070NoH
            public final void onCanceled() {
                InterfaceC20236714Gf<Unit> interfaceC20236714Gf = c2252611DEt;
                Unit unit = Unit.LIZ;
                C189200o6.m2constructorimpl(unit);
                interfaceC20236714Gf.resumeWith(unit);
            }

            @Override // X.InterfaceC605070NoH
            public final void LIZ(File file) {
                InterfaceC20236714Gf<Unit> interfaceC20236714Gf = c2252611DEt;
                Unit unit = Unit.LIZ;
                C189200o6.m2constructorimpl(unit);
                interfaceC20236714Gf.resumeWith(unit);
            }

            @Override // X.InterfaceC605070NoH
            public final void onFailed(Throwable th) {
                InterfaceC20236714Gf<Unit> interfaceC20236714Gf = c2252611DEt;
                Unit unit = Unit.LIZ;
                C189200o6.m2constructorimpl(unit);
                interfaceC20236714Gf.resumeWith(unit);
            }
        });
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(c568700MSe);
        }
        if (objLJIJ == C099R.LJFF()) {
            return objLJIJ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZJ(com.ss.android.ugc.aweme.comment.model.CommentVideoModel r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            boolean r0 = r7 instanceof X.C568700MSe
            if (r0 == 0) goto L60
            r5 = r7
            X.0MSe r5 = (X.C568700MSe) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L60
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 == r1) goto L41
            if (r0 != r2) goto L66
            X.C155000ia.LIZIZ(r4)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r4)
            if (r6 != 0) goto L30
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L30:
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r6.getUserAvatar()
            if (r0 == 0) goto L46
            r5.LL = r6
            r5.LLILLL = r1
            java.lang.Object r0 = LIZIZ(r0, r5)
            if (r0 != r3) goto L46
            return r3
        L41:
            com.ss.android.ugc.aweme.comment.model.CommentVideoModel r6 = r5.LL
            X.C155000ia.LIZIZ(r4)
        L46:
            java.util.List r0 = r6.getImageList()
            if (r0 == 0) goto L25
            java.lang.Object r1 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = (com.ss.android.ugc.aweme.base.model.UrlModel) r1
            if (r1 == 0) goto L25
            r0 = 0
            r5.LL = r0
            r5.LLILLL = r2
            java.lang.Object r0 = LIZIZ(r1, r5)
            if (r0 != r3) goto L25
            return r3
        L60:
            X.0MSe r5 = new X.0MSe
            r5.<init>(r7)
            goto L12
        L66:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19610311nx.LIZJ(com.ss.android.ugc.aweme.comment.model.CommentVideoModel, X.05Vn):java.lang.Object");
    }

    public static final void LIZ(Intent intent, CommentVideoModel commentVideoModel, String str) {
        if (commentVideoModel == null) {
            return;
        }
        C0MUK.LIZIZ(intent).stickerModel.sharedCommentStickerModels.add(new SharedCommentStickerModel(new BaseStickerModel(0, 0, EnumC1466150oFx.SHARED_COMMENT, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), commentVideoModel.copy(commentVideoModel.userId, commentVideoModel.userName, commentVideoModel.userAvatar, commentVideoModel.commentMsg, commentVideoModel.imageList, commentVideoModel.commentId, commentVideoModel.awemeId, commentVideoModel.awemeUserId, commentVideoModel.replyId, commentVideoModel.replyToReplyId, commentVideoModel.channelId, commentVideoModel.enterMethod, commentVideoModel.startTime, commentVideoModel.endTime, commentVideoModel.type, str, commentVideoModel.enterFrom, commentVideoModel.storyMessageType)));
    }
}
