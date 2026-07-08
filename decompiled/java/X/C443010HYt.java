package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HYt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem$onBind$1$5", f = "FeedAvatarDefaultAssem.kt", l = {}, m = "invokeSuspend")
public final class C443010HYt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ VideoItemParams LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C443010HYt(Aweme aweme, VideoItemParams videoItemParams, InterfaceC1364105Vn<? super C443010HYt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aweme;
        this.LLILLJJLI = videoItemParams;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C443010HYt(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String secUid;
        Object id;
        ProfileBadgeStruct profileBadge;
        C1C7U.LIZ("FeedAvatarDefaultAssem@5993.onBind$1$5");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("group_id", this.LL.getAid());
        User author = this.LL.getAuthor();
        if (author != null) {
            secUid = author.getSecUid();
        } else {
            secUid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", secUid);
        User author2 = this.LL.getAuthor();
        if (author2 == null || (profileBadge = author2.getProfileBadge()) == null || (id = profileBadge.getId()) == null) {
            id = "";
        }
        c2344009Gk.LJ(id, "badge_id");
        c2344009Gk.LJIIIIZZ("enter_from", this.LLILLJJLI.mEventType);
        C20684815ws.LJIILLIIL("profile_badge_show", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedAvatarDefaultAssem@5993.onBind$1$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
