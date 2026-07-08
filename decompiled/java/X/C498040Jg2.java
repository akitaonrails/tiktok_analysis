package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.viewholder.creatorlabel.SubscribeCreatorTagDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Jg2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C498040Jg2 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SubscribeCreatorTagDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C498040Jg2(SubscribeCreatorTagDialog subscribeCreatorTagDialog) {
        super(0);
        this.LL = subscribeCreatorTagDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.dismiss();
        return Unit.LIZ;
    }
}
