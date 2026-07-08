package X;

import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.assem.DetailTitleAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Jsp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C505970Jsp extends C09AY implements Function2<UIAssem, C291001Au<? extends SpacePost>, Unit> {
    public final /* synthetic */ DetailTitleAssem LL;
    public final /* synthetic */ TextView LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C505970Jsp(DetailTitleAssem detailTitleAssem, TextView textView) {
        super(2);
        this.LL = detailTitleAssem;
        this.LLILLJJLI = textView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends SpacePost> c291001Au) {
        SpacePost spacePost;
        C291001Au<? extends SpacePost> c291001Au2 = c291001Au;
        if (c291001Au2 != null && (spacePost = (SpacePost) c291001Au2.LIZ) != null) {
            this.LL.Jo(spacePost, this.LLILLJJLI);
        }
        return Unit.LIZ;
    }
}
