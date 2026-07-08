package X;

import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.search.CommentSuggestWordList;
import com.ss.android.ugc.aweme.feed.model.search.SuggestWordStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lCA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1348480lCA implements InterfaceC1350330lF9 {
    @Override // X.InterfaceC1350330lF9
    public final String H3() {
        return "search_keywords";
    }

    @Override // X.InterfaceC1350330lF9
    public final void LIZ() {
    }

    @Override // X.InterfaceC1350330lF9
    public final void LJ() {
    }

    @Override // X.InterfaceC1350330lF9
    public final Map LJFF(Aweme aweme) {
        return null;
    }

    @Override // X.InterfaceC1350330lF9
    public final Map LJII(Aweme aweme) {
        return null;
    }

    @Override // X.InterfaceC1350330lF9
    public final void LJIIIZ(Aweme aweme) {
    }

    @Override // X.InterfaceC1350330lF9
    public final int zg() {
        return 14;
    }

    @Override // X.InterfaceC1350330lF9
    public final Integer LJIIIIZZ(Aweme aweme) {
        return ((ISearchService) ServiceManager.get().getService(ISearchService.class)).LJJIIZI();
    }

    @Override // X.InterfaceC1350330lF9
    public final void LIZJ(CommentContextSource commentContextSource, Aweme aweme) {
        C1350340lFA.LIZ(this, aweme, commentContextSource);
    }

    @Override // X.InterfaceC1350330lF9
    public final boolean LJI(CommentContextSource commentContextSource, Aweme aweme) {
        List<SuggestWordStruct> suggestWords;
        String scene;
        if (aweme == null || commentContextSource == null) {
            return false;
        }
        CommentSuggestWordList commentSuggestWordList = aweme.getCommentSuggestWordList();
        String aid = null;
        if (commentSuggestWordList != null && (suggestWords = commentSuggestWordList.getSuggestWords()) != null) {
            boolean z = false;
            for (SuggestWordStruct suggestWordStruct : suggestWords) {
                if (suggestWordStruct != null) {
                    scene = suggestWordStruct.getScene();
                } else {
                    scene = null;
                }
                if (Intrinsics.LJFF("comment_top", scene)) {
                    z = true;
                }
            }
            if (!z || ((ISearchService) ServiceManager.get().getService(ISearchService.class)).LLLLLLLLL()) {
                return false;
            }
            C0QQY c0qqy = C0QQY.LIZ;
            Aweme aweme2 = CommentContextSourceKt.aweme(commentContextSource);
            if (aweme2 != null) {
                aid = aweme2.getAid();
            }
            C1349800lEI c1349800lEI = new C1349800lEI(aid);
            c1349800lEI.setEventType(commentContextSource.getCommonModel().eventType);
            c0qqy.getClass();
            if (C0QQY.LIZ(aweme, c1349800lEI)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1350330lF9
    public final boolean LIZLLL(Aweme aweme, C2189821An6 c2189821An6, String str) {
        boolean z;
        List<SuggestWordStruct> suggestWords;
        SuggestWordStruct suggestWordStruct;
        List<SuggestWordStruct> suggestWords2;
        String scene;
        if (aweme == null) {
            return false;
        }
        CommentSuggestWordList commentSuggestWordList = aweme.getCommentSuggestWordList();
        String qrecVirtualEnable = null;
        if (commentSuggestWordList != null && (suggestWords2 = commentSuggestWordList.getSuggestWords()) != null) {
            z = false;
            for (SuggestWordStruct suggestWordStruct2 : suggestWords2) {
                if (suggestWordStruct2 != null) {
                    scene = suggestWordStruct2.getScene();
                } else {
                    scene = null;
                }
                if (Intrinsics.LJFF("comment_top", scene)) {
                    z = true;
                }
            }
        } else {
            z = false;
        }
        CommentSuggestWordList commentSuggestWordList2 = aweme.getCommentSuggestWordList();
        if (commentSuggestWordList2 != null && (suggestWords = commentSuggestWordList2.getSuggestWords()) != null && (suggestWordStruct = (SuggestWordStruct) C13LP.LJJJLL(suggestWords)) != null) {
            qrecVirtualEnable = suggestWordStruct.getQrecVirtualEnable();
        }
        if (Intrinsics.LJFF(qrecVirtualEnable, "1") || !z || ComplianceServiceProvider.LJI().LJJJI() || ((ISearchService) ServiceManager.get().getService(ISearchService.class)).LLLLLLLLL()) {
            return false;
        }
        C0QQY c0qqy = C0QQY.LIZ;
        C1349800lEI c1349800lEI = new C1349800lEI(aweme.getAid());
        c1349800lEI.setEventType(str);
        c0qqy.getClass();
        if (C0QQY.LIZ(aweme, c1349800lEI)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006c  */
    @Override // X.InterfaceC1350330lF9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LJIIL(android.content.Context r15, com.ss.android.ugc.aweme.feed.model.Aweme r16, com.ss.android.ugc.aweme.comment.model.CommentContextSource r17) {
        /*
            r14 = this;
            r13 = 0
            r3 = r15
            if (r3 != 0) goto L5
            return r13
        L5:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.search.ISearchService> r0 = com.ss.android.ugc.aweme.search.ISearchService.class
            java.lang.Object r2 = r1.getService(r0)
            com.ss.android.ugc.aweme.search.ISearchService r2 = (com.ss.android.ugc.aweme.search.ISearchService) r2
            r1 = r17
            if (r1 == 0) goto L74
            com.ss.android.ugc.aweme.comment.model.CommentCommonModel r0 = r1.getCommonModel()
            if (r0 == 0) goto L74
            java.lang.String r0 = r0.eventType
        L1d:
            java.lang.String r5 = X.C679800QlW.LIZ(r0)
            if (r1 == 0) goto L6f
            com.ss.android.ugc.aweme.comment.model.CommentCommonModel r0 = r1.getCommonModel()
            if (r0 == 0) goto L6f
            java.lang.String r6 = r0.tabName
        L2b:
            boolean r0 = X.C1345700l7g.LJIIIIZZ(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L33:
            boolean r7 = X.C1346420l8q.LIZ(r0)
            if (r1 == 0) goto L6c
            com.ss.android.ugc.aweme.comment.model.CommentCommonModel r0 = r1.getCommonModel()
            if (r0 == 0) goto L6c
            java.lang.Long r0 = r0.sessionId
            if (r0 == 0) goto L6c
            long r8 = r0.longValue()
        L47:
            r4 = r16
            if (r4 == 0) goto L6a
            boolean r11 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isPhotoMode(r4)
        L4f:
            kotlin.jvm.internal.AwS265S0300000_21 r12 = new kotlin.jvm.internal.AwS265S0300000_21
            r0 = 32
            r12.<init>(r14, r4, r1, r0)
            if (r1 == 0) goto L64
            com.ss.android.ugc.aweme.comment.model.CommentCommonModel r0 = r1.getCommonModel()
            if (r0 == 0) goto L64
            int r0 = r0.pageType
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
        L64:
            r10 = 0
            android.view.View r0 = r2.LLLFZ(r3, r4, r5, r6, r7, r8, r10, r11, r12, r13)
            return r0
        L6a:
            r11 = 0
            goto L4f
        L6c:
            r8 = 0
            goto L47
        L6f:
            r6 = r13
            if (r1 != 0) goto L2b
            r0 = r13
            goto L33
        L74:
            r0 = r13
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1348480lCA.LJIIL(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.comment.model.CommentContextSource):android.view.View");
    }
}
