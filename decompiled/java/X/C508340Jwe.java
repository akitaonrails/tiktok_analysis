package X;

import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.fragment.SubSpaceFeedFragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.ReadableMap;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Jwe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C508340Jwe extends FrameLayout {
    public ReadableMap LL;

    public C508340Jwe(Context context) {
        super(context, null, 0);
        setId(R.id.wgp);
    }

    public final void setInitDataMap(final ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        this.LL = readableMap;
        HandlerHook.viewPost(this, new Runnable() { // from class: X.0Jwd
            public final void LIZ() {
                String string;
                HashMap<String, Object> mapAsHashMap;
                try {
                    FragmentManager childFragmentManager = FragmentManager.LJJJJLL(this.LL).getChildFragmentManager();
                    if (childFragmentManager == null) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    ReadableMap readableMap2 = readableMap;
                    if (readableMap2 != null && (mapAsHashMap = readableMap2.asHashMap()) != null) {
                        for (Map.Entry<String, Object> entry : mapAsHashMap.entrySet()) {
                            C786410Ut5.LJJJI(entry.getKey(), entry.getValue().toString(), bundle);
                        }
                    }
                    ReadableMap readableMap3 = readableMap;
                    boolean z = readableMap3 != null && readableMap3.getInt("wrangler_native_title_bar", 0) == 1;
                    C786410Ut5.LJJJI("page_source", "onboarding_page", bundle);
                    C504520JqU c504520JqU = SubSpaceFeedFragment.LLJIJIL;
                    int id = this.LL.getId();
                    ReadableMap readableMap4 = readableMap;
                    if (readableMap4 == null || (string = readableMap4.getString("enter_from")) == null) {
                        string = "";
                    }
                    ReadableMap readableMap5 = readableMap;
                    boolean z2 = readableMap5 != null && readableMap5.getInt("fullscreen", 0) == 1;
                    c504520JqU.getClass();
                    C504520JqU.LIZ(childFragmentManager, id, string, bundle, false, z2, false, z);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJFF("SubSpaceFeedContainerView", "load space feed error", e);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SubSpaceFeedContainerView@811.setInitDataMap$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SubSpaceFeedContainerView@811.setInitDataMap$1");
            }
        });
    }
}
