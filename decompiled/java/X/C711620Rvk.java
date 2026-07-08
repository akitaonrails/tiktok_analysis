package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import java.util.Map;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rvk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C711620Rvk extends C0SR4 {
    @Override // X.C0SR4
    public final String LJJJLIIL() {
        return "detail_feed";
    }

    @Override // X.C0SR4
    /* JADX INFO: renamed from: LJJLL, reason: merged with bridge method [inline-methods] */
    public C711360RvK LJJLI() {
        return new C711360RvK(AFwS243S0000000_11.get$arr$(33));
    }

    @Override // X.C0SR4, androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        DetailNavArgModel navArgModel;
        View view;
        Aweme awemeHm;
        String str;
        String str2;
        BaseFeedPageParams baseFeedPageParams = this.LLJI;
        C2189821An6 c2189821An6 = baseFeedPageParams.param;
        if (C1ER1.LIZIZ.LJJJLL(baseFeedPageParams.eventType) && (navArgModel = c2189821An6.getNavArgModel()) != null && navArgModel.getSearchInitPosition() != null) {
            if ((obj instanceof View) && (view = (View) obj) != null) {
                C0SZ8 c0sz8LJJLIIIIJ = C0SR4.LJJLIIIIJ(view);
                if (c0sz8LJJLIIIIJ != null && (awemeHm = c0sz8LJJLIIIIJ.hm()) != null) {
                    Map<String, String> identifier = AwemeBizExtKt.getIdentifier(awemeHm);
                    if (identifier != null) {
                        str = identifier.get("tabIndex");
                    } else {
                        str = null;
                    }
                    int count = getCount();
                    for (int i = 0; i < count; i++) {
                        Aweme aweme = (Aweme) ListProtector.get(Fg(), i);
                        if (C2093608Ic.LIZJ(aweme.getAid(), awemeHm.getAid())) {
                            Map<String, String> identifier2 = AwemeBizExtKt.getIdentifier(aweme);
                            if (identifier2 != null) {
                                str2 = identifier2.get("tabIndex");
                            } else {
                                str2 = null;
                            }
                            if (Intrinsics.LJFF(str2, str)) {
                                if (c0sz8LJJLIIIIJ.getAweme() != aweme || !c0sz8LJJLIIIIJ.getAweme().equals(aweme)) {
                                    c0sz8LJJLIIIIJ.L0(i, aweme);
                                }
                                return i;
                            }
                        }
                    }
                    return super.LJIJJ(obj);
                }
                return super.LJIJJ(obj);
            }
            return super.LJIJJ(obj);
        }
        return super.LJIJJ(obj);
    }

    public C711620Rvk(Context context, LayoutInflater layoutInflater, C0HTT c0htt, Fragment fragment, C714460S0u c714460S0u, BaseFeedPageParams baseFeedPageParams, C0R9L c0r9l) {
        super(context, layoutInflater, c0htt, fragment, c714460S0u, baseFeedPageParams, c0r9l);
    }
}
