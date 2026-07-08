package X;

import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.ext_power_list.AssemReusedContainer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SZa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C723360SZa extends C09AY implements Function0<LifecycleRegistry> {
    public final /* synthetic */ AssemReusedContainer<R, ITEM> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C723360SZa(AssemReusedContainer<R, ITEM> assemReusedContainer) {
        super(0);
        this.LL = assemReusedContainer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LifecycleRegistry invoke() {
        return new LifecycleRegistry(this.LL);
    }
}
