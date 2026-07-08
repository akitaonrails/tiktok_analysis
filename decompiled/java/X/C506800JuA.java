package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.assem.DetailEmptyAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JuA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C506800JuA extends C09AY implements Function2<UIAssem, C291001Au<? extends Integer>, Unit> {
    public final /* synthetic */ DetailEmptyAssem LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C506800JuA(View view, DetailEmptyAssem detailEmptyAssem) {
        super(2);
        this.LL = detailEmptyAssem;
        this.LLILLJJLI = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends Integer> c291001Au) {
        C291001Au<? extends Integer> c291001Au2 = c291001Au;
        if (c291001Au2 != null) {
            ((Number) c291001Au2.LIZ).intValue();
            this.LL.ip(this.LLILLJJLI);
        }
        return Unit.LIZ;
    }
}
