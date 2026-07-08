package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlyvideo.SubOnlyVideoListDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JKk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C490240JKk extends C09AY implements Function1<Unit, Unit> {
    public final /* synthetic */ SubOnlyVideoListDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C490240JKk(SubOnlyVideoListDialog subOnlyVideoListDialog) {
        super(1);
        this.LL = subOnlyVideoListDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Unit unit) {
        this.LL.dismiss();
        return Unit.LIZ;
    }
}
