package X;

import android.os.Build;
import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.mix.model.TabBarItemData;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.view.StoreMixTabFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gSC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1166220gSC extends C09AY implements Function0<TabBarItemData> {
    public final /* synthetic */ StoreMixTabFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1166220gSC(StoreMixTabFragment storeMixTabFragment) {
        super(0);
        this.LL = storeMixTabFragment;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.Parcelable, com.ss.android.ugc.aweme.ecommerce.mix.model.TabBarItemData] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.ss.android.ugc.aweme.ecommerce.mix.model.TabBarItemData, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final TabBarItemData invoke() {
        StoreMixTabFragment storeMixTabFragment = this.LL;
        if (Build.VERSION.SDK_INT >= 33) {
            Bundle arguments = storeMixTabFragment.getArguments();
            if (arguments != null) {
                return arguments.getParcelable("tab_info", TabBarItemData.class);
            }
            return null;
        }
        Bundle arguments2 = storeMixTabFragment.getArguments();
        if (arguments2 != null) {
            return arguments2.getParcelable("tab_info");
        }
        return null;
    }
}
