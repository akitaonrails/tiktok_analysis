package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentImageStruct;
import com.ss.android.ugc.aweme.comment.model.CommentLivePhotoInfoModel;
import com.ss.android.ugc.aweme.comment.model.CommentResponse;
import com.ss.android.ugc.aweme.comment.perfmonitor.CommentPerfMonitorUtil;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0l5E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel$publishComment$4$2$1", f = "CommentPublishViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1344180l5E extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CommentPublishViewModel LL;
    public final /* synthetic */ C0O8X LLILLJJLI;
    public final /* synthetic */ CommentResponse LLILLL;
    public final /* synthetic */ Comment LLILZ;
    public final /* synthetic */ C1345120l6k LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ Boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1344180l5E(CommentPublishViewModel commentPublishViewModel, C0O8X c0o8x, CommentResponse commentResponse, Comment comment, C1345120l6k c1345120l6k, long j, Boolean bool, InterfaceC1364105Vn<? super C1344180l5E> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = commentPublishViewModel;
        this.LLILLJJLI = c0o8x;
        this.LLILLL = commentResponse;
        this.LLILZ = comment;
        this.LLILZIL = c1345120l6k;
        this.LLILZLL = j;
        this.LLIZ = bool;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1344180l5E(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String cid;
        List<TextExtraStruct> textExtra;
        List<TextExtraStruct> textExtra2;
        TextExtraStruct next;
        CommentLivePhotoInfoModel livePhotoInfoModel;
        String str;
        String str2;
        CommentLivePhotoInfoModel livePhotoInfoModel2;
        List<String> list;
        CommentImageStruct commentImageStruct;
        C1C7U.LIZ("CommentPublishViewModel@7f7.publishComment$4$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CommentPerfMonitorUtil.LIZ.getClass();
        CommentPerfMonitorUtil.LIZIZ();
        CommentPublishViewModel commentPublishViewModel = this.LL;
        C0O8X c0o8x = this.LLILLJJLI;
        CommentResponse commentResponse = this.LLILLL;
        commentPublishViewModel.getClass();
        CommentPublishViewModel.KQ2(c0o8x, commentResponse);
        Comment comment = this.LLILLL.comment;
        if (comment != null) {
            comment.setCommentType(C1345700l7g.LIZLLL(this.LLILZ));
        }
        TextExtraStruct textExtraStruct = null;
        if (comment != null) {
            List<CommentImageStruct> imageList = comment.getImageList();
            if (imageList != null) {
                Comment comment2 = this.LLILZ;
                int i = 0;
                for (CommentImageStruct commentImageStruct2 : imageList) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        CommentImageStruct commentImageStruct3 = commentImageStruct2;
                        List<CommentImageStruct> imageList2 = comment2.getImageList();
                        if (imageList2 != null && (commentImageStruct = (CommentImageStruct) C13LP.LJJJLZIJ(i, imageList2)) != null) {
                            livePhotoInfoModel = commentImageStruct.getLivePhotoInfoModel();
                        } else {
                            livePhotoInfoModel = null;
                        }
                        CommentLivePhotoInfoModel livePhotoInfoModel3 = commentImageStruct3.getLivePhotoInfoModel();
                        if (livePhotoInfoModel3 == null || (str2 = livePhotoInfoModel3.videoId) == null || str2.length() == 0 || (livePhotoInfoModel2 = commentImageStruct3.getLivePhotoInfoModel()) == null || (list = livePhotoInfoModel2.urlList) == null || list.isEmpty()) {
                            if (livePhotoInfoModel != null) {
                                str = livePhotoInfoModel.localVideoPath;
                            } else {
                                str = null;
                            }
                            if (C123100dR.LIZ(str)) {
                                commentImageStruct3.setLivePhotoInfoModel(livePhotoInfoModel);
                            }
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            comment.setFakeId(this.LLILZ.getFakeId());
            comment.setReplyToNickName(this.LLILZ.getReplyToNickName());
            comment.setReplyToUserName(this.LLILZ.getReplyToUserName());
            comment.setReplyToUserId(this.LLILZ.getReplyToUserId());
            comment.setIsCommentPostChecked(this.LLILZ.getIsCommentPostChecked());
            comment.setStickerStruct(this.LLILZ.getStickerStruct());
            comment.needCollapse = this.LLILZ.needCollapse;
            comment.setAudioStruct(this.LLILZ.getAudioStruct());
            comment.userVoteInfo = this.LLILZ.userVoteInfo;
        }
        Comment comment3 = this.LLILZ;
        if (comment != null) {
            cid = comment.getCid();
        } else {
            cid = null;
        }
        comment3.setCid(cid);
        CommentPublishViewModel commentPublishViewModel2 = this.LL;
        Comment comment4 = this.LLILZ;
        if (comment4 != null) {
            textExtra = comment4.getTextExtra();
        } else {
            textExtra = null;
        }
        if (comment != null) {
            textExtra2 = comment.getTextExtra();
        } else {
            textExtra2 = null;
        }
        commentPublishViewModel2.getClass();
        if (textExtra != null) {
            Iterator<TextExtraStruct> it2 = textExtra.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.getType() == 8) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            TextExtraStruct textExtraStruct2 = next;
            if (textExtraStruct2 != null && textExtra2 != null) {
                Iterator<TextExtraStruct> it3 = textExtra2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    TextExtraStruct next2 = it3.next();
                    if (next2.getType() == 8) {
                        textExtraStruct = next2;
                        break;
                    }
                }
                TextExtraStruct textExtraStruct3 = textExtraStruct;
                if (textExtraStruct3 != null) {
                    textExtraStruct3.setProductSchema(textExtraStruct2.getProductSchema());
                }
            }
        }
        CommentPublishViewModel commentPublishViewModel3 = this.LL;
        commentPublishViewModel3.runOnUIThread(new C1344430l5d(this.LLILLL, this.LLILZIL, commentPublishViewModel3, this.LLILZLL, this.LLILZ, this.LLIZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentPublishViewModel@7f7.publishComment$4$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
