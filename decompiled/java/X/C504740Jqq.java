package X;

import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.assem.SpaceFeedTitleAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Jqq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C504740Jqq extends C09AY implements Function2<UIAssem, C291001Au<? extends SpacePost>, Unit> {
    public final /* synthetic */ SpaceFeedTitleAssem LL;
    public final /* synthetic */ C16FV LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C504740Jqq(SpaceFeedTitleAssem spaceFeedTitleAssem, C16FV c16fv) {
        super(2);
        this.LL = spaceFeedTitleAssem;
        this.LLILLJJLI = c16fv;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(UIAssem uIAssem, C291001Au<? extends SpacePost> c291001Au) {
        if (c291001Au != null && this.LL.Ho().yQ2()) {
            C786410Ut5.LLJJJJJIL(this.LLILLJJLI, 0);
        }
        return Unit.LIZ;
    }
}
