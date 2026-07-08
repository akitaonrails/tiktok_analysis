package X;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.assem.FeedEmptyAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JqX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C504550JqX extends C09AY implements Function2<UIAssem, C291001Au<? extends SpacePost>, Unit> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ FeedEmptyAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C504550JqX(View view, FeedEmptyAssem feedEmptyAssem) {
        super(2);
        this.LL = view;
        this.LLILLJJLI = feedEmptyAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(UIAssem uIAssem, C291001Au<? extends SpacePost> c291001Au) {
        if (c291001Au != null) {
            C786410Ut5.LJLLLLLL(8, this.LL);
            this.LLILLJJLI.ip().CQ2();
        }
        return Unit.LIZ;
    }
}
