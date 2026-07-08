package X;

import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0T0T, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T0T implements InterfaceC20660715sz {
    public static volatile Map<Integer, WeakReference<BaseListFragmentPanel>> LLILLL = new LinkedHashMap();
    public static volatile Map<Integer, C0T0T> LLILZ = new LinkedHashMap();
    public final int LL;
    public final WeakReference<BaseListFragmentPanel> LLILLJJLI;

    @Override // X.InterfaceC20660715sz
    public final boolean t2() {
        return false;
    }

    @Override // X.InterfaceC20658015sY
    public final boolean Xu() {
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        BaseListFragmentPanel baseListFragmentPanel = this.LLILLJJLI.get();
        return (baseListFragmentPanel == null || (lifecycle = baseListFragmentPanel.getLifecycle()) == null || (currentState = lifecycle.getCurrentState()) == null || !currentState.isAtLeast(Lifecycle.State.CREATED)) ? false : true;
    }

    @Override // X.InterfaceC20658015sY
    public final C688120Qyw i2() {
        BaseListFragmentPanel baseListFragmentPanel = this.LLILLJJLI.get();
        if (baseListFragmentPanel == null) {
            return null;
        }
        return new C688120Qyw(baseListFragmentPanel.getContext(), baseListFragmentPanel, null);
    }

    @Override // X.InterfaceC20658015sY
    public final String getSceneId() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("video_mask_part_screen_scene_");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0T0T(int i, BaseListFragmentPanel baseListFragmentPanel) {
        this.LL = i;
        this.LLILLJJLI = new WeakReference<>(baseListFragmentPanel);
    }
}
