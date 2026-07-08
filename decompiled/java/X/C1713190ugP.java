package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.changeregion.sdk.model.Country;
import com.ss.android.ugc.aweme.changeregion.ui.MusCountryListActivity;

/* JADX INFO: renamed from: X.0ugP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final /* synthetic */ class C1713190ugP implements InterfaceC1726220v1Q {
    public final /* synthetic */ MusCountryListActivity LIZ;

    public final void LIZ(String str) {
        MusCountryListActivity musCountryListActivity = this.LIZ;
        for (int i = 0; i < musCountryListActivity.LLILLL.size(); i++) {
            if (((Country) ListProtector.get(musCountryListActivity.LLILLL, i)).name.startsWith(str)) {
                ((LinearLayoutManager) musCountryListActivity.LL.getLayoutManager()).scrollToPositionWithOffset(i, 0);
                return;
            }
        }
    }
}
