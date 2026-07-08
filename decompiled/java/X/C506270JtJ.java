package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.assem.SpaceFeedTitleAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JtJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C506270JtJ extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ SpaceFeedTitleAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C506270JtJ(SpaceFeedTitleAssem spaceFeedTitleAssem) {
        super(1);
        this.LL = spaceFeedTitleAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        this.LL.Jo(false);
        return Unit.LIZ;
    }
}
