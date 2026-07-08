package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.experiment.ExposedCommentConfig;
import com.ss.android.ugc.aweme.comment.exposedcmt.FypExposedCommentVM;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentImageStruct;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ExposedCommentInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import njp.a;

/* JADX INFO: renamed from: X.0S24, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.exposedcmt.FypExposedCommentVM$onBind$3", f = "FypExposedCommentVM.kt", l = {96}, m = "invokeSuspend")
public final class C0S24 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FypExposedCommentVM LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ VideoItemParams LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0S24(FypExposedCommentVM fypExposedCommentVM, String str, VideoItemParams videoItemParams, InterfaceC1364105Vn<? super C0S24> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = fypExposedCommentVM;
        this.LLILLL = str;
        this.LLILZ = videoItemParams;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0S24(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Comment comment;
        String nickname;
        UrlModel avatarMedium;
        UrlModel avatarThumb;
        boolean z;
        boolean z2;
        UrlModel avatarThumb2;
        String uid;
        String strPoll;
        Comment next;
        boolean z3;
        Object objLJI = obj;
        C1C7U.LIZ("FypExposedCommentVM@7d93.onBind$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        UrlModel avatarThumb3 = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLJI);
            } else {
                C155000ia.LIZIZ(objLJI);
                FypExposedCommentVM fypExposedCommentVM = this.LLILLJJLI;
                String str = this.LLILLL;
                VideoItemParams videoItemParams = this.LLILZ;
                C1DFB c1dfb = C0PEM.LIZJ;
                C0S26 c0s26 = new C0S26(fypExposedCommentVM, str, videoItemParams, null);
                this.LL = 1;
                objLJI = C23250099c.LJI(this, c1dfb, c0s26);
                if (objLJI == objLJFF) {
                    C1C7U.LIZIZ("FypExposedCommentVM@7d93.onBind$3");
                    return objLJFF;
                }
            }
            c098200Yq = (CommentItemList) objLJI;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String str2 = this.LLILLL;
        FypExposedCommentVM fypExposedCommentVM2 = this.LLILLJJLI;
        VideoItemParams videoItemParams2 = this.LLILZ;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            CommentItemList commentItemList = (CommentItemList) c098200Yq;
            List<Comment> list = commentItemList.items;
            int followStatusRelation = 0;
            if (list != null) {
                Iterator<Comment> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.getCid() != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                comment = next;
            } else {
                comment = null;
            }
            try {
                C0S25.LIZ.put(str2, commentItemList);
                C0S25.LIZIZ.offer(str2);
                C1387910mDl.LIZ.getClass();
                int i2 = ((ExposedCommentConfig) C1387910mDl.LIZJ.getValue()).maxAppearTimes;
                if (10 >= i2) {
                    i2 = 10;
                }
                while (true) {
                    ConcurrentHashMap<String, CommentItemList> concurrentHashMap = C0S25.LIZ;
                    if (concurrentHashMap.size() <= i2 || (strPoll = C0S25.LIZIZ.poll()) == null) {
                        break;
                    }
                    concurrentHashMap.remove(strPoll);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (comment != null) {
                Aweme aweme = videoItemParams2.getAweme();
                fypExposedCommentVM2.getClass();
                User user = comment.getUser();
                String cid = comment.getCid();
                String str3 = "";
                if (user == null || (nickname = user.getNickname()) == null) {
                    nickname = "";
                }
                if (user != null) {
                    avatarMedium = user.getAvatarMedium();
                } else {
                    avatarMedium = null;
                }
                if (user != null) {
                    avatarThumb = user.getAvatarThumb();
                } else {
                    avatarThumb = null;
                }
                List<CommentImageStruct> imageList = comment.getImageList();
                if (imageList != null && !imageList.isEmpty()) {
                    z = false;
                } else {
                    z = true;
                }
                boolean z4 = !z;
                if (comment.getStickerStruct() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean zLJI = C1351950lHl.LJI(comment);
                String text = comment.getText();
                if (user != null && (uid = user.getUid()) != null) {
                    str3 = uid;
                }
                if (user != null) {
                    followStatusRelation = user.getFollowStatusRelation();
                }
                aweme.setExposedCommentInfoList(Collections.singletonList(new ExposedCommentInfo(cid, nickname, avatarThumb, avatarMedium, z4, z2, zLJI, text, str3, followStatusRelation)));
                User user2 = comment.getUser();
                if (user2 != null) {
                    avatarThumb2 = user2.getAvatarThumb();
                } else {
                    avatarThumb2 = null;
                }
                if (avatarThumb2 != null) {
                    User user3 = comment.getUser();
                    if (user3 != null) {
                        avatarThumb3 = user3.getAvatarThumb();
                    }
                    C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarThumb3));
                    c1331670kl3LJIIIIZZ.LJJIJ(C422830Gi1.LIZ(100));
                    c1331670kl3LJIIIIZZ.LJJIII();
                }
                fypExposedCommentVM2.setState(new AwS590S0100000_11(comment, 617));
            }
        }
        FypExposedCommentVM fypExposedCommentVM3 = this.LLILLJJLI;
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            fypExposedCommentVM3.setState(AFwS243S0000000_11.get$arr$(831));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FypExposedCommentVM@7d93.onBind$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
