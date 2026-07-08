package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HA5, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.upvote.util.RepostMobEvent$mobLeaveRepostVideo$1", f = "RepostMobEvent.kt", l = {}, m = "invokeSuspend")
public final class C0HA5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HA5(Aweme aweme, String str, InterfaceC1364105Vn<? super C0HA5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aweme;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HA5(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<UpvoteStruct> list;
        String uid;
        String uid2;
        C1C7U.LIZ("RepostMobEvent@22f7.mobLeaveRepostVideo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1358880lSw c1358880lSw = C1358880lSw.LIZ;
        String aid = this.LL.getAid();
        c1358880lSw.getClass();
        UpvoteList upvoteListLJFF = C1358880lSw.LJFF(aid);
        if (upvoteListLJFF != null && (list = upvoteListLJFF.upvotes) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<UpvoteStruct> it2 = list.iterator();
            while (it2.hasNext()) {
                User user = it2.next().user;
                if (user != null && (uid2 = user.getUid()) != null) {
                    arrayList.add(uid2);
                }
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, null, null, null, 0, null, null, 63);
            if (strLJJLIIIJ != null && strLJJLIIIJ.length() != 0) {
                Pair[] pairArr = new Pair[4];
                pairArr[0] = new Pair(this.LLILLJJLI, "enter_from");
                String aid2 = this.LL.getAid();
                String str = "";
                if (aid2 == null) {
                    aid2 = "";
                }
                pairArr[1] = new Pair(aid2, "group_id");
                User author = this.LL.getAuthor();
                if (author != null && (uid = author.getUid()) != null) {
                    str = uid;
                }
                pairArr[2] = new Pair(str, "author_id");
                pairArr[3] = new Pair(strLJJLIIIJ, "repost_uid_str");
                C20684815ws.LJIJI("leave_repost_video", pairArr);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("RepostMobEvent@22f7.mobLeaveRepostVideo$1");
                return unit;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RepostMobEvent@22f7.mobLeaveRepostVideo$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
