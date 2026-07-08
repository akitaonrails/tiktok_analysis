package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentImageStruct;
import com.ss.android.ugc.aweme.comment.model.CommentResponse;
import com.ss.android.ugc.aweme.comment.perfmonitor.CommentPerfMonitorUtil;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS230S0300000_21;
import njp.a;

/* JADX INFO: renamed from: X.0l5D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel$publishComment$3$2$1", f = "CommentPublishViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1344170l5D extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CommentPublishViewModel LL;
    public final /* synthetic */ C1345120l6k LLILLJJLI;
    public final /* synthetic */ C0O8X LLILLL;
    public final /* synthetic */ CommentResponse LLILZ;
    public final /* synthetic */ Comment LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1344170l5D(CommentPublishViewModel commentPublishViewModel, C1345120l6k c1345120l6k, C0O8X c0o8x, CommentResponse commentResponse, Comment comment, InterfaceC1364105Vn<? super C1344170l5D> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = commentPublishViewModel;
        this.LLILLJJLI = c1345120l6k;
        this.LLILLL = c0o8x;
        this.LLILZ = commentResponse;
        this.LLILZIL = comment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1344170l5D(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<CommentImageStruct> imageList;
        C1C7U.LIZ("CommentPublishViewModel@7f7.publishComment$3$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CommentPerfMonitorUtil.LIZ.getClass();
        CommentPerfMonitorUtil.LIZIZ();
        this.LL.GQ2(this.LLILLJJLI, true, true, 0);
        CommentPublishViewModel commentPublishViewModel = this.LL;
        C0O8X c0o8x = this.LLILLL;
        CommentResponse commentResponse = this.LLILZ;
        commentPublishViewModel.getClass();
        CommentPublishViewModel.KQ2(c0o8x, commentResponse);
        CommentResponse commentResponse2 = this.LLILZ;
        if (commentResponse2 != null && commentResponse2.comment != null) {
            Comment comment = commentResponse2.comment;
            Comment comment2 = this.LLILZIL;
            if (comment2 != null) {
                comment.setCommentType(C1345700l7g.LIZLLL(comment2));
                comment.setFakeId(comment2.getFakeId());
                comment.setReplyToNickName(comment2.getReplyToNickName());
                comment.setReplyToUserName(comment2.getReplyToUserName());
                comment.setReplyToUserId(comment2.getReplyToUserId());
                comment.setStickerStruct(comment2.getStickerStruct());
                comment.needCollapse = comment2.needCollapse;
                List<CommentImageStruct> imageList2 = comment.getImageList();
                if ((imageList2 == null || imageList2.isEmpty()) && (imageList = comment2.getImageList()) != null && !imageList.isEmpty()) {
                    comment.setImageList(comment2.getImageList());
                }
                comment.setEditImageBitmap(comment2.getEditImageBitmap());
                comment2.setCid(comment.getCid());
            }
            CommentResponse commentResponse3 = this.LLILZ;
            commentResponse3.comment = comment;
            CommentPublishViewModel commentPublishViewModel2 = this.LL;
            commentPublishViewModel2.runOnUIThread(new AwS230S0300000_21(commentResponse3, this.LLILLJJLI, commentPublishViewModel2, 5));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentPublishViewModel@7f7.publishComment$3$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
