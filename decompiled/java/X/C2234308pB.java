package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.story.IStoryService;
import com.ss.android.ugc.aweme.story.model.ContentReuseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08pB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2234308pB {
    public static final C2234308pB LIZ = new C2234308pB();
    public static final InterfaceC330760Cxu LIZIZ;
    public static C2232208oq<ContentReuseResponse> LIZJ;

    static {
        IStoryService iStoryService = (IStoryService) PluggableExtentionKt.pluggableSpi$default(IStoryService.class, false, false, false, 14, null);
        LIZIZ = iStoryService != null ? iStoryService.LJJLIIIJJI() : null;
    }

    public static void LIZ(Comment comment) {
        Object obj;
        C2232208oq<ContentReuseResponse> c2232208oq = LIZJ;
        if (c2232208oq != null) {
            obj = c2232208oq.LIZ;
        } else {
            obj = null;
        }
        if (!Intrinsics.LJFF(obj, comment.getUser().getUid())) {
            LIZJ = new C2232208oq<>(new C2234108p9(comment, null), comment.getUser().getUid());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.comment.model.Comment r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.story.model.ContentReuseResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C2234208pA
            if (r0 == 0) goto L46
            r5 = r8
            X.08pA r5 = (X.C2234208pA) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L46
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r5.LLILLL
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L32
            if (r1 == r0) goto L54
            if (r1 != r2) goto L4c
            X.C155000ia.LIZIZ(r4)
        L25:
            if (r4 != 0) goto L31
        L27:
            com.ss.android.ugc.aweme.story.model.ContentReuseResponse r4 = new com.ss.android.ugc.aweme.story.model.ContentReuseResponse
            r0 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.<init>(r0)
        L31:
            return r4
        L32:
            X.C155000ia.LIZIZ(r4)
            X.0Cxu r1 = X.C2234308pB.LIZIZ
            if (r1 == 0) goto L27
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.getUser()
            r5.LLILLL = r2
            java.lang.Object r4 = r1.LIZLLL(r0, r5)
            if (r4 != r3) goto L25
            return r3
        L46:
            X.08pA r5 = new X.08pA
            r5.<init>(r6, r8)
            goto L12
        L4c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L54:
            X.C155000ia.LIZIZ(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2234308pB.LIZIZ(com.ss.android.ugc.aweme.comment.model.Comment, X.05Vn):java.lang.Object");
    }
}
