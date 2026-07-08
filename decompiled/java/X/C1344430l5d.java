package X;

import android.util.LruCache;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.model.CommentResponse;
import com.ss.android.ugc.aweme.comment.model.CommentSurprise;
import com.ss.android.ugc.aweme.comment.model.CommentSurpriseStruct;
import com.ss.android.ugc.aweme.comment.model.SurpriseResource;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l5d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1344430l5d extends C09AY implements Function1<InterfaceC497601wk, Unit> {
    public final /* synthetic */ CommentResponse LL;
    public final /* synthetic */ C1345120l6k LLILLJJLI;
    public final /* synthetic */ CommentPublishViewModel LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ Comment LLILZIL;
    public final /* synthetic */ Boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1344430l5d(CommentResponse commentResponse, C1345120l6k c1345120l6k, CommentPublishViewModel commentPublishViewModel, long j, Comment comment, Boolean bool) {
        super(1);
        this.LL = commentResponse;
        this.LLILLJJLI = c1345120l6k;
        this.LLILLL = commentPublishViewModel;
        this.LLILZ = j;
        this.LLILZIL = comment;
        this.LLILZLL = bool;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC497601wk interfaceC497601wk) {
        boolean z;
        CommentSurprise commentSurprise;
        Integer num;
        Integer num2;
        Long l;
        CommentImageModel commentImageModel;
        boolean z2 = C1344420l5c.LIZ;
        C1344420l5c.LIZ(this.LL.comment);
        Integer num3 = null;
        if (C1351950lHl.LJII(this.LL.comment)) {
            int i = C1344860l6K.LIZ;
            String awemeId = this.LL.comment.getAwemeId();
            List<CommentImageModel> list = this.LLILLJJLI.LIZJ;
            if (list != null) {
                commentImageModel = (CommentImageModel) ListProtector.get(list, 0);
            } else {
                commentImageModel = null;
            }
            C1344860l6K.LIZ(commentImageModel, awemeId);
        }
        CommentPublishViewModel commentPublishViewModel = this.LLILLL;
        CommentResponse commentResponse = this.LL;
        if (commentResponse.commentSurprise != null) {
            z = true;
        } else {
            z = false;
        }
        commentPublishViewModel.FQ2(commentResponse, z);
        C1222210huV.LIZIZ(System.currentTimeMillis() - this.LLILZ, true);
        CommentResponse commentResponse2 = this.LL;
        CommentSurpriseStruct commentSurpriseStruct = new CommentSurpriseStruct(commentResponse2.comment, commentResponse2.commentSurprise, false);
        CommentSurprise commentSurprise2 = this.LL.commentSurprise;
        if (commentSurprise2 != null && commentSurprise2.surpriseResource != null && commentSurprise2 != null && commentSurprise2.surpriseType != null) {
            LruCache<String, CommentSurprise> lruCache = AnonymousClass0562.LIZ;
            if (commentSurprise2 != null) {
                SurpriseResource surpriseResource = commentSurprise2.surpriseResource;
                if (surpriseResource != null) {
                    num2 = surpriseResource.surpriseType;
                    l = surpriseResource.activityId;
                    num3 = surpriseResource.effectId;
                } else {
                    num2 = null;
                    l = null;
                }
                AnonymousClass0562.LIZ.put(AnonymousClass0562.LIZ(num2, num3, l), commentSurprise2);
            }
        }
        if (commentSurpriseStruct.comment != null && (commentSurprise = commentSurpriseStruct.commentSurprise) != null && (num = commentSurprise.surpriseType) != null && num.intValue() == 1) {
            C1352020lHs.LIZLLL(false, false);
        }
        if (!this.LLILZIL.getHasPreTriggeredFirstCommentSurprise().booleanValue() && Intrinsics.LJFF(this.LLILZLL, Boolean.FALSE)) {
            this.LLILLL.OQ2(commentSurpriseStruct);
        }
        return Unit.LIZ;
    }
}
