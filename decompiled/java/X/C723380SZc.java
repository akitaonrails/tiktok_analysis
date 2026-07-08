package X;

import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.ext_power_list.AssemReusedContainer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SZc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C723380SZc extends C09AY implements Function0<C723370SZb> {
    public final /* synthetic */ AssemReusedContainer<R, ITEM> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C723380SZc(AssemReusedContainer<R, ITEM> assemReusedContainer) {
        super(0);
        this.LL = assemReusedContainer;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0SZb] */
    @Override // kotlin.jvm.functions.Function0
    public final C723370SZb invoke() {
        final AssemReusedContainer<R, ITEM> assemReusedContainer = this.LL;
        return new ViewModelStoreOwner() { // from class: X.0SZb
            @Override // androidx.lifecycle.ViewModelStoreOwner
            public final ViewModelStore getViewModelStore() {
                return (ViewModelStore) assemReusedContainer.LLILLJJLI.getValue();
            }
        };
    }
}
