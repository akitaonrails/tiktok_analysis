package X;

import com.ss.android.ugc.aweme.comment.model.CommentInputContent;

/* JADX INFO: renamed from: X.0l9b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1346890l9b {
    public static final C1346890l9b LIZ = new C1346890l9b();

    public static boolean LIZ(int i, CommentInputContent commentInputContent) {
        boolean z;
        if (commentInputContent == null) {
            return false;
        }
        boolean zLIZ = C756302xN.LIZ(commentInputContent.audioList);
        boolean zLIZ2 = C756302xN.LIZ(commentInputContent.imageList);
        if (commentInputContent.stickerStruct != null) {
            z = true;
        } else {
            z = false;
        }
        if (!zLIZ2 && !z) {
            if (!zLIZ) {
                return false;
            }
        } else {
            if (zLIZ) {
            }
            if (!zLIZ2 && i == 1) {
                return true;
            }
            if (z || i != 1) {
                return false;
            }
            return true;
        }
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        if (!zLIZ2) {
        }
        if (z) {
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(int r10, android.view.View r11, com.ss.android.ugc.aweme.comment.model.CommentInputContent r12, kotlin.jvm.functions.Function0 r13, kotlin.jvm.functions.Function0 r14, kotlin.jvm.functions.Function0 r15, kotlin.jvm.functions.Function2 r16) {
        /*
            r9 = r11
            if (r9 != 0) goto L4
            return
        L4:
            android.content.Context r8 = r9.getContext()
            if (r8 != 0) goto Lb
            return
        Lb:
            r1 = r12
            if (r1 != 0) goto Lf
            return
        Lf:
            java.util.List<com.ss.android.ugc.aweme.comment.model.AudioCommentModel> r0 = r1.audioList
            boolean r2 = X.C756302xN.LIZ(r0)
            java.util.List<com.ss.android.ugc.aweme.comment.model.CommentImageModel> r0 = r1.imageList
            boolean r6 = X.C756302xN.LIZ(r0)
            com.ss.android.ugc.aweme.comment.model.CommentStickerStruct r0 = r1.stickerStruct
            r3 = 0
            r4 = 1
            if (r0 == 0) goto Lb6
            r5 = 1
        L22:
            java.util.List<com.ss.android.ugc.aweme.comment.model.CommentImageModel> r1 = r1.imageList
            r11 = r14
            if (r1 == 0) goto L47
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L47
            java.util.Iterator r1 = r1.iterator()
        L31:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L47
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.comment.model.CommentImageModel r0 = (com.ss.android.ugc.aweme.comment.model.CommentImageModel) r0
            com.ss.android.ugc.aweme.mediachoose.helper.LivePhotoInfo r0 = r0.getLivePhotoInfo()
            if (r0 == 0) goto L31
        L43:
            r11.invoke()
            return
        L47:
            X.01GW r0 = X.C275940Arg.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L43
            r7 = r10
            if (r2 == 0) goto Lb4
            r1 = 3
            r0 = 2
            if (r7 == r4) goto Lb0
            if (r7 == r0) goto Lac
            if (r7 != r1) goto Lb4
            r2 = 2131826747(0x7f11183b, float:1.9286387E38)
        L63:
            if (r6 == 0) goto L6a
            if (r7 != r4) goto L6a
            r2 = 2131826756(0x7f111844, float:1.9286405E38)
        L6a:
            if (r5 == 0) goto La9
            if (r7 != r4) goto La9
            r2 = 2131826757(0x7f111845, float:1.9286407E38)
        L71:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r5 = r16
            r5.invoke(r1, r0)
            X.0mTM r1 = new X.0mTM
            r1.<init>(r8)
            r1.LJFF(r2)
            r0 = 2131826752(0x7f111840, float:1.9286397E38)
            r1.LIZ(r0)
            r1.LJII = r3
            kotlin.jvm.internal.AwS110S0400000_12 r7 = new kotlin.jvm.internal.AwS110S0400000_12
            r12 = 6
            r10 = r13
            r7.<init>(r8, r9, r10, r11, r12)
            X.C985403tE.LIZ(r1, r7)
            kotlin.jvm.internal.AwS110S0400000_12 r2 = new kotlin.jvm.internal.AwS110S0400000_12
            r7 = 7
            r6 = r15
            r3 = r9
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r1.LIZLLL(r2)
            X.0mTF r0 = new X.0mTF
            r0.<init>(r1)
            r0.LIZLLL()
        La8:
            return
        La9:
            if (r2 == 0) goto La8
            goto L71
        Lac:
            r2 = 2131826745(0x7f111839, float:1.9286383E38)
            goto L63
        Lb0:
            r2 = 2131826743(0x7f111837, float:1.928638E38)
            goto L63
        Lb4:
            r2 = 0
            goto L63
        Lb6:
            r5 = 0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1346890l9b.LIZIZ(int, android.view.View, com.ss.android.ugc.aweme.comment.model.CommentInputContent, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2):void");
    }
}
