package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.assem.FeedEmptyAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JqR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C504490JqR extends C09AY implements Function2<UIAssem, C291001Au<? extends Boolean>, Unit> {
    public final /* synthetic */ FeedEmptyAssem LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C504490JqR(View view, FeedEmptyAssem feedEmptyAssem) {
        super(2);
        this.LL = feedEmptyAssem;
        this.LLILLJJLI = view;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends Boolean> c291001Au) {
        if (!this.LL.ip().xQ2()) {
            this.LL.kp(this.LLILLJJLI);
        }
        return Unit.LIZ;
    }
}
