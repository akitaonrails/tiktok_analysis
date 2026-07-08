package X;

import Y.ACallableS249S0200000_21;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.model.CommentImageStruct;
import com.ss.android.ugc.aweme.comment.model.CommentResponse;
import com.ss.android.ugc.aweme.comment.perfmonitor.CommentPerfMonitorUtil;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: X.0l7x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1345870l7x extends C1260870iur<C1345930l83, InterfaceC1345970l87> {
    public List<Object> LLILZ;
    public C2208181Bbc LLILZIL;
    public CommentImageModel LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL = 1;
    public Comment LLJ;

    @Override // X.C1260870iur
    public final void LJIILIIL() {
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onSuccess() {
        T t;
        T t2;
        CommentPerfMonitorUtil.LIZ.getClass();
        CommentPerfMonitorUtil.LIZIZ();
        if (C1351950lHl.LJII(this.LLJ)) {
            C2208281Bbm c2208281Bbm = C2208281Bbm.LIZ;
            String fakeId = this.LLJ.getFakeId();
            c2208281Bbm.getClass();
            C2208281Bbm.LJFF(1, null, fakeId, null);
        }
        this.LLILZ = null;
        if (this.LLILLJJLI == 0 || (t2 = this.LL) == 0 || t2.getData() == null || ((CommentResponse) this.LL.getData()).comment == null) {
            Comment comment = this.LLJ;
            if (comment == null || comment.getFakeGiftId() == 0 || this.LLILLJJLI == 0 || (t = this.LL) == 0 || t.getData() == null || ((CommentResponse) this.LL.getData()).comment != null) {
                return;
            }
            ((InterfaceC1345970l87) this.LLILLJJLI).AB(this.LLJ);
            return;
        }
        Comment comment2 = ((CommentResponse) this.LL.getData()).comment;
        Comment comment3 = this.LLJ;
        comment2.isFakeByGuideReply = comment3.isFakeByGuideReply;
        comment2.isFromKeyboard = comment3.isFromKeyboard;
        CommentResponse commentResponse = (CommentResponse) this.LL.getData();
        comment2.parentCommentType = this.LLIZLLLIL;
        comment2.setFakeIsFromGiftBag(this.LLJ.getFakeIsFromGiftBag());
        ((IMainService) ServiceManager.get().getService(IMainService.class)).trackAppsFlyerEvent("mus_af_comment", comment2.getAwemeId());
        ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).Hr(comment2.getAwemeId());
        try {
            User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
            String uid = curUser != null ? curUser.getUid() : "";
            long jCurrentTimeMillis = System.currentTimeMillis();
            List listLIZ = C2824017m.LIZ(jCurrentTimeMillis, uid);
            ((ArrayList) listLIZ).add(Long.valueOf(jCurrentTimeMillis));
            C2824017m.LIZJ(uid, listLIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (this.LLIZ == 1 && !C086I.LIZIZ(comment2.getReplyComments())) {
            Comment comment4 = (Comment) ListProtector.get(comment2.getReplyComments(), 0);
            comment4.setCommentType(1);
            ArrayList arrayList = new ArrayList();
            comment2.setReplyComments(null);
            comment2.setCommentType(2);
            arrayList.add(comment2);
            comment4.setReplyComments(arrayList);
            ((InterfaceC1345970l87) this.LLILLJJLI).rk2(comment4, commentResponse, this.LLILZLL);
            return;
        }
        if (this.LLIZ != 2 || C086I.LIZIZ(comment2.getReplyComments())) {
            comment2.setCommentType(this.LLIZ);
            if (comment2.getReplyComments() == null) {
                comment2.setReplyComments(new ArrayList());
            }
            ((InterfaceC1345970l87) this.LLILLJJLI).rk2(comment2, commentResponse, this.LLILZLL);
            return;
        }
        Comment comment5 = (Comment) ListProtector.get(comment2.getReplyComments(), 0);
        comment2.setReplyToReplyId(comment5.getCid());
        if (TextUtils.equals(comment2.getRootCommentId(), comment2.getReplyToReplyCommentId())) {
            comment2.setReplyToReplyId(CardStruct.IStatusCode.DEFAULT);
        } else {
            comment2.setReplyToNickName(comment5.getUser().getNickname());
            comment2.setReplyToUserName(comment5.getUser().getUniqueId());
        }
        comment2.setReplyComments(null);
        comment2.setCommentType(2);
        ((InterfaceC1345970l87) this.LLILLJJLI).rk2(comment2, commentResponse, this.LLILZLL);
    }

    public C1345870l7x() {
        LJIIJ(new AbstractC1344720l66<CommentResponse>() { // from class: X.0l83
            @Override // X.AbstractC1344720l66
            public final void LJIIJ(CommentResponse commentResponse) {
                Comment comment;
                CommentResponse commentResponse2 = commentResponse;
                if (commentResponse2 != null && (comment = commentResponse2.comment) != null) {
                    this.LLILLJJLI.LIZJ(comment.getCid(), "cid");
                }
                this.LLILLJJLI.LJFF();
            }

            @Override // X.AbstractC666100QAu
            public final boolean checkParams(Object... objArr) {
                if (objArr != null && objArr.length == 1) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC1344720l66, X.AbstractC666100QAu
            public final boolean sendRequest(Object... objArr) {
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                C1BVK.LIZIZ().LIZ(this.mHandler, new ACallableS249S0200000_21(this, objArr, 2), 0);
                return true;
            }
        });
    }

    @Override // X.C1260870iur
    public final void LIZ() {
        super.LIZ();
        C2208181Bbc c2208181Bbc = this.LLILZIL;
        if (c2208181Bbc != null) {
            c2208181Bbc.LIZIZ();
        }
    }

    @Override // X.C1260870iur
    public final boolean LIZJ(Object... objArr) {
        this.LLILZ = new ArrayList();
        for (Object obj : objArr) {
            ((ArrayList) this.LLILZ).add(obj);
        }
        CommentPerfMonitorUtil.LIZ.getClass();
        CommentPerfMonitorUtil.LIZJ(objArr);
        return super.LIZJ(objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILL(final C1345910l81 c1345910l81) {
        int i;
        List<CommentImageStruct> imageList;
        List<CommentImageStruct> imageList2;
        CommentImageStruct commentImageStruct;
        UrlModel originUrl;
        String uri;
        List<CommentImageModel> list;
        C1345990l89 c1345990l89;
        String replyToUserId;
        Comment comment = new Comment();
        this.LLJ = comment;
        int i2 = c1345910l81.LJIILLIIL;
        comment.parentCommentType = i2;
        this.LLIZLLLIL = i2;
        comment.setStoryEmojiComment(c1345910l81.LJIILIIL);
        this.LLJ.setPublishScenario(c1345910l81.LJIILJJIL);
        String str = c1345910l81.LIZ;
        String authorUid = "";
        if (str == null) {
            str = "";
        }
        this.LLJ.setAwemeId(str);
        Comment comment2 = this.LLJ;
        comment2.isFakeByGuideReply = c1345910l81.LJIL;
        comment2.isFromKeyboard = c1345910l81.LJJ;
        String str2 = c1345910l81.LJIJI;
        if (TextUtils.isEmpty(str2)) {
            Aweme awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(str);
            if (awemeLLILZ != null) {
                authorUid = AwemeExtKt.getAuthorUid(awemeLLILZ);
            }
            str2 = authorUid;
        }
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (TextUtils.equals(str2, curUser.getUid())) {
            Context contextLJFF = C2214201BlK.LJFF();
            if (contextLJFF == null) {
                C844470XAv.LIZ.getClass();
                contextLJFF = C844470XAv.LIZ();
            }
            this.LLJ.setLabelText(contextLJFF.getString(2131826820));
            this.LLJ.setLabelType(1);
        }
        curUser.setUserDisplayName(C1342220l24.LJ(curUser, c1345910l81.LJIILL, true, true));
        this.LLJ.setUser(curUser);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(UUID.randomUUID());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LLJ.setFakeId(strLIZIZ);
        this.LLJ.setText(c1345910l81.LIZIZ);
        this.LLJ.setCommentType(this.LLIZ);
        this.LLJ.setReplyComments(new ArrayList());
        this.LLJ.setShouldDisplayFakeComment(true);
        if (!TextUtils.isEmpty(c1345910l81.LJ)) {
            this.LLJ.setRootCommentId(c1345910l81.LIZJ);
            this.LLJ.setTextExtra(c1345910l81.LIZLLL);
            this.LLJ.setReplyToReplyId(c1345910l81.LJ);
            C1345890l7z.LIZIZ(this.LLJ, 2);
        } else if (!TextUtils.isEmpty(c1345910l81.LIZJ)) {
            this.LLJ.setRootCommentId(c1345910l81.LIZJ);
            this.LLJ.setTextExtra(c1345910l81.LIZLLL);
            this.LLJ.setReplyToReplyId(c1345910l81.LIZJ);
            C1345890l7z.LIZIZ(this.LLJ, 2);
        } else {
            this.LLJ.setRootCommentId(c1345910l81.LIZJ);
            this.LLJ.setTextExtra(c1345910l81.LIZLLL);
            this.LLJ.setReplyToReplyId(null);
            if (c1345910l81.LJIIIIZZ != 0 && !C199499133x.LIZ(c1345910l81.LJII)) {
                this.LLJ.setFakeGiftId(c1345910l81.LJIIIIZZ);
                this.LLJ.setGiftEffectPath(c1345910l81.LJIIJ);
                if (C199499133x.LIZ(c1345910l81.LIZIZ) && !C1351950lHl.LJIIIIZZ(c1345910l81.LJIIZILJ) && c1345910l81.LJIJ == null) {
                    this.LLJ.setShouldDisplayFakeComment(false);
                }
            }
            C1345890l7z.LIZIZ(this.LLJ, 1);
        }
        this.LLJ.setFakeIsFromGiftBag(c1345910l81.LJIIIZ);
        Comment comment3 = this.LLJ;
        if (c1345910l81.LJIIJJI == 0) {
            i = 0;
        } else {
            i = 1;
        }
        comment3.setCommentStructType(i);
        this.LLJ.setImageList(C1345110l6j.LIZIZ(c1345910l81.LJIIZILJ));
        this.LLJ.setStickerStruct(c1345910l81.LJIJ);
        if (C1341590l13.LIZIZ() && C1346390l8n.LIZIZ(this.LLJ)) {
            this.LLJ.setIsCommentPostChecked(c1345910l81.LJIJJ);
        }
        c1345910l81.LJI = strLIZIZ;
        Comment comment4 = this.LLJ;
        if (comment4 != null) {
            HashMap map = (HashMap) C1345890l7z.LIZ;
            C1345990l89 c1345990l892 = (C1345990l89) map.get(comment4.getFakeId());
            if (c1345990l892 != null) {
                Comment comment5 = c1345990l892.LIZIZ;
                String replyToUserId2 = comment4.getReplyToUserId();
                if ((replyToUserId2 == null || replyToUserId2.length() == 0) && comment5 != null && (replyToUserId = comment5.getReplyToUserId()) != null && replyToUserId.length() != 0) {
                    comment4.setReplyToUserId(comment5.getReplyToUserId());
                }
                map.put(comment4.getFakeId(), C1345990l89.LIZ(c1345990l892, 0, comment4, null, 0, 61));
            } else {
                map.put(comment4.getFakeId(), new C1345990l89(0, comment4, null, 0, 61));
            }
        }
        Comment comment6 = this.LLJ;
        if (comment6 != null) {
            Map<String, C1345990l89> map2 = C1345890l7z.LIZ;
            String fakeId = comment6.getFakeId();
            HashMap map3 = (HashMap) map2;
            C1345990l89 c1345990l893 = (C1345990l89) map3.get(comment6.getFakeId());
            if (c1345990l893 != null) {
                c1345990l89 = C1345990l89.LIZ(c1345990l893, 0, null, c1345910l81, 0, 55);
            } else {
                c1345990l89 = new C1345990l89(0, null, c1345910l81, 0, 55);
            }
            map3.put(fakeId, c1345990l89);
        }
        CommentPerfMonitorUtil.LIZ.getClass();
        CommentPerfMonitorUtil.LIZJ(c1345910l81);
        final Comment comment7 = this.LLJ;
        if (comment7 == null) {
            this.LLJ = comment7;
        }
        K k = this.LLILLJJLI;
        if (k != 0) {
            ((InterfaceC1345970l87) k).rE2(this.LLJ);
        }
        final String fakeId2 = comment7.getFakeId();
        if (comment7.getImageList() == null || (((imageList = comment7.getImageList()) != null && imageList.isEmpty()) || (imageList2 = comment7.getImageList()) == null || (commentImageStruct = (CommentImageStruct) ListProtector.get(imageList2, 0)) == null || (originUrl = commentImageStruct.getOriginUrl()) == null || (((uri = originUrl.getUri()) != null && uri.length() != 0) || (list = c1345910l81.LJIIZILJ) == null || list.isEmpty()))) {
            super.LIZJ(c1345910l81);
            return;
        }
        final CommentImageModel commentImageModel = (CommentImageModel) ListProtector.get(c1345910l81.LJIIZILJ, 0);
        if (this.LLILZIL == null) {
            this.LLILZIL = new C2208181Bbc();
        }
        C2208281Bbm.LIZ.getClass();
        C2208281Bbm.LJIILLIIL(commentImageModel, fakeId2);
        this.LLILZLL = commentImageModel;
        this.LLILZIL.LJIIIIZZ(commentImageModel, new InterfaceC2207911BbB() { // from class: X.0l7y
            @Override // X.InterfaceC2207911BbB
            public final void onComplete(String str3) {
                commentImageModel.setUri(str3);
                this.LJ.LIZJ(c1345910l81);
            }

            @Override // X.InterfaceC2207911BbB
            public final void onProgress(long j) {
                K k2 = this.LJ.LLILLJJLI;
                if (k2 != 0) {
                    ((InterfaceC1345970l87) k2).onImageUploadProgress(fakeId2, (int) j);
                }
            }

            @Override // X.InterfaceC2207911BbB
            public final void LIZ(long j, String str3) {
                C1345990l89 c1345990l894;
                Comment comment8 = comment7;
                if (comment8 != null) {
                    Map<String, C1345990l89> map4 = C1345890l7z.LIZ;
                    String fakeId3 = comment8.getFakeId();
                    HashMap map5 = (HashMap) map4;
                    C1345990l89 c1345990l895 = (C1345990l89) map5.get(comment8.getFakeId());
                    if (c1345990l895 != null) {
                        c1345990l894 = C1345990l89.LIZ(c1345990l895, 2, null, null, 0, 62);
                    } else {
                        c1345990l894 = new C1345990l89(2, null, null, 0, 62);
                    }
                    map5.put(fakeId3, c1345990l894);
                }
                K k2 = this.LJ.LLILLJJLI;
                if (k2 != 0) {
                    ((InterfaceC1345970l87) k2).onImageUploadProgress(fakeId2, -1);
                }
                C2208281Bbm c2208281Bbm = C2208281Bbm.LIZ;
                String str4 = fakeId2;
                c2208281Bbm.getClass();
                C2208281Bbm.LJFF(-1, null, str4, null);
            }
        }, false);
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        CommentPerfMonitorUtil.LIZ.getClass();
        CommentPerfMonitorUtil.LIZIZ();
        if (C1351950lHl.LJII(this.LLJ)) {
            C2208281Bbm c2208281Bbm = C2208281Bbm.LIZ;
            String fakeId = this.LLJ.getFakeId();
            c2208281Bbm.getClass();
            C2208281Bbm.LJFF(-1, null, fakeId, null);
        }
        K k = this.LLILLJJLI;
        if (k == 0) {
            return;
        }
        ((InterfaceC1345970l87) k).aB2(exc, this.LLJ);
        if (this.LL != 0) {
            C844470XAv.LIZ.getClass();
            int iLIZ = C1498560p6E.LIZ(C844470XAv.LIZ(), exc);
            ((AbstractC1344720l66) this.LL).LLILLJJLI.LJI(iLIZ);
            C844470XAv.LIZ();
            try {
                if (C036E.LIZ.LIZIZ()) {
                    C1344530l5n.LIZ.getClass();
                    C1344530l5n.LIZ(iLIZ, "publish", exc);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
