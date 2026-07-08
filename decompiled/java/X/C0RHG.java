package X;

import com.ss.android.ugc.aweme.feed.adapter.DynamicAdViewHolder;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RHG, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RHG extends C09AY implements Function1<C0RF0, C0SZ8> {
    public C0RHG() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0SZ8 invoke(C0RF0 c0rf0) {
        C0RF0 c0rf02 = c0rf0;
        DynamicAdViewHolder dynamicAdViewHolder = new DynamicAdViewHolder(c0rf02);
        C711750Rvx.LIZ(dynamicAdViewHolder, c0rf02.LJII, c0rf02.LJIIIIZZ);
        return dynamicAdViewHolder;
    }
}
