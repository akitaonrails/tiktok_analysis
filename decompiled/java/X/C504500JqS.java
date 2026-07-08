package X;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.assem.FeedEmptyAssem;
import com.bytedance.assem.arch.core.UIAssem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import webcast.api.sub.HomePageInfo;

/* JADX INFO: renamed from: X.0JqS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C504500JqS extends C09AY implements Function2<UIAssem, C291001Au<? extends Boolean>, Unit> {
    public final /* synthetic */ FeedEmptyAssem LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C504500JqS(View view, FeedEmptyAssem feedEmptyAssem) {
        super(2);
        this.LL = feedEmptyAssem;
        this.LLILLJJLI = view;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(UIAssem uIAssem, C291001Au<? extends Boolean> c291001Au) {
        HomePageInfo homePageInfo;
        List<SpacePost> list;
        C504510JqT c504510JqTHp = this.LL.hp();
        if (c504510JqTHp != null && (homePageInfo = c504510JqTHp.LLILZLL) != null && (list = homePageInfo.postList) != null && (!list.isEmpty())) {
            C786410Ut5.LJLLLLLL(8, this.LLILLJJLI);
            this.LL.ip().CQ2();
        } else {
            this.LL.kp(this.LLILLJJLI);
        }
        return Unit.LIZ;
    }
}
