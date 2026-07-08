package X;

import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iOp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.event.CommentLogger$mobClickGroupChatIcon$1", f = "CommentLogger.kt", l = {8553}, m = "invokeSuspend")
public final class C1241010iOp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C2344009Gk LL;
    public int LLILLJJLI;
    public final /* synthetic */ CommentContextSource LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1241010iOp(CommentContextSource commentContextSource, String str, String str2, boolean z, InterfaceC1364105Vn<? super C1241010iOp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = commentContextSource;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1241010iOp(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2344009Gk c2344009Gk;
        String aid;
        String authorUid;
        User author;
        String str;
        AwemeStatistics statistics;
        String authorUid2;
        String str2;
        IMUserBizInfo imUserBizInfo;
        IMUserB2CAccountInfo userB2CAccountInfo;
        String str3;
        C1C7U.LIZ("CommentLogger@c1c.mobClickGroupChatIcon$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c2344009Gk = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c2344009Gk = new C2344009Gk();
            String str4 = this.LLILLL.getCommonModel().enterFrom;
            String str5 = this.LLILLL.getCommonModel().enterMethod;
            Aweme aweme = CommentContextSourceKt.aweme(this.LLILLL);
            c2344009Gk.LJFF("event_element", this.LLILZ);
            c2344009Gk.LJFF("sub_position", this.LLILZIL);
            c2344009Gk.LJFF("event_page", str4);
            c2344009Gk.LJFF("enter_from", str4);
            c2344009Gk.LJFF("enter_method", str5);
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            C1341320l0c.LIZ(c2344009Gk, "group_id", aid);
            if (aweme != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme);
            } else {
                authorUid = null;
            }
            C1341320l0c.LIZ(c2344009Gk, "author_id", authorUid);
            C735840Sti c735840Sti = C735840Sti.LIZ;
            if (aweme != null) {
                author = aweme.getAuthor();
            } else {
                author = null;
            }
            c735840Sti.getClass();
            C1341320l0c.LIZ(c2344009Gk, "follow_status", String.valueOf(C735840Sti.LJIIIIZZ(author)));
            if (C729510SjV.LJJIJIL(aweme)) {
                str = "story";
            } else {
                str = "post";
            }
            c2344009Gk.LJFF("story_type", str);
            int i2 = 0;
            if (this.LLILLL.getKeyboardModel().getInputServiceType() == EnumC1346360l8k.INBOX_QUICK_COMMENT) {
                c2344009Gk.LIZJ(0, "is_zero_comment");
            } else {
                Aweme aweme2 = CommentContextSourceKt.aweme(this.LLILLL);
                if (aweme2 == null || (statistics = aweme2.getStatistics()) == null || statistics.getCommentCount() <= 0) {
                    i2 = 1;
                }
                c2344009Gk.LIZJ(i2, "is_zero_comment");
            }
            if (aweme != null) {
                authorUid2 = AwemeExtKt.getAuthorUid(aweme);
            } else {
                authorUid2 = null;
            }
            c2344009Gk.LIZJ(C10EU.LJIIZILJ(authorUid2) ? 1 : 0, "is_video_author");
            if (this.LLILZLL) {
                str2 = "unfold";
            } else {
                str2 = "fold";
            }
            c2344009Gk.LJFF("input_box_status", str2);
            IMContactApi.LIZ.getClass();
            C1BGS c1bgsLJ = C069P.LIZ().LJ();
            String strLIZIZ = C461720I8s.LIZIZ();
            this.LL = c2344009Gk;
            this.LLILLJJLI = 1;
            obj = c1bgsLJ.LJIJ(strLIZIZ, null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CommentLogger@c1c.mobClickGroupChatIcon$1");
                return objLJFF;
            }
        }
        IMUser iMUser = (IMUser) obj;
        if (iMUser != null && (imUserBizInfo = iMUser.getImUserBizInfo()) != null && (userB2CAccountInfo = imUserBizInfo.getUserB2CAccountInfo()) != null && (str3 = userB2CAccountInfo.userTags) != null) {
            c2344009Gk.LJFF("group_owner_account_type", str3);
        }
        C20684815ws.LJIILLIIL("ttinter_comment_multi_genre_entrance_element_click", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentLogger@c1c.mobClickGroupChatIcon$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
