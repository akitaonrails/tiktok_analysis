package X;

import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity;

/* JADX INFO: renamed from: X.0vc4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final /* synthetic */ class C1748940vc4 implements InterfaceC1748960vc6 {
    public final /* synthetic */ MusCountryListActivity LIZ;

    public final void LIZ(String str) {
        MusCountryListActivity musCountryListActivity = this.LIZ;
        for (int i = 0; i < musCountryListActivity.LLILZ.size(); i++) {
            if (TextUtils.equals(((C2280601EOk) ListProtector.get(musCountryListActivity.LLILZ, i)).LIZIZ, str)) {
                ((LinearLayoutManager) musCountryListActivity.LL.getLayoutManager()).scrollToPositionWithOffset(i, 0);
                return;
            }
        }
    }
}
