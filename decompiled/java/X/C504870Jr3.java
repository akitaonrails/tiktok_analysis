package X;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.assem.SubSpaceDetailListAssem;
import com.bytedance.android.livesdkapi.host.IHostAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jr3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C504870Jr3 extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ SubSpaceDetailListAssem LL;
    public final /* synthetic */ C504910Jr7 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C504870Jr3(SubSpaceDetailListAssem subSpaceDetailListAssem, C504910Jr7 c504910Jr7) {
        super(1);
        this.LL = subSpaceDetailListAssem;
        this.LLILLJJLI = c504910Jr7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        this.LL.kp();
        C19EG c19egLIZ = C724240Sb0.LIZ(this.LL);
        SpaceCommentItem spaceCommentItem = this.LLILLJJLI.LIZ;
        if (c19egLIZ != null) {
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().appendQueryParameter("object_id", String.valueOf(spaceCommentItem.commentId)).appendQueryParameter("owner_id", String.valueOf(spaceCommentItem.userId)).appendQueryParameter("report_type", "sub_only_space").appendQueryParameter("enter_from", "sub_only_space_detail");
            Bundle bundle = new Bundle();
            bundle.putInt("half_screen_height", (int) (((double) C497820Jfg.LIZ(c19egLIZ)) * 0.65d));
            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).report(c19egLIZ, builderAppendQueryParameter, bundle);
        }
        this.LL.kp().wQ2().LIZIZ("report");
        return Unit.LIZ;
    }
}
