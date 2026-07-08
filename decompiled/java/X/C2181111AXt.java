package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AXt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2181111AXt extends C09AY implements Function1<Layout, Boolean> {
    public final /* synthetic */ C1AXM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2181111AXt(C1AXM c1axm) {
        super(1);
        this.LL = c1axm;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Layout layout) {
        this.LL.LJJJI();
        this.LL.LJJLIIJ().LJIILJJIL(layout, false);
        return Boolean.TRUE;
    }
}
