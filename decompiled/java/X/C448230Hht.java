package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.search.detail.comment.viewmodel.SearchDetailCommentVM;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hht, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C448230Hht extends C09AY implements Function1<C448260Hhw, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ SearchDetailCommentVM LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ VideoItemParams LLILZ;
    public final /* synthetic */ Fragment LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C448230Hht(long j, SearchDetailCommentVM searchDetailCommentVM, Aweme aweme, VideoItemParams videoItemParams, Fragment fragment) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = searchDetailCommentVM;
        this.LLILLL = aweme;
        this.LLILZ = videoItemParams;
        this.LLILZIL = fragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C448260Hhw c448260Hhw) {
        String strValueOf;
        String str;
        String str2;
        String str3;
        String strLIZ;
        C448260Hhw c448260Hhw2 = c448260Hhw;
        Comment comment = c448260Hhw2.LL;
        if (comment != null) {
            long j = c448260Hhw2.LLILZ;
            if (j > 0) {
                long j2 = this.LL;
                if (j2 == 0) {
                    strValueOf = String.valueOf(C0RQ4.LIZIZ());
                } else {
                    strValueOf = String.valueOf(j2 - j);
                }
                this.LLILLJJLI.setState(AFwS236S0000000_6.get$arr$(272));
                C448250Hhv c448250Hhv = new C448250Hhv(comment, this.LLILLL);
                VideoItemParams videoItemParams = this.LLILZ;
                Fragment fragment = this.LLILZIL;
                Aweme aweme = this.LLILLL;
                SearchDetailCommentVM searchDetailCommentVM = this.LLILLJJLI;
                String cid = comment.getCid();
                String str4 = "";
                if (cid == null) {
                    cid = "";
                }
                c448250Hhv.LJIJI("search_comment_id", cid);
                String str5 = videoItemParams.mEventType;
                if (str5 == null) {
                    str5 = "";
                }
                c448250Hhv.LJIJI("enter_from", str5);
                if (fragment == null || (str = ((C0PRC) ((ISearchContextAbility) searchDetailCommentVM.LL.getValue()).Ph1().LIZJ()).LLILLL) == null) {
                    str = "";
                }
                c448250Hhv.LJIJI("search_id", str);
                c448250Hhv.LJIJI("duration", strValueOf);
                String strLIZ2 = C436190H8n.LIZ(aweme);
                if (strLIZ2 == null) {
                    strLIZ2 = "";
                }
                c448250Hhv.LJIJI("search_result_id", strLIZ2);
                if (comment.getCommentType() == 1) {
                    str2 = "1";
                } else {
                    str2 = "2";
                }
                c448250Hhv.LJIJI("comment_level", str2);
                C1ER1 c1er1 = C1ER1.LIZIZ;
                String strLLJJIJIL = c1er1.LLJJIJIL();
                if (strLLJJIJIL == null) {
                    strLLJJIJIL = "";
                }
                c448250Hhv.LJIJI("end_to_end_search_session_id", strLLJJIJIL);
                c448250Hhv.LJIILJJIL();
                C448240Hhu c448240Hhu = new C448240Hhu(comment, this.LLILLL);
                VideoItemParams videoItemParams2 = this.LLILZ;
                Fragment fragment2 = this.LLILZIL;
                Aweme aweme2 = this.LLILLL;
                SearchDetailCommentVM searchDetailCommentVM2 = this.LLILLJJLI;
                String cid2 = comment.getCid();
                if (cid2 == null) {
                    cid2 = "";
                }
                c448240Hhu.LJIJI("search_comment_id", cid2);
                String str6 = videoItemParams2.mEventType;
                if (str6 == null) {
                    str6 = "";
                }
                c448240Hhu.LJIJI("enter_from", str6);
                c448240Hhu.LJIJI("enter_method", "click_comment_external_exposure");
                if (fragment2 == null || (str3 = ((C0PRC) ((ISearchContextAbility) searchDetailCommentVM2.LL.getValue()).Ph1().LIZJ()).LLILLL) == null) {
                    str3 = "";
                }
                c448240Hhu.LJIJI("search_id", str3);
                c448240Hhu.LJIJI("duration", strValueOf);
                if (!Intrinsics.LJFF(videoItemParams2.mEnterMethodValue, "click_comment_card") ? (strLIZ = C436190H8n.LIZ(aweme2)) == null : (strLIZ = comment.getCid()) == null) {
                    strLIZ = "";
                }
                c448240Hhu.LJIJI("search_result_id", strLIZ);
                String strLLJJIJIL2 = c1er1.LLJJIJIL();
                if (strLLJJIJIL2 != null) {
                    str4 = strLLJJIJIL2;
                }
                c448240Hhu.LJIJI("end_to_end_search_session_id", str4);
                c448240Hhu.LJIILJJIL();
            }
        }
        return Unit.LIZ;
    }
}
