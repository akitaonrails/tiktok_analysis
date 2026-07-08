package X;

import Y.ARunnableS90S0200000_21;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l39, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1342890l39 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1344210l5H LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ List<InterfaceC1891350zJl> LLILLL;
    public final /* synthetic */ CommentItemList LLILZ;
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<C1220590hrt>> LLILZIL;
    public final /* synthetic */ C1220590hrt LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1342890l39(C1344210l5H c1344210l5H, boolean z, List<InterfaceC1891350zJl> list, CommentItemList commentItemList, InterfaceC1364105Vn<? super AbstractC316870CbV<C1220590hrt>> interfaceC1364105Vn, C1220590hrt c1220590hrt) {
        super(0);
        this.LL = c1344210l5H;
        this.LLILLJJLI = z;
        this.LLILLL = list;
        this.LLILZ = commentItemList;
        this.LLILZIL = interfaceC1364105Vn;
        this.LLILZLL = c1220590hrt;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<Comment> list;
        List<Comment> list2;
        C1340430kzB c1340430kzB;
        Comment comment;
        String cid;
        Object objLJJJLIIL;
        AwemeStatistics statistics;
        InterfaceC665370Q7z interfaceC665370Q7z;
        InterfaceC665370Q7z interfaceC665370Q7z2;
        C20600815jK<InterfaceC1891350zJl> c20600815jKLJIIIIZZ;
        C20600815jK<InterfaceC1891350zJl> c20600815jKLJIIIIZZ2;
        CommentCommonModel commonModel;
        if (!C295480Bi6.LIZ()) {
            CommentContextSource commentContextSource = this.LL.LJJIJIL;
            boolean z = (commentContextSource == null || (commonModel = commentContextSource.getCommonModel()) == null || !commonModel.isFriendsSimpleDetail()) ? false : true;
            if (!Intrinsics.LJFF(CommentContextSourceKt.fromPage(this.LL.LJJIJIL), "graphic_detail") && !z && (c20600815jKLJIIIIZZ = this.LL.LJIIIIZZ()) != null && c20600815jKLJIIIIZZ.LJIIIIZZ() > 0 && (c20600815jKLJIIIIZZ2 = this.LL.LJIIIIZZ()) != null) {
                c20600815jKLJIIIIZZ2.LJFF(null);
            }
        }
        if (this.LLILLJJLI) {
            C1344210l5H c1344210l5H = this.LL;
            if (c1344210l5H.LIZ == EnumC1342450l2R.DEFAULT_SORT && (interfaceC665370Q7z2 = c1344210l5H.LJIIZILJ) != null) {
                WeakReference<Fragment> weakReference = c1344210l5H.LIZIZ.LLIZLLLIL;
                ICommentListAssemAbility iCommentListAssemAbilityLIZLLL = C1345760l7m.LIZLLL(weakReference != null ? weakReference.get() : null, interfaceC665370Q7z2);
                if (iCommentListAssemAbilityLIZLLL != null) {
                    iCommentListAssemAbilityLIZLLL.nV1();
                }
            }
        }
        if (this.LLILLJJLI) {
            C1341170l0N c1341170l0N = C1341170l0N.LIZ;
            Aweme aweme = this.LL.LJIILL;
            c1341170l0N.getClass();
            if (aweme != null) {
                if (!((AbstractC848400XPy) C0XQ7.LJFF()).LIZJ(AwemeExtKt.getAuthorUid(aweme)) && (statistics = aweme.getStatistics()) != null && statistics.getCommentCount() != 0 && C1348690lCV.LIZIZ(aweme)) {
                    C20684815ws.LJIILLIIL("show_request_permission_post_counts_banner", C1341170l0N.LIZIZ.LIZ);
                    if (ComplianceServiceProvider.LJIIJJI().LJIILJJIL()) {
                        C1344210l5H c1344210l5H2 = this.LL;
                        if (c1344210l5H2.LIZ == EnumC1342450l2R.DEFAULT_SORT && (interfaceC665370Q7z = c1344210l5H2.LJIIZILJ) != null) {
                            WeakReference<Fragment> weakReference2 = c1344210l5H2.LIZIZ.LLIZLLLIL;
                            ICommentListAssemAbility iCommentListAssemAbilityLIZLLL2 = C1345760l7m.LIZLLL(weakReference2 != null ? weakReference2.get() : null, interfaceC665370Q7z);
                            if (iCommentListAssemAbilityLIZLLL2 != null) {
                                iCommentListAssemAbilityLIZLLL2.Wm1();
                            }
                        }
                    }
                }
            }
        }
        if (C0BJA.LIZIZ()) {
            this.LL.LIZ(this.LLILLL, null);
            if (Intrinsics.LJFF(CommentContextSourceKt.fromPage(this.LL.LJJIJIL), "graphic_detail")) {
                C1344210l5H c1344210l5H3 = this.LL;
                C786410Ut5.LJJZZIII(c1344210l5H3.LJJIJIIJIL, new ARunnableS90S0200000_21(c1344210l5H3, this.LLILLL, 35));
            }
        }
        int size = (this.LL.LJJIJIIJI.size() + this.LLILLL.size()) - 100;
        if (size > 0) {
            C1344210l5H c1344210l5H4 = this.LL;
            int i = 0;
            do {
                if (c1344210l5H4.LJJIJIIJI.size() > 0 && (objLJJJLIIL = C13LP.LJJJLIIL(c1344210l5H4.LJJIJIIJI)) != null) {
                    c1344210l5H4.LJJIJIIJI.remove(objLJJJLIIL);
                }
                i++;
            } while (i < size);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSuccess: items.size = ");
        List<Comment> list3 = this.LLILZ.items;
        sbLIZ.append(list3 != null ? Integer.valueOf(list3.size()) : null);
        sbLIZ.append(" sortType = ");
        sbLIZ.append(this.LL.LIZ);
        sbLIZ.append(" contextSource?.currSortType = ");
        CommentContextSource commentContextSource2 = this.LL.LJJIJIL;
        sbLIZ.append(commentContextSource2 != null ? commentContextSource2.getCurrSortType() : null);
        sbLIZ.append("  isrefresh = ");
        sbLIZ.append(this.LLILLJJLI);
        C2188811AlT.LIZIZ(sbLIZ);
        LinkedHashSet<String> linkedHashSet = this.LL.LJJIJIIJI;
        List<InterfaceC1891350zJl> list4 = this.LLILLL;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1891350zJl interfaceC1891350zJl : list4) {
            if ((interfaceC1891350zJl instanceof C1340430kzB) && (c1340430kzB = (C1340430kzB) interfaceC1891350zJl) != null && (comment = c1340430kzB.LLILZIL) != null && (cid = comment.getCid()) != null) {
                arrayList.add(cid);
            }
        }
        linkedHashSet.addAll(arrayList);
        C1344210l5H c1344210l5H5 = this.LL;
        EnumC1342450l2R enumC1342450l2R = c1344210l5H5.LIZ;
        CommentContextSource commentContextSource3 = c1344210l5H5.LJJIJIL;
        if (enumC1342450l2R == (commentContextSource3 != null ? commentContextSource3.getCurrSortType() : null) && this.LLILZIL != null) {
            CommentItemList commentItemList = this.LLILZ;
            if (!commentItemList.hasMore || (list2 = commentItemList.items) == null || list2.isEmpty()) {
                C1344210l5H c1344210l5H6 = this.LL;
                InterfaceC1364105Vn<AbstractC316870CbV<C1220590hrt>> interfaceC1364105Vn = this.LLILZIL;
                C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
                List<InterfaceC1891350zJl> list5 = this.LLILLL;
                c317290CcB.getClass();
                c1344210l5H6.LJJIIZ(interfaceC1364105Vn, new C316640Cb8(list5));
            } else {
                InterfaceC1364105Vn<AbstractC316870CbV<C1220590hrt>> interfaceC1364105Vn2 = this.LLILZIL;
                C323380Cm0 c323380Cm0LJ = C317290CcB.LJ(AbstractC316870CbV.LIZ, null, new C1220590hrt(this.LLILZ.cursor, this.LLILZLL.LIZIZ, null, null, null, 0, 60), this.LLILLL, 1);
                C189200o6.m2constructorimpl(c323380Cm0LJ);
                interfaceC1364105Vn2.resumeWith(c323380Cm0LJ);
            }
            return Unit.LIZ;
        }
        C1344210l5H c1344210l5H7 = this.LL;
        if (c1344210l5H7.LJIILIIL == null || !this.LLILLJJLI) {
            if (this.LLILLJJLI) {
                C20600815jK<InterfaceC1891350zJl> c20600815jKLJI = c1344210l5H7.LJI();
                if (c20600815jKLJI != null) {
                    c20600815jKLJI.LJIILL(this.LLILLL, null);
                }
            } else {
                C20600815jK<InterfaceC1891350zJl> c20600815jKLJI2 = c1344210l5H7.LJI();
                if (c20600815jKLJI2 != null) {
                    c20600815jKLJI2.LIZLLL(this.LLILLL, null);
                }
            }
            this.LL.LJIILIIL(this.LLILLJJLI);
            return Unit.LIZ;
        }
        C20600815jK<InterfaceC1891350zJl> c20600815jKLJI3 = c1344210l5H7.LJI();
        if (c20600815jKLJI3 != null) {
            c20600815jKLJI3.LJIIJJI(this.LLILLL, null);
        }
        C20607315kN c20607315kN = this.LL.LJIILIIL;
        if (c20607315kN == null) {
            return null;
        }
        CommentItemList commentItemList2 = this.LLILZ;
        c20607315kN.LJIIIZ((!commentItemList2.hasMore || (list = commentItemList2.items) == null || list.isEmpty()) ? false : true);
        return Unit.LIZ;
    }
}
