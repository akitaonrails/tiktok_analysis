package X;

import android.os.Build;
import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.mix.model.TabBarItemData;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.view.StoreLynxTabFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gSD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1166230gSD extends C09AY implements Function0<TabBarItemData> {
    public final /* synthetic */ StoreLynxTabFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1166230gSD(StoreLynxTabFragment storeLynxTabFragment) {
        super(0);
        this.LL = storeLynxTabFragment;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.Parcelable, com.ss.android.ugc.aweme.ecommerce.mix.model.TabBarItemData] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.ss.android.ugc.aweme.ecommerce.mix.model.TabBarItemData, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final TabBarItemData invoke() {
        StoreLynxTabFragment storeLynxTabFragment = this.LL;
        if (Build.VERSION.SDK_INT >= 33) {
            Bundle arguments = storeLynxTabFragment.getArguments();
            if (arguments != null) {
                return arguments.getParcelable("tab_info", TabBarItemData.class);
            }
            return null;
        }
        Bundle arguments2 = storeLynxTabFragment.getArguments();
        if (arguments2 != null) {
            return arguments2.getParcelable("tab_info");
        }
        return null;
    }
}
