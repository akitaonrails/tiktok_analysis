package X;

import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteCacheState;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostSyncViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lPW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostSyncViewModel$onPublishReply$1", f = "RepostSyncViewModel.kt", l = {100}, m = "invokeSuspend")
public final class C1356760lPW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RepostSyncViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1356730lPT LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ List<TextExtraStruct> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1356760lPW(RepostSyncViewModel repostSyncViewModel, String str, C1356730lPT c1356730lPT, String str2, List<? extends TextExtraStruct> list, InterfaceC1364105Vn<? super C1356760lPW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = repostSyncViewModel;
        this.LLILLL = str;
        this.LLILZ = c1356730lPT;
        this.LLILZIL = str2;
        this.LLILZLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1356760lPW(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String nickname;
        RepostReplyStruct repostReplyStruct;
        Integer num;
        InterfaceC1364105Vn interfaceC1364105Vn;
        C1C7U.LIZ("RepostSyncViewModel@ea3b.onPublishReply$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            RepostSyncViewModel repostSyncViewModel = this.LLILLJJLI;
            String str = this.LLILLL;
            C1356730lPT c1356730lPT = this.LLILZ;
            String str2 = c1356730lPT.LIZIZ;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            String str4 = this.LLILZIL;
            RepostReplyStruct repostReplyStruct2 = c1356730lPT.LIZ;
            List<TextExtraStruct> list = this.LLILZLL;
            repostSyncViewModel.getClass();
            String strLIZ = C1017903yT.LIZ();
            strLIZ.toString();
            if (repostReplyStruct2 == null) {
                User userLIZ = C10EU.LIZ();
                String strLIZ2 = C1017903yT.LIZ();
                strLIZ2.toString();
                num = null;
                interfaceC1364105Vn = null;
                repostReplyStruct = new RepostReplyStruct(strLIZ2, str4, str2, Long.valueOf(System.currentTimeMillis()), 0, 0, userLIZ, 0, null, null, null, list, strLIZ, Boolean.FALSE, UpvoteCacheState.PRE_PUBLISH);
                C1358380lS8.LIZ.getClass();
                C1358380lS8.LIZ(repostReplyStruct, str);
            } else {
                String strLIZ3 = C1017903yT.LIZ();
                strLIZ3.toString();
                User userLIZ2 = C10EU.LIZ();
                String str5 = repostReplyStruct2.replyId;
                User user = repostReplyStruct2.user;
                String uid = null;
                if (user != null) {
                    nickname = user.getNickname();
                } else {
                    nickname = null;
                }
                User user2 = repostReplyStruct2.user;
                if (user2 != null) {
                    uid = user2.getUid();
                }
                num = null;
                interfaceC1364105Vn = null;
                String str6 = str2;
                repostReplyStruct = new RepostReplyStruct(strLIZ3, str4, str6, Long.valueOf(System.currentTimeMillis()), 0, 0, userLIZ2, 0, str5, nickname, uid, list, strLIZ, Boolean.FALSE, UpvoteCacheState.PRE_PUBLISH);
                C1358380lS8.LIZ.getClass();
                C1358380lS8.LIZ(repostReplyStruct, str);
            }
            repostSyncViewModel.wQ2(str, repostReplyStruct, UpvoteCacheState.PRE_PUBLISH, num, strLIZ);
            RepostSyncViewModel repostSyncViewModel2 = this.LLILLJJLI;
            String str7 = this.LLILLL;
            C1356730lPT c1356730lPT2 = this.LLILZ;
            String str8 = this.LLILZIL;
            String str9 = repostReplyStruct.fakeId;
            if (str9 != null) {
                str3 = str9;
            }
            List<TextExtraStruct> list2 = this.LLILZLL;
            this.LL = 1;
            repostSyncViewModel2.getClass();
            if (C23250099c.LJI(this, C0PEM.LIZJ, new C1356750lPV(list2, c1356730lPT2, str8, str7, str3, repostSyncViewModel2, repostReplyStruct, interfaceC1364105Vn)) == objLJFF) {
                C1C7U.LIZIZ("RepostSyncViewModel@ea3b.onPublishReply$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RepostSyncViewModel@ea3b.onPublishReply$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
